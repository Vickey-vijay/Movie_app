package com.fyber.inneractive.sdk.player.cache;

import com.fyber.inneractive.sdk.network.z;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.File;

/* JADX INFO: loaded from: classes6.dex */
public final class m implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f16184a;

    public m(n nVar) {
        this.f16184a = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j10;
        File fileA = n.a(this.f16184a.f16186a, "fyb.vamp.vid.cache");
        if (fileA != null) {
            try {
                IAlog.a("VideoCache opening the cache in directory - %s", fileA);
                this.f16184a.f16187b = g.a(fileA, 52428800L);
                g gVar = this.f16184a.f16187b;
                gVar.getClass();
                IAlog.e("DiskLruCache delete cache", new Object[0]);
                gVar.close();
                l.a(gVar.f16161a);
                this.f16184a.f16187b = g.a(fileA, 52428800L);
                g gVar2 = this.f16184a.f16187b;
                synchronized (gVar2) {
                    j10 = gVar2.f16168h;
                }
                IAlog.a("VideoCache opened the cache in directory - %s current size is %d", fileA, Long.valueOf(j10));
                n nVar = this.f16184a;
                nVar.f16187b.f16172l = nVar;
                nVar.f16188c = true;
            } catch (Throwable th2) {
                z.a("Failed to open cache directory", th2.getMessage(), null, null);
                IAlog.a("Failed to open cache directory", th2, new Object[0]);
            }
        }
    }
}
