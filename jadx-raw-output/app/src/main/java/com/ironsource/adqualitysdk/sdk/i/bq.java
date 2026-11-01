package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.five_corp.ad.AdActivity;
import com.five_corp.ad.CreativeType;
import com.five_corp.ad.FiveAd;
import com.five_corp.ad.FiveAdConfig;
import com.five_corp.ad.FiveAdCustomLayout;
import com.five_corp.ad.FiveAdFormat;
import com.five_corp.ad.FiveAdInterface;
import com.five_corp.ad.FiveAdInterstitial;
import com.five_corp.ad.FiveAdInterstitialEventListener;
import com.five_corp.ad.FiveAdListener;
import com.five_corp.ad.FiveAdLoadListener;
import com.five_corp.ad.FiveAdState;
import com.five_corp.ad.FiveAdVideoReward;
import com.five_corp.ad.FiveAdVideoRewardEventListener;
import com.five_corp.ad.FiveAdViewEventListener;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class bq extends bd {

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f975 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static long f976 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static long f977 = -8983181033830927815L;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f978 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f979 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f980 = 1538894784;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public static /* synthetic */ FiveAd m1065() {
        int i10 = f978 + 37;
        f975 = i10 % 128;
        int i11 = i10 % 2;
        FiveAd fiveAdM1067 = m1067();
        int i12 = f975 + 31;
        f978 = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
        return fiveAdM1067;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static String m1068(FiveAdInterface fiveAdInterface) {
        int i10 = f978 + 49;
        f975 = i10 % 128;
        int i11 = i10 % 2;
        String slotId = fiveAdInterface.getSlotId();
        int i12 = f975 + 37;
        f978 = i12 % 128;
        if (i12 % 2 == 0) {
            return slotId;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ String m1073(FiveAdCustomLayout fiveAdCustomLayout) {
        int i10 = f978 + 59;
        f975 = i10 % 128;
        int i11 = i10 % 2;
        String strM1080 = m1080(fiveAdCustomLayout);
        int i12 = f978 + 7;
        f975 = i12 % 128;
        int i13 = i12 % 2;
        return strM1080;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ CreativeType m1076(FiveAdInterface fiveAdInterface) {
        int i10 = f975 + 47;
        f978 = i10 % 128;
        int i11 = i10 % 2;
        CreativeType creativeTypeM1071 = m1071(fiveAdInterface);
        int i12 = f978 + 117;
        f975 = i12 % 128;
        if (i12 % 2 != 0) {
            return creativeTypeM1071;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ FiveAdListener m1079(FiveAdInterface fiveAdInterface) {
        int i10 = f978 + 65;
        f975 = i10 % 128;
        if ((i10 % 2 == 0 ? (char) 4 : '/') == 4) {
            m1066(fiveAdInterface);
            throw null;
        }
        FiveAdListener fiveAdListenerM1066 = m1066(fiveAdInterface);
        int i11 = f978 + 85;
        f975 = i11 % 128;
        int i12 = i11 % 2;
        return fiveAdListenerM1066;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ String m1083(FiveAdInterface fiveAdInterface) {
        int i10 = f978 + 67;
        f975 = i10 % 128;
        int i11 = i10 % 2;
        String strM1068 = m1068(fiveAdInterface);
        int i12 = f978 + 5;
        f975 = i12 % 128;
        if ((i12 % 2 == 0 ? '7' : '\b') == '\b') {
            return strM1068;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ String m1085(FiveAdInterface fiveAdInterface) {
        int i10 = f978 + 93;
        f975 = i10 % 128;
        int i11 = i10 % 2;
        String strM1069 = m1069(fiveAdInterface);
        int i12 = f978 + 7;
        f975 = i12 % 128;
        if (i12 % 2 != 0) {
            return strM1069;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static FiveAdListener m1066(FiveAdInterface fiveAdInterface) {
        int i10 = f975 + 7;
        f978 = i10 % 128;
        int i11 = i10 % 2;
        FiveAdListener listener = fiveAdInterface.getListener();
        int i12 = f978 + 63;
        f975 = i12 % 128;
        int i13 = i12 % 2;
        return listener;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static FiveAd m1067() {
        int i10 = f978 + 99;
        f975 = i10 % 128;
        if (i10 % 2 != 0) {
            return FiveAd.getSingleton();
        }
        int i11 = 50 / 0;
        return FiveAd.getSingleton();
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static String m1069(FiveAdInterface fiveAdInterface) {
        int i10 = f978 + 75;
        f975 = i10 % 128;
        if ((i10 % 2 == 0 ? (char) 3 : 'G') == 'G') {
            return fiveAdInterface.getAdParameter();
        }
        fiveAdInterface.getAdParameter();
        throw null;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static String m1070(FiveAdInterface fiveAdInterface) {
        int i10 = f978 + 3;
        f975 = i10 % 128;
        int i11 = i10 % 2;
        String fiveAdTag = fiveAdInterface.getFiveAdTag();
        int i12 = f975 + 23;
        f978 = i12 % 128;
        if ((i12 % 2 != 0 ? '_' : '2') != '_') {
            return fiveAdTag;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static CreativeType m1071(FiveAdInterface fiveAdInterface) {
        int i10 = f978 + 115;
        f975 = i10 % 128;
        if (i10 % 2 == 0) {
            fiveAdInterface.getCreativeType();
            throw null;
        }
        CreativeType creativeType = fiveAdInterface.getCreativeType();
        int i11 = f975 + 3;
        f978 = i11 % 128;
        int i12 = i11 % 2;
        return creativeType;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ String m1074(FiveAdInterface fiveAdInterface) {
        int i10 = f978 + 105;
        f975 = i10 % 128;
        int i11 = i10 % 2;
        String strM1070 = m1070(fiveAdInterface);
        int i12 = f978 + 45;
        f975 = i12 % 128;
        if ((i12 % 2 == 0 ? '#' : 'V') != '#') {
            return strM1070;
        }
        int i13 = 9 / 0;
        return strM1070;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ String m1077(FiveAdConfig fiveAdConfig) {
        int i10 = f975 + 73;
        f978 = i10 % 128;
        int i11 = i10 % 2;
        String strM1072 = m1072(fiveAdConfig);
        int i12 = f978 + 3;
        f975 = i12 % 128;
        if (!(i12 % 2 == 0)) {
            return strM1072;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m1080(FiveAdCustomLayout fiveAdCustomLayout) {
        int i10 = f978 + 37;
        f975 = i10 % 128;
        if (!(i10 % 2 == 0)) {
            return fiveAdCustomLayout.getAdvertiserName();
        }
        fiveAdCustomLayout.getAdvertiserName();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m1084(String str, char c10, String str2, int i10, String str3) {
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
                    cArr6[i15] = (char) (((((long) (c12 ^ cArr3[i15])) ^ f976) ^ ((long) f980)) ^ ((long) f979));
                    j.f2675 = i15 + 1;
                } else {
                    str4 = new String(cArr6);
                }
            }
        }
        return str4;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ void m1087(FiveAdInterface fiveAdInterface, FiveAdLoadListener fiveAdLoadListener) {
        int i10 = f978 + 83;
        f975 = i10 % 128;
        boolean z10 = i10 % 2 != 0;
        m1078(fiveAdInterface, fiveAdLoadListener);
        if (z10) {
        } else {
            throw null;
        }
    }

    public bq(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ void m1075(FiveAdInterface fiveAdInterface, FiveAdListener fiveAdListener) {
        int i10 = f978 + 97;
        f975 = i10 % 128;
        char c10 = i10 % 2 == 0 ? '>' : 'N';
        m1086(fiveAdInterface, fiveAdListener);
        if (c10 != '>') {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static void m1082(FiveAdInterface fiveAdInterface, FiveAdViewEventListener fiveAdViewEventListener) {
        int i10 = f975 + 1;
        f978 = i10 % 128;
        int i11 = i10 % 2;
        fiveAdInterface.setViewEventListener(fiveAdViewEventListener);
        int i12 = f978 + 49;
        f975 = i12 % 128;
        if (i12 % 2 != 0) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ void m1088(FiveAdInterface fiveAdInterface, FiveAdViewEventListener fiveAdViewEventListener) {
        int i10 = f975 + 119;
        f978 = i10 % 128;
        boolean z10 = i10 % 2 != 0;
        m1082(fiveAdInterface, fiveAdViewEventListener);
        if (z10) {
            int i11 = 1 / 0;
        }
        int i12 = f978 + 75;
        f975 = i12 % 128;
        if ((i12 % 2 == 0 ? 'X' : 'F') != 'X') {
        } else {
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻛ */
    public final String mo737() {
        int i10 = f978 + 103;
        f975 = i10 % 128;
        if (i10 % 2 == 0) {
            FiveAd.getSdkSemanticVersion();
            throw null;
        }
        String sdkSemanticVersion = FiveAd.getSdkSemanticVersion();
        int i11 = f975 + 7;
        f978 = i11 % 128;
        int i12 = i11 % 2;
        return sdkSemanticVersion;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static void m1078(FiveAdInterface fiveAdInterface, FiveAdLoadListener fiveAdLoadListener) {
        int i10 = f978 + 57;
        f975 = i10 % 128;
        int i11 = i10 % 2;
        fiveAdInterface.setLoadListener(fiveAdLoadListener);
        int i12 = f978 + 125;
        f975 = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m1081(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (f.f2019) {
            f.f2017 = i10;
            char[] cArr2 = new char[cArr.length];
            f.f2018 = 0;
            while (true) {
                int i11 = f.f2018;
                if (i11 < cArr.length) {
                    cArr2[i11] = (char) (((long) (cArr[i11] ^ (f.f2017 * i11))) ^ f977);
                    f.f2018++;
                } else {
                    str2 = new String(cArr2);
                }
            }
        }
        return str2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻐ */
    public final Map<String, bd.b> mo736() {
        HashMap map = new HashMap();
        map.put(m1084("\udc60ÝᲥ㕸馃\ufe6f돞跛鼩侊鋧\uf7e8妶굲넅浨瀃ﱘ론뢸", (char) (ViewConfiguration.getScrollBarSize() >> 8), "\u0000\u0000\u0000\u0000", AndroidCharacter.getMirror('0') - '0', "Ⱐ遏둗◅").intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return bq.m1077((FiveAdConfig) list.get(0));
            }
        });
        map.put(m1084("桲䉰턀ꙻ邏౨\uebea閺㫊鉳惷ꪎ䊋\udd0c䮜\ue552ꅪ늢\udcaf熽笥岄즃䌊", (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), "\u0000\u0000\u0000\u0000", ExpandableListView.getPackedPositionType(0L), "捺ퟹጶ奮").intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return bq.m1083((FiveAdInterface) list.get(0));
            }
        });
        map.put(m1081("㉞킯\uf7ab骦릜峰揮\u06dd◅죻\uef29\uf23c鄸된嬕繥ᵪⁿ읻\uea51袢", 58099 - (ViewConfiguration.getTouchSlop() >> 8)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return bq.m1074((FiveAdInterface) list.get(0));
            }
        });
        map.put(m1081("㉞鵻氃㼊軌妌⢶\uf869䭥ᨯ\ue5d1든ވ횰꙽焑쀪鏋拄춮鵐汫㼗軑姧⢓ﮛ䭝ᨍ\ue537", 44839 - (ViewConfiguration.getEdgeSlop() >> 16)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.9
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return bq.m1076((FiveAdInterface) list.get(0));
            }
        });
        map.put(m1084("杋\ued2e⬖\udccf\ue2ecⵔ㤦㻓赤ﮪ족慉\ue01d\ue814챉☘\ufb12⚧釤눾꥓\uf617\uf8ab뿓䖩쑞鄍蠭䢤", (char) (TextUtils.getOffsetAfter("", 0) + 64474), "\u0000\u0000\u0000\u0000", Color.alpha(0) - 1154598813, "揼⸸\udabb泻").intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.10
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return bq.m1085((FiveAdInterface) list.get(0));
            }
        });
        map.put(m1081("㉞羅ꓫ历Ἔ쫐\uf1ae봽棅ល썩軜떸慼ⳕ\udb85蝪닟禣╹퀶龂䭾瘢㶔\ue950", View.MeasureSpec.getMode(0) + 52051).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.6
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return bq.m1079((FiveAdInterface) list.get(0));
            }
        });
        map.put(m1084("鈖⩥撶\udecc꽻븊㥄팼괔끃馘嗾眗\ue669䧸쟚媨Ͱڌﺝ뭫꼂焎뼹\ueaf2\ueb9f", (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 10807), "\u0000\u0000\u0000\u0000", View.resolveSize(0, 0), "\ude4a㖏㜬먪").intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.8
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                bq.m1075((FiveAdInterface) list.get(0), (FiveAdListener) list.get(1));
                return null;
            }
        });
        map.put(m1081("㉞\ue597鷛딞浼Ҹ㲞퓵谅ꑉ徾矮\u2fda윚ｆ隨仦昬", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 55242).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.7
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return bq.m1065();
            }
        });
        map.put(m1081("㉞ⷳഓ浲䳬갤豆\uefb1켥⽝ບ滏乹ꦵ视\ue934좨⣟࠘殱䯡ꬣ譗\ueaf6쨴⩜\u058b攥䕮\ua48f蓉\ue446잸⟛ݢ", 8111 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.15
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return bq.m1073((FiveAdCustomLayout) list.get(0));
            }
        });
        map.put(m1084("橙ばꠅ矡᪽膴蔪漶慚ﱚꅑ\uf2bf䤶憭嫸", (char) (TextUtils.indexOf("", "", 0, 0) + 12454), "\u0000\u0000\u0000\u0000", Drawable.resolveOpacity(0, 0) + 11987721, "ञ뛫ꘀ\uf530").intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                bq.m1087((FiveAdInterface) list.get(0), (FiveAdLoadListener) list.get(1));
                return null;
            }
        });
        map.put(m1084("綢ꄉݽ\uefbc嵟⩅粐㸇꺩쪲\uf3b9䙞꼓톣萸沎癥וֹᲪ鵃", (char) (ViewConfiguration.getPressedStateDuration() >> 16), "\u0000\u0000\u0000\u0000", KeyEvent.getMaxKeyCode() >> 16, "\uf3ea兙\u0e7c謘").intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                bq.m1088((FiveAdInterface) list.get(0), (FiveAdViewEventListener) list.get(1));
                return null;
            }
        });
        int i10 = f975 + 49;
        f978 = i10 % 128;
        if ((i10 % 2 != 0 ? 'U' : 'W') != 'U') {
            return map;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:116:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:13:0x0031  */
    /* JADX WARN: Code duplicated, block: B:15:0x0050  */
    /* JADX WARN: Code duplicated, block: B:16:0x0053  */
    /* JADX WARN: Code duplicated, block: B:18:0x0069  */
    /* JADX WARN: Code duplicated, block: B:20:0x006c  */
    /* JADX WARN: Code duplicated, block: B:21:0x006f  */
    /* JADX WARN: Code duplicated, block: B:23:0x008f  */
    /* JADX WARN: Code duplicated, block: B:24:0x0093  */
    /* JADX WARN: Code duplicated, block: B:26:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:27:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:29:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:30:0x00de  */
    /* JADX WARN: Code duplicated, block: B:32:0x0101  */
    /* JADX WARN: Code duplicated, block: B:33:0x0104  */
    /* JADX WARN: Code duplicated, block: B:35:0x0128  */
    /* JADX WARN: Code duplicated, block: B:36:0x012b  */
    /* JADX WARN: Code duplicated, block: B:38:0x0143  */
    /* JADX WARN: Code duplicated, block: B:41:0x0148  */
    /* JADX WARN: Code duplicated, block: B:42:0x014b  */
    /* JADX WARN: Code duplicated, block: B:44:0x0165  */
    /* JADX WARN: Code duplicated, block: B:45:0x0168  */
    /* JADX WARN: Code duplicated, block: B:47:0x018c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0190  */
    /* JADX WARN: Code duplicated, block: B:50:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:51:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:53:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:54:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:57:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:58:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:60:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:61:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:64:0x0218  */
    /* JADX WARN: Code duplicated, block: B:67:0x023a  */
    /* JADX WARN: Code duplicated, block: B:69:0x023d  */
    /* JADX WARN: Code duplicated, block: B:71:0x0248  */
    /* JADX WARN: Code duplicated, block: B:72:0x024b  */
    /* JADX WARN: Code duplicated, block: B:73:0x024e  */
    /* JADX WARN: Code duplicated, block: B:75:0x0265  */
    /* JADX WARN: Code duplicated, block: B:76:0x026f  */
    /* JADX WARN: Code duplicated, block: B:78:0x028a  */
    /* JADX WARN: Code duplicated, block: B:79:0x028d  */
    /* JADX WARN: Code duplicated, block: B:81:0x0290  */
    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo738(String str) {
        char c10;
        int i10;
        char c11;
        int i11 = f975 + 97;
        f978 = i11 % 128;
        byte b10 = 2;
        if (i11 % 2 != 0) {
            int i12 = 53 / 0;
            switch (str.hashCode()) {
                case -1836618638:
                    if (str.equals(m1084("倢昗\udeb4﹘돥\uf862\ued2f굿\udca8仆", (char) Color.green(0), "\u0000\u0000\u0000\u0000", ExpandableListView.getPackedPositionType(0L), "⺢ﳃ뵴孖").intern())) {
                        c10 = 19;
                    } else {
                        c10 = '_';
                    }
                    if (c10 != '_') {
                        b10 = -1;
                    } else {
                        b10 = 13;
                    }
                    break;
                case -1782131271:
                    if (str.equals(m1081("㉿䳩켽乷좜䯀쨹䕟잕䛝셬䎘싰崫\udc46府\ud9cd堵\udb4d嗧퐣坠톓像팒剜\uec96濔\uee60梾", (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 32441).intern())) {
                        b10 = -1;
                    } else {
                        int i13 = f978 + 95;
                        f975 = i13 % 128;
                        int i14 = i13 % 2;
                        b10 = 16;
                    }
                    break;
                case -962125644:
                    if (str.equals(m1084("꜍詾钫\uf32c誉樂\ud9c3ំ恏\udf40鋧悛\ueb9f\ue6e1\udabe\u1aee夰\uef38熶搏㰎卑儂", (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), "\u0000\u0000\u0000\u0000", Color.green(0) + 1686834861, "굋謎塤\u0a52").intern())) {
                        b10 = -1;
                    } else {
                        i10 = f975 + 69;
                        f978 = i10 % 128;
                        if (i10 % 2 != 0) {
                            b10 = 12;
                        } else {
                            b10 = 121;
                        }
                    }
                    break;
                case -939888073:
                    if (!str.equals(m1081("㉿˩匽ꁷ\uf09c쇀ᘬ杙랟蓞핪▭", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 12473).intern())) {
                        b10 = -1;
                    }
                    break;
                case -853874964:
                    if (str.equals(m1081("㉿嫭\ue335\u086b邌㧬䘑\uef7d瞣鳱┺뉒", TextUtils.getOffsetAfter("", 0) + 26813).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 5;
                    }
                    break;
                case -735613671:
                    if (str.equals(m1084("Ȳ\u0cd3뭲ꨜᤸ㨬壧픙\uf63b杰沜\uf583迡臓З癦\u2fdc돏題汵ဿ錭짤碭妛瀇懦", (char) (809 - ((byte) KeyEvent.getModifierMetaStateMask())), "\u0000\u0000\u0000\u0000", View.resolveSize(0, 0) - 2104003695, "酧靳⪂\ue103").intern())) {
                        c11 = 'H';
                    } else {
                        c11 = 'F';
                    }
                    if (c11 != 'H') {
                        int i15 = f978 + 105;
                        f975 = i15 % 128;
                        int i16 = i15 % 2;
                        b10 = 14;
                    } else {
                        b10 = -1;
                    }
                    break;
                case -624329424:
                    if (str.equals(m1081("㉿略밥\ue7c3⺬噔饄쀿\u0be2느梅㴓搉꿩횦ṍ䄜裈", Drawable.resolveOpacity(0, 0) + 18229).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 3;
                    }
                    break;
                case -295916403:
                    if (str.equals(m1084("㞤ꘊ\udabb\ue9ec酨婽ḭ\ufff9盆喪ɨ⍊↷㵯⤢躴띝꽡㖦හཇ儺碍욓瓣儑䠱韟ᑘ媳惏", (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 30652), "\u0000\u0000\u0000\u0000", (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 702959057, "퇃\ue64d방⭷").intern())) {
                        b10 = -1;
                    } else {
                        b10 = 15;
                    }
                    break;
                case -189625759:
                    if (str.equals(m1081("㉿霃磩\udda5Ꜵࣂ\ued82뜒ᣕﶷ䝵⣛趩坧㣇鶍杨죖", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 42323).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 7;
                    }
                    break;
                case -6611420:
                    if (!(str.equals(m1081("㉿鶟淑㴱资嵖Ⲫﳾ䰵ᰛ\uec5d뾺\u0fec\udfd9꼎", 45007 - ExpandableListView.getPackedPositionGroup(0L)).intern()))) {
                        b10 = 6;
                    } else {
                        b10 = -1;
                    }
                    break;
                case 636996201:
                    if (str.equals(m1084("⻚렢艺\ueacc茟蘾䡪釡\ue4e4ꢖ穩㇋⦠㴳", (char) (48865 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), "\u0000\u0000\u0000\u0000", ViewConfiguration.getDoubleTapTimeout() >> 16, "꧊ᖤ\ue05b薾").intern())) {
                        b10 = -1;
                    } else {
                        b10 = 8;
                    }
                    break;
                case 890103511:
                    if (str.equals(m1084("捵\uef0c㮾\ude4a钿ꏕ쥁㼮㴠휉悑⃮蒁啳\ue079滐⇨욺猪\ude2f\ue8c1눚勸謑沂䆙欲\udc9b捛苫쏢\u2fdfᆿჾ텬", (char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), "\u0000\u0000\u0000\u0000", 1519817406 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), "빂隒ग़쑁").intern())) {
                        b10 = -1;
                    } else {
                        b10 = 4;
                    }
                    break;
                case 1252059573:
                    if (str.equals(m1081("㉿╣ᰩ矅溴䆢륝逵诅\ue297햨쵚\u2438Ῑ皒榶䅭", 5939 - (ViewConfiguration.getScrollBarSize() >> 8)).intern())) {
                        b10 = -1;
                    } else {
                        int i17 = f975 + 17;
                        f978 = i17 % 128;
                        int i18 = i17 % 2;
                        b10 = 9;
                    }
                    break;
                case 1508614908:
                    if (str.equals(m1084("剁\uf10e拋邩쾯굅槷긫\ue356〳욊", (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), "\u0000\u0000\u0000\u0000", 1745777887 - ImageFormat.getBitsPerPixel(0), "\ue0de\u0e74흨䱍").intern())) {
                        b10 = -1;
                    } else {
                        b10 = 10;
                    }
                    break;
                case 1835584239:
                    if (str.equals(m1084("쁷\u2d7cඕϺ澣㹚齝춗\uf8f4Ó\u2d76훷⃗뮝뱰\ue4dc㔃艑", (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 12460), "\u0000\u0000\u0000\u0000", ViewConfiguration.getTapTimeout() >> 16, "\u0eda༢괜\ue830").intern())) {
                        b10 = -1;
                    } else {
                        b10 = 11;
                    }
                    break;
                case 1942443945:
                    if (str.equals(m1081("㉺\u2d72మ濳亩깍褙\ue8d3쮥⭁ੳ支", 7992 - ImageFormat.getBitsPerPixel(0)).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 1;
                    }
                    break;
                case 2104624789:
                    if (str.equals(m1084("彽볐⊞\ufdcb\uf84b当", (char) (32187 - (ViewConfiguration.getPressedStateDuration() >> 16)), "\u0000\u0000\u0000\u0000", ExpandableListView.getPackedPositionChild(0L) + 1, "헶橵뮱婽").intern())) {
                        b10 = -1;
                    } else {
                        b10 = 0;
                    }
                    break;
                default:
                    b10 = -1;
                    break;
            }
        } else {
            switch (str.hashCode()) {
                case -1836618638:
                    if (str.equals(m1084("倢昗\udeb4﹘돥\uf862\ued2f굿\udca8仆", (char) Color.green(0), "\u0000\u0000\u0000\u0000", ExpandableListView.getPackedPositionType(0L), "⺢ﳃ뵴孖").intern())) {
                        c10 = 19;
                    } else {
                        c10 = '_';
                    }
                    if (c10 != '_') {
                        b10 = -1;
                    } else {
                        b10 = 13;
                    }
                    break;
                case -1782131271:
                    if (str.equals(m1081("㉿䳩켽乷좜䯀쨹䕟잕䛝셬䎘싰崫\udc46府\ud9cd堵\udb4d嗧퐣坠톓像팒剜\uec96濔\uee60梾", (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 32441).intern())) {
                        b10 = -1;
                    } else {
                        int i19 = f978 + 95;
                        f975 = i19 % 128;
                        int i110 = i19 % 2;
                        b10 = 16;
                    }
                    break;
                case -962125644:
                    if (str.equals(m1084("꜍詾钫\uf32c誉樂\ud9c3ំ恏\udf40鋧悛\ueb9f\ue6e1\udabe\u1aee夰\uef38熶搏㰎卑儂", (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), "\u0000\u0000\u0000\u0000", Color.green(0) + 1686834861, "굋謎塤\u0a52").intern())) {
                        b10 = -1;
                    } else {
                        i10 = f975 + 69;
                        f978 = i10 % 128;
                        if (i10 % 2 != 0) {
                            b10 = 12;
                        } else {
                            b10 = 121;
                        }
                    }
                    break;
                case -939888073:
                    if (!str.equals(m1081("㉿˩匽ꁷ\uf09c쇀ᘬ杙랟蓞핪▭", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 12473).intern())) {
                        b10 = -1;
                    }
                    break;
                case -853874964:
                    if (str.equals(m1081("㉿嫭\ue335\u086b邌㧬䘑\uef7d瞣鳱┺뉒", TextUtils.getOffsetAfter("", 0) + 26813).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 5;
                    }
                    break;
                case -735613671:
                    if (str.equals(m1084("Ȳ\u0cd3뭲ꨜᤸ㨬壧픙\uf63b杰沜\uf583迡臓З癦\u2fdc돏題汵ဿ錭짤碭妛瀇懦", (char) (809 - ((byte) KeyEvent.getModifierMetaStateMask())), "\u0000\u0000\u0000\u0000", View.resolveSize(0, 0) - 2104003695, "酧靳⪂\ue103").intern())) {
                        c11 = 'H';
                    } else {
                        c11 = 'F';
                    }
                    if (c11 != 'H') {
                        int i111 = f978 + 105;
                        f975 = i111 % 128;
                        int i112 = i111 % 2;
                        b10 = 14;
                    } else {
                        b10 = -1;
                    }
                    break;
                case -624329424:
                    if (str.equals(m1081("㉿略밥\ue7c3⺬噔饄쀿\u0be2느梅㴓搉꿩횦ṍ䄜裈", Drawable.resolveOpacity(0, 0) + 18229).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 3;
                    }
                    break;
                case -295916403:
                    if (str.equals(m1084("㞤ꘊ\udabb\ue9ec酨婽ḭ\ufff9盆喪ɨ⍊↷㵯⤢躴띝꽡㖦හཇ儺碍욓瓣儑䠱韟ᑘ媳惏", (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 30652), "\u0000\u0000\u0000\u0000", (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 702959057, "퇃\ue64d방⭷").intern())) {
                        b10 = -1;
                    } else {
                        b10 = 15;
                    }
                    break;
                case -189625759:
                    if (str.equals(m1081("㉿霃磩\udda5Ꜵࣂ\ued82뜒ᣕﶷ䝵⣛趩坧㣇鶍杨죖", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 42323).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 7;
                    }
                    break;
                case -6611420:
                    if (!(str.equals(m1081("㉿鶟淑㴱资嵖Ⲫﳾ䰵ᰛ\uec5d뾺\u0fec\udfd9꼎", 45007 - ExpandableListView.getPackedPositionGroup(0L)).intern()))) {
                        b10 = 6;
                    } else {
                        b10 = -1;
                    }
                    break;
                case 636996201:
                    if (str.equals(m1084("⻚렢艺\ueacc茟蘾䡪釡\ue4e4ꢖ穩㇋⦠㴳", (char) (48865 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), "\u0000\u0000\u0000\u0000", ViewConfiguration.getDoubleTapTimeout() >> 16, "꧊ᖤ\ue05b薾").intern())) {
                        b10 = -1;
                    } else {
                        b10 = 8;
                    }
                    break;
                case 890103511:
                    if (str.equals(m1084("捵\uef0c㮾\ude4a钿ꏕ쥁㼮㴠휉悑⃮蒁啳\ue079滐⇨욺猪\ude2f\ue8c1눚勸謑沂䆙欲\udc9b捛苫쏢\u2fdfᆿჾ텬", (char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), "\u0000\u0000\u0000\u0000", 1519817406 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), "빂隒ग़쑁").intern())) {
                        b10 = -1;
                    } else {
                        b10 = 4;
                    }
                    break;
                case 1252059573:
                    if (str.equals(m1081("㉿╣ᰩ矅溴䆢륝逵诅\ue297햨쵚\u2438Ῑ皒榶䅭", 5939 - (ViewConfiguration.getScrollBarSize() >> 8)).intern())) {
                        b10 = -1;
                    } else {
                        int i113 = f975 + 17;
                        f978 = i113 % 128;
                        int i114 = i113 % 2;
                        b10 = 9;
                    }
                    break;
                case 1508614908:
                    if (str.equals(m1084("剁\uf10e拋邩쾯굅槷긫\ue356〳욊", (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), "\u0000\u0000\u0000\u0000", 1745777887 - ImageFormat.getBitsPerPixel(0), "\ue0de\u0e74흨䱍").intern())) {
                        b10 = -1;
                    } else {
                        b10 = 10;
                    }
                    break;
                case 1835584239:
                    if (str.equals(m1084("쁷\u2d7cඕϺ澣㹚齝춗\uf8f4Ó\u2d76훷⃗뮝뱰\ue4dc㔃艑", (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 12460), "\u0000\u0000\u0000\u0000", ViewConfiguration.getTapTimeout() >> 16, "\u0eda༢괜\ue830").intern())) {
                        b10 = -1;
                    } else {
                        b10 = 11;
                    }
                    break;
                case 1942443945:
                    if (str.equals(m1081("㉺\u2d72మ濳亩깍褙\ue8d3쮥⭁ੳ支", 7992 - ImageFormat.getBitsPerPixel(0)).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 1;
                    }
                    break;
                case 2104624789:
                    if (str.equals(m1084("彽볐⊞\ufdcb\uf84b当", (char) (32187 - (ViewConfiguration.getPressedStateDuration() >> 16)), "\u0000\u0000\u0000\u0000", ExpandableListView.getPackedPositionChild(0L) + 1, "헶橵뮱婽").intern())) {
                        b10 = -1;
                    } else {
                        b10 = 0;
                    }
                    break;
                default:
                    b10 = -1;
                    break;
            }
        }
        switch (b10) {
            case 0:
                return FiveAd.class;
            case 1:
                return CreativeType.class;
            case 2:
                return FiveAdConfig.class;
            case 3:
            case 4:
                return FiveAdCustomLayout.class;
            case 5:
                return FiveAdFormat.class;
            case 6:
                return FiveAdInterface.class;
            case 7:
                return FiveAdInterstitial.class;
            case 8:
                return FiveAdListener.class;
            case 9:
                return FiveAdVideoReward.class;
            case 10:
                return FiveAdState.class;
            case 11:
                return FiveAdLoadListener.class;
            case 12:
                return FiveAdViewEventListener.class;
            case 13:
            case 14:
                return AdActivity.class;
            case 15:
                return FiveAdInterstitialEventListener.class;
            case 16:
                return FiveAdVideoRewardEventListener.class;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m1072(FiveAdConfig fiveAdConfig) {
        int i10 = f975 + 113;
        f978 = i10 % 128;
        char c10 = i10 % 2 != 0 ? 'Q' : '8';
        String str = fiveAdConfig.appId;
        if (c10 == '8') {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static void m1086(FiveAdInterface fiveAdInterface, FiveAdListener fiveAdListener) {
        int i10 = f978 + 69;
        f975 = i10 % 128;
        int i11 = i10 % 2;
        fiveAdInterface.setListener(fiveAdListener);
        int i12 = f975 + 13;
        f978 = i12 % 128;
        if (!(i12 % 2 != 0)) {
            return;
        }
        int i13 = 78 / 0;
    }
}
