package com.inmobi.media;

import android.content.ContentValues;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes6.dex */
public final class N9 extends AbstractC2799d6 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C2879g9 f23223c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N9(C2879g9 c2879g9) {
        super("crash", c2879g9);
        ck.p.j(c2879g9, "databaseHelper");
        this.f23223c = c2879g9;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.inmobi.media.AbstractC2799d6
    public final Object b(int i10, ContinuationImpl continuationImpl) throws Throwable {
        M9 m10;
        if (continuationImpl instanceof M9) {
            m10 = (M9) continuationImpl;
            int i11 = m10.f23153c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                m10.f23153c = i11 - Integer.MIN_VALUE;
            } else {
                m10 = new M9(this, continuationImpl);
            }
        } else {
            m10 = new M9(this, continuationImpl);
        }
        Object objA = m10.f23151a;
        Object objF = sj.a.f();
        int i12 = m10.f23153c;
        if (i12 == 0) {
            kotlin.c.b(objA);
            C2879g9 c2879g9 = this.f23223c;
            m10.f23153c = 1;
            c2879g9.getClass();
            objA = c2879g9.a(new C2776c9(c2879g9, "SELECT * FROM crash ORDER BY ts ASC LIMIT " + i10, null), m10);
            if (objA == objF) {
                return objF;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(objA);
        }
        List<ContentValues> list = (List) objA;
        ArrayList arrayList = new ArrayList(nj.t.v(list, 10));
        for (ContentValues contentValues : list) {
            ck.p.j(contentValues, "contentValues");
            String asString = contentValues.getAsString("eventId");
            String asString2 = contentValues.getAsString("eventType");
            String asString3 = contentValues.getAsString("componentType");
            String asString4 = contentValues.getAsString("payload");
            String asString5 = contentValues.getAsString("ts");
            ck.p.i(asString5, "getAsString(...)");
            long j10 = Long.parseLong(asString5);
            ck.p.g(asString);
            ck.p.g(asString3);
            ck.p.g(asString2);
            Q9 q10 = new Q9(asString, asString3, asString2, asString4);
            q10.f24530c = j10;
            Integer asInteger = contentValues.getAsInteger("id");
            ck.p.i(asInteger, "getAsInteger(...)");
            q10.f24531d = asInteger.intValue();
            arrayList.add(q10);
        }
        return arrayList;
    }
}
