package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.g1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2141g1 extends AbstractC1473Oh {
    public final AbstractC1473Oh A00 = new C2142g2(this);
    public final C10246g A01;

    public C2141g1(C10246g c10246g) {
        this.A01 = c10246g;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1473Oh
    public final void A07(View view, AccessibilityEvent accessibilityEvent) {
        super.A07(view, accessibilityEvent);
        accessibilityEvent.setClassName(C10246g.class.getName());
        if ((view instanceof C10246g) && !A0B()) {
            C10246g c10246g = (C10246g) view;
            if (c10246g.getLayoutManager() != null) {
                c10246g.getLayoutManager().A1v(accessibilityEvent);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1473Oh
    public final void A08(View view, PS ps) {
        super.A08(view, ps);
        ps.A0O(C10246g.class.getName());
        if (!A0B() && this.A01.getLayoutManager() != null) {
            this.A01.getLayoutManager().A1H(ps);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1473Oh
    public final boolean A09(View view, int i10, Bundle bundle) {
        if (super.A09(view, i10, bundle)) {
            return true;
        }
        if (!A0B() && this.A01.getLayoutManager() != null) {
            return this.A01.getLayoutManager().A1X(i10, bundle);
        }
        return false;
    }

    public final AbstractC1473Oh A0A() {
        return this.A00;
    }

    public final boolean A0B() {
        return this.A01.A1r();
    }
}
