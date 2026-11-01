package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.ironsource.C3426d4;
import io.appmetrica.analytics.coreutils.internal.parsing.ParseUtils;
import java.io.Closeable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.tb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4543tb implements Ia, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f57710a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f57711b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f57712c = "preferences";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C4518sb f57713d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f57714e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InterfaceC4688z6 f57715f;

    /* JADX WARN: Code duplicated, block: B:20:0x0055  */
    public static void a(C4543tb c4543tb) {
        SQLiteDatabase sQLiteDatabaseA;
        Object obj;
        c4543tb.getClass();
        Cursor cursor = null;
        try {
            sQLiteDatabaseA = c4543tb.f57715f.a();
            if (sQLiteDatabaseA != null) {
                try {
                    Cursor cursorQuery = sQLiteDatabaseA.query(c4543tb.f57712c, new String[]{C3426d4.i.W, "value", "type"}, null, null, null, null, null);
                    while (cursorQuery.moveToNext()) {
                        try {
                            String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(C3426d4.i.W));
                            String string2 = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("value"));
                            int i10 = cursorQuery.getInt(cursorQuery.getColumnIndexOrThrow("type"));
                            if (!TextUtils.isEmpty(string)) {
                                if (i10 != 1) {
                                    if (i10 == 2) {
                                        obj = ParseUtils.parseInt(string2);
                                    } else if (i10 == 3) {
                                        obj = ParseUtils.parseLong(string2);
                                    } else if (i10 != 4) {
                                        if (i10 != 5) {
                                            obj = string2;
                                            obj = null;
                                        } else {
                                            obj = string2;
                                            obj = ParseUtils.parseFloat(string2);
                                        }
                                    }
                                } else if ("true".equals(string2)) {
                                    obj = Boolean.TRUE;
                                } else if (com.ironsource.mediationsdk.metadata.a.f29886h.equals(string2)) {
                                    obj = Boolean.FALSE;
                                } else {
                                    obj = string2;
                                    obj = null;
                                }
                                if (obj != null) {
                                    c4543tb.f57710a.put(string, obj);
                                }
                            }
                        } catch (Throwable unused) {
                        }
                    }
                    cursor = cursorQuery;
                } catch (Throwable unused2) {
                }
            }
        } catch (Throwable unused3) {
            sQLiteDatabaseA = null;
        }
        mo.a(cursor);
        c4543tb.f57715f.a(sQLiteDatabaseA);
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final void b() {
        synchronized (this.f57713d) {
            this.f57713d.notifyAll();
        }
    }

    public final void c() {
        if (this.f57714e) {
            return;
        }
        try {
            this.f57710a.wait();
        } catch (InterruptedException unused) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f57713d.isRunning()) {
            this.f57713d.stopRunning();
        }
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final Ia remove(String str) {
        synchronized (this.f57710a) {
            c();
            this.f57710a.remove(str);
        }
        synchronized (this.f57713d) {
            this.f57711b.put(str, this);
            this.f57713d.notifyAll();
        }
        return this;
    }

    public C4543tb(InterfaceC4688z6 interfaceC4688z6) {
        this.f57715f = interfaceC4688z6;
        C4518sb c4518sb = new C4518sb(this, String.format(Locale.US, "IAA-DW-%s", Integer.valueOf(Ad.a())));
        this.f57713d = c4518sb;
        c4518sb.start();
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final boolean getBoolean(String str, boolean z10) {
        Object objB = b(str);
        if (objB instanceof Boolean) {
            return ((Boolean) objB).booleanValue();
        }
        return z10;
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final int getInt(String str, int i10) {
        Object objB = b(str);
        if (objB instanceof Integer) {
            return ((Integer) objB).intValue();
        }
        return i10;
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final long getLong(String str, long j10) {
        Object objB = b(str);
        if (objB instanceof Long) {
            return ((Long) objB).longValue();
        }
        return j10;
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final String getString(String str, String str2) {
        Object objB = b(str);
        if (objB instanceof String) {
            return (String) objB;
        }
        return str2;
    }

    public final Object b(String str) {
        Object obj;
        synchronized (this.f57710a) {
            c();
            obj = this.f57710a.get(str);
        }
        return obj;
    }

    public static void a(C4543tb c4543tb, HashMap map) {
        SQLiteDatabase sQLiteDatabaseA;
        c4543tb.getClass();
        int size = map.size();
        ContentValues[] contentValuesArr = new ContentValues[size];
        int i10 = 0;
        for (Map.Entry entry : map.entrySet()) {
            ContentValues contentValues = new ContentValues();
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            contentValues.put(C3426d4.i.W, str);
            if (value == c4543tb) {
                contentValues.putNull("value");
            } else if (value instanceof String) {
                contentValues.put("value", (String) value);
                contentValues.put("type", (Integer) 4);
            } else if (value instanceof Long) {
                contentValues.put("value", (Long) value);
                contentValues.put("type", (Integer) 3);
            } else if (value instanceof Integer) {
                contentValues.put("value", (Integer) value);
                contentValues.put("type", (Integer) 2);
            } else if (value instanceof Boolean) {
                contentValues.put("value", String.valueOf(((Boolean) value).booleanValue()));
                contentValues.put("type", (Integer) 1);
            } else if (value instanceof Float) {
                contentValues.put("value", (Float) value);
                contentValues.put("type", (Integer) 5);
            }
            contentValuesArr[i10] = contentValues;
            i10++;
        }
        SQLiteDatabase sQLiteDatabase = null;
        try {
            sQLiteDatabaseA = c4543tb.f57715f.a();
            if (sQLiteDatabaseA != null) {
                try {
                    sQLiteDatabaseA.beginTransaction();
                    for (int i11 = 0; i11 < size; i11++) {
                        ContentValues contentValues2 = contentValuesArr[i11];
                        if (contentValues2.getAsString("value") == null) {
                            sQLiteDatabaseA.delete(c4543tb.f57712c, "key = ?", new String[]{contentValues2.getAsString(C3426d4.i.W)});
                        } else {
                            sQLiteDatabaseA.insertWithOnConflict(c4543tb.f57712c, null, contentValues2, 5);
                        }
                    }
                    sQLiteDatabaseA.setTransactionSuccessful();
                } catch (Throwable unused) {
                    sQLiteDatabase = sQLiteDatabaseA;
                    if (sQLiteDatabase != null) {
                        try {
                            sQLiteDatabase.endTransaction();
                        } catch (Throwable unused2) {
                        }
                    }
                    sQLiteDatabaseA = sQLiteDatabase;
                }
            }
            if (sQLiteDatabaseA != null) {
                try {
                    sQLiteDatabaseA.endTransaction();
                } catch (Throwable unused3) {
                }
            }
        } catch (Throwable unused4) {
        }
        c4543tb.f57715f.a(sQLiteDatabaseA);
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final synchronized Ia a(String str, String str2) {
        a(str, (Object) str2);
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final Ia a(String str, long j10) {
        a(str, Long.valueOf(j10));
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final synchronized Ia a(int i10, String str) {
        a(str, Integer.valueOf(i10));
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final Ia a(String str, boolean z10) {
        a(str, Boolean.valueOf(z10));
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final Ia a(String str, float f10) {
        a(str, Float.valueOf(f10));
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final boolean a(String str) {
        boolean zContainsKey;
        synchronized (this.f57710a) {
            c();
            zContainsKey = this.f57710a.containsKey(str);
        }
        return zContainsKey;
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final Set a() {
        HashSet hashSet;
        synchronized (this.f57710a) {
            hashSet = new HashSet(this.f57710a.keySet());
        }
        return hashSet;
    }

    public final void a(String str, Object obj) {
        synchronized (this.f57710a) {
            c();
            this.f57710a.put(str, obj);
        }
        synchronized (this.f57713d) {
            this.f57711b.put(str, obj);
            this.f57713d.notifyAll();
        }
    }
}
