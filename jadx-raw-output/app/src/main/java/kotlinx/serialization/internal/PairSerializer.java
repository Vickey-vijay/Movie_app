package kotlinx.serialization.internal;

import bk.l;
import bl.s0;
import ck.p;
import kotlin.Pair;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.descriptors.a;
import mj.h;
import mj.r;
import xk.b;

/* JADX INFO: compiled from: Tuples.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class PairSerializer<K, V> extends s0<K, V, Pair<? extends K, ? extends V>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f63265c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PairSerializer(final b<K> bVar, final b<V> bVar2) {
        super(bVar, bVar2, null);
        p.j(bVar, "keySerializer");
        p.j(bVar2, "valueSerializer");
        this.f63265c = SerialDescriptorsKt.b("kotlin.Pair", new a[0], new l<zk.a, r>() { // from class: kotlinx.serialization.internal.PairSerializer$descriptor$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // bk.l
            public /* bridge */ /* synthetic */ r invoke(zk.a aVar) {
                invoke2(aVar);
                return r.f64562a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(zk.a aVar) {
                p.j(aVar, "$this$buildClassSerialDescriptor");
                zk.a.b(aVar, "first", bVar.getDescriptor(), null, false, 12, null);
                zk.a.b(aVar, "second", bVar2.getDescriptor(), null, false, 12, null);
            }
        });
    }

    @Override // bl.s0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public K a(Pair<? extends K, ? extends V> pair) {
        p.j(pair, "<this>");
        return pair.getFirst();
    }

    @Override // bl.s0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public V c(Pair<? extends K, ? extends V> pair) {
        p.j(pair, "<this>");
        return pair.getSecond();
    }

    @Override // xk.b, xk.g, xk.a
    public a getDescriptor() {
        return this.f63265c;
    }

    @Override // bl.s0
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public Pair<K, V> e(K k10, V v10) {
        return h.a(k10, v10);
    }
}
