package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import java.util.TreeSet;

/* JADX INFO: loaded from: classes11.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TreeSet f17697c = new TreeSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f17698d;

    public final m a(long j10) {
        m mVar = new m(this.f17696b, j10, -1L, -9223372036854775807L, null);
        m mVar2 = (m) this.f17697c.floor(mVar);
        if (mVar2 != null && mVar2.f17690b + mVar2.f17691c > j10) {
            return mVar2;
        }
        m mVar3 = (m) this.f17697c.ceiling(mVar);
        return mVar3 == null ? new m(this.f17696b, j10, -1L, -9223372036854775807L, null) : new m(this.f17696b, j10, mVar3.f17690b - j10, -9223372036854775807L, null);
    }

    public h(int i10, String str, long j10) {
        this.f17695a = i10;
        this.f17696b = str;
        this.f17698d = j10;
    }
}
