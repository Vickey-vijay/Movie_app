package androidx.collection;

import androidx.exifinterface.media.ExifInterface;
import bk.l;
import bk.p;
import bk.r;
import com.ironsource.C3426d4;
import kotlin.Metadata;

/* JADX INFO: compiled from: LruCache.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u008f\u0001\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u001a\b\u0006\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00030\u00052\u0016\b\u0006\u0010\b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00072(\b\u0006\u0010\f\u001a\"\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0012\u0004\u0012\u00020\u000b0\tH\u0086\b¨\u0006\u000f"}, d2 = {"", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "maxSize", "Lkotlin/Function2;", "sizeOf", "Lkotlin/Function1;", "create", "Lkotlin/Function4;", "", "Lmj/r;", "onEntryRemoved", "Landroidx/collection/LruCache;", "lruCache", "collection-ktx"}, k = 2, mv = {1, 4, 0})
public final class LruCacheKt {

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* JADX INFO: renamed from: androidx.collection.LruCacheKt$lruCache$4, reason: invalid class name */
    /* JADX INFO: compiled from: LruCache.kt */
    @Metadata(bv = {}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0001H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\bJ1\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u00012\b\u0010\f\u001a\u0004\u0018\u00018\u0001H\u0014¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"androidx/collection/LruCacheKt$lruCache$4", "Landroidx/collection/LruCache;", C3426d4.i.W, "value", "", "sizeOf", "(Ljava/lang/Object;Ljava/lang/Object;)I", "create", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "evicted", "oldValue", "newValue", "Lmj/r;", "entryRemoved", "(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "collection-ktx"}, k = 1, mv = {1, 4, 0})
    public static final class AnonymousClass4<K, V> extends LruCache<K, V> {
        public final /* synthetic */ l $create;
        public final /* synthetic */ int $maxSize;
        public final /* synthetic */ r $onEntryRemoved;
        public final /* synthetic */ p $sizeOf;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(p pVar, l lVar, r rVar, int i10, int i11) {
            super(i11);
            this.$sizeOf = pVar;
            this.$create = lVar;
            this.$onEntryRemoved = rVar;
            this.$maxSize = i10;
        }

        @Override // androidx.collection.LruCache
        public V create(K key) {
            ck.p.k(key, C3426d4.i.W);
            return (V) this.$create.invoke(key);
        }

        @Override // androidx.collection.LruCache
        public void entryRemoved(boolean evicted, K key, V oldValue, V newValue) {
            ck.p.k(key, C3426d4.i.W);
            ck.p.k(oldValue, "oldValue");
            this.$onEntryRemoved.invoke(Boolean.valueOf(evicted), key, oldValue, newValue);
        }

        @Override // androidx.collection.LruCache
        public int sizeOf(K key, V value) {
            ck.p.k(key, C3426d4.i.W);
            ck.p.k(value, "value");
            return ((Number) this.$sizeOf.mo1invoke(key, value)).intValue();
        }
    }

    public static /* synthetic */ LruCache lruCache$default(int i10, p pVar, l lVar, r rVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            pVar = new p() { // from class: androidx.collection.LruCacheKt.lruCache.1
                public final int invoke(Object obj2, Object obj3) {
                    ck.p.k(obj2, "<anonymous parameter 0>");
                    ck.p.k(obj3, "<anonymous parameter 1>");
                    return 1;
                }

                @Override // bk.p
                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public /* bridge */ /* synthetic */ Object mo1invoke(Object obj2, Object obj3) {
                    return Integer.valueOf(invoke(obj2, obj3));
                }
            };
        }
        p pVar2 = pVar;
        if ((i11 & 4) != 0) {
            lVar = new l() { // from class: androidx.collection.LruCacheKt.lruCache.2
                @Override // bk.l
                public final Object invoke(Object obj2) {
                    ck.p.k(obj2, "it");
                    return null;
                }
            };
        }
        l lVar2 = lVar;
        if ((i11 & 8) != 0) {
            rVar = new r() { // from class: androidx.collection.LruCacheKt.lruCache.3
                @Override // bk.r
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                    invoke(((Boolean) obj2).booleanValue(), obj3, obj4, obj5);
                    return mj.r.f64562a;
                }

                public final void invoke(boolean z10, Object obj2, Object obj3, Object obj4) {
                    ck.p.k(obj2, "<anonymous parameter 1>");
                    ck.p.k(obj3, "<anonymous parameter 2>");
                }
            };
        }
        r rVar2 = rVar;
        ck.p.k(pVar2, "sizeOf");
        ck.p.k(lVar2, "create");
        ck.p.k(rVar2, "onEntryRemoved");
        return new AnonymousClass4(pVar2, lVar2, rVar2, i10, i10);
    }

    public static final <K, V> LruCache<K, V> lruCache(int i10, p<? super K, ? super V, Integer> pVar, l<? super K, ? extends V> lVar, r<? super Boolean, ? super K, ? super V, ? super V, mj.r> rVar) {
        ck.p.k(pVar, "sizeOf");
        ck.p.k(lVar, "create");
        ck.p.k(rVar, "onEntryRemoved");
        return new AnonymousClass4(pVar, lVar, rVar, i10, i10);
    }
}
