package com.ironsource;

import android.app.Activity;
import androidx.appcompat.widget.ActivityChooserModel;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* JADX INFO: renamed from: com.ironsource.z6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C3814z6 implements InterfaceC3797y6, C3712t6.b, C3712t6.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f31698f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f31699g = "Fullscreen ProgressiveOnLoaded Strategy";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3621o0 f31700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3729u6 f31701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC3763w6 f31702c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC3780x6 f31703d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private E6 f31704e;

    /* JADX INFO: renamed from: com.ironsource.z6$a */
    public static final class a {
        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        private a() {
        }
    }

    public final C3621o0 a() {
        return this.f31700a;
    }

    public final InterfaceC3729u6 b() {
        return this.f31701b;
    }

    public final InterfaceC3763w6 c() {
        return this.f31702c;
    }

    public C3814z6(C3621o0 c3621o0, InterfaceC3729u6 interfaceC3729u6, InterfaceC3763w6 interfaceC3763w6, InterfaceC3780x6 interfaceC3780x6) {
        ck.p.j(c3621o0, "adTools");
        ck.p.j(interfaceC3729u6, "factory");
        ck.p.j(interfaceC3763w6, "fullscreenAdUnitListener");
        ck.p.j(interfaceC3780x6, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f31700a = c3621o0;
        this.f31701b = interfaceC3729u6;
        this.f31702c = interfaceC3763w6;
        this.f31703d = interfaceC3780x6;
        this.f31704e = new A6(this);
    }

    public final void a(E6 e10) {
        ck.p.j(e10, "state");
        this.f31704e = e10;
    }

    @Override // com.ironsource.C3712t6.b
    public void b(C3712t6 c3712t6, LevelPlayAdInfo levelPlayAdInfo) {
        ck.p.j(c3712t6, "adUnit");
        ck.p.j(levelPlayAdInfo, "adInfo");
        this.f31704e.b(c3712t6, levelPlayAdInfo);
    }

    @Override // com.ironsource.C3712t6.b
    public void c(C3712t6 c3712t6, LevelPlayAdInfo levelPlayAdInfo) {
        ck.p.j(c3712t6, "adUnit");
        ck.p.j(levelPlayAdInfo, "adInfo");
        this.f31704e.c(c3712t6, levelPlayAdInfo);
    }

    public final InterfaceC3780x6 d() {
        return this.f31703d;
    }

    @Override // com.ironsource.InterfaceC3797y6
    public void loadAd() {
        this.f31704e.loadAd();
    }

    @Override // com.ironsource.InterfaceC3797y6
    public void a(Activity activity) {
        ck.p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        this.f31704e.a(activity);
    }

    @Override // com.ironsource.C3712t6.b
    public void b(C3712t6 c3712t6, IronSourceError ironSourceError) {
        ck.p.j(c3712t6, "adUnit");
        this.f31704e.b(c3712t6, ironSourceError);
    }

    @Override // com.ironsource.C3712t6.b
    public void a(C3712t6 c3712t6) {
        ck.p.j(c3712t6, "adUnit");
        this.f31704e.a(c3712t6);
    }

    @Override // com.ironsource.C3712t6.a
    public void a(C3712t6 c3712t6, LevelPlayAdInfo levelPlayAdInfo) {
        ck.p.j(c3712t6, "adUnit");
        ck.p.j(levelPlayAdInfo, "adInfo");
        this.f31704e.a(c3712t6, levelPlayAdInfo);
    }

    @Override // com.ironsource.C3712t6.a
    public void a(C3712t6 c3712t6, IronSourceError ironSourceError) {
        ck.p.j(c3712t6, "adUnit");
        this.f31704e.a(c3712t6, ironSourceError);
    }

    public final void a(String str) {
        ck.p.j(str, "message");
        this.f31700a.e().h().f("Fullscreen ProgressiveOnLoaded Strategy - " + str);
    }
}
