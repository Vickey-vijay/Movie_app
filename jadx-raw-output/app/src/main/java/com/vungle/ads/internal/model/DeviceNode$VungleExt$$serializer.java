package com.vungle.ads.internal.model;

import al.c;
import al.d;
import al.e;
import al.f;
import bl.a1;
import bl.d2;
import bl.f0;
import bl.g0;
import bl.i;
import bl.p0;
import bl.y1;
import ck.p;
import com.ironsource.Q6;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import kotlin.Metadata;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.a;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import xk.b;

/* JADX INFO: compiled from: DeviceNode.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/vungle/ads/internal/model/DeviceNode.VungleExt.$serializer", "Lbl/g0;", "Lcom/vungle/ads/internal/model/DeviceNode$VungleExt;", "", "Lxk/b;", "childSerializers", "()[Lxk/b;", "Lal/e;", "decoder", "deserialize", "Lal/f;", "encoder", "value", "Lmj/r;", "serialize", "Lkotlinx/serialization/descriptors/a;", "getDescriptor", "()Lkotlinx/serialization/descriptors/a;", "descriptor", "<init>", "()V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class DeviceNode$VungleExt$$serializer implements g0<DeviceNode.VungleExt> {
    public static final DeviceNode$VungleExt$$serializer INSTANCE;
    public static final /* synthetic */ a descriptor;

    private DeviceNode$VungleExt$$serializer() {
    }

    @Override // xk.a
    public DeviceNode.VungleExt deserialize(e decoder) {
        Object objP;
        int iF;
        int iF2;
        float fA;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        int i10;
        Object obj8;
        Object obj9;
        Object obj10;
        Object obj11;
        Object obj12;
        Object obj13;
        boolean z10;
        float f10;
        boolean z11;
        boolean z12;
        int i11;
        Object objP2;
        int i12;
        int i13;
        p.j(decoder, "decoder");
        a descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        int i14 = 0;
        if (cVarB.j()) {
            boolean zD = cVarB.D(descriptor2, 0);
            d2 d2Var = d2.f5397a;
            Object objP3 = cVarB.p(descriptor2, 1, d2Var, null);
            Object objP4 = cVarB.p(descriptor2, 2, p0.f5452a, null);
            float fA2 = cVarB.A(descriptor2, 3);
            Object objP5 = cVarB.p(descriptor2, 4, d2Var, null);
            int iF3 = cVarB.f(descriptor2, 5);
            Object objP6 = cVarB.p(descriptor2, 6, d2Var, null);
            Object objP7 = cVarB.p(descriptor2, 7, d2Var, null);
            Object objP8 = cVarB.p(descriptor2, 8, d2Var, null);
            Object objP9 = cVarB.p(descriptor2, 9, d2Var, null);
            Object objP10 = cVarB.p(descriptor2, 10, d2Var, null);
            float fA3 = cVarB.A(descriptor2, 11);
            int iF4 = cVarB.f(descriptor2, 12);
            boolean zD2 = cVarB.D(descriptor2, 13);
            int iF5 = cVarB.f(descriptor2, 14);
            boolean zD3 = cVarB.D(descriptor2, 15);
            obj5 = objP3;
            Object objP11 = cVarB.p(descriptor2, 16, d2Var, null);
            Object objP12 = cVarB.p(descriptor2, 17, d2Var, null);
            a1 a1Var = a1.f5375a;
            f10 = fA2;
            Object objP13 = cVarB.p(descriptor2, 18, a1Var, null);
            Object objP14 = cVarB.p(descriptor2, 19, a1Var, null);
            Object objP15 = cVarB.p(descriptor2, 20, a1Var, null);
            Object objP16 = cVarB.p(descriptor2, 21, a1Var, null);
            objP2 = cVarB.p(descriptor2, 22, d2Var, null);
            obj3 = objP5;
            obj4 = objP4;
            iF = iF4;
            iF2 = iF3;
            obj2 = objP7;
            obj = objP6;
            fA = fA3;
            obj10 = objP13;
            z10 = zD3;
            z11 = zD;
            obj8 = objP15;
            obj9 = objP16;
            obj13 = objP8;
            obj11 = objP10;
            z12 = zD2;
            obj6 = objP11;
            obj7 = objP14;
            obj12 = objP9;
            objP = objP12;
            i11 = iF5;
            i10 = 8388607;
        } else {
            Object objP17 = null;
            boolean z13 = true;
            Object objP18 = null;
            Object objP19 = null;
            Object objP20 = null;
            Object objP21 = null;
            Object objP22 = null;
            Object objP23 = null;
            Object objP24 = null;
            objP = null;
            Object objP25 = null;
            Object objP26 = null;
            Object objP27 = null;
            Object objP28 = null;
            Object objP29 = null;
            boolean zD4 = false;
            iF = 0;
            boolean zD5 = false;
            boolean zD6 = false;
            int iF6 = 0;
            iF2 = 0;
            float fA4 = 0.0f;
            fA = 0.0f;
            Object objP30 = null;
            while (z13) {
                Object obj14 = objP22;
                int iX = cVarB.x(descriptor2);
                switch (iX) {
                    case -1:
                        z13 = false;
                        objP22 = obj14;
                        objP18 = objP18;
                        objP28 = objP28;
                        objP20 = objP20;
                        break;
                    case 0:
                        zD5 = cVarB.D(descriptor2, 0);
                        i14 |= 1;
                        objP18 = objP18;
                        objP22 = obj14;
                        objP19 = objP19;
                        objP28 = objP28;
                        objP20 = objP20;
                        break;
                    case 1:
                        i14 |= 2;
                        objP29 = objP29;
                        objP22 = obj14;
                        objP19 = objP19;
                        objP20 = objP20;
                        objP28 = cVarB.p(descriptor2, 1, d2.f5397a, objP28);
                        objP18 = objP18;
                        break;
                    case 2:
                        objP29 = cVarB.p(descriptor2, 2, p0.f5452a, objP29);
                        i14 |= 4;
                        objP18 = objP18;
                        objP22 = obj14;
                        objP19 = objP19;
                        objP20 = objP20;
                        break;
                    case 3:
                        fA4 = cVarB.A(descriptor2, 3);
                        i14 |= 8;
                        objP18 = objP18;
                        objP22 = obj14;
                        objP19 = objP19;
                        objP20 = objP20;
                        break;
                    case 4:
                        i14 |= 16;
                        objP22 = cVarB.p(descriptor2, 4, d2.f5397a, obj14);
                        objP19 = objP19;
                        objP20 = objP20;
                        objP18 = objP18;
                        break;
                    case 5:
                        iF2 = cVarB.f(descriptor2, 5);
                        i14 |= 32;
                        objP18 = objP18;
                        objP20 = objP20;
                        objP22 = obj14;
                        break;
                    case 6:
                        objP19 = cVarB.p(descriptor2, 6, d2.f5397a, objP19);
                        i14 |= 64;
                        objP18 = objP18;
                        objP20 = objP20;
                        objP22 = obj14;
                        break;
                    case 7:
                        objP18 = objP18;
                        objP19 = objP19;
                        objP20 = cVarB.p(descriptor2, 7, d2.f5397a, objP20);
                        i14 |= 128;
                        objP18 = objP18;
                        objP22 = obj14;
                        objP19 = objP19;
                        break;
                    case 8:
                        objP18 = objP18;
                        objP19 = objP19;
                        objP27 = cVarB.p(descriptor2, 8, d2.f5397a, objP27);
                        i14 |= 256;
                        objP18 = objP18;
                        objP22 = obj14;
                        objP19 = objP19;
                        break;
                    case 9:
                        objP18 = objP18;
                        objP19 = objP19;
                        objP26 = cVarB.p(descriptor2, 9, d2.f5397a, objP26);
                        i14 |= 512;
                        objP18 = objP18;
                        objP22 = obj14;
                        objP19 = objP19;
                        break;
                    case 10:
                        objP18 = objP18;
                        objP19 = objP19;
                        objP25 = cVarB.p(descriptor2, 10, d2.f5397a, objP25);
                        i14 |= 1024;
                        objP18 = objP18;
                        objP22 = obj14;
                        objP19 = objP19;
                        break;
                    case 11:
                        objP18 = objP18;
                        objP19 = objP19;
                        fA = cVarB.A(descriptor2, 11);
                        i14 |= 2048;
                        objP18 = objP18;
                        objP22 = obj14;
                        objP19 = objP19;
                        break;
                    case 12:
                        objP18 = objP18;
                        objP19 = objP19;
                        iF = cVarB.f(descriptor2, 12);
                        i14 |= 4096;
                        objP18 = objP18;
                        objP22 = obj14;
                        objP19 = objP19;
                        break;
                    case 13:
                        objP18 = objP18;
                        objP19 = objP19;
                        zD6 = cVarB.D(descriptor2, 13);
                        i14 |= 8192;
                        objP18 = objP18;
                        objP22 = obj14;
                        objP19 = objP19;
                        break;
                    case 14:
                        objP18 = objP18;
                        objP19 = objP19;
                        iF6 = cVarB.f(descriptor2, 14);
                        i14 |= 16384;
                        objP18 = objP18;
                        objP22 = obj14;
                        objP19 = objP19;
                        break;
                    case 15:
                        objP18 = objP18;
                        objP19 = objP19;
                        zD4 = cVarB.D(descriptor2, 15);
                        i14 |= 32768;
                        objP18 = objP18;
                        objP22 = obj14;
                        objP19 = objP19;
                        break;
                    case 16:
                        objP21 = cVarB.p(descriptor2, 16, d2.f5397a, objP21);
                        i12 = 65536;
                        i14 |= i12;
                        objP18 = objP18;
                        objP22 = obj14;
                        objP19 = objP19;
                        break;
                    case 17:
                        objP = cVarB.p(descriptor2, 17, d2.f5397a, objP);
                        i12 = 131072;
                        i14 |= i12;
                        objP18 = objP18;
                        objP22 = obj14;
                        objP19 = objP19;
                        break;
                    case 18:
                        objP24 = cVarB.p(descriptor2, 18, a1.f5375a, objP24);
                        i12 = 262144;
                        i14 |= i12;
                        objP18 = objP18;
                        objP22 = obj14;
                        objP19 = objP19;
                        break;
                    case 19:
                        objP17 = cVarB.p(descriptor2, 19, a1.f5375a, objP17);
                        i13 = 524288;
                        i14 |= i13;
                        objP22 = obj14;
                        objP19 = objP19;
                        break;
                    case 20:
                        objP30 = cVarB.p(descriptor2, 20, a1.f5375a, objP30);
                        i13 = 1048576;
                        i14 |= i13;
                        objP22 = obj14;
                        objP19 = objP19;
                        break;
                    case 21:
                        objP23 = cVarB.p(descriptor2, 21, a1.f5375a, objP23);
                        i13 = 2097152;
                        i14 |= i13;
                        objP22 = obj14;
                        objP19 = objP19;
                        break;
                    case 22:
                        objP18 = cVarB.p(descriptor2, 22, d2.f5397a, objP18);
                        i13 = 4194304;
                        i14 |= i13;
                        objP22 = obj14;
                        objP19 = objP19;
                        break;
                    default:
                        throw new UnknownFieldException(iX);
                }
            }
            Object obj15 = objP18;
            obj = objP19;
            obj2 = objP20;
            obj3 = objP22;
            Object obj16 = objP28;
            obj4 = objP29;
            obj5 = obj16;
            obj6 = objP21;
            obj7 = objP17;
            i10 = i14;
            obj8 = objP30;
            obj9 = objP23;
            obj10 = objP24;
            obj11 = objP25;
            obj12 = objP26;
            obj13 = objP27;
            z10 = zD4;
            f10 = fA4;
            z11 = zD5;
            z12 = zD6;
            i11 = iF6;
            objP2 = obj15;
        }
        cVarB.c(descriptor2);
        return new DeviceNode.VungleExt(i10, z11, (String) obj5, (Integer) obj4, f10, (String) obj3, iF2, (String) obj, (String) obj2, (String) obj13, (String) obj12, (String) obj11, fA, iF, z12, i11, z10, (String) obj6, (String) objP, (Long) obj10, (Long) obj7, (Long) obj8, (Long) obj9, (String) objP2, (y1) null);
    }

    @Override // xk.b, xk.g, xk.a
    public a getDescriptor() {
        return descriptor;
    }

    @Override // xk.g
    public void serialize(f fVar, DeviceNode.VungleExt vungleExt) {
        p.j(fVar, "encoder");
        p.j(vungleExt, "value");
        a descriptor2 = getDescriptor();
        d dVarB = fVar.b(descriptor2);
        DeviceNode.VungleExt.write$Self(vungleExt, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    static {
        DeviceNode$VungleExt$$serializer deviceNode$VungleExt$$serializer = new DeviceNode$VungleExt$$serializer();
        INSTANCE = deviceNode$VungleExt$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.DeviceNode.VungleExt", deviceNode$VungleExt$$serializer, 23);
        pluginGeneratedSerialDescriptor.k("is_google_play_services_available", true);
        pluginGeneratedSerialDescriptor.k(CommonUrlParts.APP_SET_ID, true);
        pluginGeneratedSerialDescriptor.k(CommonUrlParts.APP_SET_ID_SCOPE, true);
        pluginGeneratedSerialDescriptor.k("battery_level", true);
        pluginGeneratedSerialDescriptor.k("battery_state", true);
        pluginGeneratedSerialDescriptor.k("battery_saver_enabled", true);
        pluginGeneratedSerialDescriptor.k("connection_type", true);
        pluginGeneratedSerialDescriptor.k("connection_type_detail", true);
        pluginGeneratedSerialDescriptor.k(CommonUrlParts.LOCALE, true);
        pluginGeneratedSerialDescriptor.k("language", true);
        pluginGeneratedSerialDescriptor.k("time_zone", true);
        pluginGeneratedSerialDescriptor.k("volume_level", true);
        pluginGeneratedSerialDescriptor.k("sound_enabled", true);
        pluginGeneratedSerialDescriptor.k("is_tv", true);
        pluginGeneratedSerialDescriptor.k("sd_card_available", true);
        pluginGeneratedSerialDescriptor.k("is_sideload_enabled", true);
        pluginGeneratedSerialDescriptor.k(Q6.V0, true);
        pluginGeneratedSerialDescriptor.k("amazon_advertising_id", true);
        pluginGeneratedSerialDescriptor.k("sit", true);
        pluginGeneratedSerialDescriptor.k("oit", true);
        pluginGeneratedSerialDescriptor.k("ort", true);
        pluginGeneratedSerialDescriptor.k("obt", true);
        pluginGeneratedSerialDescriptor.k("gp_version", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // bl.g0
    public b<?>[] childSerializers() {
        i iVar = i.f5416a;
        d2 d2Var = d2.f5397a;
        p0 p0Var = p0.f5452a;
        f0 f0Var = f0.f5402a;
        a1 a1Var = a1.f5375a;
        return new b[]{iVar, yk.a.t(d2Var), yk.a.t(p0Var), f0Var, yk.a.t(d2Var), p0Var, yk.a.t(d2Var), yk.a.t(d2Var), yk.a.t(d2Var), yk.a.t(d2Var), yk.a.t(d2Var), f0Var, p0Var, iVar, p0Var, iVar, yk.a.t(d2Var), yk.a.t(d2Var), yk.a.t(a1Var), yk.a.t(a1Var), yk.a.t(a1Var), yk.a.t(a1Var), yk.a.t(d2Var)};
    }

    @Override // bl.g0
    public b<?>[] typeParametersSerializers() {
        return g0.a.a(this);
    }
}
