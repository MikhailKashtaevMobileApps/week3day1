package com.example.mike.week3day1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.mike.week3day1.views.DialogFragmentActivity;
import com.example.mike.week3day1.views.ListFragmentActivity;
import com.example.mike.week3day1.views.PreferencesActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goPreferences(View view) {
        Intent intent = new Intent( getApplicationContext(), PreferencesActivity.class);
        startActivity( intent );
    }

    public void goListFragment(View view) {
        Intent intent = new Intent( getApplicationContext(), ListFragmentActivity.class);
        startActivity( intent );
    }

    public void goDialog(View view) {
        Intent intent = new Intent( getApplicationContext(), DialogFragmentActivity.class);
        startActivity( intent );
    }
}
