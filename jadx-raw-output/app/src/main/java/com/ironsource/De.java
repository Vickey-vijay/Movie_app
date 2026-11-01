package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class De {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final X9 f26381a = new X9();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3698s9 f26382b = new C3698s9(IronSourceThreadManager.INSTANCE.getInitHandler());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final B7 f26383c = Lb.f26968s.d().i();

    public static final class a extends AbstractRunnableC3526ie {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Runnable f26384b;

        public a(Runnable runnable) {
            this.f26384b = runnable;
        }

        @Override // com.ironsource.AbstractRunnableC3526ie
        public void a() {
            this.f26384b.run();
        }
    }

    public final void a(AbstractRunnableC3526ie abstractRunnableC3526ie) {
        ck.p.j(abstractRunnableC3526ie, "safeRunnable");
        a(this, abstractRunnableC3526ie, 0L, 2, (Object) null);
    }

    public final B7 b() {
        return this.f26383c;
    }

    public final X9 c() {
        return this.f26381a;
    }

    public final void d(Runnable runnable) {
        ck.p.j(runnable, "callback");
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, runnable, 0L, 2, null);
    }

    public final void e(Runnable runnable) {
        ck.p.j(runnable, "callback");
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new a(runnable), 0L, 2, null);
    }

    public final void g() {
        Lb.f26968s.d().q().a(new C5(D5.USING_CACHE_FOR_INIT_EVENT, IronSourceUtils.b(false)));
    }

    public static /* synthetic */ void a(De de2, Runnable runnable, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        de2.a(runnable, j10);
    }

    public final void b(AbstractRunnableC3526ie abstractRunnableC3526ie) {
        ck.p.j(abstractRunnableC3526ie, "safeRunnable");
        this.f26382b.a(abstractRunnableC3526ie);
    }

    public final void c(Runnable runnable) {
        ck.p.j(runnable, "runnable");
        this.f26382b.b(runnable);
    }

    public final C3450ea d() {
        return com.ironsource.mediationsdk.r.m().s();
    }

    public final void a(Runnable runnable, long j10) {
        ck.p.j(runnable, "runnable");
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(runnable, j10);
    }

    public final void b(Runnable runnable) {
        ck.p.j(runnable, "runnable");
        IronSourceThreadManager.postMediationBackgroundTask$default(IronSourceThreadManager.INSTANCE, runnable, 0L, 2, null);
    }

    public final boolean c(Context context) {
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        return IronSourceUtils.g(context);
    }

    public final void f() {
        com.ironsource.mediationsdk.r.m().S();
    }

    public final void a(Runnable runnable) {
        ck.p.j(runnable, "callback");
        this.f26382b.a(runnable);
    }

    public final String b(Context context) {
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        String strM = this.f26383c.M(context);
        ck.p.i(strM, "deviceInfoService.getOrG…UniqueIdentifier(context)");
        return strM;
    }

    public final boolean e() {
        return IronSourceUtils.g();
    }

    public final void a(AbstractRunnableC3526ie abstractRunnableC3526ie, long j10) {
        ck.p.j(abstractRunnableC3526ie, "safeRunnable");
        this.f26382b.a(abstractRunnableC3526ie, j10);
    }

    public static /* synthetic */ void a(De de2, AbstractRunnableC3526ie abstractRunnableC3526ie, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        de2.a(abstractRunnableC3526ie, j10);
    }

    public final void a(String str, String str2) {
        ck.p.j(str, C3426d4.i.W);
        ck.p.j(str2, "value");
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        N6.a().a(str, str2);
    }

    public final void a(long j10, Ne.a aVar) {
        ck.p.j(aVar, "responseOrigin");
        com.ironsource.mediationsdk.r.m().a(j10, aVar);
    }

    public final String a(Context context) {
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        String strB = com.ironsource.mediationsdk.r.m().b(context);
        ck.p.i(strB, "getInstance().getAdvertiserId(context)");
        return strB;
    }

    public final Ne a(Context context, String str) {
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        ck.p.j(str, "appKey");
        return com.ironsource.mediationsdk.r.m().a(context, str);
    }

    public final void a(D1 d10) {
        ck.p.j(d10, "reporterSettings");
        C3676r4.d().a(d10.b(), d10.d(), d10.c(), d10.e(), IronSourceUtils.d(), d10.a(), d10.g());
    }

    public final void a(Be be2) {
        ck.p.j(be2, "initStatus");
        Ce.f26094a.a(be2);
    }

    public final void a() {
        Cd.c().a();
    }

    public final void a(C3617ne c3617ne, String str, String str2) {
        ck.p.j(c3617ne, "error");
        JSONObject jSONObjectB = IronSourceUtils.b(false);
        try {
            jSONObjectB.put(IronSourceConstants.EVENTS_ERROR_CODE, c3617ne.c());
            jSONObjectB.put("reason", c3617ne.d());
            String str3 = "";
            if (!TextUtils.isEmpty(str)) {
                str3 = "request=" + str + ";";
            }
            if (!TextUtils.isEmpty(str2)) {
                str3 = str3 + "body=" + str2;
            }
            if (str3.length() > 0) {
                jSONObjectB.put(IronSourceConstants.EVENTS_EXT1, str3);
            }
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(e10.getMessage());
        }
        Lb.f26968s.d().q().a(new C5(D5.TROUBLESHOOTING_SERVER_INIT_FAILED, jSONObjectB));
    }
}
