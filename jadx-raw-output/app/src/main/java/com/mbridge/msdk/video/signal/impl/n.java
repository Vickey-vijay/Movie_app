package com.mbridge.msdk.video.signal.impl;

import android.util.Base64;
import android.webkit.WebView;
import com.ironsource.C3426d4;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import org.json.JSONObject;

/* JADX INFO: compiled from: JSNotifyProxy.java */
/* JADX INFO: loaded from: classes10.dex */
public class n extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WebView f39458a;

    @Override // com.mbridge.msdk.video.signal.impl.f, com.mbridge.msdk.video.signal.g
    public void a(int i10) {
        super.a(i10);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", i10);
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(this.f39458a, "onVideoStatusNotify", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public n(WebView webView) {
        this.f39458a = webView;
    }

    @Override // com.mbridge.msdk.video.signal.impl.f, com.mbridge.msdk.video.signal.g
    public void a(int i10, String str) {
        super.a(i10, str);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", i10);
            jSONObject.put("pt", str);
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(this.f39458a, "onJSClick", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.video.signal.impl.f, com.mbridge.msdk.video.signal.g
    public void a(MBridgeVideoView.v vVar) {
        super.a(vVar);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("progress", a(vVar.f39034a, vVar.f39035b));
            jSONObject.put("time", String.valueOf(vVar.f39034a));
            jSONObject.put("duration", String.valueOf(vVar.f39035b));
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(this.f39458a, "onVideoProgressNotify", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private String a(int i10, int i11) {
        if (i11 != 0) {
            try {
                return v0.a(Double.valueOf(i10 / i11)) + "";
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
        return i11 + "";
    }

    @Override // com.mbridge.msdk.video.signal.impl.f, com.mbridge.msdk.video.signal.g
    public void a(Object obj) {
        super.a(obj);
        com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(this.f39458a, "webviewshow", (obj == null || !(obj instanceof String)) ? "" : Base64.encodeToString(obj.toString().getBytes(), 2));
    }

    @Override // com.mbridge.msdk.video.signal.impl.f, com.mbridge.msdk.video.signal.g
    public void a(int i10, int i11, int i12, int i13) {
        super.a(i10, i11, i12, i13);
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            String str = C3426d4.i.C;
            if (i10 != 2 ? i11 != 2 : i11 == 1) {
                str = C3426d4.i.D;
            }
            jSONObject2.put("orientation", str);
            jSONObject2.put(CommonUrlParts.SCREEN_WIDTH, i12);
            jSONObject2.put(CommonUrlParts.SCREEN_HEIGHT, i13);
            jSONObject.put("data", jSONObject2);
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(this.f39458a, "showDataInfo", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }
}
