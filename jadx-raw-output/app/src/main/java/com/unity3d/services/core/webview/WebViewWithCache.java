package com.unity3d.services.core.webview;

import android.content.Context;
import android.view.MotionEvent;
import android.webkit.WebSettings;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;
import com.unity3d.services.core.configuration.IExperiments;
import com.unity3d.services.core.webview.bridge.IInvocationCallbackInvoker;
import com.unity3d.services.core.webview.bridge.IWebViewBridge;
import com.unity3d.services.core.webview.bridge.SharedInstances;

/* JADX INFO: loaded from: classes3.dex */
public class WebViewWithCache extends WebView {
    /* JADX WARN: Illegal instructions before constructor call */
    public WebViewWithCache(Context context, boolean z10, IExperiments iExperiments) {
        SharedInstances sharedInstances = SharedInstances.INSTANCE;
        this(context, z10, sharedInstances.getWebViewBridge(), sharedInstances.getWebViewAppInvocationCallbackInvoker(), iExperiments);
    }

    @Override // com.unity3d.services.core.webview.WebView, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44967m, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // com.unity3d.services.core.webview.WebView, android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public WebViewWithCache(Context context, boolean z10, IWebViewBridge iWebViewBridge, IInvocationCallbackInvoker iInvocationCallbackInvoker, IExperiments iExperiments) {
        super(context, z10, iWebViewBridge, iInvocationCallbackInvoker, iExperiments);
        WebSettings settings = getSettings();
        settings.setCacheMode(-1);
        settings.setDomStorageEnabled(true);
        if (z10) {
            settings.setMediaPlaybackRequiresUserGesture(false);
        }
    }
}
