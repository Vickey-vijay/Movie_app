package com.bytedance.sdk.openadsdk.component.reward;

import android.os.CountDownTimer;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.yu.fkw.vt.ko;

/* JADX INFO: loaded from: classes5.dex */
public final class lh implements com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private final ouw f12329lh;
    public final com.bykv.vk.openvk.ouw.ouw.ouw.vt.ouw ouw;
    private long pno;
    public com.bytedance.sdk.openadsdk.core.mwh.yu.ouw.InterfaceC0131ouw vt;
    private final vpp yu;
    private boolean fkw = true;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private long f12328le = 0;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private boolean f12330ra = false;

    public static class ouw implements com.bykv.vk.openvk.ouw.ouw.ouw.ouw {
        public long bly;
        public int fkw = 0;

        /* JADX INFO: renamed from: le, reason: collision with root package name */
        public CountDownTimer f12331le;

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public final com.bytedance.sdk.openadsdk.yu.ra f12332lh;
        public final long ouw;
        public long pno;

        /* JADX INFO: renamed from: ra, reason: collision with root package name */
        public com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh.ouw f12333ra;
        public final com.bykv.vk.openvk.ouw.ouw.ouw.vt.ouw vt;
        public long yu;

        @Override // com.bykv.vk.openvk.ouw.ouw.ouw.ouw
        public final int fkw() {
            return 0;
        }

        @Override // com.bykv.vk.openvk.ouw.ouw.ouw.ouw
        public final boolean lh() {
            return false;
        }

        @Override // com.bykv.vk.openvk.ouw.ouw.ouw.ouw
        public final boolean ouw() {
            return false;
        }

        @Override // com.bykv.vk.openvk.ouw.ouw.ouw.ouw
        public final int yu() {
            return 0;
        }

        public final void bly() {
            if (this.fkw == 1) {
                return;
            }
            this.fkw = 1;
            final long j10 = this.ouw;
            if (this.yu >= j10) {
                this.yu = 0L;
            }
            final long j11 = j10 - this.yu;
            CountDownTimer countDownTimer = new CountDownTimer(j11) { // from class: com.bytedance.sdk.openadsdk.component.reward.lh.ouw.1
                @Override // android.os.CountDownTimer
                public final void onFinish() {
                    com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh.ouw ouwVar = ouw.this.f12333ra;
                    if (ouwVar != null) {
                        long j12 = j10;
                        ouwVar.ouw(j12, j12);
                    }
                    ouw ouwVar2 = ouw.this;
                    ouwVar2.fkw = 4;
                    long j13 = j10;
                    ouwVar2.pno = j13;
                    ouwVar2.yu = j13;
                    com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh.ouw ouwVar3 = ouwVar2.f12333ra;
                    if (ouwVar3 != null) {
                        ouwVar3.ouw(j13, 100);
                    }
                    ko.ouw ouwVar4 = new ko.ouw();
                    ouwVar4.ouw(j10);
                    ouwVar4.vt(j10);
                    ouwVar4.vt = 0L;
                    ouwVar4.ryl = 0;
                    ouw ouwVar5 = ouw.this;
                    ouwVar4.f13478le = ouwVar5.bly;
                    com.bytedance.sdk.openadsdk.yu.fkw.ouw.ouw.vt(ouwVar5.vt, ouwVar4, ouwVar5.f12332lh);
                }

                @Override // android.os.CountDownTimer
                public final void onTick(long j12) {
                    long j13 = j11 - j12;
                    ouw ouwVar = ouw.this;
                    long j14 = j13 + ouwVar.yu;
                    ouwVar.pno = j14;
                    com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh.ouw ouwVar2 = ouwVar.f12333ra;
                    if (ouwVar2 != null) {
                        ouwVar2.ouw(j14, j10);
                    }
                }
            };
            this.f12331le = countDownTimer;
            countDownTimer.start();
        }

        @Override // com.bykv.vk.openvk.ouw.ouw.ouw.ouw
        public final boolean le() {
            return this.fkw == 1;
        }

        @Override // com.bykv.vk.openvk.ouw.ouw.ouw.ouw
        public final boolean pno() {
            return this.fkw == 0;
        }

        @Override // com.bykv.vk.openvk.ouw.ouw.ouw.ouw
        public final boolean ra() {
            return this.fkw == 2;
        }

        @Override // com.bykv.vk.openvk.ouw.ouw.ouw.ouw
        public final boolean vt() {
            return this.fkw == 4;
        }

        public ouw(long j10, com.bykv.vk.openvk.ouw.ouw.ouw.vt.ouw ouwVar, com.bytedance.sdk.openadsdk.yu.ra raVar) {
            this.ouw = j10;
            this.vt = ouwVar;
            this.f12332lh = raVar;
        }
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh
    public final boolean ex() {
        return false;
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh
    public final void ouw(long j10) {
        this.pno = j10;
        ouw ouwVar = this.f12329lh;
        if (ouwVar != null) {
            ouwVar.bly = j10;
        }
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh
    public final boolean ouw(float f10) {
        return false;
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh
    public final boolean tc() {
        return false;
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh
    public final void tlj() {
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh
    public final int vm() {
        return 0;
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh
    public final com.bykv.vk.openvk.ouw.ouw.ouw.yu.vt vpp() {
        return null;
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh
    public final long zih() {
        return 0L;
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh
    public final void bly() {
        ouw ouwVar = this.f12329lh;
        ouwVar.pno = 0L;
        ouwVar.bly();
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh
    public final void cf() {
        ouw ouwVar = this.f12329lh;
        ouwVar.fkw = 2;
        ouwVar.yu = ouwVar.pno;
        CountDownTimer countDownTimer = ouwVar.f12331le;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            ouwVar.f12331le = null;
        }
        ko.ouw ouwVar2 = new ko.ouw();
        ouwVar2.ouw(this.f12329lh.pno);
        ouwVar2.vt(this.f12329lh.ouw);
        ouwVar2.vt = 0L;
        ouwVar2.f13478le = this.pno;
        com.bytedance.sdk.openadsdk.yu.fkw.ouw.ouw.ouw(this.ouw, ouwVar2);
        com.bytedance.sdk.openadsdk.core.mwh.yu.ouw.InterfaceC0131ouw interfaceC0131ouw = this.vt;
        if (interfaceC0131ouw != null) {
            interfaceC0131ouw.ouw(2);
        }
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh
    public final boolean jqy() {
        return this.f12329lh.vt();
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh
    public final void mwh() {
        ouw ouwVar = this.f12329lh;
        ouwVar.fkw = 0;
        CountDownTimer countDownTimer = ouwVar.f12331le;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            ouwVar.f12331le = null;
        }
        if (ouwVar.f12333ra != null) {
            ouwVar.f12333ra = null;
        }
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh
    public final int qbp() {
        ouw ouwVar = this.f12329lh;
        return com.bykv.vk.openvk.ouw.ouw.vt.yu.ouw.ouw(ouwVar.pno, ouwVar.ouw);
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh
    public final long rn() {
        return this.f12329lh.pno;
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh
    public final void ryl() {
        this.f12329lh.bly();
        ko.ouw ouwVar = new ko.ouw();
        ouwVar.ouw(this.f12329lh.pno);
        ouwVar.vt(this.f12329lh.ouw);
        ouwVar.vt = 0L;
        com.bytedance.sdk.openadsdk.yu.fkw.ouw.ouw.vt(this.ouw, ouwVar);
        com.bytedance.sdk.openadsdk.core.mwh.yu.ouw.InterfaceC0131ouw interfaceC0131ouw = this.vt;
        if (interfaceC0131ouw != null) {
            interfaceC0131ouw.ouw(1);
        }
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh
    public final long th() {
        return this.f12329lh.ouw;
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh
    public final com.bykv.vk.openvk.ouw.ouw.ouw.ouw zin() {
        return this.f12329lh;
    }

    public lh(vpp vppVar, com.bytedance.sdk.openadsdk.yu.ra raVar) {
        long j10;
        com.bykv.vk.openvk.ouw.ouw.ouw.vt.ouw ouwVar = new com.bykv.vk.openvk.ouw.ouw.ouw.vt.ouw() { // from class: com.bytedance.sdk.openadsdk.component.reward.lh.1
        };
        this.ouw = ouwVar;
        this.yu = vppVar;
        com.bykv.vk.openvk.ouw.ouw.ouw.lh.vt vtVar = vppVar.f12874sd;
        long j11 = 10;
        if (vtVar != null) {
            j10 = (long) vtVar.yu;
        } else {
            j10 = 10;
        }
        if (j10 <= 0) {
            vtVar.yu = 10.0d;
        } else {
            j11 = j10;
        }
        this.f12329lh = new ouw(j11 * 1000, ouwVar, raVar);
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh
    public final void jg() {
        mwh();
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh
    public final void ko() {
        mwh();
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh
    public final void ouw(boolean z10, String str) {
        this.f12330ra = z10;
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh
    public final void ouw(com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh.ouw ouwVar) {
        this.f12329lh.f12333ra = ouwVar;
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh
    public final boolean ouw(com.bykv.vk.openvk.ouw.ouw.ouw.lh.lh lhVar) {
        this.f12330ra = lhVar.f10442cf;
        long j10 = lhVar.tlj;
        if (j10 > 0) {
            this.f12329lh.yu = j10;
        }
        lhVar.yu = com.bytedance.sdk.openadsdk.vpp.ouw.ouw("player_force_raw_url", 0) == 1;
        com.bytedance.sdk.openadsdk.yu.fkw.ouw.ouw.ouw(this.yu, this.ouw, lhVar);
        this.f12329lh.bly();
        com.bytedance.sdk.openadsdk.core.mwh.yu.ouw.InterfaceC0131ouw interfaceC0131ouw = this.vt;
        if (interfaceC0131ouw != null) {
            interfaceC0131ouw.ouw(1);
        }
        return true;
    }
}
