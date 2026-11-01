package com.bytedance.sdk.openadsdk.yu.ouw;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class cf {
    public static cf ouw = new cf();

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public final Map<String, ouw> f13569lh = new HashMap();
    public ouw vt;
    public volatile boolean yu;

    private int ouw() {
        ouw ouwVar = this.vt;
        if (ouwVar != null) {
            return ouwVar.ouw;
        }
        return 3;
    }

    public static class ouw {
        public final int ouw;
        public final int vt;

        public ouw(int i10, int i11) {
            this.ouw = (i10 < 0 || i10 > 5) ? 3 : i10;
            this.vt = i11 < 10 ? 30 : i11;
        }
    }

    public final int ouw(String str) {
        if (!this.yu) {
            return 4;
        }
        ouw ouwVar = this.f13569lh.get(str);
        if (ouwVar == null) {
            return ouw();
        }
        return ouwVar.ouw;
    }
}
