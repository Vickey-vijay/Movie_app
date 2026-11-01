package com.bytedance.sdk.openadsdk.core.widget.ouw;

import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.openadsdk.core.bs;
import com.bytedance.sdk.openadsdk.core.jg;
import com.bytedance.sdk.openadsdk.utils.th;
import com.bytedance.sdk.openadsdk.yu.mwh;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class yu extends WebChromeClient {
    private static final String ouw = WebChromeClient.class.getSimpleName();

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private mwh f13134lh;
    private final bs vt;
    private com.bytedance.sdk.openadsdk.common.fkw yu;

    public yu(bs bsVar) {
        this.vt = bsVar;
    }

    @Override // android.webkit.WebChromeClient
    public void onConsoleMessage(String str, int i10, String str2) {
        if (!TextUtils.isEmpty(str)) {
            ouw(str);
        }
        super.onConsoleMessage(str, i10, str2);
    }

    private boolean ouw(@NonNull final String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            if (str.regionMatches(true, 0, "bytedance:", 0, 10)) {
                jg.lh().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.widget.ouw.yu.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        th.ouw(Uri.parse(str), yu.this.vt);
                    }
                });
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public yu(bs bsVar, mwh mwhVar, com.bytedance.sdk.openadsdk.common.fkw fkwVar) {
        this(bsVar, mwhVar);
        this.yu = fkwVar;
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i10) {
        super.onProgressChanged(webView, i10);
        mwh mwhVar = this.f13134lh;
        if (mwhVar != null && webView != null) {
            ko.vt("LandingPageLog", "onWebProgress: ".concat(String.valueOf(i10)));
            if (mwhVar.f13538pd == 0) {
                mwhVar.f13538pd = SystemClock.elapsedRealtime();
            }
            if (mwhVar.jqy == 0 && i10 > 0) {
                mwhVar.jqy = System.currentTimeMillis();
            } else if (mwhVar.ex == 0 && i10 == 100) {
                mwhVar.ex = System.currentTimeMillis();
            }
            if (mwhVar.vt != mwh.ouw.length && ("landingpage".equals(mwhVar.qbp) || "landingpage_endcard".equals(mwhVar.qbp) || "landingpage_split_screen".equals(mwhVar.qbp) || "landingpage_direct".equals(mwhVar.qbp) || "aggregate_page".equals(mwhVar.qbp))) {
                int i11 = mwhVar.vt;
                while (true) {
                    int[] iArr = mwh.ouw;
                    if (i11 >= iArr.length || i10 < iArr[mwhVar.vt]) {
                        break;
                    }
                    int i12 = i11 + 1;
                    mwhVar.vt = i12;
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("url", webView.getUrl());
                        long j10 = mwhVar.f13536lh;
                        if (j10 != -1) {
                            jSONObject.put("page_id", j10);
                        }
                        jSONObject.putOpt("render_type", "h5");
                        jSONObject.putOpt("render_type_2", 0);
                        jSONObject.put("pct", iArr[i11]);
                    } catch (Exception unused) {
                    }
                    mwhVar.ouw("progress_load_finish", jSONObject);
                    i11 = i12;
                }
            }
            if (i10 == 100) {
                mwhVar.ouw(false, SystemClock.elapsedRealtime());
                mwhVar.ouw(webView.getUrl(), "progress", Math.min(mwhVar.ex - mwhVar.jqy, 600000L));
            }
        }
        com.bytedance.sdk.openadsdk.common.fkw fkwVar = this.yu;
        if (fkwVar != null) {
            com.bytedance.sdk.openadsdk.common.yu yuVar = fkwVar.vt;
            if (yuVar != null) {
                yuVar.ouw(i10);
            }
            if (fkwVar.bly) {
                if (fkwVar.ouw(i10, 30)) {
                    fkwVar.ouw(30, webView);
                }
                if (fkwVar.ouw(i10, 50)) {
                    fkwVar.ouw(50, webView);
                }
                if (fkwVar.ouw(i10, 70)) {
                    fkwVar.ouw(70, webView);
                }
            }
            if (fkwVar.vt != null && i10 == 100) {
                ko.vt("arbitrage_style", "trigger onProgressChanged");
                fkwVar.ouw(1);
            }
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        super.onShowCustomView(view, customViewCallback);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        if (consoleMessage == null || TextUtils.isEmpty(consoleMessage.message()) || !ouw(consoleMessage.message())) {
            return super.onConsoleMessage(consoleMessage);
        }
        return true;
    }

    public yu(bs bsVar, mwh mwhVar) {
        this.vt = bsVar;
        this.f13134lh = mwhVar;
    }
}
