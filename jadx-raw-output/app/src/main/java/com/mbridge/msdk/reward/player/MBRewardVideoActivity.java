package com.mbridge.msdk.reward.player;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import com.iab.omid.library.mmadbridge.adsession.AdEvents;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.iab.omid.library.mmadbridge.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.mmadbridge.adsession.media.MediaEvents;
import com.ironsource.C3426d4;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import com.mbridge.msdk.foundation.tools.b1;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.newreward.function.common.MBridgeGlobalCommon;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.reward.adapter.RewardUnitCacheManager;
import com.mbridge.msdk.scheme.applet.AppletModelManager;
import com.mbridge.msdk.video.bt.module.MBTempContainer;
import com.mbridge.msdk.video.bt.module.MBridgeBTContainer;
import com.mbridge.msdk.video.bt.module.orglistener.h;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import com.mbridge.msdk.video.signal.activity.AbstractJSActivity;
import com.mbridge.msdk.video.signal.impl.k;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class MBRewardVideoActivity extends AbstractJSActivity {
    public static String INTENT_LOCAL_REQUEST_ID = "lRid";
    public static String SAVE_STATE_KEY_REPORT = "hasRelease";
    private MBridgeBTContainer A;
    private WindVaneWebView B;
    private com.mbridge.msdk.video.bt.module.listener.a C;
    private String D;
    private String E;
    private boolean F;
    private String N;
    private com.mbridge.msdk.foundation.same.report.metrics.c O;
    private boolean Q;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f36745f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f36746g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f36747h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.entity.c f36748i;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f36752m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f36753n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f36754o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private h f36757r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.setting.c f36758s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.download.a f36761v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private CampaignEx f36762w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private List<com.mbridge.msdk.videocommon.download.a> f36763x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private List<CampaignEx> f36764y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private MBTempContainer f36765z;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f36749j = 2;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f36750k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f36751l = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f36755p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f36756q = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f36759t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f36760u = false;
    private int G = 1;
    private int H = 0;
    private int I = 0;
    private int J = 0;
    private int K = 0;
    private int L = 0;
    private int M = 0;
    private boolean P = false;
    private AdSession R = null;
    private MediaEvents S = null;
    private AdEvents T = null;
    private long U = 0;
    private String V = "";
    private Boolean W = null;
    private int X = 0;
    private boolean Y = false;
    private boolean Z = false;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private com.mbridge.msdk.video.dynview.listener.a f36743a0 = new a();

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private com.mbridge.msdk.video.dynview.listener.d f36744b0 = new b();

    public class a implements com.mbridge.msdk.video.dynview.listener.a {
        public a() {
        }

        @Override // com.mbridge.msdk.video.dynview.listener.a
        public void a(Map<String, Object> map) {
            if (map == null) {
                return;
            }
            if (map.containsKey(CampaignEx.JSON_NATIVE_VIDEO_MUTE)) {
                MBRewardVideoActivity.this.f36749j = ((Integer) map.get(CampaignEx.JSON_NATIVE_VIDEO_MUTE)).intValue();
            }
            if (map.containsKey(C3426d4.i.L)) {
                int iIntValue = ((Integer) map.get(C3426d4.i.L)).intValue();
                if (MBRewardVideoActivity.this.f36764y == null || MBRewardVideoActivity.this.f36764y.size() <= 0 || iIntValue < 1) {
                    return;
                }
                MBRewardVideoActivity mBRewardVideoActivity = MBRewardVideoActivity.this;
                mBRewardVideoActivity.f36762w = (CampaignEx) mBRewardVideoActivity.f36764y.get(iIntValue);
                MBRewardVideoActivity.m(MBRewardVideoActivity.this);
                int i10 = iIntValue - 1;
                if (MBRewardVideoActivity.this.f36764y.get(i10) != null) {
                    MBRewardVideoActivity mBRewardVideoActivity2 = MBRewardVideoActivity.this;
                    MBRewardVideoActivity.b(mBRewardVideoActivity2, ((CampaignEx) mBRewardVideoActivity2.f36764y.get(i10)).getVideoLength());
                }
                MBRewardVideoActivity mBRewardVideoActivity3 = MBRewardVideoActivity.this;
                MBRewardVideoActivity.this.f36762w.setVideoCompleteTime(mBRewardVideoActivity3.a(mBRewardVideoActivity3.f36762w.getVideoCompleteTime(), MBRewardVideoActivity.this.G));
                MBRewardVideoActivity.this.f36762w.setShowIndex(MBRewardVideoActivity.this.G);
                MBRewardVideoActivity.this.f36762w.setShowType(1);
                MBRewardVideoActivity mBRewardVideoActivity4 = MBRewardVideoActivity.this;
                mBRewardVideoActivity4.c(mBRewardVideoActivity4.f36762w);
            }
        }
    }

    public class b implements com.mbridge.msdk.video.dynview.listener.d {
        @Override // com.mbridge.msdk.video.dynview.listener.d
        public void a(CampaignEx campaignEx) {
            if (campaignEx == null) {
                MBRewardVideoActivity.this.b("campaign is null");
                return;
            }
            if (MBRewardVideoActivity.this.A != null) {
                new com.mbridge.msdk.video.dynview.ui.b().b(MBRewardVideoActivity.this.A, 500L);
            }
            MBRewardVideoActivity.this.f36762w = campaignEx;
            MBRewardVideoActivity.this.f36762w.setShowType(2);
            MBRewardVideoActivity mBRewardVideoActivity = MBRewardVideoActivity.this;
            mBRewardVideoActivity.c(mBRewardVideoActivity.f36762w);
        }

        public b() {
        }

        @Override // com.mbridge.msdk.video.dynview.listener.d
        public void a() {
            if (MBRewardVideoActivity.this.A != null) {
                new com.mbridge.msdk.video.dynview.ui.b().b(MBRewardVideoActivity.this.A, 500L);
            }
            MBRewardVideoActivity.this.f36755p = true;
            MBRewardVideoActivity.this.j();
            if (MBRewardVideoActivity.this.f36765z != null) {
                MBRewardVideoActivity.this.f36765z.setNotchPadding(MBRewardVideoActivity.this.M, MBRewardVideoActivity.this.I, MBRewardVideoActivity.this.K, MBRewardVideoActivity.this.J, MBRewardVideoActivity.this.L);
            }
        }
    }

    public class c implements com.mbridge.msdk.video.bt.module.listener.a {
        @Override // com.mbridge.msdk.video.bt.module.listener.a
        public void a() {
            if (MBRewardVideoActivity.this.f36757r != null) {
                MBRewardVideoActivity.this.f36757r.a(MBRewardVideoActivity.this.O);
            }
        }

        public c() {
        }

        @Override // com.mbridge.msdk.video.bt.module.listener.a
        public void b(String str, String str2) {
            if (MBRewardVideoActivity.this.f36757r != null) {
                MBRewardVideoActivity.this.f36757r.b(str, str2);
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.listener.a
        public void a(boolean z10, com.mbridge.msdk.videocommon.entity.c cVar) {
            if (MBRewardVideoActivity.this.f36757r != null) {
                MBRewardVideoActivity.this.f36757r.a(MBRewardVideoActivity.this.O, z10, cVar);
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.listener.a
        public void a(boolean z10, int i10) {
            if (MBRewardVideoActivity.this.f36757r != null) {
                MBRewardVideoActivity.this.f36757r.a(z10, i10);
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.listener.a
        public void a(String str) {
            if (MBRewardVideoActivity.this.f36757r != null) {
                MBRewardVideoActivity.this.f36757r.a(MBRewardVideoActivity.this.O, str);
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.listener.a
        public void a(boolean z10, String str, String str2) {
            if (MBRewardVideoActivity.this.f36757r != null) {
                MBRewardVideoActivity.this.f36757r.a(z10, str, str2);
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.listener.a
        public void a(String str, String str2) {
            if (MBRewardVideoActivity.this.f36757r != null) {
                MBRewardVideoActivity.this.f36757r.a(str, str2);
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.listener.a
        public void a(int i10, String str, String str2) {
            if (MBRewardVideoActivity.this.f36757r != null) {
                MBRewardVideoActivity.this.f36757r.a(i10, str, str2);
            }
        }
    }

    public class d implements com.mbridge.msdk.foundation.feedback.a {
        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
            MBRewardVideoActivity.this.onPause();
        }

        public d() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
            MBRewardVideoActivity.this.onResume();
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
            MBRewardVideoActivity.this.onResume();
        }
    }

    public static final class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<com.mbridge.msdk.videocommon.download.a> f36770a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f36771b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f36772c;

        @Override // java.lang.Runnable
        public void run() {
            try {
                List<com.mbridge.msdk.videocommon.download.a> list = this.f36770a;
                if (list == null || list.size() <= 0) {
                    return;
                }
                for (com.mbridge.msdk.videocommon.download.a aVar : this.f36770a) {
                    if (aVar != null && aVar.h() != null) {
                        CampaignEx campaignExH = aVar.h();
                        try {
                            AppletModelManager.getInstance().remove(campaignExH);
                        } catch (Exception e10) {
                            if (MBridgeConstans.DEBUG) {
                                q0.b("MBRewardVideoActivity", "AppletModelManager remove error", e10);
                            }
                        }
                        com.mbridge.msdk.videocommon.download.b.getInstance().c(this.f36771b, campaignExH.getRequestId() + campaignExH.getId() + campaignExH.getVideoUrlEncode());
                        if (campaignExH.getRewardTemplateMode() != null) {
                            if (!TextUtils.isEmpty(campaignExH.getRewardTemplateMode().j())) {
                                com.mbridge.msdk.videocommon.a.e(this.f36771b + "_" + campaignExH.getId() + "_" + this.f36772c + "_" + campaignExH.getRewardTemplateMode().j());
                                com.mbridge.msdk.videocommon.a.b(campaignExH.getAdType(), campaignExH);
                            }
                            if (!TextUtils.isEmpty(campaignExH.getCMPTEntryUrl())) {
                                com.mbridge.msdk.videocommon.a.e(this.f36771b + "_" + this.f36772c + "_" + campaignExH.getCMPTEntryUrl());
                            }
                            com.mbridge.msdk.videocommon.cache.a.a().a(this.f36771b, campaignExH);
                        }
                    }
                }
            } catch (Exception e11) {
                q0.a("MBRewardVideoActivity", e11.getMessage());
            }
        }

        public e(List<com.mbridge.msdk.videocommon.download.a> list, String str, String str2) {
            this.f36770a = list;
            this.f36771b = str;
            this.f36772c = str2;
        }
    }

    public static final class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<com.mbridge.msdk.videocommon.download.a> f36773a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f36774b;

        @Override // java.lang.Runnable
        public void run() {
            try {
                List<com.mbridge.msdk.videocommon.download.a> list = this.f36773a;
                if (list == null || list.size() <= 0) {
                    return;
                }
                for (com.mbridge.msdk.videocommon.download.a aVar : this.f36773a) {
                    if (aVar != null && aVar.h() != null) {
                        com.mbridge.msdk.videocommon.cache.a.a().a(aVar.h(), this.f36774b);
                    }
                }
            } catch (Throwable th2) {
                q0.b("MBRewardVideoActivity", th2.getMessage());
            }
        }

        public f(String str, List<com.mbridge.msdk.videocommon.download.a> list) {
            this.f36773a = list;
            this.f36774b = str;
        }
    }

    @Override // com.mbridge.msdk.video.signal.activity.AbstractJSActivity, com.mbridge.msdk.activity.MBBaseActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.activityOnTouch(g.f44969o, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // android.app.Activity
    public void finish() {
        this.Y = true;
        com.mbridge.msdk.foundation.controller.c.n().b(0);
        MBTempContainer mBTempContainer = this.f36765z;
        if (mBTempContainer != null) {
            mBTempContainer.onDestroy();
            this.f36765z = null;
        }
        com.mbridge.msdk.foundation.feedback.b.b().d(this.f36745f);
        if (this.R != null) {
            q0.b("omsdk", "mbrewardvideoac finish");
            this.R.removeAllFriendlyObstructions();
            this.R.finish();
            this.R = null;
        }
        MBridgeBTContainer mBridgeBTContainer = this.A;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onDestroy();
            this.A = null;
        }
        super.finish();
    }

    @Override // com.mbridge.msdk.video.signal.activity.AbstractJSActivity, android.app.Activity
    public void onBackPressed() {
        this.Z = true;
        super.onBackPressed();
        MBTempContainer mBTempContainer = this.f36765z;
        if (mBTempContainer != null) {
            mBTempContainer.onBackPressed();
        }
        MBridgeBTContainer mBridgeBTContainer = this.A;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onBackPressed();
        }
    }

    @Override // com.mbridge.msdk.activity.MBBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        String str;
        List<com.mbridge.msdk.videocommon.download.a> list;
        String cMPTEntryUrl = "";
        super.onCreate(bundle);
        MBridgeConstans.isRewardActivityShowing = true;
        com.mbridge.msdk.foundation.controller.c.n().a(this);
        this.U = SystemClock.elapsedRealtime();
        if (TextUtils.isEmpty(this.V)) {
            str = "onCreate";
        } else {
            str = this.V + "_onCreate";
        }
        this.V = str;
        try {
            Intent intent = getIntent();
            this.f36745f = intent.getStringExtra(MBridgeConstans.UNIT_ID);
            this.f36746g = intent.getStringExtra(MBridgeConstans.PLACEMENT_ID);
            this.f36748i = com.mbridge.msdk.videocommon.entity.c.a(intent.getStringExtra(MBridgeConstans.REWARD_ID));
            this.f36747h = intent.getStringExtra(MBridgeConstans.USER_ID);
            this.f36749j = intent.getIntExtra(MBridgeConstans.MUTE_STATE, 2);
            this.f36750k = intent.getBooleanExtra(MBridgeConstans.IS_IV, false);
            com.mbridge.msdk.foundation.controller.c cVarN = com.mbridge.msdk.foundation.controller.c.n();
            boolean z10 = this.f36750k;
            int i10 = MBSupportMuteAdType.INTERSTITIAL_VIDEO;
            cVarN.b(z10 ? 287 : 94);
            this.f36751l = intent.getBooleanExtra(MBridgeConstans.IS_BID, false);
            this.E = intent.getStringExtra(MBridgeConstans.EXTRA_DATA);
            boolean booleanExtra = intent.getBooleanExtra("is_refactor", false);
            this.P = booleanExtra;
            if (booleanExtra) {
                this.f36757r = MBridgeGlobalCommon.showRewardListenerMap.get(this.f36745f);
            } else {
                this.f36757r = com.mbridge.msdk.reward.controller.a.f36649f0.get(this.f36745f);
            }
            if (this.f36750k) {
                this.f36752m = intent.getIntExtra(MBridgeConstans.IV_REWARD_MODE_TYPE, 0);
                this.f36753n = intent.getIntExtra(MBridgeConstans.IV_REWARD_VALUE_TYPE, 0);
                this.f36754o = intent.getIntExtra(MBridgeConstans.IV_REWARD_VALUE, 0);
            }
            this.f36755p = intent.getBooleanExtra(MBridgeConstans.IS_BIG_OFFER, false);
            this.f36763x = com.mbridge.msdk.videocommon.download.b.getInstance().a(this.f36745f);
            this.f36764y = com.mbridge.msdk.videocommon.download.b.getInstance().b(this.f36745f);
            int iFindLayout = findLayout("mbridge_more_offer_activity");
            if (!i0.a(iFindLayout)) {
                b("no mbridge_more_offer_activity layout");
                return;
            }
            setContentView(iFindLayout);
            if (TextUtils.isEmpty(this.f36745f)) {
                b("data empty error");
                return;
            }
            com.mbridge.msdk.video.signal.factory.b bVar = new com.mbridge.msdk.video.signal.factory.b(this);
            this.jsFactory = bVar;
            registerJsFactory(bVar);
            h hVar = this.f36757r;
            if (hVar == null) {
                b("showRewardListener is null");
                return;
            }
            this.X = hVar.hashCode();
            com.mbridge.msdk.videocommon.setting.c cVar = RewardUnitCacheManager.getInstance().get(this.f36746g, this.f36745f);
            this.f36758s = cVar;
            if (cVar == null) {
                com.mbridge.msdk.videocommon.setting.c cVarC = com.mbridge.msdk.videocommon.setting.b.b().c(com.mbridge.msdk.foundation.controller.c.n().b(), this.f36745f);
                this.f36758s = cVarC;
                if (cVarC == null) {
                    this.f36758s = com.mbridge.msdk.videocommon.setting.b.b().a(com.mbridge.msdk.foundation.controller.c.n().b(), this.f36745f, this.f36750k);
                }
            }
            com.mbridge.msdk.videocommon.setting.c cVar2 = this.f36758s;
            if (cVar2 != null) {
                this.f36748i.a(cVar2.d());
                this.f36748i.b(this.f36758s.s());
            }
            com.mbridge.msdk.videocommon.entity.c cVar3 = this.f36748i;
            if (cVar3 != null && cVar3.a() <= 0) {
                this.f36748i.a(1);
            }
            int iA = i0.a(this, "mbridge_reward_activity_open", "anim");
            int iA2 = i0.a(this, "mbridge_reward_activity_stay", "anim");
            if (i0.a(iA) && i0.a(iA2)) {
                overridePendingTransition(iA, iA2);
            }
            if (bundle != null) {
                try {
                    this.f36760u = bundle.getBoolean(SAVE_STATE_KEY_REPORT);
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
            q0.a("DynamicViewCampaignResourceDownloader", "进入 show，大模板 " + this.f36755p);
            if (!this.f36755p) {
                List<com.mbridge.msdk.videocommon.download.a> list2 = this.f36763x;
                if (list2 != null && list2.size() > 0) {
                    this.f36761v = this.f36763x.get(0);
                }
                com.mbridge.msdk.videocommon.download.a aVar = this.f36761v;
                if (aVar != null) {
                    this.f36762w = aVar.h();
                    this.f36761v.b(true);
                    this.f36761v.d(false);
                    CampaignEx campaignEx = this.f36762w;
                    if (campaignEx != null) {
                        this.N = campaignEx.getCurrentLocalRid();
                        this.f36762w.setShowIndex(1);
                        this.f36762w.setShowType(1);
                        com.mbridge.msdk.reward.controller.a.f36645b0 = this.f36762w.getEcppv();
                        com.mbridge.msdk.click.c.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f36762w.getMaitve(), this.f36762w.getMaitve_src());
                    }
                }
                CampaignEx campaignEx2 = this.f36762w;
                if (campaignEx2 != null && !com.mbridge.msdk.foundation.tools.h.a(campaignEx2, this, (View) null, campaignEx2.getImpReportType())) {
                    b("env is exception");
                    return;
                }
                if (this.f36761v != null && this.f36762w != null && this.f36748i != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.f36762w);
                    a(arrayList);
                    b(this.f36762w);
                    j();
                    if (com.mbridge.msdk.util.b.a()) {
                        return;
                    }
                    e();
                    return;
                }
                b("data empty error");
                return;
            }
            a(this.f36764y);
            this.D = "";
            List<CampaignEx> list3 = this.f36764y;
            if (list3 != null && list3.size() > 0) {
                CampaignEx campaignEx3 = this.f36764y.get(0);
                if (!com.mbridge.msdk.foundation.tools.h.a(this.f36764y, this, (View) null, campaignEx3.getImpReportType())) {
                    b("env is exception");
                    return;
                }
                b(campaignEx3);
                cMPTEntryUrl = campaignEx3.getCMPTEntryUrl();
                this.D = campaignEx3.getRequestId();
                this.N = campaignEx3.getCurrentLocalRid();
                com.mbridge.msdk.reward.controller.a.f36645b0 = campaignEx3.getEcppv();
                com.mbridge.msdk.click.c.a(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx3.getMaitve(), campaignEx3.getMaitve_src());
            }
            WindVaneWebView windVaneWebViewA = a(this.f36745f + "_" + this.D + "_" + cMPTEntryUrl);
            this.B = windVaneWebViewA;
            if (windVaneWebViewA == null) {
                if (this.f36761v == null && (list = this.f36763x) != null && list.size() > 0) {
                    this.f36761v = this.f36763x.get(0);
                }
                if (this.f36761v == null) {
                    com.mbridge.msdk.videocommon.download.b bVar2 = com.mbridge.msdk.videocommon.download.b.getInstance();
                    if (!this.f36750k) {
                        i10 = 94;
                    }
                    this.f36761v = bVar2.a(i10, this.f36745f, this.f36751l);
                }
                com.mbridge.msdk.videocommon.download.a aVar2 = this.f36761v;
                if (aVar2 != null) {
                    this.f36762w = aVar2.h();
                    this.f36761v.b(true);
                    this.f36761v.d(false);
                }
                if (this.f36761v != null && this.f36762w != null && this.f36748i != null) {
                    this.f36755p = false;
                    List<CampaignEx> listA = com.mbridge.msdk.videocommon.cache.a.a().a(this.f36764y);
                    if (listA == null) {
                        b("no available campaign");
                        return;
                    }
                    int size = listA.size();
                    if (size == 0) {
                        b("no available campaign");
                        return;
                    }
                    if (listA.get(0) == null || !listA.get(0).isDynamicView()) {
                        j();
                    } else if (size == 1) {
                        CampaignEx campaignEx4 = listA.get(0);
                        this.f36762w = campaignEx4;
                        if (campaignEx4 != null) {
                            this.N = campaignEx4.getCurrentLocalRid();
                            this.f36762w.setCampaignIsFiltered(true);
                        }
                        c(this.f36762w);
                    } else {
                        b(listA);
                    }
                }
                b("data empty error");
                return;
            }
            b(this.f36764y.get(0));
            WindVaneWebView windVaneWebView = this.B;
            if (windVaneWebView != null) {
                b1.a(windVaneWebView, this.f36764y.get(0).getLocalRequestId(), this.f36764y.get(0).getLocalAllowTrackClick());
                try {
                    k kVar = (k) this.B.getObject();
                    kVar.setAdEvents(this.T);
                    kVar.setAdSession(this.R);
                    kVar.setVideoEvents(this.S);
                    this.B.setObject(kVar);
                } catch (Exception e11) {
                    q0.b("MBRewardVideoActivity", e11.getMessage());
                }
            }
            k();
            if (com.mbridge.msdk.util.b.a()) {
                return;
            }
            e();
        } catch (Throwable th2) {
            a(this.f36764y);
            b("onCreate error" + th2);
        }
    }

    public static /* synthetic */ int b(MBRewardVideoActivity mBRewardVideoActivity, int i10) {
        int i11 = mBRewardVideoActivity.H - i10;
        mBRewardVideoActivity.H = i11;
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(CampaignEx campaignEx) {
        CampaignEx campaignExH;
        try {
            List<com.mbridge.msdk.videocommon.download.a> list = this.f36763x;
            if (list != null && list.size() > 0) {
                for (com.mbridge.msdk.videocommon.download.a aVar : this.f36763x) {
                    if (aVar != null && (campaignExH = aVar.h()) != null && TextUtils.equals(campaignExH.getId(), campaignEx.getId()) && TextUtils.equals(campaignExH.getRequestId(), campaignEx.getRequestId())) {
                        this.f36761v = aVar;
                    }
                }
            }
            this.f36755p = true;
            j();
            MBTempContainer mBTempContainer = this.f36765z;
            if (mBTempContainer != null) {
                mBTempContainer.setNotchPadding(this.M, this.I, this.K, this.J, this.L);
            }
        } catch (Exception e10) {
            q0.b("MBRewardVideoActivity", e10.getMessage());
            b("more offer to one offer exception");
        }
    }

    private void d(CampaignEx campaignEx) {
        com.mbridge.msdk.reward.player.a.a(this, campaignEx, this.f36758s, this.f36745f);
    }

    private void e() {
        try {
            ViewGroup viewGroup = (ViewGroup) getWindow().getDecorView();
            BitmapDrawable bitmapDrawableA = com.mbridge.msdk.foundation.controller.c.n().a(this.f36745f, this.f36750k ? MBSupportMuteAdType.INTERSTITIAL_VIDEO : 94);
            if (bitmapDrawableA != null) {
                ImageView imageView = new ImageView(com.mbridge.msdk.foundation.controller.c.n().d());
                v0.a(imageView, bitmapDrawableA, getResources().getDisplayMetrics());
                ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).addView(imageView, new ViewGroup.LayoutParams(-1, -1));
                AdSession adSession = this.R;
                if (adSession != null) {
                    adSession.addFriendlyObstruction(imageView, FriendlyObstructionPurpose.OTHER, null);
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void f() {
        h hVar = this.f36757r;
        if (hVar == null || !(hVar instanceof com.mbridge.msdk.video.bt.module.orglistener.b)) {
            return;
        }
        try {
            com.mbridge.msdk.video.bt.module.orglistener.b bVar = (com.mbridge.msdk.video.bt.module.orglistener.b) hVar;
            Boolean boolD = bVar.d();
            Boolean boolC = bVar.c();
            if (boolD == null && boolC == null) {
                this.W = null;
            } else {
                Boolean bool = Boolean.FALSE;
                this.W = Boolean.valueOf(bool.equals(boolD) && bool.equals(boolC));
            }
        } catch (Throwable th2) {
            q0.b("MBRewardVideoActivity", th2.getMessage());
        }
    }

    private void g() {
        h hVar;
        try {
            Boolean bool = this.W;
            if ((bool == null || bool.booleanValue()) && (hVar = this.f36757r) != null) {
                hVar.a(this.O, "show fail : unexpected destroy");
            }
        } catch (Throwable th2) {
            q0.b("MBRewardVideoActivity", th2.getMessage());
        }
    }

    private void h() {
        try {
            List<CampaignEx> list = this.f36764y;
            if (list != null && list.size() > 0) {
                Iterator<CampaignEx> it = this.f36764y.iterator();
                while (it.hasNext()) {
                    a(it.next());
                }
            }
            CampaignEx campaignEx = this.f36762w;
            if (campaignEx != null) {
                a(campaignEx);
            }
        } catch (Throwable th2) {
            q0.b("MBRewardVideoActivity", th2.getMessage());
        }
    }

    private com.mbridge.msdk.video.bt.module.listener.a i() {
        if (this.C == null) {
            this.C = new c();
        }
        return this.C;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        List<CampaignEx> list;
        RewardPlus rewardPlus;
        CampaignEx campaignEx;
        List<CampaignEx> list2;
        int iFindID = findID("mbridge_temp_container");
        if (!i0.a(iFindID)) {
            b("no id mbridge_bt_container in mbridge_more_offer_activity layout");
        }
        MBTempContainer mBTempContainer = (MBTempContainer) findViewById(iFindID);
        this.f36765z = mBTempContainer;
        if (mBTempContainer == null) {
            b("env error");
        }
        List<CampaignEx> list3 = this.f36764y;
        if (list3 == null || list3.size() <= 0 || !this.f36764y.get(0).isDynamicView()) {
            this.f36765z.setVisibility(0);
        } else {
            new com.mbridge.msdk.video.dynview.ui.b().a(this.f36765z, 500L);
        }
        changeHalfScreenPadding(-1);
        this.f36765z.setActivity(this);
        this.f36765z.setBidCampaign(this.f36751l);
        this.f36765z.setBigOffer(this.f36755p);
        this.f36765z.setUnitId(this.f36745f);
        this.f36765z.setCampaign(this.f36762w);
        if (this.f36762w.getDynamicTempCode() == 5 && (list2 = this.f36764y) != null && list2.size() > 1) {
            View viewFindViewById = findViewById(findID("mbridge_reward_root_container"));
            if (viewFindViewById != null) {
                viewFindViewById.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
            }
            this.f36765z.removeAllViews();
            this.f36765z.setCampOrderViewData(this.f36764y, this.H);
            this.f36765z.setCamPlayOrderCallback(this.f36743a0, this.G);
        }
        this.f36765z.setCampaignDownLoadTask(this.f36761v);
        this.f36765z.setIV(this.f36750k);
        CampaignEx campaignEx2 = this.f36762w;
        if (campaignEx2 == null || campaignEx2.getAdSpaceT() != 2) {
            this.f36765z.setIVRewardEnable(this.f36752m, this.f36753n, this.f36754o);
        } else {
            this.f36765z.setIVRewardEnable(0, 0, 0);
        }
        this.f36765z.setMute(this.f36749j);
        CampaignEx campaignEx3 = this.f36762w;
        if (((campaignEx3 != null && (rewardPlus = campaignEx3.getRewardPlus()) != null) || ((list = this.f36764y) != null && list.size() > 0 && this.f36764y.get(0) != null && (rewardPlus = this.f36764y.get(0).getRewardPlus()) != null)) && !TextUtils.isEmpty(rewardPlus.getName()) && rewardPlus.getAmount() > 0) {
            com.mbridge.msdk.videocommon.entity.c cVar = new com.mbridge.msdk.videocommon.entity.c(rewardPlus.getName(), rewardPlus.getAmount());
            if (cVar.a() < 0) {
                cVar.a(1);
            }
            this.f36748i = cVar;
        }
        this.f36765z.setReward(this.f36748i);
        this.f36765z.setRewardUnitSetting(this.f36758s);
        this.f36765z.setPlacementId(this.f36746g);
        this.f36765z.setUserId(this.f36747h);
        this.f36765z.setShowRewardListener(this.f36757r);
        this.f36765z.setDeveloperExtraData(this.E);
        this.f36765z.init(this);
        this.f36765z.setAdSession(this.R);
        this.f36765z.setAdEvents(this.T);
        this.f36765z.setVideoEvents(this.S);
        this.f36765z.onCreate();
        if (!com.mbridge.msdk.util.b.a() || (campaignEx = this.f36762w) == null) {
            return;
        }
        d(campaignEx);
    }

    private void k() {
        RewardPlus rewardPlus;
        List<CampaignEx> list;
        int iFindID = findID("mbridge_bt_container");
        if (!i0.a(iFindID)) {
            b("no mbridge_webview_framelayout in mbridge_more_offer_activity layout");
        }
        MBridgeBTContainer mBridgeBTContainer = (MBridgeBTContainer) findViewById(iFindID);
        this.A = mBridgeBTContainer;
        if (mBridgeBTContainer == null) {
            b("env error");
        }
        this.A.setVisibility(0);
        com.mbridge.msdk.video.bt.module.listener.a aVarI = i();
        this.C = aVarI;
        this.A.setBTContainerCallback(aVarI);
        this.A.setShowRewardVideoListener(this.f36757r);
        this.A.setChoiceOneCallback(this.f36744b0);
        this.A.setCampaigns(this.f36764y);
        this.A.setCampaignDownLoadTasks(this.f36763x);
        this.A.setRewardUnitSetting(this.f36758s);
        this.A.setUnitId(this.f36745f);
        this.A.setPlacementId(this.f36746g);
        this.A.setUserId(this.f36747h);
        this.A.setActivity(this);
        CampaignEx campaignEx = this.f36762w;
        if (((campaignEx != null && (rewardPlus = campaignEx.getRewardPlus()) != null) || (this.f36764y.get(0) != null && (rewardPlus = this.f36764y.get(0).getRewardPlus()) != null)) && !TextUtils.isEmpty(rewardPlus.getName()) && rewardPlus.getAmount() > 0) {
            com.mbridge.msdk.videocommon.entity.c cVar = new com.mbridge.msdk.videocommon.entity.c(rewardPlus.getName(), rewardPlus.getAmount());
            if (cVar.a() < 0) {
                cVar.a(1);
            }
            this.f36748i = cVar;
        }
        this.A.setReward(this.f36748i);
        this.A.setIVRewardEnable(this.f36752m, this.f36753n, this.f36754o);
        this.A.setIV(this.f36750k);
        this.A.setMute(this.f36749j);
        this.A.setJSFactory((com.mbridge.msdk.video.signal.factory.b) this.jsFactory);
        this.A.setDeveloperExtraData(this.E);
        this.A.init(this);
        this.A.setAdSession(this.R);
        this.A.setVideoEvents(this.S);
        this.A.setAdEvents(this.T);
        this.A.onCreate(this.P);
        if (!com.mbridge.msdk.util.b.a() || (list = this.f36764y) == null || list.size() <= 0 || this.f36764y.get(0) == null) {
            return;
        }
        d(this.f36764y.get(0));
    }

    public static /* synthetic */ int m(MBRewardVideoActivity mBRewardVideoActivity) {
        int i10 = mBRewardVideoActivity.G;
        mBRewardVideoActivity.G = i10 + 1;
        return i10;
    }

    public void changeHalfScreenPadding(int i10) {
        int iF;
        int iG;
        int iG2;
        float f10;
        try {
            CampaignEx campaignEx = this.f36762w;
            if (campaignEx == null || campaignEx.getAdSpaceT() != 2) {
                return;
            }
            getWindow().getDecorView().setBackgroundColor(-1728053248);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f36765z.getLayoutParams();
            layoutParams.gravity = 17;
            if (this.f36762w.getRewardTemplateMode().g() == 0) {
                if (i10 == 2) {
                    iF = (int) (v0.f(this) * 0.6f);
                    iG2 = v0.g(this);
                    f10 = iG2 * 0.6f;
                } else {
                    iF = (int) (v0.f(this) * 0.6f);
                    iG = v0.g(this);
                    f10 = iG * 0.7f;
                }
            } else if (this.f36762w.getRewardTemplateMode().g() == 2) {
                iF = (int) (v0.f(this) * 0.6f);
                iG2 = v0.g(this);
                f10 = iG2 * 0.6f;
            } else {
                iF = (int) (v0.f(this) * 0.6f);
                iG = v0.g(this);
                f10 = iG * 0.7f;
            }
            layoutParams.height = iF;
            layoutParams.width = (int) f10;
            this.f36765z.setLayoutParams(layoutParams);
        } catch (Throwable th2) {
            q0.b("MBRewardVideoActivity", th2.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.signal.activity.AbstractJSActivity, com.mbridge.msdk.activity.MBBaseActivity, android.app.Activity
    public void onDestroy() {
        String str;
        int i10;
        if (TextUtils.isEmpty(this.V)) {
            str = "onDestroy";
        } else {
            str = this.V + "_onDestroy";
        }
        this.V = str;
        super.onDestroy();
        f();
        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
        eVar.a("activity_life_cycle", TextUtils.isEmpty(this.V) ? "unKnown" : this.V);
        eVar.a("activity_duration", Long.valueOf(SystemClock.elapsedRealtime() - this.U));
        Boolean bool = this.W;
        int i11 = 0;
        if (bool == null) {
            i10 = 0;
        } else {
            i10 = bool.booleanValue() ? 1 : 2;
        }
        eVar.a("is_unexpected_destroy", Integer.valueOf(i10));
        eVar.a("is_listener_null", Integer.valueOf(this.f36757r == null ? 1 : 2));
        eVar.a("is_called_finish", Integer.valueOf(this.Y ? 1 : 2));
        eVar.a("is_back_pressed", Integer.valueOf(this.Z ? 1 : 2));
        h hVar = this.f36757r;
        if (hVar != null) {
            i11 = hVar.hashCode() == this.X ? 1 : 2;
        }
        eVar.a("is_listener_change", Integer.valueOf(i11));
        com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000151", this.f36762w, eVar);
        g();
        com.mbridge.msdk.video.module.report.b.a(this.f36745f);
        h();
        MBTempContainer mBTempContainer = this.f36765z;
        if (mBTempContainer != null) {
            mBTempContainer.onDestroy();
            this.f36765z = null;
        }
        MBridgeBTContainer mBridgeBTContainer = this.A;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onDestroy();
            this.A = null;
        }
        this.f36743a0 = null;
        this.f36744b0 = null;
        com.mbridge.msdk.foundation.feedback.b.b().d(this.f36745f + "_1");
        com.mbridge.msdk.foundation.feedback.b.b().d(this.f36745f + "_2");
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new e(this.f36763x, this.f36745f, this.D));
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean(SAVE_STATE_KEY_REPORT, this.f36760u);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public void onStop() {
        String str;
        if (TextUtils.isEmpty(this.V)) {
            str = "onStop";
        } else {
            str = this.V + "_onStop";
        }
        this.V = str;
        MBridgeConstans.isRewardActivityShowing = false;
        super.onStop();
        MBTempContainer mBTempContainer = this.f36765z;
        if (mBTempContainer != null) {
            mBTempContainer.onStop();
        }
        MBridgeBTContainer mBridgeBTContainer = this.A;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onStop();
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        super.setTheme(i0.a(this, "mbridge_transparent_theme", "style"));
    }

    @Override // com.mbridge.msdk.activity.MBBaseActivity
    public void setTopControllerPadding(int i10, int i11, int i12, int i13, int i14) {
        this.I = i11;
        this.K = i12;
        this.J = i13;
        this.L = i14;
        this.M = i10;
        MBTempContainer mBTempContainer = this.f36765z;
        if (mBTempContainer != null) {
            mBTempContainer.setNotchPadding(i10, i11, i12, i13, i14);
        }
        MBridgeBTContainer mBridgeBTContainer = this.A;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.setNotchPadding(i10, i11, i12, i13, i14);
        }
        com.mbridge.msdk.video.dynview.constant.a.a(i10, i11, i12, i13, i14);
    }

    public int findID(String str) {
        return i0.a(getApplicationContext(), str, "id");
    }

    public int findLayout(String str) {
        return i0.a(getApplicationContext(), str, "layout");
    }

    @Override // com.mbridge.msdk.video.signal.activity.AbstractJSActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f36765z != null) {
            changeHalfScreenPadding(configuration.orientation);
            this.f36765z.onConfigurationChanged(configuration);
        }
        MBridgeBTContainer mBridgeBTContainer = this.A;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onConfigurationChanged(configuration);
        }
    }

    @Override // com.mbridge.msdk.video.signal.activity.AbstractJSActivity, android.app.Activity
    public void onPause() {
        String str;
        super.onPause();
        if (TextUtils.isEmpty(this.V)) {
            str = C3426d4.i.f28567t0;
        } else {
            str = this.V + "_onPause";
        }
        this.V = str;
        MBTempContainer mBTempContainer = this.f36765z;
        if (mBTempContainer != null) {
            mBTempContainer.onPause();
        }
        MBridgeBTContainer mBridgeBTContainer = this.A;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onPause();
        }
    }

    @Override // android.app.Activity
    public void onRestart() {
        String str;
        super.onRestart();
        if (TextUtils.isEmpty(this.V)) {
            str = "onRestart";
        } else {
            str = this.V + "_onRestart";
        }
        this.V = str;
        MBTempContainer mBTempContainer = this.f36765z;
        if (mBTempContainer != null) {
            mBTempContainer.onRestart();
        }
        MBridgeBTContainer mBridgeBTContainer = this.A;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onRestart();
        }
    }

    @Override // com.mbridge.msdk.video.signal.activity.AbstractJSActivity, com.mbridge.msdk.activity.MBBaseActivity, android.app.Activity
    public void onResume() {
        String str;
        MBridgeVideoView mBridgeVideoView;
        super.onResume();
        if (TextUtils.isEmpty(this.V)) {
            str = C3426d4.i.f28569u0;
        } else {
            str = this.V + "_onResume";
        }
        this.V = str;
        if (com.mbridge.msdk.foundation.feedback.b.f34851f) {
            MBTempContainer mBTempContainer = this.f36765z;
            if (mBTempContainer != null && (mBridgeVideoView = mBTempContainer.mbridgeVideoView) != null) {
                mBridgeVideoView.setCover(false);
                return;
            }
            return;
        }
        com.mbridge.msdk.foundation.controller.c.n().a(this);
        try {
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new f(this.f36745f, this.f36763x));
        } catch (Throwable th2) {
            q0.b("MBRewardVideoActivity", th2.getMessage());
        }
        MBTempContainer mBTempContainer2 = this.f36765z;
        if (mBTempContainer2 != null) {
            mBTempContainer2.onResume();
        }
        MBridgeBTContainer mBridgeBTContainer = this.A;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onResume();
        }
    }

    @Override // android.app.Activity
    public void onStart() {
        String str;
        super.onStart();
        if (TextUtils.isEmpty(this.V)) {
            str = "onStart";
        } else {
            str = this.V + "_onStart";
        }
        this.V = str;
        if (com.mbridge.msdk.foundation.feedback.b.f34851f) {
            return;
        }
        new d();
        MBTempContainer mBTempContainer = this.f36765z;
        if (mBTempContainer != null) {
            mBTempContainer.onStart();
            this.f36762w.setCampaignUnitId(this.f36745f);
            com.mbridge.msdk.foundation.feedback.b.b().a(this.f36745f + "_1", this.f36762w);
        }
        MBridgeBTContainer mBridgeBTContainer = this.A;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onStart();
            List<CampaignEx> list = this.f36764y;
            if (list != null && list.size() > 0) {
                CampaignEx campaignEx = this.f36764y.get(0);
                campaignEx.setCampaignUnitId(this.f36745f);
                com.mbridge.msdk.foundation.feedback.b.b().a(this.f36745f + "_1", campaignEx);
            }
        }
        if (!this.F) {
            com.mbridge.msdk.foundation.feedback.b.b().a(this.f36745f + "_1", 1);
            com.mbridge.msdk.foundation.feedback.b.b().d(this.f36745f + "_2");
            this.F = true;
        }
    }

    private void b(CampaignEx campaignEx) {
        if (campaignEx != null) {
            try {
                if (campaignEx.isActiveOm() && this.R == null) {
                    AdSession adSessionA = com.mbridge.msdk.omsdk.b.a(getApplicationContext(), false, campaignEx.getOmid(), campaignEx.getRequestId(), campaignEx.getId(), this.f36745f, campaignEx.getVideoUrlEncode(), campaignEx.getRequestIdNotice());
                    this.R = adSessionA;
                    if (adSessionA != null) {
                        this.T = AdEvents.createAdEvents(adSessionA);
                        this.S = MediaEvents.createMediaEvents(this.R);
                    }
                }
            } catch (Throwable th2) {
                q0.b("MBRewardVideoActivity", th2.getMessage());
            }
        }
    }

    private WindVaneWebView a(String str) {
        com.mbridge.msdk.videocommon.a.C0412a c0412aB = com.mbridge.msdk.videocommon.a.b(str);
        if (c0412aB != null) {
            return c0412aB.b();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(int i10, int i11) {
        List<CampaignEx> list = this.f36764y;
        if (list == null || list.size() == 0) {
            return i10;
        }
        int videoLength = 0;
        int videoCompleteTime = 0;
        for (int i12 = 0; i12 < this.f36764y.size(); i12++) {
            if (this.f36764y.get(0) != null) {
                if (i12 == 0) {
                    videoCompleteTime = this.f36764y.get(0).getVideoCompleteTime();
                }
                videoLength += this.f36764y.get(i12).getVideoLength();
            }
        }
        if (i11 == 1) {
            if (i10 == 0) {
                if (videoLength >= 45) {
                    return 45;
                }
            } else if (videoLength > i10) {
                if (i10 > 45) {
                    return 45;
                }
                return i10;
            }
            return videoLength;
        }
        int videoLength2 = 0;
        for (int i13 = 0; i13 < i11 - 1; i13++) {
            if (this.f36764y.get(i13) != null) {
                videoLength2 += this.f36764y.get(i13).getVideoLength();
            }
        }
        if (videoCompleteTime > videoLength2) {
            return videoCompleteTime - videoLength2;
        }
        return 0;
    }

    private void e(CampaignEx campaignEx) {
        if (campaignEx != null) {
            int iA = a(campaignEx.getVideoCompleteTime(), this.G);
            this.f36762w = campaignEx;
            campaignEx.setCampaignIsFiltered(true);
            this.G = 1;
            this.f36762w.setVideoCompleteTime(iA);
            this.f36762w.setShowIndex(this.G);
            this.f36762w.setShowType(1);
            c(this.f36762w);
            return;
        }
        b("campaign is less");
    }

    private void b(List<CampaignEx> list) {
        int dynamicTempCode;
        if (list == null) {
            b("no available campaign");
            return;
        }
        if (list.size() == 0) {
            b("no available campaign");
            return;
        }
        if (list.get(0) != null) {
            dynamicTempCode = list.get(0).getDynamicTempCode();
            this.N = list.get(0).getCurrentLocalRid();
        } else {
            dynamicTempCode = 0;
        }
        if (dynamicTempCode != 5) {
            k();
            return;
        }
        for (CampaignEx campaignEx : list) {
            if (campaignEx != null) {
                this.H += campaignEx.getVideoLength();
            }
        }
        e(list.get(0));
    }

    private void a(CampaignEx campaignEx) {
        if (campaignEx != null) {
            if (!TextUtils.isEmpty(campaignEx.getImageUrl())) {
                com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(campaignEx.getImageUrl());
            }
            if (TextUtils.isEmpty(campaignEx.getIconUrl())) {
                return;
            }
            com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(campaignEx.getIconUrl());
        }
    }

    private void a(List<CampaignEx> list) {
        CampaignEx campaignEx;
        if (this.Q) {
            return;
        }
        if (list == null) {
            try {
                if (this.f36755p) {
                    list = this.f36764y;
                } else {
                    list = new ArrayList<>();
                    List<com.mbridge.msdk.videocommon.download.a> list2 = this.f36763x;
                    if (list2 != null && list2.get(0) != null && this.f36763x.get(0).h() != null) {
                        list.add(this.f36763x.get(0).h());
                    }
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                    return;
                }
                return;
            }
        }
        String currentLocalRid = "";
        if (list != null && !list.isEmpty() && (campaignEx = list.get(0)) != null) {
            currentLocalRid = campaignEx.getCurrentLocalRid();
        }
        if (!TextUtils.isEmpty(currentLocalRid)) {
            this.O = com.mbridge.msdk.foundation.same.report.metrics.d.b().b(currentLocalRid);
        }
        if (this.O == null) {
            this.O = new com.mbridge.msdk.foundation.same.report.metrics.c();
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, this.f36745f);
            eVar.a(CampaignEx.JSON_KEY_HB, Integer.valueOf(this.f36751l ? 1 : 0));
            eVar.a("adtp", Integer.valueOf(this.f36750k ? MBSupportMuteAdType.INTERSTITIAL_VIDEO : 94));
            eVar.a("lrid", this.N);
            eVar.a("his_reason", "show campaign is null");
            this.O.a("2000129", eVar);
        }
        if (list != null) {
            this.O.b(list);
        }
        this.Q = true;
        com.mbridge.msdk.reward.report.metrics.a.a().a("2000129", this.O);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        q0.b("MBRewardVideoActivity", str);
        a(this.f36764y);
        h hVar = this.f36757r;
        if (hVar != null) {
            hVar.a(this.O, str);
        }
        finish();
    }
}
