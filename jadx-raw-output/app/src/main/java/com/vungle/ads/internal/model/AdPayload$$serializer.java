package com.vungle.ads.internal.model;

import al.d;
import al.e;
import bl.a1;
import bl.d2;
import bl.f;
import bl.g0;
import bl.i;
import bl.u0;
import ck.p;
import ck.s;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import jk.c;
import kotlin.Metadata;
import kotlinx.serialization.ContextualSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.a;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import xk.b;

/* JADX INFO: compiled from: AdPayload.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/vungle/ads/internal/model/AdPayload.$serializer", "Lbl/g0;", "Lcom/vungle/ads/internal/model/AdPayload;", "", "Lxk/b;", "childSerializers", "()[Lxk/b;", "Lal/e;", "decoder", "deserialize", "Lal/f;", "encoder", "value", "Lmj/r;", "serialize", "Lkotlinx/serialization/descriptors/a;", "getDescriptor", "()Lkotlinx/serialization/descriptors/a;", "descriptor", "<init>", "()V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class AdPayload$$serializer implements g0<AdPayload> {
    public static final AdPayload$$serializer INSTANCE;
    public static final /* synthetic */ a descriptor;

    private AdPayload$$serializer() {
    }

    @Override // bl.g0
    public b<?>[] childSerializers() {
        c cVarB = s.b(ConcurrentHashMap.class);
        d2 d2Var = d2.f5397a;
        return new b[]{yk.a.t(new f(AdPayload$PlacementAdUnit$$serializer.INSTANCE)), yk.a.t(ConfigPayload$$serializer.INSTANCE), yk.a.t(a1.f5375a), new ContextualSerializer(cVarB, null, new b[]{d2Var, d2Var}), new u0(d2Var, d2Var), i.f5416a, yk.a.t(d2Var)};
    }

    @Override // xk.a
    public AdPayload deserialize(e decoder) {
        Object objP;
        Object objV;
        Object obj;
        Object objP2;
        boolean z10;
        Object objV2;
        Object objP3;
        int i10;
        char c10;
        p.j(decoder, "decoder");
        a descriptor2 = getDescriptor();
        al.c cVarB = decoder.b(descriptor2);
        int i11 = 6;
        int i12 = 5;
        int i13 = 4;
        if (cVarB.j()) {
            objP = cVarB.p(descriptor2, 0, new f(AdPayload$PlacementAdUnit$$serializer.INSTANCE), null);
            Object objP4 = cVarB.p(descriptor2, 1, ConfigPayload$$serializer.INSTANCE, null);
            objP3 = cVarB.p(descriptor2, 2, a1.f5375a, null);
            c cVarB2 = s.b(ConcurrentHashMap.class);
            d2 d2Var = d2.f5397a;
            Object objV3 = cVarB.v(descriptor2, 3, new ContextualSerializer(cVarB2, null, new b[]{d2Var, d2Var}), null);
            objV2 = cVarB.v(descriptor2, 4, new u0(d2Var, d2Var), null);
            boolean zD = cVarB.D(descriptor2, 5);
            objP2 = cVarB.p(descriptor2, 6, d2Var, null);
            objV = objV3;
            i10 = 127;
            z10 = zD;
            obj = objP4;
        } else {
            boolean z11 = true;
            boolean zD2 = false;
            int i14 = 0;
            objP = null;
            Object objP5 = null;
            objV = null;
            Object objV4 = null;
            Object objP6 = null;
            Object objP7 = null;
            while (z11) {
                int iX = cVarB.x(descriptor2);
                switch (iX) {
                    case -1:
                        z11 = false;
                        i12 = 5;
                        break;
                    case 0:
                        objP = cVarB.p(descriptor2, 0, new f(AdPayload$PlacementAdUnit$$serializer.INSTANCE), objP);
                        i14 |= 1;
                        i11 = 6;
                        i12 = 5;
                        i13 = 4;
                        break;
                    case 1:
                        objP6 = cVarB.p(descriptor2, 1, ConfigPayload$$serializer.INSTANCE, objP6);
                        i14 |= 2;
                        i11 = 6;
                        i12 = 5;
                        break;
                    case 2:
                        c10 = 3;
                        objP7 = cVarB.p(descriptor2, 2, a1.f5375a, objP7);
                        i14 |= 4;
                        i11 = 6;
                        i12 = 5;
                        break;
                    case 3:
                        c cVarB3 = s.b(ConcurrentHashMap.class);
                        d2 d2Var2 = d2.f5397a;
                        c10 = 3;
                        objV = cVarB.v(descriptor2, 3, new ContextualSerializer(cVarB3, null, new b[]{d2Var2, d2Var2}), objV);
                        i14 |= 8;
                        i11 = 6;
                        i12 = 5;
                        break;
                    case 4:
                        d2 d2Var3 = d2.f5397a;
                        objV4 = cVarB.v(descriptor2, i13, new u0(d2Var3, d2Var3), objV4);
                        i14 |= 16;
                        i11 = 6;
                        break;
                    case 5:
                        zD2 = cVarB.D(descriptor2, i12);
                        i14 |= 32;
                        break;
                    case 6:
                        objP5 = cVarB.p(descriptor2, i11, d2.f5397a, objP5);
                        i14 |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(iX);
                }
            }
            obj = objP6;
            objP2 = objP5;
            z10 = zD2;
            objV2 = objV4;
            objP3 = objP7;
            i10 = i14;
        }
        cVarB.c(descriptor2);
        return new AdPayload(i10, (List) objP, (ConfigPayload) obj, (Long) objP3, (ConcurrentHashMap) objV, (Map) objV2, z10, (String) objP2, null);
    }

    @Override // xk.b, xk.g, xk.a
    public a getDescriptor() {
        return descriptor;
    }

    @Override // xk.g
    public void serialize(al.f fVar, AdPayload adPayload) {
        p.j(fVar, "encoder");
        p.j(adPayload, "value");
        a descriptor2 = getDescriptor();
        d dVarB = fVar.b(descriptor2);
        AdPayload.write$Self(adPayload, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    static {
        AdPayload$$serializer adPayload$$serializer = new AdPayload$$serializer();
        INSTANCE = adPayload$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.AdPayload", adPayload$$serializer, 7);
        pluginGeneratedSerialDescriptor.k(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, true);
        pluginGeneratedSerialDescriptor.k("config", true);
        pluginGeneratedSerialDescriptor.k("expiryWindowStart", true);
        pluginGeneratedSerialDescriptor.k("mraidFiles", true);
        pluginGeneratedSerialDescriptor.k("incentivizedTextSettings", true);
        pluginGeneratedSerialDescriptor.k("assetsFullyDownloaded", true);
        pluginGeneratedSerialDescriptor.k("indexFilePath", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // bl.g0
    public b<?>[] typeParametersSerializers() {
        return g0.a.a(this);
    }
}
