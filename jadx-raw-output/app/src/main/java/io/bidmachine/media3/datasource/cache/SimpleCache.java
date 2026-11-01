package io.bidmachine.media3.datasource.cache;

import android.os.ConditionVariable;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import bg.b;
import bg.d;
import bg.e;
import bg.h;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.Log;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.database.DatabaseIOException;
import io.bidmachine.media3.database.DatabaseProvider;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes5.dex */
@UnstableApi
public final class SimpleCache implements Cache {
    private static final int SUBDIRECTORY_COUNT = 10;
    private static final String TAG = "SimpleCache";
    private static final String UID_FILE_SUFFIX = ".uid";
    private static final HashSet<File> lockedCacheDirs = new HashSet<>();
    private final File cacheDir;
    private final e contentIndex;
    private final CacheEvictor evictor;

    @Nullable
    private final b fileIndex;
    private Cache.CacheException initializationException;
    private final HashMap<String, ArrayList<Cache.Listener>> listeners;
    private final Random random;
    private boolean released;
    private long totalSpace;
    private final boolean touchCacheSpans;
    private long uid;

    public class a extends Thread {
        public final /* synthetic */ ConditionVariable val$conditionVariable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, ConditionVariable conditionVariable) {
            super(str);
            this.val$conditionVariable = conditionVariable;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            synchronized (SimpleCache.this) {
                this.val$conditionVariable.open();
                SimpleCache.this.initialize();
                SimpleCache.this.evictor.onCacheInitialized();
            }
        }
    }

    @Deprecated
    public SimpleCache(File file, CacheEvictor cacheEvictor) {
        this(file, cacheEvictor, null, null, false, true);
    }

    private static long loadUid(File[] fileArr) {
        int length = fileArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            File file = fileArr[i10];
            String name = file.getName();
            if (name.endsWith(UID_FILE_SUFFIX)) {
                try {
                    return parseUid(name);
                } catch (NumberFormatException unused) {
                    Log.e(TAG, "Malformed UID file: " + file);
                    file.delete();
                }
            }
        }
        return -1L;
    }

    @Override // io.bidmachine.media3.datasource.cache.Cache
    public synchronized NavigableSet<CacheSpan> addListener(String str, Cache.Listener listener) {
        Assertions.checkState(!this.released);
        Assertions.checkNotNull(str);
        Assertions.checkNotNull(listener);
        ArrayList<Cache.Listener> arrayList = this.listeners.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.listeners.put(str, arrayList);
        }
        arrayList.add(listener);
        return getCachedSpans(str);
    }

    @Override // io.bidmachine.media3.datasource.cache.Cache
    public synchronized void applyContentMetadataMutations(String str, ContentMetadataMutations contentMetadataMutations) throws Cache.CacheException {
        Assertions.checkState(!this.released);
        checkInitialization();
        this.contentIndex.applyContentMetadataMutations(str, contentMetadataMutations);
        try {
            this.contentIndex.store();
        } catch (IOException e10) {
            throw new Cache.CacheException(e10);
        }
    }

    public synchronized void checkInitialization() throws Cache.CacheException {
        Cache.CacheException cacheException = this.initializationException;
        if (cacheException != null) {
            throw cacheException;
        }
    }

    @Override // io.bidmachine.media3.datasource.cache.Cache
    public synchronized void commitFile(File file, long j10) throws Cache.CacheException {
        boolean z10 = true;
        Assertions.checkState(!this.released);
        if (file.exists()) {
            if (j10 == 0) {
                file.delete();
                return;
            }
            h hVar = (h) Assertions.checkNotNull(h.createCacheEntry(file, j10, this.contentIndex));
            d dVar = (d) Assertions.checkNotNull(this.contentIndex.get(hVar.key));
            Assertions.checkState(dVar.isFullyLocked(hVar.position, hVar.length));
            long contentLength = ContentMetadata.getContentLength(dVar.getMetadata());
            if (contentLength != -1) {
                if (hVar.position + hVar.length > contentLength) {
                    z10 = false;
                }
                Assertions.checkState(z10);
            }
            if (this.fileIndex == null) {
                addSpan(hVar);
                this.contentIndex.store();
                notifyAll();
                return;
            }
            try {
                this.fileIndex.set(file.getName(), hVar.length, hVar.lastTouchTimestamp);
                addSpan(hVar);
                try {
                    this.contentIndex.store();
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

    @Override // io.bidmachine.media3.datasource.cache.Cache
    public synchronized long getCacheSpace() {
        Assertions.checkState(!this.released);
        return this.totalSpace;
    }

    @Override // io.bidmachine.media3.datasource.cache.Cache
    public synchronized long getCachedBytes(String str, long j10, long j11) {
        long j12;
        long j13 = j11 == -1 ? Long.MAX_VALUE : j10 + j11;
        long j14 = j13 < 0 ? Long.MAX_VALUE : j13;
        long j15 = j10;
        j12 = 0;
        while (j15 < j14) {
            long cachedLength = getCachedLength(str, j15, j14 - j15);
            if (cachedLength > 0) {
                j12 += cachedLength;
            } else {
                cachedLength = -cachedLength;
            }
            j15 += cachedLength;
        }
        return j12;
    }

    @Override // io.bidmachine.media3.datasource.cache.Cache
    public synchronized long getCachedLength(String str, long j10, long j11) {
        d dVar;
        Assertions.checkState(!this.released);
        if (j11 == -1) {
            j11 = Long.MAX_VALUE;
        }
        dVar = this.contentIndex.get(str);
        return dVar != null ? dVar.getCachedBytesLength(j10, j11) : -j11;
    }

    @Override // io.bidmachine.media3.datasource.cache.Cache
    public synchronized NavigableSet<CacheSpan> getCachedSpans(String str) {
        d dVar;
        Assertions.checkState(!this.released);
        dVar = this.contentIndex.get(str);
        return (dVar == null || dVar.isEmpty()) ? new TreeSet() : new TreeSet((Collection) dVar.getSpans());
    }

    @Override // io.bidmachine.media3.datasource.cache.Cache
    public synchronized ContentMetadata getContentMetadata(String str) {
        Assertions.checkState(!this.released);
        return this.contentIndex.getContentMetadata(str);
    }

    @Override // io.bidmachine.media3.datasource.cache.Cache
    public synchronized Set<String> getKeys() {
        Assertions.checkState(!this.released);
        return new HashSet(this.contentIndex.getKeys());
    }

    @Override // io.bidmachine.media3.datasource.cache.Cache
    public synchronized long getUid() {
        return this.uid;
    }

    @Override // io.bidmachine.media3.datasource.cache.Cache
    public synchronized boolean isCached(String str, long j10, long j11) {
        d dVar;
        Assertions.checkState(!this.released);
        dVar = this.contentIndex.get(str);
        return dVar != null && dVar.getCachedBytesLength(j10, j11) >= j11;
    }

    @Override // io.bidmachine.media3.datasource.cache.Cache
    public synchronized void release() {
        if (this.released) {
            return;
        }
        this.listeners.clear();
        removeStaleSpans();
        try {
            try {
                this.contentIndex.store();
                unlockFolder(this.cacheDir);
            } catch (IOException e10) {
                Log.e(TAG, "Storing index file failed", e10);
                unlockFolder(this.cacheDir);
            }
            this.released = true;
        } catch (Throwable th2) {
            unlockFolder(this.cacheDir);
            this.released = true;
            throw th2;
        }
    }

    @Override // io.bidmachine.media3.datasource.cache.Cache
    public synchronized void releaseHoleSpan(CacheSpan cacheSpan) {
        Assertions.checkState(!this.released);
        d dVar = (d) Assertions.checkNotNull(this.contentIndex.get(cacheSpan.key));
        dVar.unlockRange(cacheSpan.position);
        this.contentIndex.maybeRemove(dVar.key);
        notifyAll();
    }

    @Override // io.bidmachine.media3.datasource.cache.Cache
    public synchronized void removeListener(String str, Cache.Listener listener) {
        if (this.released) {
            return;
        }
        ArrayList<Cache.Listener> arrayList = this.listeners.get(str);
        if (arrayList != null) {
            arrayList.remove(listener);
            if (arrayList.isEmpty()) {
                this.listeners.remove(str);
            }
        }
    }

    @Override // io.bidmachine.media3.datasource.cache.Cache
    public synchronized void removeResource(String str) {
        Assertions.checkState(!this.released);
        Iterator<CacheSpan> it = getCachedSpans(str).iterator();
        while (it.hasNext()) {
            removeSpanInternal(it.next());
        }
    }

    @Override // io.bidmachine.media3.datasource.cache.Cache
    public synchronized void removeSpan(CacheSpan cacheSpan) {
        Assertions.checkState(!this.released);
        removeSpanInternal(cacheSpan);
    }

    @Override // io.bidmachine.media3.datasource.cache.Cache
    public synchronized File startFile(String str, long j10, long j11) throws Cache.CacheException {
        d dVar;
        File file;
        Assertions.checkState(!this.released);
        checkInitialization();
        dVar = this.contentIndex.get(str);
        Assertions.checkNotNull(dVar);
        Assertions.checkState(dVar.isFullyLocked(j10, j11));
        if (!this.cacheDir.exists()) {
            createCacheDirectories(this.cacheDir);
            removeStaleSpans();
        }
        this.evictor.onStartFile(this, str, j10, j11);
        file = new File(this.cacheDir, Integer.toString(this.random.nextInt(10)));
        if (!file.exists()) {
            createCacheDirectories(file);
        }
        return h.getCacheFile(file, dVar.f5351id, j10, System.currentTimeMillis());
    }

    @Override // io.bidmachine.media3.datasource.cache.Cache
    public synchronized CacheSpan startReadWrite(String str, long j10, long j11) throws InterruptedException, Cache.CacheException {
        CacheSpan cacheSpanStartReadWriteNonBlocking;
        Assertions.checkState(!this.released);
        checkInitialization();
        while (true) {
            cacheSpanStartReadWriteNonBlocking = startReadWriteNonBlocking(str, j10, j11);
            if (cacheSpanStartReadWriteNonBlocking == null) {
                wait();
            }
        }
        return cacheSpanStartReadWriteNonBlocking;
    }

    @Override // io.bidmachine.media3.datasource.cache.Cache
    @Nullable
    public synchronized CacheSpan startReadWriteNonBlocking(String str, long j10, long j11) throws Cache.CacheException {
        Assertions.checkState(!this.released);
        checkInitialization();
        h span = getSpan(str, j10, j11);
        if (span.isCached) {
            return touchSpan(str, span);
        }
        if (this.contentIndex.getOrAdd(str).lockRange(j10, span.length)) {
            return span;
        }
        return null;
    }

    public SimpleCache(File file, CacheEvictor cacheEvictor, DatabaseProvider databaseProvider) {
        this(file, cacheEvictor, databaseProvider, null, false, false);
    }

    private void addSpan(h hVar) {
        this.contentIndex.getOrAdd(hVar.key).addSpan(hVar);
        this.totalSpace += hVar.length;
        notifySpanAdded(hVar);
    }

    private static long createUid(File file) throws IOException {
        long jNextLong = new SecureRandom().nextLong();
        long jAbs = jNextLong == Long.MIN_VALUE ? 0L : Math.abs(jNextLong);
        File file2 = new File(file, Long.toString(jAbs, 16) + UID_FILE_SUFFIX);
        if (file2.createNewFile()) {
            return jAbs;
        }
        throw new IOException("Failed to create UID file: " + file2);
    }

    @WorkerThread
    public static void delete(File file, @Nullable DatabaseProvider databaseProvider) {
        if (file.exists()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                file.delete();
                return;
            }
            if (databaseProvider != null) {
                long jLoadUid = loadUid(fileArrListFiles);
                if (jLoadUid != -1) {
                    try {
                        b.delete(databaseProvider, jLoadUid);
                    } catch (DatabaseIOException unused) {
                        Log.w(TAG, "Failed to delete file metadata: " + jLoadUid);
                    }
                    try {
                        e.delete(databaseProvider, jLoadUid);
                    } catch (DatabaseIOException unused2) {
                        Log.w(TAG, "Failed to delete file metadata: " + jLoadUid);
                    }
                }
            }
            Util.recursiveDelete(file);
        }
    }

    private h getSpan(String str, long j10, long j11) {
        h span;
        d dVar = this.contentIndex.get(str);
        if (dVar == null) {
            return h.createHole(str, j10, j11);
        }
        while (true) {
            span = dVar.getSpan(j10, j11);
            if (!span.isCached || ((File) Assertions.checkNotNull(span.file)).length() == span.length) {
                break;
            }
            removeStaleSpans();
        }
        return span;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initialize() {
        if (!this.cacheDir.exists()) {
            try {
                createCacheDirectories(this.cacheDir);
            } catch (Cache.CacheException e10) {
                this.initializationException = e10;
                return;
            }
        }
        File[] fileArrListFiles = this.cacheDir.listFiles();
        if (fileArrListFiles == null) {
            String str = "Failed to list cache directory files: " + this.cacheDir;
            Log.e(TAG, str);
            this.initializationException = new Cache.CacheException(str);
            return;
        }
        long jLoadUid = loadUid(fileArrListFiles);
        this.uid = jLoadUid;
        if (jLoadUid == -1) {
            try {
                this.uid = createUid(this.cacheDir);
            } catch (IOException e11) {
                String str2 = "Failed to create cache UID: " + this.cacheDir;
                Log.e(TAG, str2, e11);
                this.initializationException = new Cache.CacheException(str2, e11);
                return;
            }
        }
        try {
            this.contentIndex.initialize(this.uid);
            b bVar = this.fileIndex;
            if (bVar != null) {
                bVar.initialize(this.uid);
                Map<String, bg.a> all = this.fileIndex.getAll();
                loadDirectory(this.cacheDir, true, fileArrListFiles, all);
                this.fileIndex.removeAll(all.keySet());
            } else {
                loadDirectory(this.cacheDir, true, fileArrListFiles, null);
            }
            this.contentIndex.removeEmpty();
            try {
                this.contentIndex.store();
            } catch (IOException e12) {
                Log.e(TAG, "Storing index file failed", e12);
            }
        } catch (IOException e13) {
            String str3 = "Failed to initialize cache indices: " + this.cacheDir;
            Log.e(TAG, str3, e13);
            this.initializationException = new Cache.CacheException(str3, e13);
        }
    }

    public static synchronized boolean isCacheFolderLocked(File file) {
        return lockedCacheDirs.contains(file.getAbsoluteFile());
    }

    private void loadDirectory(File file, boolean z10, @Nullable File[] fileArr, @Nullable Map<String, bg.a> map) {
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
                loadDirectory(file2, false, file2.listFiles(), map);
            } else if (!z10 || (!e.isIndexFile(name) && !name.endsWith(UID_FILE_SUFFIX))) {
                long j10 = -1;
                long j11 = -9223372036854775807L;
                bg.a aVarRemove = map != null ? map.remove(name) : null;
                if (aVarRemove != null) {
                    j10 = aVarRemove.length;
                    j11 = aVarRemove.lastTouchTimestamp;
                }
                h hVarCreateCacheEntry = h.createCacheEntry(file2, j10, j11, this.contentIndex);
                if (hVarCreateCacheEntry != null) {
                    addSpan(hVarCreateCacheEntry);
                } else {
                    file2.delete();
                }
            }
        }
    }

    private static synchronized boolean lockFolder(File file) {
        return lockedCacheDirs.add(file.getAbsoluteFile());
    }

    private void notifySpanAdded(h hVar) {
        ArrayList<Cache.Listener> arrayList = this.listeners.get(hVar.key);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).onSpanAdded(this, hVar);
            }
        }
        this.evictor.onSpanAdded(this, hVar);
    }

    private void notifySpanRemoved(CacheSpan cacheSpan) {
        ArrayList<Cache.Listener> arrayList = this.listeners.get(cacheSpan.key);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).onSpanRemoved(this, cacheSpan);
            }
        }
        this.evictor.onSpanRemoved(this, cacheSpan);
    }

    private void notifySpanTouched(h hVar, CacheSpan cacheSpan) {
        ArrayList<Cache.Listener> arrayList = this.listeners.get(hVar.key);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).onSpanTouched(this, hVar, cacheSpan);
            }
        }
        this.evictor.onSpanTouched(this, hVar, cacheSpan);
    }

    private static long parseUid(String str) {
        return Long.parseLong(str.substring(0, str.indexOf(46)), 16);
    }

    private void removeSpanInternal(CacheSpan cacheSpan) {
        d dVar = this.contentIndex.get(cacheSpan.key);
        if (dVar == null || !dVar.removeSpan(cacheSpan)) {
            return;
        }
        this.totalSpace -= cacheSpan.length;
        if (this.fileIndex != null) {
            String name = ((File) Assertions.checkNotNull(cacheSpan.file)).getName();
            try {
                this.fileIndex.remove(name);
            } catch (IOException unused) {
                Log.w(TAG, "Failed to remove file index entry for: " + name);
            }
        }
        this.contentIndex.maybeRemove(dVar.key);
        notifySpanRemoved(cacheSpan);
    }

    private void removeStaleSpans() {
        ArrayList arrayList = new ArrayList();
        Iterator<d> it = this.contentIndex.getAll().iterator();
        while (it.hasNext()) {
            for (h hVar : it.next().getSpans()) {
                if (((File) Assertions.checkNotNull(hVar.file)).length() != hVar.length) {
                    arrayList.add(hVar);
                }
            }
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            removeSpanInternal((CacheSpan) arrayList.get(i10));
        }
    }

    private h touchSpan(String str, h hVar) {
        if (!this.touchCacheSpans) {
            return hVar;
        }
        String name = ((File) Assertions.checkNotNull(hVar.file)).getName();
        long j10 = hVar.length;
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z10 = false;
        b bVar = this.fileIndex;
        if (bVar != null) {
            try {
                bVar.set(name, j10, jCurrentTimeMillis);
            } catch (IOException unused) {
                Log.w(TAG, "Failed to update index with new touch timestamp.");
            }
        } else {
            z10 = true;
        }
        h lastTouchTimestamp = ((d) Assertions.checkNotNull(this.contentIndex.get(str))).setLastTouchTimestamp(hVar, jCurrentTimeMillis, z10);
        notifySpanTouched(hVar, lastTouchTimestamp);
        return lastTouchTimestamp;
    }

    private static synchronized void unlockFolder(File file) {
        lockedCacheDirs.remove(file.getAbsoluteFile());
    }

    public SimpleCache(File file, CacheEvictor cacheEvictor, @Nullable DatabaseProvider databaseProvider, @Nullable byte[] bArr, boolean z10, boolean z11) {
        this(file, cacheEvictor, new e(databaseProvider, file, bArr, z10, z11), (databaseProvider == null || z11) ? null : new b(databaseProvider));
    }

    private static void createCacheDirectories(File file) throws Cache.CacheException {
        if (!file.mkdirs() && !file.isDirectory()) {
            String str = "Failed to create cache directory: " + file;
            Log.e(TAG, str);
            throw new Cache.CacheException(str);
        }
    }

    public SimpleCache(File file, CacheEvictor cacheEvictor, e eVar, @Nullable b bVar) {
        if (lockFolder(file)) {
            this.cacheDir = file;
            this.evictor = cacheEvictor;
            this.contentIndex = eVar;
            this.fileIndex = bVar;
            this.listeners = new HashMap<>();
            this.random = new Random();
            this.touchCacheSpans = cacheEvictor.requiresCacheSpanTouches();
            this.uid = -1L;
            ConditionVariable conditionVariable = new ConditionVariable();
            new a("ExoPlayer:SimpleCacheInit", conditionVariable).start();
            conditionVariable.block();
            return;
        }
        throw new IllegalStateException("Another SimpleCache instance uses the folder: " + file);
    }
}
