package yads;

import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes9.dex */
public final class fa0 implements bl.g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final fa0 f77340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f77341b;

    @Override // bl.g0
    public final xk.b[] childSerializers() {
        return new xk.b[]{bl.d2.f5397a, bl.z.f5492a};
    }

    static {
        fa0 fa0Var = new fa0();
        f77340a = fa0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.mobile.ads.features.debugpanel.data.remote.model.DebugPanelWaterfallCpmFloor", fa0Var, 2);
        pluginGeneratedSerialDescriptor.k("network_ad_unit_id", false);
        pluginGeneratedSerialDescriptor.k("min_cpm", false);
        f77341b = pluginGeneratedSerialDescriptor;
    }

    @Override // xk.a
    public final Object deserialize(al.e eVar) {
        String strI;
        double dG;
        int i10;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f77341b;
        al.c cVarB = eVar.b(pluginGeneratedSerialDescriptor);
        if (cVarB.j()) {
            strI = cVarB.i(pluginGeneratedSerialDescriptor, 0);
            dG = cVarB.G(pluginGeneratedSerialDescriptor, 1);
            i10 = 3;
        } else {
            strI = null;
            double dG2 = 0.0d;
            int i11 = 0;
            boolean z10 = true;
            while (z10) {
                int iX = cVarB.x(pluginGeneratedSerialDescriptor);
                if (iX == -1) {
                    z10 = false;
                } else if (iX == 0) {
                    strI = cVarB.i(pluginGeneratedSerialDescriptor, 0);
                    i11 |= 1;
                } else {
                    if (iX != 1) {
                        throw new UnknownFieldException(iX);
                    }
                    dG2 = cVarB.G(pluginGeneratedSerialDescriptor, 1);
                    i11 |= 2;
                }
            }
            dG = dG2;
            i10 = i11;
        }
        cVarB.c(pluginGeneratedSerialDescriptor);
        return new ha0(i10, strI, dG);
    }

    @Override // xk.b, xk.g, xk.a
    public final kotlinx.serialization.descriptors.a getDescriptor() {
        return f77341b;
    }

    @Override // xk.g
    public final void serialize(al.f fVar, Object obj) {
        ha0 ha0Var = (ha0) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f77341b;
        al.d dVarB = fVar.b(pluginGeneratedSerialDescriptor);
        dVarB.p(pluginGeneratedSerialDescriptor, 0, ha0Var.f78151a);
        dVarB.G(pluginGeneratedSerialDescriptor, 1, ha0Var.f78152b);
        dVarB.c(pluginGeneratedSerialDescriptor);
    }

    @Override // bl.g0
    public final xk.b[] typeParametersSerializers() {
        return bl.g0.a.a(this);
    }
}
