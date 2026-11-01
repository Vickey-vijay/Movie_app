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

/* JADX INFO: loaded from: classes9.dex */
@Deprecated
public class MBBidInterstitialVideoHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f35554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f35555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f35556c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f35557d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f35558e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f35559f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f35560g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private InterstitialVideoListener f35561h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f35562i = 2;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f35563j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f35564k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f35565l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f35566m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f35567n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f35568o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f35569p;

    public MBBidInterstitialVideoHandler(Context context, String str, String str2) {
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
        this.f35555b = str2;
        this.f35556c = str;
        a();
    }

    private void b(String str, String str2) {
        try {
            if (this.f35554a == null) {
                a aVar = new a();
                this.f35554a = aVar;
                aVar.d(true);
                this.f35554a.e(true);
                this.f35554a.c(str, str2);
            }
        } catch (Throwable th2) {
            q0.b("MBBidRewardVideoHandler", th2.getMessage(), th2);
        }
    }

    public void setIVRewardEnable(int i10, int i11) {
        this.f35567n = i10;
        this.f35568o = i11;
        this.f35569p = com.mbridge.msdk.foundation.same.a.K;
        this.f35566m = true;
        b();
    }

    public void clearVideoCache() {
        try {
            a aVar = this.f35554a;
            if (aVar != null) {
                aVar.e();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public String getCreativeIdWithUnitId() {
        a aVar = this.f35554a;
        return aVar != null ? aVar.j() : "";
    }

    public String getRequestId() {
        a aVar = this.f35554a;
        return aVar != null ? aVar.m() : "";
    }

    public void playVideoMute(int i10) {
        this.f35562i = i10;
        a aVar = this.f35554a;
        if (aVar != null) {
            aVar.a(i10);
        }
    }

    public void setAlertDialogText(String str, String str2, String str3, String str4) {
        this.f35557d = str;
        this.f35558e = str2;
        this.f35559f = str3;
        this.f35560g = str4;
        this.f35564k = true;
        this.f35565l = true;
        MBridgeGlobalCommon.setAlertDialogText(this.f35555b, str, str2, str3, str4);
    }

    public void setInterstitialVideoListener(InterstitialVideoListener interstitialVideoListener) {
        this.f35561h = interstitialVideoListener;
        this.f35563j = true;
        a aVar = this.f35554a;
        if (aVar == null || aVar.u()) {
            return;
        }
        this.f35554a.a(new com.mbridge.msdk.interstitialvideo.listener.a(interstitialVideoListener, this.f35555b, true));
        this.f35563j = false;
    }

    @Deprecated
    public void setRewardVideoListener(InterstitialVideoListener interstitialVideoListener) {
        this.f35561h = interstitialVideoListener;
        this.f35563j = true;
        a aVar = this.f35554a;
        if (aVar == null || aVar.u()) {
            return;
        }
        this.f35554a.a(new com.mbridge.msdk.interstitialvideo.listener.a(interstitialVideoListener, this.f35555b, true));
        this.f35563j = false;
    }

    public boolean isBidReady() {
        a();
        a aVar = this.f35554a;
        if (aVar != null) {
            return aVar.c(true);
        }
        return false;
    }

    public void loadFormSelfFilling() {
        a();
        if (this.f35554a != null) {
            this.f35554a.a(false, d.b().a(1, MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.f35555b, true, 1));
        }
    }

    public void loadFromBid(String str) {
        a();
        if (this.f35554a != null) {
            this.f35554a.a(true, str, d.b().a(1, MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.f35555b, true, 2));
        }
    }

    public void showFromBid() {
        a();
        if (this.f35554a != null) {
            this.f35554a.a((String) null, (String) null, (String) null, d.b().a(1, MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.f35555b, false, -1));
        }
    }

    public void setIVRewardEnable(int i10, double d10) {
        this.f35567n = i10;
        this.f35568o = (int) (d10 * 100.0d);
        this.f35569p = com.mbridge.msdk.foundation.same.a.J;
        this.f35566m = true;
        b();
    }

    private void a() {
        a aVar;
        if (this.f35554a == null) {
            b(this.f35556c, this.f35555b);
        }
        if (this.f35563j) {
            a aVar2 = this.f35554a;
            if (aVar2 != null) {
                aVar2.a(new com.mbridge.msdk.interstitialvideo.listener.a(this.f35561h, this.f35555b, true));
            }
            this.f35563j = false;
        }
        if (this.f35564k) {
            a aVar3 = this.f35554a;
            if (aVar3 != null) {
                aVar3.a(this.f35557d, this.f35558e, this.f35559f, this.f35560g);
            }
            this.f35564k = false;
        }
        if (!this.f35566m || (aVar = this.f35554a) == null) {
            return;
        }
        aVar.a(this.f35567n, this.f35569p, this.f35568o);
        this.f35566m = false;
    }

    private void b() {
        a aVar = this.f35554a;
        if (aVar != null) {
            aVar.a(this.f35567n, this.f35569p, this.f35568o);
        }
    }

    public MBBidInterstitialVideoHandler(String str, String str2) {
        a(str, str2);
    }
}
