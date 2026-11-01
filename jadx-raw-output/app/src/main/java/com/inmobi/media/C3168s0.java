package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3168s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3168s0 f25287a = new C3168s0();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Le le2, ContinuationImpl continuationImpl) throws Throwable {
        C3119q0 c3119q0;
        InMobiAdRequestStatus.StatusCode statusCode;
        if (continuationImpl instanceof C3119q0) {
            c3119q0 = (C3119q0) continuationImpl;
            int i10 = c3119q0.f25128c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c3119q0.f25128c = i10 - Integer.MIN_VALUE;
            } else {
                c3119q0 = new C3119q0(this, continuationImpl);
            }
        } else {
            c3119q0 = new C3119q0(this, continuationImpl);
        }
        Object objB = c3119q0.f25126a;
        Object objF = sj.a.f();
        int i11 = c3119q0.f25128c;
        if (i11 == 0) {
            kotlin.c.b(objB);
            c3119q0.f25128c = 1;
            objB = b(le2, c3119q0);
            if (objB == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(objB);
        }
        Ne ne2 = (Ne) objB;
        if (ne2.c() == 200) {
            return ne2;
        }
        int iC = ne2.c();
        Y5 y10 = EnumC2721a6.f23946b;
        if (iC == 192) {
            statusCode = InMobiAdRequestStatus.StatusCode.GDPR_COMPLIANCE_ENFORCED;
        } else if (iC == 0) {
            statusCode = InMobiAdRequestStatus.StatusCode.NETWORK_UNREACHABLE;
        } else if (iC == 504) {
            statusCode = InMobiAdRequestStatus.StatusCode.REQUEST_TIMED_OUT;
        } else if (400 > iC || iC >= 500) {
            statusCode = (500 > iC || iC > 599) ? InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR : InMobiAdRequestStatus.StatusCode.SERVER_ERROR;
        } else {
            statusCode = InMobiAdRequestStatus.StatusCode.REQUEST_INVALID;
        }
        throw new Y(new InMobiAdRequestStatus(statusCode), new K6(ne2.c()));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(Le le2, ContinuationImpl continuationImpl) throws Throwable {
        C3143r0 c3143r0;
        if (continuationImpl instanceof C3143r0) {
            c3143r0 = (C3143r0) continuationImpl;
            int i10 = c3143r0.f25216c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c3143r0.f25216c = i10 - Integer.MIN_VALUE;
            } else {
                c3143r0 = new C3143r0(this, continuationImpl);
            }
        } else {
            c3143r0 = new C3143r0(this, continuationImpl);
        }
        Object obj = c3143r0.f25214a;
        Object objF = sj.a.f();
        int i11 = c3143r0.f25216c;
        try {
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
                return obj;
            }
            kotlin.c.b(obj);
            C3227u9 c3227u9 = (C3227u9) He.f22810a.getValue();
            c3143r0.f25216c = 1;
            Object objA = c3227u9.f25449a.a(le2, c3143r0);
            return objA == objF ? objF : objA;
        } catch (CancellationException unused) {
            throw new Y(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new J6((short) 2206));
        }
    }
}
