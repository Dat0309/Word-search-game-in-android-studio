package com.dinhtrongdat.wordsearchhgame.features.gamehistory;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;


import com.dinhtrongdat.wordsearchhgame.data.GameDataSource;
import com.dinhtrongdat.wordsearchhgame.model.GameDataInfo;

import java.util.ArrayList;
import java.util.List;

public class GameHistoryViewModel extends ViewModel {

    private GameDataSource mGameDataSource;
    private MutableLiveData<List<GameDataInfo>> mOnGameDataInfoLoaded;

    public GameHistoryViewModel(GameDataSource gameDataSource) {
        mGameDataSource = gameDataSource;
        mOnGameDataInfoLoaded = new MutableLiveData<>();
    }

    public void loadGameHistory() {
        mGameDataSource.getGameDataInfos(infoList -> mOnGameDataInfoLoaded.setValue(infoList));
    }

    public void deleteGameData(GameDataInfo gameDataInfo) {
        mGameDataSource.deleteGameData(gameDataInfo.getId());
        loadGameHistory();
    }

    public void clear() {
        mGameDataSource.deleteGameDatas();
        mOnGameDataInfoLoaded.setValue(new ArrayList<>());
    }

    public LiveData<List<GameDataInfo>> getOnGameDataInfoLoaded() {
        return mOnGameDataInfoLoaded;
    }
}
