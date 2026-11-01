package yads;

import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final class ds1 implements bl.g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ds1 f76791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f76792b;

    static {
        ds1 ds1Var = new ds1();
        f76791a = ds1Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.monetization.ads.base.model.mediation.prefetch.config.MediationPrefetchSettings", ds1Var, 2);
        pluginGeneratedSerialDescriptor.k("load_timeout_millis", true);
        pluginGeneratedSerialDescriptor.k("mediation_prefetch_ad_units", true);
        f76792b = pluginGeneratedSerialDescriptor;
    }

    @Override // bl.g0
    public final xk.b[] childSerializers() {
        return new xk.b[]{bl.a1.f5375a, gs1.f77919d[1]};
    }

    @Override // xk.a
    public final Object deserialize(al.e eVar) {
        int i10;
        List list;
        long jE;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f76792b;
        al.c cVarB = eVar.b(pluginGeneratedSerialDescriptor);
        xk.b[] bVarArr = gs1.f77919d;
        List list2 = null;
        if (cVarB.j()) {
            jE = cVarB.e(pluginGeneratedSerialDescriptor, 0);
            list = (List) cVarB.v(pluginGeneratedSerialDescriptor, 1, bVarArr[1], null);
            i10 = 3;
        } else {
            long jE2 = 0;
            int i11 = 0;
            boolean z10 = true;
            while (z10) {
                int iX = cVarB.x(pluginGeneratedSerialDescriptor);
                if (iX == -1) {
                    z10 = false;
                } else if (iX == 0) {
                    jE2 = cVarB.e(pluginGeneratedSerialDescriptor, 0);
                    i11 |= 1;
                } else {
                    if (iX != 1) {
                        throw new UnknownFieldException(iX);
                    }
                    list2 = (List) cVarB.v(pluginGeneratedSerialDescriptor, 1, bVarArr[1], list2);
                    i11 |= 2;
                }
            }
            i10 = i11;
            list = list2;
            jE = jE2;
        }
        cVarB.c(pluginGeneratedSerialDescriptor);
        return new gs1(i10, jE, list);
    }

    @Override // xk.b, xk.g, xk.a
    public final kotlinx.serialization.descriptors.a getDescriptor() {
        return f76792b;
    }

    @Override // xk.g
    public final void serialize(al.f fVar, Object obj) {
        gs1 gs1Var = (gs1) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f76792b;
        al.d dVarB = fVar.b(pluginGeneratedSerialDescriptor);
        xk.b[] bVarArr = gs1.f77919d;
        if (dVarB.q(pluginGeneratedSerialDescriptor, 0) || gs1Var.f77920b != 30000) {
            dVarB.u(pluginGeneratedSerialDescriptor, 0, gs1Var.f77920b);
        }
        if (dVarB.q(pluginGeneratedSerialDescriptor, 1) || !ck.p.e(gs1Var.f77921c, nj.s.k())) {
            dVarB.m(pluginGeneratedSerialDescriptor, 1, bVarArr[1], gs1Var.f77921c);
        }
        dVarB.c(pluginGeneratedSerialDescriptor);
    }

    @Override // bl.g0
    public final xk.b[] typeParametersSerializers() {
        return bl.g0.a.a(this);
    }
}
