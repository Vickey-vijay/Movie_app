package yads;

import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final class yq1 implements bl.g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final yq1 f85088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f85089b;

    static {
        yq1 yq1Var = new yq1();
        f85088a = yq1Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.monetization.ads.core.initializer.validation.adapters.MediationNetworkData.MediationAdapterData", yq1Var, 3);
        pluginGeneratedSerialDescriptor.k("format", false);
        pluginGeneratedSerialDescriptor.k("version", false);
        pluginGeneratedSerialDescriptor.k("isIntegrated", false);
        f85089b = pluginGeneratedSerialDescriptor;
    }

    @Override // bl.g0
    public final xk.b[] childSerializers() {
        bl.d2 d2Var = bl.d2.f5397a;
        return new xk.b[]{d2Var, yk.a.t(d2Var), bl.i.f5416a};
    }

    @Override // xk.a
    public final Object deserialize(al.e eVar) {
        boolean zD;
        int i10;
        String str;
        String strI;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f85089b;
        al.c cVarB = eVar.b(pluginGeneratedSerialDescriptor);
        String strI2 = null;
        if (cVarB.j()) {
            strI = cVarB.i(pluginGeneratedSerialDescriptor, 0);
            str = (String) cVarB.p(pluginGeneratedSerialDescriptor, 1, bl.d2.f5397a, null);
            zD = cVarB.D(pluginGeneratedSerialDescriptor, 2);
            i10 = 7;
        } else {
            String str2 = null;
            boolean zD2 = false;
            int i11 = 0;
            boolean z10 = true;
            while (z10) {
                int iX = cVarB.x(pluginGeneratedSerialDescriptor);
                if (iX == -1) {
                    z10 = false;
                } else if (iX == 0) {
                    strI2 = cVarB.i(pluginGeneratedSerialDescriptor, 0);
                    i11 |= 1;
                } else if (iX == 1) {
                    str2 = (String) cVarB.p(pluginGeneratedSerialDescriptor, 1, bl.d2.f5397a, str2);
                    i11 |= 2;
                } else {
                    if (iX != 2) {
                        throw new UnknownFieldException(iX);
                    }
                    zD2 = cVarB.D(pluginGeneratedSerialDescriptor, 2);
                    i11 |= 4;
                }
            }
            zD = zD2;
            i10 = i11;
            String str3 = strI2;
            str = str2;
            strI = str3;
        }
        cVarB.c(pluginGeneratedSerialDescriptor);
        return new ar1(i10, strI, str, zD);
    }

    @Override // xk.b, xk.g, xk.a
    public final kotlinx.serialization.descriptors.a getDescriptor() {
        return f85089b;
    }

    @Override // xk.g
    public final void serialize(al.f fVar, Object obj) {
        ar1 ar1Var = (ar1) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f85089b;
        al.d dVarB = fVar.b(pluginGeneratedSerialDescriptor);
        dVarB.p(pluginGeneratedSerialDescriptor, 0, ar1Var.f75608a);
        dVarB.C(pluginGeneratedSerialDescriptor, 1, bl.d2.f5397a, ar1Var.f75609b);
        dVarB.o(pluginGeneratedSerialDescriptor, 2, ar1Var.f75610c);
        dVarB.c(pluginGeneratedSerialDescriptor);
    }

    @Override // bl.g0
    public final xk.b[] typeParametersSerializers() {
        return bl.g0.a.a(this);
    }
}
