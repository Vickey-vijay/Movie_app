package com.vungle.ads.internal.model;

import al.c;
import al.d;
import al.e;
import al.f;
import bl.a1;
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
@Metadata(bv = {}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/vungle/ads/internal/model/CommonRequestBody.GDPR.$serializer", "Lbl/g0;", "Lcom/vungle/ads/internal/model/CommonRequestBody$GDPR;", "", "Lxk/b;", "childSerializers", "()[Lxk/b;", "Lal/e;", "decoder", "deserialize", "Lal/f;", "encoder", "value", "Lmj/r;", "serialize", "Lkotlinx/serialization/descriptors/a;", "getDescriptor", "()Lkotlinx/serialization/descriptors/a;", "descriptor", "<init>", "()V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class CommonRequestBody$GDPR$$serializer implements g0<CommonRequestBody.GDPR> {
    public static final CommonRequestBody$GDPR$$serializer INSTANCE;
    public static final /* synthetic */ a descriptor;

    private CommonRequestBody$GDPR$$serializer() {
    }

    @Override // bl.g0
    public b<?>[] childSerializers() {
        d2 d2Var = d2.f5397a;
        return new b[]{d2Var, d2Var, a1.f5375a, d2Var};
    }

    @Override // xk.a
    public CommonRequestBody.GDPR deserialize(e decoder) {
        String str;
        String strI;
        int i10;
        String str2;
        long j10;
        p.j(decoder, "decoder");
        a descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        if (cVarB.j()) {
            String strI2 = cVarB.i(descriptor2, 0);
            String strI3 = cVarB.i(descriptor2, 1);
            long jE = cVarB.e(descriptor2, 2);
            str = strI2;
            strI = cVarB.i(descriptor2, 3);
            i10 = 15;
            str2 = strI3;
            j10 = jE;
        } else {
            String strI4 = null;
            String strI5 = null;
            boolean z10 = true;
            long jE2 = 0;
            String strI6 = null;
            int i11 = 0;
            while (z10) {
                int iX = cVarB.x(descriptor2);
                if (iX == -1) {
                    z10 = false;
                } else if (iX == 0) {
                    strI4 = cVarB.i(descriptor2, 0);
                    i11 |= 1;
                } else if (iX == 1) {
                    strI5 = cVarB.i(descriptor2, 1);
                    i11 |= 2;
                } else if (iX == 2) {
                    jE2 = cVarB.e(descriptor2, 2);
                    i11 |= 4;
                } else {
                    if (iX != 3) {
                        throw new UnknownFieldException(iX);
                    }
                    strI6 = cVarB.i(descriptor2, 3);
                    i11 |= 8;
                }
            }
            str = strI4;
            strI = strI6;
            i10 = i11;
            str2 = strI5;
            j10 = jE2;
        }
        cVarB.c(descriptor2);
        return new CommonRequestBody.GDPR(i10, str, str2, j10, strI, null);
    }

    @Override // xk.b, xk.g, xk.a
    public a getDescriptor() {
        return descriptor;
    }

    @Override // xk.g
    public void serialize(f fVar, CommonRequestBody.GDPR gdpr) {
        p.j(fVar, "encoder");
        p.j(gdpr, "value");
        a descriptor2 = getDescriptor();
        d dVarB = fVar.b(descriptor2);
        CommonRequestBody.GDPR.write$Self(gdpr, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    static {
        CommonRequestBody$GDPR$$serializer commonRequestBody$GDPR$$serializer = new CommonRequestBody$GDPR$$serializer();
        INSTANCE = commonRequestBody$GDPR$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.CommonRequestBody.GDPR", commonRequestBody$GDPR$$serializer, 4);
        pluginGeneratedSerialDescriptor.k("consent_status", false);
        pluginGeneratedSerialDescriptor.k("consent_source", false);
        pluginGeneratedSerialDescriptor.k("consent_timestamp", false);
        pluginGeneratedSerialDescriptor.k("consent_message_version", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // bl.g0
    public b<?>[] typeParametersSerializers() {
        return g0.a.a(this);
    }
}
