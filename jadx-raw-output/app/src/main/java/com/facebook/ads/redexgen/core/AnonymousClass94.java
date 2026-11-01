package com.facebook.ads.redexgen.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.94, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AnonymousClass94 implements InterfaceC2464lj {
    public int A00;

    @MetaExoPlayerCustomization(type = {"MERGED"}, value = "https://github.com/androidx/media/pull/1742")
    public boolean A01;
    public final int A02;
    public final long[] A03;
    public final C2654or[] A04;
    public final int A05;
    public final C2620oH A06;
    public final int[] A07;

    public AnonymousClass94(C2620oH c2620oH, int[] iArr, int i10) {
        C3M.A08(iArr.length > 0);
        this.A02 = i10;
        this.A06 = (C2620oH) C3M.A01(c2620oH);
        this.A05 = iArr.length;
        this.A04 = new C2654or[this.A05];
        for (int i11 = 0; i11 < i; i11++) {
            C2654or[] c2654orArr = this.A04;
            int i12 = iArr[i11];
            c2654orArr[i11] = c2620oH.A08(i12);
        }
        Arrays.sort(this.A04, new Comparator() { // from class: com.facebook.ads.redexgen.X.Dt
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return AnonymousClass94.A07((C2654or) obj, (C2654or) obj2);
            }
        });
        this.A07 = new int[this.A05];
        for (int i13 = 0; i13 < i; i13++) {
            int[] iArr2 = this.A07;
            int i14 = c2620oH.A07(this.A04[i13]);
            iArr2[i13] = i14;
        }
        int i15 = this.A05;
        this.A03 = new long[i15];
        this.A01 = false;
    }

    public static /* synthetic */ int A07(C2654or c2654or, C2654or c2654or2) {
        return c2654or2.A05 - c2654or.A05;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2464lj
    public void A5p() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2464lj
    public void A6C() {
    }

    @Override // com.facebook.ads.redexgen.core.EE
    public final C2654or A83(int i10) {
        return this.A04[i10];
    }

    @Override // com.facebook.ads.redexgen.core.EE
    public final int A89(int i10) {
        return this.A07[i10];
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2464lj
    public final C2654or A8u() {
        return this.A04[A8v()];
    }

    @Override // com.facebook.ads.redexgen.core.EE
    public final C2620oH A9D() {
        return this.A06;
    }

    @Override // com.facebook.ads.redexgen.core.EE
    public final int A9y(int i10) {
        for (int i11 = 0; i11 < i; i11++) {
            int i12 = this.A07[i11];
            if (i12 == i10) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2464lj
    public void AEc(float f10) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AnonymousClass94 anonymousClass94 = (AnonymousClass94) obj;
        return this.A06 == anonymousClass94.A06 && Arrays.equals(this.A07, anonymousClass94.A07);
    }

    public final int hashCode() {
        if (this.A00 == 0) {
            this.A00 = (System.identityHashCode(this.A06) * 31) + Arrays.hashCode(this.A07);
        }
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.EE
    public final int length() {
        return this.A07.length;
    }
}
