package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.i2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC2922i2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f24528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f24529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f24530c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f24531d;

    public AbstractC2922i2(String str, String str2) {
        ck.p.j(str, "eventType");
        this.f24528a = str;
        this.f24529b = str2;
        this.f24530c = System.currentTimeMillis();
    }
}
