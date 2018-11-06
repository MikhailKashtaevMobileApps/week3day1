package com.example.mike.week3day1.views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.mike.week3day1.R;
import com.example.mike.week3day1.fragments.CustomDialogFragment;

import java.util.Timer;
import java.util.TimerTask;

public class DialogFragmentActivity extends AppCompatActivity {

    private CustomDialogFragment newFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog_fragment);
    }


    public void showDialog() {
        newFragment = CustomDialogFragment.newInstance();

        //getSupportFragmentManager().beginTransaction().add(newFragment, null);

        newFragment.show(getFragmentManager(), "dialog");

        Timer timer = new Timer();

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                closeDialog();
            }
        }, 3000);
    }

    public void closeDialog(){
        getFragmentManager().beginTransaction().remove( newFragment ).commit();
    }

    public void doPositiveClick(){
        Toast.makeText( this, "ok", Toast.LENGTH_SHORT ).show();
    }

    public void doNegativeClick(){
        Toast.makeText( this, "cancel", Toast.LENGTH_SHORT ).show();
    }

    public void showDialog(View view) {
        showDialog();
    }



}
