package com.bytedance.sdk.openadsdk.component.reward.ouw;

import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.ironsource.C3426d4;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes8.dex */
public final class mwh {
    public String bly;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public volatile long f12366le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public final vpp f12367lh;
    public com.bytedance.adsdk.ugeno.vt.lh mwh;
    public final ouw ouw;
    public volatile long pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public volatile long f12368ra;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    public boolean f12369rn;
    public com.bytedance.adsdk.ugeno.vt.lh ryl;
    public FrameLayout vt;
    public final AtomicBoolean yu = new AtomicBoolean(false);
    public final AtomicBoolean fkw = new AtomicBoolean(false);
    private final AtomicBoolean zih = new AtomicBoolean(false);
    public long tlj = 0;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public long f12363cf = 0;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    public String f12364jg = null;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    public boolean f12365ko = false;

    public final void ouw() {
        com.bytedance.sdk.openadsdk.core.cf.pno.ouw ouwVar;
        vpp vppVar = this.f12367lh;
        if (vppVar == null || (ouwVar = vppVar.upp) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.cf.yu.vt vtVar = new com.bytedance.sdk.openadsdk.core.cf.yu.vt(this.ouw.jvy, this.f12367lh, ouwVar, this.bly, new com.bytedance.sdk.openadsdk.core.cf.ra.vt() { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.mwh.1
            @Override // com.bytedance.sdk.openadsdk.core.cf.ra.lh
            public final void ouw(String str) {
                mwh.this.tlj = SystemClock.elapsedRealtime();
            }

            @Override // com.bytedance.sdk.openadsdk.core.cf.ra.lh
            public final void vt(String str) {
                mwh mwhVar = mwh.this;
                mwhVar.f12364jg = str;
                com.bytedance.sdk.openadsdk.yu.lh.ouw(mwhVar.f12367lh, false, mwhVar.bly, "success", SystemClock.elapsedRealtime() - mwh.this.tlj, str, CampaignEx.JSON_NATIVE_VIDEO_ENDCARD, 0, null);
            }

            @Override // com.bytedance.sdk.openadsdk.core.cf.ra.lh
            public final void ouw(int i10, String str, String str2) {
                mwh mwhVar = mwh.this;
                mwhVar.f12364jg = str2;
                mwhVar.yu.set(false);
                mwh mwhVar2 = mwh.this;
                com.bytedance.sdk.openadsdk.yu.lh.ouw(mwhVar2.f12367lh, false, mwhVar2.bly, C3426d4.g.f28496e, SystemClock.elapsedRealtime() - mwh.this.tlj, str2, CampaignEx.JSON_NATIVE_VIDEO_ENDCARD, i10, str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.cf.ra.vt
            public final void ouw() {
                mwh mwhVar = mwh.this;
                mwhVar.f12366le = SystemClock.elapsedRealtime();
                com.bytedance.sdk.openadsdk.yu.lh.ouw(mwhVar.f12367lh, mwhVar.bly);
            }

            @Override // com.bytedance.sdk.openadsdk.core.cf.ra.vt
            public final void ouw(int i10, String str) {
                mwh.this.yu.set(false);
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                mwh mwhVar = mwh.this;
                com.bytedance.sdk.openadsdk.yu.lh.ouw(mwhVar.f12367lh, mwhVar.bly, jElapsedRealtime - mwhVar.f12366le, i10, str, (String) null);
            }

            @Override // com.bytedance.sdk.openadsdk.core.cf.ra.vt
            public final void ouw(com.bytedance.adsdk.ugeno.vt.lh<View> lhVar) {
                com.bytedance.sdk.openadsdk.core.cf.pno.ouw ouwVar2;
                mwh mwhVar = mwh.this;
                mwhVar.ryl = lhVar;
                mwhVar.yu.set(true);
                mwh.this.f12368ra = SystemClock.elapsedRealtime();
                if (mwh.this.ouw.bs.cf()) {
                    View viewTlj = mwh.this.ouw.ey.tlj();
                    if (viewTlj instanceof com.bytedance.sdk.openadsdk.core.le.yu) {
                        ((com.bytedance.sdk.openadsdk.core.le.yu) viewTlj).setImageResource(com.bytedance.sdk.component.utils.vpp.yu(mwh.this.ouw.hun, "tt_skip_btn"));
                    }
                }
                final mwh mwhVar2 = mwh.this;
                vpp vppVar2 = mwhVar2.f12367lh;
                if (vppVar2 != null && (ouwVar2 = vppVar2.nit) != null) {
                    com.bytedance.sdk.openadsdk.core.cf.yu.vt vtVar2 = new com.bytedance.sdk.openadsdk.core.cf.yu.vt(mwhVar2.ouw.jvy, mwhVar2.f12367lh, ouwVar2, mwhVar2.bly, new com.bytedance.sdk.openadsdk.core.cf.ra.vt() { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.mwh.3
                        @Override // com.bytedance.sdk.openadsdk.core.cf.ra.vt
                        public final void ouw() {
                        }

                        @Override // com.bytedance.sdk.openadsdk.core.cf.ra.lh
                        public final void ouw(String str) {
                            mwh.this.f12363cf = SystemClock.elapsedRealtime();
                        }

                        @Override // com.bytedance.sdk.openadsdk.core.cf.ra.lh
                        public final void vt(String str) {
                            mwh mwhVar3 = mwh.this;
                            com.bytedance.sdk.openadsdk.yu.lh.ouw(mwhVar3.f12367lh, true, mwhVar3.bly, "success", SystemClock.elapsedRealtime() - mwh.this.f12363cf, str, CampaignEx.JSON_NATIVE_VIDEO_ENDCARD, 0, null);
                        }

                        @Override // com.bytedance.sdk.openadsdk.core.cf.ra.lh
                        public final void ouw(int i10, String str, String str2) {
                            mwh.this.fkw.set(false);
                            mwh mwhVar3 = mwh.this;
                            com.bytedance.sdk.openadsdk.yu.lh.ouw(mwhVar3.f12367lh, true, mwhVar3.bly, C3426d4.g.f28496e, SystemClock.elapsedRealtime() - mwh.this.f12363cf, str2, CampaignEx.JSON_NATIVE_VIDEO_ENDCARD, i10, str);
                        }

                        @Override // com.bytedance.sdk.openadsdk.core.cf.ra.vt
                        public final void ouw(int i10, String str) {
                            mwh.this.fkw.set(false);
                        }

                        @Override // com.bytedance.sdk.openadsdk.core.cf.ra.vt
                        public final void ouw(com.bytedance.adsdk.ugeno.vt.lh<View> lhVar2) {
                            mwh mwhVar3 = mwh.this;
                            mwhVar3.mwh = lhVar2;
                            mwhVar3.fkw.set(true);
                        }
                    });
                    vtVar2.ouw = new com.bytedance.sdk.openadsdk.core.cf.ra.ouw() { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.mwh.4
                        @Override // com.bytedance.sdk.openadsdk.core.cf.ra.ouw
                        public final String ouw() {
                            return "overlay";
                        }

                        @Override // com.bytedance.sdk.openadsdk.core.cf.ra.ouw
                        public final void vt() {
                            mwh mwhVar3 = mwh.this;
                            mwhVar3.f12365ko = true;
                            mwhVar3.ouw.ey.tlj().performClick();
                        }
                    };
                    vtVar2.ouw();
                    vtVar2.vt = mwhVar2.ouw.ey.tlj();
                }
                mwh.this.yu();
                mwh mwhVar3 = mwh.this;
                com.bytedance.sdk.openadsdk.yu.lh.ouw(mwhVar3.f12367lh, mwhVar3.bly, mwhVar3.f12368ra - mwh.this.f12366le);
            }
        });
        if (this.f12367lh.nit != null) {
            vtVar.ouw = new com.bytedance.sdk.openadsdk.core.cf.ra.ouw() { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.mwh.2
                @Override // com.bytedance.sdk.openadsdk.core.cf.ra.ouw
                public final String ouw() {
                    return "normal";
                }

                @Override // com.bytedance.sdk.openadsdk.core.cf.ra.ouw
                public final void vt() {
                }
            };
        }
        vtVar.ouw();
        vtVar.vt = this.ouw.ey.tlj();
    }

    private void le() {
        com.bytedance.sdk.openadsdk.yu.lh.lh(this.f12367lh, this.bly);
    }

    public final void lh() {
        com.bytedance.adsdk.ugeno.vt.lh lhVar = this.mwh;
        if (lhVar != null) {
            this.vt.addView(lhVar.fkw, new FrameLayout.LayoutParams(this.mwh.od(), this.mwh.cd()));
        }
    }

    public final void yu() {
        if (this.pno <= 0 || this.f12368ra <= 0 || this.zih.getAndSet(true)) {
            return;
        }
        com.bytedance.sdk.openadsdk.yu.lh.vt(this.f12368ra - this.pno, this.f12367lh, this.bly, this.f12364jg);
    }

    public mwh(ouw ouwVar) {
        this.ouw = ouwVar;
        this.f12367lh = ouwVar.vt;
        this.bly = ouwVar.fkw;
    }

    public final void fkw() {
        com.bytedance.sdk.openadsdk.yu.lh.ouw(SystemClock.elapsedRealtime() - this.pno, this.f12367lh, this.bly);
    }

    public final void vt() {
        le();
        yu();
        com.bytedance.adsdk.ugeno.vt.lh lhVar = this.ryl;
        if (lhVar != null) {
            this.vt.addView(lhVar.fkw, new FrameLayout.LayoutParams(this.ryl.od(), this.ryl.cd()));
        }
    }

    public final void ouw(int i10) {
        osn.ouw((View) this.vt, i10);
    }
}
