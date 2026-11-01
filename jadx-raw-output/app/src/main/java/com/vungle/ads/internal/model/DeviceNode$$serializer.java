package com.vungle.ads.internal.model;

import al.c;
import al.d;
import al.e;
import al.f;
import bl.d2;
import bl.g0;
import bl.p0;
import bl.y1;
import ck.p;
import com.ironsource.Q6;
import kotlin.Metadata;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.a;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import xk.b;

/* JADX INFO: compiled from: DeviceNode.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/vungle/ads/internal/model/DeviceNode.$serializer", "Lbl/g0;", "Lcom/vungle/ads/internal/model/DeviceNode;", "", "Lxk/b;", "childSerializers", "()[Lxk/b;", "Lal/e;", "decoder", "deserialize", "Lal/f;", "encoder", "value", "Lmj/r;", "serialize", "Lkotlinx/serialization/descriptors/a;", "getDescriptor", "()Lkotlinx/serialization/descriptors/a;", "descriptor", "<init>", "()V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class DeviceNode$$serializer implements g0<DeviceNode> {
    public static final DeviceNode$$serializer INSTANCE;
    public static final /* synthetic */ a descriptor;

    private DeviceNode$$serializer() {
    }

    @Override // xk.a
    public DeviceNode deserialize(e decoder) {
        Object objP;
        String strI;
        Object objP2;
        Object objP3;
        Object objP4;
        Object objP5;
        int i10;
        String str;
        String str2;
        int i11;
        int i12;
        String str3;
        p.j(decoder, "decoder");
        a descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        int i13 = 10;
        int i14 = 9;
        if (cVarB.j()) {
            String strI2 = cVarB.i(descriptor2, 0);
            String strI3 = cVarB.i(descriptor2, 1);
            String strI4 = cVarB.i(descriptor2, 2);
            d2 d2Var = d2.f5397a;
            objP5 = cVarB.p(descriptor2, 3, d2Var, null);
            String strI5 = cVarB.i(descriptor2, 4);
            int iF = cVarB.f(descriptor2, 5);
            int iF2 = cVarB.f(descriptor2, 6);
            objP4 = cVarB.p(descriptor2, 7, d2Var, null);
            Object objP6 = cVarB.p(descriptor2, 8, d2Var, null);
            objP2 = cVarB.p(descriptor2, 9, p0.f5452a, null);
            objP3 = cVarB.p(descriptor2, 10, DeviceNode$VungleExt$$serializer.INSTANCE, null);
            i11 = iF2;
            i12 = iF;
            str3 = strI5;
            strI = strI3;
            str = strI2;
            str2 = strI4;
            objP = objP6;
            i10 = 2047;
        } else {
            boolean z10 = true;
            int iF3 = 0;
            int i15 = 0;
            Object objP7 = null;
            Object objP8 = null;
            objP = null;
            Object objP9 = null;
            String strI6 = null;
            strI = null;
            String strI7 = null;
            String strI8 = null;
            Object objP10 = null;
            int iF4 = 0;
            while (z10) {
                int iX = cVarB.x(descriptor2);
                switch (iX) {
                    case -1:
                        z10 = false;
                        i13 = 10;
                        break;
                    case 0:
                        strI6 = cVarB.i(descriptor2, 0);
                        i15 |= 1;
                        i13 = 10;
                        i14 = 9;
                        break;
                    case 1:
                        strI = cVarB.i(descriptor2, 1);
                        i15 |= 2;
                        i13 = 10;
                        i14 = 9;
                        break;
                    case 2:
                        strI7 = cVarB.i(descriptor2, 2);
                        i15 |= 4;
                        i13 = 10;
                        i14 = 9;
                        break;
                    case 3:
                        objP10 = cVarB.p(descriptor2, 3, d2.f5397a, objP10);
                        i15 |= 8;
                        i13 = 10;
                        i14 = 9;
                        break;
                    case 4:
                        strI8 = cVarB.i(descriptor2, 4);
                        i15 |= 16;
                        i13 = 10;
                        break;
                    case 5:
                        iF4 = cVarB.f(descriptor2, 5);
                        i15 |= 32;
                        break;
                    case 6:
                        iF3 = cVarB.f(descriptor2, 6);
                        i15 |= 64;
                        break;
                    case 7:
                        objP9 = cVarB.p(descriptor2, 7, d2.f5397a, objP9);
                        i15 |= 128;
                        break;
                    case 8:
                        objP = cVarB.p(descriptor2, 8, d2.f5397a, objP);
                        i15 |= 256;
                        break;
                    case 9:
                        objP7 = cVarB.p(descriptor2, i14, p0.f5452a, objP7);
                        i15 |= 512;
                        break;
                    case 10:
                        objP8 = cVarB.p(descriptor2, i13, DeviceNode$VungleExt$$serializer.INSTANCE, objP8);
                        i15 |= 1024;
                        break;
                    default:
                        throw new UnknownFieldException(iX);
                }
            }
            objP2 = objP7;
            objP3 = objP8;
            objP4 = objP9;
            objP5 = objP10;
            i10 = i15;
            str = strI6;
            str2 = strI7;
            i11 = iF3;
            i12 = iF4;
            str3 = strI8;
        }
        cVarB.c(descriptor2);
        return new DeviceNode(i10, str, strI, str2, (String) objP5, str3, i12, i11, (String) objP4, (String) objP, (Integer) objP2, (DeviceNode.VungleExt) objP3, (y1) null);
    }

    @Override // xk.b, xk.g, xk.a
    public a getDescriptor() {
        return descriptor;
    }

    @Override // xk.g
    public void serialize(f fVar, DeviceNode deviceNode) {
        p.j(fVar, "encoder");
        p.j(deviceNode, "value");
        a descriptor2 = getDescriptor();
        d dVarB = fVar.b(descriptor2);
        DeviceNode.write$Self(deviceNode, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    static {
        DeviceNode$$serializer deviceNode$$serializer = new DeviceNode$$serializer();
        INSTANCE = deviceNode$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.DeviceNode", deviceNode$$serializer, 11);
        pluginGeneratedSerialDescriptor.k(Q6.f27469t, false);
        pluginGeneratedSerialDescriptor.k("model", false);
        pluginGeneratedSerialDescriptor.k(Q6.G, false);
        pluginGeneratedSerialDescriptor.k(Q6.Q0, true);
        pluginGeneratedSerialDescriptor.k(Q6.F, false);
        pluginGeneratedSerialDescriptor.k("w", false);
        pluginGeneratedSerialDescriptor.k("h", false);
        pluginGeneratedSerialDescriptor.k(Q6.f27422d0, true);
        pluginGeneratedSerialDescriptor.k("ifa", true);
        pluginGeneratedSerialDescriptor.k("lmt", true);
        pluginGeneratedSerialDescriptor.k("ext", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // bl.g0
    public b<?>[] childSerializers() {
        d2 d2Var = d2.f5397a;
        p0 p0Var = p0.f5452a;
        return new b[]{d2Var, d2Var, d2Var, yk.a.t(d2Var), d2Var, p0Var, p0Var, yk.a.t(d2Var), yk.a.t(d2Var), yk.a.t(p0Var), yk.a.t(DeviceNode$VungleExt$$serializer.INSTANCE)};
    }

    @Override // bl.g0
    public b<?>[] typeParametersSerializers() {
        return g0.a.a(this);
    }
}
