package com.mbridge.msdk.mbnative.controller;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.multidex.MultiDexExtractor;
import androidx.room.RoomMasterTable;
import com.iab.omid.library.mmadbridge.adsession.AdEvents;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.iab.omid.library.mmadbridge.adsession.FriendlyObstructionPurpose;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.download.download.HTMLResourceManager;
import com.mbridge.msdk.foundation.download.download.ResourceManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.b1;
import com.mbridge.msdk.foundation.tools.k0;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.mbridge.msdk.nativex.view.MBMediaView;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.out.NativeListener;
import com.unity3d.services.core.fid.Constants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class NativeController extends com.mbridge.msdk.mbnative.controller.a {

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final String f35808c0 = "NativeController";

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static Map<String, Long> f35809d0 = new HashMap();

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private static boolean f35810e0;
    private int A;
    private int B;
    private com.mbridge.msdk.foundation.same.task.b C;
    private List<com.mbridge.msdk.mbnative.controller.c> D;
    private List<com.mbridge.msdk.mbnative.controller.c.d> E;
    private CopyOnWriteArrayList<com.mbridge.msdk.foundation.same.task.a> F;
    private Hashtable<String, AdSession> G;
    private int H;
    private int I;
    private n J;
    private boolean K;
    private boolean L;
    private Timer M;
    private String N;
    private String O;
    private ViewTreeObserver.OnGlobalLayoutListener P;
    private com.mbridge.msdk.setting.l Q;
    private long R;
    private int S;
    private int T;
    private boolean U;
    private int V;
    private int W;
    private boolean X;
    private List<Campaign> Y;
    private String Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private AdSession f35811a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<Integer> f35812b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private AdEvents f35813b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<Integer> f35814c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Map<String, Object> f35815d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.mbridge.msdk.setting.j f35816e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.mbridge.msdk.mbnative.listener.a f35817f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private NativeListener.NativeTrackingListener f35818g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Context f35819h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f35820i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f35821j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Queue<Integer> f35822k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Queue<Long> f35823l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f35824m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private com.mbridge.msdk.foundation.same.report.h f35825n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f35826o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private com.mbridge.msdk.click.a f35827p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f35828q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f35829r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f35830s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f35831t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private String f35832u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f35833v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f35834w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f35835x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f35836y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f35837z;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f35838a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ NativeListener.NativeAdListener f35839b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f35840c;

        public a(List list, NativeListener.NativeAdListener nativeAdListener, int i10) {
            this.f35838a = list;
            this.f35839b = nativeAdListener;
            this.f35840c = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            List list = this.f35838a;
            if (list != null && list.size() > 0) {
                CampaignEx campaignEx = (CampaignEx) this.f35838a.get(0);
                NativeController.this.O = campaignEx.getRequestId();
                NativeController.this.Y = this.f35838a;
            }
            NativeController.this.f35833v = true;
            this.f35839b.onAdLoaded(this.f35838a, this.f35840c);
            com.mbridge.msdk.mbnative.report.a.a(NativeController.this.f35819h, (List<Campaign>) this.f35838a, NativeController.this.f35820i);
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.mbridge.msdk.mbnative.listener.a f35842a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CampaignEx f35843b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f35844c;

        public b(com.mbridge.msdk.mbnative.listener.a aVar, CampaignEx campaignEx, String str) {
            this.f35842a = aVar;
            this.f35843b = campaignEx;
            this.f35844c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f35842a.a(this.f35843b, this.f35844c);
        }
    }

    public class c implements com.mbridge.msdk.foundation.same.image.c {
        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
        }

        public c() {
        }
    }

    public class d extends TimerTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f35847a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o f35848b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List f35849c;

        public d(long j10, o oVar, List list) {
            this.f35847a = j10;
            this.f35848b = oVar;
            this.f35849c = list;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            boolean z10;
            if (System.currentTimeMillis() - this.f35847a >= 60000) {
                this.f35848b.a();
                NativeController.this.c();
                return;
            }
            int iS = m0.s(NativeController.this.f35819h);
            int iQ = NativeController.this.h().q();
            if (iS != 9 && iQ == 2) {
                this.f35848b.a();
                NativeController.this.c();
                return;
            }
            if (iQ == 3) {
                this.f35848b.a();
                NativeController.this.c();
                return;
            }
            loop0: while (true) {
                z10 = false;
                for (Campaign campaign : this.f35849c) {
                    String id2 = campaign.getId();
                    if (campaign instanceof CampaignEx) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(id2);
                        CampaignEx campaignEx = (CampaignEx) campaign;
                        sb2.append(campaignEx.getVideoUrlEncode());
                        sb2.append(campaignEx.getBidToken());
                        id2 = sb2.toString();
                    }
                    com.mbridge.msdk.videocommon.download.a aVarA = com.mbridge.msdk.videocommon.download.b.getInstance().a(NativeController.this.f35820i, id2);
                    if (aVarA != null && com.mbridge.msdk.videocommon.download.l.a(aVarA, NativeController.this.h().C())) {
                        z10 = true;
                    }
                }
                break loop0;
            }
            if (z10) {
                this.f35848b.a();
                NativeController.this.c();
            }
        }
    }

    public class e implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ImageView f35851a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f35852b;

        public e(ImageView imageView, View view) {
            this.f35851a = imageView;
            this.f35852b = view;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (this.f35851a != null) {
                this.f35851a.setLayoutParams(new FrameLayout.LayoutParams(this.f35852b.getWidth(), this.f35852b.getHeight()));
            }
        }
    }

    public class f extends com.mbridge.msdk.widget.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CampaignEx f35854b;

        public f(CampaignEx campaignEx) {
            this.f35854b = campaignEx;
        }

        @Override // com.mbridge.msdk.widget.a
        public void a(View view) {
            NativeController.this.b(view.getContext(), this.f35854b);
        }
    }

    public class g extends com.mbridge.msdk.widget.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CampaignEx f35856b;

        public g(CampaignEx campaignEx) {
            this.f35856b = campaignEx;
        }

        @Override // com.mbridge.msdk.widget.a
        public void a(View view) {
            NativeController.this.b(view.getContext(), this.f35856b);
        }
    }

    public class h implements com.mbridge.msdk.widget.dialog.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CampaignEx f35858a;

        @Override // com.mbridge.msdk.widget.dialog.b
        public void a() {
        }

        @Override // com.mbridge.msdk.widget.dialog.b
        public void c() {
        }

        public h(CampaignEx campaignEx) {
            this.f35858a = campaignEx;
        }

        @Override // com.mbridge.msdk.widget.dialog.b
        public void b() {
            NativeController.this.f35827p.a(this.f35858a, NativeController.this.f35817f);
            NativeController.this.b(this.f35858a);
        }
    }

    public class i extends com.mbridge.msdk.widget.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CampaignEx f35860b;

        public i(CampaignEx campaignEx) {
            this.f35860b = campaignEx;
        }

        @Override // com.mbridge.msdk.widget.a
        public void a(View view) {
            NativeController.this.b(view.getContext(), this.f35860b);
        }
    }

    public class j implements com.mbridge.msdk.foundation.same.task.a.InterfaceC0332a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ s f35862a;

        public j(s sVar) {
            this.f35862a = sVar;
        }

        @Override // com.mbridge.msdk.foundation.same.task.a.InterfaceC0332a
        public void a(com.mbridge.msdk.foundation.same.task.a.b bVar) {
            if (bVar != com.mbridge.msdk.foundation.same.task.a.b.FINISH || NativeController.this.F == null || NativeController.this.F.size() <= 0 || !NativeController.this.F.contains(this.f35862a)) {
                return;
            }
            NativeController.this.F.remove(this.f35862a);
        }
    }

    public class k implements com.mbridge.msdk.mbnative.controller.c.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CampaignEx f35864a;

        public k(CampaignEx campaignEx) {
            this.f35864a = campaignEx;
        }

        @Override // com.mbridge.msdk.mbnative.controller.c.d
        public void a(ArrayList<View> arrayList, ArrayList<View> arrayList2) {
            if (arrayList == null || arrayList.isEmpty()) {
                return;
            }
            com.mbridge.msdk.mbnative.report.b.a(this.f35864a, NativeController.this.f35819h, NativeController.this.f35820i, NativeController.this.f35817f);
        }
    }

    public class l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f35866a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f35867b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.mbridge.msdk.mbnative.listener.a f35868c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ List f35869d;

        public l(List list, int i10, com.mbridge.msdk.mbnative.listener.a aVar, List list2) {
            this.f35866a = list;
            this.f35867b = i10;
            this.f35868c = aVar;
            this.f35869d = list2;
        }

        @Override // com.mbridge.msdk.mbnative.controller.NativeController.o
        public void a() {
            List listA = NativeController.this.a((List<Campaign>) this.f35866a, true);
            if (listA == null || listA.size() <= 0) {
                NativeController.this.a(this.f35868c, "has no ads", (CampaignEx) this.f35869d.get(0));
            } else {
                NativeController.this.a((List<Campaign>) listA, this.f35867b, this.f35868c);
            }
        }
    }

    public class m implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f35871a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f35872b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.mbridge.msdk.mbnative.listener.a f35873c;

        public m(List list, int i10, com.mbridge.msdk.mbnative.listener.a aVar) {
            this.f35871a = list;
            this.f35872b = i10;
            this.f35873c = aVar;
        }

        @Override // com.mbridge.msdk.mbnative.controller.NativeController.o
        public void a() {
            List listA = NativeController.this.a((List<Campaign>) this.f35871a, false);
            if (listA == null || listA.size() <= 0) {
                NativeController.this.a(this.f35873c, "has no ads", (CampaignEx) null);
            } else {
                NativeController.this.a((List<Campaign>) listA, this.f35872b, this.f35873c);
            }
        }
    }

    public class n extends com.mbridge.msdk.mbnative.service.net.b implements com.mbridge.msdk.foundation.same.task.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Runnable f35876d;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f35875c = false;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f35877e = true;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private List<String> f35878f = null;

        public class a extends com.mbridge.msdk.foundation.same.c.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ CampaignEx f35880a;

            public a(CampaignEx campaignEx, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
                this.f35880a = campaignEx;
            }

            @Override // com.mbridge.msdk.foundation.same.c.a
            public void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
                com.mbridge.msdk.mbnative.report.a.a(str, cVar, this.f35880a, NativeController.this.f35819h, (com.mbridge.msdk.foundation.same.report.metrics.callback.a) null);
            }
        }

        @Override // com.mbridge.msdk.foundation.same.task.d
        public void a(boolean z10) {
            this.f35875c = z10;
        }

        public void b(boolean z10) {
            this.f35877e = z10;
        }

        public n() {
        }

        @Override // com.mbridge.msdk.mbnative.service.net.b
        public void a(List<com.mbridge.msdk.tracker.network.g> list, CampaignUnit campaignUnit) {
            Integer num;
            boolean z10 = true;
            NativeController.this.U = true;
            com.mbridge.msdk.foundation.db.j jVarA = com.mbridge.msdk.foundation.db.j.a(com.mbridge.msdk.foundation.db.g.a(NativeController.this.f35819h));
            jVarA.d();
            Runnable runnable = this.f35876d;
            if (runnable != null) {
                NativeController.this.f35901a.removeCallbacks(runnable);
            }
            if (com.mbridge.msdk.util.b.a()) {
                NativeController.this.a(campaignUnit);
            }
            if (campaignUnit == null || campaignUnit.getAds() == null || campaignUnit.getAds().size() <= 0) {
                this.unitId = "0_" + this.unitId;
                com.mbridge.msdk.mbnative.controller.d.b(NativeController.this.f35830s, this.unitId);
                NativeController.this.f35831t = 0;
                return;
            }
            NativeController.this.f35826o = campaignUnit.getSessionId();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int i10 = 2;
            if (NativeController.this.S <= 0) {
                if (NativeController.this.S == -3) {
                    NativeController.this.S = campaignUnit.getAds().size();
                } else {
                    NativeController nativeController = NativeController.this;
                    nativeController.S = nativeController.f35829r;
                }
                if (NativeController.this.V != 0 && campaignUnit.getTemplate() == 2) {
                    NativeController nativeController2 = NativeController.this;
                    nativeController2.S = nativeController2.V;
                }
                if (NativeController.this.W != 0 && campaignUnit.getTemplate() == 3) {
                    NativeController nativeController3 = NativeController.this;
                    nativeController3.S = nativeController3.W;
                }
            }
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("adtp", 42);
            if (TextUtils.isEmpty(b())) {
                eVar.a(CampaignEx.JSON_KEY_HB, 0);
            } else {
                eVar.a(CampaignEx.JSON_KEY_HB, 1);
            }
            com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.foundation.same.report.metrics.d.b().a(true, b(), eVar, campaignUnit.getAds().get(0), this.unitId);
            int i11 = 0;
            while (i11 < campaignUnit.getAds().size()) {
                CampaignEx campaignEx = campaignUnit.getAds().get(i11);
                campaignEx.setLocalRequestId(cVarA.t());
                campaignEx.setCampaignUnitId(this.unitId);
                if (!TextUtils.isEmpty(NativeController.this.N)) {
                    campaignEx.setBidToken(NativeController.this.N);
                    campaignEx.setIsBidCampaign(z10);
                }
                if (NativeController.f35810e0) {
                    campaignEx.loadIconUrlAsyncWithBlock(null);
                    campaignEx.loadImageUrlAsyncWithBlock(null);
                }
                boolean zC = v0.c(NativeController.this.f35819h, campaignEx.getPackageName());
                NativeController nativeController4 = NativeController.this;
                nativeController4.a(nativeController4.f35819h, campaignEx);
                if (i11 < NativeController.this.f35829r && campaignEx.getOfferType() != 99) {
                    if (v0.c(campaignEx)) {
                        campaignEx.setRtinsType(zC ? 1 : i10);
                    }
                    if (com.mbridge.msdk.foundation.same.c.b(NativeController.this.f35819h, campaignEx)) {
                        arrayList.add(campaignEx);
                        if (!TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
                            arrayList3.add(campaignEx);
                        }
                    } else {
                        v0.a(this.unitId, campaignEx, com.mbridge.msdk.foundation.same.a.f34914x);
                        NativeController.this.Z = "APP ALREADY INSTALLED";
                    }
                    a(campaignEx, null, null);
                }
                if (i11 < NativeController.this.S && campaignEx.getOfferType() != 99) {
                    if (v0.c(campaignEx)) {
                        campaignEx.setRtinsType(zC ? 1 : 2);
                    }
                    if (!zC || v0.c(campaignEx)) {
                        arrayList2.add(campaignEx);
                    }
                }
                if (!jVarA.a(campaignEx.getId())) {
                    com.mbridge.msdk.foundation.entity.g gVar = new com.mbridge.msdk.foundation.entity.g();
                    gVar.a(campaignEx.getId());
                    gVar.b(campaignEx.getFca());
                    gVar.c(campaignEx.getFcb());
                    gVar.a(0);
                    gVar.d(0);
                    gVar.a(System.currentTimeMillis());
                    jVarA.b(gVar);
                }
                com.mbridge.msdk.click.c.a(NativeController.this.f35819h, campaignEx.getMaitve(), campaignEx.getMaitve_src());
                i11++;
                z10 = true;
                i10 = 2;
            }
            NativeController.this.d(arrayList3);
            int type = campaignUnit.getAds().get(0) != null ? campaignUnit.getAds().get(0).getType() : 1;
            com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>> bVarA = com.mbridge.msdk.mbnative.cache.c.a(type);
            if (bVarA != null) {
                bVarA.a(this.unitId, arrayList2, NativeController.this.N);
            }
            if (arrayList.size() == 0) {
                if (NativeController.this.Z.contains("INSTALLED")) {
                    NativeController.this.a("APP ALREADY INSTALLED", a(), b(), campaignUnit.getAds().get(0));
                    new com.mbridge.msdk.foundation.error.b(880021, "APP ALREADY INSTALLED");
                    return;
                } else {
                    NativeController.this.a("v3 response error", a(), b(), campaignUnit.getAds().get(0));
                    new com.mbridge.msdk.foundation.error.b(880003);
                    return;
                }
            }
            NativeController nativeController5 = NativeController.this;
            nativeController5.c((List<Campaign>) nativeController5.a(type, (List<Campaign>) nativeController5.a(arrayList)));
            if (com.mbridge.msdk.mbnative.controller.d.g().containsKey(this.unitId) && Boolean.TRUE.equals(com.mbridge.msdk.mbnative.controller.d.g().get(this.unitId))) {
                com.mbridge.msdk.mbnative.controller.d.a(NativeController.this.f35830s, this.unitId);
                return;
            }
            int iIntValue = (!com.mbridge.msdk.mbnative.controller.d.d().containsKey(this.unitId) || (num = com.mbridge.msdk.mbnative.controller.d.d().get(this.unitId)) == null) ? 1 : num.intValue();
            int i12 = NativeController.this.f35829r + NativeController.this.f35831t;
            NativeController.this.f35831t = i12 <= iIntValue ? i12 : 0;
        }

        public void b(List<String> list) {
            this.f35878f = list;
        }

        private void a(CampaignEx campaignEx, com.mbridge.msdk.foundation.same.report.metrics.c cVar, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
            try {
                com.mbridge.msdk.foundation.same.c.a(campaignEx, NativeController.this.f35819h, cVar, new a(campaignEx, aVar));
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                }
            }
        }

        @Override // com.mbridge.msdk.mbnative.service.net.b
        public void a(int i10, String str) {
            NativeController.this.U = true;
            if (this.f35875c) {
                if (NativeController.this.f35833v || !this.f35877e) {
                    return;
                }
                NativeController.this.a(str, a(), b(), (CampaignEx) null);
                return;
            }
            if (i10 == -1) {
                com.mbridge.msdk.mbnative.controller.d.b(NativeController.this.f35830s, this.unitId);
                NativeController.this.f35831t = 0;
            }
            Runnable runnable = this.f35876d;
            if (runnable != null) {
                NativeController.this.f35901a.removeCallbacks(runnable);
            }
            if (NativeController.this.f35833v) {
                return;
            }
            if (a() == 1 || this.f35877e) {
                NativeController.this.a(str, a(), b(), (CampaignEx) null);
            }
        }

        public void a(Runnable runnable) {
            this.f35876d = runnable;
        }

        @Override // com.mbridge.msdk.mbnative.service.net.b
        public void a(List<Frame> list) {
            if (this.f35875c) {
                return;
            }
            Runnable runnable = this.f35876d;
            if (runnable != null) {
                NativeController.this.f35901a.removeCallbacks(runnable);
            }
            if (list == null || list.size() == 0) {
                if (NativeController.this.f35817f != null) {
                    NativeController.this.f35833v = true;
                    NativeController.this.f35817f.onAdLoadError("frame is empty");
                    return;
                }
                return;
            }
            Iterator<Frame> it = list.iterator();
            while (it.hasNext()) {
                List<CampaignEx> campaigns = it.next().getCampaigns();
                if (campaigns == null || campaigns.size() == 0) {
                    if (NativeController.this.f35817f != null) {
                        NativeController.this.f35833v = true;
                        NativeController.this.f35817f.onAdLoadError("ads in frame is empty");
                        return;
                    }
                    return;
                }
                for (CampaignEx campaignEx : campaigns) {
                    if (NativeController.f35810e0) {
                        campaignEx.loadImageUrlAsyncWithBlock(null);
                        campaignEx.loadIconUrlAsyncWithBlock(null);
                    }
                }
            }
            if (NativeController.this.f35817f != null) {
                NativeController.this.f35817f.onAdFramesLoaded(list);
            }
        }
    }

    public interface o {
        void a();
    }

    public class p implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f35882a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private com.mbridge.msdk.foundation.same.task.d f35883b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f35884c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f35885d;

        public p(int i10, com.mbridge.msdk.foundation.same.task.d dVar, int i11, String str) {
            this.f35882a = i10;
            this.f35883b = dVar;
            this.f35884c = i11;
            this.f35885d = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f35883b.a(true);
            int i10 = this.f35882a;
            if (i10 == 1) {
                NativeController.this.U = true;
                NativeController.this.a("REQUEST_TIMEOUT", this.f35884c, this.f35885d, (CampaignEx) null);
            } else {
                if (i10 != 2) {
                    return;
                }
                if (!NativeController.this.f35833v || this.f35884c == 1) {
                    NativeController.this.a("REQUEST_TIMEOUT", this.f35884c, this.f35885d, (CampaignEx) null);
                }
            }
        }
    }

    public static class q implements H5DownLoadManager.IH5SourceDownloadListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f35887a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private CampaignEx f35888b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f35889c = System.currentTimeMillis();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f35890d;

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onFailed(String str, String str2) {
            try {
                if (this.f35890d) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - this.f35889c;
                    com.mbridge.msdk.foundation.db.n.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
                    com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n("2000043", 3, jCurrentTimeMillis + "", str, this.f35888b.getId(), this.f35887a, str2, "2");
                    nVar.n(this.f35888b.getRequestId());
                    nVar.k(this.f35888b.getCurrentLocalRid());
                    nVar.o(this.f35888b.getRequestIdNotice());
                    CampaignEx campaignEx = this.f35888b;
                    if (campaignEx != null && !TextUtils.isEmpty(campaignEx.getId())) {
                        nVar.b(this.f35888b.getId());
                    }
                    CampaignEx campaignEx2 = this.f35888b;
                    if (campaignEx2 != null) {
                        nVar.a(campaignEx2.getAdSpaceT());
                    }
                    nVar.a("1");
                    com.mbridge.msdk.foundation.same.report.g.a(nVar, this.f35887a, this.f35888b);
                }
            } catch (Exception e10) {
                q0.b(NativeController.f35808c0, com.mbridge.msdk.mbnative.common.a.a(e10));
            }
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onSuccess(String str, String str2, boolean z10) {
            try {
                if (this.f35890d) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - this.f35889c;
                    com.mbridge.msdk.foundation.db.n.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
                    com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n("2000043", 1, jCurrentTimeMillis + "", str, this.f35888b.getId(), this.f35887a, "", "2");
                    CampaignEx campaignEx = this.f35888b;
                    if (campaignEx != null && !TextUtils.isEmpty(campaignEx.getId())) {
                        nVar.b(this.f35888b.getId());
                    }
                    CampaignEx campaignEx2 = this.f35888b;
                    if (campaignEx2 != null) {
                        nVar.n(campaignEx2.getRequestId());
                        nVar.o(this.f35888b.getRequestIdNotice());
                        nVar.k(this.f35888b.getCurrentLocalRid());
                        nVar.a(this.f35888b.getAdSpaceT());
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        nVar.q(str2);
                    }
                    nVar.a("1");
                    com.mbridge.msdk.foundation.same.report.g.a(nVar, this.f35887a, this.f35888b);
                }
            } catch (Exception e10) {
                q0.b(NativeController.f35808c0, com.mbridge.msdk.mbnative.common.a.a(e10));
            }
        }

        public q(String str, CampaignEx campaignEx, boolean z10) {
            this.f35890d = true;
            this.f35887a = str;
            this.f35888b = campaignEx;
            this.f35890d = z10;
        }
    }

    public static class s extends com.mbridge.msdk.foundation.same.task.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private CampaignEx f35892a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WeakReference<View> f35893b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference<List<View>> f35894c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private WeakReference<NativeController> f35895d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private WeakReference<AdSession> f35896e;

        @Override // com.mbridge.msdk.foundation.same.task.a
        public void cancelTask() {
        }

        @Override // com.mbridge.msdk.foundation.same.task.a
        public void pauseTask(boolean z10) {
        }

        @Override // com.mbridge.msdk.foundation.same.task.a
        public void runTask() {
            WeakReference<View> weakReference;
            try {
                if (this.f35895d == null || (weakReference = this.f35893b) == null || this.f35894c == null) {
                    return;
                }
                View view = weakReference.get();
                List<View> list = this.f35894c.get();
                NativeController nativeController = this.f35895d.get();
                WeakReference<AdSession> weakReference2 = this.f35896e;
                AdSession adSession = weakReference2 != null ? weakReference2.get() : null;
                if (view == null || nativeController == null) {
                    return;
                }
                nativeController.a(this.f35892a, view, list, adSession);
            } catch (Exception e10) {
                q0.b(NativeController.f35808c0, com.mbridge.msdk.mbnative.common.a.a(e10));
            }
        }

        public s(CampaignEx campaignEx, View view, List<View> list, NativeController nativeController, AdSession adSession) {
            this.f35892a = campaignEx;
            this.f35893b = new WeakReference<>(view);
            this.f35894c = new WeakReference<>(list);
            this.f35895d = new WeakReference<>(nativeController);
            this.f35896e = new WeakReference<>(adSession);
        }
    }

    public static final class t implements H5DownLoadManager.ZipDownloadListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f35897a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public CampaignEx f35898b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f35899c = System.currentTimeMillis();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f35900d;

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onFailed(String str, String str2) {
            try {
                if (this.f35900d) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - this.f35899c;
                    com.mbridge.msdk.foundation.db.n.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
                    com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n("2000043", 3, jCurrentTimeMillis + "", str2, this.f35898b.getId(), this.f35897a, str, "1");
                    CampaignEx campaignEx = this.f35898b;
                    if (campaignEx != null && !TextUtils.isEmpty(campaignEx.getId())) {
                        nVar.b(this.f35898b.getId());
                    }
                    CampaignEx campaignEx2 = this.f35898b;
                    if (campaignEx2 != null) {
                        nVar.n(campaignEx2.getRequestId());
                        nVar.k(this.f35898b.getCurrentLocalRid());
                        nVar.o(this.f35898b.getRequestIdNotice());
                        nVar.a(this.f35898b.getAdSpaceT());
                    }
                    nVar.a("2");
                    com.mbridge.msdk.foundation.same.report.g.a(nVar, this.f35897a, this.f35898b);
                }
            } catch (Exception e10) {
                q0.b(NativeController.f35808c0, com.mbridge.msdk.mbnative.common.a.a(e10));
            }
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onSuccess(String str, String str2, boolean z10) {
            try {
                if (this.f35900d) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - this.f35899c;
                    com.mbridge.msdk.foundation.db.n.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
                    com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n("2000043", 1, jCurrentTimeMillis + "", str, this.f35898b.getId(), this.f35897a, "", "1");
                    CampaignEx campaignEx = this.f35898b;
                    if (campaignEx != null && !TextUtils.isEmpty(campaignEx.getId())) {
                        nVar.b(this.f35898b.getId());
                    }
                    CampaignEx campaignEx2 = this.f35898b;
                    if (campaignEx2 != null) {
                        nVar.n(campaignEx2.getRequestId());
                        nVar.k(this.f35898b.getCurrentLocalRid());
                        nVar.o(this.f35898b.getRequestIdNotice());
                        nVar.a(this.f35898b.getAdSpaceT());
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        nVar.q(str2);
                    }
                    nVar.a("2");
                    com.mbridge.msdk.foundation.same.report.g.a(nVar, this.f35897a, this.f35898b);
                }
            } catch (Exception e10) {
                q0.b(NativeController.f35808c0, com.mbridge.msdk.mbnative.common.a.a(e10));
            }
        }

        public t(String str, CampaignEx campaignEx, boolean z10) {
            this.f35900d = true;
            this.f35897a = str;
            this.f35898b = campaignEx;
            this.f35900d = z10;
        }
    }

    public NativeController(com.mbridge.msdk.mbnative.listener.a aVar, NativeListener.NativeTrackingListener nativeTrackingListener, Map<String, Object> map, Context context) {
        int iIntValue;
        Object obj;
        this.f35828q = 1;
        this.f35829r = 1;
        this.f35830s = -1;
        this.f35831t = 0;
        this.f35833v = false;
        this.f35834w = false;
        this.f35835x = false;
        this.f35836y = 0;
        this.f35837z = 0;
        this.A = 0;
        this.B = 0;
        this.F = new CopyOnWriteArrayList<>();
        this.G = new Hashtable<>();
        this.H = 1;
        this.I = 2;
        this.N = "";
        this.O = "";
        this.Z = "";
        this.f35819h = context;
        this.f35815d = map;
        this.f35816e = new com.mbridge.msdk.setting.j();
        this.f35817f = aVar;
        this.f35818g = nativeTrackingListener;
        this.D = new ArrayList();
        this.E = new ArrayList();
        String str = (String) map.get(MBridgeConstans.PROPERTIES_UNIT_ID);
        this.f35820i = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!map.containsKey(MBridgeConstans.PLACEMENT_ID) || map.get(MBridgeConstans.PLACEMENT_ID) == null) {
            this.f35821j = "";
        } else {
            this.f35821j = (String) map.get(MBridgeConstans.PLACEMENT_ID);
        }
        if (map.containsKey(MBridgeConstans.PREIMAGE) && (obj = map.get(MBridgeConstans.PREIMAGE)) != null) {
            f35810e0 = ((Boolean) obj).booleanValue();
        }
        this.f35822k = new LinkedList();
        this.f35823l = new LinkedList();
        this.C = new com.mbridge.msdk.foundation.same.task.b(this.f35819h);
        if (Looper.myLooper() == null) {
            Looper.prepare();
        }
        this.f35901a = new r(this);
        if (map.containsKey(MBridgeConstans.PROPERTIES_API_REUQEST_CATEGORY)) {
            this.f35832u = (String) map.get(MBridgeConstans.PROPERTIES_API_REUQEST_CATEGORY);
        }
        try {
            boolean zEquals = com.mbridge.msdk.mbnative.controller.d.g().containsKey(this.f35820i) ? Boolean.TRUE.equals(com.mbridge.msdk.mbnative.controller.d.g().get(this.f35820i)) : false;
            Object obj2 = map.get("ad_num");
            Object obj3 = map.get(MBridgeConstans.PROPERTIES_AD_FRAME_NUM);
            if (zEquals) {
                if (com.mbridge.msdk.mbnative.controller.d.c().containsKey(this.f35820i)) {
                    Integer num = com.mbridge.msdk.mbnative.controller.d.c().get(this.f35820i);
                    if (num != null) {
                        this.f35829r = num.intValue();
                    }
                    if (map.containsKey("ad_num") && obj2 != null) {
                        int iIntValue2 = ((Integer) obj2).intValue();
                        this.f35836y = iIntValue2;
                        this.f35828q = iIntValue2;
                    }
                    if (map.containsKey(MBridgeConstans.PROPERTIES_AD_FRAME_NUM) && obj3 != null) {
                        int iIntValue3 = ((Integer) obj3).intValue();
                        this.f35837z = iIntValue3;
                        this.A = iIntValue3;
                    }
                }
            } else if (map.containsKey("ad_num") && obj2 != null) {
                try {
                    iIntValue = ((Integer) obj2).intValue();
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b(f35808c0, e10.getMessage());
                    }
                    iIntValue = 1;
                }
                iIntValue = iIntValue < 1 ? 1 : iIntValue;
                iIntValue = iIntValue > 10 ? 10 : iIntValue;
                this.f35829r = iIntValue;
                this.f35828q = iIntValue;
                if (map.containsKey(MBridgeConstans.PROPERTIES_AD_FRAME_NUM)) {
                    this.A = ((Integer) obj3).intValue();
                }
            } else if (map.containsKey(MBridgeConstans.PROPERTIES_AD_FRAME_NUM) && obj3 != null) {
                try {
                    this.A = ((Integer) obj3).intValue();
                } catch (Exception e11) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b(f35808c0, e11.getMessage());
                    }
                }
            }
        } catch (Exception e12) {
            q0.b(f35808c0, com.mbridge.msdk.mbnative.common.a.a(e12));
        }
        this.f35825n = new com.mbridge.msdk.foundation.same.report.h(this.f35819h);
        this.f35827p = new com.mbridge.msdk.click.a(this.f35819h, this.f35820i);
        try {
            int i10 = MBMediaView.f36227p0;
            this.L = true;
            Map<String, Object> map2 = this.f35815d;
            if (map2 != null && (map2.containsKey(MBridgeConstans.NATIVE_VIDEO_WIDTH) || this.f35815d.containsKey(MBridgeConstans.NATIVE_VIDEO_HEIGHT) || map.containsKey(MBridgeConstans.NATIVE_VIDEO_SUPPORT))) {
                this.K = true;
            }
            com.mbridge.msdk.mbnative.controller.e.a(this.f35819h, this.f35820i);
            o0.a();
            if (TextUtils.isEmpty(this.f35820i)) {
                return;
            }
            com.mbridge.msdk.foundation.db.e.a(com.mbridge.msdk.foundation.db.g.a(this.f35819h)).d();
            int iA = a(map.containsKey(MBridgeConstans.NATIVE_INFO) ? (String) map.get(MBridgeConstans.NATIVE_INFO) : null);
            List<Campaign> listA = a(this.f35820i, iA <= 0 ? this.f35828q : iA);
            if (listA != null) {
                ArrayList arrayList = new ArrayList();
                for (int i11 = 0; i11 < listA.size(); i11++) {
                    CampaignEx campaignEx = (CampaignEx) listA.get(i11);
                    if (!TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
                        arrayList.add(campaignEx);
                    }
                }
                if (arrayList.size() > 0) {
                    Object objInvoke = com.mbridge.msdk.videocommon.download.b.class.getMethod(Constants.GET_INSTANCE, new Class[0]).invoke(null, new Object[0]);
                    com.mbridge.msdk.videocommon.download.b.class.getMethod("createUnitCache", Context.class, String.class, CopyOnWriteArrayList.class, Integer.TYPE, com.mbridge.msdk.videocommon.listener.a.class).invoke(objInvoke, context, this.f35820i, new CopyOnWriteArrayList(arrayList), 1, null);
                    com.mbridge.msdk.videocommon.download.b.class.getMethod("load", String.class).invoke(objInvoke, this.f35820i);
                }
            }
        } catch (Throwable unused) {
            q0.b(f35808c0, "please import the nativex aar");
        }
    }

    public static class r extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<NativeController> f35891a;

        public r(NativeController nativeController) {
            this.f35891a = new WeakReference<>(nativeController);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            WeakReference<NativeController> weakReference;
            NativeController nativeController;
            super.handleMessage(message);
            try {
                if (message.what == 0 && (weakReference = this.f35891a) != null && (nativeController = weakReference.get()) != null) {
                    nativeController.f35825n.a(message.arg1, (String) message.obj);
                }
                if (message.what == 1) {
                    NativeController nativeController2 = null;
                    WeakReference<NativeController> weakReference2 = this.f35891a;
                    if (weakReference2 != null && weakReference2.get() != null) {
                        nativeController2 = this.f35891a.get();
                    }
                    if (nativeController2 != null) {
                        nativeController2.f35834w = true;
                        List<Campaign> listA = nativeController2.a(nativeController2.f35820i, nativeController2.f35829r, nativeController2.N);
                        if (!nativeController2.f35833v) {
                            nativeController2.c(listA);
                        }
                    }
                }
            } catch (Exception e10) {
                q0.b(NativeController.f35808c0, com.mbridge.msdk.mbnative.common.a.a(e10));
            }
        }
    }

    private List<Campaign> e(List<Campaign> list) {
        if (list != null) {
            CampaignEx campaignEx = null;
            for (int size = list.size() - 1; size >= 0; size--) {
                try {
                    campaignEx = (CampaignEx) list.get(size);
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
                if (campaignEx != null && TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
                    Campaign campaignRemove = list.remove(size);
                    com.mbridge.msdk.mbnative.cache.c.a(campaignEx.getType()).a(this.f35820i, campaignRemove, this.N);
                    q0.a(f35808c0, "remove no videoURL ads:" + campaignRemove);
                }
            }
        }
        return list;
    }

    private void f() {
        try {
            if (this.f35824m == null) {
                return;
            }
            JSONArray jSONArray = new JSONArray(this.f35824m);
            if (jSONArray.length() > 0) {
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObject = (JSONObject) jSONArray.opt(i10);
                    int iOptInt = jSONObject.optInt("id", 0);
                    if (2 == iOptInt) {
                        this.V = jSONObject.optInt("ad_num");
                        if (this.T > 0) {
                            jSONObject.remove("ad_num");
                            jSONObject.put("ad_num", this.T);
                        }
                    } else if (3 == iOptInt) {
                        this.W = jSONObject.optInt("ad_num");
                        if (this.T > 0) {
                            jSONObject.remove("ad_num");
                            jSONObject.put("ad_num", this.T);
                        }
                    }
                }
            }
            this.H = Math.max(this.V, this.W);
            this.f35824m = jSONArray.toString();
        } catch (JSONException e10) {
            q0.b(f35808c0, com.mbridge.msdk.mbnative.common.a.a(e10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.mbridge.msdk.setting.l h() {
        com.mbridge.msdk.setting.l lVarE = com.mbridge.msdk.setting.h.b().e("", this.f35820i);
        this.Q = lVarE;
        if (lVarE == null) {
            this.Q = com.mbridge.msdk.setting.l.i(this.f35820i);
        }
        return this.Q;
    }

    public String g() {
        return this.O;
    }

    public void i() {
        com.mbridge.msdk.foundation.same.task.a next;
        com.mbridge.msdk.foundation.same.task.b bVar = this.C;
        if (bVar != null) {
            bVar.a();
            this.C = null;
        }
        Hashtable<String, AdSession> hashtable = this.G;
        if (hashtable != null) {
            for (AdSession adSession : hashtable.values()) {
                if (adSession != null) {
                    adSession.finish();
                }
            }
            this.G.clear();
        }
        Handler handler = this.f35901a;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.f35818g = null;
        this.f35827p.c();
        try {
            Context context = this.f35819h;
            if (context != null) {
                com.mbridge.msdk.foundation.same.image.b.a(context).b();
            }
            List<com.mbridge.msdk.mbnative.controller.c> list = this.D;
            if (list != null && list.size() > 0) {
                Iterator<com.mbridge.msdk.mbnative.controller.c> it = this.D.iterator();
                while (it.hasNext()) {
                    it.next().a();
                }
                this.D.clear();
                this.D = null;
            }
            List<com.mbridge.msdk.mbnative.controller.c.d> list2 = this.E;
            if (list2 != null && list2.size() > 0) {
                for (com.mbridge.msdk.mbnative.controller.c.d dVar : this.E) {
                }
                this.E.clear();
                this.E = null;
            }
            CopyOnWriteArrayList<com.mbridge.msdk.foundation.same.task.a> copyOnWriteArrayList = this.F;
            if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
                return;
            }
            Iterator<com.mbridge.msdk.foundation.same.task.a> it2 = this.F.iterator();
            if (it2.hasNext() && (next = it2.next()) != null) {
                next.cancel();
                this.f35901a.removeCallbacks(next);
            }
            this.F.clear();
        } catch (Exception unused) {
        }
    }

    public void j() {
        List<Integer> list = this.f35812b;
        if (list != null && list.size() > 0) {
            Queue<Integer> queue = this.f35822k;
            if (queue != null && queue.size() > 0) {
                this.f35822k.clear();
            }
            for (Integer num : this.f35812b) {
                Queue<Integer> queue2 = this.f35822k;
                if (queue2 != null) {
                    queue2.add(num);
                }
            }
        }
        List<Integer> list2 = this.f35814c;
        if (list2 == null || list2.size() <= 0) {
            return;
        }
        Queue<Long> queue3 = this.f35823l;
        if (queue3 != null && queue3.size() > 0) {
            this.f35823l.clear();
        }
        for (Integer num2 : this.f35814c) {
            Queue<Long> queue4 = this.f35823l;
            if (queue4 != null) {
                queue4.add(Long.valueOf(num2.intValue() * 1000));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(List<CampaignEx> list) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    try {
                        int i10 = MBMediaView.f36227p0;
                        Object objInvoke = com.mbridge.msdk.videocommon.download.b.class.getMethod(Constants.GET_INSTANCE, new Class[0]).invoke(null, new Object[0]);
                        if (objInvoke != null) {
                            com.mbridge.msdk.videocommon.download.b.class.getMethod("createUnitCache", Context.class, String.class, CopyOnWriteArrayList.class, Integer.TYPE, com.mbridge.msdk.videocommon.listener.a.class).invoke(objInvoke, this.f35819h, this.f35820i, new CopyOnWriteArrayList(list), 1, null);
                            com.mbridge.msdk.videocommon.download.b.class.getMethod("load", String.class).invoke(objInvoke, this.f35820i);
                        }
                        Iterator<CampaignEx> it = list.iterator();
                        while (it.hasNext()) {
                            CampaignEx next = it.next();
                            if (next != null && !TextUtils.isEmpty(next.getImageUrl())) {
                                com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(next.getImageUrl(), new c());
                            }
                            String str = "";
                            if (next != null) {
                                try {
                                    str = next.getendcard_url();
                                } catch (Exception unused) {
                                }
                            }
                            com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
                            cVar.a(next);
                            if (!TextUtils.isEmpty(str)) {
                                cVar.f((next == null || next.getAabEntity() == null) ? 0 : next.getAabEntity().h3c);
                                if (str.contains(MultiDexExtractor.EXTRACTED_SUFFIX) && str.contains(ResourceManager.KEY_MD5FILENAME)) {
                                    H5DownLoadManager.getInstance().downloadH5Res(cVar, str, new t(this.f35820i, next, TextUtils.isEmpty(H5DownLoadManager.getInstance().getH5ResAddress(str))));
                                } else {
                                    H5DownLoadManager.getInstance().downloadH5Res(cVar, str, new q(this.f35820i, next, TextUtils.isEmpty(HTMLResourceManager.getInstance().getHtmlContentFromUrl(str))));
                                }
                            }
                        }
                    } catch (Throwable unused2) {
                        q0.b(f35808c0, "please import the videocommon and nativex aar");
                    }
                }
            } catch (Throwable th2) {
                if (MBridgeConstans.DEBUG) {
                    th2.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(List<Campaign> list) {
        if ((!TextUtils.isEmpty(this.N) && list != null && list.size() == 0) || list == null || list.size() <= 0) {
            return false;
        }
        com.mbridge.msdk.mbnative.listener.a aVar = this.f35817f;
        if (aVar == null) {
            return true;
        }
        CampaignEx campaignEx = (CampaignEx) list.get(0);
        if (campaignEx != null && campaignEx.isActiveOm()) {
            AdSession adSessionA = a(campaignEx);
            this.f35811a0 = adSessionA;
            if (adSessionA != null) {
                adSessionA.start();
                AdEvents adEventsCreateAdEvents = AdEvents.createAdEvents(this.f35811a0);
                this.f35813b0 = adEventsCreateAdEvents;
                adEventsCreateAdEvents.loaded();
            }
        }
        int template = campaignEx != null ? campaignEx.getTemplate() : 2;
        com.mbridge.msdk.foundation.db.j jVarA = com.mbridge.msdk.foundation.db.j.a(com.mbridge.msdk.foundation.db.g.a(this.f35819h));
        jVarA.d();
        for (int i10 = 0; i10 < list.size(); i10++) {
            CampaignEx campaignEx2 = (CampaignEx) list.get(i10);
            if (!jVarA.a(campaignEx2.getId())) {
                com.mbridge.msdk.foundation.entity.g gVar = new com.mbridge.msdk.foundation.entity.g();
                gVar.a(campaignEx2.getId());
                gVar.b(campaignEx2.getFca());
                gVar.c(campaignEx2.getFcb());
                gVar.a(0);
                gVar.d(0);
                gVar.a(System.currentTimeMillis());
                jVarA.b(gVar);
            }
        }
        if (this.L && this.K) {
            if (h().m() == 3) {
                List<Campaign> listE = e(list);
                if (list.size() > 0) {
                    a(list, new l(listE, template, aVar, list));
                    return true;
                }
                a(aVar, "has no ads", (CampaignEx) null);
                return true;
            }
            List<Campaign> listB = b(list);
            if (listB != null && listB.size() > 0) {
                a(listB, new m(list, template, aVar));
                return true;
            }
            a(list, template, aVar);
            return true;
        }
        if (list.size() > 0) {
            Iterator<Campaign> it = list.iterator();
            while (it.hasNext()) {
                it.next().setVideoLength(0);
            }
            a(list, template, aVar);
            return true;
        }
        a(aVar, "has no ads", (CampaignEx) null);
        return true;
    }

    public static boolean b(Map<String, Object> map) {
        if (map == null) {
            return false;
        }
        try {
            return map.containsKey("app_id") && map.containsKey(MBridgeConstans.APP_KEY) && map.containsKey(MBridgeConstans.KEY_WORD) && map.get(MBridgeConstans.KEY_WORD) != null;
        } catch (Exception e10) {
            q0.b(f35808c0, com.mbridge.msdk.mbnative.common.a.a(e10));
            return false;
        }
    }

    public void b(int i10, String str) {
        com.mbridge.msdk.mbnative.listener.a aVar;
        Long lPoll;
        Queue<Integer> queue = this.f35822k;
        if (queue != null && queue.size() > 0) {
            Integer numPoll = this.f35822k.poll();
            int iIntValue = numPoll != null ? numPoll.intValue() : 1;
            this.R = MBridgeConstans.REQUEST_TIME_OUT;
            Queue<Long> queue2 = this.f35823l;
            if (queue2 != null && queue2.size() > 0 && (lPoll = this.f35823l.poll()) != null) {
                this.R = lPoll.longValue();
            }
            b(iIntValue, this.R, i10, str);
            return;
        }
        if (this.f35833v || (aVar = this.f35817f) == null) {
            return;
        }
        this.f35833v = true;
        aVar.onAdLoadError("no ad source");
    }

    public String e() {
        ArrayList arrayList = new ArrayList();
        List<Campaign> list = this.Y;
        if (list != null) {
            for (Campaign campaign : list) {
                CampaignEx campaignEx = new CampaignEx();
                campaignEx.setCreativeId(campaign.getCreativeId());
                arrayList.add(campaignEx);
            }
        }
        return com.mbridge.msdk.foundation.same.c.b(arrayList);
    }

    public static List<String> a(Map<String, Object> map) {
        Exception e10;
        ArrayList arrayList = null;
        try {
            if (!(map.get(MBridgeConstans.KEY_WORD) instanceof String)) {
                return null;
            }
            String str = (String) map.get(MBridgeConstans.KEY_WORD);
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() == 0) {
                return null;
            }
            ArrayList arrayList2 = new ArrayList();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                try {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                    if (jSONObjectOptJSONObject != null) {
                        String strOptString = jSONObjectOptJSONObject.optString("p");
                        if (TextUtils.isEmpty(strOptString)) {
                            continue;
                        } else {
                            arrayList2.add(strOptString);
                        }
                    }
                } catch (Exception e11) {
                    e10 = e11;
                    arrayList = arrayList2;
                }
            }
            return arrayList2;
        } catch (Exception e12) {
            e10 = e12;
        }
        q0.b(f35808c0, com.mbridge.msdk.mbnative.common.a.a(e10));
        return arrayList;
    }

    public void b(int i10, long j10, int i11, String str) {
        com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>> bVarA;
        if (i11 == 0 && (bVarA = com.mbridge.msdk.mbnative.cache.c.a(i10)) != null) {
            if ((i10 == 1 || i10 == 2) && this.f35815d.containsKey(MBridgeConstans.NATIVE_INFO)) {
                this.f35829r = this.H;
            } else {
                this.f35829r = this.f35828q;
            }
            if (c(a(i10, a(bVarA.a(this.f35820i, this.f35829r))))) {
                return;
            }
        }
        if (i10 == 1) {
            a(j10, i11, true, this.f35820i, str);
        } else if (i10 != 2) {
            a(i10, j10, i11, str);
        } else {
            a(2, j10, i11, str);
        }
    }

    public List<Campaign> a(String str, int i10) {
        com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>> bVarA;
        com.mbridge.msdk.setting.l lVarE = com.mbridge.msdk.setting.h.b().e("", str);
        this.Q = lVarE;
        if (lVarE == null) {
            this.Q = com.mbridge.msdk.setting.l.i(str);
        }
        List<Integer> listB = this.Q.b();
        this.f35812b = listB;
        if (listB == null || listB.size() <= 0 || !this.f35812b.contains(1) || (bVarA = com.mbridge.msdk.mbnative.cache.c.a(1)) == null) {
            return null;
        }
        return bVarA.a(str, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Context context, CampaignEx campaignEx) {
        if (campaignEx != null) {
            try {
                if (campaignEx.needShowIDialog() && com.mbridge.msdk.util.b.a()) {
                    h hVar = new h(campaignEx);
                    if (com.mbridge.msdk.click.c.a(campaignEx) && campaignEx.needShowIDialog()) {
                        if (a(this.f35827p, context, campaignEx, this.f35820i, hVar)) {
                            return;
                        }
                        b(campaignEx);
                        this.f35817f.onAdClick(campaignEx);
                        return;
                    }
                }
            } catch (Throwable th2) {
                q0.a(f35808c0, th2.getMessage());
            }
        }
        this.f35827p.a(campaignEx, this.f35817f);
        b(campaignEx);
    }

    private int a(String str) {
        if (str == null) {
            return 0;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() > 0) {
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObject = (JSONObject) jSONArray.opt(i10);
                    if (2 == jSONObject.optInt("id", 0)) {
                        return jSONObject.optInt("ad_num");
                    }
                }
            }
        } catch (Exception e10) {
            q0.b(f35808c0, com.mbridge.msdk.mbnative.common.a.a(e10));
        }
        return 0;
    }

    public void d() {
        o0.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(CampaignEx campaignEx) {
        if (campaignEx == null || campaignEx.isReportClick()) {
            return;
        }
        campaignEx.setReportClick(true);
        if (campaignEx.getNativeVideoTracking() == null || campaignEx.getNativeVideoTracking().i() == null) {
            return;
        }
        com.mbridge.msdk.click.a.a(this.f35819h, campaignEx, campaignEx.getCampaignUnitId(), campaignEx.getNativeVideoTracking().i(), false, false);
    }

    public void a(String str, String str2) {
        this.f35816e.a(this.f35819h, str, str2, this.f35820i);
    }

    public void a(int i10, String str) {
        boolean zEquals = false;
        this.f35833v = false;
        this.f35834w = false;
        this.f35835x = false;
        this.U = false;
        this.N = str;
        this.f35817f.a(!TextUtils.isEmpty(str));
        this.J = null;
        Map<String, Long> map = f35809d0;
        if (map != null && map.size() > 0) {
            f35809d0.clear();
        }
        if (com.mbridge.msdk.mbnative.controller.d.g() != null && com.mbridge.msdk.mbnative.controller.d.g().containsKey(this.f35820i)) {
            zEquals = Boolean.TRUE.equals(com.mbridge.msdk.mbnative.controller.d.g().get(this.f35820i));
        }
        a(zEquals, i10);
    }

    public void b(Campaign campaign, View view) {
        b(campaign, view, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        Timer timer = this.M;
        if (timer != null) {
            timer.cancel();
            this.M = null;
        }
    }

    public void b(Campaign campaign, View view, List<View> list) {
        if (view != null && this.P != null) {
            try {
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this.P);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        if (campaign != null) {
            int type = campaign.getType();
            if (type == 1 || type == 2) {
                Class cls = null;
                try {
                    int i10 = MBMediaView.f36227p0;
                    cls = MBMediaView.class;
                } catch (Throwable unused) {
                }
                if (list == null || list.size() <= 0) {
                    if (view != null) {
                        a(view, cls);
                    }
                } else {
                    Iterator<View> it = list.iterator();
                    while (it.hasNext()) {
                        a(it.next(), cls);
                    }
                }
            }
        }
    }

    private List<Campaign> b(List<Campaign> list) {
        ArrayList arrayList = null;
        if (list != null) {
            for (Campaign campaign : list) {
                if (campaign instanceof CampaignEx) {
                    CampaignEx campaignEx = (CampaignEx) campaign;
                    if (TextUtils.isEmpty(campaignEx.getImageUrl()) && !TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(campaign);
                    }
                }
            }
        }
        return arrayList;
    }

    private void a(boolean z10, int i10) {
        boolean zB;
        if (z10 && i10 == 1 && a(i10)) {
            return;
        }
        String strB = com.mbridge.msdk.foundation.controller.c.n().b();
        String strC = com.mbridge.msdk.foundation.controller.c.n().c();
        if (this.f35815d.containsKey("app_id") && this.f35815d.containsKey(MBridgeConstans.APP_KEY) && this.f35815d.containsKey(MBridgeConstans.KEY_WORD)) {
            strB = (String) this.f35815d.get("app_id");
            strC = (String) this.f35815d.get(MBridgeConstans.APP_KEY);
        }
        a(strB, strC);
        com.mbridge.msdk.setting.l lVarE = com.mbridge.msdk.setting.h.b().e(strB, this.f35820i);
        this.Q = lVarE;
        if (lVarE == null) {
            this.Q = com.mbridge.msdk.setting.l.i(this.f35820i);
        }
        com.mbridge.msdk.mbnative.controller.d.d().put(this.f35820i, Integer.valueOf(this.Q.y() * this.f35829r));
        this.f35812b = this.Q.b();
        this.f35814c = this.Q.c();
        this.T = this.Q.f();
        this.S = this.Q.e();
        this.f35829r = this.f35828q;
        List<Integer> list = this.f35812b;
        if (list != null && list.size() != 0) {
            try {
                zB = com.mbridge.msdk.mbsignalcommon.webEnvCheck.a.b(com.mbridge.msdk.foundation.controller.c.n().d());
            } catch (Exception unused) {
                zB = false;
            }
            if (!zB) {
                com.mbridge.msdk.mbnative.listener.a aVar = this.f35817f;
                if (aVar != null) {
                    aVar.onAdLoadError("webview is not available");
                    return;
                }
                return;
            }
            if (this.f35815d.containsKey(MBridgeConstans.NATIVE_INFO) && this.f35824m == null) {
                this.f35824m = (String) this.f35815d.get(MBridgeConstans.NATIVE_INFO);
                f();
            }
            if ((!this.f35812b.contains(1) || this.f35812b.get(0).intValue() == 1) && i10 == 0 && c(a(this.f35820i, this.f35829r, this.N))) {
                return;
            }
            this.X = true;
            if (this.f35812b.contains(1) && i10 == 0 && this.f35812b.get(0).intValue() != 1) {
                int iIntValue = this.f35812b.get(0).intValue();
                com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>> bVarA = com.mbridge.msdk.mbnative.cache.c.a(iIntValue);
                if (iIntValue == 2 && this.f35815d.containsKey(MBridgeConstans.NATIVE_INFO)) {
                    this.f35829r = this.H;
                } else {
                    this.f35829r = this.f35828q;
                }
                if (bVarA != null && c(a(iIntValue, a(bVarA.a(this.f35820i, this.f35829r))))) {
                    return;
                }
                this.X = false;
                try {
                    a(this.f35814c.get(this.f35812b.indexOf(1)).intValue() * 1000, i10, false, this.f35820i, this.N);
                } catch (Exception unused2) {
                }
            }
            this.f35901a.sendEmptyMessageDelayed(1, this.Q.K() * 1000);
            j();
            b(i10, this.N);
            return;
        }
        com.mbridge.msdk.mbnative.listener.a aVar2 = this.f35817f;
        if (aVar2 != null) {
            this.f35833v = true;
            aVar2.onAdLoadError("do not have sorceList");
        }
    }

    public NativeController() {
        this.f35828q = 1;
        this.f35829r = 1;
        this.f35830s = -1;
        this.f35831t = 0;
        this.f35833v = false;
        this.f35834w = false;
        this.f35835x = false;
        this.f35836y = 0;
        this.f35837z = 0;
        this.A = 0;
        this.B = 0;
        this.F = new CopyOnWriteArrayList<>();
        this.G = new Hashtable<>();
        this.H = 1;
        this.I = 2;
        this.N = "";
        this.O = "";
        this.Z = "";
    }

    public boolean a(int i10) {
        int iMin;
        int iOptInt;
        int iOptInt2;
        com.mbridge.msdk.mbnative.listener.a aVar;
        int i11 = 0;
        if (com.mbridge.msdk.mbnative.controller.d.g().containsKey(this.f35820i) && Boolean.TRUE.equals(com.mbridge.msdk.mbnative.controller.d.g().get(this.f35820i))) {
            Map<String, Map<Long, Object>> mapF = com.mbridge.msdk.mbnative.controller.d.f();
            Map<Long, Object> map = mapF.get(i10 + "_" + this.f35820i);
            Integer num = com.mbridge.msdk.mbnative.controller.d.c().get(this.f35820i);
            com.mbridge.msdk.setting.g gVarD = com.mbridge.msdk.setting.h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
            if (num != null) {
                this.f35829r = num.intValue();
            }
            if (map != null && map.size() > 0) {
                Long next = map.keySet().iterator().next();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (gVarD == null) {
                    gVarD = com.mbridge.msdk.setting.h.b().a();
                }
                if (jCurrentTimeMillis - next.longValue() >= gVarD.a0() * 1000) {
                    mapF.remove(i10 + "_" + this.f35820i);
                } else {
                    if (i10 == 1) {
                        List<Frame> list = (List) map.get(next);
                        if (list == null || list.size() <= 0 || (aVar = this.f35817f) == null) {
                            return false;
                        }
                        if (this.A >= list.size()) {
                            mapF.remove(i10 + "_" + this.f35820i);
                            aVar.onAdFramesLoaded(list);
                            return true;
                        }
                        if (this.A == 0) {
                            return false;
                        }
                        List<Frame> listSubList = list.subList(0, this.f35837z);
                        aVar.onAdFramesLoaded(list);
                        list.removeAll(listSubList);
                        map.put(next, listSubList);
                        ArrayList arrayList = new ArrayList();
                        for (Frame frame : list) {
                            if (i11 >= this.A) {
                                arrayList.add(frame);
                            }
                            i11++;
                        }
                        map.put(next, arrayList);
                        mapF.put(i10 + "_" + this.f35820i, map);
                        aVar.onAdFramesLoaded(listSubList);
                        return true;
                    }
                    List list2 = (List) map.get(next);
                    if (list2 != null && list2.size() > 0) {
                        List<Campaign> arrayList2 = new ArrayList<>();
                        if (((CampaignEx) list2.get(0)).getType() == 1) {
                            if (TextUtils.isEmpty(this.f35824m)) {
                                iMin = Math.min(this.f35836y, list2.size());
                            } else {
                                try {
                                    JSONArray jSONArray = new JSONArray(this.f35824m);
                                    if (jSONArray.length() > 0) {
                                        iOptInt = 0;
                                        iOptInt2 = 0;
                                        for (int i12 = 0; i12 < jSONArray.length(); i12++) {
                                            JSONObject jSONObject = (JSONObject) jSONArray.opt(i12);
                                            int iOptInt3 = jSONObject.optInt("id", 0);
                                            if (2 == iOptInt3) {
                                                iOptInt = jSONObject.optInt("ad_num");
                                            } else if (3 == iOptInt3) {
                                                iOptInt2 = jSONObject.optInt("ad_num");
                                            }
                                        }
                                    } else {
                                        iOptInt = 0;
                                        iOptInt2 = 0;
                                    }
                                    if (3 == ((CampaignEx) list2.get(0)).getTemplate()) {
                                        iMin = Math.min(iOptInt2, list2.size());
                                    } else {
                                        iMin = Math.min(iOptInt, list2.size());
                                    }
                                } catch (Exception unused) {
                                    q0.b(f35808c0, "load from catch error in get nativeinfo adnum");
                                    iMin = 0;
                                }
                            }
                            if (iMin <= 0) {
                                return false;
                            }
                            Iterator it = list2.iterator();
                            while (it.hasNext() && i11 != iMin) {
                                CampaignEx campaignEx = (CampaignEx) it.next();
                                campaignEx.getTemplate();
                                arrayList2.add(campaignEx);
                                it.remove();
                                i11++;
                            }
                        } else {
                            int iMin2 = Math.min(this.f35836y, list2.size());
                            if (iMin2 > 0) {
                                Iterator it2 = list2.iterator();
                                while (it2.hasNext() && i11 != iMin2) {
                                    CampaignEx campaignEx2 = (CampaignEx) it2.next();
                                    campaignEx2.getTemplate();
                                    arrayList2.add(campaignEx2);
                                    it2.remove();
                                    i11++;
                                }
                            }
                        }
                        c(arrayList2);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void a(String str, int i10, String str2, CampaignEx campaignEx) {
        Queue<Integer> queue = this.f35822k;
        if ((queue != null && queue.size() <= 0) || this.f35822k == null) {
            com.mbridge.msdk.mbnative.listener.a aVar = this.f35817f;
            if (aVar == null || this.f35833v) {
                return;
            }
            this.f35833v = true;
            aVar.a(campaignEx, str);
            return;
        }
        b(i10, str2);
    }

    @Override // com.mbridge.msdk.mbnative.controller.a
    public synchronized void a(int i10, long j10, int i11, String str) {
        n nVar;
        com.mbridge.msdk.foundation.same.net.wrapper.e eVar;
        int i12;
        com.mbridge.msdk.foundation.entity.k kVar;
        try {
            if (this.f35815d.containsKey(MBridgeConstans.NATIVE_INFO)) {
                this.f35829r = Math.max(this.V, this.W);
            }
            if (i11 == 0) {
                com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>> bVarA = com.mbridge.msdk.mbnative.cache.c.a(i10);
                if (bVarA != null && c(a(1, a(bVarA.a(this.f35820i, this.f35829r))))) {
                    return;
                }
                n nVar2 = this.J;
                if (nVar2 != null && !this.U) {
                    nVar2.b(true);
                }
                if (this.U && !this.f35833v) {
                    a("mb load failed", i11, str, (CampaignEx) null);
                }
                if (!this.X) {
                    return;
                }
            }
            int i13 = this.f35830s;
            if (i13 == -1) {
                this.f35830s = i10;
            } else if (i13 != i10) {
                this.f35831t = 0;
            }
            com.mbridge.msdk.foundation.db.e.a(com.mbridge.msdk.foundation.db.g.a(this.f35819h)).d();
            com.mbridge.msdk.mbnative.service.net.a aVar = new com.mbridge.msdk.mbnative.service.net.a(this.f35819h);
            com.mbridge.msdk.foundation.same.net.wrapper.e eVar2 = new com.mbridge.msdk.foundation.same.net.wrapper.e();
            String strB = com.mbridge.msdk.foundation.controller.c.n().b();
            String strC = com.mbridge.msdk.foundation.controller.c.n().c();
            Map<String, Object> map = this.f35815d;
            if (map != null && map.containsKey("app_id") && this.f35815d.containsKey(MBridgeConstans.APP_KEY) && this.f35815d.containsKey(MBridgeConstans.KEY_WORD) && this.f35815d.get(MBridgeConstans.KEY_WORD) != null) {
                if (this.f35815d.get("app_id") instanceof String) {
                    strB = (String) this.f35815d.get("app_id");
                }
                if (this.f35815d.get(MBridgeConstans.APP_KEY) instanceof String) {
                    strC = (String) this.f35815d.get(MBridgeConstans.APP_KEY);
                }
                String str2 = this.f35815d.get(MBridgeConstans.KEY_WORD) instanceof String ? (String) this.f35815d.get(MBridgeConstans.KEY_WORD) : null;
                if (!TextUtils.isEmpty(str2)) {
                    eVar2.a("smart", k0.b(str2));
                }
            }
            eVar2.a("app_id", strB);
            eVar2.a(MBridgeConstans.PROPERTIES_UNIT_ID, this.f35820i);
            if (!TextUtils.isEmpty(this.f35821j)) {
                eVar2.a(MBridgeConstans.PLACEMENT_ID, this.f35821j);
            }
            eVar2.a("req_type", "2");
            if (!TextUtils.isEmpty(this.f35832u)) {
                eVar2.a("category", this.f35832u);
            }
            eVar2.a("sign", SameMD5.getMD5(strB + strC));
            if (this.T > 0 && i11 == 0) {
                eVar2.a("ad_num", this.T + "");
            } else {
                eVar2.a("ad_num", this.f35828q + "");
            }
            String strD = v0.d(this.f35820i);
            if (!TextUtils.isEmpty(strD)) {
                eVar2.a("j", strD);
            }
            eVar2.a("only_impression", "1");
            eVar2.a("ping_mode", "1");
            if (this.A != 0) {
                eVar2.a("frame_num", this.A + "");
            }
            if (!TextUtils.isEmpty(this.f35824m)) {
                eVar2.a(MBridgeConstans.NATIVE_INFO, this.f35824m);
                if (i10 == 1) {
                    eVar2.a("tnum", this.H + "");
                }
            } else if (i10 == 1) {
                eVar2.a("tnum", this.f35828q + "");
            }
            a(eVar2, i10);
            String strA = com.mbridge.msdk.foundation.same.buffer.b.a(this.f35820i, "native");
            if (!TextUtils.isEmpty(strA)) {
                eVar2.a(com.mbridge.msdk.foundation.same.net.wrapper.e.f35062g, strA);
            }
            if (this.f35815d.containsKey(MBridgeConstans.NATIVE_VIDEO_WIDTH) && (this.f35815d.get(MBridgeConstans.NATIVE_VIDEO_WIDTH) instanceof Integer)) {
                eVar2.a("video_width", ((Integer) this.f35815d.get(MBridgeConstans.NATIVE_VIDEO_WIDTH)).intValue() + "");
            }
            if (this.f35815d.containsKey(MBridgeConstans.NATIVE_VIDEO_HEIGHT) && (this.f35815d.get(MBridgeConstans.NATIVE_VIDEO_HEIGHT) instanceof Integer)) {
                eVar2.a("video_height", ((Integer) this.f35815d.get(MBridgeConstans.NATIVE_VIDEO_HEIGHT)).intValue() + "");
            }
            if (this.f35815d.containsKey(MBridgeConstans.NATIVE_VIDEO_SUPPORT) && (this.f35815d.get(MBridgeConstans.NATIVE_VIDEO_SUPPORT) instanceof Boolean)) {
                ((Boolean) this.f35815d.get(MBridgeConstans.NATIVE_VIDEO_SUPPORT)).booleanValue();
            }
            eVar2.a("video_version", "2.0");
            if (com.mbridge.msdk.setting.h.b().d(com.mbridge.msdk.foundation.controller.c.n().b()) == null) {
                com.mbridge.msdk.setting.h.b().a();
            }
            if (!b(this.f35815d)) {
                JSONArray jSONArrayB = v0.b(this.f35819h, this.f35820i);
                if (jSONArrayB.length() > 0) {
                    eVar2.a(com.mbridge.msdk.foundation.same.net.wrapper.e.f35063h, v0.a(jSONArrayB));
                }
            }
            if (com.mbridge.msdk.mbnative.controller.d.g().containsKey(this.f35820i) && com.mbridge.msdk.mbnative.controller.d.g().get(this.f35820i).booleanValue() && com.mbridge.msdk.mbnative.controller.d.e().get(this.f35820i) != null && (kVar = com.mbridge.msdk.mbnative.controller.d.e().get(this.f35820i)) != null) {
                if (i10 == 1) {
                    this.f35831t = kVar.a();
                } else if (i10 == 2) {
                    this.f35831t = kVar.b();
                }
            }
            eVar2.a(TypedValues.CycleType.S_WAVE_OFFSET, this.f35831t + "");
            eVar2.a("ad_type", RoomMasterTable.DEFAULT_ID);
            eVar2.a(CampaignEx.JSON_KEY_AD_SOURCE_ID, i10 + "");
            if (!TextUtils.isEmpty(this.f35826o)) {
                eVar2.a(com.mbridge.msdk.foundation.same.net.wrapper.e.f35064i, this.f35826o);
            }
            n nVar3 = new n();
            nVar3.b(a(this.f35815d));
            nVar3.setUnitId(this.f35820i);
            nVar3.setPlacementId(this.f35821j);
            nVar3.setAdType(42);
            nVar3.b(true);
            p pVar = new p(1, nVar3, i11, str);
            nVar3.a(pVar);
            nVar3.a(i11);
            nVar3.a(str);
            if (i11 == 0) {
                if (!TextUtils.isEmpty(str)) {
                    eVar2.a("token", str);
                }
                nVar = nVar3;
                eVar = eVar2;
                i12 = 1;
                aVar.choiceV3OrV5BySetting(1, eVar, nVar, str, com.mbridge.msdk.foundation.same.c.a(j10, 30000L));
            } else {
                nVar = nVar3;
                eVar = eVar2;
                i12 = 1;
            }
            if (i11 == i12) {
                aVar.getLoadOrSetting(1, com.mbridge.msdk.foundation.same.net.utils.d.h().f35027b0, eVar, nVar, MBInterstitialActivity.INTENT_CAMAPIGN, com.mbridge.msdk.foundation.same.c.a(j10, 30000L));
            }
            this.f35901a.postDelayed(pVar, j10);
        } catch (Exception e10) {
            String str3 = f35808c0;
            q0.b(str3, com.mbridge.msdk.mbnative.common.a.a(e10));
            q0.b(str3, e10.getMessage());
        }
    }

    private void a(View view, CampaignEx campaignEx) {
        BitmapDrawable bitmapDrawableA;
        ImageView imageView;
        if (!(view instanceof FrameLayout) || (bitmapDrawableA = com.mbridge.msdk.foundation.controller.c.n().a(this.f35820i, campaignEx.getAdType())) == null) {
            return;
        }
        try {
            int childCount = ((ViewGroup) view).getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 >= childCount) {
                    imageView = null;
                    break;
                }
                View childAt = ((ViewGroup) view).getChildAt(i10);
                if ((childAt instanceof ImageView) && childAt.getTag() != null && "mb_wm".equals((String) childAt.getTag())) {
                    ((ImageView) childAt).setLayoutParams(new FrameLayout.LayoutParams(view.getWidth(), view.getHeight()));
                    imageView = (ImageView) childAt;
                    break;
                }
                i10++;
            }
            if (imageView == null) {
                imageView = new ImageView(com.mbridge.msdk.foundation.controller.c.n().d());
                imageView.setTag("mb_wm");
                v0.a(imageView, bitmapDrawableA, view.getResources().getDisplayMetrics());
                if (imageView.getParent() == null) {
                    ((FrameLayout) view).addView(imageView, new FrameLayout.LayoutParams(view.getWidth(), view.getHeight()));
                }
                AdSession adSession = this.f35811a0;
                if (adSession != null) {
                    adSession.addFriendlyObstruction(imageView, FriendlyObstructionPurpose.OTHER, null);
                }
            }
            this.P = new e(imageView, view);
            view.getViewTreeObserver().addOnGlobalLayoutListener(this.P);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void a(Campaign campaign, View view, List<View> list) {
        try {
            a(view, (CampaignEx) campaign);
            NativeListener.NativeTrackingListener nativeTrackingListener = this.f35818g;
            if (nativeTrackingListener != null) {
                this.f35827p.a(nativeTrackingListener);
            }
            com.mbridge.msdk.mbnative.cache.c.a(campaign.getType()).a(this.f35820i, campaign, this.N);
            CampaignEx campaignEx = (CampaignEx) campaign;
            Class cls = null;
            try {
                int i10 = MBMediaView.f36227p0;
                cls = MBMediaView.class;
            } catch (Throwable unused) {
            }
            com.mbridge.msdk.foundation.same.buffer.b.a(this.f35820i, campaignEx, "native");
            if (view != null) {
                if (cls != null && cls.isInstance(view)) {
                    return;
                }
                b1.a(view, campaignEx.getLocalRequestId(), campaignEx.getLocalAllowTrackClick());
                view.setOnClickListener(new f(campaignEx));
            }
            if (list != null && list.size() > 0) {
                for (View view2 : list) {
                    if (cls != null && cls.isInstance(view2)) {
                        break;
                    }
                    b1.a(view2, campaignEx.getLocalRequestId(), campaignEx.getLocalAllowTrackClick());
                    view2.setOnClickListener(new g(campaignEx));
                }
            }
            if (campaignEx.isReport()) {
                return;
            }
            a(campaignEx, view, list);
            Log.e(f35808c0, "sendImpression" + campaignEx);
        } catch (Exception unused2) {
            q0.b(f35808c0, "registerview exception!");
        }
    }

    public void a(Campaign campaign, View view) {
        try {
            NativeListener.NativeTrackingListener nativeTrackingListener = this.f35818g;
            if (nativeTrackingListener != null) {
                this.f35827p.a(nativeTrackingListener);
            }
            com.mbridge.msdk.mbnative.cache.c.a(campaign.getType()).a(this.f35820i, campaign, this.N);
            CampaignEx campaignEx = (CampaignEx) campaign;
            com.mbridge.msdk.foundation.same.buffer.b.a(this.f35820i, campaignEx, "native");
            b1.a(view, campaignEx.getLocalRequestId(), campaignEx.getLocalAllowTrackClick());
            i iVar = new i(campaignEx);
            try {
                int i10 = MBMediaView.f36227p0;
                a(campaignEx, view, iVar, MBMediaView.class);
            } catch (Throwable unused) {
                a(campaignEx, view, iVar, (Class) null);
            }
            if (!com.mbridge.msdk.util.b.a()) {
                a(view, (CampaignEx) campaign);
            }
            if (campaignEx.isReport()) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            a(campaignEx, view, (List<View>) arrayList);
            q0.c(f35808c0, "sendImpression" + campaignEx);
        } catch (Exception unused2) {
            q0.b(f35808c0, "registerview exception!");
        }
    }

    private AdSession a(CampaignEx campaignEx) {
        if (this.G == null) {
            this.G = new Hashtable<>();
        }
        String requestIdNotice = campaignEx.getRequestIdNotice();
        AdSession adSessionA = this.G.get(requestIdNotice);
        if (adSessionA == null && campaignEx.isActiveOm() && TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
            adSessionA = com.mbridge.msdk.omsdk.b.a(this.f35819h, true, campaignEx.getOmid(), campaignEx.getRequestId(), campaignEx.getId(), this.f35820i, "", campaignEx.getRequestIdNotice());
        }
        if (adSessionA != null) {
            this.G.put(requestIdNotice, adSessionA);
        }
        return adSessionA;
    }

    private void a(CampaignEx campaignEx, View view, List<View> list) {
        AdSession adSessionA;
        try {
            if (this.f35819h == null || campaignEx == null) {
                adSessionA = null;
            } else {
                adSessionA = a(campaignEx);
                if (adSessionA != null) {
                    adSessionA.registerAdView(view);
                    adSessionA.start();
                }
            }
            AdSession adSession = adSessionA;
            com.mbridge.msdk.setting.l lVar = this.Q;
            int iS = lVar != null ? lVar.s() : 0;
            if (campaignEx != null && campaignEx.getImpReportType() == 1) {
                iS = 0;
            }
            s sVar = new s(campaignEx, view, list, this, adSession);
            if (this.F == null) {
                this.F = new CopyOnWriteArrayList<>();
            }
            this.F.add(sVar);
            sVar.setOnStateChangeListener(new j(sVar));
            Handler handler = this.f35901a;
            if (handler != null) {
                handler.postDelayed(sVar, iS * 1000);
            }
        } catch (Exception e10) {
            q0.b(f35808c0, com.mbridge.msdk.mbnative.common.a.a(e10));
        }
    }

    private void a(CampaignEx campaignEx, View view, View.OnClickListener onClickListener, Class cls) {
        if (view == null || onClickListener == null) {
            return;
        }
        if (cls != null) {
            try {
                if (cls.isInstance(view)) {
                    return;
                }
            } catch (Throwable unused) {
                return;
            }
        }
        view.setOnClickListener(onClickListener);
        b1.a(view, campaignEx.getLocalRequestId(), campaignEx.getLocalAllowTrackClick());
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                a(campaignEx, viewGroup.getChildAt(i10), onClickListener, cls);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(CampaignEx campaignEx, View view, List<View> list, AdSession adSession) {
        try {
            k kVar = new k(campaignEx);
            com.mbridge.msdk.mbnative.controller.c cVar = new com.mbridge.msdk.mbnative.controller.c(list, kVar, new Handler(Looper.getMainLooper()), campaignEx.getImpReportType());
            cVar.a(view);
            List<com.mbridge.msdk.mbnative.controller.c> list2 = this.D;
            if (list2 != null) {
                list2.add(cVar);
            }
            List<com.mbridge.msdk.mbnative.controller.c.d> list3 = this.E;
            if (list3 != null) {
                list3.add(kVar);
            }
            AdEvents adEvents = this.f35813b0;
            if (adEvents != null) {
                adEvents.impressionOccurred();
            }
        } catch (Exception unused) {
        }
    }

    private void a(View view, Class cls) {
        if (view == null) {
            return;
        }
        if (cls != null) {
            try {
                if (cls.isInstance(view)) {
                    return;
                }
            } catch (Throwable unused) {
                return;
            }
        }
        view.setOnClickListener(null);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                a(viewGroup.getChildAt(i10), cls);
            }
        }
    }

    public List<Campaign> a(String str, int i10, String str2) {
        int i11;
        int i12;
        List<Campaign> listA = null;
        if (this.f35812b != null) {
            ArrayList arrayList = new ArrayList(this.f35812b);
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>> bVarA = com.mbridge.msdk.mbnative.cache.c.a(((Integer) arrayList.get(i13)).intValue());
                if (bVarA != null) {
                    if ((((Integer) arrayList.get(i13)).intValue() == 1 || ((Integer) arrayList.get(i13)).intValue() == 2) && this.f35815d.containsKey(MBridgeConstans.NATIVE_INFO)) {
                        i12 = this.H;
                    } else {
                        i12 = this.f35828q;
                    }
                    listA = a(((Integer) arrayList.get(i13)).intValue(), bVarA.a(str, i12));
                    if (listA != null) {
                        break;
                    }
                }
            }
            if (listA == null) {
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>> bVarA2 = com.mbridge.msdk.mbnative.cache.c.a(((Integer) arrayList.get(i14)).intValue());
                    if ((((Integer) arrayList.get(i14)).intValue() == 1 || ((Integer) arrayList.get(i14)).intValue() == 2) && this.f35815d.containsKey(MBridgeConstans.NATIVE_INFO)) {
                        i11 = this.H;
                    } else {
                        i11 = this.f35828q;
                    }
                    listA = a(((Integer) arrayList.get(i14)).intValue(), bVarA2.b(str, i11));
                    if (listA != null) {
                        break;
                    }
                }
            }
        }
        return a(listA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<Campaign> list, int i10, NativeListener.NativeAdListener nativeAdListener) {
        this.f35901a.post(new a(list, nativeAdListener, i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.mbnative.listener.a aVar, String str, CampaignEx campaignEx) {
        this.f35901a.post(new b(aVar, campaignEx, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<Campaign> a(int i10, List<Campaign> list) {
        if (i10 != 1 || !this.f35815d.containsKey(MBridgeConstans.NATIVE_INFO) || list == null || list.size() <= 0) {
            return list;
        }
        CampaignEx campaignEx = (CampaignEx) list.get(0);
        int template = campaignEx != null ? campaignEx.getTemplate() : 1;
        if (template == 2) {
            int size = list.size();
            int i11 = this.V;
            return size >= i11 ? list.subList(0, i11) : list;
        }
        if (template != 3) {
            return list;
        }
        int size2 = list.size();
        int i12 = this.W;
        return size2 >= i12 ? list.subList(0, i12) : list;
    }

    private void a(List<Campaign> list, o oVar) {
        c();
        long jCurrentTimeMillis = System.currentTimeMillis();
        Timer timer = new Timer();
        this.M = timer;
        timer.schedule(new d(jCurrentTimeMillis, oVar, list), 0L, 1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<Campaign> a(List<Campaign> list, boolean z10) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                Campaign campaign = list.get(size);
                String id2 = campaign.getId();
                boolean z11 = campaign instanceof CampaignEx;
                if (z11) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(id2);
                    CampaignEx campaignEx = (CampaignEx) campaign;
                    sb2.append(campaignEx.getVideoUrlEncode());
                    sb2.append(campaignEx.getBidToken());
                    id2 = sb2.toString();
                }
                com.mbridge.msdk.videocommon.download.a aVarA = com.mbridge.msdk.videocommon.download.b.getInstance().a(this.f35820i, id2);
                if (z10) {
                    if (aVarA == null || !com.mbridge.msdk.videocommon.download.l.a(aVarA, h().C())) {
                        com.mbridge.msdk.mbnative.cache.c.a(campaign.getType()).a(this.f35820i, list.remove(size), this.N);
                    }
                } else if (z11) {
                    CampaignEx campaignEx2 = (CampaignEx) campaign;
                    if (TextUtils.isEmpty(campaignEx2.getImageUrl()) && !TextUtils.isEmpty(campaignEx2.getVideoUrlEncode()) && (aVarA == null || !com.mbridge.msdk.videocommon.download.l.a(aVarA, h().C()))) {
                        com.mbridge.msdk.mbnative.cache.c.a(campaign.getType()).a(this.f35820i, list.remove(size), this.N);
                    }
                }
            }
        }
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<Campaign> a(List<Campaign> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        for (Campaign campaign : list) {
            if (campaign instanceof CampaignEx) {
                CampaignEx campaignEx = (CampaignEx) campaign;
                if (TextUtils.isEmpty(this.N) && TextUtils.isEmpty(campaignEx.getBidToken()) && !campaignEx.isBidCampaign()) {
                    arrayList2.add(campaignEx);
                } else if (!TextUtils.isEmpty(this.N) && TextUtils.equals(campaignEx.getBidToken(), this.N)) {
                    arrayList.add(campaign);
                }
            } else {
                arrayList2.add(campaign);
            }
        }
        return TextUtils.isEmpty(this.N) ? arrayList2 : arrayList;
    }
}
