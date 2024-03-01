package com.mypack.crouseldemo;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageSlider imageSlider = findViewById(R.id.imageSlider);
        ArrayList<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.back_sugarcane1, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.back_sugarcane2, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.main_background, ScaleTypes.FIT));

        imageSlider.setImageList(slideModels, ScaleTypes.FIT);
    }
}