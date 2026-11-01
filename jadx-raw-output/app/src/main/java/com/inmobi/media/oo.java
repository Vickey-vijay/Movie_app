package com.inmobi.media;

import android.os.Build;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import com.mbridge.msdk.MBridgeConstans;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public abstract class oo {
    public static boolean a(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail, String str) {
        ck.p.j(webView, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        ck.p.j(str, "source");
        if (Build.VERSION.SDK_INT < 26) {
            return false;
        }
        Map mapO = kotlin.collections.a.o(mj.h.a("source", str), mj.h.a("isCrashed", Boolean.valueOf(renderProcessGoneDetail != null ? renderProcessGoneDetail.didCrash() : false)));
        Wj wj2 = Wj.f23753a;
        Wj.b("WebViewRenderProcessGoneEvent", mapO, EnumC2735ak.SDK);
        webView.destroy();
        return true;
    }
}
