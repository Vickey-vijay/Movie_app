package com.bytedance.sdk.openadsdk.component.reward;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.ksc;
import com.bytedance.sdk.component.utils.vm;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
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

/* JADX INFO: loaded from: classes.dex */
public class fkw {

    @SuppressLint({"StaticFieldLeak"})
    private static volatile fkw vt;
    private com.bytedance.sdk.component.pno.pno fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private final ksc.ouw f12312le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private final AtomicBoolean f12313lh;
    public final Context ouw;
    private final List<lh> yu;

    public static class lh extends com.bytedance.sdk.component.pno.pno {

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public final com.bytedance.sdk.openadsdk.core.model.ouw f12321lh;
        public final vpp ouw;
        public final AdSlot vt;

        public lh(vpp vppVar, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.ouw ouwVar) {
            super("Fullscreen Task");
            this.ouw = vppVar;
            this.vt = adSlot;
            this.f12321lh = ouwVar;
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
            ko.lh("ScreenVideoLoadM", "FullScreenLog: preload video ");
            com.bytedance.sdk.openadsdk.core.mwh.fkw.ouw.ouw(vtVarOuw, new com.bykv.vk.openvk.ouw.ouw.ouw.fkw.vt() { // from class: com.bytedance.sdk.openadsdk.component.reward.fkw.lh.1
                @Override // com.bykv.vk.openvk.ouw.ouw.ouw.fkw.ouw.InterfaceC0059ouw
                public final void ouw(com.bykv.vk.openvk.ouw.ouw.ouw.lh.lh lhVar, int i10) {
                    yu yuVarOuw = yu.ouw(zih.ouw());
                    lh lhVar2 = lh.this;
                    yuVarOuw.ouw(lhVar2.vt, lhVar2.f12321lh);
                    ko.lh("ScreenVideoLoadM", "FullScreenLog: preload video success with net change ");
                }

                @Override // com.bykv.vk.openvk.ouw.ouw.ouw.fkw.ouw.InterfaceC0059ouw
                public final void ouw(com.bykv.vk.openvk.ouw.ouw.ouw.lh.lh lhVar, int i10, String str) {
                    ko.lh("ScreenVideoLoadM", "FullScreenLog: preload video success with net fail with net change ");
                }
            });
        }
    }

    public static class ouw implements PAGInterstitialAdLoadListener {
        private final boolean fkw;

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        private final com.bytedance.sdk.openadsdk.core.model.ouw f12322lh;
        private final Context ouw;
        private final AdSlot vt;
        private final PAGInterstitialAdLoadListener yu;

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
        public final /* synthetic */ void onAdLoaded(PAGInterstitialAd pAGInterstitialAd) {
            fkw.ouw(this.ouw).ouw(this.vt, this.f12322lh, this.yu, pAGInterstitialAd, this.fkw);
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.ra
        public final void onError(int i10, String str) {
            PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener = this.yu;
            if (pAGInterstitialAdLoadListener != null) {
                pAGInterstitialAdLoadListener.onError(i10, str);
            }
        }

        public ouw(Context context, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.ouw ouwVar, PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener, boolean z10) {
            this.ouw = context;
            this.vt = adSlot;
            this.f12322lh = ouwVar;
            this.yu = pAGInterstitialAdLoadListener;
            this.fkw = z10;
        }
    }

    public static class vt implements PAGInterstitialAdLoadListener {

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        private final AtomicInteger f12323lh;
        private final PAGInterstitialAdLoadListener ouw;
        private final AtomicBoolean vt;
        private final com.bytedance.sdk.openadsdk.core.model.ouw yu;

        public /* synthetic */ vt(PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener, com.bytedance.sdk.openadsdk.core.model.ouw ouwVar, byte b10) {
            this(pAGInterstitialAdLoadListener, ouwVar);
        }

