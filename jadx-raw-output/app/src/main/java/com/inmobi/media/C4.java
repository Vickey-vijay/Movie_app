package com.inmobi.media;

import android.content.ContentValues;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes6.dex */
public final class C4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2879g9 f22449a;

    public final Object a(int i10, long j10, J4 j11) throws Throwable {
        Object objA = this.f22449a.a("DELETE FROM c_data WHERE id NOT IN (SELECT id FROM (SELECT id FROM c_data WHERE timestamp > " + j10 + " ORDER BY timestamp DESC LIMIT " + i10 + ") foo);", j11);
        return objA == sj.a.f() ? objA : mj.r.f64562a;
    }

    public C4(C2879g9 c2879g9) {
        ck.p.j(c2879g9, "databaseHelper");
        this.f22449a = c2879g9;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ContinuationImpl continuationImpl) throws Throwable {
        A4 a10;
        if (continuationImpl instanceof A4) {
            a10 = (A4) continuationImpl;
            int i10 = a10.f22344c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                a10.f22344c = i10 - Integer.MIN_VALUE;
            } else {
                a10 = new A4(this, continuationImpl);
            }
        } else {
            a10 = new A4(this, continuationImpl);
        }
        Object objA = a10.f22342a;
        Object objF = sj.a.f();
        int i11 = a10.f22344c;
        if (i11 == 0) {
            kotlin.c.b(objA);
            C2879g9 c2879g9 = this.f22449a;
            a10.f22344c = 1;
            c2879g9.getClass();
            objA = c2879g9.a(new C2776c9(c2879g9, "SELECT * FROM c_data", null), a10);
            if (objA == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(objA);
        }
        Iterable<ContentValues> iterable = (Iterable) objA;
        ArrayList arrayList = new ArrayList(nj.t.v(iterable, 10));
        for (ContentValues contentValues : iterable) {
            ck.p.j(contentValues, "<this>");
            String asString = contentValues.getAsString("e_data");
            ck.p.i(asString, "getAsString(...)");
            Long asLong = contentValues.getAsLong("timestamp");
            ck.p.i(asLong, "getAsLong(...)");
            arrayList.add(new W5(asString, asLong.longValue()));
        }
        return arrayList;
    }
}
