package com.bytedance.sdk.component.le.ouw.ouw;

import com.bytedance.sdk.component.le.ouw.ouw.vt.ra;
import com.bytedance.sdk.component.le.ouw.pno;
import java.util.List;
import java.util.Queue;

/* JADX INFO: loaded from: classes11.dex */
public final class le implements yu {
    private com.bytedance.sdk.component.le.ouw.yu.vt.ouw bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private com.bytedance.sdk.component.le.ouw.yu.vt.ouw f11794cf;
    private ra fkw;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    private Queue<String> f11795jg;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private com.bytedance.sdk.component.le.ouw.ouw.vt.lh f11796le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private com.bytedance.sdk.component.le.ouw.ouw.vt.ouw f11797lh;
    private com.bytedance.sdk.component.le.ouw.yu.vt.ouw mwh;
    public fkw ouw = pno.vt().f11815ra;
    private com.bytedance.sdk.component.le.ouw.yu.vt.ouw pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private com.bytedance.sdk.component.le.ouw.ouw.vt.le f11798ra;
    private com.bytedance.sdk.component.le.ouw.yu.vt.ouw ryl;
    private com.bytedance.sdk.component.le.ouw.yu.vt.ouw tlj;
    private com.bytedance.sdk.component.le.ouw.ouw.vt.fkw vt;
    private com.bytedance.sdk.component.le.ouw.ouw.vt.vt yu;

    @Override // com.bytedance.sdk.component.le.ouw.ouw.yu
    public final void ouw(int i10, long j10) {
    }

