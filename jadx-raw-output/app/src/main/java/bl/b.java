package bl;

import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.serialization.SerializationException;

/* JADX INFO: compiled from: AbstractPolymorphicSerializer.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class b<T> implements xk.b<T> {
    public abstract jk.c<T> e();

    public xk.a<T> c(al.c cVar, String str) {
        ck.p.j(cVar, "decoder");
        return cVar.a().d(e(), str);
    }

    public xk.g<T> d(al.f fVar, T t10) {
        ck.p.j(fVar, "encoder");
        ck.p.j(t10, "value");
        return fVar.a().e(e(), t10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xk.a
    public final T deserialize(al.e eVar) {
        T t10;
        ck.p.j(eVar, "decoder");
        kotlinx.serialization.descriptors.a descriptor = getDescriptor();
        al.c cVarB = eVar.b(descriptor);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        if (cVarB.j()) {
            t10 = (T) b(cVarB);
        } else {
            t10 = null;
            while (true) {
                int iX = cVarB.x(getDescriptor());
                if (iX == -1) {
                    if (t10 != null) {
                        ck.p.h(t10, "null cannot be cast to non-null type T of kotlinx.serialization.internal.AbstractPolymorphicSerializer.deserialize$lambda$3");
                        break;
                    }
                    throw new IllegalArgumentException(("Polymorphic value has not been read for class " + ((String) ref$ObjectRef.element)).toString());
                }
                if (iX == 0) {
                    ref$ObjectRef.element = (T) cVarB.i(getDescriptor(), iX);
                } else {
                    if (iX != 1) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Invalid index in polymorphic deserialization of ");
                        String str = (String) ref$ObjectRef.element;
                        if (str == null) {
                            str = "unknown class";
                        }
                        sb2.append(str);
                        sb2.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                        sb2.append(iX);
                        throw new SerializationException(sb2.toString());
                    }
                    T t11 = ref$ObjectRef.element;
                    if (t11 == 0) {
                        throw new IllegalArgumentException("Cannot read polymorphic value before its type token".toString());
                    }
                    ref$ObjectRef.element = t11;
                    t10 = (T) al.c.a.c(cVarB, getDescriptor(), iX, xk.d.a(this, cVarB, (String) t11), null, 8, null);
                }
            }
        }
        cVarB.c(descriptor);
        return t10;
    }

    @Override // xk.g
    public final void serialize(al.f fVar, T t10) {
        ck.p.j(fVar, "encoder");
        ck.p.j(t10, "value");
        xk.g<? super T> gVarB = xk.d.b(this, fVar, t10);
        kotlinx.serialization.descriptors.a descriptor = getDescriptor();
        al.d dVarB = fVar.b(descriptor);
        dVarB.p(getDescriptor(), 0, gVarB.getDescriptor().h());
        kotlinx.serialization.descriptors.a descriptor2 = getDescriptor();
        ck.p.h(gVarB, "null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        dVarB.m(descriptor2, 1, gVarB, t10);
        dVarB.c(descriptor);
    }

    public final T b(al.c cVar) {
        return (T) al.c.a.c(cVar, getDescriptor(), 1, xk.d.a(this, cVar, cVar.i(getDescriptor(), 0)), null, 8, null);
    }
}
