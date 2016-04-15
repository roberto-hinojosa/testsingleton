package com.example.robertohinojosa.testsingleton;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class ActivityA extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_);

        //Show the string value defined by the private constructor
        Toast.makeText(getApplicationContext(),Singleton.getInstance().getString(), Toast.LENGTH_LONG).show();

        //Change the string value and launch intent to ActivityB
        Singleton.getInstance().setString("Singleton");
        Intent intent = new Intent(getApplicationContext(),ActivityB.class);
        this.startActivity(intent);
    }
}