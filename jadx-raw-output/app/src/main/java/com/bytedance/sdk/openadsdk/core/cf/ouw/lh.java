package com.bytedance.sdk.openadsdk.core.cf.ouw;

import android.content.ContentValues;
import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.core.zih;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public class lh {
    public static int ouw = 20;
    private static volatile lh vt;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private final Object f12643lh = new Object();
    private final LruCache<String, ouw> yu = new LruCache<String, ouw>(ouw) { // from class: com.bytedance.sdk.openadsdk.core.cf.ouw.lh.1
        @Override // android.util.LruCache
        public final /* bridge */ /* synthetic */ int sizeOf(String str, ouw ouwVar) {
            return 1;
        }
    };

    public static lh ouw() {
        if (vt == null) {
            synchronized (lh.class) {
                if (vt == null) {
                    vt = new lh();
                }
            }
        }
        return vt;
    }

    public static String yu() {
        return "ALTER TABLE ugen_template ADD COLUMN rit TEXT ";
    }

    public final List<ouw> vt() {
        ArrayList arrayList = new ArrayList();
        com.bytedance.sdk.openadsdk.multipro.aidl.lh lhVar = new com.bytedance.sdk.openadsdk.multipro.aidl.lh(com.bytedance.sdk.openadsdk.multipro.ouw.ouw.ouw(zih.ouw(), "ugen_template", null, null, null, null, null, null));
        try {
            if (lhVar.moveToFirst()) {
                do {
                    int columnIndex = lhVar.getColumnIndex("id");
                    int columnIndex2 = lhVar.getColumnIndex("md5");
                    int columnIndex3 = lhVar.getColumnIndex("url");
                    int columnIndex4 = lhVar.getColumnIndex("data");
                    int columnIndex5 = lhVar.getColumnIndex("update_time");
                    if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex5 != -1 && columnIndex4 != -1) {
                        int columnIndex6 = lhVar.getColumnIndex("rit");
                        String string = columnIndex6 != -1 ? lhVar.getString(columnIndex6) : null;
                        String string2 = lhVar.getString(columnIndex);
                        String string3 = lhVar.getString(columnIndex2);
                        String string4 = lhVar.getString(columnIndex3);
                        String string5 = lhVar.getString(columnIndex4);
                        Long lValueOf = Long.valueOf(lhVar.getLong(columnIndex5));
                        ouw ouwVar = new ouw();
                        ouwVar.ouw = string2;
                        ouwVar.vt = string3;
                        ouwVar.f12645lh = string4;
                        ouwVar.fkw = string5;
                        ouwVar.f12644le = string;
                        ouwVar.yu = lValueOf;
                        arrayList.add(ouwVar);
                        synchronized (this.f12643lh) {
                            this.yu.put(string2, ouwVar);
                        }
                    }
                } while (lhVar.moveToNext());
            }
        } catch (Throwable th2) {
            try {
                qbp.ouw("UGTmplDbHelper", "getUgenTemplate error", th2);
            } finally {
                lhVar.close();
            }
        }
        return arrayList;
    }

    public static String lh() {
        return new StringBuilder("CREATE TABLE IF NOT EXISTS ugen_template (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,md5 TEXT ,url TEXT , data TEXT , rit TEXT , update_time TEXT)").toString();
    }

    private lh() {
    }

    public final ouw ouw(String str, String str2) {
        ouw ouwVar;
        ouw ouwVar2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.f12643lh) {
            ouwVar = this.yu.get(str);
        }
        if (ouwVar != null) {
            if (TextUtils.equals(str2, ouwVar.vt)) {
                return ouwVar;
            }
            vt(str2);
            return null;
        }
        com.bytedance.sdk.openadsdk.multipro.aidl.lh lhVar = new com.bytedance.sdk.openadsdk.multipro.aidl.lh(com.bytedance.sdk.openadsdk.multipro.ouw.ouw.ouw(zih.ouw(), "ugen_template", null, "id=? AND md5=?", new String[]{str, str2}, null, null, null));
        try {
            if (lhVar.moveToFirst()) {
                do {
                    int columnIndex = lhVar.getColumnIndex("id");
                    int columnIndex2 = lhVar.getColumnIndex("md5");
                    int columnIndex3 = lhVar.getColumnIndex("url");
                    int columnIndex4 = lhVar.getColumnIndex("data");
                    int columnIndex5 = lhVar.getColumnIndex("update_time");
                    if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex5 != -1 && columnIndex4 != -1) {
                        int columnIndex6 = lhVar.getColumnIndex("rit");
                        String string = lhVar.getString(columnIndex);
                        String string2 = lhVar.getString(columnIndex2);
                        String string3 = lhVar.getString(columnIndex3);
                        String string4 = lhVar.getString(columnIndex4);
                        if (TextUtils.isEmpty(string4)) {
                            lhVar.close();
                            return null;
                        }
                        String string5 = columnIndex6 != -1 ? lhVar.getString(columnIndex6) : null;
                        Long lValueOf = Long.valueOf(lhVar.getLong(columnIndex5));
                        ouwVar2 = new ouw();
                        ouwVar2.ouw = string;
                        ouwVar2.vt = string2;
                        ouwVar2.fkw = string4;
                        ouwVar2.f12645lh = string3;
                        ouwVar2.f12644le = string5;
                        ouwVar2.yu = lValueOf;
                        synchronized (this.f12643lh) {
                            this.yu.put(string, ouwVar2);
                        }
                    }
                    lhVar.close();
                    return null;
                } while (lhVar.moveToNext());
                lhVar.close();
                return ouwVar2;
            }
        } catch (Throwable th2) {
            try {
                qbp.ouw("UGTmplDbHelper", "getGgenTemplate error", th2);
            } finally {
                lhVar.close();
            }
        }
        return null;
    }

    private void vt(String str) {
        if (!TextUtils.isEmpty(str) && this.yu.size() > 0) {
            synchronized (this.f12643lh) {
                this.yu.remove(str);
            }
        }
    }

    public final Set<ouw> ouw(String str) {
        ouw ouwVar;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        HashSet hashSet = new HashSet();
        com.bytedance.sdk.openadsdk.multipro.aidl.lh lhVar = new com.bytedance.sdk.openadsdk.multipro.aidl.lh(com.bytedance.sdk.openadsdk.multipro.ouw.ouw.ouw(zih.ouw(), "ugen_template", null, "rit=?", new String[]{str}, null, null, null));
        try {
            if (lhVar.moveToFirst()) {
                do {
                    int columnIndex = lhVar.getColumnIndex("id");
                    if (columnIndex != -1) {
                        String string = lhVar.getString(columnIndex);
                        if (!TextUtils.isEmpty(string)) {
                            synchronized (this.f12643lh) {
                                ouwVar = this.yu.get(string);
                            }
                            if (ouwVar != null) {
                                hashSet.add(ouwVar);
                            } else {
                                ouw ouwVar2 = new ouw();
                                int columnIndex2 = lhVar.getColumnIndex("data");
                                if (columnIndex2 != -1) {
                                    String string2 = lhVar.getString(columnIndex2);
                                    if (!TextUtils.isEmpty(string2)) {
                                        ouwVar2.fkw = string2;
                                        ouwVar2.ouw = string;
                                        ouwVar2.f12644le = str;
                                        int columnIndex3 = lhVar.getColumnIndex("md5");
                                        int columnIndex4 = lhVar.getColumnIndex("url");
                                        int columnIndex5 = lhVar.getColumnIndex("update_time");
                                        if (columnIndex3 != -1) {
                                            ouwVar2.vt = lhVar.getString(columnIndex3);
                                        }
                                        if (columnIndex4 != -1) {
                                            ouwVar2.f12645lh = lhVar.getString(columnIndex4);
                                        }
                                        if (columnIndex5 != -1) {
                                            ouwVar2.yu = Long.valueOf(lhVar.getLong(columnIndex5));
                                        }
                                        hashSet.add(ouwVar2);
                                        synchronized (this.f12643lh) {
                                            this.yu.put(string, ouwVar2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } while (lhVar.moveToNext());
            }
        } catch (Throwable th2) {
            try {
                qbp.ouw("UGTmplDbHelper", "getUgenTemplateFormRit error", th2);
            } finally {
                lhVar.close();
            }
        }
        return hashSet;
    }

    public final void ouw(Set<String> set) {
        if (set == null || set.isEmpty()) {
            return;
        }
        String[] strArr = (String[]) set.toArray(new String[set.size()]);
        if (strArr.length > 0) {
            for (String str : strArr) {
                vt(str);
                com.bytedance.sdk.openadsdk.multipro.ouw.ouw.ouw(zih.ouw(), "ugen_template", "id=?", new String[]{str});
            }
        }
    }

    public final void ouw(ouw ouwVar) {
        if (ouwVar == null || TextUtils.isEmpty(ouwVar.ouw)) {
            return;
        }
        com.bytedance.sdk.openadsdk.multipro.aidl.lh lhVar = new com.bytedance.sdk.openadsdk.multipro.aidl.lh(com.bytedance.sdk.openadsdk.multipro.ouw.ouw.ouw(zih.ouw(), "ugen_template", null, "id=?", new String[]{ouwVar.ouw}, null, null, null));
        boolean z10 = lhVar.getCount() > 0;
        try {
            lhVar.close();
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", ouwVar.ouw);
            contentValues.put("md5", ouwVar.vt);
            contentValues.put("url", ouwVar.f12645lh);
            contentValues.put("data", ouwVar.fkw);
            contentValues.put("rit", ouwVar.f12644le);
            contentValues.put("update_time", ouwVar.yu);
            if (z10) {
                com.bytedance.sdk.openadsdk.multipro.ouw.ouw.ouw(zih.ouw(), "ugen_template", contentValues, "id=?", new String[]{ouwVar.ouw});
            } else {
                com.bytedance.sdk.openadsdk.multipro.ouw.ouw.ouw(zih.ouw(), "ugen_template", contentValues);
            }
            synchronized (this.f12643lh) {
                this.yu.put(ouwVar.ouw, ouwVar);
            }
        } catch (Throwable unused) {
        }
    }
}
