package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import java.io.File;

/* JADX INFO: loaded from: classes11.dex */
public abstract class g implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f17690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f17691c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f17692d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final File f17693e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f17694f;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        if (!this.f17689a.equals(gVar.f17689a)) {
            return this.f17689a.compareTo(gVar.f17689a);
        }
        long j10 = this.f17690b - gVar.f17690b;
        if (j10 == 0) {
            return 0;
        }
        return j10 < 0 ? -1 : 1;
    }

    public g(String str, long j10, long j11, long j12, File file) {
        boolean z10;
        this.f17689a = str;
        this.f17690b = j10;
        this.f17691c = j11;
        if (file != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f17692d = z10;
        this.f17693e = file;
        this.f17694f = j12;
    }
}
