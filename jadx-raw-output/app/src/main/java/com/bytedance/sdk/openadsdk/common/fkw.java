package com.bytedance.sdk.openadsdk.common;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.jae;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class fkw implements jae.ouw {
    public boolean bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public int f12197cf;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    private WebView f12198jg;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    private final com.bytedance.sdk.component.bly.le f12199ko;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public int f12200le;
    public final vpp ouw;
    public long pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public boolean f12202ra;
    public String ryl;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    private int f12205vm;
    public yu vt;
    public long yu;
    private float zih;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public String f12201lh = "landingpage";

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    private final Handler f12203rn = new jae(com.bytedance.sdk.openadsdk.core.jg.vt().getLooper(), this);
    public final AtomicBoolean fkw = new AtomicBoolean(false);

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    private Pattern f12204th = null;
    private long qbp = -1;
    private final boolean mwh = false;
    public final List<Integer> tlj = new ArrayList();

    public final void ouw(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f12201lh = str;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void vt() {
        this.f12202ra = false;
        if (this.fkw.getAndSet(true)) {
            return;
        }
        this.yu = SystemClock.elapsedRealtime();
        this.pno = System.currentTimeMillis();
        ra();
        if (this.vt == null) {
            return;
        }
        WebView webView = this.f12198jg;
        if (webView != null) {
            String url = webView.getUrl();
            this.ryl = url;
            com.bytedance.sdk.component.utils.ko.ouw("ArbitrageLoadingStyle", "showLoadingUrl is:", url);
        }
        this.vt.setVisibility(0);
        this.vt.ouw(this.ouw);
        this.vt.ouw();
        this.vt.setAlpha(this.zih);
        this.vt.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.common.fkw.3
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/common/fkw$3;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                CreativeInfoManager.onViewTouched(g.f44975u, view, motionEvent);
                return safedk_fkw$3_onTouch_6d7f0dbbc11b30a8622714d75ec05c65(view, motionEvent);
            }

            public boolean safedk_fkw$3_onTouch_6d7f0dbbc11b30a8622714d75ec05c65(View p10, MotionEvent p11) {
                return true;
            }
        });
        le();
        fkw();
    }

    private void fkw() {
        Handler handler = this.f12203rn;
        if (handler != null) {
            handler.sendEmptyMessageDelayed(1, this.f12205vm);
        }
    }

    private void le() {
        Handler handler = this.f12203rn;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    private void ra() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("loading_show_interval", SystemClock.elapsedRealtime() - this.qbp);
            jSONObject.put("loading_show_timestamp", this.pno);
            WebView webView = this.f12198jg;
            jSONObject.put("arbi_current_url", webView != null ? webView.getUrl() : "");
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.yu.lh.ouw(this.ouw, this.f12201lh, jSONObject);
    }

    public final int yu() {
        try {
            return this.f12198jg.copyBackForwardList().getCurrentIndex() + 1;
        } catch (Throwable unused) {
            return 0;
        }
    }

    public fkw(vpp vppVar, com.bytedance.sdk.component.bly.le leVar) {
        this.ouw = vppVar;
        this.f12199ko = leVar;
        if (leVar != null) {
            this.f12198jg = leVar.getWebView();
            View arbitrageLoadingView = leVar.getArbitrageLoadingView();
            if (arbitrageLoadingView instanceof yu) {
                this.vt = (yu) arbitrageLoadingView;
            }
        }
        this.f12205vm = com.bytedance.sdk.openadsdk.core.settings.cf.vt().pno.ouw(com.bytedance.sdk.openadsdk.core.settings.cf.vt, 10000);
        this.zih = com.bytedance.sdk.openadsdk.core.settings.cf.vt().pno.ouw(com.bytedance.sdk.openadsdk.core.settings.cf.f13052lh);
    }

    public final boolean lh() {
        if (yu() > 0 && !this.fkw.get()) {
            return true;
        }
        return false;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void ouw() {
        if (bs.le()) {
            vt();
        } else {
            com.bytedance.sdk.component.utils.bly.vt().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.fkw.2
                @Override // java.lang.Runnable
                public final void run() {
                    fkw.this.vt();
                }
            });
        }
    }

    public final void ouw(final int i10) {
        WebView webView = this.f12198jg;
        if (webView != null && i10 == 1) {
            String url = webView.getUrl();
            com.bytedance.sdk.component.utils.ko.ouw("ArbitrageLoadingStyle", "destroyLoadingUrl is:", url);
            if (TextUtils.isEmpty(url) || url.equals(this.ryl)) {
                return;
            }
        }
        com.bytedance.sdk.component.utils.bly.vt().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.fkw.4
            @Override // java.lang.Runnable
            public final void run() {
                fkw fkwVar = fkw.this;
                if (fkwVar.vt != null) {
                    fkwVar.fkw.set(false);
                    fkw fkwVar2 = fkw.this;
                    fkwVar2.vt.ouw(fkwVar2.ouw, fkwVar2.f12201lh, i10, fkwVar2.ryl, fkwVar2.yu, fkwVar2.f12202ra, fkwVar2.f12200le, fkwVar2.pno);
                    fkw.this.f12200le = 0;
                }
            }
        });
        le();
    }

    @Override // com.bytedance.sdk.component.utils.jae.ouw
    public final void ouw(Message message) {
        if (message.what == 1) {
            ouw(0);
        }
    }

    public final void ouw(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            this.qbp = SystemClock.elapsedRealtime();
        }
    }

    public final boolean ouw(int i10, int i11) {
        if (i10 < i11 || this.tlj.contains(Integer.valueOf(i11)) || this.f12197cf < 2) {
            return false;
        }
        this.tlj.add(Integer.valueOf(i11));
        return true;
    }

    public final void ouw(int i10, WebView webView) {
        com.bytedance.sdk.component.utils.ko.ouw("arbitrage_loading_test", Integer.valueOf(i10));
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("load_progress", i10);
            jSONObject.put("progress_timestamp", System.currentTimeMillis());
            jSONObject.put("arbi_current_url", webView.getUrl());
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.yu.lh.vt(this.ouw, this.f12201lh, jSONObject);
    }
}
