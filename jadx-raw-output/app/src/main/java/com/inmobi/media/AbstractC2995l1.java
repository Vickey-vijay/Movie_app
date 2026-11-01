package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.widget.TextView;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.iab.omid.library.inmobi.Omid;
import com.iab.omid.library.inmobi.adsession.Partner;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.WatermarkData;
import com.inmobi.media.AbstractC2995l1;
import com.inmobi.media.EnumC2721a6;
import com.inmobi.media.ads.network.common.model.AdQualityControl;
import com.inmobi.media.ads.network.common.model.AdResponse;
import com.inmobi.media.ads.network.common.model.AdSet;
import com.inmobi.media.ads.network.common.model.InlineParams;
import com.inmobi.media.ads.network.common.model.LandingPageParam;
import com.inmobi.media.ads.network.common.model.MetaInfo;
import com.inmobi.media.ads.network.common.model.OmSdkInfo;
import com.inmobi.media.ads.network.common.model.Viewability;
import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.core.config.models.RootConfig;
import com.inmobi.media.core.config.models.TelemetryConfig;
import com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations;
import com.ironsource.C3426d4;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.l1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC2995l1 extends AbstractC2836ei implements E2, InterfaceC3039mk, InterfaceC3268w0, ro {
    public static final /* synthetic */ int E = 0;
    public WatermarkData A;
    public final mj.g B;
    public boolean C;
    public final mj.g D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte f24710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AdConfig f24711c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public WeakReference f24712d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TimeoutConfigurations f24713e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public WeakReference f24714f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C3328ya f24715g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList f24716h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public C3053n9 f24717i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Handler f24718j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f24719k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C3243v0 f24720l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public AdResponse f24721m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public C3089ok f24722n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f24723o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f24724p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f24725q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final TreeSet f24726r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f24727s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f24728t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public C2741b0 f24729u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public C2854fa f24730v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public C3056nc f24731w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Handler f24732x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final LinkedHashMap f24733y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final C3144r1 f24734z;

    /* JADX WARN: Code duplicated, block: B:12:0x0023 A[Catch: Exception -> 0x0037, TryCatch #0 {Exception -> 0x0037, blocks: (B:8:0x0017, B:10:0x001d, B:13:0x0028, B:12:0x0023), top: B:21:0x0017, outer: #1 }] */
    public static final void c(AbstractC2995l1 abstractC2995l1) {
        AdConfig.OmidConfig omidConfig;
        Cf cf2 = Bf.f22423a;
        Context contextN = abstractC2995l1.n();
        AdConfig adConfig = abstractC2995l1.f24711c;
        cf2.getClass();
        try {
            if (!Omid.isActive()) {
                Omid.activate(contextN);
                return;
            }
            if (adConfig != null) {
                try {
                    AdConfig.ViewabilityConfig viewability = adConfig.getViewability();
                    if (viewability == null || (omidConfig = viewability.getOmidConfig()) == null) {
                        omidConfig = new AdConfig.OmidConfig();
                    }
                } catch (Exception e10) {
                    mj.g gVar = P9.f23321a;
                    P9.a(new L2(e10));
                    return;
                }
            } else {
                omidConfig = new AdConfig.OmidConfig();
            }
            cf2.f22471b = Partner.createPartner(omidConfig.getPartnerKey(), cf2.a());
        } catch (Exception e11) {
            mj.g gVar2 = P9.f23321a;
            AbstractC2929i9.a(e11);
        }
    }

    public static final ko d(AbstractC2995l1 abstractC2995l1) {
        return new ko(abstractC2995l1.f24717i);
    }

    @Override // com.inmobi.media.AbstractC2836ei
    public void a(GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci, boolean z10) {
        ck.p.j(gestureDetectorOnGestureListenerC2785ci, "renderView");
        ck.p.j(gestureDetectorOnGestureListenerC2785ci, "renderView");
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("l1", "TAG");
            c3053n9.c("l1", "onRenderProcessGone didCrash=" + z10 + " state=" + ((int) this.f24710b));
        }
        byte b10 = this.f24710b;
        if (b10 == 0) {
            short s10 = z10 ? (short) 2214 : (short) 2213;
            J();
            gestureDetectorOnGestureListenerC2785ci.a(z10, s10);
            return;
        }
        if (b10 == 1) {
            short s11 = z10 ? (short) 2216 : (short) 2215;
            J();
            c(s11);
            AbstractC2871g1 abstractC2871g1M = m();
            if (abstractC2871g1M != null) {
                abstractC2871g1M.a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                return;
            }
            return;
        }
        if (b10 == 3) {
            gestureDetectorOnGestureListenerC2785ci.a(z10, z10 ? (short) 2226 : (short) 2225);
            return;
        }
        if (b10 == 2) {
            J();
            c(z10 ? (short) 2218 : (short) 2217);
            AbstractC2871g1 abstractC2871g1M2 = m();
            if (abstractC2871g1M2 != null) {
                abstractC2871g1M2.a(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                return;
            }
            return;
        }
        if (b10 == 4 || b10 == 6 || b10 == 7 || b10 != 8) {
            return;
        }
        gestureDetectorOnGestureListenerC2785ci.a(z10, z10 ? (short) 2240 : (short) 2241);
    }

    public final com.inmobi.media.ads.network.common.model.Ad b(int i10) {
        Iterable iterableK;
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads;
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads2;
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads3;
        ck.p.i("l1", "TAG");
        toString();
        AdSet adSetR = r();
        if (adSetR == null || (ads3 = adSetR.getAds()) == null || (iterableK = nj.s.l(ads3)) == null) {
            iterableK = nj.s.k();
        }
        if (nj.b0.U(iterableK, Integer.valueOf(i10))) {
            AdSet adSetR2 = r();
            if (adSetR2 == null || (ads2 = adSetR2.getAds()) == null) {
                return null;
            }
            return ads2.get(i10);
        }
        AdSet adSetR3 = r();
        if (adSetR3 == null || (ads = adSetR3.getAds()) == null) {
            return null;
        }
        return ads.peekFirst();
    }

    public final void e(AbstractC2871g1 abstractC2871g1) {
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("l1", "TAG");
            c3053n9.c("l1", "adUnitEventListener setter " + this);
        }
        WeakReference weakReference = new WeakReference(abstractC2871g1);
        this.f24714f = weakReference;
        AdSet adSetR = r();
        C2741b0 c2741b0 = new C2741b0(weakReference, ImpressionLog.f43647w, adSetR != null ? adSetR.isRewarded() : false);
        this.f24729u = c2741b0;
        C3053n9 c3053n10 = this.f24717i;
        if (c3053n10 != null) {
            ck.p.j(c3053n10, "logger");
            c2741b0.f24029f = c3053n10;
        }
    }

    public final void g() {
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("l1", "TAG");
            c3053n9.a("l1", "doAdLoadWork " + this);
        }
        try {
            c((byte) 1);
            C3053n9 c3053n10 = this.f24717i;
            if (c3053n10 != null) {
                ck.p.i("l1", "TAG");
                c3053n10.d("l1", "AdUnit " + this + " state - LOADING");
            }
            H();
            C2924i4 c2924i4 = Y3.f23815a;
            ck.p.j(RootConfig.class, "clazz");
            if (((RootConfig) Y3.f23815a.a(RootConfig.class)).isMonetizationDisabled()) {
                b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.MONETIZATION_DISABLED), (short) 2012);
                C3053n9 c3053n11 = this.f24717i;
                if (c3053n11 != null) {
                    ck.p.i("l1", "TAG");
                    c3053n11.b("l1", "Monetization is Disabled");
                    return;
                }
                return;
            }
            if (d((byte) 0)) {
                this.f24715g.a(this.f24709a, new C2896h1(this, null));
                C3053n9 c3053n12 = this.f24717i;
                if (c3053n12 != null) {
                    ck.p.i("l1", "TAG");
                    c3053n12.a("l1", "Fresh ad requested");
                }
            }
        } catch (Exception e10) {
            C3053n9 c3053n13 = this.f24717i;
            if (c3053n13 != null) {
                ck.p.i("l1", "TAG");
                c3053n13.b("l1", "Load failed with unexpected error: " + e10.getMessage());
            }
            mj.g gVar = P9.f23321a;
            P9.a(new L2(e10));
            a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2000);
        }
    }

    public final void h() {
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("l1", "TAG");
            c3053n9.a("l1", "fireAdServedBeacon " + this);
        }
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ciI = i();
        if (gestureDetectorOnGestureListenerC2785ciI == null) {
            return;
        }
        gestureDetectorOnGestureListenerC2785ciI.t();
    }

    public final GestureDetectorOnGestureListenerC2785ci i() {
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("l1", "TAG");
            c3053n9.c("l1", "adMarkupContainer getter " + this);
        }
        byte b10 = this.f24710b;
        String strS = s();
        if (ck.p.e(strS, CreativeInfo.f44315al)) {
            if (b10 == 0 || 1 == b10 || 3 == b10 || 8 == b10) {
                return null;
            }
            return q();
        }
        if (!ck.p.e(strS, "htmlUrl") || b10 == 0 || 1 == b10 || 3 == b10 || 8 == b10) {
            return null;
        }
        return q();
    }

    public final AdMetaInfo j() {
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("l1", "TAG");
            c3053n9.c("l1", "adMetaInfo getter " + this);
        }
        com.inmobi.media.ads.network.common.model.Ad adB = b(0);
        if (adB != null) {
            return new AdMetaInfo(adB.getCreativeId(), adB.getTransaction());
        }
        return null;
    }

    public HashMap k() {
        return new HashMap();
    }

    public abstract String l();

    public final AbstractC2871g1 m() {
        C3053n9 c3053n9;
        C3053n9 c3053n10 = this.f24717i;
        if (c3053n10 != null) {
            ck.p.i("l1", "TAG");
            c3053n10.c("l1", "adUnitEventListener getter " + this);
        }
        AbstractC2871g1 abstractC2871g1 = (AbstractC2871g1) this.f24714f.get();
        if (abstractC2871g1 == null && (c3053n9 = this.f24717i) != null) {
            c3053n9.b("InMobi", "Listener was garbage collected. Unable to give callback");
        }
        return abstractC2871g1;
    }

    public final Context n() {
        WeakReference weakReference = this.f24712d;
        if (weakReference != null) {
            return (Context) weakReference.get();
        }
        return null;
    }

    public final com.inmobi.media.ads.network.common.model.Ad o() {
        return this.f24727s ? b(this.f24723o) : b(0);
    }

    public final com.inmobi.media.ads.network.common.model.Ad p() {
        return this.f24727s ? b(this.f24724p) : b(0);
    }

    public abstract GestureDetectorOnGestureListenerC2785ci q();

    public abstract byte t();

    public final boolean z() {
        AdConfig.CacheConfig cacheConfig;
        C3053n9 c3053n9;
        boolean z10 = false;
        com.inmobi.media.ads.network.common.model.Ad adB = b(0);
        if (adB == null) {
            return false;
        }
        AdConfig adConfig = this.f24711c;
        if (adConfig != null && (cacheConfig = adConfig.getCacheConfig(l())) != null) {
            z10 = ((adB.getExpiryTimestampInMillis() > (-1L) ? 1 : (adB.getExpiryTimestampInMillis() == (-1L) ? 0 : -1)) == 0 ? TimeUnit.SECONDS.toMillis(cacheConfig.getTimeToLive()) + adB.getInsertionTimestampInMillis() : adB.getExpiryTimestampInMillis()) - System.currentTimeMillis() < 0;
            if (z10 && (c3053n9 = this.f24717i) != null) {
                ck.p.i("l1", "TAG");
                c3053n9.b("l1", "Top ad has expired, failing show of ad.");
            }
        }
        return z10;
    }

    public AbstractC2995l1(Context context, C3243v0 c3243v0, Dk dk2) {
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        ck.p.j(c3243v0, "adPlacement");
        String string = UUID.randomUUID().toString();
        ck.p.i(string, "toString(...)");
        this.f24709a = string;
        C2924i4 c2924i4 = Y3.f23815a;
        ck.p.j(AdConfig.class, "clazz");
        this.f24711c = (AdConfig) Y3.f23815a.a(AdConfig.class);
        this.f24715g = (C3328ya) AbstractC3353za.f25833a.getValue();
        this.f24716h = new ArrayList();
        this.f24720l = c3243v0;
        this.f24725q = -1L;
        this.f24726r = new TreeSet();
        this.f24732x = new Handler(Looper.getMainLooper());
        this.f24733y = new LinkedHashMap();
        this.f24734z = new C3144r1(this);
        this.B = kotlin.b.a(new bk.a() { // from class: b7.c9
            @Override // bk.a
            public final Object invoke() {
                return AbstractC2995l1.d(this.f4880b);
            }
        });
        this.f24712d = new WeakReference(context);
        this.f24714f = new WeakReference(dk2);
        Ab ab2 = Jh.f22942a;
        Jh.a(dk2, this.f24717i);
        WeakReference weakReference = this.f24714f;
        String strL = l();
        AdSet adSetR = r();
        this.f24729u = new C2741b0(weakReference, strL, adSetR != null ? adSetR.isRewarded() : false);
        L();
        this.D = kotlin.b.a(new bk.a() { // from class: b7.d9
            @Override // bk.a
            public final Object invoke() {
                return AbstractC2995l1.e(this.f4896b);
            }
        });
    }

    public final void A() {
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("l1", "TAG");
            c3053n9.a("l1", "initTelemetry " + this);
        }
        this.f24733y.put("AdImpressionSuccessful", this.f24734z);
    }

    public final boolean B() throws JSONException {
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("l1", "TAG");
            c3053n9.c("l1", "isBlockingStateForLoadWithResponse getter " + this + " state=" + ((int) this.f24710b));
        }
        if (!W6.a()) {
            d();
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.GDPR_COMPLIANCE_ENFORCED), true, (short) 2141);
            return true;
        }
        if (E()) {
            C3053n9 c3053n10 = this.f24717i;
            if (c3053n10 != null) {
                ck.p.i("l1", "TAG");
                c3053n10.b("l1", "Some of the dependency libraries for " + l() + " not found");
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.MISSING_REQUIRED_DEPENDENCIES), true, (short) 2007);
            return true;
        }
        byte b10 = this.f24710b;
        if (b10 == 1) {
            C3053n9 c3053n11 = this.f24717i;
            if (c3053n11 != null) {
                ck.p.i("l1", "TAG");
                c3053n11.b("l1", "load with reasponse called while loading");
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.LOAD_WITH_RESPONSE_CALLED_WHILE_LOADING), false, (short) 2001);
            return true;
        }
        if (b10 != 7) {
            return false;
        }
        C3053n9 c3053n12 = this.f24717i;
        if (c3053n12 != null) {
            ck.p.i("l1", "TAG");
            c3053n12.b("l1", "ad active before load");
        }
        b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE), false, (short) 2003);
        return true;
    }

    public void C() {
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("l1", "TAG");
            c3053n9.c("l1", "load  " + this);
        }
        C3144r1 c3144r1 = this.f24734z;
        c3144r1.getClass();
        c3144r1.f25219c = SystemClock.elapsedRealtime();
        a(new bk.a() { // from class: b7.a9
            @Override // bk.a
            public final Object invoke() {
                return AbstractC2995l1.a(this.f4844b);
            }
        }, new bk.l() { // from class: b7.b9
            @Override // bk.l
            public final Object invoke(Object obj) {
                return AbstractC2995l1.a(this.f4860b, (EnumC2721a6) obj);
            }
        });
    }

    public final void D() {
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("l1", "TAG");
            c3053n9.a("l1", "makeUnitActive " + this);
        }
        this.f24719k = false;
    }

    public boolean E() {
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("l1", "TAG");
            c3053n9.c("l1", "missingPrerequisitesForAd " + this);
        }
        try {
            ck.s.b(CustomTabsClient.class).i();
            return false;
        } catch (NoClassDefFoundError unused) {
            return true;
        }
    }

    public void F() {
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("l1", "TAG");
            c3053n9.c("l1", "onDidParseAfterFetch " + this);
        }
        c((byte) 2);
        Handler handler = this.f24718j;
        if (handler != null) {
            handler.post(new Runnable() { // from class: b7.f9
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC2995l1.c(this.f4927b);
                }
            });
        }
    }

    public final Le G() {
        Integer num;
        Integer num2;
        Integer num3;
        AdConfig.RenderingConfig rendering;
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("l1", "TAG");
            c3053n9.a("l1", "prepareAdRequest " + this);
        }
        Context contextN = n();
        C2859ff c2859ff = contextN != null ? new C2859ff(contextN, this.f24717i) : null;
        String str = this.f24720l.f25511g;
        ck.p.g(str);
        this.f24720l.getClass();
        C3243v0 c3243v0 = this.f24720l;
        Map map = c3243v0.f25507c;
        long j10 = c3243v0.f25505a;
        String str2 = c3243v0.f25513i;
        String strL = l();
        HashMap mapK = k();
        String str3 = this.f24720l.f25508d;
        AdConfig adConfig = this.f24711c;
        C3044n0 c3044n0 = new C3044n0(str, map, j10, str2, strL, mapK, str3, adConfig != null && (rendering = adConfig.getRendering()) != null && rendering.getEnablePubMuteControl() && Ji.f22956f);
        C3056nc c3056nc = this.f24731w;
        int iIntValue = 15000;
        long jIntValue = (c3056nc == null || (num3 = c3056nc.f24891d) == null) ? 15000 : num3.intValue();
        C3056nc c3056nc2 = this.f24731w;
        long jIntValue2 = (c3056nc2 == null || (num2 = c3056nc2.f24891d) == null) ? 15000 : num2.intValue();
        C3056nc c3056nc3 = this.f24731w;
        if (c3056nc3 != null && (num = c3056nc3.f24891d) != null) {
            iIntValue = num.intValue();
        }
        C3114pk c3114pk = new C3114pk(jIntValue, jIntValue2, iIntValue);
        AdConfig adConfig2 = this.f24711c;
        String url = adConfig2 != null ? adConfig2.getUrl() : null;
        AdConfig adConfig3 = this.f24711c;
        ck.p.g(adConfig3);
        Ak ak2 = new Ak(adConfig3.getIncludeIdParams());
        C2808df c2808dfA = c2859ff != null ? c2859ff.a() : null;
        C3053n9 c3053n10 = this.f24717i;
        AdConfig adConfig4 = this.f24711c;
        return new C3094p0(url, ak2, c3044n0, c3114pk, c2808dfA, c3053n10, adConfig4 != null ? adConfig4.getApplyGzipReq() : false).a();
    }

    public final void H() {
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("l1", "TAG");
            c3053n9.c("l1", "printPublisherTestId " + this);
        }
        AbstractC3363zk.b();
    }

    public void I() throws JSONException {
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("l1", "TAG");
            c3053n9.a("l1", "resetContainersForNextAd " + this);
        }
        int size = this.f24716h.size();
        int i10 = this.f24724p;
        if (size <= i10 || this.f24716h.get(i10) == null) {
            return;
        }
        a(this.f24724p, false);
    }

    public final void J() {
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("l1", "TAG");
            c3053n9.d("l1", "AdUnit " + this + " state - FAILED");
        }
        c((byte) 3);
        b((byte) 1);
    }

    public void K() {
        ck.p.j(ActivityChooserModel.ATTRIBUTE_ACTIVITY, "monetizationContext");
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("l1", "TAG");
            c3053n9.c("l1", "setMonetizationContext " + this);
        }
        C3243v0 c3243v0 = this.f24720l;
        c3243v0.getClass();
        ck.p.j(ActivityChooserModel.ATTRIBUTE_ACTIVITY, "<set-?>");
        c3243v0.f25513i = ActivityChooserModel.ATTRIBUTE_ACTIVITY;
    }

    public final void L() {
        ck.p.i("l1", "TAG");
        toString();
        this.f24713e = y();
        c((byte) 0);
        this.f24718j = new Handler(Looper.getMainLooper());
        this.f24722n = new C3089ok(this);
    }

    public final boolean M() {
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("l1", "TAG");
            c3053n9.c("l1", "shouldBlockLoadAd " + this);
        }
        com.inmobi.media.ads.network.common.model.Ad adB = b(0);
        if (adB != null && 4 == this.f24710b && !z()) {
            AbstractC2871g1 abstractC2871g1M = m();
            if (abstractC2871g1M != null) {
                C3053n9 c3053n10 = this.f24717i;
                if (c3053n10 != null) {
                    ck.p.i("l1", "TAG");
                    c3053n10.a("l1", "ad is ready - load success");
                }
                d(abstractC2871g1M);
            } else {
                c((short) 2188);
            }
            return true;
        }
        if (adB == null) {
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_NO_LONGER_AVAILABLE), true, (short) 2131);
            C3053n9 c3053n11 = this.f24717i;
            if (c3053n11 != null) {
                ck.p.i("l1", "TAG");
                c3053n11.b("l1", "ad no longer available");
            }
            return true;
        }
        if (2 == this.f24710b) {
            if (!z()) {
                return false;
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_NO_LONGER_AVAILABLE), true, (short) 2133);
            C3053n9 c3053n12 = this.f24717i;
            if (c3053n12 != null) {
                ck.p.i("l1", "TAG");
                c3053n12.b("l1", "ad is expired");
            }
            return true;
        }
        b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_NO_LONGER_AVAILABLE), true, (short) 2132);
        C3053n9 c3053n13 = this.f24717i;
        if (c3053n13 != null) {
            ck.p.i("l1", "TAG");
            c3053n13.b("l1", "ad no longer available. state - " + ((int) this.f24710b));
        }
        return true;
    }

    public final void N() {
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads;
        com.inmobi.media.ads.network.common.model.Ad ad2;
        int i10;
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("l1", "TAG");
            c3053n9.c("l1", "startLoadingHTMLAd " + this);
        }
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci = null;
        try {
            AdSet adSetR = r();
            com.inmobi.media.ads.network.common.model.Ad ad3 = (adSetR == null || (i10 = this.f24723o) < 0 || i10 >= adSetR.getAds().size()) ? null : adSetR.getAds().get(this.f24723o);
            d(this.f24723o);
            C3053n9 c3053n10 = this.f24717i;
            if (c3053n10 != null) {
                ck.p.i("l1", "TAG");
                AdSet adSetR2 = r();
                c3053n10.a("l1", "Loading ad with impressionId : " + ((adSetR2 == null || (ads = adSetR2.getAds()) == null || (ad2 = ads.get(this.f24723o)) == null) ? null : ad2.getImpressionId()));
            }
            GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci2 = (GestureDetectorOnGestureListenerC2785ci) this.f24716h.get(this.f24723o);
            if (ad3 != null) {
                Gg pubContent = ad3.getPubContent();
                if (pubContent instanceof U7) {
                    C3053n9 c3053n11 = this.f24717i;
                    if (c3053n11 != null) {
                        ck.p.i("l1", "TAG");
                        c3053n11.a("l1", "Loading HTML content into WebView");
                    }
                    if (gestureDetectorOnGestureListenerC2785ci2 != null) {
                        gestureDetectorOnGestureListenerC2785ci2.h(((U7) pubContent).f23624a);
                    }
                } else if (pubContent instanceof V7) {
                    C3053n9 c3053n12 = this.f24717i;
                    if (c3053n12 != null) {
                        ck.p.i("l1", "TAG");
                        c3053n12.a("l1", "Loading HTML URL into WebView");
                    }
                    if (gestureDetectorOnGestureListenerC2785ci2 != null) {
                        gestureDetectorOnGestureListenerC2785ci2.j(lk.a0.k1(((V7) pubContent).f23692a).toString());
                    }
                }
            }
            if (gestureDetectorOnGestureListenerC2785ci2 == null || !ck.p.e(s(), "htmlUrl")) {
                return;
            }
            m(gestureDetectorOnGestureListenerC2785ci2);
        } catch (Exception e10) {
            C3053n9 c3053n13 = this.f24717i;
            if (c3053n13 != null) {
                ck.p.i("l1", "TAG");
                c3053n13.a("l1", "Loading ad markup into container encountered an unexpected error: " + e10.getMessage());
            }
            mj.g gVar = P9.f23321a;
            AbstractC2929i9.a(e10);
            int i11 = this.f24723o;
            if (i11 >= 0 && i11 < this.f24716h.size()) {
                gestureDetectorOnGestureListenerC2785ci = (GestureDetectorOnGestureListenerC2785ci) this.f24716h.get(this.f24723o);
            }
            a(gestureDetectorOnGestureListenerC2785ci, (short) 2135);
        }
    }

    public final void O() {
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("l1", "TAG");
            c3053n9.c("l1", "submitAdLoadCalled " + this);
        }
        HashMap map = new HashMap();
        c(map);
        c("AdLoadCalled", map);
    }

    public final void P() {
        String impressionId;
        MetaInfo metaInfo;
        String creativeType;
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("l1", "TAG");
            c3053n9.c("l1", "submitAdLoadSuccessfulEvent ADunit markuptype : " + s() + com.ironsource.Z7.f27998r + this);
        }
        HashMap map = new HashMap();
        long j10 = this.f24734z.f25219c;
        nk.l0 l0Var = AbstractC2940il.f24565a;
        map.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j10));
        map.put("markupType", s());
        com.inmobi.media.ads.network.common.model.Ad adO = o();
        if (adO == null || (impressionId = adO.getImpressionId()) == null) {
            impressionId = "";
        }
        map.put("impressionId", impressionId);
        com.inmobi.media.ads.network.common.model.Ad adO2 = o();
        if (adO2 != null && (metaInfo = adO2.getMetaInfo()) != null && (creativeType = metaInfo.getCreativeType()) != null) {
            map.put("creativeType", creativeType);
        }
        C2854fa c2854fa = this.f24730v;
        if (c2854fa != null) {
            map.put("retryCount", Integer.valueOf(c2854fa.f24363b));
        }
        AdSet adSetR = r();
        if (adSetR != null) {
            map.put("isRewarded", Boolean.valueOf(adSetR.isRewarded()));
        }
        if (x().length() > 0) {
            map.put("metadataBlob", x());
        }
        c(map);
        c("AdLoadSuccessful", map);
    }

    public final void Q() {
        String impressionId;
        MetaInfo metaInfo;
        String creativeType;
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("l1", "TAG");
            c3053n9.c("l1", "submitAdShowCalled " + this);
        }
        C3144r1 c3144r1 = this.f24734z;
        c3144r1.getClass();
        c3144r1.f25222f = SystemClock.elapsedRealtime();
        HashMap map = new HashMap();
        map.put("markupType", s());
        com.inmobi.media.ads.network.common.model.Ad adP = p();
        if (adP == null || (impressionId = adP.getImpressionId()) == null) {
            impressionId = "";
        }
        map.put("impressionId", impressionId);
        long j10 = this.f24734z.f25225i;
        nk.l0 l0Var = AbstractC2940il.f24565a;
        map.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j10));
        com.inmobi.media.ads.network.common.model.Ad adP2 = p();
        if (adP2 != null && (metaInfo = adP2.getMetaInfo()) != null && (creativeType = metaInfo.getCreativeType()) != null) {
            map.put("creativeType", creativeType);
        }
        AdSet adSetR = r();
        if (adSetR != null) {
            map.put("isRewarded", Boolean.valueOf(adSetR.isRewarded()));
        }
        if (x().length() > 0) {
            map.put("metadataBlob", x());
        }
        c(map);
        c("AdShowCalled", map);
    }

    public final void R() {
        String impressionId;
        MetaInfo metaInfo;
        String creativeType;
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("l1", "TAG");
            c3053n9.c("l1", "submitAdShowSuccess " + this);
        }
        HashMap map = new HashMap();
        long j10 = this.f24734z.f25222f;
        nk.l0 l0Var = AbstractC2940il.f24565a;
        map.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j10));
        map.put("markupType", s());
        com.inmobi.media.ads.network.common.model.Ad adP = p();
        if (adP == null || (impressionId = adP.getImpressionId()) == null) {
            impressionId = "";
        }
        map.put("impressionId", impressionId);
        com.inmobi.media.ads.network.common.model.Ad adP2 = p();
        if (adP2 != null && (metaInfo = adP2.getMetaInfo()) != null && (creativeType = metaInfo.getCreativeType()) != null) {
            map.put("creativeType", creativeType);
        }
        AdSet adSetR = r();
        if (adSetR != null) {
            map.put("isRewarded", Boolean.valueOf(adSetR.isRewarded()));
        }
        if (x().length() > 0) {
            map.put("metadataBlob", x());
        }
        c(map);
        c("AdShowSuccessful", map);
    }

    public final void S() {
        String impressionId;
        MetaInfo metaInfo;
        String creativeType;
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("l1", "TAG");
            c3053n9.c("l1", "submitRenderSuccessEvent ADunit markuptype : " + s() + com.ironsource.Z7.f27998r + this);
        }
        HashMap map = new HashMap();
        long j10 = this.f24734z.f25223g;
        nk.l0 l0Var = AbstractC2940il.f24565a;
        map.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j10));
        map.put("markupType", s());
        com.inmobi.media.ads.network.common.model.Ad adP = p();
        if (adP == null || (impressionId = adP.getImpressionId()) == null) {
            impressionId = "";
        }
        map.put("impressionId", impressionId);
        com.inmobi.media.ads.network.common.model.Ad adP2 = p();
        if (adP2 != null && (metaInfo = adP2.getMetaInfo()) != null && (creativeType = metaInfo.getCreativeType()) != null) {
            map.put("creativeType", creativeType);
        }
        C2854fa c2854fa = this.f24730v;
        if (c2854fa != null) {
            map.put("retryCount", Integer.valueOf(c2854fa.f24363b));
        }
        map.put("plType", Byte.valueOf(t()));
        AdSet adSetR = r();
        if (adSetR != null) {
            map.put("isRewarded", Boolean.valueOf(adSetR.isRewarded()));
        }
        if (x().length() > 0) {
            map.put("metadataBlob", x());
        }
        c(map);
        a(p(), map);
        c("RenderSuccess", map);
    }

    public final long T() {
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("l1", "TAG");
            c3053n9.c("l1", "timeSincePodShow " + this);
        }
        if (this.f24727s) {
            return System.currentTimeMillis() - this.f24725q;
        }
        return -1L;
    }

    public final void U() {
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("l1", "TAG");
            c3053n9.b("l1", "ad unloaded");
        }
        C3053n9 c3053n10 = this.f24717i;
        if (c3053n10 != null) {
            ck.p.i("l1", "TAG");
            c3053n10.d("l1", "AdUnit " + this + " state - UNLOADED");
        }
        c((byte) 8);
    }

    public final void f() throws JSONException {
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("l1", "TAG");
            c3053n9.c("l1", "destroyAllContainer " + this);
        }
        int size = this.f24716h.size();
        for (int i10 = 0; i10 < size; i10++) {
            a(i10, true);
        }
    }

    @Override // com.inmobi.media.AbstractC2836ei
    public final void k(GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci) throws JSONException {
        ck.p.j(gestureDetectorOnGestureListenerC2785ci, "renderView");
        byte b10 = this.f24710b;
        if (b10 == 2) {
            U();
            b((byte) 1);
            AbstractC2871g1 abstractC2871g1M = m();
            InMobiAdRequestStatus inMobiAdRequestStatus = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR);
            if (abstractC2871g1M != null) {
                abstractC2871g1M.a(this, inMobiAdRequestStatus);
            } else {
                C3053n9 c3053n9 = this.f24717i;
                if (c3053n9 != null) {
                    c3053n9.a();
                }
            }
            c((short) 2238);
            gestureDetectorOnGestureListenerC2785ci.b();
            return;
        }
        if (b10 == 4) {
            p(gestureDetectorOnGestureListenerC2785ci);
            gestureDetectorOnGestureListenerC2785ci.b();
            b((byte) 4);
        } else {
            if (b10 == 6 || b10 == 7) {
                q(gestureDetectorOnGestureListenerC2785ci);
                return;
            }
            C3053n9 c3053n10 = this.f24717i;
            if (c3053n10 != null) {
                ck.p.i("l1", "TAG");
                c3053n10.b("l1", "onUnloadCalled - invalid state - " + ((int) this.f24710b));
            }
        }
    }

    public final void l(GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci) {
        int iIndexOf = this.f24716h.indexOf(gestureDetectorOnGestureListenerC2785ci);
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("l1", "TAG");
            c3053n9.b("l1", "fireLoadAdTokenUrlFailed : " + iIndexOf + com.ironsource.Z7.f27998r + this);
        }
        com.inmobi.media.ads.network.common.model.Ad adB = b(iIndexOf);
        if (adB != null) {
            for (String str : AbstractC3336yi.a(adB, "load_ad_token_url_failure")) {
                C3271w3 c3271w3 = C3271w3.f25610a;
                C3053n9 c3053n10 = this.f24717i;
                ck.p.j(str, "url");
                C3271w3.a(str, true, c3053n10);
            }
        }
    }

    public final int n(GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci) {
        ck.p.j(gestureDetectorOnGestureListenerC2785ci, "renderView");
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("l1", "TAG");
            c3053n9.c("l1", "getCurrentRenderingPodAdIndex " + this);
        }
        if (!this.f24727s) {
            return -1;
        }
        int iIndexOf = this.f24716h.indexOf(gestureDetectorOnGestureListenerC2785ci);
        C3053n9 c3053n10 = this.f24717i;
        if (c3053n10 != null) {
            ck.p.i("l1", "TAG");
            c3053n10.c("l1", "getCurrentRenderingPodAdIndex " + iIndexOf);
        }
        return iIndexOf;
    }

    public void q(GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci) {
        ck.p.j(gestureDetectorOnGestureListenerC2785ci, "renderView");
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("l1", "TAG");
            c3053n9.c("l1", "onAdUnloadedAfterShowSuccess");
        }
        gestureDetectorOnGestureListenerC2785ci.m();
        b((byte) 4);
    }

    public final AdSet r() {
        List<AdSet> adSets;
        AdResponse adResponse = this.f24721m;
        if (adResponse == null || (adSets = adResponse.getAdSets()) == null) {
            return null;
        }
        return (AdSet) nj.b0.h0(adSets);
    }

    public final String s() {
        String markupType;
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("l1", "TAG");
            c3053n9.c("l1", "markupType getter " + this);
        }
        com.inmobi.media.ads.network.common.model.Ad adB = b(0);
        return (adB == null || (markupType = adB.getMarkupType()) == null) ? "unknown" : markupType;
    }

    public final String u() {
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("l1", "TAG");
            c3053n9.c("l1", "getPodAdContext " + this);
        }
        if (this.f24727s) {
            return this.f24728t;
        }
        return null;
    }

    public final JSONArray v() {
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("l1", "TAG");
            c3053n9.c("l1", "getRenderableAdIndexes " + this);
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.f24726r.iterator();
        ck.p.i(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            ck.p.i(next, "next(...)");
            jSONArray.put(((Number) next).intValue());
        }
        return jSONArray;
    }

    public final long w() {
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("l1", "TAG");
            c3053n9.c("l1", "getShowTimeStamp " + this);
        }
        if (this.f24727s) {
            return this.f24725q;
        }
        return -1L;
    }

    public final TimeoutConfigurations y() {
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("l1", "TAG");
            c3053n9.c("l1", "timeOutConfiguration getter " + this);
        }
        AdConfig adConfig = this.f24711c;
        ck.p.g(adConfig);
        return adConfig.getTimeouts();
    }

    public final void d(int i10) {
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci;
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("l1", "TAG");
            c3053n9.a("l1", "initializeHtmlAdContainer " + this);
        }
        Context contextN = n();
        if (contextN == null) {
            return;
        }
        try {
            if (this.f24716h.get(i10) == null || ((gestureDetectorOnGestureListenerC2785ci = (GestureDetectorOnGestureListenerC2785ci) this.f24716h.get(i10)) != null && gestureDetectorOnGestureListenerC2785ci.M.get())) {
                com.inmobi.media.ads.network.common.model.Ad adB = b(i10);
                C3069o0 c3069o0A = a(i10);
                GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ciA = ((ko) this.B.getValue()).a(new Di("adUnit-" + i10, "default"), contextN, (short) 0, c3069o0A, this.f24711c);
                a(gestureDetectorOnGestureListenerC2785ciA, c3069o0A.f24932p);
                this.f24716h.set(i10, gestureDetectorOnGestureListenerC2785ciA);
                gestureDetectorOnGestureListenerC2785ciA.a(this);
                gestureDetectorOnGestureListenerC2785ciA.a(adB);
            }
        } catch (Exception e10) {
            a((GestureDetectorOnGestureListenerC2785ci) this.f24716h.get(this.f24723o), (short) 2136);
            C3053n9 c3053n10 = this.f24717i;
            if (c3053n10 != null) {
                ck.p.i("l1", "TAG");
                c3053n10.a("l1", "Exception while initializing WebView", e10);
            }
            mj.g gVar = P9.f23321a;
            AbstractC2929i9.a(e10);
        }
    }

    public final String x() {
        com.inmobi.media.ads.network.common.model.Ad ad2;
        String telemetryMetadataBlob;
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads;
        AdSet adSetR = r();
        if (adSetR != null && (ads = adSetR.getAds()) != null) {
            ad2 = (com.inmobi.media.ads.network.common.model.Ad) nj.b0.h0(ads);
        } else {
            ad2 = null;
        }
        if (ad2 != null && (telemetryMetadataBlob = ad2.getTelemetryMetadataBlob()) != null) {
            return telemetryMetadataBlob;
        }
        return "";
    }

    @Override // com.inmobi.media.AbstractC2836ei
    public final void h(final GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci) {
        Handler handler;
        ck.p.j(gestureDetectorOnGestureListenerC2785ci, "renderView");
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("l1", "TAG");
            c3053n9.a("l1", "onRenderViewSignaledAdFailed " + this);
        }
        if (this.f24719k || n() == null || (handler = this.f24718j) == null) {
            return;
        }
        handler.post(new Runnable() { // from class: b7.y8
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC2995l1.a(this.f5265b, gestureDetectorOnGestureListenerC2785ci);
            }
        });
    }

    @Override // com.inmobi.media.AbstractC2836ei
    public void j(GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci) {
        ck.p.j(gestureDetectorOnGestureListenerC2785ci, "renderView");
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("l1", "TAG");
            c3053n9.a("l1", "RenderView visible, for index " + this.f24716h.indexOf(gestureDetectorOnGestureListenerC2785ci) + com.ironsource.Z7.f27998r + this);
        }
    }

    public final void m(GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci) {
        int iIndexOf = this.f24716h.indexOf(gestureDetectorOnGestureListenerC2785ci);
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("l1", "TAG");
            c3053n9.a("l1", "fireLoadAdTokenUrlSuccessful : " + iIndexOf + com.ironsource.Z7.f27998r + this);
        }
        com.inmobi.media.ads.network.common.model.Ad adB = b(iIndexOf);
        if (adB != null) {
            for (String str : AbstractC3336yi.a(adB, "load_ad_token_url")) {
                C3271w3 c3271w3 = C3271w3.f25610a;
                C3053n9 c3053n10 = this.f24717i;
                ck.p.j(str, "url");
                C3271w3.a(str, true, c3053n10);
            }
        }
    }

    public void o(GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci) {
        Gh gh2;
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("l1", "TAG");
            c3053n9.a("l1", "Render view signaled ad ready, for index " + this.f24716h.indexOf(gestureDetectorOnGestureListenerC2785ci) + com.ironsource.Z7.f27998r + this);
        }
        C3053n9 c3053n10 = this.f24717i;
        if (c3053n10 != null) {
            ck.p.i("l1", "TAG");
            c3053n10.a("l1", "==== CHECKPOINT REACHED - LOAD SUCCESS ====");
        }
        C3053n9 c3053n11 = this.f24717i;
        if (c3053n11 == null || (gh2 = c3053n11.f24879a) == null) {
            return;
        }
        gh2.a();
    }

    public void p(GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci) {
        int iN;
        ck.p.j(gestureDetectorOnGestureListenerC2785ci, "renderView");
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("l1", "TAG");
            c3053n9.c("l1", "onAdUnloadedAfterLoadSuccess");
        }
        if (this.f24727s && (iN = n(gestureDetectorOnGestureListenerC2785ci)) > this.f24724p) {
            this.f24726r.remove(Integer.valueOf(iN));
        } else {
            U();
        }
    }

    public final void b(AbstractC2871g1 abstractC2871g1) {
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("l1", "TAG");
            c3053n9.a("l1", "onAdShowFailed " + this);
        }
        d((short) 85);
        abstractC2871g1.b();
    }

    public final void b(InMobiAdRequestStatus inMobiAdRequestStatus, short s10) {
        ck.p.j(inMobiAdRequestStatus, "requestStatus");
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("l1", "TAG");
            c3053n9.a("l1", "onAdFetchFailed " + this);
        }
        if (!this.f24719k && n() != null && this.f24710b != 3) {
            a(inMobiAdRequestStatus, s10);
            return;
        }
        C3053n9 c3053n10 = this.f24717i;
        if (c3053n10 != null) {
            ck.p.i("l1", "TAG");
            c3053n10.b("l1", "callback ignored - isDestroyed - " + this.f24719k + " context - " + n() + " state- " + ((int) this.f24710b));
        }
    }

    @Override // com.inmobi.media.AbstractC2836ei
    public final void i(final GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci) {
        ck.p.j(gestureDetectorOnGestureListenerC2785ci, "renderView");
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("l1", "TAG");
            c3053n9.a("l1", "onRenderViewSignaledAdReady " + this);
        }
        if (!this.f24719k && n() != null) {
            Handler handler = this.f24718j;
            if (handler != null) {
                handler.post(new Runnable() { // from class: b7.g9
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC2995l1.b(this.f4946b, gestureDetectorOnGestureListenerC2785ci);
                    }
                });
                return;
            } else {
                c((short) 2187);
                return;
            }
        }
        c((short) 2186);
    }

    public final void e() throws JSONException {
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("l1", "TAG");
            c3053n9.a("l1", "clearAdPods " + this);
        }
        if (this.f24727s) {
            f();
            this.f24716h.clear();
            this.f24723o = 0;
            this.f24724p = 0;
            this.f24726r.clear();
        }
    }

    public final void c(byte b10) {
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("l1", "TAG");
            c3053n9.d("l1", "STATE UPDATE: from " + ((int) this.f24710b) + " to " + ((int) b10));
        }
        this.f24710b = b10;
    }

    public final boolean c(int i10) {
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("l1", "TAG");
            c3053n9.c("l1", "getAllowAutoRedirectionForIndex " + this + " index - " + i10);
        }
        com.inmobi.media.ads.network.common.model.Ad adB = b(i10);
        return adB != null && adB.getAllowAutoRedirection();
    }

    public final void b(InMobiAdRequestStatus inMobiAdRequestStatus, boolean z10, short s10) {
        ck.p.j(inMobiAdRequestStatus, "requestStatus");
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("l1", "TAG");
            c3053n9.b("l1", "handleAdLoadFailure " + this + " errorCode - " + ((int) s10));
        }
        if (this.f24710b == 1 && z10) {
            C3053n9 c3053n10 = this.f24717i;
            if (c3053n10 != null) {
                ck.p.i("l1", "TAG");
                c3053n10.b("l1", "load failed - " + ((int) s10));
            }
            C3053n9 c3053n11 = this.f24717i;
            if (c3053n11 != null) {
                ck.p.i("l1", "TAG");
                c3053n11.d("l1", "AdUnit " + this + " state - FAILED");
            }
            c((byte) 3);
            b((byte) 1);
        }
        AbstractC2871g1 abstractC2871g1M = m();
        if (abstractC2871g1M != null) {
            abstractC2871g1M.a(this, inMobiAdRequestStatus);
        } else {
            C3053n9 c3053n12 = this.f24717i;
            if (c3053n12 != null) {
                c3053n12.a();
            }
        }
        if (s10 != 0) {
            c(s10);
        }
    }

    public final void c(AbstractC2871g1 abstractC2871g1) {
        String impressionId;
        MetaInfo metaInfo;
        String creativeType;
        ck.p.j(abstractC2871g1, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("l1", "TAG");
            c3053n9.c("l1", "onFetchSuccess " + this);
        }
        HashMap map = new HashMap();
        c(map);
        map.put("markupType", s());
        com.inmobi.media.ads.network.common.model.Ad adO = o();
        if (adO == null || (impressionId = adO.getImpressionId()) == null) {
            impressionId = "";
        }
        map.put("impressionId", impressionId);
        long j10 = this.f24734z.f25224h;
        nk.l0 l0Var = AbstractC2940il.f24565a;
        map.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j10));
        map.put("metadataBlob", x());
        C2854fa c2854fa = this.f24730v;
        if (c2854fa != null) {
            map.put("retryCount", Integer.valueOf(c2854fa.f24363b));
        }
        AdSet adSetR = r();
        if (adSetR != null) {
            map.put("isRewarded", Boolean.valueOf(adSetR.isRewarded()));
        }
        com.inmobi.media.ads.network.common.model.Ad adO2 = o();
        if (adO2 != null && (metaInfo = adO2.getMetaInfo()) != null && (creativeType = metaInfo.getCreativeType()) != null) {
            map.put("creativeType", creativeType);
        }
        c("ParseSuccess", map);
        AdMetaInfo adMetaInfoJ = j();
        if (adMetaInfoJ == null) {
            C3053n9 c3053n10 = this.f24717i;
            if (c3053n10 != null) {
                ck.p.i("l1", "TAG");
                c3053n10.b("l1", "ad meta info null. fail");
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2106);
            return;
        }
        C3053n9 c3053n11 = this.f24717i;
        if (c3053n11 != null) {
            ck.p.i("l1", "TAG");
            c3053n11.a("l1", "callback - onAdFetchSuccess");
        }
        abstractC2871g1.b(adMetaInfoJ);
    }

    public final void e(int i10) {
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("l1", "TAG");
            c3053n9.c("l1", "resetCurrentRenderingIndex " + this);
        }
        this.f24724p = i10;
    }

    public static final void a(AbstractC2995l1 abstractC2995l1, W w10) {
        abstractC2995l1.getClass();
        if (w10 instanceof C2881gb) {
            C3144r1 c3144r1 = abstractC2995l1.f24734z;
            c3144r1.getClass();
            c3144r1.f25220d = SystemClock.elapsedRealtime();
            return;
        }
        if (w10 instanceof If) {
            C3144r1 c3144r2 = abstractC2995l1.f24734z;
            c3144r2.getClass();
            c3144r2.f25224h = SystemClock.elapsedRealtime();
        } else {
            if (w10 instanceof Oi) {
                Map map = ((Oi) w10).f23298a;
                Map mapO = kotlin.collections.a.o(mj.h.a("latency", Long.valueOf(SystemClock.elapsedRealtime() - abstractC2995l1.f24734z.f25220d)), mj.h.a("networkType", C3298x5.m()), mj.h.a("plId", Long.valueOf(abstractC2995l1.f24720l.f25505a)));
                mapO.putAll(map);
                String str = abstractC2995l1.f24720l.f25510f;
                if (str != null) {
                    mapO.put("plType", str);
                }
                String str2 = abstractC2995l1.f24720l.f25509e;
                if (str2 != null) {
                    mapO.put("adType", str2);
                }
                abstractC2995l1.b("ServerFill", mapO);
                return;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public static final po e(AbstractC2995l1 abstractC2995l1) {
        com.inmobi.media.ads.network.common.model.Ad adB = abstractC2995l1.b(0);
        if (adB == null || abstractC2995l1.z()) {
            adB = null;
        }
        C3053n9 c3053n9 = abstractC2995l1.f24717i;
        ck.p.i("l1", "TAG");
        return new po(adB, c3053n9);
    }

    @Override // com.inmobi.media.AbstractC2836ei
    public final void g(GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci) {
        ck.p.j(gestureDetectorOnGestureListenerC2785ci, "renderView");
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("l1", "TAG");
            c3053n9.a("l1", "RenderView completed loading ad content, for index " + this.f24716h.indexOf(gestureDetectorOnGestureListenerC2785ci) + com.ironsource.Z7.f27998r + this);
        }
    }

    public final void d(AbstractC2871g1 abstractC2871g1) {
        ck.p.j(abstractC2871g1, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("l1", "TAG");
            c3053n9.a("l1", "onLoadSuccess " + this);
        }
        AdMetaInfo adMetaInfoJ = j();
        if (adMetaInfoJ == null) {
            C3053n9 c3053n10 = this.f24717i;
            if (c3053n10 != null) {
                ck.p.i("l1", "TAG");
                c3053n10.b("l1", "load success - ad unit null");
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2107);
            return;
        }
        b((byte) 1);
        C3053n9 c3053n11 = this.f24717i;
        if (c3053n11 != null) {
            ck.p.i("l1", "TAG");
            c3053n11.a("l1", "callback - onAdLoadSucceeded");
        }
        abstractC2871g1.c(adMetaInfoJ);
    }

    public static final void b(AbstractC2995l1 abstractC2995l1, GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci) {
        abstractC2995l1.o(gestureDetectorOnGestureListenerC2785ci);
    }

    public final void b(String str) {
        ck.p.j(str, "podAdContext");
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("l1", "TAG");
            c3053n9.c("l1", "setPodAdContext " + this);
        }
        if (this.f24727s) {
            this.f24728t = str;
        }
    }

    public static final void b(AbstractC2995l1 abstractC2995l1) {
        if (6 == abstractC2995l1.f24710b) {
            abstractC2995l1.a((short) 2158);
        }
    }

    @Override // com.inmobi.media.AbstractC2836ei
    public final void b(HashMap map) {
        ck.p.j(map, "rewards");
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("l1", "TAG");
            c3053n9.c("l1", "onAdRewardActionCompleted " + this);
        }
        if (this.f24719k || n() == null) {
            return;
        }
        C3053n9 c3053n10 = this.f24717i;
        if (c3053n10 != null) {
            ck.p.i("l1", "TAG");
            c3053n10.a("l1", "Ad reward action completed. Params:" + map);
        }
        AbstractC2871g1 abstractC2871g1M = m();
        if (abstractC2871g1M != null) {
            abstractC2871g1M.b(map);
        }
    }

    public void d() throws JSONException {
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("l1", "TAG");
            c3053n9.a("l1", "clear " + this);
        }
        if (this.f24719k) {
            return;
        }
        this.f24719k = true;
        Handler handler = this.f24718j;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        e();
        C2854fa c2854fa = this.f24730v;
        if (c2854fa != null) {
            c2854fa.f24363b = 0;
        }
        I();
        c((byte) 0);
        C3053n9 c3053n10 = this.f24717i;
        if (c3053n10 != null) {
            ck.p.i("l1", "TAG");
            c3053n10.d("l1", "AdUnit " + this + " state - CREATED");
        }
        C3328ya c3328ya = this.f24715g;
        String str = this.f24709a;
        c3328ya.getClass();
        ck.p.j(str, "id");
        List list = (List) c3328ya.f25780b.get(str);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                kotlinx.coroutines.g.a.a((kotlinx.coroutines.g) it.next(), null, 1, null);
            }
        }
        List list2 = (List) c3328ya.f25780b.get(str);
        if (list2 != null) {
            list2.clear();
        }
        this.f24721m = null;
        this.f24727s = false;
    }

    public final void b(short s10) {
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("l1", "TAG");
            c3053n9.c("l1", "submitAdLoadDroppedAtSDK " + this);
        }
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s10));
        c(map);
        c("AdLoadDroppedAtSDK", map);
    }

    public final void b(Map map) {
        MetaInfo metaInfo;
        String creativeType;
        map.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - this.f24734z.f25220d));
        map.put("networkType", C3298x5.m());
        map.put("plId", Long.valueOf(this.f24720l.f25505a));
        AdSet adSetR = r();
        map.put("isRewarded", Boolean.valueOf(adSetR != null ? adSetR.isRewarded() : false));
        String str = this.f24720l.f25509e;
        if (str != null) {
            map.put("adType", str);
        }
        String str2 = this.f24720l.f25510f;
        if (str2 != null) {
            map.put("plType", str2);
        }
        C2854fa c2854fa = this.f24730v;
        if (c2854fa != null) {
            map.put("retryCount", Integer.valueOf(c2854fa.f24363b));
        }
        com.inmobi.media.ads.network.common.model.Ad adO = o();
        if (adO != null && (metaInfo = adO.getMetaInfo()) != null && (creativeType = metaInfo.getCreativeType()) != null) {
            map.put("creativeType", creativeType);
        }
        a(o(), map);
        b("ServerError", map);
    }

    @Override // com.inmobi.media.AbstractC2836ei
    public final void c() {
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("l1", "TAG");
            c3053n9.c("l1", "onAdScreenDisplayFailed " + this);
        }
        if (this.f24719k || n() == null) {
            return;
        }
        C3053n9 c3053n10 = this.f24717i;
        if (c3053n10 != null) {
            ck.p.i("l1", "TAG");
            c3053n10.b("l1", "Ad failed to display");
        }
        Handler handler = this.f24718j;
        if (handler != null) {
            handler.post(new Runnable() { // from class: b7.x8
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC2995l1.b(this.f5251b);
                }
            });
        }
    }

    public final void a(Context context, C3243v0 c3243v0, Dk dk2) {
        C3243v0 c3243v1;
        String str;
        String str2;
        C3053n9 c3053n9;
        C3053n9 c3053n10;
        C3053n9 c3053n11;
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        ck.p.j(c3243v0, "adPlacement");
        ck.p.i("l1", "TAG");
        toString();
        a(context);
        this.f24714f = new WeakReference(dk2);
        Ab ab2 = Jh.f22942a;
        Jh.a(dk2, this.f24717i);
        WeakReference weakReference = this.f24714f;
        String strL = l();
        AdSet adSetR = r();
        this.f24729u = new C2741b0(weakReference, strL, adSetR != null ? adSetR.isRewarded() : false);
        this.f24720l = c3243v0;
        A();
        C3053n9 c3053n12 = this.f24717i;
        if (c3053n12 != null) {
            ck.p.i("l1", "TAG");
            c3053n12.c("l1", "initInternetAvailabilityAdRetry");
        }
        if (this.f24711c == null && (c3053n11 = this.f24717i) != null) {
            ck.p.i("l1", "TAG");
            c3053n11.c("l1", "adConfig is null");
            mj.r rVar = mj.r.f64562a;
        }
        if (this.f24720l.f25510f == null && (c3053n10 = this.f24717i) != null) {
            ck.p.i("l1", "TAG");
            c3053n10.c("l1", "placement.placementType is null");
            mj.r rVar2 = mj.r.f64562a;
        }
        if (this.f24720l.f25509e == null && (c3053n9 = this.f24717i) != null) {
            ck.p.i("l1", "TAG");
            c3053n9.c("l1", "placement.adType is null");
            mj.r rVar3 = mj.r.f64562a;
        }
        AdConfig adConfig = this.f24711c;
        if (adConfig != null && (str = (c3243v1 = this.f24720l).f25510f) != null && (str2 = c3243v1.f25509e) != null) {
            C3056nc c3056ncA = AbstractC3031mc.a(adConfig.getTimeouts().X(), str, str2, Ki.f23020b);
            this.f24730v = new C2854fa(c3056ncA);
            this.f24731w = c3056ncA;
        }
        if (J5.f22900h != null) {
            ck.p.i("J5", "TAG");
        } else {
            J5.f22900h = Float.valueOf(new TextView(context).getTextSize());
            ck.p.i("J5", "TAG");
        }
        L();
    }

    public final void c(HashMap map) {
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("l1", "TAG");
            c3053n9.c("l1", "constructTelemetryPayload " + this);
        }
        map.put("adType", l());
        map.put("networkType", C3298x5.m());
        map.put("plId", Long.valueOf(this.f24720l.f25505a));
        String str = this.f24720l.f25510f;
        if (str != null) {
            map.put("plType", str);
        }
    }

    @Override // com.inmobi.media.AbstractC2836ei
    public final void d(GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci) {
        ck.p.j(gestureDetectorOnGestureListenerC2785ci, "renderView");
        if (this.C) {
            return;
        }
        this.C = true;
        C3037mi c3037mi = gestureDetectorOnGestureListenerC2785ci.f24152d0;
        if (c3037mi != null) {
            Map mapA = c3037mi.a();
            Wj wj2 = Wj.f23753a;
            Wj.b("AttachedToWindow", mapA, EnumC2735ak.SDK);
        }
    }

    public final void c(short s10) {
        long j10;
        long jElapsedRealtime;
        String impressionId;
        MetaInfo metaInfo;
        String creativeType;
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("l1", "TAG");
            c3053n9.c("l1", "submitAdLoadFailedEvent " + this);
        }
        HashMap map = new HashMap();
        if (s10 == 2138 || s10 == 2109) {
            j10 = this.f24734z.f25221e;
            nk.l0 l0Var = AbstractC2940il.f24565a;
            jElapsedRealtime = SystemClock.elapsedRealtime();
        } else if (s10 == 2139) {
            j10 = this.f24734z.f25223g;
            nk.l0 l0Var2 = AbstractC2940il.f24565a;
            jElapsedRealtime = SystemClock.elapsedRealtime();
        } else {
            j10 = this.f24734z.f25219c;
            nk.l0 l0Var3 = AbstractC2940il.f24565a;
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        map.put("latency", Long.valueOf(jElapsedRealtime - j10));
        map.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s10));
        map.put("markupType", s());
        com.inmobi.media.ads.network.common.model.Ad adO = o();
        if (adO == null || (impressionId = adO.getImpressionId()) == null) {
            impressionId = "";
        }
        map.put("impressionId", impressionId);
        com.inmobi.media.ads.network.common.model.Ad adO2 = o();
        if (adO2 != null && (metaInfo = adO2.getMetaInfo()) != null && (creativeType = metaInfo.getCreativeType()) != null) {
            map.put("creativeType", creativeType);
        }
        C2854fa c2854fa = this.f24730v;
        if (c2854fa != null) {
            map.put("retryCount", Integer.valueOf(c2854fa.f24363b));
        }
        AdSet adSetR = r();
        if (adSetR != null) {
            map.put("isRewarded", Boolean.valueOf(adSetR.isRewarded()));
        }
        if (x().length() > 0) {
            map.put("metadataBlob", x());
        }
        c(map);
        a(o(), map);
        c("AdLoadFailed", map);
    }

    public final void d(short s10) {
        String impressionId;
        MetaInfo metaInfo;
        String creativeType;
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("l1", "TAG");
            c3053n9.c("l1", "submitAdShowFailed " + this);
        }
        HashMap map = new HashMap();
        long j10 = this.f24734z.f25222f;
        nk.l0 l0Var = AbstractC2940il.f24565a;
        map.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j10));
        map.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s10));
        map.put("markupType", s());
        com.inmobi.media.ads.network.common.model.Ad adP = p();
        if (adP == null || (impressionId = adP.getImpressionId()) == null) {
            impressionId = "";
        }
        map.put("impressionId", impressionId);
        com.inmobi.media.ads.network.common.model.Ad adP2 = p();
        if (adP2 != null && (metaInfo = adP2.getMetaInfo()) != null && (creativeType = metaInfo.getCreativeType()) != null) {
            map.put("creativeType", creativeType);
        }
        AdSet adSetR = r();
        if (adSetR != null) {
            map.put("isRewarded", Boolean.valueOf(adSetR.isRewarded()));
        }
        if (x().length() > 0) {
            map.put("metadataBlob", x());
        }
        c(map);
        a(p(), map);
        c("AdShowFailed", map);
    }

    public final void b(String str, Map map) {
        com.inmobi.media.ads.network.common.model.Ad adO;
        MetaInfo metaInfo;
        String creativeType;
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("l1", "TAG");
            c3053n9.c("l1", "onTelemetryEvent " + this + " adState=" + ((int) this.f24710b));
        }
        if (this.f24710b != 3) {
            a(str, map);
            if ((ck.p.e(str, "ServerFill") || ck.p.e(str, "ServerError")) && (adO = o()) != null && (metaInfo = adO.getMetaInfo()) != null && (creativeType = metaInfo.getCreativeType()) != null) {
                map.put("creativeType", creativeType);
            }
            c(str, map);
        }
    }

    public final void b(com.inmobi.media.ads.network.common.model.Ad ad2) {
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads;
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("l1", "TAG");
            c3053n9.c("l1", "updateAd " + this);
        }
        AdSet adSetR = r();
        if (adSetR == null || (ads = adSetR.getAds()) == null) {
            return;
        }
        ads.set(0, ad2);
    }

    public final void b(byte b10) {
        C3089ok c3089ok;
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("l1", "TAG");
            c3053n9.a("l1", "cancelTimer " + this);
        }
        if (b10 == 1 && (c3089ok = this.f24722n) != null) {
            c3089ok.a((byte) 2);
        }
        C3089ok c3089ok2 = this.f24722n;
        if (c3089ok2 != null) {
            c3089ok2.a(b10);
        }
    }

    public final void b(int i10, boolean z10) {
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci;
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("l1", "TAG");
            c3053n9.a("l1", "fireAdPodShowResult " + this);
        }
        ArrayList arrayList = this.f24716h;
        ck.p.j(arrayList, "list");
        if (i10 < 0 || i10 >= arrayList.size() || (gestureDetectorOnGestureListenerC2785ci = (GestureDetectorOnGestureListenerC2785ci) this.f24716h.get(i10)) == null) {
            return;
        }
        gestureDetectorOnGestureListenerC2785ci.b(z10);
    }

    public final void a(Context context) {
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("l1", "TAG");
            c3053n9.c("l1", "setContext " + this);
        }
        this.f24712d = new WeakReference(context);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x004a  */
    public final boolean d(byte b10) {
        int iY;
        Integer num;
        long j10;
        Integer num2;
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("l1", "TAG");
            c3053n9.a("l1", "startTimer " + this);
        }
        if (b10 == 0) {
            C3056nc c3056nc = this.f24731w;
            if (c3056nc == null || (num2 = c3056nc.f24891d) == null) {
                j10 = 15000;
            } else {
                iY = num2.intValue();
                j10 = iY;
            }
        } else if (b10 == 1) {
            C3056nc c3056nc2 = this.f24731w;
            if (c3056nc2 != null) {
                iY = c3056nc2.f24890c;
                j10 = iY;
            } else {
                j10 = 15000;
            }
        } else {
            if (b10 == 2) {
                C3056nc c3056nc3 = this.f24731w;
                if (c3056nc3 == null || (num = c3056nc3.f24892e) == null) {
                    j10 = 15000;
                } else {
                    iY = num.intValue();
                }
            } else if (b10 == 4) {
                TimeoutConfigurations timeoutConfigurations = this.f24713e;
                ck.p.g(timeoutConfigurations);
                iY = timeoutConfigurations.Y();
            } else {
                C3053n9 c3053n10 = this.f24717i;
                if (c3053n10 != null) {
                    ck.p.i("l1", "TAG");
                    c3053n10.b("l1", "Invalid value for timeOutScenario passed!. Please pass a valid value");
                }
                return false;
            }
            j10 = iY;
        }
        C3089ok c3089ok = this.f24722n;
        return c3089ok != null && c3089ok.a(b10, j10);
    }

    /* JADX WARN: Code duplicated, block: B:124:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:125:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:128:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:129:0x0300  */
    /* JADX WARN: Code duplicated, block: B:132:0x0306  */
    /* JADX WARN: Code duplicated, block: B:133:0x030b  */
    /* JADX WARN: Code duplicated, block: B:142:0x0323  */
    /* JADX WARN: Code duplicated, block: B:149:0x0335  */
    /* JADX WARN: Code duplicated, block: B:152:0x033d  */
    /* JADX WARN: Code duplicated, block: B:153:0x0344  */
    /* JADX WARN: Code duplicated, block: B:61:0x0126  */
    /* JADX WARN: Code duplicated, block: B:76:0x0197  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r39v1 */
    /* JADX WARN: Type inference failed for: r39v2, types: [int] */
    /* JADX WARN: Type inference failed for: r39v3 */
    public final C3069o0 a(int i10) {
        String markupType;
        String openMode;
        boolean z10;
        String impressionId;
        String str;
        String telemetryMetadataBlob;
        String str2;
        C2854fa c2854fa;
        ?? r39;
        com.inmobi.media.ads.network.common.model.Ad adO;
        String str3;
        com.inmobi.media.ads.network.common.model.Ad adO2;
        String str4;
        AdSet adSetR;
        boolean zIsRewarded;
        String creativeId;
        MetaInfo metaInfo;
        String creativeType;
        List<LandingPageParam> landingPageParams;
        List<LandingPageParam> landingPageParams2;
        LandingPageParam landingPageParam;
        AdConfig.ViewabilityConfig viewability;
        AdConfig.OmidConfig omidConfig;
        MetaInfo metaInfo2;
        com.inmobi.media.ads.network.common.model.Ad adB = b(i10);
        if (adB == null || (markupType = adB.getMarkupType()) == null) {
            markupType = CreativeInfo.f44315al;
        }
        String str5 = markupType;
        String str6 = "audio";
        String str7 = (ck.p.e(this.f24720l.f25509e, "banner") || ck.p.e(this.f24720l.f25509e, "audio")) ? this.f24720l.f25512h : null;
        String str8 = this.f24720l.f25509e;
        boolean zA = a(adB);
        long j10 = this.f24720l.f25505a;
        boolean zC = c(i10);
        String str9 = this.f24720l.f25515k;
        String creativeType2 = (adB == null || (metaInfo2 = adB.getMetaInfo()) == null) ? null : metaInfo2.getCreativeType();
        AdMetaInfo adMetaInfoJ = j();
        String creativeID = adMetaInfoJ != null ? adMetaInfoJ.getCreativeID() : null;
        boolean z11 = this.f24720l.f25514j;
        LinkedHashMap linkedHashMap = this.f24733y;
        WatermarkData watermarkData = this.A;
        AdQualityControl adQualityControl = adB != null ? adB.getAdQualityControl() : null;
        byte bT = t();
        ck.p.g(adB);
        AdConfig adConfig = this.f24711c;
        ck.p.j(adB, "ad");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        MetaInfo metaInfo3 = adB.getMetaInfo();
        if (ck.p.e((adConfig == null || (viewability = adConfig.getViewability()) == null || (omidConfig = viewability.getOmidConfig()) == null) ? null : Boolean.valueOf(omidConfig.isOmidEnabled()), Boolean.TRUE)) {
            if ((metaInfo3 != null ? metaInfo3.getOmsdkInfo() : null) != null) {
                OmSdkInfo omsdkInfo = metaInfo3.getOmsdkInfo();
                if (omsdkInfo.getOmidEnabled()) {
                    C3288wk c3288wk = new C3288wk((byte) 3);
                    boolean isolateVerificationScripts = omsdkInfo.getIsolateVerificationScripts();
                    String customReferenceData = omsdkInfo.getCustomReferenceData();
                    HashMap<String, String> macros = omsdkInfo.getMacros();
                    ck.p.j(macros, IconCompat.EXTRA_OBJ);
                    JSONObject jSONObjectA = AbstractC3029ma.a(macros, macros.getClass());
                    byte impressionType = omsdkInfo.getImpressionType();
                    String creativeType3 = metaInfo3.getCreativeType();
                    int iHashCode = creativeType3.hashCode();
                    if (iHashCode != 93166550) {
                        if (iHashCode != 112202875) {
                            if (iHashCode == 1425678798 && creativeType3.equals("nonvideo")) {
                                str6 = "nonvideo";
                            } else {
                                str6 = "unknown";
                            }
                        } else if (creativeType3.equals("video")) {
                            str6 = "video";
                        } else {
                            str6 = "unknown";
                        }
                    } else if (!creativeType3.equals("audio")) {
                        str6 = "unknown";
                    }
                    HashMap map = new HashMap();
                    if (jSONObjectA != null) {
                        Iterator<String> itKeys = jSONObjectA.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            map.put(next, jSONObjectA.optString(next));
                        }
                    }
                    HashMap mapL = kotlin.collections.a.l(mj.h.a("creativeType", str6), mj.h.a("customReferenceData", customReferenceData), mj.h.a("impressionType", Byte.valueOf(impressionType)), mj.h.a("macros", map), mj.h.a("isolateVerificationScripts", Boolean.valueOf(isolateVerificationScripts)));
                    if (!(mapL instanceof HashMap)) {
                        mapL = null;
                    }
                    if (mapL == null) {
                        mapL = new HashMap();
                    }
                    c3288wk.f25667b = mapL;
                    linkedHashSet.add(c3288wk);
                }
            }
        }
        for (Viewability viewability2 : adB.getViewability()) {
            if (viewability2.getInmobi() != null) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                int iA = AbstractC3313xk.a(viewability2.getInmobi().getTime());
                if (iA != -1) {
                    linkedHashMap2.put("time", Integer.valueOf(iA));
                }
                int iA2 = AbstractC3313xk.a(viewability2.getInmobi().getView());
                if (iA2 != -1) {
                    linkedHashMap2.put(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, Integer.valueOf(iA2));
                }
                int iA3 = AbstractC3313xk.a(viewability2.getInmobi().getPixel());
                if (iA3 != -1) {
                    linkedHashMap2.put(com.ironsource.Ne.f27116a1, Integer.valueOf(iA3));
                }
                byte type = viewability2.getInmobi().getType();
                linkedHashMap2.put("type", Integer.valueOf(type));
                if (type == 2) {
                    if (viewability2.getInmobi().getFrame().length == 4) {
                        linkedHashMap2.put(TypedValues.AttributesType.S_FRAME, viewability2.getInmobi().getFrame());
                    } else {
                        linkedHashMap2.put(TypedValues.AttributesType.S_FRAME, new JSONArray("[0,0,0,0]"));
                    }
                }
                C3288wk c3288wk2 = new C3288wk((byte) 2);
                c3288wk2.f25667b = linkedHashMap2;
                linkedHashSet.add(c3288wk2);
                break;
            }
        }
        com.inmobi.media.ads.network.common.model.Ad adB2 = b(i10);
        String impressionId2 = adB2 != null ? adB2.getImpressionId() : null;
        MetaInfo metaInfo4 = adB.getMetaInfo();
        if (metaInfo4 == null || (landingPageParams2 = metaInfo4.getLandingPageParams()) == null || (landingPageParam = (LandingPageParam) nj.b0.i0(landingPageParams2, 0)) == null || (openMode = landingPageParam.getOpenMode()) == null) {
            openMode = "DEFAULT";
        }
        String str10 = openMode;
        C2924i4 c2924i4 = Y3.f23815a;
        ck.p.j(TelemetryConfig.class, "clazz");
        C3012li c3012li = new C3012li(((TelemetryConfig) Y3.f23815a.a(TelemetryConfig.class)).getMaxTemplateEvents());
        MetaInfo metaInfo5 = adB.getMetaInfo();
        if (metaInfo5 != null && (landingPageParams = metaInfo5.getLandingPageParams()) != null) {
            z10 = false;
            LandingPageParam landingPageParam2 = (LandingPageParam) nj.b0.i0(landingPageParams, 0);
            if (landingPageParam2 == null || (inlineParams = landingPageParam2.getAParams()) == null) {
            }
            inlineParams.setTargetBundleId(adB.getBidBundle());
            inlineParams.setCallerBundleId(A1.f22333a);
            inlineParams.setPingInWebView(this.f24711c.getInlineInstaller().getShouldPingInWebView());
            C3243v0 c3243v0 = this.f24720l;
            String strS = s();
            impressionId = adB.getImpressionId();
            if (impressionId == null) {
                str = "";
            } else {
                str = impressionId;
            }
            telemetryMetadataBlob = adB.getTelemetryMetadataBlob();
            if (telemetryMetadataBlob == null) {
                str2 = "";
            } else {
                str2 = telemetryMetadataBlob;
            }
            c2854fa = this.f24730v;
            if (c2854fa != null) {
                r39 = c2854fa.f24363b;
            } else {
                r39 = z10;
            }
            adO = o();
            if (adO != null || (metaInfo = adO.getMetaInfo()) == null || (creativeType = metaInfo.getCreativeType()) == null) {
                str3 = "";
            } else {
                str3 = creativeType;
            }
            adO2 = o();
            if (adO2 != null || (creativeId = adO2.getCreativeId()) == null) {
                str4 = "";
            } else {
                str4 = creativeId;
            }
            adSetR = r();
            if (adSetR != null) {
                zIsRewarded = adSetR.isRewarded();
            } else {
                zIsRewarded = z10;
            }
            return new C3069o0(str8, zA, j10, zC, creativeID, creativeType2, str5, str7, this, str9, linkedHashMap, Boolean.valueOf(z11), watermarkData, adQualityControl, bT, linkedHashSet, impressionId2, str10, new C2888gi(c3243v0, strS, str, str2, r39, str3, str4, zIsRewarded, i10, this.f24734z.f25226j, c3012li, "default", inlineParams), this.f24717i);
        }
        z10 = false;
        InlineParams inlineParams = new InlineParams(null, null, null, false, null, null, false, 127, null);
        inlineParams.setTargetBundleId(adB.getBidBundle());
        inlineParams.setCallerBundleId(A1.f22333a);
        inlineParams.setPingInWebView(this.f24711c.getInlineInstaller().getShouldPingInWebView());
        C3243v0 c3243v1 = this.f24720l;
        String strS2 = s();
        impressionId = adB.getImpressionId();
        if (impressionId == null) {
            str = "";
        } else {
            str = impressionId;
        }
        telemetryMetadataBlob = adB.getTelemetryMetadataBlob();
        if (telemetryMetadataBlob == null) {
            str2 = "";
        } else {
            str2 = telemetryMetadataBlob;
        }
        c2854fa = this.f24730v;
        if (c2854fa != null) {
            r39 = c2854fa.f24363b;
        } else {
            r39 = z10;
        }
        adO = o();
        if (adO != null) {
            str3 = "";
        } else {
            str3 = "";
        }
        adO2 = o();
        if (adO2 != null) {
            str4 = "";
        } else {
            str4 = "";
        }
        adSetR = r();
        if (adSetR != null) {
            zIsRewarded = adSetR.isRewarded();
        } else {
            zIsRewarded = z10;
        }
        return new C3069o0(str8, zA, j10, zC, creativeID, creativeType2, str5, str7, this, str9, linkedHashMap, Boolean.valueOf(z11), watermarkData, adQualityControl, bT, linkedHashSet, impressionId2, str10, new C2888gi(c3243v1, strS2, str, str2, r39, str3, str4, zIsRewarded, i10, this.f24734z.f25226j, c3012li, "default", inlineParams), this.f24717i);
    }

    @Override // com.inmobi.media.AbstractC2836ei
    public final void b(GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci) {
        MetaInfo metaInfo;
        ck.p.j(gestureDetectorOnGestureListenerC2785ci, "renderView");
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("l1", "TAG");
            c3053n9.a("l1", "fireClickTracker " + this);
        }
        ck.p.j(gestureDetectorOnGestureListenerC2785ci, "renderView");
        com.inmobi.media.ads.network.common.model.Ad adB = b(this.f24716h.indexOf(gestureDetectorOnGestureListenerC2785ci));
        if (ck.p.e((adB == null || (metaInfo = adB.getMetaInfo()) == null) ? null : metaInfo.getCreativeType(), "video") || adB == null) {
            return;
        }
        for (String str : AbstractC3336yi.a(adB, "click")) {
            C3271w3 c3271w3 = C3271w3.f25610a;
            C3053n9 c3053n10 = this.f24717i;
            ck.p.j(str, "url");
            C3271w3.a(str, true, c3053n10);
        }
    }

    public final void c(String str, Map map) {
        ck.p.j(str, "eventType");
        ck.p.j(map, "kv");
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("l1", "TAG");
            c3053n9.c("l1", "submitTelemetryEvent " + this);
        }
        Wj wj2 = Wj.f23753a;
        Wj.b(str, map, EnumC2735ak.SDK);
    }

    @Override // com.inmobi.media.AbstractC2836ei
    public final void c(GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci) {
        MetaInfo metaInfo;
        ck.p.j(gestureDetectorOnGestureListenerC2785ci, "renderView");
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("l1", "TAG");
            c3053n9.a("l1", "fireImpressionTracker " + this);
        }
        ck.p.j(gestureDetectorOnGestureListenerC2785ci, "renderView");
        com.inmobi.media.ads.network.common.model.Ad adB = b(this.f24716h.indexOf(gestureDetectorOnGestureListenerC2785ci));
        if (ck.p.e((adB == null || (metaInfo = adB.getMetaInfo()) == null) ? null : metaInfo.getCreativeType(), "video") || adB == null) {
            return;
        }
        for (String str : AbstractC3336yi.a(adB, "impression")) {
            C2890gk telemetryOnAdImpression = gestureDetectorOnGestureListenerC2785ci.getTelemetryOnAdImpression();
            telemetryOnAdImpression.getClass();
            ck.p.j("adResponseTracker", "<set-?>");
            telemetryOnAdImpression.f24456f = "adResponseTracker";
            C3271w3 c3271w3 = C3271w3.f25610a;
            C2715a0 c2715a0 = new C2715a0(this.f24729u, telemetryOnAdImpression);
            C3053n9 c3053n10 = this.f24717i;
            ck.p.j(str, "url");
            Dg.a(Ag.HIGHEST, new C3072o3(str, c3053n10, c2715a0, null));
        }
    }

    public final boolean a(com.inmobi.media.ads.network.common.model.Ad ad2) {
        Short sh2;
        Pair pair;
        O0 features;
        boolean enableImmersive = this.f24711c.getRendering().getEnableImmersive();
        boolean z10 = J5.f22901i;
        boolean zA = (ad2 == null || (features = ad2.getFeatures()) == null) ? false : features.a(false);
        boolean z11 = enableImmersive && z10 && zA;
        if (!z11) {
            StringBuilder sb2 = new StringBuilder("Immersive not supported on");
            BitSet bitSet = new BitSet(3);
            ArrayList arrayList = new ArrayList();
            if (!enableImmersive) {
                arrayList.add(" config");
                bitSet.set(0);
            }
            if (!z10) {
                arrayList.add(" device");
                bitSet.set(1);
            }
            if (!zA) {
                arrayList.add(" ad");
                bitSet.set(2);
            }
            sb2.append(nj.b0.p0(arrayList, StringUtils.COMMA, null, null, 0, null, null, 62, null));
            ck.p.j(bitSet, "bitSet");
            if (bitSet.get(0) && bitSet.get(1) && bitSet.get(2)) {
                sh2 = (short) 2202;
            } else if (bitSet.get(0) && bitSet.get(1)) {
                sh2 = (short) 2200;
            } else if (bitSet.get(0) && bitSet.get(2)) {
                sh2 = (short) 2199;
            } else if (bitSet.get(1) && bitSet.get(2)) {
                sh2 = (short) 2201;
            } else if (bitSet.get(0)) {
                sh2 = (short) 2196;
            } else if (bitSet.get(1)) {
                sh2 = (short) 2197;
            } else {
                sh2 = bitSet.get(2) ? (short) 2198 : null;
            }
            short sShortValue = sh2 != null ? sh2.shortValue() : (short) -1;
            if (sShortValue == -1) {
                pair = new Pair("Invalid Reason", (short) -1);
            } else {
                pair = new Pair(sb2.toString(), Short.valueOf(sShortValue));
            }
            String str = (String) pair.component1();
            short sShortValue2 = ((Number) pair.component2()).shortValue();
            HashMap map = new HashMap();
            map.put("reason", str);
            map.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(sShortValue2));
            c("ImmersiveNotSupported", map);
        }
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("l1", "TAG");
            c3053n9.a("l1", "Immersive support - config, device, adResponse - (" + enableImmersive + com.ironsource.Z7.f27998r + z10 + com.ironsource.Z7.f27998r + zA + ")");
        }
        return z11;
    }

    public final void a(AbstractC2871g1 abstractC2871g1) {
        ck.p.j(abstractC2871g1, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("l1", "TAG");
            c3053n9.c("l1", "onAdDisplayed " + this);
        }
        AdMetaInfo adMetaInfoJ = j();
        if (adMetaInfoJ == null) {
            C3053n9 c3053n10 = this.f24717i;
            if (c3053n10 != null) {
                ck.p.i("l1", "TAG");
                c3053n10.b("l1", "callback onAdDisplayed failed. ad meta info is null");
            }
            b(abstractC2871g1);
            return;
        }
        C3053n9 c3053n11 = this.f24717i;
        if (c3053n11 != null) {
            ck.p.i("l1", "TAG");
            c3053n11.a("l1", "callback - onAdDisplayed");
        }
        abstractC2871g1.a(adMetaInfoJ);
    }

    public final void a(AdResponse adResponse) {
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads;
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads2;
        ck.p.j(adResponse, "adResponse");
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("l1", "TAG");
            c3053n9.c("l1", "handleAdFetchSuccessful " + this);
        }
        if (!this.f24719k && n() != null) {
            if (this.f24710b == 1) {
                this.f24721m = adResponse;
                AdSet adSetR = r();
                int size = 0;
                this.f24727s = adSetR != null ? adSetR.isPod() : false;
                AdSet adSetR2 = r();
                if (adSetR2 != null && (ads2 = adSetR2.getAds()) != null) {
                    size = ads2.size();
                }
                this.f24716h = new ArrayList(size);
                AdSet adSetR3 = r();
                if (adSetR3 != null && (ads = adSetR3.getAds()) != null) {
                    for (com.inmobi.media.ads.network.common.model.Ad ad2 : ads) {
                        this.f24716h.add(null);
                    }
                }
                F();
                return;
            }
            C3053n9 c3053n10 = this.f24717i;
            if (c3053n10 != null) {
                ck.p.i("l1", "TAG");
                c3053n10.b("l1", "incorrect state - " + ((int) this.f24710b));
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2118);
            return;
        }
        c((short) 2185);
        C3053n9 c3053n11 = this.f24717i;
        if (c3053n11 != null) {
            ck.p.i("l1", "TAG");
            c3053n11.b("l1", "adUnit is destroyed");
        }
    }

    public final void a(InMobiAdRequestStatus inMobiAdRequestStatus, short s10) {
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("l1", "TAG");
            c3053n9.c("l1", "handleMarkupFetchFailure " + this);
        }
        try {
            if (this.f24710b == 1) {
                C3053n9 c3053n10 = this.f24717i;
                if (c3053n10 != null) {
                    ck.p.i("l1", "TAG");
                    c3053n10.b("l1", "Failed to fetch ad for placement id: " + this.f24720l + ", reason - " + inMobiAdRequestStatus.getMessage());
                }
                String str = "MarkupFetch failed reason is: " + inMobiAdRequestStatus.getMessage();
                C3053n9 c3053n11 = this.f24717i;
                if (c3053n11 != null) {
                    ck.p.i("l1", "TAG");
                    c3053n11.b("l1", str);
                }
                C3053n9 c3053n12 = this.f24717i;
                if (c3053n12 != null) {
                    ck.p.i("l1", "TAG");
                    c3053n12.d("l1", "AdUnit " + this + " state - FAILED");
                }
                c((byte) 3);
                b((byte) 1);
                if (s10 != 0) {
                    b(s10);
                }
                AbstractC2871g1 abstractC2871g1M = m();
                if (abstractC2871g1M != null) {
                    abstractC2871g1M.a(inMobiAdRequestStatus);
                    return;
                }
                C3053n9 c3053n13 = this.f24717i;
                if (c3053n13 != null) {
                    c3053n13.a();
                }
            }
        } catch (Exception e10) {
            C3053n9 c3053n14 = this.f24717i;
            if (c3053n14 != null) {
                ck.p.i("l1", "TAG");
                c3053n14.a("l1", "onAdFetchFailed with error: ", e10);
            }
            mj.g gVar = P9.f23321a;
            AbstractC2929i9.a(e10);
        }
    }

    public final void a(short s10) {
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("l1", "TAG");
            c3053n9.b("l1", "handleAdShowFailure " + this + " errorCode - " + ((int) s10));
        }
        C3053n9 c3053n10 = this.f24717i;
        if (c3053n10 != null) {
            ck.p.i("l1", "TAG");
            c3053n10.d("l1", "AdUnit " + this + " state - FAILED");
        }
        c((byte) 3);
        b((byte) 4);
        AbstractC2871g1 abstractC2871g1M = m();
        if (abstractC2871g1M != null) {
            abstractC2871g1M.b();
        }
        if (s10 != 0) {
            d(s10);
        }
    }

    public final void a(InMobiAdRequestStatus inMobiAdRequestStatus, boolean z10, short s10) {
        ck.p.j(inMobiAdRequestStatus, "requestStatus");
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("l1", "TAG");
            c3053n9.b("l1", "handleAdFetchFailure " + this + " errorCode - " + ((int) s10));
        }
        if (this.f24710b == 3 && z10) {
            C3053n9 c3053n10 = this.f24717i;
            if (c3053n10 != null) {
                ck.p.i("l1", "TAG");
                c3053n10.d("l1", "AdUnit " + this + " state - FAILED");
            }
            c((byte) 3);
            b((byte) 1);
        }
        AbstractC2871g1 abstractC2871g1M = m();
        if (abstractC2871g1M != null) {
            abstractC2871g1M.a(this, inMobiAdRequestStatus);
        }
        if (s10 != 0) {
            b(s10);
        }
    }

    public final void a(Map map) {
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("l1", "TAG");
            c3053n9.c("l1", "setPublisherSuppliedExtras " + this + " - " + map);
        }
        this.f24720l.f25507c = map;
    }

    public static final mj.r a(AbstractC2995l1 abstractC2995l1) {
        C3144r1 c3144r1 = abstractC2995l1.f24734z;
        c3144r1.getClass();
        c3144r1.f25221e = SystemClock.elapsedRealtime();
        abstractC2995l1.g();
        return mj.r.f64562a;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0031  */
    public static final mj.r a(AbstractC2995l1 abstractC2995l1, EnumC2721a6 enumC2721a6) {
        short s10;
        ck.p.j(enumC2721a6, "it");
        InMobiAdRequestStatus inMobiAdRequestStatus = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.NETWORK_UNREACHABLE);
        ck.p.j(enumC2721a6, IronSourceConstants.EVENTS_ERROR_CODE);
        int iOrdinal = enumC2721a6.ordinal();
        if (iOrdinal == 0) {
            s10 = 2100;
        } else if (iOrdinal != 21) {
            switch (iOrdinal) {
                case 12:
                    s10 = 2101;
                    break;
                case 13:
                    s10 = 2102;
                    break;
                case 14:
                    s10 = 2103;
                    break;
                case 15:
                    s10 = 2104;
                    break;
                case 16:
                    s10 = 2105;
                    break;
                default:
                    s10 = 2100;
                    break;
            }
        } else {
            s10 = 2228;
        }
        abstractC2995l1.a(inMobiAdRequestStatus, true, s10);
        return mj.r.f64562a;
    }

    public final void a(final bk.a aVar, final bk.l lVar) {
        ck.p.j(aVar, "onSuccess");
        ck.p.j(lVar, "onMaxRetryReached");
        C3053n9 c3053n9 = this.f24717i;
        Object ub2 = null;
        if (c3053n9 != null) {
            ck.p.i("l1", "TAG");
            C2854fa c2854fa = this.f24730v;
            c3053n9.c("l1", "loadWithRetry " + (c2854fa != null ? Integer.valueOf(c2854fa.f24363b) : null));
        }
        C2854fa c2854fa2 = this.f24730v;
        if (c2854fa2 != null) {
            EnumC2721a6 enumC2721a6A = Re.a();
            if (enumC2721a6A == null) {
                ub2 = Hf.f22819a;
            } else {
                int i10 = c2854fa2.f24363b + 1;
                c2854fa2.f24363b = i10;
                if (i10 >= c2854fa2.f24362a.f24889b) {
                    ub2 = new Ub(enumC2721a6A);
                } else {
                    ub2 = C3036mh.f24834a;
                }
            }
        }
        if (ub2 instanceof Ub) {
            lVar.invoke(((Ub) ub2).f23638a);
            return;
        }
        if (ub2 instanceof Hf) {
            C3053n9 c3053n10 = this.f24717i;
            if (c3053n10 != null) {
                ck.p.i("l1", "TAG");
                c3053n10.c("l1", "load with retry success");
            }
            aVar.invoke();
            return;
        }
        if (!(ub2 instanceof C3036mh)) {
            if (ub2 == null) {
                C3053n9 c3053n11 = this.f24717i;
                if (c3053n11 != null) {
                    ck.p.i("l1", "TAG");
                    c3053n11.c("l1", "shouldProceedToLoad result null. starting as if we have internet.");
                }
                aVar.invoke();
                return;
            }
            throw new NoWhenBranchMatchedException();
        }
        C3053n9 c3053n12 = this.f24717i;
        if (c3053n12 != null) {
            ck.p.i("l1", "TAG");
            c3053n12.c("l1", "load failed, retrying");
        }
        Handler handler = this.f24732x;
        Runnable runnable = new Runnable() { // from class: b7.e9
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC2995l1.a(this.f4909b, aVar, lVar);
            }
        };
        C3056nc c3056nc = this.f24731w;
        handler.postDelayed(runnable, c3056nc != null ? c3056nc.f24888a : 1000L);
    }

    public static final void a(AbstractC2995l1 abstractC2995l1, bk.a aVar, bk.l lVar) {
        C3053n9 c3053n9 = abstractC2995l1.f24717i;
        if (c3053n9 != null) {
            ck.p.i("l1", "TAG");
            C2854fa c2854fa = abstractC2995l1.f24730v;
            c3053n9.c("l1", "Loading from retry Handler " + (c2854fa != null ? Integer.valueOf(c2854fa.f24363b) : null));
        }
        abstractC2995l1.a(aVar, lVar);
    }

    public void a(byte[] bArr) {
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("l1", "TAG");
            c3053n9.c("l1", "load response " + this);
        }
        C3144r1 c3144r1 = this.f24734z;
        c3144r1.getClass();
        c3144r1.f25219c = SystemClock.elapsedRealtime();
        if (B()) {
            C3053n9 c3053n10 = this.f24717i;
            if (c3053n10 != null) {
                ck.p.i("l1", "TAG");
                c3053n10.a("l1", "isBlockingStateForLoadWithResponse - blocking");
                return;
            }
            return;
        }
        if (bArr != null && bArr.length != 0) {
            c((byte) 1);
            C3053n9 c3053n11 = this.f24717i;
            if (c3053n11 != null) {
                ck.p.i("l1", "TAG");
                c3053n11.d("l1", "AdUnit " + this + " state - LOADING");
            }
            this.f24715g.a(this.f24709a, new C2945j1(bArr, this, null));
            return;
        }
        b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INVALID_RESPONSE_IN_LOAD), true, (short) 2143);
        C3053n9 c3053n12 = this.f24717i;
        if (c3053n12 != null) {
            ck.p.i("l1", "TAG");
            c3053n12.a("l1", "null response. failing");
        }
    }

    public static final void a(AbstractC2995l1 abstractC2995l1, Y y10) {
        ck.p.i("l1", "TAG");
        Objects.toString(y10);
        V v10 = y10.f23812b;
        if (v10 instanceof Pi) {
            abstractC2995l1.getClass();
            Map mapO = kotlin.collections.a.o(mj.h.a("latency", Long.valueOf(SystemClock.elapsedRealtime() - abstractC2995l1.f24734z.f25220d)), mj.h.a("networkType", C3298x5.m()), mj.h.a("plId", Long.valueOf(abstractC2995l1.f24720l.f25505a)));
            String str = abstractC2995l1.f24720l.f25510f;
            if (str != null) {
                mapO.put("plType", str);
            }
            String str2 = abstractC2995l1.f24720l.f25509e;
            if (str2 != null) {
                mapO.put("adType", str2);
            }
            abstractC2995l1.b("ServerNoFill", mapO);
            abstractC2995l1.b(y10.f23811a, (short) 0);
            return;
        }
        if (v10 instanceof J6) {
            abstractC2995l1.b(y10.f23811a, ((J6) v10).f22902a);
            return;
        }
        if (v10 instanceof K6) {
            abstractC2995l1.b(kotlin.collections.a.o(mj.h.a(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(((K6) v10).f23004a))));
            abstractC2995l1.b(y10.f23811a, (short) 2205);
        } else {
            if (v10 instanceof Ni) {
                abstractC2995l1.b(((Ni) v10).f23251a);
                abstractC2995l1.b(y10.f23811a, (short) 0);
                return;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public static final void a(AbstractC2995l1 abstractC2995l1, GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci) {
        abstractC2995l1.a(gestureDetectorOnGestureListenerC2785ci, (short) 2137);
    }

    public void a(GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci, short s10) {
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("l1", "TAG");
            c3053n9.b("l1", "Render view signaled ad failed, for index " + this.f24716h.indexOf(gestureDetectorOnGestureListenerC2785ci) + com.ironsource.Z7.f27998r + this);
        }
        if (gestureDetectorOnGestureListenerC2785ci == null || !ck.p.e(gestureDetectorOnGestureListenerC2785ci.getMarkupType(), "htmlUrl")) {
            return;
        }
        l(gestureDetectorOnGestureListenerC2785ci);
    }

    @Override // com.inmobi.media.AbstractC2836ei
    public final void a(HashMap map) {
        ck.p.j(map, "params");
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("l1", "TAG");
            c3053n9.c("l1", "onAdInteraction " + this);
        }
        if (this.f24719k || n() == null) {
            return;
        }
        C3053n9 c3053n10 = this.f24717i;
        if (c3053n10 != null) {
            ck.p.i("l1", "TAG");
            c3053n10.a("l1", "Ad interaction. Params: " + map);
        }
        AbstractC2871g1 abstractC2871g1M = m();
        if (abstractC2871g1M != null) {
            abstractC2871g1M.a(map);
        }
    }

    @Override // com.inmobi.media.AbstractC2836ei
    public final void a(final C2890gk c2890gk) {
        C2915hk c2915hk;
        AtomicBoolean atomicBoolean;
        ck.p.j(c2890gk, "telemetryOnAdImpression");
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("l1", "TAG");
            c3053n9.c("l1", "onImpressionFiredFromTemplate " + this);
        }
        c2890gk.getClass();
        ck.p.j("imraid_impressionFired", "<set-?>");
        c2890gk.f24456f = "imraid_impressionFired";
        if (!this.f24719k && n() != null) {
            C3053n9 c3053n10 = this.f24717i;
            if (c3053n10 != null) {
                ck.p.i("l1", "TAG");
                c3053n10.a("l1", "onImpressionFiredFromTemplate");
            }
            Handler handler = this.f24718j;
            if (handler != null) {
                handler.post(new Runnable() { // from class: b7.z8
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC2995l1.a(this.f5278b, c2890gk);
                    }
                });
                return;
            }
            return;
        }
        C3144r1 c3144r1 = c2890gk.f24451a;
        if (c3144r1 == null || (c2915hk = c3144r1.f25218b) == null || (atomicBoolean = c2915hk.f24515a) == null || !atomicBoolean.getAndSet(true)) {
            LinkedHashMap linkedHashMapA = c2890gk.a();
            linkedHashMapA.put("networkType", C3298x5.m());
            linkedHashMapA.put(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2180);
            String str = c2890gk.f24454d;
            if (str == null) {
                str = "";
            }
            linkedHashMapA.put("impressionId", str);
            Wj wj2 = Wj.f23753a;
            Wj.b("AdImpressionSuccessful", linkedHashMapA, EnumC2735ak.SDK);
        }
    }

    public static final void a(AbstractC2995l1 abstractC2995l1, C2890gk c2890gk) {
        abstractC2995l1.f24729u.a(c2890gk);
    }

    @Override // com.inmobi.media.AbstractC2836ei, com.inmobi.media.InterfaceC2736al
    public final void a() {
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("l1", "TAG");
            c3053n9.c("l1", "onUserLeaveApplication " + this);
        }
        if (this.f24719k || n() == null) {
            return;
        }
        C3053n9 c3053n10 = this.f24717i;
        if (c3053n10 != null) {
            ck.p.i("l1", "TAG");
            c3053n10.a("l1", "User left application");
        }
        AbstractC2871g1 abstractC2871g1M = m();
        if (abstractC2871g1M != null) {
            abstractC2871g1M.e();
        }
    }

    public final void a(com.inmobi.media.ads.network.common.model.Ad ad2, Map map) {
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("l1", "TAG");
            c3053n9.c("l1", "updateIdsInTelemetryPayload " + this);
        }
        if (ad2 != null) {
            map.put("creativeId", ad2.getCreativeId());
        }
    }

    @Override // com.inmobi.media.AbstractC2836ei
    public final void a(String str, HashMap map) {
        ck.p.j(str, "eventType");
        ck.p.j(map, "kv");
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("l1", "TAG");
            c3053n9.c("l1", "onRenderViewRequestedAction " + this);
        }
        c(str, map);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void a(String str, Map map) {
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("l1", "TAG");
            c3053n9.c("l1", "addRetryCountToTelemetryEvent event - " + str);
        }
        switch (str.hashCode()) {
            case -1959333523:
                if (!str.equals("RenderSuccess")) {
                    return;
                }
                break;
            case 167123846:
                if (!str.equals("ServerFill")) {
                    return;
                }
                break;
            case 885222501:
                if (!str.equals("ServerError")) {
                    return;
                }
                break;
            case 925075267:
                if (!str.equals("AdLoadSuccessful")) {
                    return;
                }
                break;
            case 1881615718:
                if (!str.equals("AdLoadFailed")) {
                    return;
                }
                break;
            case 1925668903:
                if (!str.equals("ServerNoFill")) {
                    return;
                }
                break;
            default:
                return;
        }
        C2854fa c2854fa = this.f24730v;
        if (c2854fa != null) {
            map.put("retryCount", Integer.valueOf(c2854fa.f24363b));
        }
    }

    public final void a(GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci, LinkedHashSet linkedHashSet) {
        AdConfig.ViewabilityConfig viewability;
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("l1", "TAG");
            c3053n9.a("l1", "omidSessionForHtmlMarkup " + this);
        }
        AdConfig adConfig = this.f24711c;
        AdConfig.OmidConfig omidConfig = (adConfig == null || (viewability = adConfig.getViewability()) == null) ? null : viewability.getOmidConfig();
        if (omidConfig == null || omidConfig.isOmidEnabled()) {
            Bf.f22423a.getClass();
            if (Omid.isActive()) {
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    C3288wk c3288wk = (C3288wk) it.next();
                    if (3 == c3288wk.f25666a) {
                        try {
                            ck.p.j("creativeType", C3426d4.i.W);
                            ck.p.j(String.class, "classType");
                            Object obj = c3288wk.f25667b.get("creativeType");
                            String str = (String) (String.class.isInstance(obj) ? String.class.cast(obj) : null);
                            ck.p.j("customReferenceData", C3426d4.i.W);
                            ck.p.j(String.class, "classType");
                            Object obj2 = c3288wk.f25667b.get("customReferenceData");
                            String str2 = (String) (String.class.isInstance(obj2) ? String.class.cast(obj2) : null);
                            ck.p.j("isolateVerificationScripts", C3426d4.i.W);
                            ck.p.j(Boolean.class, "classType");
                            Object obj3 = c3288wk.f25667b.get("isolateVerificationScripts");
                            Boolean bool = (Boolean) (Boolean.class.isInstance(obj3) ? Boolean.class.cast(obj3) : null);
                            ck.p.j("impressionType", C3426d4.i.W);
                            ck.p.j(Byte.class, "classType");
                            Object obj4 = c3288wk.f25667b.get("impressionType");
                            Byte b10 = (Byte) (Byte.class.isInstance(obj4) ? Byte.class.cast(obj4) : null);
                            C2959jf c2959jfA = (str == null || bool == null || b10 == null) ? null : AbstractC3233uf.a(str, gestureDetectorOnGestureListenerC2785ci, bool.booleanValue(), this.f24720l.f25515k, b10.byteValue(), str2);
                            if (c2959jfA != null) {
                                c3288wk.f25667b.put("omidAdSession", c2959jfA);
                                c3288wk.f25667b.put("deferred", Boolean.TRUE);
                                C3053n9 c3053n10 = this.f24717i;
                                if (c3053n10 != null) {
                                    ck.p.i("l1", "TAG");
                                    c3053n10.a("l1", "OMID ad session created and WebView container registered with OMID");
                                }
                            } else {
                                C3053n9 c3053n11 = this.f24717i;
                                if (c3053n11 != null) {
                                    ck.p.i("l1", "TAG");
                                    c3053n11.a("l1", "Ignoring IAB meta data for this ad markup");
                                }
                            }
                        } catch (Exception e10) {
                            C3053n9 c3053n12 = this.f24717i;
                            if (c3053n12 != null) {
                                ck.p.i("l1", "TAG");
                                c3053n12.b("l1", "Setting up impression tracking for IAB encountered an unexpected error: " + e10.getMessage());
                            }
                            mj.g gVar = P9.f23321a;
                            AbstractC2929i9.a(e10);
                        }
                    }
                }
            }
        }
    }

    public final void a(com.inmobi.media.ads.network.common.model.Ad ad2, String str) {
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("l1", "TAG");
            c3053n9.c("l1", "updateAdForBlob " + this);
        }
        ad2.setWebVast(str);
        b(ad2);
    }

    public final void a(String str, String str2) {
        ck.p.j(str, "blob");
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("l1", "TAG");
            c3053n9.c("l1", "saveBlob " + this);
        }
        this.f24715g.a(this.f24709a, new C2970k1(this, str2, str, null));
    }

    public final void a(String str, String str2, F2 f10, String str3) {
        ck.p.j(str, "jsCallbackNamespace");
        ck.p.j(str2, "callback");
        ck.p.j(f10, "receiver");
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("l1", "TAG");
            c3053n9.c("l1", "getBlob " + this);
        }
        this.f24715g.a(this.f24709a, new C2921i1(this, str3, f10, str, str2, null));
    }

    public void a(int i10, GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci, Context context) {
        ck.p.j(gestureDetectorOnGestureListenerC2785ci, "renderView");
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("l1", "TAG");
            c3053n9.c("l1", "Show pod ad with index : " + i10 + " from creative: " + this.f24716h.indexOf(gestureDetectorOnGestureListenerC2785ci) + com.ironsource.Z7.f27998r + this);
        }
        if (i10 >= 0) {
            this.f24724p = i10;
        } else {
            this.f24724p++;
        }
    }

    public void a(GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci, Activity activity) {
        ck.p.j(gestureDetectorOnGestureListenerC2785ci, "renderView");
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("l1", "TAG");
            c3053n9.c("l1", "closeCurrentPodAd " + this);
        }
    }

    public boolean a(GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci) {
        ck.p.j(gestureDetectorOnGestureListenerC2785ci, "renderView");
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 == null) {
            return false;
        }
        ck.p.i("l1", "TAG");
        c3053n9.c("l1", "hasNextAdInAdPod " + this);
        return false;
    }

    public void a(byte b10) {
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("l1", "TAG");
            c3053n9.a("l1", "onTimeOut " + this);
        }
        if (b10 == 0) {
            C3053n9 c3053n10 = this.f24717i;
            if (c3053n10 != null) {
                ck.p.i("l1", "TAG");
                c3053n10.a("l1", "AdRequestTimeOut by timer, Adstate=" + ((int) this.f24710b));
            }
            if (this.f24710b != 3) {
                b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_TIMED_OUT), (short) 2109);
                return;
            }
            return;
        }
        if (b10 != 2 && b10 != 1) {
            if (b10 == 4) {
                C3053n9 c3053n11 = this.f24717i;
                if (c3053n11 != null) {
                    ck.p.i("l1", "TAG");
                    c3053n11.a("l1", "Show RequestTimeOut by show timer");
                }
                AbstractC2871g1 abstractC2871g1M = m();
                if (abstractC2871g1M != null) {
                    abstractC2871g1M.d();
                    return;
                }
                return;
            }
            C3053n9 c3053n12 = this.f24717i;
            if (c3053n12 != null) {
                ck.p.i("l1", "TAG");
                c3053n12.a("l1", "Unknown TimeOut ignored");
                return;
            }
            return;
        }
        C3053n9 c3053n13 = this.f24717i;
        if (c3053n13 != null) {
            ck.p.i("l1", "TAG");
            c3053n13.a("l1", "Internal LoadTimeOut by timer, Adstate=" + ((int) this.f24710b));
        }
        if (this.f24710b != 3) {
            this.f24732x.removeCallbacksAndMessages(null);
            C3053n9 c3053n14 = this.f24717i;
            if (c3053n14 != null) {
                ck.p.i("l1", "TAG");
                c3053n14.a("l1", "adUnitEventListener=" + m() + ", Adstate=" + ((int) this.f24710b));
            }
            byte b11 = this.f24710b;
            if (2 == b11) {
                J();
                c(Re.a() == null ? (short) 2139 : (short) 2203);
                AbstractC2871g1 abstractC2871g1M2 = m();
                if (abstractC2871g1M2 != null) {
                    abstractC2871g1M2.a(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                    return;
                }
                return;
            }
            if (1 == b11) {
                J();
                c((short) 2138);
                AbstractC2871g1 abstractC2871g1M3 = m();
                if (abstractC2871g1M3 != null) {
                    abstractC2871g1M3.a(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_TIMED_OUT));
                }
            }
        }
    }

    public final void a(int i10, boolean z10) throws JSONException {
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("l1", "TAG");
            c3053n9.a("l1", "Destroying container for index " + i10 + com.ironsource.Z7.f27998r + this);
        }
        ArrayList arrayList = this.f24716h;
        ck.p.j(arrayList, "list");
        if (i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci = (GestureDetectorOnGestureListenerC2785ci) this.f24716h.get(i10);
        if (gestureDetectorOnGestureListenerC2785ci != null) {
            gestureDetectorOnGestureListenerC2785ci.I0.set(z10);
            gestureDetectorOnGestureListenerC2785ci.stopLoading();
            gestureDetectorOnGestureListenerC2785ci.b();
        }
        this.f24716h.set(i10, null);
    }

    public final void a(GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci, Integer num, int i10) {
        int iIntValue;
        if (gestureDetectorOnGestureListenerC2785ci != null) {
            iIntValue = this.f24716h.indexOf(gestureDetectorOnGestureListenerC2785ci);
        } else if (num == null) {
            return;
        } else {
            iIntValue = num.intValue();
        }
        com.inmobi.media.ads.network.common.model.Ad adB = b(iIntValue);
        if (adB != null) {
            Iterator it = AbstractC3336yi.a(adB, "pod_abort").iterator();
            while (it.hasNext()) {
                String strN = lk.x.N(lk.x.N((String) it.next(), "$PODINDEX", String.valueOf(iIntValue), false, 4, null), "$REASON", String.valueOf(i10), false, 4, null);
                C3271w3 c3271w3 = C3271w3.f25610a;
                C3053n9 c3053n9 = this.f24717i;
                ck.p.j(strN, "url");
                C3271w3.a(strN, true, c3053n9);
            }
        }
    }

    @Override // com.inmobi.media.AbstractC2836ei
    public final void a(GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci, String str, Map map) {
        ck.p.j(gestureDetectorOnGestureListenerC2785ci, "renderView");
        ck.p.j(str, "trackerName");
        ck.p.j(map, "macros");
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("l1", "TAG");
            c3053n9.a("l1", "fireLandingPageTracker " + str + com.ironsource.Z7.f27998r + this);
        }
        com.inmobi.media.ads.network.common.model.Ad adB = b(this.f24716h.indexOf(gestureDetectorOnGestureListenerC2785ci));
        if (adB != null) {
            for (String str2 : AbstractC3336yi.a(adB, str)) {
                String strN = str2;
                for (Map.Entry entry : map.entrySet()) {
                    strN = lk.x.N(strN, (String) entry.getKey(), (String) entry.getValue(), false, 4, null);
                }
                C3271w3 c3271w3 = C3271w3.f25610a;
                C3053n9 c3053n10 = this.f24717i;
                ck.p.j(strN, "url");
                C3271w3.a(strN, true, c3053n10);
            }
            return;
        }
        C3053n9 c3053n11 = this.f24717i;
        if (c3053n11 != null) {
            ck.p.i("l1", "TAG");
            c3053n11.a("l1", "fireLandingPageTracker failed");
        }
    }

    @Override // com.inmobi.media.AbstractC2836ei
    public final void a(String str) {
        ck.p.j(str, CreativeInfo.f44317an);
        AbstractC2871g1 abstractC2871g1M = m();
        if (abstractC2871g1M != null) {
            abstractC2871g1M.a(str);
        }
    }

    @Override // com.inmobi.media.ro
    public final String a(int i10, double d10) {
        return ((ro) this.D.getValue()).a(i10, d10);
    }

    @Override // com.inmobi.media.ro
    public final String a(double d10) {
        return ((ro) this.D.getValue()).a(d10);
    }
}
