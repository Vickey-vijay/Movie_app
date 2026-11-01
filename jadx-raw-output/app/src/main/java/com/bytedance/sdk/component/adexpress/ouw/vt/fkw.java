package com.bytedance.sdk.component.adexpress.ouw.vt;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import android.util.Log;
import android.util.LruCache;
import com.bytedance.sdk.component.utils.ko;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public class fkw {
    public static int ouw = 20;
    private static volatile fkw vt;
    private volatile ConcurrentHashMap<String, com.bytedance.sdk.component.adexpress.ouw.lh.lh> fkw;
    private final Object yu = new Object();

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private AtomicBoolean f11575le = new AtomicBoolean(false);

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private LruCache<String, com.bytedance.sdk.component.adexpress.ouw.lh.vt> f11577ra = new LruCache<String, com.bytedance.sdk.component.adexpress.ouw.lh.vt>(ouw) { // from class: com.bytedance.sdk.component.adexpress.ouw.vt.fkw.1
        @Override // android.util.LruCache
        public final /* bridge */ /* synthetic */ int sizeOf(String str, com.bytedance.sdk.component.adexpress.ouw.lh.vt vtVar) {
            return 1;
        }
    };

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private Set<String> f11576lh = Collections.synchronizedSet(new HashSet());

    public static void ouw(int i10) {
        ouw = i10;
    }

    public static Set<String> vt(String str) {
        if (TextUtils.isEmpty(str) || com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().ouw == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        Cursor cursorOuw = com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().ouw.ouw("template_diff_new", null, "rit=?", new String[]{str}, null, null, null);
        try {
            try {
                if (cursorOuw.moveToFirst()) {
                    do {
                        hashSet.add(cursorOuw.getString(cursorOuw.getColumnIndex("id")));
                    } while (cursorOuw.moveToNext());
                    return hashSet;
                }
            } catch (Exception e10) {
                Log.e("TmplDbHelper", "", e10);
            }
            return null;
        } finally {
            cursorOuw.close();
        }
    }

    public static String lh() {
        return new StringBuilder("CREATE TABLE IF NOT EXISTS template_diff_new (_id INTEGER PRIMARY KEY AUTOINCREMENT,rit TEXT ,id TEXT UNIQUE,md5 TEXT ,url TEXT , data TEXT , version TEXT , update_time TEXT)").toString();
    }

    public static fkw ouw() {
        if (vt == null) {
            synchronized (fkw.class) {
                if (vt == null) {
                    vt = new fkw();
                }
            }
        }
        return vt;
    }

    private fkw() {
    }

    public final com.bytedance.sdk.component.adexpress.ouw.lh.vt ouw(String str) {
        com.bytedance.sdk.component.adexpress.ouw.lh.vt vtVar;
        com.bytedance.sdk.component.adexpress.ouw.lh.vt vtVar2;
        if (TextUtils.isEmpty(str) || com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().ouw == null) {
            return null;
        }
        synchronized (this.yu) {
            vtVar = this.f11577ra.get(String.valueOf(str));
        }
        if (vtVar != null) {
            return vtVar;
        }
        Cursor cursorOuw = com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().ouw.ouw("template_diff_new", null, "id=?", new String[]{str}, null, null, null);
        try {
            if (cursorOuw.moveToFirst()) {
                do {
                    String string = cursorOuw.getString(cursorOuw.getColumnIndex("rit"));
                    String string2 = cursorOuw.getString(cursorOuw.getColumnIndex("id"));
                    String string3 = cursorOuw.getString(cursorOuw.getColumnIndex("md5"));
                    String string4 = cursorOuw.getString(cursorOuw.getColumnIndex("url"));
                    String string5 = cursorOuw.getString(cursorOuw.getColumnIndex("data"));
                    String string6 = cursorOuw.getString(cursorOuw.getColumnIndex("version"));
                    Long lValueOf = Long.valueOf(cursorOuw.getLong(cursorOuw.getColumnIndex("update_time")));
                    vtVar2 = new com.bytedance.sdk.component.adexpress.ouw.lh.vt();
                    vtVar2.ouw = string;
                    vtVar2.vt = string2;
                    vtVar2.f11569lh = string3;
                    vtVar2.yu = string4;
                    vtVar2.fkw = string5;
                    vtVar2.f11568le = string6;
                    vtVar2.f11570ra = lValueOf;
                    synchronized (this.yu) {
                        this.f11577ra.put(string2, vtVar2);
                    }
                    this.f11576lh.add(string2);
                } while (cursorOuw.moveToNext());
                cursorOuw.close();
                return vtVar2;
            }
        } catch (Throwable th2) {
            try {
                ko.lh("TmplDbHelper", "getTemplate error", th2);
            } finally {
                cursorOuw.close();
            }
        }
        return null;
    }

    public final List<com.bytedance.sdk.component.adexpress.ouw.lh.vt> vt() {
        if (com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().ouw == null) {
            return null;
        }
        boolean z10 = this.f11575le.get();
        this.f11575le.set(true);
        ArrayList arrayList = new ArrayList();
        Cursor cursorOuw = com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().ouw.ouw("template_diff_new", null, null, null, null, null, null);
        while (cursorOuw.moveToNext()) {
            try {
                String string = cursorOuw.getString(cursorOuw.getColumnIndex("rit"));
                String string2 = cursorOuw.getString(cursorOuw.getColumnIndex("id"));
                String string3 = cursorOuw.getString(cursorOuw.getColumnIndex("md5"));
                String string4 = cursorOuw.getString(cursorOuw.getColumnIndex("url"));
                String string5 = cursorOuw.getString(cursorOuw.getColumnIndex("data"));
                String string6 = cursorOuw.getString(cursorOuw.getColumnIndex("version"));
                Long lValueOf = Long.valueOf(cursorOuw.getLong(cursorOuw.getColumnIndex("update_time")));
                com.bytedance.sdk.component.adexpress.ouw.lh.vt vtVar = new com.bytedance.sdk.component.adexpress.ouw.lh.vt();
                vtVar.ouw = string;
                vtVar.vt = string2;
                vtVar.f11569lh = string3;
                vtVar.yu = string4;
                vtVar.fkw = string5;
                vtVar.f11568le = string6;
                vtVar.f11570ra = lValueOf;
                arrayList.add(vtVar);
                synchronized (this.yu) {
                    this.f11577ra.put(string2, (com.bytedance.sdk.component.adexpress.ouw.lh.vt) arrayList.get(arrayList.size() - 1));
                }
                this.f11576lh.add(string2);
                if (!z10 && com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().fkw != null) {
                    if (this.fkw == null) {
                        this.fkw = new ConcurrentHashMap<>();
                    }
                    if (string2 != null && !this.fkw.contains(string2)) {
                        this.fkw.put(string2, new com.bytedance.sdk.component.adexpress.ouw.lh.lh(string, string2, string3));
                    }
                }
            } catch (Throwable th2) {
                try {
                    ko.lh("TmplDbHelper", "getTemplate error", th2);
                } finally {
                    cursorOuw.close();
                }
            }
        }
        return arrayList;
    }

    public final void ouw(com.bytedance.sdk.component.adexpress.ouw.lh.vt vtVar, boolean z10) {
        if (vtVar == null || com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().ouw == null || TextUtils.isEmpty(vtVar.vt)) {
            return;
        }
        Cursor cursorOuw = com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().ouw.ouw("template_diff_new", null, "id=?", new String[]{vtVar.vt}, null, null, null);
        boolean z11 = cursorOuw.getCount() > 0;
        String string = null;
        try {
            string = cursorOuw.moveToFirst() ? cursorOuw.getString(cursorOuw.getColumnIndex("rit")) : null;
            cursorOuw.close();
        } catch (Throwable unused) {
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("rit", vtVar.ouw);
        contentValues.put("id", vtVar.vt);
        contentValues.put("md5", vtVar.f11569lh);
        contentValues.put("url", vtVar.yu);
        contentValues.put("data", vtVar.fkw);
        contentValues.put("version", vtVar.f11568le);
        contentValues.put("update_time", vtVar.f11570ra);
        if (z11) {
            com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().ouw.ouw("template_diff_new", contentValues, "id=?", new String[]{vtVar.vt});
        } else {
            com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().ouw.ouw("template_diff_new", contentValues);
        }
        synchronized (this.yu) {
            this.f11577ra.put(vtVar.vt, vtVar);
        }
        this.f11576lh.add(vtVar.vt);
        if (z10) {
            return;
        }
        try {
            if (com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().fkw == null) {
                return;
            }
            if (this.fkw == null) {
                this.fkw = new ConcurrentHashMap<>();
            }
            this.fkw.put(vtVar.vt, new com.bytedance.sdk.component.adexpress.ouw.lh.lh(vtVar.ouw, vtVar.vt, vtVar.f11569lh));
            if (string != null) {
                com.bytedance.sdk.component.adexpress.ouw.ouw.fkw fkwVar = com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().fkw;
            }
            com.bytedance.sdk.component.adexpress.ouw.ouw.fkw fkwVar2 = com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().fkw;
        } catch (Throwable unused2) {
        }
    }

    public final void ouw(Set<String> set) {
        com.bytedance.sdk.component.adexpress.ouw.lh.lh lhVar;
        LruCache<String, com.bytedance.sdk.component.adexpress.ouw.lh.vt> lruCache;
        if (set.isEmpty() || com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().ouw == null) {
            return;
        }
        String[] strArr = (String[]) set.toArray(new String[set.size()]);
        if (strArr.length > 0) {
            for (int i10 = 0; i10 < strArr.length; i10++) {
                String str = strArr[i10];
                if (!TextUtils.isEmpty(str) && (lruCache = this.f11577ra) != null && lruCache.size() > 0) {
                    synchronized (this.yu) {
                        this.f11577ra.remove(str);
                    }
                }
                com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().ouw.ouw("template_diff_new", "id=?", new String[]{strArr[i10]});
                String str2 = strArr[i10];
                try {
                    if (this.fkw != null && !this.fkw.isEmpty() && (lhVar = this.fkw.get(str2)) != null) {
                        if (!TextUtils.isEmpty(lhVar.ouw) && com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().fkw != null) {
                            com.bytedance.sdk.component.adexpress.ouw.ouw.fkw fkwVar = com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().fkw;
                        }
                        this.fkw.remove(str2);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }
}
