package com.inmobi.media;

import android.database.sqlite.SQLiteDatabase;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes8.dex */
public final class Z8 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f23896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f23897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f23898c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String[] f23899d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z8(String str, String str2, String[] strArr, rj.c cVar) {
        super(2, cVar);
        this.f23897b = str;
        this.f23898c = str2;
        this.f23899d = strArr;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        Z8 z10 = new Z8(this.f23897b, this.f23898c, this.f23899d, cVar);
        z10.f23896a = obj;
        return z10;
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return ((Z8) create((C2879g9) obj, (rj.c) obj2)).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        SQLiteDatabase sQLiteDatabase = ((C2879g9) this.f23896a).f24418c;
        if (sQLiteDatabase != null) {
            tj.a.d(sQLiteDatabase.delete(this.f23897b, this.f23898c, this.f23899d));
        }
        return mj.r.f64562a;
    }
}
