package yads;

import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes11.dex */
public final class tw0 implements bl.g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final tw0 f83214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f83215b;

    static {
        tw0 tw0Var = new tw0();
        f83214a = tw0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.monetization.ads.base.model.fonts.FontParameters", tw0Var, 1);
        pluginGeneratedSerialDescriptor.k("urls", false);
        f83215b = pluginGeneratedSerialDescriptor;
    }

    @Override // bl.g0
    public final xk.b[] childSerializers() {
        return new xk.b[]{yk.a.t(bx0.f76000a)};
    }

    @Override // xk.a
    public final Object deserialize(al.e eVar) {
        dx0 dx0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f83215b;
        al.c cVarB = eVar.b(pluginGeneratedSerialDescriptor);
        int i10 = 1;
        dx0 dx0Var2 = null;
        if (cVarB.j()) {
            dx0Var = (dx0) cVarB.p(pluginGeneratedSerialDescriptor, 0, bx0.f76000a, null);
        } else {
            boolean z10 = true;
            int i11 = 0;
            while (z10) {
                int iX = cVarB.x(pluginGeneratedSerialDescriptor);
                if (iX == -1) {
                    z10 = false;
                } else {
                    if (iX != 0) {
                        throw new UnknownFieldException(iX);
                    }
                    dx0Var2 = (dx0) cVarB.p(pluginGeneratedSerialDescriptor, 0, bx0.f76000a, dx0Var2);
                    i11 = 1;
                }
            }
            dx0Var = dx0Var2;
            i10 = i11;
        }
        cVarB.c(pluginGeneratedSerialDescriptor);
        return new vw0(i10, dx0Var);
    }

    @Override // xk.b, xk.g, xk.a
    public final kotlinx.serialization.descriptors.a getDescriptor() {
        return f83215b;
    }

    @Override // xk.g
    public final void serialize(al.f fVar, Object obj) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f83215b;
        al.d dVarB = fVar.b(pluginGeneratedSerialDescriptor);
        dVarB.C(pluginGeneratedSerialDescriptor, 0, bx0.f76000a, ((vw0) obj).f84023a);
        dVarB.c(pluginGeneratedSerialDescriptor);
    }

    @Override // bl.g0
    public final xk.b[] typeParametersSerializers() {
        return bl.g0.a.a(this);
    }
}
