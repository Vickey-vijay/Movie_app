package yads;

import com.ironsource.Q6;
import java.util.Map;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final class zr1 implements bl.g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zr1 f85576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f85577b;

    static {
        zr1 zr1Var = new zr1();
        f85576a = zr1Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.monetization.ads.base.model.mediation.prefetch.config.MediationPrefetchNetwork", zr1Var, 2);
        pluginGeneratedSerialDescriptor.k(Q6.G1, false);
        pluginGeneratedSerialDescriptor.k("network_data", false);
        f85577b = pluginGeneratedSerialDescriptor;
    }

    @Override // bl.g0
    public final xk.b[] childSerializers() {
        return new xk.b[]{bl.d2.f5397a, cs1.f76413d[1]};
    }

    @Override // xk.a
    public final Object deserialize(al.e eVar) {
        String strI;
        int i10;
        Map map;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f85577b;
        al.c cVarB = eVar.b(pluginGeneratedSerialDescriptor);
        xk.b[] bVarArr = cs1.f76413d;
        if (cVarB.j()) {
            strI = cVarB.i(pluginGeneratedSerialDescriptor, 0);
            map = (Map) cVarB.v(pluginGeneratedSerialDescriptor, 1, bVarArr[1], null);
            i10 = 3;
        } else {
            strI = null;
            Map map2 = null;
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
                    map2 = (Map) cVarB.v(pluginGeneratedSerialDescriptor, 1, bVarArr[1], map2);
                    i10 |= 2;
                }
            }
            map = map2;
        }
        cVarB.c(pluginGeneratedSerialDescriptor);
        return new cs1(i10, strI, map);
    }

    @Override // xk.b, xk.g, xk.a
    public final kotlinx.serialization.descriptors.a getDescriptor() {
        return f85577b;
    }

    @Override // xk.g
    public final void serialize(al.f fVar, Object obj) {
        cs1 cs1Var = (cs1) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f85577b;
        al.d dVarB = fVar.b(pluginGeneratedSerialDescriptor);
        xk.b[] bVarArr = cs1.f76413d;
        dVarB.p(pluginGeneratedSerialDescriptor, 0, cs1Var.f76414b);
        dVarB.m(pluginGeneratedSerialDescriptor, 1, bVarArr[1], cs1Var.f76415c);
        dVarB.c(pluginGeneratedSerialDescriptor);
    }

    @Override // bl.g0
    public final xk.b[] typeParametersSerializers() {
        return bl.g0.a.a(this);
    }
}
