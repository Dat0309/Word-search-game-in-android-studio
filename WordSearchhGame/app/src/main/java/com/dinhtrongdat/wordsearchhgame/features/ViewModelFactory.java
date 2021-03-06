package com.dinhtrongdat.wordsearchhgame.features;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.support.annotation.NonNull;

import com.dinhtrongdat.wordsearchhgame.features.gamehistory.GameHistoryViewModel;
import com.dinhtrongdat.wordsearchhgame.features.gameover.GameOverViewModel;
import com.dinhtrongdat.wordsearchhgame.features.gameplay.GamePlayViewModel;
import com.dinhtrongdat.wordsearchhgame.features.mainmenu.MainMenuViewModel;


public class ViewModelFactory implements ViewModelProvider.Factory {

    private final GameOverViewModel mGameOverViewModel;
    private final GamePlayViewModel mGamePlayViewModel;
    private final MainMenuViewModel mMainMenuViewModel;
    private final GameHistoryViewModel mGameHistoryViewModel;

    public ViewModelFactory(GameOverViewModel gameOverViewModel,
                            GamePlayViewModel gamePlayViewModel,
                            MainMenuViewModel mainMenuViewModel,
                            GameHistoryViewModel gameHistoryViewModel) {
        mGameOverViewModel = gameOverViewModel;
        mGamePlayViewModel = gamePlayViewModel;
        mMainMenuViewModel = mainMenuViewModel;
        mGameHistoryViewModel = gameHistoryViewModel;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        if (modelClass.isAssignableFrom(GameOverViewModel.class)) {
            return (T) mGameOverViewModel;
        } else if (modelClass.isAssignableFrom(GamePlayViewModel.class)) {
            return (T) mGamePlayViewModel;
        } else if (modelClass.isAssignableFrom(MainMenuViewModel.class)) {
            return (T) mMainMenuViewModel;
        } else if (modelClass.isAssignableFrom(GameHistoryViewModel.class)) {
            return (T) mGameHistoryViewModel;
        }
        throw new IllegalArgumentException("Unknown view model");
    }
}
