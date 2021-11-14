package com.share4happy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //Database
    String DB_name = "addressLacHong.db";
    private String DB_PATH = "/databases/";
    SQLiteDatabase database = null;
    ListView ds_diachihot;
    AdapterAddress adapterAddress;
    ArrayList<Address_list> ds_address = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        processCoppyDatabaseAssets();
        showDataOnlistview();
        addEvent();
    }

    private void addEvent() {
        //Tạo sự kiện nhấn chọn item trên listview
        ds_diachihot.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (ds_address.get(position).getName()){
                    case "CS1 Lạc Hồng":
                        // Gửi dữ liệu qua Activity maps
                        Intent intent = new Intent(MainActivity.this,MapsFragment.class);
                        Bundle bundle = new Bundle();
                        bundle.putString("name",ds_address.get(position).getName());
                        bundle.putString("title",ds_address.get(position).getTitle());
                        bundle.putDouble("latitude",ds_address.get(position).getLatitude());
                        bundle.putDouble("longtitude",ds_address.get(position).getLongtitude());
                        intent.putExtra("send",bundle);
                        startActivity(intent);
                        break;
                    case "CS2 Lạc Hồng":
                        Intent intent2 = new Intent(MainActivity.this,MapsFragment.class);
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("name",ds_address.get(position).getName());
                        bundle2.putString("title",ds_address.get(position).getTitle());
                        bundle2.putDouble("latitude",ds_address.get(position).getLatitude());
                        bundle2.putDouble("longtitude",ds_address.get(position).getLongtitude());
                        intent2.putExtra("send",bundle2);
                        startActivity(intent2);
                        break;
                    case "CS3 Lạc Hồng":
                        Intent intent3 = new Intent(MainActivity.this,MapsFragment.class);
                        Bundle bundle3 = new Bundle();
                        bundle3.putString("name",ds_address.get(position).getName());
                        bundle3.putString("title",ds_address.get(position).getTitle());
                        bundle3.putDouble("latitude",ds_address.get(position).getLatitude());
                        bundle3.putDouble("longtitude",ds_address.get(position).getLongtitude());
                        intent3.putExtra("send",bundle3);
                        startActivity(intent3);
                        break;
                    case "CS4 Lạc Hồng":
                        Intent intent4 = new Intent(MainActivity.this,MapsFragment.class);
                        Bundle bundle4 = new Bundle();
                        bundle4.putString("name",ds_address.get(position).getName());
                        bundle4.putString("title",ds_address.get(position).getTitle());
                        bundle4.putDouble("latitude",ds_address.get(position).getLatitude());
                        bundle4.putDouble("longtitude",ds_address.get(position).getLongtitude());
                        intent4.putExtra("send",bundle4);
                        startActivity(intent4);
                        break;
                    case "CS5 Lạc Hồng":
                        Intent intent5 = new Intent(MainActivity.this,MapsFragment.class);
                        Bundle bundle5 = new Bundle();
                        bundle5.putString("name",ds_address.get(position).getName());
                        bundle5.putString("title",ds_address.get(position).getTitle());
                        bundle5.putDouble("latitude",ds_address.get(position).getLatitude());
                        bundle5.putDouble("longtitude",ds_address.get(position).getLongtitude());
                        intent5.putExtra("send",bundle5);
                        startActivity(intent5);
                        break;
                }
            }
        });
    }

    private void showDataOnlistview() {
        ds_diachihot = findViewById(R.id.ds_điadiemhot);
        // Open database
        database = openOrCreateDatabase(DB_name, Context.MODE_PRIVATE, null);
        // Raw query
        Cursor cursor = database.query("db_vitri", null, null,
                null, null, null, null);
        while (cursor.moveToNext()) {
            Address_list address_list = new Address_list();
            address_list.setName(cursor.getString(0));
            address_list.setTitle(cursor.getString(1));
            address_list.setLatitude(cursor.getDouble(2));
            address_list.setLongtitude(cursor.getDouble(3));
            ds_address.add(address_list);
        }
        cursor.close();
        adapterAddress = new AdapterAddress(
                this,R.layout.item,ds_address
        );
        ds_diachihot.setAdapter(adapterAddress);
        adapterAddress.notifyDataSetChanged();
    }

    private void processCoppyDatabaseAssets() {
        File dbFile = getDatabasePath(DB_name);
        //Check if exists
        if (!dbFile.exists()){
            coppyDatabase();
            Toast.makeText(this,"Dữ liệu được sao chép thành công",Toast.LENGTH_SHORT).show();
        }else{
            dbFile.delete();
            coppyDatabase();
        }
    }

    private void coppyDatabase() {
        try {
            InputStream myInput = getAssets().open(DB_name);
            String outFileName = getApplicationInfo().dataDir + DB_PATH + DB_name;
            File f = new File(getApplicationInfo().dataDir + DB_PATH);
            if (!f.exists()){
                f.mkdir();
            }

            OutputStream myOutput = new FileOutputStream(outFileName);
            byte[] buffer = new byte[1024];
            int len;
            while ((len = myInput.read(buffer))>0){
                myOutput.write(buffer,0,len);
            }
            myOutput.flush();
            myInput.close();
            myOutput.close();
        }catch (Exception e){

        }
    }
}