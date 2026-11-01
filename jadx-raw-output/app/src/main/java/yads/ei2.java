package yads;

import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes5.dex */
public final class ei2 implements bl.g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ei2 f77086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f77087b;

    @Override // bl.g0
    public final xk.b[] childSerializers() {
        return new xk.b[]{bl.z.f5492a};
    }

    static {
        ei2 ei2Var = new ei2();
        f77086a = ei2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.monetization.ads.base.model.mediation.prefetch.PrefetchedMediationRevenue", ei2Var, 1);
        pluginGeneratedSerialDescriptor.k("value", false);
        f77087b = pluginGeneratedSerialDescriptor;
    }

    @Override // xk.a
    public final Object deserialize(al.e eVar) {
        double dG;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f77087b;
        al.c cVarB = eVar.b(pluginGeneratedSerialDescriptor);
        int i10 = 1;
        if (cVarB.j()) {
            dG = cVarB.G(pluginGeneratedSerialDescriptor, 0);
        } else {
            double dG2 = 0.0d;
            boolean z10 = true;
            int i11 = 0;
            while (z10) {
                int iX = cVarB.x(pluginGeneratedSerialDescriptor);
                if (iX == -1) {
                    z10 = false;
                } else {
                    if (iX != 0) {
                        throw new UnknownFieldException(iX);
                    }
                    dG2 = cVarB.G(pluginGeneratedSerialDescriptor, 0);
                    i11 = 1;
                }
            }
            dG = dG2;
            i10 = i11;
        }
        cVarB.c(pluginGeneratedSerialDescriptor);
        return new gi2(i10, dG);
    }

    @Override // xk.b, xk.g, xk.a
    public final kotlinx.serialization.descriptors.a getDescriptor() {
        return f77087b;
    }

    @Override // xk.g
    public final void serialize(al.f fVar, Object obj) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f77087b;
        al.d dVarB = fVar.b(pluginGeneratedSerialDescriptor);
        dVarB.G(pluginGeneratedSerialDescriptor, 0, ((gi2) obj).f77815a);
        dVarB.c(pluginGeneratedSerialDescriptor);
    }

    @Override // bl.g0
    public final xk.b[] typeParametersSerializers() {
        return bl.g0.a.a(this);
    }
}
