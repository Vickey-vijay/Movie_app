package com.inmobi.media;

import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes7.dex */
public final class Y8 extends SuspendLambda implements bk.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2879g9 f23828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f23829b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y8(C2879g9 c2879g9, String str, rj.c cVar) {
        super(1, cVar);
        this.f23828a = c2879g9;
        this.f23829b = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(rj.c cVar) {
        return new Y8(this.f23828a, this.f23829b, cVar);
    }

    @Override // bk.l
    public final Object invoke(Object obj) {
        return new Y8(this.f23828a, this.f23829b, (rj.c) obj).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        SQLiteDatabase sQLiteDatabase = this.f23828a.f24419d;
        if (sQLiteDatabase == null) {
            return tj.a.d(0);
        }
        return tj.a.d((int) DatabaseUtils.longForQuery(sQLiteDatabase, this.f23829b, null));
    }
}
