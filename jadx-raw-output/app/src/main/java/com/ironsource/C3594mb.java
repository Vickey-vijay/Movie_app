package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import java.util.UUID;

/* JADX INFO: renamed from: com.ironsource.mb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3594mb extends Aa implements Vb {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final UUID f29501d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C3558kb f29502e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Sb f29503f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f29504g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private C3489gd f29505h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private InterfaceC3632ob f29506i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private AdapterNativeAdData f29507j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private AdapterNativeAdViewBinder f29508k;

    public /* synthetic */ C3594mb(UUID uuid, C3558kb c3558kb, int i10, ck.i iVar) {
        this((i10 & 1) != 0 ? C3815z7.f31705a.a() : uuid, c3558kb);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3594mb c3594mb) {
        ck.p.j(c3594mb, "this$0");
        IronLog.API.info(String.valueOf(c3594mb));
        try {
            Sb sb2 = c3594mb.f29503f;
            if (sb2 == null) {
                ck.p.B("nativeAdController");
                sb2 = null;
            }
            sb2.n();
            c3594mb.f29506i = null;
        } catch (Throwable th2) {
            C3676r4.d().a(th2);
            IronLog.API.error("destroyNativeAd()");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C3594mb c3594mb) {
        ck.p.j(c3594mb, "this$0");
        Sb sb2 = null;
        if (c3594mb.c()) {
            IronLog.INTERNAL.warning(C3621o0.a(c3594mb.a(), "Native ad load already called", (String) null, 2, (Object) null));
            return;
        }
        c3594mb.a(true);
        if (c3594mb.d()) {
            Sb sb3 = c3594mb.f29503f;
            if (sb3 == null) {
                ck.p.B("nativeAdController");
            } else {
                sb2 = sb3;
            }
            sb2.o();
        }
    }

    private final Sb e() {
        this.f29505h = a().c(this.f29504g);
        UUID uuid = this.f29501d;
        String strB = b();
        C3489gd c3489gd = this.f29505h;
        if (c3489gd == null) {
            ck.p.B("placement");
            c3489gd = null;
        }
        C3416cc c3416cc = new C3416cc(uuid, strB, c3489gd);
        a(c3416cc);
        return new Sb(this, a(), c3416cc);
    }

    public final void f() {
        a(new Runnable() { // from class: com.ironsource.hl
            @Override // java.lang.Runnable
            public final void run() {
                C3594mb.a(this.f29106b);
            }
        });
    }

    public final UUID g() {
        return this.f29501d;
    }

    public final String h() {
        AdapterNativeAdData adapterNativeAdData = this.f29507j;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getAdvertiser();
        }
        return null;
    }

    public final String i() {
        AdapterNativeAdData adapterNativeAdData = this.f29507j;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getBody();
        }
        return null;
    }

    public final String j() {
        AdapterNativeAdData adapterNativeAdData = this.f29507j;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getCallToAction();
        }
        return null;
    }

    public final InterfaceC3576lb.a k() {
        NativeAdDataInterface.Image icon;
        AdapterNativeAdData adapterNativeAdData = this.f29507j;
        if (adapterNativeAdData == null || (icon = adapterNativeAdData.getIcon()) == null) {
            return null;
        }
        return new InterfaceC3576lb.a(icon.getDrawable(), icon.getUri());
    }

    public final AdapterNativeAdViewBinder l() {
        return this.f29508k;
    }

    public final String m() {
        AdapterNativeAdData adapterNativeAdData = this.f29507j;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getTitle();
        }
        return null;
    }

    public final void n() {
        a(new Runnable() { // from class: com.ironsource.kl
            @Override // java.lang.Runnable
            public final void run() {
                C3594mb.b(this.f29384b);
            }
        });
    }

    @Override // com.ironsource.Vb
    public void onNativeAdLoadFailed(IronSourceError ironSourceError) {
        String string = this.f29501d.toString();
        ck.p.i(string, "adId.toString()");
        final LevelPlayAdError levelPlayAdError = new LevelPlayAdError(ironSourceError, string, b());
        b(new Runnable() { // from class: com.ironsource.jl
            @Override // java.lang.Runnable
            public final void run() {
                C3594mb.a(this.f29300b, levelPlayAdError);
            }
        });
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C3594mb(UUID uuid, C3558kb c3558kb) {
        ck.p.j(uuid, com.ironsource.sdk.controller.f.b.f30919c);
        ck.p.j(c3558kb, "nativeAd");
        IronSource.a aVar = IronSource.a.NATIVE_AD;
        super(new C3621o0(aVar, E0.b.MEDIATION));
        this.f29501d = uuid;
        this.f29502e = c3558kb;
        this.f29504g = "";
        a().e().a(new C3602n(aVar, uuid, b()));
    }

    @Override // com.ironsource.Aa
    public boolean d() {
        this.f29503f = e();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C3594mb c3594mb, LevelPlayAdInfo levelPlayAdInfo) {
        ck.p.j(c3594mb, "this$0");
        ck.p.j(levelPlayAdInfo, "$adInfo");
        InterfaceC3632ob interfaceC3632ob = c3594mb.f29506i;
        if (interfaceC3632ob != null) {
            interfaceC3632ob.b(c3594mb.f29502e, levelPlayAdInfo);
        }
    }

    public final void a(final InterfaceC3632ob interfaceC3632ob) {
        a(new Runnable() { // from class: com.ironsource.fl
            @Override // java.lang.Runnable
            public final void run() {
                C3594mb.a(this.f28952b, interfaceC3632ob);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3594mb c3594mb, InterfaceC3632ob interfaceC3632ob) {
        ck.p.j(c3594mb, "this$0");
        c3594mb.f29506i = interfaceC3632ob;
    }

    @Override // com.ironsource.Vb
    public void b(final LevelPlayAdInfo levelPlayAdInfo) {
        ck.p.j(levelPlayAdInfo, "adInfo");
        b(new Runnable() { // from class: com.ironsource.il
            @Override // java.lang.Runnable
            public final void run() {
                C3594mb.a(this.f29173b, levelPlayAdInfo);
            }
        });
    }

    @Override // com.ironsource.Vb
    public void a(final LevelPlayAdInfo levelPlayAdInfo) {
        ck.p.j(levelPlayAdInfo, "adInfo");
        IronLog.CALLBACK.info(String.valueOf(this));
        Pb pb2 = new Pb();
        Sb sb2 = this.f29503f;
        if (sb2 == null) {
            ck.p.B("nativeAdController");
            sb2 = null;
        }
        sb2.a(pb2);
        this.f29507j = pb2.a();
        this.f29508k = pb2.b();
        b(new Runnable() { // from class: com.ironsource.ll
            @Override // java.lang.Runnable
            public final void run() {
                C3594mb.b(this.f29444b, levelPlayAdInfo);
            }
        });
    }

    public final void b(final String str) {
        ck.p.j(str, "placementName");
        a(new Runnable() { // from class: com.ironsource.gl
            @Override // java.lang.Runnable
            public final void run() {
                C3594mb.a(this.f29030b, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3594mb c3594mb, LevelPlayAdError levelPlayAdError) {
        ck.p.j(c3594mb, "this$0");
        ck.p.j(levelPlayAdError, "$levelPlayError");
        InterfaceC3632ob interfaceC3632ob = c3594mb.f29506i;
        if (interfaceC3632ob != null) {
            interfaceC3632ob.a(c3594mb.f29502e, levelPlayAdError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3594mb c3594mb, LevelPlayAdInfo levelPlayAdInfo) {
        ck.p.j(c3594mb, "this$0");
        ck.p.j(levelPlayAdInfo, "$adInfo");
        InterfaceC3632ob interfaceC3632ob = c3594mb.f29506i;
        if (interfaceC3632ob != null) {
            interfaceC3632ob.c(c3594mb.f29502e, levelPlayAdInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3594mb c3594mb, String str) {
        ck.p.j(c3594mb, "this$0");
        ck.p.j(str, "$placementName");
        c3594mb.f29504g = str;
    }
}
