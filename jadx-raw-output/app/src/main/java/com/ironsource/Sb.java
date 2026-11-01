package com.ironsource;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.NotImplementedError;

/* JADX INFO: loaded from: classes5.dex */
public final class Sb extends AbstractC3582m implements InterfaceC3488gc, M0, InterfaceC3791y0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Vb f27616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C3621o0 f27617c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C3416cc f27618d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private C3452ec f27619e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private LevelPlayAdInfo f27620f;

    public final void a(Pb pb2) {
        ck.p.j(pb2, "nativeAdBinder");
        C3452ec c3452ec = this.f27619e;
        if (c3452ec == null) {
            ck.p.B("nativeAdUnit");
            c3452ec = null;
        }
        c3452ec.a(new Xb(pb2), this);
    }

    public Sb(Vb vb2, C3621o0 c3621o0, C3416cc c3416cc) {
        ck.p.j(vb2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        ck.p.j(c3621o0, "adTools");
        ck.p.j(c3416cc, "nativeAdProperties");
        this.f27616b = vb2;
        this.f27617c = c3621o0;
        this.f27618d = c3416cc;
        this.f27620f = m();
    }

    private final C3452ec a(C3621o0 c3621o0, C3416cc c3416cc) {
        IronLog.INTERNAL.verbose();
        return new C3452ec(c3621o0, C3470fc.f28899y.a(c3416cc, l().a()), this);
    }

    private final LevelPlayAdInfo m() {
        String string = this.f27618d.b().toString();
        ck.p.i(string, "nativeAdProperties.adId.toString()");
        String strC = this.f27618d.c();
        String string2 = this.f27618d.a().toString();
        ck.p.i(string2, "nativeAdProperties.adFormat.toString()");
        return new LevelPlayAdInfo(string, strC, string2, null, null, null, null, 120, null);
    }

    @Override // com.ironsource.InterfaceC3791y0
    public void c(IronSourceError ironSourceError) {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.ironsource.K0
    public void e() {
        this.f27616b.b(this.f27620f);
    }

    public final void o() {
        C3452ec c3452ecA = a(this.f27617c, this.f27618d);
        this.f27619e = c3452ecA;
        if (c3452ecA == null) {
            ck.p.B("nativeAdUnit");
            c3452ecA = null;
        }
        c3452ecA.a((M0) this);
    }

    public final void n() {
        this.f27620f = m();
        C3452ec c3452ec = this.f27619e;
        if (c3452ec == null) {
            ck.p.B("nativeAdUnit");
            c3452ec = null;
        }
        c3452ec.a(true);
    }

    @Override // com.ironsource.M0
    public void a(C3706t0 c3706t0) {
        ck.p.j(c3706t0, "adUnitCallback");
        LevelPlayAdInfo levelPlayAdInfoC = c3706t0.c();
        if (levelPlayAdInfoC != null) {
            this.f27620f = levelPlayAdInfoC;
            this.f27616b.a(levelPlayAdInfoC);
        }
    }

    @Override // com.ironsource.InterfaceC3791y0
    public void a(LevelPlayAdInfo levelPlayAdInfo) {
        ck.p.j(levelPlayAdInfo, "adInfo");
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.ironsource.M0
    public void a(IronSourceError ironSourceError) {
        this.f27616b.onNativeAdLoadFailed(ironSourceError);
    }
}
