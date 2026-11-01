package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.ironsource.C3426d4;
import io.appmetrica.analytics.coreutils.internal.db.DBUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class M6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock.ReadLock f55549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ReentrantReadWriteLock.WriteLock f55550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Z6 f55551c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final L6 f55552d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f55553e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f55554f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Context f55555g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Y4 f55556h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicLong f55557i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f55558j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final I6 f55559k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C4211g7 f55560l;

    public final long a(Set set) {
        this.f55549a.lock();
        Cursor cursorRawQuery = null;
        long j10 = 0;
        try {
            SQLiteDatabase readableDatabase = this.f55551c.getReadableDatabase();
            if (readableDatabase != null) {
                StringBuilder sb2 = new StringBuilder("SELECT count() FROM events");
                if (!set.isEmpty()) {
                    sb2.append(" WHERE ");
                }
                Iterator it = set.iterator();
                int i10 = 0;
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    if (i10 > 0) {
                        sb2.append(" OR ");
                    }
                    sb2.append("type == " + num);
                    i10++;
                }
                cursorRawQuery = readableDatabase.rawQuery(sb2.toString(), null);
                if (cursorRawQuery.moveToFirst()) {
                    j10 = cursorRawQuery.getLong(0);
                }
            }
        } catch (Throwable unused) {
        }
        mo.a(cursorRawQuery);
        this.f55549a.unlock();
        return j10;
    }

    static {
        HashSet hashSet = new HashSet();
        EnumC4112cb enumC4112cb = EnumC4112cb.EVENT_TYPE_UNDEFINED;
        hashSet.add(0);
        hashSet.add(6400);
    }

    public final long b() {
        this.f55549a.lock();
        try {
            return this.f55557i.get();
        } finally {
            this.f55549a.unlock();
        }
    }

    public final long c() {
        long jQueryRowsCount;
        this.f55549a.lock();
        try {
            SQLiteDatabase readableDatabase = this.f55551c.getReadableDatabase();
            jQueryRowsCount = readableDatabase != null ? DBUtils.queryRowsCount(readableDatabase, "events") : 0L;
        } catch (Throwable unused) {
        }
        this.f55549a.unlock();
        return jQueryRowsCount;
    }

    public final void d() {
        Cursor cursor;
        Cursor cursorRawQuery;
        this.f55549a.lock();
        Cursor cursorRawQuery2 = null;
        try {
            SQLiteDatabase readableDatabase = this.f55551c.getReadableDatabase();
            if (readableDatabase != null) {
                cursorRawQuery = readableDatabase.rawQuery(" SELECT DISTINCT id From sessions order by id asc ", new String[0]);
                try {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("All sessions in db: ");
                    while (cursorRawQuery.moveToNext()) {
                        stringBuffer.append(cursorRawQuery.getString(0));
                        stringBuffer.append(", ");
                    }
                    cursorRawQuery2 = readableDatabase.rawQuery(" SELECT DISTINCT session_id From events order by session_id asc ", new String[0]);
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append("All sessions in reports db: ");
                    while (cursorRawQuery2.moveToNext()) {
                        stringBuffer2.append(cursorRawQuery2.getString(0));
                        stringBuffer2.append(", ");
                    }
                } catch (Throwable unused) {
                    cursor = cursorRawQuery2;
                    cursorRawQuery2 = cursorRawQuery;
                    cursorRawQuery = cursorRawQuery2;
                    cursorRawQuery2 = cursor;
                }
            } else {
                cursorRawQuery = null;
            }
        } catch (Throwable unused2) {
            cursor = null;
        }
        this.f55549a.unlock();
        mo.a(cursorRawQuery);
        mo.a(cursorRawQuery2);
    }

    public final void e() {
        this.f55552d.start();
    }

    public M6(Y4 y10, Z6 z10, I6 i10, C4211g7 c4211g7) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f55549a = reentrantReadWriteLock.readLock();
        this.f55550b = reentrantReadWriteLock.writeLock();
        this.f55553e = new Object();
        this.f55554f = new ArrayList(3);
        AtomicLong atomicLong = new AtomicLong();
        this.f55557i = atomicLong;
        this.f55558j = new ArrayList();
        this.f55551c = z10;
        this.f55555g = y10.getContext();
        this.f55556h = y10;
        this.f55559k = i10;
        this.f55560l = c4211g7;
        atomicLong.set(c());
        L6 l10 = new L6(this, y10);
        this.f55552d = l10;
        l10.setName(a(y10));
    }

    public final void a(T8 t10) {
        this.f55558j.add(t10);
    }

    public static String a(Fa fa2) {
        return "DatabaseWorker [" + fa2.b().e() + C3426d4.j.f28588e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(long j10, Wk wk2, long j11) {
        JSONObject jSONObject;
        boolean zB;
        C4564u7 c4564u7 = new C4564u7(null, 1, 0 == true ? 1 : 0);
        C4350lh c4350lh = (C4350lh) this.f55556h.f56209k.a();
        Long lValueOf = Long.valueOf(j10);
        Long lValueOf2 = Long.valueOf(j11);
        try {
            jSONObject = new JSONObject().put("dId", c4350lh.getDeviceId()).put("uId", c4350lh.getUuid()).put("appVer", c4350lh.getAppVersion()).put("appBuild", c4350lh.getAppBuildNumber()).put("kitBuildType", c4350lh.getAnalyticsSdkBuildType()).put("osVer", c4350lh.getOsVersion()).put("osApiLev", c4350lh.getOsApiLevel()).put(com.ironsource.Q6.f27460q, c4350lh.getLocale()).put("root", c4350lh.getDeviceRootStatus()).put("app_debuggable", ((O5) c4350lh).f55669a).put(CommonUrlParts.APP_FRAMEWORK, c4350lh.getAppFramework()).put("attribution_id", c4350lh.f57214r).put("analyticsSdkVersionName", c4350lh.getAnalyticsSdkVersionName()).put("kitBuildNumber", c4350lh.getAnalyticsSdkBuildNumber());
        } catch (Throwable unused) {
            jSONObject = new JSONObject();
        }
        String string = jSONObject.toString();
        Long lValueOf3 = Long.valueOf(Jn.a());
        Yj yj2 = Xj.f56166a;
        synchronized (yj2) {
            zB = yj2.f56255b.b(true);
        }
        ContentValues contentValuesA = c4564u7.fromModel(new C4539t7(lValueOf, wk2, string, new C4514s7(lValueOf2, lValueOf3, Boolean.valueOf(zB))));
        if (contentValuesA == null) {
            return;
        }
        this.f55550b.lock();
        try {
            SQLiteDatabase writableDatabase = this.f55551c.getWritableDatabase();
            if (writableDatabase != null) {
                writableDatabase.insertOrThrow("sessions", null, contentValuesA);
            }
        } catch (Throwable unused2) {
        }
        this.f55550b.unlock();
    }

    public final void a(ContentValues contentValues) {
        synchronized (this.f55553e) {
            this.f55554f.add(contentValues);
        }
        synchronized (this.f55552d) {
            this.f55552d.notifyAll();
        }
    }

    public final void a() {
        SQLiteDatabase writableDatabase;
        try {
            this.f55550b.lock();
            if (this.f55557i.get() > ((C4350lh) this.f55556h.f56209k.a()).f57218v && (writableDatabase = this.f55551c.getWritableDatabase()) != null) {
                int iA = a(writableDatabase);
                this.f55557i.addAndGet(-iA);
                if (iA != 0) {
                    Iterator it = this.f55558j.iterator();
                    while (it.hasNext()) {
                        ((T8) it.next()).a();
                    }
                }
            }
        } catch (Throwable unused) {
        }
        this.f55550b.unlock();
    }

    public final int a(SQLiteDatabase sQLiteDatabase) {
        try {
            return this.f55559k.a(sQLiteDatabase, String.format("id IN (SELECT id FROM events ORDER BY CASE WHEN type IN (%1$s) THEN 2 WHEN type IN (%2$s) THEN 1 ELSE 0 END, id LIMIT (SELECT count() FROM events) / %3$s)", TextUtils.join(", ", AbstractC4641x9.f57926i), TextUtils.join(", ", AbstractC4641x9.f57927j), 10), 2, this.f55556h.f56200b.f55817b, true).f55261b;
        } catch (Throwable th2) {
            Rj rj2 = AbstractC4452pj.f57520a;
            rj2.getClass();
            rj2.a(new C4477qj("deleteExcessiveReports exception", th2));
            return 0;
        }
    }

    public final void a(long j10, int i10, int i11, boolean z10) {
        if (i11 <= 0) {
            return;
        }
        this.f55550b.lock();
        try {
            String str = String.format(Locale.US, "%1$s = %2$s AND %3$s = %4$s AND %5$s <= (SELECT %5$s FROM %6$s WHERE %1$s = %2$s AND %3$s = %4$s ORDER BY %5$s ASC LIMIT %7$s, 1)", "session_id", Long.toString(j10), "session_type", Integer.toString(i10), "id", "events", Integer.toString(i11 - 1));
            SQLiteDatabase writableDatabase = this.f55551c.getWritableDatabase();
            if (writableDatabase != null) {
                G6 g6A = this.f55559k.a(writableDatabase, str, 1, this.f55556h.f56200b.f55817b, z10);
                if (g6A.f55260a != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = g6A.f55260a.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Integer.valueOf(((ContentValues) it.next()).getAsInteger("type").intValue()));
                    }
                    Iterator it2 = this.f55558j.iterator();
                    while (it2.hasNext()) {
                        ((T8) it2.next()).b(arrayList);
                    }
                }
                List list = g6A.f55260a;
                if (list != null) {
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        a((ContentValues) list.get(i12), "Event removed from db");
                    }
                }
                this.f55557i.addAndGet(-g6A.f55261b);
            }
        } catch (Throwable unused) {
        }
        this.f55550b.unlock();
    }

    public final ContentValues a(long j10, Wk wk2) {
        ContentValues contentValues = new ContentValues();
        this.f55549a.lock();
        Cursor cursorRawQuery = null;
        try {
            SQLiteDatabase readableDatabase = this.f55551c.getReadableDatabase();
            if (readableDatabase != null) {
                cursorRawQuery = readableDatabase.rawQuery(String.format(Locale.US, "SELECT report_request_parameters FROM sessions WHERE id = %s AND type = %s ORDER BY id DESC LIMIT 1", Long.valueOf(j10), Integer.valueOf(wk2.f56124a)), null);
                if (cursorRawQuery.moveToNext()) {
                    ContentValues contentValues2 = new ContentValues();
                    DatabaseUtils.cursorRowToContentValues(cursorRawQuery, contentValues2);
                    contentValues = contentValues2;
                }
            }
        } catch (Throwable unused) {
        }
        mo.a(cursorRawQuery);
        this.f55549a.unlock();
        return contentValues;
    }

    public static String a(LinkedHashMap linkedHashMap) {
        StringBuilder sb2 = new StringBuilder("id >= ?");
        for (String str : linkedHashMap.keySet()) {
            sb2.append(sb2.length() > 0 ? " AND " : "");
            sb2.append(str + " = ? ");
        }
        if (TextUtils.isEmpty(sb2.toString())) {
            return null;
        }
        return sb2.toString();
    }

    public static String[] a(String[] strArr, LinkedHashMap linkedHashMap) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(strArr));
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((Map.Entry) it.next()).getValue());
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(ContentValues contentValues, String str) {
        Integer asInteger = contentValues.getAsInteger("type");
        if (AbstractC4641x9.f57921d.contains(EnumC4112cb.a(asInteger != null ? asInteger.intValue() : -1))) {
            C4185f7 c4185f7A = new C4211g7(null, 1, 0 == true ? 1 : 0).toModel(contentValues);
            PublicLogger publicLogger = this.f55556h.f56211m;
            EnumC4112cb enumC4112cb = c4185f7A.f56718d;
            C4159e7 c4159e7 = c4185f7A.f56721g;
            publicLogger.info(Rf.a(str, enumC4112cb, c4159e7.f56640b, c4159e7.f56641c), new Object[0]);
        }
    }

    public static boolean a(M6 m10) {
        boolean zIsEmpty;
        synchronized (m10.f55553e) {
            zIsEmpty = m10.f55554f.isEmpty();
        }
        return zIsEmpty;
    }
}
