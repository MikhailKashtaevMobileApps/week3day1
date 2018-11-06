package com.example.mike.week3day1.views;

import android.support.v14.preference.PreferenceFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.mike.week3day1.R;
import com.example.mike.week3day1.fragments.CustomPreferenceFragment;

public class PreferencesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preferences);

        CustomPreferenceFragment customPreferenceFragment = new CustomPreferenceFragment();
        getSupportFragmentManager().beginTransaction()
                .add(R.id.llPreferencesHolder, customPreferenceFragment)
                .commit();

    }
}
