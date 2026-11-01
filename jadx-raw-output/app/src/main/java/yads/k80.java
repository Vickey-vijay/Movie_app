package yads;

import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes5.dex */
public final class k80 implements bl.g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k80 f79327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f79328b;

    static {
        k80 k80Var = new k80();
        f79327a = k80Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.mobile.ads.features.debugpanel.data.model.DebugPanelReportData", k80Var, 6);
        pluginGeneratedSerialDescriptor.k("app_data", false);
        pluginGeneratedSerialDescriptor.k("sdk_data", false);
        pluginGeneratedSerialDescriptor.k("adapters_data", false);
        pluginGeneratedSerialDescriptor.k("consents_data", false);
        pluginGeneratedSerialDescriptor.k("sdk_logs", false);
        pluginGeneratedSerialDescriptor.k("network_logs", false);
        f79328b = pluginGeneratedSerialDescriptor;
    }

    @Override // bl.g0
    public final xk.b[] childSerializers() {
        xk.b[] bVarArr = m80.f80123g;
        return new xk.b[]{k50.f79307a, r80.f82142a, bVarArr[2], r50.f82102a, bVarArr[4], bVarArr[5]};
    }

    @Override // xk.a
    public final Object deserialize(al.e eVar) {
        int i10;
        m50 m50Var;
        t80 t80Var;
        List list;
        t50 t50Var;
        List list2;
        List list3;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f79328b;
        al.c cVarB = eVar.b(pluginGeneratedSerialDescriptor);
        xk.b[] bVarArr = m80.f80123g;
        int i11 = 3;
        m50 m50Var2 = null;
        if (cVarB.j()) {
            m50 m50Var3 = (m50) cVarB.v(pluginGeneratedSerialDescriptor, 0, k50.f79307a, null);
            t80 t80Var2 = (t80) cVarB.v(pluginGeneratedSerialDescriptor, 1, r80.f82142a, null);
            List list4 = (List) cVarB.v(pluginGeneratedSerialDescriptor, 2, bVarArr[2], null);
            t50 t50Var2 = (t50) cVarB.v(pluginGeneratedSerialDescriptor, 3, r50.f82102a, null);
            List list5 = (List) cVarB.v(pluginGeneratedSerialDescriptor, 4, bVarArr[4], null);
            list3 = (List) cVarB.v(pluginGeneratedSerialDescriptor, 5, bVarArr[5], null);
            m50Var = m50Var3;
            t50Var = t50Var2;
            t80Var = t80Var2;
            list = list4;
            list2 = list5;
            i10 = 63;
        } else {
            int i12 = 0;
            boolean z10 = true;
            t80 t80Var3 = null;
            List list6 = null;
            t50 t50Var3 = null;
            List list7 = null;
            List list8 = null;
            while (z10) {
                int iX = cVarB.x(pluginGeneratedSerialDescriptor);
                switch (iX) {
                    case -1:
                        z10 = false;
                        i11 = 3;
                        break;
                    case 0:
                        m50Var2 = (m50) cVarB.v(pluginGeneratedSerialDescriptor, 0, k50.f79307a, m50Var2);
                        i12 |= 1;
                        i11 = 3;
                        break;
                    case 1:
                        t80Var3 = (t80) cVarB.v(pluginGeneratedSerialDescriptor, 1, r80.f82142a, t80Var3);
                        i12 |= 2;
                        break;
                    case 2:
                        list6 = (List) cVarB.v(pluginGeneratedSerialDescriptor, 2, bVarArr[2], list6);
                        i12 |= 4;
                        break;
                    case 3:
                        t50Var3 = (t50) cVarB.v(pluginGeneratedSerialDescriptor, i11, r50.f82102a, t50Var3);
                        i12 |= 8;
                        break;
                    case 4:
                        list7 = (List) cVarB.v(pluginGeneratedSerialDescriptor, 4, bVarArr[4], list7);
                        i12 |= 16;
                        break;
                    case 5:
                        list8 = (List) cVarB.v(pluginGeneratedSerialDescriptor, 5, bVarArr[5], list8);
                        i12 |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iX);
                }
            }
            i10 = i12;
            m50Var = m50Var2;
            t80Var = t80Var3;
            list = list6;
            t50Var = t50Var3;
            list2 = list7;
            list3 = list8;
        }
        cVarB.c(pluginGeneratedSerialDescriptor);
        return new m80(i10, m50Var, t80Var, list, t50Var, list2, list3);
    }

    @Override // xk.b, xk.g, xk.a
    public final kotlinx.serialization.descriptors.a getDescriptor() {
        return f79328b;
    }

    @Override // xk.g
    public final void serialize(al.f fVar, Object obj) {
        m80 m80Var = (m80) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f79328b;
        al.d dVarB = fVar.b(pluginGeneratedSerialDescriptor);
        xk.b[] bVarArr = m80.f80123g;
        dVarB.m(pluginGeneratedSerialDescriptor, 0, k50.f79307a, m80Var.f80124a);
        dVarB.m(pluginGeneratedSerialDescriptor, 1, r80.f82142a, m80Var.f80125b);
        dVarB.m(pluginGeneratedSerialDescriptor, 2, bVarArr[2], m80Var.f80126c);
        dVarB.m(pluginGeneratedSerialDescriptor, 3, r50.f82102a, m80Var.f80127d);
        dVarB.m(pluginGeneratedSerialDescriptor, 4, bVarArr[4], m80Var.f80128e);
        dVarB.m(pluginGeneratedSerialDescriptor, 5, bVarArr[5], m80Var.f80129f);
        dVarB.c(pluginGeneratedSerialDescriptor);
    }

    @Override // bl.g0
    public final xk.b[] typeParametersSerializers() {
        return bl.g0.a.a(this);
    }
}
