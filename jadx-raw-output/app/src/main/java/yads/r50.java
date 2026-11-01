package yads;

import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes10.dex */
public final class r50 implements bl.g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r50 f82102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f82103b;

    static {
        r50 r50Var = new r50();
        f82102a = r50Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.mobile.ads.features.debugpanel.data.local.model.DebugPanelConsentsData", r50Var, 4);
        pluginGeneratedSerialDescriptor.k("has_location_consent", false);
        pluginGeneratedSerialDescriptor.k("age_restricted_user", false);
        pluginGeneratedSerialDescriptor.k("has_user_consent", false);
        pluginGeneratedSerialDescriptor.k("has_cmp_value", false);
        f82103b = pluginGeneratedSerialDescriptor;
    }

    @Override // bl.g0
    public final xk.b[] childSerializers() {
        bl.i iVar = bl.i.f5416a;
        return new xk.b[]{iVar, yk.a.t(iVar), yk.a.t(iVar), iVar};
    }

    @Override // xk.a
    public final Object deserialize(al.e eVar) {
        boolean z10;
        Boolean bool;
        Boolean bool2;
        boolean zD;
        int i10;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f82103b;
        al.c cVarB = eVar.b(pluginGeneratedSerialDescriptor);
        Boolean bool3 = null;
        if (cVarB.j()) {
            boolean zD2 = cVarB.D(pluginGeneratedSerialDescriptor, 0);
            bl.i iVar = bl.i.f5416a;
            Boolean bool4 = (Boolean) cVarB.p(pluginGeneratedSerialDescriptor, 1, iVar, null);
            z10 = zD2;
            bool2 = (Boolean) cVarB.p(pluginGeneratedSerialDescriptor, 2, iVar, null);
            zD = cVarB.D(pluginGeneratedSerialDescriptor, 3);
            i10 = 15;
            bool = bool4;
        } else {
            Boolean bool5 = null;
            boolean z11 = true;
            boolean zD3 = false;
            boolean zD4 = false;
            int i11 = 0;
            while (z11) {
                int iX = cVarB.x(pluginGeneratedSerialDescriptor);
                if (iX == -1) {
                    z11 = false;
                } else if (iX == 0) {
                    zD3 = cVarB.D(pluginGeneratedSerialDescriptor, 0);
                    i11 |= 1;
                } else if (iX == 1) {
                    bool3 = (Boolean) cVarB.p(pluginGeneratedSerialDescriptor, 1, bl.i.f5416a, bool3);
                    i11 |= 2;
                } else if (iX == 2) {
                    bool5 = (Boolean) cVarB.p(pluginGeneratedSerialDescriptor, 2, bl.i.f5416a, bool5);
                    i11 |= 4;
                } else {
                    if (iX != 3) {
                        throw new UnknownFieldException(iX);
                    }
                    zD4 = cVarB.D(pluginGeneratedSerialDescriptor, 3);
                    i11 |= 8;
                }
            }
            z10 = zD3;
            bool = bool3;
            bool2 = bool5;
            zD = zD4;
            i10 = i11;
        }
        cVarB.c(pluginGeneratedSerialDescriptor);
        return new t50(i10, z10, bool, bool2, zD);
    }

    @Override // xk.b, xk.g, xk.a
    public final kotlinx.serialization.descriptors.a getDescriptor() {
        return f82103b;
    }

    @Override // xk.g
    public final void serialize(al.f fVar, Object obj) {
        t50 t50Var = (t50) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f82103b;
        al.d dVarB = fVar.b(pluginGeneratedSerialDescriptor);
        dVarB.o(pluginGeneratedSerialDescriptor, 0, t50Var.f82883a);
        bl.i iVar = bl.i.f5416a;
        dVarB.C(pluginGeneratedSerialDescriptor, 1, iVar, t50Var.f82884b);
        dVarB.C(pluginGeneratedSerialDescriptor, 2, iVar, t50Var.f82885c);
        dVarB.o(pluginGeneratedSerialDescriptor, 3, t50Var.f82886d);
        dVarB.c(pluginGeneratedSerialDescriptor);
    }

    @Override // bl.g0
    public final xk.b[] typeParametersSerializers() {
        return bl.g0.a.a(this);
    }
}
