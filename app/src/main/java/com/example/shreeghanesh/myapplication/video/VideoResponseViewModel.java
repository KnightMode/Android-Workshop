package com.example.shreeghanesh.myapplication.video;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.OnLifecycleEvent;
import android.databinding.ObservableField;

import com.example.shreeghanesh.myapplication.basecomponents.ActivityNavigationUseCase;
import com.example.shreeghanesh.myapplication.basecomponents.BaseLifeCycleViewModel;
import com.example.shreeghanesh.myapplication.basecomponents.DataProviders;
import com.example.shreeghanesh.myapplication.basecomponents.NavigationStates;
import com.example.shreeghanesh.myapplication.channel.ChannelActivity;
import com.example.shreeghanesh.myapplication.channel.ChannelDetailsUseCase;
import com.example.shreeghanesh.myapplication.networking.models.Comment;
import com.example.shreeghanesh.myapplication.networking.models.UserCommentRequest;
import com.example.shreeghanesh.myapplication.networking.models.VideoApiResponse;
import com.example.shreeghanesh.myapplication.networking.networkModule.VideoModule;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class VideoResponseViewModel extends BaseLifeCycleViewModel {

    public final ObservableField<String> channelName = new ObservableField<>();
    public final ObservableField<String> views = new ObservableField<>();
    public final ObservableField<String> imageUrl = new ObservableField<>();
    public final ObservableField<String> buttonText = new ObservableField<>("Like");
    public final ObservableField<String> subscribeStatus = new ObservableField<>("SUBSCRIBE");
    public final ObservableField<String> userComments = new ObservableField<>("");
    private boolean isButtonEnabled = true;
    private Disposable disposable;
    private DataProviders dataProviders = new DataProviders();
    private CommentsRecyclerAdapter commentsRecyclerAdapter;

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreate() {
        commentsRecyclerAdapter = new CommentsRecyclerAdapter();
        if (dataProviders.containsUseCase(ChannelDetailsUseCase.class)) {
            ChannelDetailsUseCase channelDetailsUseCase = dataProviders.get(ChannelDetailsUseCase.class);
            subscribeStatus.set(channelDetailsUseCase.isSubscribed() ? "UNSUBSCRIBE" : "SUBSCRIBE");
        }
        getAllPhotos();
        getListOfComments();
    }

    public CommentsRecyclerAdapter getCommentsRecyclerAdapter() {
        return commentsRecyclerAdapter;
    }

    private void getListOfComments() {
        VideoModule.getVideoApiService().getListOfComments()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(this::onSuccessOfRetrieveComments, this::onError);
    }

    private void onError(Throwable throwable) {
        throwable.printStackTrace();
    }

    private void onSuccessOfRetrieveComments(List<Comment> comments) {
        List<CommentItemViewModel> commentItemViewModels = new ArrayList<>();
        for (Comment comment : comments) {
            commentItemViewModels.add(new CommentItemViewModel(comment.getComment()));
        }
        commentsRecyclerAdapter.setCommentItemViewModels(commentItemViewModels);
    }

    private void getAllPhotos() {
        disposable = VideoModule.getVideoApiService().getAllVideoDetails()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(this::onSuccess, Throwable::printStackTrace);
    }

    private void onSuccess(VideoApiResponse videoApiResponse) {
        imageUrl.set(videoApiResponse.getImage());
        views.set(videoApiResponse.getViews());
        channelName.set(videoApiResponse.getChannel());
    }

    public void setUserComment(CharSequence comment) {
        userComments.set(comment.toString());
    }

    public void postUserComment() {
        //TODO : Handle UserName Field
        VideoModule.getVideoApiService().postComment(new UserCommentRequest("SampleUser", userComments.get()))
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(this::onSuccess, this::onError);
    }

    private void onSuccess(List<Comment> comments) {
        //TODO: Handle Success
    }

    public void navigateToChannelPage() {
        activityNavigationUseCaseMutableLiveData.postValue(new ActivityNavigationUseCase(ChannelActivity.class, NavigationStates.START_ACTIVITY));
    }

    public void onClick() {
        isButtonEnabled = !isButtonEnabled;
        buttonText.set(isButtonEnabled ? "LIKE" : "UNLIKE");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        disposable.dispose();
    }


}
