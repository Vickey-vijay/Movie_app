package kotlinx.serialization;

import al.e;
import al.f;
import bl.n1;
import ck.p;
import java.lang.annotation.Annotation;
import java.util.List;
import jk.c;
import kotlin.KotlinNothingValueException;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.descriptors.a;
import mj.r;
import nj.l;
import nj.s;
import xk.b;
import zk.g;

/* JADX INFO: compiled from: ContextualSerializer.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class ContextualSerializer<T> implements b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c<T> f63223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b<T> f63224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<b<?>> f63225c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f63226d;

    public ContextualSerializer(c<T> cVar, b<T> bVar, b<?>[] bVarArr) {
        p.j(cVar, "serializableClass");
        p.j(bVarArr, "typeArgumentsSerializers");
        this.f63223a = cVar;
        this.f63224b = bVar;
        this.f63225c = l.f(bVarArr);
        this.f63226d = zk.b.c(SerialDescriptorsKt.c("kotlinx.serialization.ContextualSerializer", g.a.f86475a, new a[0], new bk.l<zk.a, r>(this) { // from class: kotlinx.serialization.ContextualSerializer$descriptor$1
            public final /* synthetic */ ContextualSerializer<T> this$0;

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
                a descriptor;
                p.j(aVar, "$this$buildSerialDescriptor");
                b bVar2 = this.this$0.f63224b;
                List<Annotation> annotations = (bVar2 == null || (descriptor = bVar2.getDescriptor()) == null) ? null : descriptor.getAnnotations();
                if (annotations == null) {
                    annotations = s.k();
                }
                aVar.h(annotations);
            }
        }), cVar);
    }

    public final b<T> b(el.c cVar) {
        b<T> bVarB = cVar.b(this.f63223a, this.f63225c);
        if (bVarB != null || (bVarB = this.f63224b) != null) {
            return bVarB;
        }
        n1.f(this.f63223a);
        throw new KotlinNothingValueException();
    }

    @Override // xk.a
    public T deserialize(e eVar) {
        p.j(eVar, "decoder");
        return (T) eVar.r(b(eVar.a()));
    }

    @Override // xk.b, xk.g, xk.a
    public a getDescriptor() {
        return this.f63226d;
    }

    @Override // xk.g
    public void serialize(f fVar, T t10) {
        p.j(fVar, "encoder");
        p.j(t10, "value");
        fVar.F(b(fVar.a()), t10);
    }
}
