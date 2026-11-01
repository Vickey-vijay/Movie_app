package com.ironsource;

import android.app.Activity;
import androidx.appcompat.widget.ActivityChooserModel;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* JADX INFO: loaded from: classes7.dex */
public final class F6 implements InterfaceC3797y6, C3712t6.b, C3712t6.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f26503f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f26504g = "Fullscreen ProgressiveOnShown Strategy";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3621o0 f26505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3729u6 f26506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC3763w6 f26507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC3780x6 f26508d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private L6 f26509e;

    public static final class a {
        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        private a() {
        }
    }

    public final C3621o0 a() {
        return this.f26505a;
    }

    public final InterfaceC3729u6 b() {
        return this.f26506b;
    }

    public final InterfaceC3763w6 c() {
        return this.f26507c;
    }

    public F6(C3621o0 c3621o0, InterfaceC3729u6 interfaceC3729u6, InterfaceC3763w6 interfaceC3763w6, InterfaceC3780x6 interfaceC3780x6) {
        ck.p.j(c3621o0, "adTools");
        ck.p.j(interfaceC3729u6, "factory");
        ck.p.j(interfaceC3763w6, "fullscreenAdUnitListener");
        ck.p.j(interfaceC3780x6, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f26505a = c3621o0;
        this.f26506b = interfaceC3729u6;
        this.f26507c = interfaceC3763w6;
        this.f26508d = interfaceC3780x6;
        this.f26509e = new G6(this, null, false, 4, null);
    }

    @Override // com.ironsource.InterfaceC3797y6
    public void a(Activity activity) {
        ck.p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        this.f26509e.a(activity);
    }

    @Override // com.ironsource.C3712t6.b
    public void b(C3712t6 c3712t6, LevelPlayAdInfo levelPlayAdInfo) {
        ck.p.j(c3712t6, "adUnit");
        ck.p.j(levelPlayAdInfo, "adInfo");
        this.f26509e.c(levelPlayAdInfo);
    }

    @Override // com.ironsource.C3712t6.b
    public void c(C3712t6 c3712t6, LevelPlayAdInfo levelPlayAdInfo) {
        ck.p.j(c3712t6, "adUnit");
        ck.p.j(levelPlayAdInfo, "adInfo");
        this.f26509e.b(levelPlayAdInfo);
    }

    public final InterfaceC3780x6 d() {
        return this.f26508d;
    }

    @Override // com.ironsource.InterfaceC3797y6
    public void loadAd() {
        this.f26509e.loadAd();
    }

    public final void a(L6 l10) {
        ck.p.j(l10, "state");
        this.f26509e = l10;
    }

    @Override // com.ironsource.C3712t6.b
    public void b(C3712t6 c3712t6, IronSourceError ironSourceError) {
        ck.p.j(c3712t6, "adUnit");
        this.f26509e.a(ironSourceError);
    }

    public final void a(String str) {
        ck.p.j(str, "message");
        this.f26505a.e().h().f("Fullscreen ProgressiveOnShown Strategy - " + str);
    }

    @Override // com.ironsource.C3712t6.a
    public void a(C3712t6 c3712t6, LevelPlayAdInfo levelPlayAdInfo) {
        ck.p.j(c3712t6, "adUnit");
        ck.p.j(levelPlayAdInfo, "adInfo");
        this.f26509e.a(levelPlayAdInfo);
    }

    @Override // com.ironsource.C3712t6.a
    public void a(C3712t6 c3712t6, IronSourceError ironSourceError) {
        ck.p.j(c3712t6, "adUnit");
        this.f26509e.c(ironSourceError);
    }

    @Override // com.ironsource.C3712t6.b
    public void a(C3712t6 c3712t6) {
        ck.p.j(c3712t6, "adUnit");
        this.f26509e.a();
    }
}
