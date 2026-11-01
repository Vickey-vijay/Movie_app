package com.inmobi.media;

import android.database.sqlite.SQLiteDatabase;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.a9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C2724a9 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f23968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f23969b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2724a9(String str, rj.c cVar) {
        super(2, cVar);
        this.f23969b = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        C2724a9 c2724a9 = new C2724a9(this.f23969b, cVar);
        c2724a9.f23968a = obj;
        return c2724a9;
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        C2724a9 c2724a9 = new C2724a9(this.f23969b, (rj.c) obj2);
        c2724a9.f23968a = (C2879g9) obj;
        return c2724a9.invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        SQLiteDatabase sQLiteDatabase = ((C2879g9) this.f23968a).f24418c;
        if (sQLiteDatabase != null) {
            sQLiteDatabase.execSQL(this.f23969b);
        }
        return mj.r.f64562a;
    }
}
