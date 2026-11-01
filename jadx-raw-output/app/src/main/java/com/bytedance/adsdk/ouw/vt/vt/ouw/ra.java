package com.bytedance.adsdk.ouw.vt.vt.ouw;

import com.ironsource.C3426d4;
import com.ironsource.mediationsdk.metadata.a;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class ra implements com.bytedance.adsdk.ouw.vt.vt.ouw {
    private final Object ouw;

    @Override // com.bytedance.adsdk.ouw.vt.vt.ouw
    public final Object ouw(Map<String, JSONObject> map) {
        return this.ouw;
    }

    @Override // com.bytedance.adsdk.ouw.vt.vt.ouw
    public final com.bytedance.adsdk.ouw.vt.yu.fkw ouw() {
        return com.bytedance.adsdk.ouw.vt.yu.le.CONSTANT;
    }

    public final String toString() {
        return "KeywordNode [keywordValue=" + this.ouw + C3426d4.j.f28588e;
    }

    @Override // com.bytedance.adsdk.ouw.vt.vt.ouw
    public final String vt() {
        Object obj = this.ouw;
        return obj != null ? obj.toString() : "NULL";
    }

    public ra(String str) {
        if (str.equalsIgnoreCase("true")) {
            this.ouw = Boolean.TRUE;
        } else if (str.equalsIgnoreCase(a.f29886h)) {
            this.ouw = Boolean.FALSE;
        } else {
            if (str.equalsIgnoreCase("null")) {
                this.ouw = null;
                return;
            }
            throw new IllegalArgumentException();
        }
    }
}
