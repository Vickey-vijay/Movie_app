package yads;

import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes8.dex */
public final class h80 implements bl.g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h80 f78094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f78095b;

    static {
        h80 h80Var = new h80();
        f78094a = h80Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.mobile.ads.features.debugpanel.data.remote.model.DebugPanelRemoteData", h80Var, 7);
        pluginGeneratedSerialDescriptor.k("page_id", true);
        pluginGeneratedSerialDescriptor.k("latest_sdk_version", true);
        pluginGeneratedSerialDescriptor.k("app_ads_txt_url", true);
        pluginGeneratedSerialDescriptor.k("app_status", true);
        pluginGeneratedSerialDescriptor.k("alerts", true);
        pluginGeneratedSerialDescriptor.k("ad_units", true);
        pluginGeneratedSerialDescriptor.k("mediation_networks", false);
        f78095b = pluginGeneratedSerialDescriptor;
    }

    @Override // bl.g0
    public final xk.b[] childSerializers() {
        xk.b[] bVarArr = j80.f78937h;
        bl.d2 d2Var = bl.d2.f5397a;
        return new xk.b[]{yk.a.t(d2Var), yk.a.t(d2Var), yk.a.t(d2Var), yk.a.t(d2Var), yk.a.t(bVarArr[4]), yk.a.t(bVarArr[5]), bVarArr[6]};
    }

    @Override // xk.a
    public final Object deserialize(al.e eVar) {
        int i10;
        String str;
        List list;
        String str2;
        String str3;
        List list2;
        String str4;
        List list3;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f78095b;
        al.c cVarB = eVar.b(pluginGeneratedSerialDescriptor);
        xk.b[] bVarArr = j80.f78937h;
        int i11 = 3;
        String str5 = null;
        if (cVarB.j()) {
            bl.d2 d2Var = bl.d2.f5397a;
            str2 = (String) cVarB.p(pluginGeneratedSerialDescriptor, 0, d2Var, null);
            str4 = (String) cVarB.p(pluginGeneratedSerialDescriptor, 1, d2Var, null);
            String str6 = (String) cVarB.p(pluginGeneratedSerialDescriptor, 2, d2Var, null);
            String str7 = (String) cVarB.p(pluginGeneratedSerialDescriptor, 3, d2Var, null);
            List list4 = (List) cVarB.p(pluginGeneratedSerialDescriptor, 4, bVarArr[4], null);
            List list5 = (List) cVarB.p(pluginGeneratedSerialDescriptor, 5, bVarArr[5], null);
            list2 = (List) cVarB.v(pluginGeneratedSerialDescriptor, 6, bVarArr[6], null);
            str3 = str7;
            list3 = list4;
            str = str6;
            list = list5;
            i10 = 127;
        } else {
            int i12 = 0;
            boolean z10 = true;
            List list6 = null;
            List list7 = null;
            String str8 = null;
            String str9 = null;
            String str10 = null;
            List list8 = null;
            while (z10) {
                int iX = cVarB.x(pluginGeneratedSerialDescriptor);
                switch (iX) {
                    case -1:
                        z10 = false;
                        i11 = 3;
                        break;
                    case 0:
                        str5 = (String) cVarB.p(pluginGeneratedSerialDescriptor, 0, bl.d2.f5397a, str5);
                        i12 |= 1;
                        i11 = 3;
                        break;
                    case 1:
                        str8 = (String) cVarB.p(pluginGeneratedSerialDescriptor, 1, bl.d2.f5397a, str8);
                        i12 |= 2;
                        i11 = 3;
                        break;
                    case 2:
                        str9 = (String) cVarB.p(pluginGeneratedSerialDescriptor, 2, bl.d2.f5397a, str9);
                        i12 |= 4;
                        i11 = 3;
                        break;
                    case 3:
                        str10 = (String) cVarB.p(pluginGeneratedSerialDescriptor, i11, bl.d2.f5397a, str10);
                        i12 |= 8;
                        break;
                    case 4:
                        list8 = (List) cVarB.p(pluginGeneratedSerialDescriptor, 4, bVarArr[4], list8);
                        i12 |= 16;
                        break;
                    case 5:
                        list6 = (List) cVarB.p(pluginGeneratedSerialDescriptor, 5, bVarArr[5], list6);
                        i12 |= 32;
                        break;
                    case 6:
                        list7 = (List) cVarB.v(pluginGeneratedSerialDescriptor, 6, bVarArr[6], list7);
                        i12 |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(iX);
                }
            }
            i10 = i12;
            str = str9;
            list = list6;
            str2 = str5;
            str3 = str10;
            list2 = list7;
            str4 = str8;
            list3 = list8;
        }
        cVarB.c(pluginGeneratedSerialDescriptor);
        return new j80(i10, str2, str4, str, str3, list3, list, list2);
    }

    @Override // xk.b, xk.g, xk.a
    public final kotlinx.serialization.descriptors.a getDescriptor() {
        return f78095b;
    }

    @Override // xk.g
    public final void serialize(al.f fVar, Object obj) {
        j80 j80Var = (j80) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f78095b;
        al.d dVarB = fVar.b(pluginGeneratedSerialDescriptor);
        xk.b[] bVarArr = j80.f78937h;
        if (dVarB.q(pluginGeneratedSerialDescriptor, 0) || j80Var.f78938a != null) {
            dVarB.C(pluginGeneratedSerialDescriptor, 0, bl.d2.f5397a, j80Var.f78938a);
        }
        if (dVarB.q(pluginGeneratedSerialDescriptor, 1) || j80Var.f78939b != null) {
            dVarB.C(pluginGeneratedSerialDescriptor, 1, bl.d2.f5397a, j80Var.f78939b);
        }
        if (dVarB.q(pluginGeneratedSerialDescriptor, 2) || j80Var.f78940c != null) {
            dVarB.C(pluginGeneratedSerialDescriptor, 2, bl.d2.f5397a, j80Var.f78940c);
        }
        if (dVarB.q(pluginGeneratedSerialDescriptor, 3) || j80Var.f78941d != null) {
            dVarB.C(pluginGeneratedSerialDescriptor, 3, bl.d2.f5397a, j80Var.f78941d);
        }
        if (dVarB.q(pluginGeneratedSerialDescriptor, 4) || j80Var.f78942e != null) {
            dVarB.C(pluginGeneratedSerialDescriptor, 4, bVarArr[4], j80Var.f78942e);
        }
        if (dVarB.q(pluginGeneratedSerialDescriptor, 5) || j80Var.f78943f != null) {
            dVarB.C(pluginGeneratedSerialDescriptor, 5, bVarArr[5], j80Var.f78943f);
        }
        dVarB.m(pluginGeneratedSerialDescriptor, 6, bVarArr[6], j80Var.f78944g);
        dVarB.c(pluginGeneratedSerialDescriptor);
    }

    @Override // bl.g0
    public final xk.b[] typeParametersSerializers() {
        return bl.g0.a.a(this);
    }
}
