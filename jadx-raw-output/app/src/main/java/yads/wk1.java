package yads;

import android.media.MediaCodecInfo;
import android.util.Base64;
import android.util.Pair;
import com.inmobi.media.core.config.models.AdConfig;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import yads.ik1;
import yads.wk1;

/* JADX INFO: loaded from: classes10.dex */
public abstract class wk1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f84238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f84239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f84240c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f84241d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f84242e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f84243f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f84244g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f84245h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f84246i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f84247j;

    public static String a(mx0 mx0Var) {
        Pair pairB;
        if ("audio/eac3-joc".equals(mx0Var.f80429m)) {
            return "audio/eac3";
        }
        if (!"video/dolby-vision".equals(mx0Var.f80429m) || (pairB = b(mx0Var)) == null) {
            return null;
        }
        int iIntValue = ((Integer) pairB.first).intValue();
        if (iIntValue == 16 || iIntValue == 256) {
            return "video/hevc";
        }
        if (iIntValue == 512) {
            return "video/avc";
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:134:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:19:0x005e  */
    /* JADX WARN: Code duplicated, block: B:314:0x0421 A[Catch: NumberFormatException -> 0x0431, TRY_LEAVE, TryCatch #1 {NumberFormatException -> 0x0431, blocks: (B:284:0x03c8, B:286:0x03da, B:298:0x03f8, B:314:0x0421), top: B:487:0x03c8 }] */
    /* JADX WARN: Code duplicated, block: B:415:0x0639  */
    /* JADX WARN: Code duplicated, block: B:454:0x06cb  */
    /* JADX WARN: Code duplicated, block: B:455:0x06d1  */
    /* JADX WARN: Code duplicated, block: B:456:0x06d4  */
    /* JADX WARN: Code duplicated, block: B:457:0x06d7  */
    /* JADX WARN: Code duplicated, block: B:458:0x06da  */
    /* JADX WARN: Code duplicated, block: B:459:0x06dd  */
    /* JADX WARN: Code duplicated, block: B:460:0x06e0  */
    /* JADX WARN: Code duplicated, block: B:461:0x06e2  */
    /* JADX WARN: Code duplicated, block: B:462:0x06e5  */
    /* JADX WARN: Code duplicated, block: B:463:0x06e9  */
    /* JADX WARN: Code duplicated, block: B:464:0x06ec  */
    /* JADX WARN: Code duplicated, block: B:465:0x06ef  */
    /* JADX WARN: Code duplicated, block: B:466:0x06f1  */
    /* JADX WARN: Code duplicated, block: B:467:0x06f4  */
    /* JADX WARN: Code duplicated, block: B:468:0x06f6  */
    /* JADX WARN: Code duplicated, block: B:469:0x06f9  */
    /* JADX WARN: Code duplicated, block: B:470:0x06fb  */
    /* JADX WARN: Code duplicated, block: B:471:0x06fd  */
    /* JADX WARN: Code duplicated, block: B:472:0x06ff  */
    /* JADX WARN: Code duplicated, block: B:473:0x0701  */
    /* JADX WARN: Code duplicated, block: B:474:0x0703  */
    /* JADX WARN: Code duplicated, block: B:475:0x0706  */
    /* JADX WARN: Code duplicated, block: B:476:0x0708  */
    /* JADX WARN: Code duplicated, block: B:479:0x070c  */
    /* JADX WARN: Code duplicated, block: B:480:0x0713  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:79:0x011d  */
    public static Pair b(mx0 mx0Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Integer num;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        Integer num2;
        Integer num3;
        byte b10;
        byte b11;
        String str = mx0Var.f80426j;
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split("\\.");
        int i21 = 2;
        int i22 = 1;
        if ("video/dolby-vision".equals(mx0Var.f80429m)) {
            String str2 = mx0Var.f80426j;
            if (strArrSplit.length < 3) {
                pk1.a("Ignoring malformed Dolby Vision codec string: ", str2, "MediaCodecUtil");
            } else {
                Matcher matcher = f84238a.matcher(strArrSplit[1]);
                if (matcher.matches()) {
                    String strGroup = matcher.group(1);
                    if (strGroup != null) {
                        switch (strGroup) {
                            case "00":
                                num2 = 1;
                                break;
                            case "01":
                                num2 = 2;
                                break;
                            case "02":
                                num2 = 4;
                                break;
                            case "03":
                                num2 = 8;
                                break;
                            case "04":
                                num2 = 16;
                                break;
                            case "05":
                                num2 = 32;
                                break;
                            case "06":
                                num2 = 64;
                                break;
                            case "07":
                                num2 = 128;
                                break;
                            case "08":
                                num2 = 256;
                                break;
                            case "09":
                                num2 = 512;
                                break;
                            default:
                                num2 = null;
                                break;
                        }
                    } else {
                        num2 = null;
                    }
                    if (num2 == null) {
                        pk1.a("Unknown Dolby Vision profile string: ", strGroup, "MediaCodecUtil");
                    } else {
                        String str3 = strArrSplit[2];
                        if (str3 != null) {
                            switch (str3.hashCode()) {
                                case 1537:
                                    if (!str3.equals("01")) {
                                        b10 = -1;
                                    } else {
                                        b10 = 0;
                                    }
                                    break;
                                case 1538:
                                    if (!str3.equals("02")) {
                                        b10 = -1;
                                    } else {
                                        b10 = 1;
                                    }
                                    break;
                                case 1539:
                                    if (!str3.equals("03")) {
                                        b10 = -1;
                                    } else {
                                        b10 = 2;
                                    }
                                    break;
                                case 1540:
                                    if (!str3.equals("04")) {
                                        b10 = -1;
                                    } else {
                                        b10 = 3;
                                    }
                                    break;
                                case 1541:
                                    if (!str3.equals("05")) {
                                        b10 = -1;
                                    } else {
                                        b10 = 4;
                                    }
                                    break;
                                case 1542:
                                    if (!str3.equals("06")) {
                                        b10 = -1;
                                    } else {
                                        b10 = 5;
                                    }
                                    break;
                                case 1543:
                                    if (!str3.equals("07")) {
                                        b10 = -1;
                                    } else {
                                        b10 = 6;
                                    }
                                    break;
                                case 1544:
                                    if (!str3.equals("08")) {
                                        b10 = -1;
                                    } else {
                                        b11 = 7;
                                        b10 = b11;
                                    }
                                    break;
                                case 1545:
                                    if (!str3.equals("09")) {
                                        b10 = -1;
                                    } else {
                                        b10 = 8;
                                    }
                                    break;
                                case 1567:
                                    if (!str3.equals("10")) {
                                        b10 = -1;
                                    } else {
                                        b11 = 9;
                                        b10 = b11;
                                    }
                                    break;
                                case 1568:
                                    if (!str3.equals("11")) {
                                        b10 = -1;
                                    } else {
                                        b11 = 10;
                                        b10 = b11;
                                    }
                                    break;
                                case 1569:
                                    if (!str3.equals("12")) {
                                        b10 = -1;
                                    } else {
                                        b11 = 11;
                                        b10 = b11;
                                    }
                                    break;
                                case 1570:
                                    if (!str3.equals("13")) {
                                        b10 = -1;
                                    } else {
                                        b11 = 12;
                                        b10 = b11;
                                    }
                                    break;
                                default:
                                    b10 = -1;
                                    break;
                            }
                            switch (b10) {
                                case 0:
                                    num3 = 1;
                                    break;
                                case 1:
                                    num3 = 2;
                                    break;
                                case 2:
                                    num3 = 4;
                                    break;
                                case 3:
                                    num3 = 8;
                                    break;
                                case 4:
                                    num3 = 16;
                                    break;
                                case 5:
                                    num3 = 32;
                                    break;
                                case 6:
                                    num3 = 64;
                                    break;
                                case 7:
                                    num3 = 128;
                                    break;
                                case 8:
                                    num3 = 256;
                                    break;
                                case 9:
                                    num3 = 512;
                                    break;
                                case 10:
                                    num3 = 1024;
                                    break;
                                case 11:
                                    num3 = 2048;
                                    break;
                                case 12:
                                    num3 = 4096;
                                    break;
                                default:
                                    num3 = null;
                                    break;
                            }
                        } else {
                            num3 = null;
                        }
                        if (num3 != null) {
                            return new Pair(num2, num3);
                        }
                        pk1.a("Unknown Dolby Vision level string: ", str3, "MediaCodecUtil");
                    }
                } else {
                    pk1.a("Ignoring malformed Dolby Vision codec string: ", str2, "MediaCodecUtil");
                }
            }
            return null;
        }
        if (f84240c.equals(strArrSplit[0]) || f84241d.equals(strArrSplit[0])) {
            String str4 = mx0Var.f80426j;
            if (strArrSplit.length < 2) {
                pk1.a("Ignoring malformed AVC codec string: ", str4, "MediaCodecUtil");
            } else {
                try {
                    if (strArrSplit[1].length() == 6) {
                        i10 = Integer.parseInt(strArrSplit[1].substring(0, 2), 16);
                        i11 = Integer.parseInt(strArrSplit[1].substring(4), 16);
                    } else if (strArrSplit.length >= 3) {
                        i10 = Integer.parseInt(strArrSplit[1]);
                        i11 = Integer.parseInt(strArrSplit[2]);
                    } else {
                        ih1.d("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str4);
                    }
                    if (i10 != 66) {
                        if (i10 != 77) {
                            if (i10 == 88) {
                                i21 = 4;
                            } else if (i10 == 100) {
                                i12 = -1;
                                i21 = 8;
                            } else if (i10 == 110) {
                                i21 = 16;
                            } else if (i10 == 122) {
                                i21 = 32;
                            } else if (i10 != 244) {
                                i12 = -1;
                                i21 = -1;
                            } else {
                                i21 = 64;
                            }
                        }
                        if (i21 == i12) {
                            kf1.a("Unknown AVC profile: ", i10, "MediaCodecUtil");
                        } else {
                            switch (i11) {
                                case 10:
                                    i13 = 1;
                                    break;
                                case 11:
                                    i13 = 4;
                                    break;
                                case 12:
                                    i13 = 8;
                                    break;
                                case 13:
                                    i13 = 16;
                                    break;
                                default:
                                    switch (i11) {
                                        case 20:
                                            i13 = 32;
                                            break;
                                        case 21:
                                            i13 = 64;
                                            break;
                                        case 22:
                                            i13 = 128;
                                            break;
                                        default:
                                            switch (i11) {
                                                case 30:
                                                    i13 = 256;
                                                    break;
                                                case 31:
                                                    i13 = 512;
                                                    break;
                                                case 32:
                                                    i13 = 1024;
                                                    break;
                                                default:
                                                    switch (i11) {
                                                        case 40:
                                                            i13 = 2048;
                                                            break;
                                                        case 41:
                                                            i13 = 4096;
                                                            break;
                                                        case 42:
                                                            i13 = 8192;
                                                            break;
                                                        default:
                                                            switch (i11) {
                                                                case 50:
                                                                    i13 = 16384;
                                                                    break;
                                                                case 51:
                                                                    i13 = 32768;
                                                                    break;
                                                                case 52:
                                                                    i13 = 65536;
                                                                    break;
                                                                default:
                                                                    i13 = -1;
                                                                    break;
                                                            }
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                            if (i13 == -1) {
                                return new Pair(Integer.valueOf(i21), Integer.valueOf(i13));
                            }
                            kf1.a("Unknown AVC level: ", i11, "MediaCodecUtil");
                        }
                    } else {
                        i21 = 1;
                    }
                    i12 = -1;
                    if (i21 == i12) {
                        kf1.a("Unknown AVC profile: ", i10, "MediaCodecUtil");
                    } else {
                        switch (i11) {
                            case 10:
                                i13 = 1;
                                break;
                            case 11:
                                i13 = 4;
                                break;
                            case 12:
                                i13 = 8;
                                break;
                            case 13:
                                i13 = 16;
                                break;
                            default:
                                switch (i11) {
                                    case 20:
                                        i13 = 32;
                                        break;
                                    case 21:
                                        i13 = 64;
                                        break;
                                    case 22:
                                        i13 = 128;
                                        break;
                                    default:
                                        switch (i11) {
                                            case 30:
                                                i13 = 256;
                                                break;
                                            case 31:
                                                i13 = 512;
                                                break;
                                            case 32:
                                                i13 = 1024;
                                                break;
                                            default:
                                                switch (i11) {
                                                    case 40:
                                                        i13 = 2048;
                                                        break;
                                                    case 41:
                                                        i13 = 4096;
                                                        break;
                                                    case 42:
                                                        i13 = 8192;
                                                        break;
                                                    default:
                                                        switch (i11) {
                                                            case 50:
                                                                i13 = 16384;
                                                                break;
                                                            case 51:
                                                                i13 = 32768;
                                                                break;
                                                            case 52:
                                                                i13 = 65536;
                                                                break;
                                                            default:
                                                                i13 = -1;
                                                                break;
                                                        }
                                                        break;
                                                }
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                        if (i13 == -1) {
                            return new Pair(Integer.valueOf(i21), Integer.valueOf(i13));
                        }
                        kf1.a("Unknown AVC level: ", i11, "MediaCodecUtil");
                    }
                } catch (NumberFormatException unused) {
                    pk1.a("Ignoring malformed AVC codec string: ", str4, "MediaCodecUtil");
                }
            }
            return null;
        }
        if (f84242e.equals(strArrSplit[0])) {
            String str5 = mx0Var.f80426j;
            if (strArrSplit.length < 3) {
                pk1.a("Ignoring malformed VP9 codec string: ", str5, "MediaCodecUtil");
            } else {
                try {
                    int i23 = Integer.parseInt(strArrSplit[1]);
                    int i24 = Integer.parseInt(strArrSplit[2]);
                    if (i23 == 0) {
                        i19 = 1;
                    } else if (i23 == 1) {
                        i19 = 2;
                    } else if (i23 != 2) {
                        i19 = i23 != 3 ? -1 : 8;
                    } else {
                        i19 = 4;
                    }
                    if (i19 == -1) {
                        kf1.a("Unknown VP9 profile: ", i23, "MediaCodecUtil");
                    } else {
                        if (i24 == 10) {
                            i20 = -1;
                        } else {
                            if (i24 == 11) {
                                i22 = 2;
                            } else if (i24 == 20) {
                                i22 = 4;
                            } else if (i24 == 21) {
                                i22 = 8;
                            } else if (i24 == 30) {
                                i22 = 16;
                            } else if (i24 == 31) {
                                i22 = 32;
                            } else if (i24 == 40) {
                                i22 = 64;
                            } else if (i24 == 41) {
                                i22 = 128;
                            } else if (i24 == 50) {
                                i22 = 256;
                            } else if (i24 != 51) {
                                switch (i24) {
                                    case 60:
                                        i20 = -1;
                                        i22 = 2048;
                                        break;
                                    case 61:
                                        i22 = 4096;
                                        break;
                                    case 62:
                                        i20 = -1;
                                        i22 = 8192;
                                        break;
                                    default:
                                        i20 = -1;
                                        i22 = -1;
                                        break;
                                }
                            } else {
                                i20 = -1;
                                i22 = 512;
                            }
                            i20 = -1;
                        }
                        if (i22 != i20) {
                            return new Pair(Integer.valueOf(i19), Integer.valueOf(i22));
                        }
                        kf1.a("Unknown VP9 level: ", i24, "MediaCodecUtil");
                    }
                } catch (NumberFormatException unused2) {
                    pk1.a("Ignoring malformed VP9 codec string: ", str5, "MediaCodecUtil");
                }
            }
            return null;
        }
        if (f84243f.equals(strArrSplit[0]) || f84244g.equals(strArrSplit[0])) {
            String str6 = mx0Var.f80426j;
            if (strArrSplit.length < 4) {
                pk1.a("Ignoring malformed HEVC codec string: ", str6, "MediaCodecUtil");
            } else {
                Matcher matcher2 = f84238a.matcher(strArrSplit[1]);
                if (matcher2.matches()) {
                    String strGroup2 = matcher2.group(1);
                    if ("1".equals(strGroup2)) {
                        i14 = 1;
                    } else if ("2".equals(strGroup2)) {
                        i14 = 2;
                    } else {
                        pk1.a("Unknown HEVC profile string: ", strGroup2, "MediaCodecUtil");
                    }
                    String str7 = strArrSplit[3];
                    if (str7 == null) {
                        num = null;
                    } else {
                        xk1 xk1Var = pk2.f81442e;
                        if (xk1Var.A().equals(str7)) {
                            num = 1;
                        } else if (xk1Var.B().equals(str7)) {
                            num = 4;
                        } else if (xk1Var.C().equals(str7)) {
                            num = 16;
                        } else if (xk1Var.D().equals(str7)) {
                            num = 64;
                        } else if (xk1Var.E().equals(str7)) {
                            num = 256;
                        } else if (xk1Var.s().equals(str7)) {
                            num = 1024;
                        } else if (xk1Var.t().equals(str7)) {
                            num = 4096;
                        } else if (xk1Var.u().equals(str7)) {
                            num = 16384;
                        } else if (xk1Var.v().equals(str7)) {
                            num = 65536;
                        } else if (xk1Var.w().equals(str7)) {
                            num = 262144;
                        } else if (xk1Var.x().equals(str7)) {
                            num = 1048576;
                        } else if (xk1Var.y().equals(str7)) {
                            num = 4194304;
                        } else if (xk1Var.z().equals(str7)) {
                            num = 16777216;
                        } else if (xk1Var.l().equals(str7)) {
                            num = 2;
                        } else if (xk1Var.m().equals(str7)) {
                            num = 8;
                        } else if (xk1Var.n().equals(str7)) {
                            num = 32;
                        } else if (xk1Var.o().equals(str7)) {
                            num = 128;
                        } else if (xk1Var.p().equals(str7)) {
                            num = 512;
                        } else if (xk1Var.d().equals(str7)) {
                            num = 2048;
                        } else if (xk1Var.e().equals(str7)) {
                            num = 8192;
                        } else if (xk1Var.f().equals(str7)) {
                            num = 32768;
                        } else if (xk1Var.g().equals(str7)) {
                            num = 131072;
                        } else if (xk1Var.h().equals(str7)) {
                            num = 524288;
                        } else if (xk1Var.i().equals(str7)) {
                            num = 2097152;
                        } else if (xk1Var.j().equals(str7)) {
                            num = 8388608;
                        } else if (xk1Var.k().equals(str7)) {
                            num = 33554432;
                        } else {
                            num = null;
                        }
                    }
                    if (num != null) {
                        return new Pair(Integer.valueOf(i14), num);
                    }
                    pk1.a("Unknown HEVC level string: ", str7, "MediaCodecUtil");
                } else {
                    pk1.a("Ignoring malformed HEVC codec string: ", str6, "MediaCodecUtil");
                }
            }
            return null;
        }
        if (!f84245h.equals(strArrSplit[0])) {
            if (!f84246i.equals(strArrSplit[0])) {
                return null;
            }
            String str8 = mx0Var.f80426j;
            if (strArrSplit.length != 3) {
                pk1.a("Ignoring malformed MP4A codec string: ", str8, "MediaCodecUtil");
            } else {
                try {
                    if ("audio/mp4a-latm".equals(ht1.a(Integer.parseInt(strArrSplit[1], 16)))) {
                        int i25 = Integer.parseInt(strArrSplit[2]);
                        if (i25 == 17) {
                            i15 = 17;
                        } else if (i25 == 20) {
                            i15 = 20;
                        } else if (i25 == 23) {
                            i15 = 23;
                        } else if (i25 == 29) {
                            i15 = 29;
                        } else if (i25 == 39) {
                            i15 = 39;
                        } else if (i25 != 42) {
                            switch (i25) {
                                case 1:
                                    i15 = 1;
                                    break;
                                case 2:
                                    i15 = 2;
                                    break;
                                case 3:
                                    i16 = -1;
                                    i15 = 3;
                                    break;
                                case 4:
                                    i15 = 4;
                                    break;
                                case 5:
                                    i16 = -1;
                                    i15 = 5;
                                    break;
                                case 6:
                                    i16 = -1;
                                    i15 = 6;
                                    break;
                                default:
                                    i16 = -1;
                                    i15 = -1;
                                    break;
                            }
                            if (i15 != i16) {
                                return new Pair(Integer.valueOf(i15), 0);
                            }
                        } else {
                            i15 = 42;
                        }
                        i16 = -1;
                        if (i15 != i16) {
                            return new Pair(Integer.valueOf(i15), 0);
                        }
                    }
                } catch (NumberFormatException unused3) {
                    pk1.a("Ignoring malformed MP4A codec string: ", str8, "MediaCodecUtil");
                }
            }
            return null;
        }
        String str9 = mx0Var.f80426j;
        mx mxVar = mx0Var.f80441y;
        if (strArrSplit.length < 4) {
            pk1.a("Ignoring malformed AV1 codec string: ", str9, "MediaCodecUtil");
        } else {
            try {
                int i26 = Integer.parseInt(strArrSplit[1]);
                int i27 = Integer.parseInt(strArrSplit[2].substring(0, 2));
                int i28 = Integer.parseInt(strArrSplit[3]);
                if (i26 != 0) {
                    kf1.a("Unknown AV1 profile: ", i26, "MediaCodecUtil");
                } else if (i28 == 8 || i28 == 10) {
                    int i29 = i28 == 8 ? 1 : (mxVar == null || !(mxVar.f80416e != null || (i17 = mxVar.f80415d) == 7 || i17 == 6)) ? 2 : 4096;
                    switch (i27) {
                        case 0:
                            i18 = 1;
                            break;
                        case 1:
                            i18 = 2;
                            break;
                        case 2:
                            i18 = 4;
                            break;
                        case 3:
                            i18 = 8;
                            break;
                        case 4:
                            i18 = 16;
                            break;
                        case 5:
                            i18 = 32;
                            break;
                        case 6:
                            i18 = 64;
                            break;
                        case 7:
                            i18 = 128;
                            break;
                        case 8:
                            i18 = 256;
                            break;
                        case 9:
                            i18 = 512;
                            break;
                        case 10:
                            i18 = 1024;
                            break;
                        case 11:
                            i18 = 2048;
                            break;
                        case 12:
                            i18 = 4096;
                            break;
                        case 13:
                            i18 = 8192;
                            break;
                        case 14:
                            i18 = 16384;
                            break;
                        case 15:
                            i18 = 32768;
                            break;
                        case 16:
                            i18 = 65536;
                            break;
                        case 17:
                            i18 = 131072;
                            break;
                        case 18:
                            i18 = 262144;
                            break;
                        case 19:
                            i18 = 524288;
                            break;
                        case 20:
                            i18 = 1048576;
                            break;
                        case 21:
                            i18 = 2097152;
                            break;
                        case 22:
                            i18 = 4194304;
                            break;
                        case 23:
                            i18 = 8388608;
                            break;
                        default:
                            i18 = -1;
                            break;
                    }
                    if (i18 != -1) {
                        return new Pair(Integer.valueOf(i29), Integer.valueOf(i18));
                    }
                    kf1.a("Unknown AV1 level: ", i27, "MediaCodecUtil");
                } else {
                    kf1.a("Unknown AV1 bit depth: ", i28, "MediaCodecUtil");
                }
            } catch (NumberFormatException unused4) {
                pk1.a("Ignoring malformed AV1 codec string: ", str9, "MediaCodecUtil");
            }
        }
        return null;
    }

    static {
        xk1 xk1Var = pk2.f81442e;
        f84238a = Pattern.compile("^\\D?(\\d+)$");
        f84239b = new HashMap();
        f84240c = xk1Var.b();
        f84241d = xk1Var.c();
        f84242e = xk1Var.O();
        f84243f = xk1Var.q();
        f84244g = xk1Var.r();
        f84245h = xk1Var.a();
        f84246i = xk1Var.F();
        f84247j = -1;
    }

    public static String a(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            byte[] bArrDecode = Base64.decode("T01YLk1TLkhFVkNEVi5EZWNvZGVy", 0);
            Charset charset = lk.c.f63591b;
            if (new String(bArrDecode, charset).equals(str)) {
                return new String(Base64.decode("dmlkZW8vaGV2Y2R2", 0), charset);
            }
            if (new String(Base64.decode("T01YLlJUSy52aWRlby5kZWNvZGVy", 0), charset).equals(str) || new String(Base64.decode("T01YLnJlYWx0ZWsudmlkZW8uZGVjb2Rlci50dW5uZWxlZA==", 0), charset).equals(str)) {
                return new String(Base64.decode("dmlkZW8vZHZfaGV2Yw==", 0), charset);
            }
            return null;
        }
        if (str2.equals("audio/alac") && new String(Base64.decode("T01YLmxnZS5hbGFjLmRlY29kZXI=", 0), lk.c.f63591b).equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && new String(Base64.decode("T01YLmxnZS5mbGFjLmRlY29kZXI=", 0), lk.c.f63591b).equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals("audio/ac3") && new String(Base64.decode("T01YLmxnZS5hYzMuZGVjb2Rlcg==", 0), lk.c.f63591b).equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0183 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:58:0x0100  */
    /* JADX WARN: Code duplicated, block: B:78:0x015a A[Catch: Exception -> 0x01a8, TRY_ENTER, TryCatch #5 {Exception -> 0x01a8, blocks: (B:3:0x0008, B:5:0x001a, B:7:0x0024, B:81:0x0179, B:10:0x0032, B:13:0x003d, B:75:0x0152, B:78:0x015a, B:80:0x0160, B:82:0x0183, B:83:0x01a6), top: B:98:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:9:0x002a  */
    public static ArrayList a(qk1 qk1Var, sk1 sk1Var) throws rk1 {
        String strA;
        String str;
        String str2;
        int i10;
        boolean z10;
        boolean z11;
        boolean zIsHardwareAccelerated;
        boolean zIsVendor;
        String str3;
        qk1 qk1Var2 = qk1Var;
        try {
            ArrayList arrayList = new ArrayList();
            String str4 = qk1Var2.f81876a;
            int iA = sk1Var.a();
            boolean zB = sk1Var.b();
            int i11 = 0;
            while (i11 < iA) {
                MediaCodecInfo mediaCodecInfoA = sk1Var.a(i11);
                int i12 = ib3.f78556a;
                if (i12 < 29 || !mediaCodecInfoA.isAlias()) {
                    String name = mediaCodecInfoA.getName();
                    if (a(mediaCodecInfoA, name, zB, str4) && (strA = a(mediaCodecInfoA, name, str4)) != null) {
                        try {
                            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfoA.getCapabilitiesForType(strA);
                            boolean zA = sk1Var.a("tunneled-playback", strA, capabilitiesForType);
                            boolean zA2 = sk1Var.a("tunneled-playback", capabilitiesForType);
                            boolean z12 = qk1Var2.f81878c;
                            if ((z12 || !zA2) && (!z12 || zA)) {
                                boolean zA3 = sk1Var.a("secure-playback", strA, capabilitiesForType);
                                boolean zA4 = sk1Var.a("secure-playback", capabilitiesForType);
                                boolean z13 = qk1Var2.f81877b;
                                if ((z13 || !zA4) && (!z13 || zA3)) {
                                    if (i12 >= 29) {
                                        zIsHardwareAccelerated = mediaCodecInfoA.isHardwareAccelerated();
                                        z11 = true;
                                    } else {
                                        z11 = true;
                                        zIsHardwareAccelerated = !a(mediaCodecInfoA, str4);
                                    }
                                    boolean zA5 = a(mediaCodecInfoA, str4);
                                    if (i12 >= 29) {
                                        zIsVendor = mediaCodecInfoA.isVendor();
                                    } else {
                                        String strA2 = ki.a(mediaCodecInfoA.getName());
                                        try {
                                            zIsVendor = (strA2.startsWith(new String(Base64.decode("b214Lmdvb2dsZS4=", 0), lk.c.f63591b)) || strA2.startsWith("c2.android.") || strA2.startsWith("c2.google.")) ? false : z11;
                                        } catch (Exception e10) {
                                            e = e10;
                                            str = strA;
                                            str2 = name;
                                            i10 = i11;
                                            z10 = zB;
                                            if (ib3.f78556a > 23) {
                                            }
                                            ih1.b("MediaCodecUtil", "Failed to query codec " + str2 + " (" + str + ")");
                                            throw e;
                                        }
                                    }
                                    if (zB && qk1Var2.f81877b == zA3) {
                                        str3 = name;
                                        i10 = i11;
                                        str = strA;
                                        z10 = zB;
                                        arrayList.add(ik1.a(name, str4, strA, capabilitiesForType, zIsHardwareAccelerated, zA5, zIsVendor, false));
                                    } else if (zB) {
                                        str = strA;
                                        str3 = name;
                                        i10 = i11;
                                        z10 = zB;
                                        if (!z10) {
                                            continue;
                                        }
                                    } else {
                                        try {
                                            if (qk1Var2.f81877b) {
                                                str = strA;
                                                str3 = name;
                                                i10 = i11;
                                                z10 = zB;
                                                if (!z10 && zA3) {
                                                    StringBuilder sb2 = new StringBuilder();
                                                    try {
                                                        sb2.append(str3);
                                                        sb2.append(".secure");
                                                        str2 = str3;
                                                        try {
                                                            arrayList.add(ik1.a(sb2.toString(), str4, str, capabilitiesForType, zIsHardwareAccelerated, zA5, zIsVendor, true));
                                                            return arrayList;
                                                        } catch (Exception e11) {
                                                            e = e11;
                                                            if (ib3.f78556a > 23) {
                                                            }
                                                            ih1.b("MediaCodecUtil", "Failed to query codec " + str2 + " (" + str + ")");
                                                            throw e;
                                                        }
                                                    } catch (Exception e12) {
                                                        e = e12;
                                                        str2 = str3;
                                                    }
                                                }
                                            } else {
                                                str3 = name;
                                                i10 = i11;
                                                str = strA;
                                                z10 = zB;
                                                try {
                                                    arrayList.add(ik1.a(name, str4, strA, capabilitiesForType, zIsHardwareAccelerated, zA5, zIsVendor, false));
                                                } catch (Exception e13) {
                                                    e = e13;
                                                    str2 = str3;
                                                    if (ib3.f78556a > 23 && !arrayList.isEmpty()) {
                                                        ih1.b("MediaCodecUtil", "Skipping codec " + str2 + " (failed to query capabilities)");
                                                    } else {
                                                        ih1.b("MediaCodecUtil", "Failed to query codec " + str2 + " (" + str + ")");
                                                        throw e;
                                                    }
                                                }
                                            }
                                        } catch (Exception e14) {
                                            e = e14;
                                            str = strA;
                                            i10 = i11;
                                            z10 = zB;
                                            str2 = name;
                                            if (ib3.f78556a > 23) {
                                            }
                                            ih1.b("MediaCodecUtil", "Failed to query codec " + str2 + " (" + str + ")");
                                            throw e;
                                        }
                                    }
                                } else {
                                    i10 = i11;
                                    z10 = zB;
                                }
                            } else {
                                i10 = i11;
                                z10 = zB;
                            }
                        } catch (Exception e15) {
                            e = e15;
                            str = strA;
                            str2 = name;
                            i10 = i11;
                            z10 = zB;
                        }
                    } else {
                        i10 = i11;
                        z10 = zB;
                    }
                } else {
                    i10 = i11;
                    z10 = zB;
                }
                i11 = i10 + 1;
                qk1Var2 = qk1Var;
                zB = z10;
            }
            return arrayList;
        } catch (Exception e16) {
            throw new rk1(e16);
        }
    }

    public static boolean a(MediaCodecInfo mediaCodecInfo, String str, boolean z10, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z10 && str.endsWith(".secure"))) {
            return false;
        }
        int i10 = ib3.f78556a;
        if (i10 < 21) {
            byte[] bArrDecode = Base64.decode("Q0lQQUFDRGVjb2Rlcg==", 0);
            Charset charset = lk.c.f63591b;
            if (new String(bArrDecode, charset).equals(str) || new String(Base64.decode("Q0lQTVAzRGVjb2Rlcg==", 0), charset).equals(str) || new String(Base64.decode("Q0lQVm9yYmlzRGVjb2Rlcg==", 0), charset).equals(str) || new String(Base64.decode("Q0lQQU1STkJEZWNvZGVy", 0), charset).equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str)) {
                return false;
            }
        }
        if (i10 < 18) {
            byte[] bArrDecode2 = Base64.decode("T01YLk1USy5BVURJTy5ERUNPREVSLkFBQw==", 0);
            Charset charset2 = lk.c.f63591b;
            if (new String(bArrDecode2, charset2).equals(str)) {
                String str3 = new String(Base64.decode("YTcw", 0), charset2);
                String str4 = ib3.f78557b;
                if (str3.equals(str4) || (new String(Base64.decode("WGlhb21p", 0), charset2).equals(ib3.f78558c) && str4.startsWith(new String(Base64.decode("SE0=", 0), charset2)))) {
                    return false;
                }
            }
        }
        if (i10 == 16) {
            byte[] bArrDecode3 = Base64.decode("T01YLnFjb20uYXVkaW8uZGVjb2Rlci5tcDM=", 0);
            Charset charset3 = lk.c.f63591b;
            if (new String(bArrDecode3, charset3).equals(str)) {
                String str5 = new String(Base64.decode("ZGx4dQ==", 0), charset3);
                String str6 = ib3.f78557b;
                if (str5.equals(str6) || new String(Base64.decode("cHJvdG91", 0), charset3).equals(str6) || new String(Base64.decode("dmlsbGU=", 0), charset3).equals(str6) || new String(Base64.decode("dmlsbGVwbHVz", 0), charset3).equals(str6) || new String(Base64.decode("dmlsbGVjMg==", 0), charset3).equals(str6) || str6.startsWith(new String(Base64.decode("Z2Vl", 0), charset3)) || new String(Base64.decode("QzY2MDI=", 0), charset3).equals(str6) || new String(Base64.decode("QzY2MDM=", 0), charset3).equals(str6) || new String(Base64.decode("QzY2MDY=", 0), charset3).equals(str6) || new String(Base64.decode("QzY2MTY=", 0), charset3).equals(str6) || new String(Base64.decode("TDM2aA==", 0), charset3).equals(str6) || new String(Base64.decode("U08tMDJF", 0), charset3).equals(str6)) {
                    return false;
                }
            }
        }
        if (i10 == 16) {
            byte[] bArrDecode4 = Base64.decode("T01YLnFjb20uYXVkaW8uZGVjb2Rlci5hYWM=", 0);
            Charset charset4 = lk.c.f63591b;
            if (new String(bArrDecode4, charset4).equals(str)) {
                String str7 = new String(Base64.decode("QzE1MDQ=", 0), charset4);
                String str8 = ib3.f78557b;
                if (str7.equals(str8) || new String(Base64.decode("QzE1MDU=", 0), charset4).equals(str8) || new String(Base64.decode("QzE2MDQ=", 0), charset4).equals(str8) || new String(Base64.decode("QzE2MDU=", 0), charset4).equals(str8)) {
                    return false;
                }
            }
        }
        if (i10 < 24) {
            byte[] bArrDecode5 = Base64.decode("T01YLlNFQy5hYWMuZGVj", 0);
            Charset charset5 = lk.c.f63591b;
            if ((new String(bArrDecode5, charset5).equals(str) || new String(Base64.decode("T01YLkV4eW5vcy5BQUMuRGVjb2Rlcg==", 0), charset5).equals(str)) && new String(Base64.decode("c2Ftc3VuZw==", 0), charset5).equals(ib3.f78558c)) {
                String str9 = ib3.f78557b;
                if (str9.startsWith(new String(Base64.decode("emVyb2ZsdGU=", 0), charset5)) || str9.startsWith(new String(Base64.decode("emVyb2x0ZQ==", 0), charset5)) || str9.startsWith(new String(Base64.decode("emVubHRl", 0), charset5)) || new String(Base64.decode("U0MtMDVH", 0), charset5).equals(str9) || new String(Base64.decode("bWFyaW5lbHRlYXR0", 0), charset5).equals(str9) || new String(Base64.decode("NDA0U0M=", 0), charset5).equals(str9) || new String(Base64.decode("U0MtMDRH", 0), charset5).equals(str9) || new String(Base64.decode("U0NWMzE=", 0), charset5).equals(str9)) {
                    return false;
                }
            }
        }
        if (i10 <= 19) {
            byte[] bArrDecode6 = Base64.decode("T01YLlNFQy52cDguZGVj", 0);
            Charset charset6 = lk.c.f63591b;
            if (new String(bArrDecode6, charset6).equals(str) && new String(Base64.decode("c2Ftc3VuZw==", 0), charset6).equals(ib3.f78558c)) {
                String str10 = ib3.f78557b;
                if (str10.startsWith("d2") || str10.startsWith(new String(Base64.decode("c2VycmFubw==", 0), charset6)) || str10.startsWith(new String(Base64.decode("amZsdGU=", 0), charset6)) || str10.startsWith(new String(Base64.decode("c2FudG9z", 0), charset6)) || str10.startsWith(new String(Base64.decode("dDA=", 0), charset6))) {
                    return false;
                }
            }
        }
        if (i10 <= 19) {
            String str11 = ib3.f78557b;
            byte[] bArrDecode7 = Base64.decode("amZsdGU=", 0);
            Charset charset7 = lk.c.f63591b;
            if (str11.startsWith(new String(bArrDecode7, charset7)) && new String(Base64.decode("T01YLnFjb20udmlkZW8uZGVjb2Rlci52cDg=", 0), charset7).equals(str)) {
                return false;
            }
        }
        return (i10 <= 23 && "audio/eac3-joc".equals(str2) && new String(Base64.decode("T01YLk1USy5BVURJTy5ERUNPREVSLkRTUEFDMw==", 0), lk.c.f63591b).equals(str)) ? false : true;
    }

    public static /* synthetic */ int b(ik1 ik1Var) {
        return ik1Var.f78680a.startsWith(pk2.f81442e.K()) ? 1 : 0;
    }

    public static /* synthetic */ int a(ik1 ik1Var) {
        String str = ik1Var.f78680a;
        xk1 xk1Var = pk2.f81442e;
        if (str.startsWith(xk1Var.K()) || str.startsWith("c2.android")) {
            return 1;
        }
        return (ib3.f78556a >= 26 || !str.equals(xk1Var.G())) ? 0 : -1;
    }

    public static /* synthetic */ int a(mx0 mx0Var, ik1 ik1Var) {
        try {
            return ik1Var.a(mx0Var) ? 1 : 0;
        } catch (rk1 unused) {
            return -1;
        }
    }

    public static /* synthetic */ int a(vk1 vk1Var, Object obj, Object obj2) {
        return vk1Var.a(obj2) - vk1Var.a(obj);
    }

    public static void a(ArrayList arrayList, final vk1 vk1Var) {
        Collections.sort(arrayList, new Comparator() { // from class: cp.xb
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return wk1.a(vk1Var, obj, obj2);
            }
        });
    }

    public static synchronized List a(String str, boolean z10, boolean z11) {
        sk1 tk1Var;
        qk1 qk1Var = new qk1(str, z10, z11);
        HashMap map = f84239b;
        List list = (List) map.get(qk1Var);
        if (list != null) {
            return list;
        }
        int i10 = ib3.f78556a;
        if (i10 >= 21) {
            tk1Var = new uk1(z10, z11);
        } else {
            tk1Var = new tk1();
        }
        ArrayList arrayListA = a(qk1Var, tk1Var);
        if (z10 && arrayListA.isEmpty() && 21 <= i10 && i10 <= 23) {
            arrayListA = a(qk1Var, new tk1());
            if (!arrayListA.isEmpty()) {
                ih1.d("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((ik1) arrayListA.get(0)).f78680a);
            }
        }
        a(str, arrayListA);
        p51 p51VarA = p51.a((Collection) arrayListA);
        map.put(qk1Var, p51VarA);
        return p51VarA;
    }

    public static ArrayList a(p51 p51Var, final mx0 mx0Var) {
        ArrayList arrayList = new ArrayList(p51Var);
        a(arrayList, new vk1() { // from class: cp.wb
            @Override // yads.vk1
            public final int a(Object obj) {
                return wk1.a(mx0Var, (ik1) obj);
            }
        });
        return arrayList;
    }

    public static int a() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i10;
        if (f84247j == -1) {
            int iMax = 0;
            List listA = a("video/avc", false, false);
            ik1 ik1Var = listA.isEmpty() ? null : (ik1) listA.get(0);
            if (ik1Var != null) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = ik1Var.f78683d;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                int length = codecProfileLevelArr.length;
                int iMax2 = 0;
                while (iMax < length) {
                    int i11 = codecProfileLevelArr[iMax].level;
                    if (i11 != 1 && i11 != 2) {
                        switch (i11) {
                            case 8:
                            case 16:
                            case 32:
                                i10 = 101376;
                                break;
                            case 64:
                                i10 = 202752;
                                break;
                            case 128:
                            case 256:
                                i10 = 414720;
                                break;
                            case 512:
                                i10 = 921600;
                                break;
                            case 1024:
                                i10 = 1310720;
                                break;
                            case 2048:
                            case 4096:
                                i10 = 2097152;
                                break;
                            case 8192:
                                i10 = 2228224;
                                break;
                            case 16384:
                                i10 = 5652480;
                                break;
                            case 32768:
                            case 65536:
                                i10 = 9437184;
                                break;
                            case 131072:
                            case 262144:
                            case 524288:
                                i10 = 35651584;
                                break;
                            default:
                                i10 = -1;
                                break;
                        }
                    } else {
                        i10 = 25344;
                    }
                    iMax2 = Math.max(i10, iMax2);
                    iMax++;
                }
                iMax = Math.max(iMax2, ib3.f78556a >= 21 ? 345600 : AdConfig.DEFAULT_PING_V2_EXPIRY_HIGH);
            }
            f84247j = iMax;
        }
        return f84247j;
    }

    public static void a(String str, ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            if (ib3.f78556a < 26) {
                String str2 = ib3.f78557b;
                xk1 xk1Var = pk2.f81442e;
                if (str2.equals(xk1Var.N()) && arrayList.size() == 1 && ((ik1) arrayList.get(0)).f78680a.equals(xk1Var.G())) {
                    arrayList.add(ik1.a(xk1Var.L(), "audio/raw", "audio/raw", null, false, true, false, false));
                }
            }
            a(arrayList, new vk1() { // from class: cp.ub
                @Override // yads.vk1
                public final int a(Object obj) {
                    return wk1.a((ik1) obj);
                }
            });
        }
        int i10 = ib3.f78556a;
        if (i10 < 21 && arrayList.size() > 1) {
            String str3 = ((ik1) arrayList.get(0)).f78680a;
            xk1 xk1Var2 = pk2.f81442e;
            if (xk1Var2.I().equals(str3) || xk1Var2.H().equals(str3) || xk1Var2.J().equals(str3)) {
                a(arrayList, new vk1() { // from class: cp.vb
                    @Override // yads.vk1
                    public final int a(Object obj) {
                        return wk1.b((ik1) obj);
                    }
                });
            }
        }
        if (i10 >= 32 || arrayList.size() <= 1) {
            return;
        }
        if (pk2.f81442e.M().equals(((ik1) arrayList.get(0)).f78680a)) {
            arrayList.add((ik1) arrayList.remove(0));
        }
    }

    public static boolean a(MediaCodecInfo mediaCodecInfo, String str) {
        if (ib3.f78556a >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if ("audio".equals(ht1.c(str))) {
            return true;
        }
        String strA = ki.a(mediaCodecInfo.getName());
        if (strA.startsWith("arc.")) {
            return false;
        }
        byte[] bArrDecode = Base64.decode("b214Lmdvb2dsZS4=", 0);
        Charset charset = lk.c.f63591b;
        if (strA.startsWith(new String(bArrDecode, charset)) || strA.startsWith(new String(Base64.decode("b214LmZmbXBlZy4=", 0), charset))) {
            return true;
        }
        if ((strA.startsWith(new String(Base64.decode("b214LnNlYy4=", 0), charset)) && strA.contains(".sw.")) || strA.equals(new String(Base64.decode("b214LnFjb20udmlkZW8uZGVjb2Rlci5oZXZjc3d2ZGVj", 0), charset)) || strA.startsWith("c2.android.") || strA.startsWith("c2.google.")) {
            return true;
        }
        return (strA.startsWith(new String(Base64.decode("b214Lg==", 0), charset)) || strA.startsWith("c2.")) ? false : true;
    }
}
