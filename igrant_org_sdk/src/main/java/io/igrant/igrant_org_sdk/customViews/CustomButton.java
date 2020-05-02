package io.igrant.igrant_org_sdk.customViews;

import android.content.Context;
import androidx.appcompat.widget.AppCompatButton;
import android.util.AttributeSet;

/**
 * Created by JMAM on 8/15/18.
 */

public class CustomButton extends AppCompatButton {
    public CustomButton(Context context) {
        super(context);
        init(null);
    }

    public CustomButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }

    public CustomButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs);
    }

    private void init(AttributeSet attrs) {

    }

}
