package com.vungle.ads.internal.model;

import al.c;
import al.d;
import al.e;
import bl.a1;
import bl.d2;
import bl.f;
import bl.g0;
import bl.y1;
import ck.p;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.a;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import xk.b;

/* JADX INFO: compiled from: CommonRequestBody.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/vungle/ads/internal/model/CommonRequestBody.RequestParam.$serializer", "Lbl/g0;", "Lcom/vungle/ads/internal/model/CommonRequestBody$RequestParam;", "", "Lxk/b;", "childSerializers", "()[Lxk/b;", "Lal/e;", "decoder", "deserialize", "Lal/f;", "encoder", "value", "Lmj/r;", "serialize", "Lkotlinx/serialization/descriptors/a;", "getDescriptor", "()Lkotlinx/serialization/descriptors/a;", "descriptor", "<init>", "()V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class CommonRequestBody$RequestParam$$serializer implements g0<CommonRequestBody.RequestParam> {
    public static final CommonRequestBody$RequestParam$$serializer INSTANCE;
    public static final /* synthetic */ a descriptor;

    private CommonRequestBody$RequestParam$$serializer() {
    }

    @Override // bl.g0
    public b<?>[] childSerializers() {
        d2 d2Var = d2.f5397a;
        return new b[]{yk.a.t(new f(d2Var)), yk.a.t(CommonRequestBody$AdSizeParam$$serializer.INSTANCE), yk.a.t(a1.f5375a), yk.a.t(d2Var), yk.a.t(d2Var), yk.a.t(d2Var)};
    }

    @Override // xk.a
    public CommonRequestBody.RequestParam deserialize(e decoder) {
        Object objP;
        Object objP2;
        Object objP3;
        Object objP4;
        Object objP5;
        int i10;
        Object objP6;
        p.j(decoder, "decoder");
        a descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        int i11 = 5;
        Object objP7 = null;
        if (cVarB.j()) {
            d2 d2Var = d2.f5397a;
            objP6 = cVarB.p(descriptor2, 0, new f(d2Var), null);
            objP = cVarB.p(descriptor2, 1, CommonRequestBody$AdSizeParam$$serializer.INSTANCE, null);
            objP2 = cVarB.p(descriptor2, 2, a1.f5375a, null);
            objP3 = cVarB.p(descriptor2, 3, d2Var, null);
            objP4 = cVarB.p(descriptor2, 4, d2Var, null);
            objP5 = cVarB.p(descriptor2, 5, d2Var, null);
            i10 = 63;
        } else {
            int i12 = 0;
            boolean z10 = true;
            Object objP8 = null;
            Object objP9 = null;
            Object objP10 = null;
            Object objP11 = null;
            Object objP12 = null;
            while (z10) {
                int iX = cVarB.x(descriptor2);
                switch (iX) {
                    case -1:
                        z10 = false;
                        i11 = 5;
                        break;
                    case 0:
                        objP7 = cVarB.p(descriptor2, 0, new f(d2.f5397a), objP7);
                        i12 |= 1;
                        i11 = 5;
                        break;
                    case 1:
                        objP8 = cVarB.p(descriptor2, 1, CommonRequestBody$AdSizeParam$$serializer.INSTANCE, objP8);
                        i12 |= 2;
                        break;
                    case 2:
                        objP9 = cVarB.p(descriptor2, 2, a1.f5375a, objP9);
                        i12 |= 4;
                        break;
                    case 3:
                        objP10 = cVarB.p(descriptor2, 3, d2.f5397a, objP10);
                        i12 |= 8;
                        break;
                    case 4:
                        objP11 = cVarB.p(descriptor2, 4, d2.f5397a, objP11);
                        i12 |= 16;
                        break;
                    case 5:
                        objP12 = cVarB.p(descriptor2, i11, d2.f5397a, objP12);
                        i12 |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iX);
                }
            }
            objP = objP8;
            objP2 = objP9;
            objP3 = objP10;
            objP4 = objP11;
            objP5 = objP12;
            Object obj = objP7;
            i10 = i12;
            objP6 = obj;
        }
        cVarB.c(descriptor2);
        return new CommonRequestBody.RequestParam(i10, (List) objP6, (CommonRequestBody.AdSizeParam) objP, (Long) objP2, (String) objP3, (String) objP4, (String) objP5, (y1) null);
    }

    @Override // xk.b, xk.g, xk.a
    public a getDescriptor() {
        return descriptor;
    }

    @Override // xk.g
    public void serialize(al.f fVar, CommonRequestBody.RequestParam requestParam) {
        p.j(fVar, "encoder");
        p.j(requestParam, "value");
        a descriptor2 = getDescriptor();
        d dVarB = fVar.b(descriptor2);
        CommonRequestBody.RequestParam.write$Self(requestParam, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    static {
        CommonRequestBody$RequestParam$$serializer commonRequestBody$RequestParam$$serializer = new CommonRequestBody$RequestParam$$serializer();
        INSTANCE = commonRequestBody$RequestParam$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.CommonRequestBody.RequestParam", commonRequestBody$RequestParam$$serializer, 6);
        pluginGeneratedSerialDescriptor.k("placements", true);
        pluginGeneratedSerialDescriptor.k("ad_size", true);
        pluginGeneratedSerialDescriptor.k("ad_start_time", true);
        pluginGeneratedSerialDescriptor.k("app_id", true);
        pluginGeneratedSerialDescriptor.k("placement_reference_id", true);
        pluginGeneratedSerialDescriptor.k("user", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // bl.g0
    public b<?>[] typeParametersSerializers() {
        return g0.a.a(this);
    }
}
