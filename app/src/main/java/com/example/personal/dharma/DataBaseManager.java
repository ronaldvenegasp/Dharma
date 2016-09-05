package com.example.personal.dharma;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class DataBaseManager {
    public static final String TABLE_NAME = "numero_mesa";
    public static final String COLUMN_NAME_MESA = "numero";

    //CREATE TABLE numero_mesa(numero integer primary key);

    public static final String CREATE_TABLE = "create table " + TABLE_NAME + " (" + COLUMN_NAME_MESA + " integer primary key);";

    private DataBaseHelper helper;
    private SQLiteDatabase db;

    public DataBaseManager(Context context){
        //Base de datos
        helper = new DataBaseHelper(context);
        db = helper.getWritableDatabase();
    }

    public ContentValues generarContentValues(String numero_de_mesa){
        ContentValues valores = new ContentValues();
        valores.put(COLUMN_NAME_MESA, numero_de_mesa);
        return  valores;
    }

    public void insertarMesa(String numero_de_mesa){
        db.insert(TABLE_NAME, null, generarContentValues(numero_de_mesa));
    }

    public void modificarMesa(String numero_de_mesa){
        db.update(TABLE_NAME, generarContentValues(numero_de_mesa), COLUMN_NAME_MESA+"=?", new String[]{numero_de_mesa});
    }

    public Cursor cargarCursorMesa(){
        String[] columnas = new String[]{COLUMN_NAME_MESA};
        return db.query(TABLE_NAME, columnas, null, null, null, null, null);
    }
}
