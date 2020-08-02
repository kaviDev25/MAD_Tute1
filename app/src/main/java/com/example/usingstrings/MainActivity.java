package com.example.usingstrings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textview2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(tag:"Lifecycle" , msg:"onCreate() invoked");

        textview2 = findViewById(R.id.textView);
        textview2.setText(R.string.Msg2);
    }

    public void onStart(){
      super.onStart();
        Log.i(tag:"Lifecycle" , msg:"onStart() invoked");
    }

    public void onRestart(){
        super.onRestart();
        Log.i(tag:"Lifecycle" , msg:"onRestart() invoked");
    }

    public void onResume(){
        super.onResume();
        Log.i(tag:"Lifecycle" , msg:"onResume() invoked");
    }

    public void onPause(){
        super.onPause();
        Log.i(tag:"Lifecycle" , msg:"onPause() invoked");
    }

    public void onStop(){
        super.onStop();
        Log.i(tag:"Lifecycle" , msg:"onStop() invoked");
    }

    public void onDestroy(){
        super.onDestroy();
        Log.i(tag:"Lifecycle" , msg:"onDestroy() invoked");
    }
}