package yads;

import com.ironsource.Q6;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final class f40 implements bl.g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f40 f77294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f77295b;

    static {
        f40 f40Var = new f40();
        f77294a = f40Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.mobile.ads.features.debugpanel.data.remote.model.DebugPanelAdUnitBiddingMediation", f40Var, 5);
        pluginGeneratedSerialDescriptor.k(Q6.G1, true);
        pluginGeneratedSerialDescriptor.k(BrandSafetyEvent.f44576ad, false);
        pluginGeneratedSerialDescriptor.k("bidding_parameters", false);
        pluginGeneratedSerialDescriptor.k("network_ad_unit_id", true);
        pluginGeneratedSerialDescriptor.k("network_ad_unit_id_name", true);
        f77295b = pluginGeneratedSerialDescriptor;
    }

    @Override // bl.g0
    public final xk.b[] childSerializers() {
        xk.b[] bVarArr = h40.f78055f;
        bl.d2 d2Var = bl.d2.f5397a;
        return new xk.b[]{yk.a.t(d2Var), d2Var, bVarArr[2], yk.a.t(d2Var), yk.a.t(d2Var)};
    }

    @Override // xk.a
    public final Object deserialize(al.e eVar) {
        int i10;
        String str;
        String str2;
        List list;
        String str3;
        String str4;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f77295b;
        al.c cVarB = eVar.b(pluginGeneratedSerialDescriptor);
        xk.b[] bVarArr = h40.f78055f;
        String str5 = null;
        if (cVarB.j()) {
            bl.d2 d2Var = bl.d2.f5397a;
            String str6 = (String) cVarB.p(pluginGeneratedSerialDescriptor, 0, d2Var, null);
            String strI = cVarB.i(pluginGeneratedSerialDescriptor, 1);
            List list2 = (List) cVarB.v(pluginGeneratedSerialDescriptor, 2, bVarArr[2], null);
            String str7 = (String) cVarB.p(pluginGeneratedSerialDescriptor, 3, d2Var, null);
            list = list2;
            str4 = (String) cVarB.p(pluginGeneratedSerialDescriptor, 4, d2Var, null);
            str3 = str7;
            i10 = 31;
            str = str6;
            str2 = strI;
        } else {
            int i11 = 0;
            String strI2 = null;
            List list3 = null;
            String str8 = null;
            String str9 = null;
            boolean z10 = true;
            while (z10) {
                int iX = cVarB.x(pluginGeneratedSerialDescriptor);
                if (iX == -1) {
                    z10 = false;
                } else if (iX == 0) {
                    str5 = (String) cVarB.p(pluginGeneratedSerialDescriptor, 0, bl.d2.f5397a, str5);
                    i11 |= 1;
                } else if (iX == 1) {
                    strI2 = cVarB.i(pluginGeneratedSerialDescriptor, 1);
                    i11 |= 2;
                } else if (iX == 2) {
                    list3 = (List) cVarB.v(pluginGeneratedSerialDescriptor, 2, bVarArr[2], list3);
                    i11 |= 4;
                } else if (iX == 3) {
                    str8 = (String) cVarB.p(pluginGeneratedSerialDescriptor, 3, bl.d2.f5397a, str8);
                    i11 |= 8;
                } else {
                    if (iX != 4) {
                        throw new UnknownFieldException(iX);
                    }
                    str9 = (String) cVarB.p(pluginGeneratedSerialDescriptor, 4, bl.d2.f5397a, str9);
                    i11 |= 16;
                }
            }
            i10 = i11;
            str = str5;
            str2 = strI2;
            list = list3;
            str3 = str8;
            str4 = str9;
        }
        cVarB.c(pluginGeneratedSerialDescriptor);
        return new h40(i10, str, str2, list, str3, str4);
    }

    @Override // xk.b, xk.g, xk.a
    public final kotlinx.serialization.descriptors.a getDescriptor() {
        return f77295b;
    }

    @Override // xk.g
    public final void serialize(al.f fVar, Object obj) {
        h40 h40Var = (h40) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f77295b;
        al.d dVarB = fVar.b(pluginGeneratedSerialDescriptor);
        xk.b[] bVarArr = h40.f78055f;
        if (dVarB.q(pluginGeneratedSerialDescriptor, 0) || h40Var.f78056a != null) {
            dVarB.C(pluginGeneratedSerialDescriptor, 0, bl.d2.f5397a, h40Var.f78056a);
        }
        dVarB.p(pluginGeneratedSerialDescriptor, 1, h40Var.f78057b);
        dVarB.m(pluginGeneratedSerialDescriptor, 2, bVarArr[2], h40Var.f78058c);
        if (dVarB.q(pluginGeneratedSerialDescriptor, 3) || h40Var.f78059d != null) {
            dVarB.C(pluginGeneratedSerialDescriptor, 3, bl.d2.f5397a, h40Var.f78059d);
        }
        if (dVarB.q(pluginGeneratedSerialDescriptor, 4) || h40Var.f78060e != null) {
            dVarB.C(pluginGeneratedSerialDescriptor, 4, bl.d2.f5397a, h40Var.f78060e);
        }
        dVarB.c(pluginGeneratedSerialDescriptor);
    }

    @Override // bl.g0
    public final xk.b[] typeParametersSerializers() {
        return bl.g0.a.a(this);
    }
}
