package com.jiahaoliuliu.storeobjecttopreferences;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;

import com.google.gson.Gson;
import com.jiahaoliuliu.storeobjecttopreferences.model.SimpleModel;


public class MainActivity extends ActionBarActivity {

    private static final String TAG = "MainActivity";

    private Preferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        preferences = Preferences.SingletonHolder.INSTANCE;
        preferences.initialize(this);

        SimpleModel simpleModel = new SimpleModel();
        simpleModel.setFieldString("ContentString");

        Gson gson = new Gson();
        String dataToBeSaved = gson.toJson(simpleModel, SimpleModel.class);

        Log.v(TAG, "Data to be saved in the preferences: \n" + dataToBeSaved);
        preferences.setString(Preferences.StringId.SAMPLE_OBJECT_CONTENT, dataToBeSaved);
    }
}
