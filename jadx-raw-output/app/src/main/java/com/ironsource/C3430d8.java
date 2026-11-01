package com.ironsource;

import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: renamed from: com.ironsource.d8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C3430d8 extends InterfaceC3412c8.a<ISDemandOnlyRewardedVideoListener> implements ISDemandOnlyRewardedVideoListener {

    /* JADX INFO: renamed from: com.ironsource.d8$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f28660a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ISDemandOnlyRewardedVideoListener f28661b;

        public a(String str, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            this.f28660a = str;
            this.f28661b = iSDemandOnlyRewardedVideoListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3430d8.this.a(this.f28660a, "onRewardedVideoAdLoadSuccess()");
            this.f28661b.onRewardedVideoAdLoadSuccess(this.f28660a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.d8$b */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f28663a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ IronSourceError f28664b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ISDemandOnlyRewardedVideoListener f28665c;

        public b(String str, IronSourceError ironSourceError, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            this.f28663a = str;
            this.f28664b = ironSourceError;
            this.f28665c = iSDemandOnlyRewardedVideoListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3430d8.this.a(this.f28663a, "onRewardedVideoAdLoadFailed() error = " + this.f28664b.getErrorMessage());
            this.f28665c.onRewardedVideoAdLoadFailed(this.f28663a, this.f28664b);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.d8$c */
    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f28667a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ISDemandOnlyRewardedVideoListener f28668b;

        public c(String str, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            this.f28667a = str;
            this.f28668b = iSDemandOnlyRewardedVideoListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3430d8.this.a(this.f28667a, "onRewardedVideoAdOpened()");
            this.f28668b.onRewardedVideoAdOpened(this.f28667a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.d8$d */
    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f28670a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ IronSourceError f28671b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ISDemandOnlyRewardedVideoListener f28672c;

        public d(String str, IronSourceError ironSourceError, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            this.f28670a = str;
            this.f28671b = ironSourceError;
            this.f28672c = iSDemandOnlyRewardedVideoListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3430d8.this.a(this.f28670a, "onRewardedVideoAdShowFailed() error = " + this.f28671b.getErrorMessage());
            this.f28672c.onRewardedVideoAdShowFailed(this.f28670a, this.f28671b);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.d8$e */
    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f28674a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ISDemandOnlyRewardedVideoListener f28675b;

        public e(String str, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            this.f28674a = str;
            this.f28675b = iSDemandOnlyRewardedVideoListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3430d8.this.a(this.f28674a, "onRewardedVideoAdClicked()");
            this.f28675b.onRewardedVideoAdClicked(this.f28674a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.d8$f */
    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f28677a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ISDemandOnlyRewardedVideoListener f28678b;

        public f(String str, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            this.f28677a = str;
            this.f28678b = iSDemandOnlyRewardedVideoListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3430d8.this.a(this.f28677a, "onRewardedVideoAdRewarded()");
            this.f28678b.onRewardedVideoAdRewarded(this.f28677a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.d8$g */
    public class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f28680a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ISDemandOnlyRewardedVideoListener f28681b;

        public g(String str, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            this.f28680a = str;
            this.f28681b = iSDemandOnlyRewardedVideoListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3430d8.this.a(this.f28680a, "onRewardedVideoAdClosed()");
            this.f28681b.onRewardedVideoAdClosed(this.f28680a);
        }
    }

    public C3430d8(ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
        b(iSDemandOnlyRewardedVideoListener);
    }

    public C3430d8() {
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdClicked(String str) {
        boolean z10;
        ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListenerA = a();
        e eVar = new e(str, iSDemandOnlyRewardedVideoListenerA);
        if (iSDemandOnlyRewardedVideoListenerA != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        a(eVar, z10);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdClosed(String str) {
        boolean z10;
        ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListenerA = a();
        g gVar = new g(str, iSDemandOnlyRewardedVideoListenerA);
        if (iSDemandOnlyRewardedVideoListenerA != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        a(gVar, z10);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdLoadFailed(String str, IronSourceError ironSourceError) {
        boolean z10;
        ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListenerA = a();
        b bVar = new b(str, ironSourceError, iSDemandOnlyRewardedVideoListenerA);
        if (iSDemandOnlyRewardedVideoListenerA != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        a(bVar, z10);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdLoadSuccess(String str) {
        boolean z10;
        ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListenerA = a();
        a aVar = new a(str, iSDemandOnlyRewardedVideoListenerA);
        if (iSDemandOnlyRewardedVideoListenerA != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        a(aVar, z10);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdOpened(String str) {
        boolean z10;
        ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListenerA = a();
        c cVar = new c(str, iSDemandOnlyRewardedVideoListenerA);
        if (iSDemandOnlyRewardedVideoListenerA != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        a(cVar, z10);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdRewarded(String str) {
        boolean z10;
        ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListenerA = a();
        f fVar = new f(str, iSDemandOnlyRewardedVideoListenerA);
        if (iSDemandOnlyRewardedVideoListenerA != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        a(fVar, z10);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdShowFailed(String str, IronSourceError ironSourceError) {
        boolean z10;
        ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListenerA = a();
        d dVar = new d(str, ironSourceError, iSDemandOnlyRewardedVideoListenerA);
        if (iSDemandOnlyRewardedVideoListenerA != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        a(dVar, z10);
    }
}
