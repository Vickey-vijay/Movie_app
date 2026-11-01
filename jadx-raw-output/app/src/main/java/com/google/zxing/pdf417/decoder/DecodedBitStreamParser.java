package com.google.zxing.pdf417.decoder;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import c6.d;
import com.google.zxing.FormatException;
import com.google.zxing.common.CharacterSetECI;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import p6.c;

/* JADX INFO: loaded from: classes6.dex */
public final class DecodedBitStreamParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f20877a = ";<>@[\\]_`~!\r\t,:\n-.$/\"|*()?{}'".toCharArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final char[] f20878b = "0123456789&\r\t,:#-.$/+%*=^".toCharArray();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final BigInteger[] f20879c;

    public enum Mode {
        ALPHA,
        LOWER,
        MIXED,
        PUNCT,
        ALPHA_SHIFT,
        PUNCT_SHIFT
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x0033. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x0036. Please report as an issue. */
    public static int g(int[] iArr, int i10, StringBuilder sb2) {
        int i11 = iArr[0];
        int[] iArr2 = new int[(i11 - i10) << 1];
        int[] iArr3 = new int[(i11 - i10) << 1];
        boolean z10 = false;
        int i12 = 0;
        while (i10 < iArr[0] && !z10) {
            int i13 = i10 + 1;
            int i14 = iArr[i10];
            if (i14 < 900) {
                iArr2[i12] = i14 / 30;
                iArr2[i12 + 1] = i14 % 30;
                i12 += 2;
            } else if (i14 != 913) {
                if (i14 != 928) {
                    switch (i14) {
                        case TypedValues.Custom.TYPE_INT /* 900 */:
                            iArr2[i12] = 900;
                            i12++;
                            break;
                        case 901:
                        case 902:
                            break;
                        default:
                            switch (i14) {
                                case 922:
                                case 923:
                                case 924:
                                    break;
                                default:
                                    break;
                            }
                            break;
                    }
                }
                i10 = i13 - 1;
                z10 = true;
            } else {
                iArr2[i12] = 913;
                i10 = i13 + 1;
                iArr3[i12] = iArr[i13];
                i12++;
            }
            i10 = i13;
        }
        e(iArr2, iArr3, i12, sb2);
        return i10;
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f20881a;

        static {
            int[] iArr = new int[Mode.values().length];
            f20881a = iArr;
            try {
                iArr[Mode.ALPHA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20881a[Mode.LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20881a[Mode.MIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20881a[Mode.PUNCT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20881a[Mode.ALPHA_SHIFT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20881a[Mode.PUNCT_SHIFT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    static {
        BigInteger[] bigIntegerArr = new BigInteger[16];
        f20879c = bigIntegerArr;
        bigIntegerArr[0] = BigInteger.ONE;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(900L);
        bigIntegerArr[1] = bigIntegerValueOf;
        int i10 = 2;
        while (true) {
            BigInteger[] bigIntegerArr2 = f20879c;
            if (i10 >= bigIntegerArr2.length) {
                return;
            }
            bigIntegerArr2[i10] = bigIntegerArr2[i10 - 1].multiply(bigIntegerValueOf);
            i10++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0045 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0021 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:34:0x0077. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:35:0x007a. Please report as an issue. */
    /* JADX WARN: Switch 'out' block B:29:0x0064 for B:34:0x0077 already processed. Defaulting to fallback option. */
    /* JADX WARN: Switch 'out' block B:29:0x0064 for B:35:0x007a already processed. Defaulting to fallback option. */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Unknown Source)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:419)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:399)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:31)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:21)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    public static int a(int r16, int[] r17, java.nio.charset.Charset r18, int r19, java.lang.StringBuilder r20) {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.pdf417.decoder.DecodedBitStreamParser.a(int, int[], java.nio.charset.Charset, int, java.lang.StringBuilder):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:17:0x004e  */
    public static d b(int[] iArr, String str) throws FormatException {
        int iG;
        StringBuilder sb2 = new StringBuilder(iArr.length << 1);
        Charset charsetForName = StandardCharsets.ISO_8859_1;
        int i10 = iArr[1];
        c cVar = new c();
        int i11 = 2;
        while (i11 < iArr[0]) {
            if (i10 != 913) {
                switch (i10) {
                    case TypedValues.Custom.TYPE_INT /* 900 */:
                        iG = g(iArr, i11, sb2);
                        break;
                    case 901:
                        iG = a(i10, iArr, charsetForName, i11, sb2);
                        break;
                    case 902:
                        iG = f(iArr, i11, sb2);
                        break;
                    default:
                        switch (i10) {
                            case 922:
                            case 923:
                                throw FormatException.getFormatInstance();
                            case 924:
                                iG = a(i10, iArr, charsetForName, i11, sb2);
                                break;
                            case 925:
                                iG = i11 + 1;
                                break;
                            case 926:
                                iG = i11 + 2;
                                break;
                            case 927:
                                iG = i11 + 1;
                                charsetForName = Charset.forName(CharacterSetECI.getCharacterSetECIByValue(iArr[i11]).name());
                                break;
                            case 928:
                                iG = d(iArr, i11, cVar);
                                break;
                            default:
                                iG = g(iArr, i11 - 1, sb2);
                                break;
                        }
                        break;
                }
            } else {
                iG = i11 + 1;
                sb2.append((char) iArr[i11]);
            }
            if (iG >= iArr.length) {
                throw FormatException.getFormatInstance();
            }
            i11 = iG + 1;
            i10 = iArr[iG];
        }
        if (sb2.length() == 0) {
            throw FormatException.getFormatInstance();
        }
        d dVar = new d(null, sb2.toString(), null, str);
        dVar.m(cVar);
        return dVar;
    }

    public static String c(int[] iArr, int i10) throws FormatException {
        BigInteger bigIntegerAdd = BigInteger.ZERO;
        for (int i11 = 0; i11 < i10; i11++) {
            bigIntegerAdd = bigIntegerAdd.add(f20879c[(i10 - i11) - 1].multiply(BigInteger.valueOf(iArr[i11])));
        }
        String string = bigIntegerAdd.toString();
        if (string.charAt(0) == '1') {
            return string.substring(1);
        }
        throw FormatException.getFormatInstance();
    }

    public static int d(int[] iArr, int i10, c cVar) throws FormatException {
        if (i10 + 2 > iArr[0]) {
            throw FormatException.getFormatInstance();
        }
        int[] iArr2 = new int[2];
        int i11 = 0;
        while (i11 < 2) {
            iArr2[i11] = iArr[i10];
            i11++;
            i10++;
        }
        cVar.j(Integer.parseInt(c(iArr2, 2)));
        StringBuilder sb2 = new StringBuilder();
        int iG = g(iArr, i10, sb2);
        cVar.d(sb2.toString());
        int i12 = iArr[iG] == 923 ? iG + 1 : -1;
        while (iG < iArr[0]) {
            int i13 = iArr[iG];
            if (i13 == 922) {
                iG++;
                cVar.g(true);
            } else {
                if (i13 != 923) {
                    throw FormatException.getFormatInstance();
                }
                int i14 = iG + 1;
                switch (iArr[i14]) {
                    case 0:
                        StringBuilder sb3 = new StringBuilder();
                        iG = g(iArr, i14 + 1, sb3);
                        cVar.e(sb3.toString());
                        break;
                    case 1:
                        StringBuilder sb4 = new StringBuilder();
                        iG = f(iArr, i14 + 1, sb4);
                        cVar.i(Integer.parseInt(sb4.toString()));
                        break;
                    case 2:
                        StringBuilder sb5 = new StringBuilder();
                        iG = f(iArr, i14 + 1, sb5);
                        cVar.l(Long.parseLong(sb5.toString()));
                        break;
                    case 3:
                        StringBuilder sb6 = new StringBuilder();
                        iG = g(iArr, i14 + 1, sb6);
                        cVar.k(sb6.toString());
                        break;
                    case 4:
                        StringBuilder sb7 = new StringBuilder();
                        iG = g(iArr, i14 + 1, sb7);
                        cVar.b(sb7.toString());
                        break;
                    case 5:
                        StringBuilder sb8 = new StringBuilder();
                        iG = f(iArr, i14 + 1, sb8);
                        cVar.f(Long.parseLong(sb8.toString()));
                        break;
                    case 6:
                        StringBuilder sb9 = new StringBuilder();
                        iG = f(iArr, i14 + 1, sb9);
                        cVar.c(Integer.parseInt(sb9.toString()));
                        break;
                    default:
                        throw FormatException.getFormatInstance();
                }
            }
        }
        if (i12 != -1) {
            int i15 = iG - i12;
            if (cVar.a()) {
                i15--;
            }
            cVar.h(Arrays.copyOfRange(iArr, i12, i15 + i12));
        }
        return iG;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:42:0x008d  */
    public static void e(int[] iArr, int[] iArr2, int i10, StringBuilder sb2) {
        Mode mode;
        int i11;
        Mode mode2 = Mode.ALPHA;
        Mode mode3 = mode2;
        for (int i12 = 0; i12 < i10; i12++) {
            int i13 = iArr[i12];
            char c10 = ' ';
            switch (a.f20881a[mode2.ordinal()]) {
                case 1:
                    if (i13 < 26) {
                        i11 = i13 + 65;
                        c10 = (char) i11;
                    } else {
                        if (i13 == 900) {
                            mode2 = Mode.ALPHA;
                        } else if (i13 != 913) {
                            switch (i13) {
                                case 27:
                                    mode2 = Mode.LOWER;
                                    break;
                                case 28:
                                    mode2 = Mode.MIXED;
                                    break;
                                case 29:
                                    mode = Mode.PUNCT_SHIFT;
                                    c10 = 0;
                                    Mode mode4 = mode;
                                    mode3 = mode2;
                                    mode2 = mode4;
                                    break;
                            }
                        } else {
                            sb2.append((char) iArr2[i12]);
                        }
                        c10 = 0;
                    }
                    break;
                case 2:
                    if (i13 < 26) {
                        i11 = i13 + 97;
                        c10 = (char) i11;
                    } else {
                        if (i13 == 900) {
                            mode2 = Mode.ALPHA;
                        } else if (i13 != 913) {
                            switch (i13) {
                                case 27:
                                    mode = Mode.ALPHA_SHIFT;
                                    c10 = 0;
                                    Mode mode5 = mode;
                                    mode3 = mode2;
                                    mode2 = mode5;
                                    break;
                                case 28:
                                    mode2 = Mode.MIXED;
                                    break;
                                case 29:
                                    mode = Mode.PUNCT_SHIFT;
                                    c10 = 0;
                                    Mode mode6 = mode;
                                    mode3 = mode2;
                                    mode2 = mode6;
                                    break;
                            }
                        } else {
                            sb2.append((char) iArr2[i12]);
                        }
                        c10 = 0;
                    }
                    break;
                case 3:
                    if (i13 < 25) {
                        c10 = f20878b[i13];
                    } else if (i13 == 900) {
                        mode2 = Mode.ALPHA;
                        c10 = 0;
                    } else {
                        if (i13 != 913) {
                            switch (i13) {
                                case 25:
                                    mode2 = Mode.PUNCT;
                                    break;
                                case 27:
                                    mode2 = Mode.LOWER;
                                    break;
                                case 28:
                                    mode2 = Mode.ALPHA;
                                    break;
                                case 29:
                                    mode = Mode.PUNCT_SHIFT;
                                    c10 = 0;
                                    Mode mode7 = mode;
                                    mode3 = mode2;
                                    mode2 = mode7;
                                    break;
                            }
                        } else {
                            sb2.append((char) iArr2[i12]);
                        }
                        c10 = 0;
                    }
                    break;
                case 4:
                    if (i13 < 29) {
                        c10 = f20877a[i13];
                    } else {
                        if (i13 == 29 || i13 == 900) {
                            mode2 = Mode.ALPHA;
                        } else if (i13 == 913) {
                            sb2.append((char) iArr2[i12]);
                        }
                        c10 = 0;
                    }
                    break;
                case 5:
                    if (i13 < 26) {
                        c10 = (char) (i13 + 65);
                    } else if (i13 != 26) {
                        mode2 = i13 != 900 ? mode3 : Mode.ALPHA;
                        c10 = 0;
                    }
                    mode2 = mode3;
                    break;
                case 6:
                    if (i13 < 29) {
                        c10 = f20877a[i13];
                    } else if (i13 == 29 || i13 == 900) {
                        mode2 = Mode.ALPHA;
                        c10 = 0;
                    } else {
                        if (i13 == 913) {
                            sb2.append((char) iArr2[i12]);
                        }
                        c10 = 0;
                    }
                    mode2 = mode3;
                    break;
                default:
                    c10 = 0;
                    break;
            }
            if (c10 != 0) {
                sb2.append(c10);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x002c  */
    public static int f(int[] iArr, int i10, StringBuilder sb2) throws FormatException {
        int[] iArr2 = new int[15];
        boolean z10 = false;
        int i11 = 0;
        while (true) {
            int i12 = iArr[0];
            if (i10 < i12 && !z10) {
                int i13 = i10 + 1;
                int i14 = iArr[i10];
                if (i13 == i12) {
                    z10 = true;
                }
                if (i14 >= 900) {
                    if (i14 != 900 && i14 != 901 && i14 != 928) {
                        switch (i14) {
                            case 922:
                            case 923:
                            case 924:
                                i13--;
                                z10 = true;
                                break;
                        }
                    } else {
                        i13--;
                        z10 = true;
                    }
                } else {
                    iArr2[i11] = i14;
                    i11++;
                }
                if ((i11 % 15 == 0 || i14 == 902 || z10) && i11 > 0) {
                    sb2.append(c(iArr2, i11));
                    i11 = 0;
                }
                i10 = i13;
            }
        }
        return i10;
    }
}
