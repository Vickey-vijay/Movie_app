package com.bytedance.sdk.component.le.ouw.ouw.ouw;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes2.dex */
public final class fkw implements com.bytedance.sdk.component.le.ouw.ouw.fkw {
    public static final fkw ouw = new fkw();
    private volatile SQLiteDatabase vt;

    @Override // com.bytedance.sdk.component.le.ouw.ouw.fkw
    public final String fkw() {
        return "logstatsbatch";
    }

    @Override // com.bytedance.sdk.component.le.ouw.ouw.fkw
    public final String le() {
        return null;
    }

    @Override // com.bytedance.sdk.component.le.ouw.ouw.fkw
    public final String lh() {
        return null;
    }

    @Override // com.bytedance.sdk.component.le.ouw.ouw.fkw
    public final String ouw() {
        return "loghighpriority";
    }

    @Override // com.bytedance.sdk.component.le.ouw.ouw.fkw
    public final String vt() {
        return "adevent";
    }

    @Override // com.bytedance.sdk.component.le.ouw.ouw.fkw
    public final String yu() {
        return "logstats";
    }

    @Override // com.bytedance.sdk.component.le.ouw.ouw.fkw
    public final SQLiteDatabase ouw(Context context) {
        if (this.vt == null) {
            synchronized (this) {
                if (this.vt == null) {
                    this.vt = new yu(context).getWritableDatabase();
                    com.bytedance.sdk.component.le.ouw.lh.vt.ouw();
                }
            }
        }
        return this.vt;
    }
}
