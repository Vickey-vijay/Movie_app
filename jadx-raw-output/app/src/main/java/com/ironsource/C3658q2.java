package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.q2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3658q2 extends wg {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final W0 f30493e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AbstractC3757w0 f30494f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C3674r2 f30495g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Vc f30496h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private InterfaceC3691s2 f30497i;

    /* JADX INFO: renamed from: com.ironsource.q2$a */
    public static final class a implements InterfaceC3691s2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ D f30499b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ xg f30500c;

        @Override // com.ironsource.InterfaceC3691s2
        public void a(final List<C3605n2> list, final Map<String, H> map, final String str, final C3605n2 c3605n2, final JSONObject jSONObject, final JSONObject jSONObject2, final int i10, final long j10, final int i11, final String str2) {
            ck.p.j(list, "newWaterfall");
            ck.p.j(map, "adInstancePayloads");
            ck.p.j(str, "auctionId");
            W0 w10 = C3658q2.this.f30493e;
            final C3658q2 c3658q2 = C3658q2.this;
            final D d10 = this.f30499b;
            final xg xgVar = this.f30500c;
            w10.a(new Runnable() { // from class: com.ironsource.pl
                @Override // java.lang.Runnable
                public final void run() {
                    C3658q2.a.a(c3658q2, d10, xgVar, list, map, str, c3605n2, jSONObject, jSONObject2, i10, j10, i11, str2);
                }
            });
        }

        public a(D d10, xg xgVar) {
            this.f30499b = d10;
            this.f30500c = xgVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(C3658q2 c3658q2, D d10, xg xgVar, List list, Map map, String str, C3605n2 c3605n2, JSONObject jSONObject, JSONObject jSONObject2, int i10, long j10, int i11, String str2) {
            ck.p.j(c3658q2, "this$0");
            ck.p.j(d10, "$adInstanceFactory");
            ck.p.j(xgVar, "$waterfallFetcherListener");
            ck.p.j(list, "$newWaterfall");
            ck.p.j(map, "$adInstancePayloads");
            ck.p.j(str, "$auctionId");
            c3658q2.f30497i = null;
            c3658q2.a(d10, xgVar, list, map, str, c3605n2, jSONObject, jSONObject2, i10, j10, i11, str2);
        }

        @Override // com.ironsource.InterfaceC3691s2
        public void a(final int i10, final String str, final int i11, final String str2, final long j10) {
            ck.p.j(str2, IronSourceConstants.AUCTION_FALLBACK);
            W0 w10 = C3658q2.this.f30493e;
            final C3658q2 c3658q2 = C3658q2.this;
            final D d10 = this.f30499b;
            final xg xgVar = this.f30500c;
            w10.a(new Runnable() { // from class: com.ironsource.ql
                @Override // java.lang.Runnable
                public final void run() {
                    C3658q2.a.a(c3658q2, d10, xgVar, i10, str, i11, str2, j10);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(C3658q2 c3658q2, D d10, xg xgVar, int i10, String str, int i11, String str2, long j10) {
            ck.p.j(c3658q2, "this$0");
            ck.p.j(d10, "$adInstanceFactory");
            ck.p.j(xgVar, "$waterfallFetcherListener");
            ck.p.j(str2, "$auctionFallback");
            c3658q2.f30497i = null;
            c3658q2.a(d10, xgVar, i10, str, i11, str2, j10);
        }

        @Override // com.ironsource.InterfaceC3691s2
        public void a(int i10, String str) {
            ck.p.j(str, "errorReason");
            this.f30500c.a(i10, str);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3658q2(W0 w10, AbstractC3757w0 abstractC3757w0) {
        super(w10, abstractC3757w0);
        ck.p.j(w10, "adTools");
        ck.p.j(abstractC3757w0, "adUnitData");
        this.f30493e = w10;
        this.f30494f = abstractC3757w0;
        C3674r2 c3674r2 = new C3674r2(w10, abstractC3757w0);
        this.f30495g = c3674r2;
        this.f30496h = c3674r2.b();
    }

    @Override // com.ironsource.wg
    public Vc a() {
        return this.f30496h;
    }

    @Override // com.ironsource.wg
    public void a(D d10, xg xgVar) {
        ck.p.j(d10, "adInstanceFactory");
        ck.p.j(xgVar, "waterfallFetcherListener");
        a aVar = new a(d10, xgVar);
        this.f30495g.a(aVar);
        this.f30497i = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(D d10, xg xgVar, List<C3605n2> list, Map<String, H> map, String str, C3605n2 c3605n2, JSONObject jSONObject, JSONObject jSONObject2, int i10, long j10, int i11, String str2) {
        IronLog.INTERNAL.verbose(C3621o0.a(this.f30493e, (String) null, (String) null, 3, (Object) null));
        C3549k2 c3549k2 = new C3549k2(str, jSONObject, c3605n2, i10, "");
        if (!TextUtils.isEmpty(str2)) {
            this.f30493e.e().h().a(i11, str2);
        }
        a(jSONObject2);
        yg ygVarA = a(list, map, c3549k2, d10);
        this.f30493e.e().a(new U1(c3549k2));
        this.f30493e.e().b().a(j10, this.f30494f.v() + ";wtf=" + ygVarA.c());
        this.f30493e.e().b().c(ygVarA.d());
        a(ygVarA, xgVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(D d10, xg xgVar, int i10, String str, int i11, String str2, long j10) {
        IronLog.INTERNAL.verbose(C3621o0.a(this.f30493e, "Auction failed (error " + i10 + " - " + str + ")", (String) null, 2, (Object) null));
        boolean zN = this.f30494f.e().n();
        String strA = Y1.f27889a.a(zN);
        C3549k2 c3549k2 = new C3549k2(strA, null, null, i11, str2);
        E5 e5E = this.f30493e.e();
        e5E.a(new U1(c3549k2));
        e5E.b().a(j10, i10, str);
        if (zN) {
            a(d10, xgVar, i11, str2, strA);
        } else {
            a(xgVar);
        }
    }

    private final void a(yg ygVar, xg xgVar) {
        this.f30493e.h().a(ygVar);
        xgVar.a(ygVar);
    }

    private final void a(JSONObject jSONObject) {
        int i10;
        try {
            if (jSONObject == null) {
                this.f30494f.b(false);
                IronLog.INTERNAL.verbose(C3621o0.a(this.f30493e, "loading configuration from auction response is null, using the following: " + this.f30494f.v(), (String) null, 2, (Object) null));
                return;
            }
            try {
                if (jSONObject.has("parallelLoad") && (i10 = jSONObject.getInt("parallelLoad")) > 0) {
                    this.f30494f.a(i10);
                }
                if (jSONObject.has("bidderExclusive")) {
                    this.f30494f.a(jSONObject.getBoolean("bidderExclusive"));
                }
                this.f30494f.b(jSONObject.optBoolean(com.ironsource.mediationsdk.d.f29614z, false));
                IronLog.INTERNAL.verbose(C3621o0.a(this.f30493e, this.f30494f.v(), (String) null, 2, (Object) null));
            } catch (JSONException e10) {
                C3676r4.d().a(e10);
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("failed to update loading configuration for" + this.f30494f.b().a() + " Error: " + e10.getMessage());
                ironLog.verbose(C3621o0.a(this.f30493e, this.f30494f.v(), (String) null, 2, (Object) null));
            }
        } catch (Throwable th2) {
            IronLog.INTERNAL.verbose(C3621o0.a(this.f30493e, this.f30494f.v(), (String) null, 2, (Object) null));
            throw th2;
        }
    }

    private final void a(D d10, xg xgVar, int i10, String str, String str2) {
        IronLog.INTERNAL.verbose(C3621o0.a(this.f30493e, "Moving to fallback waterfall", (String) null, 2, (Object) null));
        new Ec(this.f30493e, this.f30494f).a(xgVar, i10, str, str2, d10);
    }

    private final void a(xg xgVar) {
        xgVar.a(509, "Mediation No fill");
    }
}
