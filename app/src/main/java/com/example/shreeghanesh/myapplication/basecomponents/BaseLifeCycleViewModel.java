package com.example.shreeghanesh.myapplication.basecomponents;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.support.annotation.NonNull;

public class BaseLifeCycleViewModel extends AndroidViewModel implements LifecycleObserver {
    public MutableLiveData<ActivityNavigationUseCase> activityNavigationUseCaseMutableLiveData = new MutableLiveData<>();

    public BaseLifeCycleViewModel(@NonNull Application application) {
        super(application);
    }

    public MutableLiveData<ActivityNavigationUseCase> getActivityNavigationUseCaseMutableLiveData() {
        return activityNavigationUseCaseMutableLiveData;
    }
}
