package yads;

import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final class ia0 implements bl.g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ia0 f78542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f78543b;

    @Override // bl.g0
    public final xk.b[] childSerializers() {
        bl.d2 d2Var = bl.d2.f5397a;
        return new xk.b[]{d2Var, d2Var};
    }

    static {
        ia0 ia0Var = new ia0();
        f78542a = ia0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.mobile.ads.features.debugpanel.data.remote.model.DebugPanelWaterfallCurrency", ia0Var, 2);
        pluginGeneratedSerialDescriptor.k("name", false);
        pluginGeneratedSerialDescriptor.k("symbol", false);
        f78543b = pluginGeneratedSerialDescriptor;
    }

    @Override // xk.a
    public final Object deserialize(al.e eVar) {
        String strI;
        String strI2;
        int i10;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f78543b;
        al.c cVarB = eVar.b(pluginGeneratedSerialDescriptor);
        if (cVarB.j()) {
            strI = cVarB.i(pluginGeneratedSerialDescriptor, 0);
            strI2 = cVarB.i(pluginGeneratedSerialDescriptor, 1);
            i10 = 3;
        } else {
            strI = null;
            String strI3 = null;
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
                    strI3 = cVarB.i(pluginGeneratedSerialDescriptor, 1);
                    i11 |= 2;
                }
            }
            strI2 = strI3;
            i10 = i11;
        }
        cVarB.c(pluginGeneratedSerialDescriptor);
        return new ka0(i10, strI, strI2);
    }

    @Override // xk.b, xk.g, xk.a
    public final kotlinx.serialization.descriptors.a getDescriptor() {
        return f78543b;
    }

    @Override // xk.g
    public final void serialize(al.f fVar, Object obj) {
        ka0 ka0Var = (ka0) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f78543b;
        al.d dVarB = fVar.b(pluginGeneratedSerialDescriptor);
        dVarB.p(pluginGeneratedSerialDescriptor, 0, ka0Var.f79348a);
        dVarB.p(pluginGeneratedSerialDescriptor, 1, ka0Var.f79349b);
        dVarB.c(pluginGeneratedSerialDescriptor);
    }

    @Override // bl.g0
    public final xk.b[] typeParametersSerializers() {
        return bl.g0.a.a(this);
    }
}
