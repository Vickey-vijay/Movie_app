package com.ironsource;

import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerListener;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: renamed from: com.ironsource.t2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C3708t2 extends InterfaceC3412c8.a<ISDemandOnlyBannerListener> {

    /* JADX INFO: renamed from: com.ironsource.t2$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f31247a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ IronSourceError f31248b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ISDemandOnlyBannerListener f31249c;

        public a(String str, IronSourceError ironSourceError, ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
            this.f31247a = str;
            this.f31248b = ironSourceError;
            this.f31249c = iSDemandOnlyBannerListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3708t2.this.a(this.f31247a, "onBannerAdLoadFailed() error = " + this.f31248b.getErrorMessage());
            this.f31249c.onBannerAdLoadFailed(this.f31247a, this.f31248b);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.t2$b */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f31251a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ISDemandOnlyBannerListener f31252b;

        public b(String str, ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
            this.f31251a = str;
            this.f31252b = iSDemandOnlyBannerListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3708t2.this.a(this.f31251a, "onBannerAdLoaded()");
            this.f31252b.onBannerAdLoaded(this.f31251a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.t2$c */
    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f31254a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ISDemandOnlyBannerListener f31255b;

        public c(String str, ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
            this.f31254a = str;
            this.f31255b = iSDemandOnlyBannerListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3708t2.this.a(this.f31254a, "onBannerAdShown()");
            this.f31255b.onBannerAdShown(this.f31254a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.t2$d */
    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f31257a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ISDemandOnlyBannerListener f31258b;

        public d(String str, ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
            this.f31257a = str;
            this.f31258b = iSDemandOnlyBannerListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3708t2.this.a(this.f31257a, "onBannerAdClicked()");
            this.f31258b.onBannerAdClicked(this.f31257a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.t2$e */
    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f31260a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ISDemandOnlyBannerListener f31261b;

        public e(String str, ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
            this.f31260a = str;
            this.f31261b = iSDemandOnlyBannerListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3708t2.this.a(this.f31260a, "onBannerAdLeftApplication()");
            this.f31261b.onBannerAdLeftApplication(this.f31260a);
        }
    }

    public void a(String str, IronSourceError ironSourceError) {
        ISDemandOnlyBannerListener iSDemandOnlyBannerListenerA = a();
        a(new a(str, ironSourceError, iSDemandOnlyBannerListenerA), iSDemandOnlyBannerListenerA != null);
    }

    public void a(String str) {
        ISDemandOnlyBannerListener iSDemandOnlyBannerListenerA = a();
        a(new d(str, iSDemandOnlyBannerListenerA), iSDemandOnlyBannerListenerA != null);
    }

    public void b(String str) {
        boolean z10;
        ISDemandOnlyBannerListener iSDemandOnlyBannerListenerA = a();
        e eVar = new e(str, iSDemandOnlyBannerListenerA);
        if (iSDemandOnlyBannerListenerA != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        a(eVar, z10);
    }

    public void c(String str) {
        boolean z10;
        ISDemandOnlyBannerListener iSDemandOnlyBannerListenerA = a();
        b bVar = new b(str, iSDemandOnlyBannerListenerA);
        if (iSDemandOnlyBannerListenerA != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        a(bVar, z10);
    }

    public void d(String str) {
        boolean z10;
        ISDemandOnlyBannerListener iSDemandOnlyBannerListenerA = a();
        c cVar = new c(str, iSDemandOnlyBannerListenerA);
        if (iSDemandOnlyBannerListenerA != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        a(cVar, z10);
    }
}
