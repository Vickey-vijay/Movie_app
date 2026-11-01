package com.bytedance.sdk.component.le.ouw.ouw.ouw.ouw;

import android.content.Context;
import com.bytedance.sdk.component.le.ouw.pno;

/* JADX INFO: loaded from: classes9.dex */
public final class le extends ra {
    @Override // com.bytedance.sdk.component.le.ouw.ouw.ouw.ouw.ra
    public final byte lh() {
        return (byte) 3;
    }

    @Override // com.bytedance.sdk.component.le.ouw.ouw.ouw.ouw.ra, com.bytedance.sdk.component.le.ouw.ouw.ouw.ouw.lh
    public final String ouw() {
        return pno.vt().f11815ra.fkw();
    }

    @Override // com.bytedance.sdk.component.le.ouw.ouw.ouw.ouw.ra
    public final byte vt() {
        return (byte) 1;
    }

    public le(Context context, com.bytedance.sdk.component.le.ouw.yu.vt.ouw ouwVar) {
        super(context, ouwVar);
    }

    public static String ouw(String str) {
        return "CREATE TABLE IF NOT EXISTS " + str + " (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)";
    }
}
