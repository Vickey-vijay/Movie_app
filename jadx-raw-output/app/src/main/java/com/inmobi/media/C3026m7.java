package com.inmobi.media;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.m7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3026m7 extends Zf {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f24814h = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final wk.a f24815f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public kotlinx.coroutines.g f24816g;

    @Override // com.inmobi.media.Zf
    public final mj.r b() {
        nk.l0 l0Var = A9.f22352d;
        nk.j.d(l0Var, null, null, new C2902h7(this, null), 3, null);
        nk.j.d(l0Var, null, null, new C2927i7(this, null), 3, null);
        return mj.r.f64562a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3026m7(C3085og c3085og, E8 e10, Cif cif) {
        super(c3085og, e10, cif);
        ck.p.j(c3085og, "dao");
        ck.p.j(e10, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        ck.p.j(cif, "networkHandler");
        this.f24815f = wk.g.b(false, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0091  */
    /* JADX WARN: Code duplicated, block: B:37:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:44:0x00fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x00e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00d8 -> B:34:0x00da). Please report as a decompilation issue!!! */
    public final Object c(ContinuationImpl continuationImpl) throws Throwable {
        C2825e7 c2825e7;
        long j10;
        int i10;
        List listI0;
        C3026m7 c3026m7;
        C2825e7 c2825e8;
        long j11;
        Object obj;
        int i11;
        if (continuationImpl instanceof C2825e7) {
            c2825e7 = (C2825e7) continuationImpl;
            int i12 = c2825e7.f24302e;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c2825e7.f24302e = i12 - Integer.MIN_VALUE;
            } else {
                c2825e7 = new C2825e7(this, continuationImpl);
            }
        } else {
            c2825e7 = new C2825e7(this, continuationImpl);
        }
        Object obj2 = c2825e7.f24300c;
        Object objF = sj.a.f();
        int i13 = c2825e7.f24302e;
        if (i13 != 0) {
            if (i13 == 1) {
                i10 = c2825e7.f24299b;
                j10 = c2825e7.f24298a;
                kotlin.c.b(obj2);
            } else {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i14 = c2825e7.f24299b;
                long j12 = c2825e7.f24298a;
                kotlin.c.b(obj2);
                c3026m7 = this;
                c2825e8 = c2825e7;
                j11 = j12;
                obj = objF;
                i11 = i14;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : (Iterable) obj2) {
                if (!c3026m7.f23918e.containsKey(((Rf) obj3).f23453b)) {
                    arrayList.add(obj3);
                }
            }
            listI0 = nj.b0.I0(arrayList, i11);
            if (!listI0.isEmpty() || c3026m7.f23917d != Wf.STARTED) {
                return mj.r.f64562a;
            }
            ck.p.i("m7", "TAG");
            listI0.size();
            Iterator it = listI0.iterator();
            while (it.hasNext()) {
                nk.j.d(A9.f22352d, null, null, new C2877g7(c3026m7, (Rf) it.next(), null), 3, null);
            }
            C3085og c3085og = c3026m7.f23914a;
            c2825e8.f24298a = j11;
            c2825e8.f24299b = i11;
            c2825e8.f24302e = 2;
            C3026m7 c3026m8 = c3026m7;
            Object objA = c3085og.a(null, "high", j11, c2825e8);
            if (objA == obj) {
                return obj;
            }
            c3026m7 = c3026m8;
            obj2 = objA;
            ArrayList arrayList2 = new ArrayList();
            while (r1.hasNext()) {
                if (!c3026m7.f23918e.containsKey(((Rf) obj3).f23453b)) {
                    arrayList2.add(obj3);
                }
            }
            listI0 = nj.b0.I0(arrayList2, i11);
            if (!listI0.isEmpty()) {
            }
            return mj.r.f64562a;
        }
        kotlin.c.b(obj2);
        long jCurrentTimeMillis = System.currentTimeMillis();
        ck.p.i("m7", "TAG");
        int high = Zf.a().getMaxBatchSize().getHigh();
        C3085og c3085og2 = this.f23914a;
        Integer numD = tj.a.d(high);
        c2825e7.f24298a = jCurrentTimeMillis;
        c2825e7.f24299b = high;
        c2825e7.f24302e = 1;
        Object objA2 = c3085og2.a(numD, "high", jCurrentTimeMillis, c2825e7);
        if (objA2 == objF) {
            return objF;
        }
        j10 = jCurrentTimeMillis;
        i10 = high;
        obj2 = objA2;
        listI0 = (List) obj2;
        c3026m7 = this;
        c2825e8 = c2825e7;
        j11 = j10;
        obj = objF;
        i11 = i10;
        if (!listI0.isEmpty()) {
        }
        return mj.r.f64562a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(ContinuationImpl continuationImpl) throws Throwable {
        C2951j7 c2951j7;
        wk.a aVar;
        if (continuationImpl instanceof C2951j7) {
            c2951j7 = (C2951j7) continuationImpl;
            int i10 = c2951j7.f24595d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c2951j7.f24595d = i10 - Integer.MIN_VALUE;
            } else {
                c2951j7 = new C2951j7(this, continuationImpl);
            }
        } else {
            c2951j7 = new C2951j7(this, continuationImpl);
        }
        Object obj = c2951j7.f24593b;
        Object objF = sj.a.f();
        int i11 = c2951j7.f24595d;
        if (i11 == 0) {
            kotlin.c.b(obj);
            wk.a aVar2 = this.f24815f;
            c2951j7.f24592a = aVar2;
            c2951j7.f24595d = 1;
            if (aVar2.a(null, c2951j7) == objF) {
                return objF;
            }
            aVar = aVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = c2951j7.f24592a;
            kotlin.c.b(obj);
        }
        try {
            kotlinx.coroutines.g gVar = this.f24816g;
            if (gVar != null ? gVar.isActive() : false) {
                return mj.r.f64562a;
            }
            long high = Zf.a().getInterval().getHigh();
            if (high <= 0) {
                return mj.r.f64562a;
            }
            ck.p.i("m7", "TAG");
            nk.l0 l0Var = A9.f22352d;
            ik.i iVar = Se.f23518a;
            this.f24816g = F3.a(l0Var, 0L, ((long) 1000) * high, new C2976k7(this, null));
            return mj.r.f64562a;
        } finally {
            aVar.b(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(ContinuationImpl continuationImpl) {
        C3001l7 c3001l7;
        wk.a aVar;
        if (continuationImpl instanceof C3001l7) {
            c3001l7 = (C3001l7) continuationImpl;
            int i10 = c3001l7.f24752d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c3001l7.f24752d = i10 - Integer.MIN_VALUE;
            } else {
                c3001l7 = new C3001l7(this, continuationImpl);
            }
        } else {
            c3001l7 = new C3001l7(this, continuationImpl);
        }
        Object obj = c3001l7.f24750b;
        Object objF = sj.a.f();
        int i11 = c3001l7.f24752d;
        if (i11 == 0) {
            kotlin.c.b(obj);
            wk.a aVar2 = this.f24815f;
            c3001l7.f24749a = aVar2;
            c3001l7.f24752d = 1;
            if (aVar2.a(null, c3001l7) == objF) {
                return objF;
            }
            aVar = aVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = c3001l7.f24749a;
            kotlin.c.b(obj);
        }
        try {
            kotlinx.coroutines.g gVar = this.f24816g;
            if (gVar != null) {
                kotlinx.coroutines.g.a.a(gVar, null, 1, null);
            }
            this.f24816g = null;
            return mj.r.f64562a;
        } finally {
            aVar.b(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00b2 A[Catch: Error -> 0x0051, Exception -> 0x0054, TryCatch #2 {Error -> 0x0051, Exception -> 0x0054, blocks: (B:14:0x0039, B:59:0x00e8, B:19:0x0048, B:48:0x00bf, B:50:0x00c7, B:52:0x00d3, B:55:0x00e0, B:56:0x00e3, B:61:0x00eb, B:62:0x00f5, B:64:0x00fb, B:20:0x004d, B:43:0x00a9, B:45:0x00b2, B:27:0x0059, B:40:0x009a, B:30:0x0060, B:35:0x006e, B:37:0x0071), top: B:70:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00be  */
    /* JADX WARN: Code duplicated, block: B:48:0x00bf A[Catch: Error -> 0x0051, Exception -> 0x0054, PHI: r0 r4
  0x00bf: PHI (r0v21 java.lang.Object) = (r0v19 java.lang.Object), (r0v1 java.lang.Object) binds: [B:46:0x00bc, B:19:0x0048] A[DONT_GENERATE, DONT_INLINE]
  0x00bf: PHI (r4v8 java.util.List) = (r4v6 java.util.List), (r4v11 java.util.List) binds: [B:46:0x00bc, B:19:0x0048] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {Error -> 0x0051, Exception -> 0x0054, blocks: (B:14:0x0039, B:59:0x00e8, B:19:0x0048, B:48:0x00bf, B:50:0x00c7, B:52:0x00d3, B:55:0x00e0, B:56:0x00e3, B:61:0x00eb, B:62:0x00f5, B:64:0x00fb, B:20:0x004d, B:43:0x00a9, B:45:0x00b2, B:27:0x0059, B:40:0x009a, B:30:0x0060, B:35:0x006e, B:37:0x0071), top: B:70:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00c7 A[Catch: Error -> 0x0051, Exception -> 0x0054, TryCatch #2 {Error -> 0x0051, Exception -> 0x0054, blocks: (B:14:0x0039, B:59:0x00e8, B:19:0x0048, B:48:0x00bf, B:50:0x00c7, B:52:0x00d3, B:55:0x00e0, B:56:0x00e3, B:61:0x00eb, B:62:0x00f5, B:64:0x00fb, B:20:0x004d, B:43:0x00a9, B:45:0x00b2, B:27:0x0059, B:40:0x009a, B:30:0x0060, B:35:0x006e, B:37:0x0071), top: B:70:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00d3 A[Catch: Error -> 0x0051, Exception -> 0x0054, TryCatch #2 {Error -> 0x0051, Exception -> 0x0054, blocks: (B:14:0x0039, B:59:0x00e8, B:19:0x0048, B:48:0x00bf, B:50:0x00c7, B:52:0x00d3, B:55:0x00e0, B:56:0x00e3, B:61:0x00eb, B:62:0x00f5, B:64:0x00fb, B:20:0x004d, B:43:0x00a9, B:45:0x00b2, B:27:0x0059, B:40:0x009a, B:30:0x0060, B:35:0x006e, B:37:0x0071), top: B:70:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00df  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e0 A[Catch: Error -> 0x0051, Exception -> 0x0054, TryCatch #2 {Error -> 0x0051, Exception -> 0x0054, blocks: (B:14:0x0039, B:59:0x00e8, B:19:0x0048, B:48:0x00bf, B:50:0x00c7, B:52:0x00d3, B:55:0x00e0, B:56:0x00e3, B:61:0x00eb, B:62:0x00f5, B:64:0x00fb, B:20:0x004d, B:43:0x00a9, B:45:0x00b2, B:27:0x0059, B:40:0x009a, B:30:0x0060, B:35:0x006e, B:37:0x0071), top: B:70:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00e3 A[Catch: Error -> 0x0051, Exception -> 0x0054, TryCatch #2 {Error -> 0x0051, Exception -> 0x0054, blocks: (B:14:0x0039, B:59:0x00e8, B:19:0x0048, B:48:0x00bf, B:50:0x00c7, B:52:0x00d3, B:55:0x00e0, B:56:0x00e3, B:61:0x00eb, B:62:0x00f5, B:64:0x00fb, B:20:0x004d, B:43:0x00a9, B:45:0x00b2, B:27:0x0059, B:40:0x009a, B:30:0x0060, B:35:0x006e, B:37:0x0071), top: B:70:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:64:0x00fb A[Catch: Error -> 0x0051, Exception -> 0x0054, LOOP:0: B:62:0x00f5->B:64:0x00fb, LOOP_END, TRY_LEAVE, TryCatch #2 {Error -> 0x0051, Exception -> 0x0054, blocks: (B:14:0x0039, B:59:0x00e8, B:19:0x0048, B:48:0x00bf, B:50:0x00c7, B:52:0x00d3, B:55:0x00e0, B:56:0x00e3, B:61:0x00eb, B:62:0x00f5, B:64:0x00fb, B:20:0x004d, B:43:0x00a9, B:45:0x00b2, B:27:0x0059, B:40:0x009a, B:30:0x0060, B:35:0x006e, B:37:0x0071), top: B:70:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00e5, code lost:
    
        if (r0 == r3) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(kotlin.coroutines.jvm.internal.ContinuationImpl r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3026m7.b(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
