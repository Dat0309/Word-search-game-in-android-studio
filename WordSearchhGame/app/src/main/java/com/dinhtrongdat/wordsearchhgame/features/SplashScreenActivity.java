package com.dinhtrongdat.wordsearchhgame.features;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

import androidx.appcompat.app.AppCompatActivity;

import com.dinhtrongdat.wordsearchhgame.features.mainmenu.MainMenuActivity;

public class SplashScreenActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = new Intent(this, MainMenuActivity.class);
        startActivity(intent);
        finish();
    }
}
