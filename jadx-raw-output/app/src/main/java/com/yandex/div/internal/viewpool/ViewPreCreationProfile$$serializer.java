package com.yandex.div.internal.viewpool;

import al.c;
import al.d;
import al.e;
import al.f;
import bl.d2;
import bl.g0;
import bl.y1;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.a;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import xk.b;

/* JADX INFO: compiled from: ViewPreCreationProfile.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class ViewPreCreationProfile$$serializer implements g0<ViewPreCreationProfile> {
    public static final ViewPreCreationProfile$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    private ViewPreCreationProfile$$serializer() {
    }

    @Override // xk.a
    public ViewPreCreationProfile deserialize(e eVar) {
        Object objV;
        Object obj;
        Object objV2;
        Object objV3;
        Object objV4;
        Object obj2;
        Object objV5;
        Object objV6;
        Object objV7;
        Object obj3;
        Object objV8;
        Object objV9;
        int i10;
        Object objV10;
        Object objV11;
        Object objV12;
        Object objV13;
        Object obj4;
        Object objV14;
        Object objV15;
        Object objP;
        a descriptor2 = getDescriptor();
        c cVarB = eVar.b(descriptor2);
        if (cVarB.j()) {
            Object objP2 = cVarB.p(descriptor2, 0, d2.f5397a, null);
            PreCreationModel$$serializer preCreationModel$$serializer = PreCreationModel$$serializer.INSTANCE;
            Object objV16 = cVarB.v(descriptor2, 1, preCreationModel$$serializer, null);
            objV14 = cVarB.v(descriptor2, 2, preCreationModel$$serializer, null);
            Object objV17 = cVarB.v(descriptor2, 3, preCreationModel$$serializer, null);
            Object objV18 = cVarB.v(descriptor2, 4, preCreationModel$$serializer, null);
            objV13 = cVarB.v(descriptor2, 5, preCreationModel$$serializer, null);
            objV12 = cVarB.v(descriptor2, 6, preCreationModel$$serializer, null);
            objV11 = cVarB.v(descriptor2, 7, preCreationModel$$serializer, null);
            objV10 = cVarB.v(descriptor2, 8, preCreationModel$$serializer, null);
            objV9 = cVarB.v(descriptor2, 9, preCreationModel$$serializer, null);
            objV4 = cVarB.v(descriptor2, 10, preCreationModel$$serializer, null);
            objV3 = cVarB.v(descriptor2, 11, preCreationModel$$serializer, null);
            objV2 = cVarB.v(descriptor2, 12, preCreationModel$$serializer, null);
            objV8 = cVarB.v(descriptor2, 13, preCreationModel$$serializer, null);
            objV7 = cVarB.v(descriptor2, 14, preCreationModel$$serializer, null);
            objV6 = cVarB.v(descriptor2, 15, preCreationModel$$serializer, null);
            objV5 = cVarB.v(descriptor2, 16, preCreationModel$$serializer, null);
            Object objV19 = cVarB.v(descriptor2, 17, preCreationModel$$serializer, null);
            objV15 = cVarB.v(descriptor2, 18, preCreationModel$$serializer, null);
            i10 = 524287;
            obj4 = objV17;
            obj3 = objV16;
            objV = objV18;
            obj2 = objV19;
            obj = objP2;
        } else {
            boolean z10 = true;
            Object objV20 = null;
            Object objV21 = null;
            Object objV22 = null;
            Object objV23 = null;
            Object objV24 = null;
            Object objV25 = null;
            Object objV26 = null;
            Object objV27 = null;
            Object objV28 = null;
            Object objV29 = null;
            objV = null;
            Object obj5 = null;
            Object objV30 = null;
            Object objV31 = null;
            Object objV32 = null;
            Object objV33 = null;
            Object objV34 = null;
            Object objV35 = null;
            int i11 = 0;
            Object objV36 = null;
            while (z10) {
                int iX = cVarB.x(descriptor2);
                switch (iX) {
                    case -1:
                        objP = obj5;
                        z10 = false;
                        objV20 = objV20;
                        objV36 = objV36;
                        obj5 = objP;
                        objV21 = objV21;
                        break;
                    case 0:
                        objP = cVarB.p(descriptor2, 0, d2.f5397a, obj5);
                        i11 |= 1;
                        objV20 = objV20;
                        objV36 = objV36;
                        objV35 = objV35;
                        obj5 = objP;
                        objV21 = objV21;
                        break;
                    case 1:
                        objV35 = cVarB.v(descriptor2, 1, PreCreationModel$$serializer.INSTANCE, objV35);
                        i11 |= 2;
                        objV20 = objV20;
                        objV36 = objV36;
                        objV21 = objV21;
                        break;
                    case 2:
                        i11 |= 4;
                        objV20 = cVarB.v(descriptor2, 2, PreCreationModel$$serializer.INSTANCE, objV20);
                        objV36 = objV36;
                        objV30 = objV30;
                        break;
                    case 3:
                        objV23 = cVarB.v(descriptor2, 3, PreCreationModel$$serializer.INSTANCE, objV23);
                        i11 |= 8;
                        objV36 = objV36;
                        objV20 = objV20;
                        break;
                    case 4:
                        objV = cVarB.v(descriptor2, 4, PreCreationModel$$serializer.INSTANCE, objV);
                        i11 |= 16;
                        objV36 = objV36;
                        objV20 = objV20;
                        break;
                    case 5:
                        objV21 = cVarB.v(descriptor2, 5, PreCreationModel$$serializer.INSTANCE, objV21);
                        i11 |= 32;
                        objV36 = objV36;
                        objV20 = objV20;
                        break;
                    case 6:
                        objV29 = cVarB.v(descriptor2, 6, PreCreationModel$$serializer.INSTANCE, objV29);
                        i11 |= 64;
                        objV36 = objV36;
                        objV20 = objV20;
                        break;
                    case 7:
                        objV28 = cVarB.v(descriptor2, 7, PreCreationModel$$serializer.INSTANCE, objV28);
                        i11 |= 128;
                        objV36 = objV36;
                        objV20 = objV20;
                        break;
                    case 8:
                        objV27 = cVarB.v(descriptor2, 8, PreCreationModel$$serializer.INSTANCE, objV27);
                        i11 |= 256;
                        objV36 = objV36;
                        objV20 = objV20;
                        break;
                    case 9:
                        objV22 = cVarB.v(descriptor2, 9, PreCreationModel$$serializer.INSTANCE, objV22);
                        i11 |= 512;
                        objV36 = objV36;
                        objV20 = objV20;
                        break;
                    case 10:
                        objV26 = cVarB.v(descriptor2, 10, PreCreationModel$$serializer.INSTANCE, objV26);
                        i11 |= 1024;
                        objV36 = objV36;
                        objV20 = objV20;
                        break;
                    case 11:
                        objV25 = cVarB.v(descriptor2, 11, PreCreationModel$$serializer.INSTANCE, objV25);
                        i11 |= 2048;
                        objV36 = objV36;
                        objV20 = objV20;
                        break;
                    case 12:
                        objV24 = cVarB.v(descriptor2, 12, PreCreationModel$$serializer.INSTANCE, objV24);
                        i11 |= 4096;
                        objV36 = objV36;
                        objV20 = objV20;
                        break;
                    case 13:
                        objV20 = objV20;
                        objV30 = cVarB.v(descriptor2, 13, PreCreationModel$$serializer.INSTANCE, objV30);
                        i11 |= 8192;
                        objV36 = objV36;
                        objV31 = objV31;
                        objV20 = objV20;
                        break;
                    case 14:
                        objV20 = objV20;
                        objV31 = cVarB.v(descriptor2, 14, PreCreationModel$$serializer.INSTANCE, objV31);
                        i11 |= 16384;
                        objV36 = objV36;
                        objV32 = objV32;
                        objV20 = objV20;
                        break;
                    case 15:
                        objV20 = objV20;
                        objV32 = cVarB.v(descriptor2, 15, PreCreationModel$$serializer.INSTANCE, objV32);
                        i11 |= 32768;
                        objV36 = objV36;
                        objV33 = objV33;
                        objV20 = objV20;
                        break;
                    case 16:
                        objV20 = objV20;
                        objV33 = cVarB.v(descriptor2, 16, PreCreationModel$$serializer.INSTANCE, objV33);
                        i11 |= 65536;
                        objV36 = objV36;
                        objV34 = objV34;
                        objV20 = objV20;
                        break;
                    case 17:
                        objV34 = cVarB.v(descriptor2, 17, PreCreationModel$$serializer.INSTANCE, objV34);
                        i11 |= 131072;
                        objV36 = objV36;
                        objV20 = objV20;
                        break;
                    case 18:
                        objV36 = cVarB.v(descriptor2, 18, PreCreationModel$$serializer.INSTANCE, objV36);
                        i11 |= 262144;
                        objV20 = objV20;
                        break;
                    default:
                        throw new UnknownFieldException(iX);
                }
            }
            Object obj6 = objV21;
            Object obj7 = objV36;
            Object obj8 = objV20;
            obj = obj5;
            objV2 = objV24;
            objV3 = objV25;
            objV4 = objV26;
            obj2 = objV34;
            objV5 = objV33;
            objV6 = objV32;
            objV7 = objV31;
            obj3 = objV35;
            objV8 = objV30;
            objV9 = objV22;
            i10 = i11;
            objV10 = objV27;
            objV11 = objV28;
            objV12 = objV29;
            objV13 = obj6;
            obj4 = objV23;
            objV14 = obj8;
            objV15 = obj7;
        }
        cVarB.c(descriptor2);
        return new ViewPreCreationProfile(i10, (String) obj, (PreCreationModel) obj3, (PreCreationModel) objV14, (PreCreationModel) obj4, (PreCreationModel) objV, (PreCreationModel) objV13, (PreCreationModel) objV12, (PreCreationModel) objV11, (PreCreationModel) objV10, (PreCreationModel) objV9, (PreCreationModel) objV4, (PreCreationModel) objV3, (PreCreationModel) objV2, (PreCreationModel) objV8, (PreCreationModel) objV7, (PreCreationModel) objV6, (PreCreationModel) objV5, (PreCreationModel) obj2, (PreCreationModel) objV15, (y1) null);
    }

    @Override // xk.g
    public void serialize(f fVar, ViewPreCreationProfile viewPreCreationProfile) {
        a descriptor2 = getDescriptor();
        d dVarB = fVar.b(descriptor2);
        ViewPreCreationProfile.write$Self(viewPreCreationProfile, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    static {
        ViewPreCreationProfile$$serializer viewPreCreationProfile$$serializer = new ViewPreCreationProfile$$serializer();
        INSTANCE = viewPreCreationProfile$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.div.internal.viewpool.ViewPreCreationProfile", viewPreCreationProfile$$serializer, 19);
        pluginGeneratedSerialDescriptor.k("id", true);
        pluginGeneratedSerialDescriptor.k("text", true);
        pluginGeneratedSerialDescriptor.k("image", true);
        pluginGeneratedSerialDescriptor.k("gifImage", true);
        pluginGeneratedSerialDescriptor.k("overlapContainer", true);
        pluginGeneratedSerialDescriptor.k("linearContainer", true);
        pluginGeneratedSerialDescriptor.k("wrapContainer", true);
        pluginGeneratedSerialDescriptor.k("grid", true);
        pluginGeneratedSerialDescriptor.k("gallery", true);
        pluginGeneratedSerialDescriptor.k("pager", true);
        pluginGeneratedSerialDescriptor.k("tab", true);
        pluginGeneratedSerialDescriptor.k("state", true);
        pluginGeneratedSerialDescriptor.k("custom", true);
        pluginGeneratedSerialDescriptor.k("indicator", true);
        pluginGeneratedSerialDescriptor.k("slider", true);
        pluginGeneratedSerialDescriptor.k("input", true);
        pluginGeneratedSerialDescriptor.k("select", true);
        pluginGeneratedSerialDescriptor.k("video", true);
        pluginGeneratedSerialDescriptor.k("switch", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // bl.g0
    public b<?>[] childSerializers() {
        PreCreationModel$$serializer preCreationModel$$serializer = PreCreationModel$$serializer.INSTANCE;
        return new b[]{yk.a.t(d2.f5397a), preCreationModel$$serializer, preCreationModel$$serializer, preCreationModel$$serializer, preCreationModel$$serializer, preCreationModel$$serializer, preCreationModel$$serializer, preCreationModel$$serializer, preCreationModel$$serializer, preCreationModel$$serializer, preCreationModel$$serializer, preCreationModel$$serializer, preCreationModel$$serializer, preCreationModel$$serializer, preCreationModel$$serializer, preCreationModel$$serializer, preCreationModel$$serializer, preCreationModel$$serializer, preCreationModel$$serializer};
    }

    @Override // xk.b, xk.g, xk.a
    public a getDescriptor() {
        return descriptor;
    }

    @Override // bl.g0
    public b<?>[] typeParametersSerializers() {
        return g0.a.a(this);
    }
}
