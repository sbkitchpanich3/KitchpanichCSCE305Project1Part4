package com.sbkitchpanich.kitchpanichcsce305project1part4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class RestEnglish extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rest);
    }

    public void toRestThai(View view) {
        Intent getRestThaiIntent = new Intent(this, RestThai.class);
        startActivity(getRestThaiIntent);
        finish();
    }

    public void toPrev(View view) {
        Intent getLoveThaiIntent = new Intent(this, LoveThai.class);
        startActivity(getLoveThaiIntent);
        finish();
    }

    public void toNext(View view) {
        Intent getVegetableThaiIntent = new Intent(this, VegetableThai.class);
        startActivity(getVegetableThaiIntent);
        finish();
    }
}
