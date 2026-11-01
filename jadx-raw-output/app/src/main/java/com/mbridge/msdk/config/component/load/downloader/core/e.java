package com.mbridge.msdk.config.component.load.downloader.core;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: DownloadRequestBuilder.java */
/* JADX INFO: loaded from: classes9.dex */
public class e<T> implements p<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f33294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.mbridge.msdk.config.component.load.downloader.b<T> f33295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.mbridge.msdk.config.component.load.downloader.c f33296c = com.mbridge.msdk.config.component.load.downloader.c.MEDIUM;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.mbridge.msdk.config.component.load.downloader.h f33297d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Map<String, String> f33298e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public HashMap<String, List<String>> f33299f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f33300g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f33301h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f33302i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f33303j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f33304k;

    public e<T> a(long j10) {
        this.f33294a = j10;
        return this;
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.core.p
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public e<T> withHttpRetryCounter(int i10) {
        this.f33301h = i10;
        return this;
    }

    public e<T> b(long j10) {
        this.f33300g = j10;
        return this;
    }

    public p<T> c(long j10) {
        this.f33304k = j10;
        return this;
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.core.p
    public p<T> withTimeout(long j10) {
        this.f33302i = j10;
        return this;
    }

    public e(com.mbridge.msdk.config.component.load.downloader.b<T> bVar) {
        this.f33295b = bVar;
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.core.p
    public p<T> a(com.mbridge.msdk.config.component.load.downloader.h hVar) {
        this.f33297d = hVar;
        return this;
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.core.p
    public d<T> build() {
        return d.a(this);
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.core.p
    public p<T> a(com.mbridge.msdk.config.component.load.downloader.c cVar) {
        this.f33296c = cVar;
        return this;
    }
}
