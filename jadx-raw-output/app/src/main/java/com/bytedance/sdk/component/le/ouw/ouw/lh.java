package com.bytedance.sdk.component.le.ouw.ouw;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.le.ouw.ouw.ouw.ouw.ra;
import com.bytedance.sdk.component.le.ouw.pno;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class lh implements yu {
    public com.bytedance.sdk.component.le.ouw.yu.vt.ouw bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public com.bytedance.sdk.component.le.ouw.yu.vt.ouw f11799cf;
    public com.bytedance.sdk.component.le.ouw.ouw.ouw.ouw.le fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public com.bytedance.sdk.component.le.ouw.ouw.ouw.ouw.fkw f11800le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public com.bytedance.sdk.component.le.ouw.ouw.ouw.ouw.vt f11801lh;
    public com.bytedance.sdk.component.le.ouw.ouw.ouw.ouw.yu ouw;
    public com.bytedance.sdk.component.le.ouw.yu.vt.ouw pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public com.bytedance.sdk.component.le.ouw.yu.vt.ouw f11802ra;
    public com.bytedance.sdk.component.le.ouw.yu.vt.ouw ryl;
    public com.bytedance.sdk.component.le.ouw.yu.vt.ouw tlj;
    public com.bytedance.sdk.component.le.ouw.ouw.ouw.ouw.ouw vt;
    public ra yu;

    @Override // com.bytedance.sdk.component.le.ouw.ouw.yu
    public final void ouw(com.bytedance.sdk.component.le.ouw.yu.ouw ouwVar, int i10) {
        if (ouwVar == null) {
            return;
        }
        try {
            ouwVar.vt(System.currentTimeMillis());
            if (ouwVar.yu() == 0 && ouwVar.fkw() == 1) {
                if (com.bytedance.sdk.component.le.ouw.vt.ouw.ouw()) {
                    this.ouw.ouw(ouwVar);
                    return;
                }
                return;
            }
            if (ouwVar.yu() == 3 && ouwVar.fkw() == 2) {
                if (com.bytedance.sdk.component.le.ouw.vt.ouw.fkw()) {
                    this.f11801lh.ouw(ouwVar);
                    return;
                }
                return;
            }
            if (ouwVar.yu() == 0 && ouwVar.fkw() == 2) {
                if (com.bytedance.sdk.component.le.ouw.vt.ouw.vt()) {
                    this.vt.ouw(ouwVar);
                    return;
                }
                return;
            }
            if (ouwVar.yu() == 1 && ouwVar.fkw() == 2) {
                if (com.bytedance.sdk.component.le.ouw.vt.ouw.lh()) {
                    this.yu.ouw(ouwVar);
                }
            } else if (ouwVar.yu() == 1 && ouwVar.fkw() == 3) {
                if (com.bytedance.sdk.component.le.ouw.vt.ouw.yu()) {
                    this.fkw.ouw(ouwVar);
                }
            } else if (ouwVar.yu() == 2 && ouwVar.fkw() == 3 && com.bytedance.sdk.component.le.ouw.vt.ouw.le()) {
                this.f11800le.ouw(ouwVar);
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
            com.bytedance.sdk.component.le.ouw.vt.yu yuVar = com.bytedance.sdk.component.le.ouw.vt.yu.ouw;
            com.bytedance.sdk.component.le.ouw.fkw fkwVar = pno.vt().bly;
        }
    }

    public lh() {
        Context context = pno.vt().ouw;
        if (com.bytedance.sdk.component.le.ouw.vt.ouw.ouw()) {
            this.f11802ra = pno.vt().vt;
            this.ouw = new com.bytedance.sdk.component.le.ouw.ouw.ouw.ouw.yu(context, this.f11802ra);
        }
        if (com.bytedance.sdk.component.le.ouw.vt.ouw.fkw()) {
            if (pno.vt().f11813le != null) {
                this.bly = pno.vt().f11813le;
            } else {
                this.bly = pno.vt().f11814lh;
            }
            this.f11801lh = new com.bytedance.sdk.component.le.ouw.ouw.ouw.ouw.vt(context, this.bly);
        }
        if (com.bytedance.sdk.component.le.ouw.vt.ouw.vt()) {
            this.pno = pno.vt().f11814lh;
            this.vt = new com.bytedance.sdk.component.le.ouw.ouw.ouw.ouw.ouw(context, this.pno);
        }
        if (com.bytedance.sdk.component.le.ouw.vt.ouw.lh()) {
            this.tlj = pno.vt().f11814lh;
            this.yu = new ra(context, this.tlj);
        }
        if (com.bytedance.sdk.component.le.ouw.vt.ouw.yu()) {
            this.f11799cf = pno.vt().yu;
            this.fkw = new com.bytedance.sdk.component.le.ouw.ouw.ouw.ouw.le(context, this.f11799cf);
        }
        if (com.bytedance.sdk.component.le.ouw.vt.ouw.le()) {
            this.ryl = pno.vt().fkw;
            this.f11800le = new com.bytedance.sdk.component.le.ouw.ouw.ouw.ouw.fkw(context, this.ryl);
        }
    }

    @Override // com.bytedance.sdk.component.le.ouw.ouw.yu
    public final void ouw(int i10, List<com.bytedance.sdk.component.le.ouw.yu.ouw> list) {
        com.bytedance.sdk.component.le.ouw.lh.vt.ouw();
        if (list != null && list.size() != 0 && list.get(0) != null) {
            com.bytedance.sdk.component.le.ouw.yu.ouw ouwVar = list.get(0);
            if (i10 == 200 || i10 == -1) {
                com.bytedance.sdk.component.le.ouw.vt.yu yuVar = com.bytedance.sdk.component.le.ouw.vt.yu.ouw;
                list.size();
                com.bytedance.sdk.component.le.ouw.fkw fkwVar = pno.vt().bly;
                if (i10 != 200) {
                    list.size();
                    com.bytedance.sdk.component.le.ouw.fkw fkwVar2 = pno.vt().bly;
                }
                if (ouwVar.yu() == 0 && ouwVar.fkw() == 1) {
                    if (com.bytedance.sdk.component.le.ouw.vt.ouw.ouw()) {
                        this.ouw.ouw(list);
                    }
                } else if (ouwVar.yu() == 3 && ouwVar.fkw() == 2) {
                    if (com.bytedance.sdk.component.le.ouw.vt.ouw.fkw()) {
                        this.f11801lh.ouw(list);
                    }
                } else if (ouwVar.yu() == 0 && ouwVar.fkw() == 2) {
                    if (com.bytedance.sdk.component.le.ouw.vt.ouw.vt()) {
                        this.vt.ouw(list);
                    }
                } else if (ouwVar.yu() == 1 && ouwVar.fkw() == 2) {
                    if (com.bytedance.sdk.component.le.ouw.vt.ouw.lh()) {
                        this.yu.ouw(list);
                    }
                } else if (ouwVar.yu() == 1 && ouwVar.fkw() == 3) {
                    if (com.bytedance.sdk.component.le.ouw.vt.ouw.yu()) {
                        this.fkw.ouw(list);
                    }
                } else if (ouwVar.yu() == 2 && ouwVar.fkw() == 3 && com.bytedance.sdk.component.le.ouw.vt.ouw.le()) {
                    this.f11800le.ouw(list);
                }
            }
        }
        com.bytedance.sdk.component.le.ouw.lh.vt.ouw();
    }

    @Override // com.bytedance.sdk.component.le.ouw.ouw.yu
    public final List<com.bytedance.sdk.component.le.ouw.yu.ouw> ouw(int i10, int i11, List<String> list) {
        if (com.bytedance.sdk.component.le.ouw.vt.ouw.ouw()) {
            List<com.bytedance.sdk.component.le.ouw.yu.ouw> listOuw = this.ouw.ouw("_id");
            if (ouw(listOuw, list)) {
                listOuw.size();
                com.bytedance.sdk.component.le.ouw.lh.vt.ouw();
                com.bytedance.sdk.component.le.ouw.vt.yu yuVar = com.bytedance.sdk.component.le.ouw.vt.yu.ouw;
                com.bytedance.sdk.component.le.ouw.fkw fkwVar = pno.vt().bly;
                return listOuw;
            }
        }
        if (com.bytedance.sdk.component.le.ouw.vt.ouw.fkw()) {
            List<com.bytedance.sdk.component.le.ouw.yu.ouw> listOuw2 = this.f11801lh.ouw("_id");
            if (ouw(listOuw2, list)) {
                listOuw2.size();
                com.bytedance.sdk.component.le.ouw.lh.vt.ouw();
                return listOuw2;
            }
        }
        if (com.bytedance.sdk.component.le.ouw.vt.ouw.vt()) {
            List<com.bytedance.sdk.component.le.ouw.yu.ouw> listOuw3 = this.vt.ouw("_id");
            if (ouw(listOuw3, list)) {
                listOuw3.size();
                com.bytedance.sdk.component.le.ouw.lh.vt.ouw();
                com.bytedance.sdk.component.le.ouw.vt.yu yuVar2 = com.bytedance.sdk.component.le.ouw.vt.yu.ouw;
                com.bytedance.sdk.component.le.ouw.fkw fkwVar2 = pno.vt().bly;
                return listOuw3;
            }
        }
        if (com.bytedance.sdk.component.le.ouw.vt.ouw.lh()) {
            List<com.bytedance.sdk.component.le.ouw.yu.ouw> listVt = this.yu.vt("_id");
            if (ouw(listVt, list)) {
                listVt.size();
                com.bytedance.sdk.component.le.ouw.lh.vt.ouw();
                com.bytedance.sdk.component.le.ouw.vt.yu yuVar3 = com.bytedance.sdk.component.le.ouw.vt.yu.ouw;
                com.bytedance.sdk.component.le.ouw.fkw fkwVar3 = pno.vt().bly;
                return listVt;
            }
        }
        if (com.bytedance.sdk.component.le.ouw.vt.ouw.yu()) {
            List<com.bytedance.sdk.component.le.ouw.yu.ouw> listVt2 = this.fkw.vt("_id");
            if (ouw(listVt2, list)) {
                listVt2.size();
                com.bytedance.sdk.component.le.ouw.lh.vt.ouw();
                com.bytedance.sdk.component.le.ouw.vt.yu yuVar4 = com.bytedance.sdk.component.le.ouw.vt.yu.ouw;
                com.bytedance.sdk.component.le.ouw.fkw fkwVar4 = pno.vt().bly;
                return listVt2;
            }
        }
        if (!com.bytedance.sdk.component.le.ouw.vt.ouw.le()) {
            return null;
        }
        List<com.bytedance.sdk.component.le.ouw.yu.ouw> listVt3 = this.f11800le.vt("_id");
        if (!ouw(listVt3, list)) {
            return null;
        }
        listVt3.size();
        com.bytedance.sdk.component.le.ouw.lh.vt.ouw();
        return listVt3;
    }

    private static boolean ouw(List<com.bytedance.sdk.component.le.ouw.yu.ouw> list, List<String> list2) {
        if (list != null && !list.isEmpty() && list2 != null && !list2.isEmpty()) {
            try {
                Iterator<com.bytedance.sdk.component.le.ouw.yu.ouw> it = list.iterator();
                while (it.hasNext()) {
                    com.bytedance.sdk.component.le.ouw.yu.ouw next = it.next();
                    if (next != null) {
                        String strLh = next.lh();
                        if (!TextUtils.isEmpty(strLh) && list2.contains(strLh)) {
                            it.remove();
                        }
                    }
                }
            } catch (Throwable th2) {
                th2.getMessage();
                com.bytedance.sdk.component.le.ouw.lh.vt.fkw();
            }
        }
        return (list == null || list.isEmpty()) ? false : true;
    }

    @Override // com.bytedance.sdk.component.le.ouw.ouw.yu
    public final boolean ouw(int i10, boolean z10) {
        com.bytedance.sdk.component.le.ouw.ouw.ouw.ouw.fkw fkwVar;
        com.bytedance.sdk.component.le.ouw.ouw.ouw.ouw.le leVar;
        ra raVar;
        com.bytedance.sdk.component.le.ouw.ouw.ouw.ouw.ouw ouwVar;
        com.bytedance.sdk.component.le.ouw.ouw.ouw.ouw.vt vtVar;
        com.bytedance.sdk.component.le.ouw.ouw.ouw.ouw.yu yuVar;
        if (com.bytedance.sdk.component.le.ouw.vt.ouw.ouw() && (yuVar = this.ouw) != null && yuVar.ouw(i10)) {
            com.bytedance.sdk.component.le.ouw.vt.yu yuVar2 = com.bytedance.sdk.component.le.ouw.vt.yu.ouw;
            com.bytedance.sdk.component.le.ouw.fkw fkwVar2 = pno.vt().bly;
            return true;
        }
        if (com.bytedance.sdk.component.le.ouw.vt.ouw.fkw() && (vtVar = this.f11801lh) != null && vtVar.ouw(i10)) {
            return true;
        }
        if (com.bytedance.sdk.component.le.ouw.vt.ouw.vt() && (ouwVar = this.vt) != null && ouwVar.ouw(i10)) {
            com.bytedance.sdk.component.le.ouw.vt.yu yuVar3 = com.bytedance.sdk.component.le.ouw.vt.yu.ouw;
            com.bytedance.sdk.component.le.ouw.fkw fkwVar3 = pno.vt().bly;
            return true;
        }
        if (com.bytedance.sdk.component.le.ouw.vt.ouw.lh() && (raVar = this.yu) != null && raVar.le()) {
            com.bytedance.sdk.component.le.ouw.vt.yu yuVar4 = com.bytedance.sdk.component.le.ouw.vt.yu.ouw;
            com.bytedance.sdk.component.le.ouw.fkw fkwVar4 = pno.vt().bly;
            return true;
        }
        if (!com.bytedance.sdk.component.le.ouw.vt.ouw.yu() || (leVar = this.fkw) == null || !leVar.le()) {
            return com.bytedance.sdk.component.le.ouw.vt.ouw.le() && (fkwVar = this.f11800le) != null && fkwVar.le();
        }
        com.bytedance.sdk.component.le.ouw.vt.yu yuVar5 = com.bytedance.sdk.component.le.ouw.vt.yu.ouw;
        com.bytedance.sdk.component.le.ouw.fkw fkwVar5 = pno.vt().bly;
        return true;
    }

    @Override // com.bytedance.sdk.component.le.ouw.ouw.yu
    public final void ouw(int i10, long j10) {
        com.bytedance.sdk.component.le.ouw.ouw.ouw.ouw.yu yuVar = this.ouw;
        if (yuVar != null) {
            yuVar.ouw(i10, j10);
        }
        com.bytedance.sdk.component.le.ouw.ouw.ouw.ouw.vt vtVar = this.f11801lh;
        if (vtVar != null) {
            vtVar.ouw(i10, j10);
        }
        com.bytedance.sdk.component.le.ouw.ouw.ouw.ouw.ouw ouwVar = this.vt;
        if (ouwVar != null) {
            ouwVar.ouw(i10, j10);
        }
        ra raVar = this.yu;
        if (raVar != null) {
            raVar.ouw(i10, j10);
        }
        com.bytedance.sdk.component.le.ouw.ouw.ouw.ouw.le leVar = this.fkw;
        if (leVar != null) {
            leVar.ouw(i10, j10);
        }
        com.bytedance.sdk.component.le.ouw.ouw.ouw.ouw.fkw fkwVar = this.f11800le;
        if (fkwVar != null) {
            fkwVar.ouw(i10, j10);
        }
    }
}
