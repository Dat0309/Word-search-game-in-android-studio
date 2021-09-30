package com.dinhtrongdat.wordsearchhgame.features.settings;

import android.app.ActionBar;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.MenuItem;

import com.dinhtrongdat.wordsearchhgame.R;


public class SettingsActivity extends AppCompatPreferenceActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.prefs_main);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setTitle(R.string.settings);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) onBackPressed();
        return super.onOptionsItemSelected(item);
    }
}
