package com.yandex.mobile.ads.nativeads.template;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.annotation.AttrRes;
import androidx.annotation.MainThread;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;
import com.yandex.mobile.ads.nativeads.NativeAd;
import com.yandex.mobile.ads.nativeads.d;
import com.yandex.mobile.ads.nativeads.template.appearance.NativeTemplateAppearance;
import yads.bq3;
import yads.cq3;
import yads.l10;
import yads.pu3;
import yads.y02;

/* JADX INFO: loaded from: classes11.dex */
@MainThread
public final class NativeBannerView extends l10 {
    private final bq3 K;

    public NativeBannerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44979y, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NativeBannerView(Context context, AttributeSet attributeSet, @AttrRes int i10) {
        NativeTemplateAppearance nativeTemplateAppearanceBuild = new NativeTemplateAppearance.Builder().build();
        pu3 pu3Var = pu3.f81606a;
        super(context, attributeSet, i10, nativeTemplateAppearanceBuild, new cq3(context));
        this.K = new bq3();
    }

    public final void setAd(NativeAd nativeAd) {
        this.K.getClass();
        if (!(nativeAd instanceof y02)) {
            throw new IllegalArgumentException("You should pass NativeAd received from native ad loader API.");
        }
        setAd(((d) ((y02) nativeAd)).f51073a);
    }
}
