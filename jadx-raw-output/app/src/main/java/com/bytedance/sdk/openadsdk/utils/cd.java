package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity;
import com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;

/* JADX INFO: loaded from: classes2.dex */
public final class cd implements Handler.Callback, com.bytedance.sdk.openadsdk.core.mwh.yu.ouw.InterfaceC0131ouw {
    private final com.bytedance.sdk.openadsdk.component.reward.ouw.ouw bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private int f13381cf;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public boolean f13383lh;
    private final com.bytedance.sdk.openadsdk.core.model.vpp pno;
    private int ryl;
    private boolean tlj;
    public boolean vt;
    public boolean yu;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private float f13382le = 1.0f;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private int f13384ra = 1000;
    public final Handler ouw = new Handler(Looper.getMainLooper(), this);
    public int fkw = 0;

    public final void ouw() {
        if (this.vt) {
            this.ouw.removeMessages(1024);
            this.ouw.sendEmptyMessage(1024);
            this.f13383lh = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00aa  */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(@NonNull Message message) {
        com.bytedance.sdk.openadsdk.component.reward.view.yu yuVar;
        if (message.what == 1024) {
            int i10 = this.f13381cf;
            int i11 = this.fkw;
            int i12 = i10 - i11;
            this.bly.ex.ryl = ((long) i11) * 1000;
            com.bytedance.sdk.component.utils.qbp.ouw("TTAD.TopLayoutHelper", "handleMessage: currentTime= " + this.fkw + ", mRemainTimeInSeconds=" + i12);
            if (i12 > 0) {
                Activity activity = this.bly.jvy;
                if (activity instanceof TTRewardVideoActivity) {
                    ((TTRewardVideoActivity) activity).vt(((long) this.fkw) * 1000, this.f13381cf);
                }
                com.bytedance.sdk.openadsdk.component.reward.view.tlj tljVar = this.bly.jae;
                boolean z10 = false;
                if (tljVar != null && (yuVar = tljVar.ouw) != null) {
                    yuVar.setTime(String.valueOf(i12), this.fkw, 0, false);
                }
                if (this.pno.ey()) {
                    com.bytedance.sdk.openadsdk.component.reward.view.tlj tljVar2 = this.bly.jae;
                    if (tljVar2 != null) {
                        if (tljVar2.yu() && this.ryl > 0) {
                            z10 = true;
                        }
                        this.tlj = z10;
                    }
                    if (!this.tlj || this.fkw < this.ryl) {
                        this.bly.uoy.ouw(String.valueOf(i12), null);
                    } else {
                        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.bly;
                        int i13 = ouwVar.vt.fvf;
                        if (i13 == 5 || i13 == 33) {
                            this.bly.uoy.ouw(String.valueOf(i12), null);
                        } else {
                            ouwVar.ouw(true);
                            this.bly.uoy.ouw(String.valueOf(i12), TTAdDislikeToast.getSkipText());
                            this.bly.uoy.fkw(true);
                        }
                    }
                } else if (this.pno.rrs() && (this.bly.jae.yu() || this.bly.vt.lso())) {
                    Activity activity2 = this.bly.jvy;
                    if (activity2 instanceof TTFullScreenVideoActivity) {
                        ((TTFullScreenVideoActivity) activity2).vt(this.fkw);
                    }
                    this.bly.uoy.yu(true);
                    this.bly.uoy.ouw(String.valueOf(i12), null);
                }
                this.fkw++;
                com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar2 = this.bly;
                if (ouwVar2.ex.zih) {
                    com.bytedance.sdk.openadsdk.core.model.cd cdVar = ouwVar2.vt.f12879tj;
                    if (cdVar != null) {
                        float f10 = cdVar.ouw;
                        this.f13382le = f10;
                        if (f10 <= 0.0f) {
                            this.f13382le = 1.0f;
                        }
                    }
                } else {
                    this.f13382le = 1.0f;
                }
                int i14 = (int) (1000.0f / this.f13382le);
                com.bytedance.sdk.component.utils.qbp.ouw("TTAD.TopLayoutHelper", "handleMessage: next msg intervalInMillis = ".concat(String.valueOf(i14)));
                this.ouw.sendEmptyMessageDelayed(message.what, i14);
            }
        }
        return true;
    }

    public final void vt() {
        this.ouw.removeMessages(1024);
        this.vt = false;
        this.yu = true;
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.bly;
        if (ouwVar != null) {
            ouwVar.ex.zih();
        }
    }

    public cd(@NonNull com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar, @NonNull com.bytedance.sdk.openadsdk.core.model.vpp vppVar) {
        this.f13381cf = 0;
        this.ryl = 0;
        this.bly = ouwVar;
        this.pno = vppVar;
        if (vppVar.ey()) {
            if (vppVar.ng() >= 0) {
                this.ryl = vppVar.ng();
            } else {
                com.bytedance.sdk.openadsdk.core.zih.yu();
                this.ryl = com.bytedance.sdk.openadsdk.core.settings.cf.ra(String.valueOf(vppVar.fqk()));
            }
        } else if (vppVar.rrs()) {
            if (vppVar.myk() >= 0) {
                this.ryl = vppVar.myk();
            } else {
                com.bytedance.sdk.openadsdk.core.zih.yu();
                this.ryl = com.bytedance.sdk.openadsdk.core.settings.cf.jg(String.valueOf(vppVar.fqk()));
            }
        }
        this.f13381cf = (int) ouwVar.ex.zin();
        com.bytedance.sdk.component.utils.qbp.ouw("TTAD.TopLayoutHelper", "totalTime: " + this.f13381cf + ", skipTime=" + this.ryl);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.ouw.InterfaceC0131ouw
    public final void ouw(int i10) {
        com.bytedance.sdk.component.utils.qbp.ouw("TTAD.TopLayoutHelper", "onPlayerStateChanged: ".concat(String.valueOf(i10)));
        if (i10 == 1) {
            ouw();
            return;
        }
        if (i10 != 2) {
            if (i10 == 3 || i10 == 4) {
                vt();
                return;
            }
            return;
        }
        if (!this.vt || this.f13383lh) {
            return;
        }
        this.ouw.removeMessages(1024);
        this.f13383lh = true;
    }
}
