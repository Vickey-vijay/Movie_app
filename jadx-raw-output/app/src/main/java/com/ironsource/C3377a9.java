package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import java.util.HashMap;

/* JADX INFO: renamed from: com.ironsource.a9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C3377a9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final E0 f28148a;

    public void a(String str, String str2) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_EXT1, str + ImpressionLog.Q + str2);
        this.f28148a.a(B0.INIT_STARTED, map);
    }

    public C3377a9(E0 e10) {
        this.f28148a = e10;
    }

    public void a(long j10) {
        HashMap map = new HashMap();
        map.put("duration", Long.valueOf(j10));
        this.f28148a.a(B0.INIT_ENDED, map);
    }

    public void a() {
        this.f28148a.a(B0.INIT_SUCCESS, null);
    }

    public void a(int i10, String str) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10));
        map.put("reason", str);
        this.f28148a.a(B0.INIT_FAILED, map);
    }
}
