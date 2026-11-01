package com.luck.picture.lib.basic;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import com.luck.picture.lib.PictureSelectorFragment;
import com.luck.picture.lib.R$color;
import com.luck.picture.lib.R$layout;
import com.luck.picture.lib.config.PictureSelectionConfig;
import com.luck.picture.lib.style.SelectMainStyle;
import g8.b;
import o8.q;
import z7.f;

/* JADX INFO: loaded from: classes2.dex */
public class PictureSelectorSupporterActivity extends AppCompatActivity {
    public final void k() {
        SelectMainStyle selectMainStyleC = PictureSelectionConfig.T0.c();
        int iR = selectMainStyleC.R();
        int iB = selectMainStyleC.B();
        boolean zU = selectMainStyleC.U();
        if (!q.c(iR)) {
            iR = ContextCompat.getColor(this, R$color.ps_color_grey);
        }
        if (!q.c(iB)) {
            iB = ContextCompat.getColor(this, R$color.ps_color_grey);
        }
        e8.a.a(this, iR, iB, zU);
    }

    public final void l() {
        z7.a.a(this, PictureSelectorFragment.C, PictureSelectorFragment.d2());
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(f.a(context, PictureSelectionConfig.e().C, PictureSelectionConfig.e().D));
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, PictureSelectionConfig.T0.e().f32356c);
    }

    public void initAppLanguage() {
        PictureSelectionConfig pictureSelectionConfigE = PictureSelectionConfig.e();
        int i10 = pictureSelectionConfigE.C;
        if (i10 != -2 && !pictureSelectionConfigE.f32202c) {
            b.d(this, i10, pictureSelectionConfigE.D);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        initAppLanguage();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        k();
        setContentView(R$layout.ps_activity_container);
        l();
    }
}