        private vt(PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener, com.bytedance.sdk.openadsdk.core.model.ouw ouwVar) {
            this.vt = new AtomicBoolean(false);
            this.ouw = pAGInterstitialAdLoadListener;
            this.yu = ouwVar;
            this.f12323lh = new AtomicInteger(ouw());
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
            if (this.f12323lh.decrementAndGet() > 0 || !this.vt.compareAndSet(false, true)) {
                return;
            }
            this.ouw.onError(i10, str);
            com.bytedance.sdk.openadsdk.rn.lh.ouw("choose_ad_load_error", false, new com.bytedance.sdk.openadsdk.rn.vt() { // from class: com.bytedance.sdk.openadsdk.component.reward.fkw.vt.1
                @Override // com.bytedance.sdk.openadsdk.rn.vt
                @Nullable
                public final com.bytedance.sdk.openadsdk.rn.ouw.lh ouw() throws Exception {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("req_id", vt.this.yu.ouw());
                    com.bytedance.sdk.openadsdk.rn.ouw.yu yuVar = new com.bytedance.sdk.openadsdk.rn.ouw.yu();
                    yuVar.ouw = "choose_ad_load_error";
                    yuVar.bly = jSONObject.toString();
                    return yuVar;
                }
            });
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
        /* JADX INFO: renamed from: ouw, reason: merged with bridge method [inline-methods] */
        public final void onAdLoaded(PAGInterstitialAd pAGInterstitialAd) {
            this.f12323lh.decrementAndGet();
            if (this.ouw == null || !this.vt.compareAndSet(false, true)) {
                return;
            }
            this.ouw.onAdLoaded(pAGInterstitialAd);
        }
    }

