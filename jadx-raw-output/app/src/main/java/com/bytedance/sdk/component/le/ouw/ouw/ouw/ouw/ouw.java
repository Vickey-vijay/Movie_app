package com.bytedance.sdk.component.le.ouw.ouw.ouw.ouw;

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import com.bytedance.sdk.component.le.ouw.pno;
import com.safedk.android.internal.partials.PangleVideoBridge;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class ouw extends lh {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private final Context f11806lh;
    public List<String> ouw;
    private com.bytedance.sdk.component.le.ouw.yu.vt.ouw yu;

    /* JADX WARN: Code duplicated, block: B:18:0x0022 A[DONT_GENERATE, EXC_TOP_SPLITTER, PHI: r0 r1
  0x0022: PHI (r0v3 int) = (r0v0 int), (r0v5 int) binds: [B:13:0x002d, B:6:0x0020] A[DONT_GENERATE, DONT_INLINE]
  0x0022: PHI (r1v3 android.database.Cursor) = (r1v2 android.database.Cursor), (r1v4 android.database.Cursor) binds: [B:13:0x002d, B:6:0x0020] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    private int le() {
        int i10 = 0;
        Cursor cursorOuw = null;
        try {
            cursorOuw = com.bytedance.sdk.component.le.ouw.ouw.ouw.lh.ouw(yu(), ouw(), new String[]{"count(1)"}, null, null, null);
            if (cursorOuw != null) {
                cursorOuw.moveToFirst();
                i10 = cursorOuw.getInt(0);
            }
        } catch (Exception unused) {
        } finally {
            if (cursorOuw != null) {
                try {
                    cursorOuw.close();
                } catch (Exception unused2) {
                }
            }
        }
        return i10;
    }

    public byte lh() {
        return (byte) 0;
    }

    @Override // com.bytedance.sdk.component.le.ouw.ouw.ouw.ouw.lh
    public String ouw() {
        com.bytedance.sdk.component.le.ouw.ouw.fkw fkwVar = pno.vt().f11815ra;
        if (fkwVar != null) {
            return fkwVar.vt();
        }
        return null;
    }

    public byte vt() {
        return (byte) 2;
    }

    public static String vt(String str) {
        return "CREATE TABLE IF NOT EXISTS " + str + " (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)";
    }

    public ouw(Context context, com.bytedance.sdk.component.le.ouw.yu.vt.ouw ouwVar) {
        super(context);
        this.ouw = new ArrayList();
        this.f11806lh = context;
        this.yu = ouwVar;
        if (ouwVar == null) {
            this.yu = com.bytedance.sdk.component.le.ouw.yu.vt.ouw.ouw();
        }
    }

    private void yu(List<String> list) {
        ouw();
        list.size();
        com.bytedance.sdk.component.le.ouw.lh.vt.yu();
        com.bytedance.sdk.component.le.ouw.ouw.ouw.lh.ouw(yu(), "DELETE FROM " + ouw() + " WHERE " + ouw("id", list));
        com.bytedance.sdk.component.le.ouw.vt.yu yuVar = com.bytedance.sdk.component.le.ouw.vt.yu.ouw;
        list.size();
        com.bytedance.sdk.component.le.ouw.fkw fkwVar = pno.vt().bly;
        vt(list);
    }

    public final List<com.bytedance.sdk.component.le.ouw.yu.ouw> ouw(int i10, String str) {
        String str2;
        String[] strArr;
        Cursor cursorOuw;
        long jOuw = com.bytedance.sdk.component.le.ouw.vt.ouw.ouw(i10, yu());
        ouw();
        com.bytedance.sdk.component.le.ouw.lh.vt.vt();
        if (jOuw <= 0) {
            jOuw = 1;
        } else if (jOuw > 100) {
            jOuw = 100;
        }
        String str3 = str + " DESC limit " + jOuw;
        ArrayList arrayList = new ArrayList();
        this.ouw.clear();
        long jFkw = pno.vt().fkw();
        if (jFkw > 0) {
            strArr = new String[]{String.valueOf(System.currentTimeMillis() - jFkw)};
            str2 = "gen_time>?";
        } else {
            str2 = null;
            strArr = null;
        }
        if (com.bytedance.sdk.component.le.ouw.lh.ouw.fkw() && lh() == 3) {
            cursorOuw = com.bytedance.sdk.component.le.ouw.ouw.ouw.lh.ouw(yu(), ouw(), new String[]{"id", "value", "encrypt", "channel"}, str2, strArr, str3);
        } else {
            cursorOuw = com.bytedance.sdk.component.le.ouw.ouw.ouw.lh.ouw(yu(), ouw(), new String[]{"id", "value", "encrypt"}, str2, strArr, str3);
        }
        if (cursorOuw != null) {
            try {
                com.bytedance.sdk.component.le.ouw.fkw fkwVar = pno.vt().bly;
                while (cursorOuw.moveToNext()) {
                    try {
                        String string = cursorOuw.getString(cursorOuw.getColumnIndex("id"));
                        String string2 = cursorOuw.getString(cursorOuw.getColumnIndex("value"));
                        int i11 = cursorOuw.getInt(cursorOuw.getColumnIndex("encrypt"));
                        int i12 = (com.bytedance.sdk.component.le.ouw.lh.ouw.fkw() && lh() == 3) ? cursorOuw.getInt(cursorOuw.getColumnIndex("channel")) : 0;
                        if (i11 == 1) {
                            string2 = fkwVar.ouw(string2);
                        }
                        if (TextUtils.isEmpty(string2)) {
                            com.bytedance.sdk.component.le.ouw.lh.vt.ouw();
                            this.ouw.add(string);
                        } else {
                            if (arrayList.size() > 100) {
                                break;
                            }
                            com.bytedance.sdk.component.le.ouw.yu.ouw.ouw ouwVar = new com.bytedance.sdk.component.le.ouw.yu.ouw.ouw(string, PangleVideoBridge.jsonObjectInit(string2));
                            ouwVar.ouw = lh();
                            ouwVar.vt = vt();
                            if (com.bytedance.sdk.component.le.ouw.lh.ouw.fkw() && lh() == 3) {
                                ouwVar.fkw = i12;
                            }
                            com.bytedance.sdk.component.le.ouw.lh.ouw.le();
                            arrayList.add(ouwVar);
                        }
                    } catch (Throwable th2) {
                        th2.getMessage();
                        com.bytedance.sdk.component.le.ouw.lh.vt.lh();
                    }
                }
                try {
                    cursorOuw.close();
                    if (!this.ouw.isEmpty()) {
                        yu(this.ouw);
                        this.ouw.clear();
                    }
                } catch (Exception unused) {
                }
            } catch (Throwable th3) {
                try {
                    cursorOuw.close();
                    if (!this.ouw.isEmpty()) {
                        yu(this.ouw);
                        this.ouw.clear();
                    }
                } catch (Exception unused2) {
                }
                throw th3;
            }
        }
        ouw();
        arrayList.size();
        com.bytedance.sdk.component.le.ouw.lh.vt.vt();
        return arrayList;
    }

    public final List<com.bytedance.sdk.component.le.ouw.yu.ouw> ouw(String str) {
        com.bytedance.sdk.component.le.ouw.yu.vt.ouw ouwVar = this.yu;
        if (ouwVar == null) {
            return new ArrayList();
        }
        return ouw(ouwVar.vt, str);
    }

    public final void ouw(List<com.bytedance.sdk.component.le.ouw.yu.ouw> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        LinkedList linkedList = new LinkedList();
        Iterator<com.bytedance.sdk.component.le.ouw.yu.ouw> it = list.iterator();
        while (it.hasNext()) {
            linkedList.add(it.next().lh());
            com.bytedance.sdk.component.le.ouw.lh.ouw.bly();
        }
        ouw();
        linkedList.size();
        com.bytedance.sdk.component.le.ouw.lh.vt.yu();
        com.bytedance.sdk.component.le.ouw.ouw.ouw.lh.ouw(yu(), "DELETE FROM " + ouw() + " WHERE " + ouw("id", linkedList));
        vt(linkedList);
    }

    public final void ouw(int i10, long j10) {
        if (j10 > 0 || i10 > 0) {
            com.bytedance.sdk.component.le.ouw.ouw.ouw.lh.ouw(yu(), ouw(), "gen_time <? OR retry >?", new String[]{String.valueOf(System.currentTimeMillis() - j10), String.valueOf(i10)});
            ouw();
            com.bytedance.sdk.component.le.ouw.lh.vt.yu();
        }
    }

    public final boolean ouw(int i10) {
        if (this.yu == null) {
            return false;
        }
        int iLe = le();
        int i11 = this.yu.ouw;
        ouw();
        com.bytedance.sdk.component.le.ouw.lh.vt.vt();
        com.bytedance.sdk.component.le.ouw.lh.ouw.yu();
        return iLe >= i11;
    }

    private static String ouw(String str, List<?> list) {
        int i10;
        int iMin = Math.min(1000, 1000);
        int size = list.size();
        if (size % iMin == 0) {
            i10 = size / iMin;
        } else {
            i10 = (size / iMin) + 1;
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = i11 * iMin;
            String strOuw = ouw(TextUtils.join("','", list.subList(i12, Math.min(i12 + iMin, size))), "");
            if (i11 != 0) {
                sb2.append(" OR ");
            }
            sb2.append(str);
            sb2.append(" IN ");
            sb2.append("('");
            sb2.append(strOuw);
            sb2.append("')");
        }
        return ouw(sb2.toString(), str + " IN ('')");
    }

    private static String ouw(String str, String str2) {
        return !TextUtils.isEmpty(str) ? str : str2;
    }
}
