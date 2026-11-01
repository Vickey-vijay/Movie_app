package com.bytedance.sdk.component.le.ouw.le;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class le implements fkw {
    private Context ouw;

    public static String vt() {
        return "CREATE TABLE IF NOT EXISTS trackurl (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,url TEXT ,replaceholder INTEGER default 0, retry INTEGER default 0)";
    }

    @Override // com.bytedance.sdk.component.le.ouw.le.fkw
    public final List<yu> ouw() {
        LinkedList linkedList = new LinkedList();
        Cursor cursorOuw = com.bytedance.sdk.component.le.ouw.ouw.ouw.lh.ouw(this.ouw, "trackurl", null, null, null, null);
        if (cursorOuw != null) {
            while (cursorOuw.moveToNext()) {
                try {
                    try {
                        String string = cursorOuw.getString(cursorOuw.getColumnIndex("id"));
                        String string2 = cursorOuw.getString(cursorOuw.getColumnIndex("url"));
                        boolean z10 = cursorOuw.getInt(cursorOuw.getColumnIndex("replaceholder")) > 0;
                        int i10 = cursorOuw.getInt(cursorOuw.getColumnIndex("retry"));
                        int i11 = cursorOuw.getInt(cursorOuw.getColumnIndex("url_type"));
                        String string3 = cursorOuw.getString(cursorOuw.getColumnIndex(CreativeInfo.f44321c));
                        String string4 = cursorOuw.getString(cursorOuw.getColumnIndex("error_code"));
                        String string5 = cursorOuw.getString(cursorOuw.getColumnIndex("error_msg"));
                        yu yuVar = new yu(string, string2, z10, i11, string3);
                        yuVar.yu = i10;
                        if (!TextUtils.isEmpty(string4)) {
                            yuVar.f11782ra = string4;
                        }
                        if (!TextUtils.isEmpty(string5)) {
                            yuVar.pno = string5;
                        }
                        linkedList.add(yuVar);
                    } finally {
                        cursorOuw.close();
                    }
                } catch (Throwable unused) {
                }
            }
            cursorOuw.close();
        }
        return linkedList;
    }

    @Override // com.bytedance.sdk.component.le.ouw.le.fkw
    public final void lh(yu yuVar) {
        com.bytedance.sdk.component.le.ouw.ouw.ouw.lh.ouw(this.ouw, "trackurl", "id=?", new String[]{yuVar.ouw});
    }

    @Override // com.bytedance.sdk.component.le.ouw.le.fkw
    public final void vt(yu yuVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", yuVar.ouw);
        contentValues.put("url", yuVar.vt);
        contentValues.put("replaceholder", Integer.valueOf(yuVar.f11781lh ? 1 : 0));
        contentValues.put("retry", Integer.valueOf(yuVar.yu));
        contentValues.put("error_code", yuVar.f11782ra);
        contentValues.put("error_msg", yuVar.pno);
        contentValues.put("url_type", Integer.valueOf(yuVar.fkw));
        contentValues.put(CreativeInfo.f44321c, yuVar.f11780le);
        com.bytedance.sdk.component.le.ouw.ouw.ouw.lh.ouw(this.ouw, "trackurl", contentValues, "id=?", new String[]{yuVar.ouw});
    }

    public le(Context context) {
        this.ouw = context;
    }

    @Override // com.bytedance.sdk.component.le.ouw.le.fkw
    public final yu ouw(String str) {
        Cursor cursorOuw = com.bytedance.sdk.component.le.ouw.ouw.ouw.lh.ouw(this.ouw, "trackurl", null, "id=?", new String[]{str}, null);
        if (cursorOuw != null && cursorOuw.moveToFirst()) {
            try {
                String string = cursorOuw.getString(cursorOuw.getColumnIndex("id"));
                String string2 = cursorOuw.getString(cursorOuw.getColumnIndex("url"));
                boolean z10 = cursorOuw.getInt(cursorOuw.getColumnIndex("replaceholder")) > 0;
                int i10 = cursorOuw.getInt(cursorOuw.getColumnIndex("retry"));
                int i11 = cursorOuw.getInt(cursorOuw.getColumnIndex("url_type"));
                String string3 = cursorOuw.getString(cursorOuw.getColumnIndex(CreativeInfo.f44321c));
                String string4 = cursorOuw.getString(cursorOuw.getColumnIndex("error_code"));
                String string5 = cursorOuw.getString(cursorOuw.getColumnIndex("error_msg"));
                yu yuVar = new yu(string, string2, z10, i11, string3);
                yuVar.yu = i10;
                if (!TextUtils.isEmpty(string4)) {
                    yuVar.f11782ra = string4;
                }
                if (!TextUtils.isEmpty(string5)) {
                    yuVar.pno = string5;
                }
                cursorOuw.close();
                return yuVar;
            } catch (Throwable th2) {
                try {
                    th2.getMessage();
                    com.bytedance.sdk.component.le.ouw.lh.vt.lh();
                    cursorOuw.close();
                    cursorOuw = null;
                } catch (Throwable th3) {
                    cursorOuw.close();
                    throw th3;
                }
            }
        }
        if (cursorOuw != null) {
            cursorOuw.close();
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.le.ouw.le.fkw
    public final void ouw(yu yuVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", yuVar.ouw);
        contentValues.put("url", yuVar.vt);
        contentValues.put("replaceholder", Integer.valueOf(yuVar.f11781lh ? 1 : 0));
        contentValues.put("retry", Integer.valueOf(yuVar.yu));
        contentValues.put("url_type", Integer.valueOf(yuVar.fkw));
        contentValues.put(CreativeInfo.f44321c, yuVar.f11780le);
        contentValues.put("error_code", yuVar.f11782ra);
        contentValues.put("error_msg", yuVar.pno);
        Context context = this.ouw;
        if (TextUtils.isEmpty("trackurl")) {
            return;
        }
        try {
            com.bytedance.sdk.component.le.ouw.ouw.ouw.ouw.ouw(context).ouw().ouw("trackurl", (String) null, contentValues);
        } catch (Throwable unused) {
            com.bytedance.sdk.component.le.ouw.lh.vt.ouw();
        }
    }
}
