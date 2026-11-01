package com.vungle.ads.internal.model;

import al.c;
import al.d;
import al.e;
import al.f;
import bl.g0;
import bl.y1;
import ck.p;
import com.inmobi.sdk.InMobiSdk;
import com.vungle.ads.fpd.FirstPartyData;
import com.vungle.ads.fpd.FirstPartyData$$serializer;
import kotlin.Metadata;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.a;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import xk.b;

/* JADX INFO: compiled from: CommonRequestBody.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/vungle/ads/internal/model/CommonRequestBody.User.$serializer", "Lbl/g0;", "Lcom/vungle/ads/internal/model/CommonRequestBody$User;", "", "Lxk/b;", "childSerializers", "()[Lxk/b;", "Lal/e;", "decoder", "deserialize", "Lal/f;", "encoder", "value", "Lmj/r;", "serialize", "Lkotlinx/serialization/descriptors/a;", "getDescriptor", "()Lkotlinx/serialization/descriptors/a;", "descriptor", "<init>", "()V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class CommonRequestBody$User$$serializer implements g0<CommonRequestBody.User> {
    public static final CommonRequestBody$User$$serializer INSTANCE;
    public static final /* synthetic */ a descriptor;

    private CommonRequestBody$User$$serializer() {
    }

    @Override // bl.g0
    public b<?>[] childSerializers() {
        return new b[]{yk.a.t(CommonRequestBody$GDPR$$serializer.INSTANCE), yk.a.t(CommonRequestBody$CCPA$$serializer.INSTANCE), yk.a.t(CommonRequestBody$COPPA$$serializer.INSTANCE), yk.a.t(FirstPartyData$$serializer.INSTANCE), yk.a.t(CommonRequestBody$IAB$$serializer.INSTANCE)};
    }

    @Override // xk.a
    public CommonRequestBody.User deserialize(e decoder) {
        Object objP;
        int i10;
        Object objP2;
        Object objP3;
        Object objP4;
        Object objP5;
        p.j(decoder, "decoder");
        a descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        if (cVarB.j()) {
            objP = cVarB.p(descriptor2, 0, CommonRequestBody$GDPR$$serializer.INSTANCE, null);
            objP2 = cVarB.p(descriptor2, 1, CommonRequestBody$CCPA$$serializer.INSTANCE, null);
            objP3 = cVarB.p(descriptor2, 2, CommonRequestBody$COPPA$$serializer.INSTANCE, null);
            objP4 = cVarB.p(descriptor2, 3, FirstPartyData$$serializer.INSTANCE, null);
            objP5 = cVarB.p(descriptor2, 4, CommonRequestBody$IAB$$serializer.INSTANCE, null);
            i10 = 31;
        } else {
            objP = null;
            Object objP6 = null;
            Object objP7 = null;
            Object objP8 = null;
            Object objP9 = null;
            boolean z10 = true;
            int i11 = 0;
            while (z10) {
                int iX = cVarB.x(descriptor2);
                if (iX == -1) {
                    z10 = false;
                } else if (iX == 0) {
                    objP = cVarB.p(descriptor2, 0, CommonRequestBody$GDPR$$serializer.INSTANCE, objP);
                    i11 |= 1;
                } else if (iX == 1) {
                    objP6 = cVarB.p(descriptor2, 1, CommonRequestBody$CCPA$$serializer.INSTANCE, objP6);
                    i11 |= 2;
                } else if (iX == 2) {
                    objP7 = cVarB.p(descriptor2, 2, CommonRequestBody$COPPA$$serializer.INSTANCE, objP7);
                    i11 |= 4;
                } else if (iX == 3) {
                    objP8 = cVarB.p(descriptor2, 3, FirstPartyData$$serializer.INSTANCE, objP8);
                    i11 |= 8;
                } else {
                    if (iX != 4) {
                        throw new UnknownFieldException(iX);
                    }
                    objP9 = cVarB.p(descriptor2, 4, CommonRequestBody$IAB$$serializer.INSTANCE, objP9);
                    i11 |= 16;
                }
            }
            i10 = i11;
            objP2 = objP6;
            objP3 = objP7;
            objP4 = objP8;
            objP5 = objP9;
        }
        cVarB.c(descriptor2);
        return new CommonRequestBody.User(i10, (CommonRequestBody.GDPR) objP, (CommonRequestBody.CCPA) objP2, (CommonRequestBody.COPPA) objP3, (FirstPartyData) objP4, (CommonRequestBody.IAB) objP5, (y1) null);
    }

    @Override // xk.b, xk.g, xk.a
    public a getDescriptor() {
        return descriptor;
    }

    @Override // xk.g
    public void serialize(f fVar, CommonRequestBody.User user) {
        p.j(fVar, "encoder");
        p.j(user, "value");
        a descriptor2 = getDescriptor();
        d dVarB = fVar.b(descriptor2);
        CommonRequestBody.User.write$Self(user, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    static {
        CommonRequestBody$User$$serializer commonRequestBody$User$$serializer = new CommonRequestBody$User$$serializer();
        INSTANCE = commonRequestBody$User$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.CommonRequestBody.User", commonRequestBody$User$$serializer, 5);
        pluginGeneratedSerialDescriptor.k(InMobiSdk.IM_GDPR_CONSENT_GDPR_APPLIES, true);
        pluginGeneratedSerialDescriptor.k("ccpa", true);
        pluginGeneratedSerialDescriptor.k("coppa", true);
        pluginGeneratedSerialDescriptor.k("fpd", true);
        pluginGeneratedSerialDescriptor.k("iab", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // bl.g0
    public b<?>[] typeParametersSerializers() {
        return g0.a.a(this);
    }
}
