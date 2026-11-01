package com.fyber.inneractive.sdk.flow.storepromo.controller.webview;

import android.view.MotionEvent;
import com.fyber.inneractive.sdk.web.m;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends m {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b f15610h;

    @Override // com.fyber.inneractive.sdk.web.m, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44970p, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // com.fyber.inneractive.sdk.web.m, android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // com.fyber.inneractive.sdk.web.m, android.webkit.WebView
    public final void destroy() {
        b bVar = this.f15610h;
        bVar.f15612a = null;
        bVar.f15613b = null;
        super.destroy();
    }

    public a(b bVar) {
        this.f15610h = bVar;
        setWebViewClient(bVar);
        getSettings().setJavaScriptEnabled(true);
        setHorizontalScrollBarEnabled(false);
        setHorizontalScrollbarOverlay(false);
        setVerticalScrollBarEnabled(false);
        setVerticalScrollbarOverlay(false);
        getSettings().setSupportZoom(false);
        setOverScrollMode(2);
    }
}
