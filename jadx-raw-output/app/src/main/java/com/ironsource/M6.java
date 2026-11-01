package com.ironsource;

import android.app.Activity;
import androidx.appcompat.widget.ActivityChooserModel;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* JADX INFO: loaded from: classes6.dex */
public final class M6 implements InterfaceC3797y6, C3712t6.b, C3712t6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3621o0 f27040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3797y6.a f27041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC3729u6 f27042c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC3763w6 f27043d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC3780x6 f27044e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private C3712t6 f27045f;

    public final C3621o0 a() {
        return this.f27040a;
    }

    public final InterfaceC3797y6.a b() {
        return this.f27041b;
    }

    public M6(C3621o0 c3621o0, InterfaceC3797y6.a aVar, InterfaceC3729u6 interfaceC3729u6, InterfaceC3763w6 interfaceC3763w6, InterfaceC3780x6 interfaceC3780x6) {
        ck.p.j(c3621o0, "adTools");
        ck.p.j(aVar, "config");
        ck.p.j(interfaceC3729u6, "fullscreenAdUnitFactory");
        ck.p.j(interfaceC3763w6, "fullscreenAdUnitListener");
        ck.p.j(interfaceC3780x6, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f27040a = c3621o0;
        this.f27041b = aVar;
        this.f27042c = interfaceC3729u6;
        this.f27043d = interfaceC3763w6;
        this.f27044e = interfaceC3780x6;
    }

    @Override // com.ironsource.InterfaceC3797y6
    public void a(Activity activity) {
        ck.p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        C3712t6 c3712t6 = this.f27045f;
        if (c3712t6 != null) {
            c3712t6.a(activity, this);
        }
    }

    @Override // com.ironsource.C3712t6.b
    public void b(C3712t6 c3712t6, LevelPlayAdInfo levelPlayAdInfo) {
        ck.p.j(c3712t6, "adUnit");
        ck.p.j(levelPlayAdInfo, "adInfo");
        this.f27044e.b(levelPlayAdInfo);
    }

    @Override // com.ironsource.C3712t6.b
    public void c(C3712t6 c3712t6, LevelPlayAdInfo levelPlayAdInfo) {
        ck.p.j(c3712t6, "adUnit");
        ck.p.j(levelPlayAdInfo, "adInfo");
        this.f27044e.onAdInfoChanged(levelPlayAdInfo);
    }

    @Override // com.ironsource.InterfaceC3797y6
    public void loadAd() {
        C3712t6 c3712t6A = this.f27042c.a(true, this.f27043d);
        c3712t6A.a(this);
        this.f27045f = c3712t6A;
    }

    @Override // com.ironsource.C3712t6.b
    public void a(C3712t6 c3712t6) {
        ck.p.j(c3712t6, "adUnit");
        this.f27045f = null;
        this.f27044e.a();
    }

    @Override // com.ironsource.C3712t6.b
    public void b(C3712t6 c3712t6, IronSourceError ironSourceError) {
        ck.p.j(c3712t6, "adUnit");
        this.f27044e.a(ironSourceError);
    }

    @Override // com.ironsource.C3712t6.a
    public void a(C3712t6 c3712t6, LevelPlayAdInfo levelPlayAdInfo) {
        ck.p.j(c3712t6, "adUnit");
        ck.p.j(levelPlayAdInfo, "adInfo");
        this.f27044e.a(levelPlayAdInfo);
    }

    @Override // com.ironsource.C3712t6.a
    public void a(C3712t6 c3712t6, IronSourceError ironSourceError) {
        ck.p.j(c3712t6, "adUnit");
        this.f27044e.c(ironSourceError);
    }
}
