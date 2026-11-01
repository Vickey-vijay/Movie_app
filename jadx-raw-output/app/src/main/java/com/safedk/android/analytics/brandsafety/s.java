package com.safedk.android.analytics.brandsafety;

import android.app.Activity;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: loaded from: classes7.dex */
public class s extends c {
    boolean V;
    boolean W;
    boolean X;
    ScheduledFuture<?> Y;
    ScheduledFuture<?> Z;

    /* JADX INFO: renamed from: aa, reason: collision with root package name */
    WeakReference<Activity> f44556aa;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    boolean f44557ab;

    /* JADX INFO: renamed from: ac, reason: collision with root package name */
    long f44558ac;

    /* JADX INFO: renamed from: ad, reason: collision with root package name */
    long f44559ad;

    /* JADX INFO: renamed from: ae, reason: collision with root package name */
    float f44560ae;

    /* JADX INFO: renamed from: af, reason: collision with root package name */
    String f44561af;

    /* JADX INFO: renamed from: ag, reason: collision with root package name */
    boolean f44562ag;

    public s(String[] strArr, String str, int i10, String str2, Bundle bundle, String str3) {
        this(strArr, str, i10, str2, bundle, str3, BrandSafetyUtils.AdType.NATIVE);
    }

    public s(String str, long j10) {
        super(str, j10, BrandSafetyUtils.AdType.NATIVE);
        this.V = false;
        this.W = false;
        this.X = false;
        this.f44557ab = false;
        this.f44558ac = 0L;
        this.f44559ad = 0L;
        this.f44560ae = 0.0f;
        this.f44561af = null;
        this.f44562ag = false;
    }

    public s(String str, String str2, String str3, BrandSafetyUtils.ScreenShotOrientation screenShotOrientation, String str4, String str5) {
        this(str, str2, str3, screenShotOrientation, str4, str5, BrandSafetyUtils.AdType.NATIVE);
    }

    protected s(String str, String str2, String str3, BrandSafetyUtils.ScreenShotOrientation screenShotOrientation, String str4, String str5, BrandSafetyUtils.AdType adType) {
        super(str, str2, str3, screenShotOrientation, str4, adType);
        this.V = false;
        this.W = false;
        this.X = false;
        this.f44557ab = false;
        this.f44558ac = 0L;
        this.f44559ad = 0L;
        this.f44560ae = 0.0f;
        this.f44561af = null;
        this.f44562ag = false;
        this.f43778q = str5;
    }

    private s(String[] strArr, String str, int i10, String str2, Bundle bundle, String str3, BrandSafetyUtils.AdType adType) {
        super(strArr, i10, bundle, null, str, null, BrandSafetyUtils.ScreenShotOrientation.NOT_INITIALIZED, adType);
        this.V = false;
        this.W = false;
        this.X = false;
        this.f44557ab = false;
        this.f44558ac = 0L;
        this.f44559ad = 0L;
        this.f44560ae = 0.0f;
        this.f44561af = null;
        this.f44562ag = false;
        this.f44561af = str2;
        if (str3 != null) {
            this.L = str3;
        }
    }
}
