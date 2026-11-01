package com.mbridge.msdk.tracker;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: MemoryEventFilter.java */
/* JADX INFO: loaded from: classes8.dex */
public class n implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap<String, a> f38155a = new ConcurrentHashMap<>();

    /* JADX INFO: compiled from: MemoryEventFilter.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f38156a;

        public boolean a() {
            return this.f38156a;
        }

        public a(boolean z10) {
            this.f38156a = z10;
        }
    }

    @Override // com.mbridge.msdk.tracker.f
    public boolean a(e eVar) throws Exception {
        a aVar;
        if (eVar != null && !TextUtils.isEmpty(eVar.g())) {
            try {
                String strG = eVar.g();
                if (this.f38155a.containsKey(strG)) {
                    aVar = this.f38155a.get(strG);
                } else {
                    a aVar2 = new a(com.mbridge.msdk.foundation.same.report.c.a(strG));
                    this.f38155a.put(strG, aVar2);
                    aVar = aVar2;
                }
                return aVar != null && aVar.a();
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("TrackManager", "apply", e10);
                }
            }
        }
        return false;
    }
}
