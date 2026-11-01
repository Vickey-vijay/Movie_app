package com.ironsource;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;

/* JADX INFO: loaded from: classes7.dex */
public class Dd extends C3709t3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Dd f26338d = new Dd();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InterfaceC3700sb f26339b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC3700sb f26340c = null;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f26341a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AdInfo f26342b;

        public a(boolean z10, AdInfo adInfo) {
            this.f26341a = z10;
            this.f26342b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Dd dd2 = Dd.this;
            InterfaceC3700sb interfaceC3700sb = dd2.f26339b;
            if (interfaceC3700sb != null) {
                if (!this.f26341a) {
                    ((InterfaceC3717tb) interfaceC3700sb).a();
                    IronLog.CALLBACK.info("onAdUnavailable()");
                    return;
                }
                ((InterfaceC3717tb) interfaceC3700sb).d(dd2.a(this.f26342b));
                IronLog.CALLBACK.info("onAdAvailable() adInfo = " + Dd.this.a(this.f26342b));
            }
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C3489gd f26344a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AdInfo f26345b;

        public b(C3489gd c3489gd, AdInfo adInfo) {
            this.f26344a = c3489gd;
            this.f26345b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Dd dd2 = Dd.this;
            InterfaceC3700sb interfaceC3700sb = dd2.f26340c;
            if (interfaceC3700sb != null) {
                interfaceC3700sb.b(this.f26344a, dd2.a(this.f26345b));
                IronLog.CALLBACK.info("onAdRewarded() placement = " + this.f26344a + ", adInfo = " + Dd.this.a(this.f26345b));
            }
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C3489gd f26347a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AdInfo f26348b;

        public c(C3489gd c3489gd, AdInfo adInfo) {
            this.f26347a = c3489gd;
            this.f26348b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Dd dd2 = Dd.this;
            InterfaceC3700sb interfaceC3700sb = dd2.f26339b;
            if (interfaceC3700sb != null) {
                interfaceC3700sb.b(this.f26347a, dd2.a(this.f26348b));
                IronLog.CALLBACK.info("onAdRewarded() placement = " + this.f26347a + ", adInfo = " + Dd.this.a(this.f26348b));
            }
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ IronSourceError f26350a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AdInfo f26351b;

        public d(IronSourceError ironSourceError, AdInfo adInfo) {
            this.f26350a = ironSourceError;
            this.f26351b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Dd dd2 = Dd.this;
            InterfaceC3700sb interfaceC3700sb = dd2.f26340c;
            if (interfaceC3700sb != null) {
                interfaceC3700sb.a(this.f26350a, dd2.a(this.f26351b));
                IronLog.CALLBACK.info("onAdShowFailed() adInfo = " + Dd.this.a(this.f26351b) + ", error = " + this.f26350a.getErrorMessage());
            }
        }
    }

    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ IronSourceError f26353a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AdInfo f26354b;

        public e(IronSourceError ironSourceError, AdInfo adInfo) {
            this.f26353a = ironSourceError;
            this.f26354b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Dd dd2 = Dd.this;
            InterfaceC3700sb interfaceC3700sb = dd2.f26339b;
            if (interfaceC3700sb != null) {
                interfaceC3700sb.a(this.f26353a, dd2.a(this.f26354b));
                IronLog.CALLBACK.info("onAdShowFailed() adInfo = " + Dd.this.a(this.f26354b) + ", error = " + this.f26353a.getErrorMessage());
            }
        }
    }

    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C3489gd f26356a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AdInfo f26357b;

        public f(C3489gd c3489gd, AdInfo adInfo) {
            this.f26356a = c3489gd;
            this.f26357b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Dd dd2 = Dd.this;
            InterfaceC3700sb interfaceC3700sb = dd2.f26340c;
            if (interfaceC3700sb != null) {
                interfaceC3700sb.a(this.f26356a, dd2.a(this.f26357b));
                IronLog.CALLBACK.info("onAdClicked() placement = " + this.f26356a + ", adInfo = " + Dd.this.a(this.f26357b));
            }
        }
    }

    public class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C3489gd f26359a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AdInfo f26360b;

        public g(C3489gd c3489gd, AdInfo adInfo) {
            this.f26359a = c3489gd;
            this.f26360b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Dd dd2 = Dd.this;
            InterfaceC3700sb interfaceC3700sb = dd2.f26339b;
            if (interfaceC3700sb != null) {
                interfaceC3700sb.a(this.f26359a, dd2.a(this.f26360b));
                IronLog.CALLBACK.info("onAdClicked() placement = " + this.f26359a + ", adInfo = " + Dd.this.a(this.f26360b));
            }
        }
    }

    public class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AdInfo f26362a;

        public h(AdInfo adInfo) {
            this.f26362a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Dd dd2 = Dd.this;
            InterfaceC3700sb interfaceC3700sb = dd2.f26340c;
            if (interfaceC3700sb != null) {
                ((InterfaceC3734ub) interfaceC3700sb).a(dd2.a(this.f26362a));
                IronLog.CALLBACK.info("onAdReady() adInfo = " + Dd.this.a(this.f26362a));
            }
        }
    }

    public class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AdInfo f26364a;

        public i(AdInfo adInfo) {
            this.f26364a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Dd dd2 = Dd.this;
            InterfaceC3700sb interfaceC3700sb = dd2.f26339b;
            if (interfaceC3700sb != null) {
                ((InterfaceC3734ub) interfaceC3700sb).a(dd2.a(this.f26364a));
                IronLog.CALLBACK.info("onAdReady() adInfo = " + Dd.this.a(this.f26364a));
            }
        }
    }

    public class j implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ IronSourceError f26366a;

        public j(IronSourceError ironSourceError) {
            this.f26366a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC3700sb interfaceC3700sb = Dd.this.f26340c;
            if (interfaceC3700sb != null) {
                ((InterfaceC3734ub) interfaceC3700sb).b(this.f26366a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.f26366a.getErrorMessage());
            }
        }
    }

    public class k implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ IronSourceError f26368a;

        public k(IronSourceError ironSourceError) {
            this.f26368a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC3700sb interfaceC3700sb = Dd.this.f26339b;
            if (interfaceC3700sb != null) {
                ((InterfaceC3734ub) interfaceC3700sb).b(this.f26368a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.f26368a.getErrorMessage());
            }
        }
    }

    public class l implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AdInfo f26370a;

        public l(AdInfo adInfo) {
            this.f26370a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Dd dd2 = Dd.this;
            InterfaceC3700sb interfaceC3700sb = dd2.f26340c;
            if (interfaceC3700sb != null) {
                interfaceC3700sb.c(dd2.a(this.f26370a));
                IronLog.CALLBACK.info("onAdOpened() adInfo = " + Dd.this.a(this.f26370a));
            }
        }
    }

    public class m implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AdInfo f26372a;

        public m(AdInfo adInfo) {
            this.f26372a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Dd dd2 = Dd.this;
            InterfaceC3700sb interfaceC3700sb = dd2.f26339b;
            if (interfaceC3700sb != null) {
                interfaceC3700sb.c(dd2.a(this.f26372a));
                IronLog.CALLBACK.info("onAdOpened() adInfo = " + Dd.this.a(this.f26372a));
            }
        }
    }

    public class n implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AdInfo f26374a;

        public n(AdInfo adInfo) {
            this.f26374a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Dd dd2 = Dd.this;
            InterfaceC3700sb interfaceC3700sb = dd2.f26340c;
            if (interfaceC3700sb != null) {
                interfaceC3700sb.b(dd2.a(this.f26374a));
                IronLog.CALLBACK.info("onAdClosed() adInfo = " + Dd.this.a(this.f26374a));
            }
        }
    }

    public class o implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AdInfo f26376a;

        public o(AdInfo adInfo) {
            this.f26376a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Dd dd2 = Dd.this;
            InterfaceC3700sb interfaceC3700sb = dd2.f26339b;
            if (interfaceC3700sb != null) {
                interfaceC3700sb.b(dd2.a(this.f26376a));
                IronLog.CALLBACK.info("onAdClosed() adInfo = " + Dd.this.a(this.f26376a));
            }
        }
    }

    public class p implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f26378a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AdInfo f26379b;

        public p(boolean z10, AdInfo adInfo) {
            this.f26378a = z10;
            this.f26379b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Dd dd2 = Dd.this;
            InterfaceC3700sb interfaceC3700sb = dd2.f26340c;
            if (interfaceC3700sb != null) {
                if (!this.f26378a) {
                    ((InterfaceC3717tb) interfaceC3700sb).a();
                    IronLog.CALLBACK.info("onAdUnavailable()");
                    return;
                }
                ((InterfaceC3717tb) interfaceC3700sb).d(dd2.a(this.f26379b));
                IronLog.CALLBACK.info("onAdAvailable() adInfo = " + Dd.this.a(this.f26379b));
            }
        }
    }

    public void b() {
    }

    public void c() {
    }

    public static Dd a() {
        return f26338d;
    }

    public void b(InterfaceC3700sb interfaceC3700sb) {
        this.f26340c = interfaceC3700sb;
    }

    public void c(AdInfo adInfo) {
        if (this.f26340c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new l(adInfo));
        } else if (this.f26339b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new m(adInfo));
        }
    }

    public void d(AdInfo adInfo) {
        if (this.f26340c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new h(adInfo));
            return;
        }
        InterfaceC3700sb interfaceC3700sb = this.f26339b;
        if (interfaceC3700sb == null || !(interfaceC3700sb instanceof InterfaceC3734ub)) {
            return;
        }
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new i(adInfo));
    }

    private Dd() {
    }

    public void a(InterfaceC3700sb interfaceC3700sb) {
        this.f26339b = interfaceC3700sb;
    }

    public void b(AdInfo adInfo) {
        if (this.f26340c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new n(adInfo));
        } else if (this.f26339b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new o(adInfo));
        }
    }

    public void a(IronSourceError ironSourceError) {
        if (this.f26340c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new j(ironSourceError));
            return;
        }
        InterfaceC3700sb interfaceC3700sb = this.f26339b;
        if (interfaceC3700sb == null || !(interfaceC3700sb instanceof InterfaceC3734ub)) {
            return;
        }
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new k(ironSourceError));
    }

    public void b(C3489gd c3489gd, AdInfo adInfo) {
        if (this.f26340c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new b(c3489gd, adInfo));
        } else if (this.f26339b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new c(c3489gd, adInfo));
        }
    }

    public void a(boolean z10, AdInfo adInfo) {
        if (this.f26340c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new p(z10, adInfo));
            return;
        }
        InterfaceC3700sb interfaceC3700sb = this.f26339b;
        if (interfaceC3700sb == null || !(interfaceC3700sb instanceof InterfaceC3717tb)) {
            return;
        }
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new a(z10, adInfo));
    }

    public void a(IronSourceError ironSourceError, AdInfo adInfo) {
        if (this.f26340c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new d(ironSourceError, adInfo));
        } else if (this.f26339b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new e(ironSourceError, adInfo));
        }
    }

    public void a(C3489gd c3489gd, AdInfo adInfo) {
        if (this.f26340c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new f(c3489gd, adInfo));
        } else if (this.f26339b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new g(c3489gd, adInfo));
        }
    }

    private void a(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, str, 1);
    }
}
