package com.vungle.ads.internal.model;

import al.c;
import al.d;
import al.e;
import bl.a1;
import bl.d2;
import bl.f;
import bl.g0;
import bl.i;
import bl.p0;
import bl.y1;
import ck.p;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.a;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import xk.b;

/* JADX INFO: compiled from: ConfigPayload.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/vungle/ads/internal/model/ConfigPayload.$serializer", "Lbl/g0;", "Lcom/vungle/ads/internal/model/ConfigPayload;", "", "Lxk/b;", "childSerializers", "()[Lxk/b;", "Lal/e;", "decoder", "deserialize", "Lal/f;", "encoder", "value", "Lmj/r;", "serialize", "Lkotlinx/serialization/descriptors/a;", "getDescriptor", "()Lkotlinx/serialization/descriptors/a;", "descriptor", "<init>", "()V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class ConfigPayload$$serializer implements g0<ConfigPayload> {
    public static final ConfigPayload$$serializer INSTANCE;
    public static final /* synthetic */ a descriptor;

    private ConfigPayload$$serializer() {
    }

    @Override // xk.a
    public ConfigPayload deserialize(e decoder) {
        Object objP;
        Object objP2;
        Object objP3;
        Object obj;
        Object obj2;
        Object objP4;
        Object objP5;
        Object objP6;
        Object obj3;
        int i10;
        Object obj4;
        Object obj5;
        Object objP7;
        Object objP8;
        Object objP9;
        Object objP10;
        Object objP11;
        Object objP12;
        Object objP13;
        Object objP14;
        p.j(decoder, "decoder");
        a descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        if (cVarB.j()) {
            Object objP15 = cVarB.p(descriptor2, 0, ConfigPayload$CleverCache$$serializer.INSTANCE, null);
            Object objP16 = cVarB.p(descriptor2, 1, ConfigPayload$ConfigSettings$$serializer.INSTANCE, null);
            objP14 = cVarB.p(descriptor2, 2, ConfigPayload$Endpoints$$serializer.INSTANCE, null);
            objP13 = cVarB.p(descriptor2, 3, ConfigPayload$LogMetricsSettings$$serializer.INSTANCE, null);
            Object objP17 = cVarB.p(descriptor2, 4, new f(Placement$$serializer.INSTANCE), null);
            objP8 = cVarB.p(descriptor2, 5, ConfigPayload$UserPrivacy$$serializer.INSTANCE, null);
            objP12 = cVarB.p(descriptor2, 6, d2.f5397a, null);
            i iVar = i.f5416a;
            objP11 = cVarB.p(descriptor2, 7, iVar, null);
            objP10 = cVarB.p(descriptor2, 8, iVar, null);
            p0 p0Var = p0.f5452a;
            objP9 = cVarB.p(descriptor2, 9, p0Var, null);
            objP7 = cVarB.p(descriptor2, 10, iVar, null);
            Object objP18 = cVarB.p(descriptor2, 11, p0Var, null);
            Object objP19 = cVarB.p(descriptor2, 12, iVar, null);
            obj5 = objP18;
            objP6 = cVarB.p(descriptor2, 13, iVar, null);
            objP5 = cVarB.p(descriptor2, 14, iVar, null);
            objP4 = cVarB.p(descriptor2, 15, a1.f5375a, null);
            Object objP20 = cVarB.p(descriptor2, 16, ConfigPayload$AutoRedirect$$serializer.INSTANCE, null);
            objP3 = cVarB.p(descriptor2, 17, iVar, null);
            obj2 = objP20;
            obj = objP15;
            i10 = 524287;
            obj4 = objP19;
            objP = objP17;
            objP2 = cVarB.p(descriptor2, 18, iVar, null);
            obj3 = objP16;
        } else {
            boolean z10 = true;
            Object objP21 = null;
            Object objP22 = null;
            Object objP23 = null;
            Object objP24 = null;
            Object objP25 = null;
            Object objP26 = null;
            Object objP27 = null;
            Object objP28 = null;
            Object objP29 = null;
            Object objP30 = null;
            objP = null;
            Object objP31 = null;
            Object objP32 = null;
            Object objP33 = null;
            Object objP34 = null;
            Object objP35 = null;
            Object objP36 = null;
            Object objP37 = null;
            int i11 = 0;
            Object objP38 = null;
            while (z10) {
                int iX = cVarB.x(descriptor2);
                switch (iX) {
                    case -1:
                        z10 = false;
                        objP25 = objP25;
                        objP38 = objP38;
                        objP21 = objP21;
                        break;
                    case 0:
                        objP37 = cVarB.p(descriptor2, 0, ConfigPayload$CleverCache$$serializer.INSTANCE, objP37);
                        i11 |= 1;
                        objP25 = objP25;
                        objP38 = objP38;
                        objP21 = objP21;
                        break;
                    case 1:
                        objP21 = objP21;
                        objP38 = cVarB.p(descriptor2, 1, ConfigPayload$ConfigSettings$$serializer.INSTANCE, objP38);
                        i11 |= 2;
                        objP25 = objP25;
                        objP21 = objP21;
                        break;
                    case 2:
                        objP24 = cVarB.p(descriptor2, 2, ConfigPayload$Endpoints$$serializer.INSTANCE, objP24);
                        i11 |= 4;
                        objP25 = objP25;
                        objP38 = objP38;
                        break;
                    case 3:
                        objP23 = cVarB.p(descriptor2, 3, ConfigPayload$LogMetricsSettings$$serializer.INSTANCE, objP23);
                        i11 |= 8;
                        objP25 = objP25;
                        objP38 = objP38;
                        break;
                    case 4:
                        objP = cVarB.p(descriptor2, 4, new f(Placement$$serializer.INSTANCE), objP);
                        i11 |= 16;
                        objP25 = objP25;
                        objP38 = objP38;
                        break;
                    case 5:
                        objP21 = cVarB.p(descriptor2, 5, ConfigPayload$UserPrivacy$$serializer.INSTANCE, objP21);
                        i11 |= 32;
                        objP25 = objP25;
                        objP38 = objP38;
                        break;
                    case 6:
                        objP30 = cVarB.p(descriptor2, 6, d2.f5397a, objP30);
                        i11 |= 64;
                        objP25 = objP25;
                        objP38 = objP38;
                        break;
                    case 7:
                        objP29 = cVarB.p(descriptor2, 7, i.f5416a, objP29);
                        i11 |= 128;
                        objP25 = objP25;
                        objP38 = objP38;
                        break;
                    case 8:
                        objP28 = cVarB.p(descriptor2, 8, i.f5416a, objP28);
                        i11 |= 256;
                        objP25 = objP25;
                        objP38 = objP38;
                        break;
                    case 9:
                        objP22 = cVarB.p(descriptor2, 9, p0.f5452a, objP22);
                        i11 |= 512;
                        objP25 = objP25;
                        objP38 = objP38;
                        break;
                    case 10:
                        objP27 = cVarB.p(descriptor2, 10, i.f5416a, objP27);
                        i11 |= 1024;
                        objP25 = objP25;
                        objP38 = objP38;
                        break;
                    case 11:
                        objP26 = cVarB.p(descriptor2, 11, p0.f5452a, objP26);
                        i11 |= 2048;
                        objP25 = objP25;
                        objP38 = objP38;
                        break;
                    case 12:
                        objP38 = objP38;
                        objP31 = cVarB.p(descriptor2, 12, i.f5416a, objP31);
                        i11 |= 4096;
                        objP25 = objP25;
                        objP32 = objP32;
                        objP38 = objP38;
                        break;
                    case 13:
                        objP38 = objP38;
                        objP32 = cVarB.p(descriptor2, 13, i.f5416a, objP32);
                        i11 |= 8192;
                        objP25 = objP25;
                        objP33 = objP33;
                        objP38 = objP38;
                        break;
                    case 14:
                        objP38 = objP38;
                        objP33 = cVarB.p(descriptor2, 14, i.f5416a, objP33);
                        i11 |= 16384;
                        objP25 = objP25;
                        objP34 = objP34;
                        objP38 = objP38;
                        break;
                    case 15:
                        objP38 = objP38;
                        objP34 = cVarB.p(descriptor2, 15, a1.f5375a, objP34);
                        i11 |= 32768;
                        objP25 = objP25;
                        objP35 = objP35;
                        objP38 = objP38;
                        break;
                    case 16:
                        objP38 = objP38;
                        objP35 = cVarB.p(descriptor2, 16, ConfigPayload$AutoRedirect$$serializer.INSTANCE, objP35);
                        i11 |= 65536;
                        objP25 = objP25;
                        objP36 = objP36;
                        objP38 = objP38;
                        break;
                    case 17:
                        objP36 = cVarB.p(descriptor2, 17, i.f5416a, objP36);
                        i11 |= 131072;
                        objP25 = objP25;
                        objP38 = objP38;
                        break;
                    case 18:
                        objP25 = cVarB.p(descriptor2, 18, i.f5416a, objP25);
                        i11 |= 262144;
                        objP38 = objP38;
                        break;
                    default:
                        throw new UnknownFieldException(iX);
                }
            }
            Object obj6 = objP38;
            Object obj7 = objP21;
            objP2 = objP25;
            objP3 = objP36;
            obj = objP37;
            obj2 = objP35;
            objP4 = objP34;
            objP5 = objP33;
            objP6 = objP32;
            obj3 = obj6;
            i10 = i11;
            obj4 = objP31;
            obj5 = objP26;
            objP7 = objP27;
            objP8 = obj7;
            objP9 = objP22;
            objP10 = objP28;
            objP11 = objP29;
            objP12 = objP30;
            Object obj8 = objP24;
            objP13 = objP23;
            objP14 = obj8;
        }
        cVarB.c(descriptor2);
        return new ConfigPayload(i10, (ConfigPayload.CleverCache) obj, (ConfigPayload.ConfigSettings) obj3, (ConfigPayload.Endpoints) objP14, (ConfigPayload.LogMetricsSettings) objP13, (List) objP, (ConfigPayload.UserPrivacy) objP8, (String) objP12, (Boolean) objP11, (Boolean) objP10, (Integer) objP9, (Boolean) objP7, (Integer) obj5, (Boolean) obj4, (Boolean) objP6, (Boolean) objP5, (Long) objP4, (ConfigPayload.AutoRedirect) obj2, (Boolean) objP3, (Boolean) objP2, (y1) null);
    }

    @Override // xk.b, xk.g, xk.a
    public a getDescriptor() {
        return descriptor;
    }

    @Override // xk.g
    public void serialize(al.f fVar, ConfigPayload configPayload) {
        p.j(fVar, "encoder");
        p.j(configPayload, "value");
        a descriptor2 = getDescriptor();
        d dVarB = fVar.b(descriptor2);
        ConfigPayload.write$Self(configPayload, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    static {
        ConfigPayload$$serializer configPayload$$serializer = new ConfigPayload$$serializer();
        INSTANCE = configPayload$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.ConfigPayload", configPayload$$serializer, 19);
        pluginGeneratedSerialDescriptor.k("reuse_assets", true);
        pluginGeneratedSerialDescriptor.k("config", true);
        pluginGeneratedSerialDescriptor.k("endpoints", true);
        pluginGeneratedSerialDescriptor.k("log_metrics", true);
        pluginGeneratedSerialDescriptor.k("placements", true);
        pluginGeneratedSerialDescriptor.k("user", true);
        pluginGeneratedSerialDescriptor.k(Cookie.CONFIG_EXTENSION, true);
        pluginGeneratedSerialDescriptor.k(Cookie.COPPA_DISABLE_AD_ID, true);
        pluginGeneratedSerialDescriptor.k("ri_enabled", true);
        pluginGeneratedSerialDescriptor.k("session_timeout", true);
        pluginGeneratedSerialDescriptor.k("wait_for_connectivity_for_tpat", true);
        pluginGeneratedSerialDescriptor.k("sdk_session_timeout", true);
        pluginGeneratedSerialDescriptor.k("signals_disabled", true);
        pluginGeneratedSerialDescriptor.k("fpd_enabled", true);
        pluginGeneratedSerialDescriptor.k("rta_debugging", true);
        pluginGeneratedSerialDescriptor.k("config_last_validated_ts", true);
        pluginGeneratedSerialDescriptor.k("auto_redirect", true);
        pluginGeneratedSerialDescriptor.k("retry_prioritized_tpat", true);
        pluginGeneratedSerialDescriptor.k("enable_ot", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // bl.g0
    public b<?>[] childSerializers() {
        i iVar = i.f5416a;
        p0 p0Var = p0.f5452a;
        return new b[]{yk.a.t(ConfigPayload$CleverCache$$serializer.INSTANCE), yk.a.t(ConfigPayload$ConfigSettings$$serializer.INSTANCE), yk.a.t(ConfigPayload$Endpoints$$serializer.INSTANCE), yk.a.t(ConfigPayload$LogMetricsSettings$$serializer.INSTANCE), yk.a.t(new f(Placement$$serializer.INSTANCE)), yk.a.t(ConfigPayload$UserPrivacy$$serializer.INSTANCE), yk.a.t(d2.f5397a), yk.a.t(iVar), yk.a.t(iVar), yk.a.t(p0Var), yk.a.t(iVar), yk.a.t(p0Var), yk.a.t(iVar), yk.a.t(iVar), yk.a.t(iVar), yk.a.t(a1.f5375a), yk.a.t(ConfigPayload$AutoRedirect$$serializer.INSTANCE), yk.a.t(iVar), yk.a.t(iVar)};
    }

    @Override // bl.g0
    public b<?>[] typeParametersSerializers() {
        return g0.a.a(this);
    }
}
