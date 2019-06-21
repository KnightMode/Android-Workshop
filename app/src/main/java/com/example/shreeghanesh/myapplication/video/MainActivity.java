package com.example.shreeghanesh.myapplication.video;

import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;

import com.example.shreeghanesh.myapplication.basecomponents.BaseActivity;
import com.example.shreeghanesh.myapplication.R;
import com.example.shreeghanesh.myapplication.databinding.ActivityMainBinding;

public class MainActivity extends BaseActivity {

    VideoResponseViewModel videoResponseViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        videoResponseViewModel = ViewModelProviders.of(this).get(VideoResponseViewModel.class);
        activityMainBinding.setViewModel(videoResponseViewModel);
        this.getLifecycle().addObserver(videoResponseViewModel);
        videoResponseViewModel.getActivityNavigationUseCaseMutableLiveData().observe(this, this::handleResponse);
    }

}
