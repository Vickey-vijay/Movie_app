package yads;

import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final class e50 implements bl.g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e50 f76919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f76920b;

    static {
        e50 e50Var = new e50();
        f76919a = e50Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.mobile.ads.features.debugpanel.data.remote.model.DebugPanelAlert", e50Var, 3);
        pluginGeneratedSerialDescriptor.k("title", true);
        pluginGeneratedSerialDescriptor.k("message", true);
        pluginGeneratedSerialDescriptor.k("type", true);
        f76920b = pluginGeneratedSerialDescriptor;
    }

    @Override // bl.g0
    public final xk.b[] childSerializers() {
        bl.d2 d2Var = bl.d2.f5397a;
        return new xk.b[]{yk.a.t(d2Var), yk.a.t(d2Var), yk.a.t(d2Var)};
    }

    @Override // xk.a
    public final Object deserialize(al.e eVar) {
        int i10;
        String str;
        String str2;
        String str3;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f76920b;
        al.c cVarB = eVar.b(pluginGeneratedSerialDescriptor);
        if (cVarB.j()) {
            bl.d2 d2Var = bl.d2.f5397a;
            str = (String) cVarB.p(pluginGeneratedSerialDescriptor, 0, d2Var, null);
            str2 = (String) cVarB.p(pluginGeneratedSerialDescriptor, 1, d2Var, null);
            str3 = (String) cVarB.p(pluginGeneratedSerialDescriptor, 2, d2Var, null);
            i10 = 7;
        } else {
            String str4 = null;
            String str5 = null;
            String str6 = null;
            i10 = 0;
            boolean z10 = true;
            while (z10) {
                int iX = cVarB.x(pluginGeneratedSerialDescriptor);
                if (iX == -1) {
                    z10 = false;
                } else if (iX == 0) {
                    str4 = (String) cVarB.p(pluginGeneratedSerialDescriptor, 0, bl.d2.f5397a, str4);
                    i10 |= 1;
                } else if (iX == 1) {
                    str5 = (String) cVarB.p(pluginGeneratedSerialDescriptor, 1, bl.d2.f5397a, str5);
                    i10 |= 2;
                } else {
                    if (iX != 2) {
                        throw new UnknownFieldException(iX);
                    }
                    str6 = (String) cVarB.p(pluginGeneratedSerialDescriptor, 2, bl.d2.f5397a, str6);
                    i10 |= 4;
                }
            }
            str = str4;
            str2 = str5;
            str3 = str6;
        }
        cVarB.c(pluginGeneratedSerialDescriptor);
        return new g50(i10, str, str2, str3);
    }

    @Override // xk.b, xk.g, xk.a
    public final kotlinx.serialization.descriptors.a getDescriptor() {
        return f76920b;
    }

    @Override // xk.g
    public final void serialize(al.f fVar, Object obj) {
        g50 g50Var = (g50) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f76920b;
        al.d dVarB = fVar.b(pluginGeneratedSerialDescriptor);
        if (dVarB.q(pluginGeneratedSerialDescriptor, 0) || g50Var.f77633a != null) {
            dVarB.C(pluginGeneratedSerialDescriptor, 0, bl.d2.f5397a, g50Var.f77633a);
        }
        if (dVarB.q(pluginGeneratedSerialDescriptor, 1) || g50Var.f77634b != null) {
            dVarB.C(pluginGeneratedSerialDescriptor, 1, bl.d2.f5397a, g50Var.f77634b);
        }
        if (dVarB.q(pluginGeneratedSerialDescriptor, 2) || g50Var.f77635c != null) {
            dVarB.C(pluginGeneratedSerialDescriptor, 2, bl.d2.f5397a, g50Var.f77635c);
        }
        dVarB.c(pluginGeneratedSerialDescriptor);
    }

    @Override // bl.g0
    public final xk.b[] typeParametersSerializers() {
        return bl.g0.a.a(this);
    }
}
