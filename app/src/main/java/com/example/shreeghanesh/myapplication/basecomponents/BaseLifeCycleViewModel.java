package com.example.shreeghanesh.myapplication.basecomponents;

import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class BaseLifeCycleViewModel extends ViewModel implements LifecycleObserver {
    public MutableLiveData<ActivityNavigationUseCase> activityNavigationUseCaseMutableLiveData = new MutableLiveData<>();

    public MutableLiveData<ActivityNavigationUseCase> getActivityNavigationUseCaseMutableLiveData() {
        return activityNavigationUseCaseMutableLiveData;
    }
}
