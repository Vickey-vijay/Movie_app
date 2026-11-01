package com.bytedance.sdk.openadsdk.component.reward.ouw;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.bs;
import com.bytedance.sdk.openadsdk.core.ksc;
import com.bytedance.sdk.openadsdk.core.model.od;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.widget.vm;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class bly {
    public final Activity bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public final String f12336cf;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    public boolean f12337jg;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    public boolean f12338ko;
    public boolean mwh;
    private com.bytedance.sdk.openadsdk.activity.yu.le ouw;
    public volatile boolean pno;
    public vm qbp;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    public boolean f12339rn;
    public final ouw ryl;

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    public AtomicBoolean f12340th = new AtomicBoolean(false);

    @NonNull
    public final vpp tlj;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.zin.ouw.ouw f12341vm;
    private boolean vt;
    public FrameLayout zih;

    public boolean bly() {
        return false;
    }

    public void lh() {
        if (this.f12337jg) {
            boolean z10 = true;
            this.pno = true;
            lh(this.ryl.f12373cj);
            this.f12341vm.ouw();
            vpp vppVar = this.tlj;
            int i10 = vppVar.mu;
            if (i10 == -1) {
                if (od.ra(vppVar)) {
                    com.bytedance.sdk.openadsdk.zin.ouw.ouw ouwVar = this.f12341vm;
                    if (ouwVar == null || !ouwVar.tlj) {
                        this.ryl.coz.zin();
                        z10 = false;
                    } else {
                        this.ryl.f12387th.set(true);
                        this.ryl.coz.jg();
                    }
                } else {
                    this.ryl.f12387th.set(true);
                    this.ryl.coz.jg();
                }
            } else if (i10 >= 0) {
                this.ryl.uoy.yu(false);
                if (od.ra(this.tlj)) {
                    com.bytedance.sdk.openadsdk.zin.ouw.ouw ouwVar2 = this.f12341vm;
                    if (ouwVar2 == null || !ouwVar2.tlj) {
                        com.bytedance.sdk.openadsdk.activity.yu.le leVar = new com.bytedance.sdk.openadsdk.activity.yu.le(i10) { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.bly.5
                            @Override // com.bytedance.sdk.openadsdk.activity.yu.le
                            public final void ouw() {
                                bly.this.ryl.ux.sendEmptyMessage(1);
                            }
                        };
                        this.ouw = leVar;
                        leVar.fkw();
                        z10 = false;
                    } else {
                        com.bytedance.sdk.openadsdk.activity.yu.le leVar2 = new com.bytedance.sdk.openadsdk.activity.yu.le(i10) { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.bly.4
                            @Override // com.bytedance.sdk.openadsdk.activity.yu.le
                            public final void ouw() {
                                bly.this.ryl.ux.sendEmptyMessage(600);
                            }
                        };
                        this.ouw = leVar2;
                        leVar2.fkw();
                    }
                } else {
                    com.bytedance.sdk.openadsdk.activity.yu.le leVar3 = new com.bytedance.sdk.openadsdk.activity.yu.le(i10) { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.bly.6
                        @Override // com.bytedance.sdk.openadsdk.activity.yu.le
                        public final void ouw() {
                            bly.this.ryl.ux.sendEmptyMessage(600);
                        }
                    };
                    this.ouw = leVar3;
                    leVar3.fkw();
                }
            } else {
                z10 = false;
            }
            if (z10) {
                ouw ouwVar3 = this.ryl;
                if (ouwVar3.f12385sd != null && ouwVar3.vt()) {
                    this.ryl.f12385sd.ouw(i10);
                }
            }
            if (od.pno(this.tlj)) {
                this.ryl.bs.vt();
            }
        }
    }

    public void ouw() {
        if (this.f12337jg && !this.mwh) {
            this.mwh = true;
        }
    }

    public void ouw(int i10) {
    }

    public final void vt(boolean z10) {
        if (this.f12337jg) {
            ouw ouwVar = this.ryl;
            if (ouwVar.lso) {
                this.zih = (FrameLayout) ouwVar.rrs.findViewById(com.bytedance.sdk.openadsdk.utils.rn.ybr);
                ouw(z10);
                if (this.ryl.vt.euf()) {
                    vm vmVar = new vm(this.ryl, new vm.ouw() { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.bly.1
                        @Override // com.bytedance.sdk.openadsdk.core.widget.vm.ouw
                        public final void fkw() {
                            bly.ouw(bly.this);
                        }

                        @Override // com.bytedance.sdk.openadsdk.core.widget.vm.ouw
                        public final void le() {
                            bly.ouw(bly.this, false);
                        }

                        @Override // com.bytedance.sdk.openadsdk.core.widget.vm.ouw
                        public final void lh() {
                            com.bytedance.sdk.openadsdk.activity.pno pnoVar;
                            com.bytedance.sdk.openadsdk.activity.vt vtVarHun;
                            bs bsVar = bly.this.f12341vm.yu;
                            if (bsVar != null) {
                                bsVar.ouw("popupDidShow", (JSONObject) null);
                            }
                            ouw ouwVar2 = bly.this.ryl;
                            if (!ouwVar2.euf || (pnoVar = ouwVar2.f12374gh) == null || (vtVarHun = pnoVar.hun()) == null) {
                                return;
                            }
                            vtVarHun.tlj.th();
                        }

                        @Override // com.bytedance.sdk.openadsdk.core.widget.vm.ouw
                        public final void ouw() {
                            bly.this.ryl.fqk.ouw("skipToNextAd", (JSONObject) null);
                        }

                        @Override // com.bytedance.sdk.openadsdk.core.widget.vm.ouw
                        public final void vt() {
                            bs bsVar = bly.this.f12341vm.yu;
                            if (bsVar != null) {
                                bsVar.ouw("popupDidDismiss", (JSONObject) null);
                            }
                            bly.ouw(bly.this, true);
                        }

                        @Override // com.bytedance.sdk.openadsdk.core.widget.vm.ouw
                        public final int yu() {
                            bly blyVar = bly.this;
                            return blyVar.ryl.euf ? blyVar.cf() : blyVar.ra();
                        }
                    });
                    this.qbp = vmVar;
                    vmVar.ouw(this.ryl.rrs);
                    bs bsVar = this.f12341vm.yu;
                    if (bsVar != null) {
                        bsVar.f12586pd = new ksc() { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.bly.2
                            @Override // com.bytedance.sdk.openadsdk.core.ksc
                            public final void t_() {
                            }

                            @Override // com.bytedance.sdk.openadsdk.core.ksc
                            public final void p_() {
                                bly blyVar = bly.this;
                                vm vmVar2 = blyVar.qbp;
                                if (vmVar2 != null) {
                                    vmVar2.ouw(blyVar.ryl.jvy);
                                }
                            }

                            @Override // com.bytedance.sdk.openadsdk.core.ksc
                            public final int q_() {
                                bly blyVar = bly.this;
                                return blyVar.ryl.euf ? blyVar.cf() : blyVar.ra();
                            }

                            @Override // com.bytedance.sdk.openadsdk.core.ksc
                            public final void r_() {
                                bly.ouw(bly.this);
                            }

                            @Override // com.bytedance.sdk.openadsdk.core.ksc
                            public final void s_() {
                                bly.ouw(bly.this, false);
                            }

                            @Override // com.bytedance.sdk.openadsdk.core.ksc
                            public final void vt() {
                                vm vmVar2 = bly.this.qbp;
                                if (vmVar2 != null) {
                                    vmVar2.vt();
                                }
                            }
                        };
                    }
                }
            }
        }
    }

    public final int cf() {
        com.bytedance.sdk.openadsdk.activity.vt vtVarHun;
        com.bytedance.sdk.openadsdk.activity.pno pnoVar = this.ryl.f12374gh;
        if (pnoVar == null || (vtVarHun = pnoVar.hun()) == null) {
            return 0;
        }
        return vtVarHun.tlj.pno();
    }

    public void fkw() {
        if (!this.f12337jg || this.f12340th.get()) {
            return;
        }
        com.bytedance.sdk.openadsdk.zin.ouw.ouw ouwVar = this.f12341vm;
        if (ouwVar != null) {
            ouwVar.lh();
        }
        com.bytedance.sdk.openadsdk.activity.yu.le leVar = this.ouw;
        if (leVar != null) {
            leVar.vt();
        }
    }

    public void le() {
        if (this.f12337jg && !this.f12339rn) {
            this.f12339rn = true;
            com.bytedance.sdk.openadsdk.zin.ouw.ouw ouwVar = this.f12341vm;
            if (ouwVar != null) {
                ouwVar.yu();
            }
            FrameLayout frameLayout = this.zih;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
            vm vmVar = this.qbp;
            if (vmVar != null) {
                vmVar.bly();
                this.qbp = null;
            }
            com.bytedance.sdk.openadsdk.activity.yu.le leVar = this.ouw;
            if (leVar != null) {
                leVar.yu();
                this.ouw = null;
            }
        }
    }

    public final void mwh() {
        if (!this.f12340th.compareAndSet(false, true)) {
            this.ryl.bs.lh();
            return;
        }
        com.bytedance.sdk.openadsdk.zin.ouw.ouw ouwVar = this.f12341vm;
        if (ouwVar != null) {
            ouwVar.ouw(true);
        }
        ouw ouwVar2 = this.ryl;
        ouwVar2.bs.yib = true;
        ouwVar2.osn.ouw(true, ouwVar2.coz);
        ouw ouwVar3 = this.ryl;
        if (ouwVar3.osn.ouw.fkw) {
            ouwVar3.f12385sd.ouw(ouwVar3.pno);
            return;
        }
        ouwVar3.bs.vt(ouwVar3.f12373cj);
        this.ryl.bs.bly();
        this.ryl.bs.le();
        this.ryl.ux.removeMessages(600);
    }

    public void pno() {
        com.bytedance.sdk.openadsdk.activity.yu.le leVar = this.ouw;
        if (leVar != null) {
            leVar.vt();
        }
    }

    public int ra() {
        long jElapsedRealtime;
        long j10;
        com.bytedance.sdk.openadsdk.activity.yu.le leVar = this.ouw;
        if (leVar == null) {
            return 0;
        }
        if (leVar.yu > leVar.f12169le) {
            jElapsedRealtime = leVar.f12170lh - (SystemClock.elapsedRealtime() - leVar.yu);
            j10 = leVar.fkw;
        } else {
            jElapsedRealtime = leVar.f12170lh;
            j10 = leVar.fkw;
        }
        long j11 = jElapsedRealtime - j10;
        if (j11 < 0) {
            j11 = 0;
        }
        return (int) (j11 / 1000);
    }

    public final boolean ryl() {
        return this.pno;
    }

    public final boolean tlj() {
        return !this.vt;
    }

    public void yu() {
        if (!this.f12337jg || this.f12340th.get()) {
            return;
        }
        com.bytedance.sdk.openadsdk.zin.ouw.ouw ouwVar = this.f12341vm;
        if (ouwVar != null) {
            ouwVar.vt();
        }
        if (this.ouw == null || !tlj()) {
            return;
        }
        this.ouw.lh();
    }

    public bly(ouw ouwVar) {
        this.ryl = ouwVar;
        this.bly = ouwVar.jvy;
        this.f12336cf = ouwVar.fkw;
        vpp vppVar = ouwVar.vt;
        this.tlj = vppVar;
        this.f12337jg = od.fkw(vppVar);
    }

    public void ouw(boolean z10) {
        FrameLayout frameLayout = this.zih;
        if (frameLayout != null) {
            ouw ouwVar = this.ryl;
            Context context = ouwVar.hun;
            vpp vppVar = this.tlj;
            int i10 = ouwVar.ucs;
            com.bytedance.sdk.openadsdk.activity.pno pnoVar = ouwVar.f12374gh;
            com.bytedance.sdk.openadsdk.zin.ouw.ouw ouwVar2 = new com.bytedance.sdk.openadsdk.zin.ouw.ouw(context, vppVar, i10, z10, frameLayout, false, pnoVar != null ? pnoVar.f12105cf : 0);
            this.f12341vm = ouwVar2;
            ouwVar2.ouw(this.ryl.fqk);
            this.f12341vm.ouw(true, vt());
        }
    }

    public void ouw(long j10) {
        com.bytedance.sdk.openadsdk.activity.yu.le leVar = this.ouw;
        if (leVar != null) {
            leVar.lh();
        }
    }

    public com.bytedance.sdk.openadsdk.mwh.le vt() {
        return new com.bytedance.sdk.openadsdk.mwh.le() { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.bly.3
            @Override // com.bytedance.sdk.openadsdk.mwh.le
            public final void ouw() {
                bly.this.ryl.fqk.ouw(false);
            }
        };
    }

    public final void ouw(com.bytedance.sdk.openadsdk.core.lh.fkw fkwVar) {
        com.bytedance.sdk.openadsdk.zin.ouw.ouw ouwVar;
        if (this.f12337jg && (ouwVar = this.f12341vm) != null) {
            ouwVar.ouw(fkwVar);
        }
    }

    public static /* synthetic */ void ouw(bly blyVar, boolean z10) {
        com.bytedance.sdk.openadsdk.activity.vt vtVarHun;
        ouw ouwVar = blyVar.ryl;
        if (ouwVar.euf) {
            com.bytedance.sdk.openadsdk.activity.pno pnoVar = ouwVar.f12374gh;
            if (pnoVar == null || (vtVarHun = pnoVar.hun()) == null) {
                return;
            }
            if (z10) {
                vtVarHun.tlj.vm();
            }
            vtVarHun.ouw(1);
            return;
        }
        if (blyVar instanceof ra) {
            blyVar.ouw(0L);
        } else {
            com.bytedance.sdk.openadsdk.activity.yu.le leVar = blyVar.ouw;
            if (leVar != null) {
                leVar.lh();
            }
        }
        blyVar.vt = false;
    }

    public static /* synthetic */ void ouw(bly blyVar) {
        com.bytedance.sdk.openadsdk.activity.vt vtVarHun;
        ouw ouwVar = blyVar.ryl;
        if (ouwVar.euf) {
            com.bytedance.sdk.openadsdk.activity.pno pnoVar = ouwVar.f12374gh;
            if (pnoVar == null || (vtVarHun = pnoVar.hun()) == null) {
                return;
            }
            vtVarHun.ouw(2);
            return;
        }
        if (blyVar instanceof ra) {
            blyVar.pno();
        } else {
            com.bytedance.sdk.openadsdk.activity.yu.le leVar = blyVar.ouw;
            if (leVar != null) {
                leVar.vt();
            }
        }
        blyVar.vt = true;
    }

    public final void lh(boolean z10) {
        if (this.f12337jg && this.f12341vm != null && this.pno) {
            this.f12341vm.ouw(z10);
        }
    }
}
