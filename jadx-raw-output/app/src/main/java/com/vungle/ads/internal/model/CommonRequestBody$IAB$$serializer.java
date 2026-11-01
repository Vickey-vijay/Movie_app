package com.vungle.ads.internal.model;

import al.c;
import al.d;
import al.e;
import al.f;
import bl.d2;
import bl.g0;
import ck.p;
import kotlin.Metadata;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.a;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import xk.b;

/* JADX INFO: compiled from: CommonRequestBody.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/vungle/ads/internal/model/CommonRequestBody.IAB.$serializer", "Lbl/g0;", "Lcom/vungle/ads/internal/model/CommonRequestBody$IAB;", "", "Lxk/b;", "childSerializers", "()[Lxk/b;", "Lal/e;", "decoder", "deserialize", "Lal/f;", "encoder", "value", "Lmj/r;", "serialize", "Lkotlinx/serialization/descriptors/a;", "getDescriptor", "()Lkotlinx/serialization/descriptors/a;", "descriptor", "<init>", "()V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class CommonRequestBody$IAB$$serializer implements g0<CommonRequestBody.IAB> {
    public static final CommonRequestBody$IAB$$serializer INSTANCE;
    public static final /* synthetic */ a descriptor;

    private CommonRequestBody$IAB$$serializer() {
    }

    @Override // bl.g0
    public b<?>[] childSerializers() {
        return new b[]{d2.f5397a};
    }

    @Override // xk.a
    public CommonRequestBody.IAB deserialize(e decoder) {
        String strI;
        p.j(decoder, "decoder");
        a descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        int i10 = 1;
        if (cVarB.j()) {
            strI = cVarB.i(descriptor2, 0);
        } else {
            strI = null;
            int i11 = 0;
            while (i10 != 0) {
                int iX = cVarB.x(descriptor2);
                if (iX == -1) {
                    i10 = 0;
                } else {
                    if (iX != 0) {
                        throw new UnknownFieldException(iX);
                    }
                    strI = cVarB.i(descriptor2, 0);
                    i11 |= 1;
                }
            }
            i10 = i11;
        }
        cVarB.c(descriptor2);
        return new CommonRequestBody.IAB(i10, strI, null);
    }

    @Override // xk.b, xk.g, xk.a
    public a getDescriptor() {
        return descriptor;
    }

    @Override // xk.g
    public void serialize(f fVar, CommonRequestBody.IAB iab) {
        p.j(fVar, "encoder");
        p.j(iab, "value");
        a descriptor2 = getDescriptor();
        d dVarB = fVar.b(descriptor2);
        CommonRequestBody.IAB.write$Self(iab, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    static {
        CommonRequestBody$IAB$$serializer commonRequestBody$IAB$$serializer = new CommonRequestBody$IAB$$serializer();
        INSTANCE = commonRequestBody$IAB$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.CommonRequestBody.IAB", commonRequestBody$IAB$$serializer, 1);
        pluginGeneratedSerialDescriptor.k("tcf", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // bl.g0
    public b<?>[] typeParametersSerializers() {
        return g0.a.a(this);
    }
}
