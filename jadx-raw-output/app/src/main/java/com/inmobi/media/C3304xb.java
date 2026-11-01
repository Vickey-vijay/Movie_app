package com.inmobi.media;

import android.content.ContentValues;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.xb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3304xb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2879g9 f25715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference f25716b;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(C3130qb c3130qb, ContinuationImpl continuationImpl) throws Throwable {
        C3254vb c3254vb;
        if (continuationImpl instanceof C3254vb) {
            c3254vb = (C3254vb) continuationImpl;
            int i10 = c3254vb.f25563c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c3254vb.f25563c = i10 - Integer.MIN_VALUE;
            } else {
                c3254vb = new C3254vb(this, continuationImpl);
            }
        } else {
            c3254vb = new C3254vb(this, continuationImpl);
        }
        Object obj = c3254vb.f25561a;
        Object objF = sj.a.f();
        int i11 = c3254vb.f25563c;
        if (i11 == 0) {
            kotlin.c.b(obj);
            C2879g9 c2879g9 = this.f25715a;
            ContentValues contentValuesA = AbstractC3354zb.a(c3130qb);
            c3254vb.f25563c = 1;
            if (c2879g9.a("logs_v2", contentValuesA, 4, c3254vb) == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
        }
        WeakReference weakReference = this.f25716b;
        if (weakReference != null && ((C3078o9) weakReference.get()) != null) {
            C3078o9.a();
        }
        return mj.r.f64562a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(C3130qb c3130qb, ContinuationImpl continuationImpl) throws Throwable {
        C3279wb c3279wb;
        if (continuationImpl instanceof C3279wb) {
            c3279wb = (C3279wb) continuationImpl;
            int i10 = c3279wb.f25632c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c3279wb.f25632c = i10 - Integer.MIN_VALUE;
            } else {
                c3279wb = new C3279wb(this, continuationImpl);
            }
        } else {
            c3279wb = new C3279wb(this, continuationImpl);
        }
        C3279wb c3279wb2 = c3279wb;
        Object obj = c3279wb2.f25630a;
        Object objF = sj.a.f();
        int i11 = c3279wb2.f25632c;
        if (i11 == 0) {
            kotlin.c.b(obj);
            C2879g9 c2879g9 = this.f25715a;
            ContentValues contentValuesA = AbstractC3354zb.a(c3130qb);
            String[] strArr = {c3130qb.f25161a};
            c3279wb2.f25632c = 1;
            if (C2879g9.a(c2879g9, "logs_v2", contentValuesA, "filename=?", strArr, c3279wb2, 16) == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
        }
        WeakReference weakReference = this.f25716b;
        if (weakReference != null && ((C3078o9) weakReference.get()) != null) {
            C3078o9.a();
        }
        return mj.r.f64562a;
    }

    public C3304xb(C2879g9 c2879g9) {
        ck.p.j(c2879g9, "databaseHelper");
        this.f25715a = c2879g9;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ContinuationImpl continuationImpl) throws Throwable {
        C3179sb c3179sb;
        if (continuationImpl instanceof C3179sb) {
            c3179sb = (C3179sb) continuationImpl;
            int i10 = c3179sb.f25317c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c3179sb.f25317c = i10 - Integer.MIN_VALUE;
            } else {
                c3179sb = new C3179sb(this, continuationImpl);
            }
        } else {
            c3179sb = new C3179sb(this, continuationImpl);
        }
        Object objA = c3179sb.f25315a;
        Object objF = sj.a.f();
        int i11 = c3179sb.f25317c;
        if (i11 == 0) {
            kotlin.c.b(objA);
            C2879g9 c2879g9 = this.f25715a;
            c3179sb.f25317c = 1;
            c2879g9.getClass();
            objA = c2879g9.a(new C2776c9(c2879g9, "SELECT * FROM logs_v2 WHERE hasLoggerFinished=1", null), c3179sb);
            if (objA == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(objA);
        }
        Iterable iterable = (Iterable) objA;
        ArrayList arrayList = new ArrayList(nj.t.v(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC3354zb.a((ContentValues) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, ContinuationImpl continuationImpl) {
        C3229ub c3229ub;
        if (continuationImpl instanceof C3229ub) {
            c3229ub = (C3229ub) continuationImpl;
            int i10 = c3229ub.f25455c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c3229ub.f25455c = i10 - Integer.MIN_VALUE;
            } else {
                c3229ub = new C3229ub(this, continuationImpl);
            }
        } else {
            c3229ub = new C3229ub(this, continuationImpl);
        }
        Object objA = c3229ub.f25453a;
        Object objF = sj.a.f();
        int i11 = c3229ub.f25455c;
        if (i11 == 0) {
            kotlin.c.b(objA);
            C2879g9 c2879g9 = this.f25715a;
            c3229ub.f25455c = 1;
            c2879g9.getClass();
            objA = c2879g9.a(new Y8(c2879g9, "SELECT COUNT(*) FROM logs_v2 WHERE filename='" + str + "'", null), c3229ub);
            if (objA == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(objA);
        }
        return tj.a.a(((Number) objA).intValue() != 0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(ContinuationImpl continuationImpl) throws Throwable {
        C3204tb c3204tb;
        if (continuationImpl instanceof C3204tb) {
            c3204tb = (C3204tb) continuationImpl;
            int i10 = c3204tb.f25383c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c3204tb.f25383c = i10 - Integer.MIN_VALUE;
            } else {
                c3204tb = new C3204tb(this, continuationImpl);
            }
        } else {
            c3204tb = new C3204tb(this, continuationImpl);
        }
        Object objA = c3204tb.f25381a;
        Object objF = sj.a.f();
        int i11 = c3204tb.f25383c;
        if (i11 == 0) {
            kotlin.c.b(objA);
            C2879g9 c2879g9 = this.f25715a;
            c3204tb.f25383c = 1;
            c2879g9.getClass();
            objA = c2879g9.a(new C2776c9(c2879g9, "SELECT * FROM logs_v2 WHERE hasLoggerFinished=0", null), c3204tb);
            if (objA == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(objA);
        }
        Iterable iterable = (Iterable) objA;
        ArrayList arrayList = new ArrayList(nj.t.v(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC3354zb.a((ContentValues) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(long j10, int i10, ContinuationImpl continuationImpl) throws Throwable {
        C3154rb c3154rb;
        if (continuationImpl instanceof C3154rb) {
            c3154rb = (C3154rb) continuationImpl;
            int i11 = c3154rb.f25258c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c3154rb.f25258c = i11 - Integer.MIN_VALUE;
            } else {
                c3154rb = new C3154rb(this, continuationImpl);
            }
        } else {
            c3154rb = new C3154rb(this, continuationImpl);
        }
        Object objA = c3154rb.f25256a;
        Object objF = sj.a.f();
        int i12 = c3154rb.f25258c;
        if (i12 == 0) {
            kotlin.c.b(objA);
            C2879g9 c2879g9 = this.f25715a;
            c3154rb.f25258c = 1;
            c2879g9.getClass();
            objA = c2879g9.a(new C2776c9(c2879g9, "SELECT * FROM logs_v2 WHERE id NOT IN (SELECT id FROM ( SELECT id FROM logs_v2 WHERE saveTimestamp > " + j10 + " ORDER BY saveTimestamp DESC LIMIT " + i10 + ") AS recent_logs);", null), c3154rb);
            if (objA == objF) {
                return objF;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(objA);
        }
        Iterable iterable = (Iterable) objA;
        ArrayList arrayList = new ArrayList(nj.t.v(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC3354zb.a((ContentValues) it.next()));
        }
        return arrayList;
    }

    public final Object a(String str, ContinuationImpl continuationImpl) {
        Object objA = C2879g9.a(this.f25715a, "logs_v2", "filename='" + str + "'", continuationImpl, 4);
        return objA == sj.a.f() ? objA : mj.r.f64562a;
    }
}
