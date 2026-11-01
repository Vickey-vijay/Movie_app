package com.vungle.ads.internal.model;

import al.c;
import al.d;
import al.e;
import al.f;
import bl.a1;
import bl.g0;
import bl.y1;
import ck.p;
import kotlin.Metadata;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.a;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import xk.b;

/* JADX INFO: compiled from: ConfigPayload.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/vungle/ads/internal/model/ConfigPayload.ConfigSettings.$serializer", "Lbl/g0;", "Lcom/vungle/ads/internal/model/ConfigPayload$ConfigSettings;", "", "Lxk/b;", "childSerializers", "()[Lxk/b;", "Lal/e;", "decoder", "deserialize", "Lal/f;", "encoder", "value", "Lmj/r;", "serialize", "Lkotlinx/serialization/descriptors/a;", "getDescriptor", "()Lkotlinx/serialization/descriptors/a;", "descriptor", "<init>", "()V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class ConfigPayload$ConfigSettings$$serializer implements g0<ConfigPayload.ConfigSettings> {
    public static final ConfigPayload$ConfigSettings$$serializer INSTANCE;
    public static final /* synthetic */ a descriptor;

    private ConfigPayload$ConfigSettings$$serializer() {
    }

    @Override // bl.g0
    public b<?>[] childSerializers() {
        return new b[]{yk.a.t(a1.f5375a)};
    }

    @Override // xk.a
    public ConfigPayload.ConfigSettings deserialize(e decoder) {
        Object objP;
        p.j(decoder, "decoder");
        a descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        int i10 = 1;
        if (cVarB.j()) {
            objP = cVarB.p(descriptor2, 0, a1.f5375a, null);
        } else {
            objP = null;
            int i11 = 0;
            while (i10 != 0) {
                int iX = cVarB.x(descriptor2);
                if (iX == -1) {
                    i10 = 0;
                } else {
                    if (iX != 0) {
                        throw new UnknownFieldException(iX);
                    }
                    objP = cVarB.p(descriptor2, 0, a1.f5375a, objP);
                    i11 |= 1;
                }
            }
            i10 = i11;
        }
        cVarB.c(descriptor2);
        return new ConfigPayload.ConfigSettings(i10, (Long) objP, (y1) null);
    }

    @Override // xk.b, xk.g, xk.a
    public a getDescriptor() {
        return descriptor;
    }

    @Override // xk.g
    public void serialize(f fVar, ConfigPayload.ConfigSettings configSettings) {
        p.j(fVar, "encoder");
        p.j(configSettings, "value");
        a descriptor2 = getDescriptor();
        d dVarB = fVar.b(descriptor2);
        ConfigPayload.ConfigSettings.write$Self(configSettings, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    static {
        ConfigPayload$ConfigSettings$$serializer configPayload$ConfigSettings$$serializer = new ConfigPayload$ConfigSettings$$serializer();
        INSTANCE = configPayload$ConfigSettings$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.ConfigPayload.ConfigSettings", configPayload$ConfigSettings$$serializer, 1);
        pluginGeneratedSerialDescriptor.k("refresh_interval", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // bl.g0
    public b<?>[] typeParametersSerializers() {
        return g0.a.a(this);
    }
}
