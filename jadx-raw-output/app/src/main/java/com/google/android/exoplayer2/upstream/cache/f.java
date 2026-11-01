package com.google.android.exoplayer2.upstream.cache;

import android.os.ConditionVariable;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.exoplayer2.database.DatabaseIOException;
import f5.g;
import f5.h;
import f5.i;
import f5.j;
import g5.k0;
import g5.m;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

/* JADX INFO: compiled from: SimpleCache.java */
/* JADX INFO: loaded from: classes6.dex */
public final class f implements Cache {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final HashSet<File> f20155l = new HashSet<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f20156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f20157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f20158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final f5.c f20159d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap<String, ArrayList<Cache.a>> f20160e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Random f20161f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f20162g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f20163h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f20164i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f20165j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Cache.CacheException f20166k;

    /* JADX INFO: compiled from: SimpleCache.java */
    public class a extends Thread {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ConditionVariable f20167b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, ConditionVariable conditionVariable) {
            super(str);
            this.f20167b = conditionVariable;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            synchronized (f.this) {
                this.f20167b.open();
                f.this.j();
                f.this.f20157b.onCacheInitialized();
            }
        }
    }

    public f(File file, c cVar, n3.a aVar) {
        this(file, cVar, aVar, null, false, false);
    }

    public static long l(File[] fileArr) {
        int length = fileArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            File file = fileArr[i10];
            String name = file.getName();
            if (name.endsWith(".uid")) {
                try {
                    return q(name);
                } catch (NumberFormatException unused) {
                    m.c("SimpleCache", "Malformed UID file: " + file);
                    file.delete();
                }
            }
        }
        return -1L;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized void a(f5.e eVar) {
        g5.a.f(!this.f20165j);
        g gVarG = this.f20158c.g(eVar.f52844b);
        g5.a.e(gVarG);
        g5.a.f(gVarG.g());
        gVarG.j(false);
        this.f20158c.p(gVarG.f52851b);
        notifyAll();
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized void b(f5.e eVar) {
        g5.a.f(!this.f20165j);
        r(eVar);
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized void c(String str, j jVar) throws Cache.CacheException {
        g5.a.f(!this.f20165j);
        g();
        this.f20158c.e(str, jVar);
        try {
            this.f20158c.s();
        } catch (IOException e10) {
            throw new Cache.CacheException(e10);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized void commitFile(File file, long j10) throws Cache.CacheException {
        boolean z10 = true;
        g5.a.f(!this.f20165j);
        if (file.exists()) {
            if (j10 == 0) {
                file.delete();
                return;
            }
            f5.m mVar = (f5.m) g5.a.e(f5.m.f(file, j10, this.f20158c));
            g gVar = (g) g5.a.e(this.f20158c.g(mVar.f52844b));
            g5.a.f(gVar.g());
            long jA = i.a(gVar.c());
            if (jA != -1) {
                if (mVar.f52845c + mVar.f52846d > jA) {
                    z10 = false;
                }
                g5.a.f(z10);
            }
            if (this.f20159d == null) {
                f(mVar);
                this.f20158c.s();
                notifyAll();
                return;
            }
            try {
                this.f20159d.h(file.getName(), mVar.f52846d, mVar.f52849g);
                f(mVar);
                try {
                    this.f20158c.s();
                    notifyAll();
                    return;
                } catch (IOException e10) {
                    throw new Cache.CacheException(e10);
                }
            } catch (IOException e11) {
                throw new Cache.CacheException(e11);
            }
            throw th;
        }
    }

    public synchronized void g() throws Cache.CacheException {
        Cache.CacheException cacheException = this.f20166k;
        if (cacheException != null) {
            throw cacheException;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized long getCacheSpace() {
        g5.a.f(!this.f20165j);
        return this.f20164i;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized i getContentMetadata(String str) {
        g5.a.f(!this.f20165j);
        return this.f20158c.j(str);
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized File startFile(String str, long j10, long j11) throws Cache.CacheException {
        g gVarG;
        File file;
        g5.a.f(!this.f20165j);
        g();
        gVarG = this.f20158c.g(str);
        g5.a.e(gVarG);
        g5.a.f(gVarG.g());
        if (!this.f20156a.exists()) {
            this.f20156a.mkdirs();
            s();
        }
        this.f20157b.c(this, str, j10, j11);
        file = new File(this.f20156a, Integer.toString(this.f20161f.nextInt(10)));
        if (!file.exists()) {
            file.mkdir();
        }
        return f5.m.j(file, gVarG.f52850a, j10, System.currentTimeMillis());
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized f5.e startReadWrite(String str, long j10) throws InterruptedException, Cache.CacheException {
        f5.e eVarStartReadWriteNonBlocking;
        g5.a.f(!this.f20165j);
        g();
        while (true) {
            eVarStartReadWriteNonBlocking = startReadWriteNonBlocking(str, j10);
            if (eVarStartReadWriteNonBlocking == null) {
                wait();
            }
        }
        return eVarStartReadWriteNonBlocking;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    @Nullable
    public synchronized f5.e startReadWriteNonBlocking(String str, long j10) throws Cache.CacheException {
        g5.a.f(!this.f20165j);
        g();
        f5.m mVarI = i(str, j10);
        if (mVarI.f52847e) {
            return t(str, mVarI);
        }
        g gVarM = this.f20158c.m(str);
        if (gVarM.g()) {
            return null;
        }
        gVarM.j(true);
        return mVarI;
    }

    public f(File file, c cVar, @Nullable n3.a aVar, @Nullable byte[] bArr, boolean z10, boolean z11) {
        this(file, cVar, new h(aVar, file, bArr, z10, z11), (aVar == null || z11) ? null : new f5.c(aVar));
    }

    @WorkerThread
    public static void delete(File file, @Nullable n3.a aVar) {
        if (file.exists()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                file.delete();
                return;
            }
            if (aVar != null) {
                long jL = l(fileArrListFiles);
                if (jL != -1) {
                    try {
                        f5.c.delete(aVar, jL);
                    } catch (DatabaseIOException unused) {
                        m.h("SimpleCache", "Failed to delete file metadata: " + jL);
                    }
                    try {
                        h.delete(aVar, jL);
                    } catch (DatabaseIOException unused2) {
                        m.h("SimpleCache", "Failed to delete file metadata: " + jL);
                    }
                }
            }
            k0.v0(file);
        }
    }

    public static long h(File file) throws IOException {
        long jNextLong = new SecureRandom().nextLong();
        long jAbs = jNextLong == Long.MIN_VALUE ? 0L : Math.abs(jNextLong);
        File file2 = new File(file, Long.toString(jAbs, 16) + ".uid");
        if (file2.createNewFile()) {
            return jAbs;
        }
        throw new IOException("Failed to create UID file: " + file2);
    }

    public static synchronized boolean m(File file) {
        return f20155l.add(file.getAbsoluteFile());
    }

    public static long q(String str) {
        return Long.parseLong(str.substring(0, str.indexOf(46)), 16);
    }

    public final void f(f5.m mVar) {
        this.f20158c.m(mVar.f52844b).a(mVar);
        this.f20164i += mVar.f52846d;
        n(mVar);
    }

    public final f5.m i(String str, long j10) {
        f5.m mVarD;
        g gVarG = this.f20158c.g(str);
        if (gVarG == null) {
            return f5.m.i(str, j10);
        }
        while (true) {
            mVarD = gVarG.d(j10);
            if (!mVarD.f52847e || mVarD.f52848f.length() == mVarD.f52846d) {
                break;
            }
            s();
        }
        return mVarD;
    }

    public final void j() {
        if (!this.f20156a.exists() && !this.f20156a.mkdirs()) {
            String str = "Failed to create cache directory: " + this.f20156a;
            m.c("SimpleCache", str);
            this.f20166k = new Cache.CacheException(str);
            return;
        }
        File[] fileArrListFiles = this.f20156a.listFiles();
        if (fileArrListFiles == null) {
            String str2 = "Failed to list cache directory files: " + this.f20156a;
            m.c("SimpleCache", str2);
            this.f20166k = new Cache.CacheException(str2);
            return;
        }
        long jL = l(fileArrListFiles);
        this.f20163h = jL;
        if (jL == -1) {
            try {
                this.f20163h = h(this.f20156a);
            } catch (IOException e10) {
                String str3 = "Failed to create cache UID: " + this.f20156a;
                m.d("SimpleCache", str3, e10);
                this.f20166k = new Cache.CacheException(str3, e10);
                return;
            }
        }
        try {
            this.f20158c.n(this.f20163h);
            f5.c cVar = this.f20159d;
            if (cVar != null) {
                cVar.e(this.f20163h);
                Map<String, f5.b> mapB = this.f20159d.b();
                k(this.f20156a, true, fileArrListFiles, mapB);
                this.f20159d.g(mapB.keySet());
            } else {
                k(this.f20156a, true, fileArrListFiles, null);
            }
            this.f20158c.r();
            try {
                this.f20158c.s();
            } catch (IOException e11) {
                m.d("SimpleCache", "Storing index file failed", e11);
            }
        } catch (IOException e12) {
            String str4 = "Failed to initialize cache indices: " + this.f20156a;
            m.d("SimpleCache", str4, e12);
            this.f20166k = new Cache.CacheException(str4, e12);
        }
    }

    public final void k(File file, boolean z10, @Nullable File[] fileArr, @Nullable Map<String, f5.b> map) {
        if (fileArr == null || fileArr.length == 0) {
            if (z10) {
                return;
            }
            file.delete();
            return;
        }
        for (File file2 : fileArr) {
            String name = file2.getName();
            if (z10 && name.indexOf(46) == -1) {
                k(file2, false, file2.listFiles(), map);
            } else if (!z10 || (!h.o(name) && !name.endsWith(".uid"))) {
                long j10 = -1;
                long j11 = -9223372036854775807L;
                f5.b bVarRemove = map != null ? map.remove(name) : null;
                if (bVarRemove != null) {
                    j10 = bVarRemove.f52839a;
                    j11 = bVarRemove.f52840b;
                }
                f5.m mVarE = f5.m.e(file2, j10, j11, this.f20158c);
                if (mVarE != null) {
                    f(mVarE);
                } else {
                    file2.delete();
                }
            }
        }
    }

    public final void n(f5.m mVar) {
        ArrayList<Cache.a> arrayList = this.f20160e.get(mVar.f52844b);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).d(this, mVar);
            }
        }
        this.f20157b.d(this, mVar);
    }

    public final void o(f5.e eVar) {
        ArrayList<Cache.a> arrayList = this.f20160e.get(eVar.f52844b);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).b(this, eVar);
            }
        }
        this.f20157b.b(this, eVar);
    }

    public final void p(f5.m mVar, f5.e eVar) {
        ArrayList<Cache.a> arrayList = this.f20160e.get(mVar.f52844b);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).a(this, mVar, eVar);
            }
        }
        this.f20157b.a(this, mVar, eVar);
    }

    public final void r(f5.e eVar) {
        g gVarG = this.f20158c.g(eVar.f52844b);
        if (gVarG == null || !gVarG.h(eVar)) {
            return;
        }
        this.f20164i -= eVar.f52846d;
        if (this.f20159d != null) {
            String name = eVar.f52848f.getName();
            try {
                this.f20159d.f(name);
            } catch (IOException unused) {
                m.h("SimpleCache", "Failed to remove file index entry for: " + name);
            }
        }
        this.f20158c.p(gVarG.f52851b);
        o(eVar);
    }

    public final void s() {
        ArrayList arrayList = new ArrayList();
        Iterator<g> it = this.f20158c.h().iterator();
        while (it.hasNext()) {
            for (f5.m mVar : it.next().e()) {
                if (mVar.f52848f.length() != mVar.f52846d) {
                    arrayList.add(mVar);
                }
            }
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            r((f5.e) arrayList.get(i10));
        }
    }

    public final f5.m t(String str, f5.m mVar) {
        if (!this.f20162g) {
            return mVar;
        }
        String name = ((File) g5.a.e(mVar.f52848f)).getName();
        long j10 = mVar.f52846d;
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z10 = false;
        f5.c cVar = this.f20159d;
        if (cVar != null) {
            try {
                cVar.h(name, j10, jCurrentTimeMillis);
            } catch (IOException unused) {
                m.h("SimpleCache", "Failed to update index with new touch timestamp.");
            }
        } else {
            z10 = true;
        }
        f5.m mVarI = this.f20158c.g(str).i(mVar, jCurrentTimeMillis, z10);
        p(mVar, mVarI);
        return mVarI;
    }

    public f(File file, c cVar, h hVar, @Nullable f5.c cVar2) {
        if (m(file)) {
            this.f20156a = file;
            this.f20157b = cVar;
            this.f20158c = hVar;
            this.f20159d = cVar2;
            this.f20160e = new HashMap<>();
            this.f20161f = new Random();
            this.f20162g = cVar.requiresCacheSpanTouches();
            this.f20163h = -1L;
            ConditionVariable conditionVariable = new ConditionVariable();
            new a("SimpleCache.initialize()", conditionVariable).start();
            conditionVariable.block();
            return;
        }
        throw new IllegalStateException("Another SimpleCache instance uses the folder: " + file);
    }
}
