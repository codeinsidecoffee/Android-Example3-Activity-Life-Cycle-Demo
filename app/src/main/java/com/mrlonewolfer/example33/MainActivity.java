package com.mrlonewolfer.example33;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

/*

Create an Android Application which Manage Activity Lifecycle Stages and
Showing Toast with Performing Different Stages.
 For Example when application is open at that time
 i pressed home key at that time showing (onPause() and onStop() Method's Toast).
 */
public class MainActivity extends AppCompatActivity {
String TAG="Lifecycle";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "On Create Method Launched", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "onCreate: ");
        Intent intent=getIntent();
        
    }

    @Override
    protected void onResume() {
        Toast.makeText(this, "On Resume Method Launched", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "onResume: ");
        super.onResume();

    }

    @Override
    protected void onPause() {
        Toast.makeText(this, "On Pause Method Launched", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "onPause: ");
        super.onPause();

    }

    @Override
    protected void onRestart() {
        Toast.makeText(this, "On Restart Method Launched", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "onRestart: ");
        super.onRestart();

    }

    @Override
    protected void onStop() {
        Toast.makeText(this, "On Stop Method Launched", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "onStop: ");
        super.onStop();

    }

    @Override
    protected void onDestroy() {
        Toast.makeText(this, "On Stop Method Launched", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "onDestroy: ");
        super.onDestroy();
    }

}
