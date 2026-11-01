package com.mbridge.msdk.tracker;

import androidx.browser.trusted.sharing.ShareTarget;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: ReportRequest.java */
/* JADX INFO: loaded from: classes8.dex */
public class v<T> extends com.mbridge.msdk.tracker.network.t<T> {
    private com.mbridge.msdk.tracker.network.e A;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Map<String, String> f38341w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private com.mbridge.msdk.tracker.network.t.a f38342x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private com.mbridge.msdk.tracker.network.v.b<T> f38343y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private w f38344z;

    public v(String str, int i10) {
        super(i10, str);
    }

    public void a(w wVar) {
        this.f38344z = wVar;
    }

    @Override // com.mbridge.msdk.tracker.network.t
    public boolean a() {
        return false;
    }

    public v(String str, int i10, int i11) {
        super(i10, str, i11);
    }

    public com.mbridge.msdk.tracker.network.v.b<T> C() {
        return this.f38343y;
    }

    public void a(com.mbridge.msdk.tracker.network.t.a aVar) {
        this.f38342x = aVar;
    }

    @Override // com.mbridge.msdk.tracker.network.t
    public Map<String, String> f() {
        HashMap map = new HashMap();
        map.put("Content-Type", ShareTarget.ENCODING_TYPE_URL_ENCODED);
        map.put("Charset", "UTF-8");
        return map;
    }

    @Override // com.mbridge.msdk.tracker.network.t
    public Map<String, String> i() {
        return this.f38341w;
    }

    @Override // com.mbridge.msdk.tracker.network.t
    public com.mbridge.msdk.tracker.network.t.a l() {
        return this.f38342x;
    }

    @Override // com.mbridge.msdk.tracker.network.t
    public com.mbridge.msdk.tracker.network.x o() {
        if (y.b(this.A)) {
            this.A = new com.mbridge.msdk.tracker.network.e(30000, 0);
        }
        return this.A;
    }

    public void a(Map<String, String> map) {
        this.f38341w = map;
    }

    public void a(com.mbridge.msdk.tracker.network.v.b<T> bVar) {
        this.f38343y = bVar;
    }

    @Override // com.mbridge.msdk.tracker.network.t
    public com.mbridge.msdk.tracker.network.v<T> a(com.mbridge.msdk.tracker.network.q qVar) {
        return this.f38344z.a(qVar);
    }

    @Override // com.mbridge.msdk.tracker.network.t
    public void a(T t10) {
        com.mbridge.msdk.tracker.network.v.b<T> bVarC = C();
        this.f38343y = bVarC;
        if (bVarC != null) {
            bVarC.a(t10);
        }
    }
}
