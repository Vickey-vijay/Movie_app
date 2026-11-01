package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.Button;
import com.bytedance.sdk.component.utils.vpp;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes3.dex */
public final class pno extends Button {
    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44975u, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public pno(Context context) {
        super(context);
        setId(com.bytedance.sdk.openadsdk.utils.rn.f13413gh);
        Context context2 = getContext();
        setLayoutParams(new ViewGroup.LayoutParams(-1, osn.ouw(context2, 48.0f)));
        setBackground(com.bytedance.sdk.openadsdk.utils.cf.ouw(context2, "tt_browser_download_selector"));
        setText(vpp.ouw(context2, "tt_video_download_apk"));
        setTextColor(-1);
        setTextSize(2, 16.0f);
    }
}
