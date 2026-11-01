package com.bytedance.sdk.openadsdk.component.reward;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.activity.TTAdActivity;
import com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity;
import com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.bytedance.sdk.openadsdk.utils.ex;
import com.bytedance.sdk.openadsdk.utils.od;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
final class pno extends PAGRewardedAd {
    private boolean bly;
    private boolean fkw;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private final AdSlot f12430lh;
    private final Context ouw;
    private boolean pno;
    private final com.bytedance.sdk.openadsdk.core.model.ouw vt;
    private com.bytedance.sdk.openadsdk.ouw.fkw.ouw yu;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private final AtomicBoolean f12429le = new AtomicBoolean(false);

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private final String f12431ra = ex.ouw();
    private final String tlj = "rewarded_video";

    private void vt() {
        if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
            bs.fkw(new com.bytedance.sdk.component.pno.pno("Reward_registerMultiProcessListener") { // from class: com.bytedance.sdk.openadsdk.component.reward.pno.3
                public final /* synthetic */ int ouw = 0;

                @Override // java.lang.Runnable
                public final void run() {
                    com.bytedance.sdk.openadsdk.multipro.aidl.ouw ouwVarOuw = com.bytedance.sdk.openadsdk.multipro.aidl.ouw.ouw();
                    if (this.ouw == 0 && pno.this.yu != null) {
                        ko.vt("MultiProcess", "start registerRewardVideoListener ! ");
                        com.bytedance.sdk.openadsdk.multipro.aidl.vt.yu yuVar = new com.bytedance.sdk.openadsdk.multipro.aidl.vt.yu(pno.this.yu);
                        IListenerManager iListenerManagerAsInterface = IListenerManager.Stub.asInterface(ouwVarOuw.ouw(0));
                        if (iListenerManagerAsInterface != null) {
                            try {
                                iListenerManagerAsInterface.registerRewardVideoListener(pno.this.f12431ra, yuVar);
                                ko.vt("MultiProcess", "end registerRewardVideoListener ! ");
                            } catch (RemoteException e10) {
                                qbp.lh("TTRewardVideoAdImpl", e10.getMessage());
                            }
                        }
                    }
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public final Object getExtraInfo(String str) {
        com.bytedance.sdk.openadsdk.core.model.ouw ouwVar = this.vt;
        if (ouwVar == null || ouwVar.lh() == null || this.vt.lh().npr == null) {
            return null;
        }
        try {
            return this.vt.lh().npr.get(str);
        } catch (Throwable th2) {
            qbp.lh("TTRewardVideoAdImpl", th2.getMessage());
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public final Map<String, Object> getMediaExtraInfo() {
        com.bytedance.sdk.openadsdk.core.model.ouw ouwVar = this.vt;
        if (ouwVar == null || ouwVar.lh() == null) {
            return null;
        }
        return this.vt.lh().npr;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public final void loss(Double d10, String str, String str2) {
        if (this.bly) {
            return;
        }
        od.ouw(this.vt.lh(), d10, str, str2);
        this.bly = true;
    }

    public final void ouw() {
        if (this.f12429le.get()) {
            return;
        }
        this.fkw = true;
    }

    @Override // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd
    public final void setAdInteractionCallback(PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback) {
        this.yu = new bly(pAGRewardedAdInteractionCallback, this.vt);
        vt();
    }

    @Override // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd
    public final void setAdInteractionListener(PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener) {
        this.yu = new bly(pAGRewardedAdInteractionListener, this.vt);
        vt();
    }

    @Override // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd
    public final void show(@Nullable Activity activity) {
        Intent intent;
        if (activity != null && activity.isFinishing()) {
            ko.fkw("TTRewardVideoAdImpl", "showRewardVideoAd error1: activity is finishing");
            activity = null;
        }
        com.bytedance.sdk.openadsdk.core.model.ouw ouwVar = this.vt;
        if (ouwVar == null || !ouwVar.vt()) {
            return;
        }
        final vpp vppVarLh = this.vt.lh();
        if (!com.bykv.vk.openvk.ouw.ouw.vt.vt.ouw.ouw()) {
            com.bytedance.sdk.openadsdk.yu.tlj.ouw(vppVarLh, "show_ad_fail", this.tlj, "not_called_on_main_thread");
            ko.fkw("TTRewardVideoAdImpl", "showRewardVideoAd error2: not main looper");
            throw new IllegalStateException("Cannot be called in a child thread —— TTRewardVideoAd.showRewardVideoAd");
        }
        List<vpp> list = this.vt.yu;
        if (list != null) {
            Iterator<vpp> it = list.iterator();
            while (it.hasNext()) {
                IPBroadcastReceiver.vt(this.ouw, it.next());
            }
        }
        if (!this.f12429le.compareAndSet(false, true)) {
            com.bytedance.sdk.openadsdk.yu.tlj.ouw(vppVarLh, "show_ad_fail", this.tlj, "repeat_play");
            return;
        }
        if (vppVarLh == null || vppVarLh.f12874sd == null) {
            com.bytedance.sdk.openadsdk.yu.tlj.ouw(vppVarLh, "show_ad_fail", this.tlj, "video_or_image_empty");
            return;
        }
        com.bytedance.sdk.openadsdk.yu.tlj.ouw(vppVarLh, "show_start", this.tlj, (String) null);
        Context contextOuw = activity == null ? this.ouw : activity;
        if (contextOuw == null) {
            contextOuw = zih.ouw();
        }
        if (vppVarLh.tpk) {
            intent = new Intent(contextOuw, (Class<?>) TTAdActivity.class);
        } else {
            intent = vppVarLh.lh() ? new Intent(contextOuw, (Class<?>) TTRewardExpressVideoActivity.class) : new Intent(contextOuw, (Class<?>) TTRewardVideoActivity.class);
        }
        Intent intent2 = intent;
        boolean zPno = com.bytedance.sdk.openadsdk.vpp.ouw.pno();
        com.bytedance.sdk.openadsdk.component.reward.ouw.vt.ouw(intent2, activity, this.fkw, this.vt, this.f12431ra);
        intent2.putExtra("media_extra", this.f12430lh.getMediaExtra());
        intent2.putExtra("user_id", this.f12430lh.getUserID());
        intent2.putExtra("start_show_time", SystemClock.elapsedRealtime());
        intent2.putExtra("enable_new_arch", zPno);
        if (!com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
            ko.vt("BVA", "show ad mMetaMd5 =" + this.f12431ra + ",mRewardedAdWrapperListener = " + this.yu);
            if (zPno) {
                com.bytedance.sdk.openadsdk.core.od.ouw().ouw(this.f12431ra, this.yu);
            } else {
                com.bytedance.sdk.openadsdk.core.od.ouw().vt = this.yu;
            }
            this.yu = null;
        }
        final boolean z10 = com.bytedance.sdk.openadsdk.vpp.ouw.ouw("start_activity_async", 0) == 1;
        if (z10) {
            com.bytedance.sdk.openadsdk.vm.lh.ouw(new com.bytedance.sdk.openadsdk.vm.yu() { // from class: com.bytedance.sdk.openadsdk.component.reward.pno.1
                @Override // com.bytedance.sdk.openadsdk.vm.yu
                public final com.bytedance.sdk.openadsdk.vm.vt.ouw ouw() {
                    com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar2 = new com.bytedance.sdk.openadsdk.vm.vt.ouw();
                    ouwVar2.f13464lh = "start_activity";
                    ouwVar2.pno = "rewarded_video";
                    return ouwVar2;
                }
            });
        }
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        com.bytedance.sdk.component.utils.vt.ouw(contextOuw, intent2, new com.bytedance.sdk.component.utils.vt.InterfaceC0099vt() { // from class: com.bytedance.sdk.openadsdk.component.reward.pno.2
            @Override // com.bytedance.sdk.component.utils.vt.InterfaceC0099vt
            public final void ouw() {
                if (z10) {
                    com.bytedance.sdk.openadsdk.vm.lh.vt(new com.bytedance.sdk.openadsdk.vm.yu() { // from class: com.bytedance.sdk.openadsdk.component.reward.pno.2.1
                        @Override // com.bytedance.sdk.openadsdk.vm.yu
                        public final com.bytedance.sdk.openadsdk.vm.vt.ouw ouw() {
                            com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar2 = new com.bytedance.sdk.openadsdk.vm.vt.ouw();
                            ouwVar2.f13464lh = "start_activity";
                            ouwVar2.pno = "rewarded_video";
                            return ouwVar2;
                        }
                    });
                    final long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                    com.bytedance.sdk.openadsdk.rn.lh.ouw("start_activity_action", false, new com.bytedance.sdk.openadsdk.rn.vt() { // from class: com.bytedance.sdk.openadsdk.component.reward.pno.2.2
                        @Override // com.bytedance.sdk.openadsdk.rn.vt
                        public final com.bytedance.sdk.openadsdk.rn.ouw.lh ouw() throws Exception {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("duration", jElapsedRealtime2);
                            com.bytedance.sdk.openadsdk.rn.ouw.yu yuVar = new com.bytedance.sdk.openadsdk.rn.ouw.yu();
                            yuVar.ouw = "start_activity_action";
                            yuVar.bly = jSONObject.toString();
                            return yuVar;
                        }
                    });
                }
            }

            @Override // com.bytedance.sdk.component.utils.vt.InterfaceC0099vt
            public final void ouw(Throwable th2) {
                ko.lh("TTRewardVideoAdImpl", "show reward video error: ", th2);
                com.bytedance.sdk.openadsdk.yu.tlj.ouw(vppVarLh, "show_ad_fail", pno.this.tlj, "activity_start_fail");
                if (z10) {
                    com.bytedance.sdk.openadsdk.vm.lh.lh(new com.bytedance.sdk.openadsdk.vm.yu() { // from class: com.bytedance.sdk.openadsdk.component.reward.pno.2.3
                        @Override // com.bytedance.sdk.openadsdk.vm.yu
                        public final com.bytedance.sdk.openadsdk.vm.vt.ouw ouw() {
                            com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar2 = new com.bytedance.sdk.openadsdk.vm.vt.ouw();
                            ouwVar2.f13464lh = "start_activity";
                            ouwVar2.pno = "rewarded_video";
                            return ouwVar2;
                        }
                    });
                }
            }
        }, true);
        ouw.ouw(this.vt.lh(), this.fkw, true);
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public final void win(Double d10) {
        if (this.pno) {
            return;
        }
        od.ouw(this.vt.lh(), d10);
        this.pno = true;
    }

    public pno(Context context, com.bytedance.sdk.openadsdk.core.model.ouw ouwVar, AdSlot adSlot) {
        this.ouw = context;
        this.vt = ouwVar;
        this.f12430lh = adSlot;
    }
}
