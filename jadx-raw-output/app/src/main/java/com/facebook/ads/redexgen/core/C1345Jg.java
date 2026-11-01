package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Jg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1345Jg {
    public static byte[] A03;
    public static String[] A04 = {"", "Q0QXG7UXIASt6u", "Y6SVRxSvJsGy", "wBfOUWbjS5LHnahIVXYrmUjJKL6", "ipHEpqQaRUeTeVi", "GLcEQz2dRHwid1MPYevx9K5BLffqxfdD", "Wfr02cBS22Xusns9ZD5ofvGEf4mY", "O3Zlf7dyK7vHpITYdVNftiUJDGPL2j8I"};
    public static final AbstractC1120Al<String> A05;
    public static final AbstractC1120Al<String> A06;
    public static final AbstractC1120Al<String> A07;
    public static final AbstractC1120Al<String> A08;
    public static final Pattern A09;
    public final int A00;
    public final int A01;
    public final int A02;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:11:0x0042  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:4:0x0020  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f9  */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 13 out of bounds for length 10
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static C1345Jg A00(AbstractC1120Al<String> abstractC1120Al) {
        byte b10;
        int i10;
        byte b11;
        int i11;
        int i12;
        int i13;
        AH ahA02 = AbstractC2657ou.A02(A07, abstractC1120Al);
        String strA02 = A02(41, 7, 120);
        String str = (String) AbstractC2556nE.A00(ahA02, strA02);
        byte b12 = 2;
        byte b13 = 1;
        switch (str.hashCode()) {
            case -1392885889:
                if (!str.equals(A02(12, 6, 124))) {
                    b10 = -1;
                } else {
                    b10 = 2;
                }
                break;
            case -1106037339:
                if (!str.equals(strA02)) {
                    b10 = -1;
                } else {
                    b10 = 1;
                }
                break;
            case 92734940:
                if (!str.equals(A02(3, 5, 92))) {
                    b10 = -1;
                } else {
                    b10 = 0;
                }
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
                i10 = 2;
                break;
            case 1:
                i10 = -2;
                break;
            default:
                i10 = 1;
                break;
        }
        AH ahA03 = AbstractC2657ou.A02(A08, abstractC1120Al);
        if (!ahA03.isEmpty()) {
            String str2 = (String) ahA03.iterator().next();
            switch (str2.hashCode()) {
                case 3005871:
                    if (!str2.equals(A02(8, 4, 55))) {
                        b13 = -1;
                    }
                    break;
                case 3387192:
                    if (!str2.equals(A02(33, 4, 110))) {
                        b13 = -1;
                    } else {
                        b13 = 0;
                    }
                    break;
                default:
                    b13 = -1;
                    break;
            }
            switch (b13) {
                case 0:
                    i13 = 0;
                    break;
                default:
                    i13 = -1;
                    break;
            }
            return new C1345Jg(i13, 0, i10);
        }
        AH ahA04 = AbstractC2657ou.A02(A05, abstractC1120Al);
        AH ahA05 = AbstractC2657ou.A02(A06, abstractC1120Al);
        if (ahA04.isEmpty() && ahA05.isEmpty()) {
            return new C1345Jg(-1, 0, i10);
        }
        String strA03 = A02(27, 6, 34);
        String str3 = (String) AbstractC2556nE.A00(ahA04, strA03);
        switch (str3.hashCode()) {
            case -1274499742:
                if (!str3.equals(strA03)) {
                    b11 = -1;
                } else {
                    b11 = 1;
                }
                break;
            case 3417674:
                if (!str3.equals(A02(37, 4, 110))) {
                    b11 = -1;
                } else {
                    b11 = 0;
                }
                break;
            default:
                b11 = -1;
                break;
        }
        switch (b11) {
            case 0:
                i11 = 2;
                break;
            default:
                i11 = 1;
                break;
        }
        String strA04 = A02(18, 6, 126);
        String str4 = (String) AbstractC2556nE.A00(ahA05, strA04);
        switch (str4.hashCode()) {
            case -1360216880:
                if (!str4.equals(strA04)) {
                    b12 = -1;
                }
                switch (b12) {
                    case 0:
                        i12 = 2;
                        break;
                    case 1:
                        i12 = 3;
                        break;
                    default:
                        i12 = 1;
                        break;
                }
                return new C1345Jg(i12, i11, i10);
            case -905816648:
                String[] strArr = A04;
                if (strArr[1].length() == strArr[3].length()) {
                    throw new RuntimeException();
                }
                A04[2] = "eITMiFQvxpZW";
                if (str4.equals(A02(48, 6, 85))) {
                    b12 = 1;
                } else {
                    b12 = -1;
                }
                switch (b12) {
                    case 0:
                        i12 = 2;
                        break;
                    case 1:
                        i12 = 3;
                        break;
                    default:
                        i12 = 1;
                        break;
                }
                return new C1345Jg(i12, i11, i10);
            case 99657:
                if (str4.equals(A02(24, 3, 110))) {
                    b12 = 0;
                } else {
                    b12 = -1;
                }
                switch (b12) {
                    case 0:
                        i12 = 2;
                        break;
                    case 1:
                        i12 = 3;
                        break;
                    default:
                        i12 = 1;
                        break;
                }
                return new C1345Jg(i12, i11, i10);
            default:
                b12 = -1;
                switch (b12) {
                    case 0:
                        i12 = 2;
                        break;
                    case 1:
                        i12 = 3;
                        break;
                    default:
                        i12 = 1;
                        break;
                }
                return new C1345Jg(i12, i11, i10);
        }
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 95);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A03 = new byte[]{56, 23, 79, 98, 101, 119, 102, 113, 9, 29, 28, 7, 65, 70, 69, 76, 81, 70, 66, 72, 83, 66, 77, 68, 85, 94, 69, 27, 20, 17, 17, 24, 25, 95, 94, 95, 84, 94, 65, 84, 95, 72, 82, 83, 84, 78, 67, 66, 121, 111, 121, 107, 103, 111};
    }

    static {
        A03();
        A09 = Pattern.compile(A02(0, 3, 59));
        A08 = AbstractC1120Al.A05(A02(8, 4, 55), A02(33, 4, 110));
        A06 = AbstractC1120Al.A06(A02(24, 3, 110), A02(48, 6, 85), A02(18, 6, 126));
        A05 = AbstractC1120Al.A05(A02(27, 6, 34), A02(37, 4, 110));
        A07 = AbstractC1120Al.A06(A02(3, 5, 92), A02(12, 6, 124), A02(41, 7, 120));
    }

    public C1345Jg(int i10, int i11, int i12) {
        this.A01 = i10;
        this.A00 = i11;
        this.A02 = i12;
    }

    public static C1345Jg A01(String str) {
        if (str == null) {
            return null;
        }
        String parsingValue = AbstractC2284iY.A01(str.trim());
        if (parsingValue.isEmpty()) {
            return null;
        }
        AbstractC1120Al abstractC1120AlA08 = AbstractC1120Al.A08(TextUtils.split(parsingValue, A09));
        String[] strArr = A04;
        if (strArr[1].length() == strArr[3].length()) {
            throw new RuntimeException();
        }
        A04[5] = "GSUJCg4XeXOvDUAO5uYW1LZcLl5OFxUg";
        return A00(abstractC1120AlA08);
    }
}
