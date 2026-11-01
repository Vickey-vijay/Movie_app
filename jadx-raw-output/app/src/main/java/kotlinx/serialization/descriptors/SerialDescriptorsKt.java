package kotlinx.serialization.descriptors;

import bk.l;
import bl.v1;
import ck.p;
import lk.a0;
import mj.r;
import nj.n;
import zk.e;
import zk.g;

/* JADX INFO: compiled from: SerialDescriptors.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class SerialDescriptorsKt {
    public static final a a(String str, e eVar) {
        p.j(str, "serialName");
        p.j(eVar, "kind");
        if (!a0.n0(str)) {
            return v1.a(str, eVar);
        }
        throw new IllegalArgumentException("Blank serial names are prohibited".toString());
    }

    public static final a b(String str, a[] aVarArr, l<? super zk.a, r> lVar) {
        p.j(str, "serialName");
        p.j(aVarArr, "typeParameters");
        p.j(lVar, "builderAction");
        if (!(!a0.n0(str))) {
            throw new IllegalArgumentException("Blank serial names are prohibited".toString());
        }
        zk.a aVar = new zk.a(str);
        lVar.invoke(aVar);
        return new SerialDescriptorImpl(str, b.a.f63246a, aVar.f().size(), n.q0(aVarArr), aVar);
    }

    public static final a c(String str, g gVar, a[] aVarArr, l<? super zk.a, r> lVar) {
        p.j(str, "serialName");
        p.j(gVar, "kind");
        p.j(aVarArr, "typeParameters");
        p.j(lVar, "builder");
        if (!(!a0.n0(str))) {
            throw new IllegalArgumentException("Blank serial names are prohibited".toString());
        }
        if (!(!p.e(gVar, b.a.f63246a))) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead".toString());
        }
        zk.a aVar = new zk.a(str);
        lVar.invoke(aVar);
        return new SerialDescriptorImpl(str, gVar, aVar.f().size(), n.q0(aVarArr), aVar);
    }

    public static /* synthetic */ a d(String str, g gVar, a[] aVarArr, l lVar, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            lVar = new l<zk.a, r>() { // from class: kotlinx.serialization.descriptors.SerialDescriptorsKt$buildSerialDescriptor$1
                @Override // bk.l
                public /* bridge */ /* synthetic */ r invoke(zk.a aVar) {
                    invoke2(aVar);
                    return r.f64562a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(zk.a aVar) {
                    p.j(aVar, "$this$null");
                }
            };
        }
        return c(str, gVar, aVarArr, lVar);
    }
}
