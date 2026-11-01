package com.inmobi.media;

import android.content.ContentValues;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.og, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3085og {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2879g9 f24997a;

    /* JADX WARN: Code duplicated, block: B:18:0x004d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Integer num, String str, long j10, ContinuationImpl continuationImpl) throws Throwable {
        C3060ng c3060ng;
        String str2;
        if (continuationImpl instanceof C3060ng) {
            c3060ng = (C3060ng) continuationImpl;
            int i10 = c3060ng.f24902c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c3060ng.f24902c = i10 - Integer.MIN_VALUE;
            } else {
                c3060ng = new C3060ng(this, continuationImpl);
            }
        } else {
            c3060ng = new C3060ng(this, continuationImpl);
        }
        Object objA = c3060ng.f24900a;
        Object objF = sj.a.f();
        int i11 = c3060ng.f24902c;
        if (i11 == 0) {
            kotlin.c.b(objA);
            if (num != null) {
                str2 = " LIMIT " + num.intValue();
                if (str2 == null) {
                    str2 = "";
                }
            } else {
                str2 = "";
            }
            String str3 = "SELECT * FROM pings WHERE priority='" + str + "' AND retry_count=0 AND time_created<" + j10 + " ORDER BY time_created ASC" + str2;
            C2879g9 c2879g9 = this.f24997a;
            c3060ng.f24902c = 1;
            c2879g9.getClass();
            objA = c2879g9.a(new C2776c9(c2879g9, str3, null), c3060ng);
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
            arrayList.add(AbstractC3110pg.a((ContentValues) it.next()));
        }
        return arrayList;
    }

    public final Object b(String str, ContinuationImpl continuationImpl) {
        String str2 = "SELECT COUNT(*) FROM pings WHERE priority='" + str + "'";
        C2879g9 c2879g9 = this.f24997a;
        c2879g9.getClass();
        return c2879g9.a(new Y8(c2879g9, str2, null), continuationImpl);
    }

    public C3085og(C2879g9 c2879g9) {
        ck.p.j(c2879g9, "databaseHelper");
        this.f24997a = c2879g9;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0051  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, Integer num, ContinuationImpl continuationImpl) throws Throwable {
        C3035mg c3035mg;
        String str2;
        if (continuationImpl instanceof C3035mg) {
            c3035mg = (C3035mg) continuationImpl;
            int i10 = c3035mg.f24833c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c3035mg.f24833c = i10 - Integer.MIN_VALUE;
            } else {
                c3035mg = new C3035mg(this, continuationImpl);
            }
        } else {
            c3035mg = new C3035mg(this, continuationImpl);
        }
        Object objA = c3035mg.f24831a;
        Object objF = sj.a.f();
        int i11 = c3035mg.f24833c;
        if (i11 == 0) {
            kotlin.c.b(objA);
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (num != null) {
                str2 = " LIMIT " + num.intValue();
                if (str2 == null) {
                    str2 = "";
                }
            } else {
                str2 = "";
            }
            String str3 = "SELECT * FROM pings WHERE priority='" + str + "' AND retry_count>=1 AND retryAfter<=" + jCurrentTimeMillis + " ORDER BY time_created ASC" + str2;
            C2879g9 c2879g9 = this.f24997a;
            c3035mg.f24833c = 1;
            c2879g9.getClass();
            objA = c2879g9.a(new C2776c9(c2879g9, str3, null), c3035mg);
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
            arrayList.add(AbstractC3110pg.a((ContentValues) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0051  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, Integer num, ContinuationImpl continuationImpl) throws Throwable {
        C3010lg c3010lg;
        String str2;
        if (continuationImpl instanceof C3010lg) {
            c3010lg = (C3010lg) continuationImpl;
            int i10 = c3010lg.f24777c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c3010lg.f24777c = i10 - Integer.MIN_VALUE;
            } else {
                c3010lg = new C3010lg(this, continuationImpl);
            }
        } else {
            c3010lg = new C3010lg(this, continuationImpl);
        }
        Object objA = c3010lg.f24775a;
        Object objF = sj.a.f();
        int i11 = c3010lg.f24777c;
        if (i11 == 0) {
            kotlin.c.b(objA);
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (num != null) {
                str2 = " LIMIT " + num.intValue();
                if (str2 == null) {
                    str2 = "";
                }
            } else {
                str2 = "";
            }
            String str3 = "SELECT * FROM pings WHERE priority='" + str + "' AND retryAfter<=" + jCurrentTimeMillis + " ORDER BY time_created ASC" + str2;
            C2879g9 c2879g9 = this.f24997a;
            c3010lg.f24777c = 1;
            c2879g9.getClass();
            objA = c2879g9.a(new C2776c9(c2879g9, str3, null), c3010lg);
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
            arrayList.add(AbstractC3110pg.a((ContentValues) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, ContinuationImpl continuationImpl) throws Throwable {
        C2985kg c2985kg;
        if (continuationImpl instanceof C2985kg) {
            c2985kg = (C2985kg) continuationImpl;
            int i10 = c2985kg.f24681d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c2985kg.f24681d = i10 - Integer.MIN_VALUE;
            } else {
                c2985kg = new C2985kg(this, continuationImpl);
            }
        } else {
            c2985kg = new C2985kg(this, continuationImpl);
        }
        Object objA = c2985kg.f24679b;
        Object objF = sj.a.f();
        int i11 = c2985kg.f24681d;
        if (i11 == 0) {
            kotlin.c.b(objA);
            C2879g9 c2879g9 = this.f24997a;
            c2985kg.f24681d = 1;
            c2879g9.getClass();
            objA = c2879g9.a(new C2776c9(c2879g9, "SELECT * FROM pings WHERE priority='" + str + "' ORDER BY time_created ASC LIMIT 1", null), c2985kg);
            if (objA != objF) {
            }
            return objF;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Rf rf2 = c2985kg.f24678a;
            kotlin.c.b(objA);
            return rf2;
        }
        kotlin.c.b(objA);
        Iterable iterable = (Iterable) objA;
        ArrayList arrayList = new ArrayList(nj.t.v(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC3110pg.a((ContentValues) it.next()));
        }
        Rf rf3 = (Rf) nj.b0.h0(arrayList);
        if (rf3 != null) {
            C2879g9 c2879g10 = this.f24997a;
            String[] strArr = {rf3.f23453b};
            c2985kg.f24678a = rf3;
            c2985kg.f24681d = 2;
            if (c2879g10.a("pings", "id=?", strArr, c2985kg) == objF) {
                return objF;
            }
        }
        return rf3;
    }

    public final Object a(long j10, ContinuationImpl continuationImpl) {
        String strValueOf = String.valueOf(System.currentTimeMillis() - j10);
        Object objA = C2879g9.a(this.f24997a, "pings", "time_created<" + strValueOf, continuationImpl, 4);
        return objA == sj.a.f() ? objA : mj.r.f64562a;
    }
}
