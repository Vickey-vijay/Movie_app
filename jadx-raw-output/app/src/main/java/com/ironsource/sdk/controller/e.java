package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import android.os.CountDownTimer;
import android.util.Log;
import com.ironsource.A4;
import com.ironsource.A8;
import com.ironsource.B4;
import com.ironsource.B8;
import com.ironsource.C3374a6;
import com.ironsource.C3426d4;
import com.ironsource.C3472fe;
import com.ironsource.C3480g4;
import com.ironsource.C3534j5;
import com.ironsource.C3633oc;
import com.ironsource.C3676r4;
import com.ironsource.C3690s1;
import com.ironsource.C3714t8;
import com.ironsource.C3731u8;
import com.ironsource.C3748v8;
import com.ironsource.EnumC3429d7;
import com.ironsource.G5;
import com.ironsource.InterfaceC3393b7;
import com.ironsource.InterfaceC3761w4;
import com.ironsource.InterfaceC3778x4;
import com.ironsource.InterfaceC3795y4;
import com.ironsource.Lb;
import com.ironsource.M;
import com.ironsource.Mg;
import com.ironsource.Nb;
import com.ironsource.Ob;
import com.ironsource.R3;
import com.ironsource.V7;
import com.ironsource.Y4;
import com.ironsource.Z4;
import com.ironsource.Z5;
import com.ironsource.sdk.IronSourceNetwork;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class e implements com.ironsource.sdk.controller.c, com.ironsource.sdk.controller.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.ironsource.sdk.controller.l f30849b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private CountDownTimer f30851d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final V7 f30854g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Mg f30855h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final C3633oc f30858k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f30848a = e.class.getSimpleName();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C3714t8.b f30850c = C3714t8.b.None;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final R3 f30852e = new R3("NativeCommandExecutor");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final R3 f30853f = new R3("ControllerCommandsExecutor");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<String, com.ironsource.sdk.controller.l.a> f30856i = new HashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Map<String, com.ironsource.sdk.controller.l.b> f30857j = new HashMap();

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ JSONObject f30859a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC3778x4 f30860b;

        public a(JSONObject jSONObject, InterfaceC3778x4 interfaceC3778x4) {
            this.f30859a = jSONObject;
            this.f30860b = interfaceC3778x4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.f30849b;
            if (lVar != null) {
                lVar.a(this.f30859a, this.f30860b);
            }
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Y4 f30862a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Map f30863b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ InterfaceC3778x4 f30864c;

        public b(Y4 y10, Map map, InterfaceC3778x4 interfaceC3778x4) {
            this.f30862a = y10;
            this.f30863b = map;
            this.f30864c = interfaceC3778x4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.f30849b;
            if (lVar != null) {
                lVar.a(this.f30862a, this.f30863b, this.f30864c);
            }
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f30866a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f30867b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Y4 f30868c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ InterfaceC3761w4 f30869d;

        public c(String str, String str2, Y4 y10, InterfaceC3761w4 interfaceC3761w4) {
            this.f30866a = str;
            this.f30867b = str2;
            this.f30868c = y10;
            this.f30869d = interfaceC3761w4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.f30849b;
            if (lVar != null) {
                lVar.a(this.f30866a, this.f30867b, this.f30868c, this.f30869d);
            }
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ JSONObject f30871a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC3761w4 f30872b;

        public d(JSONObject jSONObject, InterfaceC3761w4 interfaceC3761w4) {
            this.f30871a = jSONObject;
            this.f30872b = interfaceC3761w4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.f30849b;
            if (lVar != null) {
                lVar.a(this.f30871a, this.f30872b);
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.e$e, reason: collision with other inner class name */
    public class RunnableC0283e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Y4 f30874a;

        public RunnableC0283e(Y4 y10) {
            this.f30874a = y10;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.f30849b;
            if (lVar != null) {
                lVar.a(this.f30874a);
            }
        }
    }

    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Y4 f30876a;

        public f(Y4 y10) {
            this.f30876a = y10;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.f30849b;
            if (lVar != null) {
                lVar.b(this.f30876a);
            }
        }
    }

    public class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Y4 f30878a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Map f30879b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ InterfaceC3761w4 f30880c;

        public g(Y4 y10, Map map, InterfaceC3761w4 interfaceC3761w4) {
            this.f30878a = y10;
            this.f30879b = map;
            this.f30880c = interfaceC3761w4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.f30849b;
            if (lVar != null) {
                lVar.a(this.f30878a, this.f30879b, this.f30880c);
            }
        }
    }

    public class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.ironsource.sdk.controller.l.a f30882a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.ironsource.sdk.controller.f.c f30883b;

        public h(com.ironsource.sdk.controller.l.a aVar, com.ironsource.sdk.controller.f.c cVar) {
            this.f30882a = aVar;
            this.f30883b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            e eVar = e.this;
            if (eVar.f30849b != null) {
                if (this.f30882a != null) {
                    eVar.f30856i.put(this.f30883b.f(), this.f30882a);
                }
                e.this.f30849b.a(this.f30883b, this.f30882a);
            }
        }
    }

    public class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ JSONObject f30885a;

        public i(JSONObject jSONObject) {
            this.f30885a = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.f30849b;
            if (lVar != null) {
                lVar.b(this.f30885a);
            }
        }
    }

    public class j implements Runnable {
        public j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.f30849b;
            if (lVar != null) {
                lVar.a();
                e.this.f30849b = null;
            }
        }
    }

    public class k extends CountDownTimer {
        public k(long j10, long j11) {
            super(j10, j11);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            Logger.i(e.this.f30848a, "Global Controller Timer Finish");
            e.this.d(C3426d4.c.f28446k);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j10) {
            Logger.i(e.this.f30848a, "Global Controller Timer Tick " + j10);
        }
    }

    public class l implements Runnable {
        public l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.d();
        }
    }

    public class m implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f30890a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f30891b;

        public m(String str, String str2) {
            this.f30890a = str;
            this.f30891b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                e eVar = e.this;
                eVar.f30849b = eVar.b(eVar.f30855h.b(), e.this.f30855h.d(), e.this.f30855h.f(), e.this.f30855h.e(), e.this.f30855h.g(), e.this.f30855h.c(), this.f30890a, this.f30891b);
                e.this.f30849b.b();
            } catch (Throwable th2) {
                C3676r4.d().a(th2);
                e.this.d(Log.getStackTraceString(th2));
            }
        }
    }

    public class n extends CountDownTimer {
        public n(long j10, long j11) {
            super(j10, j11);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            Logger.i(e.this.f30848a, "Recovered Controller | Global Controller Timer Finish");
            e.this.d(C3426d4.c.f28446k);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j10) {
            Logger.i(e.this.f30848a, "Recovered Controller | Global Controller Timer Tick " + j10);
        }
    }

    public class o implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f30894a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f30895b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Y4 f30896c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ InterfaceC3795y4 f30897d;

        public o(String str, String str2, Y4 y10, InterfaceC3795y4 interfaceC3795y4) {
            this.f30894a = str;
            this.f30895b = str2;
            this.f30896c = y10;
            this.f30897d = interfaceC3795y4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.f30849b;
            if (lVar != null) {
                lVar.a(this.f30894a, this.f30895b, this.f30896c, this.f30897d);
            }
        }
    }

    public class p implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ JSONObject f30899a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC3795y4 f30900b;

        public p(JSONObject jSONObject, InterfaceC3795y4 interfaceC3795y4) {
            this.f30899a = jSONObject;
            this.f30900b = interfaceC3795y4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.f30849b;
            if (lVar != null) {
                lVar.a(this.f30899a, this.f30900b);
            }
        }
    }

    public class q implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f30902a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f30903b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Y4 f30904c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ InterfaceC3778x4 f30905d;

        public q(String str, String str2, Y4 y10, InterfaceC3778x4 interfaceC3778x4) {
            this.f30902a = str;
            this.f30903b = str2;
            this.f30904c = y10;
            this.f30905d = interfaceC3778x4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.f30849b;
            if (lVar != null) {
                lVar.a(this.f30902a, this.f30903b, this.f30904c, this.f30905d);
            }
        }
    }

    public class r implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f30907a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC3778x4 f30908b;

        public r(String str, InterfaceC3778x4 interfaceC3778x4) {
            this.f30907a = str;
            this.f30908b = interfaceC3778x4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.f30849b;
            if (lVar != null) {
                lVar.a(this.f30907a, this.f30908b);
            }
        }
    }

    public class s implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Y4 f30910a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Map f30911b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ InterfaceC3778x4 f30912c;

        public s(Y4 y10, Map map, InterfaceC3778x4 interfaceC3778x4) {
            this.f30910a = y10;
            this.f30911b = map;
            this.f30912c = interfaceC3778x4;
        }

        @Override // java.lang.Runnable
        public void run() {
            A8.a(C3472fe.f28918j, new C3748v8().a(G5.f26611v, this.f30910a.f()).a("producttype", B8.a(this.f30910a, C3714t8.e.Interstitial)).a(G5.f26613x, Boolean.valueOf(B8.a(this.f30910a))).a(G5.I, Long.valueOf(M.f27023a.b(this.f30910a.h()))).a());
            com.ironsource.sdk.controller.l lVar = e.this.f30849b;
            if (lVar != null) {
                lVar.b(this.f30910a, this.f30911b, this.f30912c);
            }
        }
    }

    public e(Context context, C3480g4 c3480g4, Z4 z10, V7 v10, int i10, JSONObject jSONObject, String str, String str2, C3633oc c3633oc) {
        this.f30858k = c3633oc;
        this.f30854g = v10;
        String networkStorageDir = IronSourceStorageUtils.getNetworkStorageDir(context);
        C3534j5 c3534j5A = C3534j5.a(networkStorageDir, v10, jSONObject);
        this.f30855h = new Mg(context, c3480g4, z10, i10, c3534j5A, networkStorageDir);
        a(context, c3480g4, z10, i10, c3534j5A, networkStorageDir, str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.ironsource.sdk.controller.f.a aVar) {
        com.ironsource.sdk.controller.l.a aVarRemove = this.f30856i.remove(aVar.c());
        if (aVarRemove != null) {
            aVarRemove.a(aVar);
        }
    }

    private void b(Runnable runnable) {
        a(runnable, 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(Context context, C3480g4 c3480g4, Z4 z10, int i10, C3534j5 c3534j5, String str, String str2, String str3) {
        try {
            v vVarB = b(context, c3480g4, z10, i10, c3534j5, str, str2, str3);
            this.f30849b = vVarB;
            vVarB.b();
        } catch (Throwable th2) {
            C3676r4.d().a(th2);
            d(Log.getStackTraceString(th2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        A8.a(C3472fe.f28912d, new C3748v8().a(G5.A, str).a());
        this.f30850c = C3714t8.b.Loading;
        this.f30849b = new com.ironsource.sdk.controller.n(str, this.f30854g);
        this.f30852e.c();
        this.f30852e.a();
        V7 v10 = this.f30854g;
        if (v10 != null) {
            v10.c(new l());
        }
    }

    private void e(String str) {
        IronSourceNetwork.updateInitFailed(new C3731u8(1001, str));
    }

    private com.ironsource.sdk.controller.l.a i() {
        return new com.ironsource.sdk.controller.l.a() { // from class: com.ironsource.sdk.controller.z
            @Override // com.ironsource.sdk.controller.l.a
            public final void a(f.a aVar) {
                this.f31207a.a(aVar);
            }
        };
    }

    private com.ironsource.sdk.controller.l.b j() {
        return new com.ironsource.sdk.controller.l.b() { // from class: com.ironsource.sdk.controller.b0
            @Override // com.ironsource.sdk.controller.l.b
            public final void a(Nb nb2) {
                this.f30822a.a(nb2);
            }
        };
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject) {
    }

    @Override // com.ironsource.sdk.controller.l
    public void b() {
    }

    @Override // com.ironsource.sdk.controller.l
    @Deprecated
    public void f() {
    }

    @Override // com.ironsource.sdk.controller.l
    public void g() {
        com.ironsource.sdk.controller.l lVar;
        if (!m() || (lVar = this.f30849b) == null) {
            return;
        }
        lVar.g();
    }

    @Override // com.ironsource.sdk.controller.l
    public C3714t8.c h() {
        com.ironsource.sdk.controller.l lVar = this.f30849b;
        return lVar != null ? lVar.h() : C3714t8.c.None;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public v b(Context context, C3480g4 c3480g4, Z4 z10, int i10, C3534j5 c3534j5, String str, String str2, String str3) throws Throwable {
        A8.a(C3472fe.f28911c, new C3748v8().a(G5.f26614y, "thread-" + Thread.currentThread().getName()).a());
        v vVar = new v(context, z10, c3480g4, this, this.f30854g, i10, c3534j5, str, i(), j(), str2, str3);
        C3374a6 c3374a6 = new C3374a6(context, c3534j5, new Z5(this.f30854g.a()), new Ob(c3534j5.a()));
        vVar.a(new u(context));
        vVar.a(new com.ironsource.sdk.controller.o(context));
        vVar.a(new com.ironsource.sdk.controller.q(context));
        vVar.a(new com.ironsource.sdk.controller.i(context));
        vVar.a(new com.ironsource.sdk.controller.a(context));
        vVar.a(new com.ironsource.sdk.controller.j(c3534j5.a(), c3374a6));
        vVar.a(new C3690s1());
        vVar.a(new B4(context, new A4()));
        return vVar;
    }

    private void l() {
        Logger.i(this.f30848a, "handleReadyState");
        this.f30850c = C3714t8.b.Ready;
        CountDownTimer countDownTimer = this.f30851d;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        n();
        this.f30853f.c();
        this.f30853f.a();
        com.ironsource.sdk.controller.l lVar = this.f30849b;
        if (lVar != null) {
            lVar.f();
        }
    }

    private boolean m() {
        return C3714t8.b.Ready.equals(this.f30850c);
    }

    private void n() {
        this.f30855h.a(true);
        com.ironsource.sdk.controller.l lVar = this.f30849b;
        if (lVar != null) {
            lVar.a(this.f30855h.i());
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void e() {
        com.ironsource.sdk.controller.l lVar;
        if (!m() || (lVar = this.f30849b) == null) {
            return;
        }
        lVar.e();
    }

    public com.ironsource.sdk.controller.l k() {
        return this.f30849b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Nb nb2) {
        com.ironsource.sdk.controller.l.b bVar = this.f30857j.get(nb2.d());
        if (bVar != null) {
            bVar.a(nb2);
        }
    }

    private void a(Runnable runnable, long j10) {
        V7 v10 = this.f30854g;
        if (v10 != null) {
            v10.d(runnable, j10);
        } else {
            Logger.e(this.f30848a, "mThreadManager = null");
        }
    }

    @Override // com.ironsource.sdk.controller.c
    public void c() {
        Logger.i(this.f30848a, "handleControllerLoaded");
        this.f30850c = C3714t8.b.Loaded;
        this.f30852e.c();
        this.f30852e.a();
    }

    private void a(final Context context, final C3480g4 c3480g4, final Z4 z10, final int i10, final C3534j5 c3534j5, final String str, final String str2, final String str3) {
        int i11 = Lb.U().g().i();
        if (i11 > 0) {
            A8.a(C3472fe.B, new C3748v8().a(G5.f26614y, String.valueOf(i11)).a());
        }
        Runnable runnable = new Runnable() { // from class: com.ironsource.sdk.controller.a0
            @Override // java.lang.Runnable
            public final void run() {
                this.f30811b.c(context, c3480g4, z10, i10, c3534j5, str, str2, str3);
            }
        };
        if (Lb.U().g().e()) {
            this.f30854g.b(runnable, i11);
        } else {
            a(runnable, i11);
        }
        this.f30851d = new k(200000L, 1000L).start();
    }

    @Override // com.ironsource.sdk.controller.c
    public void c(String str) {
        Logger.i(this.f30848a, "handleControllerFailed ");
        C3748v8 c3748v8 = new C3748v8();
        c3748v8.a(G5.A, str);
        c3748v8.a(G5.f26614y, String.valueOf(this.f30855h.l()));
        A8.a(C3472fe.f28923o, c3748v8.a());
        this.f30855h.a(false);
        e(str);
        if (this.f30851d != null) {
            Logger.i(this.f30848a, "cancel timer mControllerReadyTimer");
            this.f30851d.cancel();
        }
        d(str);
    }

    @Override // com.ironsource.sdk.controller.c
    public void d() {
        Logger.i(this.f30848a, "handleControllerReady ");
        this.f30858k.a(h());
        if (C3714t8.c.Web.equals(h())) {
            A8.a(C3472fe.f28913e, new C3748v8().a(G5.f26614y, String.valueOf(this.f30855h.l())).a());
            IronSourceNetwork.updateInitSucceeded();
        }
        l();
    }

    public void a(Runnable runnable) {
        this.f30852e.a(runnable);
    }

    @Override // com.ironsource.InterfaceC3465f7
    public void a(InterfaceC3393b7 interfaceC3393b7) {
        EnumC3429d7 enumC3429d7B = interfaceC3393b7.b();
        if (enumC3429d7B == EnumC3429d7.SendEvent) {
            A8.a(C3472fe.A, new C3748v8().a(G5.f26614y, interfaceC3393b7.a() + " : strategy: " + enumC3429d7B).a());
            return;
        }
        if (enumC3429d7B == EnumC3429d7.NativeController) {
            com.ironsource.sdk.controller.n nVar = new com.ironsource.sdk.controller.n(interfaceC3393b7.a(), this.f30854g);
            this.f30849b = nVar;
            this.f30858k.a(nVar.h());
            A8.a(C3472fe.f28912d, new C3748v8().a(G5.A, interfaceC3393b7.a() + " : strategy: " + enumC3429d7B).a());
            A8.a(C3472fe.A, new C3748v8().a(G5.f26614y, interfaceC3393b7.a() + " : strategy: " + enumC3429d7B).a());
        }
    }

    @Override // com.ironsource.sdk.controller.c
    public void b(String str) {
        A8.a(C3472fe.f28933y, new C3748v8().a(G5.f26614y, str).a());
        CountDownTimer countDownTimer = this.f30851d;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        d(str);
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(Y4 y10, Map<String, String> map, InterfaceC3778x4 interfaceC3778x4) {
        this.f30853f.a(new s(y10, map, interfaceC3778x4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(Y4 y10) {
        this.f30853f.a(new f(y10));
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(JSONObject jSONObject) {
        this.f30853f.a(new i(jSONObject));
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(Context context) {
        com.ironsource.sdk.controller.l lVar;
        if (!m() || (lVar = this.f30849b) == null) {
            return;
        }
        lVar.b(context);
    }

    private void a(C3714t8.e eVar, Y4 y10, String str, String str2) {
        Logger.i(this.f30848a, "recoverWebController for product: " + eVar.toString());
        C3748v8 c3748v8 = new C3748v8();
        c3748v8.a("producttype", eVar.toString());
        c3748v8.a(G5.f26611v, y10.f());
        A8.a(C3472fe.f28910b, c3748v8.a());
        this.f30855h.n();
        a();
        m mVar = new m(str, str2);
        if (Lb.U().g().e()) {
            this.f30854g.b(mVar);
        } else {
            b(mVar);
        }
        this.f30851d = new n(200000L, 1000L).start();
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, Y4 y10, InterfaceC3795y4 interfaceC3795y4) {
        if (this.f30855h.a(h(), this.f30850c)) {
            a(C3714t8.e.RewardedVideo, y10, str, str2);
        }
        this.f30853f.a(new o(str, str2, y10, interfaceC3795y4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, InterfaceC3795y4 interfaceC3795y4) {
        this.f30853f.a(new p(jSONObject, interfaceC3795y4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, Y4 y10, InterfaceC3778x4 interfaceC3778x4) {
        if (this.f30855h.a(h(), this.f30850c)) {
            a(C3714t8.e.Interstitial, y10, str, str2);
        }
        this.f30853f.a(new q(str, str2, y10, interfaceC3778x4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, InterfaceC3778x4 interfaceC3778x4) {
        Logger.i(this.f30848a, "load interstitial");
        this.f30853f.a(new r(str, interfaceC3778x4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, InterfaceC3778x4 interfaceC3778x4) {
        this.f30853f.a(new a(jSONObject, interfaceC3778x4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Y4 y10, Map<String, String> map, InterfaceC3778x4 interfaceC3778x4) {
        this.f30853f.a(new b(y10, map, interfaceC3778x4));
    }

    @Override // com.ironsource.sdk.controller.l
    public boolean a(String str) {
        if (this.f30849b == null || !m()) {
            return false;
        }
        return this.f30849b.a(str);
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, Y4 y10, InterfaceC3761w4 interfaceC3761w4) {
        if (this.f30855h.a(h(), this.f30850c)) {
            a(C3714t8.e.Banner, y10, str, str2);
        }
        this.f30853f.a(new c(str, str2, y10, interfaceC3761w4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, InterfaceC3761w4 interfaceC3761w4) {
        this.f30853f.a(new d(jSONObject, interfaceC3761w4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Y4 y10) {
        this.f30853f.a(new RunnableC0283e(y10));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Y4 y10, Map<String, String> map, InterfaceC3761w4 interfaceC3761w4) {
        this.f30853f.a(new g(y10, map, interfaceC3761w4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(com.ironsource.sdk.controller.f.c cVar, com.ironsource.sdk.controller.l.a aVar) {
        this.f30853f.a(new h(aVar, cVar));
    }

    public void a(String str, com.ironsource.sdk.controller.l.b bVar) {
        this.f30857j.put(str, bVar);
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Context context) {
        com.ironsource.sdk.controller.l lVar;
        if (!m() || (lVar = this.f30849b) == null) {
            return;
        }
        lVar.a(context);
    }

    @Override // com.ironsource.sdk.controller.l
    public void a() {
        Logger.i(this.f30848a, "destroy controller");
        CountDownTimer countDownTimer = this.f30851d;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        R3 r10 = this.f30853f;
        if (r10 != null) {
            r10.b();
        }
        this.f30851d = null;
        b(new j());
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Activity activity) {
        this.f30849b.a(activity);
    }
}
