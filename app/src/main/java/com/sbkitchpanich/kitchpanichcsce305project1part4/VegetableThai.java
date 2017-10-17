package com.sbkitchpanich.kitchpanichcsce305project1part4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class VegetableThai extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vegetable_thai);
    }

    public void toVegetableEnglish(View view) {
        Intent getVegetableEnglishIntent = new Intent(this, VegetableEnglish.class);
        startActivity(getVegetableEnglishIntent);
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
