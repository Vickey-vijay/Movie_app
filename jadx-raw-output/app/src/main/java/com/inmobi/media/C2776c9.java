package com.inmobi.media;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.c9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2776c9 extends SuspendLambda implements bk.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2879g9 f24126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f24127b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2776c9(C2879g9 c2879g9, String str, rj.c cVar) {
        super(1, cVar);
        this.f24126a = c2879g9;
        this.f24127b = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(rj.c cVar) {
        return new C2776c9(this.f24126a, this.f24127b, cVar);
    }

    @Override // bk.l
    public final Object invoke(Object obj) {
        return new C2776c9(this.f24126a, this.f24127b, (rj.c) obj).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        SQLiteDatabase sQLiteDatabase = this.f24126a.f24419d;
        if (sQLiteDatabase == null) {
            return nj.s.k();
        }
        ArrayList arrayList = new ArrayList();
        try {
            Cursor cursorRawQuery = sQLiteDatabase.rawQuery(this.f24127b, null);
            try {
                if (cursorRawQuery.moveToFirst()) {
                    do {
                        ContentValues contentValues = new ContentValues();
                        DatabaseUtils.cursorRowToContentValues(cursorRawQuery, contentValues);
                        arrayList.add(contentValues);
                    } while (cursorRawQuery.moveToNext());
                }
                mj.r rVar = mj.r.f64562a;
                yj.b.a(cursorRawQuery, null);
                return arrayList;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    yj.b.a(cursorRawQuery, th2);
                    throw th3;
                }
            }
        } catch (Exception unused) {
            return arrayList;
        }
    }
}
