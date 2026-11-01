package com.mbridge.msdk.video.signal.impl;

import android.content.res.Configuration;
import android.util.Base64;
import android.webkit.WebView;
import com.ironsource.C3426d4;
import org.json.JSONObject;

/* JADX INFO: compiled from: JSActivityProxy.java */
/* JADX INFO: loaded from: classes10.dex */
public class i extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WebView f39439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f39440b = 0;

    @Override // com.mbridge.msdk.video.signal.impl.b, com.mbridge.msdk.video.signal.b
    public void a(Configuration configuration) {
        super.a(configuration);
        try {
            JSONObject jSONObject = new JSONObject();
            if (configuration.orientation == 2) {
                jSONObject.put("orientation", C3426d4.i.C);
            } else {
                jSONObject.put("orientation", C3426d4.i.D);
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(this.f39439a, "orientation", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public i(WebView webView) {
        this.f39439a = webView;
    }

    @Override // com.mbridge.msdk.video.signal.impl.b, com.mbridge.msdk.video.signal.b
    public void b() {
        super.b();
        com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(this.f39439a, "onSystemDestory", "");
    }

    @Override // com.mbridge.msdk.video.signal.impl.b, com.mbridge.msdk.video.signal.b
    public void d() {
        super.d();
        this.f39440b = 0;
        com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(this.f39439a, "onSystemResume", "");
    }

    @Override // com.mbridge.msdk.video.signal.impl.b, com.mbridge.msdk.video.signal.b
    public void e() {
        super.e();
        com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(this.f39439a, "onSystemBackPressed", "");
    }

    @Override // com.mbridge.msdk.video.signal.impl.b, com.mbridge.msdk.video.signal.b
    public void g() {
        super.g();
        this.f39440b = 1;
        com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(this.f39439a, "onSystemPause", "");
    }

    @Override // com.mbridge.msdk.video.signal.impl.b, com.mbridge.msdk.video.signal.b
    public void a(int i10) {
        super.a(i10);
        this.f39440b = i10;
    }

    @Override // com.mbridge.msdk.video.signal.impl.b, com.mbridge.msdk.video.signal.b
    public int a() {
        return this.f39440b;
    }
}
