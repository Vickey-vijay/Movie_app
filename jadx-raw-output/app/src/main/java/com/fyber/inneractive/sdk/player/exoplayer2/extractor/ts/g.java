package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f17177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.r[] f17178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f17179c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f17180d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f17181e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f17182f;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a() {
        this.f17179c = false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar, e0 e0Var) {
        for (int i10 = 0; i10 < this.f17178b.length; i10++) {
            c0 c0Var = (c0) this.f17177a.get(i10);
            e0Var.a();
            e0Var.b();
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA = jVar.a(e0Var.f17164d, 3);
            e0Var.b();
            gVarA.a(new com.fyber.inneractive.sdk.player.exoplayer2.o(e0Var.f17165e, null, "application/dvbsubs", null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, c0Var.f17136a, -1, Long.MAX_VALUE, Collections.singletonList(c0Var.f17137b), null, null));
            this.f17178b[i10] = gVarA;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void b() {
        if (this.f17179c) {
            for (com.fyber.inneractive.sdk.player.exoplayer2.extractor.r rVar : this.f17178b) {
                rVar.a(this.f17182f, 1, this.f17181e, 0, null);
            }
            this.f17179c = false;
        }
    }

    public g(List list) {
        this.f17177a = list;
        this.f17178b = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.r[list.size()];
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(boolean z10, long j10) {
        if (z10) {
            this.f17179c = true;
            this.f17182f = j10;
            this.f17181e = 0;
            this.f17180d = 2;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        boolean z10;
        boolean z11;
        if (this.f17179c) {
            if (this.f17180d == 2) {
                if (nVar.f17847c - nVar.f17846b == 0) {
                    z11 = false;
                } else {
                    if (nVar.j() != 32) {
                        this.f17179c = false;
                    }
                    this.f17180d--;
                    z11 = this.f17179c;
                }
                if (!z11) {
                    return;
                }
            }
            if (this.f17180d == 1) {
                if (nVar.f17847c - nVar.f17846b == 0) {
                    z10 = false;
                } else {
                    if (nVar.j() != 0) {
                        this.f17179c = false;
                    }
                    this.f17180d--;
                    z10 = this.f17179c;
                }
                if (!z10) {
                    return;
                }
            }
            int i10 = nVar.f17846b;
            int i11 = nVar.f17847c - i10;
            for (com.fyber.inneractive.sdk.player.exoplayer2.extractor.r rVar : this.f17178b) {
                nVar.e(i10);
                rVar.a(i11, nVar);
            }
            this.f17181e += i11;
        }
    }
}
