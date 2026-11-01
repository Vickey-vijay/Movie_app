package yads;

import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes9.dex */
public final class oh2 implements bl.g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final oh2 f81046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f81047b;

    @Override // bl.g0
    public final xk.b[] childSerializers() {
        bl.d2 d2Var = bl.d2.f5397a;
        return new xk.b[]{d2Var, d2Var};
    }

    static {
        oh2 oh2Var = new oh2();
        f81046a = oh2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.monetization.ads.base.model.mediation.prefetch.PrefetchedMediationNetworkWinner", oh2Var, 2);
        pluginGeneratedSerialDescriptor.k("name", false);
        pluginGeneratedSerialDescriptor.k("network_ad_unit", false);
        f81047b = pluginGeneratedSerialDescriptor;
    }

    @Override // xk.a
    public final Object deserialize(al.e eVar) {
        String strI;
        String strI2;
        int i10;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f81047b;
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
        return new qh2(i10, strI, strI2);
    }

    @Override // xk.b, xk.g, xk.a
    public final kotlinx.serialization.descriptors.a getDescriptor() {
        return f81047b;
    }

    @Override // xk.g
    public final void serialize(al.f fVar, Object obj) {
        qh2 qh2Var = (qh2) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f81047b;
        al.d dVarB = fVar.b(pluginGeneratedSerialDescriptor);
        dVarB.p(pluginGeneratedSerialDescriptor, 0, qh2Var.f81852a);
        dVarB.p(pluginGeneratedSerialDescriptor, 1, qh2Var.f81853b);
        dVarB.c(pluginGeneratedSerialDescriptor);
    }

    @Override // bl.g0
    public final xk.b[] typeParametersSerializers() {
        return bl.g0.a.a(this);
    }
}
