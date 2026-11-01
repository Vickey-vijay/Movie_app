package androidx.core.util;

import android.util.LruCache;
import bk.l;
import bk.p;
import bk.r;

/* JADX INFO: compiled from: LruCache.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class LruCacheKt {

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* JADX INFO: renamed from: androidx.core.util.LruCacheKt$lruCache$4, reason: invalid class name */
    /* JADX INFO: compiled from: LruCache.kt */
    public static final class AnonymousClass4<K, V> extends LruCache<K, V> {
        public final /* synthetic */ l<K, V> $create;
        public final /* synthetic */ r<Boolean, K, V, V, mj.r> $onEntryRemoved;
        public final /* synthetic */ p<K, V, Integer> $sizeOf;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(int i10, p<? super K, ? super V, Integer> pVar, l<? super K, ? extends V> lVar, r<? super Boolean, ? super K, ? super V, ? super V, mj.r> rVar) {
            super(i10);
            this.$sizeOf = pVar;
            this.$create = lVar;
            this.$onEntryRemoved = rVar;
        }

        @Override // android.util.LruCache
        public V create(K k10) {
            return this.$create.invoke(k10);
        }

        @Override // android.util.LruCache
        public void entryRemoved(boolean z10, K k10, V v10, V v11) {
            this.$onEntryRemoved.invoke(Boolean.valueOf(z10), k10, v10, v11);
        }

        @Override // android.util.LruCache
        public int sizeOf(K k10, V v10) {
            return this.$sizeOf.mo1invoke(k10, v10).intValue();
        }
    }

    public static final <K, V> LruCache<K, V> lruCache(int i10, p<? super K, ? super V, Integer> pVar, l<? super K, ? extends V> lVar, r<? super Boolean, ? super K, ? super V, ? super V, mj.r> rVar) {
        return new AnonymousClass4(i10, pVar, lVar, rVar);
    }

    public static /* synthetic */ LruCache lruCache$default(int i10, p pVar, l lVar, r rVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            pVar = new p() { // from class: androidx.core.util.LruCacheKt.lruCache.1
                @Override // bk.p
                /* JADX INFO: renamed from: invoke */
                public final Integer mo1invoke(Object obj2, Object obj3) {
                    return 1;
                }
            };
        }
        if ((i11 & 4) != 0) {
            lVar = new l() { // from class: androidx.core.util.LruCacheKt.lruCache.2
                @Override // bk.l
                public final Object invoke(Object obj2) {
                    return null;
                }
            };
        }
        if ((i11 & 8) != 0) {
            rVar = new r() { // from class: androidx.core.util.LruCacheKt.lruCache.3
                public final void invoke(boolean z10, Object obj2, Object obj3, Object obj4) {
                }

                @Override // bk.r
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                    invoke(((Boolean) obj2).booleanValue(), obj3, obj4, obj5);
                    return mj.r.f64562a;
                }
            };
        }
        return new AnonymousClass4(i10, pVar, lVar, rVar);
    }
}
