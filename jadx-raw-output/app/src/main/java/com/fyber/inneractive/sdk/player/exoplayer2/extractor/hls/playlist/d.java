package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f16640c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f16641d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f16642e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f16643f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f16644g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f16645h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f16646i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f16647j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f16648k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c f16649l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f16650m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List f16651n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f16652o;

    public d(int i10, String str, long j10, long j11, boolean z10, int i11, int i12, int i13, long j12, boolean z11, boolean z12, c cVar, List list, List list2) {
        super(str);
        this.f16639b = i10;
        this.f16641d = j11;
        this.f16642e = z10;
        this.f16643f = i11;
        this.f16644g = i12;
        this.f16645h = i13;
        this.f16646i = j12;
        this.f16647j = z11;
        this.f16648k = z12;
        this.f16649l = cVar;
        this.f16650m = Collections.unmodifiableList(list);
        if (list.isEmpty()) {
            this.f16652o = 0L;
        } else {
            c cVar2 = (c) list.get(list.size() - 1);
            this.f16652o = cVar2.f16633d + cVar2.f16631b;
        }
        this.f16640c = j10 == -9223372036854775807L ? -9223372036854775807L : j10 >= 0 ? j10 : this.f16652o + j10;
        this.f16651n = Collections.unmodifiableList(list2);
    }
}
