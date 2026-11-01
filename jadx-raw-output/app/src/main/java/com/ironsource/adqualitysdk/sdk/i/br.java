package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.fyber.FairBid;
import com.fyber.fairbid.ads.ImpressionData;
import com.fyber.fairbid.ads.Interstitial;
import com.fyber.fairbid.ads.PlacementType;
import com.fyber.fairbid.ads.Rewarded;
import com.fyber.fairbid.ads.ShowOptions;
import com.fyber.fairbid.ads.interstitial.InterstitialListener;
import com.fyber.fairbid.ads.rewarded.RewardedListener;
import com.fyber.fairbid.common.lifecycle.EventStream;
import com.fyber.fairbid.internal.Constants;
import com.fyber.fairbid.mediation.MediationManager;
import com.fyber.fairbid.mediation.abstr.CachedAd;
import com.fyber.fairbid.mediation.abstr.NetworkAdapter;
import com.fyber.fairbid.mediation.adapter.AdapterConfiguration;
import com.fyber.fairbid.mediation.adapter.AdapterPool;
import com.fyber.fairbid.mediation.config.MediationConfig;
import com.fyber.fairbid.sdk.placements.Placement;
import com.fyber.fairbid.sdk.placements.PlacementsHandler;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class br extends bd {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f992 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f993 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static long f994 = -7017710411839432555L;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static long f995 = 6795495270814316623L;

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static MediationManager m1093() {
        MediationManager companion;
        int i10 = f993 + 73;
        f992 = i10 % 128;
        if (!(i10 % 2 != 0)) {
            companion = MediationManager.Companion.getInstance();
            int i11 = 31 / 0;
        } else {
            companion = MediationManager.Companion.getInstance();
        }
        int i12 = f992 + 73;
        f993 = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
        return companion;
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static String m1095(ImpressionData impressionData) {
        int i10 = f992 + 81;
        f993 = i10 % 128;
        boolean z10 = i10 % 2 == 0;
        String variantId = impressionData.getVariantId();
        if (!z10) {
            int i11 = 19 / 0;
        }
        return variantId;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public static /* synthetic */ MediationManager m1099() {
        int i10 = f992 + 97;
        f993 = i10 % 128;
        int i11 = i10 % 2;
        MediationManager mediationManagerM1093 = m1093();
        int i12 = f993 + 67;
        f992 = i12 % 128;
        int i13 = i12 % 2;
        return mediationManagerM1093;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public static /* synthetic */ double m1101(ImpressionData impressionData) {
        int i10 = f993 + 13;
        f992 = i10 % 128;
        if ((i10 % 2 == 0 ? '?' : (char) 4) == 4) {
            return m1092(impressionData);
        }
        m1092(impressionData);
        throw null;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static PlacementType m1105(ImpressionData impressionData) {
        int i10 = f993 + 33;
        f992 = i10 % 128;
        if (i10 % 2 != 0) {
            return impressionData.getPlacementType();
        }
        impressionData.getPlacementType();
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ String m1108(ImpressionData impressionData) {
        int i10 = f992 + 25;
        f993 = i10 % 128;
        if (!(i10 % 2 != 0)) {
            return m1095(impressionData);
        }
        m1095(impressionData);
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ Constants.AdType m1112(Placement placement) {
        int i10 = f993 + 17;
        f992 = i10 % 128;
        boolean z10 = i10 % 2 != 0;
        Constants.AdType adTypeM1107 = m1107(placement);
        if (!z10) {
            int i11 = 54 / 0;
        }
        int i12 = f993 + 95;
        f992 = i12 % 128;
        int i13 = i12 % 2;
        return adTypeM1107;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ PlacementType m1116(ImpressionData impressionData) {
        int i10 = f993 + 121;
        f992 = i10 % 128;
        if ((i10 % 2 == 0 ? (char) 16 : 'L') == 16) {
            m1105(impressionData);
            throw null;
        }
        PlacementType placementTypeM1105 = m1105(impressionData);
        int i11 = f993 + 71;
        f992 = i11 % 128;
        int i12 = i11 % 2;
        return placementTypeM1105;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ PlacementType m1122(Constants.AdType adType) {
        int i10 = f992 + 61;
        f993 = i10 % 128;
        int i11 = i10 % 2;
        PlacementType placementTypeM1125 = m1125(adType);
        int i12 = f993 + 51;
        f992 = i12 % 128;
        int i13 = i12 % 2;
        return placementTypeM1125;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ PlacementsHandler m1126(MediationManager mediationManager) {
        int i10 = f993 + 119;
        f992 = i10 % 128;
        int i11 = i10 % 2;
        PlacementsHandler placementsHandlerM1117 = m1117(mediationManager);
        int i12 = f992 + 37;
        f993 = i12 % 128;
        if ((i12 % 2 != 0 ? '.' : 'L') == 'L') {
            return placementsHandlerM1117;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
    private static String m1089(ImpressionData impressionData) {
        int i10 = f993 + 55;
        f992 = i10 % 128;
        int i11 = i10 % 2;
        String advertiserDomain = impressionData.getAdvertiserDomain();
        int i12 = f993 + 59;
        f992 = i12 % 128;
        if ((i12 % 2 == 0 ? 'O' : (char) 31) == 31) {
            return advertiserDomain;
        }
        throw null;
    }

    /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
    private static String m1090(ImpressionData impressionData) {
        int i10 = f993 + 75;
        f992 = i10 % 128;
        int i11 = i10 % 2;
        String campaignId = impressionData.getCampaignId();
        int i12 = f993 + 117;
        f992 = i12 % 128;
        int i13 = i12 % 2;
        return campaignId;
    }

    /* JADX INFO: renamed from: סּ, reason: contains not printable characters */
    private static String m1091(ImpressionData impressionData) {
        int i10 = f992 + 37;
        f993 = i10 % 128;
        boolean z10 = i10 % 2 != 0;
        String creativeId = impressionData.getCreativeId();
        if (z10) {
            int i11 = 61 / 0;
        }
        int i12 = f992 + 125;
        f993 = i12 % 128;
        int i13 = i12 % 2;
        return creativeId;
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static double m1092(ImpressionData impressionData) {
        int i10 = f992 + 9;
        f993 = i10 % 128;
        int i11 = i10 % 2;
        double netPayout = impressionData.getNetPayout();
        int i12 = f992 + 29;
        f993 = i12 % 128;
        int i13 = i12 % 2;
        return netPayout;
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static String m1094(ImpressionData impressionData) {
        int i10 = f993 + 87;
        f992 = i10 % 128;
        int i11 = i10 % 2;
        String demandSource = impressionData.getDemandSource();
        int i12 = f992 + 27;
        f993 = i12 % 128;
        int i13 = i12 % 2;
        return demandSource;
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static boolean m1096() {
        int i10 = f993 + 67;
        f992 = i10 % 128;
        int i11 = i10 % 2;
        boolean zAssertStarted = FairBid.assertStarted();
        int i12 = f993 + 125;
        f992 = i12 % 128;
        if ((i12 % 2 == 0 ? (char) 7 : '\\') == '\\') {
            return zAssertStarted;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static String m1097(ImpressionData impressionData) {
        int i10 = f993 + 117;
        f992 = i10 % 128;
        if ((i10 % 2 == 0 ? '`' : (char) 19) != '`') {
            return impressionData.getRenderingSdkVersion();
        }
        impressionData.getRenderingSdkVersion();
        throw null;
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static String m1098(ImpressionData impressionData) {
        int i10 = f993 + 115;
        f992 = i10 % 128;
        if ((i10 % 2 == 0 ? ' ' : 'J') != ' ') {
            return impressionData.getRenderingSdk();
        }
        impressionData.getRenderingSdk();
        throw null;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public static /* synthetic */ String m1100(ImpressionData impressionData) {
        int i10 = f993 + 75;
        f992 = i10 % 128;
        int i11 = i10 % 2;
        String strM1089 = m1089(impressionData);
        int i12 = f992 + 41;
        f993 = i12 % 128;
        int i13 = i12 % 2;
        return strM1089;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public static /* synthetic */ boolean m1102() {
        int i10 = f993 + 119;
        f992 = i10 % 128;
        int i11 = i10 % 2;
        boolean zM1096 = m1096();
        int i12 = f993 + 121;
        f992 = i12 % 128;
        if (i12 % 2 != 0) {
            return zM1096;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public static /* synthetic */ String m1103(ImpressionData impressionData) {
        int i10 = f992 + 87;
        f993 = i10 % 128;
        int i11 = i10 % 2;
        String strM1090 = m1090(impressionData);
        int i12 = f993 + 5;
        f992 = i12 % 128;
        int i13 = i12 % 2;
        return strM1090;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public static /* synthetic */ String m1104(ImpressionData impressionData) {
        int i10 = f992 + 47;
        f993 = i10 % 128;
        int i11 = i10 % 2;
        String strM1091 = m1091(impressionData);
        int i12 = f992 + 63;
        f993 = i12 % 128;
        int i13 = i12 % 2;
        return strM1091;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static Constants.AdType m1106(String str) {
        byte b10 = -1;
        switch (str.hashCode()) {
            case -1372958932:
                if (str.equals(m1130("ﵓﴚ䬔叏붯賑槸\u2002齕ㆮ⺅豘㦯陠䠼⸩", '1' - AndroidCharacter.getMirror('0')).intern())) {
                    int i10 = f993 + 29;
                    f992 = i10 % 128;
                    b10 = i10 % 2 != 0 ? (byte) 2 : (byte) 5;
                }
                break;
            case 433141802:
                if ((str.equals(m1109("\uf81a緌\uf39e楦\uef34攙\udacf", Color.rgb(0, 0, 0) + 16811469).intern()) ? 'H' : 'O') == 'H') {
                    b10 = 0;
                }
                break;
            case 543046670:
                if (str.equals(m1109("\uf81d႙⤾䆷婑狔譸ꐎ", 59539 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern())) {
                    b10 = 3;
                }
                break;
            case 1951953708:
                if ((str.equals(m1109("\uf80d뛵旷ᓰ쏦狺", 20219 - TextUtils.indexOf("", "")).intern()) ? ']' : '1') == ']') {
                    int i11 = f992 + 51;
                    f993 = i11 % 128;
                    int i12 = i11 % 2;
                    b10 = 1;
                }
                break;
        }
        if (b10 == 0) {
            return Constants.AdType.UNKNOWN;
        }
        if (b10 == 1) {
            return Constants.AdType.BANNER;
        }
        if (b10 != 2) {
            if (b10 != 3) {
                return null;
            }
            return Constants.AdType.REWARDED;
        }
        Constants.AdType adType = Constants.AdType.INTERSTITIAL;
        int i13 = f992 + 111;
        f993 = i13 % 128;
        if (i13 % 2 == 0) {
            return adType;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ void m1111(RewardedListener rewardedListener) {
        int i10 = f992 + 93;
        f993 = i10 % 128;
        int i11 = i10 % 2;
        m1132(rewardedListener);
        int i12 = f993 + 111;
        f992 = i12 % 128;
        if (i12 % 2 != 0) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ Constants.AdType m1113(String str) {
        int i10 = f992 + 45;
        f993 = i10 % 128;
        boolean z10 = i10 % 2 == 0;
        Constants.AdType adTypeM1106 = m1106(str);
        if (!z10) {
            int i11 = 0 / 0;
        }
        return adTypeM1106;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ List m1120(MediationConfig mediationConfig) {
        int i10 = f993 + 85;
        f992 = i10 % 128;
        char c10 = i10 % 2 == 0 ? '%' : 'D';
        List<AdapterConfiguration> listM1131 = m1131(mediationConfig);
        if (c10 != 'D') {
            int i11 = 12 / 0;
        }
        int i12 = f993 + 31;
        f992 = i12 % 128;
        if (i12 % 2 != 0) {
            return listM1131;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ String m1123(FairBid.AdsConfig adsConfig) {
        int i10 = f992 + 7;
        f993 = i10 % 128;
        if ((i10 % 2 != 0 ? 'B' : 'D') != 'D') {
            m1127(adsConfig);
            throw null;
        }
        String strM1127 = m1127(adsConfig);
        int i11 = f992 + 17;
        f993 = i11 % 128;
        int i12 = i11 % 2;
        return strM1127;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ String m1128(ImpressionData impressionData) {
        int i10 = f992 + 77;
        f993 = i10 % 128;
        int i11 = i10 % 2;
        String strM1098 = m1098(impressionData);
        int i12 = f993 + 17;
        f992 = i12 % 128;
        int i13 = i12 % 2;
        return strM1098;
    }

    public br(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ String m1114(FairBid.AdsConfig adsConfig) {
        int i10 = f992 + 11;
        f993 = i10 % 128;
        if (i10 % 2 == 0) {
            return m1118(adsConfig);
        }
        m1118(adsConfig);
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ void m1121(InterstitialListener interstitialListener) {
        int i10 = f993 + 73;
        f992 = i10 % 128;
        boolean z10 = i10 % 2 == 0;
        m1110(interstitialListener);
        if (z10) {
            int i11 = 52 / 0;
        }
        int i12 = f993 + 71;
        f992 = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ String m1124(ImpressionData impressionData) {
        int i10 = f992 + 95;
        f993 = i10 % 128;
        int i11 = i10 % 2;
        String strM1097 = m1097(impressionData);
        int i12 = f993 + 91;
        f992 = i12 % 128;
        int i13 = i12 % 2;
        return strM1097;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ String m1129(Placement placement) {
        int i10 = f993 + 27;
        f992 = i10 % 128;
        int i11 = i10 % 2;
        String strM1119 = m1119(placement);
        int i12 = f993 + 97;
        f992 = i12 % 128;
        if ((i12 % 2 == 0 ? 'C' : 'Q') != 'C') {
            return strM1119;
        }
        int i13 = 59 / 0;
        return strM1119;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻐ */
    public final Map<String, bd.b> mo736() {
        HashMap map = new HashMap();
        map.put(m1109("\uf828䬇鹡\ue185㒞蟊쬨ḕ慓뒳ߢ䫎鸞\ue167㑗融쫸ᷗ愗둑ޥ䪍鷥\ue125㐙蝉쪸", View.getDefaultSize(0, 0) + 45869).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return br.m1099();
            }
        });
        map.put(m1130("곜겻㠞⃮䬌穒㻆眸컬䊣\ud80b\udb5b树\ue573뺲社詃ߪፇߦ◢馏\uf122ꑎ䜈㱂", -TextUtils.indexOf((CharSequence) "", '0')).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.12
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return br.m1122((Constants.AdType) list.get(0));
            }
        });
        map.put(m1109("\uf828삳褉凍ᩆ\ue2c2ꮫ琅㳴՝췜隳弍⟎\ue070\ua8cc熾㨶ˡ쭵鏘岧┄\ued95뙹绊䞑\u0015좃酿", View.getDefaultSize(0, 0) + 14489).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.14
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return br.m1116((ImpressionData) list.get(0));
            }
        });
        map.put(m1130("ꅿꄘ斒絢㋽Σꦔ\ue062썆Ἃꇱ䰔斤룜읆\uee6a蟭婇檺邭⡎쐥裢㌃䪿懎⹁함\uece9\u0378䶌瞱ᅘ", -Process.getGidForName("")).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.18
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return br.m1128((ImpressionData) list.get(0));
            }
        });
        map.put(m1130("\uec0f\uec68趠镐㏠ʾ佟ک踶\uf739ꃬ꫟⣔僮왛ࢡ쪝뉵殧癦放Ⱇ觿허ߏ觼⽜㎣ꆙ\ueb4a䲑酺尨䔗틳ﳐﻜ\ua6fc灅媘", 1 - TextUtils.indexOf("", "", 0)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.19
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return br.m1124((ImpressionData) list.get(0));
            }
        });
        map.put(m1109("\uf828넩樽⌏\udc2e锰丯ܿ뀤椧∸\udb01鐅䴬\u0604뼖栞ℸ\uda1c錛䰒Ԟ빩睙\u2068\ud971鉳䭽Ѿ", (ViewConfiguration.getScrollDefaultDelay() >> 16) + 18691).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.17
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return br.m1115((ImpressionData) list.get(0));
            }
        });
        map.put(m1109("\uf828兕\uaac5ѻ州띄Ç婓도ോ曐끕\u09d5捸볜ᙊ濞륶ዀ汐엊ὅ棋쉒ᯮ界", (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 43391).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.20
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return br.m1108((ImpressionData) list.get(0));
            }
        });
        map.put(m1109("\uf828劕굅\uf83b勞궄\uf847匓귄\uf88b卐긕\uf8d5厸깜金叞꺮籠吖껳礪呜꼉戮咜", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 43710).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.16
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return Double.valueOf(br.m1101((ImpressionData) list.get(0)));
            }
        });
        map.put(m1130("旹斞䩇劷顖꤈Ꟃ\uee34߀マ\u0b5a䉂ꄢ霉淭\ue03c䍫疒쀑黻\uecc8\uebe1≞㵞踼上蓱\udb21⡤ⲃ\ue710", (ViewConfiguration.getWindowTouchSlop() >> 8) + 1).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.22
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return br.m1104((ImpressionData) list.get(0));
            }
        });
        map.put(m1109("\uf828픷ꈁ网䱖\u19ae\uf693쏡郔渹㬄ࠟ\ue57d뉲辸岈⧾ۣ퐡ꄞ繮䭜ᡅ\uf5bd슄\u9fff泏㨄ᜌ\ue46b녈躥宁", (ViewConfiguration.getScrollDefaultDelay() >> 16) + 11549).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return br.m1100((ImpressionData) list.get(0));
            }
        });
        map.put(m1130("馣駄귷딇\udd5b\uec05뤰\uf0c6ﮚ흮乗岰嵸点⣠ﻎ뼱鈢蔜耉႒\u0c51杀⎤牷ꦯ쇼엂퐵쬳ꈝ", (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return br.m1103((ImpressionData) list.get(0));
            }
        });
        map.put(m1130("舮艉ᔻ\u0dcb\uea6c\udb32⸆柸\ue00a澢祛쮏", TextUtils.getOffsetBefore("", 0) + 1).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return br.m1123((FairBid.AdsConfig) list.get(0));
            }
        });
        map.put(m1109("\uf828⣍姵誩뮧\ueca3ᵗ乻", 53479 - TextUtils.getCapsMode("", 0, 0)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return br.m1114((FairBid.AdsConfig) list.get(0));
            }
        });
        map.put(m1109("\uf828\u0df1ᎍᦟ⽇㕩㬝䃆囲岎抂桉繥萶觜\u9ffdꖊꮶ녈읺촺틗\ud8f3\uee91", 62939 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.8
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return br.m1120((MediationConfig) list.get(0));
            }
        });
        map.put(m1109("\uf828䱁郭\ue55e⦏縹슮ᛇ孺꿩\uf40f㢢贊텄◁橳뺏̱", 46187 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.7
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return br.m1112((Placement) list.get(0));
            }
        });
        map.put(m1109("\uf828۽֕ҚͿȝĦ࿋ບඥేଆਕࣅ០ᚳ", TextUtils.indexOf("", "", 0, 0) + 65239).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.10
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return br.m1129((Placement) list.get(0));
            }
        });
        map.put(m1109("\uf828\ueca7턡언ꨗ黯荢矱届䃟㖣ᨴຠ\uf32e\ue798챢냻ꕾ觀繊", 5261 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.9
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return br.m1126((MediationManager) list.get(0));
            }
        });
        map.put(m1109("\uf828쵏鋱堡\u2dbf\uf2e2롨跼匂ᢇ\uedd3덭碞", 13669 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.6
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return br.m1113((String) list.get(0));
            }
        });
        map.put(m1109("\uf83c楋\udaf9䰥붥⻞遬ƚ猴\ue452嗬윐⢪駃୭粬\uee36彍샩㈙ꎵᓟ虫", TextUtils.getCapsMode("", 0, 0) + 37217).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.13
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                br.m1121((InterstitialListener) list.get(0));
                return null;
            }
        });
        map.put(m1109("\uf83c弿똑ഢ摾뭑ቐ榮삃➗绹헤Ⳛ萭\udb1d㈑襱\ue04f䝇", View.MeasureSpec.getSize(0) + 42773).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.11
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                br.m1111((RewardedListener) list.get(0));
                return null;
            }
        });
        map.put(m1109("\uf82e걯傚ӓꥱ嶤Ǯ뙾媶໖댅枻\u0bcf", 21587 - TextUtils.getTrimmedLength("")).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.15
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return Boolean.valueOf(br.m1102());
            }
        });
        int i10 = f993 + 97;
        f992 = i10 % 128;
        if (i10 % 2 != 0) {
            return map;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ String m1115(ImpressionData impressionData) {
        int i10 = f993 + 51;
        f992 = i10 % 128;
        if ((i10 % 2 == 0 ? 'T' : ')') == ')') {
            return m1094(impressionData);
        }
        m1094(impressionData);
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m1118(FairBid.AdsConfig adsConfig) {
        int i10 = f992 + 101;
        f993 = i10 % 128;
        char c10 = i10 % 2 != 0 ? '\n' : 'A';
        String str = adsConfig.store;
        if (c10 == '\n') {
            int i11 = 63 / 0;
        }
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x006b  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:90:0x026d  */
    /* JADX WARN: Code duplicated, block: B:91:0x026f  */
    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo738(String str) {
        byte b10 = -1;
        switch (str.hashCode()) {
            case -2041833493:
                if (str.equals(m1130("괦굧ᖃ൲\u10ccↇ玵㩺켆漏菀阹槡죑\ue572", 1 - Color.blue(0)).intern())) {
                    int i10 = f992 + 99;
                    f993 = i10 % 128;
                    b10 = i10 % 2 == 0 ? (byte) 16 : (byte) 43;
                }
                break;
            case -1598046662:
                if (str.equals(m1130("봬뵡棥瀕浫尥咙ᵏ\udf19ቸﹼ넳秪떛飖ፆ鮶圝㔪", TextUtils.indexOf("", "", 0) + 1).intern())) {
                    int i11 = f992 + 25;
                    f993 = i11 % 128;
                    if ((i11 % 2 == 0 ? (char) 5 : (char) 7) == 5) {
                        b10 = 4;
                    } else {
                        b10 = 3;
                    }
                }
                break;
            case -1115843213:
                if (str.equals(m1130("ᢇᣎ垘你\uf553쐉毉∄窶ⴂ晞蹾\udc40請ÅⰂ㸏桨", 1 - (Process.myTid() >> 22)).intern())) {
                    b10 = 9;
                }
                break;
            case -847426041:
                if (str.equals(m1109("\uf80e\udb72뺜鈴畟䢗Ⱛལ\ue2e8였饓糵倄㎿ᛣ\uea19춫ꃏ葢枺", 9049 - KeyEvent.keyCodeFromString("")).intern())) {
                    b10 = 17;
                }
                break;
            case -498060603:
                if (str.equals(m1109("\uf81fؾДɻ^ຳ಄૪࣓", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 65052).intern())) {
                    int i12 = f993 + 109;
                    f992 = i12 % 128;
                    b10 = i12 % 2 == 0 ? (byte) 100 : (byte) 6;
                }
                break;
            case -368841467:
                if (str.equals(m1109("\uf80c崿눎᜔汮셾♨筜", 42257 - (KeyEvent.getMaxKeyCode() >> 16)).intern())) {
                    b10 = 14;
                }
                break;
            case -174936018:
                if (str.equals(m1130("ᎽᏯ鎏譿윙\uf644㣽焣熛\ue902吂\udd54", (ViewConfiguration.getScrollBarSize() >> 8) + 1).intern())) {
                    int i13 = f993 + 9;
                    f992 = i13 % 128;
                    int i14 = i13 % 2;
                    b10 = 12;
                }
                break;
            case 99044255:
                if (str.equals(m1130("ꠍꡝ艹骀뢤觯᜶廪쨼\uf8fd⮿\uf297泑弐䴏僽躔", 1 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern())) {
                    b10 = 11;
                }
                break;
            case 438795617:
                if (str.equals(m1109("\uf801Ӂǭ\u0ef9\u0b8cࢪᖦባέᱭᤑ☢⌮⿒", TextUtils.lastIndexOf("", '0', 0, 0) + 64748).intern())) {
                    b10 = 15;
                }
                break;
            case 578208537:
                if (str.equals(m1130("\ue735\ue773뵿ꖋ\ue6e5\ud7a6怓⧞蔣쟿痿", 1 - (ViewConfiguration.getScrollBarSize() >> 8)).intern())) {
                    b10 = 0;
                }
                break;
            case 769047372:
                if (str.equals(m1109("\uf806涖퍕㤏껡ᒯ穱\ue027喃뭉℈雾", 38327 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern())) {
                    b10 = 10;
                }
                break;
            case 806552769:
                if (str.equals(m1130("ⱅⰖ捄箹↯ც筛㊓乞\u19dd능黩\ue882븗퐎", -Process.getGidForName("")).intern())) {
                    int i15 = f993;
                    int i16 = i15 + 1;
                    f992 = i16 % 128;
                    int i17 = i16 % 2;
                    b10 = 13;
                    int i18 = i15 + 31;
                    f992 = i18 % 128;
                    int i19 = i18 % 2;
                }
                break;
            case 1062384924:
                if (str.equals(m1130("\ue481\ue4d1덯ꮖဌⅇ緦㐺蚰짫茗顇⁝渡\ue596㨼숓貚䡆䓤涣", 1 - TextUtils.indexOf("", "")).intern())) {
                    b10 = 5;
                }
                break;
            case 1212533506:
                if (str.equals(m1109("\uf81d鹗㓂쭙應\uf85a黄㕀쯫扃\uf8de齤㗶챸拼葉", (ViewConfiguration.getScrollBarSize() >> 8) + 26237).intern())) {
                    int i20 = f992 + 51;
                    f993 = i20 % 128;
                    if (i20 % 2 == 0) {
                        b10 = 8;
                    } else {
                        b10 = 7;
                    }
                }
                break;
            case 1297340448:
                if (str.equals(m1130("ꬢ꭫턒짩\ue614흊컷蜭줄ꮈ甞⭗濾ెᎧ褦趒\ueeea빁\uf7e2∗炙尋呐", View.getDefaultSize(0, 0) + 1).intern())) {
                    b10 = 65;
                    int i21 = f992 + 65;
                    f993 = i21 % 128;
                    if (i21 % 2 == 0) {
                        b10 = 7;
                    }
                }
                break;
            case 1775008410:
                if (!(str.equals(m1130("ጣ፦疊浩ዞ⎑䥏\u009e焃༰臔곿ퟮ꣖\ue761", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1).intern()) ? false : true)) {
                    b10 = 18;
                }
                break;
            case 1884304309:
                if (str.equals(m1109("\uf802筏ﻡ爉\uf5ba棂\uec78濣\ue309暏\ud9dc嵶킒吉\ud7ac䫖", 33636 - MotionEvent.axisFromString("")).intern())) {
                    b10 = 1;
                }
                break;
            case 1955869213:
                if (!(str.equals(m1130("\uf36c\uf32d擊簻綾젩\ue8e9ꄯ酈Ṇ", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern()) ? false : true)) {
                    int i22 = f992 + 69;
                    f993 = i22 % 128;
                    if (i22 % 2 == 0) {
                        b10 = 2;
                    } else {
                        b10 = 4;
                    }
                }
                break;
            case 1969669106:
                if (str.equals(m1109("\uf80e顸㢚\ud8f5祬ᦾ맛婣練", ExpandableListView.getPackedPositionType(0L) + 24659).intern())) {
                    int i23 = f992 + 63;
                    f993 = i23 % 128;
                    if (i23 % 2 == 0) {
                        b10 = 3;
                    } else {
                        b10 = 2;
                    }
                }
                break;
        }
        switch (b10) {
            case 0:
                return FairBid.class;
            case 1:
                return MediationManager.class;
            case 2:
                return Constants.AdType.class;
            case 3:
                return FairBid.AdsConfig.class;
            case 4:
                return MediationConfig.class;
            case 5:
                return PlacementsHandler.class;
            case 6:
                return Placement.class;
            case 7:
                return InterstitialListener.class;
            case 8:
                return RewardedListener.class;
            case 9:
                return ImpressionData.class;
            case 10:
                return Interstitial.class;
            case 11:
                return PlacementType.class;
            case 12:
                return Rewarded.class;
            case 13:
                return ShowOptions.class;
            case 14:
                return CachedAd.class;
            case 15:
                return NetworkAdapter.class;
            case 16:
                return AdapterPool.class;
            case 17:
                return AdapterConfiguration.class;
            case 18:
                return EventStream.class;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m1119(Placement placement) {
        int i10 = f993 + 47;
        f992 = i10 % 128;
        int i11 = i10 % 2;
        String name = placement.getName();
        int i12 = f992 + 87;
        f993 = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
        return name;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻛ */
    public final String mo737() {
        int i10 = f992 + 53;
        f993 = i10 % 128;
        try {
            try {
                String str = (String) ((i10 % 2 != 0 ? '9' : 'B') != 'B' ? FairBid.class.getDeclaredField(m1109("\uf81c՚ʦ\u0fe3൝ટ\u17fbᔫ\u128eῙᴫ", 16842065 >>> Color.rgb(1, 1, 0)).intern()) : FairBid.class.getDeclaredField(m1109("\uf81c՚ʦ\u0fe3൝ટ\u17fbᔫ\u128eῙᴫ", Color.rgb(0, 0, 0) + 16842065).intern())).get(null);
                int i11 = f992 + 103;
                f993 = i11 % 128;
                if ((i11 % 2 != 0 ? '4' : '+') == '+') {
                    return str;
                }
                int i12 = 81 / 0;
                return str;
            } catch (Exception unused) {
                return null;
            }
        } catch (Exception unused2) {
            return hu.m2349().m2351().m2451(FairBid.class, m1130("턩텷攡緯ࣥ㦓̠䫻댠ΰ鯀\ue6c6ᗜ롇ﵫ䓸\uf788媛傘㩮堤쒟닃馐㫐愳ᐏ", -TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern());
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static PlacementsHandler m1117(MediationManager mediationManager) {
        int i10 = f992 + 105;
        f993 = i10 % 128;
        if (!(i10 % 2 == 0)) {
            mediationManager.getPlacementsHandler();
            throw null;
        }
        PlacementsHandler placementsHandler = mediationManager.getPlacementsHandler();
        int i11 = f993 + 29;
        f992 = i11 % 128;
        int i12 = i11 % 2;
        return placementsHandler;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static Constants.AdType m1107(Placement placement) {
        int i10 = f992 + 41;
        f993 = i10 % 128;
        boolean z10 = i10 % 2 != 0;
        Constants.AdType adType = placement.getAdType();
        if (z10) {
            int i11 = 38 / 0;
        }
        return adType;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static void m1110(InterstitialListener interstitialListener) {
        int i10 = f992 + 13;
        f993 = i10 % 128;
        boolean z10 = i10 % 2 != 0;
        Interstitial.setInterstitialListener(interstitialListener);
        if (!z10) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m1109(String str, int i10) {
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
                    cArr2[i11] = (char) (((long) (cArr[i11] ^ (f.f2017 * i11))) ^ f995);
                    f.f2018++;
                } else {
                    str2 = new String(cArr2);
                }
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static PlacementType m1125(Constants.AdType adType) {
        int i10 = f993 + 103;
        f992 = i10 % 128;
        boolean z10 = i10 % 2 == 0;
        PlacementType placementType = adType.getPlacementType();
        if (z10) {
            int i11 = 72 / 0;
        }
        return placementType;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m1127(FairBid.AdsConfig adsConfig) {
        int i10 = f992 + 55;
        f993 = i10 % 128;
        boolean z10 = i10 % 2 != 0;
        String str = adsConfig.appId;
        if (z10) {
            throw null;
        }
        int i11 = f992 + 75;
        f993 = i11 % 128;
        if (!(i11 % 2 != 0)) {
            return str;
        }
        int i12 = 58 / 0;
        return str;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static List<AdapterConfiguration> m1131(MediationConfig mediationConfig) {
        int i10 = f993 + 1;
        f992 = i10 % 128;
        char c10 = i10 % 2 == 0 ? '8' : '4';
        List<AdapterConfiguration> adapterConfigurations = mediationConfig.getAdapterConfigurations();
        if (c10 != '4') {
            int i11 = 88 / 0;
        }
        return adapterConfigurations;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static void m1132(RewardedListener rewardedListener) {
        int i10 = f992 + 25;
        f993 = i10 % 128;
        boolean z10 = i10 % 2 != 0;
        Rewarded.setRewardedListener(rewardedListener);
        if (z10) {
            int i11 = 10 / 0;
        }
        int i12 = f992 + 15;
        f993 = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m1130(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (h.f2284) {
            char[] cArrM2243 = h.m2243(f994, cArr, i10);
            h.f2285 = 4;
            while (true) {
                int i11 = h.f2285;
                if (i11 < cArrM2243.length) {
                    h.f2283 = i11 - 4;
                    int i12 = h.f2285;
                    cArrM2243[i12] = (char) (((long) (cArrM2243[i12] ^ cArrM2243[i12 % 4])) ^ (((long) h.f2283) * f994));
                    h.f2285++;
                } else {
                    str2 = new String(cArrM2243, 4, cArrM2243.length - 4);
                }
            }
        }
        return str2;
    }
}
