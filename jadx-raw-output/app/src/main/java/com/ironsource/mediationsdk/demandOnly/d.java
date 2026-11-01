package com.ironsource.mediationsdk.demandOnly;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.C3405c1;
import com.ironsource.C3424d2;
import com.ironsource.C3570l5;
import com.ironsource.C3605n2;
import com.ironsource.C3661q5;
import com.ironsource.C3676r4;
import com.ironsource.C5;
import com.ironsource.InterfaceC3388b2;
import com.ironsource.J9;
import com.ironsource.Lb;
import com.ironsource.P8;
import com.ironsource.Z7;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimerTask;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class d extends m implements BannerSmashListener, InterfaceC3388b2 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private C3570l5 f29675n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private C3570l5 f29676o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f29677p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f29678q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private C3424d2 f29679r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private com.ironsource.mediationsdk.e f29680s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ISDemandOnlyBannerLayout f29681t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final P8 f29682u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final P8.a f29683v;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.ironsource.mediationsdk.i f29684a;

        public a(com.ironsource.mediationsdk.i iVar) {
            this.f29684a = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.a(83500, (Object[][]) null);
            IronLog.INTERNAL.verbose("auction waterfallString = " + this.f29684a.r());
            d.this.a(83510, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, this.f29684a.r()}});
            Context applicationContext = ContextProvider.getInstance().getApplicationContext();
            d dVar = d.this;
            dVar.f29680s.a(applicationContext, this.f29684a, dVar);
        }
    }

    public class b extends TimerTask {
        public b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            IronLog.INTERNAL.verbose("load timed out state=" + d.this.k());
            d.this.a(new IronSourceError(608, "load timed out"));
        }
    }

    private void c(String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        if (a(m.a.LOAD_IN_PROGRESS)) {
            if (str == null) {
                ironLog.verbose("serverData is null");
                a(new IronSourceError(618, "No available ad to load"));
            } else {
                a(83302, (Object[][]) null);
                this.f29676o = new C3570l5();
                this.f29748a.initBannerForBidding(this.f29677p, this.f29678q, this.f29750c, this);
                this.f29748a.loadBannerForDemandOnlyForBidding(this.f29750c, str, this.f29681t, this);
            }
        }
    }

    private void v() {
        this.f29754g = null;
        this.f29755h = null;
        this.f29679r = new C3424d2();
    }

    public void a(ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, o oVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("state=" + k());
        if (iSDemandOnlyBannerLayout == null) {
            a(com.ironsource.mediationsdk.demandOnly.b.c.f29666e, new Object[][]{new Object[]{"reason", "bannerLayout is null | state: " + k()}});
            return;
        }
        m.a[] aVarArr = {m.a.NOT_LOADED, m.a.LOADED};
        m.a aVar = m.a.LOAD_IN_PROGRESS;
        m.a aVarA = a(aVarArr, aVar);
        if (aVarA == aVar || aVarA == m.a.SHOW_IN_PROGRESS) {
            if (iSDemandOnlyBannerLayout.isDestroyed()) {
                a(com.ironsource.mediationsdk.demandOnly.b.c.f29666e, new Object[][]{new Object[]{"reason", "bannerLayout is destroyed | state: " + k()}});
                return;
            }
            String str = "banner layout in blocking state | state: " + k();
            iSDemandOnlyBannerLayout.getListener().a(l(), new IronSourceError(619, str));
            a(com.ironsource.mediationsdk.demandOnly.b.c.f29666e, new Object[][]{new Object[]{"reason", str}});
            return;
        }
        v();
        a(3002, (Object[][]) null);
        if (iSDemandOnlyBannerLayout.isDestroyed()) {
            a(new IronSourceError(610, "bannerLayout is destroyed"));
            return;
        }
        this.f29681t = iSDemandOnlyBannerLayout;
        if (!n()) {
            IronSourceError ironSourceErrorBuildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadBannerForBidder in IAB flow must be called by bidder instances");
            a(3300, (Object[][]) null);
            a(ironSourceErrorBuildLoadFailedError);
            return;
        }
        try {
            com.ironsource.mediationsdk.d.a aVar2 = (com.ironsource.mediationsdk.d.a) oVar.a(new C3661q5());
            C3605n2 c3605n2A = new com.ironsource.mediationsdk.demandOnly.a.C0279a(aVar2.h()).a(h());
            if (c3605n2A == null) {
                IronSourceError ironSourceErrorBuildLoadFailedError2 = ErrorBuilder.buildLoadFailedError("loadBannerForBidder invalid enriched ADM");
                a(3300, (Object[][]) null);
                a(ironSourceErrorBuildLoadFailedError2);
                return;
            }
            String strK = c3605n2A.k();
            if (strK == null) {
                ironLog.error("serverData is null");
                a(new IronSourceError(618, "No available ad to load"));
                return;
            }
            b(strK);
            a(aVar2.a());
            a(aVar2.f());
            a(83302, (Object[][]) null);
            this.f29679r.a(c3605n2A.b());
            this.f29675n = new C3570l5();
            w();
            this.f29748a.initBannerForBidding(this.f29677p, this.f29678q, this.f29750c, this);
            this.f29748a.loadBannerForDemandOnlyForBidding(this.f29750c, strK, iSDemandOnlyBannerLayout, this);
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            a(ErrorBuilder.buildLoadFailedError("loadBannerForBidder: Exception= " + e10.getMessage()));
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdScreenDismissed() {
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdScreenPresented() {
    }

    public d(String str, String str2, NetworkSettings networkSettings, long j10, AbstractAdapter abstractAdapter, com.ironsource.mediationsdk.e eVar) {
        super(new C3405c1(networkSettings, networkSettings.getBannerSettings(), IronSource.a.BANNER), abstractAdapter);
        this.f29682u = Lb.U().s();
        this.f29683v = Lb.O().h();
        this.f29753f = j10;
        this.f29677p = str;
        this.f29678q = str2;
        this.f29679r = new C3424d2();
        this.f29748a.initBannerForBidding(str, str2, this.f29750c, this);
        this.f29680s = eVar;
    }

    private boolean t() {
        ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout = this.f29681t;
        return iSDemandOnlyBannerLayout == null || iSDemandOnlyBannerLayout.isDestroyed();
    }

    private void u() {
        IronLog.INTERNAL.verbose();
        IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new a(q()));
    }

    private void w() {
        IronLog.INTERNAL.verbose();
        a(new b());
    }

    @Override // com.ironsource.mediationsdk.demandOnly.m
    public Map<String, Object> j() {
        HashMap map = new HashMap();
        try {
            if (t()) {
                map.put("reason", "banner is destroyed");
            } else {
                com.ironsource.mediationsdk.l.a(map, this.f29681t.getSize());
            }
            AbstractAdapter abstractAdapter = this.f29748a;
            map.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, abstractAdapter != null ? abstractAdapter.getVersion() : "");
            AbstractAdapter abstractAdapter2 = this.f29748a;
            map.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, abstractAdapter2 != null ? abstractAdapter2.getCoreSDKVersion() : "");
            map.put("spId", this.f29749b.i());
            map.put(IronSourceConstants.EVENTS_PROVIDER, this.f29749b.a());
            map.put(IronSourceConstants.EVENTS_DEMAND_ONLY, 1);
            if (o()) {
                map.put("isOneFlow", 1);
            }
            map.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
            map.put("instanceType", Integer.valueOf(this.f29749b.d()));
            if (!TextUtils.isEmpty(this.f29754g)) {
                map.put("auctionId", this.f29754g);
            }
            JSONObject jSONObject = this.f29755h;
            if (jSONObject != null && jSONObject.length() > 0) {
                map.put("genericParams", this.f29755h);
            }
            if (!TextUtils.isEmpty(this.f29757j)) {
                map.put("dynamicDemandSource", this.f29757j);
            }
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error("Instance: " + h() + Z7.f27998r + e10.getMessage());
        }
        return map;
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdClicked() {
        IronLog.INTERNAL.verbose("smash - " + s());
        a(3008, (Object[][]) null);
        if (t()) {
            return;
        }
        this.f29681t.getListener().a(l());
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLeftApplication() {
        IronLog.INTERNAL.verbose("smash - " + s());
        a(com.ironsource.mediationsdk.demandOnly.b.C0280b.f29659g, (Object[][]) null);
        if (t()) {
            return;
        }
        this.f29681t.getListener().b(l());
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLoadFailed(IronSourceError ironSourceError) {
        IronLog.INTERNAL.verbose("smash - " + s());
        a(83300, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(C3570l5.a(this.f29676o))}});
        a(ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLoaded(View view, FrameLayout.LayoutParams layoutParams) {
        IronLog.INTERNAL.verbose("smash = " + s());
        P8 p10 = this.f29682u;
        IronSource.a aVar = IronSource.a.BANNER;
        int iA = p10.a(aVar);
        a(com.ironsource.mediationsdk.demandOnly.b.c.f29665d, new Object[][]{new Object[]{"sessionDepth", Integer.valueOf(iA)}, new Object[]{"duration", Long.valueOf(C3570l5.a(this.f29676o))}});
        if (a(m.a.LOAD_IN_PROGRESS, m.a.LOADED)) {
            p();
            if (!t()) {
                this.f29681t.a(view, layoutParams);
            }
            a(3005, new Object[][]{new Object[]{"sessionDepth", Integer.valueOf(iA)}, new Object[]{"duration", Long.valueOf(C3570l5.a(this.f29675n))}});
            this.f29683v.b(aVar);
            a(this.f29679r.c(), IronSourceUtils.a());
            if (t()) {
                return;
            }
            this.f29681t.getListener().c(l());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdShown() {
        if (a(m.a.LOADED, m.a.SHOW_IN_PROGRESS)) {
            IronLog.INTERNAL.verbose("smash - " + s());
            a(3009, (Object[][]) null);
            a(this.f29679r.a(), IronSourceUtils.a());
            if (t()) {
                return;
            }
            this.f29681t.getListener().d(l());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerInitFailed(IronSourceError ironSourceError) {
        IronLog.INTERNAL.verbose("smash - " + s() + Z7.f27998r + ironSourceError.toString());
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerInitSuccess() {
        IronLog.INTERNAL.verbose("smash - " + s());
    }

    public com.ironsource.mediationsdk.i q() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(h());
        String str = "" + i() + h();
        com.ironsource.mediationsdk.i iVar = new com.ironsource.mediationsdk.i(IronSource.a.BANNER);
        iVar.a(arrayList);
        iVar.d(str);
        iVar.c(l());
        iVar.b(IronSourceUtils.g());
        iVar.a(true);
        iVar.c(true);
        iVar.a(this.f29681t.getSize());
        return iVar;
    }

    public void r() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        a(new m.a[]{m.a.LOADED, m.a.LOAD_IN_PROGRESS, m.a.SHOW_IN_PROGRESS}, m.a.NOT_LOADED);
        if (t()) {
            ironLog.error("Banner is null or already destroyed and can't be used anymore");
            return;
        }
        p();
        ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout = this.f29681t;
        if (iSDemandOnlyBannerLayout != null) {
            iSDemandOnlyBannerLayout.a();
        }
        this.f29681t = null;
        AbstractAdapter abstractAdapter = this.f29748a;
        if (abstractAdapter == null) {
            ironLog.error("can't destroy adapter. mAdapter == null");
        } else {
            abstractAdapter.destroyBanner(this.f29750c);
        }
        a(3305, (Object[][]) null);
        ironLog.verbose("banner layout was destroyed. bannerId: " + l());
    }

    public String s() {
        return this.f29749b.h().isMultipleInstances() ? this.f29749b.h().getProviderTypeForReflection() : this.f29749b.h().getProviderName();
    }

    public void a(ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("state=" + k());
        if (iSDemandOnlyBannerLayout == null) {
            a(com.ironsource.mediationsdk.demandOnly.b.c.f29666e, new Object[][]{new Object[]{"reason", "bannerLayout is null | state: " + k()}});
            return;
        }
        m.a[] aVarArr = {m.a.NOT_LOADED, m.a.LOADED};
        m.a aVar = m.a.LOAD_IN_PROGRESS;
        m.a aVarA = a(aVarArr, aVar);
        if (aVarA != aVar && aVarA != m.a.SHOW_IN_PROGRESS) {
            v();
            a(3002, (Object[][]) null);
            if (!o()) {
                ironLog.verbose("can't load banner when isOneFlow = false");
                a(new IronSourceError(1063, "Missing configuration settings"));
                return;
            }
            this.f29681t = iSDemandOnlyBannerLayout;
            this.f29675n = new C3570l5();
            w();
            if (this.f29680s.a()) {
                u();
                return;
            } else {
                ironLog.verbose("can't load the banner the auction isn't enabled");
                a(new IronSourceError(1063, "Missing server configuration"));
                return;
            }
        }
        if (iSDemandOnlyBannerLayout.isDestroyed()) {
            a(com.ironsource.mediationsdk.demandOnly.b.c.f29666e, new Object[][]{new Object[]{"reason", "bannerLayout is destroyed | state: " + k()}});
            return;
        }
        String str = "banner layout in blocking state | state: " + k();
        iSDemandOnlyBannerLayout.getListener().a(l(), new IronSourceError(619, str));
        a(com.ironsource.mediationsdk.demandOnly.b.c.f29666e, new Object[][]{new Object[]{"reason", str}});
    }

    @Override // com.ironsource.S1
    public void a(int i10, String str, int i11, String str2, long j10) {
        IronLog.INTERNAL.verbose("Auction failed. error " + i10 + " - " + str);
        this.f29754g = null;
        this.f29755h = null;
        a(com.ironsource.mediationsdk.demandOnly.b.c.f29668g, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10)}, new Object[]{"reason", str}, new Object[]{"duration", Long.valueOf(j10)}, new Object[]{IronSourceConstants.EVENTS_EXT1, k()}});
        if (a(m.a.LOAD_IN_PROGRESS)) {
            a(new IronSourceError(621, "No available ad to load"));
        }
    }

    @Override // com.ironsource.S1
    public void a(List<C3605n2> list, String str, C3605n2 c3605n2, JSONObject jSONObject, JSONObject jSONObject2, int i10, long j10, int i11, String str2) {
        IronLog.INTERNAL.error("onAuctionSuccess - Deprecated: Please use onAuctionSuccess(AuctionDataUtils.AuctionData auctionData, int auctionTrial, long elapsedTime, int troubleshootingErrorCode, String troubleshootingErrorMessage)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(IronSourceError ironSourceError) {
        IronLog.INTERNAL.verbose("error = " + ironSourceError.getErrorMessage() + " smash - " + s());
        if (a(m.a.LOAD_IN_PROGRESS, m.a.NOT_LOADED)) {
            p();
            a(ironSourceError, C3570l5.a(this.f29675n));
            a(this.f29679r.b(), IronSourceUtils.a());
            if (t()) {
                return;
            }
            this.f29681t.getListener().a(l(), ironSourceError);
        }
    }

    private void a(IronSourceError ironSourceError, long j10) {
        if (ironSourceError.getErrorCode() == 606) {
            a(com.ironsource.mediationsdk.demandOnly.b.C0280b.f29661i, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"duration", Long.valueOf(j10)}});
        } else {
            a(3300, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(j10)}});
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, Object[][] objArr) {
        Map<String, Object> mapJ = j();
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    if (objArr2[1] != null) {
                        mapJ.put(objArr2[0].toString(), objArr2[1]);
                    }
                }
            } catch (Exception e10) {
                C3676r4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
        }
        J9.i().a(new C5(i10, new JSONObject(mapJ)));
    }

    private void a(List<String> list, String str) {
        a(list, h(), i(), this.f29757j, str);
    }

    @Override // com.ironsource.InterfaceC3388b2
    public void a(com.ironsource.mediationsdk.d.a aVar, int i10, long j10, int i11, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        this.f29754g = aVar.a();
        this.f29755h = aVar.f();
        com.ironsource.mediationsdk.demandOnly.a.C0279a c0279a = new com.ironsource.mediationsdk.demandOnly.a.C0279a(aVar.h());
        if (!TextUtils.isEmpty(str)) {
            a(88002, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i11)}, new Object[]{"reason", str}});
        }
        a(com.ironsource.mediationsdk.demandOnly.b.c.f29669h, new Object[][]{new Object[]{"duration", Long.valueOf(j10)}});
        a(com.ironsource.mediationsdk.demandOnly.b.c.f29671j, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, c0279a.b()}});
        if (a(m.a.LOAD_IN_PROGRESS)) {
            if (c0279a.isEmpty()) {
                IronSourceError ironSourceError = new IronSourceError(com.ironsource.mediationsdk.demandOnly.b.C0280b.f29661i, "There is no available ad to load");
                ironLog.error("loadBanner - empty waterfall");
                a(ironSourceError);
                return;
            }
            C3605n2 c3605n2 = c0279a.get(0);
            this.f29679r.a(c3605n2.b());
            this.f29679r.c(c3605n2.h());
            this.f29679r.b(c3605n2.g());
            String strK = c3605n2.k();
            b(strK);
            c(strK);
        }
    }
}
