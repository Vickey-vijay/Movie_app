package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.inmobi.ads.AdContainer;
import com.inmobi.ads.AdUnit;
import com.inmobi.ads.InMobiAdRequest;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.InMobiInterstitial;
import com.inmobi.ads.NativeRecyclerViewAdapter;
import com.inmobi.ads.NativeVideoView;
import com.inmobi.ads.ViewableAd;
import com.inmobi.ads.listeners.BannerAdEventListener;
import com.inmobi.ads.listeners.InterstitialAdEventListener;
import com.inmobi.ads.listeners.NativeAdEventListener;
import com.inmobi.ads.listeners.VideoEventListener;
import com.inmobi.media.ads.network.common.model.Ad;
import com.inmobi.media.ads.network.common.model.AdResponse;
import com.inmobi.media.ads.network.common.model.AdSet;
import com.inmobi.media.ads.network.common.model.ContextData;
import com.inmobi.rendering.InMobiAdActivity;
import com.inmobi.sdk.InMobiSdk;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class bo extends bd {

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f943 = 1;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f946;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int[] f947 = {1822570755, 561632285, -736641796, 1725186181, -1046851615, 181372043, 76972103, -1511596420, 857250591, 205748874, 1401158660, 1879072045, 744993969, -1676703876, -2009151104, -268656751, 328320185, -287828179};

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static long f948 = -3305206215475391646L;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f945 = 0;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char f944 = 0;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static Enum m1018(String str) {
        byte b10 = -1;
        int iHashCode = str.hashCode();
        if (iHashCode == 556003820) {
            if ((str.equals(m1038(new int[]{-533401839, -2077724314, -866858875, -1900723453, -1397141540, -46887536, -379821116, 155711183, -835834685, 1240962130, -1078183858, 1702363360}, 22 - Process.getGidForName("")).intern()) ? (char) 17 : '^') != '^') {
                int i10 = f943 + 33;
                f946 = i10 % 128;
                int i11 = i10 % 2;
                b10 = 0;
            }
        } else if (iHashCode != 556062505) {
            if (iHashCode == 1382961856 && str.equals(m1038(new int[]{-533401839, -2077724314, -866858875, -1900723453, -1397141540, -46887536, -1279621191, 1196219640, -1029793204, 195985504, 654384059, 1572571030}, TextUtils.indexOf("", "") + 22).intern())) {
                b10 = 2;
            }
        } else if (str.equals(m1038(new int[]{-533401839, -2077724314, -866858875, -1900723453, -1397141540, -46887536, -379821116, 155711183, 519211770, 1159879649, 1462259363, -1116500272}, 23 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern())) {
            int i12 = f946 + 37;
            f943 = i12 % 128;
            int i13 = i12 % 2;
            b10 = 1;
        }
        if (b10 == 0) {
            return AdUnit.AdMarkupType.AD_MARKUP_TYPE_INM_HTML;
        }
        if (b10 == 1) {
            return AdUnit.AdMarkupType.AD_MARKUP_TYPE_INM_JSON;
        }
        if (b10 != 2) {
            return null;
        }
        return AdUnit.AdMarkupType.AD_MARKUP_TYPE_UNKNOWN;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static Enum m1019(String str) {
        byte b10 = -1;
        int iHashCode = str.hashCode();
        if (iHashCode == -1097819034) {
            if (!(str.equals(m1038(new int[]{1102338735, 534718331, -204734387, 1529807113, 832435028, 459668408, -2097949543, -1843881562, 1918117154, -1962707943, 31598433, -1919389046, -1438694206, 1262262860}, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 25).intern()) ? false : true)) {
                int i10 = f943 + 75;
                f946 = i10 % 128;
                int i11 = i10 % 2;
                b10 = 1;
            }
        } else if (iHashCode == 1554700484) {
            if ((str.equals(m1038(new int[]{1102338735, 534718331, -204734387, 1529807113, 832435028, 459668408, -379821116, 155711183, -681195772, -1914989498, -1576867718, -323308626}, 22 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern()) ? 'K' : (char) 20) == 'K') {
                int i12 = f946 + 71;
                f943 = i12 % 128;
                int i13 = i12 % 2;
                b10 = 0;
            }
        }
        if (b10 == 0) {
            return AdContainer.RenderingProperties.PlacementType.PLACEMENT_TYPE_INLINE;
        }
        if (b10 != 1) {
            return null;
        }
        return AdContainer.RenderingProperties.PlacementType.PLACEMENT_TYPE_FULLSCREEN;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static Enum m1022(String str) {
        int i10 = f946 + 61;
        f943 = i10 % 128;
        if (i10 % 2 == 0) {
            str.hashCode();
            throw null;
        }
        int iHashCode = str.hashCode();
        byte b10 = -1;
        if (iHashCode == -2102692847) {
            if (str.equals(m1038(new int[]{-849780843, 820159304, 652968498, -1366426546, -1958649305, -852406639, 438079687, 2100759176, 1488503172, 861283917, -186541523, -1279779442}, View.combineMeasuredStates(0, 0) + 24).intern())) {
                int i11 = f946 + 39;
                f943 = i11 % 128;
                b10 = i11 % 2 == 0 ? (byte) 5 : (byte) 2;
            }
        } else if (iHashCode == -1357644918) {
            if (!(str.equals(m1038(new int[]{-849780843, 820159304, 652968498, -1366426546, -1958649305, -852406639, 438079687, 2100759176, 1006716680, -396084949, -2077871020, 81795541}, (ViewConfiguration.getScrollBarSize() >> 8) + 22).intern()) ? false : true)) {
                b10 = 1;
            }
        } else if (iHashCode == 235669401) {
            if (!(!str.equals(m1038(new int[]{-849780843, 820159304, 652968498, -1366426546, -1958649305, -852406639, 438079687, 2100759176, -886459857, -1351455131, -1557625610, 1566162114}, 24 - KeyEvent.keyCodeFromString("")).intern()))) {
                b10 = 0;
            }
        }
        if (b10 == 0) {
            return AdUnit.AdCreativeType.AD_CREATIVE_TYPE_UNSUPPORTED_OR_UNKNOWN;
        }
        if (b10 == 1) {
            return AdUnit.AdCreativeType.AD_CREATIVE_TYPE_VIDEO;
        }
        if (b10 == 2) {
            return AdUnit.AdCreativeType.AD_CREATIVE_TYPE_DISPLAY;
        }
        int i12 = f946 + 75;
        f943 = i12 % 128;
        int i13 = i12 % 2;
        return null;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public static /* synthetic */ Enum m1024(String str) {
        int i10 = f946 + 63;
        f943 = i10 % 128;
        int i11 = i10 % 2;
        Enum enumM1018 = m1018(str);
        int i12 = f946 + 35;
        f943 = i12 % 128;
        if (i12 % 2 != 0) {
            return enumM1018;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ Object m1026(AdContainer adContainer) {
        int i10 = f946 + 41;
        f943 = i10 % 128;
        int i11 = i10 % 2;
        Object objM1039 = m1039(adContainer);
        int i12 = f946 + 39;
        f943 = i12 % 128;
        int i13 = i12 % 2;
        return objM1039;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ Enum m1030(String str) {
        int i10 = f943 + 63;
        f946 = i10 % 128;
        char c10 = i10 % 2 != 0 ? '6' : (char) 11;
        Enum enumM1019 = m1019(str);
        if (c10 != 11) {
            int i11 = 32 / 0;
        }
        int i12 = f943 + 89;
        f946 = i12 % 128;
        if ((i12 % 2 != 0 ? (char) 20 : 'P') != 20) {
            return enumM1019;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ Object m1034(Ad ad2) {
        int i10 = f943 + 89;
        f946 = i10 % 128;
        char c10 = i10 % 2 != 0 ? 'M' : (char) 31;
        Object objM1020 = m1020(ad2);
        if (c10 == 'M') {
            int i11 = 1 / 0;
        }
        return objM1020;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ Object m1040(Ad ad2) {
        int i10 = f946 + 113;
        f943 = i10 % 128;
        if ((i10 % 2 == 0 ? '/' : (char) 27) != 27) {
            m1025(ad2);
            throw null;
        }
        Object objM1025 = m1025(ad2);
        int i11 = f946 + 81;
        f943 = i11 % 128;
        int i12 = i11 % 2;
        return objM1025;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ Object m1043(Ad ad2) {
        int i10 = f943 + 11;
        f946 = i10 % 128;
        int i11 = i10 % 2;
        Object objM1023 = m1023(ad2);
        int i12 = f946 + 13;
        f943 = i12 % 128;
        if (i12 % 2 != 0) {
            return objM1023;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public static /* synthetic */ Enum m1021(String str) {
        int i10 = f946 + 37;
        f943 = i10 % 128;
        int i11 = i10 % 2;
        Enum enumM1022 = m1022(str);
        int i12 = f943 + 123;
        f946 = i12 % 128;
        if (i12 % 2 == 0) {
            return enumM1022;
        }
        int i13 = 23 / 0;
        return enumM1022;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static Object m1025(Ad ad2) {
        int i10 = f943 + 17;
        f946 = i10 % 128;
        char c10 = i10 % 2 != 0 ? '@' : '$';
        Map<String, String> rewards = ad2.getRewards();
        if (c10 == '@') {
            int i11 = 55 / 0;
        }
        int i12 = f943 + 23;
        f946 = i12 % 128;
        if (!(i12 % 2 != 0)) {
            return rewards;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ Object m1027(Ad ad2) {
        int i10 = f946 + 109;
        f943 = i10 % 128;
        int i11 = i10 % 2;
        Object objM1031 = m1031(ad2);
        int i12 = f943 + 9;
        f946 = i12 % 128;
        int i13 = i12 % 2;
        return objM1031;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ Object m1032(AdResponse adResponse) {
        int i10 = f946 + 11;
        f943 = i10 % 128;
        int i11 = i10 % 2;
        Object objM1044 = m1044(adResponse);
        int i12 = f946 + 121;
        f943 = i12 % 128;
        int i13 = i12 % 2;
        return objM1044;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ Object m1035(AdResponse adResponse) {
        int i10 = f946 + 103;
        f943 = i10 % 128;
        int i11 = i10 % 2;
        Object objM1028 = m1028(adResponse);
        int i12 = f943 + 55;
        f946 = i12 % 128;
        int i13 = i12 % 2;
        return objM1028;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ Object m1041(AdSet adSet) {
        int i10 = f946 + 25;
        f943 = i10 % 128;
        char c10 = i10 % 2 == 0 ? 'C' : (char) 2;
        Object objM1045 = m1045(adSet);
        if (c10 == 'C') {
            int i11 = 28 / 0;
        }
        int i12 = f943 + 85;
        f946 = i12 % 128;
        if ((i12 % 2 != 0 ? '*' : ' ') == ' ') {
            return objM1045;
        }
        int i13 = 75 / 0;
        return objM1045;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:107:0x03c4 A[PHI: r9
  0x03c4: PHI (r9v13 byte) = 
  (r9v1 byte)
  (r9v2 byte)
  (r9v3 byte)
  (r9v4 byte)
  (r9v5 byte)
  (r9v6 byte)
  (r9v7 byte)
  (r9v8 byte)
  (r9v9 byte)
  (r9v10 byte)
  (r9v11 byte)
  (r9v12 byte)
  (r9v14 byte)
 binds: [B:105:0x03c0, B:101:0x03a2, B:96:0x0379, B:93:0x035d, B:90:0x033e, B:84:0x0312, B:81:0x02f2, B:78:0x02d1, B:74:0x02a8, B:67:0x027c, B:64:0x025a, B:61:0x0238, B:4:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:4:0x0021  */
    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo738(String str) {
        byte b10;
        byte b11 = 1;
        switch (str.hashCode()) {
            case -2044438337:
                b10 = -1;
                if (!str.equals(m1038(new int[]{-1786748720, 807098415, -1352246521, -1387034022, -2024977339, 427678882, -2096849941, 1835288195, 1803609308, 56349780}, KeyEvent.normalizeMetaState(0) + 19).intern())) {
                    b11 = b10;
                } else {
                    b11 = 7;
                }
                break;
            case -1769689844:
                b10 = -1;
                if ((str.equals(m1037("녹髀솤걃舥ࠋ吠쭟㗴", (char) (ViewConfiguration.getTouchSlop() >> 8), "።焭豵툡", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + (-1891324512), "ꃍ䒭沏ꋚ").intern()) ? (byte) 0 : (byte) 1) == 0) {
                    b11 = 12;
                } else {
                    b11 = b10;
                }
                break;
            case -1716191362:
                b10 = -1;
                if (!str.equals(m1038(new int[]{-1295128624, 1749390598, -565503693, 933537317, -384467301, -441595460}, 11 - Color.alpha(0)).intern())) {
                    b11 = b10;
                } else {
                    b11 = 6;
                }
                break;
            case -1405271692:
                b10 = -1;
                if (!str.equals(m1038(new int[]{-160109757, 1678485829, 1891531547, -1404799110, 774574488, -1099663893, -1783428777, -1061629040, -53968931, -1511193751, 1685511199, -1426698889, -527445304, 810608813}, 25 - TextUtils.indexOf("", "")).intern())) {
                    b11 = b10;
                } else {
                    b11 = 16;
                }
                break;
            case -1401317165:
                b10 = -1;
                if (str.equals(m1038(new int[]{1625591982, 790574268, 1229723793, 538367032, -1596659400, -275655705, -1795803087, -1725255519, -1536317707, -520054232}, Drawable.resolveOpacity(0, 0) + 18).intern()) ? false : true) {
                    b11 = b10;
                } else {
                    b11 = 20;
                }
                break;
            case -1304544044:
                b10 = -1;
                if (!str.equals(m1038(new int[]{-160109757, 1678485829, 74430204, -823607588, 1106577095, 1968763317, -1694827317, 1131959163, -2003933270, 2099061385, -527445304, 810608813}, 21 - ((Process.getThreadPriority(0) + 20) >> 6)).intern())) {
                    b11 = b10;
                } else {
                    int i10 = f946 + 51;
                    f943 = i10 % 128;
                    int i11 = i10 % 2;
                    b11 = 19;
                }
                break;
            case -1062227179:
                b10 = -1;
                if (!str.equals(m1038(new int[]{1395736492, 806319114, -1704104017, 1306750858, 610689984, 389459681, -499830729, 142612693, -1009688833, 735439708, 1344011723, -1321062947, 1552852785, -380523406, 1937455649, -1691495417, -343241360, -810816929, 1164655465, 32246573}, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 36).intern())) {
                    b11 = b10;
                }
                break;
            case -808014786:
                b10 = -1;
                if (!str.equals(m1038(new int[]{1679819910, -1822711051, -1956838522, -1536714687, -1045880468, -274648833, 2046077880, 891138012}, 15 - KeyEvent.getDeadChar(0, 0)).intern())) {
                    b11 = b10;
                } else {
                    b11 = 13;
                }
                break;
            case -595852006:
                b10 = -1;
                if ((str.equals(m1037("ᄨ鸂衿䒐ভ\uebe1왞똒\u1942홆ɜ罯", (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), "።焭豵툡", View.resolveSizeAndState(0, 0, 0), "堡皒쉆\uf51f").intern()) ? (char) 21 : (char) 16) == 21) {
                    int i12 = f943 + 1;
                    f946 = i12 % 128;
                    int i13 = i12 % 2;
                    b11 = 10;
                } else {
                    b11 = b10;
                }
                break;
            case -560158238:
                b10 = -1;
                if (!str.equals(m1038(new int[]{1679819910, -1822711051, -1956838522, -1536714687, -2084779692, 296521876, 989865647, -106285601, 2041232453, -1412510477}, 19 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern())) {
                    b11 = b10;
                } else {
                    b11 = 2;
                }
                break;
            case -541364416:
                b10 = -1;
                if (!str.equals(m1038(new int[]{1679819910, -1822711051, -1956838522, -1536714687, -2084779692, 296521876, 989865647, -106285601}, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 15).intern())) {
                    b11 = b10;
                } else {
                    b11 = 0;
                }
                break;
            case -520974940:
                b10 = -1;
                if (!str.equals(m1037("떫ఒ틟倦籩䁚螘쀄ᐖ\uefbe", (char) (AndroidCharacter.getMirror('0') - '0'), "።焭豵툡", (-1) - TextUtils.lastIndexOf("", '0', 0), "뜑\ued76\ue411ጮ").intern())) {
                    b11 = b10;
                } else {
                    b11 = 21;
                }
                break;
            case -235933147:
                if (!str.equals(m1037("熋菝桒༉蟸썴콋憿⺝뵹ꢞበ", (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), "።焭豵툡", MotionEvent.axisFromString("") + 1, "ၜ彘⻍å").intern())) {
                    b10 = -1;
                    b11 = b10;
                } else {
                    b11 = 5;
                }
                break;
            case -204096109:
                if (!str.equals(m1037("팊ᴚ胿滹㔑ퟗ⭾\uf8c1뵃먫\ud96b洛틡퍟ɍ疌嚣萕鯂舾棗ꏈꗁ옱觥瘯\u0d84\ue058\uf11a盥趷쒼嚷걄ቶ䙮精䥜쯂\ufddaꚶ", (char) ((KeyEvent.getMaxKeyCode() >> 16) + 52927), "።焭豵툡", 1765806307 - KeyEvent.getDeadChar(0, 0), "\ue367䀐뽩\ue2ce").intern())) {
                    b10 = -1;
                    b11 = b10;
                } else {
                    b11 = 3;
                }
                break;
            case -93733047:
                if (!str.equals(m1038(new int[]{-160109757, 1678485829, 1219457554, 742174074, -1956193768, -1456532265, -703862154, -1309406059}, 15 - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern())) {
                    b10 = -1;
                    b11 = b10;
                } else {
                    b11 = 4;
                }
                break;
            case -32161126:
                if (!str.equals(m1038(new int[]{1679819910, -1822711051, 199368289, -897148001, 1559599823, -446707451, -1091234682, 1030119999, -1071859616, 1633925628}, (ViewConfiguration.getPressedStateDuration() >> 16) + 18).intern())) {
                    b10 = -1;
                    b11 = b10;
                } else {
                    int i14 = f943 + 93;
                    f946 = i14 % 128;
                    b11 = i14 % 2 == 0 ? (byte) 11 : (byte) 99;
                }
                break;
            case 2115:
                if (!str.equals(m1038(new int[]{178824927, 1043384514}, 2 - View.MeasureSpec.getSize(0)).intern())) {
                    b10 = -1;
                    b11 = b10;
                } else {
                    b11 = 23;
                }
                break;
            case 63090975:
                if (!str.equals(m1037("诵\uf571\uf47d\udcfaᕺ", (char) (AndroidCharacter.getMirror('0') + 54013), "።焭豵툡", Color.rgb(0, 0, 0) + 1220231810, "艬뭂ⵇ㟓").intern())) {
                    b10 = -1;
                    b11 = b10;
                } else {
                    b11 = 22;
                }
                break;
            case 99044255:
                if (!str.equals(m1037("藜\ue1bf腎㟠崙鉕쒧\uf24d᱿킗⅌\ue3c7ྩ", (char) ((ViewConfiguration.getTouchSlop() >> 8) + 56496), "።焭豵툡", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1146599264, "ꇐꡈ낻隆").intern())) {
                    b10 = -1;
                    b11 = b10;
                } else {
                    b11 = 8;
                }
                break;
            case 515339810:
                if ((str.equals(m1037("䘅Ḃ揩⢀࠙䝭ሩ\ue9d3妸䝺", (char) KeyEvent.keyCodeFromString(""), "።焭豵툡", 1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), "\uf199楦䃍\udd01").intern()) ? '@' : '(') == '(') {
                    b10 = -1;
                    b11 = b10;
                } else {
                    int i15 = f943 + 65;
                    f946 = i15 % 128;
                    b11 = i15 % 2 != 0 ? (byte) 6 : (byte) 14;
                }
                break;
            case 957243679:
                if (!str.equals(m1038(new int[]{590749542, 1229453111, 1310982333, 359688277, 1106577095, 1968763317, -1694827317, 1131959163, -2003933270, 2099061385, -527445304, 810608813}, 20 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern())) {
                    b10 = -1;
                    b11 = b10;
                } else {
                    b11 = 18;
                }
                break;
            case 1228411167:
                if (!str.equals(m1037("첅æ啚\uec60纏쓽㑃描갠\u08c8軓ঃ䤱좙碴\uf728۟쳹壉\uef42냬찫뎪\ue791䜯\u2e5c㝒", (char) (31630 - TextUtils.indexOf("", "", 0, 0)), "።焭豵툡", (ViewConfiguration.getLongPressTimeout() >> 16) - 75521629, "ꎻ羡軻荻").intern())) {
                    b10 = -1;
                    b11 = b10;
                } else {
                    int i16 = f943 + 11;
                    f946 = i16 % 128;
                    int i17 = i16 % 2;
                    b11 = 17;
                }
                break;
            case 1564529113:
                if (!str.equals(m1038(new int[]{1213012618, -914215525, -27702953, -912641649, 583682277, 1645402073}, 11 - (ViewConfiguration.getLongPressTimeout() >> 16)).intern())) {
                    b10 = -1;
                    b11 = b10;
                } else {
                    b11 = 24;
                }
                break;
            case 1955888231:
                if (!str.equals(m1038(new int[]{-551019317, 566155660, 967163827, -534714254}, (ViewConfiguration.getTapTimeout() >> 16) + 6).intern())) {
                    b10 = -1;
                    b11 = b10;
                } else {
                    b11 = 15;
                }
                break;
            case 2035398868:
                if ((str.equals(m1037("\uf1fbꉻソ眃缇鯲沀뽥곴", (char) View.getDefaultSize(0, 0), "።焭豵툡", (-2105295333) - (ViewConfiguration.getMinimumFlingVelocity() >> 16), "\u1bf4莾皂喭").intern()) ? '\\' : 'R') == '\\') {
                    b11 = 9;
                } else {
                    b10 = -1;
                    b11 = b10;
                }
                break;
            default:
                b10 = -1;
                b11 = b10;
                break;
        }
        switch (b11) {
            case 0:
            case 1:
                return InMobiAdActivity.class;
            case 2:
            case 3:
                return com.inmobi.ads.rendering.InMobiAdActivity.class;
            case 4:
                return NativeVideoView.class;
            case 5:
                return AdUnit.AdMarkupType.class;
            case 6:
                return AdContainer.class;
            case 7:
                return AdContainer.RenderingProperties.class;
            case 8:
                return AdContainer.RenderingProperties.PlacementType.class;
            case 9:
                return AdContainer.EventType.class;
            case 10:
                return InMobiBanner.class;
            case 11:
                return InMobiInterstitial.class;
            case 12:
                return InMobiSdk.class;
            case 13:
                return InMobiAdRequest.class;
            case 14:
                return ViewableAd.class;
            case 15:
                return AdUnit.class;
            case 16:
                return NativeRecyclerViewAdapter.class;
            case 17:
                return InterstitialAdEventListener.class;
            case 18:
                return BannerAdEventListener.class;
            case 19:
                return NativeAdEventListener.class;
            case 20:
                return VideoEventListener.class;
            case 21:
                return AdResponse.class;
            case 22:
                return AdSet.class;
            case 23:
                return Ad.class;
            case 24:
                return ContextData.class;
            default:
                return null;
        }
    }

    public bo(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ Object m1029(ContextData contextData) {
        int i10 = f946 + 115;
        f943 = i10 % 128;
        if ((i10 % 2 == 0 ? '9' : '(') == '(') {
            return m1042(contextData);
        }
        m1042(contextData);
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ Object m1033(AdSet adSet) {
        int i10 = f946 + 33;
        f943 = i10 % 128;
        int i11 = i10 % 2;
        Object objM1036 = m1036(adSet);
        int i12 = f946 + 123;
        f943 = i12 % 128;
        int i13 = i12 % 2;
        return objM1036;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static Object m1036(AdSet adSet) {
        int i10 = f946 + 111;
        f943 = i10 % 128;
        char c10 = i10 % 2 == 0 ? 'a' : (char) 21;
        Boolean boolValueOf = Boolean.valueOf(adSet.isRewarded());
        if (c10 != 21) {
            int i11 = 61 / 0;
        }
        return boolValueOf;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static Object m1039(AdContainer adContainer) {
        int i10 = f946 + 81;
        f943 = i10 % 128;
        int i11 = i10 % 2;
        Object dataModel = adContainer.getDataModel();
        int i12 = f943 + 85;
        f946 = i12 % 128;
        int i13 = i12 % 2;
        return dataModel;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m1038(int[] iArr, int i10) {
        String str;
        synchronized (e.f1912) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f947.clone();
            e.f1913 = 0;
            while (true) {
                int i11 = e.f1913;
                if (i11 < iArr.length) {
                    int i12 = iArr[i11];
                    char c10 = (char) (i12 >> 16);
                    cArr[0] = c10;
                    char c11 = (char) i12;
                    cArr[1] = c11;
                    char c12 = (char) (iArr[i11 + 1] >> 16);
                    cArr[2] = c12;
                    char c13 = (char) iArr[i11 + 1];
                    cArr[3] = c13;
                    e.f1915 = (c10 << 16) + c11;
                    e.f1914 = (c12 << 16) + c13;
                    e.m2135(iArr2);
                    for (int i13 = 0; i13 < 16; i13++) {
                        int i14 = e.f1915 ^ iArr2[i13];
                        e.f1915 = i14;
                        e.f1914 = e.m2134(i14) ^ e.f1914;
                        int i15 = e.f1915;
                        e.f1915 = e.f1914;
                        e.f1914 = i15;
                    }
                    int i16 = e.f1915;
                    e.f1915 = e.f1914;
                    e.f1914 = i16;
                    e.f1914 = i16 ^ iArr2[16];
                    e.f1915 ^= iArr2[17];
                    int i17 = e.f1913;
                    int i18 = e.f1915;
                    cArr[0] = (char) (i18 >>> 16);
                    cArr[1] = (char) i18;
                    int i19 = e.f1914;
                    cArr[2] = (char) (i19 >>> 16);
                    cArr[3] = (char) i19;
                    e.m2135(iArr2);
                    int i20 = e.f1913;
                    cArr2[i20 << 1] = cArr[0];
                    cArr2[(i20 << 1) + 1] = cArr[1];
                    cArr2[(i20 << 1) + 2] = cArr[2];
                    cArr2[(i20 << 1) + 3] = cArr[3];
                    e.f1913 = i20 + 2;
                } else {
                    str = new String(cArr2, 0, i10);
                }
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static Object m1042(ContextData contextData) {
        int i10 = f943 + 43;
        f946 = i10 % 128;
        if ((i10 % 2 != 0 ? ';' : 'B') != 'B') {
            contextData.getAdvertisedContent();
            throw null;
        }
        String advertisedContent = contextData.getAdvertisedContent();
        int i11 = f943 + 19;
        f946 = i11 % 128;
        if ((i11 % 2 != 0 ? (char) 15 : 'N') != 15) {
            return advertisedContent;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻐ */
    public final Map<String, bd.b> mo736() {
        HashMap map = new HashMap();
        map.put(m1037("\udb3c홵룾່Ꮇ㕻薷ꄊ趴켊㚂ૠ开\u1f58篔䕇㻘\uf0a2䮹\udc79", (char) ((Process.getThreadPriority(0) + 20) >> 6), "።焭豵툡", ViewConfiguration.getEdgeSlop() >> 16, "䱞ꪏ峹肦").intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bo.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return bo.m1030((String) list.get(0));
            }
        });
        map.put(m1038(new int[]{-1725793521, -730295222, 1516941440, -713607251, 789143033, 1596857308, 1725840726, 1318708095, -480786985, -2072795879}, 20 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bo.6
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return bo.m1024((String) list.get(0));
            }
        });
        map.put(m1038(new int[]{1528012993, -984151626, -235226750, -1619835214, 646132679, -1699319494}, (-16777204) - Color.rgb(0, 0, 0)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bo.10
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return bo.m1026((AdContainer) list.get(0));
            }
        });
        map.put(m1037("삃蕿향凝啌滶䗥\ud8d1彄솰쟁\uf88b릆Ꮻ䪥\ue13b\ud9e1", (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 22973), "።焭豵툡", (-2142027376) - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), "輾十부彙").intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bo.8
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return bo.m1021((String) list.get(0));
            }
        });
        map.put(m1037("廹䫆\uf4e6ୠ纼廙毮⻌\ued62䝲ꜝ餍夂㺟", (char) (10641 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), "።焭豵툡", ImageFormat.getBitsPerPixel(0) + 1, "ₔ奙酢䄩").intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bo.7
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return bo.m1032((AdResponse) list.get(0));
            }
        });
        map.put(m1037("逡\ue9ecꔠ룙次ᛔ⽊豀ꄂ", (char) Color.red(0), "።焭豵툡", TextUtils.indexOf("", "") - 233891051, "ᕬ༛鱗춝").intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bo.9
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return bo.m1035((AdResponse) list.get(0));
            }
        });
        map.put(m1038(new int[]{-597077963, -1031637315, 919882452, -1324736608, 1721267046, -1545526047}, View.MeasureSpec.getMode(0) + 10).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bo.14
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return bo.m1033((AdSet) list.get(0));
            }
        });
        map.put(m1038(new int[]{-1725793521, -730295222, -1912473807, -354177865}, (ViewConfiguration.getPressedStateDuration() >> 16) + 6).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bo.12
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return bo.m1041((AdSet) list.get(0));
            }
        });
        map.put(m1037("ﮦ⮅呔턃プ뿟腫⟢曧ⶈ裐\ueb9c\uedd8ƻ", (char) (56609 - TextUtils.lastIndexOf("", '0')), "።焭豵툡", ExpandableListView.getPackedPositionType(0L), "ᴱ篘∝嗝").intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bo.11
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return bo.m1027((Ad) list.get(0));
            }
        });
        map.put(m1037("\ue51f⺫ቭ\udc1aⱑꊁ̀튟Ȫ鐖", (char) View.getDefaultSize(0, 0), "።焭豵툡", TextUtils.getOffsetBefore("", 0), "㐫쬑塪̼").intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bo.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return bo.m1040((Ad) list.get(0));
            }
        });
        map.put(m1038(new int[]{1752849683, 1688297142, 1224009197, -2053678699, 688876440, 1077574284}, 10 - (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bo.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return bo.m1034((Ad) list.get(0));
            }
        });
        map.put(m1038(new int[]{1860770838, -478187289, -1596450849, 37691170, 794507622, 1934799711, 203279309, -367153691}, Color.blue(0) + 13).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bo.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return bo.m1043((Ad) list.get(0));
            }
        });
        map.put(m1037("뒖砼㥼⍷Ϩ㌶칆\udc34\uf290팽ᅽ쇧⿒\ueb95詰ⴧ䅟\ue393\ue5c1\uf065", (char) (KeyEvent.getMaxKeyCode() >> 16), "።焭豵툡", View.MeasureSpec.makeMeasureSpec(0, 0), "\ueac3⻔験\uf2e1").intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bo.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return bo.m1029((ContextData) list.get(0));
            }
        });
        int i10 = f946 + 75;
        f943 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
        return map;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻛ */
    public final String mo737() {
        int i10 = f946 + 21;
        f943 = i10 % 128;
        if ((i10 % 2 == 0 ? '\"' : (char) 28) == 28) {
            return InMobiSdk.getVersion();
        }
        InMobiSdk.getVersion();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static Object m1031(Ad ad2) {
        int i10 = f943 + 79;
        f946 = i10 % 128;
        if (!(i10 % 2 == 0)) {
            ad2.getContextData();
            throw null;
        }
        ContextData contextData = ad2.getContextData();
        int i11 = f946 + 111;
        f943 = i11 % 128;
        if (i11 % 2 != 0) {
            return contextData;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static Object m1020(Ad ad2) {
        int i10 = f943 + 25;
        f946 = i10 % 128;
        int i11 = i10 % 2;
        String webVast = ad2.getWebVast();
        int i12 = f946 + 71;
        f943 = i12 % 128;
        if ((i12 % 2 == 0 ? '4' : '(') != '4') {
            return webVast;
        }
        int i13 = 50 / 0;
        return webVast;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static Object m1023(Ad ad2) {
        int i10 = f946 + 113;
        f943 = i10 % 128;
        int i11 = i10 % 2;
        String creativeId = ad2.getCreativeId();
        int i12 = f946 + 107;
        f943 = i12 % 128;
        int i13 = i12 % 2;
        return creativeId;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static Object m1028(AdResponse adResponse) {
        int i10 = f943 + 107;
        f946 = i10 % 128;
        int i11 = i10 % 2;
        List<AdSet> adSets = adResponse.getAdSets();
        int i12 = f946 + 27;
        f943 = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
        return adSets;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m1037(String str, char c10, String str2, int i10, String str3) {
        String str4;
        Object charArray = str3;
        if (str3 != null) {
            charArray = str3.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        Object charArray2 = str2;
        if (str2 != null) {
            charArray2 = str2.toCharArray();
        }
        char[] cArr2 = (char[]) charArray2;
        Object charArray3 = str;
        if (str != null) {
            charArray3 = str.toCharArray();
        }
        char[] cArr3 = (char[]) charArray3;
        synchronized (j.f2673) {
            char[] cArr4 = (char[]) cArr.clone();
            char[] cArr5 = (char[]) cArr2.clone();
            cArr4[0] = (char) (c10 ^ cArr4[0]);
            cArr5[2] = (char) (cArr5[2] + ((char) i10));
            int length = cArr3.length;
            char[] cArr6 = new char[length];
            j.f2675 = 0;
            while (true) {
                int i11 = j.f2675;
                if (i11 < length) {
                    int i12 = (i11 + 2) % 4;
                    int i13 = (i11 + 3) % 4;
                    int i14 = cArr4[i11 % 4] * 32718;
                    char c11 = cArr5[i12];
                    char c12 = (char) ((i14 + c11) % 65535);
                    j.f2674 = c12;
                    cArr5[i13] = (char) (((cArr4[i13] * 32718) + c11) / 65535);
                    cArr4[i13] = c12;
                    int i15 = j.f2675;
                    cArr6[i15] = (char) (((((long) (c12 ^ cArr3[i15])) ^ f948) ^ ((long) f945)) ^ ((long) f944));
                    j.f2675 = i15 + 1;
                } else {
                    str4 = new String(cArr6);
                }
            }
        }
        return str4;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static Object m1044(AdResponse adResponse) {
        int i10 = f946 + 91;
        f943 = i10 % 128;
        if (!(i10 % 2 != 0)) {
            adResponse.getPlacementId();
            throw null;
        }
        Long lValueOf = Long.valueOf(adResponse.getPlacementId());
        int i11 = f943 + 31;
        f946 = i11 % 128;
        if ((i11 % 2 != 0 ? '_' : '5') == '5') {
            return lValueOf;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static Object m1045(AdSet adSet) {
        int i10 = f943 + 21;
        f946 = i10 % 128;
        if (i10 % 2 == 0) {
            return adSet.getAds();
        }
        adSet.getAds();
        throw null;
    }
}
