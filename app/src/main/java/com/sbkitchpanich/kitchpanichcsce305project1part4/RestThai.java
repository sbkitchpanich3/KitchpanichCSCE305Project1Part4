package com.sbkitchpanich.kitchpanichcsce305project1part4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class RestThai extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rest_thai);
    }

    public void toRestEnglish(View view) {
        Intent getRestEnglishIntent = new Intent(this, RestEnglish.class);
        startActivity(getRestEnglishIntent);
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
