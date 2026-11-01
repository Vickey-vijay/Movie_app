package com.mbridge.msdk.videocommon.download;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.utils.Utils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.a1;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: UnitCacheControllerRefactor.java */
/* JADX INFO: loaded from: classes4.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.listener.a f39530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ConcurrentHashMap<String, com.mbridge.msdk.videocommon.listener.a> f39531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f39532c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f39533d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.setting.c f39534e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f39535f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final CopyOnWriteArrayList<CampaignEx> f39536g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ConcurrentHashMap<String, com.mbridge.msdk.videocommon.download.a> f39537h;

    /* JADX INFO: compiled from: UnitCacheControllerRefactor.java */
    public static final class a implements com.mbridge.msdk.videocommon.listener.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f39538a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ConcurrentHashMap<String, com.mbridge.msdk.videocommon.listener.a> f39539b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final com.mbridge.msdk.videocommon.listener.a f39540c;

        private void b(String str) {
            com.mbridge.msdk.videocommon.listener.a aVar = this.f39540c;
            if (aVar != null) {
                try {
                    aVar.a(str);
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("RewardVideoRefactorManager", this.f39538a + " videoDownloadListener onDownLoadDone error: " + e10.getMessage());
                    }
                }
            }
            ConcurrentHashMap<String, com.mbridge.msdk.videocommon.listener.a> concurrentHashMap = this.f39539b;
            if (concurrentHashMap != null) {
                Iterator<com.mbridge.msdk.videocommon.listener.a> it = concurrentHashMap.values().iterator();
                while (it.hasNext()) {
                    try {
                        it.next().a(str);
                    } catch (Exception e11) {
                        if (MBridgeConstans.DEBUG) {
                            q0.b("RewardVideoRefactorManager", this.f39538a + " videoDownloadListener onDownLoadDone error: " + e11.getMessage());
                        }
                    }
                }
            }
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public void a(String str) {
            b(str);
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public void a(String str, String str2) {
            b(str, str2);
        }

        public a(String str, ConcurrentHashMap<String, com.mbridge.msdk.videocommon.listener.a> concurrentHashMap, com.mbridge.msdk.videocommon.listener.a aVar) {
            this.f39538a = str;
            this.f39539b = concurrentHashMap;
            this.f39540c = aVar;
        }

        private void b(String str, String str2) {
            com.mbridge.msdk.videocommon.listener.a aVar = this.f39540c;
            if (aVar != null) {
                try {
                    aVar.a(str, str2);
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("RewardVideoRefactorManager", this.f39538a + " videoDownloadListener onDownLoadFailed error: " + e10.getMessage());
                    }
                }
            }
            ConcurrentHashMap<String, com.mbridge.msdk.videocommon.listener.a> concurrentHashMap = this.f39539b;
            if (concurrentHashMap != null) {
                Iterator<com.mbridge.msdk.videocommon.listener.a> it = concurrentHashMap.values().iterator();
                while (it.hasNext()) {
                    try {
                        it.next().a(str, str2);
                    } catch (Exception e11) {
                        if (MBridgeConstans.DEBUG) {
                            q0.b("RewardVideoRefactorManager", this.f39538a + " videoDownloadListener onDownLoadFailed error: " + e11.getMessage());
                        }
                    }
                }
            }
        }
    }

    public k(List<CampaignEx> list, String str, int i10) {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        this.f39536g = copyOnWriteArrayList;
        this.f39537h = new ConcurrentHashMap<>();
        this.f39532c = com.mbridge.msdk.foundation.controller.c.n().d();
        this.f39533d = str;
        this.f39535f = i10;
        if (list != null) {
            copyOnWriteArrayList.addAll(list);
        }
    }

    private String a(int i10) {
        if (i10 == 0) {
            return "DOWNLOAD_READY";
        }
        if (i10 == 1) {
            return "DOWNLOAD_RUN";
        }
        if (i10 == 2) {
            return "DOWNLOAD_PAUSE";
        }
        if (i10 != 4) {
            return i10 != 5 ? "Unknown" : "DOWNLOAD_DONE";
        }
        return "DOWNLOAD_STOP";
    }

    private String b(CampaignEx campaignEx) {
        return campaignEx == null ? "" : campaignEx.getendcard_url();
    }

    private int c() {
        com.mbridge.msdk.videocommon.setting.c cVarB = b(h());
        if (cVarB == null) {
            return 0;
        }
        try {
            return cVarB.g();
        } catch (Exception e10) {
            if (!MBridgeConstans.DEBUG) {
                return 0;
            }
            q0.a("RewardVideoRefactorManager", h() + " getCDRate error " + e10.getMessage());
            return 0;
        }
    }

    private int d(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return 1;
        }
        try {
            return campaignEx.getVideoCtnType();
        } catch (Exception e10) {
            if (!MBridgeConstans.DEBUG) {
                return 1;
            }
            q0.a("RewardVideoRefactorManager", h() + " getVideoCtnType error " + e10.getMessage());
            return 1;
        }
    }

    private String e(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return "";
        }
        try {
            CampaignEx.c rewardTemplateMode = campaignEx.getRewardTemplateMode();
            if (rewardTemplateMode != null) {
                return rewardTemplateMode.j();
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardVideoRefactorManager", h() + " getVideoTemplateUrl error", e10);
            }
        }
        return "";
    }

    private void f(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return;
        }
        try {
            String str = campaignEx.getRequestId() + campaignEx.getId() + campaignEx.getVideoUrlEncode();
            if (this.f39537h.containsKey(str)) {
                return;
            }
            a(campaignEx, str, (com.mbridge.msdk.videocommon.download.a) null);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardVideoRefactorManager", h() + " handlerCampaignLoadEvent error", e10);
            }
        }
    }

    private boolean g(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return false;
        }
        try {
            return campaignEx.getPlayable_ads_without_video() == 2;
        } catch (Throwable th2) {
            if (!MBridgeConstans.DEBUG) {
                return false;
            }
            q0.a("RewardVideoRefactorManager", h() + " isPlayerAbleAds error:" + th2.getMessage());
            return false;
        }
    }

    public void a() {
    }

    public void a(com.mbridge.msdk.videocommon.listener.a aVar) {
        this.f39530a = aVar;
    }

    public void h(CampaignEx campaignEx) {
        if (campaignEx != null) {
            try {
                this.f39536g.add(campaignEx);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardVideoRefactorManager", h() + " update error", e10);
                }
            }
        }
    }

    public void k() {
    }

    private com.mbridge.msdk.videocommon.setting.c b(String str) {
        try {
            if (this.f39534e == null) {
                this.f39534e = com.mbridge.msdk.videocommon.setting.b.b().a(com.mbridge.msdk.foundation.controller.c.n().b(), str, b() == 287);
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.a("RewardVideoRefactorManager", h() + " getRewardUnitSetting error " + e10.getMessage());
            }
        }
        return this.f39534e;
    }

    public void a(String str, com.mbridge.msdk.videocommon.listener.a aVar) {
        if (this.f39531b == null) {
            this.f39531b = new ConcurrentHashMap<>();
        }
        if (aVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f39531b.put(str, aVar);
    }

    public com.mbridge.msdk.videocommon.download.a i() {
        List<com.mbridge.msdk.videocommon.download.a> listA;
        if (this.f39536g.size() == 0) {
            q0.a("RewardVideoRefactorManager", h() + " isReady campaignExes is null");
            return null;
        }
        try {
            listA = a((List<CampaignEx>) this.f39536g, false);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardVideoRefactorManager", h() + " isReady error", e10);
            }
            listA = null;
        }
        if (listA == null || listA.size() <= 0) {
            return null;
        }
        return listA.get(0);
    }

    public void j() {
        a(this.f39536g);
    }

    private int g() {
        try {
            return b(this.f39533d).w();
        } catch (Throwable th2) {
            if (!MBridgeConstans.DEBUG) {
                return 100;
            }
            q0.a("RewardVideoRefactorManager", h() + " getRewardReadyRate error:" + th2.getMessage());
            return 100;
        }
    }

    public com.mbridge.msdk.videocommon.download.a d() {
        try {
            return i();
        } catch (Throwable th2) {
            if (!MBridgeConstans.DEBUG) {
                return null;
            }
            q0.b("RewardVideoRefactorManager", h() + " getCampaignDownLoadTask error:" + th2.getMessage());
            return null;
        }
    }

    public String h() {
        return this.f39533d;
    }

    public void c(String str) {
        com.mbridge.msdk.videocommon.download.a aVarRemove;
        CampaignEx campaignExH;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            if (!this.f39537h.containsKey(str) || (aVarRemove = this.f39537h.remove(str)) == null || (campaignExH = aVarRemove.h()) == null) {
                return;
            }
            this.f39536g.remove(campaignExH);
            if (MBridgeConstans.DEBUG) {
                q0.a("RewardVideoRefactorManager", h() + " removeCampaignDownloadTask campaign name: " + campaignExH.getAppName());
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardVideoRefactorManager", h() + " removeCampaignDownloadTask error:" + e10.getMessage());
            }
        }
    }

    public CopyOnWriteArrayList<Map<String, com.mbridge.msdk.videocommon.download.a>> e() {
        try {
            CopyOnWriteArrayList<Map<String, com.mbridge.msdk.videocommon.download.a>> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            copyOnWriteArrayList.add(this.f39537h);
            return copyOnWriteArrayList;
        } catch (Exception e10) {
            if (!MBridgeConstans.DEBUG) {
                return null;
            }
            q0.b("RewardVideoRefactorManager", h() + " getCampaignDownLoadTaskList error:" + e10.getMessage());
            return null;
        }
    }

    private int f() {
        if (TextUtils.isEmpty(h())) {
            return 1;
        }
        try {
            com.mbridge.msdk.videocommon.setting.c cVarB = b(h());
            if (cVarB != null) {
                return cVarB.l();
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.a("RewardVideoRefactorManager", h() + " getDlnet error " + e10.getMessage());
            }
        }
        return 1;
    }

    public void a(List<CampaignEx> list) {
        if (list != null) {
            try {
                this.f39536g.addAll(list);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardVideoRefactorManager", h() + " update error", e10);
                }
            }
        }
    }

    public int b() {
        return this.f39535f;
    }

    public k(CampaignEx campaignEx, String str, int i10) {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        this.f39536g = copyOnWriteArrayList;
        this.f39537h = new ConcurrentHashMap<>();
        this.f39532c = com.mbridge.msdk.foundation.controller.c.n().d();
        this.f39533d = str;
        this.f39535f = i10;
        if (campaignEx != null) {
            copyOnWriteArrayList.add(campaignEx);
        }
    }

    private boolean b(CampaignEx campaignEx, String str, com.mbridge.msdk.videocommon.download.a aVar) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        if ((aVar == null || !aVar.x()) && !campaignEx.isDynamicView()) {
            return ((campaignEx.getRsIgnoreCheckRule() == null || campaignEx.getRsIgnoreCheckRule().size() <= 0 || !campaignEx.getRsIgnoreCheckRule().contains(1)) && campaignEx.getLoadTimeoutState() == 0 && g.a(str) == null) ? false : true;
        }
        return true;
    }

    private void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
        if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() != 0) {
            for (CampaignEx campaignEx : copyOnWriteArrayList) {
                if (campaignEx != null) {
                    f(campaignEx);
                }
            }
            return;
        }
        q0.a("RewardVideoRefactorManager", h() + " load campaignExes is null");
    }

    public List<com.mbridge.msdk.videocommon.download.a> a(List<CampaignEx> list, boolean z10) {
        ArrayList arrayList = new ArrayList();
        if (list != null && list.size() != 0) {
            int size = list.size();
            for (CampaignEx campaignEx : list) {
                if (campaignEx != null) {
                    a(z10, arrayList, size, campaignEx);
                }
            }
            return arrayList;
        }
        q0.a("RewardVideoRefactorManager", h() + " isReady campaignExes is null");
        return arrayList;
    }

    private int c(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return -1;
        }
        if (campaignEx.getReady_rate() != -1) {
            return campaignEx.getReady_rate();
        }
        return g();
    }

    private void a(boolean z10, List<com.mbridge.msdk.videocommon.download.a> list, int i10, CampaignEx campaignEx) {
        try {
            String str = campaignEx.getRequestId() + campaignEx.getId() + campaignEx.getVideoUrlEncode();
            a(z10, list, campaignEx, a(campaignEx, str, this.f39537h.get(str)), i10);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardVideoRefactorManager", h() + " isReady error", e10);
            }
        }
    }

    private com.mbridge.msdk.videocommon.download.a a(CampaignEx campaignEx, String str, com.mbridge.msdk.videocommon.download.a aVar) {
        if (aVar != null) {
            return aVar;
        }
        com.mbridge.msdk.videocommon.download.a aVarA = a(campaignEx);
        aVarA.C();
        this.f39537h.put(str, aVarA);
        return aVarA;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0066  */
    /* JADX WARN: Code duplicated, block: B:47:0x007f  */
    /* JADX WARN: Code duplicated, block: B:50:0x009d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:55:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:47:0x007f, please report this as an issue */
    private void a(boolean z10, List<com.mbridge.msdk.videocommon.download.a> list, CampaignEx campaignEx, com.mbridge.msdk.videocommon.download.a aVar, int i10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        ArrayList<Integer> rsIgnoreCheckRule;
        if (list == null || campaignEx == null || aVar == null) {
            return;
        }
        try {
            int loadTimeoutState = campaignEx.getLoadTimeoutState();
            z11 = aVar.w() || a(campaignEx, aVar, c(campaignEx), z10, f());
            try {
                aVar.e(z11);
                z12 = aVar.u() || a(b(campaignEx), campaignEx, aVar);
                if (loadTimeoutState == 0 && z12) {
                    try {
                        aVar.c(true);
                        if (aVar.x()) {
                            z13 = true;
                        } else {
                            z13 = true;
                        }
                        if (loadTimeoutState == 0) {
                            aVar.f(true);
                        }
                    } catch (Exception e10) {
                        e = e10;
                        z13 = false;
                        if (MBridgeConstans.DEBUG) {
                            q0.b("RewardVideoRefactorManager", h() + " checkResourceReadyState error", e);
                        }
                        if (aVar.s()) {
                            z14 = true;
                        } else {
                            z14 = true;
                        }
                        aVar.a(z14);
                        if (z14) {
                            list.add(aVar);
                        }
                        if (MBridgeConstans.DEBUG) {
                            rsIgnoreCheckRule = campaignEx.getRsIgnoreCheckRule();
                            if (rsIgnoreCheckRule == null) {
                                rsIgnoreCheckRule = new ArrayList<>();
                            }
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(h());
                            sb2.append("  campaign name = ");
                            sb2.append(campaignEx.getAppName());
                            sb2.append("\n\t\tcampaign id = ");
                            sb2.append(campaignEx.getId());
                            sb2.append("\n\t\trequest id = ");
                            sb2.append(campaignEx.getRequestId());
                            sb2.append("\n\t\tadType = ");
                            sb2.append(b());
                            sb2.append("\n\t\tunitID = ");
                            sb2.append(h());
                            sb2.append("\n\t\tisReady = ");
                            sb2.append(z14);
                            sb2.append("\n\t\tisDynamicView = ");
                            sb2.append(campaignEx.isDynamicView());
                            sb2.append("\n\t\tisTPL = ");
                            sb2.append(!TextUtils.isEmpty(campaignEx.getCMPTEntryUrl()));
                            sb2.append("\n\t\tcurrentSuccessSize = ");
                            sb2.append(list.size());
                            sb2.append("\n\t\tisReadyCheckSize = ");
                            sb2.append(i10);
                            sb2.append("\n\t\ttotalCampaignSize = ");
                            sb2.append(this.f39536g.size());
                            sb2.append("\n\t\tlinkType = ");
                            sb2.append(campaignEx.getLinkType());
                            sb2.append("\n\t\tloadTimeoutState = ");
                            sb2.append(campaignEx.getLoadTimeoutState());
                            sb2.append("\n\t\tisVideoReady = ");
                            sb2.append(z11);
                            sb2.append("\n\t\t\tisIgnore = ");
                            sb2.append(rsIgnoreCheckRule.contains(0));
                            sb2.append("\n\t\t\treadyRate == ");
                            sb2.append(c(campaignEx));
                            sb2.append("\n\t\t\tCDRate = ");
                            sb2.append(c());
                            sb2.append("\n\t\t\tdlnet = ");
                            sb2.append(f());
                            sb2.append("\n\t\t\tctn = ");
                            sb2.append(d(campaignEx));
                            sb2.append("\n\t\t\tdownloadState = ");
                            sb2.append(a(aVar.o()));
                            sb2.append("\n\t\tisTemplateReady = ");
                            sb2.append(z13);
                            sb2.append("\n\t\t\tisIgnore = ");
                            sb2.append(rsIgnoreCheckRule.contains(1));
                            sb2.append("\n\t\tisEndCardReady = ");
                            sb2.append(z12);
                            sb2.append("\n\t\t\tisIgnore = ");
                            sb2.append(rsIgnoreCheckRule.contains(2));
                            sb2.append("\n\t\t\tisOnlyPlayable = ");
                            sb2.append(g(campaignEx));
                            sb2.append("\n\t\t\tisPlayableEndCard(dynamicView) = ");
                            sb2.append(v0.l(campaignEx.getendcard_url()));
                            q0.b("RewardVideoRefactorManager", sb2.toString());
                        }
                    }
                } else {
                    if (aVar.x() || b(campaignEx, e(campaignEx), aVar)) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (loadTimeoutState == 0 && z13) {
                        try {
                            aVar.f(true);
                        } catch (Exception e11) {
                            e = e11;
                            if (MBridgeConstans.DEBUG) {
                                q0.b("RewardVideoRefactorManager", h() + " checkResourceReadyState error", e);
                            }
                        }
                    }
                }
            } catch (Exception e12) {
                e = e12;
                z12 = false;
                z13 = z12;
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardVideoRefactorManager", h() + " checkResourceReadyState error", e);
                }
                if (aVar.s()) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                aVar.a(z14);
                if (z14) {
                    list.add(aVar);
                }
                if (MBridgeConstans.DEBUG) {
                    rsIgnoreCheckRule = campaignEx.getRsIgnoreCheckRule();
                    if (rsIgnoreCheckRule == null) {
                        rsIgnoreCheckRule = new ArrayList<>();
                    }
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(h());
                    sb3.append("  campaign name = ");
                    sb3.append(campaignEx.getAppName());
                    sb3.append("\n\t\tcampaign id = ");
                    sb3.append(campaignEx.getId());
                    sb3.append("\n\t\trequest id = ");
                    sb3.append(campaignEx.getRequestId());
                    sb3.append("\n\t\tadType = ");
                    sb3.append(b());
                    sb3.append("\n\t\tunitID = ");
                    sb3.append(h());
                    sb3.append("\n\t\tisReady = ");
                    sb3.append(z14);
                    sb3.append("\n\t\tisDynamicView = ");
                    sb3.append(campaignEx.isDynamicView());
                    sb3.append("\n\t\tisTPL = ");
                    sb3.append(!TextUtils.isEmpty(campaignEx.getCMPTEntryUrl()));
                    sb3.append("\n\t\tcurrentSuccessSize = ");
                    sb3.append(list.size());
                    sb3.append("\n\t\tisReadyCheckSize = ");
                    sb3.append(i10);
                    sb3.append("\n\t\ttotalCampaignSize = ");
                    sb3.append(this.f39536g.size());
                    sb3.append("\n\t\tlinkType = ");
                    sb3.append(campaignEx.getLinkType());
                    sb3.append("\n\t\tloadTimeoutState = ");
                    sb3.append(campaignEx.getLoadTimeoutState());
                    sb3.append("\n\t\tisVideoReady = ");
                    sb3.append(z11);
                    sb3.append("\n\t\t\tisIgnore = ");
                    sb3.append(rsIgnoreCheckRule.contains(0));
                    sb3.append("\n\t\t\treadyRate == ");
                    sb3.append(c(campaignEx));
                    sb3.append("\n\t\t\tCDRate = ");
                    sb3.append(c());
                    sb3.append("\n\t\t\tdlnet = ");
                    sb3.append(f());
                    sb3.append("\n\t\t\tctn = ");
                    sb3.append(d(campaignEx));
                    sb3.append("\n\t\t\tdownloadState = ");
                    sb3.append(a(aVar.o()));
                    sb3.append("\n\t\tisTemplateReady = ");
                    sb3.append(z13);
                    sb3.append("\n\t\t\tisIgnore = ");
                    sb3.append(rsIgnoreCheckRule.contains(1));
                    sb3.append("\n\t\tisEndCardReady = ");
                    sb3.append(z12);
                    sb3.append("\n\t\t\tisIgnore = ");
                    sb3.append(rsIgnoreCheckRule.contains(2));
                    sb3.append("\n\t\t\tisOnlyPlayable = ");
                    sb3.append(g(campaignEx));
                    sb3.append("\n\t\t\tisPlayableEndCard(dynamicView) = ");
                    sb3.append(v0.l(campaignEx.getendcard_url()));
                    q0.b("RewardVideoRefactorManager", sb3.toString());
                }
            }
        } catch (Exception e13) {
            e = e13;
            z11 = false;
            z12 = false;
        }
        if (aVar.s() || (z11 && z12 && z13)) {
            z14 = true;
        } else {
            z14 = false;
        }
        aVar.a(z14);
        if (z14) {
            list.add(aVar);
        }
        if (MBridgeConstans.DEBUG) {
            rsIgnoreCheckRule = campaignEx.getRsIgnoreCheckRule();
            if (rsIgnoreCheckRule == null) {
                rsIgnoreCheckRule = new ArrayList<>();
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append(h());
            sb4.append("  campaign name = ");
            sb4.append(campaignEx.getAppName());
            sb4.append("\n\t\tcampaign id = ");
            sb4.append(campaignEx.getId());
            sb4.append("\n\t\trequest id = ");
            sb4.append(campaignEx.getRequestId());
            sb4.append("\n\t\tadType = ");
            sb4.append(b());
            sb4.append("\n\t\tunitID = ");
            sb4.append(h());
            sb4.append("\n\t\tisReady = ");
            sb4.append(z14);
            sb4.append("\n\t\tisDynamicView = ");
            sb4.append(campaignEx.isDynamicView());
            sb4.append("\n\t\tisTPL = ");
            sb4.append(!TextUtils.isEmpty(campaignEx.getCMPTEntryUrl()));
            sb4.append("\n\t\tcurrentSuccessSize = ");
            sb4.append(list.size());
            sb4.append("\n\t\tisReadyCheckSize = ");
            sb4.append(i10);
            sb4.append("\n\t\ttotalCampaignSize = ");
            sb4.append(this.f39536g.size());
            sb4.append("\n\t\tlinkType = ");
            sb4.append(campaignEx.getLinkType());
            sb4.append("\n\t\tloadTimeoutState = ");
            sb4.append(campaignEx.getLoadTimeoutState());
            sb4.append("\n\t\tisVideoReady = ");
            sb4.append(z11);
            sb4.append("\n\t\t\tisIgnore = ");
            sb4.append(rsIgnoreCheckRule.contains(0));
            sb4.append("\n\t\t\treadyRate == ");
            sb4.append(c(campaignEx));
            sb4.append("\n\t\t\tCDRate = ");
            sb4.append(c());
            sb4.append("\n\t\t\tdlnet = ");
            sb4.append(f());
            sb4.append("\n\t\t\tctn = ");
            sb4.append(d(campaignEx));
            sb4.append("\n\t\t\tdownloadState = ");
            sb4.append(a(aVar.o()));
            sb4.append("\n\t\tisTemplateReady = ");
            sb4.append(z13);
            sb4.append("\n\t\t\tisIgnore = ");
            sb4.append(rsIgnoreCheckRule.contains(1));
            sb4.append("\n\t\tisEndCardReady = ");
            sb4.append(z12);
            sb4.append("\n\t\t\tisIgnore = ");
            sb4.append(rsIgnoreCheckRule.contains(2));
            sb4.append("\n\t\t\tisOnlyPlayable = ");
            sb4.append(g(campaignEx));
            sb4.append("\n\t\t\tisPlayableEndCard(dynamicView) = ");
            sb4.append(v0.l(campaignEx.getendcard_url()));
            q0.b("RewardVideoRefactorManager", sb4.toString());
        }
    }

    private com.mbridge.msdk.videocommon.download.a a(CampaignEx campaignEx) {
        com.mbridge.msdk.videocommon.download.a aVar = null;
        try {
            com.mbridge.msdk.videocommon.download.a aVar2 = new com.mbridge.msdk.videocommon.download.a(this.f39532c, campaignEx, h(), f());
            try {
                aVar2.e(campaignEx);
                aVar2.a(b());
                aVar2.d(c(campaignEx));
                aVar2.b(c());
                aVar2.e(d(campaignEx));
                aVar2.a((c) null);
                aVar2.a(new a(h(), this.f39531b, this.f39530a));
                return aVar2;
            } catch (Exception e10) {
                e = e10;
                aVar = aVar2;
                if (MBridgeConstans.DEBUG) {
                    q0.a("RewardVideoRefactorManager", h() + " createAndStartCampaignDownloadTask error " + e.getMessage());
                }
                return aVar;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    private boolean a(com.mbridge.msdk.videocommon.download.a aVar, int i10) {
        if (aVar == null || TextUtils.isEmpty(aVar.i())) {
            return true;
        }
        if (i10 == 0) {
            return (aVar.h() == null || TextUtils.isEmpty(aVar.h().getVideoUrlEncode())) ? false : true;
        }
        return Utils.getDownloadRate(aVar.j(), aVar.m()) >= i10;
    }

    private boolean a(CampaignEx campaignEx, com.mbridge.msdk.videocommon.download.a aVar, int i10, boolean z10, int i11) {
        if (aVar == null || campaignEx == null) {
            return false;
        }
        if (aVar.w() || g(campaignEx) || TextUtils.isEmpty(aVar.i()) || i11 == 3) {
            return true;
        }
        if (campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0 && campaignEx.getRsIgnoreCheckRule().contains(0)) {
            return true;
        }
        if (campaignEx.getIsTimeoutCheckVideoStatus() == 1 && campaignEx.getVideoCheckType() == 1) {
            return true;
        }
        long jM = aVar.m();
        long j10 = aVar.j();
        if (z10 && campaignEx.getVideoCheckType() == 1) {
            if (i10 == 0) {
                return true;
            }
            if ((j10 != 0 || jM != 0) && jM >= ((long) (i10 / 100)) * j10) {
                campaignEx.setIsTimeoutCheckVideoStatus(1);
                return true;
            }
        }
        return a(aVar, i10);
    }

    private boolean a(String str, CampaignEx campaignEx, com.mbridge.msdk.videocommon.download.a aVar) {
        if (campaignEx != null && aVar != null) {
            try {
                if (aVar.u()) {
                    q0.a("RewardVideoRefactorManager", h() + " checkEndCardZipOrSourceDownLoad endCard download success");
                    return true;
                }
                if (campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0 && campaignEx.getRsIgnoreCheckRule().contains(2)) {
                    return true;
                }
                if ((campaignEx.isDynamicView() && !v0.l(str)) || a1.a(str) || a(str, campaignEx)) {
                    return true;
                }
            } catch (Throwable th2) {
                if (MBridgeConstans.DEBUG) {
                    q0.a("RewardVideoRefactorManager", h() + " checkEndCardDownload error " + th2.getMessage());
                }
            }
        }
        return false;
    }

    private boolean a(String str, CampaignEx campaignEx) {
        if (campaignEx == null) {
            return false;
        }
        if (campaignEx.isMraid() || TextUtils.isEmpty(str)) {
            return true;
        }
        if (campaignEx.getLoadTimeoutState() == 1 && !g(campaignEx)) {
            return true;
        }
        if ((campaignEx.getRsIgnoreCheckRule() == null || campaignEx.getRsIgnoreCheckRule().size() <= 0 || !campaignEx.getRsIgnoreCheckRule().contains(2)) && !a1.b(g.a(str))) {
            return a1.b(g.b(str));
        }
        return true;
    }

    public com.mbridge.msdk.videocommon.download.a a(String str) {
        if (!TextUtils.isEmpty(str) && this.f39537h.containsKey(str)) {
            return this.f39537h.get(str);
        }
        return null;
    }
}
