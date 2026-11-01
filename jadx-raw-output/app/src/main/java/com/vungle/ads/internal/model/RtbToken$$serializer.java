package com.vungle.ads.internal.model;

import al.c;
import al.d;
import al.e;
import al.f;
import bl.g0;
import bl.p0;
import bl.y1;
import ck.p;
import com.ironsource.C3426d4;
import com.vungle.ads.internal.ui.AdActivity;
import kotlin.Metadata;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.a;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import xk.b;

/* JADX INFO: compiled from: RtbToken.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/vungle/ads/internal/model/RtbToken.$serializer", "Lbl/g0;", "Lcom/vungle/ads/internal/model/RtbToken;", "", "Lxk/b;", "childSerializers", "()[Lxk/b;", "Lal/e;", "decoder", "deserialize", "Lal/f;", "encoder", "value", "Lmj/r;", "serialize", "Lkotlinx/serialization/descriptors/a;", "getDescriptor", "()Lkotlinx/serialization/descriptors/a;", "descriptor", "<init>", "()V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class RtbToken$$serializer implements g0<RtbToken> {
    public static final RtbToken$$serializer INSTANCE;
    public static final /* synthetic */ a descriptor;

    private RtbToken$$serializer() {
    }

    @Override // bl.g0
    public b<?>[] childSerializers() {
        return new b[]{DeviceNode$$serializer.INSTANCE, yk.a.t(CommonRequestBody$User$$serializer.INSTANCE), yk.a.t(CommonRequestBody$RequestExt$$serializer.INSTANCE), yk.a.t(RtbRequest$$serializer.INSTANCE), p0.f5452a};
    }

    @Override // xk.a
    public RtbToken deserialize(e decoder) {
        Object objP;
        int i10;
        Object objP2;
        Object objP3;
        int iF;
        Object objV;
        p.j(decoder, "decoder");
        a descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        if (cVarB.j()) {
            objV = cVarB.v(descriptor2, 0, DeviceNode$$serializer.INSTANCE, null);
            objP2 = cVarB.p(descriptor2, 1, CommonRequestBody$User$$serializer.INSTANCE, null);
            Object objP4 = cVarB.p(descriptor2, 2, CommonRequestBody$RequestExt$$serializer.INSTANCE, null);
            objP3 = cVarB.p(descriptor2, 3, RtbRequest$$serializer.INSTANCE, null);
            iF = cVarB.f(descriptor2, 4);
            objP = objP4;
            i10 = 31;
        } else {
            Object objV2 = null;
            Object objP5 = null;
            objP = null;
            Object objP6 = null;
            int iF2 = 0;
            int i11 = 0;
            boolean z10 = true;
            while (z10) {
                int iX = cVarB.x(descriptor2);
                if (iX == -1) {
                    z10 = false;
                } else if (iX == 0) {
                    objV2 = cVarB.v(descriptor2, 0, DeviceNode$$serializer.INSTANCE, objV2);
                    i11 |= 1;
                } else if (iX == 1) {
                    objP5 = cVarB.p(descriptor2, 1, CommonRequestBody$User$$serializer.INSTANCE, objP5);
                    i11 |= 2;
                } else if (iX == 2) {
                    objP = cVarB.p(descriptor2, 2, CommonRequestBody$RequestExt$$serializer.INSTANCE, objP);
                    i11 |= 4;
                } else if (iX == 3) {
                    objP6 = cVarB.p(descriptor2, 3, RtbRequest$$serializer.INSTANCE, objP6);
                    i11 |= 8;
                } else {
                    if (iX != 4) {
                        throw new UnknownFieldException(iX);
                    }
                    iF2 = cVarB.f(descriptor2, 4);
                    i11 |= 16;
                }
            }
            i10 = i11;
            objP2 = objP5;
            objP3 = objP6;
            iF = iF2;
            objV = objV2;
        }
        cVarB.c(descriptor2);
        return new RtbToken(i10, (DeviceNode) objV, (CommonRequestBody.User) objP2, (CommonRequestBody.RequestExt) objP, (RtbRequest) objP3, iF, (y1) null);
    }

    @Override // xk.b, xk.g, xk.a
    public a getDescriptor() {
        return descriptor;
    }

    @Override // xk.g
    public void serialize(f fVar, RtbToken rtbToken) {
        p.j(fVar, "encoder");
        p.j(rtbToken, "value");
        a descriptor2 = getDescriptor();
        d dVarB = fVar.b(descriptor2);
        RtbToken.write$Self(rtbToken, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    static {
        RtbToken$$serializer rtbToken$$serializer = new RtbToken$$serializer();
        INSTANCE = rtbToken$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.RtbToken", rtbToken$$serializer, 5);
        pluginGeneratedSerialDescriptor.k(C3426d4.i.G, false);
        pluginGeneratedSerialDescriptor.k("user", true);
        pluginGeneratedSerialDescriptor.k("ext", true);
        pluginGeneratedSerialDescriptor.k(AdActivity.REQUEST_KEY_EXTRA, true);
        pluginGeneratedSerialDescriptor.k("ordinal_view", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // bl.g0
    public b<?>[] typeParametersSerializers() {
        return g0.a.a(this);
    }
}
