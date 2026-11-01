package com.ironsource.mediationsdk;

import android.content.Context;
import com.ironsource.Y7;
import com.unity3d.mediation.LevelPlayAdSize;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: loaded from: classes9.dex */
public class ISBannerSize {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f29520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f29521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f29522c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f29523d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Y7 f29524e;
    public static final ISBannerSize BANNER = l.a("BANNER", Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 50);
    public static final ISBannerSize LARGE = l.a(l.f29839b, Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 90);
    public static final ISBannerSize RECTANGLE = l.a(l.f29840c, com.safedk.android.internal.d.f44769a, 250);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ISBannerSize f29519f = l.a();
    public static final ISBannerSize SMART = l.a(l.f29842e, 0, 0);

    public ISBannerSize(int i10, int i11) {
        this("CUSTOM", i10, i11);
    }

    public ISBannerSize(String str, int i10, int i11) {
        this.f29522c = str;
        this.f29520a = i10;
        this.f29521b = i11;
        this.f29524e = new Y7(i10, i11);
    }

    public void a(Y7 y10) {
        if (l.a(y10, this.f29520a, this.f29521b)) {
            this.f29524e = y10;
        }
    }

    public String getDescription() {
        return this.f29522c;
    }

    public int getHeight() {
        return this.f29521b;
    }

    public int getWidth() {
        return this.f29520a;
    }

    public boolean isAdaptive() {
        return this.f29523d;
    }

    public boolean isSmart() {
        return this.f29522c.equals(l.f29842e);
    }

    public void setAdaptive(boolean z10) {
        this.f29523d = z10;
    }

    public static int getMaximalAdaptiveHeight(int i10) {
        return l.b(i10);
    }

    public LevelPlayAdSize toLevelPlayAdSize(Context context) {
        if (isAdaptive()) {
            return LevelPlayAdSize.createAdaptiveAdSize(context, Integer.valueOf(this.f29524e.d()));
        }
        String description = getDescription();
        description.hashCode();
        switch (description) {
            case "RECTANGLE":
            case "MEDIUM_RECTANGLE":
                return LevelPlayAdSize.MEDIUM_RECTANGLE;
            case "LARGE":
                return LevelPlayAdSize.LARGE;
            case "BANNER":
                return LevelPlayAdSize.BANNER;
            case "CUSTOM":
                return LevelPlayAdSize.createCustomSize(this.f29520a, this.f29521b);
            default:
                return LevelPlayAdSize.BANNER;
        }
    }
}
