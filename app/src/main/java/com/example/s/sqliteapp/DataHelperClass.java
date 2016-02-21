package com.example.s.sqliteapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

/**
 * Created by S on 20-Feb-16.
 */
public class DataHelperClass extends SQLiteOpenHelper {

    private Context context;

    public static final String DB_NAME = "Student";
    public static final String DB_TABLE = "studentInfo";
    public static final String col1 = "ID";
    public static final String col2 = "FirstName";
    public static final String col3 = "LastName";
    public static final String col4 = "Marks";

    String CREATE_TABLE = "CREATE TABLE " + DB_TABLE + " (" + col1 + " INTEGER AUTOINCREMENT PRIMARY KEY, "
            + col2 + " TEXT, " + col3 + " TEXT, " + col4 + "TEXT);" ;

    public DataHelperClass(Context context) {
        super(context, DB_NAME, null, 1);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE);
        Toast.makeText(context, "created", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //db.execSQL("DROP IF EXISTS " + DB_TABLE);
    }
}
