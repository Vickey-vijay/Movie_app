package com.bytedance.sdk.openadsdk.component.reward;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.ksc;
import com.bytedance.sdk.component.utils.vm;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
import com.bytedance.sdk.openadsdk.core.model.ex;
import com.bytedance.sdk.openadsdk.core.model.od;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.qbp;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.core.zin;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class ryl {

    @SuppressLint({"StaticFieldLeak"})
    private static volatile ryl vt;
    private com.bytedance.sdk.component.pno.pno fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private final ksc.ouw f12434le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private final AtomicBoolean f12435lh;
    public final Context ouw;
    private final List<vt> yu;

    public static class lh implements PAGRewardedAdLoadListener {

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        private final AtomicInteger f12443lh;
        private final PAGRewardedAdLoadListener ouw;
        private final AtomicBoolean vt;
        private final com.bytedance.sdk.openadsdk.core.model.ouw yu;

        public /* synthetic */ lh(PAGRewardedAdLoadListener pAGRewardedAdLoadListener, com.bytedance.sdk.openadsdk.core.model.ouw ouwVar, byte b10) {
            this(pAGRewardedAdLoadListener, ouwVar);
        }

        private lh(PAGRewardedAdLoadListener pAGRewardedAdLoadListener, com.bytedance.sdk.openadsdk.core.model.ouw ouwVar) {
            this.vt = new AtomicBoolean(false);
            this.ouw = pAGRewardedAdLoadListener;
            this.yu = ouwVar;
            this.f12443lh = new AtomicInteger(ouw());
        }

        private int ouw() {
            if (!this.yu.vt()) {
                return 0;
            }
            int i10 = 0;
            for (int i11 = 0; i11 < this.yu.yu.size(); i11++) {
                vpp vppVar = this.yu.yu.get(i11);
                if (vppVar != null && !od.lh(vppVar) && vppVar.f12874sd != null) {
                    i10++;
                }
            }
            return i10;
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.ra
        public final void onError(int i10, String str) {
            if (this.f12443lh.decrementAndGet() > 0 || this.ouw == null || !this.vt.compareAndSet(false, true)) {
                return;
            }
            this.ouw.onError(i10, str);
            com.bytedance.sdk.openadsdk.rn.lh.ouw("choose_ad_load_error", false, new com.bytedance.sdk.openadsdk.rn.vt() { // from class: com.bytedance.sdk.openadsdk.component.reward.ryl.lh.1
                @Override // com.bytedance.sdk.openadsdk.rn.vt
                @Nullable
                public final com.bytedance.sdk.openadsdk.rn.ouw.lh ouw() throws Exception {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("req_id", lh.this.yu.ouw());
                    com.bytedance.sdk.openadsdk.rn.ouw.yu yuVar = new com.bytedance.sdk.openadsdk.rn.ouw.yu();
                    yuVar.ouw = "choose_ad_load_error";
                    yuVar.bly = jSONObject.toString();
                    return yuVar;
                }
            });
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
        /* JADX INFO: renamed from: ouw, reason: merged with bridge method [inline-methods] */
        public final void onAdLoaded(PAGRewardedAd pAGRewardedAd) {
            this.f12443lh.decrementAndGet();
            if (this.ouw == null || !this.vt.compareAndSet(false, true)) {
                return;
            }
            this.ouw.onAdLoaded(pAGRewardedAd);
        }
    }

    public static class ouw implements PAGRewardedAdLoadListener {
        private final boolean fkw;

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        private final com.bytedance.sdk.openadsdk.core.model.ouw f12444lh;
        private final Context ouw;
        private final AdSlot vt;
        private final PAGRewardedAdLoadListener yu;

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
        public final /* synthetic */ void onAdLoaded(PAGRewardedAd pAGRewardedAd) {
            ryl.ouw(this.ouw).ouw(this.vt, this.f12444lh, this.yu, pAGRewardedAd, this.fkw);
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.ra
        public final void onError(int i10, String str) {
            PAGRewardedAdLoadListener pAGRewardedAdLoadListener = this.yu;
            if (pAGRewardedAdLoadListener != null) {
                pAGRewardedAdLoadListener.onError(i10, str);
            }
        }

        public ouw(Context context, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.ouw ouwVar, PAGRewardedAdLoadListener pAGRewardedAdLoadListener, boolean z10) {
            this.ouw = context;
            this.vt = adSlot;
            this.f12444lh = ouwVar;
            this.yu = pAGRewardedAdLoadListener;
            this.fkw = z10;
        }
    }

    public static class vt extends com.bytedance.sdk.component.pno.pno {

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public final com.bytedance.sdk.openadsdk.core.model.ouw f12445lh;
        public final vpp ouw;
        public final AdSlot vt;

        public vt(vpp vppVar, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.ouw ouwVar) {
            super("Reward Task");
            this.ouw = vppVar;
            this.vt = adSlot;
            this.f12445lh = ouwVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            vpp vppVar = this.ouw;
            if (vppVar == null || vppVar.f12874sd == null) {
                return;
            }
            com.bytedance.sdk.openadsdk.core.mwh.ouw.vt vtVarOuw = vpp.ouw(CacheDirFactory.getICacheDir(vppVar.f12875sm).ouw(), this.ouw);
            vtVarOuw.ouw("material_meta", this.ouw);
            vtVarOuw.ouw("ad_slot", this.vt);
            com.bytedance.sdk.openadsdk.core.mwh.fkw.ouw.ouw(vtVarOuw, new com.bykv.vk.openvk.ouw.ouw.ouw.fkw.vt() { // from class: com.bytedance.sdk.openadsdk.component.reward.ryl.vt.1
                @Override // com.bykv.vk.openvk.ouw.ouw.ouw.fkw.ouw.InterfaceC0059ouw
                public final void ouw(com.bykv.vk.openvk.ouw.ouw.ouw.lh.lh lhVar, int i10) {
                    ko.lh("RewardVideoLoadManager", "RewardVideoLog: onVideoPreloadSuccess with net change !!");
                    cf cfVarOuw = cf.ouw(zih.ouw());
                    vt vtVar = vt.this;
                    cfVarOuw.ouw(vtVar.vt, vtVar.f12445lh);
                }

                @Override // com.bykv.vk.openvk.ouw.ouw.ouw.fkw.ouw.InterfaceC0059ouw
                public final void ouw(com.bykv.vk.openvk.ouw.ouw.ouw.lh.lh lhVar, int i10, String str) {
                    ko.lh("RewardVideoLoadManager", "RewardVideoLog: onVideoPreloadFail with net change !!");
                }
            });
        }
    }

    private void lh(final AdSlot adSlot) {
        if (cf.ouw(this.ouw).vt(adSlot.getCodeId(), false) != null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.model.ksc kscVar = new com.bytedance.sdk.openadsdk.core.model.ksc();
        kscVar.vt = 2;
        zih.yu();
        if (com.bytedance.sdk.openadsdk.core.settings.cf.pno(adSlot.getCodeId()) || adSlot.getExpressViewAcceptedWidth() > 0.0f || adSlot.isExpressAd()) {
            kscVar.bly = 2;
        }
        zih.lh().ouw(adSlot, kscVar, 7, new com.bytedance.sdk.openadsdk.core.vpp.ouw() { // from class: com.bytedance.sdk.openadsdk.component.reward.ryl.3
            @Override // com.bytedance.sdk.openadsdk.core.vpp.ouw
            public final void ouw(int i10, String str) {
            }

            @Override // com.bytedance.sdk.openadsdk.core.vpp.ouw
            public final void ouw(com.bytedance.sdk.openadsdk.core.model.ouw ouwVar, com.bytedance.sdk.openadsdk.core.model.lh lhVar) {
                List<vpp> list = ouwVar.yu;
                if (list == null || list.isEmpty()) {
                    return;
                }
                ryl.ouw(ryl.this, ouwVar, new jg(ryl.this.ouw, ouwVar, adSlot), adSlot, true, (PAGRewardedAdLoadListener) null);
            }
        });
    }

    private void vt(final AdSlot adSlot) {
        com.bytedance.sdk.openadsdk.core.model.ksc kscVar = new com.bytedance.sdk.openadsdk.core.model.ksc();
        kscVar.vt = 2;
        zih.yu();
        if (com.bytedance.sdk.openadsdk.core.settings.cf.pno(adSlot.getCodeId()) || adSlot.getExpressViewAcceptedWidth() > 0.0f || adSlot.isExpressAd()) {
            kscVar.bly = 2;
        }
        zih.lh().ouw(adSlot, kscVar, 7, (qbp) new zin() { // from class: com.bytedance.sdk.openadsdk.component.reward.ryl.1
            public boolean ouw = false;

            @Override // com.bytedance.sdk.openadsdk.core.zin, com.bytedance.sdk.openadsdk.core.qbp
            public final String ouw() {
                cf.ouw(ryl.this.ouw);
                return cf.ouw(adSlot.getCodeId(), false);
            }

            @Override // com.bytedance.sdk.openadsdk.core.zin, com.bytedance.sdk.openadsdk.core.vpp.ouw
            public final void ouw(int i10, String str) {
            }

            @Override // com.bytedance.sdk.openadsdk.core.zin, com.bytedance.sdk.openadsdk.core.qbp
            public final boolean ouw(com.bytedance.sdk.openadsdk.core.model.ouw ouwVar) {
                cf.ouw(ryl.this.ouw);
                boolean zOuw = cf.ouw(ouwVar);
                this.ouw = zOuw;
                return zOuw;
            }

            @Override // com.bytedance.sdk.openadsdk.core.zin, com.bytedance.sdk.openadsdk.core.vpp.ouw
            public final void ouw(com.bytedance.sdk.openadsdk.core.model.ouw ouwVar, com.bytedance.sdk.openadsdk.core.model.lh lhVar) {
                List<vpp> list;
                if (this.ouw || (list = ouwVar.yu) == null || list.isEmpty()) {
                    return;
                }
                ryl.ouw(ryl.this, ouwVar, new jg(ryl.this.ouw, ouwVar, adSlot), adSlot, true, (PAGRewardedAdLoadListener) null);
            }
        });
    }

    private ryl(Context context) {
        Context applicationContext;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f12435lh = atomicBoolean;
        this.yu = Collections.synchronizedList(new ArrayList());
        ksc.ouw ouwVar = new ksc.ouw() { // from class: com.bytedance.sdk.openadsdk.component.reward.ryl.2
            @Override // com.bytedance.sdk.component.utils.ksc.ouw
            public final void ouw(boolean z10, int i10) {
                if (z10) {
                    if (ryl.this.fkw == null) {
                        ryl rylVar = ryl.this;
                        rylVar.fkw = new com.bytedance.sdk.openadsdk.component.reward.vt("net connect task", rylVar.yu);
                    }
                    com.bytedance.sdk.component.utils.bly.ouw().post(ryl.this.fkw);
                }
            }
        };
        this.f12434le = ouwVar;
        if (context == null) {
            applicationContext = zih.ouw();
        } else {
            applicationContext = context.getApplicationContext();
        }
        this.ouw = applicationContext;
        if (!atomicBoolean.get()) {
            atomicBoolean.set(true);
            ksc.ouw(ouwVar, applicationContext);
        }
    }

    public void finalize() throws Throwable {
        super.finalize();
        if (this.fkw != null) {
            try {
                com.bytedance.sdk.component.utils.bly.ouw().removeCallbacks(this.fkw);
            } catch (Exception unused) {
            }
            this.fkw = null;
        }
        if (this.f12435lh.get()) {
            this.f12435lh.set(false);
            try {
                ksc.ouw(this.f12434le);
            } catch (Exception unused2) {
            }
        }
    }

    public static ryl ouw(Context context) {
        if (vt == null) {
            synchronized (ryl.class) {
                if (vt == null) {
                    vt = new ryl(context);
                }
            }
        }
        return vt;
    }

    public final void ouw(AdSlot adSlot) {
        if (adSlot == null || TextUtils.isEmpty(adSlot.getCodeId()) || !TextUtils.isEmpty(adSlot.getBidAdm())) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.utils.vt.ouw()) {
            vt(adSlot);
        } else {
            lh(adSlot);
        }
    }

    public final void ouw() {
        File[] fileArrListFiles;
        File[] fileArrListFiles2;
        try {
            final cf cfVarOuw = cf.ouw(this.ouw);
            if (com.bytedance.sdk.openadsdk.utils.vt.ouw()) {
                com.bytedance.sdk.openadsdk.common.vt.ouw("sp_reward_video_new").ouw();
                return;
            }
            try {
                boolean z10 = com.bytedance.sdk.openadsdk.core.bly.fkw("sp_reward_video");
                File file = new File(cfVarOuw.ouw.getDataDir(), z10 ? "files" : "shared_prefs");
                if (file.exists() && file.isDirectory() && (fileArrListFiles2 = file.listFiles(new FileFilter() { // from class: com.bytedance.sdk.openadsdk.component.reward.cf.1
                    public AnonymousClass1() {
                    }

                    @Override // java.io.FileFilter
                    public final boolean accept(File file2) {
                        if (file2 != null) {
                            return file2.getName().contains("sp_reward_video");
                        }
                        return false;
                    }
                })) != null) {
                    for (File file2 : fileArrListFiles2) {
                        if (z10) {
                            try {
                                com.bytedance.sdk.component.utils.ra.lh(file2);
                            } catch (Throwable unused) {
                            }
                        } else {
                            cfVarOuw.ouw.deleteSharedPreferences(file2.getName().replace(".xml", ""));
                        }
                    }
                }
            } catch (Throwable unused2) {
            }
            File cacheDir = cfVarOuw.ouw.getCacheDir();
            if (cacheDir == null || !cacheDir.exists() || !cacheDir.isDirectory() || (fileArrListFiles = cacheDir.listFiles(new FileFilter() { // from class: com.bytedance.sdk.openadsdk.component.reward.cf.2
                public AnonymousClass2() {
                }

                @Override // java.io.FileFilter
                public final boolean accept(File file3) {
                    if (file3 != null) {
                        return file3.getName().contains("reward_video_cache");
                    }
                    return false;
                }
            })) == null) {
                return;
            }
            for (File file3 : fileArrListFiles) {
                try {
                    com.bytedance.sdk.component.utils.ra.lh(file3);
                } catch (Throwable unused3) {
                }
            }
        } catch (Throwable unused4) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void ouw(com.bytedance.sdk.openadsdk.core.model.ouw ouwVar, AdSlot adSlot, PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        vpp vppVarLh = ouwVar.lh();
        for (vpp vppVar : ouwVar.yu) {
            if (vppVar.yiz == null) {
                vppVar.yiz = adSlot;
            }
        }
        final jg jgVar = new jg(this.ouw, ouwVar, adSlot);
        if (!od.lh(vppVarLh)) {
            jgVar.ouw.ouw();
        }
        com.bytedance.sdk.openadsdk.core.ryl.lh.yu.ouw(ouwVar);
        if (zih.yu().ryl() == 0) {
            ouw(adSlot, ouwVar, pAGRewardedAdLoadListener, jgVar.ouw, true);
        }
        ouw ouwVar2 = new ouw(this.ouw, adSlot, ouwVar, pAGRewardedAdLoadListener, true);
        final lh lhVar = new lh(ouwVar2, ouwVar, 0 == true ? 1 : 0);
        for (int i10 = 0; i10 < ouwVar.yu.size(); i10++) {
            vpp vppVar2 = ouwVar.yu.get(i10);
            boolean z10 = zih.yu().ryl() == 1;
            if (!od.lh(vppVar2)) {
                com.bytedance.sdk.openadsdk.core.mwh.ouw.vt vtVarOuw = vpp.ouw(CacheDirFactory.getICacheDir(vppVar2.f12875sm).ouw(), vppVar2);
                vtVarOuw.ouw("material_meta", vppVar2);
                vtVarOuw.ouw("ad_slot", adSlot);
                com.bytedance.sdk.openadsdk.core.mwh.fkw.ouw.ouw(vtVarOuw, new com.bykv.vk.openvk.ouw.ouw.ouw.fkw.vt() { // from class: com.bytedance.sdk.openadsdk.component.reward.ryl.6
                    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.fkw.ouw.InterfaceC0059ouw
                    public final void ouw(com.bykv.vk.openvk.ouw.ouw.ouw.lh.lh lhVar2, int i11) {
                        Log.d("RewardVideoLoadManager", "onVideoPreloadSuccess: ");
                        if (lhVar == null || zih.yu().ryl() != 1) {
                            return;
                        }
                        lhVar.onAdLoaded(jgVar.ouw);
                    }

                    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.fkw.ouw.InterfaceC0059ouw
                    public final void ouw(com.bykv.vk.openvk.ouw.ouw.ouw.lh.lh lhVar2, int i11, String str) {
                        ko.lh("RewardVideoLoadManager", "RewardVideoLog: Cached ad  onVideoPreloadFail");
                        if (lhVar == null || zih.yu().ryl() != 1) {
                            return;
                        }
                        lhVar.onError(i11, str);
                    }
                });
                z10 = false;
            }
            if (z10) {
                lhVar.onAdLoaded(jgVar.ouw);
            }
            if (ouwVar.yu()) {
                break;
            }
        }
        for (final int i11 = 0; i11 < ouwVar.yu.size(); i11++) {
            com.bytedance.sdk.openadsdk.core.mwh.lh.ouw.ouw().ouw(ouwVar.yu.get(i11), new com.bytedance.sdk.openadsdk.core.mwh.lh.ouw.InterfaceC0127ouw() { // from class: com.bytedance.sdk.openadsdk.component.reward.ryl.5
                @Override // com.bytedance.sdk.openadsdk.core.mwh.lh.ouw.InterfaceC0127ouw
                public final void ouw(boolean z11) {
                    com.bytedance.sdk.component.utils.qbp.ouw("RewardVideoLoadManager", "onCachedResponse: i=" + i11 + ", isSuccess=" + z11);
                }
            });
        }
        ko.vt("RewardVideoLoadManager", "get cache data success");
        ko.vt("bidding", "reward video get cache data success");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ouw(final AdSlot adSlot, final com.bytedance.sdk.openadsdk.core.model.ouw ouwVar, PAGRewardedAdLoadListener pAGRewardedAdLoadListener, PAGRewardedAd pAGRewardedAd, final boolean z10) {
        com.bytedance.sdk.openadsdk.core.jg.vt().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.ryl.10
            @Override // java.lang.Runnable
            public final void run() {
                if (z10) {
                    ryl.ouw(ryl.this, adSlot);
                } else {
                    cf.ouw(ryl.this.ouw).ouw(adSlot, ouwVar);
                    ryl.ouw(ryl.this, adSlot);
                }
            }
        });
        if (pAGRewardedAdLoadListener != null) {
            pAGRewardedAdLoadListener.onAdLoaded(pAGRewardedAd);
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:37:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:38:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:48:0x0107  */
    public static /* synthetic */ void ouw(ryl rylVar, final com.bytedance.sdk.openadsdk.core.model.ouw ouwVar, final jg jgVar, final AdSlot adSlot, final boolean z10, PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        byte b10;
        if (!z10) {
            com.bytedance.sdk.openadsdk.jg.ouw.ouw().ouw(ouwVar.lh());
        }
        byte b11 = 0;
        final lh lhVar = new lh(new ouw(rylVar.ouw, adSlot, ouwVar, pAGRewardedAdLoadListener, false), ouwVar, b11);
        ex exVar = ouwVar.f12793le;
        byte b12 = 1;
        int i10 = ouwVar.yu() ? 10 : 1;
        if (exVar != null) {
            i10 = exVar.vt;
        }
        for (final int i11 = 0; i11 < ouwVar.yu.size(); i11++) {
            vpp vppVar = ouwVar.yu.get(i11);
            if (i11 >= i10) {
                break;
            }
            com.bytedance.sdk.openadsdk.core.mwh.lh.ouw.ouw().ouw(vppVar, new com.bytedance.sdk.openadsdk.core.mwh.lh.ouw.InterfaceC0127ouw() { // from class: com.bytedance.sdk.openadsdk.component.reward.ryl.8
                @Override // com.bytedance.sdk.openadsdk.core.mwh.lh.ouw.InterfaceC0127ouw
                public final void ouw(boolean z11) {
                    com.bytedance.sdk.component.utils.qbp.ouw("RewardVideoLoadManager", "onCachedResponse: i=" + i11 + ", isSuccess=" + z11);
                }
            });
        }
        int i12 = 0;
        while (i12 < ouwVar.yu.size()) {
            vpp vppVar2 = ouwVar.yu.get(i12);
            int i13 = vppVar2.fvf;
            if (i12 == 0 && i13 == 43) {
                vppVar2.f12874sd.f10460rn = b11;
            }
            if (z10 && !od.lh(vppVar2)) {
                zih.yu();
                if (com.bytedance.sdk.openadsdk.core.settings.cf.qbp(adSlot.getCodeId()).yu == b12 && !vm.ouw(rylVar.ouw)) {
                    vt vtVar = new vt(vppVar2, adSlot, ouwVar);
                    if (rylVar.yu.size() > 0) {
                        rylVar.yu.remove(b11);
                    }
                    rylVar.yu.add(vtVar);
                } else {
                    if (zih.yu().ryl() == b12) {
                        b10 = b12;
                    } else {
                        b10 = b11;
                    }
                    if (od.lh(vppVar2)) {
                        if (z10) {
                            cf.ouw(rylVar.ouw).ouw(adSlot, ouwVar);
                        }
                    } else if (vppVar2.f12874sd != null) {
                        com.bytedance.sdk.openadsdk.core.mwh.ouw.vt vtVarOuw = vpp.ouw(CacheDirFactory.getICacheDir(vppVar2.f12875sm).ouw(), vppVar2);
                        vtVarOuw.ouw("material_meta", vppVar2);
                        vtVarOuw.ouw("ad_slot", adSlot);
                        com.bytedance.sdk.openadsdk.core.mwh.fkw.ouw.ouw(vtVarOuw, new com.bykv.vk.openvk.ouw.ouw.ouw.fkw.vt() { // from class: com.bytedance.sdk.openadsdk.component.reward.ryl.9
                            @Override // com.bykv.vk.openvk.ouw.ouw.ouw.fkw.ouw.InterfaceC0059ouw
                            public final void ouw(com.bykv.vk.openvk.ouw.ouw.ouw.lh.lh lhVar2, int i14) {
                                ko.lh("RewardVideoLoadManager", "RewardVideoLog: onVideoPreloadSuccess");
                                jgVar.ouw.ouw();
                                if (z10) {
                                    cf.ouw(ryl.this.ouw).ouw(adSlot, ouwVar);
                                    ko.lh("RewardVideoLoadManager", "RewardVideoLog: ad json save");
                                } else {
                                    if (lhVar == null || zih.yu().ryl() != 1) {
                                        return;
                                    }
                                    lhVar.onAdLoaded(jgVar.ouw);
                                }
                            }

                            @Override // com.bykv.vk.openvk.ouw.ouw.ouw.fkw.ouw.InterfaceC0059ouw
                            public final void ouw(com.bykv.vk.openvk.ouw.ouw.ouw.lh.lh lhVar2, int i14, String str) {
                                ko.lh("RewardVideoLoadManager", "RewardVideoLog: onVideoPreloadFail");
                                if (lhVar == null || zih.yu().ryl() != 1) {
                                    return;
                                }
                                lhVar.onError(i14, str);
                            }
                        });
                        b10 = 0;
                    }
                    if (b10 != 0) {
                        lhVar.onAdLoaded(jgVar.ouw);
                    }
                }
            } else {
                if (zih.yu().ryl() == b12) {
                    b10 = b12;
                } else {
                    b10 = b11;
                }
                if (od.lh(vppVar2)) {
                    if (vppVar2.f12874sd != null) {
                        com.bytedance.sdk.openadsdk.core.mwh.ouw.vt vtVarOuw2 = vpp.ouw(CacheDirFactory.getICacheDir(vppVar2.f12875sm).ouw(), vppVar2);
                        vtVarOuw2.ouw("material_meta", vppVar2);
                        vtVarOuw2.ouw("ad_slot", adSlot);
                        com.bytedance.sdk.openadsdk.core.mwh.fkw.ouw.ouw(vtVarOuw2, new com.bykv.vk.openvk.ouw.ouw.ouw.fkw.vt() { // from class: com.bytedance.sdk.openadsdk.component.reward.ryl.9
                            @Override // com.bykv.vk.openvk.ouw.ouw.ouw.fkw.ouw.InterfaceC0059ouw
                            public final void ouw(com.bykv.vk.openvk.ouw.ouw.ouw.lh.lh lhVar2, int i14) {
                                ko.lh("RewardVideoLoadManager", "RewardVideoLog: onVideoPreloadSuccess");
                                jgVar.ouw.ouw();
                                if (z10) {
                                    cf.ouw(ryl.this.ouw).ouw(adSlot, ouwVar);
                                    ko.lh("RewardVideoLoadManager", "RewardVideoLog: ad json save");
                                } else {
                                    if (lhVar == null || zih.yu().ryl() != 1) {
                                        return;
                                    }
                                    lhVar.onAdLoaded(jgVar.ouw);
                                }
                            }

                            @Override // com.bykv.vk.openvk.ouw.ouw.ouw.fkw.ouw.InterfaceC0059ouw
                            public final void ouw(com.bykv.vk.openvk.ouw.ouw.ouw.lh.lh lhVar2, int i14, String str) {
                                ko.lh("RewardVideoLoadManager", "RewardVideoLog: onVideoPreloadFail");
                                if (lhVar == null || zih.yu().ryl() != 1) {
                                    return;
                                }
                                lhVar.onError(i14, str);
                            }
                        });
                        b10 = 0;
                    }
                } else if (z10) {
                    cf.ouw(rylVar.ouw).ouw(adSlot, ouwVar);
                }
                if (b10 != 0) {
                    lhVar.onAdLoaded(jgVar.ouw);
                }
            }
            if (ouwVar.yu() && i13 != 43) {
                return;
            }
            i12++;
            b11 = 0;
            b12 = 1;
        }
    }

    public static /* synthetic */ void ouw(ryl rylVar, AdSlot adSlot) {
        String codeId = adSlot.getCodeId();
        cf cfVarOuw = cf.ouw(rylVar.ouw);
        if (com.bytedance.sdk.openadsdk.utils.vt.ouw()) {
            com.bytedance.sdk.openadsdk.common.vt.ouw("sp_reward_video_new").yu(codeId);
        } else {
            cfVarOuw.vt.le(codeId);
        }
    }
}
