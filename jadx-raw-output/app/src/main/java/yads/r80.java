package yads;

import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes10.dex */
public final class r80 implements bl.g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r80 f82142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f82143b;

    static {
        r80 r80Var = new r80();
        f82142a = r80Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.mobile.ads.features.debugpanel.data.local.model.DebugPanelSdkData", r80Var, 3);
        pluginGeneratedSerialDescriptor.k("version", false);
        pluginGeneratedSerialDescriptor.k("is_integrated", false);
        pluginGeneratedSerialDescriptor.k("integration_messages", false);
        f82143b = pluginGeneratedSerialDescriptor;
    }

    @Override // bl.g0
    public final xk.b[] childSerializers() {
        return new xk.b[]{bl.d2.f5397a, bl.i.f5416a, t80.f82918d[2]};
    }

    @Override // xk.a
    public final Object deserialize(al.e eVar) {
        String strI;
        int i10;
        List list;
        boolean zD;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f82143b;
        al.c cVarB = eVar.b(pluginGeneratedSerialDescriptor);
        xk.b[] bVarArr = t80.f82918d;
        if (cVarB.j()) {
            strI = cVarB.i(pluginGeneratedSerialDescriptor, 0);
            zD = cVarB.D(pluginGeneratedSerialDescriptor, 1);
            list = (List) cVarB.v(pluginGeneratedSerialDescriptor, 2, bVarArr[2], null);
            i10 = 7;
        } else {
            strI = null;
            List list2 = null;
            i10 = 0;
            boolean zD2 = false;
            boolean z10 = true;
            while (z10) {
                int iX = cVarB.x(pluginGeneratedSerialDescriptor);
                if (iX == -1) {
                    z10 = false;
                } else if (iX == 0) {
                    strI = cVarB.i(pluginGeneratedSerialDescriptor, 0);
                    i10 |= 1;
                } else if (iX == 1) {
                    zD2 = cVarB.D(pluginGeneratedSerialDescriptor, 1);
                    i10 |= 2;
                } else {
                    if (iX != 2) {
                        throw new UnknownFieldException(iX);
                    }
                    list2 = (List) cVarB.v(pluginGeneratedSerialDescriptor, 2, bVarArr[2], list2);
                    i10 |= 4;
                }
            }
            list = list2;
            zD = zD2;
        }
        cVarB.c(pluginGeneratedSerialDescriptor);
        return new t80(i10, strI, zD, list);
    }

    @Override // xk.b, xk.g, xk.a
    public final kotlinx.serialization.descriptors.a getDescriptor() {
        return f82143b;
    }

    @Override // xk.g
    public final void serialize(al.f fVar, Object obj) {
        t80 t80Var = (t80) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f82143b;
        al.d dVarB = fVar.b(pluginGeneratedSerialDescriptor);
        xk.b[] bVarArr = t80.f82918d;
        dVarB.p(pluginGeneratedSerialDescriptor, 0, t80Var.f82919a);
        dVarB.o(pluginGeneratedSerialDescriptor, 1, t80Var.f82920b);
        dVarB.m(pluginGeneratedSerialDescriptor, 2, bVarArr[2], t80Var.f82921c);
        dVarB.c(pluginGeneratedSerialDescriptor);
    }

    @Override // bl.g0
    public final xk.b[] typeParametersSerializers() {
        return bl.g0.a.a(this);
    }
}
