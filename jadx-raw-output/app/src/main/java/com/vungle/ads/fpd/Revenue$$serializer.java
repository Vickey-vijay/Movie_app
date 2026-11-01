package com.vungle.ads.fpd;

import al.c;
import al.d;
import al.e;
import al.f;
import bl.f0;
import bl.g0;
import bl.i;
import ck.p;
import kotlin.Metadata;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.a;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import xk.b;

/* JADX INFO: compiled from: Revenue.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/vungle/ads/fpd/Revenue.$serializer", "Lbl/g0;", "Lcom/vungle/ads/fpd/Revenue;", "", "Lxk/b;", "childSerializers", "()[Lxk/b;", "Lal/e;", "decoder", "deserialize", "Lal/f;", "encoder", "value", "Lmj/r;", "serialize", "Lkotlinx/serialization/descriptors/a;", "getDescriptor", "()Lkotlinx/serialization/descriptors/a;", "descriptor", "<init>", "()V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class Revenue$$serializer implements g0<Revenue> {
    public static final Revenue$$serializer INSTANCE;
    public static final /* synthetic */ a descriptor;

    private Revenue$$serializer() {
    }

    @Override // bl.g0
    public b<?>[] childSerializers() {
        f0 f0Var = f0.f5402a;
        return new b[]{yk.a.t(f0Var), yk.a.t(f0Var), yk.a.t(f0Var), yk.a.t(i.f5416a)};
    }

    @Override // xk.a
    public Revenue deserialize(e decoder) {
        Object objP;
        Object objP2;
        Object objP3;
        int i10;
        Object objP4;
        p.j(decoder, "decoder");
        a descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        Object objP5 = null;
        if (cVarB.j()) {
            f0 f0Var = f0.f5402a;
            objP = cVarB.p(descriptor2, 0, f0Var, null);
            objP2 = cVarB.p(descriptor2, 1, f0Var, null);
            objP4 = cVarB.p(descriptor2, 2, f0Var, null);
            objP3 = cVarB.p(descriptor2, 3, i.f5416a, null);
            i10 = 15;
        } else {
            Object objP6 = null;
            Object objP7 = null;
            Object objP8 = null;
            int i11 = 0;
            boolean z10 = true;
            while (z10) {
                int iX = cVarB.x(descriptor2);
                if (iX == -1) {
                    z10 = false;
                } else if (iX == 0) {
                    objP5 = cVarB.p(descriptor2, 0, f0.f5402a, objP5);
                    i11 |= 1;
                } else if (iX == 1) {
                    objP6 = cVarB.p(descriptor2, 1, f0.f5402a, objP6);
                    i11 |= 2;
                } else if (iX == 2) {
                    objP7 = cVarB.p(descriptor2, 2, f0.f5402a, objP7);
                    i11 |= 4;
                } else {
                    if (iX != 3) {
                        throw new UnknownFieldException(iX);
                    }
                    objP8 = cVarB.p(descriptor2, 3, i.f5416a, objP8);
                    i11 |= 8;
                }
            }
            objP = objP5;
            objP2 = objP6;
            objP3 = objP8;
            i10 = i11;
            objP4 = objP7;
        }
        cVarB.c(descriptor2);
        return new Revenue(i10, (Float) objP, (Float) objP2, (Float) objP4, (Boolean) objP3, null);
    }

    @Override // xk.b, xk.g, xk.a
    public a getDescriptor() {
        return descriptor;
    }

    @Override // xk.g
    public void serialize(f fVar, Revenue revenue) {
        p.j(fVar, "encoder");
        p.j(revenue, "value");
        a descriptor2 = getDescriptor();
        d dVarB = fVar.b(descriptor2);
        Revenue.write$Self(revenue, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    static {
        Revenue$$serializer revenue$$serializer = new Revenue$$serializer();
        INSTANCE = revenue$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.fpd.Revenue", revenue$$serializer, 4);
        pluginGeneratedSerialDescriptor.k("iaa_revenue_usd", true);
        pluginGeneratedSerialDescriptor.k("iap_revenue_usd", true);
        pluginGeneratedSerialDescriptor.k("total_revenue_usd", true);
        pluginGeneratedSerialDescriptor.k("is_user_a_purchaser", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // bl.g0
    public b<?>[] typeParametersSerializers() {
        return g0.a.a(this);
    }
}
