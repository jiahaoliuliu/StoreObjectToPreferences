package com.jiahaoliuliu.storeobjecttopreferences;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.TextUtils;
import android.util.Log;
import android.widget.TextView;

import com.google.gson.Gson;
import com.jiahaoliuliu.storeobjecttopreferences.Preferences.StringId;
import com.jiahaoliuliu.storeobjecttopreferences.model.SimpleModel;


public class MainActivity extends ActionBarActivity {

    private static final String TAG = "MainActivity";

    private Preferences preferences;

    // Layouts
    private TextView objectDataTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Link the text view
        objectDataTextView = (TextView)findViewById(R.id.object_data_text_view);

        preferences = Preferences.SingletonHolder.INSTANCE;
        preferences.initialize(this);

        SimpleModel simpleModel = new SimpleModel();
        simpleModel.setFieldString("ContentString");

        Gson gson = new Gson();
        String dataToBeSaved = gson.toJson(simpleModel, SimpleModel.class);

        Log.v(TAG, "Data to be saved in the preferences: \n" + dataToBeSaved);
        preferences.setString(StringId.SAMPLE_OBJECT_CONTENT, dataToBeSaved);

        String dataRetrieved = preferences.getString(StringId.SAMPLE_OBJECT_CONTENT);
        if (!TextUtils.isEmpty(dataRetrieved)) {
            SimpleModel simpleModelRetrieved = gson.fromJson(dataRetrieved, SimpleModel.class);
            objectDataTextView.setText(simpleModelRetrieved.toString());
        }
    }
}
