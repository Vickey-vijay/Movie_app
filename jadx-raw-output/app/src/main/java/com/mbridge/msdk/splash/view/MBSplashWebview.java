package com.mbridge.msdk.splash.view;

import android.content.Context;
import android.view.MotionEvent;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes9.dex */
public class MBSplashWebview extends WindVaneWebView {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f37302r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private AdSession f37303s;

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView, com.mbridge.msdk.mbsignalcommon.base.BaseWebView, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44969o, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView, com.mbridge.msdk.mbsignalcommon.base.BaseWebView, android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public void finishAdSession() {
        try {
            AdSession adSession = this.f37303s;
            if (adSession != null) {
                adSession.finish();
                this.f37303s = null;
                q0.a("OMSDK", "finish adSession");
            }
        } catch (Exception e10) {
            q0.a("OMSDK", e10.getMessage());
        }
    }

    public AdSession getAdSession() {
        return this.f37303s;
    }

    public String getRequestId() {
        return this.f37302r;
    }

    public void setAdSession(AdSession adSession) {
        this.f37303s = adSession;
    }

    public void setRequestId(String str) {
        this.f37302r = str;
    }

    public MBSplashWebview(Context context) {
        super(context);
        setBackgroundColor(0);
    }
}
