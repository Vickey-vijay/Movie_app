package yads;

import com.ironsource.Q6;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final class ur1 implements bl.g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ur1 f83586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f83587b;

    static {
        ur1 ur1Var = new ur1();
        f83586a = ur1Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.monetization.ads.base.model.mediation.prefetch.config.MediationPrefetchAdUnit", ur1Var, 2);
        pluginGeneratedSerialDescriptor.k("ad_unit_id", false);
        pluginGeneratedSerialDescriptor.k(Q6.E1, false);
        f83587b = pluginGeneratedSerialDescriptor;
    }

    @Override // bl.g0
    public final xk.b[] childSerializers() {
        return new xk.b[]{bl.d2.f5397a, xr1.f84677d[1]};
    }

    @Override // xk.a
    public final Object deserialize(al.e eVar) {
        String strI;
        int i10;
        List list;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f83587b;
        al.c cVarB = eVar.b(pluginGeneratedSerialDescriptor);
        xk.b[] bVarArr = xr1.f84677d;
        if (cVarB.j()) {
            strI = cVarB.i(pluginGeneratedSerialDescriptor, 0);
            list = (List) cVarB.v(pluginGeneratedSerialDescriptor, 1, bVarArr[1], null);
            i10 = 3;
        } else {
            strI = null;
            List list2 = null;
            i10 = 0;
            boolean z10 = true;
            while (z10) {
                int iX = cVarB.x(pluginGeneratedSerialDescriptor);
                if (iX == -1) {
                    z10 = false;
                } else if (iX == 0) {
                    strI = cVarB.i(pluginGeneratedSerialDescriptor, 0);
                    i10 |= 1;
                } else {
                    if (iX != 1) {
                        throw new UnknownFieldException(iX);
                    }
                    list2 = (List) cVarB.v(pluginGeneratedSerialDescriptor, 1, bVarArr[1], list2);
                    i10 |= 2;
                }
            }
            list = list2;
        }
        cVarB.c(pluginGeneratedSerialDescriptor);
        return new xr1(i10, strI, list);
    }

    @Override // xk.b, xk.g, xk.a
    public final kotlinx.serialization.descriptors.a getDescriptor() {
        return f83587b;
    }

    @Override // xk.g
    public final void serialize(al.f fVar, Object obj) {
        xr1 xr1Var = (xr1) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f83587b;
        al.d dVarB = fVar.b(pluginGeneratedSerialDescriptor);
        xk.b[] bVarArr = xr1.f84677d;
        dVarB.p(pluginGeneratedSerialDescriptor, 0, xr1Var.f84678b);
        dVarB.m(pluginGeneratedSerialDescriptor, 1, bVarArr[1], xr1Var.f84679c);
        dVarB.c(pluginGeneratedSerialDescriptor);
    }

    @Override // bl.g0
    public final xk.b[] typeParametersSerializers() {
        return bl.g0.a.a(this);
    }
}
