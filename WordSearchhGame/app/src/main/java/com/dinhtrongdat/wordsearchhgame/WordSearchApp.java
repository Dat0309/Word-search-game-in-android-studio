package com.dinhtrongdat.wordsearchhgame;

import android.app.Application;

import com.dinhtrongdat.wordsearchhgame.di.component.AppComponent;
import com.dinhtrongdat.wordsearchhgame.di.modules.AppModule;


public class WordSearchApp extends Application {

    AppComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mAppComponent = DaggerAppComponent.builder().appModule(new AppModule(this)).build();
    }

    public AppComponent getAppComponent() {
        return mAppComponent;
    }

}
