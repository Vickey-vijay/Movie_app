package com.mbridge.msdk.reward.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.db.j;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.download.download.ResDownloadCheckManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.a1;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.reward.player.MBRewardVideoActivity;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.internal.partials.MintegralFilesBridge;
import com.safedk.android.utils.Logger;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* JADX INFO: compiled from: RewardMVVideoAdapter.java */
/* JADX INFO: loaded from: classes4.dex */
public class c {
    private String C;
    private h D;
    public String K;
    private List<CampaignEx> V;
    private CopyOnWriteArrayList<CampaignEx> W;
    private List<CampaignEx> X;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f36549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f36550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f36551c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f36552d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f36553e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f36554f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f36555g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f36556h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.mbridge.msdk.video.bt.module.orglistener.h f36557i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private volatile com.mbridge.msdk.reward.adapter.a f36558j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private volatile com.mbridge.msdk.reward.controller.a.j f36559k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.setting.c f36560l;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f36566r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f36567s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private String f36569u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f36570v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f36571w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f36572x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private CampaignUnit f36573y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private CopyOnWriteArrayList<CampaignEx> f36574z;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f36561m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f36562n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f36563o = new Object();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private CopyOnWriteArrayList<CampaignEx> f36564p = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f36565q = 2;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f36568t = "";
    private boolean A = false;
    private long B = 0;
    private boolean E = false;
    private boolean F = false;
    public String G = "";
    public String H = "";
    public String I = "";
    public int J = 0;
    private Handler L = new a(Looper.getMainLooper());
    private boolean M = false;
    private long N = 0;
    public volatile boolean O = false;
    public volatile boolean P = false;
    public volatile boolean Q = false;
    public volatile boolean R = false;
    public volatile boolean S = false;
    public volatile boolean T = false;
    private String U = "";

    /* JADX INFO: compiled from: RewardMVVideoAdapter.java */
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        /* JADX WARN: Code duplicated, block: B:85:0x022a  */
        /* JADX WARN: Code duplicated, block: B:86:0x022c  */
        /* JADX WARN: Code duplicated, block: B:90:0x025c  */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            CampaignEx campaignEx;
            com.mbridge.msdk.foundation.error.b bVarA;
            boolean z10;
            com.mbridge.msdk.foundation.same.report.metrics.c cVarA = c.this.a(message);
            try {
                try {
                    int i10 = message.what;
                    if (i10 == 8) {
                        if (c.this.f36558j == null || (campaignEx = (CampaignEx) message.obj) == null || TextUtils.isEmpty(c.this.f36550b)) {
                            return;
                        }
                        com.mbridge.msdk.reward.report.a.a(c.this.f36549a, campaignEx, c.this.f36550b);
                        c.this.l();
                        return;
                    }
                    if (i10 == 18) {
                        if (c.this.f36559k != null) {
                            c.this.f36559k.a(c.this.C, cVarA);
                            return;
                        }
                        return;
                    }
                    switch (i10) {
                        case 1:
                        case 2:
                            c.this.a((String) message.obj, cVarA);
                            break;
                        case 3:
                            if (c.this.f36558j != null) {
                                c.this.f36558j.a("campaign is ok", cVarA);
                            }
                            Message message2 = new Message();
                            message2.what = 5;
                            if (cVarA != null) {
                                Bundle bundle = new Bundle();
                                bundle.putString("metrics_data_lrid", cVarA.t());
                                message2.setData(bundle);
                            }
                            sendMessageDelayed(message2, com.mbridge.msdk.foundation.same.a.L);
                            break;
                        case 4:
                            if (c.this.f36558j != null) {
                                c cVar = c.this;
                                cVar.a(cVar.f36550b, (List<CampaignEx>) c.this.V, c.this.f36567s, "");
                                try {
                                    com.mbridge.msdk.foundation.error.b bVarA2 = com.mbridge.msdk.foundation.error.a.a(880002, "unknow error in load failed");
                                    Object obj = message.obj;
                                    if (obj == null) {
                                        if (c.this.L != null) {
                                            c.this.L.removeMessages(5);
                                        }
                                        removeMessages(6);
                                        q0.a("RewardMVVideoAdapter", "=====================onVideoLoadFail=====================00000");
                                        if (!c.this.S) {
                                            c.this.S = false;
                                            bVarA = com.mbridge.msdk.foundation.error.a.a(880002, "errorCode: 3506 errorMessage: data load failed");
                                            bVarA2 = bVarA;
                                        }
                                    } else {
                                        String str = (String) obj;
                                        int i11 = message.arg1;
                                        if (TextUtils.isEmpty(str)) {
                                            if (c.this.L != null) {
                                                c.this.L.removeMessages(5);
                                            }
                                            removeMessages(6);
                                            q0.a("RewardMVVideoAdapter", "=====================onVideoLoadFail=====================11111");
                                            if (!c.this.S) {
                                                c.this.S = false;
                                                bVarA = com.mbridge.msdk.foundation.error.a.a(880002, "errorCode: 3507 errorMessage: data load failed, errorMsg null");
                                            }
                                        } else {
                                            if (c.this.L != null) {
                                                c.this.L.removeMessages(5);
                                            }
                                            removeMessages(6);
                                            if (i11 == 880021) {
                                                bVarA = com.mbridge.msdk.foundation.error.a.a(880021, "errorCode: 3507 errorMessage: data load failed, errorMsg is APP ALREADY INSTALLED");
                                            } else if (i11 == 880003 || i11 == 6 || i11 == 7) {
                                                bVarA = com.mbridge.msdk.foundation.error.a.a(880003, "errorCode: 3507 errorMessage: data load failed, errorMsg is " + str);
                                            } else {
                                                bVarA = com.mbridge.msdk.foundation.error.a.a(880002, "errorCode: 3507 errorMessage: data load failed, errorMsg is " + str);
                                            }
                                        }
                                        bVarA2 = bVarA;
                                    }
                                    c.this.S = false;
                                    if (cVarA != null) {
                                        cVarA.b(c.this.V);
                                        if (cVarA.u() == null) {
                                            cVarA.a(bVarA2);
                                        } else {
                                            bVarA2 = cVarA.u();
                                        }
                                    }
                                    c.this.f36558j.a(c.this.V, bVarA2, cVarA);
                                } catch (Exception e10) {
                                    if (c.this.L != null) {
                                        c.this.L.removeMessages(5);
                                    }
                                    removeMessages(6);
                                    c cVar2 = c.this;
                                    cVar2.a(cVar2.f36550b, (List<CampaignEx>) c.this.V, c.this.f36567s, "");
                                    com.mbridge.msdk.foundation.error.b bVarA3 = com.mbridge.msdk.foundation.error.a.a(880002, "errorCode: 3508 errorMessage: data load failed, exception is: " + e10.getMessage());
                                    if (cVarA != null) {
                                        cVarA.b(c.this.V);
                                        cVarA.a(bVarA3);
                                    }
                                    c.this.f36558j.a(c.this.V, bVarA3, cVarA);
                                    return;
                                }
                            }
                            break;
                        case 5:
                            if (c.this.f36558j != null) {
                                if (c.this.V != null && c.this.V.size() > 0) {
                                    CampaignEx campaignEx2 = (CampaignEx) c.this.V.get(0);
                                    boolean z11 = !TextUtils.isEmpty(campaignEx2.getCMPTEntryUrl());
                                    int nscpt = campaignEx2.getNscpt();
                                    c cVar3 = c.this;
                                    if (cVar3.a((List<CampaignEx>) cVar3.f36574z, z11, nscpt, true, false)) {
                                        c cVar4 = c.this;
                                        cVar4.a(cVar4.f36550b, (List<CampaignEx>) c.this.V, (List<CampaignEx>) c.this.X, c.this.f36567s);
                                        sendEmptyMessage(6);
                                        removeMessages(5);
                                        if (!c.this.R) {
                                            c.this.R = true;
                                            c.this.f36558j.a(c.this.f36574z, cVarA);
                                        }
                                    }
                                }
                                c cVar5 = c.this;
                                cVar5.a(cVar5.f36550b, (List<CampaignEx>) c.this.V, c.this.f36567s, "");
                                if (c.this.L != null) {
                                    c.this.L.removeMessages(5);
                                    c.this.L.removeMessages(6);
                                }
                                CampaignEx campaignEx3 = null;
                                if (c.this.V != null && c.this.V.size() > 0) {
                                    campaignEx3 = (CampaignEx) c.this.V.get(0);
                                }
                                if (campaignEx3 == null && c.this.W != null && c.this.W.size() > 0) {
                                    campaignEx3 = (CampaignEx) c.this.W.get(0);
                                }
                                if (!c.this.S || (c.this.T && campaignEx3 != null && !TextUtils.isEmpty(campaignEx3.getNLRid()))) {
                                    com.mbridge.msdk.foundation.error.b bVarA4 = com.mbridge.msdk.foundation.error.a.a(880010, "errorCode: 3401 errorMessage: resource load timeout");
                                    c.this.S = false;
                                    if (cVarA != null) {
                                        cVarA.a(bVarA4);
                                    }
                                    c.this.f36558j.a(c.this.V, bVarA4, cVarA);
                                    if (c.this.f36574z != null && c.this.f36574z.size() > 0) {
                                        boolean z12 = false;
                                        for (CampaignEx campaignEx4 : c.this.f36574z) {
                                            if (campaignEx4 != null) {
                                                try {
                                                    if (!TextUtils.isEmpty(campaignEx4.getVideoUrlEncode()) && !ResDownloadCheckManager.getInstance().containsVideoKey(campaignEx4.getVideoUrlEncode())) {
                                                        z10 = true;
                                                    }
                                                    if (campaignEx4 != null && !TextUtils.isEmpty(campaignEx4.getendcard_url()) && !ResDownloadCheckManager.getInstance().containsZipKey(campaignEx4.getendcard_url())) {
                                                        z10 = true;
                                                    }
                                                    if (campaignEx4 != null && !TextUtils.isEmpty(campaignEx4.getCMPTEntryUrl())) {
                                                        if (!ResDownloadCheckManager.getInstance().containsZipKey(campaignEx4.getCMPTEntryUrl())) {
                                                            z10 = true;
                                                        } else if (!z12 && !z10) {
                                                            if (com.mbridge.msdk.videocommon.a.b(c.this.f36550b + "_" + campaignEx4.getRequestId() + "_" + campaignEx4.getCMPTEntryUrl()) == null) {
                                                                z12 = true;
                                                            }
                                                        }
                                                    }
                                                    if (campaignEx4 != null && campaignEx4.getRewardTemplateMode() != null && !TextUtils.isEmpty(campaignEx4.getRewardTemplateMode().j()) && !campaignEx4.getRewardTemplateMode().j().contains(CampaignEx.KEY_IS_CMPT_ENTRY) && ResDownloadCheckManager.getInstance().containsZipKey(campaignEx4.getRewardTemplateMode().j()) && TextUtils.isEmpty(campaignEx4.getCMPTEntryUrl()) && !z10) {
                                                        com.mbridge.msdk.videocommon.a.a(campaignEx4.getAdType(), campaignEx4);
                                                    }
                                                } catch (Exception e11) {
                                                    if (MBridgeConstans.DEBUG) {
                                                        q0.b("RewardMVVideoAdapter", e11.getMessage());
                                                    }
                                                }
                                            }
                                            z10 = false;
                                            if (campaignEx4 != null) {
                                                z10 = true;
                                            }
                                            if (campaignEx4 != null) {
                                                if (!ResDownloadCheckManager.getInstance().containsZipKey(campaignEx4.getCMPTEntryUrl())) {
                                                    z10 = true;
                                                } else if (!z12) {
                                                    if (com.mbridge.msdk.videocommon.a.b(c.this.f36550b + "_" + campaignEx4.getRequestId() + "_" + campaignEx4.getCMPTEntryUrl()) == null) {
                                                        z12 = true;
                                                    }
                                                }
                                            }
                                            if (campaignEx4 != null) {
                                                com.mbridge.msdk.videocommon.a.a(campaignEx4.getAdType(), campaignEx4);
                                            }
                                        }
                                        break;
                                    }
                                }
                            }
                            break;
                        case 6:
                            c cVar6 = c.this;
                            cVar6.a(cVar6.f36550b, (List<CampaignEx>) c.this.V, (List<CampaignEx>) c.this.X, c.this.f36567s);
                            if (c.this.f36558j != null) {
                                removeMessages(6);
                                if (c.this.L != null) {
                                    c.this.L.removeMessages(5);
                                }
                                if (c.this.f36558j != null && !c.this.R) {
                                    c.this.R = true;
                                    c.this.f36558j.a(c.this.f36574z, cVarA);
                                    break;
                                }
                            }
                            break;
                    }
                } catch (Exception e12) {
                    e12.printStackTrace();
                }
            } catch (Throwable th2) {
                q0.a("RewardMVVideoAdapter", th2.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: RewardMVVideoAdapter.java */
    public class b extends com.mbridge.msdk.reward.request.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ com.mbridge.msdk.foundation.same.report.metrics.c f36576e;

        @Override // com.mbridge.msdk.reward.request.a
        public void b(int i10, String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            CampaignEx campaignEx;
            if (i10 == -1) {
                c.this.B = System.currentTimeMillis();
            }
            if (c.this.f36574z != null && c.this.f36574z.size() > 0 && (campaignEx = (CampaignEx) c.this.f36574z.get(0)) != null && TextUtils.isEmpty(campaignEx.getNLRid())) {
                c.this.f36574z.clear();
            }
            if (c.this.V != null) {
                c.this.V.clear();
            }
            c.this.O = false;
            c.this.P = false;
            synchronized (c.this.f36563o) {
                if (c.this.Q) {
                    c.this.Q = false;
                }
            }
            c.this.a(cVar, i10);
            c.this.S = false;
            c.this.R = false;
            if (!c.this.M) {
                c.this.a(i10, str, cVar);
            }
            c.this.n();
        }

        public b(com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            this.f36576e = cVar;
        }

        @Override // com.mbridge.msdk.reward.request.a
        public void a(CampaignUnit campaignUnit) throws Throwable {
            CampaignEx campaignEx;
            try {
                c.this.c(campaignUnit);
                c.this.a(campaignUnit);
                if (campaignUnit != null) {
                    c.this.G = campaignUnit.getRequestId();
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                }
                if (c.this.f36574z != null && c.this.f36574z.size() > 0 && (campaignEx = (CampaignEx) c.this.f36574z.get(0)) != null && TextUtils.isEmpty(campaignEx.getNLRid())) {
                    c.this.f36574z.clear();
                }
                if (c.this.V != null) {
                    c.this.V.clear();
                }
                c.this.O = false;
                c.this.P = false;
                synchronized (c.this.f36563o) {
                    if (c.this.Q) {
                        c.this.Q = false;
                    }
                    c.this.S = false;
                    c.this.R = false;
                    c.this.b("exception after load success", this.f36576e);
                    c.this.n();
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.reward.adapter.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: RewardMVVideoAdapter.java */
    public class C0363c implements com.mbridge.msdk.reward.adapter.b.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public com.mbridge.msdk.foundation.same.report.metrics.c f36578a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CampaignEx f36579b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f36580c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ CopyOnWriteArrayList f36581d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f36582e;

        /* JADX INFO: renamed from: com.mbridge.msdk.reward.adapter.c$c$a */
        /* JADX INFO: compiled from: RewardMVVideoAdapter.java */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ CampaignEx f36584a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f36585b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f36586c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ String f36587d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ CopyOnWriteArrayList f36588e;

            /* JADX INFO: renamed from: com.mbridge.msdk.reward.adapter.c$c$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: RewardMVVideoAdapter.java */
            public class C0364a implements com.mbridge.msdk.reward.adapter.b.o {
                @Override // com.mbridge.msdk.reward.adapter.b.o
                public void a(String str, String str2, String str3, String str4, String str5, com.mbridge.msdk.videocommon.a.C0412a c0412a) {
                    C0363c c0363c = C0363c.this;
                    if (c.this.a(c0363c.f36581d, c0363c.f36580c, c0363c.f36582e)) {
                        c cVar = c.this;
                        String str6 = cVar.f36550b;
                        a aVar = a.this;
                        cVar.a(str6, aVar.f36588e, (List<CampaignEx>) c.this.X, c.this.f36567s);
                        if (c.this.L != null) {
                            c.this.L.removeMessages(5);
                        }
                        if (c.this.f36558j == null || c.this.R) {
                            return;
                        }
                        c.this.R = true;
                        C0363c c0363c2 = C0363c.this;
                        com.mbridge.msdk.foundation.same.report.metrics.c cVar2 = c0363c2.f36578a;
                        if (cVar2 != null) {
                            cVar2.b(c0363c2.f36581d);
                        }
                        com.mbridge.msdk.reward.adapter.a aVar2 = c.this.f36558j;
                        C0363c c0363c3 = C0363c.this;
                        aVar2.a(c0363c3.f36581d, c0363c3.f36578a);
                        return;
                    }
                    c cVar3 = c.this;
                    cVar3.a(str3, (List<CampaignEx>) cVar3.V, c.this.f36567s, str4);
                    if (c.this.L != null) {
                        c.this.L.removeMessages(5);
                    }
                    if (c.this.f36558j == null || c.this.S) {
                        return;
                    }
                    c.this.S = false;
                    com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880015, "errorCode: 3502 errorMessage: temp preload success but isReady false");
                    C0363c c0363c4 = C0363c.this;
                    if (c0363c4.f36578a == null) {
                        c0363c4.f36578a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                    }
                    C0363c c0363c5 = C0363c.this;
                    c0363c5.f36578a.b(c0363c5.f36581d);
                    C0363c.this.f36578a.a(bVarA);
                    com.mbridge.msdk.reward.adapter.a aVar3 = c.this.f36558j;
                    C0363c c0363c6 = C0363c.this;
                    aVar3.a(c0363c6.f36581d, bVarA, c0363c6.f36578a);
                    q0.a("RewardMVVideoAdapter", "Campaign 下载成功： 非大模板，播放模板预加载成功,isReay false onVideoLoadFail");
                }

                public C0364a() {
                }

                @Override // com.mbridge.msdk.reward.adapter.b.o
                public void a(String str, String str2, String str3, com.mbridge.msdk.videocommon.a.C0412a c0412a, com.mbridge.msdk.foundation.error.b bVar) {
                    if (bVar != null) {
                        bVar.a("his_reason", "preload template failed is tpl :" + C0363c.this.f36580c);
                    }
                    if (C0363c.this.f36579b.getRsIgnoreCheckRule() != null && C0363c.this.f36579b.getRsIgnoreCheckRule().size() > 0 && C0363c.this.f36579b.getRsIgnoreCheckRule().contains(1)) {
                        q0.c("RewardMVVideoAdapter", "template download fail but hit ignoreCheckRule");
                        return;
                    }
                    a aVar = a.this;
                    c cVar = c.this;
                    cVar.a(aVar.f36586c, (List<CampaignEx>) cVar.V, c.this.f36567s, str2);
                    if (c.this.L != null) {
                        c.this.L.removeMessages(5);
                    }
                    if (c.this.f36558j == null || c.this.S) {
                        return;
                    }
                    c.this.S = false;
                    C0363c c0363c = C0363c.this;
                    if (c0363c.f36578a == null) {
                        c0363c.f36578a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                    }
                    C0363c c0363c2 = C0363c.this;
                    c0363c2.f36578a.b(c0363c2.f36581d);
                    C0363c.this.f36578a.a(bVar);
                    c.this.f36558j.a(c.this.V, bVar, C0363c.this.f36578a);
                    q0.a("RewardMVVideoAdapter", "Campaign 下载失败： 非大模板，播放模板预加载失败 onVideoLoadFail");
                }
            }

            public a(CampaignEx campaignEx, String str, String str2, String str3, CopyOnWriteArrayList copyOnWriteArrayList) {
                this.f36584a = campaignEx;
                this.f36585b = str;
                this.f36586c = str2;
                this.f36587d = str3;
                this.f36588e = copyOnWriteArrayList;
            }

            @Override // java.lang.Runnable
            public void run() {
                com.mbridge.msdk.reward.adapter.b bVarB = com.mbridge.msdk.reward.adapter.b.b();
                boolean z10 = c.this.A;
                Handler handler = c.this.L;
                boolean z11 = c.this.f36566r;
                boolean z12 = c.this.f36567s;
                String strJ = this.f36584a.getRewardTemplateMode().j();
                int i10 = c.this.f36565q;
                C0363c c0363c = C0363c.this;
                bVarB.a(z10, handler, z11, z12, null, strJ, i10, c0363c.f36579b, c0363c.f36581d, H5DownLoadManager.getInstance().getH5ResAddress(this.f36584a.getRewardTemplateMode().j()), this.f36585b, this.f36586c, this.f36587d, this.f36584a.getRequestIdNotice(), c.this.f36560l, new C0364a());
            }
        }

        /* JADX INFO: renamed from: com.mbridge.msdk.reward.adapter.c$c$b */
        /* JADX INFO: compiled from: RewardMVVideoAdapter.java */
        public class b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f36591a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f36592b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ CopyOnWriteArrayList f36593c;

            /* JADX INFO: renamed from: com.mbridge.msdk.reward.adapter.c$c$b$a */
            /* JADX INFO: compiled from: RewardMVVideoAdapter.java */
            public class a implements com.mbridge.msdk.reward.adapter.b.o {
                @Override // com.mbridge.msdk.reward.adapter.b.o
                public void a(String str, String str2, String str3, String str4, String str5, com.mbridge.msdk.videocommon.a.C0412a c0412a) {
                    C0363c c0363c = C0363c.this;
                    if (c.this.a(c0363c.f36581d, c0363c.f36580c, c0363c.f36582e)) {
                        c cVar = c.this;
                        String str6 = cVar.f36550b;
                        b bVar = b.this;
                        cVar.a(str6, bVar.f36593c, (List<CampaignEx>) c.this.X, c.this.f36567s);
                        if (c.this.L != null) {
                            c.this.L.removeMessages(5);
                        }
                        if (c.this.f36558j == null || c.this.R) {
                            return;
                        }
                        c.this.R = true;
                        C0363c c0363c2 = C0363c.this;
                        com.mbridge.msdk.foundation.same.report.metrics.c cVar2 = c0363c2.f36578a;
                        if (cVar2 != null) {
                            cVar2.b(c0363c2.f36581d);
                        }
                        com.mbridge.msdk.reward.adapter.a aVar = c.this.f36558j;
                        C0363c c0363c3 = C0363c.this;
                        aVar.a(c0363c3.f36581d, c0363c3.f36578a);
                        return;
                    }
                    c cVar3 = c.this;
                    cVar3.a(str3, (List<CampaignEx>) cVar3.V, c.this.f36567s, str4);
                    if (c.this.L != null) {
                        c.this.L.removeMessages(5);
                    }
                    if (c.this.f36558j == null || c.this.S) {
                        return;
                    }
                    c.this.S = false;
                    com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880015, "errorCode: 3505 errorMessage: tpl temp preload success but isReady false");
                    C0363c c0363c4 = C0363c.this;
                    if (c0363c4.f36578a == null) {
                        c0363c4.f36578a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                    }
                    C0363c c0363c5 = C0363c.this;
                    c0363c5.f36578a.b(c0363c5.f36581d);
                    C0363c.this.f36578a.a(bVarA);
                    c.this.f36558j.a(c.this.V, bVarA, C0363c.this.f36578a);
                    q0.a("RewardMVVideoAdapter", "Campaign 下载成功： 大模板预加载成功,isReady false onVideoLoadFail");
                }

                public a() {
                }

                @Override // com.mbridge.msdk.reward.adapter.b.o
                public void a(String str, String str2, String str3, com.mbridge.msdk.videocommon.a.C0412a c0412a, com.mbridge.msdk.foundation.error.b bVar) {
                    if (bVar != null) {
                        bVar.a("his_reason", "errorCode: 3303 errorMessage: tpl temp preload failed");
                    }
                    if (C0363c.this.f36579b.getRsIgnoreCheckRule() != null && C0363c.this.f36579b.getRsIgnoreCheckRule().size() > 0 && C0363c.this.f36579b.getRsIgnoreCheckRule().contains(3)) {
                        q0.c("RewardMVVideoAdapter", "template download fail but hit ignoreCheckRule");
                        return;
                    }
                    b bVar2 = b.this;
                    c cVar = c.this;
                    cVar.a(bVar2.f36592b, (List<CampaignEx>) cVar.V, c.this.f36567s, str2);
                    if (c.this.L != null) {
                        c.this.L.removeMessages(5);
                    }
                    if (c.this.f36558j == null || c.this.S) {
                        return;
                    }
                    c.this.S = false;
                    C0363c c0363c = C0363c.this;
                    if (c0363c.f36578a == null) {
                        c0363c.f36578a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                    }
                    C0363c c0363c2 = C0363c.this;
                    c0363c2.f36578a.b(c0363c2.f36581d);
                    C0363c.this.f36578a.a(bVar);
                    c.this.f36558j.a(c.this.V, bVar, C0363c.this.f36578a);
                    q0.a("RewardMVVideoAdapter", "Campaign 下载成功： 大模板预加载失败 onVideoLoadFail");
                }
            }

            public b(String str, String str2, CopyOnWriteArrayList copyOnWriteArrayList) {
                this.f36591a = str;
                this.f36592b = str2;
                this.f36593c = copyOnWriteArrayList;
            }

            @Override // java.lang.Runnable
            public void run() {
                com.mbridge.msdk.reward.adapter.b bVarB = com.mbridge.msdk.reward.adapter.b.b();
                boolean z10 = c.this.A;
                Handler handler = c.this.L;
                boolean z11 = c.this.f36566r;
                boolean z12 = c.this.f36567s;
                String str = this.f36591a;
                String requestIdNotice = C0363c.this.f36579b.getRequestIdNotice();
                String str2 = c.this.f36551c;
                String str3 = this.f36592b;
                String cMPTEntryUrl = C0363c.this.f36579b.getCMPTEntryUrl();
                int i10 = c.this.f36565q;
                C0363c c0363c = C0363c.this;
                bVarB.a(z10, handler, z11, z12, str, requestIdNotice, str2, str3, cMPTEntryUrl, i10, c0363c.f36579b, c0363c.f36581d, H5DownLoadManager.getInstance().getH5ResAddress(C0363c.this.f36579b.getCMPTEntryUrl()), this.f36592b, c.this.f36560l, new a(), false);
            }
        }

        /* JADX INFO: renamed from: com.mbridge.msdk.reward.adapter.c$c$c, reason: collision with other inner class name */
        /* JADX INFO: compiled from: RewardMVVideoAdapter.java */
        public class RunnableC0365c implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ CopyOnWriteArrayList f36596a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.mbridge.msdk.foundation.error.b f36597b;

            public RunnableC0365c(CopyOnWriteArrayList copyOnWriteArrayList, com.mbridge.msdk.foundation.error.b bVar) {
                this.f36596a = copyOnWriteArrayList;
                this.f36597b = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                c cVar = c.this;
                cVar.a(cVar.f36550b, this.f36596a, c.this.f36567s, "");
                if (c.this.L != null) {
                    c.this.L.removeMessages(5);
                }
                if (c.this.S || c.this.f36558j == null) {
                    return;
                }
                c.this.S = false;
                C0363c c0363c = C0363c.this;
                if (c0363c.f36578a == null) {
                    c0363c.f36578a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                }
                C0363c c0363c2 = C0363c.this;
                c0363c2.f36578a.b(c0363c2.f36581d);
                com.mbridge.msdk.foundation.error.b bVar = this.f36597b;
                if (bVar != null) {
                    bVar.c("errorCode: 3201 errorMessage: campaign resource download failed");
                }
                C0363c.this.f36578a.a(this.f36597b);
                c.this.f36558j.a(this.f36596a, this.f36597b, C0363c.this.f36578a);
                q0.a("RewardMVVideoAdapter", "Campaign 下载失败：onVideoLoadFail");
            }
        }

