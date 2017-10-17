package com.sbkitchpanich.kitchpanichcsce305project1part4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class VegetableEnglish extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vegetable);
    }

    public void toVegetableThai(View view) {
        Intent getVegetableThaiIntent = new Intent(this, VegetableThai.class);
        startActivity(getVegetableThaiIntent);
        finish();
    }

    public void toPrev(View view) {
        Intent getRestThaiIntent = new Intent(this, RestThai.class);
        startActivity(getRestThaiIntent);
        finish();
    }

    public void toNext(View view) {
        Intent getWigThaiIntent = new Intent(this, WigThai.class);
        startActivity(getWigThaiIntent);
        finish();
    }
}
