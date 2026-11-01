package com.bytedance.sdk.component.utils;

import android.annotation.TargetApi;
import android.webkit.WebView;
import com.safedk.android.internal.SafeDKWebAppInterface;
import com.safedk.android.internal.partials.PangleNetworkBridge;

/* JADX INFO: loaded from: classes8.dex */
public final class jg {
    private static final ouw ouw = new vt(0);

    public static class ouw {
        private ouw() {
        }

        public void ouw(WebView webView, String str) {
            if (webView == null) {
                return;
            }
            try {
                PangleNetworkBridge.webviewLoadUrl(webView, str);
            } catch (Throwable unused) {
            }
        }

        public /* synthetic */ ouw(byte b10) {
            this();
        }
    }

    @TargetApi(19)
    public static class vt extends ouw {
        private vt() {
            super((byte) 0);
        }

        public /* synthetic */ vt(byte b10) {
            this();
        }

        @Override // com.bytedance.sdk.component.utils.jg.ouw
        public final void ouw(WebView webView, String str) {
            if (webView == null) {
                return;
            }
            boolean z10 = false;
            if (str != null && str.startsWith(SafeDKWebAppInterface.f44738f)) {
                try {
                    webView.evaluateJavascript(str, null);
                    z10 = true;
                } catch (Throwable th2) {
                    boolean z11 = th2 instanceof IllegalStateException;
                }
            }
            if (z10) {
                return;
            }
            try {
                PangleNetworkBridge.webviewLoadUrl(webView, str);
            } catch (Throwable unused) {
            }
        }
    }

    public static void ouw(WebView webView, String str) {
        ouw.ouw(webView, str);
    }
}
