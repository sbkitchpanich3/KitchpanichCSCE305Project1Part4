package com.sbkitchpanich.kitchpanichcsce305project1part4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BuildingThai extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.building_thai);
    }

    public void toBuildingEnglish(View view) {
        Intent getBuildingEnglishIntent = new Intent(this, BuildingEnglish.class);
        startActivity(getBuildingEnglishIntent);
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
