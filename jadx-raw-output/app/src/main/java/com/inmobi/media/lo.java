package com.inmobi.media;

import android.content.Context;
import android.view.MotionEvent;
import android.webkit.WebView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;

/* JADX INFO: loaded from: classes10.dex */
public final class lo extends WebView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f24792a;

    @Override // android.webkit.WebView
    public final void destroy() {
        this.f24792a = true;
        super.destroy();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.f44963i, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lo(Context context) {
        super(context);
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
    }
}
