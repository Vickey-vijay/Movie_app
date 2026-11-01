package com.inmobi.media;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.MediaController;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* JADX INFO: renamed from: com.inmobi.media.fc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C2856fc extends MediaController {
    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.f44963i, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public C2856fc(Context context) {
        super(context);
    }

    @Override // android.widget.MediaController
    public final void show(int i10) {
        super.show(i10);
    }
}
