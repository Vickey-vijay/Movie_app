package com.safedk.android.analytics.brandsafety;

import android.app.Activity;
import android.os.Bundle;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import java.lang.ref.WeakReference;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: loaded from: classes7.dex */
public class e extends c {
    protected static final String aq = "network_name";
    protected static final String ar = "ad_format";
    protected static final String as = "BANNER";
    protected static final String at = "MREC";
    public static final String au = "NATIVE";
    public int V;
    public int W;
    public int X;
    public int Y;
    public int Z;

    /* JADX INFO: renamed from: aa, reason: collision with root package name */
    boolean f44397aa;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    public String f44398ab;

    /* JADX INFO: renamed from: ac, reason: collision with root package name */
    boolean f44399ac;

    /* JADX INFO: renamed from: ad, reason: collision with root package name */
    boolean f44400ad;

    /* JADX INFO: renamed from: ae, reason: collision with root package name */
    ScheduledFuture<?> f44401ae;

    /* JADX INFO: renamed from: af, reason: collision with root package name */
    WeakReference<Activity> f44402af;

    /* JADX INFO: renamed from: ag, reason: collision with root package name */
    boolean f44403ag;

    /* JADX INFO: renamed from: ah, reason: collision with root package name */
    boolean f44404ah;

    /* JADX INFO: renamed from: ai, reason: collision with root package name */
    long f44405ai;

    /* JADX INFO: renamed from: aj, reason: collision with root package name */
    long f44406aj;

    /* JADX INFO: renamed from: ak, reason: collision with root package name */
    float f44407ak;

    /* JADX INFO: renamed from: al, reason: collision with root package name */
    String f44408al;

    /* JADX INFO: renamed from: am, reason: collision with root package name */
    public BannerFinder.a f44409am;

    /* JADX INFO: renamed from: an, reason: collision with root package name */
    boolean f44410an;

    /* JADX INFO: renamed from: ao, reason: collision with root package name */
    String f44411ao;

    /* JADX INFO: renamed from: ap, reason: collision with root package name */
    String f44412ap;

    public e(String[] strArr, String str, int i10, String str2, Bundle bundle, String str3) {
        this(strArr, str, i10, str2, bundle, str3, BrandSafetyUtils.AdType.BANNER);
    }

    public e(String str, long j10) {
        this(str, j10, BrandSafetyUtils.AdType.BANNER);
    }

    protected e(String[] strArr, String str, int i10, String str2, Bundle bundle, String str3, BrandSafetyUtils.AdType adType) {
        super(strArr, i10, bundle, null, str, null, BrandSafetyUtils.ScreenShotOrientation.NOT_INITIALIZED, adType);
        this.V = 0;
        this.W = 0;
        this.X = 0;
        this.Y = 0;
        this.Z = 0;
        this.f44397aa = false;
        this.f44398ab = "";
        this.f44399ac = false;
        this.f44400ad = false;
        this.f44403ag = false;
        this.f44404ah = false;
        this.f44405ai = 0L;
        this.f44406aj = 0L;
        this.f44407ak = 0.0f;
        this.f44408al = null;
        this.f44409am = null;
        this.f44410an = false;
        this.f44411ao = null;
        this.f44412ap = null;
        this.f44408al = str2;
        if (str3 != null) {
            this.L = str3;
        }
    }

    public e(String str, String str2, String str3, BrandSafetyUtils.ScreenShotOrientation screenShotOrientation, String str4, String str5) {
        this(str, str2, str3, screenShotOrientation, str4, str5, BrandSafetyUtils.AdType.BANNER);
    }

