package com.fyber.inneractive.sdk.player.exoplayer2;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public t f16285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f16286c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.source.v f16287d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f16288e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f16289f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f16290g;

    public abstract void a(int i10, Object obj);

    public abstract void a(long j10, long j11);

    public abstract void a(boolean z10, long j10);

    public void a(o[] oVarArr) {
    }

    public com.fyber.inneractive.sdk.player.exoplayer2.util.h d() {
        return null;
    }

    public abstract boolean e();

    public abstract boolean f();

    public abstract void g();

    public abstract void h();

    public abstract void i();

    public abstract void j();

    public final int a(p pVar, com.fyber.inneractive.sdk.player.exoplayer2.decoder.c cVar, boolean z10) {
        int iA = this.f16287d.a(pVar, cVar, z10);
        if (iA == -4) {
            if (cVar.b(4)) {
                this.f16289f = true;
                return this.f16290g ? -4 : -3;
            }
            cVar.f16433d += this.f16288e;
        } else if (iA == -5) {
            o oVar = pVar.f17525a;
            long j10 = oVar.f17521w;
            if (j10 != Long.MAX_VALUE) {
                pVar.f17525a = new o(oVar.f17499a, oVar.f17503e, oVar.f17504f, oVar.f17501c, oVar.f17500b, oVar.f17505g, oVar.f17508j, oVar.f17509k, oVar.f17510l, oVar.f17511m, oVar.f17512n, oVar.f17514p, oVar.f17513o, oVar.f17515q, oVar.f17516r, oVar.f17517s, oVar.f17518t, oVar.f17519u, oVar.f17520v, oVar.f17522x, oVar.f17523y, oVar.f17524z, j10 + this.f16288e, oVar.f17506h, oVar.f17507i, oVar.f17502d);
            }
        }
        return iA;
    }

    public final void c() {
        if (this.f16286c != 1) {
            throw new IllegalStateException();
        }
        this.f16286c = 0;
        this.f16287d = null;
        this.f16290g = false;
        g();
    }

    public a(int i10) {
        this.f16284a = i10;
    }
}
