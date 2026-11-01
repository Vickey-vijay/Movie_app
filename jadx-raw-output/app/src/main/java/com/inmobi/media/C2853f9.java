package com.inmobi.media;

import android.database.sqlite.SQLiteDatabase;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.f9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2853f9 extends SuspendLambda implements bk.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SQLiteDatabase f24358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f24359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2879g9 f24360c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ SuspendLambda f24361d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2853f9(C2879g9 c2879g9, bk.p pVar, rj.c cVar) {
        super(1, cVar);
        this.f24360c = c2879g9;
        this.f24361d = (SuspendLambda) pVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [bk.p, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(rj.c cVar) {
        return new C2853f9(this.f24360c, this.f24361d, cVar);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [bk.p, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Override // bk.l
    public final Object invoke(Object obj) {
        return new C2853f9(this.f24360c, this.f24361d, (rj.c) obj).invokeSuspend(mj.r.f64562a);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0058  */
    /* JADX WARN: Type inference failed for: r3v0, types: [bk.p, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        SQLiteDatabase sQLiteDatabase;
        SQLiteDatabase sQLiteDatabase2;
        Object objF = sj.a.f();
        int i10 = this.f24359b;
        if (i10 != 0) {
            if (i10 == 1) {
                sQLiteDatabase2 = this.f24358a;
                try {
                    kotlin.c.b(obj);
                } catch (Throwable th2) {
                    th = th2;
                    sQLiteDatabase = sQLiteDatabase2;
                    if (sQLiteDatabase.inTransaction()) {
                        sQLiteDatabase.endTransaction();
                    }
                    throw th;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            C2879g9 c2879g9 = this.f24360c;
            sQLiteDatabase = c2879g9.f24418c;
            if (sQLiteDatabase != null) {
                ?? r10 = this.f24361d;
                if (c2879g9.f24417b.f24652c == 2) {
                    sQLiteDatabase.beginTransactionNonExclusive();
                } else {
                    sQLiteDatabase.beginTransaction();
                }
                try {
                    this.f24358a = sQLiteDatabase;
                    this.f24359b = 1;
                    if (r10.mo1invoke(c2879g9, this) == objF) {
                        return objF;
                    }
                    sQLiteDatabase2 = sQLiteDatabase;
                } catch (Throwable th3) {
                    th = th3;
                    if (sQLiteDatabase.inTransaction()) {
                        sQLiteDatabase.endTransaction();
                    }
                    throw th;
                }
            } else {
                return null;
            }
        }
        sQLiteDatabase2.setTransactionSuccessful();
        if (sQLiteDatabase2.inTransaction()) {
            sQLiteDatabase2.endTransaction();
        }
        return mj.r.f64562a;
    }
}
