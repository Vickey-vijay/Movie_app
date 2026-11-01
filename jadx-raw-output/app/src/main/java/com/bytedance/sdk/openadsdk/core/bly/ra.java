package com.bytedance.sdk.openadsdk.core.bly;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdLoadListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.bytedance.sdk.openadsdk.utils.fak;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class ra {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public final Context f12556lh;
    public AdSlot ouw;
    public com.bytedance.sdk.openadsdk.core.model.vpp pno;
    public PAGBannerAdLoadListener yu;
    public final AtomicBoolean fkw = new AtomicBoolean(false);

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public int f12555le = 5;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public final fak f12557ra = fak.vt();
    public final com.bytedance.sdk.openadsdk.core.vpp vt = com.bytedance.sdk.openadsdk.core.zih.lh();

    public final void ouw(int i10, String str) {
        PAGBannerAdLoadListener pAGBannerAdLoadListener;
        if (!this.fkw.getAndSet(false) || (pAGBannerAdLoadListener = this.yu) == null) {
            return;
        }
        pAGBannerAdLoadListener.onError(i10, str);
    }

    public ra(Context context) {
        if (context != null) {
            this.f12556lh = context.getApplicationContext();
        } else {
            this.f12556lh = com.bytedance.sdk.openadsdk.core.zih.ouw();
        }
    }

    public static /* synthetic */ void ouw(ra raVar, com.bytedance.sdk.openadsdk.core.model.ouw ouwVar, com.bytedance.sdk.openadsdk.core.model.lh lhVar, AdSlot adSlot) {
        com.bykv.vk.openvk.ouw.ouw.ouw.lh.vt vtVar;
        List<com.bytedance.sdk.openadsdk.core.model.vpp> list = ouwVar.yu;
        if (list != null && !list.isEmpty()) {
            com.bytedance.sdk.openadsdk.core.model.vpp vppVar = ouwVar.ryl;
            raVar.pno = vppVar;
            for (com.bytedance.sdk.openadsdk.core.model.vpp vppVar2 : vppVar.f12885vm.yu) {
                if (com.bytedance.sdk.openadsdk.core.model.vpp.fkw(vppVar2) && (vtVar = vppVar2.f12874sd) != null && vtVar.f10459ra != null) {
                    int iFqk = vppVar2.fqk();
                    com.bytedance.sdk.openadsdk.core.zih.yu();
                    if (com.bytedance.sdk.openadsdk.core.settings.cf.yu(String.valueOf(iFqk)) && com.bytedance.sdk.openadsdk.core.zih.yu().od()) {
                        com.bytedance.sdk.openadsdk.core.mwh.ouw.vt vtVarOuw = com.bytedance.sdk.openadsdk.core.model.vpp.ouw(CacheDirFactory.getICacheDir(vppVar2.f12875sm).lh(), vppVar2);
                        vtVarOuw.ouw("material_meta", vppVar2);
                        vtVarOuw.ouw("ad_slot", adSlot);
                        com.bytedance.sdk.openadsdk.core.mwh.fkw.ouw.ouw(vtVarOuw, (com.bykv.vk.openvk.ouw.ouw.ouw.fkw.ouw.InterfaceC0059ouw) null);
                    }
                }
            }
            if (com.bytedance.sdk.component.utils.ko.yu()) {
                Log.e("ExpressAdLoadManager", "onAdLoad: net work response duration = " + raVar.f12557ra.lh() + "run in  " + Thread.currentThread().getName());
            }
            if (raVar.fkw.getAndSet(false)) {
                bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bly.ra.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        int height;
                        float expressViewAcceptedWidth;
                        List<com.bytedance.sdk.openadsdk.core.model.vpp> list2;
                        final JSONObject jSONObject;
                        final long jElapsedRealtime = SystemClock.elapsedRealtime();
                        final ra raVar2 = ra.this;
                        com.bytedance.sdk.openadsdk.core.model.vpp vppVar3 = raVar2.pno;
                        if (vppVar3 != null && raVar2.yu != null) {
                            PAGBannerSize pAGBannerSize = vppVar3.bfk;
                            float fMin = Math.min(raVar2.ouw.getExpressViewAcceptedHeight(), 250.0f);
                            int width = 0;
                            if (pAGBannerSize != null) {
                                width = pAGBannerSize.getWidth();
                                height = pAGBannerSize.getHeight();
                            } else {
                                height = 0;
                            }
                            if (width > 0) {
                                expressViewAcceptedWidth = width;
                            } else {
                                expressViewAcceptedWidth = raVar2.ouw.getExpressViewAcceptedWidth();
                            }
                            if (height > 0) {
                                fMin = height;
                            }
                            raVar2.ouw.setExpressViewAccepted(expressViewAcceptedWidth, fMin);
                            com.bytedance.sdk.openadsdk.core.yu.ra raVar3 = new com.bytedance.sdk.openadsdk.core.yu.ra(raVar2.f12556lh, vppVar3, raVar2.ouw);
                            final long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                            final long jLh = raVar2.f12557ra.lh();
                            if (!TextUtils.isEmpty(raVar2.ouw.getBidAdm())) {
                                com.bytedance.sdk.openadsdk.rn.lh.ouw(vppVar3, jLh);
                            }
                            raVar2.yu.onAdLoaded(raVar3);
                            try {
                                if (com.bytedance.sdk.openadsdk.core.zih.yu().jae() && com.bytedance.sdk.openadsdk.vpp.ouw.lh() && raVar2.f12555le == 1 && (list2 = vppVar3.f12885vm.yu) != null && !list2.isEmpty() && (jSONObject = vppVar3.f12885vm.f12795ra) != null) {
                                    com.bytedance.sdk.openadsdk.yu.lh.ouw(System.currentTimeMillis(), vppVar3, jSONObject.optString("tag", ""), "load_ad_time", new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.core.bly.ra.4
                                        @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
                                        public final JSONObject lh() {
                                            try {
                                                long jOptLong = jSONObject.optLong("callback_start", 0L);
                                                long j10 = jElapsedRealtime;
                                                long j11 = j10 - jOptLong;
                                                long j12 = jElapsedRealtime2 - j10;
                                                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("extra_data");
                                                if (jSONObjectOptJSONObject == null) {
                                                    jSONObjectOptJSONObject = new JSONObject();
                                                }
                                                jSONObjectOptJSONObject.put("thread_dispatch_duration", j11);
                                                jSONObjectOptJSONObject.put("build_banner_ad_duration", j12);
                                                jSONObjectOptJSONObject.put("ad_load_duration_full", jLh);
                                                return jSONObjectOptJSONObject;
                                            } catch (Throwable unused) {
                                                return null;
                                            }
                                        }

                                        @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
                                        public final JSONObject vt() {
                                            JSONObject jSONObject2 = new JSONObject();
                                            try {
                                                jSONObject2.put("duration", jSONObject.optLong("duration", 0L));
                                            } catch (Throwable unused) {
                                            }
                                            return jSONObject2;
                                        }
                                    });
                                }
                            } catch (Throwable unused) {
                            }
                        }
                    }
                });
                return;
            }
            return;
        }
        raVar.ouw(-3, com.bytedance.sdk.openadsdk.core.pno.ouw(-3));
        lhVar.vt = -3;
        lhVar.f12783ra = 8;
        com.bytedance.sdk.openadsdk.core.model.lh.ouw(lhVar);
    }
}
