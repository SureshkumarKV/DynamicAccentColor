package in.sureshkumarkv.dynamicaccentcolor;

import android.content.Context;
import android.graphics.Color;

public class DynamicAccentColor {
    private int mStyleResourceId;

    public DynamicAccentColor(Context context, int color){
        mStyleResourceId = context.getResources().getIdentifier(String.format("Accent_%08x", getQuantizedColor(color)), "style", context.getPackageName());
    }

    public int getStyleResourceId(){
        return mStyleResourceId;
    }

    private int getQuantizedColor(int color){
        int alpha = Color.alpha(color) / 0x0f * 0x0f;
        int red = Color.red(color) / 0x0f * 0x0f;
        int green = Color.green(color) / 0x0f * 0x0f;
        int blue = Color.blue(color) / 0x0f * 0x0f;
        return Color.argb(alpha, red, green, blue);
    }
}
