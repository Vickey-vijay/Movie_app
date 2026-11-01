package com.bytedance.adsdk.ugeno.bly.lh;

import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import com.bytedance.adsdk.ugeno.bly.yu.lh;

/* JADX INFO: loaded from: classes11.dex */
public abstract class ouw extends lh {

    /* JADX INFO: renamed from: fn, reason: collision with root package name */
    private int f10775fn;

    @Override // com.bytedance.adsdk.ugeno.bly.yu.lh
    public final String pno() {
        return "drawable";
    }

    public abstract String ryl(String str);

    @Override // com.bytedance.adsdk.ugeno.bly.yu.lh, com.bytedance.adsdk.ugeno.vt.lh
    public final void vt() {
        String strRyl = ryl(((lh) this).ouw);
        ((lh) this).ouw = TextUtils.isEmpty(strRyl) ? "" : "local://".concat(String.valueOf(strRyl));
        super.vt();
        ((com.bytedance.adsdk.ugeno.bly.yu.ouw) this.fkw).setColorFilter(this.f10775fn);
        ((com.bytedance.adsdk.ugeno.bly.yu.ouw) this.fkw).setScaleType(ImageView.ScaleType.FIT_CENTER);
    }

    public ouw(Context context) {
        super(context);
        this.f10775fn = ViewCompat.MEASURED_STATE_MASK;
    }

    @Override // com.bytedance.adsdk.ugeno.bly.yu.lh, com.bytedance.adsdk.ugeno.vt.lh
    public final void ouw(String str, String str2) {
        super.ouw(str, str2);
        str.hashCode();
        if (str.equals("textColor")) {
            this.f10775fn = com.bytedance.adsdk.ugeno.ra.ouw.ouw(str2, ViewCompat.MEASURED_STATE_MASK);
        }
    }
}
