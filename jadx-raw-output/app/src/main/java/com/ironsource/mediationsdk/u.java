package com.ironsource.mediationsdk;

import android.content.Context;
import android.content.IntentFilter;
import android.os.CountDownTimer;
import android.os.Handler;
import android.text.TextUtils;
import com.ironsource.A1;
import com.ironsource.Be;
import com.ironsource.C3373a5;
import com.ironsource.C3435dd;
import com.ironsource.C3665q9;
import com.ironsource.C3676r4;
import com.ironsource.C5;
import com.ironsource.Cc;
import com.ironsource.Cd;
import com.ironsource.Ce;
import com.ironsource.D5;
import com.ironsource.E1;
import com.ironsource.Fd;
import com.ironsource.InterfaceC3628o7;
import com.ironsource.K1;
import com.ironsource.Lb;
import com.ironsource.Lc;
import com.ironsource.Mb;
import com.ironsource.N6;
import com.ironsource.Ne;
import com.ironsource.Re;
import com.ironsource.X9;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.NetworkStateReceiver;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
class u implements Cc {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static u f30037z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Re f30038a;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private NetworkStateReceiver f30053p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private CountDownTimer f30054q;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f30057t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Ne f30058u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f30060w;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f30039b = e.f30077f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC3628o7 f30040c = Lb.U().k();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f30041d = "appKey";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f30042e = getClass().getSimpleName();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f30049l = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f30051n = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private List<Lc> f30055r = new ArrayList();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f30056s = "";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private f f30062y = new a();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Handler f30050m = IronSourceThreadManager.INSTANCE.getInitHandler();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f30043f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f30044g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f30045h = 62;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f30046i = 12;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f30047j = 5;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private AtomicBoolean f30052o = new AtomicBoolean(true);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f30048k = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f30059v = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private X9 f30061x = new X9();

    public class a extends f {
        public a() {
            super();
        }

