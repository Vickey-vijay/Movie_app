package com.vungle.ads.internal.model;

import al.c;
import al.d;
import al.e;
import al.f;
import bl.d2;
import bl.g0;
import bl.y1;
import ck.p;
import kotlin.Metadata;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.a;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import xk.b;

/* JADX INFO: compiled from: OmSdkData.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/vungle/ads/internal/model/OmSdkData.$serializer", "Lbl/g0;", "Lcom/vungle/ads/internal/model/OmSdkData;", "", "Lxk/b;", "childSerializers", "()[Lxk/b;", "Lal/e;", "decoder", "deserialize", "Lal/f;", "encoder", "value", "Lmj/r;", "serialize", "Lkotlinx/serialization/descriptors/a;", "getDescriptor", "()Lkotlinx/serialization/descriptors/a;", "descriptor", "<init>", "()V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class OmSdkData$$serializer implements g0<OmSdkData> {
    public static final OmSdkData$$serializer INSTANCE;
    public static final /* synthetic */ a descriptor;

    private OmSdkData$$serializer() {
    }

    @Override // bl.g0
    public b<?>[] childSerializers() {
        d2 d2Var = d2.f5397a;
        return new b[]{yk.a.t(d2Var), yk.a.t(d2Var), yk.a.t(d2Var)};
    }

    @Override // xk.a
    public OmSdkData deserialize(e decoder) {
        Object objP;
        int i10;
        Object objP2;
        Object objP3;
        p.j(decoder, "decoder");
        a descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        if (cVarB.j()) {
            d2 d2Var = d2.f5397a;
            objP = cVarB.p(descriptor2, 0, d2Var, null);
            objP2 = cVarB.p(descriptor2, 1, d2Var, null);
            objP3 = cVarB.p(descriptor2, 2, d2Var, null);
            i10 = 7;
        } else {
            Object objP4 = null;
            Object objP5 = null;
            Object objP6 = null;
            int i11 = 0;
            boolean z10 = true;
            while (z10) {
                int iX = cVarB.x(descriptor2);
                if (iX == -1) {
                    z10 = false;
                } else if (iX == 0) {
                    objP4 = cVarB.p(descriptor2, 0, d2.f5397a, objP4);
                    i11 |= 1;
                } else if (iX == 1) {
                    objP5 = cVarB.p(descriptor2, 1, d2.f5397a, objP5);
                    i11 |= 2;
                } else {
                    if (iX != 2) {
                        throw new UnknownFieldException(iX);
                    }
                    objP6 = cVarB.p(descriptor2, 2, d2.f5397a, objP6);
                    i11 |= 4;
                }
            }
            objP = objP4;
            i10 = i11;
            objP2 = objP5;
            objP3 = objP6;
        }
        cVarB.c(descriptor2);
        return new OmSdkData(i10, (String) objP, (String) objP2, (String) objP3, (y1) null);
    }

    @Override // xk.b, xk.g, xk.a
    public a getDescriptor() {
        return descriptor;
    }

    @Override // xk.g
    public void serialize(f fVar, OmSdkData omSdkData) {
        p.j(fVar, "encoder");
        p.j(omSdkData, "value");
        a descriptor2 = getDescriptor();
        d dVarB = fVar.b(descriptor2);
        OmSdkData.write$Self(omSdkData, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    static {
        OmSdkData$$serializer omSdkData$$serializer = new OmSdkData$$serializer();
        INSTANCE = omSdkData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.OmSdkData", omSdkData$$serializer, 3);
        pluginGeneratedSerialDescriptor.k("params", true);
        pluginGeneratedSerialDescriptor.k("vendorKey", true);
        pluginGeneratedSerialDescriptor.k("vendorURL", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // bl.g0
    public b<?>[] typeParametersSerializers() {
        return g0.a.a(this);
    }
}
