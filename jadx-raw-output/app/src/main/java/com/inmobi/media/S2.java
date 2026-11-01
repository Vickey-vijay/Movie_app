package com.inmobi.media;

import java.util.Map;
import java.util.Random;

/* JADX INFO: loaded from: classes8.dex */
public final class S2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f23480c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f23481d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f23482e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f23483f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f23484g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f23485h;

    public S2(int i10, String str, Map map, boolean z10, boolean z11, int i11, long j10, long j11) {
        ck.p.j(str, "url");
        this.f23478a = i10;
        this.f23479b = str;
        this.f23480c = map;
        this.f23481d = z10;
        this.f23482e = z11;
        this.f23483f = i11;
        this.f23484g = j10;
        this.f23485h = j11;
    }

    public /* synthetic */ S2(String str, boolean z10, boolean z11, int i10, int i11) {
        this(new Random().nextInt() & Integer.MAX_VALUE, str, null, z10, z11, i10, System.currentTimeMillis(), System.currentTimeMillis());
    }
}
