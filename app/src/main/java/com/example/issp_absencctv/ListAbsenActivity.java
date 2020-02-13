package com.example.issp_absencctv;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.issp_absencctv.adapeter.ListAbsenAdapter;
import com.example.issp_absencctv.api.ApiClient;
import com.example.issp_absencctv.api.ApiInterface;
import com.example.issp_absencctv.model.Absen;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ListAbsenActivity extends AppCompatActivity {

    List<Absen> dataArrayList;
    ApiInterface mApiInterface;

    private RecyclerView rvListAbsen;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_absen);
        dataArrayList = new ArrayList<Absen>();
        rvListAbsen = findViewById(R.id.rvListAbsen);

        //linear layour manager
        layoutManager = new LinearLayoutManager(this);
        rvListAbsen.setLayoutManager(layoutManager);
        List<Absen> absens = new ArrayList<>();

//        mApiInterface = ApiClient.getClient().create(ApiInterface.class);
        rvListAbsen.setLayoutManager(layoutManager);

//        dataArrayList = addData(new ArrayList<Absen>());
        absens = addData(absens);

        mAdapter = new ListAbsenAdapter(getApplicationContext(),absens);
        rvListAbsen.setAdapter(mAdapter);

        Spinner dropdown = findViewById(R.id.spinner);
//create a list of items for the spinner.
        String[] items = new String[]{"Newest", "Oldest"};
//create an adapter to describe how the items are displayed, adapters are used in several places in android.
//There are multiple variations of this, but this is the basic variant.
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);
//set the spinners adapter to the previously created one.
        dropdown.setAdapter(adapter);


    }

    public List<Absen> addData( List<Absen> dataArrayList){
        // object creation.

        Absen object1 = new Absen(1, "12345", "Khamal Fauzan", "Rabu-2-12-2020", "10 : 00", "default", "White List");
        Absen object2 = new Absen(1, "12345", "Justin Bieber", "Rabu-2-12-2020", "10 : 00", "default", "White List");
        Absen object3 = new Absen(1, "12345", "Rahman Abdul", "Rabu-2-12-2020", "10 : 00", "default", "Black List");
        Absen object4 = new Absen(1, "12345", "Donald Trump", "Rabu-2-12-2020", "10 : 00", "default", "Black List");
        Absen object5 = new Absen(1, "12345", "Donald Trump", "Rabu-2-12-2020", "10 : 00", "default", "Black List");
        Absen object6 = new Absen(1, "12345", "Donald Trump", "Rabu-2-12-2020", "10 : 00", "default", "Black List");
        Absen object7 = new Absen(1, "12345", "Donald Trump", "Rabu-2-12-2020", "10 : 00", "default", "Black List");
        Absen object8 = new Absen(1, "12345", "Donald Trump", "Rabu-2-12-2020", "10 : 00", "default", "Black List");

        // adding Data object to ArrayList object Contacts.
        dataArrayList.add(object1);
        dataArrayList.add(object2);
        dataArrayList.add(object3);
        dataArrayList.add(object4);
        dataArrayList.add(object5);
        dataArrayList.add(object6);
        dataArrayList.add(object7);
        dataArrayList.add(object8);

        return dataArrayList;
    }
//
//    public void refresh(){
//        try {
//            dataArrayList = new ArrayList<>();
//            Retrofit retrofit = new Retrofit.Builder().baseUrl("http://kelola.work/demo_absen/index.php/Absen/").addConverterFactory(GsonConverterFactory.create()).build();
//            ApiInterface requestInterface = retrofit.create(ApiInterface.class);
//            Call<List<Absen>> call = requestInterface.getJson();
//
//            call.enqueue(new Callback<List<Absen>>() {
//                @Override
//                public void onResponse(Call<List<Absen>> call, Response<List<Absen>> response) {
//                    dataArrayList = response.body();
//
//                    mAdapter = new ReportPribadiAdapter(getApplicationContext(),dataArrayList);
//                    rvReportPribadi.setAdapter(mAdapter);
//
////                    Toast.makeText(getApplicationContext(),String.valueOf(dataArrayList.size()), Toast.LENGTH_SHORT).show();
//                }
//
//                @Override
//                public void onFailure(Call<List<Absen>> call, Throwable t) {
//                    Log.e("retrofit dapet",t.getMessage());
//                }
//            });
//        } catch (Exception e){
//        }
//
//    }
}
