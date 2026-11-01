package com.bytedance.sdk.openadsdk.lh;

import android.content.Context;
import android.graphics.Color;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes11.dex */
public final class cf extends View {
    private final int ouw;

    public cf(Context context) {
        this(context, Color.parseColor("#25000000"));
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44975u, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    public cf(Context context, int i10) {
        super(context);
        setBackgroundColor(i10);
        this.ouw = osn.ouw(getContext(), 0.66f);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        setMeasuredDimension(getMeasuredWidth(), this.ouw);
    }
}
