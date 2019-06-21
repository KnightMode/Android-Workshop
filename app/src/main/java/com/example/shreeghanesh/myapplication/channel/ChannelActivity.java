package com.example.shreeghanesh.myapplication.channel;

import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.os.Bundle;

import com.example.shreeghanesh.myapplication.basecomponents.BaseActivity;
import com.example.shreeghanesh.myapplication.R;
import com.example.shreeghanesh.myapplication.databinding.ActivityChannelScreenBinding;

public class ChannelActivity extends BaseActivity {
    ChannelDetailsViewModel channelDetailsViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityChannelScreenBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_channel_screen);
        channelDetailsViewModel = ViewModelProviders.of(this).get(ChannelDetailsViewModel.class);
        activityMainBinding.setViewModel(channelDetailsViewModel);
        this.getLifecycle().addObserver(channelDetailsViewModel);
        channelDetailsViewModel.activityNavigationUseCaseMutableLiveData.observe(this, this::handleResponse);
    }
}
