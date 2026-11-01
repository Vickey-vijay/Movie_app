package kotlinx.serialization;

import bk.a;
import bk.l;
import bl.b;
import ck.p;
import ck.w;
import java.lang.annotation.Annotation;
import java.util.List;
import jk.c;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import mj.g;
import mj.r;
import nj.s;
import zk.d;

/* JADX INFO: compiled from: PolymorphicSerializer.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class PolymorphicSerializer<T> extends b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c<T> f63227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<? extends Annotation> f63228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f63229c;

    public PolymorphicSerializer(c<T> cVar) {
        p.j(cVar, "baseClass");
        this.f63227a = cVar;
        this.f63228b = s.k();
        this.f63229c = kotlin.b.b(LazyThreadSafetyMode.PUBLICATION, new a<kotlinx.serialization.descriptors.a>(this) { // from class: kotlinx.serialization.PolymorphicSerializer$descriptor$2
            public final /* synthetic */ PolymorphicSerializer<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // bk.a
            public final kotlinx.serialization.descriptors.a invoke() {
                final PolymorphicSerializer<T> polymorphicSerializer = this.this$0;
                return zk.b.c(SerialDescriptorsKt.c("kotlinx.serialization.Polymorphic", d.a.f86458a, new kotlinx.serialization.descriptors.a[0], new l<zk.a, r>() { // from class: kotlinx.serialization.PolymorphicSerializer$descriptor$2.1
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
                        zk.a.b(aVar, "type", yk.a.C(w.f6066a).getDescriptor(), null, false, 12, null);
                        zk.a.b(aVar, "value", SerialDescriptorsKt.d("kotlinx.serialization.Polymorphic<" + polymorphicSerializer.e().i() + '>', zk.g.a.f86475a, new kotlinx.serialization.descriptors.a[0], null, 8, null), null, false, 12, null);
                        aVar.h(polymorphicSerializer.f63228b);
                    }
                }), this.this$0.e());
            }
        });
    }

    @Override // bl.b
    public c<T> e() {
        return this.f63227a;
    }

    @Override // xk.b, xk.g, xk.a
    public kotlinx.serialization.descriptors.a getDescriptor() {
        return (kotlinx.serialization.descriptors.a) this.f63229c.getValue();
    }

    public String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + e() + ')';
    }
}
