package com.example.conexiondb;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import com.example.conexiondb.DataBase.SQLiteConn;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SQLiteConn conn = new SQLiteConn(this, "database", null, 1);

        //Para abrir la base de datos para leer hacemos uso de la clase SQLiteDatabase & al objeto db le asignamos un metodo del objeto conn.
        SQLiteDatabase db = conn.getReadableDatabase();
        //Para abrir la base de datos para escribir en ella usamos WritableDatabase.
        db = conn.getWritableDatabase();
    }
}
