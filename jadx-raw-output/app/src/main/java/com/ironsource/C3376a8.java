package com.ironsource;

import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: renamed from: com.ironsource.a8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C3376a8 extends InterfaceC3412c8.a<ISDemandOnlyInterstitialListener> implements ISDemandOnlyInterstitialListener {

    /* JADX INFO: renamed from: com.ironsource.a8$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f28128a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ISDemandOnlyInterstitialListener f28129b;

        public a(String str, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.f28128a = str;
            this.f28129b = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3376a8.this.a(this.f28128a, "onInterstitialAdReady()");
            this.f28129b.onInterstitialAdReady(this.f28128a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.a8$b */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f28131a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ IronSourceError f28132b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ISDemandOnlyInterstitialListener f28133c;

        public b(String str, IronSourceError ironSourceError, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.f28131a = str;
            this.f28132b = ironSourceError;
            this.f28133c = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3376a8.this.a(this.f28131a, "onInterstitialAdLoadFailed() error = " + this.f28132b.getErrorMessage());
            this.f28133c.onInterstitialAdLoadFailed(this.f28131a, this.f28132b);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.a8$c */
    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f28135a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ISDemandOnlyInterstitialListener f28136b;

        public c(String str, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.f28135a = str;
            this.f28136b = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3376a8.this.a(this.f28135a, "onInterstitialAdOpened()");
            this.f28136b.onInterstitialAdOpened(this.f28135a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.a8$d */
    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f28138a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ IronSourceError f28139b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ISDemandOnlyInterstitialListener f28140c;

        public d(String str, IronSourceError ironSourceError, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.f28138a = str;
            this.f28139b = ironSourceError;
            this.f28140c = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3376a8.this.a(this.f28138a, "onInterstitialAdShowFailed() error = " + this.f28139b.getErrorMessage());
            this.f28140c.onInterstitialAdShowFailed(this.f28138a, this.f28139b);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.a8$e */
    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f28142a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ISDemandOnlyInterstitialListener f28143b;

        public e(String str, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.f28142a = str;
            this.f28143b = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3376a8.this.a(this.f28142a, "onInterstitialAdClicked()");
            this.f28143b.onInterstitialAdClicked(this.f28142a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.a8$f */
    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f28145a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ISDemandOnlyInterstitialListener f28146b;

        public f(String str, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.f28145a = str;
            this.f28146b = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3376a8.this.a(this.f28145a, "onInterstitialAdClosed()");
            this.f28146b.onInterstitialAdClosed(this.f28145a);
        }
    }

    public C3376a8(ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
        b(iSDemandOnlyInterstitialListener);
    }

    public C3376a8() {
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdClicked(String str) {
        boolean z10;
        ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListenerA = a();
        e eVar = new e(str, iSDemandOnlyInterstitialListenerA);
        if (iSDemandOnlyInterstitialListenerA != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        a(eVar, z10);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdClosed(String str) {
        boolean z10;
        ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListenerA = a();
        f fVar = new f(str, iSDemandOnlyInterstitialListenerA);
        if (iSDemandOnlyInterstitialListenerA != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        a(fVar, z10);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdLoadFailed(String str, IronSourceError ironSourceError) {
        boolean z10;
        ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListenerA = a();
        b bVar = new b(str, ironSourceError, iSDemandOnlyInterstitialListenerA);
        if (iSDemandOnlyInterstitialListenerA != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        a(bVar, z10);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdOpened(String str) {
        boolean z10;
        ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListenerA = a();
        c cVar = new c(str, iSDemandOnlyInterstitialListenerA);
        if (iSDemandOnlyInterstitialListenerA != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        a(cVar, z10);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdReady(String str) {
        boolean z10;
        ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListenerA = a();
        a aVar = new a(str, iSDemandOnlyInterstitialListenerA);
        if (iSDemandOnlyInterstitialListenerA != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        a(aVar, z10);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdShowFailed(String str, IronSourceError ironSourceError) {
        boolean z10;
        ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListenerA = a();
        d dVar = new d(str, ironSourceError, iSDemandOnlyInterstitialListenerA);
        if (iSDemandOnlyInterstitialListenerA != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        a(dVar, z10);
    }
}
