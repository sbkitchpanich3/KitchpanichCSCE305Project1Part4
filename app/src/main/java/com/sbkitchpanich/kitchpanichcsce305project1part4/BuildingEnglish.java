package com.sbkitchpanich.kitchpanichcsce305project1part4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BuildingEnglish extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.building);
    }

    public void toBuildingThai(View view) {
        Intent getBuildingThaiIntent = new Intent(this, BuildingThai.class);
        startActivity(getBuildingThaiIntent);
        finish();
    }

    public void toPrev(View view) {
        Intent getWigThaiIntent = new Intent(this, WigThai.class);
        startActivity(getWigThaiIntent);
        finish();
    }

    public void toNext(View view) {
        Intent getLoveThaiIntent = new Intent(this, LoveThai.class);
        startActivity(getLoveThaiIntent);
        finish();
    }
}
