package io.appmetrica.analytics.impl;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import io.appmetrica.analytics.coreutils.internal.toggle.ConjunctiveCompositeThreadSafeToggle;
import io.appmetrica.analytics.coreutils.internal.toggle.OuterStateToggle;
import io.appmetrica.analytics.coreutils.internal.toggle.SavableToggle;

/* JADX INFO: loaded from: classes9.dex */
public final class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4064af f55367a = C4418oa.k().y();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SavableToggle f55368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final OuterStateToggle f55369c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final OuterStateToggle f55370d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ConjunctiveCompositeThreadSafeToggle f55371e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ConjunctiveCompositeThreadSafeToggle f55372f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SavableToggle f55373g;

    public final void a(C4226gm c4226gm) {
        boolean z10 = c4226gm.f56846p;
        this.f55369c.update(!z10 || c4226gm.f56844n.f57243c);
        this.f55370d.update(!z10 || c4226gm.f56844n.f57245e);
    }

    public J(C4226gm c4226gm) {
        SavableToggle savableToggle = new SavableToggle("advIdsFromClientApi", new I(this));
        this.f55368b = savableToggle;
        OuterStateToggle outerStateToggle = new OuterStateToggle(false, "GAID-remote-config");
        this.f55369c = outerStateToggle;
        OuterStateToggle outerStateToggle2 = new OuterStateToggle(false, "HOAID-remote-config");
        this.f55370d = outerStateToggle2;
        this.f55371e = new ConjunctiveCompositeThreadSafeToggle(nj.s.n(savableToggle, outerStateToggle), IronSourceConstants.TYPE_GAID);
        this.f55372f = new ConjunctiveCompositeThreadSafeToggle(nj.s.n(savableToggle, outerStateToggle2), "HOAID");
        this.f55373g = savableToggle;
        a(c4226gm);
    }

    public final G a() {
        int i10;
        int i11 = 3;
        int i12 = 4;
        if (this.f55371e.getActualState()) {
            i10 = 1;
        } else if (this.f55368b.getActualState()) {
            i10 = !this.f55369c.getActualState() ? 3 : 4;
        } else {
            i10 = 2;
        }
        if (this.f55372f.getActualState()) {
            i11 = 1;
        } else if (!this.f55368b.getActualState()) {
            i11 = 2;
        } else if (this.f55370d.getActualState()) {
            i11 = 4;
        }
        if (this.f55373g.getActualState()) {
            i12 = 1;
        } else if (!this.f55368b.getActualState()) {
            i12 = 2;
        }
        return new G(i10, i11, i12);
    }
}
