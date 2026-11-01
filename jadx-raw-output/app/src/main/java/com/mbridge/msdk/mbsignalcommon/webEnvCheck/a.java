package com.mbridge.msdk.mbsignalcommon.webEnvCheck;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbsignalcommon.base.b;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.h;

/* JADX INFO: compiled from: MBWebViewChecker.java */
/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile Boolean f36087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile Handler f36088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Boolean f36089c;

    /* JADX INFO: renamed from: com.mbridge.msdk.mbsignalcommon.webEnvCheck.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: MBWebViewChecker.java */
    public class RunnableC0356a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f36090a;

        public RunnableC0356a(Context context) {
            this.f36090a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.f36087a == null) {
                try {
                    Boolean unused = a.f36087a = Boolean.valueOf(a.a(this.f36090a));
                } catch (Exception unused2) {
                    Boolean unused3 = a.f36087a = Boolean.FALSE;
                }
            }
        }
    }

    public static boolean a(Context context) {
        WebView webView;
        try {
            webView = new WebView(context);
            webView.setWebViewClient(new b());
        } catch (Exception unused) {
            webView = null;
        }
        if (webView == null) {
            return false;
        }
        a(webView);
        return true;
    }

    public static boolean b(Context context) {
        g gVarB;
        try {
            gVarB = h.b().b(c.n().b());
        } catch (Exception unused) {
            gVarB = null;
        }
        if (gVarB != null) {
            f36089c = Boolean.valueOf(gVarB.D0());
        } else {
            f36089c = Boolean.FALSE;
        }
        Boolean bool = f36089c;
        if (bool == null || !bool.booleanValue()) {
            return true;
        }
        if (Looper.getMainLooper() == Looper.myLooper()) {
            if (f36087a == null) {
                try {
                    f36087a = Boolean.valueOf(a(context));
                } catch (Exception unused2) {
                    f36087a = Boolean.FALSE;
                }
            }
            if (f36087a == null) {
                f36087a = new Boolean(false);
            }
            return f36087a.booleanValue();
        }
        if (f36087a == null && f36088b == null) {
            f36088b = new Handler(Looper.getMainLooper());
            f36088b.post(new RunnableC0356a(context));
        }
        if (f36087a == null) {
            return true;
        }
        return f36087a.booleanValue();
    }

    private static void a(WebView webView) {
        try {
            webView.destroy();
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("MBWebViewChecker", "destroy webview error", e10);
            }
        }
    }
}
