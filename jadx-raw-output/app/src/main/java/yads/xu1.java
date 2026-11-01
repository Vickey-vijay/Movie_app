package yads;

import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final class xu1 implements bl.g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xu1 f84694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f84695b;

    @Override // bl.g0
    public final xk.b[] childSerializers() {
        bl.d2 d2Var = bl.d2.f5397a;
        return new xk.b[]{bl.a1.f5375a, d2Var, d2Var, d2Var};
    }

    static {
        xu1 xu1Var = new xu1();
        f84694a = xu1Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.monetization.ads.utils.logger.model.MobileAdsSdkLog", xu1Var, 4);
        pluginGeneratedSerialDescriptor.k("timestamp", false);
        pluginGeneratedSerialDescriptor.k("type", false);
        pluginGeneratedSerialDescriptor.k("tag", false);
        pluginGeneratedSerialDescriptor.k("text", false);
        f84695b = pluginGeneratedSerialDescriptor;
    }

    @Override // xk.a
    public final Object deserialize(al.e eVar) {
        String str;
        String strI;
        String str2;
        int i10;
        long j10;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f84695b;
        al.c cVarB = eVar.b(pluginGeneratedSerialDescriptor);
        if (cVarB.j()) {
            long jE = cVarB.e(pluginGeneratedSerialDescriptor, 0);
            String strI2 = cVarB.i(pluginGeneratedSerialDescriptor, 1);
            String strI3 = cVarB.i(pluginGeneratedSerialDescriptor, 2);
            str = strI2;
            strI = cVarB.i(pluginGeneratedSerialDescriptor, 3);
            str2 = strI3;
            i10 = 15;
            j10 = jE;
        } else {
            String strI4 = null;
            int i11 = 0;
            boolean z10 = true;
            long jE2 = 0;
            String strI5 = null;
            String strI6 = null;
            while (z10) {
                int iX = cVarB.x(pluginGeneratedSerialDescriptor);
                if (iX == -1) {
                    z10 = false;
                } else if (iX == 0) {
                    jE2 = cVarB.e(pluginGeneratedSerialDescriptor, 0);
                    i11 |= 1;
                } else if (iX == 1) {
                    strI4 = cVarB.i(pluginGeneratedSerialDescriptor, 1);
                    i11 |= 2;
                } else if (iX == 2) {
                    strI6 = cVarB.i(pluginGeneratedSerialDescriptor, 2);
                    i11 |= 4;
                } else {
                    if (iX != 3) {
                        throw new UnknownFieldException(iX);
                    }
                    strI5 = cVarB.i(pluginGeneratedSerialDescriptor, 3);
                    i11 |= 8;
                }
            }
            str = strI4;
            strI = strI5;
            str2 = strI6;
            i10 = i11;
            j10 = jE2;
        }
        cVarB.c(pluginGeneratedSerialDescriptor);
        return new zu1(i10, j10, str, str2, strI);
    }

    @Override // xk.b, xk.g, xk.a
    public final kotlinx.serialization.descriptors.a getDescriptor() {
        return f84695b;
    }

    @Override // xk.g
    public final void serialize(al.f fVar, Object obj) {
        zu1 zu1Var = (zu1) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f84695b;
        al.d dVarB = fVar.b(pluginGeneratedSerialDescriptor);
        dVarB.u(pluginGeneratedSerialDescriptor, 0, zu1Var.f85590a);
        dVarB.p(pluginGeneratedSerialDescriptor, 1, zu1Var.f85591b);
        dVarB.p(pluginGeneratedSerialDescriptor, 2, zu1Var.f85592c);
        dVarB.p(pluginGeneratedSerialDescriptor, 3, zu1Var.f85593d);
        dVarB.c(pluginGeneratedSerialDescriptor);
    }

    @Override // bl.g0
    public final xk.b[] typeParametersSerializers() {
        return bl.g0.a.a(this);
    }
}
