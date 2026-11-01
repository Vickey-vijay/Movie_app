package yads;

import com.vungle.ads.internal.ui.AdActivity;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes8.dex */
public final class fu1 implements bl.g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final fu1 f77496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f77497b;

    static {
        fu1 fu1Var = new fu1();
        f77496a = fu1Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.monetization.ads.utils.logger.model.MobileAdsNetworkLog", fu1Var, 2);
        pluginGeneratedSerialDescriptor.k(AdActivity.REQUEST_KEY_EXTRA, false);
        pluginGeneratedSerialDescriptor.k("response", false);
        f77497b = pluginGeneratedSerialDescriptor;
    }

    @Override // bl.g0
    public final xk.b[] childSerializers() {
        return new xk.b[]{ku1.f79571a, yk.a.t(nu1.f80809a)};
    }

    @Override // xk.a
    public final Object deserialize(al.e eVar) {
        int i10;
        pu1 pu1Var;
        mu1 mu1Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f77497b;
        al.c cVarB = eVar.b(pluginGeneratedSerialDescriptor);
        mu1 mu1Var2 = null;
        if (cVarB.j()) {
            mu1Var = (mu1) cVarB.v(pluginGeneratedSerialDescriptor, 0, ku1.f79571a, null);
            pu1Var = (pu1) cVarB.p(pluginGeneratedSerialDescriptor, 1, nu1.f80809a, null);
            i10 = 3;
        } else {
            pu1 pu1Var2 = null;
            int i11 = 0;
            boolean z10 = true;
            while (z10) {
                int iX = cVarB.x(pluginGeneratedSerialDescriptor);
                if (iX == -1) {
                    z10 = false;
                } else if (iX == 0) {
                    mu1Var2 = (mu1) cVarB.v(pluginGeneratedSerialDescriptor, 0, ku1.f79571a, mu1Var2);
                    i11 |= 1;
                } else {
                    if (iX != 1) {
                        throw new UnknownFieldException(iX);
                    }
                    pu1Var2 = (pu1) cVarB.p(pluginGeneratedSerialDescriptor, 1, nu1.f80809a, pu1Var2);
                    i11 |= 2;
                }
            }
            i10 = i11;
            mu1 mu1Var3 = mu1Var2;
            pu1Var = pu1Var2;
            mu1Var = mu1Var3;
        }
        cVarB.c(pluginGeneratedSerialDescriptor);
        return new hu1(i10, mu1Var, pu1Var);
    }

    @Override // xk.b, xk.g, xk.a
    public final kotlinx.serialization.descriptors.a getDescriptor() {
        return f77497b;
    }

    @Override // xk.g
    public final void serialize(al.f fVar, Object obj) {
        hu1 hu1Var = (hu1) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f77497b;
        al.d dVarB = fVar.b(pluginGeneratedSerialDescriptor);
        dVarB.m(pluginGeneratedSerialDescriptor, 0, ku1.f79571a, hu1Var.f78381a);
        dVarB.C(pluginGeneratedSerialDescriptor, 1, nu1.f80809a, hu1Var.f78382b);
        dVarB.c(pluginGeneratedSerialDescriptor);
    }

    @Override // bl.g0
    public final xk.b[] typeParametersSerializers() {
        return bl.g0.a.a(this);
    }
}
