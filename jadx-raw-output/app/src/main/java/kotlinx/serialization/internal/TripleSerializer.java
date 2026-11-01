package kotlinx.serialization.internal;

import al.c;
import al.d;
import al.e;
import al.f;
import bk.l;
import bl.f2;
import ck.p;
import kotlin.Triple;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.descriptors.a;
import mj.r;
import xk.b;

/* JADX INFO: compiled from: Tuples.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class TripleSerializer<A, B, C> implements b<Triple<? extends A, ? extends B, ? extends C>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b<A> f63280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b<B> f63281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b<C> f63282c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f63283d;

    public TripleSerializer(b<A> bVar, b<B> bVar2, b<C> bVar3) {
        p.j(bVar, "aSerializer");
        p.j(bVar2, "bSerializer");
        p.j(bVar3, "cSerializer");
        this.f63280a = bVar;
        this.f63281b = bVar2;
        this.f63282c = bVar3;
        this.f63283d = SerialDescriptorsKt.b("kotlin.Triple", new a[0], new l<zk.a, r>(this) { // from class: kotlinx.serialization.internal.TripleSerializer$descriptor$1
            public final /* synthetic */ TripleSerializer<A, B, C> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // bk.l
            public /* bridge */ /* synthetic */ r invoke(zk.a aVar) {
                invoke2(aVar);
                return r.f64562a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(zk.a aVar) {
                p.j(aVar, "$this$buildClassSerialDescriptor");
                zk.a.b(aVar, "first", this.this$0.f63280a.getDescriptor(), null, false, 12, null);
                zk.a.b(aVar, "second", this.this$0.f63281b.getDescriptor(), null, false, 12, null);
                zk.a.b(aVar, "third", this.this$0.f63282c.getDescriptor(), null, false, 12, null);
            }
        });
    }

    @Override // xk.a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Triple<A, B, C> deserialize(e eVar) {
        p.j(eVar, "decoder");
        c cVarB = eVar.b(getDescriptor());
        return cVarB.j() ? d(cVarB) : e(cVarB);
    }

    @Override // xk.g
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void serialize(f fVar, Triple<? extends A, ? extends B, ? extends C> triple) {
        p.j(fVar, "encoder");
        p.j(triple, "value");
        d dVarB = fVar.b(getDescriptor());
        dVarB.m(getDescriptor(), 0, this.f63280a, triple.getFirst());
        dVarB.m(getDescriptor(), 1, this.f63281b, triple.getSecond());
        dVarB.m(getDescriptor(), 2, this.f63282c, triple.getThird());
        dVarB.c(getDescriptor());
    }

    @Override // xk.b, xk.g, xk.a
    public a getDescriptor() {
        return this.f63283d;
    }

    public final Triple<A, B, C> d(c cVar) {
        Object objC = c.a.c(cVar, getDescriptor(), 0, this.f63280a, null, 8, null);
        Object objC2 = c.a.c(cVar, getDescriptor(), 1, this.f63281b, null, 8, null);
        Object objC3 = c.a.c(cVar, getDescriptor(), 2, this.f63282c, null, 8, null);
        cVar.c(getDescriptor());
        return new Triple<>(objC, objC2, objC3);
    }

    public final Triple<A, B, C> e(c cVar) {
        Object objC = f2.f5404a;
        Object objC2 = f2.f5404a;
        Object objC3 = f2.f5404a;
        while (true) {
            int iX = cVar.x(getDescriptor());
            if (iX != -1) {
                if (iX != 0) {
                    if (iX != 1) {
                        if (iX == 2) {
                            objC3 = c.a.c(cVar, getDescriptor(), 2, this.f63282c, null, 8, null);
                        } else {
                            throw new SerializationException("Unexpected index " + iX);
                        }
                    } else {
                        objC2 = c.a.c(cVar, getDescriptor(), 1, this.f63281b, null, 8, null);
                    }
                } else {
                    objC = c.a.c(cVar, getDescriptor(), 0, this.f63280a, null, 8, null);
                }
            } else {
                cVar.c(getDescriptor());
                if (objC != f2.f5404a) {
                    if (objC2 != f2.f5404a) {
                        if (objC3 != f2.f5404a) {
                            return new Triple<>(objC, objC2, objC3);
                        }
                        throw new SerializationException("Element 'third' is missing");
                    }
                    throw new SerializationException("Element 'second' is missing");
                }
                throw new SerializationException("Element 'first' is missing");
            }
        }
    }
}
