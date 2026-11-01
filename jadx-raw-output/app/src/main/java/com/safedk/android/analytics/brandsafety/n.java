package com.safedk.android.analytics.brandsafety;

import android.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: loaded from: classes7.dex */
public class n extends c {
    public boolean V;
    Set<String> W;
    boolean X;
    boolean Y;
    long Z;

    /* JADX INFO: renamed from: aa, reason: collision with root package name */
    boolean f44529aa;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    public String f44530ab;

    /* JADX INFO: renamed from: ac, reason: collision with root package name */
    public String f44531ac;

    /* JADX INFO: renamed from: ad, reason: collision with root package name */
    public long f44532ad;

    /* JADX INFO: renamed from: ae, reason: collision with root package name */
    public boolean f44533ae;

    /* JADX INFO: renamed from: af, reason: collision with root package name */
    public long f44534af;

    /* JADX INFO: renamed from: ag, reason: collision with root package name */
    public BrandSafetyUtils.ScreenShotOrientation f44535ag;

    /* JADX INFO: renamed from: ah, reason: collision with root package name */
    public boolean f44536ah;

    /* JADX INFO: renamed from: ai, reason: collision with root package name */
    public h f44537ai;

    /* JADX INFO: renamed from: aj, reason: collision with root package name */
    public boolean f44538aj;

    /* JADX INFO: renamed from: ak, reason: collision with root package name */
    public ScheduledFuture<?> f44539ak;

    /* JADX INFO: renamed from: al, reason: collision with root package name */
    public boolean f44540al;

    /* JADX INFO: renamed from: am, reason: collision with root package name */
    public Activity f44541am;

    /* JADX INFO: renamed from: an, reason: collision with root package name */
    boolean f44542an;

    /* JADX INFO: renamed from: ao, reason: collision with root package name */
    String f44543ao;

    /* JADX INFO: renamed from: ap, reason: collision with root package name */
    private int f44544ap;

    public boolean E() {
        return this.f44542an;
    }

    public void f(boolean z10) {
        this.f44542an = z10;
    }

    int F() {
        return this.f44544ap;
    }

    void G() {
        this.f44544ap++;
    }

    void H() {
        this.f44544ap = 0;
    }

    public n(String str, int i10, Bundle bundle) {
        super(i10, bundle, null, str, null, BrandSafetyUtils.ScreenShotOrientation.NOT_INITIALIZED, BrandSafetyUtils.AdType.INTERSTITIAL);
        this.V = false;
        this.X = true;
        this.Y = true;
        this.f44529aa = false;
        this.f44530ab = null;
        this.f44531ac = null;
        this.f44532ad = 0L;
        this.f44533ae = false;
        this.f44534af = 0L;
        this.f44535ag = BrandSafetyUtils.ScreenShotOrientation.NOT_INITIALIZED;
        this.f44536ah = false;
        this.f44537ai = null;
        this.f44538aj = false;
        this.f44539ak = null;
        this.f44540al = false;
        this.f44542an = false;
        this.f44544ap = 0;
        this.f44543ao = null;
        this.W = new HashSet();
        if (str != null) {
            this.f44538aj = CreativeInfoManager.a(str, AdNetworkConfiguration.SDK_INTERSTITIALS_RUN_ON_APP_ACTIVITY, false);
        }
    }

    public n(String str, String str2, String str3, BrandSafetyUtils.ScreenShotOrientation screenShotOrientation, String str4, String str5) {
        super(str, str2, str3, screenShotOrientation, str4, BrandSafetyUtils.AdType.INTERSTITIAL);
        this.V = false;
        this.X = true;
        this.Y = true;
        this.f44529aa = false;
        this.f44530ab = null;
        this.f44531ac = null;
        this.f44532ad = 0L;
        this.f44533ae = false;
        this.f44534af = 0L;
        this.f44535ag = BrandSafetyUtils.ScreenShotOrientation.NOT_INITIALIZED;
        this.f44536ah = false;
        this.f44537ai = null;
        this.f44538aj = false;
        this.f44539ak = null;
        this.f44540al = false;
        this.f44542an = false;
        this.f44544ap = 0;
        this.f44543ao = null;
        this.f43778q = str5;
    }

    public synchronized void I() {
        this.X = true;
    }

    @Override // com.safedk.android.analytics.brandsafety.c
    public String toString() {
        j jVarL = l();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("maxSdk: ").append(this.f43783v != null ? this.f43783v : "").append(", hash: ").append((jVarL == null || jVarL.f44459a == null) ? "" : jVarL.f44459a).append(", orientation: ").append((jVarL == null || jVarL.f44464f == null) ? "" : jVarL.f44464f.name()).append(", activity address: ").append(this.B != null ? this.B : "").append(", view address: ").append(this.K != null ? this.K : "").append(", interstitial activity name: ").append(this.f44531ac != null ? this.f44531ac : "").append(", eventId: ").append(this.L != null ? this.L : "").append(", isAdFinished: ").append(this.U).append(", number of CIs: ").append(j().size());
        return sb2.toString();
    }

    public boolean J() {
        return (this.f44541am == null && (!this.f44538aj || i() == null || i().f() == null)) ? false : true;
    }

    public View K() {
        if (this.f44541am != null) {
            return this.f44541am.getWindow().getDecorView().findViewById(R.id.content);
        }
        if (this.f44538aj && i() != null) {
            return i().f();
        }
        return null;
    }

    public void a(String str, boolean z10) {
        if (str != null) {
            if (this.f44543ao == null) {
                this.f44543ao = str;
            } else if (!z10 || !this.f44543ao.contains(str)) {
                this.f44543ao += ImpressionLog.P + str;
            }
        }
    }

    public void L() {
        e(this.f44543ao);
    }
}
