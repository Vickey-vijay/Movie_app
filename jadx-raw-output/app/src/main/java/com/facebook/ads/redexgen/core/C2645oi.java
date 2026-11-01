package com.facebook.ads.redexgen.core;

import android.os.Bundle;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.oi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2645oi implements C1S {
    public final C2649om A00;

    @Deprecated
    public final C11009r A01;
    public final C2647ok A02;
    public final C2Q A03;

    @Deprecated
    public final C2646oj A04;
    public final C2643og A05;
    public final String A06;
    public static String[] A07 = {"wAM8vtdO0lmHfSdh0aX8JSKdnwpCp9D2", "", "J6SB4ddL0FfEeVIHYuGnUGetWM2QRdUO", "0HTq7SjPEUFdYYph8tikUta3pLjb69Rn", "wGA6vSFg01QHk42FD2L8p637KRkqAXcn", "9eG6h6QaFREs2gWO0", "Z5vutuZNVsi2rK7c87KXUNl8wBJYnGEL", "V2BGt2aUfGoyLxnwwGFsOMeTNor3H3xe"};
    public static final C2645oi A09 = new C2I().A05();
    public static final C1R<C2645oi> A08 = new C1R() { // from class: com.facebook.ads.redexgen.X.oo
        @Override // com.facebook.ads.redexgen.core.C1R
        public final C1S A6X(Bundle bundle) {
            return C2645oi.A00(bundle);
        }
    };

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C2645oi A00(Bundle bundle) {
        String str = (String) C3M.A01(bundle.getString(A02(0), ""));
        Bundle bundle2 = bundle.getBundle(A02(1));
        C2647ok c2647ok = bundle2 == null ? C2647ok.A07 : (C2647ok) C2647ok.A06.A6X(bundle2);
        Bundle bundle3 = bundle.getBundle(A02(2));
        C2643og c2643og = bundle3 == null ? C2643og.A0Z : (C2643og) C2643og.A0Y.A6X(bundle3);
        Bundle bundle4 = bundle.getBundle(A02(3));
        return new C2645oi(str, bundle4 == null ? C11009r.A00 : (C11009r) C2649om.A05.A6X(bundle4), null, c2647ok, c2643og);
    }

    public C2645oi(String str, C11009r c11009r, C2646oj c2646oj, C2647ok c2647ok, C2643og c2643og) {
        this.A06 = str;
        this.A03 = c2646oj;
        this.A04 = c2646oj;
        this.A02 = c2647ok;
        this.A05 = c2643og;
        this.A00 = c11009r;
        this.A01 = c11009r;
    }

    public static String A02(int i10) {
        return Integer.toString(i10, 36);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2645oi)) {
            return false;
        }
        C2645oi c2645oi = (C2645oi) obj;
        if (AbstractC09664a.A1E(this.A06, c2645oi.A06)) {
            C2649om c2649om = this.A00;
            C2649om c2649om2 = c2645oi.A00;
            String[] strArr = A07;
            if (strArr[7].charAt(22) != strArr[2].charAt(22)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[7] = "WE1TlvFnuMEFfhCqOSZQGPel0cAOxnij";
            strArr2[2] = "QIjSvgjDyRqWUwkha5pDZVewjWBdao8T";
            if (c2649om.equals(c2649om2) && AbstractC09664a.A1E(this.A03, c2645oi.A03) && AbstractC09664a.A1E(this.A02, c2645oi.A02) && AbstractC09664a.A1E(this.A05, c2645oi.A05)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int result = this.A06.hashCode();
        int i10 = result * 31;
        int result2 = this.A03 != null ? this.A03.hashCode() : 0;
        int iHashCode = (((i10 + result2) * 31) + this.A02.hashCode()) * 31;
        C2649om c2649om = this.A00;
        String[] strArr = A07;
        String str = strArr[4];
        String str2 = strArr[3];
        int iCharAt = str.charAt(31);
        int result3 = str2.charAt(31);
        if (iCharAt != result3) {
            throw new RuntimeException();
        }
        String[] strArr2 = A07;
        strArr2[7] = "oKnJE1KY80M0C2djBAWfSHeSjkObNKTB";
        strArr2[2] = "bdrBBUaZbF1SVnsIGw0ZL6eMFfyDgZAn";
        int result4 = c2649om.hashCode();
        return ((iHashCode + result4) * 31) + this.A05.hashCode();
    }
}