        @Override // com.mbridge.msdk.reward.adapter.b.h
        public void a(String str, String str2, String str3, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
            c.this.O = true;
            if (this.f36580c) {
                if (!c.this.P || c.this.Q || c.this.L == null) {
                    return;
                }
                synchronized (c.this.f36563o) {
                    if (c.this.Q) {
                        return;
                    }
                    c.this.Q = true;
                    c.this.L.post(new b(str3, str2, copyOnWriteArrayList));
                    return;
                }
            }
            for (CampaignEx campaignEx : copyOnWriteArrayList) {
                if (campaignEx != null && campaignEx.getRewardTemplateMode() != null && !TextUtils.isEmpty(campaignEx.getRewardTemplateMode().j()) && !campaignEx.getRewardTemplateMode().j().contains(CampaignEx.KEY_IS_CMPT_ENTRY) && c.this.L != null) {
                    c.this.L.post(new a(campaignEx, str, str2, str3, copyOnWriteArrayList));
                } else if (c.this.a(this.f36581d, this.f36580c, this.f36582e)) {
                    c cVar = c.this;
                    cVar.a(cVar.f36550b, copyOnWriteArrayList, (List<CampaignEx>) c.this.X, c.this.f36567s);
                    if (c.this.L != null) {
                        c.this.L.removeMessages(5);
                    }
                    if (c.this.f36558j != null && !c.this.R) {
                        c.this.R = true;
                        com.mbridge.msdk.foundation.same.report.metrics.c cVar2 = this.f36578a;
                        if (cVar2 != null) {
                            cVar2.b(this.f36581d);
                        }
                        c.this.f36558j.a(this.f36581d, this.f36578a);
                    }
                } else {
                    c cVar3 = c.this;
                    cVar3.a(str2, (List<CampaignEx>) cVar3.V, c.this.f36567s, str3);
                    if (c.this.L != null) {
                        c.this.L.removeMessages(5);
                    }
                    if (c.this.f36558j != null && !c.this.S) {
                        c.this.S = false;
                        com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880015, "errorCode: 3503 errorMessage: have no temp but isReady false");
                        if (this.f36578a == null) {
                            this.f36578a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                        }
                        this.f36578a.b(this.f36581d);
                        this.f36578a.a(bVarA);
                        c.this.f36558j.a(this.f36581d, bVarA, this.f36578a);
                        q0.a("RewardMVVideoAdapter", "Campaign 下载成功： 非大模板，不存在播放模板,isReay false onVideoLoadFail");
                    }
                }
            }
        }

        public C0363c(CampaignEx campaignEx, boolean z10, CopyOnWriteArrayList copyOnWriteArrayList, int i10) {
            this.f36579b = campaignEx;
            this.f36580c = z10;
            this.f36581d = copyOnWriteArrayList;
            this.f36582e = i10;
            this.f36578a = com.mbridge.msdk.foundation.same.report.metrics.d.b().c().get(campaignEx.getLocalRequestId());
        }

        @Override // com.mbridge.msdk.reward.adapter.b.h
        public void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, com.mbridge.msdk.foundation.error.b bVar) {
            c.this.O = false;
            if (c.this.f36558j == null || c.this.L == null) {
                return;
            }
            c.this.L.post(new RunnableC0365c(copyOnWriteArrayList, bVar));
        }
    }

    /* JADX INFO: compiled from: RewardMVVideoAdapter.java */
    public class d implements com.mbridge.msdk.reward.adapter.b.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public com.mbridge.msdk.foundation.same.report.metrics.c f36599a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CampaignEx f36600b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f36601c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ CopyOnWriteArrayList f36602d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f36603e;

        /* JADX INFO: compiled from: RewardMVVideoAdapter.java */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f36605a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.mbridge.msdk.foundation.error.b f36606b;

            public a(String str, com.mbridge.msdk.foundation.error.b bVar) {
                this.f36605a = str;
                this.f36606b = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                c cVar = c.this;
                cVar.a(cVar.f36550b, (List<CampaignEx>) c.this.V, c.this.f36567s, this.f36605a);
                if (c.this.L != null) {
                    c.this.L.removeMessages(5);
                }
                if (c.this.S || c.this.f36558j == null) {
                    return;
                }
                c.this.S = false;
                com.mbridge.msdk.foundation.error.b bVar = this.f36606b;
                if (bVar != null) {
                    bVar.c("errorCode: 3202 errorMessage: temp resource download failed");
                }
                d dVar = d.this;
                if (dVar.f36599a == null) {
                    dVar.f36599a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                }
                d dVar2 = d.this;
                dVar2.f36599a.b(dVar2.f36602d);
                d.this.f36599a.a(this.f36606b);
                c.this.f36558j.a(c.this.V, this.f36606b, d.this.f36599a);
                q0.a("RewardMVVideoAdapter", "播放模板下载失败，非大模板 onVideoLoadFail");
            }
        }

        /* JADX INFO: compiled from: RewardMVVideoAdapter.java */
        public class b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f36608a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.mbridge.msdk.foundation.error.b f36609b;

            public b(String str, com.mbridge.msdk.foundation.error.b bVar) {
                this.f36608a = str;
                this.f36609b = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                c cVar = c.this;
                cVar.a(cVar.f36550b, (List<CampaignEx>) c.this.V, c.this.f36567s, this.f36608a);
                if (c.this.L != null) {
                    c.this.L.removeMessages(5);
                }
                if (c.this.S || c.this.f36558j == null) {
                    return;
                }
                c.this.S = false;
                com.mbridge.msdk.foundation.error.b bVar = this.f36609b;
                if (bVar != null) {
                    bVar.c("errorCode: 3203 errorMessage: tpl temp resource download failed");
                }
                d dVar = d.this;
                if (dVar.f36599a == null) {
                    dVar.f36599a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                }
                d dVar2 = d.this;
                dVar2.f36599a.b(dVar2.f36602d);
                d.this.f36599a.a(this.f36609b);
                c.this.f36558j.a(c.this.V, this.f36609b, d.this.f36599a);
                q0.a("RewardMVVideoAdapter", "播放模板下载失败，大模板，nscpt 1 onVideoLoadFail");
            }
        }

        @Override // com.mbridge.msdk.reward.adapter.b.n
        public void a(String str, String str2, String str3, String str4) {
        }

        public d(CampaignEx campaignEx, boolean z10, CopyOnWriteArrayList copyOnWriteArrayList, int i10) {
            this.f36600b = campaignEx;
            this.f36601c = z10;
            this.f36602d = copyOnWriteArrayList;
            this.f36603e = i10;
            this.f36599a = com.mbridge.msdk.foundation.same.report.metrics.d.b().c().get(campaignEx.getLocalRequestId());
        }

        @Override // com.mbridge.msdk.reward.adapter.b.n
        public void a(String str, String str2, com.mbridge.msdk.foundation.error.b bVar) {
            q0.a("RewardMVVideoAdapter", "template 下载失败： ");
            if (bVar != null) {
                bVar.c("errorCode: 3202 errorMessage: temp resource download failed");
            }
            if (!this.f36601c && c.this.f36558j != null && c.this.L != null) {
                q0.a("RewardMVVideoAdapter", "播放模板下载失败，非大模板");
                if (this.f36600b.getRsIgnoreCheckRule() == null || this.f36600b.getRsIgnoreCheckRule().size() <= 0 || !this.f36600b.getRsIgnoreCheckRule().contains(1)) {
                    c.this.L.post(new a(str2, bVar));
                    return;
                } else {
                    q0.c("RewardMVVideoAdapter", "template download fail but hit ignoreCheckRule");
                    return;
                }
            }
            if (this.f36603e == 1) {
                if (this.f36600b.getRsIgnoreCheckRule() != null && this.f36600b.getRsIgnoreCheckRule().size() > 0) {
                    if (this.f36600b.getRsIgnoreCheckRule().contains(3)) {
                        q0.c("RewardMVVideoAdapter", "tpl download fail but hit ignoreCheckRule");
                        return;
                    } else if (this.f36600b.getCMPTEntryUrl().equals(this.f36600b.getendcard_url()) && this.f36600b.getRsIgnoreCheckRule().contains(2)) {
                        q0.c("RewardMVVideoAdapter", "endcard download fail but hit ignoreCheckRule at 3203");
                        return;
                    }
                }
                if (c.this.f36558j == null || c.this.L == null) {
                    return;
                }
                c.this.L.post(new b(str2, bVar));
            }
        }
    }

    /* JADX INFO: compiled from: RewardMVVideoAdapter.java */
    public class e implements com.mbridge.msdk.reward.adapter.b.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public com.mbridge.msdk.foundation.same.report.metrics.c f36611a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CampaignEx f36612b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ CopyOnWriteArrayList f36613c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f36614d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f36615e;

        /* JADX INFO: compiled from: RewardMVVideoAdapter.java */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f36617a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f36618b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f36619c;

            /* JADX INFO: renamed from: com.mbridge.msdk.reward.adapter.c$e$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: RewardMVVideoAdapter.java */
            public class C0366a implements com.mbridge.msdk.reward.adapter.b.o {
                @Override // com.mbridge.msdk.reward.adapter.b.o
                public void a(String str, String str2, String str3, String str4, String str5, com.mbridge.msdk.videocommon.a.C0412a c0412a) {
                    q0.a("HBOPTIMIZE", "模板加载成功 requestId " + str4);
                    e eVar = e.this;
                    if (c.this.a(eVar.f36613c, eVar.f36614d, eVar.f36615e)) {
                        c cVar = c.this;
                        cVar.a(cVar.f36550b, (List<CampaignEx>) c.this.V, (List<CampaignEx>) c.this.X, c.this.f36567s);
                        if (c.this.L != null) {
                            c.this.L.removeMessages(5);
                        }
                        if (c.this.f36558j == null || c.this.R) {
                            return;
                        }
                        c.this.R = true;
                        e eVar2 = e.this;
                        com.mbridge.msdk.foundation.same.report.metrics.c cVar2 = eVar2.f36611a;
                        if (cVar2 != null) {
                            cVar2.b(eVar2.f36613c);
                        }
                        com.mbridge.msdk.reward.adapter.a aVar = c.this.f36558j;
                        e eVar3 = e.this;
                        aVar.a(eVar3.f36613c, eVar3.f36611a);
                        return;
                    }
                    c cVar3 = c.this;
                    cVar3.a(str3, (List<CampaignEx>) cVar3.V, c.this.f36567s, a.this.f36617a);
                    if (c.this.L != null) {
                        c.this.L.removeMessages(5);
                    }
                    if (c.this.f36558j == null || c.this.S) {
                        return;
                    }
                    c.this.S = false;
                    com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880008, "errorCode: 3505 errorMessage: tpl temp preload success but isReady false");
                    e eVar4 = e.this;
                    if (eVar4.f36611a == null) {
                        eVar4.f36611a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                    }
                    e eVar5 = e.this;
                    eVar5.f36611a.b(eVar5.f36613c);
                    e.this.f36611a.a(bVarA);
                    c.this.f36558j.a(c.this.V, bVarA, e.this.f36611a);
                    q0.a("RewardMVVideoAdapter", "大模板业务，大模板预加载成功 isReady false  onVideoLoadFail");
                }

                public C0366a() {
                }

                @Override // com.mbridge.msdk.reward.adapter.b.o
                public void a(String str, String str2, String str3, com.mbridge.msdk.videocommon.a.C0412a c0412a, com.mbridge.msdk.foundation.error.b bVar) {
                    q0.a("RewardMVVideoAdapter", "大模板业务，大模板预加载失败");
                    q0.b("HBOPTIMIZE", "模板加载失败 requestId " + str2);
                    a aVar = a.this;
                    c cVar = c.this;
                    cVar.a(aVar.f36619c, (List<CampaignEx>) cVar.V, c.this.f36567s, str2);
                    if (c.this.L != null) {
                        c.this.L.removeMessages(5);
                    }
                    if (c.this.f36558j == null || c.this.S) {
                        return;
                    }
                    c.this.S = false;
                    e eVar = e.this;
                    if (eVar.f36611a == null) {
                        eVar.f36611a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                    }
                    e eVar2 = e.this;
                    eVar2.f36611a.b(eVar2.f36613c);
                    e.this.f36611a.a(bVar);
                    c.this.f36558j.a(c.this.V, bVar, e.this.f36611a);
                    q0.a("RewardMVVideoAdapter", "大模板业务，大模板预加载失败 onVideoLoadFail");
                }
            }

            public a(String str, String str2, String str3) {
                this.f36617a = str;
                this.f36618b = str2;
                this.f36619c = str3;
            }

            @Override // java.lang.Runnable
            public void run() {
                com.mbridge.msdk.reward.adapter.b bVarB = com.mbridge.msdk.reward.adapter.b.b();
                boolean z10 = c.this.A;
                Handler handler = c.this.L;
                boolean z11 = c.this.f36566r;
                boolean z12 = c.this.f36567s;
                String str = this.f36617a;
                String requestIdNotice = e.this.f36612b.getRequestIdNotice();
                String str2 = this.f36618b;
                String str3 = this.f36619c;
                String cMPTEntryUrl = e.this.f36612b.getCMPTEntryUrl();
                int i10 = c.this.f36565q;
                e eVar = e.this;
                bVarB.a(z10, handler, z11, z12, str, requestIdNotice, str2, str3, cMPTEntryUrl, i10, eVar.f36612b, eVar.f36613c, H5DownLoadManager.getInstance().getH5ResAddress(e.this.f36612b.getCMPTEntryUrl()), this.f36619c, c.this.f36560l, new C0366a(), false);
            }
        }

        @Override // com.mbridge.msdk.reward.adapter.b.n
        public void a(String str, String str2, String str3, String str4) {
            q0.a("RewardMVVideoAdapter", "大模板业务，大模板下载成功");
            c.this.P = true;
            if (!c.this.O || c.this.Q || c.this.L == null) {
                return;
            }
            synchronized (c.this.f36563o) {
                if (c.this.Q) {
                    return;
                }
                c.this.Q = true;
                c.this.L.post(new a(str3, str, str2));
            }
        }

        public e(CampaignEx campaignEx, CopyOnWriteArrayList copyOnWriteArrayList, boolean z10, int i10) {
            this.f36612b = campaignEx;
            this.f36613c = copyOnWriteArrayList;
            this.f36614d = z10;
            this.f36615e = i10;
            this.f36611a = com.mbridge.msdk.foundation.same.report.metrics.d.b().c().get(campaignEx.getLocalRequestId());
        }

        @Override // com.mbridge.msdk.reward.adapter.b.n
        public void a(String str, String str2, com.mbridge.msdk.foundation.error.b bVar) {
            q0.a("RewardMVVideoAdapter", "大模板业务，大模板下载失败");
            if (this.f36612b.getRsIgnoreCheckRule() != null && this.f36612b.getRsIgnoreCheckRule().size() > 0) {
                if (this.f36612b.getRsIgnoreCheckRule().contains(3)) {
                    q0.c("RewardMVVideoAdapter", "tpl download fail but hit ignoreCheckRule");
                    return;
                } else if (this.f36612b.getCMPTEntryUrl().equals(this.f36612b.getendcard_url()) && this.f36612b.getRsIgnoreCheckRule().contains(2)) {
                    q0.c("RewardMVVideoAdapter", "endcard download fail but hit ignoreCheckRule at 3203");
                    return;
                }
            }
            c cVar = c.this;
            cVar.a(cVar.f36550b, (List<CampaignEx>) c.this.V, c.this.f36567s, str2);
            c.this.P = false;
            if (c.this.L != null) {
                c.this.L.removeMessages(5);
            }
            if (c.this.f36558j == null || c.this.S) {
                return;
            }
            c.this.S = false;
            if (bVar != null) {
                bVar.c("errorCode: 3203 errorMessage: tpl temp resource download failed");
            }
            if (this.f36611a == null) {
                this.f36611a = new com.mbridge.msdk.foundation.same.report.metrics.c();
            }
            this.f36611a.b(this.f36613c);
            this.f36611a.a(bVar);
            c.this.f36558j.a(c.this.V, bVar, this.f36611a);
            q0.a("RewardMVVideoAdapter", "大模板业务，大模板下载失败 onVideoLoadFail");
        }
    }

    /* JADX INFO: compiled from: RewardMVVideoAdapter.java */
    public class f extends com.mbridge.msdk.foundation.same.c.a {
        public f() {
        }

        @Override // com.mbridge.msdk.foundation.same.c.a
        public void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            com.mbridge.msdk.reward.report.metrics.a.a().a(str, cVar);
        }
    }

    /* JADX INFO: compiled from: RewardMVVideoAdapter.java */
    public class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CampaignUnit f36623a;

        public g(CampaignUnit campaignUnit) {
            this.f36623a = campaignUnit;
        }

        @Override // java.lang.Runnable
        public void run() {
            j.a(com.mbridge.msdk.foundation.db.g.a(c.this.f36549a)).d();
            CampaignUnit campaignUnit = this.f36623a;
            if (campaignUnit == null || campaignUnit.getAds() == null || this.f36623a.getAds().size() <= 0) {
                return;
            }
            c.this.d(this.f36623a.getAds());
        }
    }

    /* JADX INFO: compiled from: RewardMVVideoAdapter.java */
    public class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f36625a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private com.mbridge.msdk.foundation.same.report.metrics.c f36626b;

        public h(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            this.f36625a = str;
            this.f36626b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (c.this.E) {
                    return;
                }
                c.this.F = true;
                if (c.this.L != null) {
                    Message messageObtainMessage = c.this.L.obtainMessage();
                    messageObtainMessage.obj = this.f36625a;
                    messageObtainMessage.what = 2;
                    if (this.f36626b != null) {
                        Bundle bundle = new Bundle();
                        bundle.putString("metrics_data_lrid", this.f36626b.t());
                        messageObtainMessage.setData(bundle);
                    }
                    c.this.L.sendMessage(messageObtainMessage);
                }
            } catch (Exception e10) {
                q0.b("RewardMVVideoAdapter", e10.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: RewardMVVideoAdapter.java */
    public class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f36628a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private com.mbridge.msdk.foundation.same.report.metrics.c f36629b;

        public i(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            this.f36628a = str;
            this.f36629b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (com.mbridge.msdk.util.b.a()) {
                    c cVar = c.this;
                    cVar.f36569u = com.mbridge.msdk.b.a(cVar.f36550b, c.this.f36549a);
                }
                c cVar2 = c.this;
                cVar2.f36556h = v0.a(cVar2.f36549a, c.this.f36550b);
                if (c.this.F) {
                    return;
                }
                if (c.this.D != null && c.this.L != null) {
                    c.this.L.removeCallbacks(c.this.D);
                }
                c.this.E = true;
                if (c.this.L != null) {
                    Message messageObtainMessage = c.this.L.obtainMessage();
                    messageObtainMessage.obj = this.f36628a;
                    messageObtainMessage.what = 1;
                    if (this.f36629b != null) {
                        Bundle bundle = new Bundle();
                        bundle.putString("metrics_data_lrid", this.f36629b.t());
                        messageObtainMessage.setData(bundle);
                    }
                    c.this.L.sendMessage(messageObtainMessage);
                }
                if (TextUtils.isEmpty(c.this.f36556h)) {
                    return;
                }
                q0.b("RewardMVVideoAdapter", "excludeId : " + c.this.f36556h);
            } catch (Exception e10) {
                q0.b("RewardMVVideoAdapter", e10.getMessage());
            }
        }
    }

    public static void safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(Activity p10, Intent p11) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V");
        if (p11 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p11, com.safedk.android.utils.g.f44969o);
        p10.startActivity(p11);
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p10, Intent p11) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p11 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p11, com.safedk.android.utils.g.f44969o);
        p10.startActivity(p11);
    }

    private String i() {
        try {
            if (a1.b(com.mbridge.msdk.reward.controller.a.f36646c0)) {
                return com.mbridge.msdk.reward.controller.a.f36646c0;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return "";
    }

    private String k() {
        com.mbridge.msdk.setting.g gVarB = com.mbridge.msdk.setting.h.b().b(com.mbridge.msdk.foundation.controller.c.n().b());
        return com.mbridge.msdk.foundation.same.net.utils.d.h().a(this.C, TextUtils.isEmpty(this.C) ? gVarB.q0() : gVarB.B());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        try {
            if (a1.b(this.f36550b)) {
                com.mbridge.msdk.reward.controller.a.a(this.f36550b, 0);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void c(String str) {
        this.f36568t = str;
    }

    public void d(boolean z10) {
        this.f36566r = z10;
    }

    public void e(boolean z10) {
        this.f36567s = z10;
    }

    public void f(boolean z10) {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList;
        if (z10 || (copyOnWriteArrayList = this.f36574z) == null || copyOnWriteArrayList.size() <= 0) {
            return;
        }
        com.mbridge.msdk.videocommon.cache.a.a().a(this.f36550b, this.f36574z);
    }

    public boolean g(boolean z10) {
        if (z10) {
            List<CampaignEx> list = this.X;
            if (list == null || list.size() <= 0) {
                return false;
            }
            for (CampaignEx campaignEx : this.X) {
                if (campaignEx != null) {
                    campaignEx.setLoadTimeoutState(1);
                    if (campaignEx.getRewardTemplateMode() != null && !TextUtils.isEmpty(campaignEx.getRewardTemplateMode().j())) {
                        ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f36550b + "_" + campaignEx.getRequestId() + "_" + campaignEx.getRewardTemplateMode().j(), true);
                    }
                }
            }
            com.mbridge.msdk.videocommon.cache.a.a().a(this.f36550b, this.X, "load_timeout", 1);
            return true;
        }
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.f36574z;
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
            return false;
        }
        for (CampaignEx campaignEx2 : this.f36574z) {
            if (campaignEx2 != null) {
                campaignEx2.setLoadTimeoutState(1);
                if (campaignEx2.getRewardTemplateMode() != null && !TextUtils.isEmpty(campaignEx2.getRewardTemplateMode().j())) {
                    ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f36550b + "_" + campaignEx2.getRequestId() + "_" + campaignEx2.getRewardTemplateMode().j(), true);
                }
            }
        }
        com.mbridge.msdk.videocommon.cache.a.a().a(this.f36550b, this.f36574z, "load_timeout", 1);
        return true;
    }

    public void h(boolean z10) {
        if (z10) {
            List<CampaignEx> list = this.X;
            if (list == null || list.size() <= 0) {
                return;
            }
            for (CampaignEx campaignEx : this.X) {
                if (campaignEx != null) {
                    campaignEx.setLoadTimeoutState(0);
                    if (campaignEx.getRewardTemplateMode() != null && !TextUtils.isEmpty(campaignEx.getRewardTemplateMode().j())) {
                        ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f36550b + "_" + campaignEx.getRequestId() + "_" + campaignEx.getRewardTemplateMode().j(), false);
                    }
                }
            }
            com.mbridge.msdk.videocommon.cache.a.a().a(this.f36550b, this.X, "load_timeout", 0);
            return;
        }
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.f36574z;
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
            return;
        }
        for (CampaignEx campaignEx2 : this.f36574z) {
            if (campaignEx2 != null) {
                campaignEx2.setLoadTimeoutState(0);
                if (campaignEx2.getRewardTemplateMode() != null && !TextUtils.isEmpty(campaignEx2.getRewardTemplateMode().j())) {
                    ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f36550b + "_" + campaignEx2.getRequestId() + "_" + campaignEx2.getRewardTemplateMode().j(), false);
                }
            }
        }
        com.mbridge.msdk.videocommon.cache.a.a().a(this.f36550b, this.f36574z, "load_timeout", 0);
    }

    public String j() {
        return this.f36550b;
    }

    public boolean l() {
        return b(false);
    }

    public boolean m() {
        List<CampaignEx> listC = com.mbridge.msdk.videocommon.cache.a.a().c(this.f36550b, 1, this.f36567s, this.f36568t);
        if (listC == null || listC.size() <= 0) {
            q0.a("test_isReay_db", "database has not can use data");
            return false;
        }
        CampaignEx campaignEx = listC.get(0);
        int iA = com.mbridge.msdk.videocommon.cache.a.a().a(this.f36550b, 1, this.f36567s, this.f36568t);
        if (TextUtils.isEmpty(campaignEx.getCMPTEntryUrl()) || campaignEx.getNscpt() != 1 || listC.size() >= iA) {
            return a(listC, !TextUtils.isEmpty(campaignEx.getCMPTEntryUrl()), campaignEx.getNscpt());
        }
        return false;
    }

    public c(Context context, String str, String str2) {
        try {
            this.f36549a = context.getApplicationContext();
            this.f36550b = str2;
            this.f36551c = str;
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(List<CampaignEx> list) {
        if (this.f36549a == null || list == null || list.size() == 0) {
            return;
        }
        j jVarA = j.a(com.mbridge.msdk.foundation.db.g.a(this.f36549a));
        for (int i10 = 0; i10 < list.size(); i10++) {
            CampaignEx campaignEx = list.get(i10);
            if (campaignEx != null) {
                if (com.mbridge.msdk.util.b.a()) {
                    if (v0.c(this.f36549a, campaignEx.getPackageName())) {
                        com.mbridge.msdk.b.a(campaignEx);
                    } else {
                        a(jVarA, campaignEx);
                    }
                } else {
                    a(jVarA, campaignEx);
                }
            }
        }
    }

    private String e() {
        return com.mbridge.msdk.b.a();
    }

    public void c(boolean z10) {
        this.M = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(CampaignUnit campaignUnit) {
        if (campaignUnit == null || campaignUnit.getAds() == null || campaignUnit.getAds().size() <= 0) {
            return;
        }
        try {
            com.mbridge.msdk.foundation.same.report.metrics.c metricsData = campaignUnit.getMetricsData();
            if (metricsData != null) {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("result", 1);
                eVar.a("timeout", Integer.valueOf(this.f36554f));
                eVar.a("hst", k());
                metricsData.b(campaignUnit.getAds());
                metricsData.a("2000126", eVar);
                campaignUnit.setLocalRequestId(metricsData.t());
                com.mbridge.msdk.reward.report.metrics.a.a().a("2000126", metricsData);
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardMVVideoAdapter", e10.getMessage());
            }
        }
    }

    public CopyOnWriteArrayList<CampaignEx> f() {
        return this.W;
    }

    public void b(String str) {
        this.I = str;
    }

    public boolean b(boolean z10) {
        com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListB = com.mbridge.msdk.videocommon.cache.a.a().b(this.f36550b, 1, this.f36567s, this.f36568t);
        if (copyOnWriteArrayListB != null && copyOnWriteArrayListB.size() > 0) {
            CampaignEx campaignEx = copyOnWriteArrayListB.get(0);
            cVar.i(campaignEx.getCurrentLocalRid());
            int iA = com.mbridge.msdk.videocommon.cache.a.a().a(this.f36550b, 1, this.f36567s, this.f36568t);
            if (TextUtils.isEmpty(campaignEx.getCMPTEntryUrl()) || campaignEx.getNscpt() != 1 || copyOnWriteArrayListB.size() >= iA) {
                boolean zA = a(copyOnWriteArrayListB, !TextUtils.isEmpty(campaignEx.getCMPTEntryUrl()), campaignEx.getNscpt(), z10);
                if (z10) {
                    a(zA, cVar, copyOnWriteArrayListB);
                }
                return zA;
            }
            if (z10) {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("event_name", "is_ready_cltr");
                eVar.a("reason", "nscpt error");
                eVar.a("type", 8);
                a(cVar, eVar, copyOnWriteArrayListB);
            }
            return false;
        }
        q0.a("RewardVideoController", "database has not can use data");
        if (z10) {
            com.mbridge.msdk.foundation.same.report.metrics.e eVar2 = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar2.a("event_name", "is_ready_cse");
            eVar2.a("reason", "no effective campaign list");
            eVar2.a("type", 8);
            a(cVar, eVar2, copyOnWriteArrayListB);
        }
        return false;
    }

    private void d() {
        try {
            Map<String, Long> map = com.mbridge.msdk.foundation.same.buffer.b.f34933l;
            if (map == null || map.size() <= 0) {
                return;
            }
            com.mbridge.msdk.foundation.same.buffer.b.f34933l.clear();
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public String a(boolean z10) {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListB;
        CampaignEx campaignEx;
        if (z10) {
            if (TextUtils.isEmpty(this.H) && (copyOnWriteArrayListB = com.mbridge.msdk.videocommon.download.b.getInstance().b(this.f36550b)) != null && copyOnWriteArrayListB.size() > 0 && (campaignEx = copyOnWriteArrayListB.get(0)) != null) {
                this.H = campaignEx.getRequestId();
            }
            return this.H;
        }
        return this.G;
    }

    public String g() {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.f36574z;
        if (copyOnWriteArrayList != null && !copyOnWriteArrayList.isEmpty()) {
            return com.mbridge.msdk.foundation.same.c.b(this.f36574z);
        }
        return com.mbridge.msdk.foundation.same.c.b(this.X);
    }

    public CopyOnWriteArrayList<CampaignEx> h() {
        return this.f36574z;
    }

    private void c() {
        try {
            com.mbridge.msdk.foundation.db.i.a(com.mbridge.msdk.foundation.db.g.a(this.f36549a)).a(this.f36550b);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public void a(int i10) {
        this.f36565q = i10;
    }

    public void a(int i10, String str) {
        this.J = i10;
        this.K = str;
    }

    public void c(List<CampaignEx> list) {
        this.X = list;
    }

    public boolean a(CampaignEx campaignEx, boolean z10, com.mbridge.msdk.foundation.error.b bVar, int i10, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        com.mbridge.msdk.foundation.cache.c cVar2;
        com.mbridge.msdk.foundation.cache.c cVar3 = new com.mbridge.msdk.foundation.cache.c();
        com.mbridge.msdk.reward.candidate.a aVar = new com.mbridge.msdk.reward.candidate.a(this.f36550b, this.f36566r);
        boolean z11 = false;
        if (aVar.a(this.C)) {
            return false;
        }
        if (!this.T) {
            this.T = true;
            cVar3 = aVar.a(this.C, cVar, campaignEx, bVar, i10, this);
            if (cVar3 != null && cVar3.g() > com.mbridge.msdk.foundation.cache.c.f34543i) {
                if (cVar3.c() != null && cVar3.c().size() > 0) {
                    a(cVar3.c(), true, true, true);
                } else if (cVar3.g() == com.mbridge.msdk.foundation.cache.c.f34545k && bVar != null) {
                    bVar.a(com.mbridge.msdk.foundation.error.a.b(880038));
                    bVar.d(cVar3.e());
                }
            }
            cVar2 = cVar3;
            aVar.a(cVar, this.C, cVar2, (List<com.mbridge.msdk.foundation.cache.a.b>) null, (JSONObject) null, 3);
            return z11;
        }
        cVar3.d("isCandidate:false");
        cVar3.a(com.mbridge.msdk.foundation.cache.c.f34545k);
        cVar2 = cVar3;
        z11 = true;
        aVar.a(cVar, this.C, cVar2, (List<com.mbridge.msdk.foundation.cache.a.b>) null, (JSONObject) null, 3);
        return z11;
    }

    public void b(String str, boolean z10, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        try {
            if (this.f36549a == null) {
                com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880001, "errorCode: 3507 errorMessage: data load failed, errorMsg is Context is null");
                if (cVar != null) {
                    cVar.a(bVarA);
                }
                b("errorCode: 3507 errorMessage: data load failed, errorMsg is Context is null", cVar);
                return;
            }
            if (a1.a(this.f36550b)) {
                com.mbridge.msdk.foundation.error.b bVarA2 = com.mbridge.msdk.foundation.error.a.a(880001, "errorCode: 3507 errorMessage: data load failed, errorMsg is UnitId is null");
                if (cVar != null) {
                    cVar.a(bVarA2);
                }
                b("errorCode: 3507 errorMessage: data load failed, errorMsg is UnitId is null", cVar);
                return;
            }
            if (this.f36560l == null) {
                com.mbridge.msdk.foundation.error.b bVarA3 = com.mbridge.msdk.foundation.error.a.a(880001, "errorCode: 3507 errorMessage: data load failed, errorMsg is RewardUnitSetting is null");
                if (cVar != null) {
                    cVar.a(bVarA3);
                }
                b("errorCode: 3507 errorMessage: data load failed, errorMsg is RewardUnitSetting is null", cVar);
                return;
            }
            if (TextUtils.isEmpty(str)) {
                if (System.currentTimeMillis() - this.B < this.f36560l.p() * 1000) {
                    com.mbridge.msdk.foundation.error.b bVarA4 = com.mbridge.msdk.foundation.error.a.a(880018, "errorCode: 3507 errorMessage: data load failed, errorMsg is EXCEPTION_RETURN_EMPTY");
                    if (cVar != null) {
                        cVar.a(bVarA4);
                        cVar.b(true);
                    }
                    b("errorCode: 3507 errorMessage: data load failed, errorMsg is EXCEPTION_RETURN_EMPTY", cVar);
                    return;
                }
            }
            com.mbridge.msdk.foundation.same.net.wrapper.e eVarA = new com.mbridge.msdk.reward.adapter.e(this.f36551c, this.f36550b, this.f36566r, this.f36560l, cVar != null ? cVar.t() : "").a(this.f36555g, this.f36556h, this.f36552d, i(), e(), this.f36569u, str, z10, this.f36570v);
            if (eVarA == null) {
                com.mbridge.msdk.foundation.error.b bVarA5 = com.mbridge.msdk.foundation.error.a.a(880001, "errorCode: 3507 errorMessage: data load failed, errorMsg is Load param is null");
                if (cVar != null) {
                    cVar.a(bVarA5);
                }
                b("errorCode: 3507 errorMessage: data load failed, errorMsg is Load param is null", cVar);
                return;
            }
            if (this.J != 0) {
                eVarA.a("r_index", this.J + "");
            }
            if (!TextUtils.isEmpty(this.K)) {
                eVarA.a("invalid_ad_ids", this.K);
            }
            this.N = System.currentTimeMillis();
            com.mbridge.msdk.reward.request.b bVar = new com.mbridge.msdk.reward.request.b(this.f36549a);
            b bVar2 = new b(cVar);
            bVar2.a(str);
            bVar2.setUnitId(this.f36550b);
            bVar2.setPlacementId(this.f36551c);
            boolean z11 = this.f36566r;
            int i10 = MBSupportMuteAdType.INTERSTITIAL_VIDEO;
            bVar2.setAdType(z11 ? 287 : 94);
            bVar2.a(cVar);
            boolean zA = false;
            try {
                com.mbridge.msdk.videocommon.download.j jVarA = com.mbridge.msdk.videocommon.download.j.a();
                if (!this.f36566r) {
                    i10 = 94;
                }
                zA = jVarA.a(i10);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardMVVideoAdapter", "isRewardVideoRefactorForCampaignRequest exception " + e10.getMessage());
                }
            }
            try {
                if (com.mbridge.msdk.foundation.same.net.utils.c.b().a(eVarA) == null) {
                    com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                    eVar.a("hst", k());
                    if (this.J != 0) {
                        eVar.a("r_index", this.J + "");
                    }
                    cVar.a("2000125", eVar);
                    com.mbridge.msdk.reward.report.metrics.a.a().a("2000125", cVar);
                }
            } catch (Exception e11) {
                if (MBridgeConstans.DEBUG) {
                    e11.printStackTrace();
                }
            }
            if (zA) {
                bVar.getCampaign(1, str, eVarA, bVar2, com.mbridge.msdk.foundation.same.c.a(this.f36554f * 1000, 30000L));
            } else {
                bVar.choiceV3OrV5BySetting(1, eVarA, bVar2, str, com.mbridge.msdk.foundation.same.c.a(this.f36554f * 1000, 30000L));
            }
        } catch (Exception e12) {
            e12.printStackTrace();
            b("Load exception", cVar);
            n();
        }
    }

    public void a(com.mbridge.msdk.videocommon.setting.c cVar) {
        try {
            this.f36560l = cVar;
            if (cVar == null || cVar.o() * 1000 == com.mbridge.msdk.foundation.same.a.L) {
                return;
            }
            com.mbridge.msdk.foundation.same.a.L = this.f36560l.o() * 1000;
        } catch (Throwable th2) {
            q0.b("RewardMVVideoAdapter", th2.getMessage(), th2);
        }
    }

    public boolean a(List<CampaignEx> list, boolean z10, int i10, boolean z11) {
        return a(list, z10, i10, false, z11);
    }

    public boolean a(List<CampaignEx> list, boolean z10, int i10) {
        return a(list, z10, i10, false, false);
    }

    public boolean a(List<CampaignEx> list, boolean z10) {
        if (list != null && list.size() > 0) {
            CampaignEx campaignEx = list.get(0);
            if (campaignEx != null && com.mbridge.msdk.videocommon.download.b.getInstance().a(94, this.f36550b, list)) {
                if (z10) {
                    if (campaignEx.isDynamicView()) {
                        return true;
                    }
                    if (campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0) {
                        if (campaignEx.getRsIgnoreCheckRule().contains(3)) {
                            q0.c("RewardMVVideoAdapter", "Is not check big template download status");
                            return true;
                        }
                        if (campaignEx.getCMPTEntryUrl().equals(campaignEx.getendcard_url()) && campaignEx.getRsIgnoreCheckRule().contains(2)) {
                            q0.c("RewardMVVideoAdapter", "Is not check big template ENDCARD download status");
                            return true;
                        }
                    }
                    if (ResDownloadCheckManager.getInstance().checkPreLoadState(this.f36550b + "_" + campaignEx.getRequestId() + "_" + campaignEx.getCMPTEntryUrl())) {
                        q0.a("RewardVideoController", "大模板业务，开始检查大模板预加载情况，大模板预加载成功");
                        return true;
                    }
                } else {
                    if (campaignEx.isDynamicView()) {
                        return true;
                    }
                    if (campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0 && campaignEx.getRsIgnoreCheckRule().contains(1)) {
                        q0.c("RewardMVVideoAdapter", "Is not check template download status");
                        return true;
                    }
                    if (campaignEx.getRewardTemplateMode() != null && !TextUtils.isEmpty(campaignEx.getRewardTemplateMode().j())) {
                        if (ResDownloadCheckManager.getInstance().checkPreLoadState(this.f36550b + "_" + campaignEx.getRequestId() + "_" + campaignEx.getRewardTemplateMode().j())) {
                            q0.a("RewardVideoController", "非大模板业务，存在播放模板，播放模板预加载成功");
                            return true;
                        }
                    } else {
                        q0.a("RewardVideoController", "非大模板 没有 template");
                        return true;
                    }
                }
            }
        } else {
            q0.a("RewardVideoController", "数据为空");
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x01ac  */
    public boolean a(List<CampaignEx> list, boolean z10, int i10, boolean z11, boolean z12) {
        List<CampaignEx> list2;
        com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
        if (list != null && list.size() > 0) {
            CampaignEx campaignEx = list.get(0);
            cVar.i(campaignEx.getCurrentLocalRid());
            boolean zA = com.mbridge.msdk.videocommon.download.b.getInstance().a(94, this.f36550b, this.f36567s, list.size(), z10, i10, list, z11, eVar);
            eVar.a("event_name", "is_ready_crwtpl_" + zA);
            if (!zA) {
                list2 = list;
            } else if (z10) {
                if (campaignEx.isDynamicView()) {
                    return true;
                }
                if (campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0) {
                    if (campaignEx.getRsIgnoreCheckRule().contains(3)) {
                        q0.c("RewardMVVideoAdapter", "Is not check big template download status");
                        return true;
                    }
                    if (campaignEx.getCMPTEntryUrl().equals(campaignEx.getendcard_url()) && campaignEx.getRsIgnoreCheckRule().contains(2)) {
                        q0.c("RewardMVVideoAdapter", "Is not check big template of ENDCARD download status");
                        return true;
                    }
                }
                if (ResDownloadCheckManager.getInstance().checkPreLoadState(this.f36550b + "_" + campaignEx.getRequestId() + "_" + campaignEx.getCMPTEntryUrl())) {
                    return true;
                }
                if (z12) {
                    eVar.a("event_name", "is_ready_crwtpl_" + zA);
                    eVar.a("reason", "h5 big template checkPreLoadState error");
                    eVar.a("type", 5);
                    list2 = list;
                    a(cVar, eVar, list2);
                } else {
                    list2 = list;
                }
            } else {
                list2 = list;
                if (campaignEx.isDynamicView()) {
                    return true;
                }
                if (campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0 && campaignEx.getRsIgnoreCheckRule().contains(1)) {
                    q0.c("RewardMVVideoAdapter", "Is not check template download status");
                    return true;
                }
                if (campaignEx.getRewardTemplateMode() == null || TextUtils.isEmpty(campaignEx.getRewardTemplateMode().j())) {
                    return true;
                }
                String str = this.f36550b + "_" + campaignEx.getRequestId() + "_" + campaignEx.getRewardTemplateMode().j();
                if (z12) {
                    ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(str, true);
                }
                if (ResDownloadCheckManager.getInstance().checkPreLoadState(str)) {
                    return true;
                }
                if (z12) {
                    eVar.a("event_name", "is_ready_crwtpl_" + zA);
                    eVar.a("reason", "h5 template checkPreLoadState error");
                    eVar.a("type", 5);
                    a(cVar, eVar, list2);
                }
            }
        } else {
            list2 = list;
            eVar.a("event_name", "is_ready_crwtpl_empty");
            eVar.a("reason", "campaign list is empty error");
            eVar.a("type", 8);
        }
        a(cVar, eVar, list2);
        return false;
    }

    private void b(com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        if (this.L != null) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 18;
            if (cVar != null) {
                Bundle bundle = new Bundle();
                bundle.putString("metrics_data_lrid", cVar.t());
                messageObtain.setData(bundle);
            }
            this.L.sendMessage(messageObtain);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        if (this.L != null) {
            if (TextUtils.isEmpty(str)) {
                str = "load fail exception";
            }
            Message messageObtain = Message.obtain();
            messageObtain.what = 4;
            messageObtain.obj = str;
            if (cVar != null) {
                cVar.b(true);
                Bundle bundle = new Bundle();
                bundle.putString("metrics_data_lrid", cVar.t());
                messageObtain.setData(bundle);
            }
            if (str.contains("exception")) {
                this.L.sendMessageAtFrontOfQueue(messageObtain);
            } else {
                this.L.sendMessage(messageObtain);
            }
        }
    }

    public void a(com.mbridge.msdk.video.bt.module.orglistener.h hVar, String str, String str2, int i10, String str3, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        try {
            this.f36557i = hVar;
            if (this.f36549a != null && !a1.a(this.f36550b)) {
                Intent intent = new Intent(this.f36549a, (Class<?>) MBRewardVideoActivity.class);
                intent.putExtra(MBridgeConstans.UNIT_ID, this.f36550b);
                intent.putExtra(MBridgeConstans.PLACEMENT_ID, this.f36551c);
                intent.putExtra(MBridgeConstans.REWARD_ID, str);
                intent.putExtra(MBridgeConstans.MUTE_STATE, i10);
                intent.putExtra(MBridgeConstans.IS_IV, this.f36566r);
                intent.putExtra(MBridgeConstans.IS_BID, this.f36567s);
                intent.putExtra(MBridgeConstans.EXTRA_DATA, str3);
                CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListB = com.mbridge.msdk.videocommon.download.b.getInstance().b(this.f36550b);
                boolean z10 = false;
                if (copyOnWriteArrayListB != null && copyOnWriteArrayListB.size() > 0) {
                    CampaignEx campaignEx = copyOnWriteArrayListB.get(0);
                    if (copyOnWriteArrayListB.size() == 1 && !com.mbridge.msdk.foundation.same.c.a(this.f36549a, campaignEx) && campaignEx.getFilterAdsShowCallState() == 1) {
                        com.mbridge.msdk.videocommon.cache.a.a().b(this.f36550b, campaignEx);
                        com.mbridge.msdk.video.bt.module.orglistener.h hVar2 = this.f36557i;
                        if (hVar2 != null) {
                            hVar2.a(cVar, "show_campaign_filtered");
                            return;
                        }
                    }
                    if (campaignEx != null) {
                        this.H = campaignEx.getRequestId();
                    }
                    if (campaignEx != null && !TextUtils.isEmpty(campaignEx.getCMPTEntryUrl())) {
                        z10 = true;
                    }
                    a();
                } else {
                    com.mbridge.msdk.video.bt.module.orglistener.h hVar3 = this.f36557i;
                    if (hVar3 != null) {
                        hVar3.a(cVar, "load failed");
                        return;
                    }
                }
                intent.putExtra(MBridgeConstans.IS_BIG_OFFER, z10);
                if (this.f36566r) {
                    intent.putExtra(MBridgeConstans.IV_REWARD_MODE_TYPE, this.f36570v);
                    intent.putExtra(MBridgeConstans.IV_REWARD_VALUE_TYPE, this.f36571w);
                    intent.putExtra(MBridgeConstans.IV_REWARD_VALUE, this.f36572x);
                }
                if (!TextUtils.isEmpty(str2)) {
                    intent.putExtra(MBridgeConstans.USER_ID, str2);
                }
                RewardUnitCacheManager.getInstance().add(this.f36551c, this.f36550b, this.f36560l);
                try {
                    if (com.mbridge.msdk.foundation.controller.c.n() != null && com.mbridge.msdk.foundation.controller.c.n().f() != null) {
                        safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533((Activity) com.mbridge.msdk.foundation.controller.c.n().f(), intent);
                        return;
                    }
                } catch (Throwable th2) {
                    q0.b("RewardMVVideoAdapter", th2.getMessage());
                }
                intent.addFlags(268435456);
                safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(this.f36549a, intent);
                return;
            }
            com.mbridge.msdk.video.bt.module.orglistener.h hVar4 = this.f36557i;
            if (hVar4 != null) {
                hVar4.a(cVar, "context or unitid is null");
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            com.mbridge.msdk.video.bt.module.orglistener.h hVar5 = this.f36557i;
            if (hVar5 != null) {
                hVar5.a(cVar, "show failed, exception is " + e10.getMessage());
            }
        }
    }

    private void b() {
        if (com.mbridge.msdk.videocommon.cache.a.a() != null) {
            try {
                com.mbridge.msdk.setting.g gVarD = com.mbridge.msdk.setting.h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
                if (gVarD == null) {
                    gVarD = com.mbridge.msdk.setting.h.b().a();
                }
                com.mbridge.msdk.videocommon.cache.a.a().a(gVarD.b0() * 1000, this.f36550b);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:102:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:106:0x01e2 A[Catch: all -> 0x022a, Exception -> 0x022c, TryCatch #3 {Exception -> 0x022c, blocks: (B:8:0x001f, B:10:0x0023, B:13:0x002b, B:15:0x0031, B:17:0x003b, B:19:0x0048, B:21:0x0052, B:22:0x0057, B:24:0x005d, B:25:0x006e, B:27:0x0074, B:28:0x007c, B:31:0x0082, B:34:0x008a, B:36:0x0097, B:38:0x00a5, B:71:0x0161, B:73:0x0170, B:75:0x0176, B:77:0x017c, B:79:0x0185, B:80:0x0188, B:70:0x015e, B:42:0x00b2, B:45:0x00bd, B:81:0x0189, B:83:0x0191, B:85:0x0198, B:87:0x01a2, B:95:0x01bc, B:97:0x01c2, B:99:0x01c8, B:103:0x01d7, B:104:0x01da, B:106:0x01e2, B:113:0x020f, B:107:0x01e6, B:109:0x01ef, B:111:0x01f5, B:112:0x0204, B:114:0x0213, B:90:0x01ad), top: B:146:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:107:0x01e6 A[Catch: all -> 0x022a, Exception -> 0x022c, TryCatch #3 {Exception -> 0x022c, blocks: (B:8:0x001f, B:10:0x0023, B:13:0x002b, B:15:0x0031, B:17:0x003b, B:19:0x0048, B:21:0x0052, B:22:0x0057, B:24:0x005d, B:25:0x006e, B:27:0x0074, B:28:0x007c, B:31:0x0082, B:34:0x008a, B:36:0x0097, B:38:0x00a5, B:71:0x0161, B:73:0x0170, B:75:0x0176, B:77:0x017c, B:79:0x0185, B:80:0x0188, B:70:0x015e, B:42:0x00b2, B:45:0x00bd, B:81:0x0189, B:83:0x0191, B:85:0x0198, B:87:0x01a2, B:95:0x01bc, B:97:0x01c2, B:99:0x01c8, B:103:0x01d7, B:104:0x01da, B:106:0x01e2, B:113:0x020f, B:107:0x01e6, B:109:0x01ef, B:111:0x01f5, B:112:0x0204, B:114:0x0213, B:90:0x01ad), top: B:146:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:112:0x0204 A[Catch: all -> 0x022a, Exception -> 0x022c, TryCatch #3 {Exception -> 0x022c, blocks: (B:8:0x001f, B:10:0x0023, B:13:0x002b, B:15:0x0031, B:17:0x003b, B:19:0x0048, B:21:0x0052, B:22:0x0057, B:24:0x005d, B:25:0x006e, B:27:0x0074, B:28:0x007c, B:31:0x0082, B:34:0x008a, B:36:0x0097, B:38:0x00a5, B:71:0x0161, B:73:0x0170, B:75:0x0176, B:77:0x017c, B:79:0x0185, B:80:0x0188, B:70:0x015e, B:42:0x00b2, B:45:0x00bd, B:81:0x0189, B:83:0x0191, B:85:0x0198, B:87:0x01a2, B:95:0x01bc, B:97:0x01c2, B:99:0x01c8, B:103:0x01d7, B:104:0x01da, B:106:0x01e2, B:113:0x020f, B:107:0x01e6, B:109:0x01ef, B:111:0x01f5, B:112:0x0204, B:114:0x0213, B:90:0x01ad), top: B:146:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:114:0x0213 A[Catch: all -> 0x022a, Exception -> 0x022c, TRY_LEAVE, TryCatch #3 {Exception -> 0x022c, blocks: (B:8:0x001f, B:10:0x0023, B:13:0x002b, B:15:0x0031, B:17:0x003b, B:19:0x0048, B:21:0x0052, B:22:0x0057, B:24:0x005d, B:25:0x006e, B:27:0x0074, B:28:0x007c, B:31:0x0082, B:34:0x008a, B:36:0x0097, B:38:0x00a5, B:71:0x0161, B:73:0x0170, B:75:0x0176, B:77:0x017c, B:79:0x0185, B:80:0x0188, B:70:0x015e, B:42:0x00b2, B:45:0x00bd, B:81:0x0189, B:83:0x0191, B:85:0x0198, B:87:0x01a2, B:95:0x01bc, B:97:0x01c2, B:99:0x01c8, B:103:0x01d7, B:104:0x01da, B:106:0x01e2, B:113:0x020f, B:107:0x01e6, B:109:0x01ef, B:111:0x01f5, B:112:0x0204, B:114:0x0213, B:90:0x01ad), top: B:146:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:133:0x023b A[PHI: r0
  0x023b: PHI (r0v6 'e' java.io.IOException) = (r0v9 'e' java.io.IOException), (r0v10 'e' java.io.IOException) binds: [B:132:0x0239, B:121:0x0227] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:165:0x0217 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x00e5 A[Catch: all -> 0x014a, Exception -> 0x014c, TryCatch #2 {Exception -> 0x014c, blocks: (B:50:0x00ca, B:52:0x00e5, B:53:0x00ed), top: B:144:0x00ca }] */
    /* JADX WARN: Code duplicated, block: B:81:0x0189 A[Catch: all -> 0x022a, Exception -> 0x022c, PHI: r6
  0x0189: PHI (r6v7 java.io.FileOutputStream) = (r6v6 java.io.FileOutputStream), (r6v11 java.io.FileOutputStream) binds: [B:35:0x0095, B:76:0x017a] A[DONT_GENERATE, DONT_INLINE], TryCatch #3 {Exception -> 0x022c, blocks: (B:8:0x001f, B:10:0x0023, B:13:0x002b, B:15:0x0031, B:17:0x003b, B:19:0x0048, B:21:0x0052, B:22:0x0057, B:24:0x005d, B:25:0x006e, B:27:0x0074, B:28:0x007c, B:31:0x0082, B:34:0x008a, B:36:0x0097, B:38:0x00a5, B:71:0x0161, B:73:0x0170, B:75:0x0176, B:77:0x017c, B:79:0x0185, B:80:0x0188, B:70:0x015e, B:42:0x00b2, B:45:0x00bd, B:81:0x0189, B:83:0x0191, B:85:0x0198, B:87:0x01a2, B:95:0x01bc, B:97:0x01c2, B:99:0x01c8, B:103:0x01d7, B:104:0x01da, B:106:0x01e2, B:113:0x020f, B:107:0x01e6, B:109:0x01ef, B:111:0x01f5, B:112:0x0204, B:114:0x0213, B:90:0x01ad), top: B:146:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:83:0x0191 A[Catch: all -> 0x022a, Exception -> 0x022c, TryCatch #3 {Exception -> 0x022c, blocks: (B:8:0x001f, B:10:0x0023, B:13:0x002b, B:15:0x0031, B:17:0x003b, B:19:0x0048, B:21:0x0052, B:22:0x0057, B:24:0x005d, B:25:0x006e, B:27:0x0074, B:28:0x007c, B:31:0x0082, B:34:0x008a, B:36:0x0097, B:38:0x00a5, B:71:0x0161, B:73:0x0170, B:75:0x0176, B:77:0x017c, B:79:0x0185, B:80:0x0188, B:70:0x015e, B:42:0x00b2, B:45:0x00bd, B:81:0x0189, B:83:0x0191, B:85:0x0198, B:87:0x01a2, B:95:0x01bc, B:97:0x01c2, B:99:0x01c8, B:103:0x01d7, B:104:0x01da, B:106:0x01e2, B:113:0x020f, B:107:0x01e6, B:109:0x01ef, B:111:0x01f5, B:112:0x0204, B:114:0x0213, B:90:0x01ad), top: B:146:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:85:0x0198 A[Catch: all -> 0x022a, Exception -> 0x022c, TryCatch #3 {Exception -> 0x022c, blocks: (B:8:0x001f, B:10:0x0023, B:13:0x002b, B:15:0x0031, B:17:0x003b, B:19:0x0048, B:21:0x0052, B:22:0x0057, B:24:0x005d, B:25:0x006e, B:27:0x0074, B:28:0x007c, B:31:0x0082, B:34:0x008a, B:36:0x0097, B:38:0x00a5, B:71:0x0161, B:73:0x0170, B:75:0x0176, B:77:0x017c, B:79:0x0185, B:80:0x0188, B:70:0x015e, B:42:0x00b2, B:45:0x00bd, B:81:0x0189, B:83:0x0191, B:85:0x0198, B:87:0x01a2, B:95:0x01bc, B:97:0x01c2, B:99:0x01c8, B:103:0x01d7, B:104:0x01da, B:106:0x01e2, B:113:0x020f, B:107:0x01e6, B:109:0x01ef, B:111:0x01f5, B:112:0x0204, B:114:0x0213, B:90:0x01ad), top: B:146:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:90:0x01ad A[Catch: all -> 0x022a, Exception -> 0x022c, TryCatch #3 {Exception -> 0x022c, blocks: (B:8:0x001f, B:10:0x0023, B:13:0x002b, B:15:0x0031, B:17:0x003b, B:19:0x0048, B:21:0x0052, B:22:0x0057, B:24:0x005d, B:25:0x006e, B:27:0x0074, B:28:0x007c, B:31:0x0082, B:34:0x008a, B:36:0x0097, B:38:0x00a5, B:71:0x0161, B:73:0x0170, B:75:0x0176, B:77:0x017c, B:79:0x0185, B:80:0x0188, B:70:0x015e, B:42:0x00b2, B:45:0x00bd, B:81:0x0189, B:83:0x0191, B:85:0x0198, B:87:0x01a2, B:95:0x01bc, B:97:0x01c2, B:99:0x01c8, B:103:0x01d7, B:104:0x01da, B:106:0x01e2, B:113:0x020f, B:107:0x01e6, B:109:0x01ef, B:111:0x01f5, B:112:0x0204, B:114:0x0213, B:90:0x01ad), top: B:146:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:92:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:93:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:95:0x01bc A[Catch: all -> 0x022a, Exception -> 0x022c, TryCatch #3 {Exception -> 0x022c, blocks: (B:8:0x001f, B:10:0x0023, B:13:0x002b, B:15:0x0031, B:17:0x003b, B:19:0x0048, B:21:0x0052, B:22:0x0057, B:24:0x005d, B:25:0x006e, B:27:0x0074, B:28:0x007c, B:31:0x0082, B:34:0x008a, B:36:0x0097, B:38:0x00a5, B:71:0x0161, B:73:0x0170, B:75:0x0176, B:77:0x017c, B:79:0x0185, B:80:0x0188, B:70:0x015e, B:42:0x00b2, B:45:0x00bd, B:81:0x0189, B:83:0x0191, B:85:0x0198, B:87:0x01a2, B:95:0x01bc, B:97:0x01c2, B:99:0x01c8, B:103:0x01d7, B:104:0x01da, B:106:0x01e2, B:113:0x020f, B:107:0x01e6, B:109:0x01ef, B:111:0x01f5, B:112:0x0204, B:114:0x0213, B:90:0x01ad), top: B:146:0x001f }] */
    private com.mbridge.msdk.reward.adapter.d b(CampaignUnit campaignUnit) throws Throwable {
        Throwable th2;
        FileOutputStream fileOutputStreamFileOutputStreamCtor;
        IOException e10;
        com.mbridge.msdk.foundation.same.report.metrics.c metricsData;
        boolean z10;
        int i10;
        String str;
        String str2;
        File file;
        String md5;
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        com.mbridge.msdk.reward.adapter.d dVar = new com.mbridge.msdk.reward.adapter.d();
        dVar.a(copyOnWriteArrayList);
        if (MBridgeConstans.DEBUG && com.mbridge.msdk.util.e.f38369a) {
            return dVar;
        }
        FileOutputStream fileOutputStream = null;
        try {
            try {
                com.mbridge.msdk.videocommon.setting.c cVar = this.f36560l;
                if (cVar != null) {
                    cVar.b();
                }
                if (campaignUnit != null && campaignUnit.getAds() != null && campaignUnit.getAds().size() > 0) {
                    ArrayList<CampaignEx> ads = campaignUnit.getAds();
                    this.V = ads;
                    if (campaignUnit.getAds() == null || campaignUnit.getAds().size() <= 0) {
                        metricsData = null;
                    } else {
                        ArrayList<CampaignEx> ads2 = campaignUnit.getAds();
                        for (int i11 = 0; i11 < ads2.size(); i11++) {
                            CampaignEx campaignEx = ads2.get(i11);
                            campaignEx.setCampaignUnitId(this.f36550b);
                            ads2.set(i11, campaignEx);
                        }
                        metricsData = campaignUnit.getMetricsData();
                        if (metricsData == null) {
                            metricsData = new com.mbridge.msdk.foundation.same.report.metrics.c();
                            campaignUnit.setMetricsData(metricsData);
                        }
                        metricsData.b(ads2);
                    }
                    int i12 = 0;
                    for (int i13 = Integer.MAX_VALUE; i12 < ads.size() && i12 < i13; i13 = Integer.MAX_VALUE) {
                        CampaignEx campaignEx2 = ads.get(i12);
                        if (campaignEx2.isMraid()) {
                            if (TextUtils.isEmpty(campaignEx2.getMraid().trim())) {
                                continue;
                            } else {
                                try {
                                    try {
                                        try {
                                            try {
                                                if (campaignEx2.getAdType() == 287) {
                                                    str2 = ExifInterface.GPS_MEASUREMENT_3D;
                                                } else if (campaignEx2.getAdType() == 94) {
                                                    str2 = "1";
                                                } else {
                                                    if (campaignEx2.getAdType() == 42) {
                                                        str2 = "2";
                                                    } else {
                                                        str = "";
                                                    }
                                                    com.mbridge.msdk.foundation.same.report.g.a("m_download_start", campaignEx2, "", this.f36550b, str);
                                                    String strB = com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_700_HTML);
                                                    md5 = SameMD5.getMD5(campaignEx2.getMraid());
                                                    if (TextUtils.isEmpty(md5)) {
                                                        md5 = String.valueOf(System.currentTimeMillis());
                                                    }
                                                    File file2 = new File(strB, md5.concat(".html"));
                                                    fileOutputStreamFileOutputStreamCtor = MintegralFilesBridge.fileOutputStreamCtor(file2);
                                                    fileOutputStreamFileOutputStreamCtor.write(("<script>" + com.mbridge.msdk.setting.util.a.a().b() + "</script>" + campaignEx2.getMraid()).getBytes());
                                                    fileOutputStreamFileOutputStreamCtor.flush();
                                                    campaignEx2.setMraid(file2.getAbsolutePath());
                                                    com.mbridge.msdk.foundation.same.report.g.a("m_download_end", campaignEx2, "", this.f36550b, str);
                                                    fileOutputStreamFileOutputStreamCtor.close();
                                                    fileOutputStream = fileOutputStreamFileOutputStreamCtor;
                                                    file = new File(campaignEx2.getMraid());
                                                    if (file.exists() || !file.isFile() || !file.canRead()) {
                                                        b("mraid resource write fail", metricsData);
                                                    } else if (campaignEx2.getOfferType() == 99) {
                                                        if (b(campaignEx2)) {
                                                            if (a1.a(campaignEx2.getendcard_url())) {
                                                            }
                                                            z10 = true;
                                                        } else if (a1.a(campaignEx2.getVideoUrlEncode())) {
                                                            z10 = false;
                                                        } else {
                                                            z10 = true;
                                                        }
                                                        if (z10) {
                                                            if (com.mbridge.msdk.util.b.a()) {
                                                                if (v0.c(this.f36549a, campaignEx2.getPackageName())) {
                                                                    i10 = 1;
                                                                } else {
                                                                    i10 = 2;
                                                                }
                                                                campaignEx2.setRtinsType(i10);
                                                            }
                                                            if (com.mbridge.msdk.foundation.same.c.a(this.f36549a, campaignEx2)) {
                                                                copyOnWriteArrayList.add(campaignEx2);
                                                            } else {
                                                                dVar.a(true);
                                                                if (ads.size() != 1) {
                                                                    v0.a(this.f36550b, campaignEx2, com.mbridge.msdk.foundation.same.a.f34914x);
                                                                    this.U = "APP ALREADY INSTALLED";
                                                                } else {
                                                                    v0.a(this.f36550b, campaignEx2, com.mbridge.msdk.foundation.same.a.f34914x);
                                                                    this.U = "APP ALREADY INSTALLED";
                                                                }
                                                            }
                                                            a(campaignEx2, metricsData);
                                                        } else {
                                                            this.U = "No video campaign";
                                                        }
                                                    }
                                                }
                                                fileOutputStreamFileOutputStreamCtor.close();
                                                fileOutputStream = fileOutputStreamFileOutputStreamCtor;
                                            } catch (Exception e11) {
                                                e = e11;
                                                fileOutputStream = fileOutputStreamFileOutputStreamCtor;
                                                e.printStackTrace();
                                                if (fileOutputStream != null) {
                                                    try {
                                                        fileOutputStream.close();
                                                    } catch (IOException e12) {
                                                        e10 = e12;
                                                        if (MBridgeConstans.DEBUG) {
                                                            q0.b("RewardMVVideoAdapter", e10.getMessage());
                                                        }
                                                    }
                                                }
                                                return dVar;
                                            } catch (Throwable th3) {
                                                th2 = th3;
                                                if (fileOutputStreamFileOutputStreamCtor != null) {
                                                    try {
                                                        fileOutputStreamFileOutputStreamCtor.close();
                                                        throw th2;
                                                    } catch (IOException e13) {
                                                        if (MBridgeConstans.DEBUG) {
                                                            q0.b("RewardMVVideoAdapter", e13.getMessage());
                                                            throw th2;
                                                        }
                                                        throw th2;
                                                    }
                                                }
                                                throw th2;
                                            }
                                            fileOutputStreamFileOutputStreamCtor.write(("<script>" + com.mbridge.msdk.setting.util.a.a().b() + "</script>" + campaignEx2.getMraid()).getBytes());
                                            fileOutputStreamFileOutputStreamCtor.flush();
                                            campaignEx2.setMraid(file2.getAbsolutePath());
                                            com.mbridge.msdk.foundation.same.report.g.a("m_download_end", campaignEx2, "", this.f36550b, str);
                                        } catch (Exception e14) {
                                            e = e14;
                                            fileOutputStream = fileOutputStreamFileOutputStreamCtor;
                                            e.printStackTrace();
                                            campaignEx2.setMraid("");
                                            com.mbridge.msdk.foundation.same.report.g.a("m_download_end", campaignEx2, e.getMessage(), this.f36550b, str);
                                            if (fileOutputStream != null) {
                                                fileOutputStream.close();
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                            fileOutputStream = fileOutputStreamFileOutputStreamCtor;
                                            if (fileOutputStream != null) {
                                                fileOutputStream.close();
                                            }
                                            throw th;
                                        }
                                        com.mbridge.msdk.foundation.same.report.g.a("m_download_start", campaignEx2, "", this.f36550b, str);
                                        String strB2 = com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_700_HTML);
                                        md5 = SameMD5.getMD5(campaignEx2.getMraid());
                                        if (TextUtils.isEmpty(md5)) {
                                            md5 = String.valueOf(System.currentTimeMillis());
                                        }
                                        File file3 = new File(strB2, md5.concat(".html"));
                                        fileOutputStreamFileOutputStreamCtor = MintegralFilesBridge.fileOutputStreamCtor(file3);
                                    } catch (Exception e15) {
                                        e = e15;
                                    }
                                    file = new File(campaignEx2.getMraid());
                                    if (file.exists()) {
                                    }
                                    b("mraid resource write fail", metricsData);
                                } catch (Throwable th5) {
                                    th = th5;
                                }
                                str = str2;
                            }
                        } else if (campaignEx2.getOfferType() == 99) {
                            if (b(campaignEx2)) {
                                if (a1.a(campaignEx2.getendcard_url()) || !TextUtils.isEmpty(campaignEx2.getMraid())) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                            } else if (a1.a(campaignEx2.getVideoUrlEncode())) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            if (z10) {
                                if (com.mbridge.msdk.util.b.a() && v0.c(campaignEx2)) {
                                    if (v0.c(this.f36549a, campaignEx2.getPackageName())) {
                                        i10 = 1;
                                    } else {
                                        i10 = 2;
                                    }
                                    campaignEx2.setRtinsType(i10);
                                }
                                if (com.mbridge.msdk.foundation.same.c.a(this.f36549a, campaignEx2)) {
                                    copyOnWriteArrayList.add(campaignEx2);
                                } else {
                                    dVar.a(true);
                                    if (ads.size() != 1 && campaignEx2.getFilterCallBackState() == 1) {
                                        dVar.a(campaignEx2);
                                        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = new CopyOnWriteArrayList<>();
                                        copyOnWriteArrayList2.add(campaignEx2);
                                        dVar.a(copyOnWriteArrayList2);
                                    } else {
                                        v0.a(this.f36550b, campaignEx2, com.mbridge.msdk.foundation.same.a.f34914x);
                                        this.U = "APP ALREADY INSTALLED";
                                    }
                                }
                                a(campaignEx2, metricsData);
                            } else {
                                this.U = "No video campaign";
                            }
                        }
                        i12++;
                    }
                }
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException e16) {
                        e10 = e16;
                        if (MBridgeConstans.DEBUG) {
                            q0.b("RewardMVVideoAdapter", e10.getMessage());
                        }
                    }
                }
            } catch (Exception e17) {
                e = e17;
            }
            return dVar;
        } catch (Throwable th6) {
            th2 = th6;
            fileOutputStreamFileOutputStreamCtor = fileOutputStream;
        }
    }

    private void a() {
        String strD;
        String strB;
        String str;
        List<com.mbridge.msdk.foundation.entity.d> listA = com.mbridge.msdk.foundation.db.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(this.f36550b, this.H);
        if (listA != null) {
            int size = listA.size();
            String strD2 = com.mbridge.msdk.foundation.same.buffer.b.d(this.f36550b);
            if (size == 0) {
                return;
            }
            String str2 = "";
            try {
                if (size == 1) {
                    if (listA.get(0) != null) {
                        String strD3 = listA.get(0).d();
                        strB = listA.get(0).b();
                        strD = strD3;
                        String str3 = strB;
                        str2 = strD;
                        str = str3;
                    } else {
                        str = "";
                    }
                } else {
                    if (!TextUtils.isEmpty(strD2)) {
                        Iterator<com.mbridge.msdk.foundation.entity.d> it = listA.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                com.mbridge.msdk.foundation.entity.d next = it.next();
                                if (next != null && strD2.equals(next.a())) {
                                    strD = next.d();
                                    strB = next.b();
                                    String str4 = strB;
                                    str2 = strD;
                                    str = str4;
                                }
                            }
                        }
                    }
                    str = "";
                }
                if (TextUtils.isEmpty(str2) || !str2.equals(this.H)) {
                    return;
                }
                com.mbridge.msdk.foundation.db.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).b(strD2, this.f36550b);
                com.mbridge.msdk.foundation.same.buffer.b.a(this.f36550b, this.H, str);
                com.mbridge.msdk.foundation.same.buffer.b.e(this.f36550b);
            } catch (Exception e10) {
                q0.a("RewardMVVideoAdapter", e10.getMessage());
            }
        }
    }

    public void a(int i10, int i11, boolean z10, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        a(i10, i11, z10, "", this.A, cVar);
    }

    public void a(int i10, int i11, boolean z10, String str, boolean z11, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        CampaignEx campaignEx;
        this.f36553e = i10;
        this.f36554f = i11;
        this.f36555g = z10;
        this.C = str;
        this.A = z11;
        boolean zB = false;
        this.T = false;
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.f36574z;
        if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0 && (campaignEx = this.f36574z.get(0)) != null && TextUtils.isEmpty(campaignEx.getNLRid())) {
            this.f36574z.clear();
        }
        List<CampaignEx> list = this.V;
        if (list != null) {
            list.clear();
        }
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = this.W;
        if (copyOnWriteArrayList2 != null) {
            copyOnWriteArrayList2.clear();
        }
        this.O = false;
        this.P = false;
        synchronized (this.f36563o) {
            if (this.Q) {
                this.Q = false;
            }
        }
        this.S = false;
        this.R = false;
        try {
            zB = com.mbridge.msdk.mbsignalcommon.webEnvCheck.a.b(this.f36549a);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardMVVideoAdapter", e10.getMessage());
            }
        }
        if (!zB) {
            com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880001, "errorCode: 3507 errorMessage: data load failed, errorMsg is WebView is not available");
            if (cVar != null) {
                cVar.a(bVarA);
            }
            b("errorCode: 3507 errorMessage: data load failed, errorMsg is WebView is not available", cVar);
            return;
        }
        if (this.f36549a == null) {
            com.mbridge.msdk.foundation.error.b bVarA2 = com.mbridge.msdk.foundation.error.a.a(880001, "errorCode: 3507 errorMessage: data load failed, errorMsg is Context is null");
            if (cVar != null) {
                cVar.a(bVarA2);
            }
            b("errorCode: 3507 errorMessage: data load failed, errorMsg is Context is null", cVar);
            return;
        }
        if (a1.a(this.f36550b)) {
            com.mbridge.msdk.foundation.error.b bVarA3 = com.mbridge.msdk.foundation.error.a.a(880001, "errorCode: 3507 errorMessage: data load failed, errorMsg is UnitId is null");
            if (cVar != null) {
                cVar.a(bVarA3);
            }
            b("errorCode: 3507 errorMessage: data load failed, errorMsg is UnitId is null", cVar);
            return;
        }
        if (this.f36560l == null) {
            com.mbridge.msdk.foundation.error.b bVarA4 = com.mbridge.msdk.foundation.error.a.a(880001, "errorCode: 3507 errorMessage: data load failed, errorMsg is RewardUnitSetting is null");
            if (cVar != null) {
                cVar.a(bVarA4);
            }
            b("RewardUnitSetting is null", cVar);
            return;
        }
        d();
        c();
        q0.c("RewardMVVideoAdapter", "load 开始清除过期数据");
        b();
        a(str, z11, cVar);
    }

    private void b(List<CampaignEx> list) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    this.f36552d += list.size();
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                return;
            }
        }
        com.mbridge.msdk.videocommon.setting.c cVar = this.f36560l;
        if (cVar == null || this.f36552d > cVar.r()) {
            this.f36552d = 0;
        }
        if (a1.b(this.f36550b)) {
            com.mbridge.msdk.reward.controller.a.a(this.f36550b, this.f36552d);
        }
    }

    private boolean b(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return false;
        }
        try {
            return campaignEx.getPlayable_ads_without_video() == 2;
        } catch (Throwable th2) {
            if (!MBridgeConstans.DEBUG) {
                return false;
            }
            th2.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:15:0x0027 A[Catch: Exception -> 0x00ad, TryCatch #0 {Exception -> 0x00ad, blocks: (B:4:0x0004, B:6:0x000a, B:14:0x0021, B:16:0x002c, B:18:0x004b, B:20:0x0053, B:22:0x0057, B:25:0x0060, B:27:0x0079, B:26:0x006e, B:28:0x008f, B:15:0x0027), top: B:35:0x0004 }] */
    public void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar, int i10) {
        Object objA;
        if (cVar != null) {
            try {
                if (cVar.F()) {
                    return;
                }
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                if (i10 == 3 || i10 == 880023 || i10 == 880041) {
                    eVar.a("result", "2");
                } else {
                    switch (i10) {
                        case 10:
                        case 11:
                        case 12:
                            eVar.a("result", "2");
                            break;
                        default:
                            eVar.a("result", "1");
                            break;
                    }
                }
                eVar.a("timeout", this.f36554f + "");
                com.mbridge.msdk.foundation.error.b bVarU = cVar.u();
                if (bVarU != null && (objA = bVarU.a("campaign_request_error")) != null && (objA instanceof com.mbridge.msdk.foundation.same.net.exception.a)) {
                    if (((com.mbridge.msdk.foundation.same.net.exception.a) objA).f34993c != null) {
                        eVar.a("code", Integer.valueOf(((com.mbridge.msdk.foundation.same.net.exception.a) objA).f34993c.f35014d));
                    } else {
                        eVar.a("code", Integer.valueOf(bVarU.g()));
                    }
                    eVar.a("reason", bVarU.l());
                    eVar.a("err_desc", bVarU.i());
                    cVar.a((com.mbridge.msdk.foundation.error.b) null);
                }
                eVar.a("hst", k());
                eVar.a("126_exclude", 1);
                cVar.a("2000126", eVar);
                com.mbridge.msdk.reward.report.metrics.a.a().a("2000126", cVar);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                }
            }
        }
    }

    private void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        if (this.L != null) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 3;
            if (cVar != null) {
                Bundle bundle = new Bundle();
                bundle.putString("metrics_data_lrid", cVar.t());
                messageObtain.setData(bundle);
            }
            this.L.sendMessage(messageObtain);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        if (this.L != null) {
            if (TextUtils.isEmpty(str)) {
                str = "load fail exception";
            }
            Message messageObtain = Message.obtain();
            messageObtain.what = 4;
            messageObtain.obj = str;
            messageObtain.arg1 = i10;
            if (cVar != null) {
                cVar.b(true);
                Bundle bundle = new Bundle();
                bundle.putString("metrics_data_lrid", cVar.t());
                messageObtain.setData(bundle);
            }
            if (str.contains("exception")) {
                this.L.sendMessageAtFrontOfQueue(messageObtain);
            } else {
                this.L.sendMessage(messageObtain);
            }
        }
    }

    private void a(j jVar, CampaignEx campaignEx) {
        if (jVar == null || jVar.a(campaignEx.getId())) {
            return;
        }
        com.mbridge.msdk.foundation.entity.g gVar = new com.mbridge.msdk.foundation.entity.g();
        gVar.a(campaignEx.getId());
        gVar.b(campaignEx.getFca());
        gVar.c(campaignEx.getFcb());
        gVar.a(0);
        gVar.d(0);
        gVar.a(System.currentTimeMillis());
        jVar.b(gVar);
    }

    private void a(String str, String str2, List<CampaignEx> list) {
        if (com.mbridge.msdk.videocommon.cache.a.a() != null) {
            com.mbridge.msdk.videocommon.cache.a.a().a(str, str2, list);
        }
    }

    public void a(com.mbridge.msdk.reward.adapter.a aVar) {
        this.f36558j = aVar;
    }

    public void a(com.mbridge.msdk.reward.controller.a.j jVar) {
        this.f36559k = jVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:14:0x0046  */
    public com.mbridge.msdk.reward.adapter.d a(CampaignUnit campaignUnit) throws Throwable {
        boolean z10;
        this.f36573y = campaignUnit;
        com.mbridge.msdk.reward.adapter.d dVarB = b(campaignUnit);
        new com.mbridge.msdk.reward.candidate.a(this.f36550b, this.f36566r).a(dVarB.b(), this.C, this, this.f36550b);
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListB = dVarB.b();
        if (dVarB.e()) {
            if (dVarB.d() == 0) {
                copyOnWriteArrayListB.clear();
            } else if (dVarB.a()) {
                b(campaignUnit.getMetricsData());
            }
            if (dVarB.c() != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = true;
        }
        a(copyOnWriteArrayListB, true, false, z10);
        return dVarB;
    }

    public void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, boolean z10, boolean z11, boolean z12) {
        com.mbridge.msdk.foundation.same.report.metrics.c metricsData;
        try {
            if (z11) {
                this.V = copyOnWriteArrayList;
                CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = new CopyOnWriteArrayList<>(copyOnWriteArrayList);
                this.W = copyOnWriteArrayList2;
                metricsData = a((List<CampaignEx>) copyOnWriteArrayList2);
            } else {
                metricsData = this.f36573y.getMetricsData();
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardMVVideoAdapter", e10.getMessage());
            }
            metricsData = null;
        }
        a(this.f36573y, copyOnWriteArrayList);
        if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
            q0.c("RewardMVVideoAdapter", "onload load success size:" + copyOnWriteArrayList.size());
            if (z10) {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                if (z11) {
                    eVar.a("cache", 1);
                } else {
                    eVar.a("cache", 2);
                }
                if (metricsData != null) {
                    metricsData.a("2000127", eVar);
                    metricsData.a("2000048", eVar);
                }
                a(metricsData);
            }
            List<CampaignEx> listB = com.mbridge.msdk.videocommon.cache.a.a().b(this.f36550b, 1, this.f36567s);
            if (listB != null && listB.size() > 0 && metricsData != null) {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar2 = new com.mbridge.msdk.foundation.same.report.metrics.e();
                CampaignEx campaignEx = copyOnWriteArrayList.get(0);
                eVar2.a("cid", campaignEx.getId());
                eVar2.a("price", "");
                eVar2.a("bid_tk", this.C);
                eVar2.a("lrid", campaignEx.getLocalRequestId());
                CampaignEx campaignEx2 = listB.get(0);
                eVar2.a("cid_old", com.mbridge.msdk.foundation.same.c.a(listB));
                eVar2.a("price_old", "");
                eVar2.a("bid_tk_old", campaignEx2.getBidToken());
                eVar2.a("lrid_old", campaignEx2.getLocalRequestId());
                metricsData.a("m_load_overwrite", eVar2);
                com.mbridge.msdk.reward.report.metrics.a.a().a("m_load_overwrite", metricsData);
            }
            if (z12) {
                a(copyOnWriteArrayList);
                return;
            } else {
                this.U = "campaign filtered";
                a(880021, "campaign filtered", metricsData);
                return;
            }
        }
        q0.c("RewardMVVideoAdapter", "onload load fail, callback campaign have not video");
        if (TextUtils.isEmpty(this.U)) {
            this.U = "APP ALREADY INSTALLED";
        }
        a(this.U.contains("INSTALL") ? 880021 : 880003, this.U, metricsData);
    }

    public void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
        CampaignUnit campaignUnit = this.f36573y;
        if (campaignUnit != null) {
            a(campaignUnit.getSessionId());
        }
        b(copyOnWriteArrayList);
        if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
            q0.c("RewardMVVideoAdapter", "#######onload 把广告存在本地 size:" + copyOnWriteArrayList.size());
            a(this.f36551c, this.f36550b, copyOnWriteArrayList);
        }
        CampaignEx campaignEx = copyOnWriteArrayList.get(0);
        this.f36574z = copyOnWriteArrayList;
        a(campaignEx);
    }

    private void a(CampaignEx campaignEx) {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = new CopyOnWriteArrayList<>(this.f36574z);
        boolean z10 = !TextUtils.isEmpty(campaignEx.getCMPTEntryUrl());
        int nscpt = campaignEx.getNscpt();
        this.O = false;
        this.P = false;
        synchronized (this.f36563o) {
            if (this.Q) {
                this.Q = false;
            }
        }
        this.S = false;
        this.R = false;
        if (this.f36567s) {
            com.mbridge.msdk.foundation.db.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(campaignEx.getBidToken(), campaignEx.getCampaignUnitId(), campaignEx.getEncryptPrice());
        }
        com.mbridge.msdk.reward.adapter.b.b().a(this.f36549a, z10, nscpt, this.f36567s, this.f36566r ? MBSupportMuteAdType.INTERSTITIAL_VIDEO : 94, this.f36551c, this.f36550b, campaignEx.getRequestId(), copyOnWriteArrayList, new C0363c(campaignEx, z10, copyOnWriteArrayList, nscpt), new d(campaignEx, z10, copyOnWriteArrayList, nscpt));
        if (z10) {
            com.mbridge.msdk.reward.adapter.b.b().a(this.f36549a, campaignEx, this.f36551c, this.f36550b, campaignEx.getRequestId(), new e(campaignEx, copyOnWriteArrayList, z10, nscpt));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, List<CampaignEx> list, List<CampaignEx> list2, boolean z10) {
        com.mbridge.msdk.foundation.db.e.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d())).a(str, list, list2, z10);
        if (list2 != null && list2.size() > 0) {
            for (CampaignEx campaignEx : list2) {
                if (campaignEx.getRewardTemplateMode() != null && !TextUtils.isEmpty(campaignEx.getRewardTemplateMode().j())) {
                    com.mbridge.msdk.videocommon.a.e(str + "_" + campaignEx.getId() + "_" + campaignEx.getRequestId() + "_" + campaignEx.getRewardTemplateMode().j());
                    com.mbridge.msdk.videocommon.a.b(campaignEx.getAdType(), campaignEx);
                }
            }
        }
        if (z10) {
            a(str, list, list2);
        }
        if (list == null || list.size() <= 0) {
            return;
        }
        try {
            CampaignEx campaignEx2 = list.get(0);
            com.mbridge.msdk.reward.candidate.a aVar = new com.mbridge.msdk.reward.candidate.a(str, this.f36566r);
            if (campaignEx2 == null || !TextUtils.isEmpty(campaignEx2.getNLRid())) {
                return;
            }
            aVar.a(campaignEx2.getLocalRequestId(), campaignEx2.getRequestId(), 1, campaignEx2.getEcppv());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002e  */
    private void a(String str, List<CampaignEx> list, List<CampaignEx> list2) {
        CampaignEx campaignEx;
        String requestId;
        int vcn;
        String bidToken;
        String localRequestId = "";
        if (list != null) {
            try {
                if (list.size() <= 0 || (campaignEx = list.get(0)) == null) {
                    vcn = 1;
                    requestId = "";
                    bidToken = requestId;
                } else {
                    requestId = campaignEx.getRequestId();
                    vcn = campaignEx.getVcn();
                    bidToken = campaignEx.getBidToken();
                    if (TextUtils.isEmpty(campaignEx.getNLRid())) {
                        localRequestId = campaignEx.getLocalRequestId();
                    }
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                    return;
                }
                return;
            }
        } else {
            vcn = 1;
            requestId = "";
            bidToken = requestId;
        }
        if (com.mbridge.msdk.videocommon.cache.a.a() != null) {
            com.mbridge.msdk.videocommon.cache.a.a().c(str, localRequestId);
            com.mbridge.msdk.videocommon.cache.a.a().b(str);
            com.mbridge.msdk.videocommon.cache.a.a().a(str, localRequestId);
        }
        if (com.mbridge.msdk.videocommon.cache.a.a() != null) {
            com.mbridge.msdk.videocommon.cache.a.a().a(str, vcn);
        }
        if (list != null && list.size() > 0) {
            com.mbridge.msdk.reward.controller.a.a(requestId, bidToken);
            for (CampaignEx campaignEx2 : list) {
                if (campaignEx2 != null) {
                    com.mbridge.msdk.foundation.same.buffer.b.a(campaignEx2.getCampaignUnitId(), campaignEx2.getRequestId(), campaignEx2.getId(), campaignEx2.getPlct(), campaignEx2.getPlctb(), campaignEx2.getTimestamp(), campaignEx2.getLocalRequestId());
                }
            }
        }
        if (list2 != null && list2.size() > 0) {
            for (CampaignEx campaignEx3 : list2) {
                if (campaignEx3 != null) {
                    com.mbridge.msdk.foundation.same.buffer.b.c(campaignEx3.getCampaignUnitId(), campaignEx3.getRequestId());
                }
            }
        }
        com.mbridge.msdk.foundation.same.buffer.b.e(str);
        com.mbridge.msdk.foundation.db.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, List<CampaignEx> list, boolean z10, String str2) {
        if (!TextUtils.isEmpty(str) && list != null && list.size() > 0) {
            CampaignEx campaignEx = list.get(0);
            if (campaignEx != null && !TextUtils.isEmpty(campaignEx.getEcppv()) && !TextUtils.isEmpty(str2)) {
                com.mbridge.msdk.foundation.db.e.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d())).a(str, (CampaignEx) null, z10, str2);
                return;
            } else {
                com.mbridge.msdk.foundation.db.e.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d())).a(str, list, z10);
                return;
            }
        }
        com.mbridge.msdk.foundation.db.e.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d())).a(str, (CampaignEx) null, z10, str2);
    }

    private void a(CampaignEx campaignEx, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        try {
            com.mbridge.msdk.foundation.same.c.a(campaignEx, this.f36549a, cVar, new f());
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    private void a(CampaignUnit campaignUnit, List<CampaignEx> list) {
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new g(campaignUnit));
    }

    private void a(String str) {
        if (a1.b(str)) {
            com.mbridge.msdk.reward.controller.a.f36646c0 = str;
        }
    }

    public void a(int i10, int i11, int i12) {
        this.f36570v = i10;
        this.f36571w = i11;
        this.f36572x = i12;
    }

    public void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        if (this.f36560l != null && TextUtils.isEmpty(str)) {
            int iQ = this.f36560l.q() * 1000;
            List<CampaignEx> list = this.X;
            if (list != null && list.size() > 0) {
                if (System.currentTimeMillis() - this.X.get(0).getTimestamp() < iQ) {
                    b("hit ltorwc", cVar);
                    return;
                }
            }
        }
        b(str, this.A, cVar);
    }

    public void a(String str, boolean z10, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        com.mbridge.msdk.foundation.same.threadpool.a.f().execute(new i(str, cVar));
        if (this.L != null) {
            h hVar = new h(str, cVar);
            this.D = hVar;
            this.L.postDelayed(hVar, 90000L);
            return;
        }
        b(str, z10, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.mbridge.msdk.foundation.same.report.metrics.c a(Message message) {
        com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
        if (message == null) {
            return cVar;
        }
        try {
            Bundle data = message.getData();
            return data != null ? com.mbridge.msdk.foundation.same.report.metrics.d.b().b(data.getString("metrics_data_lrid")) : cVar;
        } catch (Exception e10) {
            if (!MBridgeConstans.DEBUG) {
                return cVar;
            }
            e10.printStackTrace();
            return cVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x007e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0081  */
    /* JADX WARN: Code duplicated, block: B:26:0x0096 A[Catch: Exception -> 0x00a2, TRY_LEAVE, TryCatch #1 {Exception -> 0x00a2, blocks: (B:5:0x0009, B:7:0x000f, B:9:0x0016, B:10:0x0020, B:12:0x002e, B:19:0x0048, B:20:0x004e, B:24:0x0083, B:26:0x0096), top: B:35:0x0009 }] */
    private com.mbridge.msdk.foundation.same.report.metrics.c a(List<CampaignEx> list) {
        int i10;
        com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
        String localRequestId = "";
        if (list != null) {
            try {
                if (list.size() > 0) {
                    localRequestId = list.get(0) != null ? list.get(0).getLocalRequestId() : "";
                    if (com.mbridge.msdk.foundation.same.report.metrics.d.b().c().containsKey(localRequestId)) {
                        com.mbridge.msdk.foundation.same.report.metrics.c cVar2 = com.mbridge.msdk.foundation.same.report.metrics.d.b().c().get(localRequestId);
                        if (cVar2 == null) {
                            try {
                                cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
                            } catch (Exception e10) {
                                e = e10;
                                cVar = cVar2;
                                if (MBridgeConstans.DEBUG) {
                                    e.printStackTrace();
                                }
                            }
                        } else {
                            cVar = cVar2;
                        }
                    }
                    cVar.i(localRequestId);
                    cVar.b(list);
                }
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("cache", 1);
                eVar.a(CampaignEx.JSON_KEY_HB, 1);
                eVar.a("auto_load", 2);
                cVar.a("2000127", eVar);
                cVar.a("2000048", eVar);
                if (this.f36566r) {
                    i10 = MBSupportMuteAdType.INTERSTITIAL_VIDEO;
                } else {
                    i10 = 94;
                }
                cVar.a(i10);
                cVar.h("1");
                cVar.f("2");
                if (!TextUtils.isEmpty(localRequestId)) {
                    com.mbridge.msdk.foundation.same.report.metrics.d.b().c().put(localRequestId, cVar);
                }
            } catch (Exception e11) {
                e = e11;
            }
        } else {
            com.mbridge.msdk.foundation.same.report.metrics.e eVar2 = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar2.a("cache", 1);
            eVar2.a(CampaignEx.JSON_KEY_HB, 1);
            eVar2.a("auto_load", 2);
            cVar.a("2000127", eVar2);
            cVar.a("2000048", eVar2);
            if (this.f36566r) {
                i10 = MBSupportMuteAdType.INTERSTITIAL_VIDEO;
            } else {
                i10 = 94;
            }
            cVar.a(i10);
            cVar.h("1");
            cVar.f("2");
            if (!TextUtils.isEmpty(localRequestId)) {
                com.mbridge.msdk.foundation.same.report.metrics.d.b().c().put(localRequestId, cVar);
            }
        }
        return cVar;
    }

    private void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar, com.mbridge.msdk.foundation.same.report.metrics.e eVar, List<CampaignEx> list) {
        if (cVar != null) {
            if (list != null) {
                try {
                    if (list.size() > 0) {
                        cVar.b(list);
                        CampaignEx campaignEx = list.get(0);
                        if (campaignEx != null) {
                            cVar.i(campaignEx.getLocalRequestId());
                        }
                        cVar.b(list);
                    }
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        e10.printStackTrace();
                        return;
                    }
                    return;
                }
            }
            a(false, cVar, eVar);
        }
    }

    private void a(boolean z10, com.mbridge.msdk.foundation.same.report.metrics.c cVar, List<CampaignEx> list) {
        if (cVar == null) {
            cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
        }
        if (list != null && list.size() > 0) {
            CampaignEx campaignEx = list.get(0);
            if (campaignEx != null) {
                cVar.i(campaignEx.getLocalRequestId());
            }
            cVar.b(list);
        }
        a(z10, cVar, (com.mbridge.msdk.foundation.same.report.metrics.e) null);
    }

    private void a(boolean z10, com.mbridge.msdk.foundation.same.report.metrics.c cVar, com.mbridge.msdk.foundation.same.report.metrics.e eVar) {
        if (eVar == null) {
            eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
        }
        cVar.n(this.f36550b);
        cVar.a(this.f36566r ? MBSupportMuteAdType.INTERSTITIAL_VIDEO : 94);
        eVar.a("result", Integer.valueOf(z10 ? 1 : 2));
        eVar.a("bid_tk", this.C);
        eVar.a(CampaignEx.JSON_KEY_HB, Integer.valueOf(this.f36567s ? 1 : 0));
        cVar.a("m_offer_ready", eVar);
        com.mbridge.msdk.reward.report.metrics.a.a().a("m_offer_ready", cVar);
    }
}
