package com.sbkitchpanich.kitchpanichcsce305project1part4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class WigEnglish extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wig);
    }

    public void toWigThai(View view) {
        Intent getWigThaiIntent = new Intent(this, WigThai.class);
        startActivity(getWigThaiIntent);
        finish();
    }

    public void toPrev(View view) {
        Intent getVegetableThaiIntent = new Intent(this, VegetableThai.class);
        startActivity(getVegetableThaiIntent);
        finish();
    }

    public void toNext(View view) {
        Intent getBuildingThaiIntent = new Intent(this, BuildingThai.class);
        startActivity(getBuildingThaiIntent);
        finish();
    }
}
