package yads;

import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes10.dex */
public final class yh2 implements bl.g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final yh2 f84966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f84967b;

    static {
        yh2 yh2Var = new yh2();
        f84966a = yh2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.monetization.ads.base.model.mediation.prefetch.PrefetchedMediationResult", yh2Var, 3);
        pluginGeneratedSerialDescriptor.k("status", false);
        pluginGeneratedSerialDescriptor.k("error_message", false);
        pluginGeneratedSerialDescriptor.k("status_code", false);
        f84967b = pluginGeneratedSerialDescriptor;
    }

    @Override // bl.g0
    public final xk.b[] childSerializers() {
        return new xk.b[]{ai2.f75527d[0], yk.a.t(bl.d2.f5397a), yk.a.t(bl.p0.f5452a)};
    }

    @Override // xk.a
    public final Object deserialize(al.e eVar) {
        String str;
        di2 di2Var;
        Integer num;
        int i10;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f84967b;
        al.c cVarB = eVar.b(pluginGeneratedSerialDescriptor);
        xk.b[] bVarArr = ai2.f75527d;
        di2 di2Var2 = null;
        if (cVarB.j()) {
            di2Var = (di2) cVarB.v(pluginGeneratedSerialDescriptor, 0, bVarArr[0], null);
            str = (String) cVarB.p(pluginGeneratedSerialDescriptor, 1, bl.d2.f5397a, null);
            num = (Integer) cVarB.p(pluginGeneratedSerialDescriptor, 2, bl.p0.f5452a, null);
            i10 = 7;
        } else {
            str = null;
            Integer num2 = null;
            boolean z10 = true;
            int i11 = 0;
            while (z10) {
                int iX = cVarB.x(pluginGeneratedSerialDescriptor);
                if (iX == -1) {
                    z10 = false;
                } else if (iX == 0) {
                    di2Var2 = (di2) cVarB.v(pluginGeneratedSerialDescriptor, 0, bVarArr[0], di2Var2);
                    i11 |= 1;
                } else if (iX == 1) {
                    str = (String) cVarB.p(pluginGeneratedSerialDescriptor, 1, bl.d2.f5397a, str);
                    i11 |= 2;
                } else {
                    if (iX != 2) {
                        throw new UnknownFieldException(iX);
                    }
                    num2 = (Integer) cVarB.p(pluginGeneratedSerialDescriptor, 2, bl.p0.f5452a, num2);
                    i11 |= 4;
                }
            }
            di2Var = di2Var2;
            num = num2;
            i10 = i11;
        }
        cVarB.c(pluginGeneratedSerialDescriptor);
        return new ai2(i10, di2Var, str, num);
    }

    @Override // xk.b, xk.g, xk.a
    public final kotlinx.serialization.descriptors.a getDescriptor() {
        return f84967b;
    }

    @Override // xk.g
    public final void serialize(al.f fVar, Object obj) {
        ai2 ai2Var = (ai2) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f84967b;
        al.d dVarB = fVar.b(pluginGeneratedSerialDescriptor);
        dVarB.m(pluginGeneratedSerialDescriptor, 0, ai2.f75527d[0], ai2Var.f75528a);
        dVarB.C(pluginGeneratedSerialDescriptor, 1, bl.d2.f5397a, ai2Var.f75529b);
        dVarB.C(pluginGeneratedSerialDescriptor, 2, bl.p0.f5452a, ai2Var.f75530c);
        dVarB.c(pluginGeneratedSerialDescriptor);
    }

    @Override // bl.g0
    public final xk.b[] typeParametersSerializers() {
        return bl.g0.a.a(this);
    }
}
