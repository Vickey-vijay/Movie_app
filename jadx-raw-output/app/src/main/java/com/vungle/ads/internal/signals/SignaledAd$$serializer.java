package com.vungle.ads.internal.signals;

import al.c;
import al.d;
import al.e;
import al.f;
import bl.a1;
import bl.d2;
import bl.g0;
import bl.p0;
import ck.p;
import kotlin.Metadata;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.a;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import xk.b;

/* JADX INFO: compiled from: SignaledAd.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/vungle/ads/internal/signals/SignaledAd.$serializer", "Lbl/g0;", "Lcom/vungle/ads/internal/signals/SignaledAd;", "", "Lxk/b;", "childSerializers", "()[Lxk/b;", "Lal/e;", "decoder", "deserialize", "Lal/f;", "encoder", "value", "Lmj/r;", "serialize", "Lkotlinx/serialization/descriptors/a;", "getDescriptor", "()Lkotlinx/serialization/descriptors/a;", "descriptor", "<init>", "()V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class SignaledAd$$serializer implements g0<SignaledAd> {
    public static final SignaledAd$$serializer INSTANCE;
    public static final /* synthetic */ a descriptor;

    private SignaledAd$$serializer() {
    }

    @Override // bl.g0
    public b<?>[] childSerializers() {
        d2 d2Var = d2.f5397a;
        a1 a1Var = a1.f5375a;
        return new b[]{yk.a.t(d2Var), a1Var, yk.a.t(d2Var), a1Var, p0.f5452a};
    }

    @Override // xk.a
    public SignaledAd deserialize(e decoder) {
        long jE;
        Object objP;
        int iF;
        int i10;
        long j10;
        p.j(decoder, "decoder");
        a descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        Object objP2 = null;
        int i11 = 3;
        if (cVarB.j()) {
            d2 d2Var = d2.f5397a;
            Object objP3 = cVarB.p(descriptor2, 0, d2Var, null);
            long jE2 = cVarB.e(descriptor2, 1);
            objP = cVarB.p(descriptor2, 2, d2Var, null);
            long jE3 = cVarB.e(descriptor2, 3);
            iF = cVarB.f(descriptor2, 4);
            i10 = 31;
            objP2 = objP3;
            j10 = jE2;
            jE = jE3;
        } else {
            jE = 0;
            objP = null;
            iF = 0;
            int i12 = 0;
            boolean z10 = true;
            long jE4 = 0;
            while (z10) {
                int iX = cVarB.x(descriptor2);
                if (iX == -1) {
                    z10 = false;
                } else if (iX == 0) {
                    objP2 = cVarB.p(descriptor2, 0, d2.f5397a, objP2);
                    i12 |= 1;
                } else if (iX == 1) {
                    jE4 = cVarB.e(descriptor2, 1);
                    i12 |= 2;
                } else if (iX == 2) {
                    objP = cVarB.p(descriptor2, 2, d2.f5397a, objP);
                    i12 |= 4;
                } else if (iX == i11) {
                    jE = cVarB.e(descriptor2, i11);
                    i12 |= 8;
                } else {
                    if (iX != 4) {
                        throw new UnknownFieldException(iX);
                    }
                    iF = cVarB.f(descriptor2, 4);
                    i12 |= 16;
                }
                i11 = 3;
            }
            i10 = i12;
            j10 = jE4;
        }
        cVarB.c(descriptor2);
        return new SignaledAd(i10, (String) objP2, j10, (String) objP, jE, iF, null);
    }

    @Override // xk.b, xk.g, xk.a
    public a getDescriptor() {
        return descriptor;
    }

    @Override // xk.g
    public void serialize(f fVar, SignaledAd signaledAd) {
        p.j(fVar, "encoder");
        p.j(signaledAd, "value");
        a descriptor2 = getDescriptor();
        d dVarB = fVar.b(descriptor2);
        SignaledAd.write$Self(signaledAd, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    static {
        SignaledAd$$serializer signaledAd$$serializer = new SignaledAd$$serializer();
        INSTANCE = signaledAd$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.signals.SignaledAd", signaledAd$$serializer, 5);
        pluginGeneratedSerialDescriptor.k("500", true);
        pluginGeneratedSerialDescriptor.k("109", false);
        pluginGeneratedSerialDescriptor.k("107", true);
        pluginGeneratedSerialDescriptor.k("110", true);
        pluginGeneratedSerialDescriptor.k("108", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // bl.g0
    public b<?>[] typeParametersSerializers() {
        return g0.a.a(this);
    }
}
