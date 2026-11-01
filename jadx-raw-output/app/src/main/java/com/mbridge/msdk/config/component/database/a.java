package com.mbridge.msdk.config.component.database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: ComponentDatabase.java */
/* JADX INFO: loaded from: classes7.dex */
public class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static a f33164b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f33165a;

    public static synchronized a a() {
        if (f33164b == null) {
            f33164b = new a(com.mbridge.msdk.foundation.controller.c.n().d());
        }
        return f33164b;
    }

    public Map<String, Object> b(String str) {
        HashMap map = new HashMap();
        if (TextUtils.isEmpty(str)) {
            map.put("code", 2);
            map.put("reason", "SQL is null");
            return map;
        }
        try {
            a(true).execSQL(str);
            map.put("code", 1);
        } catch (Throwable th2) {
            q0.b("ComponentDatabase", th2.getMessage());
            map.put("code", 2);
            map.put("reason", th2.getMessage());
        }
        return map;
    }

    public Map<String, Object> c(String str) {
        HashMap map = new HashMap();
        if (TextUtils.isEmpty(str)) {
            map.put("code", 2);
            map.put("reason", "SQL is null");
            return map;
        }
        try {
            return b(str);
        } catch (Throwable th2) {
            q0.b("ComponentDatabase", th2.getMessage());
            map.put("code", 2);
            map.put("reason", th2.getMessage());
            return map;
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00b8 A[Catch: all -> 0x00c8, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x00c8, blocks: (B:7:0x0025, B:40:0x00b8, B:48:0x00c7, B:47:0x00c4, B:43:0x00be, B:10:0x0033, B:12:0x0039, B:13:0x003d, B:15:0x0043, B:17:0x004c, B:34:0x0099, B:20:0x0057, B:29:0x0068, B:30:0x0075, B:31:0x007d, B:32:0x0089, B:33:0x0095, B:35:0x009f, B:38:0x00aa), top: B:56:0x0025, inners: #0, #1 }] */
    public Map<String, Object> d(String str) {
        Object obj;
        HashMap map = new HashMap();
        int i10 = 2;
        if (TextUtils.isEmpty(str)) {
            map.put("code", 2);
            map.put("reason", "SQL is null");
            return map;
        }
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        try {
            Object obj2 = null;
            Cursor cursorRawQuery = a(false).rawQuery(str, null);
            if (cursorRawQuery != null) {
                try {
                    if (cursorRawQuery.getCount() > 0) {
                        String[] columnNames = cursorRawQuery.getColumnNames();
                        while (cursorRawQuery.moveToNext()) {
                            HashMap map2 = new HashMap();
                            int length = columnNames.length;
                            int i12 = i11;
                            while (i12 < length) {
                                String str2 = columnNames[i12];
                                int columnIndex = cursorRawQuery.getColumnIndex(str2);
                                if (columnIndex != -1) {
                                    int type = cursorRawQuery.getType(columnIndex);
                                    if (type != 0) {
                                        if (type == 1) {
                                            map2.put(str2, String.valueOf(cursorRawQuery.getLong(columnIndex)));
                                        } else if (type == i10) {
                                            map2.put(str2, String.valueOf(cursorRawQuery.getFloat(columnIndex)));
                                        } else if (type == 3) {
                                            map2.put(str2, cursorRawQuery.getString(columnIndex));
                                        } else if (type == 4) {
                                            map2.put(str2, new String(cursorRawQuery.getBlob(columnIndex)));
                                        }
                                        obj = null;
                                    } else {
                                        obj = null;
                                        map2.put(str2, null);
                                    }
                                } else {
                                    obj = null;
                                }
                                i12++;
                                obj2 = obj;
                                i10 = 2;
                            }
                            arrayList.add(map2);
                            obj2 = obj2;
                            i10 = 2;
                            i11 = 0;
                        }
                    }
                    map.put("code", 1);
                    map.put("data", arrayList);
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                } catch (Throwable th2) {
                    if (cursorRawQuery == null) {
                        throw th2;
                    }
                    try {
                        cursorRawQuery.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            } else {
                map.put("code", 1);
                map.put("data", arrayList);
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
            }
        } catch (Throwable th4) {
            q0.b("ComponentDatabase", th4.getMessage());
            map.put("code", 2);
            map.put("reason", th4.getMessage());
        }
        return map;
    }

    private a(Context context) {
        this.f33165a = new b(context);
    }

    public SQLiteDatabase a(boolean z10) {
        try {
            return z10 ? this.f33165a.getWritableDatabase() : this.f33165a.getReadableDatabase();
        } catch (Throwable th2) {
            q0.b("ComponentDatabase", th2.getMessage());
            return null;
        }
    }

    public Map<String, Object> a(String str) {
        HashMap map = new HashMap();
        if (TextUtils.isEmpty(str)) {
            map.put("code", 2);
            map.put("reason", "SQL is null");
            return map;
        }
        try {
            b(str);
            if (str.contains(c.TABLE_FILE_DB)) {
                new com.mbridge.msdk.config.component.database.file.a().a(str);
            }
            map.put("code", 1);
        } catch (Throwable th2) {
            q0.b("ComponentDatabase", th2.getMessage());
            map.put("code", 2);
            map.put("reason", th2.getMessage());
        }
        return map;
    }
}