        /* JADX WARN: Code duplicated, block: B:55:0x02a4 A[Catch: Exception -> 0x02f9, TryCatch #0 {Exception -> 0x02f9, blocks: (B:2:0x0000, B:4:0x0010, B:5:0x0020, B:7:0x002c, B:8:0x003b, B:10:0x007f, B:12:0x0092, B:14:0x00cf, B:15:0x00f8, B:17:0x0128, B:19:0x012e, B:20:0x0155, B:22:0x0180, B:24:0x018a, B:25:0x0197, B:26:0x01ab, B:28:0x01b1, B:29:0x01cb, B:31:0x01eb, B:66:0x02f3, B:32:0x0210, B:34:0x0218, B:35:0x022a, B:37:0x0230, B:38:0x023c, B:40:0x0243, B:41:0x024e, B:43:0x0254, B:44:0x025e, B:46:0x0262, B:48:0x026e, B:50:0x028b, B:51:0x0294, B:53:0x0298, B:65:0x02e9, B:55:0x02a4, B:57:0x02ac, B:59:0x02b7, B:60:0x02bb, B:61:0x02c5, B:63:0x02cb, B:64:0x02d7), top: B:71:0x0000 }] */
        /* JADX WARN: Code duplicated, block: B:57:0x02ac A[Catch: Exception -> 0x02f9, TryCatch #0 {Exception -> 0x02f9, blocks: (B:2:0x0000, B:4:0x0010, B:5:0x0020, B:7:0x002c, B:8:0x003b, B:10:0x007f, B:12:0x0092, B:14:0x00cf, B:15:0x00f8, B:17:0x0128, B:19:0x012e, B:20:0x0155, B:22:0x0180, B:24:0x018a, B:25:0x0197, B:26:0x01ab, B:28:0x01b1, B:29:0x01cb, B:31:0x01eb, B:66:0x02f3, B:32:0x0210, B:34:0x0218, B:35:0x022a, B:37:0x0230, B:38:0x023c, B:40:0x0243, B:41:0x024e, B:43:0x0254, B:44:0x025e, B:46:0x0262, B:48:0x026e, B:50:0x028b, B:51:0x0294, B:53:0x0298, B:65:0x02e9, B:55:0x02a4, B:57:0x02ac, B:59:0x02b7, B:60:0x02bb, B:61:0x02c5, B:63:0x02cb, B:64:0x02d7), top: B:71:0x0000 }] */
        /* JADX WARN: Code duplicated, block: B:59:0x02b7 A[Catch: Exception -> 0x02f9, TryCatch #0 {Exception -> 0x02f9, blocks: (B:2:0x0000, B:4:0x0010, B:5:0x0020, B:7:0x002c, B:8:0x003b, B:10:0x007f, B:12:0x0092, B:14:0x00cf, B:15:0x00f8, B:17:0x0128, B:19:0x012e, B:20:0x0155, B:22:0x0180, B:24:0x018a, B:25:0x0197, B:26:0x01ab, B:28:0x01b1, B:29:0x01cb, B:31:0x01eb, B:66:0x02f3, B:32:0x0210, B:34:0x0218, B:35:0x022a, B:37:0x0230, B:38:0x023c, B:40:0x0243, B:41:0x024e, B:43:0x0254, B:44:0x025e, B:46:0x0262, B:48:0x026e, B:50:0x028b, B:51:0x0294, B:53:0x0298, B:65:0x02e9, B:55:0x02a4, B:57:0x02ac, B:59:0x02b7, B:60:0x02bb, B:61:0x02c5, B:63:0x02cb, B:64:0x02d7), top: B:71:0x0000 }] */
        /* JADX WARN: Code duplicated, block: B:63:0x02cb A[Catch: Exception -> 0x02f9, LOOP:3: B:61:0x02c5->B:63:0x02cb, LOOP_END, TryCatch #0 {Exception -> 0x02f9, blocks: (B:2:0x0000, B:4:0x0010, B:5:0x0020, B:7:0x002c, B:8:0x003b, B:10:0x007f, B:12:0x0092, B:14:0x00cf, B:15:0x00f8, B:17:0x0128, B:19:0x012e, B:20:0x0155, B:22:0x0180, B:24:0x018a, B:25:0x0197, B:26:0x01ab, B:28:0x01b1, B:29:0x01cb, B:31:0x01eb, B:66:0x02f3, B:32:0x0210, B:34:0x0218, B:35:0x022a, B:37:0x0230, B:38:0x023c, B:40:0x0243, B:41:0x024e, B:43:0x0254, B:44:0x025e, B:46:0x0262, B:48:0x026e, B:50:0x028b, B:51:0x0294, B:53:0x0298, B:65:0x02e9, B:55:0x02a4, B:57:0x02ac, B:59:0x02b7, B:60:0x02bb, B:61:0x02c5, B:63:0x02cb, B:64:0x02d7), top: B:71:0x0000 }] */
        @Override // java.lang.Runnable
        public void run() {
            u uVar;
            Iterator it;
            try {
                r rVarM = r.m();
                if (!TextUtils.isEmpty(u.this.f30056s)) {
                    N6.a().a("userId", u.this.f30056s);
                }
                if (!TextUtils.isEmpty(u.this.f30057t)) {
                    N6.a().a("appKey", u.this.f30057t);
                }
                u uVar2 = u.this;
                uVar2.f30061x.i(uVar2.f30056s);
                u.this.f30060w = new Date().getTime();
                Cd.c().a();
                u.this.f30058u = rVarM.b(ContextProvider.getInstance().getApplicationContext(), u.this.f30056s, this.f30080c);
                u uVar3 = u.this;
                if (uVar3.f30058u != null) {
                    uVar3.f30050m.removeCallbacks(this);
                    if (u.this.f30058u.q()) {
                        u.this.b(d.INITIATED);
                        new Mb().a(u.this.f30058u.c().b().e().b(), rVarM.B());
                        K1 k1F = u.this.f30058u.c().b().f();
                        if (k1F != null) {
                            C3373a5 c3373a5 = C3373a5.f28115a;
                            c3373a5.c(k1F.g());
                            c3373a5.a(k1F.f());
                            c3373a5.a(k1F.j());
                            IronSourceThreadManager.INSTANCE.setUseSharedExecutorService(k1F.h());
                            u.this.f30040c.a(k1F);
                        }
                        u.this.a(ContextProvider.getInstance().getApplicationContext(), u.this.f30058u);
                        long time = new Date().getTime();
                        u uVar4 = u.this;
                        rVarM.a(time - uVar4.f30060w, uVar4.f30058u.i());
                        if (k1F != null && k1F.e()) {
                            new Fd(Lb.U().q(), new bk.a() { // from class: com.ironsource.mediationsdk.g0
                                @Override // bk.a
                                public final Object invoke() {
                                    return Long.valueOf(System.currentTimeMillis());
                                }
                            }, Lb.U(), IronSourceThreadManager.INSTANCE.getThreadPoolExecutor()).c(ContextProvider.getInstance().getApplicationContext());
                        }
                        u.this.f30038a = new Re();
                        u uVar5 = u.this;
                        uVar5.f30038a.a(uVar5.f30040c);
                        if (u.this.f30058u.c().b().g() && ContextProvider.getInstance().getApplicationContext() != null) {
                            C3665q9.f30550a.a(ContextProvider.getInstance().getApplicationContext());
                        }
                        List<IronSource.a> listH = u.this.f30058u.h();
                        Iterator it2 = u.this.f30055r.iterator();
                        while (it2.hasNext()) {
                            ((Lc) it2.next()).a(listH, u.this.h(), u.this.f30058u.c());
                        }
                        new C3435dd.a().a();
                        E1 e1D = u.this.f30058u.c().b().d();
                        if (e1D.f()) {
                            C3676r4.d().a(e1D.b(), e1D.d(), e1D.c(), e1D.e(), IronSourceUtils.d(), e1D.a(), e1D.g());
                        }
                    } else {
                        u uVar6 = u.this;
                        if (!uVar6.f30049l) {
                            uVar6.b(d.INIT_FAILED);
                            u uVar7 = u.this;
                            uVar7.f30049l = true;
                            Iterator it3 = uVar7.f30055r.iterator();
                            while (it3.hasNext()) {
                                ((Lc) it3.next()).h("serverResponseIsNotValid");
                            }
                        }
                    }
                } else {
                    if (uVar3.f30044g == 3) {
                        uVar3.f30059v = true;
                        Iterator it4 = uVar3.f30055r.iterator();
                        while (it4.hasNext()) {
                            ((Lc) it4.next()).a();
                        }
                    }
                    if (this.f30078a) {
                        u uVar8 = u.this;
                        if (uVar8.f30044g < uVar8.f30045h) {
                            uVar8.f30048k = true;
                            uVar8.f30050m.postDelayed(this, uVar8.f30043f * 1000);
                            u uVar9 = u.this;
                            if (uVar9.f30044g < uVar9.f30046i) {
                                uVar9.f30043f *= 2;
                            }
                        }
                    }
                    if (this.f30078a) {
                        u uVar10 = u.this;
                        if (uVar10.f30044g == uVar10.f30047j) {
                            uVar = u.this;
                            if (!uVar.f30049l) {
                                uVar.f30049l = true;
                                if (TextUtils.isEmpty(this.f30079b)) {
                                    this.f30079b = "noServerResponse";
                                }
                                it = u.this.f30055r.iterator();
                                while (it.hasNext()) {
                                    ((Lc) it.next()).h(this.f30079b);
                                }
                                u.this.b(d.INIT_FAILED);
                                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "Mediation availability false reason: No server response", 1);
                            }
                        }
                    } else {
                        uVar = u.this;
                        if (!uVar.f30049l) {
                            uVar.f30049l = true;
                            if (TextUtils.isEmpty(this.f30079b)) {
                                this.f30079b = "noServerResponse";
                            }
                            it = u.this.f30055r.iterator();
                            while (it.hasNext()) {
                                ((Lc) it.next()).h(this.f30079b);
                            }
                            u.this.b(d.INIT_FAILED);
                            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "Mediation availability false reason: No server response", 1);
                        }
                    }
                    u.this.f30044g++;
                }
                u.this.e();
            } catch (Exception e10) {
                C3676r4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
        }
    }

    public class b implements Runnable {

        public class a extends CountDownTimer {
            public a(long j10, long j11) {
                super(j10, j11);
            }

            @Override // android.os.CountDownTimer
            public void onFinish() {
                u uVar = u.this;
                if (uVar.f30049l) {
                    return;
                }
                uVar.f30049l = true;
                Iterator it = uVar.f30055r.iterator();
                while (it.hasNext()) {
                    ((Lc) it.next()).h("noInternetConnection");
                }
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "Mediation availability false reason: No internet connection", 1);
            }

            @Override // android.os.CountDownTimer
            public void onTick(long j10) {
                if (j10 <= 45000) {
                    u uVar = u.this;
                    uVar.f30059v = true;
                    Iterator it = uVar.f30055r.iterator();
                    while (it.hasNext()) {
                        ((Lc) it.next()).a();
                    }
                }
            }
        }

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            u.this.f30054q = new a(60000L, 15000L).start();
        }
    }

    public enum d {
        NOT_INIT,
        INIT_IN_PROGRESS,
        INIT_FAILED,
        INITIATED
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f30072a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f30073b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static int f30074c = 2;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static int f30075d = 3;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static int f30076e = 4;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static int f30077f = 5;
    }

    public abstract class f implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f30079b;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f30078a = true;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public r.b f30080c = new a();

        public class a implements r.b {
            public a() {
            }

            @Override // com.ironsource.mediationsdk.r.b
            public void a(String str) {
                f fVar = f.this;
                fVar.f30078a = false;
                fVar.f30079b = str;
            }
        }

        public f() {
        }
    }

    public static synchronized u c() {
        if (f30037z == null) {
            f30037z = new u();
        }
        return f30037z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (Lb.U().g().h()) {
            Lb.U().q().a(new C5(D5.EP_CONFIG_RECEIVED, (JSONObject) null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean h() {
        return this.f30048k;
    }

    public void a(Context context, Ne ne2) {
        this.f30061x.i(ne2.g().h());
        this.f30061x.c(ne2.g().d());
        A1 a1B = ne2.c().b();
        this.f30061x.a(a1B.a());
        this.f30061x.d(a1B.c().b());
        this.f30061x.b(a1B.k().b());
        this.f30061x.a(Boolean.valueOf(IronSourceUtils.c(context)));
        K1 k1F = ne2.c().b().f();
        this.f30061x.b(k1F.b());
        Lb.O().o().a(k1F.c());
    }

    public int b() {
        return this.f30039b;
    }

    public synchronized boolean d() {
        return this.f30059v;
    }

    public void f() {
        b(d.INIT_FAILED);
    }

    public synchronized void g() {
        int iA = a(a());
        this.f30039b = iA;
        this.f30061x.c(iA);
    }

    public static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f30066a;

        static {
            int[] iArr = new int[d.values().length];
            f30066a = iArr;
            try {
                iArr[d.INIT_IN_PROGRESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30066a[d.INIT_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f30066a[d.INITIATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public synchronized void b(d dVar) {
        IronLog.INTERNAL.verbose("old status: " + a() + ", new status: " + dVar + ")");
        Ce.f26094a.a(Be.values()[dVar.ordinal()]);
    }

    private u() {
    }

    private static int a(d dVar) {
        int i10 = c.f30066a[dVar.ordinal()];
        if (i10 == 1) {
            return e.f30075d;
        }
        if (i10 == 2) {
            return e.f30076e;
        }
        if (i10 != 3) {
            return e.f30072a;
        }
        return e.f30073b;
    }

    public synchronized void a(Context context, String str, String str2, IronSource.a... aVarArr) {
        try {
            AtomicBoolean atomicBoolean = this.f30052o;
            if (atomicBoolean != null && atomicBoolean.compareAndSet(true, false)) {
                b(d.INIT_IN_PROGRESS);
                this.f30056s = str2;
                this.f30057t = str;
                if (IronSourceUtils.g(context)) {
                    this.f30050m.post(this.f30062y);
                } else {
                    this.f30051n = true;
                    if (this.f30053p == null) {
                        this.f30053p = new NetworkStateReceiver(context, this);
                    }
                    context.registerReceiver(this.f30053p, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new b());
                }
            } else {
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, this.f30042e + ": Multiple calls to init are not allowed", 2);
            }
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    @Override // com.ironsource.Cc
    public void a(boolean z10) {
        if (this.f30051n && z10) {
            CountDownTimer countDownTimer = this.f30054q;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            this.f30051n = false;
            this.f30048k = true;
            Lb.U().q().a(new C5(D5.INIT_AFTER_REACHABILITY_CHANGE, IronSourceUtils.b(false)));
            this.f30050m.post(this.f30062y);
        }
    }

    public synchronized d a() {
        return d.values()[Ce.f26094a.a().ordinal()];
    }
}
