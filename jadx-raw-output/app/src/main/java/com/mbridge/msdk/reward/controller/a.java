package com.mbridge.msdk.reward.controller;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.a1;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.s0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.foundation.tools.y0;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.RewardInfo;
import com.mbridge.msdk.videocommon.listener.InterVideoOutListener;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: RewardVideoController.java */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static String f36645b0 = "";

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static String f36646c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static ConcurrentHashMap<String, Integer> f36647d0 = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private static ConcurrentHashMap<String, String> f36648e0 = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static ConcurrentHashMap<String, i> f36649f0 = new ConcurrentHashMap<>();
    private Queue<Integer> I;
    private String J;
    private CopyOnWriteArrayList<CampaignEx> S;
    private List<CampaignEx> T;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f36650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.reward.adapter.c f36652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.setting.c f36653c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.setting.a f36654d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile InterVideoOutListener f36655e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile h f36656f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f36657g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f36658h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private MBridgeIds f36659i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public g f36660j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f36661k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private volatile String f36662l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f36663m;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f36667q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f36668r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f36669s;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f36674x;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f36664n = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f36666p = 2;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f36670t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f36671u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f36672v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f36673w = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f36675y = false;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private String f36676z = "";
    private String A = "";
    private ArrayList<Integer> B = new ArrayList<>(7);
    private boolean C = false;
    private final Object D = new Object();
    public boolean E = false;
    public int F = 25;
    public int G = 1;
    private List<CampaignEx> H = new ArrayList();
    private com.mbridge.msdk.foundation.db.g K = null;
    private volatile boolean L = true;
    private volatile boolean M = false;
    private volatile boolean N = false;
    private volatile boolean O = false;
    private volatile boolean P = false;
    private volatile boolean Q = false;
    private volatile boolean R = false;
    public volatile boolean U = false;
    public volatile boolean V = false;
    public volatile boolean W = false;
    public volatile boolean X = false;
    public volatile boolean Y = false;
    private JSONArray Z = new JSONArray();

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private int f36651a0 = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Handler f36665o = new com.mbridge.msdk.reward.controller.b(this);

    /* JADX INFO: renamed from: com.mbridge.msdk.reward.controller.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: RewardVideoController.java */
    public class C0367a implements com.mbridge.msdk.videocommon.net.c {
        @Override // com.mbridge.msdk.videocommon.net.c
        public void a(String str) {
        }

        @Override // com.mbridge.msdk.videocommon.net.c
        public void onFailed(String str) {
        }

        public C0367a() {
        }
    }

    /* JADX INFO: compiled from: RewardVideoController.java */
    public class b implements com.mbridge.msdk.reward.adapter.b.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public com.mbridge.msdk.foundation.same.report.metrics.c f36678a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CampaignEx f36679b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f36680c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ com.mbridge.msdk.reward.adapter.c f36681d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f36682e;

        /* JADX INFO: renamed from: com.mbridge.msdk.reward.controller.a$b$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: RewardVideoController.java */
        public class RunnableC0368a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ CampaignEx f36684a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CopyOnWriteArrayList f36685b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f36686c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ String f36687d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ String f36688e;

            /* JADX INFO: renamed from: com.mbridge.msdk.reward.controller.a$b$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: RewardVideoController.java */
            public class C0369a implements com.mbridge.msdk.reward.adapter.b.o {
                @Override // com.mbridge.msdk.reward.adapter.b.o
                public void a(String str, String str2, String str3, String str4, String str5, com.mbridge.msdk.videocommon.a.C0412a c0412a) {
                    RunnableC0368a runnableC0368a = RunnableC0368a.this;
                    b bVar = b.this;
                    com.mbridge.msdk.reward.adapter.c cVar = bVar.f36681d;
                    if (cVar != null && cVar.a(runnableC0368a.f36685b, bVar.f36680c, bVar.f36682e)) {
                        if (a.this.f36656f == null || a.this.Y) {
                            return;
                        }
                        a.this.Y = true;
                        RunnableC0368a runnableC0368a2 = RunnableC0368a.this;
                        a.this.a(runnableC0368a2.f36685b);
                        a.this.f36656f.d(str2, str3, b.this.f36678a);
                        return;
                    }
                    a aVar = a.this;
                    aVar.c(str3, (List<CampaignEx>) aVar.T);
                    if (a.this.f36656f == null || a.this.X) {
                        return;
                    }
                    a.this.X = true;
                    com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880015, "errorCode: 3502 errorMessage: temp preload success but isReady false");
                    b bVar2 = b.this;
                    if (bVar2.f36678a == null) {
                        bVar2.f36678a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                    }
                    RunnableC0368a runnableC0368a3 = RunnableC0368a.this;
                    b.this.f36678a.b(runnableC0368a3.f36685b);
                    b.this.f36678a.a(bVarA);
                    a.this.f36656f.b(bVarA, b.this.f36678a);
                }

                public C0369a() {
                }

                @Override // com.mbridge.msdk.reward.adapter.b.o
                public void a(String str, String str2, String str3, com.mbridge.msdk.videocommon.a.C0412a c0412a, com.mbridge.msdk.foundation.error.b bVar) {
                    RunnableC0368a runnableC0368a = RunnableC0368a.this;
                    a aVar = a.this;
                    aVar.c(runnableC0368a.f36687d, (List<CampaignEx>) aVar.T);
                    if (a.this.f36656f == null || a.this.X) {
                        return;
                    }
                    a.this.X = true;
                    bVar.c("errorCode: 3301 errorMessage: temp preload failed");
                    b bVar2 = b.this;
                    if (bVar2.f36678a == null) {
                        bVar2.f36678a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                    }
                    b bVar3 = b.this;
                    bVar3.f36678a.b(a.this.S);
                    b.this.f36678a.a(bVar);
                    a.this.f36656f.b(bVar, b.this.f36678a);
                }
            }

            public RunnableC0368a(CampaignEx campaignEx, CopyOnWriteArrayList copyOnWriteArrayList, String str, String str2, String str3) {
                this.f36684a = campaignEx;
                this.f36685b = copyOnWriteArrayList;
                this.f36686c = str;
                this.f36687d = str2;
                this.f36688e = str3;
            }

            @Override // java.lang.Runnable
            public void run() {
                com.mbridge.msdk.reward.adapter.b.b().a(a.this.f36675y, a.this.f36665o, a.this.f36670t, a.this.f36671u, null, this.f36684a.getRewardTemplateMode().j(), a.this.f36666p, b.this.f36679b, this.f36685b, H5DownLoadManager.getInstance().getH5ResAddress(this.f36684a.getRewardTemplateMode().j()), this.f36686c, this.f36687d, this.f36688e, this.f36684a.getRequestIdNotice(), a.this.f36653c, new C0369a());
            }
        }

        /* JADX INFO: renamed from: com.mbridge.msdk.reward.controller.a$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: RewardVideoController.java */
        public class RunnableC0370b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f36691a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f36692b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f36693c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ CopyOnWriteArrayList f36694d;

            /* JADX INFO: renamed from: com.mbridge.msdk.reward.controller.a$b$b$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: RewardVideoController.java */
            public class C0371a implements com.mbridge.msdk.reward.adapter.b.o {
                @Override // com.mbridge.msdk.reward.adapter.b.o
                public void a(String str, String str2, String str3, String str4, String str5, com.mbridge.msdk.videocommon.a.C0412a c0412a) {
                    RunnableC0370b runnableC0370b = RunnableC0370b.this;
                    b bVar = b.this;
                    com.mbridge.msdk.reward.adapter.c cVar = bVar.f36681d;
                    if (cVar != null && cVar.a(runnableC0370b.f36694d, bVar.f36680c, bVar.f36682e)) {
                        if (a.this.f36656f == null || a.this.Y) {
                            return;
                        }
                        a.this.Y = true;
                        q0.a("RewardVideoController", "Cache onVideoLoadSuccessForCache");
                        RunnableC0370b runnableC0370b2 = RunnableC0370b.this;
                        a.this.a(runnableC0370b2.f36694d);
                        RunnableC0370b runnableC0370b3 = RunnableC0370b.this;
                        com.mbridge.msdk.foundation.same.report.metrics.c cVar2 = b.this.f36678a;
                        if (cVar2 != null) {
                            cVar2.b(runnableC0370b3.f36694d);
                        }
                        a.this.f36656f.d(str2, str3, b.this.f36678a);
                        return;
                    }
                    a aVar = a.this;
                    aVar.c(str3, (List<CampaignEx>) aVar.T);
                    if (a.this.f36656f == null || a.this.X) {
                        return;
                    }
                    a.this.X = true;
                    com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880015, "errorCode: 3504 errorMessage: tpl temp preload success but isReady false");
                    b bVar2 = b.this;
                    if (bVar2.f36678a == null) {
                        bVar2.f36678a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                    }
                    b.this.f36678a.a(bVarA);
                    RunnableC0370b runnableC0370b4 = RunnableC0370b.this;
                    b.this.f36678a.b(runnableC0370b4.f36694d);
                    a.this.f36656f.b(bVarA, b.this.f36678a);
                }

                public C0371a() {
                }

                @Override // com.mbridge.msdk.reward.adapter.b.o
                public void a(String str, String str2, String str3, com.mbridge.msdk.videocommon.a.C0412a c0412a, com.mbridge.msdk.foundation.error.b bVar) {
                    RunnableC0370b runnableC0370b = RunnableC0370b.this;
                    a aVar = a.this;
                    aVar.c(runnableC0370b.f36693c, (List<CampaignEx>) aVar.T);
                    if (a.this.f36656f == null || a.this.X) {
                        return;
                    }
                    a.this.X = true;
                    if (bVar != null) {
                        bVar.c("errorCode: 3302 errorMessage: tpl preload failed");
                    }
                    b bVar2 = b.this;
                    if (bVar2.f36678a == null) {
                        bVar2.f36678a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                    }
                    RunnableC0370b runnableC0370b2 = RunnableC0370b.this;
                    b.this.f36678a.b(runnableC0370b2.f36694d);
                    b.this.f36678a.a(bVar);
                    a.this.f36656f.b(bVar, b.this.f36678a);
                }
            }

            public RunnableC0370b(String str, String str2, String str3, CopyOnWriteArrayList copyOnWriteArrayList) {
                this.f36691a = str;
                this.f36692b = str2;
                this.f36693c = str3;
                this.f36694d = copyOnWriteArrayList;
            }

            @Override // java.lang.Runnable
            public void run() {
                com.mbridge.msdk.reward.adapter.b.b().a(a.this.f36675y, a.this.f36665o, a.this.f36670t, a.this.f36671u, this.f36691a, b.this.f36679b.getRequestIdNotice(), this.f36692b, this.f36693c, b.this.f36679b.getCMPTEntryUrl(), a.this.f36666p, b.this.f36679b, this.f36694d, H5DownLoadManager.getInstance().getH5ResAddress(b.this.f36679b.getCMPTEntryUrl()), this.f36693c, a.this.f36653c, new C0371a(), true);
            }
        }

        @Override // com.mbridge.msdk.reward.adapter.b.h
        public void a(String str, String str2, String str3, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
            a.this.U = true;
            if (this.f36680c) {
                if (!a.this.V || a.this.W || a.this.f36665o == null) {
                    return;
                }
                a.this.W = true;
                a.this.f36665o.post(new RunnableC0370b(str3, str, str2, copyOnWriteArrayList));
                return;
            }
            for (CampaignEx campaignEx : copyOnWriteArrayList) {
                if (campaignEx == null || campaignEx.getRewardTemplateMode() == null || TextUtils.isEmpty(campaignEx.getRewardTemplateMode().j()) || campaignEx.getRewardTemplateMode().j().contains(CampaignEx.KEY_IS_CMPT_ENTRY) || a.this.f36665o == null) {
                    com.mbridge.msdk.reward.adapter.c cVar = this.f36681d;
                    if (cVar == null || !cVar.a(copyOnWriteArrayList, this.f36680c, this.f36682e)) {
                        a aVar = a.this;
                        aVar.c(str2, (List<CampaignEx>) aVar.T);
                        if (a.this.f36656f != null && !a.this.X) {
                            a.this.X = true;
                            com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880015, "errorCode: 3503 errorMessage: have no temp but isReady false");
                            if (this.f36678a == null) {
                                this.f36678a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                            }
                            this.f36678a.b(a.this.S);
                            this.f36678a.a(bVarA);
                            a.this.f36656f.b(bVarA, this.f36678a);
                        }
                    } else if (a.this.f36656f != null && !a.this.Y) {
                        a.this.Y = true;
                        q0.a("RewardVideoController", "Cache onVideoLoadSuccessForCache");
                        a.this.a(copyOnWriteArrayList);
                        com.mbridge.msdk.foundation.same.report.metrics.c cVar2 = this.f36678a;
                        if (cVar2 != null) {
                            cVar2.b(copyOnWriteArrayList);
                        }
                        a.this.f36656f.d(str, str2, this.f36678a);
                    }
                } else {
                    a.this.f36665o.post(new RunnableC0368a(campaignEx, copyOnWriteArrayList, str, str2, str3));
                }
            }
        }

        public b(CampaignEx campaignEx, boolean z10, com.mbridge.msdk.reward.adapter.c cVar, int i10) {
            this.f36679b = campaignEx;
            this.f36680c = z10;
            this.f36681d = cVar;
            this.f36682e = i10;
            this.f36678a = com.mbridge.msdk.foundation.same.report.metrics.d.b().c().get(campaignEx.getLocalRequestId());
        }

        @Override // com.mbridge.msdk.reward.adapter.b.h
        public void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, com.mbridge.msdk.foundation.error.b bVar) {
            a.this.U = false;
            a aVar = a.this;
            aVar.c(aVar.f36658h, (List<CampaignEx>) a.this.T);
            if (a.this.f36656f == null || a.this.X) {
                return;
            }
            a.this.X = true;
            if (this.f36678a == null) {
                this.f36678a = new com.mbridge.msdk.foundation.same.report.metrics.c();
            }
            this.f36678a.b(copyOnWriteArrayList);
            if (bVar != null) {
                bVar.c("errorCode: 3201 errorMessage: campaign resource download failed");
            }
            this.f36678a.a(bVar);
            a.this.f36656f.b(bVar, this.f36678a);
        }
    }

    /* JADX INFO: compiled from: RewardVideoController.java */
    public class c implements com.mbridge.msdk.reward.adapter.b.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public com.mbridge.msdk.foundation.same.report.metrics.c f36697a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CampaignEx f36698b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ CopyOnWriteArrayList f36699c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f36700d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f36701e;

        @Override // com.mbridge.msdk.reward.adapter.b.n
        public void a(String str, String str2, String str3, String str4) {
        }

        public c(CampaignEx campaignEx, CopyOnWriteArrayList copyOnWriteArrayList, boolean z10, int i10) {
            this.f36698b = campaignEx;
            this.f36699c = copyOnWriteArrayList;
            this.f36700d = z10;
            this.f36701e = i10;
            this.f36697a = com.mbridge.msdk.foundation.same.report.metrics.d.b().c().get(campaignEx.getLocalRequestId());
        }

        @Override // com.mbridge.msdk.reward.adapter.b.n
        public void a(String str, String str2, com.mbridge.msdk.foundation.error.b bVar) {
            String unitId = bVar == null ? "" : bVar.j().getUnitId();
            a aVar = a.this;
            aVar.c(unitId, (List<CampaignEx>) aVar.T);
            if (bVar != null) {
                bVar.c("errorCode: 3202 errorMessage: temp resource download failed");
            }
            if (this.f36697a == null) {
                this.f36697a = new com.mbridge.msdk.foundation.same.report.metrics.c();
            }
            this.f36697a.b(this.f36699c);
            this.f36697a.a(bVar);
            if (!this.f36700d && a.this.f36656f != null) {
                if (a.this.X) {
                    return;
                }
                a.this.X = true;
                a.this.f36656f.b(bVar, this.f36697a);
                return;
            }
            if (this.f36701e != 1 || a.this.X || a.this.f36656f == null) {
                return;
            }
            a.this.X = true;
            a.this.f36656f.b(bVar, this.f36697a);
        }
    }

    /* JADX INFO: compiled from: RewardVideoController.java */
    public class d implements com.mbridge.msdk.reward.adapter.b.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public com.mbridge.msdk.foundation.same.report.metrics.c f36703a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CampaignEx f36704b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ CopyOnWriteArrayList f36705c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ com.mbridge.msdk.reward.adapter.c f36706d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f36707e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f36708f;

        /* JADX INFO: renamed from: com.mbridge.msdk.reward.controller.a$d$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: RewardVideoController.java */
        public class RunnableC0372a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f36710a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f36711b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f36712c;

            /* JADX INFO: renamed from: com.mbridge.msdk.reward.controller.a$d$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: RewardVideoController.java */
            public class C0373a implements com.mbridge.msdk.reward.adapter.b.o {
                @Override // com.mbridge.msdk.reward.adapter.b.o
                public void a(String str, String str2, String str3, String str4, String str5, com.mbridge.msdk.videocommon.a.C0412a c0412a) {
                    d dVar = d.this;
                    com.mbridge.msdk.reward.adapter.c cVar = dVar.f36706d;
                    if (cVar != null && cVar.a(dVar.f36705c, dVar.f36707e, dVar.f36708f)) {
                        if (a.this.f36656f == null || a.this.Y) {
                            return;
                        }
                        a.this.Y = true;
                        q0.a("RewardVideoController", "Cache onVideoLoadSuccess");
                        d dVar2 = d.this;
                        a.this.a(dVar2.f36705c);
                        d dVar3 = d.this;
                        com.mbridge.msdk.foundation.same.report.metrics.c cVar2 = dVar3.f36703a;
                        if (cVar2 != null) {
                            cVar2.b(dVar3.f36705c);
                        }
                        a.this.f36656f.d(str2, str3, d.this.f36703a);
                        return;
                    }
                    a aVar = a.this;
                    aVar.c(str3, (List<CampaignEx>) aVar.T);
                    if (a.this.f36656f == null || a.this.X) {
                        return;
                    }
                    a.this.X = true;
                    com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880015, "errorCode: 3505 errorMessage: tpl temp preload success but isReady false");
                    d dVar4 = d.this;
                    if (dVar4.f36703a == null) {
                        dVar4.f36703a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                    }
                    d dVar5 = d.this;
                    dVar5.f36703a.b(dVar5.f36705c);
                    d.this.f36703a.a(bVarA);
                    a.this.f36656f.b(bVarA, d.this.f36703a);
                }

                public C0373a() {
                }

                @Override // com.mbridge.msdk.reward.adapter.b.o
                public void a(String str, String str2, String str3, com.mbridge.msdk.videocommon.a.C0412a c0412a, com.mbridge.msdk.foundation.error.b bVar) {
                    RunnableC0372a runnableC0372a = RunnableC0372a.this;
                    a aVar = a.this;
                    aVar.c(runnableC0372a.f36712c, (List<CampaignEx>) aVar.T);
                    if (a.this.f36656f == null || a.this.X) {
                        return;
                    }
                    a.this.X = true;
                    if (bVar != null) {
                        bVar.c("errorCode: 3303 errorMessage: tpl temp preload failed");
                    }
                    d dVar = d.this;
                    if (dVar.f36703a == null) {
                        dVar.f36703a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                    }
                    d dVar2 = d.this;
                    dVar2.f36703a.b(dVar2.f36705c);
                    d.this.f36703a.a(bVar);
                    a.this.f36656f.b(bVar, d.this.f36703a);
                }
            }

            public RunnableC0372a(String str, String str2, String str3) {
                this.f36710a = str;
                this.f36711b = str2;
                this.f36712c = str3;
            }

            @Override // java.lang.Runnable
            public void run() {
                com.mbridge.msdk.reward.adapter.b bVarB = com.mbridge.msdk.reward.adapter.b.b();
                boolean z10 = a.this.f36675y;
                Handler handler = a.this.f36665o;
                boolean z11 = a.this.f36670t;
                boolean z12 = a.this.f36671u;
                String str = this.f36710a;
                String requestIdNotice = d.this.f36704b.getRequestIdNotice();
                String str2 = this.f36711b;
                String str3 = this.f36712c;
                String cMPTEntryUrl = d.this.f36704b.getCMPTEntryUrl();
                int i10 = a.this.f36666p;
                d dVar = d.this;
                bVarB.a(z10, handler, z11, z12, str, requestIdNotice, str2, str3, cMPTEntryUrl, i10, dVar.f36704b, dVar.f36705c, H5DownLoadManager.getInstance().getH5ResAddress(d.this.f36704b.getCMPTEntryUrl()), this.f36712c, a.this.f36653c, new C0373a(), true);
            }
        }

        @Override // com.mbridge.msdk.reward.adapter.b.n
        public void a(String str, String str2, String str3, String str4) {
            a.this.V = true;
            if (!a.this.U || a.this.W || a.this.f36665o == null) {
                return;
            }
            a.this.W = true;
            a.this.f36665o.post(new RunnableC0372a(str3, str, str2));
        }

        public d(CampaignEx campaignEx, CopyOnWriteArrayList copyOnWriteArrayList, com.mbridge.msdk.reward.adapter.c cVar, boolean z10, int i10) {
            this.f36704b = campaignEx;
            this.f36705c = copyOnWriteArrayList;
            this.f36706d = cVar;
            this.f36707e = z10;
            this.f36708f = i10;
            this.f36703a = com.mbridge.msdk.foundation.same.report.metrics.d.b().c().get(campaignEx.getLocalRequestId());
        }

        @Override // com.mbridge.msdk.reward.adapter.b.n
        public void a(String str, String str2, com.mbridge.msdk.foundation.error.b bVar) {
            String unitId;
            if (bVar != null) {
                unitId = bVar.j().getUnitId();
                bVar.c("errorCode: 3203 errorMessage: tpl temp resource download failed");
            } else {
                unitId = "";
            }
            a aVar = a.this;
            aVar.c(unitId, (List<CampaignEx>) aVar.T);
            if (this.f36703a == null) {
                this.f36703a = new com.mbridge.msdk.foundation.same.report.metrics.c();
            }
            this.f36703a.a(bVar);
            this.f36703a.b(this.f36705c);
            a.this.V = false;
            if (a.this.f36656f == null || a.this.X) {
                return;
            }
            a.this.X = true;
            a.this.f36656f.b(bVar, this.f36703a);
        }
    }

    /* JADX INFO: compiled from: RewardVideoController.java */
    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (a.this.K == null) {
                    a.this.K = com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d());
                }
                com.mbridge.msdk.foundation.db.h hVarA = com.mbridge.msdk.foundation.db.h.a(a.this.K);
                if (hVarA != null) {
                    hVarA.b(a.this.f36658h);
                }
            } catch (Throwable unused) {
                q0.b("RewardVideoController", "can't find DailyPlayCapDao");
            }
        }
    }

    /* JADX INFO: compiled from: RewardVideoController.java */
    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.mbridge.msdk.reward.adapter.c f36716a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f36717b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f36718c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f36719d = false;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f36720e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f36721f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private com.mbridge.msdk.foundation.same.report.metrics.c f36722g;

        public void a() {
            this.f36719d = true;
        }

        public f(com.mbridge.msdk.reward.adapter.c cVar, int i10, boolean z10, String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar2) {
            this.f36716a = cVar;
            this.f36717b = i10;
            this.f36718c = z10;
            if (cVar != null) {
                cVar.c(false);
            }
            this.f36721f = str;
            this.f36722g = cVar2;
        }

        public void a(int i10) {
            this.f36720e = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f36719d) {
                return;
            }
            com.mbridge.msdk.reward.adapter.c cVar = this.f36716a;
            if (cVar != null) {
                cVar.c(true);
            }
            q0.b("RewardVideoController", "adSource=" + this.f36717b + " CommonCancelTimeTask mIsDevCall：" + this.f36718c);
            a.this.a(com.mbridge.msdk.foundation.error.a.a(880023, "v3 is timeout"), this.f36722g);
        }
    }

    /* JADX INFO: compiled from: RewardVideoController.java */
    public class g implements com.mbridge.msdk.reward.adapter.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.mbridge.msdk.reward.adapter.c f36724a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f36725b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private f f36726c;

        public void a(f fVar) {
            this.f36726c = fVar;
        }

        public g(com.mbridge.msdk.reward.adapter.c cVar, boolean z10) {
            this.f36724a = cVar;
            this.f36725b = z10;
        }

        @Override // com.mbridge.msdk.reward.adapter.a
        public void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            f fVar = this.f36726c;
            if (fVar != null) {
                fVar.a();
                a.this.f36665o.removeCallbacks(this.f36726c);
            }
            if (a.this.f36656f != null) {
                a.this.f36656f.a(a.this.f36662l, a.this.f36658h, cVar);
            }
        }

        @Override // com.mbridge.msdk.reward.adapter.a
        public void a(List<CampaignEx> list, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            f fVar = this.f36726c;
            if (fVar != null) {
                fVar.a();
                a.this.f36665o.removeCallbacks(this.f36726c);
            }
            a.this.a(list);
            if (a.this.f36656f != null) {
                if (list != null && list.size() == 1) {
                    CampaignEx campaignEx = list.get(0);
                    if (!com.mbridge.msdk.foundation.same.c.a(a.this.f36650a, campaignEx) && campaignEx.getFilterAdsVideoCallState() == 0) {
                        if (a.this.f36651a0 <= 1) {
                            com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880020, "load exception second");
                            if (cVar != null) {
                                cVar.a(bVarA);
                                cVar.b(true);
                            }
                            a.this.f36656f.a(bVarA, cVar);
                            return;
                        }
                        a.m(a.this);
                        return;
                    }
                }
                a.this.f36656f.c(a.this.f36662l, a.this.f36658h, cVar);
            }
        }

        @Override // com.mbridge.msdk.reward.adapter.a
        public void a(List<CampaignEx> list, com.mbridge.msdk.foundation.error.b bVar, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            f fVar = this.f36726c;
            if (fVar != null) {
                fVar.a();
                a.this.f36665o.removeCallbacks(this.f36726c);
            }
            com.mbridge.msdk.reward.adapter.c cVar2 = this.f36724a;
            if (cVar2 != null) {
                cVar2.a((com.mbridge.msdk.reward.adapter.a) null);
                this.f36724a = null;
            }
            a.this.a(list);
            if (a.this.f36656f != null) {
                a.this.f36656f.a(bVar, cVar);
            }
        }
    }

    /* JADX INFO: compiled from: RewardVideoController.java */
    public final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<InterVideoOutListener> f36728a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile AtomicInteger f36729b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Handler f36730c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f36731d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f36732e;

        public /* synthetic */ h(a aVar, InterVideoOutListener interVideoOutListener, Handler handler, String str, C0367a c0367a) {
            this(interVideoOutListener, handler, str);
        }

        private h(InterVideoOutListener interVideoOutListener, Handler handler, String str) {
            this.f36728a = new WeakReference<>(interVideoOutListener);
            this.f36729b = new AtomicInteger(0);
            this.f36730c = handler;
            this.f36731d = str;
        }

        public void c(String str, String str2, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            Handler handler = this.f36730c;
            if (handler != null) {
                handler.removeMessages(1001002);
            }
            WeakReference<InterVideoOutListener> weakReference = this.f36728a;
            InterVideoOutListener interVideoOutListener = weakReference != null ? weakReference.get() : null;
            if (this.f36729b.get() == 2 || this.f36730c == null) {
                return;
            }
            a.m(a.this);
            this.f36729b.set(2);
            if (a.this.O) {
                return;
            }
            a.this.O = true;
            if (cVar == null) {
                cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
            }
            cVar.b(a.this.H);
            a.this.a("2000048", cVar, interVideoOutListener);
            if (interVideoOutListener != null) {
                Message messageObtain = Message.obtain();
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PLACEMENT_ID, str);
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                bundle.putString("metrics_data_lrid", cVar.t());
                messageObtain.setData(bundle);
                messageObtain.obj = str2;
                messageObtain.what = 9;
                this.f36730c.sendMessage(messageObtain);
            }
        }

        public void d(String str, String str2, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            Handler handler = this.f36730c;
            if (handler != null) {
                handler.removeMessages(1001002);
            }
            WeakReference<InterVideoOutListener> weakReference = this.f36728a;
            InterVideoOutListener interVideoOutListener = weakReference != null ? weakReference.get() : null;
            if (this.f36729b.get() == 2 || this.f36730c == null) {
                return;
            }
            if (this.f36729b.get() == 1) {
                this.f36729b.set(3);
            }
            if (a.this.O) {
                return;
            }
            a.this.O = true;
            if (cVar == null) {
                cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
            }
            cVar.a(true);
            cVar.b(a.this.H);
            a.this.a("2000048", cVar, interVideoOutListener);
            if (interVideoOutListener != null) {
                Message messageObtain = Message.obtain();
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PLACEMENT_ID, str);
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                bundle.putSerializable("metrics_data_lrid", cVar.t());
                messageObtain.setData(bundle);
                messageObtain.obj = str2;
                messageObtain.what = 9;
                this.f36730c.sendMessage(messageObtain);
            }
            if (a.this.P) {
                this.f36729b.set(2);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(String str, String str2, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            WeakReference<InterVideoOutListener> weakReference = this.f36728a;
            InterVideoOutListener interVideoOutListener = weakReference != null ? weakReference.get() : null;
            if (this.f36730c == null || a.this.N) {
                return;
            }
            a.this.N = true;
            a.this.a("2000127", cVar, interVideoOutListener);
            if (interVideoOutListener != null) {
                Message messageObtain = Message.obtain();
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PLACEMENT_ID, str);
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                bundle.putBoolean(MBridgeConstans.PROPERTIES_IS_CACHED_CAMPAIGN, true);
                if (cVar != null) {
                    bundle.putString("metrics_data_lrid", cVar.t());
                }
                messageObtain.setData(bundle);
                messageObtain.obj = str2;
                messageObtain.what = 17;
                this.f36730c.sendMessage(messageObtain);
                if (s0.a().a("l_s_i_l_v_s", false)) {
                    d(str, str2, cVar);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int a() {
            return this.f36729b.get();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(int i10) {
            this.f36729b.set(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(String str, String str2, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            WeakReference<InterVideoOutListener> weakReference = this.f36728a;
            InterVideoOutListener interVideoOutListener = weakReference != null ? weakReference.get() : null;
            if ((this.f36729b.get() != 1 && this.f36729b.get() != 3) || this.f36730c == null || a.this.N) {
                return;
            }
            a.this.N = true;
            a.this.a("2000127", cVar, interVideoOutListener);
            if (interVideoOutListener != null) {
                Message messageObtain = Message.obtain();
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PLACEMENT_ID, str);
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                bundle.putBoolean(MBridgeConstans.PROPERTIES_IS_CACHED_CAMPAIGN, false);
                if (cVar != null) {
                    bundle.putString("metrics_data_lrid", cVar.t());
                }
                messageObtain.setData(bundle);
                messageObtain.obj = str2;
                messageObtain.what = 17;
                this.f36730c.sendMessage(messageObtain);
                if (s0.a().a("l_s_i_l_v_s", false)) {
                    c(str, str2, cVar);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            WeakReference<InterVideoOutListener> weakReference = this.f36728a;
            a.this.a("2000047", cVar, weakReference != null ? weakReference.get() : null);
            if (this.f36730c != null) {
                Message messageObtain = Message.obtain();
                messageObtain.obj = str;
                messageObtain.what = 18;
                if (cVar != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString("metrics_data_lrid", cVar.t());
                    messageObtain.setData(bundle);
                }
                this.f36730c.sendMessage(messageObtain);
            }
        }

        public void a(com.mbridge.msdk.foundation.error.b bVar, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            String strL;
            CampaignEx campaignEx;
            if (bVar == null || cVar == null) {
                strL = "";
            } else {
                strL = bVar.l();
                cVar.a(bVar);
            }
            if (a.this.f36652b != null && a.this.f36651a0 == 1) {
                a.this.f36652b.a(a.this.f36660j);
                CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListF = a.this.f36652b.f();
                CampaignEx campaignEx2 = (a.this.H == null || a.this.H.size() == 0) ? null : (CampaignEx) a.this.H.get(0);
                if (campaignEx2 != null) {
                    campaignEx = campaignEx2;
                } else if (copyOnWriteArrayListF == null || copyOnWriteArrayListF.size() == 0) {
                    campaignEx = null;
                } else {
                    campaignEx2 = copyOnWriteArrayListF.get(0);
                    campaignEx = campaignEx2;
                }
                if (a.this.f36671u && ((campaignEx == null || TextUtils.isEmpty(campaignEx.getNLRid())) && ((copyOnWriteArrayListF == null || copyOnWriteArrayListF.size() == 0) && a.this.f36652b.a(campaignEx, true, bVar, 2, cVar)))) {
                    return;
                } else {
                    a.this.f36652b.a((com.mbridge.msdk.reward.adapter.a) null);
                }
            }
            Handler handler = this.f36730c;
            if (handler != null) {
                handler.removeMessages(1001002);
            }
            WeakReference<InterVideoOutListener> weakReference = this.f36728a;
            InterVideoOutListener interVideoOutListener = weakReference != null ? weakReference.get() : null;
            if (this.f36729b.get() == 2 || this.f36730c == null) {
                return;
            }
            a.this.P = true;
            if (!a.this.R || strL.contains("resource load timeout")) {
                a.this.Q = true;
            }
            if (a.this.O) {
                this.f36729b.set(2);
            }
            if (a.this.P && a.this.Q && !a.this.O) {
                if (a.this.f36651a0 > 1) {
                    a.m(a.this);
                    a.this.f36652b.a(a.this.f36660j);
                    return;
                }
                this.f36729b.set(2);
                a.this.a("2000047", cVar, interVideoOutListener);
                if (interVideoOutListener != null) {
                    Message messageObtain = Message.obtain();
                    messageObtain.obj = strL;
                    messageObtain.what = 16;
                    if (cVar != null) {
                        Bundle bundle = new Bundle();
                        bundle.putString("metrics_data_lrid", cVar.t());
                        messageObtain.setData(bundle);
                    }
                    this.f36730c.sendMessage(messageObtain);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(com.mbridge.msdk.foundation.error.b bVar, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            WeakReference<InterVideoOutListener> weakReference = this.f36728a;
            InterVideoOutListener interVideoOutListener = weakReference != null ? weakReference.get() : null;
            if (this.f36729b.get() == 2 || this.f36730c == null) {
                return;
            }
            a.this.Q = true;
            String strL = bVar != null ? bVar.l() : "";
            if (strL.contains("resource load timeout")) {
                a.this.P = true;
            }
            if (a.this.Q && a.this.P && !a.this.O) {
                this.f36729b.set(2);
                if (interVideoOutListener != null) {
                    Message messageObtain = Message.obtain();
                    messageObtain.obj = strL;
                    messageObtain.what = 16;
                    if (cVar != null) {
                        Bundle bundle = new Bundle();
                        bundle.putString("metrics_data_lrid", cVar.t());
                        messageObtain.setData(bundle);
                    }
                    this.f36730c.sendMessage(messageObtain);
                }
                if (cVar == null) {
                    cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
                }
                cVar.a(true);
                a.this.a("2000047", cVar, interVideoOutListener);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            this.f36729b.set(2);
            b(str, cVar);
        }

        public void a(boolean z10) {
            this.f36732e = z10;
        }
    }

    /* JADX INFO: compiled from: RewardVideoController.java */
    public final class i extends com.mbridge.msdk.video.bt.module.orglistener.b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private a f36734c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Handler f36735d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f36736e;

        /* JADX INFO: renamed from: com.mbridge.msdk.reward.controller.a$i$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: RewardVideoController.java */
        public class RunnableC0374a implements Runnable {
            public RunnableC0374a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (i.this.f36734c != null) {
                    i.this.f36734c.a(false, com.mbridge.msdk.foundation.same.report.metrics.d.b().a(0, a.this.f36670t ? MBSupportMuteAdType.INTERSTITIAL_VIDEO : 94, a.this.f36658h, true, 1));
                }
            }
        }

        public /* synthetic */ i(a aVar, a aVar2, Handler handler, C0367a c0367a) {
            this(aVar2, handler);
        }

        private i(a aVar, Handler handler) {
            this.f36736e = 0;
            this.f36734c = aVar;
            this.f36735d = handler;
        }

        @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
        public void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            a.this.E = false;
            try {
                com.mbridge.msdk.reward.candidate.a aVar = new com.mbridge.msdk.reward.candidate.a(a.this.f36658h, a.this.f36670t);
                a aVar2 = this.f36734c;
                aVar.a(cVar.t(), (aVar2 == null || aVar2.f36652b == null) ? "" : this.f36734c.f36652b.H, 3, a.f36645b0);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardVideoController", e10.getMessage());
                }
            }
            try {
                a aVar3 = this.f36734c;
                if (aVar3 != null) {
                    aVar3.C = true;
                    if (this.f36734c.f36652b != null) {
                        this.f36734c.f36652b.H = "";
                    }
                    this.f36734c.q();
                    if (a.this.f36671u) {
                        a.this.a();
                    }
                    a aVar4 = a.this;
                    aVar4.a("2000130", cVar, aVar4.f36655e, "");
                    b();
                    if (this.f36734c.f36655e != null) {
                        this.f36734c.f36655e.onAdShow(a.this.f36659i);
                        this.f36736e = 2;
                    }
                }
            } catch (Throwable th2) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardVideoController", th2.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
        public void b(String str, String str2) {
            try {
                a aVar = this.f36734c;
                if (aVar == null || aVar.f36655e == null) {
                    return;
                }
                try {
                    this.f36734c.f36655e.onVideoComplete(a.this.f36659i);
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("RewardVideoController", e10.getMessage());
                    }
                }
                this.f36736e = 5;
            } catch (Exception e11) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardVideoController", e11.getMessage());
                }
            }
        }

        public void e() {
            a.this.B.clear();
            this.f36734c = null;
        }

        @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
        public void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar, boolean z10, com.mbridge.msdk.videocommon.entity.c cVar2) {
            try {
                a aVar = this.f36734c;
                if (aVar != null && aVar.f36655e != null) {
                    if (cVar2 == null) {
                        cVar2 = com.mbridge.msdk.videocommon.entity.c.a(this.f36734c.f36663m);
                    }
                    if (a.this.f36671u) {
                        a.this.a();
                        a.this.v();
                        com.mbridge.msdk.foundation.same.buffer.b.d(a.this.f36658h, a.this.m());
                    }
                    this.f36734c.f36655e.onAdClose(a.this.f36659i, new RewardInfo(z10, cVar2.c(), String.valueOf(cVar2.a())));
                    this.f36736e = 7;
                    this.f36734c.C = false;
                    e();
                }
                com.mbridge.msdk.foundation.same.report.metrics.d.b().b("2000152", cVar, null);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardVideoController", e10.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
        public void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar, String str) {
            try {
                a aVar = a.this;
                aVar.E = false;
                if (this.f36734c != null) {
                    if (aVar.f36671u) {
                        a.this.a();
                    }
                    this.f36734c.C = false;
                    a.this.a("2000131", cVar, this.f36734c.f36655e, str);
                    a();
                    if (this.f36734c.f36655e != null) {
                        try {
                            this.f36734c.f36655e.onShowFail(cVar, a.this.f36659i, str);
                        } catch (Exception e10) {
                            if (MBridgeConstans.DEBUG) {
                                q0.b("RewardVideoController", e10.getMessage());
                            }
                        }
                        this.f36736e = 4;
                    }
                }
            } catch (Exception e11) {
                this.f36736e = 0;
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardVideoController", e11.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
        public void a(boolean z10, String str, String str2) {
            try {
                a aVar = this.f36734c;
                if (aVar == null || aVar.f36655e == null) {
                    return;
                }
                if (a.this.f36671u) {
                    a.this.a();
                }
                this.f36734c.C = false;
                try {
                    this.f36734c.f36655e.onVideoAdClicked(z10, a.this.f36659i);
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("RewardVideoController", e10.getMessage());
                    }
                }
            } catch (Exception e11) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardVideoController", e11.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
        public void a(boolean z10, int i10) {
            try {
                a aVar = this.f36734c;
                if (aVar != null && aVar.f36655e != null) {
                    try {
                        this.f36734c.f36655e.onAdCloseWithIVReward(a.this.f36659i, new RewardInfo(z10, i10));
                    } catch (Exception e10) {
                        if (MBridgeConstans.DEBUG) {
                            q0.b("RewardVideoController", e10.getMessage());
                        }
                    }
                }
            } catch (Exception e11) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardVideoController", e11.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
        public void a(String str, String str2) {
            try {
                a aVar = this.f36734c;
                if (aVar == null || aVar.f36655e == null) {
                    return;
                }
                try {
                    this.f36734c.f36655e.onEndcardShow(a.this.f36659i);
                    com.mbridge.msdk.foundation.feedback.b.b().a(str2 + "_2", 2);
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("RewardVideoController", e10.getMessage());
                    }
                }
                this.f36736e = 6;
            } catch (Exception e11) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardVideoController", e11.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
        public void a(int i10, String str, String str2) {
            this.f36736e = i10;
            a aVar = this.f36734c;
            if (aVar == null || aVar.f36671u || this.f36734c.f36670t || this.f36734c.f36653c == null || !this.f36734c.f36653c.a(this.f36736e) || this.f36734c.f36656f == null || this.f36734c.f36656f.a() == 1 || this.f36734c.f36656f.a() == 3 || a.this.B.contains(Integer.valueOf(this.f36736e))) {
                return;
            }
            a.this.B.add(Integer.valueOf(this.f36736e));
            int iF = this.f36734c.f36653c.f() * 1000;
            if (this.f36736e == 4) {
                iF = 3000;
            }
            Handler handler = this.f36735d;
            if (handler != null) {
                handler.removeMessages(1001001);
                this.f36735d.sendEmptyMessageDelayed(1001001, iF);
            } else {
                new Handler(Looper.getMainLooper()).postDelayed(new RunnableC0374a(), iF);
            }
        }
    }

    /* JADX INFO: compiled from: RewardVideoController.java */
    public class j {
        public j() {
        }

        public void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            a.this.f36651a0++;
            a aVar = a.this;
            aVar.b(aVar.f36674x, str, cVar);
        }
    }

    public static /* synthetic */ int m(a aVar) {
        int i10 = aVar.f36651a0;
        aVar.f36651a0 = i10 - 1;
        return i10;
    }

    private void w() {
        com.mbridge.msdk.foundation.db.e.a(com.mbridge.msdk.foundation.db.g.a(this.f36650a)).b(this.f36658h);
    }

    private void x() {
        try {
            List<CampaignEx> listC = com.mbridge.msdk.foundation.db.e.a(com.mbridge.msdk.foundation.db.g.a(this.f36650a)).c(this.f36658h);
            if (listC == null || listC.size() <= 0) {
                return;
            }
            for (CampaignEx campaignEx : listC) {
                if (TextUtils.isEmpty(campaignEx.getCMPTEntryUrl())) {
                    com.mbridge.msdk.videocommon.a.b(campaignEx.getAdType(), campaignEx);
                } else {
                    com.mbridge.msdk.videocommon.a.e(this.f36658h + "_" + campaignEx.getRequestId() + "_" + campaignEx.getCMPTEntryUrl());
                    if (campaignEx.getRewardTemplateMode() != null && !TextUtils.isEmpty(campaignEx.getRewardTemplateMode().j())) {
                        com.mbridge.msdk.videocommon.a.e(this.f36658h + "_" + campaignEx.getId() + "_" + campaignEx.getRequestId() + "_" + campaignEx.getRewardTemplateMode().j());
                    }
                }
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardVideoController", e10.getMessage());
            }
        }
    }

    public void f(boolean z10) {
        this.f36675y = z10;
    }

    public MBridgeIds g() {
        return this.f36659i;
    }

    public List<CampaignEx> h() {
        return this.T;
    }

    public CopyOnWriteArrayList<CampaignEx> i() {
        return this.S;
    }

    public String j() {
        com.mbridge.msdk.reward.adapter.c cVar = this.f36652b;
        return cVar != null ? cVar.g() : "";
    }

    public h k() {
        return this.f36656f;
    }

    public String l() {
        return this.f36662l;
    }

    public String m() {
        com.mbridge.msdk.reward.adapter.c cVar = this.f36652b;
        return cVar != null ? cVar.a(this.C) : "";
    }

    public com.mbridge.msdk.reward.adapter.c n() {
        return this.f36652b;
    }

    public InterVideoOutListener o() {
        return this.f36655e;
    }

    public String p() {
        return this.f36658h;
    }

    public void q() {
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new e());
    }

    public boolean r() {
        return this.f36671u;
    }

    public boolean s() {
        return this.f36674x;
    }

    public boolean t() {
        return this.f36670t;
    }

    public boolean u() {
        return (this.f36655e == null || this.f36656f == null) ? false : true;
    }

    public void v() {
        ConcurrentHashMap<String, String> concurrentHashMap;
        if (!this.C || (concurrentHashMap = f36648e0) == null || concurrentHashMap.containsKey(m())) {
            return;
        }
        f36648e0.remove(m());
    }

    private com.mbridge.msdk.foundation.same.report.metrics.c b(boolean z10, String str, com.mbridge.msdk.foundation.same.report.metrics.e eVar) {
        com.mbridge.msdk.foundation.same.report.metrics.c cVar;
        String strA;
        com.mbridge.msdk.foundation.same.report.metrics.c cVar2 = new com.mbridge.msdk.foundation.same.report.metrics.c();
        try {
            b(z10);
            if (TextUtils.isEmpty(str)) {
                strA = SameMD5.getMD5(v0.d());
            } else {
                strA = a(str);
            }
            this.A = strA;
            cVar2 = com.mbridge.msdk.foundation.same.report.metrics.d.b().b(strA);
            if (cVar2 == null) {
                cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
                try {
                    com.mbridge.msdk.foundation.same.report.metrics.d.b().c().put(strA, cVar);
                    cVar.d(true);
                    cVar2 = cVar;
                } catch (Exception e10) {
                    e = e10;
                }
            }
            cVar2.i(strA);
            cVar2.n(this.f36658h);
            if (eVar != null) {
                if (eVar.a("adtp")) {
                    cVar2.a(Integer.parseInt((String) eVar.b("adtp")));
                }
                if (eVar.a(CampaignEx.JSON_KEY_HB)) {
                    String str2 = (String) eVar.b(CampaignEx.JSON_KEY_HB);
                    cVar2.h(str2);
                    if (str2.equals("1")) {
                        cVar2.g(str);
                    }
                }
            }
            cVar2.f(z10 ? "2" : "1");
            if (!z10) {
                return cVar2;
            }
            com.mbridge.msdk.reward.report.metrics.a.a().a("2000123", cVar2);
            return cVar2;
        } catch (Exception e11) {
            e = e11;
            cVar = cVar2;
        }
        if (MBridgeConstans.DEBUG) {
            q0.b("RewardVideoController", e.getMessage());
        }
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str, List<CampaignEx> list) {
        if (list != null) {
            try {
                if (list.size() <= 0 || this.O) {
                    return;
                }
                com.mbridge.msdk.foundation.db.e.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d())).b(list, str);
            } catch (Throwable th2) {
                q0.b("RewardVideoController", th2.getMessage());
            }
        }
    }

    private void f() {
        com.mbridge.msdk.reward.adapter.c cVar = new com.mbridge.msdk.reward.adapter.c(this.f36650a, this.f36662l, this.f36658h);
        this.f36652b = cVar;
        cVar.d(this.f36670t);
        this.f36652b.e(this.f36671u);
        if (this.f36670t) {
            this.f36652b.a(this.f36667q, this.f36668r, this.f36669s);
        }
        this.f36652b.a(this.f36653c);
    }

    public void d(boolean z10) {
        this.f36670t = z10;
        if (z10) {
            this.f36666p = com.mbridge.msdk.foundation.same.a.X;
        } else {
            this.f36666p = com.mbridge.msdk.foundation.same.a.W;
        }
    }

    public void e(boolean z10) {
        this.f36671u = z10;
    }

    public void e() {
        o0.b();
    }

    private boolean d() {
        if (this.f36652b == null) {
            f();
        }
        com.mbridge.msdk.reward.adapter.c cVar = this.f36652b;
        if (cVar != null) {
            return cVar.b(true);
        }
        return false;
    }

    public void c(String str, String str2) {
        try {
            this.f36650a = com.mbridge.msdk.foundation.controller.c.n().d();
            this.f36658h = str2;
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            this.f36662l = str;
            this.f36659i = new MBridgeIds(this.f36662l, this.f36658h);
            this.f36654d = com.mbridge.msdk.videocommon.setting.b.b().c();
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new com.mbridge.msdk.reward.controller.c(this.f36650a, this.f36658h));
            if (this.K == null) {
                this.K = com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d());
            }
        } catch (Throwable th2) {
            q0.b("RewardVideoController", th2.getMessage(), th2);
        }
    }

    public void a(int i10) {
        this.f36666p = i10;
    }

    private void d(String str, String str2) {
        try {
            com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
            cVar.n(this.f36658h);
            cVar.a(this.f36670t ? MBSupportMuteAdType.INTERSTITIAL_VIDEO : 94);
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("event_name", str);
            eVar.a("reason", str2);
            cVar.a("m_temp_is_ready_check", eVar);
            com.mbridge.msdk.reward.report.metrics.a.a().a("m_temp_is_ready_check", cVar);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public void a(String str, String str2, String str3, String str4) {
        if (!TextUtils.isEmpty(str)) {
            y0.b(this.f36650a, "MBridge_ConfirmTitle" + this.f36658h, str.trim());
        }
        if (!TextUtils.isEmpty(str2)) {
            y0.b(this.f36650a, "MBridge_ConfirmContent" + this.f36658h, str2.trim());
        }
        if (!TextUtils.isEmpty(str4)) {
            y0.b(this.f36650a, "MBridge_CancelText" + this.f36658h, str4.trim());
        }
        if (TextUtils.isEmpty(str3)) {
            return;
        }
        y0.b(this.f36650a, "MBridge_ConfirmText" + this.f36658h, str3.trim());
    }

    public boolean c(boolean z10) {
        boolean zA;
        try {
            if (c()) {
                if (!z10) {
                    return false;
                }
                d("is_ready_start", "over cap check error");
                com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("type", 10);
                cVar.a("m_offer_ready", eVar);
                a(false, cVar, (List<CampaignEx>) this.f36652b.h());
                return false;
            }
            if (this.f36671u) {
                try {
                    zA = a(z10);
                } catch (Exception e10) {
                    if (!MBridgeConstans.DEBUG) {
                        return false;
                    }
                    q0.b("RewardVideoController", e10.getMessage());
                    return false;
                }
            } else {
                zA = d();
            }
            return zA;
        } catch (Throwable th2) {
            if (!MBridgeConstans.DEBUG) {
                return false;
            }
            q0.b("RewardVideoController", th2.getMessage());
            return false;
        }
    }

    public void a(int i10, int i11, int i12) {
        this.f36667q = i10;
        this.f36668r = i11;
        if (i11 == com.mbridge.msdk.foundation.same.a.K) {
            this.f36669s = i12 < 0 ? 5 : i12;
        }
        if (i11 == com.mbridge.msdk.foundation.same.a.J) {
            this.f36669s = i12 < 0 ? 80 : i12;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ivRewardEnable", 1);
            jSONObject.put("ivRewardMode", i10 == com.mbridge.msdk.foundation.same.a.H ? 0 : 1);
            jSONObject.put("ivRewardPlayValueMode", i11 == com.mbridge.msdk.foundation.same.a.J ? 0 : 1);
            jSONObject.put("ivRewardPlayValue", i12);
            com.mbridge.msdk.setting.h.b().i(this.f36658h, jSONObject.toString());
        } catch (Exception unused) {
            q0.b("RewardVideoController", "setIVRewardEnable to SP was ERROR");
        }
    }

    private void b(com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        if (this.f36656f != null) {
            String strB = com.mbridge.msdk.foundation.error.a.b(880001, "");
            com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880001, "");
            if (cVar != null) {
                cVar.a(bVarA);
                cVar.b(true);
            }
            this.f36656f.a(strB, cVar);
        }
    }

    private boolean c() {
        try {
            if (this.K == null) {
                this.K = com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d());
            }
            com.mbridge.msdk.foundation.db.h hVarA = com.mbridge.msdk.foundation.db.h.a(this.K);
            if (this.f36653c == null) {
                this.f36653c = com.mbridge.msdk.videocommon.setting.b.b().a(com.mbridge.msdk.foundation.controller.c.n().b(), this.f36658h, this.f36670t);
            }
            return hVarA != null && hVarA.a(this.f36658h, this.f36653c.k());
        } catch (Throwable unused) {
            q0.b("RewardVideoController", "cap check error");
        }
    }

    public static void a(String str, int i10) {
        try {
            if (f36647d0 == null || !a1.b(str)) {
                return;
            }
            f36647d0.put(str, Integer.valueOf(i10));
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardVideoController", e10.getMessage());
            }
        }
    }

    private CopyOnWriteArrayList<CampaignEx> b(String str, List<CampaignEx> list) {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (list != null) {
            try {
                if (list.size() > 0) {
                    int vcn = 1;
                    for (CampaignEx campaignEx : list) {
                        if (campaignEx != null) {
                            if (campaignEx.getVcn() > vcn) {
                                vcn = campaignEx.getVcn();
                            }
                            if (campaignEx.getTokenRule() == 1) {
                                String requestId = campaignEx.getRequestId();
                                if (!TextUtils.isEmpty(requestId)) {
                                    if (linkedHashMap.containsKey(requestId)) {
                                        List list2 = (List) linkedHashMap.get(requestId);
                                        if (list2 != null) {
                                            list2.add(campaignEx);
                                        }
                                    } else {
                                        ArrayList arrayList = new ArrayList();
                                        arrayList.add(campaignEx);
                                        linkedHashMap.put(requestId, arrayList);
                                    }
                                }
                            } else {
                                String requestId2 = campaignEx.getRequestId();
                                if (!TextUtils.isEmpty(requestId2)) {
                                    if (linkedHashMap2.containsKey(requestId2)) {
                                        List list3 = (List) linkedHashMap2.get(requestId2);
                                        if (list3 != null) {
                                            list3.add(campaignEx);
                                        }
                                    } else {
                                        ArrayList arrayList2 = new ArrayList();
                                        arrayList2.add(campaignEx);
                                        linkedHashMap2.put(requestId2, arrayList2);
                                    }
                                }
                            }
                        }
                    }
                    if (linkedHashMap2.size() + linkedHashMap.size() >= vcn && linkedHashMap.size() > 0 && linkedHashMap.entrySet() != null && linkedHashMap.entrySet().iterator() != null && linkedHashMap.entrySet().iterator().next() != null && ((Map.Entry) linkedHashMap.entrySet().iterator().next()).getValue() != null) {
                        copyOnWriteArrayList.addAll((Collection) ((Map.Entry) linkedHashMap.entrySet().iterator().next()).getValue());
                        com.mbridge.msdk.foundation.same.buffer.b.a(this.f36658h, str, vcn);
                    }
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardVideoController", e10.getMessage());
                }
            }
        }
        return copyOnWriteArrayList;
    }

    public static void a(String str, String str2) {
        ConcurrentHashMap<String, String> concurrentHashMap;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (concurrentHashMap = f36648e0) == null || concurrentHashMap.containsKey(str)) {
            return;
        }
        f36648e0.put(str, str2);
    }

    public void a() {
        try {
            String str = "";
            MBridgeIds mBridgeIds = this.f36659i;
            if (mBridgeIds != null) {
                if (!this.C) {
                    mBridgeIds.setBidToken("");
                    return;
                }
                String strM = m();
                if (TextUtils.isEmpty(strM)) {
                    return;
                }
                ConcurrentHashMap<String, String> concurrentHashMap = f36648e0;
                if (concurrentHashMap != null && concurrentHashMap.containsKey(strM) && !TextUtils.isEmpty(f36648e0.get(strM))) {
                    str = f36648e0.get(strM);
                }
                this.f36659i.setBidToken(str);
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public void a(InterVideoOutListener interVideoOutListener) {
        this.f36655e = interVideoOutListener;
        this.f36656f = new h(this, interVideoOutListener, this.f36665o, this.f36658h, null);
    }

    public void a(boolean z10, com.mbridge.msdk.foundation.same.report.metrics.e eVar) {
        a(z10, "", eVar);
    }

    public void a(boolean z10, String str, com.mbridge.msdk.foundation.same.report.metrics.e eVar) {
        com.mbridge.msdk.foundation.same.report.metrics.c cVarB = b(z10, str, eVar);
        this.f36676z = str;
        if (this.f36656f == null) {
            this.f36656f = new h(this, null, this.f36665o, this.f36658h, null);
        }
        if (this.f36656f != null && this.f36656f.a() == 1) {
            a(z10, cVarB);
            return;
        }
        this.f36651a0 = 1;
        if (this.f36656f != null && this.f36656f.a() == 3) {
            this.L = false;
        } else {
            this.L = true;
            if (this.f36656f != null) {
                this.f36656f.a(1);
            }
        }
        this.f36674x = z10;
        this.f36665o.removeMessages(1001001);
        this.O = false;
        this.N = false;
        this.P = false;
        this.Q = false;
        x();
        w();
        com.mbridge.msdk.reward.adapter.b.b().c();
        try {
            if (TextUtils.isEmpty(str)) {
                if (this.f36670t) {
                    com.mbridge.msdk.timer.b.getInstance().addInterstitialList(this.f36662l, this.f36658h);
                } else {
                    com.mbridge.msdk.timer.b.getInstance().addRewardList(this.f36662l, this.f36658h);
                }
            }
            if (this.f36671u && TextUtils.isEmpty(str)) {
                a(cVarB);
                return;
            }
            if (com.mbridge.msdk.system.a.map == null) {
                b(cVarB);
                return;
            }
            com.mbridge.msdk.videocommon.setting.c cVarC = com.mbridge.msdk.videocommon.setting.b.b().c(com.mbridge.msdk.foundation.controller.c.n().b(), this.f36658h);
            this.f36653c = cVarC;
            if (cVarC == null) {
                this.J = com.mbridge.msdk.foundation.controller.c.n().b();
                com.mbridge.msdk.videocommon.setting.b.b().a(this.J, com.mbridge.msdk.foundation.controller.c.n().c(), this.f36658h, new C0367a());
                this.f36653c = com.mbridge.msdk.videocommon.setting.b.b().a(com.mbridge.msdk.foundation.controller.c.n().b(), this.f36658h, this.f36670t);
            }
            if (!TextUtils.isEmpty(this.f36662l)) {
                this.f36653c.f(this.f36662l);
            }
            int iN = this.f36653c.n() * 1000;
            if (this.f36665o != null) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 1001002;
                if (cVarB != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString("metrics_data_lrid", cVarB.t());
                    messageObtain.setData(bundle);
                }
                this.f36665o.sendMessageDelayed(messageObtain, iN);
            }
            this.I = this.f36653c.z();
            try {
                a(z10, str, cVarB);
            } catch (Exception e10) {
                if (this.f36656f != null) {
                    com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880020, "load exception");
                    if (cVarB != null) {
                        cVarB.a(bVarA);
                        cVarB.b(true);
                    }
                    this.f36656f.a(bVarA, cVarB);
                }
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardVideoController", e10.getMessage());
                }
            }
        } catch (Exception e11) {
            if (this.f36656f != null) {
                com.mbridge.msdk.foundation.error.b bVarA2 = com.mbridge.msdk.foundation.error.a.a(880001, "");
                if (cVarB != null) {
                    cVarB.a(bVarA2);
                    cVarB.b(true);
                }
                this.f36656f.a(bVarA2, cVarB);
            }
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardVideoController", e11.getMessage());
            }
        }
    }

    private boolean b(String str, String str2) {
        try {
            com.mbridge.msdk.reward.adapter.c cVar = this.f36652b;
            if (cVar == null || !str.equals(cVar.j())) {
                com.mbridge.msdk.reward.adapter.c cVar2 = new com.mbridge.msdk.reward.adapter.c(this.f36650a, this.f36662l, str);
                this.f36652b = cVar2;
                cVar2.d(this.f36670t);
                this.f36652b.e(this.f36671u);
            }
            this.f36652b.a(this.f36666p);
            this.f36652b.a(this.f36653c);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardVideoController", e10.getMessage());
            }
        }
        List<CampaignEx> listB = com.mbridge.msdk.videocommon.cache.a.a().b(str, 1, this.f36671u);
        this.T = com.mbridge.msdk.videocommon.cache.a.a().a(str, 1, this.f36671u);
        if (listB != null && listB.size() > 0) {
            com.mbridge.msdk.videocommon.cache.a.a().a(str, listB, str2);
            CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.S;
            if (copyOnWriteArrayList == null) {
                this.S = new CopyOnWriteArrayList<>();
            } else {
                copyOnWriteArrayList.clear();
            }
            for (CampaignEx campaignEx : listB) {
                campaignEx.setLocalRequestId(str2);
                this.S.add(campaignEx);
            }
            a(this.S);
            return true;
        }
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = this.S;
        if (copyOnWriteArrayList2 == null) {
            return false;
        }
        copyOnWriteArrayList2.clear();
        return false;
    }

    public void b(boolean z10, String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.foundation.same.report.metrics.d.b().a(cVar);
        String str2 = cVarA.t() + "label_second";
        cVarA.i(str2);
        com.mbridge.msdk.foundation.same.report.metrics.d.b().c().put(str2, cVarA);
        try {
            com.mbridge.msdk.reward.adapter.c cVar2 = this.f36652b;
            if (cVar2 == null || !this.f36658h.equals(cVar2.j())) {
                com.mbridge.msdk.reward.adapter.c cVar3 = new com.mbridge.msdk.reward.adapter.c(this.f36650a, this.f36662l, this.f36658h);
                this.f36652b = cVar3;
                cVar3.d(this.f36670t);
                this.f36652b.e(this.f36671u);
            }
            if (this.f36670t) {
                this.f36652b.a(this.f36667q, this.f36668r, this.f36669s);
            }
            if (cVarA.o() != null && !cVarA.o().isEmpty()) {
                this.Z.put(cVarA.o().get(0).getId());
            }
            this.f36652b.a(this.f36666p);
            this.f36652b.a(this.f36653c);
            f fVar = new f(this.f36652b, this.G, z10, str, cVarA);
            fVar.a(this.F);
            this.f36660j.a(fVar);
            this.f36652b.a(this.f36660j);
            this.f36652b.a(1, this.Z.toString());
            this.f36652b.a(this.G, this.F, z10, str, this.f36675y, cVarA);
            this.f36665o.postDelayed(fVar, this.F * 1000);
        } catch (Exception e10) {
            com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880020, e10.getMessage());
            cVarA.a(bVarA);
            cVarA.b(true);
            a(bVarA, cVarA);
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardVideoController", e10.getMessage());
            }
        }
    }

    private void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        if (this.f36656f != null) {
            com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880035, "");
            if (cVar != null) {
                cVar.a(bVarA);
                cVar.b(true);
            }
            this.f36656f.a("bidToken is empty", cVar);
        }
    }

    private boolean b() {
        if (this.f36652b == null) {
            f();
        }
        List<com.mbridge.msdk.foundation.entity.c> listA = com.mbridge.msdk.videocommon.cache.a.a().a(this.f36658h);
        if (listA == null || listA.size() <= 0) {
            return false;
        }
        for (com.mbridge.msdk.foundation.entity.c cVar : listA) {
            if (cVar != null) {
                this.f36652b.c(cVar.a());
                this.f36652b.b(cVar.d());
                if (this.f36652b.m()) {
                    return true;
                }
                com.mbridge.msdk.videocommon.cache.a.a().d(this.f36658h, cVar.a());
            }
        }
        return false;
    }

    private void a(boolean z10, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        if (!this.f36674x) {
            if (z10) {
                this.f36674x = z10;
            }
        } else if (z10) {
            String strB = com.mbridge.msdk.foundation.error.a.b(880016, "errorCode: 3501 errorMessage: current unit is loading");
            com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880016, "errorCode: 3501 errorMessage: current unit is loading");
            if (cVar != null) {
                cVar.a(bVarA);
                cVar.b(true);
            }
            this.f36656f.b(strB, cVar);
        }
    }

    private void b(boolean z10) {
        List<String> listE;
        if (z10) {
            try {
                com.mbridge.msdk.foundation.db.e eVarA = com.mbridge.msdk.foundation.db.e.a(com.mbridge.msdk.foundation.db.g.a(this.f36650a));
                if (eVarA != null && (listE = eVarA.e(this.f36658h)) != null && listE.size() > 0) {
                    Iterator<String> it = listE.iterator();
                    while (it.hasNext()) {
                        com.mbridge.msdk.foundation.same.report.metrics.d.b().d(it.next());
                    }
                }
                LinkedHashMap<String, com.mbridge.msdk.foundation.same.report.metrics.c> linkedHashMapC = com.mbridge.msdk.foundation.same.report.metrics.d.b().c();
                if (linkedHashMapC == null || linkedHashMapC.size() <= 0) {
                    return;
                }
                Iterator<Map.Entry<String, com.mbridge.msdk.foundation.same.report.metrics.c>> it2 = linkedHashMapC.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry<String, com.mbridge.msdk.foundation.same.report.metrics.c> next = it2.next();
                    if (next != null && next.getValue().E()) {
                        it2.remove();
                    }
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                }
            }
        }
    }

    private void a(boolean z10, String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        com.mbridge.msdk.reward.candidate.a aVar;
        com.mbridge.msdk.reward.candidate.a aVar2;
        if (this.f36656f != null) {
            if (!this.f36671u) {
                this.R = b(this.f36658h, cVar.t());
                if (this.R) {
                    if (!c()) {
                        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.S;
                        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
                            return;
                        }
                        try {
                            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                            eVar.a("cache", 1);
                            cVar.a("2000127", eVar);
                            cVar.a("2000048", eVar);
                            cVar.a(copyOnWriteArrayList);
                        } catch (Exception e10) {
                            if (MBridgeConstans.DEBUG) {
                                q0.b("RewardVideoController", e10.getMessage());
                            }
                        }
                        this.f36656f.b(this.f36662l, this.f36658h, cVar);
                        CampaignEx campaignEx = copyOnWriteArrayList.get(0);
                        this.f36656f.a(this.f36671u);
                        com.mbridge.msdk.reward.adapter.c cVar2 = this.f36652b;
                        if (cVar2 != null && cVar2.a(copyOnWriteArrayList, !TextUtils.isEmpty(campaignEx.getCMPTEntryUrl()), campaignEx.getNscpt())) {
                            a(copyOnWriteArrayList);
                            this.f36656f.d(this.f36662l, this.f36658h, cVar);
                        } else {
                            a(copyOnWriteArrayList, this.f36652b);
                        }
                        if (this.L) {
                            com.mbridge.msdk.reward.adapter.c cVar3 = this.f36652b;
                            if (cVar3 != null) {
                                cVar3.c(this.S);
                            }
                            a(this.I, z10, str, cVar);
                            return;
                        }
                        return;
                    }
                    q0.a("RewardVideoController", "非BID，本地存在可用的缓存，超过上限");
                    CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = this.S;
                    if (copyOnWriteArrayList2 != null && copyOnWriteArrayList2.size() > 0) {
                        Iterator<CampaignEx> it = this.S.iterator();
                        while (it.hasNext()) {
                            com.mbridge.msdk.videocommon.cache.a.a().a(it.next(), this.f36658h);
                        }
                    }
                    com.mbridge.msdk.reward.adapter.c cVar4 = this.f36652b;
                    if (cVar4 != null) {
                        cVar4.c(this.S);
                    }
                    if (z10) {
                        if (this.f36656f != null) {
                            String strB = com.mbridge.msdk.foundation.error.a.b(880019, "");
                            cVar.a(com.mbridge.msdk.foundation.error.a.a(880019, ""));
                            cVar.b(true);
                            this.f36656f.a(strB, cVar);
                            return;
                        }
                        return;
                    }
                    this.R = false;
                    this.f36656f.a(this.f36671u);
                    a(this.I, z10, str, cVar);
                    return;
                }
                if (!c()) {
                    this.R = false;
                    com.mbridge.msdk.reward.adapter.c cVar5 = this.f36652b;
                    if (cVar5 != null) {
                        cVar5.c(this.S);
                    }
                    this.f36656f.a(this.f36671u);
                    a(this.I, z10, str, cVar);
                    return;
                }
                if (z10) {
                    if (this.f36656f != null) {
                        String strB2 = com.mbridge.msdk.foundation.error.a.b(880019, "");
                        cVar.a(com.mbridge.msdk.foundation.error.a.a(880019, ""));
                        cVar.b(true);
                        this.f36656f.a(strB2, cVar);
                        return;
                    }
                    return;
                }
                this.R = false;
                com.mbridge.msdk.reward.adapter.c cVar6 = this.f36652b;
                if (cVar6 != null) {
                    cVar6.c(this.S);
                }
                this.f36656f.a(this.f36671u);
                a(this.I, z10, str, cVar);
                return;
            }
            CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListB = com.mbridge.msdk.videocommon.cache.a.a().b(this.f36658h, 1, this.f36671u, "");
            CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListB2 = null;
            if (copyOnWriteArrayListB != null && copyOnWriteArrayListB.size() > 0) {
                if (!c()) {
                    if (this.f36652b == null) {
                        f();
                    }
                    CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListA = a(str, copyOnWriteArrayListB);
                    if (copyOnWriteArrayListA != null && copyOnWriteArrayListA.size() > 0) {
                        a(copyOnWriteArrayListA, str, cVar);
                        return;
                    }
                    try {
                        com.mbridge.msdk.reward.candidate.a aVar3 = new com.mbridge.msdk.reward.candidate.a(this.f36658h, this.f36670t);
                        com.mbridge.msdk.foundation.cache.c cVar7 = new com.mbridge.msdk.foundation.cache.c();
                        if (aVar3.a(str)) {
                            aVar2 = aVar3;
                            cVar7 = aVar3.a(str, cVar, (CampaignEx) null, new com.mbridge.msdk.foundation.error.b(880038), 1, this.f36652b);
                            if (cVar7 != null && cVar7.g() == com.mbridge.msdk.foundation.cache.c.f34546l && cVar7.c() != null && cVar7.c().size() > 0 && this.f36652b != null) {
                                CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListC = cVar7.c();
                                ArrayList arrayList = new ArrayList();
                                for (CampaignEx campaignEx2 : copyOnWriteArrayListB) {
                                    if (campaignEx2 != null) {
                                        String requestId = campaignEx2.getRequestId();
                                        if (!TextUtils.isEmpty(requestId)) {
                                            for (int i10 = 0; i10 < copyOnWriteArrayListC.size(); i10++) {
                                                CampaignEx campaignEx3 = copyOnWriteArrayListC.get(i10);
                                                if (campaignEx3 != null) {
                                                    if (requestId.equals(campaignEx3.getRequestId())) {
                                                        break;
                                                    } else if (i10 == copyOnWriteArrayListC.size() - 1) {
                                                        arrayList.add(campaignEx2);
                                                    }
                                                }
                                            }
                                            if (copyOnWriteArrayListC.size() != 0) {
                                                break;
                                            }
                                            arrayList.add(campaignEx2);
                                            break;
                                        }
                                    }
                                }
                                this.f36652b.c(arrayList);
                                this.f36652b.a(cVar7.c(), false, true, true);
                                copyOnWriteArrayListB2 = new CopyOnWriteArrayList<>(cVar7.c());
                            }
                        } else {
                            aVar2 = aVar3;
                            copyOnWriteArrayListB2 = b(str, copyOnWriteArrayListB);
                            if (copyOnWriteArrayListB2.size() > 0) {
                                com.mbridge.msdk.foundation.db.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(str, copyOnWriteArrayListB2);
                            }
                            cVar7.d("cb is closed");
                            cVar7.a(com.mbridge.msdk.foundation.cache.c.f34545k);
                        }
                        aVar2.a(cVar, str, cVar7, (List<com.mbridge.msdk.foundation.cache.a.b>) null, (JSONObject) null, 1);
                        if (copyOnWriteArrayListB2 != null && copyOnWriteArrayListB2.size() > 0) {
                            a(copyOnWriteArrayListB2, str, cVar);
                            if (this.f36652b != null && !aVar2.a(str)) {
                                this.f36652b.c(copyOnWriteArrayListB2);
                            }
                        }
                    } catch (Exception e11) {
                        if (MBridgeConstans.DEBUG) {
                            q0.b("RewardVideoController", e11.getMessage());
                        }
                    }
                    this.R = false;
                    this.f36656f.a(this.f36671u);
                    a(this.I, z10, str, cVar);
                    return;
                }
                com.mbridge.msdk.videocommon.cache.a.a().b(this.f36658h, str);
                if (!z10 || this.f36656f == null) {
                    return;
                }
                String strB3 = com.mbridge.msdk.foundation.error.a.b(880019, "");
                com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880019, "");
                if (cVar != null) {
                    cVar.a(bVarA);
                    cVar.b(true);
                }
                this.f36656f.a(strB3, cVar);
                return;
            }
            if (!c()) {
                try {
                    com.mbridge.msdk.reward.candidate.a aVar4 = new com.mbridge.msdk.reward.candidate.a(this.f36658h, this.f36670t);
                    com.mbridge.msdk.foundation.cache.c cVar8 = new com.mbridge.msdk.foundation.cache.c();
                    if (aVar4.a(str)) {
                        if (this.f36652b == null) {
                            com.mbridge.msdk.reward.adapter.c cVar9 = new com.mbridge.msdk.reward.adapter.c(this.f36650a, this.f36662l, this.f36658h);
                            this.f36652b = cVar9;
                            cVar9.d(this.f36670t);
                            this.f36652b.e(this.f36671u);
                            if (this.f36670t) {
                                this.f36652b.a(this.f36667q, this.f36668r, this.f36669s);
                            }
                            this.f36652b.a(this.f36666p);
                            this.f36652b.a(this.f36653c);
                        }
                        aVar = aVar4;
                        cVar8 = aVar4.a(str, cVar, (CampaignEx) null, new com.mbridge.msdk.foundation.error.b(880038), 1, this.f36652b);
                        if (cVar8 != null && cVar8.g() == com.mbridge.msdk.foundation.cache.c.f34546l && cVar8.c() != null && cVar8.c().size() > 0 && this.f36652b != null) {
                            CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListC2 = cVar8.c();
                            if (copyOnWriteArrayListB != null) {
                                ArrayList arrayList2 = new ArrayList();
                                for (CampaignEx campaignEx4 : copyOnWriteArrayListB) {
                                    if (campaignEx4 != null) {
                                        String requestId2 = campaignEx4.getRequestId();
                                        if (!TextUtils.isEmpty(requestId2)) {
                                            for (int i11 = 0; i11 < copyOnWriteArrayListC2.size(); i11++) {
                                                CampaignEx campaignEx5 = copyOnWriteArrayListC2.get(i11);
                                                if (campaignEx5 != null) {
                                                    if (requestId2.equals(campaignEx5.getRequestId())) {
                                                        break;
                                                    } else if (i11 == copyOnWriteArrayListC2.size() - 1) {
                                                        arrayList2.add(campaignEx4);
                                                    }
                                                }
                                            }
                                            if (copyOnWriteArrayListC2.size() != 0) {
                                                break;
                                            }
                                            arrayList2.add(campaignEx4);
                                            break;
                                        }
                                    }
                                }
                                this.f36652b.c(arrayList2);
                            }
                            this.f36652b.a(cVar8.c(), false, true, true);
                            copyOnWriteArrayListB2 = new CopyOnWriteArrayList<>(cVar8.c());
                        }
                    } else {
                        aVar = aVar4;
                        copyOnWriteArrayListB2 = b(str, copyOnWriteArrayListB);
                        if (copyOnWriteArrayListB2.size() > 0) {
                            com.mbridge.msdk.foundation.db.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(str, copyOnWriteArrayListB2);
                        }
                        cVar8.d("cb is closed 2");
                        cVar8.a(com.mbridge.msdk.foundation.cache.c.f34545k);
                    }
                    aVar.a(cVar, str, cVar8, (List<com.mbridge.msdk.foundation.cache.a.b>) null, (JSONObject) null, 1);
                    if (copyOnWriteArrayListB2 != null && copyOnWriteArrayListB2.size() > 0) {
                        a(copyOnWriteArrayListB2, str, cVar);
                        if (this.f36652b != null && !aVar.a(str)) {
                            this.f36652b.c(copyOnWriteArrayListB2);
                        }
                    }
                } catch (Exception e12) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("RewardVideoController", e12.getMessage());
                    }
                }
                this.R = false;
                this.f36656f.a(this.f36671u);
                a(this.I, z10, str, cVar);
                return;
            }
            com.mbridge.msdk.videocommon.cache.a.a().b(this.f36658h, str);
            if (!z10 || this.f36656f == null) {
                return;
            }
            String strB4 = com.mbridge.msdk.foundation.error.a.b(880019, "");
            com.mbridge.msdk.foundation.error.b bVarA2 = com.mbridge.msdk.foundation.error.a.a(880019, "");
            if (cVar != null) {
                cVar.a(bVarA2);
                cVar.b(true);
            }
            this.f36656f.a(strB4, cVar);
        }
    }

    private void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
            return;
        }
        try {
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("cache", 1);
            cVar.a("2000127", eVar);
            cVar.a("2000048", eVar);
            cVar.a(copyOnWriteArrayList);
        } catch (Exception e10) {
            q0.b("RewardVideoController", e10.getMessage());
        }
        this.R = true;
        this.f36656f.a(this.f36671u);
        this.f36656f.b(this.f36662l, this.f36658h, cVar);
        CampaignEx campaignEx = copyOnWriteArrayList.get(0);
        a(campaignEx.getRequestId(), str);
        com.mbridge.msdk.reward.adapter.c cVar2 = this.f36652b;
        if (cVar2 != null && cVar2.a(copyOnWriteArrayList, true ^ TextUtils.isEmpty(campaignEx.getCMPTEntryUrl()), campaignEx.getNscpt())) {
            a(copyOnWriteArrayList);
            this.f36656f.d(this.f36662l, this.f36658h, cVar);
        } else {
            a(copyOnWriteArrayList, this.f36652b);
        }
    }

    private CopyOnWriteArrayList<CampaignEx> a(String str, List<CampaignEx> list) {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        if (list != null && list.size() > 0 && !TextUtils.isEmpty(str)) {
            for (CampaignEx campaignEx : list) {
                if (campaignEx != null && str.equals(campaignEx.getBidToken())) {
                    copyOnWriteArrayList.add(campaignEx);
                }
            }
        }
        return copyOnWriteArrayList;
    }

    private void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, com.mbridge.msdk.reward.adapter.c cVar) {
        CampaignEx campaignEx = copyOnWriteArrayList.get(0);
        boolean z10 = !TextUtils.isEmpty(campaignEx.getCMPTEntryUrl());
        int nscpt = campaignEx.getNscpt();
        this.U = false;
        this.V = false;
        this.W = false;
        this.X = false;
        this.Y = false;
        com.mbridge.msdk.reward.adapter.b.b().a(this.f36650a, z10, nscpt, this.f36671u, this.f36670t ? MBSupportMuteAdType.INTERSTITIAL_VIDEO : 94, this.f36662l, this.f36658h, campaignEx.getRequestId(), copyOnWriteArrayList, new b(campaignEx, z10, cVar, nscpt), new c(campaignEx, copyOnWriteArrayList, z10, nscpt));
        if (z10) {
            com.mbridge.msdk.reward.adapter.b.b().a(this.f36650a, campaignEx, this.f36662l, this.f36658h, campaignEx.getRequestId(), new d(campaignEx, copyOnWriteArrayList, cVar, z10, nscpt));
        }
    }

    private void a(Queue<Integer> queue, boolean z10, String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        Integer numPoll;
        try {
            this.F = 25;
            this.G = 1;
            if (queue != null && queue.size() > 0 && (numPoll = queue.poll()) != null) {
                this.F = numPoll.intValue();
            }
            try {
                a(this.G, this.F, z10, str, cVar);
            } catch (Exception e10) {
                com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880020, "load mv api error:" + e10.getMessage());
                if (cVar != null) {
                    cVar.a(bVarA);
                    cVar.b(true);
                }
                a(bVarA, cVar);
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardVideoController", e10.getMessage());
                }
            }
        } catch (Exception e11) {
            com.mbridge.msdk.foundation.error.b bVarA2 = com.mbridge.msdk.foundation.error.a.a(880020, "load mv api error:" + e11.getMessage());
            if (cVar != null) {
                cVar.a(bVarA2);
                cVar.b(true);
            }
            a(bVarA2, cVar);
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardVideoController", e11.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.foundation.error.b bVar, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        if (this.f36656f != null) {
            this.Q = true;
            this.f36656f.a(bVar, cVar);
        }
    }

    public void a(int i10, int i11, boolean z10, String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        try {
            com.mbridge.msdk.reward.adapter.c cVar2 = this.f36652b;
            if (cVar2 == null || !this.f36658h.equals(cVar2.j())) {
                com.mbridge.msdk.reward.adapter.c cVar3 = new com.mbridge.msdk.reward.adapter.c(this.f36650a, this.f36662l, this.f36658h);
                this.f36652b = cVar3;
                cVar3.d(this.f36670t);
                this.f36652b.e(this.f36671u);
            }
            if (this.f36670t) {
                this.f36652b.a(this.f36667q, this.f36668r, this.f36669s);
            }
            this.H = new ArrayList();
            this.f36652b.a(this.f36666p);
            this.f36652b.a(this.f36653c);
            f fVar = new f(this.f36652b, i10, z10, str, cVar);
            fVar.a(i11);
            g gVar = new g(this.f36652b, z10);
            this.f36660j = gVar;
            gVar.a(fVar);
            this.f36652b.a(this.f36660j);
            this.f36652b.a(0, "");
            this.f36652b.a(new j());
            this.f36652b.a(i10, i11, z10, str, this.f36675y, cVar);
            this.f36665o.postDelayed(fVar, i11 * 1000);
        } catch (Exception e10) {
            com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880020, e10.getMessage());
            if (cVar != null) {
                cVar.a(bVarA);
                cVar.b(true);
            }
            a(bVarA, cVar);
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardVideoController", e10.getMessage());
            }
        }
    }

    private void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        com.mbridge.msdk.videocommon.setting.c cVar2;
        com.mbridge.msdk.videocommon.setting.c cVar3;
        boolean zL;
        boolean zM;
        try {
            if (this.f36652b == null) {
                f();
            }
            if (this.f36652b != null) {
                q0.b("RewardVideoController", "controller 819");
                if (this.f36671u) {
                    zL = a(false);
                } else {
                    zL = this.f36652b.l();
                }
                C0367a c0367a = null;
                if (zL) {
                    q0.c("RewardVideoController", "invoke adapter show isReady");
                    i iVar = new i(this, this, this.f36665o, c0367a);
                    f36649f0.put(this.f36658h, iVar);
                    this.f36652b.a(iVar, str, this.f36657g, this.f36666p, this.f36661k, cVar);
                    this.E = false;
                    return;
                }
                if (this.f36671u) {
                    zM = b();
                } else {
                    zM = this.f36652b.m();
                }
                if (zM) {
                    q0.c("RewardVideoController", "invoke adapter show isSpareOfferReady");
                    i iVar2 = new i(this, this, this.f36665o, c0367a);
                    f36649f0.put(this.f36658h, iVar2);
                    this.f36652b.a(iVar2, str, this.f36657g, this.f36666p, this.f36661k, cVar);
                    this.E = false;
                    return;
                }
            }
            this.E = false;
            a("2000131", cVar, this.f36655e, "can't show because load is failed");
            if (this.f36655e != null) {
                try {
                    this.f36655e.onShowFail(cVar, this.f36659i, "can't show because load is failed");
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("RewardVideoController", e10.getMessage());
                    }
                }
            }
            if (this.f36670t || this.f36671u || (cVar3 = this.f36653c) == null || !cVar3.a(4) || this.f36656f == null || this.f36656f.a() == 1 || this.f36656f.a() == 3) {
                return;
            }
            a(false, com.mbridge.msdk.foundation.same.report.metrics.d.b().a(0, 94, this.f36658h, true, 1));
        } catch (Exception e11) {
            this.E = false;
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardVideoController", e11.getLocalizedMessage());
            }
            a("2000131", cVar, this.f36655e, "show exception");
            if (this.f36655e != null) {
                try {
                    this.f36655e.onShowFail(cVar, this.f36659i, "show exception");
                } catch (Exception unused) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("RewardVideoController", e11.getMessage());
                    }
                }
            }
            if (this.f36670t || this.f36671u || (cVar2 = this.f36653c) == null || !cVar2.a(4) || this.f36656f == null || this.f36656f.a() == 1 || this.f36656f.a() == 3) {
                return;
            }
            a(false, com.mbridge.msdk.foundation.same.report.metrics.d.b().a(0, 94, this.f36658h, true, 1));
        }
    }

    private boolean a(boolean z10) {
        if (this.f36652b == null) {
            f();
        }
        List<com.mbridge.msdk.foundation.entity.c> listA = com.mbridge.msdk.videocommon.cache.a.a().a(this.f36658h);
        String str = this.A;
        if (listA == null || listA.size() <= 0) {
            if (!z10) {
                return false;
            }
            d("is_ready_ctir_false", "no effective campaign list");
            com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
            cVar.i(str);
            cVar.g(this.f36676z);
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("type", 8);
            cVar.a("m_offer_ready", eVar);
            a(false, cVar, (List<CampaignEx>) this.f36652b.h());
            return false;
        }
        String strD = com.mbridge.msdk.foundation.same.buffer.b.d(this.f36658h);
        boolean zA = TextUtils.isEmpty(strD) ? false : a(listA, strD, z10);
        if (z10) {
            d("is_ready_ctir_" + zA, "");
        }
        if (zA) {
            if (!z10) {
                return zA;
            }
            com.mbridge.msdk.foundation.same.report.metrics.c cVar2 = new com.mbridge.msdk.foundation.same.report.metrics.c();
            cVar2.i(str);
            a(zA, cVar2, this.f36652b.h());
            return zA;
        }
        for (com.mbridge.msdk.foundation.entity.c cVar3 : listA) {
            if (cVar3 != null) {
                this.f36652b.c(cVar3.a());
                this.f36652b.b(cVar3.d());
                if (this.f36652b.b(z10)) {
                    cVar3.d();
                    return true;
                }
            }
        }
        return zA;
    }

    private boolean a(List<com.mbridge.msdk.foundation.entity.c> list, String str, boolean z10) {
        if (list == null) {
            return false;
        }
        for (com.mbridge.msdk.foundation.entity.c cVar : list) {
            if (cVar != null && str.equals(cVar.b())) {
                this.f36652b.c(cVar.a());
                this.f36652b.b(cVar.d());
                if (this.f36652b.l()) {
                    if (z10) {
                        com.mbridge.msdk.foundation.same.report.metrics.c cVar2 = new com.mbridge.msdk.foundation.same.report.metrics.c();
                        cVar2.i(cVar.d());
                        a(false, cVar2, (List<CampaignEx>) this.f36652b.h());
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:127:0x01df  */
    /* JADX WARN: Code duplicated, block: B:153:0x01f5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public void a(String str, String str2, String str3, com.mbridge.msdk.foundation.same.report.metrics.e eVar) {
        com.mbridge.msdk.videocommon.setting.c cVar;
        com.mbridge.msdk.videocommon.setting.c cVar2;
        com.mbridge.msdk.videocommon.setting.c cVar3;
        com.mbridge.msdk.videocommon.setting.c cVar4;
        com.mbridge.msdk.foundation.same.report.metrics.c cVarA = a(eVar);
        try {
            this.f36663m = str;
            this.f36657g = str2;
            this.f36661k = str3;
            synchronized (this.D) {
                if (this.E) {
                    a("2000131", cVarA, this.f36655e, "campaing is show progressing ");
                    if (this.f36655e != null) {
                        try {
                            this.f36655e.onShowFail(cVarA, this.f36659i, "campaing is show progressing ");
                        } catch (Exception e10) {
                            if (MBridgeConstans.DEBUG) {
                                q0.b("RewardVideoController", e10.getMessage());
                            }
                        }
                    }
                    return;
                }
                this.E = true;
                Context context = this.f36650a;
                if (context == null) {
                    a("2000131", cVarA, this.f36655e, "context is null");
                    if (this.f36655e != null) {
                        try {
                            this.f36655e.onShowFail(cVarA, this.f36659i, "context is null");
                        } catch (Exception e11) {
                            if (MBridgeConstans.DEBUG) {
                                q0.b("RewardVideoController", e11.getMessage());
                            }
                        }
                    }
                    if (!this.f36670t && !this.f36671u && (cVar4 = this.f36653c) != null && cVar4.a(4) && this.f36656f != null && this.f36656f.a() != 1 && this.f36656f.a() != 3) {
                        a(false, com.mbridge.msdk.foundation.same.report.metrics.d.b().a(0, 94, this.f36658h, true, 1));
                    }
                    this.E = false;
                    return;
                }
                if (this.f36670t && !v0.l(context) && s0.a().a("s_a_w_n_c", true)) {
                    a("2000131", cVarA, this.f36655e, "network exception");
                    if (this.f36655e != null) {
                        try {
                            this.f36655e.onShowFail(cVarA, this.f36659i, "network exception");
                        } catch (Exception e12) {
                            if (MBridgeConstans.DEBUG) {
                                q0.b("RewardVideoController", e12.getMessage());
                            }
                        }
                    }
                    if (!this.f36670t && !this.f36671u && (cVar3 = this.f36653c) != null && cVar3.a(4) && this.f36656f != null && this.f36656f.a() != 1 && this.f36656f.a() != 3) {
                        a(false, com.mbridge.msdk.foundation.same.report.metrics.d.b().a(0, 94, this.f36658h, true, 1));
                    }
                    this.E = false;
                    return;
                }
                if (c()) {
                    a("2000131", cVarA, this.f36655e, "Play more than limit");
                    if (this.f36655e != null) {
                        try {
                            this.f36655e.onShowFail(cVarA, this.f36659i, "Play more than limit");
                        } catch (Exception e13) {
                            if (MBridgeConstans.DEBUG) {
                                q0.b("RewardVideoController", e13.getMessage());
                            }
                        }
                    }
                    if (!this.f36670t && !this.f36671u && (cVar2 = this.f36653c) != null && cVar2.a(4) && this.f36656f != null && this.f36656f.a() != 1 && this.f36656f.a() != 3) {
                        a(false, com.mbridge.msdk.foundation.same.report.metrics.d.b().a(0, 94, this.f36658h, true, 1));
                    }
                    this.E = false;
                    return;
                }
                if (TextUtils.isEmpty(this.f36657g)) {
                    this.f36657g = com.mbridge.msdk.foundation.tools.g.d();
                }
                try {
                    String str4 = new SimpleDateFormat("dd").format(new Date());
                    String str5 = (String) y0.a(this.f36650a, "reward_date", "0");
                    if (!TextUtils.isEmpty(str5) && !TextUtils.isEmpty(str4) && !str5.equals(str4)) {
                        y0.b(this.f36650a, "reward_date", str4);
                    }
                } catch (Exception e14) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("RewardVideoController", e14.getMessage());
                    }
                }
                a(str, cVarA);
                return;
                this.E = false;
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardVideoController", e.getLocalizedMessage());
                }
                a("2000131", cVarA, this.f36655e, "show exception");
                if (this.f36655e != null) {
                    try {
                        this.f36655e.onShowFail(cVarA, this.f36659i, "show exception");
                    } catch (Exception unused) {
                        if (MBridgeConstans.DEBUG) {
                            q0.b("RewardVideoController", e.getMessage());
                        }
                    }
                }
                if (!this.f36670t || this.f36671u || (cVar = this.f36653c) == null || !cVar.a(4) || this.f36656f == null || this.f36656f.a() == 1 || this.f36656f.a() == 3) {
                    return;
                }
                a(false, com.mbridge.msdk.foundation.same.report.metrics.d.b().a(0, 94, this.f36658h, true, 1));
            }
        } catch (Exception e15) {
            this.E = false;
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardVideoController", e15.getLocalizedMessage());
            }
            a("2000131", cVarA, this.f36655e, "show exception");
            if (this.f36655e != null) {
                this.f36655e.onShowFail(cVarA, this.f36659i, "show exception");
            }
            if (this.f36670t) {
            }
        }
    }

    private com.mbridge.msdk.foundation.same.report.metrics.c a(com.mbridge.msdk.foundation.same.report.metrics.e eVar) {
        com.mbridge.msdk.foundation.same.report.metrics.c cVar;
        CampaignEx campaignEx;
        try {
            CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListB = com.mbridge.msdk.videocommon.download.b.getInstance().b(this.f36658h);
            String currentLocalRid = "";
            if (copyOnWriteArrayListB != null && copyOnWriteArrayListB.size() > 0 && (campaignEx = copyOnWriteArrayListB.get(0)) != null) {
                currentLocalRid = campaignEx.getCurrentLocalRid();
            }
            com.mbridge.msdk.foundation.same.report.metrics.c cVar2 = TextUtils.isEmpty(currentLocalRid) ? null : com.mbridge.msdk.foundation.same.report.metrics.d.b().c().get(currentLocalRid);
            if (cVar2 != null) {
                cVar2.b(copyOnWriteArrayListB);
                cVar2.a("2000128", eVar);
                cVar2.i(currentLocalRid);
                cVar2.n(this.f36658h);
                com.mbridge.msdk.reward.report.metrics.a.a().a("2000128", cVar2);
                return cVar2;
            }
            cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
            try {
                cVar.n(this.f36658h);
                eVar.a("metrics_data_reason", "未获取到待展示的campaign信息 本地new metricsData");
                cVar.a("2000128", eVar);
                if (TextUtils.isEmpty(currentLocalRid)) {
                    cVar.i(SameMD5.getMD5(v0.d()));
                } else {
                    cVar.i(currentLocalRid);
                    cVar.b(copyOnWriteArrayListB);
                    com.mbridge.msdk.foundation.same.report.metrics.d.b().c().put(currentLocalRid, cVar);
                }
                com.mbridge.msdk.reward.report.metrics.a.a().a("2000128", cVar);
            } catch (Exception e10) {
                e = e10;
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardVideoController", e.getMessage());
                }
            }
            return cVar;
        } catch (Exception e11) {
            e = e11;
            cVar = null;
        }
    }

    public void a(List<CampaignEx> list) {
        if (list != null && list.size() > 0) {
            this.H = list;
        } else {
            this.H = new ArrayList();
        }
    }

    private String a(String str) {
        try {
            String md5 = TextUtils.isEmpty(str) ? SameMD5.getMD5(v0.d()) : "";
            String[] strArrSplit = str.split("_");
            if (strArrSplit != null && strArrSplit.length >= 3) {
                md5 = strArrSplit[2];
            }
            return TextUtils.isEmpty(md5) ? SameMD5.getMD5(v0.d()) : md5;
        } catch (Exception e10) {
            if (!MBridgeConstans.DEBUG) {
                return "";
            }
            e10.printStackTrace();
            return "";
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001f  */
    public com.mbridge.msdk.foundation.same.report.metrics.c a(Message message) {
        com.mbridge.msdk.foundation.same.report.metrics.c cVarB;
        if (message != null) {
            try {
                Bundle data = message.getData();
                if (data != null) {
                    cVarB = com.mbridge.msdk.foundation.same.report.metrics.d.b().b(data.getString("metrics_data_lrid"));
                } else {
                    cVarB = null;
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                }
            }
        } else {
            cVarB = null;
        }
        return cVarB == null ? new com.mbridge.msdk.foundation.same.report.metrics.c() : cVarB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar, InterVideoOutListener interVideoOutListener) {
        if (this.f36674x) {
            if (cVar == null) {
                cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
                cVar.b(this.H);
            }
            try {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                if (interVideoOutListener != null) {
                    eVar.a("listener_state", 1);
                } else {
                    eVar.a("listener_state", 2);
                }
                cVar.a(str, eVar);
                com.mbridge.msdk.reward.report.metrics.a.a().a(str, cVar);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar, InterVideoOutListener interVideoOutListener, String str2) {
        if (cVar == null) {
            try {
                cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
                cVar.b(this.H);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                    return;
                }
                return;
            }
        }
        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
        if (!TextUtils.isEmpty(str2)) {
            eVar.a("reason", str2);
        }
        if (interVideoOutListener != null) {
            eVar.a("listener_state", 1);
        } else {
            eVar.a("listener_state", 2);
        }
        cVar.a(str, eVar);
        com.mbridge.msdk.reward.report.metrics.a.a().a(str, cVar);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0035  */
    /* JADX WARN: Code duplicated, block: B:14:0x003c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:15:0x003d A[Catch: Exception -> 0x009f, TryCatch #0 {Exception -> 0x009f, blocks: (B:4:0x0009, B:6:0x000f, B:8:0x0016, B:10:0x002c, B:12:0x0036, B:15:0x003d, B:19:0x0072, B:21:0x0085, B:23:0x0093), top: B:30:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:17:0x006d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0070  */
    public com.mbridge.msdk.foundation.same.report.metrics.c a(List<CampaignEx> list, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        String nLRid;
        String str;
        int i10;
        com.mbridge.msdk.foundation.same.report.metrics.c cVar2 = new com.mbridge.msdk.foundation.same.report.metrics.c();
        String localRequestId = "";
        if (list != null) {
            try {
                if (list.size() > 0) {
                    if (list.get(0) != null) {
                        localRequestId = list.get(0).getLocalRequestId();
                        nLRid = list.get(0).getNLRid();
                    } else {
                        nLRid = "";
                    }
                    cVar2.i(localRequestId);
                    cVar2.b(list);
                    str = localRequestId;
                    localRequestId = nLRid;
                } else {
                    str = "";
                }
                if (TextUtils.isEmpty(localRequestId)) {
                    return cVar;
                }
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("cache", 1);
                eVar.a(CampaignEx.JSON_KEY_HB, 1);
                eVar.a("auto_load", 2);
                cVar2.a("2000127", eVar);
                cVar2.a("2000048", eVar);
                if (this.f36670t) {
                    i10 = MBSupportMuteAdType.INTERSTITIAL_VIDEO;
                } else {
                    i10 = 94;
                }
                cVar2.a(i10);
                cVar2.h("1");
                cVar2.f("2");
                if (!TextUtils.isEmpty(str) && !com.mbridge.msdk.foundation.same.report.metrics.d.b().c().containsKey(str)) {
                    com.mbridge.msdk.foundation.same.report.metrics.d.b().c().put(str, cVar2);
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                }
            }
        } else {
            str = "";
            if (TextUtils.isEmpty(localRequestId)) {
                return cVar;
            }
            com.mbridge.msdk.foundation.same.report.metrics.e eVar2 = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar2.a("cache", 1);
            eVar2.a(CampaignEx.JSON_KEY_HB, 1);
            eVar2.a("auto_load", 2);
            cVar2.a("2000127", eVar2);
            cVar2.a("2000048", eVar2);
            if (this.f36670t) {
                i10 = MBSupportMuteAdType.INTERSTITIAL_VIDEO;
            } else {
                i10 = 94;
            }
            cVar2.a(i10);
            cVar2.h("1");
            cVar2.f("2");
            if (!TextUtils.isEmpty(str)) {
                com.mbridge.msdk.foundation.same.report.metrics.d.b().c().put(str, cVar2);
            }
        }
        return cVar2;
    }

    private void a(boolean z10, com.mbridge.msdk.foundation.same.report.metrics.c cVar, List<CampaignEx> list) {
        if (cVar == null) {
            cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
        }
        if (list != null && list.size() > 0) {
            CampaignEx campaignEx = list.get(0);
            if (campaignEx != null) {
                cVar.i(campaignEx.getLocalRequestId());
                cVar.g(campaignEx.getBidToken());
            }
            cVar.b(list);
        }
        a(z10, cVar, (com.mbridge.msdk.foundation.same.report.metrics.e) null);
    }

    private void a(boolean z10, com.mbridge.msdk.foundation.same.report.metrics.c cVar, com.mbridge.msdk.foundation.same.report.metrics.e eVar) {
        if (eVar == null) {
            eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
        }
        cVar.n(this.f36658h);
        cVar.a(this.f36670t ? MBSupportMuteAdType.INTERSTITIAL_VIDEO : 94);
        eVar.a("result", Integer.valueOf(z10 ? 1 : 2));
        eVar.a(CampaignEx.JSON_KEY_HB, Integer.valueOf(this.f36671u ? 1 : 0));
        cVar.a("m_offer_ready", eVar);
        com.mbridge.msdk.reward.report.metrics.a.a().a("m_offer_ready", cVar);
    }
}
