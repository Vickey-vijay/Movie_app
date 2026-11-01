package kotlinx.serialization.internal;

import al.c;
import al.e;
import al.f;
import bk.a;
import bk.l;
import ck.p;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import mj.g;
import mj.r;
import nj.s;
import xk.b;

/* JADX INFO: compiled from: ObjectSerializer.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class ObjectSerializer<T> implements b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f63262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<? extends Annotation> f63263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f63264c;

    public ObjectSerializer(final String str, T t10) {
        p.j(str, "serialName");
        p.j(t10, "objectInstance");
        this.f63262a = t10;
        this.f63263b = s.k();
        this.f63264c = kotlin.b.b(LazyThreadSafetyMode.PUBLICATION, new a<kotlinx.serialization.descriptors.a>() { // from class: kotlinx.serialization.internal.ObjectSerializer$descriptor$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // bk.a
            public final kotlinx.serialization.descriptors.a invoke() {
                final ObjectSerializer<T> objectSerializer = this;
                return SerialDescriptorsKt.c(str, kotlinx.serialization.descriptors.b.d.f63249a, new kotlinx.serialization.descriptors.a[0], new l<zk.a, r>() { // from class: kotlinx.serialization.internal.ObjectSerializer$descriptor$2.1
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
                        p.j(aVar, "$this$buildSerialDescriptor");
                        aVar.h(objectSerializer.f63263b);
                    }
                });
            }
        });
    }

    @Override // xk.a
    public T deserialize(e eVar) {
        int iX;
        p.j(eVar, "decoder");
        kotlinx.serialization.descriptors.a descriptor = getDescriptor();
        c cVarB = eVar.b(descriptor);
        if (cVarB.j() || (iX = cVarB.x(getDescriptor())) == -1) {
            r rVar = r.f64562a;
            cVarB.c(descriptor);
            return this.f63262a;
        }
        throw new SerializationException("Unexpected index " + iX);
    }

    @Override // xk.b, xk.g, xk.a
    public kotlinx.serialization.descriptors.a getDescriptor() {
        return (kotlinx.serialization.descriptors.a) this.f63264c.getValue();
    }

    @Override // xk.g
    public void serialize(f fVar, T t10) {
        p.j(fVar, "encoder");
        p.j(t10, "value");
        fVar.b(getDescriptor()).c(getDescriptor());
    }
}
