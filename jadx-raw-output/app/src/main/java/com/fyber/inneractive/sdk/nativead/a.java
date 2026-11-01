package com.fyber.inneractive.sdk.nativead;

import com.fyber.inneractive.sdk.network.z;
import com.fyber.inneractive.sdk.player.cache.g;
import com.fyber.inneractive.sdk.player.cache.l;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.File;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f15985a;

    public a(b bVar) {
        this.f15985a = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j10;
        File fileA = b.a(this.f15985a);
        if (fileA != null) {
            try {
                IAlog.a("NativeCache opening the cache in directory - %s", fileA);
                this.f15985a.f15988b = g.a(fileA, 41943040L);
                g gVar = this.f15985a.f15988b;
                gVar.getClass();
                IAlog.e("DiskLruCache delete cache", new Object[0]);
                gVar.close();
                l.a(gVar.f16161a);
                this.f15985a.f15988b = g.a(fileA, 41943040L);
                g gVar2 = this.f15985a.f15988b;
                synchronized (gVar2) {
                    j10 = gVar2.f16168h;
                }
                IAlog.a("NativeCache opened the cache in directory - %s current size is %d", fileA, Long.valueOf(j10));
                b bVar = this.f15985a;
                bVar.f15988b.f16172l = bVar;
                bVar.f15989c = true;
            } catch (Throwable th2) {
                z.a("Failed to open cache directory", th2.getMessage(), null, null);
                IAlog.a("Failed to open cache directory", th2, new Object[0]);
            }
        }
    }
}
