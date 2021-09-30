package com.dinhtrongdat.wordsearchhgame.di.modules;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.dinhtrongdat.wordsearchhgame.data.GameDataSource;
import com.dinhtrongdat.wordsearchhgame.data.GameThemeRepository;
import com.dinhtrongdat.wordsearchhgame.data.WordDataSource;
import com.dinhtrongdat.wordsearchhgame.features.ViewModelFactory;
import com.dinhtrongdat.wordsearchhgame.features.gamehistory.GameHistoryViewModel;
import com.dinhtrongdat.wordsearchhgame.features.gameover.GameOverViewModel;
import com.dinhtrongdat.wordsearchhgame.features.gameplay.GamePlayViewModel;
import com.dinhtrongdat.wordsearchhgame.features.mainmenu.MainMenuViewModel;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;


@Module
public class AppModule {

    private Application mApp;

    public AppModule(Application application) {
        mApp = application;
    }

    @Provides
    @Singleton
    Context provideContext() {
        return mApp;
    }

    @Provides
    @Singleton
    SharedPreferences provideSharedPreferences(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context);
    }

    @Provides
    @Singleton
    ViewModelFactory provideViewModelFactory(GameDataSource gameDataSource,
                                             WordDataSource wordDataSource) {
        return new ViewModelFactory(
                new GameOverViewModel(gameDataSource),
                new GamePlayViewModel(gameDataSource, wordDataSource),
                new MainMenuViewModel(new GameThemeRepository()),
                new GameHistoryViewModel(gameDataSource)
        );
    }
}
