package yads;

import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes10.dex */
public final class wq1 implements bl.g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wq1 f84294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f84295b;

    static {
        wq1 wq1Var = new wq1();
        f84294a = wq1Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.monetization.ads.core.initializer.validation.adapters.MediationNetworkData", wq1Var, 4);
        pluginGeneratedSerialDescriptor.k("name", false);
        pluginGeneratedSerialDescriptor.k("id", false);
        pluginGeneratedSerialDescriptor.k("version", false);
        pluginGeneratedSerialDescriptor.k("adapters", false);
        f84295b = pluginGeneratedSerialDescriptor;
    }

    @Override // bl.g0
    public final xk.b[] childSerializers() {
        xk.b[] bVarArr = br1.f75933e;
        bl.d2 d2Var = bl.d2.f5397a;
        return new xk.b[]{d2Var, d2Var, yk.a.t(d2Var), bVarArr[3]};
    }

    @Override // xk.a
    public final Object deserialize(al.e eVar) {
        String str;
        int i10;
        String str2;
        String str3;
        List list;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f84295b;
        al.c cVarB = eVar.b(pluginGeneratedSerialDescriptor);
        xk.b[] bVarArr = br1.f75933e;
        if (cVarB.j()) {
            String strI = cVarB.i(pluginGeneratedSerialDescriptor, 0);
            String strI2 = cVarB.i(pluginGeneratedSerialDescriptor, 1);
            String str4 = (String) cVarB.p(pluginGeneratedSerialDescriptor, 2, bl.d2.f5397a, null);
            list = (List) cVarB.v(pluginGeneratedSerialDescriptor, 3, bVarArr[3], null);
            str = strI;
            str3 = str4;
            i10 = 15;
            str2 = strI2;
        } else {
            String strI3 = null;
            String strI4 = null;
            String str5 = null;
            List list2 = null;
            int i11 = 0;
            boolean z10 = true;
            while (z10) {
                int iX = cVarB.x(pluginGeneratedSerialDescriptor);
                if (iX == -1) {
                    z10 = false;
                } else if (iX == 0) {
                    strI3 = cVarB.i(pluginGeneratedSerialDescriptor, 0);
                    i11 |= 1;
                } else if (iX == 1) {
                    strI4 = cVarB.i(pluginGeneratedSerialDescriptor, 1);
                    i11 |= 2;
                } else if (iX == 2) {
                    str5 = (String) cVarB.p(pluginGeneratedSerialDescriptor, 2, bl.d2.f5397a, str5);
                    i11 |= 4;
                } else {
                    if (iX != 3) {
                        throw new UnknownFieldException(iX);
                    }
                    list2 = (List) cVarB.v(pluginGeneratedSerialDescriptor, 3, bVarArr[3], list2);
                    i11 |= 8;
                }
            }
            str = strI3;
            i10 = i11;
            str2 = strI4;
            str3 = str5;
            list = list2;
        }
        cVarB.c(pluginGeneratedSerialDescriptor);
        return new br1(i10, str, str2, str3, list);
    }

    @Override // xk.b, xk.g, xk.a
    public final kotlinx.serialization.descriptors.a getDescriptor() {
        return f84295b;
    }

    @Override // xk.g
    public final void serialize(al.f fVar, Object obj) {
        br1 br1Var = (br1) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f84295b;
        al.d dVarB = fVar.b(pluginGeneratedSerialDescriptor);
        xk.b[] bVarArr = br1.f75933e;
        dVarB.p(pluginGeneratedSerialDescriptor, 0, br1Var.f75934a);
        dVarB.p(pluginGeneratedSerialDescriptor, 1, br1Var.f75935b);
        dVarB.C(pluginGeneratedSerialDescriptor, 2, bl.d2.f5397a, br1Var.f75936c);
        dVarB.m(pluginGeneratedSerialDescriptor, 3, bVarArr[3], br1Var.f75937d);
        dVarB.c(pluginGeneratedSerialDescriptor);
    }

    @Override // bl.g0
    public final xk.b[] typeParametersSerializers() {
        return bl.g0.a.a(this);
    }
}
