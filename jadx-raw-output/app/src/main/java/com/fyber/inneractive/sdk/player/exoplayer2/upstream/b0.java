package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f17654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public y f17655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public IOException f17656c;

    public final boolean a() {
        return this.f17655b != null;
    }

    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.source.k kVar) {
        y yVar = this.f17655b;
        if (yVar != null) {
            yVar.a(true);
        }
        if (kVar != null) {
            this.f17654a.execute(kVar);
        }
        this.f17654a.shutdown();
    }

    public final void b() throws IOException {
        IOException iOException = this.f17656c;
        if (iOException != null) {
            throw iOException;
        }
        y yVar = this.f17655b;
        if (yVar != null) {
            int i10 = yVar.f17804c;
            IOException iOException2 = yVar.f17806e;
            if (iOException2 != null && yVar.f17807f > i10) {
                throw iOException2;
            }
        }
    }

    public b0(String str) {
        int i10 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.f17873a;
        this.f17654a = Executors.newSingleThreadExecutor(new com.fyber.inneractive.sdk.player.exoplayer2.util.y(str));
    }
}
