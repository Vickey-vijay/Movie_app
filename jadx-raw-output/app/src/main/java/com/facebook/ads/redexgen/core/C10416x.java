package com.facebook.ads.redexgen.core;

import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C10416x {
    public static final C2501mL A0E = new C2501mL(new Object());
    public final int A00;
    public final long A01;
    public final long A02;
    public final Timeline A03;
    public final C2501mL A04;
    public final C2501mL A05;
    public final C2491mA A06;
    public final EL A07;

    @MetaExoPlayerCustomization(type = {"NEW_CLASS_ARG"}, value = "Start Stall Logging")
    public final EnumC2230hX A08;

    @MetaExoPlayerCustomization(type = {"NEW_CLASS_ARG"}, value = "Determine if stall is from Audio for logging")
    public final boolean A09;
    public final boolean A0A;
    public volatile long A0B;
    public volatile long A0C;
    public volatile long A0D;

    public C10416x(Timeline timeline, long j10, C2491mA c2491mA, EL el2) {
        this(timeline, A0E, j10, -9223372036854775807L, 1, false, c2491mA, el2, A0E, j10, j10, j10, EnumC2230hX.A09, false);
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "Customized to call base constructor")
    public C10416x(Timeline timeline, C2501mL c2501mL, long j10, long j11, int i10, boolean z10, C2491mA c2491mA, EL el2, C2501mL c2501mL2, long j12, long j13, long j14) {
        this(timeline, c2501mL, j10, j11, i10, z10, c2491mA, el2, c2501mL2, j12, j13, j14, EnumC2230hX.A09, false);
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "Customized to add new parameters")
    public C10416x(@MetaExoPlayerCustomization(type = {"NEW_METHOD_ARGS"}) Timeline timeline, @MetaExoPlayerCustomization(type = {"NEW_METHOD_ARGS"}) C2501mL c2501mL, long j10, long j11, int i10, boolean z10, C2491mA c2491mA, EL el2, C2501mL c2501mL2, long j12, long j13, long j14, EnumC2230hX enumC2230hX, boolean z11) {
        this.A03 = timeline;
        this.A05 = c2501mL;
        this.A02 = j10;
        this.A01 = j11;
        this.A0C = j10;
        this.A00 = i10;
        this.A0A = z10;
        this.A06 = c2491mA;
        this.A07 = el2;
        this.A04 = c2501mL2;
        this.A0B = j12;
        this.A0D = j13;
        this.A0C = j14;
        this.A08 = enumC2230hX;
        this.A09 = z11;
    }

    public static void A00(C10416x c10416x, C10416x c10416x2) {
        c10416x2.A0C = c10416x.A0C;
        c10416x2.A0B = c10416x.A0B;
        c10416x2.A0D = c10416x.A0D;
    }

    public final C10416x A01(int i10) {
        C10416x c10416x = new C10416x(this.A03, this.A05, this.A02, this.A01, i10, this.A0A, this.A06, this.A07, this.A04, this.A0B, this.A0D, this.A0C, this.A08, this.A09);
        A00(this, c10416x);
        return c10416x;
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "Stall Reason Logging in Hero")
    public final C10416x A02(int i10, EnumC2230hX enumC2230hX, boolean z10) {
        C10416x c10416x = new C10416x(this.A03, this.A05, this.A02, this.A01, i10, this.A0A, this.A06, this.A07, this.A04, this.A0B, this.A0D, this.A0C, enumC2230hX, z10);
        A00(this, c10416x);
        return c10416x;
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "To track Audio Stalls for Logging")
    public final C10416x A03(int i10, boolean z10) {
        C10416x c10416x = new C10416x(this.A03, this.A05, this.A02, this.A01, i10, this.A0A, this.A06, this.A07, this.A04, this.A0B, this.A0D, this.A0C, this.A08, z10);
        A00(this, c10416x);
        return c10416x;
    }

    public final C10416x A04(Timeline timeline) {
        C10416x c10416x = new C10416x(timeline, this.A05, this.A02, this.A01, this.A00, this.A0A, this.A06, this.A07, this.A04, this.A0B, this.A0D, this.A0C, this.A08, this.A09);
        A00(this, c10416x);
        return c10416x;
    }

    public final C10416x A05(C2501mL c2501mL) {
        return new C10416x(this.A03, this.A05, this.A02, this.A01, this.A00, this.A0A, this.A06, this.A07, c2501mL, this.A0B, this.A0D, this.A0C, this.A08, this.A09);
    }

    public final C10416x A06(C2501mL c2501mL, long j10, long j11, long j12) {
        long j13 = j11;
        Timeline timeline = this.A03;
        if (!c2501mL.A00()) {
            j13 = -9223372036854775807L;
        }
        return new C10416x(timeline, c2501mL, j10, j13, this.A00, this.A0A, this.A06, this.A07, this.A04, this.A0B, j12, j10);
    }

    public final C10416x A07(C2491mA c2491mA, EL el2) {
        C10416x c10416x = new C10416x(this.A03, this.A05, this.A02, this.A01, this.A00, this.A0A, c2491mA, el2, this.A04, this.A0B, this.A0D, this.A0C, this.A08, this.A09);
        A00(this, c10416x);
        return c10416x;
    }

    public final C10416x A08(boolean z10) {
        C10416x c10416x = new C10416x(this.A03, this.A05, this.A02, this.A01, this.A00, z10, this.A06, this.A07, this.A04, this.A0B, this.A0D, this.A0C, this.A08, this.A09);
        A00(this, c10416x);
        return c10416x;
    }
}
