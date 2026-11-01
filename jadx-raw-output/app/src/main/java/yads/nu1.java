package yads;

import java.util.Map;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes10.dex */
public final class nu1 implements bl.g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final nu1 f80809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f80810b;

    static {
        nu1 nu1Var = new nu1();
        f80809a = nu1Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.monetization.ads.utils.logger.model.MobileAdsNetworkResponseLog", nu1Var, 4);
        pluginGeneratedSerialDescriptor.k("timestamp", false);
        pluginGeneratedSerialDescriptor.k("code", false);
        pluginGeneratedSerialDescriptor.k("headers", false);
        pluginGeneratedSerialDescriptor.k("body", false);
        f80810b = pluginGeneratedSerialDescriptor;
    }

    @Override // bl.g0
    public final xk.b[] childSerializers() {
        return new xk.b[]{bl.a1.f5375a, yk.a.t(bl.p0.f5452a), yk.a.t(pu1.f81600e[2]), yk.a.t(bl.d2.f5397a)};
    }

    @Override // xk.a
    public final Object deserialize(al.e eVar) {
        Integer num;
        int i10;
        Map map;
        String str;
        long j10;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f80810b;
        al.c cVarB = eVar.b(pluginGeneratedSerialDescriptor);
        xk.b[] bVarArr = pu1.f81600e;
        if (cVarB.j()) {
            long jE = cVarB.e(pluginGeneratedSerialDescriptor, 0);
            Integer num2 = (Integer) cVarB.p(pluginGeneratedSerialDescriptor, 1, bl.p0.f5452a, null);
            map = (Map) cVarB.p(pluginGeneratedSerialDescriptor, 2, bVarArr[2], null);
            num = num2;
            str = (String) cVarB.p(pluginGeneratedSerialDescriptor, 3, bl.d2.f5397a, null);
            i10 = 15;
            j10 = jE;
        } else {
            Integer num3 = null;
            boolean z10 = true;
            long jE2 = 0;
            Map map2 = null;
            String str2 = null;
            int i11 = 0;
            while (z10) {
                int iX = cVarB.x(pluginGeneratedSerialDescriptor);
                if (iX == -1) {
                    z10 = false;
                } else if (iX == 0) {
                    jE2 = cVarB.e(pluginGeneratedSerialDescriptor, 0);
                    i11 |= 1;
                } else if (iX == 1) {
                    num3 = (Integer) cVarB.p(pluginGeneratedSerialDescriptor, 1, bl.p0.f5452a, num3);
                    i11 |= 2;
                } else if (iX == 2) {
                    map2 = (Map) cVarB.p(pluginGeneratedSerialDescriptor, 2, bVarArr[2], map2);
                    i11 |= 4;
                } else {
                    if (iX != 3) {
                        throw new UnknownFieldException(iX);
                    }
                    str2 = (String) cVarB.p(pluginGeneratedSerialDescriptor, 3, bl.d2.f5397a, str2);
                    i11 |= 8;
                }
            }
            num = num3;
            i10 = i11;
            map = map2;
            str = str2;
            j10 = jE2;
        }
        cVarB.c(pluginGeneratedSerialDescriptor);
        return new pu1(i10, j10, num, map, str);
    }

    @Override // xk.b, xk.g, xk.a
    public final kotlinx.serialization.descriptors.a getDescriptor() {
        return f80810b;
    }

    @Override // xk.g
    public final void serialize(al.f fVar, Object obj) {
        pu1 pu1Var = (pu1) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f80810b;
        al.d dVarB = fVar.b(pluginGeneratedSerialDescriptor);
        xk.b[] bVarArr = pu1.f81600e;
        dVarB.u(pluginGeneratedSerialDescriptor, 0, pu1Var.f81601a);
        dVarB.C(pluginGeneratedSerialDescriptor, 1, bl.p0.f5452a, pu1Var.f81602b);
        dVarB.C(pluginGeneratedSerialDescriptor, 2, bVarArr[2], pu1Var.f81603c);
        dVarB.C(pluginGeneratedSerialDescriptor, 3, bl.d2.f5397a, pu1Var.f81604d);
        dVarB.c(pluginGeneratedSerialDescriptor);
    }

    @Override // bl.g0
    public final xk.b[] typeParametersSerializers() {
        return bl.g0.a.a(this);
    }
}
