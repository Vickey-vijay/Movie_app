package com.ironsource;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;

/* JADX INFO: renamed from: com.ironsource.h8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C3502h8 extends C3709t3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final C3502h8 f29045d = new C3502h8();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InterfaceC3505hb f29046b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC3505hb f29047c = null;

    /* JADX INFO: renamed from: com.ironsource.h8$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AdInfo f29048a;

        public a(AdInfo adInfo) {
            this.f29048a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3502h8 c3502h8 = C3502h8.this;
            InterfaceC3505hb interfaceC3505hb = c3502h8.f29046b;
            if (interfaceC3505hb != null) {
                interfaceC3505hb.e(c3502h8.a(this.f29048a));
                IronLog.CALLBACK.info("onAdShowSucceeded() adInfo = " + C3502h8.this.a(this.f29048a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.h8$b */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ IronSourceError f29050a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AdInfo f29051b;

        public b(IronSourceError ironSourceError, AdInfo adInfo) {
            this.f29050a = ironSourceError;
            this.f29051b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3502h8 c3502h8 = C3502h8.this;
            InterfaceC3505hb interfaceC3505hb = c3502h8.f29047c;
            if (interfaceC3505hb != null) {
                interfaceC3505hb.a(this.f29050a, c3502h8.a(this.f29051b));
                IronLog.CALLBACK.info("onAdShowFailed() adInfo = " + C3502h8.this.a(this.f29051b) + ", error = " + this.f29050a.getErrorMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.h8$c */
    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ IronSourceError f29053a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AdInfo f29054b;

        public c(IronSourceError ironSourceError, AdInfo adInfo) {
            this.f29053a = ironSourceError;
            this.f29054b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3502h8 c3502h8 = C3502h8.this;
            InterfaceC3505hb interfaceC3505hb = c3502h8.f29046b;
            if (interfaceC3505hb != null) {
                interfaceC3505hb.a(this.f29053a, c3502h8.a(this.f29054b));
                IronLog.CALLBACK.info("onAdShowFailed() adInfo = " + C3502h8.this.a(this.f29054b) + ", error = " + this.f29053a.getErrorMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.h8$d */
    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AdInfo f29056a;

        public d(AdInfo adInfo) {
            this.f29056a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3502h8 c3502h8 = C3502h8.this;
            InterfaceC3505hb interfaceC3505hb = c3502h8.f29047c;
            if (interfaceC3505hb != null) {
                interfaceC3505hb.d(c3502h8.a(this.f29056a));
                IronLog.CALLBACK.info("onAdClicked() adInfo = " + C3502h8.this.a(this.f29056a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.h8$e */
    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AdInfo f29058a;

        public e(AdInfo adInfo) {
            this.f29058a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3502h8 c3502h8 = C3502h8.this;
            InterfaceC3505hb interfaceC3505hb = c3502h8.f29046b;
            if (interfaceC3505hb != null) {
                interfaceC3505hb.d(c3502h8.a(this.f29058a));
                IronLog.CALLBACK.info("onAdClicked() adInfo = " + C3502h8.this.a(this.f29058a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.h8$f */
    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AdInfo f29060a;

        public f(AdInfo adInfo) {
            this.f29060a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3502h8 c3502h8 = C3502h8.this;
            InterfaceC3505hb interfaceC3505hb = c3502h8.f29047c;
            if (interfaceC3505hb != null) {
                interfaceC3505hb.a(c3502h8.a(this.f29060a));
                IronLog.CALLBACK.info("onAdReady() adInfo = " + C3502h8.this.a(this.f29060a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.h8$g */
    public class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AdInfo f29062a;

        public g(AdInfo adInfo) {
            this.f29062a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3502h8 c3502h8 = C3502h8.this;
            InterfaceC3505hb interfaceC3505hb = c3502h8.f29046b;
            if (interfaceC3505hb != null) {
                interfaceC3505hb.a(c3502h8.a(this.f29062a));
                IronLog.CALLBACK.info("onAdReady() adInfo = " + C3502h8.this.a(this.f29062a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.h8$h */
    public class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ IronSourceError f29064a;

        public h(IronSourceError ironSourceError) {
            this.f29064a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC3505hb interfaceC3505hb = C3502h8.this.f29047c;
            if (interfaceC3505hb != null) {
                interfaceC3505hb.b(this.f29064a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.f29064a.getErrorMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.h8$i */
    public class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ IronSourceError f29066a;

        public i(IronSourceError ironSourceError) {
            this.f29066a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC3505hb interfaceC3505hb = C3502h8.this.f29046b;
            if (interfaceC3505hb != null) {
                interfaceC3505hb.b(this.f29066a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.f29066a.getErrorMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.h8$j */
    public class j implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AdInfo f29068a;

        public j(AdInfo adInfo) {
            this.f29068a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3502h8 c3502h8 = C3502h8.this;
            InterfaceC3505hb interfaceC3505hb = c3502h8.f29047c;
            if (interfaceC3505hb != null) {
                interfaceC3505hb.c(c3502h8.a(this.f29068a));
                IronLog.CALLBACK.info("onAdOpened() adInfo = " + C3502h8.this.a(this.f29068a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.h8$k */
    public class k implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AdInfo f29070a;

        public k(AdInfo adInfo) {
            this.f29070a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3502h8 c3502h8 = C3502h8.this;
            InterfaceC3505hb interfaceC3505hb = c3502h8.f29046b;
            if (interfaceC3505hb != null) {
                interfaceC3505hb.c(c3502h8.a(this.f29070a));
                IronLog.CALLBACK.info("onAdOpened() adInfo = " + C3502h8.this.a(this.f29070a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.h8$l */
    public class l implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AdInfo f29072a;

        public l(AdInfo adInfo) {
            this.f29072a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3502h8 c3502h8 = C3502h8.this;
            InterfaceC3505hb interfaceC3505hb = c3502h8.f29047c;
            if (interfaceC3505hb != null) {
                interfaceC3505hb.b(c3502h8.a(this.f29072a));
                IronLog.CALLBACK.info("onAdClosed() adInfo = " + C3502h8.this.a(this.f29072a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.h8$m */
    public class m implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AdInfo f29074a;

        public m(AdInfo adInfo) {
            this.f29074a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3502h8 c3502h8 = C3502h8.this;
            InterfaceC3505hb interfaceC3505hb = c3502h8.f29046b;
            if (interfaceC3505hb != null) {
                interfaceC3505hb.b(c3502h8.a(this.f29074a));
                IronLog.CALLBACK.info("onAdClosed() adInfo = " + C3502h8.this.a(this.f29074a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.h8$n */
    public class n implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AdInfo f29076a;

        public n(AdInfo adInfo) {
            this.f29076a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3502h8 c3502h8 = C3502h8.this;
            InterfaceC3505hb interfaceC3505hb = c3502h8.f29047c;
            if (interfaceC3505hb != null) {
                interfaceC3505hb.e(c3502h8.a(this.f29076a));
                IronLog.CALLBACK.info("onAdShowSucceeded() adInfo = " + C3502h8.this.a(this.f29076a));
            }
        }
    }

    public static synchronized C3502h8 a() {
        return f29045d;
    }

    public synchronized void b(InterfaceC3505hb interfaceC3505hb) {
        this.f29047c = interfaceC3505hb;
    }

    public void c(AdInfo adInfo) {
        if (this.f29047c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new l(adInfo));
        } else if (this.f29046b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new m(adInfo));
        }
    }

    public void d(AdInfo adInfo) {
        if (this.f29047c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new j(adInfo));
        } else if (this.f29046b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new k(adInfo));
        }
    }

    public void e(AdInfo adInfo) {
        if (this.f29047c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new f(adInfo));
        } else if (this.f29046b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new g(adInfo));
        }
    }

    public void f(AdInfo adInfo) {
        if (this.f29047c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new n(adInfo));
        } else if (this.f29046b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new a(adInfo));
        }
    }

    private C3502h8() {
    }

    public synchronized void a(InterfaceC3505hb interfaceC3505hb) {
        this.f29046b = interfaceC3505hb;
    }

    public void b(AdInfo adInfo) {
        if (this.f29047c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new d(adInfo));
        } else if (this.f29046b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new e(adInfo));
        }
    }

    public void a(IronSourceError ironSourceError) {
        if (this.f29047c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new h(ironSourceError));
        } else if (this.f29046b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new i(ironSourceError));
        }
    }

    public void a(IronSourceError ironSourceError, AdInfo adInfo) {
        if (this.f29047c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new b(ironSourceError, adInfo));
        } else if (this.f29046b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new c(ironSourceError, adInfo));
        }
    }

    private void a(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, str, 1);
    }
}
