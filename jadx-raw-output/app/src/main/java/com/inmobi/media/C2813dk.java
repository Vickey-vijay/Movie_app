package com.inmobi.media;

import android.content.ContentValues;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.dk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2813dk extends AbstractC2799d6 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C2879g9 f24258c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2813dk(C2879g9 c2879g9) {
        super("telemetry", c2879g9);
        ck.p.j(c2879g9, "databaseHelper");
        this.f24258c = c2879g9;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.inmobi.media.AbstractC2799d6
    public final Object b(int i10, ContinuationImpl continuationImpl) {
        C2787ck c2787ck;
        if (continuationImpl instanceof C2787ck) {
            c2787ck = (C2787ck) continuationImpl;
            int i11 = c2787ck.f24200c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c2787ck.f24200c = i11 - Integer.MIN_VALUE;
            } else {
                c2787ck = new C2787ck(this, continuationImpl);
            }
        } else {
            c2787ck = new C2787ck(this, continuationImpl);
        }
        Object objA = c2787ck.f24198a;
        Object objF = sj.a.f();
        int i12 = c2787ck.f24200c;
        if (i12 == 0) {
            kotlin.c.b(objA);
            C2879g9 c2879g9 = this.f24258c;
            c2787ck.f24200c = 1;
            c2879g9.getClass();
            objA = c2879g9.a(new C2776c9(c2879g9, "SELECT * FROM telemetry ORDER BY ts ASC LIMIT " + i10, null), c2787ck);
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
            String asString = contentValues.getAsString("eventType");
            String asString2 = contentValues.getAsString("payload");
            String asString3 = contentValues.getAsString("eventSource");
            String asString4 = contentValues.getAsString("ts");
            ck.p.i(asString4, "getAsString(...)");
            long j10 = Long.parseLong(asString4);
            ck.p.g(asString);
            ck.p.g(asString3);
            C2838ek c2838ek = new C2838ek(asString, asString2, asString3);
            c2838ek.f24530c = j10;
            Integer asInteger = contentValues.getAsInteger("id");
            ck.p.i(asInteger, "getAsInteger(...)");
            c2838ek.f24531d = asInteger.intValue();
            arrayList.add(c2838ek);
        }
        return arrayList;
    }
}
