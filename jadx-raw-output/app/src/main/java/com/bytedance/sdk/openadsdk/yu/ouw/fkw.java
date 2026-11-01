package com.bytedance.sdk.openadsdk.yu.ouw;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes11.dex */
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
                    com.bytedance.sdk.openadsdk.core.le.lh lhVarOuw = com.bytedance.sdk.openadsdk.core.fkw.ouw(context).ouw();
                    lhVarOuw.ouw();
                    this.vt = lhVarOuw.ouw;
                    com.bytedance.sdk.component.le.ouw.lh.vt.ouw();
                }
            }
        }
        return this.vt;
    }
}
