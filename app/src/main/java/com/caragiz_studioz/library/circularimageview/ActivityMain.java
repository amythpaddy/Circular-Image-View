package com.caragiz_studioz.library.circularimageview;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class ActivityMain extends AppCompatActivity {
CircularImageView testImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        testImage = findViewById(R.id.test_view);
        testImage.setBorderColor(Color.RED);
        testImage.setBorderWidth(100);
    }
}
