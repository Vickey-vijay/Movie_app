package com.fyber.inneractive.sdk.web.remoteui;

import android.view.MotionEvent;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.m;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends m implements a, com.fyber.inneractive.sdk.player.ui.remote.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a f18749h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.ui.remote.a f18750i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f18751j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final c f18752k;

    @Override // com.fyber.inneractive.sdk.web.remoteui.a
    public final void a(com.fyber.inneractive.sdk.network.events.b bVar, String str, boolean z10, HashMap map) {
        this.f18751j = false;
        a aVar = this.f18749h;
        if (aVar != null) {
            aVar.a(bVar, str, z10, map);
        }
    }

    @Override // com.fyber.inneractive.sdk.web.m, android.webkit.WebView
    public final void destroy() {
        this.f18749h = null;
        this.f18750i = null;
        c cVar = this.f18752k;
        cVar.getClass();
        IAlog.a("%s: destroy()", "RemoteUiWebViewClient");
        cVar.f18754b = null;
        cVar.f18753a = null;
        super.destroy();
    }

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

    public void setCommandHandler(com.fyber.inneractive.sdk.player.ui.remote.a aVar) {
        this.f18750i = aVar;
    }

    public void setResultFailureListener(a aVar) {
        this.f18749h = aVar;
    }

    public void setUiReady(boolean z10) {
        this.f18751j = z10;
    }

    public b() {
        c cVar = new c(this, this);
        this.f18752k = cVar;
        setWebViewClient(cVar);
        getSettings().setJavaScriptEnabled(true);
        setHorizontalScrollBarEnabled(false);
        setHorizontalScrollbarOverlay(false);
        setVerticalScrollBarEnabled(false);
        setVerticalScrollbarOverlay(false);
        getSettings().setSupportZoom(false);
        setBackgroundColor(0);
    }

    @Override // com.fyber.inneractive.sdk.player.ui.remote.a
    public final void a(String str, HashMap map) {
        com.fyber.inneractive.sdk.player.ui.remote.a aVar = this.f18750i;
        if (aVar != null) {
            aVar.a(str, map);
        }
    }
}
