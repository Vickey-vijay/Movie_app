package com.mbridge.msdk.tracker;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: EventProcessor.java */
/* JADX INFO: loaded from: classes8.dex */
class g implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f38117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s f38118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicLong f38119c = new AtomicLong(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long[] f38120d = new long[2];

    @Override // com.mbridge.msdk.tracker.l
    public void a(e eVar) {
        try {
            long jIncrementAndGet = this.f38119c.incrementAndGet();
            this.f38120d[0] = System.currentTimeMillis();
            this.f38120d[1] = jIncrementAndGet;
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("TrackManager", "notice error", e10);
            }
        }
    }

    @Override // com.mbridge.msdk.tracker.l
    public void b(e eVar) {
        try {
            i iVar = new i(eVar);
            iVar.a(1);
            iVar.b(0);
            iVar.a(System.currentTimeMillis() + eVar.k());
            this.f38117a.a(iVar);
            this.f38118b.k();
            this.f38118b.e();
            this.f38118b.a(eVar);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("TrackManager", "process error", e10);
            }
        }
    }

    public g(c cVar, s sVar) {
        this.f38117a = cVar;
        this.f38118b = sVar;
    }

    @Override // com.mbridge.msdk.tracker.l
    public long[] a() {
        long[] jArr = this.f38120d;
        return jArr.length == 0 ? new long[]{0, 0} : jArr;
    }
}
