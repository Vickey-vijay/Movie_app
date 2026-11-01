package com.ironsource.mediationsdk;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.C3405c1;
import com.ironsource.C3497h3;
import com.ironsource.C3570l5;
import com.ironsource.C3575la;
import com.ironsource.C3676r4;
import com.ironsource.C3704sf;
import com.ironsource.C5;
import com.ironsource.D5;
import com.ironsource.InterfaceC3685rd;
import com.ironsource.InterfaceC3811z3;
import com.ironsource.J9;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class z extends A implements BannerSmashListener, C3704sf.a, InterfaceC3811z3 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private k f30164h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private C3704sf f30165i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private a f30166j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private InterfaceC3685rd f30167k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private q f30168l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f30169m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private JSONObject f30170n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f30171o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f30172p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private C3497h3 f30173q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Object f30174r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private C3570l5 f30175s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f30176t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f30177u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private JSONObject f30178v;

    public enum a {
        NONE,
        INIT_IN_PROGRESS,
        READY_TO_LOAD,
        LOADING,
        LOADED,
        LOAD_FAILED,
        DESTROYED
    }

    public z(k kVar, InterfaceC3685rd interfaceC3685rd, NetworkSettings networkSettings, AbstractAdapter abstractAdapter, int i10, boolean z10) {
        this(kVar, interfaceC3685rd, networkSettings, abstractAdapter, i10, "", null, 0, "", z10);
    }

    public void a(q qVar, C3497h3 c3497h3, String str, JSONObject jSONObject) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(f());
        this.f30173q = c3497h3;
        this.f30178v = jSONObject;
        if (!l.c(qVar)) {
            String str2 = qVar == null ? "banner is null" : "banner is destroyed";
            ironLog.verbose(str2);
            this.f30167k.a(new IronSourceError(610, str2), this, false);
            return;
        }
        if (this.f29512a == null) {
            ironLog.verbose("mAdapter is null");
            this.f30167k.a(new IronSourceError(611, "mAdapter is null"), this, false);
            return;
        }
        this.f30168l = qVar;
        this.f30165i.a((C3704sf.a) this);
        try {
            if (p()) {
                a(str, this.f30178v);
            } else {
                A();
            }
        } catch (Throwable th2) {
            C3676r4.d().a(th2);
            IronLog.INTERNAL.error("exception = " + th2.getLocalizedMessage());
            onBannerAdLoadFailed(new IronSourceError(605, th2.getLocalizedMessage()));
        }
    }

    @Override // com.ironsource.mediationsdk.A
    public String k() {
        return "ProgBannerSmash";
    }

    public z(k kVar, InterfaceC3685rd interfaceC3685rd, NetworkSettings networkSettings, AbstractAdapter abstractAdapter, int i10, String str, JSONObject jSONObject, int i11, String str2, boolean z10) {
        super(new C3405c1(networkSettings, networkSettings.getBannerSettings(), IronSource.a.BANNER), abstractAdapter);
        this.f30174r = new Object();
        this.f30166j = a.NONE;
        this.f30164h = kVar;
        this.f30165i = new C3704sf(kVar.e());
        this.f30167k = interfaceC3685rd;
        this.f29517f = i10;
        this.f30169m = str;
        this.f30171o = i11;
        this.f30172p = str2;
        this.f30170n = jSONObject;
        this.f30176t = z10;
        this.f30178v = null;
        if (r()) {
            u();
        }
    }

    private void A() {
        IronLog.INTERNAL.verbose();
        a(a.INIT_IN_PROGRESS);
        F();
        try {
            if (this.f29512a != null) {
                if (p()) {
                    this.f29512a.initBannerForBidding(this.f30164h.a(), this.f30164h.i(), this.f29515d, this);
                } else {
                    this.f29512a.initBanners(this.f30164h.a(), this.f30164h.i(), this.f29515d, this);
                }
            }
        } catch (Throwable th2) {
            C3676r4.d().a(th2);
            IronLog.INTERNAL.error("Exception while trying to init banner from " + this.f29512a.getProviderName() + ", exception =  " + th2.getLocalizedMessage());
            onBannerInitFailed(new IronSourceError(612, th2.getLocalizedMessage()));
            a(D5.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_initFailed)}, new Object[]{"reason", th2.getLocalizedMessage()}});
        }
    }

    private boolean B() {
        boolean z10;
        synchronized (this.f30174r) {
            z10 = this.f30166j == a.DESTROYED;
        }
        return z10;
    }

    private boolean C() {
        boolean z10;
        synchronized (this.f30174r) {
            z10 = this.f30166j == a.LOADED;
        }
        return z10;
    }

    private void F() {
        if (this.f29512a == null) {
            return;
        }
        try {
            String pluginType = ConfigFile.getConfigFile().getPluginType();
            if (TextUtils.isEmpty(pluginType)) {
                return;
            }
            this.f29512a.setPluginData(pluginType);
        } catch (Throwable th2) {
            C3676r4.d().a(th2);
            IronLog.INTERNAL.error("Exception while trying to set custom params from " + this.f29512a.getProviderName() + ", exception =  " + th2.getLocalizedMessage());
            a(D5.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_internal)}, new Object[]{"reason", th2.getLocalizedMessage()}});
        }
    }

    private boolean b(D5 d10) {
        return d10 == D5.BN_INSTANCE_LOAD_SUCCESS || d10 == D5.BN_INSTANCE_LOAD || d10 == D5.BN_INSTANCE_RELOAD || d10 == D5.BN_INSTANCE_RELOAD_SUCCESS || d10 == D5.BN_INSTANCE_CLICK || d10 == D5.BN_INSTANCE_DESTROY || d10 == D5.BN_INSTANCE_LOAD_ERROR || d10 == D5.BN_INSTANCE_LOAD_NO_FILL || d10 == D5.BN_INSTANCE_RELOAD_NO_FILL || d10 == D5.BN_INSTANCE_PRESENT_SCREEN || d10 == D5.BN_INSTANCE_DISMISS_SCREEN || d10 == D5.BN_INSTANCE_LEAVE_APP || d10 == D5.BN_INSTANCE_SHOW;
    }

    private void u() {
        IronLog.INTERNAL.verbose("isBidder = " + p() + ", shouldEarlyInit = " + s());
        this.f30177u = true;
        A();
    }

    public void D() {
        this.f29512a.onBannerViewBound(this.f29513b.h().getBannerSettings());
    }

    public void E() {
        this.f29512a.onBannerViewWillBind(this.f29513b.h().getBannerSettings());
    }

    @Override // com.ironsource.InterfaceC3811z3
    public void collectBiddingData(AdData adData, Context context, BiddingDataCallback biddingDataCallback) {
        a(D5.BN_INSTANCE_COLLECT_TOKEN);
        try {
            this.f29512a.collectBannerBiddingData(this.f29515d, adData != null ? C3575la.a(adData.getAdUnitData()) : null, biddingDataCallback);
        } catch (Throwable th2) {
            C3676r4.d().a(th2);
            IronLog.INTERNAL.error("Exception while trying to collectBannerBiddingData from " + this.f29512a.getProviderName() + ", exception =  " + th2.getLocalizedMessage());
        }
    }

    @Override // com.ironsource.mediationsdk.A
    public IronSource.a d() {
        return IronSource.a.BANNER;
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdClicked() {
        IronLog.INTERNAL.verbose(f());
        a(D5.BN_INSTANCE_CLICK);
        InterfaceC3685rd interfaceC3685rd = this.f30167k;
        if (interfaceC3685rd != null) {
            interfaceC3685rd.d(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLeftApplication() {
        IronLog.INTERNAL.verbose(f());
        a(D5.BN_INSTANCE_LEAVE_APP);
        InterfaceC3685rd interfaceC3685rd = this.f30167k;
        if (interfaceC3685rd != null) {
            interfaceC3685rd.b(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLoadFailed(IronSourceError ironSourceError) {
        IronLog.INTERNAL.verbose(y() + "error = " + ironSourceError);
        this.f30165i.e();
        if (a(a.LOADING, a.LOAD_FAILED)) {
            a(ironSourceError);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLoaded(View view, FrameLayout.LayoutParams layoutParams) {
        IronLog.INTERNAL.verbose(f());
        this.f30165i.e();
        if (!a(a.LOADING, a.LOADED)) {
            a(this.f30176t ? D5.BN_INSTANCE_UNEXPECTED_RELOAD_SUCCESS : D5.BN_INSTANCE_UNEXPECTED_LOAD_SUCCESS);
            return;
        }
        a(this.f30176t ? D5.BN_INSTANCE_RELOAD_SUCCESS : D5.BN_INSTANCE_LOAD_SUCCESS, new Object[][]{new Object[]{"duration", Long.valueOf(C3570l5.a(this.f30175s))}});
        InterfaceC3685rd interfaceC3685rd = this.f30167k;
        if (interfaceC3685rd != null) {
            interfaceC3685rd.a(this, view, layoutParams);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdScreenDismissed() {
        IronLog.INTERNAL.verbose(f());
        a(D5.BN_INSTANCE_DISMISS_SCREEN);
        InterfaceC3685rd interfaceC3685rd = this.f30167k;
        if (interfaceC3685rd != null) {
            interfaceC3685rd.e(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdScreenPresented() {
        IronLog.INTERNAL.verbose(f());
        a(D5.BN_INSTANCE_PRESENT_SCREEN);
        InterfaceC3685rd interfaceC3685rd = this.f30167k;
        if (interfaceC3685rd != null) {
            interfaceC3685rd.c(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdShown() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(f());
        if (C()) {
            a(D5.BN_INSTANCE_SHOW);
            InterfaceC3685rd interfaceC3685rd = this.f30167k;
            if (interfaceC3685rd != null) {
                interfaceC3685rd.a(this);
                return;
            }
            return;
        }
        ironLog.warning("wrong state - mState = " + this.f30166j);
        a(D5.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1}, new Object[]{"reason", "Wrong State - " + this.f30166j}, new Object[]{IronSourceConstants.EVENTS_EXT1, c()}});
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerInitFailed(IronSourceError ironSourceError) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(y() + "error = " + ironSourceError);
        this.f30165i.e();
        if (a(a.INIT_IN_PROGRESS, a.NONE)) {
            InterfaceC3685rd interfaceC3685rd = this.f30167k;
            if (interfaceC3685rd != null) {
                interfaceC3685rd.a(ironSourceError, this, false);
                return;
            }
            return;
        }
        ironLog.warning("wrong state - mState = " + this.f30166j);
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerInitSuccess() {
        IronLog.INTERNAL.verbose(f());
        if (a(a.INIT_IN_PROGRESS, a.READY_TO_LOAD)) {
            if (this.f30177u) {
                this.f30177u = false;
            } else {
                if (p()) {
                    return;
                }
                if (l.c(this.f30168l)) {
                    a((String) null, this.f30178v);
                } else {
                    this.f30167k.a(new IronSourceError(605, this.f30168l == null ? "banner is null" : "banner is destroyed"), this, false);
                }
            }
        }
    }

    @Override // com.ironsource.mediationsdk.A
    public void q() {
        this.f30165i.d();
        super.q();
    }

    public void t() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(f());
        a(D5.BN_INSTANCE_DESTROY);
        a(a.DESTROYED);
        AbstractAdapter abstractAdapter = this.f29512a;
        if (abstractAdapter == null) {
            ironLog.warning("mAdapter == null");
            return;
        }
        try {
            abstractAdapter.destroyBanner(this.f29513b.h().getBannerSettings());
        } catch (Throwable th2) {
            C3676r4.d().a(th2);
            IronLog.INTERNAL.error("Exception while trying to destroy banner from " + this.f29512a.getProviderName() + ", exception =  " + th2.getLocalizedMessage());
            a(D5.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_destroy)}, new Object[]{"reason", th2.getLocalizedMessage()}});
        }
    }

    public String v() {
        return !TextUtils.isEmpty(this.f29513b.h().getAdSourceNameForEvents()) ? this.f29513b.h().getAdSourceNameForEvents() : i();
    }

    public AbstractAdapter w() {
        return this.f29512a;
    }

    public String x() {
        return this.f30169m;
    }

    public String z() {
        return this.f29513b.i();
    }

    public String y() {
        return String.format("%s - ", f());
    }

    private void a(String str, JSONObject jSONObject) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(f());
        if (a(a.READY_TO_LOAD, a.LOADING)) {
            this.f30175s = new C3570l5();
            a(this.f30176t ? D5.BN_INSTANCE_RELOAD : D5.BN_INSTANCE_LOAD);
            if (this.f29512a != null) {
                try {
                    if (p()) {
                        this.f29512a.loadBannerForBidding(this.f29515d, this.f30178v, str, this.f30168l.getSize(), this);
                    } else {
                        this.f29512a.loadBanner(this.f29515d, this.f30178v, this.f30168l.getSize(), this);
                    }
                    return;
                } catch (Throwable th2) {
                    C3676r4.d().a(th2);
                    IronLog.INTERNAL.error("Exception while trying to load banner from " + this.f29512a.getProviderName() + ", exception =  " + th2.getLocalizedMessage());
                    onBannerAdLoadFailed(new IronSourceError(605, th2.getLocalizedMessage()));
                    a(D5.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_loadException)}, new Object[]{"reason", th2.getLocalizedMessage()}});
                    return;
                }
            }
            return;
        }
        ironLog.error("wrong state - state = " + this.f30166j);
    }

    private boolean a(a aVar, a aVar2) {
        boolean z10;
        synchronized (this.f30174r) {
            if (this.f30166j == aVar) {
                IronLog.INTERNAL.verbose(y() + "set state from '" + this.f30166j + "' to '" + aVar2 + "'");
                z10 = true;
                this.f30166j = aVar2;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    private void a(a aVar) {
        IronLog.INTERNAL.verbose(y() + "state = " + aVar.name());
        synchronized (this.f30174r) {
            this.f30166j = aVar;
        }
    }

    @Override // com.ironsource.C3704sf.a
    public void a() {
        IronSourceError ironSourceError;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(f());
        a aVar = a.INIT_IN_PROGRESS;
        a aVar2 = a.LOAD_FAILED;
        if (a(aVar, aVar2)) {
            ironLog.verbose("init timed out");
            ironSourceError = new IronSourceError(607, "Timed out");
        } else if (a(a.LOADING, aVar2)) {
            ironLog.verbose("load timed out");
            ironSourceError = new IronSourceError(608, "Timed out");
        } else {
            ironLog.error("unexpected state - " + this.f30166j);
            return;
        }
        a(ironSourceError);
    }

    private void a(IronSourceError ironSourceError) {
        boolean z10 = ironSourceError.getErrorCode() == 606;
        if (z10) {
            a(this.f30176t ? D5.BN_INSTANCE_RELOAD_NO_FILL : D5.BN_INSTANCE_LOAD_NO_FILL, new Object[][]{new Object[]{"duration", Long.valueOf(C3570l5.a(this.f30175s))}});
        } else {
            a(this.f30176t ? D5.BN_INSTANCE_RELOAD_ERROR : D5.BN_INSTANCE_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(C3570l5.a(this.f30175s))}});
        }
        InterfaceC3685rd interfaceC3685rd = this.f30167k;
        if (interfaceC3685rd != null) {
            interfaceC3685rd.a(ironSourceError, this, z10);
        }
    }

    public void a(D5 d10) {
        a(d10, (Object[][]) null);
    }

    public void a(D5 d10, Object[][] objArr) {
        Map<String, Object> mapM = m();
        if (B()) {
            mapM.put("reason", "banner is destroyed");
        } else {
            q qVar = this.f30168l;
            if (qVar != null) {
                l.a(mapM, qVar.getSize());
            }
        }
        if (!TextUtils.isEmpty(this.f30169m)) {
            mapM.put("auctionId", this.f30169m);
        }
        JSONObject jSONObject = this.f30170n;
        if (jSONObject != null && jSONObject.length() > 0) {
            mapM.put("genericParams", this.f30170n);
        }
        C3497h3 c3497h3 = this.f30173q;
        if (c3497h3 != null) {
            mapM.put("placement", c3497h3.c());
        }
        if (b(d10)) {
            J9.i().a(mapM, this.f30171o, this.f30172p);
        }
        mapM.put("sessionDepth", Integer.valueOf(this.f29517f));
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    mapM.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e10) {
                C3676r4.d().a(e10);
                IronLog.INTERNAL.error(c() + " smash: BN sendMediationEvent " + Log.getStackTraceString(e10));
            }
        }
        J9.i().a(new C5(d10, new JSONObject(mapM)));
    }
}
