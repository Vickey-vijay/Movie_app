package com.inmobi.media;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.d9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2802d9 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f24226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f24227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ContentValues f24228c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f24229d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2802d9(String str, ContentValues contentValues, int i10, rj.c cVar) {
        super(2, cVar);
        this.f24227b = str;
        this.f24228c = contentValues;
        this.f24229d = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        C2802d9 c2802d9 = new C2802d9(this.f24227b, this.f24228c, this.f24229d, cVar);
        c2802d9.f24226a = obj;
        return c2802d9;
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return ((C2802d9) create((C2879g9) obj, (rj.c) obj2)).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        SQLiteDatabase sQLiteDatabase = ((C2879g9) this.f24226a).f24418c;
        if (sQLiteDatabase != null) {
            tj.a.e(sQLiteDatabase.insertWithOnConflict(this.f24227b, null, this.f24228c, this.f24229d));
        }
        return mj.r.f64562a;
    }
}
