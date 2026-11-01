package com.facebook.ads.redexgen.core;

import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7Y, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C7Y {
    public static String[] A06 = {"jkVScMAnmSDw5NjtFKaMDw93YHVTZfVV", "X8vR6FaiUrrVUV4OyPqbjTz4nTbdT", "DJqg7VUdCo9q2ysxPrWS1RTdTLsj", "4FrbkvGGO58oIWN02YSUZA4iQkwc41Il", "lEgbsVLzgPUjgc1", "ISDPu1y88m9uUW9z", "L6djBwtYOA2bka2PQ69EdZLSIG4ne", "x8MPEelqUvAzBLNZGFUUNdgpeh0HUacA"};
    public C2501mL A00;
    public C2501mL A01;
    public C2501mL A02;
    public AbstractC1121Am<C2501mL> A03 = AbstractC1121Am.A03();
    public AbstractC2525mj<C2501mL, Timeline> A04 = AbstractC2525mj.A04();
    public final C2625oN A05;

    /* JADX WARN: Code duplicated, block: B:14:0x0042  */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C2501mL A00(InterfaceC09392z interfaceC09392z, AbstractC1121Am<C2501mL> abstractC1121Am, C2501mL c2501mL, C2625oN c2625oN) {
        int iA07;
        Object obj;
        int i10;
        Timeline timelineA7Y = interfaceC09392z.A7Y();
        int iA7U = interfaceC09392z.A7U();
        Object objA0M = timelineA7Y.A0N() ? null : timelineA7Y.A0M(iA7U);
        if (interfaceC09392z.AAU()) {
            iA07 = -1;
        } else {
            boolean zA0N = timelineA7Y.A0N();
            String[] strArr = A06;
            if (strArr[7].charAt(14) != strArr[3].charAt(14)) {
                throw new RuntimeException();
            }
            A06[6] = "fPIpfte6042F2VeKOBsTFTkNJVxhR";
            if (zA0N) {
                iA07 = -1;
            } else {
                iA07 = timelineA7Y.A0H(iA7U, c2625oN).A07(AbstractC09664a.A0O(interfaceC09392z.A7W()) - c2625oN.A0C());
            }
        }
        for (int i11 = 0; i11 < abstractC1121Am.size(); i11++) {
            C2501mL c2501mL2 = abstractC1121Am.get(i11);
            if (A04(c2501mL2, objA0M, interfaceC09392z.AAU(), interfaceC09392z.A7Q(), interfaceC09392z.A7R(), iA07)) {
                return c2501mL2;
            }
        }
        if (abstractC1121Am.isEmpty() && c2501mL != null && A04(c2501mL, obj, interfaceC09392z.AAU(), interfaceC09392z.A7Q(), interfaceC09392z.A7R(), i10)) {
            obj = objA0M;
            i10 = iA07;
            return c2501mL;
        }
        obj = objA0M;
        i10 = iA07;
        return null;
    }

    public C7Y(C2625oN c2625oN) {
        this.A05 = c2625oN;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.mh != com.google.common.collect.ImmutableMap$Builder<com.facebook.ads.androidx.media3.exoplayer.source.MediaSource$MediaPeriodId, com.facebook.ads.androidx.media3.common.Timeline> */
    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "builder of ImmutableMap should be a buildOrThrow")
    private void A02(Timeline timeline) {
        C2523mh<C2501mL, Timeline> c2523mhA03 = AbstractC2525mj.A03();
        if (this.A03.isEmpty()) {
            A03(c2523mhA03, this.A01, timeline);
            C2501mL c2501mL = this.A02;
            C2501mL c2501mL2 = this.A01;
            if (A06[4].length() == 25) {
                throw new RuntimeException();
            }
            String[] strArr = A06;
            strArr[2] = "UxUdIKnoAyUMpq9t4QIr4fpxRPT3";
            strArr[1] = "6BCX8szW2uTmGViuSf00Yq1AObOIr";
            if (!BX.A01(c2501mL, c2501mL2)) {
                A03(c2523mhA03, this.A02, timeline);
            }
            if (!BX.A01(this.A00, this.A01) && !BX.A01(this.A00, this.A02)) {
                A03(c2523mhA03, this.A00, timeline);
            }
        } else {
            for (int i10 = 0; i10 < this.A03.size(); i10++) {
                A03(c2523mhA03, this.A03.get(i10), timeline);
            }
            if (!this.A03.contains(this.A00)) {
                A03(c2523mhA03, this.A00, timeline);
            }
        }
        this.A04 = c2523mhA03.A07();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.mh != com.google.common.collect.ImmutableMap$Builder<com.facebook.ads.androidx.media3.exoplayer.source.MediaSource$MediaPeriodId, com.facebook.ads.androidx.media3.common.Timeline> */
    private void A03(C2523mh<C2501mL, Timeline> c2523mh, C2501mL c2501mL, Timeline timeline) {
        if (c2501mL == null) {
            return;
        }
        if (timeline.A0A(c2501mL.A04) != -1) {
            c2523mh.A05(c2501mL, timeline);
            return;
        }
        Timeline existingTimeline = this.A04.get(c2501mL);
        if (existingTimeline == null) {
            return;
        }
        c2523mh.A05(c2501mL, existingTimeline);
    }

    public static boolean A04(C2501mL c2501mL, Object obj, boolean z10, int i10, int i11, int i12) {
        if (c2501mL.A04.equals(obj)) {
            return (z10 && c2501mL.A00 == i10 && c2501mL.A01 == i11) || (!z10 && c2501mL.A00 == -1 && c2501mL.A02 == i12);
        }
        return false;
    }

    public final Timeline A05(C2501mL c2501mL) {
        return this.A04.get(c2501mL);
    }

    public final C2501mL A06() {
        return this.A00;
    }

    public final void A07(InterfaceC09392z interfaceC09392z) {
        this.A00 = A00(interfaceC09392z, this.A03, this.A01, this.A05);
        A02(interfaceC09392z.A7Y());
    }
}
