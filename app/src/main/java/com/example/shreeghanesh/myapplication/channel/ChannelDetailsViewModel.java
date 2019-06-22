package com.example.shreeghanesh.myapplication.channel;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.OnLifecycleEvent;
import android.databinding.ObservableField;

import com.example.shreeghanesh.myapplication.basecomponents.BaseLifeCycleViewModel;
import com.example.shreeghanesh.myapplication.basecomponents.DataProviders;

public class ChannelDetailsViewModel extends BaseLifeCycleViewModel {
    public final ObservableField<String> channelName = new ObservableField<>();
    public final ObservableField<String> buttonState = new ObservableField<>("SUBSCRIBE");

    private final DataProviders dataProviders = DataProviders.getDataProviderInstance();

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreate() {
        if (dataProviders.containsUseCase(ChannelDetailsUseCase.class)) {
            ChannelDetailsUseCase channelDetailsUseCase = dataProviders.get(ChannelDetailsUseCase.class);
            channelName.set(channelDetailsUseCase.getChannelName());
            buttonState.set(channelDetailsUseCase.isSubscribed() ? "UNSUBSCRIBE" : "SUBSCRIBE");
        }
    }

    public void onSubscribeButtonClick() {
        buttonState.set(buttonState.get().equals("SUBSCRIBE") ? "UNSUBSCRIBE" : "SUBSCRIBE");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
        dataProviders.save(new ChannelDetailsUseCase(channelName.get(), "SUBSCRIBE".equals(buttonState.get())));
    }
}
