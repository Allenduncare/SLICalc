package com.example.allenduncare.slicalc;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.app.Activity;

import static android.database.sqlite.SQLiteDatabase.OPEN_READWRITE;

public class MainActivity extends Activity {
    public static String Database_name=""
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Sets up database for storing all forms of student loans.
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

}
