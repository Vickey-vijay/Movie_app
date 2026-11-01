package com.bytedance.sdk.openadsdk.component.reward.ouw;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.widget.FrameLayout;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.model.od;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.uoy;

/* JADX INFO: loaded from: classes8.dex */
public final class ra extends bly implements Handler.Callback {
    private int ex;
    public int fkw;
    private int jae;
    private int jqy;
    private int ksc;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public boolean f12394le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public int f12395lh;

    /* JADX INFO: renamed from: od, reason: collision with root package name */
    private boolean f12396od;
    public boolean ouw;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public int f12397ra;

    /* JADX INFO: renamed from: tc, reason: collision with root package name */
    private boolean f12398tc;
    private boolean vpp;
    public long vt;
    public int yu;
    private final Handler zin;

    /* JADX INFO: Access modifiers changed from: private */
    public void jg() {
        int i10 = !this.f12398tc ? this.fkw - this.f12395lh : this.fkw + this.jae;
        com.bytedance.sdk.openadsdk.core.zih.yu();
        int i11 = com.bytedance.sdk.openadsdk.core.settings.cf.qbp(String.valueOf(this.ryl.f12378le)).f13074le;
        int i12 = this.yu;
        boolean z10 = false;
        boolean z11 = i12 <= 0 || (((float) i10) / ((float) i12)) * 100.0f >= ((float) i11);
        com.bytedance.sdk.openadsdk.core.zih.yu();
        int iOuw = com.bytedance.sdk.openadsdk.core.settings.cf.ouw(String.valueOf(this.ryl.f12378le));
        com.bytedance.sdk.component.utils.ko.vt("RVIVPlayableNewManager", "tryRewardVerifyByOnlyPlayable: isPlayableWatchingRateOk = " + z11 + ",playedSecond =" + i10 + ",watchingRate =" + i11 + ",playableRewardType =" + iOuw);
        if (iOuw == 0) {
            com.bytedance.sdk.openadsdk.zin.ouw.ouw ouwVar = this.f12341vm;
            boolean zFkw = ouwVar != null ? ouwVar.fkw() : false;
            if (this.f12338ko) {
                zFkw = true;
            }
            if (z11 && zFkw) {
                z10 = true;
            }
        } else if (iOuw == 1) {
            z10 = z11;
        }
        if (z10) {
            this.ryl.fqk.ouw(true);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ouw.bly
    public final boolean bly() {
        return this.f12394le;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ouw.bly
    public final void fkw() {
        if (this.f12337jg) {
            super.fkw();
            pno();
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0092  */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 900) {
            boolean z10 = false;
            if (!(this.pno && od.lh(this.ryl.vt) && !this.f12340th.get())) {
                return true;
            }
            int i10 = message.arg1;
            if (this.f12398tc) {
                int i11 = this.fkw;
                int i12 = this.jae;
                int i13 = i11 + i12;
                int i14 = this.yu;
                if (i13 < i14) {
                    this.jae = i12 + 1;
                    Message messageObtain = Message.obtain();
                    messageObtain.what = TypedValues.Custom.TYPE_INT;
                    messageObtain.arg1 = 0;
                    this.zin.sendMessageDelayed(messageObtain, 1000L);
                } else {
                    this.jae = i14 - i11;
                }
            } else if (i10 > 0) {
                if (this.jqy == 0 && 2 == this.f12397ra) {
                    z10 = true;
                }
                this.ryl.uoy.yu(true);
                if (!z10) {
                    this.ryl.uoy.ouw(String.valueOf(i10), null);
                }
                Message messageObtain2 = Message.obtain();
                messageObtain2.what = TypedValues.Custom.TYPE_INT;
                int i15 = i10 - 1;
                messageObtain2.arg1 = i15;
                this.zin.sendMessageDelayed(messageObtain2, 1000L);
                this.f12395lh = i15;
                this.ex = i10;
            } else {
                this.f12394le = true;
                if (od.pno(this.tlj)) {
                    od odVarOuw = od.ouw(this.tlj);
                    if ((odVarOuw != null && odVarOuw.tlj) && this.f12341vm.tlj) {
                        this.ryl.uoy.yu(false);
                        this.ryl.f12387th.set(true);
                        this.ryl.coz.jg();
                    } else {
                        this.ryl.uoy.vt();
                        this.ryl.uoy.fkw(true);
                    }
                } else {
                    this.ryl.uoy.yu(false);
                    this.ryl.f12387th.set(true);
                    this.ryl.coz.jg();
                }
                com.bytedance.sdk.openadsdk.zin.ouw.ouw ouwVar = this.f12341vm;
                if (ouwVar == null || ouwVar.tlj) {
                    this.f12338ko = true;
                }
                if (this.ksc > 0) {
                    this.f12398tc = true;
                    this.jae++;
                    Message messageObtain3 = Message.obtain();
                    messageObtain3.what = TypedValues.Custom.TYPE_INT;
                    messageObtain3.arg1 = 0;
                    this.zin.sendMessageDelayed(messageObtain3, 1000L);
                }
                this.ex = 0;
            }
            jg();
        }
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ouw.bly
    public final void le() {
        if (this.f12337jg && !this.f12339rn) {
            super.le();
            this.zin.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ouw.bly
    public final void lh() {
        int i10;
        if (this.f12337jg) {
            boolean z10 = true;
            this.pno = true;
            com.bytedance.sdk.component.utils.ko.vt("RVIVPlayableNewManager", "showPlayable,countDownShowType =" + this.f12397ra + ",mPlayableDurationTime =" + this.yu + ",mPlayableCloseTime=" + this.fkw);
            if (this.ryl.euf || (1 != (i10 = this.f12397ra) && 2 != i10)) {
                z10 = false;
            }
            if (z10) {
                this.f12341vm.f13617rn = new com.bytedance.sdk.openadsdk.zin.ouw.ouw.InterfaceC0162ouw() { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.ra.2
                    @Override // com.bytedance.sdk.openadsdk.zin.ouw.ouw.InterfaceC0162ouw
                    public final void ouw(int i11) {
                        if (ra.this.f12396od) {
                            return;
                        }
                        ra.this.jqy = i11;
                        ra raVar = ra.this;
                        raVar.f12341vm.f13617rn = null;
                        raVar.vt(i11);
                    }
                };
            }
            this.f12341vm.ouw();
            if (od.pno(this.tlj)) {
                this.ryl.bs.vt();
            }
            this.vt = System.currentTimeMillis();
            if (!z10) {
                vt(0);
            }
            this.ryl.fqk.zih();
            com.bytedance.sdk.openadsdk.component.reward.tlj tljVar = this.ryl.ycd;
            if (tljVar != null) {
                tljVar.ouw(this.yu);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ouw.bly
    public final void pno() {
        if (this.f12337jg) {
            this.vpp = true;
            this.zin.removeMessages(TypedValues.Custom.TYPE_INT);
            this.zin.removeMessages(600);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ouw.bly
    public final int ra() {
        return this.ex;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ouw.bly
    public final void yu() {
        com.bytedance.sdk.openadsdk.core.widget.vt vtVar;
        if (this.f12337jg) {
            super.yu();
            if (DeviceUtils.ra() == 0) {
                this.ryl.f12373cj = true;
            }
            ouw ouwVar = this.ryl;
            if (ouwVar.f12373cj) {
                ouwVar.uoy.vt(true);
                lh(true);
            }
            com.bytedance.sdk.openadsdk.component.reward.vt.vt vtVar2 = this.ryl.coz;
            if ((vtVar2 == null || (vtVar = vtVar2.mwh) == null || !vtVar.isShowing()) && tlj() && this.f12395lh > 0) {
                ouw(0L);
            }
        }
    }

    public ra(ouw ouwVar) {
        int i10;
        super(ouwVar);
        this.zin = new Handler(this);
        this.ouw = false;
        this.vt = 0L;
        this.f12395lh = 0;
        this.yu = 0;
        this.fkw = 0;
        this.f12394le = false;
        this.vpp = false;
        this.jqy = 0;
        this.f12398tc = false;
        this.ksc = 0;
        this.jae = 0;
        this.f12396od = false;
        od odVarOuw = od.ouw(this.tlj);
        if (odVarOuw == null) {
            i10 = 0;
        } else {
            i10 = odVarOuw.f12784cf;
        }
        this.f12397ra = i10;
        this.yu = this.tlj.od();
        int iNjr = this.tlj.njr();
        this.fkw = iNjr;
        this.ksc = Math.max(0, this.yu - iNjr);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ouw.bly
    public final void ouw() {
        if (this.f12337jg && !this.mwh) {
            super.ouw();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ouw.bly
    public final com.bytedance.sdk.openadsdk.mwh.le vt() {
        return new com.bytedance.sdk.openadsdk.mwh.le() { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.ra.1
            @Override // com.bytedance.sdk.openadsdk.mwh.le
            public final void ouw() {
                ra.this.jg();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vt(int i10) {
        ouw(this.fkw);
        if (this.vpp) {
            return;
        }
        Handler handler = this.zin;
        handler.sendMessage(handler.obtainMessage(TypedValues.Custom.TYPE_INT, this.fkw, i10));
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ouw.bly
    public final void ouw(boolean z10) {
        AdSlot adSlot;
        com.bytedance.sdk.openadsdk.zin.ouw.vt vtVar;
        if (this.zih != null) {
            try {
                com.bytedance.sdk.openadsdk.zin.ouw.yu yuVarOuw = com.bytedance.sdk.openadsdk.zin.ouw.yu.ouw();
                vpp vppVar = this.tlj;
                FrameLayout frameLayout = this.zih;
                com.bytedance.sdk.openadsdk.mwh.le leVarVt = vt();
                com.bytedance.sdk.openadsdk.zin.ouw.vt vtVar2 = null;
                if (yuVarOuw.vt() && (adSlot = vppVar.yiz) != null && !TextUtils.isEmpty(adSlot.getBidAdm()) && od.le(vppVar) && frameLayout != null) {
                    String strUx = vppVar.ux();
                    if (!TextUtils.isEmpty(strUx)) {
                        int i10 = -1;
                        int i11 = 0;
                        while (true) {
                            if (i11 >= yuVarOuw.vt.size()) {
                                vtVar = null;
                                break;
                            }
                            vtVar = yuVarOuw.vt.get(i11);
                            if (strUx.equals(vtVar.zin)) {
                                i10 = i11;
                                break;
                            }
                            i11++;
                        }
                        if (vtVar != null) {
                            yuVarOuw.ouw.removeMessages(strUx.hashCode());
                            yuVarOuw.vt.remove(i10);
                            com.bytedance.sdk.component.utils.ko.ouw("PlayablePreRenderManager", "getPreRenderPlayable success, size:", Integer.valueOf(yuVarOuw.vt.size()));
                            vppVar.kn();
                            com.bytedance.sdk.component.utils.ko.vt("PlayablePreManager", "initPreRenderPlb");
                            vtVar.qbp = frameLayout;
                            frameLayout.addView(vtVar.f13623th);
                            vtVar.f13624vm = leVarVt;
                            if (vtVar.zih) {
                                vtVar.f13624vm.ouw();
                            }
                            com.bytedance.sdk.openadsdk.yu.lh.ouw(vppVar, uoy.lh(vppVar.yiz.getDurationSlotType()), "PL_use_pre_render");
                            vtVar2 = vtVar;
                        } else {
                            com.bytedance.sdk.component.utils.ko.vt("PlayablePreRenderManager", "getPreRenderPlayable fail");
                        }
                    }
                }
                this.f12341vm = vtVar2;
                vtVar2.ouw(this.ryl.fqk);
            } catch (Throwable th2) {
                th2.printStackTrace();
                qbp.lh("RVIVPlayableNewManager", "PreRender injection exception" + th2.getMessage());
            }
            if (this.f12341vm == null) {
                super.ouw(z10);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ouw.bly
    public final void ouw(int i10) {
        this.f12395lh = i10;
        this.ex = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ouw.bly
    public final void ouw(long j10) {
        if (this.f12337jg && this.pno && !this.ryl.f12372cf.get() && this.vpp) {
            this.vpp = false;
            Message messageObtain = Message.obtain();
            messageObtain.what = TypedValues.Custom.TYPE_INT;
            messageObtain.arg1 = this.f12395lh;
            messageObtain.arg2 = this.jqy;
            this.zin.sendMessageDelayed(messageObtain, j10);
        }
    }
}
