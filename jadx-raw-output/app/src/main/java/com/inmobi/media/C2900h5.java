package com.inmobi.media;

import android.content.Context;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;

/* JADX INFO: renamed from: com.inmobi.media.h5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2900h5 extends TextureView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f24481a;

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.f44963i, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2900h5(Context context) {
        super(context);
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        this.f24481a = 1.0f;
        setFocusable(true);
        setFocusableInTouchMode(true);
    }

    public final void setAspectRatio(float f10) {
        if (this.f24481a <= 0.0f) {
            return;
        }
        this.f24481a = f10;
        requestLayout();
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        if (size != 0 && size2 != 0) {
            float f10 = this.f24481a;
            if (f10 > 0.0f) {
                int i12 = (int) (size / f10);
                if (i12 <= size2) {
                    setMeasuredDimension(size, i12);
                    return;
                } else {
                    setMeasuredDimension((int) (size2 * f10), size2);
                    return;
                }
            }
        }
        super.onMeasure(i10, i11);
    }
}
