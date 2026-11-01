package yads;

import com.ironsource.Q6;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes11.dex */
public final class gh2 implements bl.g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gh2 f77804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f77805b;

    static {
        gh2 gh2Var = new gh2();
        f77804a = gh2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.monetization.ads.base.model.mediation.prefetch.PrefetchedMediationInfo", gh2Var, 5);
        pluginGeneratedSerialDescriptor.k(Q6.G1, false);
        pluginGeneratedSerialDescriptor.k("network_winner", false);
        pluginGeneratedSerialDescriptor.k("revenue", false);
        pluginGeneratedSerialDescriptor.k("result", false);
        pluginGeneratedSerialDescriptor.k("network_ad_info", false);
        f77805b = pluginGeneratedSerialDescriptor;
    }

    @Override // bl.g0
    public final xk.b[] childSerializers() {
        bl.d2 d2Var = bl.d2.f5397a;
        return new xk.b[]{d2Var, yk.a.t(oh2.f81046a), yk.a.t(ei2.f77086a), yh2.f84966a, yk.a.t(d2Var)};
    }

    @Override // xk.a
    public final Object deserialize(al.e eVar) {
        String str;
        int i10;
        qh2 qh2Var;
        gi2 gi2Var;
        ai2 ai2Var;
        String str2;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f77805b;
        al.c cVarB = eVar.b(pluginGeneratedSerialDescriptor);
        if (cVarB.j()) {
            String strI = cVarB.i(pluginGeneratedSerialDescriptor, 0);
            qh2 qh2Var2 = (qh2) cVarB.p(pluginGeneratedSerialDescriptor, 1, oh2.f81046a, null);
            gi2 gi2Var2 = (gi2) cVarB.p(pluginGeneratedSerialDescriptor, 2, ei2.f77086a, null);
            str = strI;
            ai2Var = (ai2) cVarB.v(pluginGeneratedSerialDescriptor, 3, yh2.f84966a, null);
            str2 = (String) cVarB.p(pluginGeneratedSerialDescriptor, 4, bl.d2.f5397a, null);
            gi2Var = gi2Var2;
            qh2Var = qh2Var2;
            i10 = 31;
        } else {
            String strI2 = null;
            qh2 qh2Var3 = null;
            gi2 gi2Var3 = null;
            ai2 ai2Var2 = null;
            String str3 = null;
            boolean z10 = true;
            int i11 = 0;
            while (z10) {
                int iX = cVarB.x(pluginGeneratedSerialDescriptor);
                if (iX == -1) {
                    z10 = false;
                } else if (iX == 0) {
                    strI2 = cVarB.i(pluginGeneratedSerialDescriptor, 0);
                    i11 |= 1;
                } else if (iX == 1) {
                    qh2Var3 = (qh2) cVarB.p(pluginGeneratedSerialDescriptor, 1, oh2.f81046a, qh2Var3);
                    i11 |= 2;
                } else if (iX == 2) {
                    gi2Var3 = (gi2) cVarB.p(pluginGeneratedSerialDescriptor, 2, ei2.f77086a, gi2Var3);
                    i11 |= 4;
                } else if (iX == 3) {
                    ai2Var2 = (ai2) cVarB.v(pluginGeneratedSerialDescriptor, 3, yh2.f84966a, ai2Var2);
                    i11 |= 8;
                } else {
                    if (iX != 4) {
                        throw new UnknownFieldException(iX);
                    }
                    str3 = (String) cVarB.p(pluginGeneratedSerialDescriptor, 4, bl.d2.f5397a, str3);
                    i11 |= 16;
                }
            }
            str = strI2;
            i10 = i11;
            qh2Var = qh2Var3;
            gi2Var = gi2Var3;
            ai2Var = ai2Var2;
            str2 = str3;
        }
        cVarB.c(pluginGeneratedSerialDescriptor);
        return new ih2(i10, str, qh2Var, gi2Var, ai2Var, str2);
    }

    @Override // xk.b, xk.g, xk.a
    public final kotlinx.serialization.descriptors.a getDescriptor() {
        return f77805b;
    }

    @Override // xk.g
    public final void serialize(al.f fVar, Object obj) {
        ih2 ih2Var = (ih2) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f77805b;
        al.d dVarB = fVar.b(pluginGeneratedSerialDescriptor);
        dVarB.p(pluginGeneratedSerialDescriptor, 0, ih2Var.f78657a);
        dVarB.C(pluginGeneratedSerialDescriptor, 1, oh2.f81046a, ih2Var.f78658b);
        dVarB.C(pluginGeneratedSerialDescriptor, 2, ei2.f77086a, ih2Var.f78659c);
        dVarB.m(pluginGeneratedSerialDescriptor, 3, yh2.f84966a, ih2Var.f78660d);
        dVarB.C(pluginGeneratedSerialDescriptor, 4, bl.d2.f5397a, ih2Var.f78661e);
        dVarB.c(pluginGeneratedSerialDescriptor);
    }

    @Override // bl.g0
    public final xk.b[] typeParametersSerializers() {
        return bl.g0.a.a(this);
    }
}
