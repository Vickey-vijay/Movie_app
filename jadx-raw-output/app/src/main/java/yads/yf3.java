package yads;

import android.content.Context;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import yads.yf3;

/* JADX INFO: loaded from: classes11.dex */
public final class yf3 implements cg3, nf3 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ jk.k[] f84936k = {ck.s.f(new MutablePropertyReference1Impl(yf3.class, "adParameterManager", "getAdParameterManager()Lcom/monetization/ads/video/render/report/VideoAdRenderingResultReporter$ResponseReportParameterManager;", 0)), ck.s.f(new MutablePropertyReference1Impl(yf3.class, "requestParameterManager", "getRequestParameterManager()Lcom/monetization/ads/video/render/report/VideoAdRenderingResultReporter$RequestReportParameterManager;", 0))};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final long f84937l = TimeUnit.SECONDS.toMillis(10);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w5 f84938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yj3 f84939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wb2 f84940c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final eg3 f84941d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final pf3 f84942e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final bg3 f84943f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ii3 f84944g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f84945h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final wf3 f84946i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final xf3 f84947j;

    public /* synthetic */ yf3(Context context, lu2 lu2Var, v9 v9Var, je3 je3Var, w5 w5Var, jg3 jg3Var, ek3 ek3Var, bj3 bj3Var, zj3 zj3Var) {
        this(context, lu2Var, v9Var, je3Var, w5Var, jg3Var, ek3Var, bj3Var, zj3Var, vb2.a(false));
    }

    public final void a(jf3 jf3Var) {
        b();
        if (this.f84945h) {
            return;
        }
        this.f84945h = true;
        String lowerCase = jf3Var.f79026a.name().toLowerCase(Locale.ROOT);
        ck.p.i(lowerCase, "toLowerCase(...)");
        String message = jf3Var.f79027b.getMessage();
        if (message == null) {
            message = "";
        }
        bg3 bg3Var = this.f84943f;
        bg3Var.getClass();
        bg3Var.a(kotlin.collections.a.o(mj.h.a("status", "error"), mj.h.a("failure_reason", lowerCase), mj.h.a("error_message", message)));
    }

    public final void b() {
        eg3 eg3Var = this.f84941d;
        eg3Var.f77067c.removeCallbacksAndMessages(null);
        eg3Var.f77069e = false;
        pf3 pf3Var = this.f84942e;
        pf3Var.f81403c.removeCallbacksAndMessages(null);
        pf3Var.f81405e = false;
        ((zb2) this.f84940c).a();
    }

    public yf3(Context context, lu2 lu2Var, v9 v9Var, je3 je3Var, w5 w5Var, jg3 jg3Var, ek3 ek3Var, bj3 bj3Var, zj3 zj3Var, wb2 wb2Var) {
        this.f84938a = w5Var;
        this.f84939b = zj3Var;
        this.f84940c = wb2Var;
        this.f84941d = new eg3(bj3Var, this);
        this.f84942e = new pf3(jg3Var, this);
        this.f84943f = new bg3(context, lu2Var, v9Var, w5Var);
        this.f84944g = new ii3(je3Var, ek3Var);
        fk.a aVar = fk.a.f52963a;
        this.f84946i = new wf3(this);
        this.f84947j = new xf3(this);
    }

    public final void a() {
        eg3 eg3Var = this.f84941d;
        eg3Var.f77067c.removeCallbacksAndMessages(null);
        eg3Var.f77069e = false;
        this.f84938a.a(v5.f83761u, null);
        this.f84939b.i();
        pf3 pf3Var = this.f84942e;
        if (!pf3Var.f81405e && !pf3Var.f81404d) {
            pf3Var.f81405e = true;
            pf3Var.f81403c.post(new of3(pf3Var));
        }
        ((zb2) this.f84940c).a(f84937l, new ac2() { // from class: cp.sc
            @Override // yads.ac2
            public final void a() {
                yf3.a(this.f51586a);
            }
        });
    }

    public static final void a(yf3 yf3Var) {
        lf0 lf0Var = new lf0();
        if3 if3Var = if3.f78633i;
        yf3Var.b();
        if (yf3Var.f84945h) {
            return;
        }
        yf3Var.f84945h = true;
        String lowerCase = if3Var.name().toLowerCase(Locale.ROOT);
        ck.p.i(lowerCase, "toLowerCase(...)");
        String message = lf0Var.getMessage();
        if (message == null) {
            message = "";
        }
        bg3 bg3Var = yf3Var.f84943f;
        bg3Var.getClass();
        bg3Var.a(kotlin.collections.a.o(mj.h.a("status", "error"), mj.h.a("failure_reason", lowerCase), mj.h.a("error_message", message)));
    }
}
