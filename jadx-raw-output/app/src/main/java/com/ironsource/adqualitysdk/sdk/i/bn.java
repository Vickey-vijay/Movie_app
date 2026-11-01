package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdView;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.BuildConfig;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeAdView;
import com.facebook.ads.NativeBannerAd;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdListener;
import com.facebook.ads.internal.DisplayAdController;
import com.facebook.ads.internal.adapters.AdAdapter;
import com.facebook.ads.internal.dynamicloading.DynamicLoader;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.facebook.ads.internal.settings.AdSdkVersion;
import com.facebook.ads.internal.view.component.CircularProgressView;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class bn extends bd {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f919 = 0;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f920 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char f921 = 39776;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f922 = 50265;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static long f923 = -7618697074672581355L;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f924 = 13662;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char f925 = 30504;

    public class b extends WeakHashMap<View, WeakReference<Object>> implements hg<WeakHashMap<View, WeakReference<Object>>> {

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private static int f935 = 1;

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private static int f936 = 0;

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private static char f937 = 24654;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static char f938 = 58341;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static char f939 = 36148;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static char f940 = 22631;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private ch f941;

        @Override // com.ironsource.adqualitysdk.sdk.i.hg
        /* JADX INFO: renamed from: ﾒ */
        public final /* synthetic */ WeakHashMap<View, WeakReference<Object>> mo742() {
            WeakHashMap<View, WeakReference<Object>> weakHashMapM1015;
            int i10 = f935 + 109;
            f936 = i10 % 128;
            if (i10 % 2 != 0) {
                weakHashMapM1015 = m1015();
                int i11 = 72 / 0;
            } else {
                weakHashMapM1015 = m1015();
            }
            int i12 = f936 + 49;
            f935 = i12 % 128;
            int i13 = i12 % 2;
            return weakHashMapM1015;
        }

        public b(WeakHashMap<View, WeakReference<Object>> weakHashMap, ch chVar) {
            super(weakHashMap);
            this.f941 = chVar;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private WeakHashMap<View, WeakReference<Object>> m1015() {
            int i10 = f936;
            int i11 = i10 + 123;
            f935 = i11 % 128;
            int i12 = i11 % 2;
            int i13 = i10 + 21;
            f935 = i13 % 128;
            int i14 = i13 % 2;
            return this;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private WeakReference<Object> m1017(View view, WeakReference<Object> weakReference) {
            int i10 = f935 + 13;
            f936 = i10 % 128;
            int i11 = i10 % 2;
            bn.this.m818(this, this.f941, m1016("螔㠡㵼碗\uef04懒\uf58a뜜魮ꈹ\ueb96寀괬\ue4c1⇌됈ﻰଲᾢ㻵켅檫렋嶂", ExpandableListView.getPackedPositionChild(0L) + 24).intern(), view, weakReference);
            WeakReference<Object> weakReference2 = (WeakReference) super.put(view, weakReference);
            int i12 = f936 + 105;
            f935 = i12 % 128;
            int i13 = i12 % 2;
            return weakReference2;
        }

        @Override // java.util.WeakHashMap, java.util.AbstractMap, java.util.Map
        public /* synthetic */ Object put(Object obj, Object obj2) {
            int i10 = f936 + 31;
            f935 = i10 % 128;
            int i11 = i10 % 2;
            WeakReference<Object> weakReferenceM1017 = m1017((View) obj, (WeakReference<Object>) obj2);
            int i12 = f935 + 19;
            f936 = i12 % 128;
            if (i12 % 2 != 0) {
                throw null;
            }
            return weakReferenceM1017;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static String m1016(String str, int i10) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (n.f2992) {
                char[] cArr2 = new char[cArr.length];
                n.f2991 = 0;
                char[] cArr3 = new char[2];
                while (true) {
                    int i11 = n.f2991;
                    if (i11 < cArr.length) {
                        cArr3[0] = cArr[i11];
                        cArr3[1] = cArr[i11 + 1];
                        int i12 = 58224;
                        for (int i13 = 0; i13 < 16; i13++) {
                            char c10 = cArr3[1];
                            char c11 = cArr3[0];
                            char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f938)) ^ ((c11 >>> 5) + f937)));
                            cArr3[1] = c12;
                            cArr3[0] = (char) (c11 - (((c12 >>> 5) + f939) ^ ((c12 + i12) ^ ((c12 << 4) + f940))));
                            i12 -= 40503;
                        }
                        int i14 = n.f2991;
                        cArr2[i14] = cArr3[0];
                        cArr2[i14 + 1] = cArr3[1];
                        n.f2991 = i14 + 2;
                    } else {
                        str2 = new String(cArr2, 0, i10);
                    }
                }
            }
            return str2;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ String m1001(AdView adView) {
        int i10 = f919 + 47;
        f920 = i10 % 128;
        int i11 = i10 % 2;
        String strM1014 = m1014(adView);
        int i12 = f920 + 123;
        f919 = i12 % 128;
        if (i12 % 2 == 0) {
            return strM1014;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ void m1005(AdView adView, AdListener adListener) {
        int i10 = f920 + 115;
        f919 = i10 % 128;
        char c10 = i10 % 2 != 0 ? 'I' : (char) 22;
        m1011(adView, adListener);
        if (c10 != 'I') {
            return;
        }
        int i11 = 75 / 0;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ AdPlacementType m1007(AdAdapter adAdapter) {
        int i10 = f919 + 23;
        f920 = i10 % 128;
        int i11 = i10 % 2;
        AdPlacementType adPlacementTypeM1003 = m1003(adAdapter);
        int i12 = f920 + 103;
        f919 = i12 % 128;
        int i13 = i12 % 2;
        return adPlacementTypeM1003;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ WeakHashMap m1010(bn bnVar, WeakHashMap weakHashMap, ch chVar) {
        int i10 = f920 + 5;
        f919 = i10 % 128;
        if ((i10 % 2 != 0 ? '=' : '+') != '=') {
            return bnVar.m1002((WeakHashMap<View, WeakReference<Object>>) weakHashMap, chVar);
        }
        bnVar.m1002((WeakHashMap<View, WeakReference<Object>>) weakHashMap, chVar);
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ String m1013(Ad ad2) {
        int i10 = f919 + 79;
        f920 = i10 % 128;
        if (!(i10 % 2 == 0)) {
            return m1004(ad2);
        }
        m1004(ad2);
        throw null;
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static String m995() {
        int i10 = f920 + 43;
        f919 = i10 % 128;
        String strIntern = m1009("ᐚ㕨ކ톳◫㱕讘쌁疼晦薼왯ꢰ潌蹟㕩㝱䲌訔䘱靭ⷜ⻋⢕\uef13㩙ꢰ潌\udbd0ල钩\udade\u09c5ⴑ", i10 % 2 == 0 ? 33 - TextUtils.indexOf((CharSequence) "", '0', 0, 0) : 7 << TextUtils.indexOf((CharSequence) "", '\'', 1, 1)).intern();
        int i11 = f919 + 69;
        f920 = i11 % 128;
        int i12 = i11 % 2;
        return strIntern;
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static String m996() {
        int i10 = f920 + 1;
        f919 = i10 % 128;
        String strIntern = (i10 % 2 == 0 ? m1009("懖ᄭ쓭ࢲ恠侊屟䢮", 7 - TextUtils.indexOf((CharSequence) "", '0', 0)) : m1009("懖ᄭ쓭ࢲ恠侊屟䢮", 38 - TextUtils.indexOf((CharSequence) "", (char) 7, 1))).intern();
        int i11 = f920 + 117;
        f919 = i11 % 128;
        if (i11 % 2 == 0) {
            return strIntern;
        }
        int i12 = 83 / 0;
        return strIntern;
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static DynamicLoader m997() {
        int i10 = f919 + 107;
        f920 = i10 % 128;
        if ((i10 % 2 == 0 ? 'Z' : '\b') == 'Z') {
            DynamicLoaderFactory.getDynamicLoader();
            throw null;
        }
        DynamicLoader dynamicLoader = DynamicLoaderFactory.getDynamicLoader();
        int i11 = f919 + 111;
        f920 = i11 % 128;
        int i12 = i11 % 2;
        return dynamicLoader;
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    public static /* synthetic */ DynamicLoader m998() {
        int i10 = f920 + 115;
        f919 = i10 % 128;
        int i11 = i10 % 2;
        DynamicLoader dynamicLoaderM997 = m997();
        int i12 = f920 + 37;
        f919 = i12 % 128;
        int i13 = i12 % 2;
        return dynamicLoaderM997;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public static /* synthetic */ String m999() {
        int i10 = f919 + 117;
        f920 = i10 % 128;
        int i11 = i10 % 2;
        String strM995 = m995();
        int i12 = f919 + 55;
        f920 = i12 % 128;
        if (i12 % 2 != 0) {
            return strM995;
        }
        int i13 = 33 / 0;
        return strM995;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public static /* synthetic */ String m1000() {
        int i10 = f919 + 113;
        f920 = i10 % 128;
        int i11 = i10 % 2;
        String strM996 = m996();
        int i12 = f919 + 91;
        f920 = i12 % 128;
        if ((i12 % 2 == 0 ? '\"' : ']') != '\"') {
            return strM996;
        }
        int i13 = 41 / 0;
        return strM996;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ void m1006(InterstitialAd interstitialAd, InterstitialAdListener interstitialAdListener) {
        int i10 = f919 + 29;
        f920 = i10 % 128;
        boolean z10 = i10 % 2 == 0;
        m1012(interstitialAd, interstitialAdListener);
        if (!z10) {
            return;
        }
        int i11 = 77 / 0;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m1008(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (h.f2284) {
            char[] cArrM2243 = h.m2243(f923, cArr, i10);
            h.f2285 = 4;
            while (true) {
                int i11 = h.f2285;
                if (i11 < cArrM2243.length) {
                    h.f2283 = i11 - 4;
                    int i12 = h.f2285;
                    cArrM2243[i12] = (char) (((long) (cArrM2243[i12] ^ cArrM2243[i12 % 4])) ^ (((long) h.f2283) * f923));
                    h.f2285++;
                } else {
                    str2 = new String(cArrM2243, 4, cArrM2243.length - 4);
                }
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static void m1011(AdView adView, AdListener adListener) {
        int i10 = f920 + 109;
        f919 = i10 % 128;
        char c10 = i10 % 2 != 0 ? '\"' : ':';
        adView.setAdListener(adListener);
        if (c10 != ':') {
            throw null;
        }
        int i11 = f919 + 21;
        f920 = i11 % 128;
        if ((i11 % 2 == 0 ? 'V' : 'U') == 'U') {
        } else {
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻐ */
    public final Map<String, bd.b> mo736() {
        HashMap map = new HashMap();
        map.put(m1008("뉔눳\ue5bdꃍ\uee29摷皎Ꙭ맡벵瀴娗骑补岕乲軡柈⥉떨\ue36b玵㔒養\ud7a6佭Ƃ赵", 1 - View.combineMeasuredStates(0, 0)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return bn.m1001((AdView) list.get(0));
            }
        });
        map.put(m1009("톅衫ཽ\uda82\ua7e0Րކ톳풚᧥꣒\ue110ꣁ뭦쿚鍽ᧂ⺖ÞᲫ", (ViewConfiguration.getKeyRepeatDelay() >> 16) + 20).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return bn.m1013((Ad) list.get(0));
            }
        });
        map.put(m1009("㕷\ueb21豫鏤⦋㋭\ue4a4漢透䚂㙽\uf322됣\ueb2c", View.combineMeasuredStates(0, 0) + 13).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                bn.m1005((AdView) list.get(0), (AdListener) list.get(1));
                return null;
            }
        });
        map.put(m1008("鴳鵔ῥ媕❸괦\udbd9褒ᒧ䛨륯\uf751뗵爻闏\ue30eꆪ鶀\ue029ᣳ찑觫ﱃ㑋\uf8e3딵죀\u202d\ue4bfꂑ⌌巹ጚ쳳㽚䥕㿣\uf835௹攝⮾", (ViewConfiguration.getJumpTapTimeout() >> 16) + 1).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return bn.m1000();
            }
        });
        map.put(m1008("獇猠蕝쀭\ue001機\ue787杦⣹\udc50縖쬏宁\ue883劶\udf50俞ܸ❐⒭≥ፓ㬺ࠕᚗ⾍ྐྵᱳો㨩\ue466憠ﵯ噿\uf816甀톃报첪奔엘礡ꅯ꺁롪镹", 1 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return bn.m999();
            }
        });
        map.put(m1009("㕷\ueb21ᤨ䧬꣒\ue110嚊霽킢艨戞릎䃽ꩾÞᲫ辎啘킢艨ె馌嚊霽", KeyEvent.keyCodeFromString("") + 24).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.10
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                bn.m1006((InterstitialAd) list.get(0), (InterstitialAdListener) list.get(1));
                return null;
            }
        });
        map.put(m1008("湣渄॥䰕䍒줌䑰穎謋偢\udd4d棵䚢撻\uf1cc粃勾謐萑蝂", -ExpandableListView.getPackedPositionChild(0L)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.8
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return bn.m998();
            }
        });
        map.put(m1008("蛬蚋\uea6a꼚\ue684泚飈鋔垧덢碙둑긩螲吸ꀴ멄栂⇒对", (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.6
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return bn.m1007((AdAdapter) list.get(0));
            }
        });
        map.put(m1008("즄짧⺳比\ue2b4棻ᘷ\udda4\ud969瞿粞㪸\ue162䍯倒⻧\uf50e곇◓픶颃뢳㦯轢걨葫ഉ\uede2뀱釟\ue6e6", -TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.9
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return bn.m1010(bn.this, (WeakHashMap) list.get(0), chVar);
            }
        });
        int i10 = f920 + 65;
        f919 = i10 % 128;
        if ((i10 % 2 != 0 ? (char) 14 : 'B') != 14) {
            return map;
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:112:0x0309  */
    /* JADX WARN: Code duplicated, block: B:78:0x0217  */
    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo738(String str) {
        byte b10;
        switch (str.hashCode()) {
            case -2107186802:
                if (!str.equals(m1008("鞘韖\ude9a鯮攁\uef5f爞莺뵈螖מּ庿뽼덎힠䫛ꬁ峥ꉂ넁", 1 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern())) {
                    b10 = -1;
                } else {
                    int i10 = f920 + 89;
                    f919 = i10 % 128;
                    int i11 = i10 % 2;
                    b10 = 19;
                }
                break;
            case -1585374524:
                if (!str.equals(m1008("䫏䪝꼱\uea41甅ｘ㲔廩\uf3ca\uf63c\ueb1eွ戱싥잳ш癜ⵡ뉇ﾽ\u1bf6㤧긋팠⼅\u05ed骹", 1 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern())) {
                    b10 = -1;
                } else {
                    int i12 = f919 + 107;
                    f920 = i12 % 128;
                    b10 = i12 % 2 != 0 ? (byte) 10 : (byte) 35;
                }
                break;
            case -1513928064:
                if (!str.equals(m1009("驨阋컉硩ᐚ㕨ކ톳◫㱕讘쌁㉞陙ᮊ瘜꾏\ue791셙쨠\uf2c3젽㞧蒋괡룦\ue308\ue39b꓁랛钩\udade形პ鰯\uf875懖ᄭ鬰薔", Color.alpha(0) + 40).intern())) {
                    b10 = -1;
                } else {
                    int i13 = f919 + 53;
                    f920 = i13 % 128;
                    int i14 = i13 % 2;
                    b10 = 13;
                }
                break;
            case -1256969519:
                if (!str.equals(m1009("\udc41\ud806\uf308⇊耄솟鍜\uf22d㙲冧\uf580悂愳\ue932⃗쐕㝱䲌쓭ࢲ", (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 20).intern())) {
                    b10 = -1;
                } else {
                    b10 = 20;
                }
                break;
            case -501313640:
                if ((str.equals(m1008("ᶪᷮ깍\ueb21ꏶ⦲퓝ওᮃ\uf74d㷫\uf85c㕭쎑ᅀ\uec01ℤⰚ撱៛䲎㡇磾㭵", (Process.myPid() >> 22) + 1).intern()) ? 'F' : '\"') == '\"') {
                    b10 = -1;
                } else {
                    b10 = 14;
                }
                break;
            case -498709917:
                if (!(str.equals(m1008("䙡䘨篟㺤\ue963挽媹則闣⋅睩瘙溽ᘋ寐扨竜寧⸉馱ᝂ\uedce㉼딂⎠턔", (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1).intern()))) {
                    b10 = -1;
                } else {
                    b10 = 8;
                }
                break;
            case -105717264:
                if (str.equals(m1009("疼晦薼왯ꢰ潌蹟㕩㝱䲌訔䘱넠耟忍鈻", 15 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern()) ? false : true) {
                    b10 = -1;
                } else {
                    b10 = 11;
                }
                break;
            case 2115:
                if (!(str.equals(m1009("ÞᲫ", 1 - Process.getGidForName("")).intern()))) {
                    b10 = -1;
                } else {
                    b10 = 0;
                }
                break;
            case 289409084:
                if (!(str.equals(m1008("᪢\u1ae3锕큤蝘ഢ渍ທꅞ찟\u1943䊠㉯\uf8c6㗾园☧\u1774䀛", TextUtils.getOffsetBefore("", 0) + 1).intern()))) {
                    b10 = -1;
                } else {
                    b10 = 6;
                }
                break;
            case 320151695:
                if (!str.equals(m1009("닫弑透䚂훕\ufae4鰯\uf875鰯\uf875䃽ꩾÞᲫ", ImageFormat.getBitsPerPixel(0) + 15).intern())) {
                    b10 = -1;
                } else {
                    b10 = 9;
                }
                break;
            case 435867927:
                if (!str.equals(m1009("\ue5ba梽\u1a9a鉍띆뇞豪纥糎䜕\u1a9a鉍킢艨\udbd0ල幟\uf182톅衫됣\ueb2c", 21 - (ViewConfiguration.getScrollBarSize() >> 8)).intern())) {
                    b10 = -1;
                } else {
                    b10 = 22;
                }
                break;
            case 488344453:
                if (!str.equals(m1009("ÞᲫ\uf2d5Ỡ豪纥됣\ueb2c", 6 - TextUtils.indexOf((CharSequence) "", '0', 0)).intern())) {
                    b10 = -1;
                } else {
                    b10 = 2;
                }
                break;
            case 535330969:
                if (!str.equals(m1009("ﶤ㙁懭㞑ె馌ކ톳蟊◡켦蜮乵恛⥀텤爽涑\uf4ec鼘戞릎饚㏮", 23 - TextUtils.getTrimmedLength("")).intern())) {
                    b10 = -1;
                } else {
                    int i15 = f919 + 51;
                    f920 = i15 % 128;
                    int i16 = i15 % 2;
                    b10 = 12;
                }
                break;
            case 553704929:
                if (!str.equals(m1009("詭諭皱뭶\ua7e0Րꕚ멡矍퓂唲멀鴡\udaedϮ乱ൟᤓ됣\ueb2c", 19 - (ViewConfiguration.getTouchSlop() >> 8)).intern())) {
                    b10 = -1;
                } else {
                    b10 = 7;
                }
                break;
            case 1165508119:
                if (!str.equals(m1008("瓐璑\ue955갤恡\uea07ꃻ惷澭끈ﹺ豐尝蒚", 1 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern())) {
                    b10 = -1;
                } else {
                    int i17 = f920 + 57;
                    f919 = i17 % 128;
                    int i18 = i17 % 2;
                    b10 = 3;
                }
                break;
            case 1237162638:
                if (!str.equals(m1009("ꢖञ鯥타鰯\uf875蹡稨ÞᲫฏ泃㽬抌觎\ua7dc䝷喙\udbd0ල쌎\uf267", (ViewConfiguration.getTouchSlop() >> 8) + 21).intern())) {
                    b10 = -1;
                } else {
                    b10 = 21;
                }
                break;
            case 1476063628:
                if ((str.equals(m1008("沯泮\udcc2馳級\uf771ಧ碚쏼藛\ue310\u200a䑵", 1 - ((Process.getThreadPriority(0) + 20) >> 6)).intern()) ? (char) 15 : '^') == 15) {
                    b10 = 1;
                } else {
                    b10 = -1;
                }
                break;
            case 1838933446:
                if (!str.equals(m1009("鯥타鰯\uf875蹡稨➉䤘﮽烞嚊霽ÞᲫ", 15 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern())) {
                    b10 = -1;
                } else {
                    int i19 = f919;
                    int i20 = i19 + 21;
                    f920 = i20 % 128;
                    b10 = !(i20 % 2 != 0) ? (byte) 28 : (byte) 16;
                    int i21 = i19 + 91;
                    f920 = i21 % 128;
                    int i22 = i21 % 2;
                }
                break;
            case 1908493505:
                if (!str.equals(m1009("驨阋컉硩ᐚ㕨ކ톳◫㱕讘쌁㉞陙ᮊ瘜꾏\ue791\ue023ٳ\uf2c3젽ꌽ뀄", Color.argb(0, 0, 0, 0) + 23).intern())) {
                    b10 = -1;
                } else {
                    b10 = 5;
                }
                break;
            case 1955913096:
                if (!(str.equals(m1009("ÞᲫ㝱䲌쓭ࢲ", 5 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern()) ? false : true)) {
                    b10 = 4;
                } else {
                    b10 = -1;
                }
                break;
            case 2035065003:
                if ((str.equals(m1008("崣嵭幈ᬼ\ue4e1溿㛡䤁醴݄竞ᩀ痉㎔噀ี", 1 - Color.alpha(0)).intern()) ? (char) 5 : 'U') == 'U') {
                    b10 = -1;
                } else {
                    int i23 = f920 + 17;
                    f919 = i23 % 128;
                    int i24 = i23 % 2;
                    b10 = 15;
                }
                break;
            case 2035668095:
                if (!str.equals(m1009("鯥타鰯\uf875蹡稨ÞᲫ㝱䲌쓭ࢲ", 12 - View.getDefaultSize(0, 0)).intern())) {
                    b10 = -1;
                } else {
                    int i25 = f920 + 115;
                    f919 = i25 % 128;
                    if (i25 % 2 == 0) {
                        b10 = 18;
                    } else {
                        b10 = 0;
                    }
                }
                break;
            case 2110329530:
                if (!str.equals(m1009("鯥타鰯\uf875蹡稨ÞᲫ", TextUtils.getOffsetBefore("", 0) + 8).intern())) {
                    b10 = -1;
                } else {
                    b10 = 17;
                }
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
                return Ad.class;
            case 1:
                return AdAdapter.class;
            case 2:
                return AdError.class;
            case 3:
                return AdListener.class;
            case 4:
            case 5:
                return AdView.class;
            case 6:
                return AdPlacementType.class;
            case 7:
                return DisplayAdController.class;
            case 8:
                return InterstitialAdListener.class;
            case 9:
                return InterstitialAd.class;
            case 10:
                return RewardedVideoAdListener.class;
            case 11:
                return RewardedVideoAd.class;
            case 12:
            case 13:
                return AudienceNetworkActivity.class;
            case 14:
                return DynamicLoaderFactory.class;
            case 15:
                return NativeAdBase.class;
            case 16:
                return NativeBannerAd.class;
            case 17:
                return NativeAd.class;
            case 18:
                return NativeAdView.class;
            case 19:
                return NativeAdListener.class;
            case 20:
                return CircularProgressView.class;
            case 21:
                return b.class;
            case 22:
                return ak.m427();
            default:
                return null;
        }
    }

    public bn(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static void m1012(InterstitialAd interstitialAd, InterstitialAdListener interstitialAdListener) {
        int i10 = f919 + 115;
        f920 = i10 % 128;
        boolean z10 = i10 % 2 == 0;
        interstitialAd.setAdListener(interstitialAdListener);
        if (z10) {
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻛ */
    public final String mo737() {
        int i10 = f920 + 79;
        f919 = i10 % 128;
        int i11 = i10 % 2;
        try {
            try {
                try {
                    String str = (String) hu.m2349().m2352().m2300(AdSdkVersion.class, String.class).get(null);
                    int i12 = f919 + 107;
                    f920 = i12 % 128;
                    int i13 = i12 % 2;
                    return str;
                } catch (Throwable unused) {
                    return hu.m2349().m2351().m2451(BuildConfig.class, m1008("\udc8f\udcd1珗㚞쟃䶍腘좇丼⫚妓귲\uf40cṄ画", 1 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern());
                }
            } catch (Throwable unused2) {
                return null;
            }
        } catch (Throwable unused3) {
            return (String) hu.m2349().m2352().m2300(AdSdkVersion.class, String.class).get(null);
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m1009(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (n.f2992) {
            char[] cArr2 = new char[cArr.length];
            n.f2991 = 0;
            char[] cArr3 = new char[2];
            while (true) {
                int i11 = n.f2991;
                if (i11 < cArr.length) {
                    cArr3[0] = cArr[i11];
                    cArr3[1] = cArr[i11 + 1];
                    int i12 = 58224;
                    for (int i13 = 0; i13 < 16; i13++) {
                        char c10 = cArr3[1];
                        char c11 = cArr3[0];
                        char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f925)) ^ ((c11 >>> 5) + f922)));
                        cArr3[1] = c12;
                        cArr3[0] = (char) (c11 - (((c12 >>> 5) + f921) ^ ((c12 + i12) ^ ((c12 << 4) + f924))));
                        i12 -= 40503;
                    }
                    int i14 = n.f2991;
                    cArr2[i14] = cArr3[0];
                    cArr2[i14 + 1] = cArr3[1];
                    n.f2991 = i14 + 2;
                } else {
                    str2 = new String(cArr2, 0, i10);
                }
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m1004(Ad ad2) {
        int i10 = f920 + 99;
        f919 = i10 % 128;
        boolean z10 = i10 % 2 != 0;
        String placementId = ad2.getPlacementId();
        if (z10) {
            int i11 = 48 / 0;
        }
        return placementId;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static AdPlacementType m1003(AdAdapter adAdapter) {
        int i10 = f919 + 107;
        f920 = i10 % 128;
        int i11 = i10 % 2;
        AdPlacementType placementType = adAdapter.getPlacementType();
        int i12 = f920 + 87;
        f919 = i12 % 128;
        if ((i12 % 2 != 0 ? (char) 26 : (char) 14) != 26) {
            return placementType;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private WeakHashMap<View, WeakReference<Object>> m1002(WeakHashMap<View, WeakReference<Object>> weakHashMap, ch chVar) {
        b bVar = new b(weakHashMap, chVar);
        int i10 = f919 + 109;
        f920 = i10 % 128;
        if ((i10 % 2 == 0 ? '2' : '#') == '#') {
            return bVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m1014(AdView adView) {
        int i10 = f919 + 23;
        f920 = i10 % 128;
        int i11 = i10 % 2;
        String placementId = adView.getPlacementId();
        int i12 = f919 + 53;
        f920 = i12 % 128;
        int i13 = i12 % 2;
        return placementId;
    }
}
