package com.bytedance.sdk.openadsdk.component;

import android.content.Context;
import android.os.Message;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.jae;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdLoadListener;
import com.bytedance.sdk.openadsdk.core.jg;
import com.bytedance.sdk.openadsdk.core.model.ksc;
import com.bytedance.sdk.openadsdk.core.model.uq;
import com.bytedance.sdk.openadsdk.core.pno;
import com.bytedance.sdk.openadsdk.core.qbp;
import com.bytedance.sdk.openadsdk.core.vpp;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.core.zin;
import com.bytedance.sdk.openadsdk.rn.ouw.lh;
import com.bytedance.sdk.openadsdk.rn.ouw.yu;
import com.bytedance.sdk.openadsdk.utils.fak;
import com.ironsource.C3426d4;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class ra implements jae.ouw {
    private final Context bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private boolean f12299cf;
    public PAGAppOpenAdLoadListener fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public int f12300le;
    public final vpp<com.bytedance.sdk.openadsdk.yu.ouw> ouw;
    public final le vt;
    public AdSlot yu;
    private final AtomicBoolean tlj = new AtomicBoolean(false);

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public int f12301lh = 0;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public volatile int f12302ra = 0;
    public final uq pno = new uq();

    public final void ouw(@NonNull final AdSlot adSlot) {
        this.f12302ra = 1;
        if (com.bytedance.sdk.openadsdk.utils.vt.ouw()) {
            final fak fakVarOuw = fak.ouw();
            ksc kscVar = new ksc();
            kscVar.f12774cf = this.pno;
            kscVar.yu = 1;
            kscVar.bly = 2;
            this.ouw.ouw(adSlot, kscVar, 3, (qbp) new zin() { // from class: com.bytedance.sdk.openadsdk.component.ra.1
                @Override // com.bytedance.sdk.openadsdk.core.zin, com.bytedance.sdk.openadsdk.core.vpp.ouw
                public final void ouw(int i10, String str) {
                    ra.this.f12302ra = 3;
                    ko.vt("TTAppOpenAdLoadManager", "try load app open ad from network fail, " + i10 + ", " + str);
                    ra.this.ouw(new com.bytedance.sdk.openadsdk.component.fkw.vt(2, 100, i10, str));
                }

                @Override // com.bytedance.sdk.openadsdk.core.zin, com.bytedance.sdk.openadsdk.core.vpp.ouw
                public final void ouw(com.bytedance.sdk.openadsdk.core.model.ouw ouwVar, com.bytedance.sdk.openadsdk.core.model.lh lhVar) {
                    ra.ouw(ra.this, ouwVar, lhVar, adSlot, fakVarOuw);
                }
            });
            return;
        }
        final fak fakVarOuw2 = fak.ouw();
        ksc kscVar2 = new ksc();
        kscVar2.f12774cf = this.pno;
        kscVar2.yu = 1;
        kscVar2.bly = 2;
        this.ouw.ouw(adSlot, kscVar2, 3, new vpp.ouw() { // from class: com.bytedance.sdk.openadsdk.component.ra.2
            @Override // com.bytedance.sdk.openadsdk.core.vpp.ouw
            public final void ouw(int i10, String str) {
                ra.this.f12302ra = 3;
                ko.vt("TTAppOpenAdLoadManager", "try load app open ad from network fail, " + i10 + ", " + str);
                ra.this.ouw(new com.bytedance.sdk.openadsdk.component.fkw.vt(2, 100, i10, str));
            }

            @Override // com.bytedance.sdk.openadsdk.core.vpp.ouw
            public final void ouw(com.bytedance.sdk.openadsdk.core.model.ouw ouwVar, com.bytedance.sdk.openadsdk.core.model.lh lhVar) {
                ra.ouw(ra.this, ouwVar, lhVar, adSlot, fakVarOuw2);
            }
        });
    }

    public ra(Context context) {
        if (context != null) {
            this.bly = context.getApplicationContext();
        } else {
            this.bly = zih.ouw();
        }
        this.ouw = zih.lh();
        this.vt = le.ouw(this.bly);
    }

    public static int vt(@NonNull AdSlot adSlot) {
        try {
            return Integer.parseInt(adSlot.getCodeId());
        } catch (Throwable unused) {
            return 0;
        }
    }

    public final void ouw() {
        ouw(this.yu);
    }

    private void ouw(@NonNull final com.bytedance.sdk.openadsdk.core.model.vpp vppVar, AdSlot adSlot, final boolean z10, final com.bytedance.sdk.openadsdk.core.model.ouw ouwVar) {
        this.vt.ouw(vppVar, adSlot, this.pno, new le.vt() { // from class: com.bytedance.sdk.openadsdk.component.ra.6
            @Override // com.bytedance.sdk.openadsdk.component.le.vt
            public final void ouw() {
                Log.d("TTAppOpenAdLoadManager", "preLoadSuccess: video load success");
                if (z10) {
                    ra.this.f12302ra = 4;
                    com.bytedance.sdk.openadsdk.component.fkw.vt vtVar = new com.bytedance.sdk.openadsdk.component.fkw.vt(100, vppVar, ouwVar);
                    vtVar.f12264ra = true;
                    ra.this.ouw(vtVar);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.le.vt
            public final void ouw(int i10, String str) {
                ko.vt("TTAppOpenAdLoadManager", "preLoadFail() called with: code = [" + i10 + "], message = [" + str + C3426d4.j.f28588e);
                if (z10) {
                    ra.this.f12302ra = 5;
                    ra.this.ouw(new com.bytedance.sdk.openadsdk.component.fkw.vt(2, 100, 10003, pno.ouw(10003)));
                }
            }
        });
    }

    private void ouw(@NonNull final com.bytedance.sdk.openadsdk.core.model.vpp vppVar, final com.bytedance.sdk.openadsdk.core.model.ouw ouwVar) {
        this.vt.ouw(vppVar, this.pno, new le.ouw() { // from class: com.bytedance.sdk.openadsdk.component.ra.7
            public final /* synthetic */ boolean ouw = false;

            @Override // com.bytedance.sdk.openadsdk.component.le.ouw
            public final void ouw() {
                Log.d("TTAppOpenAdLoadManager", "preLoadSuccess: image load success");
                if (this.ouw) {
                    ra.this.f12302ra = 4;
                    com.bytedance.sdk.openadsdk.component.fkw.vt vtVar = new com.bytedance.sdk.openadsdk.component.fkw.vt(100, vppVar, ouwVar);
                    vtVar.f12264ra = true;
                    ra.this.ouw(vtVar);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.le.ouw
            public final void vt() {
                Log.d("TTAppOpenAdLoadManager", "preLoadFail: image load fail");
                if (this.ouw) {
                    ra.this.f12302ra = 5;
                    ra.this.ouw(new com.bytedance.sdk.openadsdk.component.fkw.vt(2, 100, 10003, pno.ouw(10003)));
                }
            }
        });
    }

    @Override // com.bytedance.sdk.component.utils.jae.ouw
    public final void ouw(Message message) {
        if (message.what != 1 || this.tlj.get()) {
            return;
        }
        ouw(new com.bytedance.sdk.openadsdk.component.fkw.vt(3, 102, Sdk.SDKError.Reason.AD_LOAD_TOO_FREQUENTLY_VALUE, pno.ouw(Sdk.SDKError.Reason.AD_LOAD_TOO_FREQUENTLY_VALUE)));
    }

    public final void ouw(com.bytedance.sdk.openadsdk.component.fkw.vt vtVar) {
        int i10 = vtVar.ouw;
        int i11 = vtVar.vt;
        if (!this.tlj.compareAndSet(false, true)) {
            if (i10 == 1 && i11 == 100 && !this.pno.bly) {
                ko.vt("TTAppOpenAdLoadManager", "openAdCallBack: timeout after cache material");
                le.ouw(zih.ouw()).ouw(new com.bytedance.sdk.openadsdk.component.fkw.ouw(this.f12301lh, vtVar.f12263lh, vtVar.yu));
                if (this.f12299cf) {
                    return;
                }
                com.bytedance.sdk.openadsdk.component.yu.ouw.ouw(vtVar.f12263lh, 1, this.pno);
                return;
            }
            return;
        }
        if (i10 != 1) {
            if (i10 == 2 || i10 == 3) {
                PAGAppOpenAdLoadListener pAGAppOpenAdLoadListener = this.fkw;
                if (pAGAppOpenAdLoadListener != null) {
                    pAGAppOpenAdLoadListener.onError(vtVar.fkw, vtVar.f12262le);
                }
                if (i10 == 3) {
                    com.bytedance.sdk.openadsdk.rn.lh.ouw("openad_load_ad_timeout", false, new com.bytedance.sdk.openadsdk.rn.vt() { // from class: com.bytedance.sdk.openadsdk.component.yu.ouw.1
                        public final /* synthetic */ int ouw;
                        public final /* synthetic */ int vt;

                        public AnonymousClass1() {
                            i = i;
                            i = i;
                        }

                        @Override // com.bytedance.sdk.openadsdk.rn.vt
                        public final lh ouw() throws Exception {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("timeout_type", i);
                            jSONObject.put("user_timeout_time", i);
                            yu yuVar = new yu();
                            yuVar.ouw = "openad_load_ad_timeout";
                            yuVar.bly = jSONObject.toString();
                            return yuVar;
                        }
                    });
                    return;
                }
                return;
            }
            return;
        }
        if (i11 == 100 && !this.pno.bly) {
            this.vt.ouw(new com.bytedance.sdk.openadsdk.component.fkw.ouw(this.f12301lh, vtVar.f12263lh, vtVar.yu));
        }
        if (this.fkw != null) {
            this.fkw.onAdLoaded(new yu(this.bly, vtVar.f12263lh, i11 == 101, this.yu));
        }
        if (i11 != 101) {
            if (i11 == 100) {
                com.bytedance.sdk.openadsdk.component.yu.ouw.ouw(vtVar.f12263lh, 0, this.pno);
                this.f12299cf = true;
                return;
            }
            return;
        }
        com.bytedance.sdk.openadsdk.core.model.vpp vppVar = vtVar.f12263lh;
        long jLh = this.pno.ouw.lh();
        JSONObject jSONObject = new JSONObject();
        try {
            com.bytedance.sdk.openadsdk.component.yu.ouw.ouw(jSONObject, vppVar);
            jSONObject.put("openad_creative_type", com.bytedance.sdk.openadsdk.core.model.vpp.fkw(vppVar) ? "video_normal_ad" : "image_normal_ad");
        } catch (JSONException unused) {
            com.bytedance.sdk.component.utils.qbp.lh("TTAppOpenAdReport", "reportLoadCacheDuration json error");
        }
        com.bytedance.sdk.openadsdk.yu.lh.ouw(vppVar, "load_cache_duration", jLh, jSONObject);
    }

    public static /* synthetic */ void ouw(ra raVar, final com.bytedance.sdk.openadsdk.core.model.ouw ouwVar, com.bytedance.sdk.openadsdk.core.model.lh lhVar, AdSlot adSlot, fak fakVar) {
        List<com.bytedance.sdk.openadsdk.core.model.vpp> list;
        raVar.f12302ra = 2;
        ko.vt("TTAppOpenAdLoadManager", "try load app open ad from network success");
        if (ouwVar != null && (list = ouwVar.yu) != null && list.size() != 0) {
            final com.bytedance.sdk.openadsdk.core.model.vpp vppVar = ouwVar.yu.get(0);
            long jKo = vppVar.ko();
            raVar.pno.tlj = jKo;
            boolean zRa = com.bytedance.sdk.openadsdk.core.model.vpp.ra(vppVar);
            if (vppVar.ra()) {
                raVar.ouw(new com.bytedance.sdk.openadsdk.component.fkw.vt(100, vppVar, ouwVar));
                return;
            }
            if (!zRa && !vppVar.f12887zn) {
                if (com.bytedance.sdk.openadsdk.core.model.vpp.fkw(vppVar)) {
                    int iOuw = zih.yu().pno.ouw("splash_video_load_strategy", 0);
                    if (iOuw != 1 && iOuw != 3) {
                        raVar.ouw(vppVar, adSlot, !raVar.pno.bly, ouwVar);
                        if (raVar.pno.bly) {
                            com.bytedance.sdk.openadsdk.rn.lh.ouw(vppVar, fakVar.lh());
                            ko.ouw("TTAppOpenAdLoadManager", "onAdLoad: invoke callback after ", Long.valueOf(jKo), "ms for bidding");
                            if (jKo == 0) {
                                raVar.pno.pno = 2;
                                raVar.ouw(new com.bytedance.sdk.openadsdk.component.fkw.vt(100, vppVar, ouwVar));
                                return;
                            } else {
                                jg.vt().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.ra.3
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        ra raVar2 = ra.this;
                                        raVar2.pno.pno = 2;
                                        raVar2.ouw(new com.bytedance.sdk.openadsdk.component.fkw.vt(100, vppVar, ouwVar));
                                    }
                                }, jKo);
                                return;
                            }
                        }
                        return;
                    }
                    uq uqVar = raVar.pno;
                    uqVar.tlj = -1L;
                    uqVar.pno = 3;
                    raVar.ouw(new com.bytedance.sdk.openadsdk.component.fkw.vt(100, vppVar, ouwVar));
                    raVar.ouw(vppVar, adSlot, false, ouwVar);
                    return;
                }
                uq uqVar2 = raVar.pno;
                uqVar2.tlj = -1L;
                uqVar2.pno = 3;
                raVar.ouw(new com.bytedance.sdk.openadsdk.component.fkw.vt(100, vppVar, ouwVar));
                raVar.ouw(vppVar, ouwVar);
                return;
            }
            raVar.ouw(new com.bytedance.sdk.openadsdk.component.fkw.vt(100, vppVar, ouwVar));
            if (com.bytedance.sdk.openadsdk.core.model.vpp.fkw(vppVar)) {
                raVar.ouw(vppVar, adSlot, false, ouwVar);
                return;
            } else {
                raVar.ouw(vppVar, ouwVar);
                return;
            }
        }
        raVar.f12302ra = 3;
        raVar.ouw(new com.bytedance.sdk.openadsdk.component.fkw.vt(2, 100, Sdk.SDKError.Reason.AD_SERVER_ERROR_VALUE, pno.ouw(Sdk.SDKError.Reason.AD_SERVER_ERROR_VALUE)));
        lhVar.vt = -3;
        lhVar.f12783ra = 3;
        com.bytedance.sdk.openadsdk.core.model.lh.ouw(lhVar);
    }
}
