package yads;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ht1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ArrayList f78370a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f78371b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static String a(int i10) {
        if (i10 == 32) {
            return "video/mp4v-es";
        }
        if (i10 == 33) {
            return "video/avc";
        }
        if (i10 == 35) {
            return "video/hevc";
        }
        if (i10 == 64) {
            return "audio/mp4a-latm";
        }
        if (i10 == 163) {
            return "video/wvc1";
        }
        if (i10 == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i10 == 165) {
            return "audio/ac3";
        }
        if (i10 == 166) {
            return "audio/eac3";
        }
        switch (i10) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            default:
                switch (i10) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173 /* 173 */:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    public static boolean a(String str, String str2) {
        gt1 gt1VarB;
        if (str == null) {
            return false;
        }
        char c10 = '\n';
        switch (str) {
            case "audio/eac3-joc":
            case "audio/mpeg-L1":
            case "audio/mpeg-L2":
            case "audio/ac3":
            case "audio/raw":
            case "audio/eac3":
            case "audio/flac":
            case "audio/mpeg":
            case "audio/g711-alaw":
            case "audio/g711-mlaw":
                return true;
            case "audio/mp4a-latm":
                if (str2 == null || (gt1VarB = b(str2)) == null) {
                    return false;
                }
                int i10 = gt1VarB.f77931b;
                if (i10 != 2) {
                    if (i10 == 5) {
                        c10 = 11;
                    } else if (i10 == 29) {
                        c10 = '\f';
                    } else if (i10 == 42) {
                        c10 = 16;
                    } else if (i10 != 22) {
                        c10 = i10 != 23 ? (char) 0 : (char) 15;
                    } else {
                        c10 = 0;
                    }
                }
                return (c10 == 0 || c10 == 16) ? false : true;
            default:
                return false;
        }
    }

    public static int b(String str, String str2) {
        gt1 gt1VarB;
        str.hashCode();
        switch (str) {
            case "audio/eac3-joc":
                return 18;
            case "audio/vnd.dts":
                return 7;
            case "audio/mp4a-latm":
                if (str2 == null || (gt1VarB = b(str2)) == null) {
                    return 0;
                }
                int i10 = gt1VarB.f77931b;
                if (i10 == 2) {
                    return 10;
                }
                if (i10 == 5) {
                    return 11;
                }
                if (i10 == 29) {
                    return 12;
                }
                if (i10 == 42) {
                    return 16;
                }
                if (i10 != 22) {
                    return i10 != 23 ? 0 : 15;
                }
                return 1073741824;
            case "audio/ac3":
                return 5;
            case "audio/ac4":
                return 17;
            case "audio/eac3":
                return 6;
            case "audio/mpeg":
                return 9;
            case "audio/vnd.dts.hd":
                return 8;
            case "audio/true-hd":
                return 14;
            default:
                return 0;
        }
    }

    public static String c(String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }

    public static int d(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if ("audio".equals(c(str))) {
            return 1;
        }
        if ("video".equals(c(str))) {
            return 2;
        }
        if (e(str)) {
            return 3;
        }
        if ("image".equals(c(str))) {
            return 4;
        }
        if (!"application/id3".equals(str) && !"application/x-emsg".equals(str) && !"application/x-scte35".equals(str)) {
            if ("application/x-camera-motion".equals(str)) {
                return 6;
            }
            ArrayList arrayList = f78370a;
            if (arrayList.size() <= 0) {
                return -1;
            }
            a2.a(arrayList.get(0));
            throw null;
        }
        return 5;
    }

    public static boolean e(String str) {
        if (!"text".equals(c(str)) && !"application/cea-608".equals(str) && !"application/cea-708".equals(str) && !"application/x-mp4-cea-608".equals(str) && !"application/x-subrip".equals(str) && !"application/ttml+xml".equals(str) && !"application/x-quicktime-tx3g".equals(str) && !"application/x-mp4-vtt".equals(str) && !"application/x-rawcc".equals(str) && !"application/vobsub".equals(str) && !"application/pgs".equals(str) && !"application/dvbsubs".equals(str)) {
            return false;
        }
        return true;
    }

    public static boolean f(String str) {
        return "video".equals(c(str));
    }

    public static String a(String str) {
        gt1 gt1VarB;
        String strA = null;
        if (str == null) {
            return null;
        }
        String strA2 = ki.a(str.trim());
        if (strA2.startsWith("avc1") || strA2.startsWith("avc3")) {
            return "video/avc";
        }
        if (strA2.startsWith("hev1") || strA2.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (strA2.startsWith("dvav") || strA2.startsWith("dva1") || strA2.startsWith("dvhe") || strA2.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (strA2.startsWith("av01")) {
            return "video/av01";
        }
        if (strA2.startsWith("vp9") || strA2.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (strA2.startsWith("vp8") || strA2.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (strA2.startsWith("mp4a")) {
            if (strA2.startsWith("mp4a.") && (gt1VarB = b(strA2)) != null) {
                strA = a(gt1VarB.f77930a);
            }
            return strA == null ? "audio/mp4a-latm" : strA;
        }
        if (strA2.startsWith("mha1")) {
            return "audio/mha1";
        }
        if (strA2.startsWith("mhm1")) {
            return "audio/mhm1";
        }
        if (strA2.startsWith("ac-3") || strA2.startsWith("dac3")) {
            return "audio/ac3";
        }
        if (strA2.startsWith("ec-3") || strA2.startsWith("dec3")) {
            return "audio/eac3";
        }
        if (strA2.startsWith("ec+3")) {
            return "audio/eac3-joc";
        }
        if (strA2.startsWith("ac-4") || strA2.startsWith("dac4")) {
            return "audio/ac4";
        }
        if (strA2.startsWith("dtsc")) {
            return "audio/vnd.dts";
        }
        if (strA2.startsWith("dtse")) {
            return "audio/vnd.dts.hd;profile=lbr";
        }
        if (strA2.startsWith("dtsh") || strA2.startsWith("dtsl")) {
            return "audio/vnd.dts.hd";
        }
        if (strA2.startsWith("dtsx")) {
            return "audio/vnd.dts.uhd;profile=p2";
        }
        if (strA2.startsWith("opus")) {
            return "audio/opus";
        }
        if (strA2.startsWith("vorbis")) {
            return "audio/vorbis";
        }
        if (strA2.startsWith("flac")) {
            return "audio/flac";
        }
        if (strA2.startsWith("stpp")) {
            return "application/ttml+xml";
        }
        if (strA2.startsWith("wvtt")) {
            return "text/vtt";
        }
        if (strA2.contains("cea708")) {
            return "application/cea-708";
        }
        if (strA2.contains("eia608") || strA2.contains("cea608")) {
            return "application/cea-608";
        }
        ArrayList arrayList = f78370a;
        if (arrayList.size() <= 0) {
            return null;
        }
        a2.a(arrayList.get(0));
        throw null;
    }

    public static gt1 b(String str) {
        Matcher matcher = f78371b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        String strGroup2 = matcher.group(2);
        try {
            return new gt1(Integer.parseInt(strGroup, 16), strGroup2 != null ? Integer.parseInt(strGroup2) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
