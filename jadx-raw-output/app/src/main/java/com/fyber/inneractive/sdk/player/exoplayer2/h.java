package com.fyber.inneractive.sdk.player.exoplayer2;

import android.util.Log;
import com.fyber.inneractive.sdk.player.exoplayer2.source.z;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.source.s f17373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f17374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.source.v[] f17375c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean[] f17376d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f17377e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f17378f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f17379g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f17380h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f17381i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f17382j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public h f17383k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f17384l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.trackselection.j f17385m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final a[] f17386n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final a[] f17387o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.trackselection.i f17388p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c f17389q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.source.u f17390r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.trackselection.j f17391s;

    public final long a(long j10, boolean z10, boolean[] zArr) {
        int i10;
        com.fyber.inneractive.sdk.player.exoplayer2.trackselection.h hVar = this.f17385m.f17649b;
        int i11 = 0;
        while (true) {
            boolean z11 = true;
            if (i11 >= hVar.f17645a) {
                break;
            }
            boolean[] zArr2 = this.f17376d;
            if (z10 || !this.f17385m.a(this.f17391s, i11)) {
                z11 = false;
            }
            zArr2[i11] = z11;
            i11++;
        }
        long jA = this.f17373a.a((com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b[]) hVar.f17646b.clone(), this.f17376d, this.f17375c, zArr, j10);
        this.f17391s = this.f17385m;
        this.f17382j = false;
        int i12 = 0;
        while (true) {
            com.fyber.inneractive.sdk.player.exoplayer2.source.v[] vVarArr = this.f17375c;
            if (i12 >= vVarArr.length) {
                c cVar = this.f17389q;
                a[] aVarArr = this.f17386n;
                z zVar = this.f17385m.f17648a;
                cVar.f16421f = 0;
                for (int i13 = 0; i13 < aVarArr.length; i13++) {
                    if (hVar.f17646b[i13] != null) {
                        int i14 = cVar.f16421f;
                        int i15 = aVarArr[i13].f16284a;
                        int i16 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.f17873a;
                        if (i15 == 0) {
                            i10 = 16777216;
                        } else if (i15 == 1) {
                            i10 = C.DEFAULT_AUDIO_BUFFER_SIZE;
                        } else if (i15 == 2) {
                            i10 = 13107200;
                        } else {
                            if (i15 != 3 && i15 != 4) {
                                throw new IllegalStateException();
                            }
                            i10 = 131072;
                        }
                        cVar.f16421f = i14 + i10;
                    }
                }
                cVar.f16416a.a(cVar.f16421f);
                return jA;
            }
            if (vVarArr[i12] != null) {
                if (hVar.f17646b[i12] == null) {
                    throw new IllegalStateException();
                }
                this.f17382j = true;
            } else if (hVar.f17646b[i12] != null) {
                throw new IllegalStateException();
            }
            i12++;
        }
    }

    public h(a[] aVarArr, a[] aVarArr2, long j10, com.fyber.inneractive.sdk.player.exoplayer2.trackselection.i iVar, c cVar, com.fyber.inneractive.sdk.player.exoplayer2.source.u uVar, Object obj, int i10, boolean z10, long j11) {
        this.f17386n = aVarArr;
        this.f17387o = aVarArr2;
        this.f17377e = j10;
        this.f17388p = iVar;
        this.f17389q = cVar;
        this.f17390r = uVar;
        obj.getClass();
        this.f17374b = obj;
        this.f17378f = i10;
        this.f17380h = z10;
        this.f17379g = j11;
        this.f17375c = new com.fyber.inneractive.sdk.player.exoplayer2.source.v[aVarArr.length];
        this.f17376d = new boolean[aVarArr.length];
        this.f17373a = uVar.a(i10, cVar.f16416a, j11);
    }

    public final void a() {
        try {
            this.f17390r.a(this.f17373a);
        } catch (RuntimeException e10) {
            Log.e("ExoPlayerImplInternal", "Period release failed.", e10);
        }
    }
}
