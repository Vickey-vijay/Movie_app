package com.inmobi.media;

import android.content.ContentValues;

/* JADX INFO: renamed from: com.inmobi.media.zb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC3354zb {
    public static final ContentValues a(C3130qb c3130qb) {
        ck.p.j(c3130qb, "<this>");
        ContentValues contentValues = new ContentValues();
        contentValues.put("filename", c3130qb.f25161a);
        contentValues.put("saveTimestamp", Long.valueOf(c3130qb.f25162b));
        contentValues.put("retryCount", Integer.valueOf(c3130qb.f25163c));
        contentValues.put("lastRetryTimestamp", Long.valueOf(c3130qb.f25164d));
        contentValues.put("checkpoints", Integer.valueOf(c3130qb.f25166f));
        contentValues.put("hasLoggerFinished", Integer.valueOf(c3130qb.f25165e ? 1 : 0));
        return contentValues;
    }

    public static final C3130qb a(ContentValues contentValues) {
        ck.p.j(contentValues, "<this>");
        String asString = contentValues.getAsString("filename");
        ck.p.i(asString, "getAsString(...)");
        Long asLong = contentValues.getAsLong("saveTimestamp");
        ck.p.i(asLong, "getAsLong(...)");
        long jLongValue = asLong.longValue();
        Integer asInteger = contentValues.getAsInteger("retryCount");
        ck.p.i(asInteger, "getAsInteger(...)");
        int iIntValue = asInteger.intValue();
        Long asLong2 = contentValues.getAsLong("lastRetryTimestamp");
        ck.p.i(asLong2, "getAsLong(...)");
        long jLongValue2 = asLong2.longValue();
        Integer asInteger2 = contentValues.getAsInteger("checkpoints");
        ck.p.i(asInteger2, "getAsInteger(...)");
        int iIntValue2 = asInteger2.intValue();
        Integer asInteger3 = contentValues.getAsInteger("hasLoggerFinished");
        return new C3130qb(asString, jLongValue, iIntValue, jLongValue2, asInteger3 != null && asInteger3.intValue() == 1, iIntValue2);
    }
}
