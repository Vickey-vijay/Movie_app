package com.bytedance.sdk.component.le.ouw.ouw.ouw.ouw;

import android.content.Context;
import com.bytedance.sdk.component.le.ouw.pno;

/* JADX INFO: loaded from: classes7.dex */
public final class yu extends ouw {
    @Override // com.bytedance.sdk.component.le.ouw.ouw.ouw.ouw.ouw
    public final byte lh() {
        return (byte) 0;
    }

    @Override // com.bytedance.sdk.component.le.ouw.ouw.ouw.ouw.ouw
    public final byte vt() {
        return (byte) 1;
    }

    public static String lh(String str) {
        return "CREATE TABLE IF NOT EXISTS " + str + " (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)";
    }

    public yu(Context context, com.bytedance.sdk.component.le.ouw.yu.vt.ouw ouwVar) {
        super(context, ouwVar);
    }

    @Override // com.bytedance.sdk.component.le.ouw.ouw.ouw.ouw.lh
    public final long fkw() {
        return com.bytedance.sdk.component.le.ouw.ra.ouw.vt();
    }

    @Override // com.bytedance.sdk.component.le.ouw.ouw.ouw.ouw.ouw, com.bytedance.sdk.component.le.ouw.ouw.ouw.ouw.lh
    public final String ouw() {
        com.bytedance.sdk.component.le.ouw.ouw.fkw fkwVar = pno.vt().f11815ra;
        if (fkwVar != null) {
            return fkwVar.ouw();
        }
        return null;
    }
}
