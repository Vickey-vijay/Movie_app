package yads;

import com.ironsource.Q6;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final class s40 implements bl.g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s40 f82517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f82518b;

    static {
        s40 s40Var = new s40();
        f82517a = s40Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.mobile.ads.features.debugpanel.data.remote.model.DebugPanelAdUnitWaterfallMediation", s40Var, 6);
        pluginGeneratedSerialDescriptor.k(Q6.G1, true);
        pluginGeneratedSerialDescriptor.k(BrandSafetyEvent.f44576ad, false);
        pluginGeneratedSerialDescriptor.k("waterfall_parameters", false);
        pluginGeneratedSerialDescriptor.k("network_ad_unit_id_name", true);
        pluginGeneratedSerialDescriptor.k("currency", false);
        pluginGeneratedSerialDescriptor.k("cpm_floors", false);
        f82518b = pluginGeneratedSerialDescriptor;
    }

    @Override // bl.g0
    public final xk.b[] childSerializers() {
        xk.b[] bVarArr = u40.f83359g;
        bl.d2 d2Var = bl.d2.f5397a;
        return new xk.b[]{yk.a.t(d2Var), d2Var, bVarArr[2], yk.a.t(d2Var), yk.a.t(ia0.f78542a), bVarArr[5]};
    }

    @Override // xk.a
    public final Object deserialize(al.e eVar) {
        String strI;
        List list;
        String str;
        ka0 ka0Var;
        List list2;
        int i10;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f82518b;
        al.c cVarB = eVar.b(pluginGeneratedSerialDescriptor);
        xk.b[] bVarArr = u40.f83359g;
        int i11 = 3;
        String str2 = null;
        if (cVarB.j()) {
            bl.d2 d2Var = bl.d2.f5397a;
            String str3 = (String) cVarB.p(pluginGeneratedSerialDescriptor, 0, d2Var, null);
            String strI2 = cVarB.i(pluginGeneratedSerialDescriptor, 1);
            List list3 = (List) cVarB.v(pluginGeneratedSerialDescriptor, 2, bVarArr[2], null);
            String str4 = (String) cVarB.p(pluginGeneratedSerialDescriptor, 3, d2Var, null);
            ka0 ka0Var2 = (ka0) cVarB.p(pluginGeneratedSerialDescriptor, 4, ia0.f78542a, null);
            list2 = (List) cVarB.v(pluginGeneratedSerialDescriptor, 5, bVarArr[5], null);
            str = str4;
            ka0Var = ka0Var2;
            str2 = str3;
            strI = strI2;
            list = list3;
            i10 = 63;
        } else {
            int i12 = 0;
            boolean z10 = true;
            strI = null;
            list = null;
            str = null;
            ka0Var = null;
            list2 = null;
            while (z10) {
                int iX = cVarB.x(pluginGeneratedSerialDescriptor);
                switch (iX) {
                    case -1:
                        z10 = false;
                        i11 = 3;
                        break;
                    case 0:
                        str2 = (String) cVarB.p(pluginGeneratedSerialDescriptor, 0, bl.d2.f5397a, str2);
                        i12 |= 1;
                        i11 = 3;
                        break;
                    case 1:
                        strI = cVarB.i(pluginGeneratedSerialDescriptor, 1);
                        i12 |= 2;
                        break;
                    case 2:
                        list = (List) cVarB.v(pluginGeneratedSerialDescriptor, 2, bVarArr[2], list);
                        i12 |= 4;
                        break;
                    case 3:
                        str = (String) cVarB.p(pluginGeneratedSerialDescriptor, i11, bl.d2.f5397a, str);
                        i12 |= 8;
                        break;
                    case 4:
                        ka0Var = (ka0) cVarB.p(pluginGeneratedSerialDescriptor, 4, ia0.f78542a, ka0Var);
                        i12 |= 16;
                        break;
                    case 5:
                        list2 = (List) cVarB.v(pluginGeneratedSerialDescriptor, 5, bVarArr[5], list2);
                        i12 |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iX);
                }
            }
            i10 = i12;
        }
        cVarB.c(pluginGeneratedSerialDescriptor);
        return new u40(i10, str2, strI, list, str, ka0Var, list2);
    }

    @Override // xk.b, xk.g, xk.a
    public final kotlinx.serialization.descriptors.a getDescriptor() {
        return f82518b;
    }

    @Override // xk.g
    public final void serialize(al.f fVar, Object obj) {
        u40 u40Var = (u40) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f82518b;
        al.d dVarB = fVar.b(pluginGeneratedSerialDescriptor);
        xk.b[] bVarArr = u40.f83359g;
        if (dVarB.q(pluginGeneratedSerialDescriptor, 0) || u40Var.f83360a != null) {
            dVarB.C(pluginGeneratedSerialDescriptor, 0, bl.d2.f5397a, u40Var.f83360a);
        }
        dVarB.p(pluginGeneratedSerialDescriptor, 1, u40Var.f83361b);
        dVarB.m(pluginGeneratedSerialDescriptor, 2, bVarArr[2], u40Var.f83362c);
        if (dVarB.q(pluginGeneratedSerialDescriptor, 3) || u40Var.f83363d != null) {
            dVarB.C(pluginGeneratedSerialDescriptor, 3, bl.d2.f5397a, u40Var.f83363d);
        }
        dVarB.C(pluginGeneratedSerialDescriptor, 4, ia0.f78542a, u40Var.f83364e);
        dVarB.m(pluginGeneratedSerialDescriptor, 5, bVarArr[5], u40Var.f83365f);
        dVarB.c(pluginGeneratedSerialDescriptor);
    }

    @Override // bl.g0
    public final xk.b[] typeParametersSerializers() {
        return bl.g0.a.a(this);
    }
}
