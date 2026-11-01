package com.fyber.inneractive.sdk.player.exoplayer2.source;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f17562a;

    public i(p pVar) {
        this.f17562a = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p pVar = this.f17562a;
        if (pVar.G || pVar.f17601s || pVar.f17599q == null || !pVar.f17600r) {
            return;
        }
        int size = pVar.f17597o.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) pVar.f17597o.valueAt(i10)).e() == null) {
                return;
            }
        }
        com.fyber.inneractive.sdk.player.exoplayer2.util.e eVar = pVar.f17593k;
        synchronized (eVar) {
            eVar.f17818a = false;
        }
        y[] yVarArr = new y[size];
        pVar.f17608z = new boolean[size];
        pVar.f17607y = new boolean[size];
        pVar.f17606x = pVar.f17599q.c();
        int i11 = 0;
        while (true) {
            boolean z10 = true;
            if (i11 >= size) {
                pVar.f17605w = new z(yVarArr);
                pVar.f17601s = true;
                t tVar = pVar.f17588f;
                long j10 = pVar.f17606x;
                tVar.a(new x(j10, j10, 0L, 0L, pVar.f17599q.a(), false), null);
                ((com.fyber.inneractive.sdk.player.exoplayer2.l) pVar.f17598p).f17407f.obtainMessage(8, pVar).sendToTarget();
                return;
            }
            com.fyber.inneractive.sdk.player.exoplayer2.o oVarE = ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) pVar.f17597o.valueAt(i11)).e();
            yVarArr[i11] = new y(oVarE);
            String str = oVarE.f17504f;
            if (!"video".equals(com.fyber.inneractive.sdk.player.exoplayer2.util.i.b(str)) && !"audio".equals(com.fyber.inneractive.sdk.player.exoplayer2.util.i.b(str))) {
                z10 = false;
            }
            pVar.f17608z[i11] = z10;
            pVar.A = z10 | pVar.A;
            i11++;
        }
    }
}
