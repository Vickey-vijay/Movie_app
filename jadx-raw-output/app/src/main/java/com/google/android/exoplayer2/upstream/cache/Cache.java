package com.google.android.exoplayer2.upstream.cache;

import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import f5.i;
import f5.j;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public interface Cache {

    public static class CacheException extends IOException {
        public CacheException(String str) {
            super(str);
        }

        public CacheException(Throwable th2) {
            super(th2);
        }

        public CacheException(String str, Throwable th2) {
            super(str, th2);
        }
    }

    public interface a {
        void a(Cache cache, f5.e eVar, f5.e eVar2);

        void b(Cache cache, f5.e eVar);

        void d(Cache cache, f5.e eVar);
    }

    void a(f5.e eVar);

    @WorkerThread
    void b(f5.e eVar) throws CacheException;

    @WorkerThread
    void c(String str, j jVar) throws CacheException;

    @WorkerThread
    void commitFile(File file, long j10) throws CacheException;

    long getCacheSpace();

    i getContentMetadata(String str);

    @WorkerThread
    File startFile(String str, long j10, long j11) throws CacheException;

    @WorkerThread
    f5.e startReadWrite(String str, long j10) throws InterruptedException, CacheException;

    @Nullable
    @WorkerThread
    f5.e startReadWriteNonBlocking(String str, long j10) throws CacheException;
}
