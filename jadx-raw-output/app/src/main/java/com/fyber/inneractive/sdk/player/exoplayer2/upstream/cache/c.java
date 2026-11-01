package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import com.fyber.inneractive.sdk.player.exoplayer2.util.p;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.safedk.android.internal.partials.DTExchangeFilesBridge;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes11.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f17657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f17658b = 10485760;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17659c = 20480;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.upstream.k f17660d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public File f17661e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public OutputStream f17662f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public FileOutputStream f17663g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f17664h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f17665i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p f17666j;

    public final void a() {
        OutputStream outputStream = this.f17662f;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            this.f17663g.getFD().sync();
            z.a(this.f17662f);
            this.f17662f = null;
            File file = this.f17661e;
            this.f17661e = null;
            l lVar = this.f17657a;
            synchronized (lVar) {
                m mVarA = m.a(file, lVar.f17713d);
                if (mVarA == null) {
                    throw new IllegalStateException();
                }
                if (!lVar.f17712c.containsKey(mVarA.f17689a)) {
                    throw new IllegalStateException();
                }
                if (file.exists()) {
                    if (file.length() == 0) {
                        file.delete();
                        return;
                    }
                    long jA = lVar.a(mVarA.f17689a);
                    if (jA != -1 && mVarA.f17690b + mVarA.f17691c > jA) {
                        throw new IllegalStateException();
                    }
                    lVar.a(mVarA);
                    lVar.f17713d.b();
                    lVar.notifyAll();
                }
            }
        } catch (Throwable th2) {
            z.a(this.f17662f);
            this.f17662f = null;
            File file2 = this.f17661e;
            this.f17661e = null;
            file2.delete();
            throw th2;
        }
    }

    public final void b() throws FileNotFoundException {
        File file;
        long j10 = this.f17660d.f17750d;
        long jMin = j10 == -1 ? this.f17658b : Math.min(j10 - this.f17665i, this.f17658b);
        l lVar = this.f17657a;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar = this.f17660d;
        String str = kVar.f17751e;
        long j11 = kVar.f17748b + this.f17665i;
        synchronized (lVar) {
            if (!lVar.f17712c.containsKey(str)) {
                throw new IllegalStateException();
            }
            if (!lVar.f17710a.exists()) {
                lVar.a();
                lVar.f17710a.mkdirs();
            }
            lVar.f17711b.a(lVar, jMin);
            File file2 = lVar.f17710a;
            i iVar = lVar.f17713d;
            h hVarA = (h) iVar.f17699a.get(str);
            if (hVarA == null) {
                hVarA = iVar.a(str, -1L);
            }
            int i10 = hVarA.f17695a;
            long jCurrentTimeMillis = System.currentTimeMillis();
            Pattern pattern = m.f17716g;
            file = new File(file2, i10 + "." + j11 + "." + jCurrentTimeMillis + ".v3.exo");
        }
        this.f17661e = file;
        FileOutputStream fileOutputStreamFileOutputStreamCtor = DTExchangeFilesBridge.fileOutputStreamCtor(this.f17661e);
        this.f17663g = fileOutputStreamFileOutputStreamCtor;
        if (this.f17659c > 0) {
            p pVar = this.f17666j;
            if (pVar == null) {
                this.f17666j = new p(this.f17663g, this.f17659c);
            } else {
                pVar.a(fileOutputStreamFileOutputStreamCtor);
            }
            this.f17662f = this.f17666j;
        } else {
            this.f17662f = fileOutputStreamFileOutputStreamCtor;
        }
        this.f17664h = 0L;
    }

    public c(l lVar) {
        this.f17657a = lVar;
    }
}
