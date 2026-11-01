package yads;

import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes8.dex */
public final class kd2 implements bl.g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final kd2 f79392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f79393b;

    static {
        kd2 kd2Var = new kd2();
        f79392a = kd2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.monetization.ads.core.configuration.model.PlayBackOptimizationConfig", kd2Var, 5);
        pluginGeneratedSerialDescriptor.k("minBufferMs", true);
        pluginGeneratedSerialDescriptor.k("maxBufferMs", true);
        pluginGeneratedSerialDescriptor.k("bufferForPlaybackMs", true);
        pluginGeneratedSerialDescriptor.k("bufferForPlaybackAfterRebufferMs", true);
        pluginGeneratedSerialDescriptor.k("targetBufferBytes", true);
        f79393b = pluginGeneratedSerialDescriptor;
    }

    @Override // bl.g0
    public final xk.b[] childSerializers() {
        bl.p0 p0Var = bl.p0.f5452a;
        return new xk.b[]{yk.a.t(p0Var), yk.a.t(p0Var), yk.a.t(p0Var), yk.a.t(p0Var), yk.a.t(p0Var)};
    }

    @Override // xk.a
    public final Object deserialize(al.e eVar) {
        int i10;
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f79393b;
        al.c cVarB = eVar.b(pluginGeneratedSerialDescriptor);
        Integer num6 = null;
        if (cVarB.j()) {
            bl.p0 p0Var = bl.p0.f5452a;
            Integer num7 = (Integer) cVarB.p(pluginGeneratedSerialDescriptor, 0, p0Var, null);
            Integer num8 = (Integer) cVarB.p(pluginGeneratedSerialDescriptor, 1, p0Var, null);
            Integer num9 = (Integer) cVarB.p(pluginGeneratedSerialDescriptor, 2, p0Var, null);
            Integer num10 = (Integer) cVarB.p(pluginGeneratedSerialDescriptor, 3, p0Var, null);
            num5 = (Integer) cVarB.p(pluginGeneratedSerialDescriptor, 4, p0Var, null);
            num4 = num10;
            i10 = 31;
            num3 = num9;
            num = num7;
            num2 = num8;
        } else {
            int i11 = 0;
            Integer num11 = null;
            Integer num12 = null;
            Integer num13 = null;
            Integer num14 = null;
            boolean z10 = true;
            while (z10) {
                int iX = cVarB.x(pluginGeneratedSerialDescriptor);
                if (iX == -1) {
                    z10 = false;
                } else if (iX == 0) {
                    num6 = (Integer) cVarB.p(pluginGeneratedSerialDescriptor, 0, bl.p0.f5452a, num6);
                    i11 |= 1;
                } else if (iX == 1) {
                    num11 = (Integer) cVarB.p(pluginGeneratedSerialDescriptor, 1, bl.p0.f5452a, num11);
                    i11 |= 2;
                } else if (iX == 2) {
                    num12 = (Integer) cVarB.p(pluginGeneratedSerialDescriptor, 2, bl.p0.f5452a, num12);
                    i11 |= 4;
                } else if (iX == 3) {
                    num13 = (Integer) cVarB.p(pluginGeneratedSerialDescriptor, 3, bl.p0.f5452a, num13);
                    i11 |= 8;
                } else {
                    if (iX != 4) {
                        throw new UnknownFieldException(iX);
                    }
                    num14 = (Integer) cVarB.p(pluginGeneratedSerialDescriptor, 4, bl.p0.f5452a, num14);
                    i11 |= 16;
                }
            }
            i10 = i11;
            num = num6;
            num2 = num11;
            num3 = num12;
            num4 = num13;
            num5 = num14;
        }
        cVarB.c(pluginGeneratedSerialDescriptor);
        return new md2(i10, num, num2, num3, num4, num5);
    }

    @Override // xk.b, xk.g, xk.a
    public final kotlinx.serialization.descriptors.a getDescriptor() {
        return f79393b;
    }

    @Override // xk.g
    public final void serialize(al.f fVar, Object obj) {
        md2 md2Var = (md2) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f79393b;
        al.d dVarB = fVar.b(pluginGeneratedSerialDescriptor);
        if (dVarB.q(pluginGeneratedSerialDescriptor, 0) || md2Var.f80142a != null) {
            dVarB.C(pluginGeneratedSerialDescriptor, 0, bl.p0.f5452a, md2Var.f80142a);
        }
        if (dVarB.q(pluginGeneratedSerialDescriptor, 1) || md2Var.f80143b != null) {
            dVarB.C(pluginGeneratedSerialDescriptor, 1, bl.p0.f5452a, md2Var.f80143b);
        }
        if (dVarB.q(pluginGeneratedSerialDescriptor, 2) || md2Var.f80144c != null) {
            dVarB.C(pluginGeneratedSerialDescriptor, 2, bl.p0.f5452a, md2Var.f80144c);
        }
        if (dVarB.q(pluginGeneratedSerialDescriptor, 3) || md2Var.f80145d != null) {
            dVarB.C(pluginGeneratedSerialDescriptor, 3, bl.p0.f5452a, md2Var.f80145d);
        }
        if (dVarB.q(pluginGeneratedSerialDescriptor, 4) || md2Var.f80146e != null) {
            dVarB.C(pluginGeneratedSerialDescriptor, 4, bl.p0.f5452a, md2Var.f80146e);
        }
        dVarB.c(pluginGeneratedSerialDescriptor);
    }

    @Override // bl.g0
    public final xk.b[] typeParametersSerializers() {
        return bl.g0.a.a(this);
    }
}
