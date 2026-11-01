package im;

import java.io.IOException;

/* JADX INFO: compiled from: CachedExchange.java */
/* JADX INFO: loaded from: classes9.dex */
public class e extends i {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final org.eclipse.jetty.http.a f54255y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public volatile int f54256z;

    @Override // im.i
    public synchronized void F(mm.d dVar, mm.d dVar2) throws IOException {
        org.eclipse.jetty.http.a aVar = this.f54255y;
        if (aVar != null) {
            aVar.e(dVar, dVar2.k0());
        }
        super.F(dVar, dVar2);
    }

    @Override // im.i
    public synchronized void H(mm.d dVar, int i10, mm.d dVar2) throws IOException {
        this.f54256z = i10;
        super.H(dVar, i10, dVar2);
    }

    public synchronized org.eclipse.jetty.http.a e0() {
        if (s() < 6) {
            throw new IllegalStateException("Headers not completely received yet");
        }
        return this.f54255y;
    }

    public synchronized int f0() {
        if (s() < 5) {
            throw new IllegalStateException("Response not received yet");
        }
        return this.f54256z;
    }

    public e(boolean z10) {
        org.eclipse.jetty.http.a aVar;
        if (z10) {
            aVar = new org.eclipse.jetty.http.a();
        } else {
            aVar = null;
        }
        this.f54255y = aVar;
    }
}
