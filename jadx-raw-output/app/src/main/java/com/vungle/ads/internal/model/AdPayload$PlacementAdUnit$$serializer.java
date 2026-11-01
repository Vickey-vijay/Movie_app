package com.vungle.ads.internal.model;

import al.c;
import al.d;
import al.e;
import al.f;
import bl.d2;
import bl.g0;
import bl.y1;
import ck.p;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.m;
import kotlin.Metadata;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.a;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import xk.b;

/* JADX INFO: compiled from: AdPayload.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/vungle/ads/internal/model/AdPayload.PlacementAdUnit.$serializer", "Lbl/g0;", "Lcom/vungle/ads/internal/model/AdPayload$PlacementAdUnit;", "", "Lxk/b;", "childSerializers", "()[Lxk/b;", "Lal/e;", "decoder", "deserialize", "Lal/f;", "encoder", "value", "Lmj/r;", "serialize", "Lkotlinx/serialization/descriptors/a;", "getDescriptor", "()Lkotlinx/serialization/descriptors/a;", "descriptor", "<init>", "()V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class AdPayload$PlacementAdUnit$$serializer implements g0<AdPayload.PlacementAdUnit> {
    public static final AdPayload$PlacementAdUnit$$serializer INSTANCE;
    public static final /* synthetic */ a descriptor;

    private AdPayload$PlacementAdUnit$$serializer() {
    }

    @Override // bl.g0
    public b<?>[] childSerializers() {
        return new b[]{yk.a.t(d2.f5397a), yk.a.t(AdPayload$AdUnit$$serializer.INSTANCE)};
    }

    @Override // xk.a
    public AdPayload.PlacementAdUnit deserialize(e decoder) {
        Object objP;
        Object objP2;
        int i10;
        p.j(decoder, "decoder");
        a descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        if (cVarB.j()) {
            objP = cVarB.p(descriptor2, 0, d2.f5397a, null);
            objP2 = cVarB.p(descriptor2, 1, AdPayload$AdUnit$$serializer.INSTANCE, null);
            i10 = 3;
        } else {
            objP = null;
            Object objP3 = null;
            int i11 = 0;
            boolean z10 = true;
            while (z10) {
                int iX = cVarB.x(descriptor2);
                if (iX == -1) {
                    z10 = false;
                } else if (iX == 0) {
                    objP = cVarB.p(descriptor2, 0, d2.f5397a, objP);
                    i11 |= 1;
                } else {
                    if (iX != 1) {
                        throw new UnknownFieldException(iX);
                    }
                    objP3 = cVarB.p(descriptor2, 1, AdPayload$AdUnit$$serializer.INSTANCE, objP3);
                    i11 |= 2;
                }
            }
            objP2 = objP3;
            i10 = i11;
        }
        cVarB.c(descriptor2);
        return new AdPayload.PlacementAdUnit(i10, (String) objP, (AdPayload.AdUnit) objP2, (y1) null);
    }

    @Override // xk.b, xk.g, xk.a
    public a getDescriptor() {
        return descriptor;
    }

    @Override // xk.g
    public void serialize(f fVar, AdPayload.PlacementAdUnit placementAdUnit) {
        p.j(fVar, "encoder");
        p.j(placementAdUnit, "value");
        a descriptor2 = getDescriptor();
        d dVarB = fVar.b(descriptor2);
        AdPayload.PlacementAdUnit.write$Self(placementAdUnit, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    static {
        AdPayload$PlacementAdUnit$$serializer adPayload$PlacementAdUnit$$serializer = new AdPayload$PlacementAdUnit$$serializer();
        INSTANCE = adPayload$PlacementAdUnit$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.AdPayload.PlacementAdUnit", adPayload$PlacementAdUnit$$serializer, 2);
        pluginGeneratedSerialDescriptor.k("placement_reference_id", true);
        pluginGeneratedSerialDescriptor.k(m.f44254c, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // bl.g0
    public b<?>[] typeParametersSerializers() {
        return g0.a.a(this);
    }
}
