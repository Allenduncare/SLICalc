package com.example.allenduncare.slicalc;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by allenduncare on 1/9/2017.
 */

public class Databasehelper extends SQLiteOpenHelper {
    public static String DATABASE_NAME = "loanDB";
    public static int DATABASE_VERSION = 1;
    public static String TABLE_USER = "user";
    public static String user_id = "id";
    public static String username_column = "name";
    public static String TABLE_LOAN = "loans";
    public static String loan_id = "_id";
    public static String id = "id";
    public static String name_column = "name";
    public static String provider_column = "provider";
    public static String principal_column = "principal";
    public static String date_column = "date";
    public static String interest_rate="interest";
    public static String TABLE_PROVIDER = "provider";
    public static String providername_column = "provider_name";
    public static String providerinterest_column= "provider_interest";
    public static String loantype_column = "loan_type";
    public Databasehelper(Context context){
        super(context,DATABASE_NAME,null,DATABASE_VERSION,null);
    }
    @Override
    public void onCreate(SQLiteDatabase database)
    {
     database.execSQL("create table " + TABLE_USER + "("
             + user_id + " integer primary key autoincrement, "
             + destination_column + " text, "
             + datetime_column + " long)");)


    };





}
