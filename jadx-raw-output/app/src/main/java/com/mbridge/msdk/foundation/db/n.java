package com.mbridge.msdk.foundation.db;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.ironsource.C3426d4;
import com.ironsource.G5;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.o;
import com.mbridge.msdk.foundation.tools.a1;
import com.mbridge.msdk.foundation.tools.q0;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: VideoReportDataDao.java */
/* JADX INFO: loaded from: classes10.dex */
public class n extends a<com.mbridge.msdk.foundation.entity.n> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f34677a = "com.mbridge.msdk.foundation.db.n";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static n f34678b;

    public static n a(f fVar) {
        if (f34678b == null) {
            synchronized (n.class) {
                if (f34678b == null) {
                    f34678b = new n(fVar);
                }
            }
        }
        return f34678b;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0024 A[EXC_TOP_SPLITTER, PHI: r0 r1
  0x0024: PHI (r0v4 android.database.Cursor) = (r0v3 android.database.Cursor), (r0v5 android.database.Cursor) binds: [B:15:0x0022, B:9:0x0019] A[DONT_GENERATE, DONT_INLINE]
  0x0024: PHI (r1v3 int) = (r1v0 int), (r1v5 int) binds: [B:15:0x0022, B:9:0x0019] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    public synchronized int d() {
        int i10;
        Cursor cursorRawQuery = null;
        i10 = 0;
        try {
            try {
                cursorRawQuery = getReadableDatabase().rawQuery("select count(*) from reward_report", null);
                if (cursorRawQuery != null && cursorRawQuery.moveToFirst()) {
                    i10 = cursorRawQuery.getInt(0);
                }
                if (cursorRawQuery != null) {
                    try {
                        cursorRawQuery.close();
                    } catch (Exception unused) {
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
            }
        } catch (Throwable th2) {
            if (cursorRawQuery != null) {
                try {
                    cursorRawQuery.close();
                } catch (Exception unused2) {
                }
            }
            throw th2;
        }
        return i10;
    }

    private n(f fVar) {
        super(fVar);
    }

    /* JADX WARN: Code duplicated, block: B:115:0x0349 A[EXC_TOP_SPLITTER, PHI: r13
  0x0349: PHI (r13v3 android.database.Cursor) = (r13v2 android.database.Cursor), (r13v15 android.database.Cursor) binds: [B:98:0x0347, B:92:0x0334] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x0351 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:0x02dc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x02e2  */
    public synchronized List<com.mbridge.msdk.foundation.entity.n> a(String str) {
        Cursor cursor;
        Cursor cursorQuery;
        Cursor cursor2;
        com.mbridge.msdk.foundation.entity.n nVar;
        ArrayList arrayList;
        ArrayList arrayList2;
        Cursor cursor3;
        com.mbridge.msdk.foundation.entity.n nVar2;
        String str2 = str;
        synchronized (this) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    cursorQuery = getReadableDatabase().query("reward_report", null, "key=?", new String[]{str2}, null, null, null);
                    if (cursorQuery != null) {
                        try {
                            if (cursorQuery.getCount() > 0) {
                                ArrayList arrayList3 = new ArrayList();
                                while (cursorQuery.moveToNext()) {
                                    String string = cursorQuery.getString(cursorQuery.getColumnIndex(C3426d4.i.W));
                                    int i10 = cursorQuery.getInt(cursorQuery.getColumnIndex("networkType"));
                                    String string2 = cursorQuery.getString(cursorQuery.getColumnIndex("network_str"));
                                    cursorQuery.getInt(cursorQuery.getColumnIndex("isCompleteView"));
                                    cursorQuery.getInt(cursorQuery.getColumnIndex("watchedMillis"));
                                    int i11 = cursorQuery.getInt(cursorQuery.getColumnIndex("videoLength"));
                                    String string3 = cursorQuery.getString(cursorQuery.getColumnIndex("offerUrl"));
                                    String string4 = cursorQuery.getString(cursorQuery.getColumnIndex("reason"));
                                    int i12 = cursorQuery.getInt(cursorQuery.getColumnIndex("result"));
                                    String string5 = cursorQuery.getString(cursorQuery.getColumnIndex("duration"));
                                    int i13 = cursorQuery.getInt(cursorQuery.getColumnIndex("videoSize"));
                                    String string6 = cursorQuery.getString(cursorQuery.getColumnIndex("campaignId"));
                                    String string7 = cursorQuery.getString(cursorQuery.getColumnIndex("video_url"));
                                    String string8 = cursorQuery.getString(cursorQuery.getColumnIndex("unitId"));
                                    String string9 = cursorQuery.getString(cursorQuery.getColumnIndex(ImpressionLog.f43648x));
                                    String string10 = cursorQuery.getString(cursorQuery.getColumnIndex("rid_n"));
                                    String string11 = cursorQuery.getString(cursorQuery.getColumnIndex("ad_type"));
                                    String string12 = cursorQuery.getString(cursorQuery.getColumnIndex("resource_type"));
                                    String string13 = cursorQuery.getString(cursorQuery.getColumnIndex("device_id"));
                                    String string14 = cursorQuery.getString(cursorQuery.getColumnIndex("creative"));
                                    int i14 = cursorQuery.getInt(cursorQuery.getColumnIndex(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_AD_SPACE_T));
                                    if (str2.equals("2000021")) {
                                        try {
                                            try {
                                                nVar = new com.mbridge.msdk.foundation.entity.n(string, i10, string3, string4, string2);
                                                nVar.b(string6);
                                                nVar.v(string7);
                                                nVar.n(string9);
                                                nVar.o(string10);
                                                nVar.u(string8);
                                                cursor2 = cursorQuery;
                                                arrayList = arrayList3;
                                                if (nVar != null) {
                                                    try {
                                                        arrayList2 = arrayList;
                                                        arrayList2.add(nVar);
                                                    } catch (Exception e10) {
                                                        e = e10;
                                                        cursorQuery = cursor2;
                                                        e.printStackTrace();
                                                        q0.b(f34677a, e.getMessage());
                                                        if (cursorQuery != null) {
                                                            try {
                                                                cursorQuery.close();
                                                            } catch (Exception unused) {
                                                            }
                                                        }
                                                        return null;
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        cursor = cursor2;
                                                        if (cursor != null) {
                                                            try {
                                                                cursor.close();
                                                            } catch (Exception unused2) {
                                                            }
                                                        }
                                                        throw th;
                                                    }
                                                } else {
                                                    arrayList2 = arrayList;
                                                }
                                                int i15 = cursor2.getInt(cursor2.getColumnIndex("id"));
                                                getWritableDatabase().delete("reward_report", "id = ?", new String[]{i15 + ""});
                                                arrayList3 = arrayList2;
                                                cursorQuery = cursor2;
                                            } catch (Exception e11) {
                                                e = e11;
                                                e.printStackTrace();
                                                q0.b(f34677a, e.getMessage());
                                                if (cursorQuery != null) {
                                                    cursorQuery.close();
                                                }
                                                return null;
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            cursor = cursorQuery;
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            throw th;
                                        }
                                    } else {
                                        if (str2.equals("2000022")) {
                                            arrayList = arrayList3;
                                            nVar = new com.mbridge.msdk.foundation.entity.n(string, i10, i11, string3, i12, string5, i13, string2);
                                            nVar.b(string6);
                                            nVar.v(string7);
                                            nVar.n(string9);
                                            nVar.u(string8);
                                            nVar.m(string4);
                                            nVar.o(string10);
                                            nVar.a(string11);
                                        } else {
                                            arrayList = arrayList3;
                                            if (str2.equals("2000025")) {
                                                nVar = new com.mbridge.msdk.foundation.entity.n(string, i10, i11, string3, i12, string5, i13, string2);
                                            } else if (str2.equals("2000024")) {
                                                nVar = new com.mbridge.msdk.foundation.entity.n(string, i10, string3, string4, string2);
                                            } else {
                                                if ("2000039".equals(str2)) {
                                                    nVar = new com.mbridge.msdk.foundation.entity.n(cursorQuery.getString(cursorQuery.getColumnIndex("h5_click_data")));
                                                } else {
                                                    if ("2000043".equals(str2)) {
                                                        try {
                                                            cursor3 = cursorQuery;
                                                            nVar = nVar2;
                                                            try {
                                                                nVar2 = new com.mbridge.msdk.foundation.entity.n(str, i12, string5, cursorQuery.getString(cursorQuery.getColumnIndex(CampaignEx.ENDCARD_URL)), string6, string8, string4, cursorQuery.getString(cursorQuery.getColumnIndex("type")));
                                                                nVar.n(string9);
                                                                nVar.o(string10);
                                                                if (!TextUtils.isEmpty(string6)) {
                                                                    nVar.b(string6);
                                                                }
                                                                nVar.a(i14);
                                                                nVar.a(string11);
                                                                nVar.p(string12);
                                                                nVar.d(string13);
                                                                nVar.c(string14);
                                                                str2 = str;
                                                                cursor2 = cursor3;
                                                            } catch (Exception e12) {
                                                                e = e12;
                                                                cursorQuery = cursor3;
                                                            } catch (Throwable th4) {
                                                                th = th4;
                                                                cursor = cursor3;
                                                                if (cursor != null) {
                                                                    cursor.close();
                                                                }
                                                                throw th;
                                                            }
                                                        } catch (Exception e13) {
                                                            e = e13;
                                                        } catch (Throwable th5) {
                                                            th = th5;
                                                            cursor3 = cursorQuery;
                                                        }
                                                    } else {
                                                        Cursor cursor4 = cursorQuery;
                                                        try {
                                                            str2 = str;
                                                            if ("2000045".equals(str2)) {
                                                                nVar = new com.mbridge.msdk.foundation.entity.n();
                                                                nVar.j(str2);
                                                                nVar.c(i10);
                                                                nVar.d(i12);
                                                                nVar.b(string6);
                                                                cursor2 = cursor4;
                                                                nVar.t(cursor2.getString(cursor2.getColumnIndex("template_url")));
                                                                nVar.m(string4);
                                                                nVar.n(string9);
                                                                nVar.o(string10);
                                                                nVar.u(string8);
                                                            } else {
                                                                cursor2 = cursor4;
                                                                if ("2000044".equals(str2)) {
                                                                    nVar = new com.mbridge.msdk.foundation.entity.n();
                                                                    nVar.j(str2);
                                                                    nVar.c(i10);
                                                                    nVar.b(string6);
                                                                    nVar.i(cursor2.getString(cursor2.getColumnIndex("image_url")));
                                                                    nVar.m(string4);
                                                                    nVar.n(string9);
                                                                    nVar.o(string10);
                                                                    nVar.u(string8);
                                                                } else if ("2000054".equals(str2)) {
                                                                    nVar = new com.mbridge.msdk.foundation.entity.n();
                                                                    nVar.j(str2);
                                                                    nVar.p(string12);
                                                                    nVar.u(string8);
                                                                    nVar.d(string13);
                                                                    nVar.a(string11);
                                                                    nVar.b(string6);
                                                                    nVar.n(string9);
                                                                    nVar.o(string10);
                                                                    nVar.d(i12);
                                                                    nVar.m(string4);
                                                                    nVar.c(i10);
                                                                    nVar.c(string14);
                                                                    nVar.a(i14);
                                                                } else {
                                                                    nVar = null;
                                                                }
                                                            }
                                                        } catch (Exception e14) {
                                                            e = e14;
                                                            cursor2 = cursor4;
                                                            cursorQuery = cursor2;
                                                            e.printStackTrace();
                                                            q0.b(f34677a, e.getMessage());
                                                            if (cursorQuery != null) {
                                                                cursorQuery.close();
                                                            }
                                                            return null;
                                                        } catch (Throwable th6) {
                                                            th = th6;
                                                            cursor2 = cursor4;
                                                            cursor = cursor2;
                                                            if (cursor != null) {
                                                                cursor.close();
                                                            }
                                                            throw th;
                                                        }
                                                    }
                                                    if (nVar != null) {
                                                        arrayList2 = arrayList;
                                                        arrayList2.add(nVar);
                                                    } else {
                                                        arrayList2 = arrayList;
                                                    }
                                                    int i16 = cursor2.getInt(cursor2.getColumnIndex("id"));
                                                    getWritableDatabase().delete("reward_report", "id = ?", new String[]{i16 + ""});
                                                    arrayList3 = arrayList2;
                                                    cursorQuery = cursor2;
                                                }
                                                e.printStackTrace();
                                                q0.b(f34677a, e.getMessage());
                                                if (cursorQuery != null) {
                                                    cursorQuery.close();
                                                }
                                            }
                                        }
                                        cursor2 = cursorQuery;
                                        if (nVar != null) {
                                            arrayList2 = arrayList;
                                            arrayList2.add(nVar);
                                        } else {
                                            arrayList2 = arrayList;
                                        }
                                        int i17 = cursor2.getInt(cursor2.getColumnIndex("id"));
                                        getWritableDatabase().delete("reward_report", "id = ?", new String[]{i17 + ""});
                                        arrayList3 = arrayList2;
                                        cursorQuery = cursor2;
                                    }
                                }
                                ArrayList arrayList4 = arrayList3;
                                try {
                                    cursorQuery.close();
                                } catch (Exception unused3) {
                                }
                                return arrayList4;
                            }
                        } catch (Exception e15) {
                            e = e15;
                        } catch (Throwable th7) {
                            th = th7;
                            cursor2 = cursorQuery;
                        }
                    }
                    if (cursorQuery != null) {
                        cursorQuery = cursorQuery;
                        cursorQuery.close();
                    }
                } catch (Exception e16) {
                    e = e16;
                    cursorQuery = null;
                } catch (Throwable th8) {
                    th = th8;
                    cursor = null;
                }
            }
            return null;
        }
    }

    public synchronized long a(com.mbridge.msdk.foundation.entity.n nVar) {
        if (nVar != null) {
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put(C3426d4.i.W, nVar.n());
                contentValues.put("networkType", Integer.valueOf(nVar.q()));
                contentValues.put("network_str", nVar.r());
                contentValues.put("isCompleteView", Integer.valueOf(nVar.m()));
                contentValues.put("watchedMillis", Integer.valueOf(nVar.F()));
                contentValues.put("videoLength", Integer.valueOf(nVar.C()));
                if (!TextUtils.isEmpty(nVar.s())) {
                    contentValues.put("offerUrl", nVar.s());
                }
                if (!TextUtils.isEmpty(nVar.t())) {
                    contentValues.put("reason", URLEncoder.encode(nVar.t(), G5.N));
                }
                contentValues.put("result", Integer.valueOf(nVar.x()));
                contentValues.put("duration", nVar.g());
                contentValues.put("videoSize", Long.valueOf(nVar.D()));
                contentValues.put("type", nVar.h());
                String strI = nVar.i();
                if (!TextUtils.isEmpty(strI)) {
                    contentValues.put(CampaignEx.ENDCARD_URL, strI);
                }
                String strE = nVar.E();
                if (!TextUtils.isEmpty(strE)) {
                    contentValues.put("video_url", strE);
                }
                String strU = nVar.u();
                if (!TextUtils.isEmpty(strU)) {
                    contentValues.put(ImpressionLog.f43648x, strU);
                }
                String strV = nVar.v();
                if (!TextUtils.isEmpty(strV)) {
                    contentValues.put("rid_n", strV);
                }
                String strZ = nVar.z();
                if (!TextUtils.isEmpty(strZ)) {
                    contentValues.put("template_url", strZ);
                }
                String strL = nVar.l();
                if (!TextUtils.isEmpty(strL)) {
                    contentValues.put("image_url", strL);
                }
                String strA = nVar.a();
                if (!TextUtils.isEmpty(strA)) {
                    contentValues.put("ad_type", URLEncoder.encode(strA, G5.N));
                }
                contentValues.put("unitId", nVar.B());
                contentValues.put("campaignId", nVar.d());
                if ("2000039".equals(nVar.n())) {
                    String strB = o.b(nVar);
                    if (a1.b(strB)) {
                        contentValues.put("h5_click_data", strB);
                    }
                }
                String strW = nVar.w();
                if (!TextUtils.isEmpty(strW)) {
                    contentValues.put("resource_type", URLEncoder.encode(strW, G5.N));
                }
                String strF = nVar.f();
                if (!TextUtils.isEmpty(strF)) {
                    contentValues.put("device_id", URLEncoder.encode(strF, G5.N));
                }
                String strE2 = nVar.e();
                if (!TextUtils.isEmpty(strE2)) {
                    contentValues.put("creative", URLEncoder.encode(strE2, G5.N));
                }
                contentValues.put(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_AD_SPACE_T, Integer.valueOf(nVar.b()));
                return getWritableDatabase().insert("reward_report", null, contentValues);
            } catch (Exception e10) {
                q0.b(f34677a, e10.getMessage());
                return -1L;
            }
        }
        return -1L;
    }
}
