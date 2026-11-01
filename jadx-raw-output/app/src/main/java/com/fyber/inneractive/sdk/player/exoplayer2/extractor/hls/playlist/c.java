package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f16631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16632c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f16633d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f16634e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f16635f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f16636g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f16637h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f16638i;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        Long l10 = (Long) obj;
        if (this.f16633d > l10.longValue()) {
            return 1;
        }
        return this.f16633d < l10.longValue() ? -1 : 0;
    }

    public c(String str, long j10, int i10, long j11, boolean z10, String str2, String str3, long j12, long j13) {
        this.f16630a = str;
        this.f16631b = j10;
        this.f16632c = i10;
        this.f16633d = j11;
        this.f16634e = z10;
        this.f16635f = str2;
        this.f16636g = str3;
        this.f16637h = j12;
        this.f16638i = j13;
    }
}
