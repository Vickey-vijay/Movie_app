package com.inmobi.media;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.e9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2827e9 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f24303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f24304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ContentValues f24305c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f24306d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String[] f24307e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2827e9(String str, ContentValues contentValues, String str2, String[] strArr, rj.c cVar) {
        super(2, cVar);
        this.f24304b = str;
        this.f24305c = contentValues;
        this.f24306d = str2;
        this.f24307e = strArr;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        C2827e9 c2827e9 = new C2827e9(this.f24304b, this.f24305c, this.f24306d, this.f24307e, cVar);
        c2827e9.f24303a = obj;
        return c2827e9;
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return ((C2827e9) create((C2879g9) obj, (rj.c) obj2)).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        SQLiteDatabase sQLiteDatabase = ((C2879g9) this.f24303a).f24418c;
        if (sQLiteDatabase != null) {
            tj.a.d(sQLiteDatabase.updateWithOnConflict(this.f24304b, this.f24305c, this.f24306d, this.f24307e, 4));
        }
        return mj.r.f64562a;
    }
}
