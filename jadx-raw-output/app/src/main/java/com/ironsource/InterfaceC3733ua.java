package com.ironsource;

import android.annotation.SuppressLint;
import android.os.Build;
import android.webkit.WebView;
import com.safedk.android.internal.SafeDKWebAppInterface;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;

/* JADX INFO: renamed from: com.ironsource.ua, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public interface InterfaceC3733ua {

    /* JADX INFO: renamed from: com.ironsource.ua$a */
    public static final class a implements InterfaceC3733ua {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WebView f31404a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f31405b;

        public a() {
            this(0, 1, null);
        }

        @Override // com.ironsource.InterfaceC3733ua
        public boolean a() {
            return this.f31404a != null;
        }

        public a(int i10) {
            this.f31405b = i10 >= 19;
        }

        @SuppressLint({"NewApi"})
        private final void b(String str) {
            WebView webView = this.f31404a;
            if (webView != null) {
                webView.evaluateJavascript(str, null);
            }
        }

        private final void c(String str) {
            WebView webView = this.f31404a;
            if (webView != null) {
                IronSourceNetworkBridge.webviewLoadUrl(webView, SafeDKWebAppInterface.f44738f + str);
            }
        }

        @Override // com.ironsource.InterfaceC3733ua
        public void a(String str) {
            ck.p.j(str, "script");
            try {
                if (this.f31405b) {
                    b(str);
                } else {
                    c(str);
                }
            } catch (Throwable th2) {
                C3676r4.d().a(th2);
                this.f31405b = false;
                c(str);
            }
        }

        public /* synthetic */ a(int i10, int i11, ck.i iVar) {
            this((i11 & 1) != 0 ? Build.VERSION.SDK_INT : i10);
        }

        @Override // com.ironsource.InterfaceC3733ua
        public void a(WebView webView) {
            ck.p.j(webView, "webView");
            this.f31404a = webView;
        }
    }

    void a(WebView webView);

    void a(String str);

    boolean a();
}