    protected e(String str, String str2, String str3, BrandSafetyUtils.ScreenShotOrientation screenShotOrientation, String str4, String str5, BrandSafetyUtils.AdType adType) {
        super(str, str2, str3, screenShotOrientation, str4, adType);
        this.V = 0;
        this.W = 0;
        this.X = 0;
        this.Y = 0;
        this.Z = 0;
        this.f44397aa = false;
        this.f44398ab = "";
        this.f44399ac = false;
        this.f44400ad = false;
        this.f44403ag = false;
        this.f44404ah = false;
        this.f44405ai = 0L;
        this.f44406aj = 0L;
        this.f44407ak = 0.0f;
        this.f44408al = null;
        this.f44409am = null;
        this.f44410an = false;
        this.f44411ao = null;
        this.f44412ap = null;
        this.f43778q = str5;
    }

    protected e(String str, long j10, BrandSafetyUtils.AdType adType) {
        super(str, j10, adType);
        this.V = 0;
        this.W = 0;
        this.X = 0;
        this.Y = 0;
        this.Z = 0;
        this.f44397aa = false;
        this.f44398ab = "";
        this.f44399ac = false;
        this.f44400ad = false;
        this.f44403ag = false;
        this.f44404ah = false;
        this.f44405ai = 0L;
        this.f44406aj = 0L;
        this.f44407ak = 0.0f;
        this.f44408al = null;
        this.f44409am = null;
        this.f44410an = false;
        this.f44411ao = null;
        this.f44412ap = null;
    }

    @Override // com.safedk.android.analytics.brandsafety.c
    public String toString() {
        j jVarL = l();
        return super.toString() + " webView: " + this.K + " hash: " + (jVarL != null ? jVarL.f44459a : null) + " url: " + e() + " isClicked: " + d() + " touch timestamp: " + v() + " activity address: " + this.B + " activity class name: " + this.C + " filename: " + (jVarL != null ? jVarL.f44460b : null) + " type: " + this.f43777p + ", eventId: " + this.L + ", requestNoSamplingReceived: " + this.O + ", onVideoCompletedEventHasBeenTriggered: " + this.H;
    }

    public boolean E() {
        if (this.A == null || !this.A.containsKey("network_name")) {
            return false;
        }
        return this.A.getString("network_name").contains("NATIVE");
    }

    @Override // com.safedk.android.analytics.brandsafety.c
    public void e(boolean z10) {
        super.e(z10);
        this.V = 0;
        this.W = 0;
        this.X = 0;
        this.Y = 0;
        this.Z = 0;
        this.f44397aa = false;
        this.f44398ab = "";
        this.f44399ac = false;
        this.f44400ad = false;
        this.f44404ah = false;
        if (z10) {
            this.f44407ak = 0.0f;
        }
        this.f44408al = null;
        this.T = false;
        if (this.f44409am != null && this.f44409am.f43522d != null) {
            this.f44409am.f43522d.cancel(false);
        }
        this.f44409am = null;
        this.f44402af = null;
        this.f44410an = false;
        this.f44411ao = null;
        this.f44412ap = null;
    }

    @Override // com.safedk.android.analytics.brandsafety.c
    public void C() {
        super.C();
        this.f43783v = null;
        this.f44402af = null;
        this.f44408al = null;
        this.f44397aa = false;
        this.f44403ag = false;
    }

    @Override // com.safedk.android.analytics.brandsafety.c
    public void a(d dVar, Bundle bundle, int i10) {
        super.a(dVar, bundle, i10);
        Activity foregroundActivity = com.safedk.android.internal.b.getInstance().getForegroundActivity();
        String[] strArrA = b.a(foregroundActivity);
        if (foregroundActivity != null) {
            this.C = strArrA[0];
            this.B = strArrA[1];
        }
        this.f43783v = CreativeInfoManager.b(bundle.getString("network_name"));
        this.f44402af = new WeakReference<>(BannerFinder.a(bundle));
        this.f44408al = BrandSafetyUtils.c().name().toLowerCase();
        this.f44397aa = true;
        this.f44403ag = true;
    }

    public boolean F() {
        if (this.A == null || !this.A.containsKey("ad_format")) {
            return false;
        }
        return this.A.getString("ad_format").equals("MREC");
    }
}
