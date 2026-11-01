package com.fyber.inneractive.sdk.network;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.InputStream;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class f1 extends t0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f16022p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.bidder.adm.y f16023q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f16024r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.response.e f16025s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.config.global.r f16026t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.network.timeouts.request.a f16027u;

    public f1(com.fyber.inneractive.sdk.bidder.adm.v vVar, String str, com.fyber.inneractive.sdk.bidder.adm.y yVar, com.fyber.inneractive.sdk.config.global.r rVar, com.fyber.inneractive.sdk.response.e eVar) {
        UnitDisplayType unitDisplayType;
        super(vVar, g0.f16028c.a(), rVar);
        this.f16024r = 0;
        this.f16099o = true;
        this.f16022p = str;
        this.f16023q = yVar;
        this.f16025s = eVar;
        this.f16026t = rVar;
        UnitDisplayType unitDisplayType2 = UnitDisplayType.BANNER;
        String strName = unitDisplayType2.name();
        Locale locale = Locale.US;
        String lowerCase = strName.toLowerCase(locale);
        if (eVar == null || (unitDisplayType = eVar.f18447p) == null) {
            AdmParametersOuterClass$AdmParameters admParametersOuterClass$AdmParameters = yVar.f14879a;
            if (admParametersOuterClass$AdmParameters != null) {
                lowerCase = com.fyber.inneractive.sdk.util.n1.a(String.valueOf(admParametersOuterClass$AdmParameters.getSpotId()));
            }
        } else {
            lowerCase = (unitDisplayType == UnitDisplayType.INTERSTITIAL || unitDisplayType == UnitDisplayType.REWARDED || unitDisplayType == UnitDisplayType.NATIVE) ? unitDisplayType.name().toLowerCase(locale) : unitDisplayType2.name().toLowerCase(locale);
        }
        String str2 = IAConfigManager.O.f15017l;
        com.fyber.inneractive.sdk.config.global.features.j jVar = (com.fyber.inneractive.sdk.config.global.features.j) rVar.a(com.fyber.inneractive.sdk.config.global.features.j.class);
        this.f16027u = TextUtils.isEmpty(str2) ? new com.fyber.inneractive.sdk.network.timeouts.request.b(jVar, lowerCase) : new com.fyber.inneractive.sdk.network.timeouts.request.c(lowerCase, jVar, str2);
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final o0 a(l lVar, Map map, int i10) throws n0, t1 {
        o0 o0Var = new o0();
        try {
            InputStream inputStream = lVar.f16041c;
            if (inputStream != null) {
                d(System.currentTimeMillis());
                StringBuffer stringBufferB = com.fyber.inneractive.sdk.util.v.b(inputStream);
                b(System.currentTimeMillis());
                String string = stringBufferB.toString();
                AdmParametersOuterClass$AdmParameters admParametersOuterClass$AdmParameters = this.f16023q.f14879a;
                int iA = admParametersOuterClass$AdmParameters != null ? admParametersOuterClass$AdmParameters.getAdType().a() : com.fyber.inneractive.sdk.bidder.adm.c.OTHER.a();
                com.fyber.inneractive.sdk.bidder.adm.y yVar = this.f16023q;
                yVar.f14881c = string;
                com.fyber.inneractive.sdk.response.e eVarA = a(iA, null, yVar, null);
                eVarA.f18439h = string;
                o0Var.f16063a = eVarA;
            }
            return o0Var;
        } catch (b e10) {
            e = e10;
            IAlog.a("failed parse adm network request but will re-try url: %s msg: %s", this.f16022p, e.getMessage());
            b(System.currentTimeMillis());
            throw new t1(e);
        } catch (com.fyber.inneractive.sdk.response.nativead.a e11) {
            b(System.currentTimeMillis());
            throw new n0(e11.getMessage(), e11);
        } catch (SocketTimeoutException e12) {
            e = e12;
            IAlog.a("failed parse adm network request but will re-try url: %s msg: %s", this.f16022p, e.getMessage());
            b(System.currentTimeMillis());
            throw new t1(e);
        } catch (UnknownHostException e13) {
            e = e13;
            IAlog.a("failed parse adm network request but will re-try url: %s msg: %s", this.f16022p, e.getMessage());
            b(System.currentTimeMillis());
            throw new t1(e);
        } catch (Exception e14) {
            b(System.currentTimeMillis());
            IAlog.a("failed parse adm network request url: %s msg: %s", this.f16022p, e14.getMessage());
            throw new n0(e14);
        }
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final void d() {
        super.d();
        IAlog.a("%s : NetworkRequestMarkup cancel by timeout at retry: %d", IAlog.a(this), Integer.valueOf(this.f16024r));
        l0 l0Var = IAConfigManager.O.f15024s;
        this.f16085a = true;
        f1 f1Var = new f1(this);
        if ((l0Var instanceof l0) && l0Var.c(f1Var)) {
            return;
        }
        IAlog.a("%s : NetworkRequestMarkup won't retry - resolve request with `Bidding ad request passed allowed time` at retry: %d", IAlog.a(this), Integer.valueOf(this.f16024r));
        a((Object) null, new Exception("Bidding ad request passed allowed time"), false);
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final int q() {
        throw null;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final int g() {
        return this.f16027u.c();
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final com.fyber.inneractive.sdk.config.global.r k() {
        return this.f16026t;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final m0 m() {
        return m0.GET;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final g1 o() {
        return g1.HIGH;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final l1 p() {
        com.fyber.inneractive.sdk.network.timeouts.request.a aVar = this.f16027u;
        return new l1(aVar.f16109i, aVar.f16108h);
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final String r() {
        return this.f16022p;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final int s() {
        return this.f16027u.f16105f;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final boolean u() {
        if (this.f16085a) {
            return false;
        }
        int i10 = this.f16024r + 1;
        this.f16024r = i10;
        if (i10 > this.f16027u.b()) {
            IAlog.a("%s : NetworkRequestMarkup Should enable retry - FALSE, current retry: %d total retries: %d, request id: %s", IAlog.a(this), Integer.valueOf(this.f16024r - 1), Integer.valueOf(this.f16027u.b()), this.f16091g);
            return false;
        }
        IAlog.a("%s : NetworkRequestMarkup Should enable retry - TRUE, current retry: %d total retries: %d, request id: %s", IAlog.a(this), Integer.valueOf(this.f16024r - 1), Integer.valueOf(this.f16027u.b()), this.f16091g);
        this.f16027u.a(this.f16024r);
        return true;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final void b(long j10) {
        super.b(j10);
        IAlog.a("%s : NetworkRequestMarkup : set end read timestamp, total execution time: %d", IAlog.a(this), Integer.valueOf(super.q()));
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final void c(long j10) {
        super.c(j10);
        IAlog.a("%s : NetworkRequestMarkup : set start connection timestamp", IAlog.a(this));
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final int j() {
        int iQ = super.q();
        com.fyber.inneractive.sdk.network.timeouts.request.a aVar = this.f16027u;
        return ((aVar.c() + aVar.f16105f) * this.f16024r) + iQ;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final void d(long j10) {
        super.d(j10);
        IAlog.a("%s : NetworkRequestMarkup : set start read timestamp", IAlog.a(this));
    }

    public f1(f1 f1Var) {
        super(f1Var);
        this.f16024r = 0;
        this.f16099o = true;
        this.f16022p = f1Var.f16022p;
        this.f16023q = f1Var.f16023q;
        this.f16025s = f1Var.f16025s;
        this.f16026t = f1Var.f16026t;
        this.f16027u = f1Var.f16027u;
        this.f16024r = f1Var.f16024r;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final l a(String str) {
        IAlog.a("%s : NetworkRequestMarkup Ad request execution started, retry number: %d, timeouts(connection: %d read: %d)", IAlog.a(this), Integer.valueOf(this.f16024r), Integer.valueOf(p().f16052a), Integer.valueOf(p().f16053b));
        return super.a(str);
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final void a(long j10) {
        super.a(j10);
        IAlog.a("%s : NetworkRequestMarkup : set end connection timestamp, total execution time: %d", IAlog.a(this), Integer.valueOf(super.q()));
    }
}
