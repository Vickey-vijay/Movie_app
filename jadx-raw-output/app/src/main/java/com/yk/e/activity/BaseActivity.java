package com.yk.e.activity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.yk.e.util.IDUtil;
import com.yk.e.util.LogUtil;

/* JADX INFO: loaded from: classes7.dex */
public abstract class BaseActivity extends AppCompatActivity {
    public <T extends View> T findViewById(String str) {
        return (T) findViewById(IDUtil.getViewID(this, str));
    }

    public int getDrawable(String str) {
        return IDUtil.getDrawable(this, str);
    }

    public String getString(String str) {
        return IDUtil.getString(this, str);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setFlags(128, 128);
    }

    public void setContentView(String str) {
        setContentView(IDUtil.getLayoutID(this, str));
    }

    public void setStatusViewNoHeight() {
        getWindow().getDecorView().setSystemUiVisibility(9472);
        getWindow().setStatusBarColor(0);
    }

    public void showFullTheme() {
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        try {
            attributes.getClass().getField("layoutInDisplayCutoutMode").setInt(attributes, attributes.getClass().getDeclaredField("LAYOUT_IN_DISPLAY_CUTOUT_MODE_SHORT_EDGES").getInt(null));
            getWindow().getDecorView().setSystemUiVisibility(View.class.getDeclaredField("SYSTEM_UI_FLAG_IMMERSIVE_STICKY").getInt(null) | 1798);
        } catch (IllegalAccessException e10) {
            LogUtil.printException(e10);
        } catch (NoSuchFieldException e11) {
            LogUtil.printException(e11);
        }
    }
}
