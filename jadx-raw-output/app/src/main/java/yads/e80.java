package yads;

import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final class e80 implements bl.g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e80 f76974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f76975b;

    static {
        e80 e80Var = new e80();
        f76974a = e80Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.mobile.ads.features.debugpanel.data.remote.model.DebugPanelMediationNetwork", e80Var, 6);
        pluginGeneratedSerialDescriptor.k("id", true);
        pluginGeneratedSerialDescriptor.k("name", false);
        pluginGeneratedSerialDescriptor.k("logo_url", true);
        pluginGeneratedSerialDescriptor.k("adapter_status", true);
        pluginGeneratedSerialDescriptor.k("adapters", false);
        pluginGeneratedSerialDescriptor.k("latest_adapter_version", true);
        f76975b = pluginGeneratedSerialDescriptor;
    }

    @Override // bl.g0
    public final xk.b[] childSerializers() {
        xk.b[] bVarArr = g80.f77684g;
        bl.d2 d2Var = bl.d2.f5397a;
        return new xk.b[]{yk.a.t(d2Var), d2Var, yk.a.t(d2Var), yk.a.t(d2Var), bVarArr[4], yk.a.t(d2Var)};
    }

    @Override // xk.a
    public final Object deserialize(al.e eVar) {
        String strI;
        String str;
        String str2;
        List list;
        String str3;
        int i10;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f76975b;
        al.c cVarB = eVar.b(pluginGeneratedSerialDescriptor);
        xk.b[] bVarArr = g80.f77684g;
        int i11 = 5;
        String str4 = null;
        if (cVarB.j()) {
            bl.d2 d2Var = bl.d2.f5397a;
            String str5 = (String) cVarB.p(pluginGeneratedSerialDescriptor, 0, d2Var, null);
            String strI2 = cVarB.i(pluginGeneratedSerialDescriptor, 1);
            String str6 = (String) cVarB.p(pluginGeneratedSerialDescriptor, 2, d2Var, null);
            String str7 = (String) cVarB.p(pluginGeneratedSerialDescriptor, 3, d2Var, null);
            list = (List) cVarB.v(pluginGeneratedSerialDescriptor, 4, bVarArr[4], null);
            str3 = (String) cVarB.p(pluginGeneratedSerialDescriptor, 5, d2Var, null);
            i10 = 63;
            str2 = str7;
            str = str6;
            str4 = str5;
            strI = strI2;
        } else {
            int i12 = 0;
            boolean z10 = true;
            strI = null;
            str = null;
            str2 = null;
            list = null;
            str3 = null;
            while (z10) {
                int iX = cVarB.x(pluginGeneratedSerialDescriptor);
                switch (iX) {
                    case -1:
                        z10 = false;
                        i11 = 5;
                        break;
                    case 0:
                        str4 = (String) cVarB.p(pluginGeneratedSerialDescriptor, 0, bl.d2.f5397a, str4);
                        i12 |= 1;
                        i11 = 5;
                        break;
                    case 1:
                        strI = cVarB.i(pluginGeneratedSerialDescriptor, 1);
                        i12 |= 2;
                        break;
                    case 2:
                        str = (String) cVarB.p(pluginGeneratedSerialDescriptor, 2, bl.d2.f5397a, str);
                        i12 |= 4;
                        break;
                    case 3:
                        str2 = (String) cVarB.p(pluginGeneratedSerialDescriptor, 3, bl.d2.f5397a, str2);
                        i12 |= 8;
                        break;
                    case 4:
                        list = (List) cVarB.v(pluginGeneratedSerialDescriptor, 4, bVarArr[4], list);
                        i12 |= 16;
                        break;
                    case 5:
                        str3 = (String) cVarB.p(pluginGeneratedSerialDescriptor, i11, bl.d2.f5397a, str3);
                        i12 |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iX);
                }
            }
            i10 = i12;
        }
        cVarB.c(pluginGeneratedSerialDescriptor);
        return new g80(i10, str4, strI, str, str2, list, str3);
    }

    @Override // xk.b, xk.g, xk.a
    public final kotlinx.serialization.descriptors.a getDescriptor() {
        return f76975b;
    }

    @Override // xk.g
    public final void serialize(al.f fVar, Object obj) {
        g80 g80Var = (g80) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f76975b;
        al.d dVarB = fVar.b(pluginGeneratedSerialDescriptor);
        xk.b[] bVarArr = g80.f77684g;
        if (dVarB.q(pluginGeneratedSerialDescriptor, 0) || g80Var.f77685a != null) {
            dVarB.C(pluginGeneratedSerialDescriptor, 0, bl.d2.f5397a, g80Var.f77685a);
        }
        dVarB.p(pluginGeneratedSerialDescriptor, 1, g80Var.f77686b);
        if (dVarB.q(pluginGeneratedSerialDescriptor, 2) || g80Var.f77687c != null) {
            dVarB.C(pluginGeneratedSerialDescriptor, 2, bl.d2.f5397a, g80Var.f77687c);
        }
        if (dVarB.q(pluginGeneratedSerialDescriptor, 3) || g80Var.f77688d != null) {
            dVarB.C(pluginGeneratedSerialDescriptor, 3, bl.d2.f5397a, g80Var.f77688d);
        }
        dVarB.m(pluginGeneratedSerialDescriptor, 4, bVarArr[4], g80Var.f77689e);
        if (dVarB.q(pluginGeneratedSerialDescriptor, 5) || g80Var.f77690f != null) {
            dVarB.C(pluginGeneratedSerialDescriptor, 5, bl.d2.f5397a, g80Var.f77690f);
        }
        dVarB.c(pluginGeneratedSerialDescriptor);
    }

    @Override // bl.g0
    public final xk.b[] typeParametersSerializers() {
        return bl.g0.a.a(this);
    }
}
