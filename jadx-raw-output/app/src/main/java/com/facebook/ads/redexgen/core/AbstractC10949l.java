package com.facebook.ads.redexgen.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC10949l implements InterfaceC2589nl {
    public static String[] A04 = {"fHQEiP1zlTMmcDhuRJvCUYhlqM3A1WdS", "0xjR5o24wRXCnK6P48nvJnLVp1A7yIdC", "SqWyKblZmsOi3mnFjBlOyIvINI4fuoz1", "GUT90kd8g0iIA", "yfLAFjbfQv", "f1jCtkpjn8LmH02gI7EE0X95Og8KENXi", "pIy67q2NMZ", "VUF0F4IbO37j7MJUWX75PYUeN7L9nYYd"};
    public int A00;
    public AnonymousClass56 A01;
    public final ArrayList<C5H> A02 = new ArrayList<>(1);
    public final boolean A03;

    @Override // com.facebook.ads.redexgen.core.InterfaceC2589nl
    public /* synthetic */ Map A8l() {
        return AbstractC09874v.A00(this);
    }

    public AbstractC10949l(boolean z10) {
        this.A03 = z10;
    }

    @MetaExoPlayerCustomization
    private final void A0D(AnonymousClass56 anonymousClass56, boolean z10) {
        this.A01 = anonymousClass56;
        for (int i10 = 0; i10 < i; i10++) {
            this.A02.get(i10).AFX(this, anonymousClass56, this.A03, z10);
        }
    }

    public final void A0E() {
        AnonymousClass56 anonymousClass56 = (AnonymousClass56) AbstractC09664a.A0f(this.A01);
        for (int i10 = 0; i10 < this.A00; i10++) {
            this.A02.get(i10).AFW(this, anonymousClass56, this.A03);
        }
        this.A01 = null;
    }

    public final void A0F(int i10) {
        AnonymousClass56 anonymousClass56 = (AnonymousClass56) AbstractC09664a.A0f(this.A01);
        for (int i11 = 0; i11 < this.A00; i11++) {
            this.A02.get(i11).ACg(this, anonymousClass56, this.A03, i10);
        }
    }

    public final void A0G(AnonymousClass56 anonymousClass56) {
        for (int i10 = 0; i10 < i; i10++) {
            this.A02.get(i10);
            if (A04[7].charAt(14) == 'P') {
                throw new RuntimeException();
            }
            A04[2] = "KcnUkvSyZAFqCmq9nk7LLPyjKQRUe1pa";
        }
    }

    public final void A0H(AnonymousClass56 anonymousClass56) {
        A0D(anonymousClass56, false);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2589nl
    public final void A3v(C5H c5h) {
        C3M.A01(c5h);
        if (!this.A02.contains(c5h)) {
            this.A02.add(c5h);
            this.A00++;
        }
    }
}
