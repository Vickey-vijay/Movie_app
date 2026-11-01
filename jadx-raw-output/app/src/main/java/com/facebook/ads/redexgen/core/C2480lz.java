package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.lz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2480lz extends E5<C2480lz> implements Comparable<C2480lz> {
    public static String[] A0I = {"kuPF6Ds61I7lkNvdz9bcVPsTInik8V3M", "Qk0zKRkYsaxRz9XBLHG1rmY7ne3qL", "U5xl3sY91uvZaW", "4oEkNGaUX02G9U6MTdWApFSB5pjWlUNx", "CFtCC3eFdvC", "EnNVjubCw6rdwWEp5vRTdV2Ipxq1ST06", "834ujo2VifTXBI2K", "5tr2zEJniV6LNy5ijK5ku"};
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final AnonymousClass93 A0A;
    public final String A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public C2480lz(int i10, C2620oH c2620oH, int i11, AnonymousClass93 anonymousClass93, int i12, boolean z10, InterfaceC2320jB<C2654or> interfaceC2320jB) {
        super(i10, c2620oH, i11);
        this.A0A = anonymousClass93;
        this.A0B = AnonymousClass92.A0K(super.A02.A0V);
        this.A0F = AnonymousClass92.A0S(i12, false);
        int i13 = 0;
        int i14 = Integer.MAX_VALUE;
        for (int i15 = 0; i15 < anonymousClass93.A0I.size(); i15++) {
            int iA02 = AnonymousClass92.A02(super.A02, anonymousClass93.A0I.get(i15), false);
            if (iA02 > 0) {
                i14 = i15;
                i13 = iA02;
                break;
            }
        }
        this.A04 = i14;
        this.A05 = i13;
        this.A07 = AnonymousClass92.A00(super.A02.A0E, ((C2613oA) anonymousClass93).A0B);
        this.A0C = super.A02.A0E == 0 || (super.A02.A0E & 1) != 0;
        this.A0D = (super.A02.A0H & 1) != 0;
        this.A01 = super.A02.A06;
        this.A08 = super.A02.A0G;
        this.A00 = super.A02.A05;
        this.A0E = (super.A02.A05 == -1 || super.A02.A05 <= ((C2613oA) anonymousClass93).A01) && (super.A02.A06 == -1 || super.A02.A06 <= ((C2613oA) anonymousClass93).A02) && interfaceC2320jB.A44(super.A02);
        String[] strArrA1L = AbstractC09664a.A1L();
        int i16 = Integer.MAX_VALUE;
        int i17 = 0;
        for (int i18 = 0; i18 < strArrA1L.length; i18++) {
            int iA03 = AnonymousClass92.A02(super.A02, strArrA1L[i18], false);
            if (iA03 > 0) {
                i16 = i18;
                i17 = iA03;
                break;
            }
        }
        this.A02 = i16;
        this.A03 = i17;
        int i19 = Integer.MAX_VALUE;
        for (int i20 = 0; i20 < anonymousClass93.A0J.size(); i20++) {
            if (super.A02.A0W != null && super.A02.A0W.equals(anonymousClass93.A0J.get(i20))) {
                i19 = i20;
                break;
            }
        }
        this.A06 = i19;
        this.A0H = AnonymousClass76.A02(i12) == 128;
        this.A0G = AnonymousClass76.A04(i12) == 64;
        this.A09 = A00(i12, z10);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static int A02(List<C2480lz> list, List<C2480lz> list2) {
        return ((C2480lz) Collections.max(list)).compareTo((C2480lz) Collections.max(list2));
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static AbstractC1121Am<C2480lz> A03(int i10, C2620oH c2620oH, AnonymousClass93 anonymousClass93, int[] iArr, boolean z10, InterfaceC2320jB<C2654or> interfaceC2320jB) {
        C08971h c08971hA01 = AbstractC1121Am.A01();
        for (int i11 = 0; i11 < c2620oH.A01; i11++) {
            c08971hA01.A04(new C2480lz(i10, c2620oH, i11, anonymousClass93, iArr[i11], z10, interfaceC2320jB));
        }
        return c08971hA01.A05();
    }

    private int A00(int i10, boolean z10) {
        if (!AnonymousClass92.A0S(i10, this.A0A.A0B)) {
            return 0;
        }
        if (!this.A0E && !this.A0A.A09) {
            return 0;
        }
        if (AnonymousClass92.A0S(i10, false) && this.A0E && super.A02.A05 != -1 && !this.A0A.A0N && !this.A0A.A0O && (this.A0A.A04 || !z10)) {
            return 2;
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oV != com.google.common.collect.Ordering<java.lang.Integer> */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C2480lz c2480lz) {
        AbstractC2633oV abstractC2633oVA06;
        AbstractC2633oV abstractC2633oVA07 = (this.A0E && this.A0F) ? AnonymousClass92.A09 : AnonymousClass92.A09.A06();
        AbstractC2485m4 abstractC2485m4A08 = AbstractC2485m4.A01().A09(this.A0F, c2480lz.A0F).A08(Integer.valueOf(this.A04), Integer.valueOf(c2480lz.A04), AbstractC2633oV.A03().A06()).A06(this.A05, c2480lz.A05).A06(this.A07, c2480lz.A07).A09(this.A0D, c2480lz.A0D).A09(this.A0C, c2480lz.A0C).A08(Integer.valueOf(this.A02), Integer.valueOf(c2480lz.A02), AbstractC2633oV.A03().A06()).A06(this.A03, c2480lz.A03).A09(this.A0E, c2480lz.A0E).A08(Integer.valueOf(this.A06), Integer.valueOf(c2480lz.A06), AbstractC2633oV.A03().A06());
        Integer numValueOf = Integer.valueOf(this.A00);
        Integer numValueOf2 = Integer.valueOf(c2480lz.A00);
        if (this.A0A.A0O) {
            abstractC2633oVA06 = AnonymousClass92.A09.A06();
        } else {
            abstractC2633oVA06 = AnonymousClass92.A0A;
        }
        AbstractC2485m4 abstractC2485m4A09 = abstractC2485m4A08.A08(numValueOf, numValueOf2, abstractC2633oVA06).A09(this.A0H, c2480lz.A0H).A09(this.A0G, c2480lz.A0G).A08(Integer.valueOf(this.A01), Integer.valueOf(c2480lz.A01), abstractC2633oVA07).A08(Integer.valueOf(this.A08), Integer.valueOf(c2480lz.A08), abstractC2633oVA07);
        Integer numValueOf3 = Integer.valueOf(this.A00);
        Integer numValueOf4 = Integer.valueOf(c2480lz.A00);
        if (!AbstractC09664a.A1E(this.A0B, c2480lz.A0B)) {
            abstractC2633oVA07 = AnonymousClass92.A0A;
        }
        return abstractC2485m4A09.A08(numValueOf3, numValueOf4, abstractC2633oVA07).A05();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:10:0x0036  */
    @Override // com.facebook.ads.redexgen.core.E5
    /* JADX INFO: renamed from: A04, reason: merged with bridge method [inline-methods] */
    public final boolean A09(C2480lz c2480lz) {
        if (this.A0A.A00) {
            if ((!this.A0A.A02 || (super.A02.A0W != null && TextUtils.equals(super.A02.A0W, ((E5) c2480lz).A02.A0W))) && ((this.A0A.A03 || (super.A02.A0G != -1 && super.A02.A0G == ((E5) c2480lz).A02.A0G)) && (this.A0A.A01 || (this.A0H == c2480lz.A0H && this.A0G == c2480lz.A0G)))) {
            }
        } else if (super.A02.A06 != -1) {
            int i10 = super.A02.A06;
            String[] strArr = A0I;
            if (strArr[5].charAt(5) == strArr[0].charAt(5)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0I;
            strArr2[5] = "4j0Ebeo7wJOJZxGoc5hIgJQJaA3nIP6d";
            strArr2[0] = "7JU6hRyIHJ6Xx4Pnq3EsCWmSiYve8JpD";
            if (i10 == ((E5) c2480lz).A02.A06) {
                return !this.A0A.A02 ? true : true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.E5
    public final int A08() {
        return this.A09;
    }
}
