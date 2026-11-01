package bg;

import androidx.annotation.Nullable;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.Log;
import io.bidmachine.media3.datasource.cache.CacheSpan;
import io.bidmachine.media3.datasource.cache.ContentMetadataMutations;
import io.bidmachine.media3.datasource.cache.DefaultContentMetadata;
import java.io.File;
import java.util.ArrayList;
import java.util.TreeSet;

/* JADX INFO: compiled from: CachedContent.java */
/* JADX INFO: loaded from: classes7.dex */
public final class d {
    private static final String TAG = "CachedContent";
    private final TreeSet<h> cachedSpans;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    public final int f5351id;
    public final String key;
    private final ArrayList<a> lockedRanges;
    private DefaultContentMetadata metadata;

    /* JADX INFO: compiled from: CachedContent.java */
    public static final class a {
        public final long length;
        public final long position;

        public boolean contains(long j10, long j11) {
            long j12 = this.length;
            if (j12 == -1) {
                return j10 >= this.position;
            }
            if (j11 == -1) {
                return false;
            }
            long j13 = this.position;
            return j13 <= j10 && j10 + j11 <= j13 + j12;
        }

        public boolean intersects(long j10, long j11) {
            long j12 = this.position;
            if (j12 > j10) {
                return j11 == -1 || j10 + j11 > j12;
            }
            long j13 = this.length;
            return j13 == -1 || j12 + j13 > j10;
        }

        public a(long j10, long j11) {
            this.position = j10;
            this.length = j11;
        }
    }

    public d(int i10, String str) {
        this(i10, str, DefaultContentMetadata.EMPTY);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.f5351id == dVar.f5351id && this.key.equals(dVar.key) && this.cachedSpans.equals(dVar.cachedSpans) && this.metadata.equals(dVar.metadata);
    }

    public boolean isFullyLocked(long j10, long j11) {
        for (int i10 = 0; i10 < this.lockedRanges.size(); i10++) {
            if (this.lockedRanges.get(i10).contains(j10, j11)) {
                return true;
            }
        }
        return false;
    }

    public boolean lockRange(long j10, long j11) {
        for (int i10 = 0; i10 < this.lockedRanges.size(); i10++) {
            if (this.lockedRanges.get(i10).intersects(j10, j11)) {
                return false;
            }
        }
        this.lockedRanges.add(new a(j10, j11));
        return true;
    }

    public void unlockRange(long j10) {
        for (int i10 = 0; i10 < this.lockedRanges.size(); i10++) {
            if (this.lockedRanges.get(i10).position == j10) {
                this.lockedRanges.remove(i10);
                return;
            }
        }
        throw new IllegalStateException();
    }

    public d(int i10, String str, DefaultContentMetadata defaultContentMetadata) {
        this.f5351id = i10;
        this.key = str;
        this.metadata = defaultContentMetadata;
        this.cachedSpans = new TreeSet<>();
        this.lockedRanges = new ArrayList<>();
    }

    public void addSpan(h hVar) {
        this.cachedSpans.add(hVar);
    }

    public boolean applyMetadataMutations(ContentMetadataMutations contentMetadataMutations) {
        DefaultContentMetadata defaultContentMetadata = this.metadata;
        DefaultContentMetadata defaultContentMetadataCopyWithMutationsApplied = defaultContentMetadata.copyWithMutationsApplied(contentMetadataMutations);
        this.metadata = defaultContentMetadataCopyWithMutationsApplied;
        return !defaultContentMetadataCopyWithMutationsApplied.equals(defaultContentMetadata);
    }

    public long getCachedBytesLength(long j10, long j11) {
        Assertions.checkArgument(j10 >= 0);
        Assertions.checkArgument(j11 >= 0);
        h span = getSpan(j10, j11);
        if (span.isHoleSpan()) {
            return -Math.min(span.isOpenEnded() ? Long.MAX_VALUE : span.length, j11);
        }
        long j12 = j10 + j11;
        long j13 = j12 >= 0 ? j12 : Long.MAX_VALUE;
        long jMax = span.position + span.length;
        if (jMax < j13) {
            for (h hVar : this.cachedSpans.tailSet(span, false)) {
                long j14 = hVar.position;
                if (j14 > jMax) {
                    break;
                }
                jMax = Math.max(jMax, j14 + hVar.length);
                if (jMax >= j13) {
                    break;
                }
            }
        }
        return Math.min(jMax - j10, j11);
    }

    public DefaultContentMetadata getMetadata() {
        return this.metadata;
    }

    public h getSpan(long j10, long j11) {
        h hVarCreateLookup = h.createLookup(this.key, j10);
        h hVarFloor = this.cachedSpans.floor(hVarCreateLookup);
        if (hVarFloor != null && hVarFloor.position + hVarFloor.length > j10) {
            return hVarFloor;
        }
        h hVarCeiling = this.cachedSpans.ceiling(hVarCreateLookup);
        if (hVarCeiling != null) {
            long j12 = hVarCeiling.position - j10;
            j11 = j11 == -1 ? j12 : Math.min(j12, j11);
        }
        return h.createHole(this.key, j10, j11);
    }

    public TreeSet<h> getSpans() {
        return this.cachedSpans;
    }

    public int hashCode() {
        return (((this.f5351id * 31) + this.key.hashCode()) * 31) + this.metadata.hashCode();
    }

    public boolean isEmpty() {
        return this.cachedSpans.isEmpty();
    }

    public boolean isFullyUnlocked() {
        return this.lockedRanges.isEmpty();
    }

    public boolean removeSpan(CacheSpan cacheSpan) {
        if (!this.cachedSpans.remove(cacheSpan)) {
            return false;
        }
        File file = cacheSpan.file;
        if (file == null) {
            return true;
        }
        file.delete();
        return true;
    }

    public h setLastTouchTimestamp(h hVar, long j10, boolean z10) {
        Assertions.checkState(this.cachedSpans.remove(hVar));
        File file = (File) Assertions.checkNotNull(hVar.file);
        if (z10) {
            File cacheFile = h.getCacheFile((File) Assertions.checkNotNull(file.getParentFile()), this.f5351id, hVar.position, j10);
            if (file.renameTo(cacheFile)) {
                file = cacheFile;
            } else {
                Log.w(TAG, "Failed to rename " + file + " to " + cacheFile);
            }
        }
        h hVarCopyWithFileAndLastTouchTimestamp = hVar.copyWithFileAndLastTouchTimestamp(file, j10);
        this.cachedSpans.add(hVarCopyWithFileAndLastTouchTimestamp);
        return hVarCopyWithFileAndLastTouchTimestamp;
    }
}
