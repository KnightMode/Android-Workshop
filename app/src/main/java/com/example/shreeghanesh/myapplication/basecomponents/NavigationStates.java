package com.example.shreeghanesh.myapplication.basecomponents;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
@IntDef({NavigationStates.START_ACTIVITY, NavigationStates.FINISH_ACTIVITY})
public @interface NavigationStates {
    int START_ACTIVITY = 1;
    int FINISH_ACTIVITY = 2;
}
