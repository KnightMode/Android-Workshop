package com.example.shreeghanesh.myapplication.channel;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.OnLifecycleEvent;
import android.databinding.ObservableField;

import com.example.shreeghanesh.myapplication.basecomponents.ActivityNavigationUseCase;
import com.example.shreeghanesh.myapplication.basecomponents.BaseLifeCycleViewModel;
import com.example.shreeghanesh.myapplication.basecomponents.DataProviders;
import com.example.shreeghanesh.myapplication.video.MainActivity;
import com.example.shreeghanesh.myapplication.basecomponents.NavigationStates;

public class ChannelDetailsViewModel extends BaseLifeCycleViewModel {
    public final ObservableField<String> channelName = new ObservableField<>();
    public final ObservableField<String> buttonText = new ObservableField<>("SUBSCRIBE");
    public final ObservableField<String> buttonState = new ObservableField<>("SUBSCRIBE");
    private boolean isButtonEnabled = true;

    private final DataProviders dataProviders = new DataProviders();

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreate() {
        channelName.set("Some Channel Name");
        if (dataProviders.containsUseCase(ChannelDetailsUseCase.class)) {
            ChannelDetailsUseCase channelDetailsUseCase = dataProviders.get(ChannelDetailsUseCase.class);
            channelName.set(channelDetailsUseCase.getChannelName());
        }
    }

    public void onSubscribeButtonClick() {
        isButtonEnabled = !isButtonEnabled;
        buttonText.set(isButtonEnabled ? "SUBSCRIBE" : "UNSUBSCRIBE");
        dataProviders.save(new ChannelDetailsUseCase(channelName.get(), "SUBSCRIBE".equals(buttonText.get())));
        activityNavigationUseCaseMutableLiveData.postValue(new ActivityNavigationUseCase(MainActivity.class, NavigationStates.FINISH_ACTIVITY));
    }
}
