package com.kumbhthon.meditracker;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
 
public class Datab extends SQLiteOpenHelper 
{ 
private static String TAG = "Datab"; // Tag just for the LogCat window 
//destination path (location) of our database on device 
private static String DB_PATH = "";  
public static String DB_NAME2 ="hospital_db.sqlite";// Database name
//public static String HospDbname ="hospital_db.sqlite";// Database name 
private SQLiteDatabase mDataBase;  
private final Context mContext; 

public Datab(Context context)  
{ 
    super(context, DB_NAME2, null, 1);// 1? its Database Version 
    DB_PATH = "/data/data/" + context.getPackageName() + "/databases/"; 
    this.mContext = context; 
    try {
		createDataBase();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}    
 
public void createDataBase() throws IOException 
{ 
    //If database not exists copy it from the assets 
 
    boolean mDataBaseExist = checkDataBase(); 
    if(!mDataBaseExist) 
    { 
        this.getReadableDatabase(); 
        this.close(); 
        try  
        { 
            //Copy the database from assests 
            copyDataBase(); 
            Log.e(TAG, "createDatabase database created"); 
        }  
        catch (IOException mIOException)  
        { 
            throw new Error("ErrorCopyingDataBase"); 
        } 
    } 
} 
    //Check that the database exists here: /data/data/your package/databases/Da Name 
    private boolean checkDataBase() 
    { 
        File dbFile = new File(DB_PATH + DB_NAME2); 
        //Log.v("dbFile", dbFile + "   "+ dbFile.exists()); 
        return dbFile.exists(); 
    } 
 
    //Copy the database from assets 
    private void copyDataBase() throws IOException 
    { 
        InputStream mInput = mContext.getAssets().open(DB_NAME2); 
        String outFileName = DB_PATH + DB_NAME2; 
        OutputStream mOutput = new FileOutputStream(outFileName); 
        byte[] mBuffer = new byte[1024]; 
        int mLength; 
        while ((mLength = mInput.read(mBuffer))>0) 
        { 
            mOutput.write(mBuffer, 0, mLength); 
        } 
        mOutput.flush(); 
        mOutput.close(); 
        mInput.close(); 
    } 
 
    //Open the database, so we can query it 
    public boolean openDataBase() throws SQLException 
    { 
        String mPath = DB_PATH + DB_NAME2; 
        //Log.v("mPath", mPath); 
        mDataBase = SQLiteDatabase.openDatabase(mPath, null, SQLiteDatabase.CREATE_IF_NECESSARY); 
        //mDataBase = SQLiteDatabase.openDatabase(mPath, null, SQLiteDatabase.NO_LOCALIZED_COLLATORS); 
        return mDataBase != null; 
    } 
 
    @Override 
    public synchronized void close()  
    { 
        if(mDataBase != null) 
            mDataBase.close(); 
        super.close(); 
    }

	@Override
	public void onCreate(SQLiteDatabase arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		
	} 
	
	//
	public double[] getHospitalNames() 
    {
		double[] lat = null;
        try 
        { 
            SQLiteDatabase obj = this.getWritableDatabase();;
            
        	String sql = "Select Lat from Hospital";

            Cursor mCur = obj.rawQuery(sql, null); 
            lat=new double[mCur.getCount()];
            int i=0;
            if (mCur.moveToFirst()) 
            { 
           	do
           	{
           		lat[i]=Double.parseDouble(mCur.getString(0));
           		i++;
           	}while(mCur.moveToNext());
           
            } 
            return lat; 
        } 
        catch (Exception mSQLException)  
        { 
            Log.e(TAG, "getTestData >>"+ mSQLException.toString()); 
           // throw mSQLException; 
        }
        return lat;
    }
        
        public double[] getlongi() 
        {
    		double[] longi = null;
            try 
            { 
                SQLiteDatabase obj = this.getWritableDatabase();;
                
            	String sql = "Select long from Hospital";

                Cursor mCur = obj.rawQuery(sql, null); 
                longi=new double[mCur.getCount()];
                int i=0;
                if (mCur.moveToFirst()) 
                { 
               	do
               	{
               		longi[i]=Double.parseDouble(mCur.getString(0));
               		i++;
               	}while(mCur.moveToNext());
               
                } 
                return longi; 
            } 
            catch (Exception mSQLException)  
            { 
                Log.e(TAG, "getTestData >>"+ mSQLException.toString()); 
               // throw mSQLException; 
            }
            return longi;
            
            
            
        }
            
            public String[] getH_name() 
            {
        		String[] name = null;
                try 
                { 
                    SQLiteDatabase obj = this.getWritableDatabase();;
                    
                	String sql = "Select Hosp_name from Hospital";

                    Cursor mCur = obj.rawQuery(sql, null); 
                    name=new String[mCur.getCount()];
                    int i=0;
                    if (mCur.moveToFirst()) 
                    { 
                   	do
                   	{
                   		name[i]= mCur.getString(0);
                   		i++;
                   	}while(mCur.moveToNext());
                   
                    } 
                    return name; 
                } 
                catch (Exception mSQLException)  
                { 
                    Log.e(TAG, "getTestData >>"+ mSQLException.toString()); 
                   // throw mSQLException; 
                }
                return name;
    
	/*	SQLiteDatabase obj = this.getWritableDatabase();;
     	String sql = "Select Lat from Hospital";
        Cursor mCur = obj.rawQuery(sql, null); 
        double[] lat=new double[mCur.getCount()];
        int i=0;
        if (mCur.moveToFirst()) 
        { 
       	do
       	{
				lat[i] = Double.parseDouble(mCur.getString(0));
				i++;
				System.out.println(i);
       		
       	}while(mCur.moveToNext());
       
        } 
        return lat; */
        
    }
} 


