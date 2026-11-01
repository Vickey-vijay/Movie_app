package com.inmobi.media;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.g9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C2879g9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3302x9 f24416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2974k5 f24417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SQLiteDatabase f24418c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SQLiteDatabase f24419d;

    public final Object a(String str, ContentValues contentValues, int i10, ContinuationImpl continuationImpl) {
        Object objA = a(new C2853f9(this, new C2802d9(str, contentValues, i10, null), null), continuationImpl);
        return objA == sj.a.f() ? objA : mj.r.f64562a;
    }

    public C2879g9(C3302x9 c3302x9, C2974k5 c2974k5) {
        ck.p.j(c3302x9, "sqLiteOpenHelper");
        ck.p.j(c2974k5, "databaseConfig");
        this.f24416a = c3302x9;
        this.f24417b = c2974k5;
    }

    public static Object a(C2879g9 c2879g9, String str, ContentValues contentValues, String str2, String[] strArr, ContinuationImpl continuationImpl, int i10) throws Throwable {
        String str3 = (i10 & 4) != 0 ? null : str2;
        String[] strArr2 = (i10 & 8) != 0 ? null : strArr;
        c2879g9.getClass();
        Object objA = c2879g9.a(new C2853f9(c2879g9, new C2827e9(str, contentValues, str3, strArr2, null), null), continuationImpl);
        return objA == sj.a.f() ? objA : mj.r.f64562a;
    }

    public static /* synthetic */ Object a(C2879g9 c2879g9, String str, String str2, ContinuationImpl continuationImpl, int i10) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return c2879g9.a(str, str2, (String[]) null, continuationImpl);
    }

    public final Object a(String str, String str2, String[] strArr, rj.c cVar) throws Throwable {
        Object objA = a(new C2853f9(this, new Z8(str, str2, strArr, null), null), cVar);
        return objA == sj.a.f() ? objA : mj.r.f64562a;
    }

    public final Object a(String str, ContinuationImpl continuationImpl) throws Throwable {
        Object objA = a(new C2853f9(this, new C2724a9(str, null), null), continuationImpl);
        return objA == sj.a.f() ? objA : mj.r.f64562a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(bk.l lVar, rj.c cVar) throws Throwable {
        C2750b9 c2750b9;
        if (cVar instanceof C2750b9) {
            c2750b9 = (C2750b9) cVar;
            int i10 = c2750b9.f24051d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c2750b9.f24051d = i10 - Integer.MIN_VALUE;
            } else {
                c2750b9 = new C2750b9(this, cVar);
            }
        } else {
            c2750b9 = new C2750b9(this, cVar);
        }
        Object obj = c2750b9.f24049b;
        Object objF = sj.a.f();
        int i11 = c2750b9.f24051d;
        if (i11 == 0) {
            kotlin.c.b(obj);
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
                return obj;
            }
            lVar = c2750b9.f24048a;
            kotlin.c.b(obj);
            if (obj != null) {
                return obj;
            }
        }
        c2750b9.f24048a = null;
        c2750b9.f24051d = 2;
        Object objInvoke = lVar.invoke(c2750b9);
        return objInvoke == objF ? objF : objInvoke;
    }
}
