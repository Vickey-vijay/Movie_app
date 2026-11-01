package com.ironsource;

import android.app.Activity;
import androidx.appcompat.widget.ActivityChooserModel;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import java.util.UUID;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.ironsource.cb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3415cb implements InterfaceC3535j6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f28339n = new a(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f28340o = "Fullscreen Ad Internal";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LevelPlay.AdFormat f28341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f28342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f28343c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C3621o0 f28344d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C3518i6 f28345e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC3774x0 f28346f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final L7 f28347g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final InterfaceC3710t4 f28348h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final mj.g f28349i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private InterfaceC3433db f28350j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final UUID f28351k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private InterfaceC3695s6 f28352l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private C3570l5 f28353m;

    /* JADX INFO: renamed from: com.ironsource.cb$a */
    public static final class a {
        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        private a() {
        }

        public final boolean a(String str, LevelPlay.AdFormat adFormat) {
            ck.p.j(str, "placementName");
            ck.p.j(adFormat, "adFormat");
            C3621o0 c3621o0A = C3621o0.a.a(com.unity3d.mediation.a.a(adFormat), E0.b.MEDIATION);
            if (!c3621o0A.g()) {
                c3621o0A.e().a().a(str, "SDK is not initialized", false);
                return false;
            }
            M3 m3A = Lb.f26968s.d().p().a(str, adFormat);
            boolean zD = m3A.d();
            c3621o0A.e().a().a(str, m3A.e(), zD);
            return zD;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.cb$b */
    public interface b {
        Double getBidFloor();
    }

    /* JADX INFO: renamed from: com.ironsource.cb$c */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C3621o0 f28354a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final C3518i6 f28355b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final L7 f28356c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final InterfaceC3710t4 f28357d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final C3815z7 f28358e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final b f28359f;

        public c(C3621o0 c3621o0, C3518i6 c3518i6, L7 l10, InterfaceC3710t4 interfaceC3710t4, C3815z7 c3815z7, b bVar) {
            ck.p.j(c3621o0, "adTools");
            ck.p.j(c3518i6, "adControllerFactory");
            ck.p.j(l10, IronSourceConstants.EVENTS_PROVIDER);
            ck.p.j(interfaceC3710t4, "currentTimeProvider");
            ck.p.j(c3815z7, "idFactory");
            ck.p.j(bVar, "config");
            this.f28354a = c3621o0;
            this.f28355b = c3518i6;
            this.f28356c = l10;
            this.f28357d = interfaceC3710t4;
            this.f28358e = c3815z7;
            this.f28359f = bVar;
        }

        public final C3518i6 a() {
            return this.f28355b;
        }

        public final C3621o0 b() {
            return this.f28354a;
        }

        public final b c() {
            return this.f28359f;
        }

        public final InterfaceC3710t4 d() {
            return this.f28357d;
        }

        public final C3815z7 e() {
            return this.f28358e;
        }

        public final L7 f() {
            return this.f28356c;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.cb$d */
    public static final class d extends Lambda implements bk.a<C3500h6> {
        public d() {
            super(0);
        }

        @Override // bk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3500h6 invoke() {
            return C3415cb.this.b();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.cb$e */
    public static final class e implements InterfaceC3729u6 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C3476g0 f28362b;

        public e(C3476g0 c3476g0) {
            this.f28362b = c3476g0;
        }

        @Override // com.ironsource.InterfaceC3729u6
        public C3712t6 a(boolean z10, InterfaceC3763w6 interfaceC3763w6) {
            ck.p.j(interfaceC3763w6, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            AbstractC3757w0 abstractC3757w0A = C3415cb.this.g().a(z10, this.f28362b);
            return new C3712t6(Lb.f26968s.c(), new W0(C3415cb.this.f(), abstractC3757w0A, E0.b.MEDIATION), abstractC3757w0A, interfaceC3763w6, null, null, null, null, 240, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3415cb(LevelPlay.AdFormat adFormat, String str, b bVar, C3621o0 c3621o0, C3518i6 c3518i6, InterfaceC3774x0 interfaceC3774x0, L7 l10, InterfaceC3710t4 interfaceC3710t4, C3815z7 c3815z7) {
        ck.p.j(adFormat, "adFormat");
        ck.p.j(str, "adUnitId");
        ck.p.j(bVar, "config");
        ck.p.j(c3621o0, "adTools");
        ck.p.j(c3518i6, "fullscreenAdControllerFactory");
        ck.p.j(interfaceC3774x0, "adUnitDataFactory");
        ck.p.j(l10, "mediationServicesProvider");
        ck.p.j(interfaceC3710t4, "currentTimeProvider");
        ck.p.j(c3815z7, "idFactory");
        this.f28341a = adFormat;
        this.f28342b = str;
        this.f28343c = bVar;
        this.f28344d = c3621o0;
        this.f28345e = c3518i6;
        this.f28346f = interfaceC3774x0;
        this.f28347g = l10;
        this.f28348h = interfaceC3710t4;
        this.f28349i = kotlin.b.a(new d());
        UUID uuidA = c3815z7.a();
        this.f28351k = uuidA;
        this.f28352l = new C3553k6(this, null, 2, 0 == true ? 1 : 0);
        c3621o0.e().a(new C3602n(com.unity3d.mediation.a.a(adFormat), uuidA, str));
        p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C3415cb c3415cb) {
        ck.p.j(c3415cb, "this$0");
        c3415cb.f28344d.e().f().a();
        c3415cb.f28352l.loadAd();
    }

    private final void p() {
        Double bidFloor = this.f28343c.getBidFloor();
        if (bidFloor != null) {
            this.f28344d.e().f().a(bidFloor.doubleValue());
        }
    }

    public final C3500h6 c() {
        return (C3500h6) this.f28349i.getValue();
    }

    public final LevelPlay.AdFormat d() {
        return this.f28341a;
    }

    public final UUID e() {
        return this.f28351k;
    }

    public final C3621o0 f() {
        return this.f28344d;
    }

    public final InterfaceC3774x0 g() {
        return this.f28346f;
    }

    public final String h() {
        return this.f28342b;
    }

    public final b i() {
        return this.f28343c;
    }

    public final InterfaceC3710t4 j() {
        return this.f28348h;
    }

    public final InterfaceC3433db k() {
        return this.f28350j;
    }

    public final L7 l() {
        return this.f28347g;
    }

    public final boolean m() {
        InterfaceC3529j0 interfaceC3529j0C = this.f28352l.c();
        this.f28344d.e().e().a(Boolean.valueOf(interfaceC3529j0C.a()), interfaceC3529j0C instanceof InterfaceC3529j0.a ? ((InterfaceC3529j0.a) interfaceC3529j0C).c() : null);
        return interfaceC3529j0C.a();
    }

    public final void n() {
        this.f28353m = new C3570l5();
        this.f28344d.d(new Runnable() { // from class: com.ironsource.qk
            @Override // java.lang.Runnable
            public final void run() {
                C3415cb.b(this.f30570b);
            }
        });
    }

    public final void o() {
        a(new C3645p6(this, this.f28348h));
        c().m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C3415cb c3415cb, LevelPlayAdError levelPlayAdError) {
        ck.p.j(c3415cb, "this$0");
        ck.p.j(levelPlayAdError, "$error");
        c3415cb.f28352l.onAdLoadFailed(levelPlayAdError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C3415cb c3415cb, LevelPlayAdInfo levelPlayAdInfo) {
        ck.p.j(c3415cb, "this$0");
        ck.p.j(levelPlayAdInfo, "$adInfo");
        c3415cb.f28352l.onAdLoaded(levelPlayAdInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(C3415cb c3415cb) {
        ck.p.j(c3415cb, "this$0");
        c3415cb.f28352l.a();
    }

    public final void a(InterfaceC3433db interfaceC3433db) {
        this.f28350j = interfaceC3433db;
    }

    @Override // com.ironsource.InterfaceC3535j6
    public void onAdClicked() {
        this.f28344d.d(new Runnable() { // from class: com.ironsource.kk
            @Override // java.lang.Runnable
            public final void run() {
                C3415cb.c(this.f29383b);
            }
        });
    }

    @Override // com.ironsource.InterfaceC3535j6
    public void onAdClosed() {
        this.f28344d.d(new Runnable() { // from class: com.ironsource.ik
            @Override // java.lang.Runnable
            public final void run() {
                C3415cb.d(this.f29172b);
            }
        });
    }

    @Override // com.ironsource.InterfaceC3535j6
    public void onAdDisplayed(final LevelPlayAdInfo levelPlayAdInfo) {
        ck.p.j(levelPlayAdInfo, "adInfo");
        this.f28344d.d(new Runnable() { // from class: com.ironsource.pk
            @Override // java.lang.Runnable
            public final void run() {
                C3415cb.b(this.f30468b, levelPlayAdInfo);
            }
        });
    }

    @Override // com.ironsource.InterfaceC3535j6
    public void onAdInfoChanged(final LevelPlayAdInfo levelPlayAdInfo) {
        ck.p.j(levelPlayAdInfo, "adInfo");
        this.f28344d.d(new Runnable() { // from class: com.ironsource.ek
            @Override // java.lang.Runnable
            public final void run() {
                C3415cb.c(this.f28802b, levelPlayAdInfo);
            }
        });
    }

    @Override // com.ironsource.InterfaceC3535j6
    public void onAdLoadFailed(final LevelPlayAdError levelPlayAdError) {
        ck.p.j(levelPlayAdError, "error");
        this.f28344d.d(new Runnable() { // from class: com.ironsource.bk
            @Override // java.lang.Runnable
            public final void run() {
                C3415cb.c(this.f28277b, levelPlayAdError);
            }
        });
    }

    @Override // com.ironsource.InterfaceC3535j6
    public void onAdLoaded(final LevelPlayAdInfo levelPlayAdInfo) {
        ck.p.j(levelPlayAdInfo, "adInfo");
        this.f28344d.d(new Runnable() { // from class: com.ironsource.hk
            @Override // java.lang.Runnable
            public final void run() {
                C3415cb.d(this.f29104b, levelPlayAdInfo);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C3415cb c3415cb, LevelPlayAdInfo levelPlayAdInfo) {
        ck.p.j(c3415cb, "this$0");
        ck.p.j(levelPlayAdInfo, "$adInfo");
        c3415cb.f28352l.onAdDisplayed(levelPlayAdInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C3415cb c3415cb) {
        ck.p.j(c3415cb, "this$0");
        c3415cb.f28352l.onAdClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C3415cb c3415cb) {
        ck.p.j(c3415cb, "this$0");
        c3415cb.f28352l.onAdClosed();
    }

    public final void a(InterfaceC3695s6 interfaceC3695s6) {
        ck.p.j(interfaceC3695s6, "state");
        this.f28352l = interfaceC3695s6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C3415cb c3415cb, LevelPlayAdError levelPlayAdError) {
        ck.p.j(c3415cb, "this$0");
        ck.p.j(levelPlayAdError, "$error");
        c3415cb.f28352l.a(levelPlayAdError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C3415cb c3415cb, LevelPlayAdInfo levelPlayAdInfo) {
        ck.p.j(c3415cb, "this$0");
        ck.p.j(levelPlayAdInfo, "$adInfo");
        c3415cb.f28352l.onAdInfoChanged(levelPlayAdInfo);
    }

    public final void a(final Activity activity, final String str) {
        ck.p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        this.f28344d.d(new Runnable() { // from class: com.ironsource.dk
            @Override // java.lang.Runnable
            public final void run() {
                C3415cb.a(activity, this, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Activity activity, C3415cb c3415cb, String str) {
        ck.p.j(activity, "$activity");
        ck.p.j(c3415cb, "this$0");
        ContextProvider.getInstance().updateActivity(activity);
        c3415cb.f28344d.e().h().d();
        c3415cb.f28352l.a(activity, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C3500h6 b() {
        C3476g0 c3476g0 = new C3476g0(com.unity3d.mediation.a.a(this.f28341a), this.f28351k, this.f28342b, null, this.f28347g.A().a(), this.f28343c.getBidFloor(), 8, null);
        e eVar = new e(c3476g0);
        E5 e5E = this.f28344d.e();
        C3621o0 c3621o0 = this.f28344d;
        e5E.a(new C0(c3621o0, c3476g0, c3621o0.b(this.f28341a, this.f28342b).b().b()));
        return this.f28345e.a(this, this.f28344d, c3476g0, eVar);
    }

    public final void a(C3553k6.a aVar) {
        ck.p.j(aVar, "status");
        this.f28352l = new C3553k6(this, aVar);
    }

    @Override // com.ironsource.InterfaceC3535j6
    public void a(final LevelPlayAdError levelPlayAdError) {
        ck.p.j(levelPlayAdError, "error");
        this.f28344d.d(new Runnable() { // from class: com.ironsource.fk
            @Override // java.lang.Runnable
            public final void run() {
                C3415cb.b(this.f28950b, levelPlayAdError);
            }
        });
    }

    @Override // com.ironsource.InterfaceC3535j6
    public void a() {
        this.f28344d.d(new Runnable() { // from class: com.ironsource.gk
            @Override // java.lang.Runnable
            public final void run() {
                C3415cb.e(this.f29029b);
            }
        });
    }

    @Override // com.ironsource.InterfaceC3535j6
    public void a(final LevelPlayReward levelPlayReward) {
        ck.p.j(levelPlayReward, "reward");
        IronLog.INTERNAL.verbose(C3621o0.a(this.f28344d, "onAdRewarded adInfo: " + this.f28352l.b() + " reward: " + levelPlayReward, (String) null, 2, (Object) null));
        this.f28344d.e(new Runnable() { // from class: com.ironsource.jk
            @Override // java.lang.Runnable
            public final void run() {
                C3415cb.a(this.f29298b, levelPlayReward);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3415cb c3415cb, LevelPlayReward levelPlayReward) {
        ck.p.j(c3415cb, "this$0");
        ck.p.j(levelPlayReward, "$reward");
        InterfaceC3433db interfaceC3433db = c3415cb.f28350j;
        if (interfaceC3433db != null) {
            interfaceC3433db.onAdRewarded(levelPlayReward, c3415cb.f28352l.b());
        }
    }

    public final void a(final LevelPlayAdInfo levelPlayAdInfo) {
        ck.p.j(levelPlayAdInfo, "adInfo");
        IronLog.INTERNAL.verbose(C3621o0.a(this.f28344d, "onAdLoaded adInfo: " + levelPlayAdInfo, (String) null, 2, (Object) null));
        final long jA = C3570l5.a(this.f28353m);
        this.f28344d.d(new Runnable() { // from class: com.ironsource.rk
            @Override // java.lang.Runnable
            public final void run() {
                C3415cb.a(this.f30636b, jA);
            }
        });
        this.f28344d.e(new Runnable() { // from class: com.ironsource.ck
            @Override // java.lang.Runnable
            public final void run() {
                C3415cb.a(this.f28368b, levelPlayAdInfo);
            }
        });
    }

    public /* synthetic */ C3415cb(LevelPlay.AdFormat adFormat, String str, b bVar, C3621o0 c3621o0, C3518i6 c3518i6, InterfaceC3774x0 interfaceC3774x0, L7 l10, InterfaceC3710t4 interfaceC3710t4, C3815z7 c3815z7, int i10, ck.i iVar) {
        this(adFormat, str, bVar, c3621o0, c3518i6, interfaceC3774x0, (i10 & 64) != 0 ? Lb.f26968s.d() : l10, interfaceC3710t4, c3815z7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3415cb c3415cb, long j10) {
        ck.p.j(c3415cb, "this$0");
        c3415cb.f28344d.e().f().a(j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3415cb c3415cb, LevelPlayAdInfo levelPlayAdInfo) {
        ck.p.j(c3415cb, "this$0");
        ck.p.j(levelPlayAdInfo, "$adInfo");
        InterfaceC3433db interfaceC3433db = c3415cb.f28350j;
        if (interfaceC3433db != null) {
            interfaceC3433db.onAdLoaded(levelPlayAdInfo);
        }
    }

    public static /* synthetic */ void a(C3415cb c3415cb, LevelPlayAdError levelPlayAdError, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        c3415cb.a(levelPlayAdError, j10);
    }

    public final void a(final LevelPlayAdError levelPlayAdError, final long j10) {
        IronLog.INTERNAL.verbose(C3621o0.a(this.f28344d, "onAdLoadFailed error: " + levelPlayAdError, (String) null, 2, (Object) null));
        this.f28344d.d(new Runnable() { // from class: com.ironsource.nk
            @Override // java.lang.Runnable
            public final void run() {
                C3415cb.a(this.f30322b, j10, levelPlayAdError);
            }
        });
        this.f28344d.e(new Runnable() { // from class: com.ironsource.ok
            @Override // java.lang.Runnable
            public final void run() {
                C3415cb.a(levelPlayAdError, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3415cb c3415cb, long j10, LevelPlayAdError levelPlayAdError) {
        String errorMessage;
        ck.p.j(c3415cb, "this$0");
        Tc tcF = c3415cb.f28344d.e().f();
        int errorCode = levelPlayAdError != null ? levelPlayAdError.getErrorCode() : 0;
        if (levelPlayAdError == null || (errorMessage = levelPlayAdError.getErrorMessage()) == null) {
            errorMessage = "";
        }
        tcF.a(j10, errorCode, errorMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayAdError levelPlayAdError, C3415cb c3415cb) {
        InterfaceC3433db interfaceC3433db;
        ck.p.j(c3415cb, "this$0");
        if (levelPlayAdError == null || (interfaceC3433db = c3415cb.f28350j) == null) {
            return;
        }
        interfaceC3433db.onAdLoadFailed(levelPlayAdError);
    }

    public final void a(final LevelPlayAdError levelPlayAdError, final LevelPlayAdInfo levelPlayAdInfo) {
        ck.p.j(levelPlayAdError, "error");
        ck.p.j(levelPlayAdInfo, "adInfo");
        IronLog.INTERNAL.verbose(C3621o0.a(this.f28344d, "onAdDisplayFailed error: " + levelPlayAdError + ", adInfo: " + levelPlayAdInfo, (String) null, 2, (Object) null));
        this.f28344d.d(new Runnable() { // from class: com.ironsource.lk
            @Override // java.lang.Runnable
            public final void run() {
                C3415cb.a(this.f29442b, levelPlayAdError);
            }
        });
        this.f28344d.e(new Runnable() { // from class: com.ironsource.mk
            @Override // java.lang.Runnable
            public final void run() {
                C3415cb.a(this.f30193b, levelPlayAdError, levelPlayAdInfo);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3415cb c3415cb, LevelPlayAdError levelPlayAdError) {
        ck.p.j(c3415cb, "this$0");
        ck.p.j(levelPlayAdError, "$error");
        c3415cb.f28344d.e().h().a(levelPlayAdError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3415cb c3415cb, LevelPlayAdError levelPlayAdError, LevelPlayAdInfo levelPlayAdInfo) {
        ck.p.j(c3415cb, "this$0");
        ck.p.j(levelPlayAdError, "$error");
        ck.p.j(levelPlayAdInfo, "$adInfo");
        InterfaceC3433db interfaceC3433db = c3415cb.f28350j;
        if (interfaceC3433db != null) {
            interfaceC3433db.onAdDisplayFailed(levelPlayAdError, levelPlayAdInfo);
        }
    }

    public final void a(String str) {
        ck.p.j(str, "message");
        this.f28344d.e().h().f("Fullscreen Ad Internal - " + str);
    }
}
