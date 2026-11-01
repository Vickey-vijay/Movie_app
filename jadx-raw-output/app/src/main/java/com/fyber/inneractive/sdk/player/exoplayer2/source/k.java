package com.fyber.inneractive.sdk.player.exoplayer2.source;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f17564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f17565b;

    public k(p pVar, n nVar) {
        this.f17565b = pVar;
        this.f17564a = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n nVar = this.f17564a;
        if (nVar.f17580c != null) {
            nVar.f17580c = null;
        }
        int size = this.f17565b.f17597o.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.f17565b.f17597o.valueAt(i10)).b();
        }
    }
}
