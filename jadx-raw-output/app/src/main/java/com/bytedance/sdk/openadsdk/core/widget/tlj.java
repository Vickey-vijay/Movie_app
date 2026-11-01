package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes6.dex */
public final class tlj extends ra {
    public long ouw;
    public long vt;

    @Override // com.bytedance.sdk.openadsdk.core.widget.ra, com.bytedance.sdk.openadsdk.core.le.ra, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44975u, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.core.widget.ra, com.bytedance.sdk.openadsdk.core.le.ra, android.widget.RelativeLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.ra
    public final boolean ouw() {
        return false;
    }

    public final long getDisplayDuration() {
        if (this.ouw == 0) {
            return 0L;
        }
        if (this.vt == 0) {
            this.vt = SystemClock.elapsedRealtime();
        }
        return this.vt - this.ouw;
    }

    public final void lh() {
        setVisibility(8);
        if (this.ouw != 0) {
            this.vt = SystemClock.elapsedRealtime();
        }
    }

    public tlj(@NonNull Context context) {
        super(context);
        setVisibility(8);
        setClickable(true);
    }
}
