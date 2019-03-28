package com.example.sinsgram;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    //hh pinche porqueria

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void GoCreateAccount (View view){
        Intent intent;
        intent = new Intent(MainActivity.this,CreateAccountActivity.class);
        startActivity(intent);
            }
}
