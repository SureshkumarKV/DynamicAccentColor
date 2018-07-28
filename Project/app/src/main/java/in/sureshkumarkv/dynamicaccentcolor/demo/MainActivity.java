package in.sureshkumarkv.dynamicaccentcolor.demo;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;

import in.sureshkumarkv.dynamicaccentcolor.DynamicAccentColor;
import in.sureshkumarkv.dynamicaccentcolor.R;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        int blueViolet = 0xFF8A2BE1;
        int resId = new DynamicAccentColor(this, blueViolet).getStyleResourceId();
        getTheme().applyStyle(resId, true);

        setContentView(R.layout.activity_main);
    }

}
