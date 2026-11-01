package com.ironsource.mediationsdk;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.C3400be;
import com.ironsource.C3405c1;
import com.ironsource.C3489gd;
import com.ironsource.C3575la;
import com.ironsource.C3676r4;
import com.ironsource.C5;
import com.ironsource.D5;
import com.ironsource.InterfaceC3801ya;
import com.ironsource.InterfaceC3811z3;
import com.ironsource.Lb;
import com.ironsource.P8;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Date;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class t extends A implements RewardedVideoSmashListener, InterfaceC3811z3 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private b f30009h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private InterfaceC3801ya f30010i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Timer f30011j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f30012k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f30013l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f30014m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private C3489gd f30015n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f30016o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f30017p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private JSONObject f30018q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f30019r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f30020s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Object f30021t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Object f30022u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f30023v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final P8.a f30024w;

    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            int i10;
            int i11;
            boolean z10;
            t tVar = t.this;
            b bVar = tVar.f30009h;
            b bVar2 = b.LOAD_IN_PROGRESS;
            String str = "Rewarded Video - load instance time out";
            if (bVar == bVar2 || bVar == b.INIT_IN_PROGRESS) {
                if (bVar == bVar2) {
                    i10 = 1025;
                } else {
                    i10 = 1032;
                    str = "Rewarded Video - init instance time out";
                }
                tVar.a(b.NOT_LOADED);
                i11 = i10;
                z10 = true;
            } else {
                i11 = 510;
                z10 = false;
            }
            t.this.a(str);
            if (!z10) {
                t.this.a(D5.RV_INSTANCE_AVAILABILITY_FALSE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1025}, new Object[]{"duration", Long.valueOf(t.this.v())}, new Object[]{IronSourceConstants.EVENTS_EXT1, t.this.f30009h.name()}});
                return;
            }
            t.this.a(D5.RV_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i11)}, new Object[]{"duration", Long.valueOf(t.this.v())}});
            t.this.a(D5.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i11)}, new Object[]{"reason", str}, new Object[]{"duration", Long.valueOf(t.this.v())}});
            t tVar2 = t.this;
            tVar2.f30010i.d(tVar2);
        }
    }

    public enum b {
        NO_INIT,
        INIT_IN_PROGRESS,
        NOT_LOADED,
        LOAD_IN_PROGRESS,
        LOADED,
        SHOW_IN_PROGRESS,
        ENDED
    }

    public t(String str, String str2, NetworkSettings networkSettings, InterfaceC3801ya interfaceC3801ya, int i10, AbstractAdapter abstractAdapter, int i11) {
        super(new C3405c1(networkSettings, networkSettings.getRewardedVideoSettings(), IronSource.a.REWARDED_VIDEO), abstractAdapter);
        this.f30021t = new Object();
        this.f30022u = new Object();
        this.f30024w = Lb.O().h();
        this.f30013l = str;
        this.f30014m = str2;
        this.f30010i = interfaceC3801ya;
        this.f30011j = null;
        this.f30012k = i10;
        this.f29517f = i11;
        this.f30009h = b.NO_INIT;
        this.f30023v = 0L;
        if (r()) {
            t();
        }
    }

    private void t() {
        a("isBidder = " + p() + ", shouldEarlyInit = " + s());
        a(b.INIT_IN_PROGRESS);
        C();
        try {
            this.f29512a.initRewardedVideoWithCallback(this.f30013l, this.f30014m, this.f29515d, this);
        } catch (Throwable th2) {
            C3676r4.d().a(th2);
            b("initForBidding exception: " + th2.getLocalizedMessage());
            onRewardedVideoInitFailed(new IronSourceError(IronSourceError.ERROR_RV_INSTANCE_INIT_EXCEPTION, th2.getLocalizedMessage()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long v() {
        return new Date().getTime() - this.f30016o;
    }

    public void a(String str, JSONObject jSONObject) {
        b bVar;
        b bVar2;
        a("loadVideo() auctionId: " + this.f30017p + " state: " + this.f30009h);
        this.f29518g = null;
        a(false);
        synchronized (this.f30021t) {
            bVar = this.f30009h;
            bVar2 = b.LOAD_IN_PROGRESS;
            if (bVar != bVar2 && bVar != b.SHOW_IN_PROGRESS) {
                a(bVar2);
            }
        }
        if (bVar == bVar2) {
            a(D5.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 5003}, new Object[]{"reason", "load during load"}});
            return;
        }
        if (bVar == b.SHOW_IN_PROGRESS) {
            a(D5.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 5004}, new Object[]{"reason", "load during show"}});
            return;
        }
        D();
        this.f30016o = new Date().getTime();
        a(D5.RV_BUSINESS_INSTANCE_LOAD);
        try {
            if (p()) {
                this.f29512a.loadRewardedVideoForBidding(this.f29515d, jSONObject, str, this);
            } else {
                C();
                this.f29512a.initAndLoadRewardedVideo(this.f30013l, this.f30014m, this.f29515d, jSONObject, this);
            }
        } catch (Throwable th2) {
            C3676r4.d().a(th2);
            b("loadVideo exception: " + th2.getLocalizedMessage());
            a(D5.TROUBLESHOOTING_RV_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(p() ? IronSourceConstants.errorCode_loadException : IronSourceConstants.errorCode_initFailed)}, new Object[]{"reason", th2.getLocalizedMessage()}});
        }
    }

    public void b(boolean z10) {
        b(D5.RV_INSTANCE_SHOW_CHANCE, new Object[][]{new Object[]{"status", z10 ? "true" : com.ironsource.mediationsdk.metadata.a.f29886h}});
    }

    @Override // com.ironsource.mediationsdk.A
    public String k() {
        return "LWSProgRvSmash";
    }

    @Override // com.ironsource.mediationsdk.A
    public int l() {
        return 2;
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoLoadSuccess() {
    }

    public String u() {
        return this.f30017p;
    }

    public LoadWhileShowSupportState w() {
        try {
            return this.f29512a.getLoadWhileShowSupportState(this.f29515d);
        } catch (Throwable th2) {
            C3676r4.d().a(th2);
            b("Exception while calling adapter.getLoadWhileShowSupportState() - " + th2.getLocalizedMessage());
            return LoadWhileShowSupportState.NONE;
        }
    }

    private void D() {
        synchronized (this.f30022u) {
            Timer timer = new Timer();
            this.f30011j = timer;
            timer.schedule(new a(), this.f30012k * 1000);
        }
    }

    private void E() {
        synchronized (this.f30022u) {
            Timer timer = this.f30011j;
            if (timer != null) {
                timer.cancel();
                this.f30011j = null;
            }
        }
    }

    private boolean c(D5 d10) {
        return d10 == D5.RV_BUSINESS_INSTANCE_LOAD || d10 == D5.RV_BUSINESS_INSTANCE_LOAD_SUCCESS || d10 == D5.RV_INSTANCE_LOAD_FAILED || d10 == D5.RV_INSTANCE_LOAD_FAILED_REASON || d10 == D5.RV_INSTANCE_LOAD_NO_FILL || d10 == D5.RV_BUSINESS_INSTANCE_OPENED || d10 == D5.RV_INSTANCE_CLOSED || d10 == D5.RV_INSTANCE_SHOW || d10 == D5.RV_INSTANCE_SHOW_FAILED || d10 == D5.RV_BUSINESS_INSTANCE_CLICKED || d10 == D5.RV_BUSINESS_INSTANCE_REWARDED;
    }

    public boolean A() {
        if (this.f30009h != b.LOADED) {
            return false;
        }
        try {
            return this.f29512a.isRewardedVideoAvailable(this.f29515d);
        } catch (Throwable th2) {
            C3676r4.d().a(th2);
            b("isReadyToShow exception: " + th2.getLocalizedMessage());
            a(D5.TROUBLESHOOTING_RV_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 5002}, new Object[]{"reason", th2.getLocalizedMessage()}});
            return false;
        }
    }

    public void B() {
        a(D5.RV_CAP_SESSION);
    }

    @Override // com.ironsource.InterfaceC3811z3
    public void collectBiddingData(AdData adData, Context context, BiddingDataCallback biddingDataCallback) {
        a(D5.RV_INSTANCE_COLLECT_TOKEN);
        try {
            this.f29512a.collectRewardedVideoBiddingData(this.f29515d, adData != null ? C3575la.a(adData.getAdUnitData()) : null, biddingDataCallback);
        } catch (Throwable th2) {
            C3676r4.d().a(th2);
            b("collectBiddingData exception: " + th2.getLocalizedMessage());
            IronLog.INTERNAL.error(th2.toString());
        }
    }

    @Override // com.ironsource.mediationsdk.A
    public IronSource.a d() {
        return IronSource.a.REWARDED_VIDEO;
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdClicked() {
        a("onRewardedVideoAdClicked");
        this.f30010i.b(this, this.f30015n);
        b(D5.RV_BUSINESS_INSTANCE_CLICKED);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdClosed() {
        a("onRewardedVideoAdClosed");
        synchronized (this.f30021t) {
            if (this.f30009h == b.SHOW_IN_PROGRESS) {
                a(b.ENDED);
                this.f30023v = new Date().getTime();
                this.f30010i.c(this);
                return;
            }
            b(D5.RV_INSTANCE_CLOSED);
            a(D5.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_adClosed)}, new Object[]{"reason", "adClosed: " + this.f30009h}});
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdEnded() {
        a("onRewardedVideoAdEnded");
        this.f30010i.e(this);
        b(D5.RV_INSTANCE_ENDED);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdOpened() {
        a("onRewardedVideoAdOpened");
        this.f30010i.f(this);
        b(D5.RV_BUSINESS_INSTANCE_OPENED);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdRewarded() {
        a("onRewardedVideoAdRewarded");
        long time = new Date().getTime();
        this.f30010i.a(this, this.f30015n);
        Map<String, Object> mapM = m();
        C3489gd c3489gd = this.f30015n;
        if (c3489gd != null) {
            mapM.put("placement", c3489gd.c());
            mapM.put(IronSourceConstants.EVENTS_REWARD_NAME, this.f30015n.f());
            mapM.put(IronSourceConstants.EVENTS_REWARD_AMOUNT, Integer.valueOf(this.f30015n.e()));
        }
        if (!TextUtils.isEmpty(r.m().l())) {
            mapM.put(IronSourceConstants.EVENTS_DYNAMIC_USER_ID, r.m().l());
        }
        if (r.m().r() != null) {
            for (String str : r.m().r().keySet()) {
                mapM.put("custom_" + str, r.m().r().get(str));
            }
        }
        if (!TextUtils.isEmpty(this.f30017p)) {
            mapM.put("auctionId", this.f30017p);
        }
        JSONObject jSONObject = this.f30018q;
        if (jSONObject != null && jSONObject.length() > 0) {
            mapM.put("genericParams", this.f30018q);
        }
        D5 d10 = D5.RV_BUSINESS_INSTANCE_REWARDED;
        if (c(d10)) {
            C3400be.i().a(mapM, this.f30019r, this.f30020s);
        }
        mapM.put("sessionDepth", Integer.valueOf(this.f29517f));
        C5 c10 = new C5(d10, new JSONObject(mapM));
        c10.a(IronSourceConstants.EVENTS_TRANS_ID, IronSourceUtils.a(c10.d(), c()));
        long j10 = this.f30023v;
        if (j10 != 0) {
            long j11 = time - j10;
            a("onRewardedVideoAdRewarded timeAfterClosed=" + j11);
            c10.a("duration", Long.valueOf(j11));
        }
        C3400be.i().a(c10);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdShowFailed(IronSourceError ironSourceError) {
        a("onRewardedVideoAdShowFailed error=" + ironSourceError.getErrorMessage());
        b(D5.RV_INSTANCE_SHOW_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}});
        synchronized (this.f30021t) {
            if (this.f30009h == b.SHOW_IN_PROGRESS) {
                a(b.ENDED);
                this.f30010i.a(ironSourceError, this);
                return;
            }
            a(D5.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_showFailed)}, new Object[]{"reason", "showFailed: " + this.f30009h}});
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdStarted() {
        a("onRewardedVideoAdStarted");
        this.f30010i.b(this);
        b(D5.RV_INSTANCE_STARTED);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdVisible() {
        a("onRewardedVideoAdVisible");
        b(D5.RV_INSTANCE_VISIBLE);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAvailabilityChanged(boolean z10) {
        boolean z11;
        a("onRewardedVideoAvailabilityChanged available=" + z10 + " state=" + this.f30009h.name());
        synchronized (this.f30021t) {
            if (this.f30009h == b.LOAD_IN_PROGRESS) {
                a(z10 ? b.LOADED : b.NOT_LOADED);
                z11 = false;
            } else {
                z11 = true;
            }
        }
        if (z11) {
            if (z10) {
                a(D5.RV_INSTANCE_AVAILABILITY_TRUE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, this.f30009h.name()}});
                return;
            } else {
                a(D5.RV_INSTANCE_AVAILABILITY_FALSE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_RV_LOAD_UNEXPECTED_CALLBACK)}, new Object[]{"duration", Long.valueOf(v())}, new Object[]{IronSourceConstants.EVENTS_EXT1, this.f30009h.name()}});
                return;
            }
        }
        E();
        a(z10 ? D5.RV_BUSINESS_INSTANCE_LOAD_SUCCESS : D5.RV_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{"duration", Long.valueOf(v())}});
        if (z10) {
            this.f30010i.a(this);
        } else {
            this.f30010i.d(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoInitFailed(IronSourceError ironSourceError) {
        a("onRewardedVideoInitFailed error=" + ironSourceError.getErrorMessage());
        E();
        a(D5.RV_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_RV_LOAD_FAIL_DUE_TO_INIT)}, new Object[]{"duration", Long.valueOf(v())}});
        a(D5.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(v())}});
        synchronized (this.f30021t) {
            if (this.f30009h == b.INIT_IN_PROGRESS) {
                a(b.NO_INIT);
                this.f30010i.d(this);
                return;
            }
            a(D5.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_initFailed)}, new Object[]{"reason", "initFailed: " + this.f30009h}});
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoInitSuccess() {
        a("onRewardedVideoInitSuccess");
        synchronized (this.f30021t) {
            if (this.f30009h == b.INIT_IN_PROGRESS) {
                a(b.NOT_LOADED);
                return;
            }
            a(D5.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_initSuccess)}, new Object[]{"reason", "initSuccess: " + this.f30009h}});
        }
    }

    public C3489gd x() {
        return this.f30015n;
    }

    public boolean y() {
        return this.f30009h == b.LOADED;
    }

    public boolean z() {
        b bVar = this.f30009h;
        return bVar == b.INIT_IN_PROGRESS || bVar == b.LOAD_IN_PROGRESS;
    }

    private void C() {
        try {
            String pluginType = ConfigFile.getConfigFile().getPluginType();
            if (!TextUtils.isEmpty(pluginType)) {
                this.f29512a.setPluginData(pluginType);
            }
        } catch (Throwable th2) {
            C3676r4.d().a(th2);
            a("setCustomParams() " + th2.getMessage());
        }
    }

    private void b(D5 d10) {
        b(d10, null);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoLoadFailed(IronSourceError ironSourceError) {
        if (ironSourceError.getErrorCode() == 1058) {
            a(D5.RV_INSTANCE_LOAD_NO_FILL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"duration", Long.valueOf(v())}});
            return;
        }
        if (ironSourceError.getErrorCode() == 1057) {
            this.f29518g = Long.valueOf(System.currentTimeMillis());
        }
        a(D5.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(v())}});
    }

    public void b(D5 d10, Object[][] objArr) {
        a(d10, objArr, true);
    }

    public t(t tVar, InterfaceC3801ya interfaceC3801ya, AbstractAdapter abstractAdapter, int i10, String str, JSONObject jSONObject, int i11, String str2) {
        this(tVar.f30013l, tVar.f30014m, tVar.f29513b.h(), interfaceC3801ya, tVar.f30012k, abstractAdapter, i10);
        this.f30017p = str;
        this.f30018q = jSONObject;
        this.f30019r = i11;
        this.f30020s = str2;
    }

    public void a(C3489gd c3489gd) {
        E();
        a("showVideo()");
        this.f30015n = c3489gd;
        a(b.SHOW_IN_PROGRESS);
        b(D5.RV_INSTANCE_SHOW);
        try {
            this.f29512a.showRewardedVideo(this.f29515d, this);
        } catch (Throwable th2) {
            C3676r4.d().a(th2);
            b("showVideo exception: " + th2.getLocalizedMessage());
            onRewardedVideoAdShowFailed(new IronSourceError(IronSourceError.ERROR_RV_SHOW_EXCEPTION, th2.getLocalizedMessage()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(b bVar) {
        a("current state=" + this.f30009h + ", new state=" + bVar);
        synchronized (this.f30021t) {
            this.f30009h = bVar;
        }
    }

    public void a(D5 d10) {
        a(d10, null, false);
    }

    public void a(D5 d10, Object[][] objArr) {
        a(d10, objArr, false);
    }

    private void a(D5 d10, Object[][] objArr, boolean z10) {
        C3489gd c3489gd;
        Map<String, Object> mapM = m();
        if (!TextUtils.isEmpty(this.f30017p)) {
            mapM.put("auctionId", this.f30017p);
        }
        JSONObject jSONObject = this.f30018q;
        if (jSONObject != null && jSONObject.length() > 0) {
            mapM.put("genericParams", this.f30018q);
        }
        if (z10 && (c3489gd = this.f30015n) != null && !TextUtils.isEmpty(c3489gd.c())) {
            mapM.put("placement", this.f30015n.c());
        }
        if (c(d10)) {
            C3400be.i().a(mapM, this.f30019r, this.f30020s);
        }
        mapM.put("sessionDepth", Integer.valueOf(this.f29517f));
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    mapM.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e10) {
                C3676r4.d().a(e10);
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, c() + " smash: RV sendProviderEvent " + Log.getStackTraceString(e10), 3);
            }
        }
        C3400be.i().a(new C5(d10, new JSONObject(mapM)));
        if (d10 == D5.RV_INSTANCE_CLOSED) {
            this.f30024w.b(IronSource.a.REWARDED_VIDEO);
        }
    }
}
