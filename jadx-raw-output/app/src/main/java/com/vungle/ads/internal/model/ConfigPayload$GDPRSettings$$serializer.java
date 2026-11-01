package com.vungle.ads.internal.model;

import al.c;
import al.d;
import al.e;
import al.f;
import bl.d2;
import bl.g0;
import bl.i;
import bl.y1;
import ck.p;
import kotlin.Metadata;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.a;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import xk.b;

/* JADX INFO: compiled from: ConfigPayload.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/vungle/ads/internal/model/ConfigPayload.GDPRSettings.$serializer", "Lbl/g0;", "Lcom/vungle/ads/internal/model/ConfigPayload$GDPRSettings;", "", "Lxk/b;", "childSerializers", "()[Lxk/b;", "Lal/e;", "decoder", "deserialize", "Lal/f;", "encoder", "value", "Lmj/r;", "serialize", "Lkotlinx/serialization/descriptors/a;", "getDescriptor", "()Lkotlinx/serialization/descriptors/a;", "descriptor", "<init>", "()V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class ConfigPayload$GDPRSettings$$serializer implements g0<ConfigPayload.GDPRSettings> {
    public static final ConfigPayload$GDPRSettings$$serializer INSTANCE;
    public static final /* synthetic */ a descriptor;

    private ConfigPayload$GDPRSettings$$serializer() {
    }

    @Override // bl.g0
    public b<?>[] childSerializers() {
        d2 d2Var = d2.f5397a;
        return new b[]{yk.a.t(i.f5416a), yk.a.t(d2Var), yk.a.t(d2Var), yk.a.t(d2Var), yk.a.t(d2Var), yk.a.t(d2Var)};
    }

    @Override // xk.a
    public ConfigPayload.GDPRSettings deserialize(e decoder) {
        Object objP;
        int i10;
        Object objP2;
        Object objP3;
        Object objP4;
        Object objP5;
        Object objP6;
        p.j(decoder, "decoder");
        a descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        int i11 = 5;
        Object objP7 = null;
        if (cVarB.j()) {
            objP2 = cVarB.p(descriptor2, 0, i.f5416a, null);
            d2 d2Var = d2.f5397a;
            Object objP8 = cVarB.p(descriptor2, 1, d2Var, null);
            objP3 = cVarB.p(descriptor2, 2, d2Var, null);
            objP4 = cVarB.p(descriptor2, 3, d2Var, null);
            objP5 = cVarB.p(descriptor2, 4, d2Var, null);
            objP6 = cVarB.p(descriptor2, 5, d2Var, null);
            objP = objP8;
            i10 = 63;
        } else {
            int i12 = 0;
            boolean z10 = true;
            objP = null;
            Object objP9 = null;
            Object objP10 = null;
            Object objP11 = null;
            Object objP12 = null;
            while (z10) {
                int iX = cVarB.x(descriptor2);
                switch (iX) {
                    case -1:
                        z10 = false;
                        i11 = 5;
                        break;
                    case 0:
                        objP7 = cVarB.p(descriptor2, 0, i.f5416a, objP7);
                        i12 |= 1;
                        i11 = 5;
                        break;
                    case 1:
                        objP = cVarB.p(descriptor2, 1, d2.f5397a, objP);
                        i12 |= 2;
                        break;
                    case 2:
                        objP9 = cVarB.p(descriptor2, 2, d2.f5397a, objP9);
                        i12 |= 4;
                        break;
                    case 3:
                        objP10 = cVarB.p(descriptor2, 3, d2.f5397a, objP10);
                        i12 |= 8;
                        break;
                    case 4:
                        objP11 = cVarB.p(descriptor2, 4, d2.f5397a, objP11);
                        i12 |= 16;
                        break;
                    case 5:
                        objP12 = cVarB.p(descriptor2, i11, d2.f5397a, objP12);
                        i12 |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iX);
                }
            }
            i10 = i12;
            objP2 = objP7;
            objP3 = objP9;
            objP4 = objP10;
            objP5 = objP11;
            objP6 = objP12;
        }
        cVarB.c(descriptor2);
        return new ConfigPayload.GDPRSettings(i10, (Boolean) objP2, (String) objP, (String) objP3, (String) objP4, (String) objP5, (String) objP6, (y1) null);
    }

    @Override // xk.b, xk.g, xk.a
    public a getDescriptor() {
        return descriptor;
    }

    @Override // xk.g
    public void serialize(f fVar, ConfigPayload.GDPRSettings gDPRSettings) {
        p.j(fVar, "encoder");
        p.j(gDPRSettings, "value");
        a descriptor2 = getDescriptor();
        d dVarB = fVar.b(descriptor2);
        ConfigPayload.GDPRSettings.write$Self(gDPRSettings, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    static {
        ConfigPayload$GDPRSettings$$serializer configPayload$GDPRSettings$$serializer = new ConfigPayload$GDPRSettings$$serializer();
        INSTANCE = configPayload$GDPRSettings$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.ConfigPayload.GDPRSettings", configPayload$GDPRSettings$$serializer, 6);
        pluginGeneratedSerialDescriptor.k("is_country_data_protected", true);
        pluginGeneratedSerialDescriptor.k("consent_title", true);
        pluginGeneratedSerialDescriptor.k("consent_message", true);
        pluginGeneratedSerialDescriptor.k("consent_message_version", true);
        pluginGeneratedSerialDescriptor.k("button_accept", true);
        pluginGeneratedSerialDescriptor.k("button_deny", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // bl.g0
    public b<?>[] typeParametersSerializers() {
        return g0.a.a(this);
    }
}
