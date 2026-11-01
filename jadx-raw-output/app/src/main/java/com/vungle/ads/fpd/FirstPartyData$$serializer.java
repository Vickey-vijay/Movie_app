package com.vungle.ads.fpd;

import al.c;
import al.d;
import al.e;
import al.f;
import bl.d2;
import bl.g0;
import bl.u0;
import ck.p;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.a;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import xk.b;

/* JADX INFO: compiled from: FirstPartyData.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/vungle/ads/fpd/FirstPartyData.$serializer", "Lbl/g0;", "Lcom/vungle/ads/fpd/FirstPartyData;", "", "Lxk/b;", "childSerializers", "()[Lxk/b;", "Lal/e;", "decoder", "deserialize", "Lal/f;", "encoder", "value", "Lmj/r;", "serialize", "Lkotlinx/serialization/descriptors/a;", "getDescriptor", "()Lkotlinx/serialization/descriptors/a;", "descriptor", "<init>", "()V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class FirstPartyData$$serializer implements g0<FirstPartyData> {
    public static final FirstPartyData$$serializer INSTANCE;
    public static final /* synthetic */ a descriptor;

    private FirstPartyData$$serializer() {
    }

    @Override // bl.g0
    public b<?>[] childSerializers() {
        d2 d2Var = d2.f5397a;
        return new b[]{d2Var, yk.a.t(SessionContext$$serializer.INSTANCE), yk.a.t(Demographic$$serializer.INSTANCE), yk.a.t(Location$$serializer.INSTANCE), yk.a.t(Revenue$$serializer.INSTANCE), yk.a.t(new u0(d2Var, d2Var))};
    }

    @Override // xk.a
    public FirstPartyData deserialize(e decoder) {
        Object objP;
        Object objP2;
        Object objP3;
        Object objP4;
        Object objP5;
        String str;
        int i10;
        p.j(decoder, "decoder");
        a descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        String strI = null;
        if (cVarB.j()) {
            String strI2 = cVarB.i(descriptor2, 0);
            objP = cVarB.p(descriptor2, 1, SessionContext$$serializer.INSTANCE, null);
            objP2 = cVarB.p(descriptor2, 2, Demographic$$serializer.INSTANCE, null);
            objP3 = cVarB.p(descriptor2, 3, Location$$serializer.INSTANCE, null);
            objP4 = cVarB.p(descriptor2, 4, Revenue$$serializer.INSTANCE, null);
            d2 d2Var = d2.f5397a;
            objP5 = cVarB.p(descriptor2, 5, new u0(d2Var, d2Var), null);
            str = strI2;
            i10 = 63;
        } else {
            int i11 = 0;
            boolean z10 = true;
            Object objP6 = null;
            Object objP7 = null;
            Object objP8 = null;
            Object objP9 = null;
            Object objP10 = null;
            while (z10) {
                int iX = cVarB.x(descriptor2);
                switch (iX) {
                    case -1:
                        z10 = false;
                        continue;
                    case 0:
                        strI = cVarB.i(descriptor2, 0);
                        i11 |= 1;
                        continue;
                    case 1:
                        objP6 = cVarB.p(descriptor2, 1, SessionContext$$serializer.INSTANCE, objP6);
                        i11 |= 2;
                        continue;
                    case 2:
                        objP7 = cVarB.p(descriptor2, 2, Demographic$$serializer.INSTANCE, objP7);
                        i11 |= 4;
                        break;
                    case 3:
                        objP8 = cVarB.p(descriptor2, 3, Location$$serializer.INSTANCE, objP8);
                        i11 |= 8;
                        break;
                    case 4:
                        objP9 = cVarB.p(descriptor2, 4, Revenue$$serializer.INSTANCE, objP9);
                        i11 |= 16;
                        break;
                    case 5:
                        d2 d2Var2 = d2.f5397a;
                        objP10 = cVarB.p(descriptor2, 5, new u0(d2Var2, d2Var2), objP10);
                        i11 |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iX);
                }
            }
            objP = objP6;
            objP2 = objP7;
            objP3 = objP8;
            objP4 = objP9;
            objP5 = objP10;
            str = strI;
            i10 = i11;
        }
        cVarB.c(descriptor2);
        return new FirstPartyData(i10, str, (SessionContext) objP, (Demographic) objP2, (Location) objP3, (Revenue) objP4, (Map) objP5, null);
    }

    @Override // xk.b, xk.g, xk.a
    public a getDescriptor() {
        return descriptor;
    }

    @Override // xk.g
    public void serialize(f fVar, FirstPartyData firstPartyData) {
        p.j(fVar, "encoder");
        p.j(firstPartyData, "value");
        a descriptor2 = getDescriptor();
        d dVarB = fVar.b(descriptor2);
        FirstPartyData.write$Self(firstPartyData, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    static {
        FirstPartyData$$serializer firstPartyData$$serializer = new FirstPartyData$$serializer();
        INSTANCE = firstPartyData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.fpd.FirstPartyData", firstPartyData$$serializer, 6);
        pluginGeneratedSerialDescriptor.k("model_version", true);
        pluginGeneratedSerialDescriptor.k("session_context", true);
        pluginGeneratedSerialDescriptor.k("demographic", true);
        pluginGeneratedSerialDescriptor.k("location", true);
        pluginGeneratedSerialDescriptor.k("revenue", true);
        pluginGeneratedSerialDescriptor.k("custom_data", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // bl.g0
    public b<?>[] typeParametersSerializers() {
        return g0.a.a(this);
    }
}
