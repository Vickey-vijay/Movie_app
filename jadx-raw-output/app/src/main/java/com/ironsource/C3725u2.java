package com.ironsource;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: renamed from: com.ironsource.u2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C3725u2 extends C3709t3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final C3725u2 f31364d = new C3725u2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Ga f31365b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Ga f31366c = null;

    /* JADX INFO: renamed from: com.ironsource.u2$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AdInfo f31367a;

        public a(AdInfo adInfo) {
            this.f31367a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3725u2 c3725u2 = C3725u2.this;
            Ga ga2 = c3725u2.f31365b;
            if (ga2 != null) {
                ga2.g(c3725u2.a(this.f31367a));
                IronLog.CALLBACK.info("onAdLeftApplication() adInfo = " + C3725u2.this.a(this.f31367a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.u2$b */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AdInfo f31369a;

        public b(AdInfo adInfo) {
            this.f31369a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3725u2 c3725u2 = C3725u2.this;
            Ga ga2 = c3725u2.f31366c;
            if (ga2 != null) {
                ga2.d(c3725u2.a(this.f31369a));
                IronLog.CALLBACK.info("onAdClicked() adInfo = " + C3725u2.this.a(this.f31369a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.u2$c */
    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AdInfo f31371a;

        public c(AdInfo adInfo) {
            this.f31371a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3725u2 c3725u2 = C3725u2.this;
            Ga ga2 = c3725u2.f31365b;
            if (ga2 != null) {
                ga2.d(c3725u2.a(this.f31371a));
                IronLog.CALLBACK.info("onAdClicked() adInfo = " + C3725u2.this.a(this.f31371a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.u2$d */
    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AdInfo f31373a;

        public d(AdInfo adInfo) {
            this.f31373a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3725u2 c3725u2 = C3725u2.this;
            Ga ga2 = c3725u2.f31366c;
            if (ga2 != null) {
                ga2.e(c3725u2.a(this.f31373a));
                IronLog.CALLBACK.info("onAdLoaded() adInfo = " + C3725u2.this.a(this.f31373a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.u2$e */
    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AdInfo f31375a;

        public e(AdInfo adInfo) {
            this.f31375a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3725u2 c3725u2 = C3725u2.this;
            Ga ga2 = c3725u2.f31365b;
            if (ga2 != null) {
                ga2.e(c3725u2.a(this.f31375a));
                IronLog.CALLBACK.info("onAdLoaded() adInfo = " + C3725u2.this.a(this.f31375a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.u2$f */
    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ IronSourceError f31377a;

        public f(IronSourceError ironSourceError) {
            this.f31377a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            Ga ga2 = C3725u2.this.f31366c;
            if (ga2 != null) {
                ga2.b(this.f31377a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.f31377a.getErrorMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.u2$g */
    public class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ IronSourceError f31379a;

        public g(IronSourceError ironSourceError) {
            this.f31379a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            Ga ga2 = C3725u2.this.f31365b;
            if (ga2 != null) {
                ga2.b(this.f31379a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.f31379a.getErrorMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.u2$h */
    public class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AdInfo f31381a;

        public h(AdInfo adInfo) {
            this.f31381a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3725u2 c3725u2 = C3725u2.this;
            Ga ga2 = c3725u2.f31366c;
            if (ga2 != null) {
                ga2.h(c3725u2.a(this.f31381a));
                IronLog.CALLBACK.info("onAdScreenPresented() adInfo = " + C3725u2.this.a(this.f31381a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.u2$i */
    public class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AdInfo f31383a;

        public i(AdInfo adInfo) {
            this.f31383a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3725u2 c3725u2 = C3725u2.this;
            Ga ga2 = c3725u2.f31365b;
            if (ga2 != null) {
                ga2.h(c3725u2.a(this.f31383a));
                IronLog.CALLBACK.info("onAdScreenPresented() adInfo = " + C3725u2.this.a(this.f31383a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.u2$j */
    public class j implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AdInfo f31385a;

        public j(AdInfo adInfo) {
            this.f31385a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3725u2 c3725u2 = C3725u2.this;
            Ga ga2 = c3725u2.f31366c;
            if (ga2 != null) {
                ga2.f(c3725u2.a(this.f31385a));
                IronLog.CALLBACK.info("onAdScreenDismissed() adInfo = " + C3725u2.this.a(this.f31385a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.u2$k */
    public class k implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AdInfo f31387a;

        public k(AdInfo adInfo) {
            this.f31387a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3725u2 c3725u2 = C3725u2.this;
            Ga ga2 = c3725u2.f31365b;
            if (ga2 != null) {
                ga2.f(c3725u2.a(this.f31387a));
                IronLog.CALLBACK.info("onAdScreenDismissed() adInfo = " + C3725u2.this.a(this.f31387a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.u2$l */
    public class l implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AdInfo f31389a;

        public l(AdInfo adInfo) {
            this.f31389a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3725u2 c3725u2 = C3725u2.this;
            Ga ga2 = c3725u2.f31366c;
            if (ga2 != null) {
                ga2.g(c3725u2.a(this.f31389a));
                IronLog.CALLBACK.info("onAdLeftApplication() adInfo = " + C3725u2.this.a(this.f31389a));
            }
        }
    }

    public static C3725u2 a() {
        return f31364d;
    }

    public void b(Ga ga2) {
        this.f31366c = ga2;
    }

    public void c(AdInfo adInfo) {
        if (this.f31366c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new l(adInfo));
        } else if (this.f31365b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new a(adInfo));
        }
    }

    public void d(AdInfo adInfo) {
        if (this.f31366c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new d(adInfo));
        } else if (this.f31365b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new e(adInfo));
        }
    }

    public void e(AdInfo adInfo) {
        if (this.f31366c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new j(adInfo));
        } else if (this.f31365b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new k(adInfo));
        }
    }

    public void f(AdInfo adInfo) {
        if (this.f31366c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new h(adInfo));
        } else if (this.f31365b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new i(adInfo));
        }
    }

    private C3725u2() {
    }

    public void a(Ga ga2) {
        this.f31365b = ga2;
    }

    public Ga b() {
        return this.f31365b;
    }

    public void a(IronSourceError ironSourceError) {
        if (this.f31366c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new f(ironSourceError));
        } else if (this.f31365b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new g(ironSourceError));
        }
    }

    public void b(AdInfo adInfo) {
        if (this.f31366c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new b(adInfo));
        } else if (this.f31365b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new c(adInfo));
        }
    }
}
