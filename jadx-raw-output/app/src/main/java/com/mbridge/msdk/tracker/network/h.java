package com.mbridge.msdk.tracker.network;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: MBridgeBaseRequest.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class h<T> extends t<T> {
    public static final String B = "h";
    private boolean A;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final long f38183w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Map<String, String> f38184x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Map<String, String> f38185y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private x f38186z;

    public void a(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        if (this.f38184x == null) {
            this.f38184x = new HashMap();
        }
        try {
            this.f38184x.putAll(map);
        } catch (Exception e10) {
            q0.b(B, "addParams error: " + e10.getMessage());
        }
    }

    public void d(boolean z10) {
        this.A = z10;
    }

    @Override // com.mbridge.msdk.tracker.network.t
    public Map<String, String> f() {
        if (this.f38185y == null) {
            this.f38185y = new HashMap();
        }
        this.f38185y.put("Charset", "UTF-8");
        return this.f38185y;
    }

    @Override // com.mbridge.msdk.tracker.network.t
    public Map<String, String> i() {
        if (this.f38184x == null) {
            this.f38184x = new HashMap();
        }
        return this.f38184x;
    }

    @Override // com.mbridge.msdk.tracker.network.t
    public x o() {
        if (this.f38186z == null) {
            this.f38186z = new e(30000, this.f38183w, 3);
        }
        return this.f38186z;
    }

    public h(int i10, String str, int i11, String str2, long j10) {
        super(i10, str, i11, str2);
        this.A = false;
        if (j10 > 0) {
            this.f38183w = j10;
        } else {
            this.f38183w = 60000L;
        }
    }

    public void b(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.f38185y == null) {
            this.f38185y = new HashMap();
        }
        try {
            this.f38185y.put(str, str2);
        } catch (Exception e10) {
            q0.b(B, "addHeader error: " + e10.getMessage());
        }
    }

    @Override // com.mbridge.msdk.tracker.network.t
    public boolean a() {
        return this.A && com.mbridge.msdk.foundation.same.d.a(p(), t());
    }
}
