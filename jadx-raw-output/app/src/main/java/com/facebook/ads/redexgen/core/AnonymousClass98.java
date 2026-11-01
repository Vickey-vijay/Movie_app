package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.os.Looper;
import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.98, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AnonymousClass98 extends AbstractC2508mS implements InterfaceC1164Cg {
    public long A00;
    public C5H A01;
    public InterfaceC2330jM<InterfaceExecutorC1235Ez> A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final int A06;
    public final C2Q A07;
    public final C2645oi A08;
    public final InterfaceC09884w A09;
    public final C9U A0A;
    public final InterfaceC1158Ca A0B;
    public final InterfaceC1213Ed A0C;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.jM != com.google.common.base.Supplier<com.facebook.ads.androidx.media3.exoplayer.util.ReleasableExecutor> */
    @MetaExoPlayerCustomization("Allow for passing a new drmSessionManager")
    public AnonymousClass98(C2645oi c2645oi, InterfaceC09884w interfaceC09884w, InterfaceC1158Ca interfaceC1158Ca, C9U c9u, InterfaceC1213Ed interfaceC1213Ed, int i10, InterfaceC2330jM<InterfaceExecutorC1235Ez> interfaceC2330jM) {
        this.A07 = (C2Q) C3M.A01(c2645oi.A03);
        this.A08 = c2645oi;
        this.A09 = interfaceC09884w;
        this.A0B = interfaceC1158Ca;
        this.A0A = c9u == null ? C9U.A00 : c9u;
        this.A0C = interfaceC1213Ed;
        this.A06 = i10;
        this.A04 = true;
        this.A00 = -9223372036854775807L;
        this.A02 = interfaceC2330jM;
    }

    private void A00() {
        final Timeline anonymousClass97 = new AnonymousClass97(this.A00, this.A05, false, this.A03, null, this.A08);
        if (this.A04) {
            Timeline timeline = new C9C(anonymousClass97) { // from class: com.facebook.ads.redexgen.X.12
                @Override // com.facebook.ads.redexgen.core.C9C, com.facebook.ads.androidx.media3.common.Timeline
                public final C2625oN A0I(int i10, C2625oN c2625oN, boolean z10) {
                    super.A0I(i10, c2625oN, z10);
                    c2625oN.A05 = true;
                    return c2625oN;
                }

                @Override // com.facebook.ads.redexgen.core.C9C, com.facebook.ads.androidx.media3.common.Timeline
                public final C2623oL A0L(int i10, C2623oL c2623oL, long j10) {
                    super.A0L(i10, c2623oL, j10);
                    c2623oL.A0F = true;
                    return c2623oL;
                }
            };
            anonymousClass97 = timeline;
        }
        A05(anonymousClass97);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2508mS
    public final void A09() {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2508mS
    public final void A0A(C5H c5h) {
        this.A01 = c5h;
        this.A0A.AGK();
        this.A0A.AIu((Looper) C3M.A01(Looper.myLooper()), A00());
        A00();
    }

    @Override // com.facebook.ads.redexgen.core.CL
    @MetaExoPlayerCustomization("PlayerId needs to be set")
    public final InterfaceC2502mM A5O(C2501mL c2501mL, EO eo2, long j10) {
        InterfaceExecutorC1235Ez interfaceExecutorC1235Ez;
        InterfaceC2589nl interfaceC2589nlA5A = this.A09.A5A();
        if (this.A01 != null) {
            interfaceC2589nlA5A.A3v(this.A01);
        }
        Uri uri = this.A07.A00;
        InterfaceC1159Cb interfaceC1159CbA5P = this.A0B.A5P(C10567m.A03);
        C9U c9u = this.A0A;
        C9P c9pA01 = A01(c2501mL);
        InterfaceC1213Ed interfaceC1213Ed = this.A0C;
        CW cwA02 = A02(c2501mL);
        String str = this.A07.A04;
        int i10 = this.A06;
        if (this.A02 != null) {
            interfaceExecutorC1235Ez = this.A02.get();
        } else {
            interfaceExecutorC1235Ez = null;
        }
        return new C9A(uri, interfaceC2589nlA5A, interfaceC1159CbA5P, c9u, c9pA01, interfaceC1213Ed, cwA02, this, eo2, str, i10, interfaceExecutorC1235Ez);
    }

    @Override // com.facebook.ads.redexgen.core.CL
    public final void ABu() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1164Cg
    public final void AFH(long j10, boolean z10, boolean z11) {
        if (j10 == -9223372036854775807L) {
            j10 = this.A00;
        }
        if (!this.A04 && this.A00 == j10 && this.A05 == z10 && this.A03 == z11) {
            return;
        }
        this.A00 = j10;
        this.A05 = z10;
        this.A03 = z11;
        this.A04 = false;
        A00();
    }

    @Override // com.facebook.ads.redexgen.core.CL
    public final void AH0(InterfaceC2502mM interfaceC2502mM) {
        ((C9A) interfaceC2502mM).A0a();
    }
}
