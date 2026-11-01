package com.vungle.ads.internal.network;

import al.c;
import al.d;
import al.e;
import al.f;
import bl.d2;
import bl.g0;
import bl.p0;
import bl.u0;
import bl.y1;
import ck.p;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: compiled from: TpatSender.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/vungle/ads/internal/network/FailedTpat.$serializer", "Lbl/g0;", "Lcom/vungle/ads/internal/network/FailedTpat;", "", "Lxk/b;", "childSerializers", "()[Lxk/b;", "Lal/e;", "decoder", "deserialize", "Lal/f;", "encoder", "value", "Lmj/r;", "serialize", "Lkotlinx/serialization/descriptors/a;", "getDescriptor", "()Lkotlinx/serialization/descriptors/a;", "descriptor", "<init>", "()V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class FailedTpat$$serializer implements g0<FailedTpat> {
    public static final FailedTpat$$serializer INSTANCE;
    public static final /* synthetic */ kotlinx.serialization.descriptors.a descriptor;

    private FailedTpat$$serializer() {
    }

    @Override // bl.g0
    public xk.b<?>[] childSerializers() {
        d2 d2Var = d2.f5397a;
        p0 p0Var = p0.f5452a;
        return new xk.b[]{HttpMethod$$serializer.INSTANCE, yk.a.t(new u0(d2Var, d2Var)), yk.a.t(d2Var), p0Var, p0Var, yk.a.t(d2Var)};
    }

    @Override // xk.a
    public FailedTpat deserialize(e decoder) {
        int i10;
        int i11;
        Object objV;
        Object objP;
        Object objP2;
        Object objP3;
        int i12;
        p.j(decoder, "decoder");
        kotlinx.serialization.descriptors.a descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        int i13 = 5;
        if (cVarB.j()) {
            objV = cVarB.v(descriptor2, 0, HttpMethod$$serializer.INSTANCE, null);
            d2 d2Var = d2.f5397a;
            objP = cVarB.p(descriptor2, 1, new u0(d2Var, d2Var), null);
            objP2 = cVarB.p(descriptor2, 2, d2Var, null);
            int iF = cVarB.f(descriptor2, 3);
            int iF2 = cVarB.f(descriptor2, 4);
            objP3 = cVarB.p(descriptor2, 5, d2Var, null);
            i10 = iF;
            i12 = iF2;
            i11 = 63;
        } else {
            Object objV2 = null;
            Object objP4 = null;
            Object objP5 = null;
            Object objP6 = null;
            boolean z10 = true;
            int iF3 = 0;
            int iF4 = 0;
            int i14 = 0;
            while (z10) {
                int iX = cVarB.x(descriptor2);
                switch (iX) {
                    case -1:
                        z10 = false;
                        continue;
                    case 0:
                        objV2 = cVarB.v(descriptor2, 0, HttpMethod$$serializer.INSTANCE, objV2);
                        i14 |= 1;
                        i13 = 5;
                        continue;
                    case 1:
                        d2 d2Var2 = d2.f5397a;
                        objP4 = cVarB.p(descriptor2, 1, new u0(d2Var2, d2Var2), objP4);
                        i14 |= 2;
                        i13 = 5;
                        break;
                    case 2:
                        objP5 = cVarB.p(descriptor2, 2, d2.f5397a, objP5);
                        i14 |= 4;
                        break;
                    case 3:
                        iF3 = cVarB.f(descriptor2, 3);
                        i14 |= 8;
                        break;
                    case 4:
                        iF4 = cVarB.f(descriptor2, 4);
                        i14 |= 16;
                        break;
                    case 5:
                        objP6 = cVarB.p(descriptor2, i13, d2.f5397a, objP6);
                        i14 |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iX);
                }
            }
            i10 = iF3;
            i11 = i14;
            objV = objV2;
            objP = objP4;
            objP2 = objP5;
            objP3 = objP6;
            i12 = iF4;
        }
        cVarB.c(descriptor2);
        return new FailedTpat(i11, (HttpMethod) objV, (Map) objP, (String) objP2, i10, i12, (String) objP3, (y1) null);
    }

    @Override // xk.b, xk.g, xk.a
    public kotlinx.serialization.descriptors.a getDescriptor() {
        return descriptor;
    }

    @Override // xk.g
    public void serialize(f fVar, FailedTpat failedTpat) {
        p.j(fVar, "encoder");
        p.j(failedTpat, "value");
        kotlinx.serialization.descriptors.a descriptor2 = getDescriptor();
        d dVarB = fVar.b(descriptor2);
        FailedTpat.write$Self(failedTpat, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    static {
        FailedTpat$$serializer failedTpat$$serializer = new FailedTpat$$serializer();
        INSTANCE = failedTpat$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.network.FailedTpat", failedTpat$$serializer, 6);
        pluginGeneratedSerialDescriptor.k("method", true);
        pluginGeneratedSerialDescriptor.k("headers", true);
        pluginGeneratedSerialDescriptor.k("body", true);
        pluginGeneratedSerialDescriptor.k("retryAttempt", true);
        pluginGeneratedSerialDescriptor.k("retryCount", false);
        pluginGeneratedSerialDescriptor.k("tpatKey", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // bl.g0
    public xk.b<?>[] typeParametersSerializers() {
        return g0.a.a(this);
    }
}
