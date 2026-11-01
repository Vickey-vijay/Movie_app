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
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/vungle/ads/internal/model/Placement.$serializer", "Lbl/g0;", "Lcom/vungle/ads/internal/model/Placement;", "", "Lxk/b;", "childSerializers", "()[Lxk/b;", "Lal/e;", "decoder", "deserialize", "Lal/f;", "encoder", "value", "Lmj/r;", "serialize", "Lkotlinx/serialization/descriptors/a;", "getDescriptor", "()Lkotlinx/serialization/descriptors/a;", "descriptor", "<init>", "()V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class Placement$$serializer implements g0<Placement> {
    public static final Placement$$serializer INSTANCE;
    public static final /* synthetic */ a descriptor;

    private Placement$$serializer() {
    }

    @Override // bl.g0
    public b<?>[] childSerializers() {
        d2 d2Var = d2.f5397a;
        return new b[]{d2Var, i.f5416a, yk.a.t(d2Var)};
    }

    @Override // xk.a
    public Placement deserialize(e decoder) {
        String str;
        int i10;
        boolean z10;
        Object objP;
        p.j(decoder, "decoder");
        a descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        String strI = null;
        if (cVarB.j()) {
            String strI2 = cVarB.i(descriptor2, 0);
            boolean zD = cVarB.D(descriptor2, 1);
            objP = cVarB.p(descriptor2, 2, d2.f5397a, null);
            str = strI2;
            i10 = 7;
            z10 = zD;
        } else {
            Object objP2 = null;
            int i11 = 0;
            boolean zD2 = false;
            boolean z11 = true;
            while (z11) {
                int iX = cVarB.x(descriptor2);
                if (iX == -1) {
                    z11 = false;
                } else if (iX == 0) {
                    strI = cVarB.i(descriptor2, 0);
                    i11 |= 1;
                } else if (iX == 1) {
                    zD2 = cVarB.D(descriptor2, 1);
                    i11 |= 2;
                } else {
                    if (iX != 2) {
                        throw new UnknownFieldException(iX);
                    }
                    objP2 = cVarB.p(descriptor2, 2, d2.f5397a, objP2);
                    i11 |= 4;
                }
            }
            str = strI;
            i10 = i11;
            z10 = zD2;
            objP = objP2;
        }
        cVarB.c(descriptor2);
        return new Placement(i10, str, z10, (String) objP, (y1) null);
    }

    @Override // xk.b, xk.g, xk.a
    public a getDescriptor() {
        return descriptor;
    }

    @Override // xk.g
    public void serialize(f fVar, Placement placement) {
        p.j(fVar, "encoder");
        p.j(placement, "value");
        a descriptor2 = getDescriptor();
        d dVarB = fVar.b(descriptor2);
        Placement.write$Self(placement, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    static {
        Placement$$serializer placement$$serializer = new Placement$$serializer();
        INSTANCE = placement$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.Placement", placement$$serializer, 3);
        pluginGeneratedSerialDescriptor.k("placement_ref_id", false);
        pluginGeneratedSerialDescriptor.k("is_hb", true);
        pluginGeneratedSerialDescriptor.k("type", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // bl.g0
    public b<?>[] typeParametersSerializers() {
        return g0.a.a(this);
    }
}
