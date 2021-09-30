package com.dinhtrongdat.wordsearchhgame.di.component;

import com.dinhtrongdat.wordsearchhgame.di.modules.AppModule;
import com.dinhtrongdat.wordsearchhgame.di.modules.DataSourceModule;
import com.dinhtrongdat.wordsearchhgame.features.FullscreenActivity;
import com.dinhtrongdat.wordsearchhgame.features.gamehistory.GameHistoryActivity;
import com.dinhtrongdat.wordsearchhgame.features.gameover.GameOverActivity;
import com.dinhtrongdat.wordsearchhgame.features.gameplay.GamePlayActivity;
import com.dinhtrongdat.wordsearchhgame.features.mainmenu.MainMenuActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by abdularis on 18/07/17.
 */

@Singleton
@Component(modules = {AppModule.class, DataSourceModule.class})
public interface AppComponent {

    void inject(GamePlayActivity activity);

    void inject(MainMenuActivity activity);

    void inject(GameOverActivity activity);

    void inject(FullscreenActivity activity);

    void inject(GameHistoryActivity activity);

}