    private void lh(final AdSlot adSlot) {
        if (yu.ouw(this.ouw).vt(adSlot.getCodeId(), false) != null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.model.ksc kscVar = new com.bytedance.sdk.openadsdk.core.model.ksc();
        kscVar.f12776lh = 2;
        zih.yu();
        if (com.bytedance.sdk.openadsdk.core.settings.cf.pno(adSlot.getCodeId()) || adSlot.getExpressViewAcceptedWidth() > 0.0f || adSlot.isExpressAd()) {
            kscVar.bly = 2;
        }
        zih.lh().ouw(adSlot, kscVar, 8, new com.bytedance.sdk.openadsdk.core.vpp.ouw() { // from class: com.bytedance.sdk.openadsdk.component.reward.fkw.3
            @Override // com.bytedance.sdk.openadsdk.core.vpp.ouw
            public final void ouw(int i10, String str) {
            }

            @Override // com.bytedance.sdk.openadsdk.core.vpp.ouw
            public final void ouw(com.bytedance.sdk.openadsdk.core.model.ouw ouwVar, com.bytedance.sdk.openadsdk.core.model.lh lhVar) {
                List<vpp> list = ouwVar.yu;
                if (list == null || list.isEmpty()) {
                    return;
                }
                fkw.ouw(fkw.this, ouwVar, new mwh(fkw.this.ouw, ouwVar), adSlot, true, (PAGInterstitialAdLoadListener) null);
            }
        });
    }

    private void vt(final AdSlot adSlot) {
        com.bytedance.sdk.openadsdk.core.model.ksc kscVar = new com.bytedance.sdk.openadsdk.core.model.ksc();
        kscVar.f12776lh = 2;
        zih.yu();
        if (com.bytedance.sdk.openadsdk.core.settings.cf.pno(adSlot.getCodeId()) || adSlot.getExpressViewAcceptedWidth() > 0.0f || adSlot.isExpressAd()) {
            kscVar.bly = 2;
        }
        zih.lh().ouw(adSlot, kscVar, 8, (qbp) new zin() { // from class: com.bytedance.sdk.openadsdk.component.reward.fkw.1
            public boolean ouw = false;

            @Override // com.bytedance.sdk.openadsdk.core.zin, com.bytedance.sdk.openadsdk.core.qbp
            public final String ouw() {
                yu.ouw(fkw.this.ouw);
                return yu.ouw(adSlot.getCodeId(), false);
            }

            @Override // com.bytedance.sdk.openadsdk.core.zin, com.bytedance.sdk.openadsdk.core.vpp.ouw
            public final void ouw(int i10, String str) {
            }

            @Override // com.bytedance.sdk.openadsdk.core.zin, com.bytedance.sdk.openadsdk.core.qbp
            public final boolean ouw(com.bytedance.sdk.openadsdk.core.model.ouw ouwVar) {
                yu.ouw(fkw.this.ouw);
                boolean zOuw = yu.ouw(ouwVar);
                this.ouw = zOuw;
                return zOuw;
            }

            @Override // com.bytedance.sdk.openadsdk.core.zin, com.bytedance.sdk.openadsdk.core.vpp.ouw
            public final void ouw(com.bytedance.sdk.openadsdk.core.model.ouw ouwVar, com.bytedance.sdk.openadsdk.core.model.lh lhVar) {
                List<vpp> list;
                if (this.ouw || (list = ouwVar.yu) == null || list.isEmpty()) {
                    return;
                }
                fkw.ouw(fkw.this, ouwVar, new mwh(fkw.this.ouw, ouwVar), adSlot, true, (PAGInterstitialAdLoadListener) null);
            }
        });
    }

    private fkw(Context context) {
        Context applicationContext;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f12313lh = atomicBoolean;
        this.yu = Collections.synchronizedList(new ArrayList());
        ksc.ouw ouwVar = new ksc.ouw() { // from class: com.bytedance.sdk.openadsdk.component.reward.fkw.2
            @Override // com.bytedance.sdk.component.utils.ksc.ouw
            public final void ouw(boolean z10, int i10) {
                if (z10) {
                    if (fkw.this.fkw == null) {
                        fkw fkwVar = fkw.this;
                        fkwVar.fkw = new com.bytedance.sdk.openadsdk.component.reward.vt("fsv net connect task", fkwVar.yu);
                    }
                    com.bytedance.sdk.component.utils.bly.ouw().post(fkw.this.fkw);
                }
            }
        };
        this.f12312le = ouwVar;
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
        if (this.f12313lh.get()) {
            this.f12313lh.set(false);
            try {
                ksc.ouw(this.f12312le);
            } catch (Exception unused2) {
            }
        }
    }

    public static fkw ouw(Context context) {
        if (vt == null) {
            synchronized (fkw.class) {
                if (vt == null) {
                    vt = new fkw(context);
                }
            }
        }
        return vt;
    }

    public final void ouw() {
        File[] fileArrListFiles;
        File[] fileArrListFiles2;
        try {
            final yu yuVarOuw = yu.ouw(this.ouw);
            if (com.bytedance.sdk.openadsdk.utils.vt.ouw()) {
                com.bytedance.sdk.openadsdk.common.vt.ouw("sp_full_screen_video_new").ouw();
                return;
            }
            try {
                boolean z10 = com.bytedance.sdk.openadsdk.core.bly.fkw("sp_full_screen_video");
                File file = new File(yuVarOuw.ouw.getDataDir(), z10 ? "files" : "shared_prefs");
                if (file.exists() && file.isDirectory() && (fileArrListFiles2 = file.listFiles(new FileFilter() { // from class: com.bytedance.sdk.openadsdk.component.reward.yu.1
                    public AnonymousClass1() {
                    }

                    @Override // java.io.FileFilter
                    public final boolean accept(File file2) {
                        if (file2 != null) {
                            return file2.getName().contains("sp_full_screen_video");
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
                            yuVarOuw.ouw.deleteSharedPreferences(file2.getName().replace(".xml", ""));
                        }
                    }
                }
            } catch (Throwable unused2) {
            }
            File cacheDir = yuVarOuw.ouw.getCacheDir();
            if (cacheDir == null || !cacheDir.exists() || !cacheDir.isDirectory() || (fileArrListFiles = cacheDir.listFiles(new FileFilter() { // from class: com.bytedance.sdk.openadsdk.component.reward.yu.2
                public AnonymousClass2() {
                }

                @Override // java.io.FileFilter
                public final boolean accept(File file3) {
                    if (file3 != null) {
                        return file3.getName().contains("full_screen_video_cache");
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

    public final void ouw(final AdSlot adSlot, final com.bytedance.sdk.openadsdk.core.model.ouw ouwVar, PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener, PAGInterstitialAd pAGInterstitialAd, final boolean z10) {
        com.bytedance.sdk.openadsdk.core.jg.vt().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.fkw.6
            @Override // java.lang.Runnable
            public final void run() {
                if (z10) {
                    fkw.ouw(fkw.this, adSlot);
                } else {
                    yu.ouw(fkw.this.ouw).ouw(adSlot, ouwVar);
                    fkw.ouw(fkw.this, adSlot);
                }
            }
        });
        if (pAGInterstitialAdLoadListener != null) {
            pAGInterstitialAdLoadListener.onAdLoaded(pAGInterstitialAd);
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:47:0x010b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x010d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0117 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x0119  */
    /* JADX WARN: Code duplicated, block: B:52:0x0124  */
    public static /* synthetic */ void ouw(fkw fkwVar, final com.bytedance.sdk.openadsdk.core.model.ouw ouwVar, final mwh mwhVar, final AdSlot adSlot, final boolean z10, PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        byte b10;
        if (!z10) {
            com.bytedance.sdk.openadsdk.jg.ouw.ouw().ouw(ouwVar.lh());
        }
        byte b11 = 0;
        final vt vtVar = new vt(new ouw(fkwVar.ouw, adSlot, ouwVar, pAGInterstitialAdLoadListener, false), ouwVar, b11);
        ex exVar = ouwVar.f12793le;
        byte b12 = 1;
        int i10 = ouwVar.yu() ? 10 : 1;
        if (exVar != null) {
            i10 = exVar.vt;
        }
        for (final int i11 = 0; i11 < ouwVar.yu.size() && i11 < i10; i11++) {
            com.bytedance.sdk.openadsdk.core.mwh.lh.ouw.ouw().ouw(ouwVar.yu.get(i11), new com.bytedance.sdk.openadsdk.core.mwh.lh.ouw.InterfaceC0127ouw() { // from class: com.bytedance.sdk.openadsdk.component.reward.fkw.9
                @Override // com.bytedance.sdk.openadsdk.core.mwh.lh.ouw.InterfaceC0127ouw
                public final void ouw(boolean z11) {
                    com.bytedance.sdk.component.utils.qbp.ouw("ScreenVideoLoadM", "onCachedResponse: i=" + i11 + ", isSuccess=" + z11);
                }
            });
        }
        int i12 = 0;
        while (i12 < ouwVar.yu.size()) {
            vpp vppVar = ouwVar.yu.get(i12);
            int i13 = vppVar.fvf;
            if (i12 == 0 && i13 == 43) {
                vppVar.f12874sd.f10460rn = b11;
            }
            if (z10 && !od.lh(vppVar) && vpp.fkw(vppVar)) {
                zih.yu();
                if (com.bytedance.sdk.openadsdk.core.settings.cf.qbp(adSlot.getCodeId()).yu == b12 && !vm.ouw(fkwVar.ouw)) {
                    lh lhVar = new lh(vppVar, adSlot, ouwVar);
                    if (fkwVar.yu.size() > 0) {
                        fkwVar.yu.remove(b11);
                    }
                    fkwVar.yu.add(lhVar);
                } else {
                    if (zih.yu().ryl() == b12) {
                        b10 = b12;
                    } else {
                        b10 = b11;
                    }
                    if (od.lh(vppVar)) {
                        if (z10) {
                            yu.ouw(fkwVar.ouw).ouw(adSlot, ouwVar);
                        }
                    } else if (vpp.fkw(vppVar)) {
                        if (vppVar.f12874sd != null) {
                            com.bytedance.sdk.openadsdk.core.mwh.ouw.vt vtVarOuw = vpp.ouw(CacheDirFactory.getICacheDir(vppVar.f12875sm).ouw(), vppVar);
                            vtVarOuw.ouw("material_meta", vppVar);
                            vtVarOuw.ouw("ad_slot", adSlot);
                            ko.lh("ScreenVideoLoadM", "FullScreenLog: preload video ");
                            com.bytedance.sdk.openadsdk.core.mwh.fkw.ouw.ouw(vtVarOuw, new com.bykv.vk.openvk.ouw.ouw.ouw.fkw.vt() { // from class: com.bytedance.sdk.openadsdk.component.reward.fkw.10
                                @Override // com.bykv.vk.openvk.ouw.ouw.ouw.fkw.ouw.InterfaceC0059ouw
                                public final void ouw(com.bykv.vk.openvk.ouw.ouw.ouw.lh.lh lhVar2, int i14) {
                                    ko.lh("ScreenVideoLoadM", "FullScreenLog:  onVideoPreloadSuccess");
                                    mwhVar.ouw.ouw();
                                    if (z10) {
                                        yu.ouw(fkw.this.ouw).ouw(adSlot, ouwVar);
                                        ko.lh("ScreenVideoLoadM", "FullScreenLog:  ad json save");
                                        return;
                                    }
                                    ko.lh("ScreenVideoLoadM", "FullScreenLog: onFullScreenVideoCached");
                                    if (vtVar == null || zih.yu().ryl() != 1) {
                                        return;
                                    }
                                    vtVar.onAdLoaded(mwhVar.ouw);
                                }

                                @Override // com.bykv.vk.openvk.ouw.ouw.ouw.fkw.ouw.InterfaceC0059ouw
                                public final void ouw(com.bykv.vk.openvk.ouw.ouw.ouw.lh.lh lhVar2, int i14, String str) {
                                    ko.lh("ScreenVideoLoadM", "FullScreenLog:  onVideoPreloadFail");
                                    if (vtVar == null || zih.yu().ryl() != 1) {
                                        return;
                                    }
                                    vtVar.onError(i14, str);
                                }
                            });
                            b10 = 0;
                        }
                    } else if (z10) {
                        yu.ouw(fkwVar.ouw).ouw(adSlot, ouwVar);
                    }
                    if (b10 != 0) {
                        vtVar.onAdLoaded(mwhVar.ouw);
                    }
                }
            } else {
                if (zih.yu().ryl() == b12) {
                    b10 = b12;
                } else {
                    b10 = b11;
                }
                if (od.lh(vppVar)) {
                    if (vpp.fkw(vppVar)) {
                        if (vppVar.f12874sd != null) {
                            com.bytedance.sdk.openadsdk.core.mwh.ouw.vt vtVarOuw2 = vpp.ouw(CacheDirFactory.getICacheDir(vppVar.f12875sm).ouw(), vppVar);
                            vtVarOuw2.ouw("material_meta", vppVar);
                            vtVarOuw2.ouw("ad_slot", adSlot);
                            ko.lh("ScreenVideoLoadM", "FullScreenLog: preload video ");
                            com.bytedance.sdk.openadsdk.core.mwh.fkw.ouw.ouw(vtVarOuw2, new com.bykv.vk.openvk.ouw.ouw.ouw.fkw.vt() { // from class: com.bytedance.sdk.openadsdk.component.reward.fkw.10
                                @Override // com.bykv.vk.openvk.ouw.ouw.ouw.fkw.ouw.InterfaceC0059ouw
                                public final void ouw(com.bykv.vk.openvk.ouw.ouw.ouw.lh.lh lhVar2, int i14) {
                                    ko.lh("ScreenVideoLoadM", "FullScreenLog:  onVideoPreloadSuccess");
                                    mwhVar.ouw.ouw();
                                    if (z10) {
                                        yu.ouw(fkw.this.ouw).ouw(adSlot, ouwVar);
                                        ko.lh("ScreenVideoLoadM", "FullScreenLog:  ad json save");
                                        return;
                                    }
                                    ko.lh("ScreenVideoLoadM", "FullScreenLog: onFullScreenVideoCached");
                                    if (vtVar == null || zih.yu().ryl() != 1) {
                                        return;
                                    }
                                    vtVar.onAdLoaded(mwhVar.ouw);
                                }

                                @Override // com.bykv.vk.openvk.ouw.ouw.ouw.fkw.ouw.InterfaceC0059ouw
                                public final void ouw(com.bykv.vk.openvk.ouw.ouw.ouw.lh.lh lhVar2, int i14, String str) {
                                    ko.lh("ScreenVideoLoadM", "FullScreenLog:  onVideoPreloadFail");
                                    if (vtVar == null || zih.yu().ryl() != 1) {
                                        return;
                                    }
                                    vtVar.onError(i14, str);
                                }
                            });
                            b10 = 0;
                        }
                    } else if (z10) {
                        yu.ouw(fkwVar.ouw).ouw(adSlot, ouwVar);
                    }
                } else if (z10) {
                    yu.ouw(fkwVar.ouw).ouw(adSlot, ouwVar);
                }
                if (b10 != 0) {
                    vtVar.onAdLoaded(mwhVar.ouw);
                }
            }
            if (ouwVar.yu() && vppVar.fvf != 43) {
                return;
            }
            i12++;
            b11 = 0;
            b12 = 1;
        }
    }

    public static /* synthetic */ void ouw(fkw fkwVar, AdSlot adSlot) {
        String codeId = adSlot.getCodeId();
        yu yuVarOuw = yu.ouw(fkwVar.ouw);
        if (com.bytedance.sdk.openadsdk.utils.vt.ouw()) {
            com.bytedance.sdk.openadsdk.common.vt.ouw("sp_full_screen_video_new").yu(codeId);
        } else {
            yuVarOuw.vt.le(codeId);
        }
    }
}
