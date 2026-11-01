package yads;

import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes5.dex */
public final class k50 implements bl.g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k50 f79307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f79308b;

    @Override // bl.g0
    public final xk.b[] childSerializers() {
        bl.d2 d2Var = bl.d2.f5397a;
        return new xk.b[]{d2Var, d2Var, d2Var, d2Var};
    }

    static {
        k50 k50Var = new k50();
        f79307a = k50Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.mobile.ads.features.debugpanel.data.local.model.DebugPanelAppData", k50Var, 4);
        pluginGeneratedSerialDescriptor.k("app_id", false);
        pluginGeneratedSerialDescriptor.k("app_version", false);
        pluginGeneratedSerialDescriptor.k("system", false);
        pluginGeneratedSerialDescriptor.k("api_level", false);
        f79308b = pluginGeneratedSerialDescriptor;
    }

    @Override // xk.a
    public final Object deserialize(al.e eVar) {
        String str;
        String strI;
        String str2;
        String str3;
        int i10;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f79308b;
        al.c cVarB = eVar.b(pluginGeneratedSerialDescriptor);
        if (cVarB.j()) {
            String strI2 = cVarB.i(pluginGeneratedSerialDescriptor, 0);
            String strI3 = cVarB.i(pluginGeneratedSerialDescriptor, 1);
            String strI4 = cVarB.i(pluginGeneratedSerialDescriptor, 2);
            str = strI2;
            strI = cVarB.i(pluginGeneratedSerialDescriptor, 3);
            str2 = strI4;
            str3 = strI3;
            i10 = 15;
        } else {
            String strI5 = null;
            String strI6 = null;
            String strI7 = null;
            String strI8 = null;
            int i11 = 0;
            boolean z10 = true;
            while (z10) {
                int iX = cVarB.x(pluginGeneratedSerialDescriptor);
                if (iX == -1) {
                    z10 = false;
                } else if (iX == 0) {
                    strI5 = cVarB.i(pluginGeneratedSerialDescriptor, 0);
                    i11 |= 1;
                } else if (iX == 1) {
                    strI8 = cVarB.i(pluginGeneratedSerialDescriptor, 1);
                    i11 |= 2;
                } else if (iX == 2) {
                    strI7 = cVarB.i(pluginGeneratedSerialDescriptor, 2);
                    i11 |= 4;
                } else {
                    if (iX != 3) {
                        throw new UnknownFieldException(iX);
                    }
                    strI6 = cVarB.i(pluginGeneratedSerialDescriptor, 3);
                    i11 |= 8;
                }
            }
            str = strI5;
            strI = strI6;
            str2 = strI7;
            str3 = strI8;
            i10 = i11;
        }
        cVarB.c(pluginGeneratedSerialDescriptor);
        return new m50(i10, str, str3, str2, strI);
    }

    @Override // xk.b, xk.g, xk.a
    public final kotlinx.serialization.descriptors.a getDescriptor() {
        return f79308b;
    }

    @Override // xk.g
    public final void serialize(al.f fVar, Object obj) {
        m50 m50Var = (m50) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f79308b;
        al.d dVarB = fVar.b(pluginGeneratedSerialDescriptor);
        dVarB.p(pluginGeneratedSerialDescriptor, 0, m50Var.f80084a);
        dVarB.p(pluginGeneratedSerialDescriptor, 1, m50Var.f80085b);
        dVarB.p(pluginGeneratedSerialDescriptor, 2, m50Var.f80086c);
        dVarB.p(pluginGeneratedSerialDescriptor, 3, m50Var.f80087d);
        dVarB.c(pluginGeneratedSerialDescriptor);
    }

    @Override // bl.g0
    public final xk.b[] typeParametersSerializers() {
        return bl.g0.a.a(this);
    }
}
