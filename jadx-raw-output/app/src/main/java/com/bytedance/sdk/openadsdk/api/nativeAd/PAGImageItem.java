package com.bytedance.sdk.openadsdk.api.nativeAd;

/* JADX INFO: loaded from: classes11.dex */
public class PAGImageItem {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private final String f12194lh;
    private final int ouw;
    private final int vt;
    private float yu;

    public PAGImageItem(int i10, int i11, String str, float f10) {
        this.ouw = i10;
        this.vt = i11;
        this.f12194lh = str;
        this.yu = f10;
    }

    public float getDuration() {
        return this.yu;
    }

    public int getHeight() {
        return this.ouw;
    }

    public String getImageUrl() {
        return this.f12194lh;
    }

    public int getWidth() {
        return this.vt;
    }

    public PAGImageItem(int i10, int i11, String str) {
        this(i10, i11, str, 0.0f);
    }
}
