package com.mbridge.msdk.interstitialvideo.out;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.same.report.metrics.d;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.newreward.function.common.MBridgeGlobalCommon;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.reward.controller.a;
import com.mbridge.msdk.setting.h;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class MBInterstitialVideoHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f35570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f35571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f35572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f35573d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f35574e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f35575f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f35576g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private InterstitialVideoListener f35577h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f35578i = 2;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f35579j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f35580k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f35581l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f35582m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f35583n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f35584o;

    public MBInterstitialVideoHandler(Context context, String str, String str2) {
        if (c.n().d() == null && context != null) {
            c.n().b(context);
        }
        a(str, str2);
    }

    private void a(String str, String str2) {
        String strE = v0.e(str2);
        if (!TextUtils.isEmpty(strE)) {
            v0.c(str2, strE);
        }
        this.f35572c = str2;
        this.f35570a = str;
        a();
    }

    private void b(String str, String str2) {
        try {
            if (this.f35571b == null) {
                a aVar = new a();
                this.f35571b = aVar;
                aVar.d(true);
                this.f35571b.c(str, str2);
                h.b().g(str2);
            }
        } catch (Throwable th2) {
            q0.b("MBRewardVideoHandler", th2.getMessage(), th2);
        }
    }

    public void setIVRewardEnable(int i10, int i11) {
        this.f35582m = i10;
        this.f35583n = i11;
        this.f35584o = com.mbridge.msdk.foundation.same.a.K;
        this.f35581l = true;
        b();
    }

    public void clearVideoCache() {
        try {
            a aVar = this.f35571b;
            if (aVar != null) {
                aVar.e();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public String getCreativeIdWithUnitId() {
        a aVar = this.f35571b;
        return aVar != null ? aVar.j() : "";
    }

    public String getRequestId() {
        a aVar = this.f35571b;
        return aVar != null ? aVar.m() : "";
    }

    public void playVideoMute(int i10) {
        this.f35578i = i10;
        a aVar = this.f35571b;
        if (aVar != null) {
            aVar.a(i10);
        }
    }

    public void setAlertDialogText(String str, String str2, String str3, String str4) {
        this.f35573d = str;
        this.f35574e = str2;
        this.f35575f = str3;
        this.f35576g = str4;
        this.f35580k = true;
        MBridgeGlobalCommon.setAlertDialogText(this.f35572c, str, str2, str3, str4);
    }

    public void setInterstitialVideoListener(InterstitialVideoListener interstitialVideoListener) {
        this.f35577h = interstitialVideoListener;
        this.f35579j = true;
        a aVar = this.f35571b;
        if (aVar == null || aVar.u()) {
            return;
        }
        this.f35571b.a(new com.mbridge.msdk.interstitialvideo.listener.a(interstitialVideoListener));
        this.f35579j = false;
    }

    @Deprecated
    public void setRewardVideoListener(InterstitialVideoListener interstitialVideoListener) {
        this.f35577h = interstitialVideoListener;
        this.f35579j = true;
        a aVar = this.f35571b;
        if (aVar == null || aVar.u()) {
            return;
        }
        this.f35571b.a(new com.mbridge.msdk.interstitialvideo.listener.a(interstitialVideoListener));
        this.f35579j = false;
    }

    public boolean isReady() {
        a();
        a aVar = this.f35571b;
        if (aVar != null) {
            return aVar.c(true);
        }
        return false;
    }

    public void load() {
        a();
        if (this.f35571b != null) {
            this.f35571b.a(true, d.b().a(0, MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.f35572c, true, 2));
        }
    }

    public void loadFormSelfFilling() {
        a();
        if (this.f35571b != null) {
            this.f35571b.a(false, d.b().a(0, MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.f35572c, true, 1));
        }
    }

    public void show() {
        a();
        if (this.f35571b != null) {
            this.f35571b.a((String) null, (String) null, (String) null, d.b().a(0, MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.f35572c, false, -1));
        }
    }

    public void setIVRewardEnable(int i10, double d10) {
        this.f35582m = i10;
        this.f35583n = (int) (d10 * 100.0d);
        this.f35584o = com.mbridge.msdk.foundation.same.a.J;
        this.f35581l = true;
        b();
    }

    private void a() {
        a aVar;
        if (this.f35571b == null) {
            b(this.f35570a, this.f35572c);
        }
        if (this.f35579j) {
            this.f35571b.a(new com.mbridge.msdk.interstitialvideo.listener.a(this.f35577h, this.f35572c, false));
            this.f35579j = false;
        }
        if (this.f35580k) {
            this.f35571b.a(this.f35573d, this.f35574e, this.f35575f, this.f35576g);
            this.f35580k = false;
        }
        if (!this.f35581l || (aVar = this.f35571b) == null) {
            return;
        }
        aVar.a(this.f35582m, this.f35584o, this.f35583n);
        this.f35581l = false;
    }

    private void b() {
        a aVar = this.f35571b;
        if (aVar != null) {
            aVar.a(this.f35582m, this.f35584o, this.f35583n);
        }
    }

    public MBInterstitialVideoHandler(String str, String str2) {
        a(str, str2);
    }
}
