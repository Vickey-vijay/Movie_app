package yads;

import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes7.dex */
public final class k40 implements bl.g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k40 f79295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f79296b;

    static {
        k40 k40Var = new k40();
        f79295a = k40Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.mobile.ads.features.debugpanel.data.remote.model.DebugPanelAdUnitMediation", k40Var, 2);
        pluginGeneratedSerialDescriptor.k(com.ironsource.mediationsdk.d.f29596h, false);
        pluginGeneratedSerialDescriptor.k("bidding", false);
        f79296b = pluginGeneratedSerialDescriptor;
    }

    @Override // bl.g0
    public final xk.b[] childSerializers() {
        xk.b[] bVarArr = m40.f80076c;
        return new xk.b[]{bVarArr[0], bVarArr[1]};
    }

    @Override // xk.a
    public final Object deserialize(al.e eVar) {
        List list;
        int i10;
        List list2;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f79296b;
        al.c cVarB = eVar.b(pluginGeneratedSerialDescriptor);
        xk.b[] bVarArr = m40.f80076c;
        if (cVarB.j()) {
            list = (List) cVarB.v(pluginGeneratedSerialDescriptor, 0, bVarArr[0], null);
            list2 = (List) cVarB.v(pluginGeneratedSerialDescriptor, 1, bVarArr[1], null);
            i10 = 3;
        } else {
            list = null;
            List list3 = null;
            i10 = 0;
            boolean z10 = true;
            while (z10) {
                int iX = cVarB.x(pluginGeneratedSerialDescriptor);
                if (iX == -1) {
                    z10 = false;
                } else if (iX == 0) {
                    list = (List) cVarB.v(pluginGeneratedSerialDescriptor, 0, bVarArr[0], list);
                    i10 |= 1;
                } else {
                    if (iX != 1) {
                        throw new UnknownFieldException(iX);
                    }
                    list3 = (List) cVarB.v(pluginGeneratedSerialDescriptor, 1, bVarArr[1], list3);
                    i10 |= 2;
                }
            }
            list2 = list3;
        }
        cVarB.c(pluginGeneratedSerialDescriptor);
        return new m40(i10, list, list2);
    }

    @Override // xk.b, xk.g, xk.a
    public final kotlinx.serialization.descriptors.a getDescriptor() {
        return f79296b;
    }

    @Override // xk.g
    public final void serialize(al.f fVar, Object obj) {
        m40 m40Var = (m40) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f79296b;
        al.d dVarB = fVar.b(pluginGeneratedSerialDescriptor);
        xk.b[] bVarArr = m40.f80076c;
        dVarB.m(pluginGeneratedSerialDescriptor, 0, bVarArr[0], m40Var.f80077a);
        dVarB.m(pluginGeneratedSerialDescriptor, 1, bVarArr[1], m40Var.f80078b);
        dVarB.c(pluginGeneratedSerialDescriptor);
    }

    @Override // bl.g0
    public final xk.b[] typeParametersSerializers() {
        return bl.g0.a.a(this);
    }
}
