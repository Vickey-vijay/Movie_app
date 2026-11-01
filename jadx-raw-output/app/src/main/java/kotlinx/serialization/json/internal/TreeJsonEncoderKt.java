package kotlinx.serialization.json.internal;

import bk.l;
import ck.p;
import dl.m0;
import kotlin.jvm.internal.Ref$ObjectRef;
import mj.r;
import xk.g;
import zk.e;

/* JADX INFO: compiled from: TreeJsonEncoder.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class TreeJsonEncoderKt {
    public static final <T> kotlinx.serialization.json.b c(cl.a aVar, T t10, g<? super T> gVar) {
        p.j(aVar, "<this>");
        p.j(gVar, "serializer");
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        new m0(aVar, new l<kotlinx.serialization.json.b, r>() { // from class: kotlinx.serialization.json.internal.TreeJsonEncoderKt$writeJson$encoder$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // bk.l
            public /* bridge */ /* synthetic */ r invoke(kotlinx.serialization.json.b bVar) {
                invoke2(bVar);
                return r.f64562a;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(kotlinx.serialization.json.b bVar) {
                p.j(bVar, "it");
                ref$ObjectRef.element = bVar;
            }
        }).F(gVar, t10);
        T t11 = ref$ObjectRef.element;
        if (t11 != null) {
            return (kotlinx.serialization.json.b) t11;
        }
        p.B("result");
        return null;
    }

    public static final boolean b(kotlinx.serialization.descriptors.a aVar) {
        if (!(aVar.getKind() instanceof e) && aVar.getKind() != zk.g.b.f86476a) {
            return false;
        }
        return true;
    }
}
