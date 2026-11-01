package com.mbridge.msdk.advanced.view;

import android.content.Context;
import android.content.IntentFilter;
import android.view.MotionEvent;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.mbridge.msdk.advanced.common.NetWorkStateReceiver;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes5.dex */
public class MBNativeAdvancedWebview extends WindVaneWebView {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f32751t = "MBNativeAdvancedWebview";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private AdSession f32752r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private NetWorkStateReceiver f32753s;

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
            AdSession adSession = this.f32752r;
            if (adSession != null) {
                adSession.finish();
                this.f32752r = null;
                q0.a("OMSDK", "finish adSession");
            }
        } catch (Exception e10) {
            q0.a("OMSDK", e10.getMessage());
        }
    }

    public AdSession getAdSession() {
        return this.f32752r;
    }

    public void registerNetWorkReceiver() {
        try {
            if (this.f32753s == null) {
                this.f32753s = new NetWorkStateReceiver(this);
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            getContext().registerReceiver(this.f32753s, intentFilter);
        } catch (Throwable th2) {
            q0.a(f32751t, th2.getMessage());
        }
    }

    public void setAdSession(AdSession adSession) {
        this.f32752r = adSession;
    }

    public void unregisterNetWorkReceiver() {
        try {
            NetWorkStateReceiver netWorkStateReceiver = this.f32753s;
            if (netWorkStateReceiver != null) {
                netWorkStateReceiver.a();
                getContext().unregisterReceiver(this.f32753s);
            }
        } catch (Throwable th2) {
            q0.a(f32751t, th2.getMessage());
        }
    }

    public MBNativeAdvancedWebview(Context context) {
        super(context);
        setBackgroundColor(0);
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        registerNetWorkReceiver();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        unregisterNetWorkReceiver();
    }
}
