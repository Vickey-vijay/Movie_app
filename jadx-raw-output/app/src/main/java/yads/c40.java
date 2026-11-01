package yads;

import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes10.dex */
public final class c40 implements bl.g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c40 f76152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f76153b;

    static {
        c40 c40Var = new c40();
        f76152a = c40Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.mobile.ads.features.debugpanel.data.remote.model.DebugPanelAdUnit", c40Var, 4);
        pluginGeneratedSerialDescriptor.k("name", false);
        pluginGeneratedSerialDescriptor.k("ad_type", false);
        pluginGeneratedSerialDescriptor.k("ad_unit_id", false);
        pluginGeneratedSerialDescriptor.k("mediation", true);
        f76153b = pluginGeneratedSerialDescriptor;
    }

    @Override // bl.g0
    public final xk.b[] childSerializers() {
        xk.b bVarT = yk.a.t(k40.f79295a);
        bl.d2 d2Var = bl.d2.f5397a;
        return new xk.b[]{d2Var, d2Var, d2Var, bVarT};
    }

    @Override // xk.a
    public final Object deserialize(al.e eVar) {
        String str;
        int i10;
        String str2;
        String str3;
        m40 m40Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f76153b;
        al.c cVarB = eVar.b(pluginGeneratedSerialDescriptor);
        if (cVarB.j()) {
            String strI = cVarB.i(pluginGeneratedSerialDescriptor, 0);
            String strI2 = cVarB.i(pluginGeneratedSerialDescriptor, 1);
            String strI3 = cVarB.i(pluginGeneratedSerialDescriptor, 2);
            str = strI;
            m40Var = (m40) cVarB.p(pluginGeneratedSerialDescriptor, 3, k40.f79295a, null);
            str3 = strI3;
            i10 = 15;
            str2 = strI2;
        } else {
            String strI4 = null;
            String strI5 = null;
            String strI6 = null;
            m40 m40Var2 = null;
            int i11 = 0;
            boolean z10 = true;
            while (z10) {
                int iX = cVarB.x(pluginGeneratedSerialDescriptor);
                if (iX == -1) {
                    z10 = false;
                } else if (iX == 0) {
                    strI4 = cVarB.i(pluginGeneratedSerialDescriptor, 0);
                    i11 |= 1;
                } else if (iX == 1) {
                    strI5 = cVarB.i(pluginGeneratedSerialDescriptor, 1);
                    i11 |= 2;
                } else if (iX == 2) {
                    strI6 = cVarB.i(pluginGeneratedSerialDescriptor, 2);
                    i11 |= 4;
                } else {
                    if (iX != 3) {
                        throw new UnknownFieldException(iX);
                    }
                    m40Var2 = (m40) cVarB.p(pluginGeneratedSerialDescriptor, 3, k40.f79295a, m40Var2);
                    i11 |= 8;
                }
            }
            str = strI4;
            i10 = i11;
            str2 = strI5;
            str3 = strI6;
            m40Var = m40Var2;
        }
        cVarB.c(pluginGeneratedSerialDescriptor);
        return new e40(i10, str, str2, str3, m40Var);
    }

    @Override // xk.b, xk.g, xk.a
    public final kotlinx.serialization.descriptors.a getDescriptor() {
        return f76153b;
    }

    @Override // xk.g
    public final void serialize(al.f fVar, Object obj) {
        e40 e40Var = (e40) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f76153b;
        al.d dVarB = fVar.b(pluginGeneratedSerialDescriptor);
        dVarB.p(pluginGeneratedSerialDescriptor, 0, e40Var.f76908a);
        dVarB.p(pluginGeneratedSerialDescriptor, 1, e40Var.f76909b);
        dVarB.p(pluginGeneratedSerialDescriptor, 2, e40Var.f76910c);
        if (dVarB.q(pluginGeneratedSerialDescriptor, 3) || e40Var.f76911d != null) {
            dVarB.C(pluginGeneratedSerialDescriptor, 3, k40.f79295a, e40Var.f76911d);
        }
        dVarB.c(pluginGeneratedSerialDescriptor);
    }

    @Override // bl.g0
    public final xk.b[] typeParametersSerializers() {
        return bl.g0.a.a(this);
    }
}