    @Override // com.bytedance.sdk.component.le.ouw.ouw.yu
    public final void ouw(com.bytedance.sdk.component.le.ouw.yu.ouw ouwVar, int i10) {
        try {
            byte bYu = ouwVar.yu();
            byte bFkw = ouwVar.fkw();
            if (bYu == 0 && bFkw == 1 && com.bytedance.sdk.component.le.ouw.vt.ouw.ouw()) {
                this.vt.ouw(ouwVar);
                return;
            }
            if (bYu == 3 && bFkw == 2 && com.bytedance.sdk.component.le.ouw.vt.ouw.fkw()) {
                this.yu.ouw(ouwVar);
                return;
            }
            if (bYu == 0 && bFkw == 2 && com.bytedance.sdk.component.le.ouw.vt.ouw.vt()) {
                this.f11797lh.ouw(ouwVar);
                return;
            }
            if (bYu == 1 && bFkw == 2 && com.bytedance.sdk.component.le.ouw.vt.ouw.lh()) {
                this.fkw.ouw(ouwVar);
                return;
            }
            if (bYu == 1 && bFkw == 3 && com.bytedance.sdk.component.le.ouw.vt.ouw.yu()) {
                this.f11796le.ouw(ouwVar);
            } else if (bYu == 2 && bFkw == 3 && com.bytedance.sdk.component.le.ouw.vt.ouw.le()) {
                this.f11798ra.ouw(ouwVar);
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public le(Queue<String> queue) {
        this.f11795jg = queue;
        if (com.bytedance.sdk.component.le.ouw.vt.ouw.ouw()) {
            com.bytedance.sdk.component.le.ouw.yu.vt.ouw ouwVar = pno.vt().vt;
            this.pno = ouwVar;
            this.vt = new com.bytedance.sdk.component.le.ouw.ouw.vt.fkw(ouwVar, queue);
        }
        if (com.bytedance.sdk.component.le.ouw.vt.ouw.fkw()) {
            if (pno.vt().f11813le != null) {
                this.tlj = pno.vt().f11813le;
            } else {
                this.tlj = pno.vt().f11814lh;
            }
            this.yu = new com.bytedance.sdk.component.le.ouw.ouw.vt.vt(this.tlj, queue);
        }
        if (com.bytedance.sdk.component.le.ouw.vt.ouw.vt()) {
            com.bytedance.sdk.component.le.ouw.yu.vt.ouw ouwVar2 = pno.vt().f11814lh;
            this.bly = ouwVar2;
            this.f11797lh = new com.bytedance.sdk.component.le.ouw.ouw.vt.ouw(ouwVar2, queue);
        }
        if (com.bytedance.sdk.component.le.ouw.vt.ouw.lh()) {
            com.bytedance.sdk.component.le.ouw.yu.vt.ouw ouwVar3 = pno.vt().f11814lh;
            this.f11794cf = ouwVar3;
            this.fkw = new ra(ouwVar3, queue);
        }
        if (com.bytedance.sdk.component.le.ouw.vt.ouw.yu()) {
            com.bytedance.sdk.component.le.ouw.yu.vt.ouw ouwVar4 = pno.vt().yu;
            this.ryl = ouwVar4;
            this.f11796le = new com.bytedance.sdk.component.le.ouw.ouw.vt.lh(ouwVar4, queue);
        }
        if (com.bytedance.sdk.component.le.ouw.vt.ouw.le()) {
            com.bytedance.sdk.component.le.ouw.yu.vt.ouw ouwVar5 = pno.vt().fkw;
            this.mwh = ouwVar5;
            this.f11798ra = new com.bytedance.sdk.component.le.ouw.ouw.vt.le(ouwVar5, queue);
        }
    }

    @Override // com.bytedance.sdk.component.le.ouw.ouw.yu
    public final void ouw(int i10, List<com.bytedance.sdk.component.le.ouw.yu.ouw> list) {
        if (list == null || list.size() == 0 || list.get(0) == null) {
            return;
        }
        com.bytedance.sdk.component.le.ouw.yu.ouw ouwVar = list.get(0);
        byte bFkw = ouwVar.fkw();
        byte bYu = ouwVar.yu();
        if (bYu == 0 && bFkw == 1 && com.bytedance.sdk.component.le.ouw.vt.ouw.ouw()) {
            this.vt.ouw(i10, list);
            return;
        }
        if (bYu == 3 && bFkw == 2 && com.bytedance.sdk.component.le.ouw.vt.ouw.fkw()) {
            this.yu.ouw(i10, list);
            return;
        }
        if (bYu == 0 && bFkw == 2 && com.bytedance.sdk.component.le.ouw.vt.ouw.vt()) {
            this.f11797lh.ouw(i10, list);
            return;
        }
        if (bYu == 1 && bFkw == 2 && com.bytedance.sdk.component.le.ouw.vt.ouw.lh()) {
            this.fkw.ouw(i10, list);
            return;
        }
        if (bYu == 1 && bFkw == 3 && com.bytedance.sdk.component.le.ouw.vt.ouw.yu()) {
            this.f11796le.ouw(i10, list);
        } else if (bYu == 2 && bFkw == 3 && com.bytedance.sdk.component.le.ouw.vt.ouw.le()) {
            this.f11798ra.ouw(i10, list);
        }
    }

    @Override // com.bytedance.sdk.component.le.ouw.ouw.yu
    public final List<com.bytedance.sdk.component.le.ouw.yu.ouw> ouw(int i10, int i11, List<String> list) {
        List<com.bytedance.sdk.component.le.ouw.yu.ouw> listOuw;
        List<com.bytedance.sdk.component.le.ouw.yu.ouw> listOuw2;
        List<com.bytedance.sdk.component.le.ouw.yu.ouw> listOuw3;
        List<com.bytedance.sdk.component.le.ouw.yu.ouw> listOuw4;
        List<com.bytedance.sdk.component.le.ouw.yu.ouw> listOuw5;
        List<com.bytedance.sdk.component.le.ouw.yu.ouw> listOuw6;
        if (com.bytedance.sdk.component.le.ouw.vt.ouw.ouw() && this.vt.vt(i10) && (listOuw6 = this.vt.ouw(i10)) != null && listOuw6.size() != 0) {
            com.bytedance.sdk.component.le.ouw.vt.yu yuVar = com.bytedance.sdk.component.le.ouw.vt.yu.ouw;
            com.bytedance.sdk.component.le.ouw.fkw fkwVar = pno.vt().bly;
            return listOuw6;
        }
        if (com.bytedance.sdk.component.le.ouw.vt.ouw.fkw() && this.yu.vt(i10) && (listOuw5 = this.yu.ouw(i10)) != null && listOuw5.size() != 0) {
            return listOuw5;
        }
        if (com.bytedance.sdk.component.le.ouw.vt.ouw.vt() && this.f11797lh.vt(i10) && (listOuw4 = this.f11797lh.ouw(i10)) != null && listOuw4.size() != 0) {
            com.bytedance.sdk.component.le.ouw.vt.yu yuVar2 = com.bytedance.sdk.component.le.ouw.vt.yu.ouw;
            com.bytedance.sdk.component.le.ouw.fkw fkwVar2 = pno.vt().bly;
            return listOuw4;
        }
        if (com.bytedance.sdk.component.le.ouw.vt.ouw.lh() && this.fkw.vt(i10) && (listOuw3 = this.fkw.ouw(i10)) != null && listOuw3.size() != 0) {
            com.bytedance.sdk.component.le.ouw.vt.yu yuVar3 = com.bytedance.sdk.component.le.ouw.vt.yu.ouw;
            com.bytedance.sdk.component.le.ouw.fkw fkwVar3 = pno.vt().bly;
            return listOuw3;
        }
        if (com.bytedance.sdk.component.le.ouw.vt.ouw.yu() && this.f11796le.vt(i10) && (listOuw2 = this.f11796le.ouw(i10)) != null && listOuw2.size() != 0) {
            com.bytedance.sdk.component.le.ouw.vt.yu yuVar4 = com.bytedance.sdk.component.le.ouw.vt.yu.ouw;
            com.bytedance.sdk.component.le.ouw.fkw fkwVar4 = pno.vt().bly;
            return listOuw2;
        }
        if (!com.bytedance.sdk.component.le.ouw.vt.ouw.le() || !this.f11798ra.vt(i10) || (listOuw = this.f11798ra.ouw(i10)) == null || listOuw.size() == 0) {
            return null;
        }
        return listOuw;
    }

    @Override // com.bytedance.sdk.component.le.ouw.ouw.yu
    public final boolean ouw(int i10, boolean z10) {
        com.bytedance.sdk.component.le.ouw.ouw.vt.le leVar;
        com.bytedance.sdk.component.le.ouw.ouw.vt.lh lhVar;
        ra raVar;
        com.bytedance.sdk.component.le.ouw.ouw.vt.ouw ouwVar;
        com.bytedance.sdk.component.le.ouw.ouw.vt.vt vtVar;
        com.bytedance.sdk.component.le.ouw.ouw.vt.fkw fkwVar;
        if (com.bytedance.sdk.component.le.ouw.vt.ouw.ouw() && (fkwVar = this.vt) != null && this.pno != null && fkwVar.vt(i10)) {
            return true;
        }
        if (com.bytedance.sdk.component.le.ouw.vt.ouw.fkw() && (vtVar = this.yu) != null && this.tlj != null && vtVar.vt(i10)) {
            return true;
        }
        if (com.bytedance.sdk.component.le.ouw.vt.ouw.vt() && (ouwVar = this.f11797lh) != null && this.bly != null && ouwVar.vt(i10)) {
            return true;
        }
        if (com.bytedance.sdk.component.le.ouw.vt.ouw.lh() && (raVar = this.fkw) != null && this.f11794cf != null && raVar.vt(i10)) {
            return true;
        }
        if (!com.bytedance.sdk.component.le.ouw.vt.ouw.yu() || (lhVar = this.f11796le) == null || this.ryl == null || !lhVar.vt(i10)) {
            return com.bytedance.sdk.component.le.ouw.vt.ouw.le() && (leVar = this.f11798ra) != null && this.mwh != null && leVar.vt(i10);
        }
        return true;
    }
}
