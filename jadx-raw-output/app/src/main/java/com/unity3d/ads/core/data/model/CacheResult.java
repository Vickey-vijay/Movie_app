package com.unity3d.ads.core.data.model;

import ck.i;
import ck.p;

/* JADX INFO: compiled from: CacheResult.kt */
/* JADX INFO: loaded from: classes7.dex */
public abstract class CacheResult {

    /* JADX INFO: compiled from: CacheResult.kt */
    public static final class Failure extends CacheResult {
        private final CacheError error;
        private final Throwable reason;
        private final CacheSource source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failure(CacheError cacheError, CacheSource cacheSource, Throwable th2) {
            super(null);
            p.j(cacheError, "error");
            p.j(cacheSource, "source");
            this.error = cacheError;
            this.source = cacheSource;
            this.reason = th2;
        }

        public static /* synthetic */ Failure copy$default(Failure failure, CacheError cacheError, CacheSource cacheSource, Throwable th2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                cacheError = failure.error;
            }
            if ((i10 & 2) != 0) {
                cacheSource = failure.source;
            }
            if ((i10 & 4) != 0) {
                th2 = failure.reason;
            }
            return failure.copy(cacheError, cacheSource, th2);
        }

        public final CacheError component1() {
            return this.error;
        }

        public final CacheSource component2() {
            return this.source;
        }

        public final Throwable component3() {
            return this.reason;
        }

        public final Failure copy(CacheError cacheError, CacheSource cacheSource, Throwable th2) {
            p.j(cacheError, "error");
            p.j(cacheSource, "source");
            return new Failure(cacheError, cacheSource, th2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Failure)) {
                return false;
            }
            Failure failure = (Failure) obj;
            return this.error == failure.error && this.source == failure.source && p.e(this.reason, failure.reason);
        }

        public int hashCode() {
            int iHashCode = ((this.error.hashCode() * 31) + this.source.hashCode()) * 31;
            Throwable th2 = this.reason;
            return iHashCode + (th2 == null ? 0 : th2.hashCode());
        }

        public String toString() {
            return "Failure(error=" + this.error + ", source=" + this.source + ", reason=" + this.reason + ')';
        }

        public /* synthetic */ Failure(CacheError cacheError, CacheSource cacheSource, Throwable th2, int i10, i iVar) {
            this(cacheError, (i10 & 2) != 0 ? CacheSource.LOCAL : cacheSource, (i10 & 4) != 0 ? null : th2);
        }

        public final CacheError getError() {
            return this.error;
        }

        public final Throwable getReason() {
            return this.reason;
        }

        public final CacheSource getSource() {
            return this.source;
        }
    }

    /* JADX INFO: compiled from: CacheResult.kt */
    public static final class Success extends CacheResult {
        private final CachedFile cachedFile;
        private final CacheSource source;

        public static /* synthetic */ Success copy$default(Success success, CachedFile cachedFile, CacheSource cacheSource, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                cachedFile = success.cachedFile;
            }
            if ((i10 & 2) != 0) {
                cacheSource = success.source;
            }
            return success.copy(cachedFile, cacheSource);
        }

        public final CachedFile component1() {
            return this.cachedFile;
        }

        public final CacheSource component2() {
            return this.source;
        }

        public final Success copy(CachedFile cachedFile, CacheSource cacheSource) {
            p.j(cachedFile, "cachedFile");
            p.j(cacheSource, "source");
            return new Success(cachedFile, cacheSource);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Success)) {
                return false;
            }
            Success success = (Success) obj;
            return p.e(this.cachedFile, success.cachedFile) && this.source == success.source;
        }

        public int hashCode() {
            return (this.cachedFile.hashCode() * 31) + this.source.hashCode();
        }

        public String toString() {
            return "Success(cachedFile=" + this.cachedFile + ", source=" + this.source + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(CachedFile cachedFile, CacheSource cacheSource) {
            super(null);
            p.j(cachedFile, "cachedFile");
            p.j(cacheSource, "source");
            this.cachedFile = cachedFile;
            this.source = cacheSource;
        }

        public final CachedFile getCachedFile() {
            return this.cachedFile;
        }

        public final CacheSource getSource() {
            return this.source;
        }
    }

    private CacheResult() {
    }

    public /* synthetic */ CacheResult(i iVar) {
        this();
    }
}
