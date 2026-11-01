package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;

/* JADX INFO: renamed from: com.ironsource.g3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
class C3479g3 extends Q0 {
    public C3479g3(O0 o10, Gb gb2) {
        super(o10, gb2);
    }

    private boolean n() {
        if (b().b() > 0) {
            return true;
        }
        return false;
    }

    private boolean p() {
        if (b().d() >= 0) {
            return true;
        }
        return false;
    }

    public void l() {
        if (o()) {
            IronLog.INTERNAL.verbose();
            i();
        }
    }

    public void m() {
        if (o()) {
            IronLog.INTERNAL.verbose();
            i();
        }
    }

    public boolean o() {
        if (b().a() == O0.a.MANUAL_WITH_LOAD_ON_SHOW) {
            return true;
        }
        return false;
    }

    public void q() {
        if (o() && d()) {
            IronLog.INTERNAL.verbose();
            a(b().c());
        }
    }

    public void r() {
        if (!n()) {
            IronLog.INTERNAL.verbose("banner reload interval is disabled");
        } else if (o() && p()) {
            IronLog.INTERNAL.verbose();
            a(b().d());
        }
    }
}
