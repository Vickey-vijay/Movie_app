package yads;

import java.util.Map;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes11.dex */
public final class ku1 implements bl.g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ku1 f79571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f79572b;

    static {
        ku1 ku1Var = new ku1();
        f79571a = ku1Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.monetization.ads.utils.logger.model.MobileAdsNetworkRequestLog", ku1Var, 5);
        pluginGeneratedSerialDescriptor.k("timestamp", false);
        pluginGeneratedSerialDescriptor.k("method", false);
        pluginGeneratedSerialDescriptor.k("url", false);
        pluginGeneratedSerialDescriptor.k("headers", false);
        pluginGeneratedSerialDescriptor.k("body", false);
        f79572b = pluginGeneratedSerialDescriptor;
    }

    @Override // bl.g0
    public final xk.b[] childSerializers() {
        xk.b[] bVarArr = mu1.f80390f;
        bl.d2 d2Var = bl.d2.f5397a;
        return new xk.b[]{bl.a1.f5375a, d2Var, d2Var, yk.a.t(bVarArr[3]), yk.a.t(d2Var)};
    }

    @Override // xk.a
    public final Object deserialize(al.e eVar) {
        String str;
        int i10;
        String str2;
        Map map;
        String str3;
        long j10;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f79572b;
        al.c cVarB = eVar.b(pluginGeneratedSerialDescriptor);
        xk.b[] bVarArr = mu1.f80390f;
        if (cVarB.j()) {
            long jE = cVarB.e(pluginGeneratedSerialDescriptor, 0);
            String strI = cVarB.i(pluginGeneratedSerialDescriptor, 1);
            String strI2 = cVarB.i(pluginGeneratedSerialDescriptor, 2);
            map = (Map) cVarB.p(pluginGeneratedSerialDescriptor, 3, bVarArr[3], null);
            str = strI;
            str3 = (String) cVarB.p(pluginGeneratedSerialDescriptor, 4, bl.d2.f5397a, null);
            str2 = strI2;
            i10 = 31;
            j10 = jE;
        } else {
            String strI3 = null;
            String str4 = null;
            boolean z10 = true;
            long jE2 = 0;
            String strI4 = null;
            Map map2 = null;
            int i11 = 0;
            while (z10) {
                int iX = cVarB.x(pluginGeneratedSerialDescriptor);
                if (iX == -1) {
                    z10 = false;
                } else if (iX == 0) {
                    jE2 = cVarB.e(pluginGeneratedSerialDescriptor, 0);
                    i11 |= 1;
                } else if (iX == 1) {
                    strI3 = cVarB.i(pluginGeneratedSerialDescriptor, 1);
                    i11 |= 2;
                } else if (iX == 2) {
                    strI4 = cVarB.i(pluginGeneratedSerialDescriptor, 2);
                    i11 |= 4;
                } else if (iX == 3) {
                    map2 = (Map) cVarB.p(pluginGeneratedSerialDescriptor, 3, bVarArr[3], map2);
                    i11 |= 8;
                } else {
                    if (iX != 4) {
                        throw new UnknownFieldException(iX);
                    }
                    str4 = (String) cVarB.p(pluginGeneratedSerialDescriptor, 4, bl.d2.f5397a, str4);
                    i11 |= 16;
                }
            }
            str = strI3;
            i10 = i11;
            str2 = strI4;
            map = map2;
            str3 = str4;
            j10 = jE2;
        }
        cVarB.c(pluginGeneratedSerialDescriptor);
        return new mu1(i10, j10, str, str2, map, str3);
    }

    @Override // xk.b, xk.g, xk.a
    public final kotlinx.serialization.descriptors.a getDescriptor() {
        return f79572b;
    }

    @Override // xk.g
    public final void serialize(al.f fVar, Object obj) {
        mu1 mu1Var = (mu1) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f79572b;
        al.d dVarB = fVar.b(pluginGeneratedSerialDescriptor);
        xk.b[] bVarArr = mu1.f80390f;
        dVarB.u(pluginGeneratedSerialDescriptor, 0, mu1Var.f80391a);
        dVarB.p(pluginGeneratedSerialDescriptor, 1, mu1Var.f80392b);
        dVarB.p(pluginGeneratedSerialDescriptor, 2, mu1Var.f80393c);
        dVarB.C(pluginGeneratedSerialDescriptor, 3, bVarArr[3], mu1Var.f80394d);
        dVarB.C(pluginGeneratedSerialDescriptor, 4, bl.d2.f5397a, mu1Var.f80395e);
        dVarB.c(pluginGeneratedSerialDescriptor);
    }

    @Override // bl.g0
    public final xk.b[] typeParametersSerializers() {
        return bl.g0.a.a(this);
    }
}
