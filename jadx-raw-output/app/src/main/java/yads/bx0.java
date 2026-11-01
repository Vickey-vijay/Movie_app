package yads;

import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes11.dex */
public final class bx0 implements bl.g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bx0 f76000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f76001b;

    @Override // bl.g0
    public final xk.b[] childSerializers() {
        bl.d2 d2Var = bl.d2.f5397a;
        return new xk.b[]{d2Var, d2Var, d2Var, d2Var};
    }

    static {
        bx0 bx0Var = new bx0();
        f76000a = bx0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.monetization.ads.base.model.fonts.FontUrls", bx0Var, 4);
        pluginGeneratedSerialDescriptor.k("regular", false);
        pluginGeneratedSerialDescriptor.k("bold", false);
        pluginGeneratedSerialDescriptor.k("light", false);
        pluginGeneratedSerialDescriptor.k("medium", false);
        f76001b = pluginGeneratedSerialDescriptor;
    }

    @Override // xk.a
    public final Object deserialize(al.e eVar) {
        String str;
        String strI;
        String str2;
        String str3;
        int i10;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f76001b;
        al.c cVarB = eVar.b(pluginGeneratedSerialDescriptor);
        if (cVarB.j()) {
            String strI2 = cVarB.i(pluginGeneratedSerialDescriptor, 0);
            String strI3 = cVarB.i(pluginGeneratedSerialDescriptor, 1);
            String strI4 = cVarB.i(pluginGeneratedSerialDescriptor, 2);
            str = strI2;
            strI = cVarB.i(pluginGeneratedSerialDescriptor, 3);
            str2 = strI4;
            str3 = strI3;
            i10 = 15;
        } else {
            String strI5 = null;
            String strI6 = null;
            String strI7 = null;
            String strI8 = null;
            int i11 = 0;
            boolean z10 = true;
            while (z10) {
                int iX = cVarB.x(pluginGeneratedSerialDescriptor);
                if (iX == -1) {
                    z10 = false;
                } else if (iX == 0) {
                    strI5 = cVarB.i(pluginGeneratedSerialDescriptor, 0);
                    i11 |= 1;
                } else if (iX == 1) {
                    strI8 = cVarB.i(pluginGeneratedSerialDescriptor, 1);
                    i11 |= 2;
                } else if (iX == 2) {
                    strI7 = cVarB.i(pluginGeneratedSerialDescriptor, 2);
                    i11 |= 4;
                } else {
                    if (iX != 3) {
                        throw new UnknownFieldException(iX);
                    }
                    strI6 = cVarB.i(pluginGeneratedSerialDescriptor, 3);
                    i11 |= 8;
                }
            }
            str = strI5;
            strI = strI6;
            str2 = strI7;
            str3 = strI8;
            i10 = i11;
        }
        cVarB.c(pluginGeneratedSerialDescriptor);
        return new dx0(i10, str, str3, str2, strI);
    }

    @Override // xk.b, xk.g, xk.a
    public final kotlinx.serialization.descriptors.a getDescriptor() {
        return f76001b;
    }

    @Override // xk.g
    public final void serialize(al.f fVar, Object obj) {
        dx0 dx0Var = (dx0) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f76001b;
        al.d dVarB = fVar.b(pluginGeneratedSerialDescriptor);
        dVarB.p(pluginGeneratedSerialDescriptor, 0, dx0Var.f76835a);
        dVarB.p(pluginGeneratedSerialDescriptor, 1, dx0Var.f76836b);
        dVarB.p(pluginGeneratedSerialDescriptor, 2, dx0Var.f76837c);
        dVarB.p(pluginGeneratedSerialDescriptor, 3, dx0Var.f76838d);
        dVarB.c(pluginGeneratedSerialDescriptor);
    }

    @Override // bl.g0
    public final xk.b[] typeParametersSerializers() {
        return bl.g0.a.a(this);
    }
}
