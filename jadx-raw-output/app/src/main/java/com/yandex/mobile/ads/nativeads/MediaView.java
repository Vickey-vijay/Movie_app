package com.yandex.mobile.ads.nativeads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes7.dex */
public final class MediaView extends a {
    public MediaView(Context context) {
        this(context, null);
    }

    @Override // com.yandex.mobile.ads.nativeads.a, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44979y, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    public MediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public MediaView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
