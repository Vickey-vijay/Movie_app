package com.bytedance.sdk.openadsdk.yu;

import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class bly {
    private int bly;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public long f13468le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public final boolean f13469lh;
    public final vpp ouw;
    private final WebView tlj;
    public int yu;
    public String fkw = "landingpage";

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private final Map<Integer, Long> f13470ra = new HashMap();
    private final List<Integer> pno = new ArrayList();
    public final Map<Integer, String> vt = new HashMap();

    private void vt(boolean z10) {
        try {
            WebBackForwardList webBackForwardListCopyBackForwardList = this.tlj.copyBackForwardList();
            if (webBackForwardListCopyBackForwardList != null) {
                if (z10) {
                    int currentIndex = webBackForwardListCopyBackForwardList.getCurrentIndex() + 1;
                    this.yu = currentIndex;
                    if (this.f13469lh) {
                        this.yu = currentIndex + 1;
                        return;
                    }
                    return;
                }
                int currentIndex2 = webBackForwardListCopyBackForwardList.getCurrentIndex() + 1;
                this.bly = currentIndex2;
                if (this.f13469lh) {
                    this.bly = currentIndex2 + 1;
                }
            }
        } catch (Throwable th2) {
            qbp.lh("ArbitrageLandingLog", th2.toString());
        }
    }

    public final boolean ouw(boolean z10) {
        int i10 = z10 ? this.yu : this.bly;
        vt(z10);
        int i11 = z10 ? this.yu : this.bly;
        return i11 > 0 && i11 != i10;
    }

    public bly(vpp vppVar, WebView webView, boolean z10) {
        this.ouw = vppVar;
        this.tlj = webView;
        this.f13469lh = z10;
    }
}
