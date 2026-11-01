package com.safedk.android.analytics.brandsafety;

/* JADX INFO: loaded from: classes7.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f44459a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f44460b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    long f44461c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f44462d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f44463e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    BrandSafetyUtils.ScreenShotOrientation f44464f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f44465g = false;

    public j(String str, String str2, long j10, int i10, int i11, BrandSafetyUtils.ScreenShotOrientation screenShotOrientation, boolean z10) {
        a(str, str2, j10, i10, i11, screenShotOrientation, z10);
    }

    public j(String str, String str2, BrandSafetyUtils.ScreenShotOrientation screenShotOrientation) {
        a(str, str2, 0L, 0, 0, screenShotOrientation, false);
    }

    private void a(String str, String str2, long j10, int i10, int i11, BrandSafetyUtils.ScreenShotOrientation screenShotOrientation, boolean z10) {
        this.f44459a = str;
        this.f44460b = str2;
        this.f44461c = j10;
        this.f44462d = i10;
        this.f44463e = i11;
        this.f44464f = screenShotOrientation;
        this.f44465g = z10;
    }

    public float a(int i10) {
        return (this.f44462d * 100) / i10;
    }

    public String toString() {
        return "fileName=" + this.f44460b + ", hashValue=" + this.f44459a;
    }
}
