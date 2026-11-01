package com.mbridge.msdk.newinterstitial.out;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.same.report.metrics.d;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.newreward.function.common.MBridgeGlobalCommon;
import com.mbridge.msdk.out.BaseExtraInterfaceForHandler;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.reward.controller.a;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
@Deprecated
public class MBBidInterstitialVideoHandler implements BaseExtraInterfaceForHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f36295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f36296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f36297c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f36298d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f36299e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a f36300f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private NewInterstitialListener f36301g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f36302h = 2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f36303i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f36304j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f36305k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f36306l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f36307m;
    public String mUnitId;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f36308n;

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
        this.mUnitId = str2;
        this.f36295a = str;
        a();
    }

    private void b(String str, String str2) {
        try {
            if (this.f36300f == null) {
                a aVar = new a();
                this.f36300f = aVar;
                aVar.d(true);
                this.f36300f.e(true);
                this.f36300f.c(str, str2);
            }
        } catch (Throwable th2) {
            q0.b("MBBidInterstitialVideoHandler", th2.getMessage(), th2);
        }
    }

    public void setIVRewardEnable(int i10, int i11) {
        this.f36306l = i10;
        this.f36307m = i11;
        this.f36308n = com.mbridge.msdk.foundation.same.a.K;
        this.f36305k = true;
        c();
    }

    private void c() {
        a aVar = this.f36300f;
        if (aVar != null) {
            aVar.a(this.f36306l, this.f36308n, this.f36307m);
        }
    }

    public void clearVideoCache() {
        try {
            a aVar = this.f36300f;
            if (aVar != null) {
                aVar.e();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public String getCreativeIdWithUnitId() {
        a aVar = this.f36300f;
        return aVar != null ? aVar.j() : "";
    }

    public String getRequestId() {
        a aVar = this.f36300f;
        return aVar != null ? aVar.m() : "";
    }

    public void playVideoMute(int i10) {
        this.f36302h = i10;
        a aVar = this.f36300f;
        if (aVar != null) {
            aVar.a(i10);
        }
    }

    public void setAlertDialogText(String str, String str2, String str3, String str4) {
        this.f36297c = str;
        this.f36296b = str2;
        this.f36298d = str3;
        this.f36299e = str4;
        this.f36304j = true;
        MBridgeGlobalCommon.setAlertDialogText(this.mUnitId, str, str2, str3, str4);
    }

    public void setInterstitialVideoListener(NewInterstitialListener newInterstitialListener) {
        this.f36301g = newInterstitialListener;
        this.f36303i = true;
        a aVar = this.f36300f;
        if (aVar == null || aVar.u()) {
            return;
        }
        this.f36300f.a(new com.mbridge.msdk.newinterstitial.listener.a(newInterstitialListener));
        this.f36303i = false;
    }

    @Deprecated
    public void setRewardVideoListener(NewInterstitialListener newInterstitialListener) {
        this.f36301g = newInterstitialListener;
        this.f36303i = true;
        a aVar = this.f36300f;
        if (aVar == null || aVar.u()) {
            return;
        }
        this.f36300f.a(new com.mbridge.msdk.newinterstitial.listener.a(newInterstitialListener));
        this.f36303i = false;
    }

    public boolean isBidReady() {
        a();
        a aVar = this.f36300f;
        if (aVar != null) {
            return aVar.c(true);
        }
        return false;
    }

    public void loadFormSelfFilling() {
        a();
        if (this.f36300f != null) {
            this.f36300f.a(false, d.b().a(1, MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.mUnitId, true, 1));
        }
    }

    public void loadFromBid(String str) {
        a();
        if (this.f36300f != null) {
            this.f36300f.a(true, str, d.b().a(1, MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.mUnitId, true, 2));
        }
    }

    @Override // com.mbridge.msdk.out.BaseExtraInterfaceForHandler
    public void setExtraInfo(JSONObject jSONObject) {
        c.n().a(this.mUnitId, jSONObject);
    }

    public void showFromBid() {
        a();
        if (this.f36300f != null) {
            this.f36300f.a((String) null, (String) null, (String) null, d.b().a(1, MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.mUnitId, false, -1));
        }
    }

    public void setIVRewardEnable(int i10, double d10) {
        this.f36306l = i10;
        this.f36307m = (int) (d10 * 100.0d);
        this.f36308n = com.mbridge.msdk.foundation.same.a.J;
        this.f36305k = true;
        c();
    }

    private void a() {
        if (this.f36300f == null) {
            b(this.f36295a, this.mUnitId);
        }
        b();
    }

    private void b() {
        a aVar;
        if (this.f36303i) {
            a aVar2 = this.f36300f;
            if (aVar2 != null) {
                aVar2.a(new com.mbridge.msdk.newinterstitial.listener.a(this.f36301g));
            }
            this.f36303i = false;
        }
        if (this.f36304j) {
            a aVar3 = this.f36300f;
            if (aVar3 != null) {
                aVar3.a(this.f36297c, this.f36296b, this.f36298d, this.f36299e);
            }
            this.f36304j = false;
        }
        if (!this.f36305k || (aVar = this.f36300f) == null) {
            return;
        }
        aVar.a(this.f36306l, this.f36308n, this.f36307m);
        this.f36305k = false;
    }

    public MBBidInterstitialVideoHandler(String str, String str2) {
        a(str, str2);
    }
}
