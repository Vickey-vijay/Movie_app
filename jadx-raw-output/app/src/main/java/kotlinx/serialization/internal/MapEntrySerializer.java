package kotlinx.serialization.internal;

import bk.l;
import bl.s0;
import ck.p;
import com.ironsource.C3426d4;
import java.util.Map;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import mj.r;
import xk.b;
import zk.a;

/* JADX INFO: compiled from: Tuples.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class MapEntrySerializer<K, V> extends s0<K, V, Map.Entry<? extends K, ? extends V>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kotlinx.serialization.descriptors.a f63259c;

    /* JADX INFO: compiled from: Tuples.kt */
    public static final class a<K, V> implements Map.Entry<K, V>, dk.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final K f63260b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final V f63261c;

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return p.e(this.f63260b, aVar.f63260b) && p.e(this.f63261c, aVar.f63261c);
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k10 = this.f63260b;
            int iHashCode = (k10 == null ? 0 : k10.hashCode()) * 31;
            V v10 = this.f63261c;
            return iHashCode + (v10 != null ? v10.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public String toString() {
            return "MapEntry(key=" + this.f63260b + ", value=" + this.f63261c + ')';
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f63260b;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f63261c;
        }

        public a(K k10, V v10) {
            this.f63260b = k10;
            this.f63261c = v10;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapEntrySerializer(final b<K> bVar, final b<V> bVar2) {
        super(bVar, bVar2, null);
        p.j(bVar, "keySerializer");
        p.j(bVar2, "valueSerializer");
        this.f63259c = SerialDescriptorsKt.c("kotlin.collections.Map.Entry", kotlinx.serialization.descriptors.b.c.f63248a, new kotlinx.serialization.descriptors.a[0], new l<zk.a, r>() { // from class: kotlinx.serialization.internal.MapEntrySerializer$descriptor$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // bk.l
            public /* bridge */ /* synthetic */ r invoke(a aVar) {
                invoke2(aVar);
                return r.f64562a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(a aVar) {
                p.j(aVar, "$this$buildSerialDescriptor");
                a.b(aVar, C3426d4.i.W, bVar.getDescriptor(), null, false, 12, null);
                a.b(aVar, "value", bVar2.getDescriptor(), null, false, 12, null);
            }
        });
    }

    @Override // bl.s0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public K a(Map.Entry<? extends K, ? extends V> entry) {
        p.j(entry, "<this>");
        return entry.getKey();
    }

    @Override // bl.s0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public V c(Map.Entry<? extends K, ? extends V> entry) {
        p.j(entry, "<this>");
        return entry.getValue();
    }

    @Override // xk.b, xk.g, xk.a
    public kotlinx.serialization.descriptors.a getDescriptor() {
        return this.f63259c;
    }

    @Override // bl.s0
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public Map.Entry<K, V> e(K k10, V v10) {
        return new a(k10, v10);
    }
}
