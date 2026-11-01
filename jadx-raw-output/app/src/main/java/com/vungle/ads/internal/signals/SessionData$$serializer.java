package com.vungle.ads.internal.signals;

import al.c;
import al.d;
import al.e;
import bl.a1;
import bl.d2;
import bl.f;
import bl.g0;
import bl.p0;
import ck.p;
import com.bykv.vk.openvk.preload.falconx.statistic.StatisticData;
import com.vungle.ads.internal.model.UnclosedAd$$serializer;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.a;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import xk.b;

/* JADX INFO: compiled from: SessionData.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/vungle/ads/internal/signals/SessionData.$serializer", "Lbl/g0;", "Lcom/vungle/ads/internal/signals/SessionData;", "", "Lxk/b;", "childSerializers", "()[Lxk/b;", "Lal/e;", "decoder", "deserialize", "Lal/f;", "encoder", "value", "Lmj/r;", "serialize", "Lkotlinx/serialization/descriptors/a;", "getDescriptor", "()Lkotlinx/serialization/descriptors/a;", "descriptor", "<init>", "()V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class SessionData$$serializer implements g0<SessionData> {
    public static final SessionData$$serializer INSTANCE;
    public static final /* synthetic */ a descriptor;

    private SessionData$$serializer() {
    }

    @Override // xk.a
    public SessionData deserialize(e decoder) {
        int i10;
        int iF;
        int iF2;
        int i11;
        long j10;
        int i12;
        int i13;
        String str;
        int iF3;
        Object objV;
        int i14;
        Object objV2;
        long j11;
        char c10;
        p.j(decoder, "decoder");
        a descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        int i15 = 9;
        int i16 = 0;
        if (cVarB.j()) {
            int iF4 = cVarB.f(descriptor2, 0);
            String strI = cVarB.i(descriptor2, 1);
            long jE = cVarB.e(descriptor2, 2);
            objV2 = cVarB.v(descriptor2, 3, new f(SignaledAd$$serializer.INSTANCE), null);
            long jE2 = cVarB.e(descriptor2, 4);
            int iF5 = cVarB.f(descriptor2, 5);
            objV = cVarB.v(descriptor2, 6, new f(UnclosedAd$$serializer.INSTANCE), null);
            int iF6 = cVarB.f(descriptor2, 7);
            int iF7 = cVarB.f(descriptor2, 8);
            iF3 = cVarB.f(descriptor2, 9);
            i12 = iF6;
            i13 = iF7;
            i11 = iF5;
            iF = cVarB.f(descriptor2, 10);
            iF2 = cVarB.f(descriptor2, 11);
            j10 = jE2;
            i10 = 4095;
            str = strI;
            j11 = jE;
            i14 = iF4;
        } else {
            int i17 = 11;
            long jE3 = 0;
            long jE4 = 0;
            Object objV3 = null;
            String strI2 = null;
            boolean z10 = true;
            int iF8 = 0;
            int iF9 = 0;
            int iF10 = 0;
            int iF11 = 0;
            int iF12 = 0;
            int iF13 = 0;
            Object objV4 = null;
            int iF14 = 0;
            while (z10) {
                int iX = cVarB.x(descriptor2);
                switch (iX) {
                    case -1:
                        z10 = false;
                        i17 = 11;
                        break;
                    case 0:
                        i16 |= 1;
                        iF8 = cVarB.f(descriptor2, 0);
                        i17 = 11;
                        i15 = 9;
                        break;
                    case 1:
                        c10 = 3;
                        strI2 = cVarB.i(descriptor2, 1);
                        i16 |= 2;
                        i17 = 11;
                        i15 = 9;
                        break;
                    case 2:
                        c10 = 3;
                        jE4 = cVarB.e(descriptor2, 2);
                        i16 |= 4;
                        i17 = 11;
                        i15 = 9;
                        break;
                    case 3:
                        c10 = 3;
                        objV4 = cVarB.v(descriptor2, 3, new f(SignaledAd$$serializer.INSTANCE), objV4);
                        i16 |= 8;
                        i17 = 11;
                        i15 = 9;
                        break;
                    case 4:
                        jE3 = cVarB.e(descriptor2, 4);
                        i16 |= 16;
                        i17 = 11;
                        i15 = 9;
                        break;
                    case 5:
                        iF11 = cVarB.f(descriptor2, 5);
                        i16 |= 32;
                        i17 = 11;
                        i15 = 9;
                        break;
                    case 6:
                        objV3 = cVarB.v(descriptor2, 6, new f(UnclosedAd$$serializer.INSTANCE), objV3);
                        i16 |= 64;
                        i17 = 11;
                        i15 = 9;
                        break;
                    case 7:
                        iF14 = cVarB.f(descriptor2, 7);
                        i16 |= 128;
                        break;
                    case 8:
                        iF10 = cVarB.f(descriptor2, 8);
                        i16 |= 256;
                        break;
                    case 9:
                        iF9 = cVarB.f(descriptor2, i15);
                        i16 |= 512;
                        break;
                    case 10:
                        iF12 = cVarB.f(descriptor2, 10);
                        i16 |= 1024;
                        break;
                    case 11:
                        iF13 = cVarB.f(descriptor2, i17);
                        i16 |= 2048;
                        break;
                    default:
                        throw new UnknownFieldException(iX);
                }
            }
            i10 = i16;
            iF = iF12;
            iF2 = iF13;
            i11 = iF11;
            j10 = jE3;
            i12 = iF14;
            i13 = iF10;
            str = strI2;
            iF3 = iF9;
            objV = objV3;
            i14 = iF8;
            objV2 = objV4;
            j11 = jE4;
        }
        cVarB.c(descriptor2);
        return new SessionData(i10, i14, str, j11, (List) objV2, j10, i11, (List) objV, i12, i13, iF3, iF, iF2, null);
    }

    @Override // xk.b, xk.g, xk.a
    public a getDescriptor() {
        return descriptor;
    }

    @Override // xk.g
    public void serialize(al.f fVar, SessionData sessionData) {
        p.j(fVar, "encoder");
        p.j(sessionData, "value");
        a descriptor2 = getDescriptor();
        d dVarB = fVar.b(descriptor2);
        SessionData.write$Self(sessionData, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    static {
        SessionData$$serializer sessionData$$serializer = new SessionData$$serializer();
        INSTANCE = sessionData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.signals.SessionData", sessionData$$serializer, 12);
        pluginGeneratedSerialDescriptor.k("103", false);
        pluginGeneratedSerialDescriptor.k(StatisticData.ERROR_CODE_IO_ERROR, true);
        pluginGeneratedSerialDescriptor.k(StatisticData.ERROR_CODE_NOT_FOUND, true);
        pluginGeneratedSerialDescriptor.k("106", true);
        pluginGeneratedSerialDescriptor.k("102", true);
        pluginGeneratedSerialDescriptor.k("104", true);
        pluginGeneratedSerialDescriptor.k("105", true);
        pluginGeneratedSerialDescriptor.k("112", true);
        pluginGeneratedSerialDescriptor.k("113", true);
        pluginGeneratedSerialDescriptor.k("114", true);
        pluginGeneratedSerialDescriptor.k("115", true);
        pluginGeneratedSerialDescriptor.k("116", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // bl.g0
    public b<?>[] childSerializers() {
        p0 p0Var = p0.f5452a;
        a1 a1Var = a1.f5375a;
        return new b[]{p0Var, d2.f5397a, a1Var, new f(SignaledAd$$serializer.INSTANCE), a1Var, p0Var, new f(UnclosedAd$$serializer.INSTANCE), p0Var, p0Var, p0Var, p0Var, p0Var};
    }

    @Override // bl.g0
    public b<?>[] typeParametersSerializers() {
        return g0.a.a(this);
    }
}
