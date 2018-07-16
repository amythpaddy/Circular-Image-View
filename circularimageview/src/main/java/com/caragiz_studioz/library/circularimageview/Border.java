package com.caragiz_studioz.library.circularimageview;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.shapes.Shape;

public class Border  {
    private GradientDrawable shape;
    public Border(){
        shape = new GradientDrawable();
        shape.setShape(GradientDrawable.RECTANGLE);
        shape.setCornerRadius(200);
        shape.setColor(Color.WHITE);
    }

    public GradientDrawable setBorderColor(int color){
        shape.setColor(color);
        return shape;
    }

    public Drawable getBorder() {
        return shape;
    }
}
