package dl;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.List;
import kotlinx.serialization.modules.SerializersModuleCollector;

/* JADX INFO: compiled from: PolymorphismValidator.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class t0 implements SerializersModuleCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f52193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f52194b;

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    public <Base> void a(jk.c<Base> cVar, bk.l<? super Base, ? extends xk.g<? super Base>> lVar) {
        ck.p.j(cVar, "baseClass");
        ck.p.j(lVar, "defaultSerializerProvider");
    }

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    public <Base> void c(jk.c<Base> cVar, bk.l<? super String, ? extends xk.a<? extends Base>> lVar) {
        ck.p.j(cVar, "baseClass");
        ck.p.j(lVar, "defaultDeserializerProvider");
    }

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    public <T> void e(jk.c<T> cVar, bk.l<? super List<? extends xk.b<?>>, ? extends xk.b<?>> lVar) {
        ck.p.j(cVar, "kClass");
        ck.p.j(lVar, IronSourceConstants.EVENTS_PROVIDER);
    }

    public t0(boolean z10, String str) {
        ck.p.j(str, "discriminator");
        this.f52193a = z10;
        this.f52194b = str;
    }

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    public <Base, Sub extends Base> void d(jk.c<Base> cVar, jk.c<Sub> cVar2, xk.b<Sub> bVar) {
        ck.p.j(cVar, "baseClass");
        ck.p.j(cVar2, "actualClass");
        ck.p.j(bVar, "actualSerializer");
        kotlinx.serialization.descriptors.a descriptor = bVar.getDescriptor();
        g(descriptor, cVar2);
        if (this.f52193a) {
            return;
        }
        f(descriptor, cVar2);
    }

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    public <T> void b(jk.c<T> cVar, xk.b<T> bVar) {
        SerializersModuleCollector.DefaultImpls.a(this, cVar, bVar);
    }

    public final void f(kotlinx.serialization.descriptors.a aVar, jk.c<?> cVar) {
        int iE = aVar.e();
        for (int i10 = 0; i10 < iE; i10++) {
            String strF = aVar.f(i10);
            if (ck.p.e(strF, this.f52194b)) {
                throw new IllegalArgumentException("Polymorphic serializer for " + cVar + " has property '" + strF + "' that conflicts with JSON class discriminator. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
            }
        }
    }

    public final void g(kotlinx.serialization.descriptors.a aVar, jk.c<?> cVar) {
        zk.g kind = aVar.getKind();
        if (!(kind instanceof zk.d) && !ck.p.e(kind, zk.g.a.f86475a)) {
            if (this.f52193a) {
                return;
            }
            if (!ck.p.e(kind, kotlinx.serialization.descriptors.b.C0567b.f63247a) && !ck.p.e(kind, kotlinx.serialization.descriptors.b.c.f63248a) && !(kind instanceof zk.e) && !(kind instanceof zk.g.b)) {
                return;
            }
            throw new IllegalArgumentException("Serializer for " + cVar.i() + " of kind " + kind + " cannot be serialized polymorphically with class discriminator.");
        }
        throw new IllegalArgumentException("Serializer for " + cVar.i() + " can't be registered as a subclass for polymorphic serialization because its kind " + kind + " is not concrete. To work with multiple hierarchies, register it as a base class.");
    }
}
