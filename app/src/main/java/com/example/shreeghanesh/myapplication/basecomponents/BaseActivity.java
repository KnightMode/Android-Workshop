package com.example.shreeghanesh.myapplication.basecomponents;

import android.arch.lifecycle.LifecycleOwner;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;

public class BaseActivity extends AppCompatActivity implements LifecycleOwner {

    public void handleResponse(ActivityNavigationUseCase activityNavigationUseCase) {
        if (activityNavigationUseCase.getNavigationStates() == NavigationStates.START_ACTIVITY) {
            Intent intent = new Intent(this, activityNavigationUseCase.getClazz());
            startActivity(intent);
        } else {
            finish();
        }
    }
}
