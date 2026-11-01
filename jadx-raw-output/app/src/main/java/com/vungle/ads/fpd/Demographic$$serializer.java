package com.vungle.ads.fpd;

import al.c;
import al.d;
import al.e;
import al.f;
import bl.g0;
import bl.p0;
import ck.p;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import kotlin.Metadata;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.a;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import xk.b;

/* JADX INFO: compiled from: Demographic.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/vungle/ads/fpd/Demographic.$serializer", "Lbl/g0;", "Lcom/vungle/ads/fpd/Demographic;", "", "Lxk/b;", "childSerializers", "()[Lxk/b;", "Lal/e;", "decoder", "deserialize", "Lal/f;", "encoder", "value", "Lmj/r;", "serialize", "Lkotlinx/serialization/descriptors/a;", "getDescriptor", "()Lkotlinx/serialization/descriptors/a;", "descriptor", "<init>", "()V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class Demographic$$serializer implements g0<Demographic> {
    public static final Demographic$$serializer INSTANCE;
    public static final /* synthetic */ a descriptor;

    private Demographic$$serializer() {
    }

    @Override // bl.g0
    public b<?>[] childSerializers() {
        p0 p0Var = p0.f5452a;
        return new b[]{yk.a.t(p0Var), yk.a.t(p0Var)};
    }

    @Override // xk.a
    public Demographic deserialize(e decoder) {
        Object objP;
        Object objP2;
        int i10;
        p.j(decoder, "decoder");
        a descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        if (cVarB.j()) {
            p0 p0Var = p0.f5452a;
            objP2 = cVarB.p(descriptor2, 0, p0Var, null);
            objP = cVarB.p(descriptor2, 1, p0Var, null);
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
                    objP3 = cVarB.p(descriptor2, 0, p0.f5452a, objP3);
                    i11 |= 1;
                } else {
                    if (iX != 1) {
                        throw new UnknownFieldException(iX);
                    }
                    objP = cVarB.p(descriptor2, 1, p0.f5452a, objP);
                    i11 |= 2;
                }
            }
            objP2 = objP3;
            i10 = i11;
        }
        cVarB.c(descriptor2);
        return new Demographic(i10, (Integer) objP2, (Integer) objP, null);
    }

    @Override // xk.b, xk.g, xk.a
    public a getDescriptor() {
        return descriptor;
    }

    @Override // xk.g
    public void serialize(f fVar, Demographic demographic) {
        p.j(fVar, "encoder");
        p.j(demographic, "value");
        a descriptor2 = getDescriptor();
        d dVarB = fVar.b(descriptor2);
        Demographic.write$Self(demographic, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    static {
        Demographic$$serializer demographic$$serializer = new Demographic$$serializer();
        INSTANCE = demographic$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.fpd.Demographic", demographic$$serializer, 2);
        pluginGeneratedSerialDescriptor.k("age_range", true);
        pluginGeneratedSerialDescriptor.k(InneractiveMediationDefs.KEY_GENDER, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // bl.g0
    public b<?>[] typeParametersSerializers() {
        return g0.a.a(this);
    }
}
