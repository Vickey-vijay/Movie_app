package com.bytedance.sdk.component.ouw;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.safedk.android.internal.SafeDKWebAppInterface;
import com.safedk.android.internal.partials.PangleNetworkBridge;

/* JADX INFO: loaded from: classes.dex */
public class qbp extends ouw {
    public static final /* synthetic */ boolean tlj = true;
    public WebView bly;
    public String pno;

    @Override // com.bytedance.sdk.component.ouw.ouw
    public final Context ouw(bly blyVar) {
        Context context = blyVar.fkw;
        if (context != null) {
            return context;
        }
        WebView webView = blyVar.ouw;
        if (webView != null) {
            return webView.getContext();
        }
        throw new IllegalStateException("WebView cannot be null!");
    }

    @Override // com.bytedance.sdk.component.ouw.ouw
    @SuppressLint({"JavascriptInterface", "AddJavascriptInterface"})
    public final void vt(bly blyVar) {
        this.bly = blyVar.ouw;
        this.pno = blyVar.f11866lh;
        if (blyVar.mwh) {
            return;
        }
        lh();
    }

    @SuppressLint({"AddJavascriptInterface"})
    public void lh() {
        if (!tlj && this.bly == null) {
            throw new AssertionError();
        }
        PangleNetworkBridge.onAddedJavascriptInterface(this.bly, this, this.pno);
    }

    public void yu() {
        this.bly.removeJavascriptInterface(this.pno);
    }

    @Override // com.bytedance.sdk.component.ouw.ouw
    @JavascriptInterface
    public void invokeMethod(String str) {
        super.invokeMethod(str);
    }

    @Override // com.bytedance.sdk.component.ouw.ouw
    public final String ouw() {
        return this.bly.getUrl();
    }

    @Override // com.bytedance.sdk.component.ouw.ouw
    public final void vt() {
        super.vt();
        yu();
    }

    @Override // com.bytedance.sdk.component.ouw.ouw
    public final void ouw(String str, jg jgVar) {
        if (jgVar != null && !TextUtils.isEmpty(jgVar.pno)) {
            String str2 = jgVar.pno;
            vt(String.format("javascript:(function(){   const iframe = document.querySelector(atob('%s'));   if (iframe && iframe.contentWindow) {        iframe.contentWindow.postMessage(%s, atob('%s'));   }})()", Base64.encodeToString(String.format("iframe[src=\"%s\"", str2).getBytes(), 2), str, Base64.encodeToString(str2.getBytes(), 2)));
            return;
        }
        super.ouw(str, jgVar);
    }

    private void vt(final String str) {
        if (this.f11881le || TextUtils.isEmpty(str)) {
            return;
        }
        Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.component.ouw.qbp.1
            @Override // java.lang.Runnable
            public final void run() {
                if (qbp.this.f11881le) {
                    return;
                }
                try {
                    pno.ouw("Invoking Jsb using evaluateJavascript: " + str);
                    qbp.this.bly.evaluateJavascript(str, null);
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
            }
        };
        if (Looper.myLooper() != Looper.getMainLooper()) {
            pno.ouw("Received call on sub-thread, posting to main thread: ".concat(String.valueOf(str)));
            this.yu.post(runnable);
        } else {
            runnable.run();
        }
    }

    @Override // com.bytedance.sdk.component.ouw.ouw
    public final void ouw(String str) {
        vt(SafeDKWebAppInterface.f44738f + this.pno + "._handleMessageFromToutiao(" + str + ")");
    }
}
