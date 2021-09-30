package com.dinhtrongdat.wordsearchhgame.di.modules;

import android.content.Context;


import com.dinhtrongdat.wordsearchhgame.data.GameDataSource;
import com.dinhtrongdat.wordsearchhgame.data.WordDataSource;
import com.dinhtrongdat.wordsearchhgame.data.sqlite.DbHelper;
import com.dinhtrongdat.wordsearchhgame.data.sqlite.GameDataSQLiteDataSource;
import com.dinhtrongdat.wordsearchhgame.data.xml.WordXmlDataSource;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;


@Module
public class DataSourceModule {

    @Provides
    @Singleton
    DbHelper provideDbHelper(Context context) {
        return new DbHelper(context);
    }

    @Provides
    @Singleton
    GameDataSource provideGameRoundDataSource(DbHelper dbHelper) {
        return new GameDataSQLiteDataSource(dbHelper);
    }

//    @Provides
//    @Singleton
//    WordDataSource provideWordDataSource(DbHelper dbHelper) {
//        return new WordSQLiteDataSource(dbHelper);
//    }

    @Provides
    @Singleton
    WordDataSource provideWordDataSource(Context context) {
        return new WordXmlDataSource(context);
    }

}
