package com.inmobi.unifiedId;

import androidx.annotation.VisibleForTesting;
import ck.p;
import com.inmobi.ads.exceptions.SdkNotInitializedException;
import com.inmobi.media.A9;
import com.inmobi.media.F9;
import com.inmobi.media.G9;
import com.inmobi.media.I9;
import com.inmobi.media.Ji;
import com.inmobi.media.Jk;
import com.inmobi.media.K9;
import com.inmobi.media.Ok;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import mj.r;
import nk.j;
import org.json.JSONObject;
import rj.c;
import wk.a;
import wk.g;

/* JADX INFO: loaded from: classes5.dex */
public final class InMobiUnifiedIdService {
    public static final InMobiUnifiedIdService INSTANCE = new InMobiUnifiedIdService();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f25880a = new AtomicBoolean();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f25881b = g.b(false, 1, null);

    public static final Object a(InMobiUnifiedIdInterface inMobiUnifiedIdInterface, c cVar) {
        p.i("InMobiUnifiedIdService", "TAG");
        JSONObject jSONObjectB = F9.b();
        if (!Ok.b(jSONObjectB) && jSONObjectB != null && Ok.c(jSONObjectB)) {
            Object objA = Jk.a(inMobiUnifiedIdInterface, cVar);
            return objA == sj.a.f() ? objA : r.f64562a;
        }
        if (inMobiUnifiedIdInterface != null) {
            if (!Ok.b(jSONObjectB)) {
                Ok.a(inMobiUnifiedIdInterface, jSONObjectB, null);
            } else {
                if (f25880a.get()) {
                    Object objA2 = Jk.a(inMobiUnifiedIdInterface, cVar);
                    return objA2 == sj.a.f() ? objA2 : r.f64562a;
                }
                Ok.a(inMobiUnifiedIdInterface, null, new Error(InMobiUnifiedIdInterface.PUSH_NEEDS_TO_BE_CALLED_FIRST));
            }
        }
        return r.f64562a;
    }

    @VisibleForTesting(otherwise = 5)
    public static /* synthetic */ void isPushCalled$annotations() {
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006a, code lost:
    
        if (r7 == r1) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object access$resetInternal(rj.c r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof com.inmobi.media.L9
            if (r0 == 0) goto L13
            r0 = r7
            com.inmobi.media.L9 r0 = (com.inmobi.media.L9) r0
            int r1 = r0.f23066b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23066b = r1
            goto L18
        L13:
            com.inmobi.media.L9 r0 = new com.inmobi.media.L9
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f23065a
            java.lang.Object r1 = sj.a.f()
            int r2 = r0.f23066b
            r3 = 2
            r4 = 1
            r5 = 0
            r6 = 0
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            kotlin.c.b(r7)
            goto L6d
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L36:
            kotlin.c.b(r7)
            goto L52
        L3a:
            kotlin.c.b(r7)
            java.lang.String r7 = "InMobiUnifiedIdService"
            java.lang.String r2 = "TAG"
            ck.p.i(r7, r2)
            java.util.concurrent.atomic.AtomicBoolean r7 = com.inmobi.unifiedId.InMobiUnifiedIdService.f25880a
            r7.set(r5)
            r0.f23066b = r4
            java.lang.Object r7 = com.inmobi.media.C2722a7.a(r6, r0)
            if (r7 != r1) goto L52
            goto L6c
        L52:
            com.inmobi.media.Jk r7 = com.inmobi.media.Jk.f22960a
            r0.f23066b = r3
            com.inmobi.media.qh r7 = com.inmobi.media.Jk.f22961b
            com.inmobi.media.Ik r2 = new com.inmobi.media.Ik
            r2.<init>(r6)
            java.lang.Object r7 = com.inmobi.media.F3.a(r7, r2, r0)
            java.lang.Object r0 = sj.a.f()
            if (r7 != r0) goto L68
            goto L6a
        L68:
            mj.r r7 = mj.r.f64562a
        L6a:
            if (r7 != r1) goto L6d
        L6c:
            return r1
        L6d:
            com.inmobi.media.F9.b(r6)
            com.inmobi.media.F9.a(r6)
            com.inmobi.media.F9.f22628d = r5
            com.inmobi.media.F9.f22627c = r5
            mj.r r7 = mj.r.f64562a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.unifiedId.InMobiUnifiedIdService.access$resetInternal(rj.c):java.lang.Object");
    }

    public static final void fetchUnifiedIds(InMobiUnifiedIdInterface inMobiUnifiedIdInterface) {
        p.i("InMobiUnifiedIdService", "TAG");
        if (Ji.d()) {
            j.d(A9.f22351c, null, null, new G9(inMobiUnifiedIdInterface, null), 3, null);
        } else {
            p.i("InMobiUnifiedIdService", "TAG");
            throw new SdkNotInitializedException("InMobiUnifiedIdService");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x012a, code lost:
    
        if (a(r12, r0) == r1) goto L68;
     */
    @androidx.annotation.WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object fetchUnifiedIdsInternal$media_release(com.inmobi.unifiedId.InMobiUnifiedIdInterface r12, rj.c<? super mj.r> r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.unifiedId.InMobiUnifiedIdService.fetchUnifiedIdsInternal$media_release(com.inmobi.unifiedId.InMobiUnifiedIdInterface, rj.c):java.lang.Object");
    }

    public static final void push(InMobiUserDataModel inMobiUserDataModel) {
        p.i("InMobiUnifiedIdService", "TAG");
        Objects.toString(inMobiUserDataModel);
        if (Ji.d()) {
            j.d(A9.f22351c, null, null, new I9(inMobiUserDataModel, null), 3, null);
        } else {
            p.i("InMobiUnifiedIdService", "TAG");
            throw new SdkNotInitializedException("InMobiUnifiedIdService");
        }
    }

    public static final void reset() {
        p.i("InMobiUnifiedIdService", "TAG");
        if (Ji.d()) {
            j.d(A9.f22351c, null, null, new K9(null), 3, null);
        } else {
            p.i("InMobiUnifiedIdService", "TAG");
            throw new SdkNotInitializedException("InMobiUnifiedIdService");
        }
    }

    public final AtomicBoolean isPushCalled() {
        return f25880a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f3, code lost:
    
        if (r9.a((kotlin.coroutines.jvm.internal.ContinuationImpl) r0) == r1) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(com.inmobi.unifiedId.InMobiUserDataModel r9, rj.c r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.unifiedId.InMobiUnifiedIdService.a(com.inmobi.unifiedId.InMobiUserDataModel, rj.c):java.lang.Object");
    }
}
