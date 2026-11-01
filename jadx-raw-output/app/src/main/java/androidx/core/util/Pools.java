package androidx.core.util;

import androidx.annotation.IntRange;
import ck.p;
import com.ironsource.C3605n2;

/* JADX INFO: compiled from: Pools.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class Pools {

    /* JADX INFO: compiled from: Pools.kt */
    public interface Pool<T> {
        T acquire();

        boolean release(T t10);
    }

    /* JADX INFO: compiled from: Pools.kt */
    public static class SimplePool<T> implements Pool<T> {
        private final Object[] pool;
        private int poolSize;

        private final boolean isInPool(T t10) {
            int i10 = this.poolSize;
            for (int i11 = 0; i11 < i10; i11++) {
                if (this.pool[i11] == t10) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.core.util.Pools.Pool
        public T acquire() {
            int i10 = this.poolSize;
            if (i10 <= 0) {
                return null;
            }
            int i11 = i10 - 1;
            T t10 = (T) this.pool[i11];
            p.h(t10, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
            this.pool[i11] = null;
            this.poolSize--;
            return t10;
        }

        @Override // androidx.core.util.Pools.Pool
        public boolean release(T t10) {
            p.j(t10, C3605n2.f30210p);
            if (!(!isInPool(t10))) {
                throw new IllegalStateException("Already in the pool!".toString());
            }
            int i10 = this.poolSize;
            Object[] objArr = this.pool;
            if (i10 >= objArr.length) {
                return false;
            }
            objArr[i10] = t10;
            this.poolSize = i10 + 1;
            return true;
        }

        public SimplePool(@IntRange(from = 1) int i10) {
            boolean z10;
            if (i10 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.pool = new Object[i10];
                return;
            }
            throw new IllegalArgumentException("The max pool size must be > 0".toString());
        }
    }

    /* JADX INFO: compiled from: Pools.kt */
    public static class SynchronizedPool<T> extends SimplePool<T> {
        private final Object lock;

        @Override // androidx.core.util.Pools.SimplePool, androidx.core.util.Pools.Pool
        public T acquire() {
            T t10;
            synchronized (this.lock) {
                t10 = (T) super.acquire();
            }
            return t10;
        }

        @Override // androidx.core.util.Pools.SimplePool, androidx.core.util.Pools.Pool
        public boolean release(T t10) {
            boolean zRelease;
            p.j(t10, C3605n2.f30210p);
            synchronized (this.lock) {
                zRelease = super.release(t10);
            }
            return zRelease;
        }

        public SynchronizedPool(int i10) {
            super(i10);
            this.lock = new Object();
        }
    }

    private Pools() {
    }
}
