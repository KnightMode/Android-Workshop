package com.example.shreeghanesh.myapplication.basecomponents;

public class ActivityNavigationUseCase {
    private Class clazz;
    private int navigationStates;

    public ActivityNavigationUseCase(Class clazz, @NavigationStates int navigationStates) {
        this.clazz = clazz;
        this.navigationStates = navigationStates;
    }

    public Class getClazz() {
        return clazz;
    }

    public int getNavigationStates() {
        return navigationStates;
    }
}
