package com.bytedance.sdk.openadsdk.core.bly;

import android.annotation.SuppressLint;
import android.view.ViewGroup;
import androidx.annotation.UiThread;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class yu {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private static volatile yu f12574lh;
    private static int vt;
    public final List<fkw> ouw = new ArrayList();

    public static yu ouw() {
        if (f12574lh == null) {
            synchronized (yu.class) {
                if (f12574lh == null) {
                    f12574lh = new yu();
                }
            }
        }
        return f12574lh;
    }

    private void lh(fkw fkwVar) {
        if (fkwVar != null) {
            if (this.ouw.size() >= vt) {
                fkwVar.bly();
            } else {
                if (this.ouw.contains(fkwVar)) {
                    return;
                }
                vt(fkwVar);
                this.ouw.add(fkwVar);
            }
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public static void vt(fkw fkwVar) {
        if (fkwVar == null || fkwVar.getWebView() == null) {
            return;
        }
        if (fkwVar.getParent() != null) {
            ((ViewGroup) fkwVar.getParent()).removeView(fkwVar);
        }
        try {
            fkwVar.removeAllViews();
            fkwVar.vt();
            fkwVar.setWebChromeClient(null);
            fkwVar.setWebViewClient(null);
            fkwVar.setDownloadListener(null);
            fkwVar.setDefaultTextEncodingName("UTF-8");
            fkwVar.setAllowFileAccess(false);
            fkwVar.setJavaScriptEnabled(true);
            fkwVar.setCacheMode(-1);
            fkwVar.setDatabaseEnabled(true);
            fkwVar.setSupportZoom(false);
            fkwVar.getWebView().setLayerType(0, null);
            fkwVar.setBackgroundColor(0);
            fkwVar.getWebView().setHorizontalScrollBarEnabled(false);
            fkwVar.getWebView().setHorizontalScrollbarOverlay(false);
            fkwVar.getWebView().setVerticalScrollBarEnabled(false);
            fkwVar.getWebView().setVerticalScrollbarOverlay(false);
            com.bytedance.sdk.openadsdk.core.widget.ouw.lh.ouw(fkwVar);
            fkwVar.ra();
            fkwVar.setMixedContentMode(0);
        } catch (Exception unused) {
        }
    }

    @UiThread
    public final void ouw(fkw fkwVar) {
        if (fkwVar != null) {
            lh(fkwVar);
        }
    }
}
