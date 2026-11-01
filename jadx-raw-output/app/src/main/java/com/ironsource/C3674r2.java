package com.ironsource;

import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.r2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C3674r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final W0 f30583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AbstractC3757w0 f30584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.ironsource.mediationsdk.e f30585c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C3442e2 f30586d;

    /* JADX INFO: renamed from: com.ironsource.r2$a */
    public static final class a implements Q1.d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC3691s2 f30588b;

        @Override // com.ironsource.Q1.d
        public void a(Q1 q10) {
            ck.p.j(q10, "auction");
            C3674r2.this.b(q10, this.f30588b);
        }

        public a(InterfaceC3691s2 interfaceC3691s2) {
            this.f30588b = interfaceC3691s2;
        }

        @Override // com.ironsource.Q1.d
        public void a(Q1 q10, String str) {
            ck.p.j(q10, "auction");
            ck.p.j(str, "error");
            C3674r2.this.b(q10, this.f30588b);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.r2$b */
    public static final class b implements S1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC3691s2 f30589a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Q1 f30590b;

        @Override // com.ironsource.S1
        public void a(List<C3605n2> list, String str, C3605n2 c3605n2, JSONObject jSONObject, JSONObject jSONObject2, int i10, long j10, int i11, String str2) {
            ck.p.j(list, "newWaterfall");
            ck.p.j(str, "auctionId");
            this.f30589a.a(list, this.f30590b.c(), str, c3605n2, jSONObject, jSONObject2, i10, j10, i11, str2);
        }

        public b(InterfaceC3691s2 interfaceC3691s2, Q1 q10) {
            this.f30589a = interfaceC3691s2;
            this.f30590b = q10;
        }

        @Override // com.ironsource.S1
        public void a(int i10, String str, int i11, String str2, long j10) {
            ck.p.j(str2, IronSourceConstants.AUCTION_FALLBACK);
            this.f30589a.a(i10, str, i11, str2, j10);
        }
    }

    public final C3442e2 b() {
        return this.f30586d;
    }

    public C3674r2(W0 w10, AbstractC3757w0 abstractC3757w0) {
        ck.p.j(w10, "adTools");
        ck.p.j(abstractC3757w0, "adUnitData");
        this.f30583a = w10;
        this.f30584b = abstractC3757w0;
        C3641p2 c3641p2E = abstractC3757w0.e();
        String strD = IronSourceUtils.d();
        ck.p.i(strD, "getSessionId()");
        com.ironsource.mediationsdk.e eVar = new com.ironsource.mediationsdk.e(new com.ironsource.mediationsdk.f(c3641p2E, strD));
        this.f30585c = eVar;
        this.f30586d = new C3442e2(w10, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(Q1 q10, InterfaceC3691s2 interfaceC3691s2) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a("auction waterfallString = " + ((Object) q10.d().c())));
        if (!q10.g()) {
            ironLog.verbose(a("auction failed - no candidates"));
            this.f30583a.e().b().a(1005, "No candidates available for auctioning");
            interfaceC3691s2.a(A0.e(this.f30584b.b().a()), "no available ad to load");
        } else {
            this.f30583a.e().b().b(q10.d().c().toString());
            this.f30585c.a(ContextProvider.getInstance().getApplicationContext(), a(q10, this.f30583a.f()), new b(interfaceC3691s2, q10));
        }
    }

    public void a(InterfaceC3691s2 interfaceC3691s2) {
        ck.p.j(interfaceC3691s2, "completionListener");
        IronLog.INTERNAL.verbose(a());
        this.f30583a.e().b().a(this.f30584b.b().d());
        a(new Q1(this.f30583a, this.f30584b), interfaceC3691s2);
    }

    private final void a(Q1 q10, InterfaceC3691s2 interfaceC3691s2) {
        if (!q10.f()) {
            b(q10, interfaceC3691s2);
        } else {
            q10.a(new a(interfaceC3691s2));
        }
    }

    private final com.ironsource.mediationsdk.i a(Q1 q10, int i10) {
        com.ironsource.mediationsdk.i iVar = new com.ironsource.mediationsdk.i(this.f30584b.b().a());
        iVar.b(IronSourceUtils.g());
        iVar.a(q10.d().a());
        iVar.a(q10.d().b());
        iVar.a(this.f30583a.h());
        iVar.a(i10);
        iVar.a(this.f30583a.k());
        Hf hfG = this.f30584b.b().g();
        iVar.e(hfG != null ? hfG.b() : false);
        iVar.a(this.f30584b.b().d());
        InterfaceC3496h2 interfaceC3496h2I = this.f30583a.i();
        if (interfaceC3496h2I != null) {
            interfaceC3496h2I.a(iVar);
        }
        return iVar;
    }

    private final String a(String str) {
        return C3621o0.a(this.f30583a, str, (String) null, 2, (Object) null);
    }

    private final String a() {
        return C3621o0.a(this.f30583a, (String) null, (String) null, 2, (Object) null);
    }
}
