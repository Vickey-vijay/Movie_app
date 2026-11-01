package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.net.Uri;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public final class e0 implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f17731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.c f17732b;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final long a(k kVar) throws com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.b {
        k kVar2 = kVar;
        long jA = this.f17731a.a(kVar2);
        if (kVar2.f17750d == -1 && jA != -1) {
            kVar2 = new k(kVar2.f17747a, kVar2.f17748b, kVar2.f17749c, jA, kVar2.f17751e, kVar2.f17752f);
        }
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.c cVar = this.f17732b;
        cVar.getClass();
        if (kVar2.f17750d != -1 || (kVar2.f17752f & 2) == 2) {
            cVar.f17660d = kVar2;
            cVar.f17665i = 0L;
            try {
                cVar.b();
            } catch (IOException e10) {
                throw new com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.b(e10);
            }
        } else {
            cVar.f17660d = null;
        }
        return jA;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final void close() throws com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.b {
        try {
            this.f17731a.close();
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.c cVar = this.f17732b;
            if (cVar.f17660d == null) {
                return;
            }
            try {
                cVar.a();
            } catch (IOException e10) {
                throw new com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.b(e10);
            }
        } catch (Throwable th2) {
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.c cVar2 = this.f17732b;
            if (cVar2.f17660d != null) {
                try {
                    cVar2.a();
                } catch (IOException e11) {
                    throw new com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.b(e11);
                }
            }
            throw th2;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final int read(byte[] bArr, int i10, int i11) throws com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.b {
        int i12 = this.f17731a.read(bArr, i10, i11);
        if (i12 > 0) {
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.c cVar = this.f17732b;
            if (cVar.f17660d != null) {
                int i13 = 0;
                while (i13 < i12) {
                    try {
                        if (cVar.f17664h == cVar.f17658b) {
                            cVar.a();
                            cVar.b();
                        }
                        int iMin = (int) Math.min(i12 - i13, cVar.f17658b - cVar.f17664h);
                        cVar.f17662f.write(bArr, i10 + i13, iMin);
                        i13 += iMin;
                        long j10 = iMin;
                        cVar.f17664h += j10;
                        cVar.f17665i += j10;
                    } catch (IOException e10) {
                        throw new com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.b(e10);
                    }
                }
            }
        }
        return i12;
    }

    public e0(h hVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.c cVar) {
        hVar.getClass();
        this.f17731a = hVar;
        cVar.getClass();
        this.f17732b = cVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final Uri a() {
        return this.f17731a.a();
    }
}
