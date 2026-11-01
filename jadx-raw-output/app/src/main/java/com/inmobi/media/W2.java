package com.inmobi.media;

import android.content.ContentValues;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class W2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2879g9 f23722a;

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(int i10, int i11, ContinuationImpl continuationImpl) throws Throwable {
        T2 t10;
        if (continuationImpl instanceof T2) {
            t10 = (T2) continuationImpl;
            int i12 = t10.f23550c;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                t10.f23550c = i12 - Integer.MIN_VALUE;
            } else {
                t10 = new T2(this, continuationImpl);
            }
        } else {
            t10 = new T2(this, continuationImpl);
        }
        Object objA = t10.f23548a;
        Object objF = sj.a.f();
        int i13 = t10.f23550c;
        if (i13 == 0) {
            kotlin.c.b(objA);
            String str = "SELECT * FROM click WHERE ts < " + (System.currentTimeMillis() - ((long) i11)) + " ORDER BY ts ASC LIMIT " + i10;
            C2879g9 c2879g9 = this.f23722a;
            t10.f23550c = 1;
            c2879g9.getClass();
            objA = c2879g9.a(new C2776c9(c2879g9, str, null), t10);
            if (objA == objF) {
                return objF;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(objA);
        }
        Iterable<ContentValues> iterable = (Iterable) objA;
        ArrayList arrayList = new ArrayList(nj.t.v(iterable, 10));
        for (ContentValues contentValues : iterable) {
            ck.p.j(contentValues, "<this>");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String asString = contentValues.getAsString("track_extras");
            if (asString != null) {
                try {
                    JSONObject jSONObject = new JSONObject(asString);
                    ck.p.j(jSONObject, "<this>");
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        Object obj = jSONObject.get(next);
                        ck.p.h(obj, "null cannot be cast to non-null type kotlin.String");
                        linkedHashMap2.put(next, (String) obj);
                    }
                    linkedHashMap.putAll(linkedHashMap2);
                } catch (Exception unused) {
                }
            }
            Integer asInteger = contentValues.getAsInteger("id");
            ck.p.i(asInteger, "getAsInteger(...)");
            int iIntValue = asInteger.intValue();
            String asString2 = contentValues.getAsString("url");
            ck.p.i(asString2, "getAsString(...)");
            Boolean asBoolean = contentValues.getAsBoolean("follow_redirect");
            ck.p.i(asBoolean, "getAsBoolean(...)");
            boolean zBooleanValue = asBoolean.booleanValue();
            Boolean asBoolean2 = contentValues.getAsBoolean("ping_in_webview");
            ck.p.i(asBoolean2, "getAsBoolean(...)");
            boolean zBooleanValue2 = asBoolean2.booleanValue();
            Integer asInteger2 = contentValues.getAsInteger("pending_attempts");
            ck.p.i(asInteger2, "getAsInteger(...)");
            int iIntValue2 = asInteger2.intValue();
            Long asLong = contentValues.getAsLong("ts");
            ck.p.i(asLong, "getAsLong(...)");
            long jLongValue = asLong.longValue();
            Long asLong2 = contentValues.getAsLong("created_ts");
            ck.p.i(asLong2, "getAsLong(...)");
            arrayList.add(new S2(iIntValue, asString2, linkedHashMap, zBooleanValue, zBooleanValue2, iIntValue2, jLongValue, asLong2.longValue()));
        }
        return arrayList;
    }

    public W2(C2879g9 c2879g9) {
        ck.p.j(c2879g9, "databaseHelper");
        this.f23722a = c2879g9;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ContinuationImpl continuationImpl) throws Throwable {
        U2 u10;
        if (continuationImpl instanceof U2) {
            u10 = (U2) continuationImpl;
            int i10 = u10.f23611c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                u10.f23611c = i10 - Integer.MIN_VALUE;
            } else {
                u10 = new U2(this, continuationImpl);
            }
        } else {
            u10 = new U2(this, continuationImpl);
        }
        Object objA = u10.f23609a;
        Object objF = sj.a.f();
        int i11 = u10.f23611c;
        if (i11 == 0) {
            kotlin.c.b(objA);
            C2879g9 c2879g9 = this.f23722a;
            u10.f23611c = 1;
            c2879g9.getClass();
            objA = c2879g9.a(new Y8(c2879g9, "SELECT COUNT(*) FROM click", null), u10);
            if (objA == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(objA);
        }
        return tj.a.a(((Number) objA).intValue() != 0);
    }
}
