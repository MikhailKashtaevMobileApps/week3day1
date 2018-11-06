package com.example.mike.week3day1.views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.mike.week3day1.R;
import com.example.mike.week3day1.fragments.PersonFragment;
import com.example.mike.week3day1.model.Person;

import java.util.ArrayList;

public class ListFragmentActivity extends AppCompatActivity {

    private EditText etPersonName;
    private EditText etPersonAge;
    private EditText etPersonGender;

    private ArrayList<Person> people = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_fragment);

        etPersonName = findViewById( R.id.etPersonName );
        etPersonAge = findViewById( R.id.etPersonAge );
        etPersonGender = findViewById( R.id.etPersonGender );
    }

    public void addPerson(View view) {
        Person p = new Person(
                etPersonName.getText().toString(),
                etPersonAge.getText().toString(),
                etPersonGender.getText().toString()
        );

        people.add( p );

        Toast.makeText( this, "Added person:"+p.toString(), Toast.LENGTH_SHORT ).show();
    }

    public void displayPeople(View view) {
        if ( getSupportFragmentManager().findFragmentByTag("people") == null ){
            getSupportFragmentManager().beginTransaction()
                    .add( R.id.svDisplayPeople, PersonFragment.newInstance( people ), "people")
                    .addToBackStack( "people" )
                    .commit();
        }
    }

}
