package bl;

import java.util.Arrays;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: compiled from: InlineClassDescriptor.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class l0 extends PluginGeneratedSerialDescriptor {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f5435m;

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l0) {
            kotlinx.serialization.descriptors.a aVar = (kotlinx.serialization.descriptors.a) obj;
            if (ck.p.e(h(), aVar.h())) {
                l0 l0Var = (l0) obj;
                if ((l0Var.isInline() && Arrays.equals(o(), l0Var.o())) && e() == aVar.e()) {
                    int iE = e();
                    for (int i10 = 0; i10 < iE; i10++) {
                        if (ck.p.e(d(i10).h(), aVar.d(i10).h()) && ck.p.e(d(i10).getKind(), aVar.d(i10).getKind())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(String str, g0<?> g0Var) {
        super(str, g0Var, 1);
        ck.p.j(str, "name");
        ck.p.j(g0Var, "generatedSerializer");
        this.f5435m = true;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor, kotlinx.serialization.descriptors.a
    public boolean isInline() {
        return this.f5435m;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public int hashCode() {
        return super.hashCode() * 31;
    }
}
