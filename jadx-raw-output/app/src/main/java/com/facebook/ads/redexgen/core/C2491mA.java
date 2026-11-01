package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.mA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2491mA implements C1S {
    public static byte[] A03;
    public static String[] A04 = {"kjXOolT", "y1uosoppcQ2KAnagmdUHUDs2pqKkNOP", "9S5fCrLfVI6Z6wWSlA", "LW4KLvv", "ESAoxwChDjEBJ2YD38hEjiU5IsN", "MD8cz6uZEkXt7x64XO0blzPRBkN5Dhm8", "wv8vTraLOdvtLK52tGc0aCYgNtDO0cFF", "ftZS2reRIxcEfCn6parOlN78mV3R9Y2K"};
    public static final C1R<C2491mA> A05;
    public static final C2491mA A06;
    public static final String A07;
    public int A00;
    public final int A01;
    public final AbstractC1121Am<C2620oH> A02;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 95);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        byte[] bArr = {119, 79, 86, 78, 83, 74, 86, 95, 26, 83, 94, 95, 84, 78, 83, 89, 91, 86, 26, 110, 72, 91, 89, 81, 125, 72, 85, 79, 74, 73, 26, 91, 94, 94, 95, 94, 26, 78, 85, 26, 85, 84, 95, 26, 110, 72, 91, 89, 81, 125, 72, 85, 79, 74, 123, 72, 72, 91, 67, 20, 81, 119, 100, 102, 110, 66, 119, 106, 112, 117, 68, 119, 119, 100, 124};
        if (A04[5].charAt(31) == 'Q') {
            throw new RuntimeException();
        }
        A04[4] = "LoVxB454";
        A03 = bArr;
    }

    static {
        A03();
        A06 = new C2491mA(new C2620oH[0]);
        A07 = AbstractC09664a.A0h(0);
        A05 = new C1R() { // from class: com.facebook.ads.redexgen.X.mB
            @Override // com.facebook.ads.redexgen.core.C1R
            public final C1S A6X(Bundle bundle) {
                return C2491mA.A00(bundle);
            }
        };
    }

    public C2491mA(C2620oH... c2620oHArr) {
        this.A02 = AbstractC1121Am.A07(c2620oHArr);
        this.A01 = c2620oHArr.length;
        A02();
    }

    public static /* synthetic */ C2491mA A00(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(A07);
        if (parcelableArrayList == null) {
            return new C2491mA(new C2620oH[0]);
        }
        return new C2491mA((C2620oH[]) C3S.A01(C2620oH.A06, parcelableArrayList).toArray(new C2620oH[0]));
    }

    private void A02() {
        for (int i10 = 0; i10 < i; i10++) {
            for (int i11 = i10 + 1; i11 < i; i11++) {
                if (this.A02.get(i10).equals(this.A02.get(i11))) {
                    AnonymousClass44.A08(A01(60, 15, 90), A01(0, 0, 115), new IllegalArgumentException(A01(0, 60, 101)));
                }
            }
        }
    }

    public final int A04(C2620oH c2620oH) {
        int index = this.A02.indexOf(c2620oH);
        if (index >= 0) {
            return index;
        }
        return -1;
    }

    public final C2620oH A05(int i10) {
        return this.A02.get(i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C2491mA c2491mA = (C2491mA) obj;
        return this.A01 == c2491mA.A01 && this.A02.equals(c2491mA.A02);
    }

    public final int hashCode() {
        if (this.A00 == 0) {
            this.A00 = this.A02.hashCode();
        }
        int i10 = this.A00;
        String[] strArr = A04;
        if (strArr[3].length() != strArr[0].length()) {
            throw new RuntimeException();
        }
        A04[6] = "ifk0Ba0Zppjn7MlaJBrmzFqZbJ0HKklT";
        return i10;
    }
}
