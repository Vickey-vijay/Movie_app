package com.mbridge.msdk.tracker;

import android.util.Log;

/* JADX INFO: compiled from: ProcessorWrapper.java */
/* JADX INFO: loaded from: classes8.dex */
class q implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f38315a;

    @Override // com.mbridge.msdk.tracker.l
    public void a(e eVar) {
        if (y.b(this.f38315a)) {
            return;
        }
        this.f38315a.a(eVar);
    }

    @Override // com.mbridge.msdk.tracker.l
    public void b(e eVar) {
        if (y.b(this.f38315a)) {
            return;
        }
        try {
            h hVarJ = eVar.j();
            if (y.a(hVarJ)) {
                eVar.a(hVarJ.a(eVar));
            }
            this.f38315a.b(eVar);
        } catch (Exception e10) {
            if (a.f38101a) {
                Log.e("TrackManager", "process event error", e10);
            }
        }
    }

    public q(g gVar) {
        this.f38315a = gVar;
    }

    @Override // com.mbridge.msdk.tracker.l
    public long[] a() {
        return y.b(this.f38315a) ? new long[]{0, 0} : this.f38315a.a();
    }
}
