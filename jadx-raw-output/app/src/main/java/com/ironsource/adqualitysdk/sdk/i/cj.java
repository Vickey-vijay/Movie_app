package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.monetization.ads.base.model.reward.RewardData;
import com.yandex.mobile.ads.banner.BannerAdEventListener;
import com.yandex.mobile.ads.banner.BannerAdView;
import com.yandex.mobile.ads.common.AdActivity;
import com.yandex.mobile.ads.common.AdInfo;
import com.yandex.mobile.ads.common.AdRequest;
import com.yandex.mobile.ads.common.AdType;
import com.yandex.mobile.ads.common.ImpressionData;
import com.yandex.mobile.ads.common.MobileAds;
import com.yandex.mobile.ads.common.VideoController;
import com.yandex.mobile.ads.common.VideoEventListener;
import com.yandex.mobile.ads.interstitial.InterstitialAd;
import com.yandex.mobile.ads.interstitial.InterstitialAdEventListener;
import com.yandex.mobile.ads.rewarded.Reward;
import com.yandex.mobile.ads.rewarded.RewardedAd;
import com.yandex.mobile.ads.rewarded.RewardedAdEventListener;
import com.yandex.mobile.ads.video.playback.VideoAdPlaybackListener;
import com.yandex.mobile.ads.video.playback.model.MediaFile;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class cj extends bd {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f1327 = 1;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f1328 = -1920709221;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f1329 = 0;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static char f1330 = 0;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static long f1331 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f1332 = 7074;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char f1333 = 54853;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f1334 = 63179;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char f1335 = 17986;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ AdInfo m1546(InterstitialAd interstitialAd) {
        int i10 = f1329 + 29;
        f1327 = i10 % 128;
        boolean z10 = i10 % 2 == 0;
        AdInfo adInfoM1556 = m1556(interstitialAd);
        if (z10) {
            int i11 = 74 / 0;
        }
        return adInfoM1556;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ String m1553(AdInfo adInfo) {
        int i10 = f1329 + 57;
        f1327 = i10 % 128;
        int i11 = i10 % 2;
        String strM1564 = m1564(adInfo);
        int i12 = f1327 + 61;
        f1329 = i12 % 128;
        int i13 = i12 % 2;
        return strM1564;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ String m1557(Reward reward) {
        int i10 = f1329 + 101;
        f1327 = i10 % 128;
        if ((i10 % 2 == 0 ? ']' : 'O') == ']') {
            m1549(reward);
            throw null;
        }
        String strM1549 = m1549(reward);
        int i11 = f1329 + 13;
        f1327 = i11 % 128;
        int i12 = i11 % 2;
        return strM1549;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ MediaFile m1563(VideoAd videoAd) {
        int i10 = f1329 + 75;
        f1327 = i10 % 128;
        char c10 = i10 % 2 == 0 ? '7' : 'Z';
        MediaFile mediaFileM1552 = m1552(videoAd);
        if (c10 == '7') {
            int i11 = 59 / 0;
        }
        int i12 = f1327 + 15;
        f1329 = i12 % 128;
        if ((i12 % 2 != 0 ? (char) 0 : 'R') == 'R') {
            return mediaFileM1552;
        }
        int i13 = 83 / 0;
        return mediaFileM1552;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ int m1570(Reward reward) {
        int i10 = f1329 + 123;
        f1327 = i10 % 128;
        boolean z10 = i10 % 2 != 0;
        int iM1562 = m1562(reward);
        if (!z10) {
            int i11 = 4 / 0;
        }
        int i12 = f1327 + 63;
        f1329 = i12 % 128;
        int i13 = i12 % 2;
        return iM1562;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ String m1548(ImpressionData impressionData) {
        int i10 = f1329 + 53;
        f1327 = i10 % 128;
        int i11 = i10 % 2;
        String strM1565 = m1565(impressionData);
        int i12 = f1329 + 57;
        f1327 = i12 % 128;
        int i13 = i12 % 2;
        return strM1565;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ String m1554(MediaFile mediaFile) {
        int i10 = f1329 + 123;
        f1327 = i10 % 128;
        int i11 = i10 % 2;
        String strM1566 = m1566(mediaFile);
        int i12 = f1327 + 13;
        f1329 = i12 % 128;
        if (i12 % 2 == 0) {
            return strM1566;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ void m1560(VideoController videoController, VideoEventListener videoEventListener) {
        int i10 = f1327 + 47;
        f1329 = i10 % 128;
        char c10 = i10 % 2 != 0 ? '?' : '\\';
        m1568(videoController, videoEventListener);
        if (c10 != '?') {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m1564(AdInfo adInfo) {
        int i10 = f1327 + 11;
        f1329 = i10 % 128;
        int i11 = i10 % 2;
        String adUnitId = adInfo.getAdUnitId();
        int i12 = f1329 + 31;
        f1327 = i12 % 128;
        if (!(i12 % 2 == 0)) {
            return adUnitId;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ AdInfo m1571(RewardedAd rewardedAd) {
        int i10 = f1329 + 41;
        f1327 = i10 % 128;
        boolean z10 = i10 % 2 == 0;
        AdInfo adInfoM1547 = m1547(rewardedAd);
        if (z10) {
            int i11 = 39 / 0;
        }
        return adInfoM1547;
    }

    public cj(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ void m1555(RewardedAd rewardedAd, RewardedAdEventListener rewardedAdEventListener) {
        int i10 = f1329 + 113;
        f1327 = i10 % 128;
        boolean z10 = i10 % 2 == 0;
        m1569(rewardedAd, rewardedAdEventListener);
        if (z10) {
            throw null;
        }
        int i11 = f1327 + 5;
        f1329 = i11 % 128;
        int i12 = i11 % 2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ void m1561(InterstitialAd interstitialAd, InterstitialAdEventListener interstitialAdEventListener) {
        int i10 = f1327 + 37;
        f1329 = i10 % 128;
        char c10 = i10 % 2 != 0 ? '$' : '7';
        m1551(interstitialAd, interstitialAdEventListener);
        if (c10 == '$') {
            int i11 = 22 / 0;
        }
        int i12 = f1329 + 85;
        f1327 = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m1565(ImpressionData impressionData) {
        int i10 = f1329 + 91;
        f1327 = i10 % 128;
        int i11 = i10 % 2;
        String rawData = impressionData.getRawData();
        int i12 = f1327 + 93;
        f1329 = i12 % 128;
        if ((i12 % 2 != 0 ? '\'' : 'A') == 'A') {
            return rawData;
        }
        int i13 = 85 / 0;
        return rawData;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ String m1572(VideoAd videoAd) {
        int i10 = f1327 + 33;
        f1329 = i10 % 128;
        if (i10 % 2 == 0) {
            return m1558(videoAd);
        }
        m1558(videoAd);
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻐ */
    public final Map<String, bd.b> mo736() {
        HashMap map = new HashMap();
        map.put(m1559("û\uf420ሩ\uf750녢\ue12d븼\uf17f㭜㍴捴谛", 11 - (KeyEvent.getMaxKeyCode() >> 16)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return cj.m1553((AdInfo) list.get(0));
            }
        });
        map.put(m1567("둞뫥緊蘏黡\ue083妱话ᅌ㯦", (char) TextUtils.getCapsMode("", 0, 0), "\u0000\u0000\u0000\u0000", 1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), "䶴↢㘝\uf047").intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.8
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return cj.m1548((ImpressionData) list.get(0));
            }
        });
        map.put(m1559("\ufbce┸ⱌ쟆㻺럁ﮮ阮氩✎\u209f\uf294揾\uecde\uf0df\ua87a凷⾡꺱溎괧銠", 21 - (ViewConfiguration.getTapTimeout() >> 16)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.6
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                cj.m1560((VideoController) list.get(0), (VideoEventListener) list.get(1));
                return null;
            }
        });
        map.put(m1567("䝮ၿ擪⯼\uea80\udb2f⅚组욂荭\u2e6a贋\ue75c쪽\udb35\ue206ﮤ\ue1e1\uf3ac亢", (char) View.getDefaultSize(0, 0), "\u0000\u0000\u0000\u0000", TextUtils.getOffsetBefore("", 0), "웥\ue32e砠陟").intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.10
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return cj.m1546((InterstitialAd) list.get(0));
            }
        });
        map.put(m1567("鱸팾\uf057ﮑᱨ\uf48c䃠헏켪\uedeb볣瞵龲湦솳", (char) (52744 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), "\u0000\u0000\u0000\u0000", (-1368179779) - Gravity.getAbsoluteGravity(0, 0), "뷫猻ޮ췎").intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.9
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return Integer.valueOf(cj.m1570((Reward) list.get(0)));
            }
        });
        map.put(m1567("ニॢ㡰㨓呐䷂롻\u0e67缎姾뷶洅\uf7c2", (char) (40636 - (ViewConfiguration.getEdgeSlop() >> 16)), "\u0000\u0000\u0000\u0000", TextUtils.indexOf("", "", 0) + 324816441, "㦝屎밓㮞").intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.7
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return cj.m1557((Reward) list.get(0));
            }
        });
        map.put(m1567("提ኑ≫ˢ絙쬝ⴿʱ숭꿡\ua635ⳃꎎﷂ枉青梴", (char) (19273 - (ViewConfiguration.getWindowTouchSlop() >> 8)), "\u0000\u0000\u0000\u0000", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 2105121537, "Ǔ禛䥽왋").intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.11
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return cj.m1571((RewardedAd) list.get(0));
            }
        });
        map.put(m1567("卙險ᅍ\udc8dꌗ栁ᭇ\u31ea㻔籔햽⮼\uee7f蕀ؓ\ue35d▞툛剕㣙⒊冗樊\ue2c6\uf4ba㜏", (char) (52911 - Color.argb(0, 0, 0, 0)), "\u0000\u0000\u0000\u0000", KeyEvent.keyCodeFromString(""), "\u0ffeĈ꿪\u1cce").intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.13
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                cj.m1555((RewardedAd) list.get(0), (RewardedAdEventListener) list.get(1));
                return null;
            }
        });
        map.put(m1559("\ufbce┸㭜㍴᭫穾\uf6a9휙ꐊ\ueb1b盦떝荜\ue603̭\u1bf9⊥\ue5fc饇Ƴ᭫穾权豕ꐊ\ueb1b\u209f\uf294\uf6a9휙", Color.argb(0, 0, 0, 0) + 30).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.14
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                cj.m1561((InterstitialAd) list.get(0), (InterstitialAdEventListener) list.get(1));
                return null;
            }
        });
        map.put(m1567("Η콚ꖹﵝ朘瞧폇文巉돾蔛绥를揔僥", (char) (475 - (Process.myPid() >> 22)), "\u0000\u0000\u0000\u0000", (-1061888820) - TextUtils.lastIndexOf("", '0', 0, 0), "쵉드\udbc0\uf701").intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return cj.m1554((MediaFile) list.get(0));
            }
        });
        map.put(m1559("û\uf420ⱌ쟆㻺럁ﮮ阮軜ླ铍㚨嶶\uf2fa奾攳\u0a0e꧘徵⅐", KeyEvent.normalizeMetaState(0) + 19).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return cj.m1563((VideoAd) list.get(0));
            }
        });
        map.put(m1559("û\uf420ⱌ쟆㻺럁ﮮ阮軜ླ\ue2b0\u0e80쵐钖", ExpandableListView.getPackedPositionChild(0L) + 15).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return cj.m1572((VideoAd) list.get(0));
            }
        });
        map.put(m1559("\ufbce┸쥙꩗\udd94緿꺱溎쮣ḕ⊥\ue5fc饇Ƴ᭫穾权豕ꐊ\ueb1b\u209f\uf294\uf6a9휙", (ViewConfiguration.getJumpTapTimeout() >> 16) + 24).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                cj.m1573((BannerAdView) list.get(0), (BannerAdEventListener) list.get(1));
                return null;
            }
        });
        int i10 = f1329 + 79;
        f1327 = i10 % 128;
        if (!(i10 % 2 == 0)) {
            return map;
        }
        int i11 = 72 / 0;
        return map;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static AdInfo m1556(InterstitialAd interstitialAd) {
        int i10 = f1327 + 17;
        f1329 = i10 % 128;
        if (!(i10 % 2 == 0)) {
            interstitialAd.getInfo();
            throw null;
        }
        AdInfo info = interstitialAd.getInfo();
        int i11 = f1329 + 61;
        f1327 = i11 % 128;
        int i12 = i11 % 2;
        return info;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static void m1568(VideoController videoController, VideoEventListener videoEventListener) {
        int i10 = f1327 + 43;
        f1329 = i10 % 128;
        int i11 = i10 % 2;
        videoController.setVideoEventListener(videoEventListener);
        int i12 = f1329 + 79;
        f1327 = i12 % 128;
        if (!(i12 % 2 == 0)) {
            return;
        }
        int i13 = 96 / 0;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ void m1573(BannerAdView bannerAdView, BannerAdEventListener bannerAdEventListener) {
        int i10 = f1329 + 71;
        f1327 = i10 % 128;
        char c10 = i10 % 2 == 0 ? '4' : ';';
        m1550(bannerAdView, bannerAdEventListener);
        if (c10 == ';') {
        } else {
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻛ */
    public final String mo737() {
        String libraryVersion;
        int i10 = f1329 + 77;
        f1327 = i10 % 128;
        if ((i10 % 2 == 0 ? (char) 17 : 'B') != 'B') {
            libraryVersion = MobileAds.getLibraryVersion();
            int i11 = 67 / 0;
        } else {
            libraryVersion = MobileAds.getLibraryVersion();
        }
        int i12 = f1327 + 35;
        f1329 = i12 % 128;
        if ((i12 % 2 != 0 ? 'D' : (char) 31) == 31) {
            return libraryVersion;
        }
        int i13 = 85 / 0;
        return libraryVersion;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static MediaFile m1552(VideoAd videoAd) {
        int i10 = f1329 + 47;
        f1327 = i10 % 128;
        int i11 = i10 % 2;
        MediaFile mediaFile = videoAd.getMediaFile();
        int i12 = f1327 + 69;
        f1329 = i12 % 128;
        if (i12 % 2 == 0) {
            return mediaFile;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m1558(VideoAd videoAd) {
        int i10 = f1327 + 41;
        f1329 = i10 % 128;
        boolean z10 = i10 % 2 == 0;
        String info = videoAd.getInfo();
        if (!z10) {
            int i11 = 9 / 0;
        }
        int i12 = f1329 + 47;
        f1327 = i12 % 128;
        int i13 = i12 % 2;
        return info;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int m1562(Reward reward) {
        int i10 = f1327 + 23;
        f1329 = i10 % 128;
        int i11 = i10 % 2;
        int amount = reward.getAmount();
        int i12 = f1327 + 101;
        f1329 = i12 % 128;
        int i13 = i12 % 2;
        return amount;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:109:0x0320  */
    /* JADX WARN: Code duplicated, block: B:117:0x0349  */
    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo738(String str) {
        byte b10 = 1;
        switch (str.hashCode()) {
            case -1850459313:
                if ((str.equals(m1567("썰蓮⏼᥆ᣁ달", (char) (TextUtils.indexOf("", "", 0, 0) + 22123), "\u0000\u0000\u0000\u0000", View.resolveSize(0, 0), "쬛\udb90毸策").intern()) ? '#' : (char) 14) == '#') {
                    b10 = 14;
                } else {
                    b10 = -1;
                }
                break;
            case -1836618638:
                if ((str.equals(m1559("軜ླΰ\ueac0驇쁃梸暙쩜鹾", KeyEvent.keyCodeFromString("") + 10).intern()) ? '^' : '?') == '^') {
                    b10 = 0;
                } else {
                    b10 = -1;
                }
                break;
            case -1666698098:
                if ((str.equals(m1559("퍁쌒䞯嬢\ud9b3ꃩ軜ླ稓䠩", View.MeasureSpec.makeMeasureSpec(0, 0) + 9).intern()) ? '[' : '+') == '[') {
                    b10 = 6;
                } else {
                    b10 = -1;
                }
                break;
            case -1401317165:
                if (!str.equals(m1567("Ꭵ䦰犙繗⟰ꄅ줅툵肶찘嶷屌\ue382瘈齟\u0379빚儠", (char) (11641 - (ViewConfiguration.getLongPressTimeout() >> 16)), "\u0000\u0000\u0000\u0000", ExpandableListView.getPackedPositionType(0L), "륫\uea08禿設").intern())) {
                    b10 = -1;
                } else {
                    int i10 = f1329 + 41;
                    f1327 = i10 % 128;
                    int i11 = i10 % 2;
                    b10 = 10;
                }
                break;
            case -1338246468:
                if (!str.equals(m1559("ꗯ鍴嬋㻔霸锴ꗩ뱹틳탎氖帎䣗\uf357\u0a0e꧘莽唔嫖齮\u07ba㧰롸쫷覿\udab8\uf6a9휙혂\u39594緿꺱溎쮣ḕ\uf46f뵷攌ﴟ⟺猪", Gravity.getAbsoluteGravity(0, 0) + 41).intern())) {
                    b10 = -1;
                } else {
                    b10 = 8;
                }
                break;
            case -1139615429:
                if ((str.equals(m1567("뮪购\uf7f7춿\ue967乞폊䃺왋甶냣蚓쒱Ҕׂ㹿７ʇ耿䘥꒚䈦鄘\u0ef6켍\uf2e6弢흖戂턥딿ʡ㰾덮㷻ㆼ㱹䌕뢯", (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 35548), "\u0000\u0000\u0000\u0000", (ViewConfiguration.getLongPressTimeout() >> 16) + (-1757264465), "꼓䉅\udd97⊊").intern()) ? '#' : ')') == ')') {
                    b10 = -1;
                } else {
                    int i12 = f1327 + 13;
                    f1329 = i12 % 128;
                    if (i12 % 2 != 0) {
                        b10 = 0;
                    }
                }
                break;
            case -1115843213:
                if (!str.equals(m1567("ꅚྸ\uf004ሡ㊴燓혳谘䞩텠틲脫퐎\uf023", (char) (27043 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), "\u0000\u0000\u0000\u0000", ViewConfiguration.getTapTimeout() >> 16, "\ue73e㢚ꌘ桩").intern())) {
                    b10 = -1;
                } else {
                    int i13 = f1329 + 103;
                    f1327 = i13 % 128;
                    int i14 = i13 % 2;
                    b10 = 5;
                }
                break;
            case -650052115:
                if (!str.equals(m1559("벚Ꜥྯ쐤㒎繍絕ㅙ㬶縆ꏨ퓅Ṯ珊柠떲\uf0df\ua87a凷⾡꺱溎괧銠", View.MeasureSpec.getMode(0) + 23).intern())) {
                    b10 = -1;
                } else {
                    b10 = 17;
                }
                break;
            case -610771047:
                if (!str.equals(m1567("门큑撤不璣㶍䞩䴸ึ嬼", (char) KeyEvent.getDeadChar(0, 0), "\u0000\u0000\u0000\u0000", ViewConfiguration.getMaximumFlingVelocity() >> 16, "뫼鵂涨ధ").intern())) {
                    b10 = -1;
                } else {
                    b10 = 20;
                }
                break;
            case -609786639:
                if (!str.equals(m1559("㯀\uef4b﮲\uf690ʨ晣膶嵸軜ླ", (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 10).intern())) {
                    b10 = -1;
                } else {
                    int i15 = f1327 + 31;
                    f1329 = i15 % 128;
                    b10 = i15 % 2 == 0 ? (byte) 15 : (byte) 60;
                }
                break;
            case -572702516:
                if (!str.equals(m1559("軜ླ㯀\uef4b쩜楝\uec2c髸䩓맷", TextUtils.indexOf("", "", 0) + 9).intern())) {
                    b10 = -1;
                } else {
                    b10 = 3;
                }
                break;
            case -564429827:
                if (!str.equals(m1559("㯀\uef4b﮲\uf690ʨ晣膶嵸軜ླ氩✎\u209f\uf294揾\uecde\uf0df\ua87a凷⾡꺱溎괧銠", (ViewConfiguration.getEdgeSlop() >> 16) + 23).intern())) {
                    b10 = -1;
                } else {
                    b10 = 16;
                }
                break;
            case -150968480:
                if (!str.equals(m1559("铍㚨嶶\uf2fa奾攳\u0a0e꧘徵⅐", 9 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern())) {
                    b10 = -1;
                } else {
                    int i16 = f1327 + 97;
                    f1329 = i16 % 128;
                    b10 = i16 % 2 != 0 ? (byte) 90 : (byte) 18;
                }
                break;
            case 308060116:
                if (!str.equals(m1559("⺙뼵覿\udab8\uf6a9휙軜ླ벚Ꜥ씽枇", 12 - Color.alpha(0)).intern())) {
                    b10 = -1;
                } else {
                    b10 = 7;
                }
                break;
            case 320151695:
                if (!str.equals(m1567("飉\u0db2盩\uee50⼋䵘㐽덂所\ueed9賤즆㿬趤", (char) (61090 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), "\u0000\u0000\u0000\u0000", View.combineMeasuredStates(0, 0), "Ὸ녥ꆐ\u1aee").intern())) {
                    b10 = -1;
                } else {
                    int i17 = f1329 + 41;
                    f1327 = i17 % 128;
                    b10 = (i17 % 2 == 0 ? (byte) 0 : (byte) 1) == 0 ? (byte) 52 : (byte) 12;
                }
                break;
            case 871099991:
                if (!str.equals(m1567("ݸ㗎\ua4c7桦湐䄓뫮\uddc7呭߽楨셂룧땴∉", (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 25286), "\u0000\u0000\u0000\u0000", (-131113050) - KeyEvent.normalizeMetaState(0), "\ua634⽟웸䉢").intern())) {
                    b10 = -1;
                } else {
                    int i18 = f1327 + 11;
                    f1329 = i18 % 128;
                    b10 = i18 % 2 == 0 ? (byte) 9 : (byte) 111;
                }
                break;
            case 957243679:
                if (!str.equals(m1559("⺙뼵覿\udab8\uf6a9휙軜ླ氩✎\u209f\uf294揾\uecde\uf0df\ua87a凷⾡꺱溎괧銠", Color.alpha(0) + 21).intern())) {
                    b10 = -1;
                } else {
                    b10 = 11;
                }
                break;
            case 1228411167:
                if ((str.equals(m1567("쾄楟ඵ猽\u05f6艶≢\ue3e1런忚猢\u1775駲ᯰ씅咗䓆㺍瀴㘪\uf51f썝跎鄗栾\uf835差", (char) (35005 - ((byte) KeyEvent.getModifierMetaStateMask())), "\u0000\u0000\u0000\u0000", ((byte) KeyEvent.getModifierMetaStateMask()) + 1424315540, "錻\ue554빔麗").intern()) ? (byte) 0 : (byte) 1) == 0) {
                    b10 = 13;
                } else {
                    b10 = -1;
                }
                break;
            case 1955530641:
                if (!str.equals(m1559("軜ླ\ue2b0\u0e80쵐钖", 7 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern())) {
                    b10 = -1;
                } else {
                    b10 = 2;
                }
                break;
            case 1955869213:
                if ((str.equals(m1567("䄣\ue6e0퐭彃\ue854ࣗ", (char) (34167 - Process.getGidForName("")), "\u0000\u0000\u0000\u0000", ViewConfiguration.getPressedStateDuration() >> 16, "犂⦣磭炅").intern()) ? (char) 3 : '@') == 3) {
                    int i19 = f1329 + 81;
                    f1327 = i19 % 128;
                    int i20 = i19 % 2;
                    b10 = 4;
                } else {
                    b10 = -1;
                }
                break;
            case 2117435870:
                if ((str.equals(m1559("벚Ꜥྯ쐤㒎繍捴谛", 7 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern()) ? 'b' : '`') == 'b') {
                    b10 = 19;
                } else {
                    b10 = -1;
                }
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
            case 1:
                return AdActivity.class;
            case 2:
                return AdInfo.class;
            case 3:
                return AdRequest.class;
            case 4:
                return AdType.class;
            case 5:
                return ImpressionData.class;
            case 6:
                return MobileAds.class;
            case 7:
            case 8:
                return BannerAdView.class;
            case 9:
                int i21 = f1327 + 15;
                f1329 = i21 % 128;
                if (i21 % 2 != 0) {
                    int i22 = 68 / 0;
                    return VideoController.class;
                }
                return VideoController.class;
            case 10:
                return VideoEventListener.class;
            case 11:
                return BannerAdEventListener.class;
            case 12:
                return InterstitialAd.class;
            case 13:
                return InterstitialAdEventListener.class;
            case 14:
                return Reward.class;
            case 15:
                return RewardedAd.class;
            case 16:
                return RewardedAdEventListener.class;
            case 17:
                return VideoAdPlaybackListener.class;
            case 18:
                return MediaFile.class;
            case 19:
                return VideoAd.class;
            case 20:
                return RewardData.class;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m1559(String str, int i10) {
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
                        char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f1333)) ^ ((c11 >>> 5) + f1334)));
                        cArr3[1] = c12;
                        cArr3[0] = (char) (c11 - (((c12 >>> 5) + f1335) ^ ((c12 + i12) ^ ((c12 << 4) + f1332))));
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

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static void m1569(RewardedAd rewardedAd, RewardedAdEventListener rewardedAdEventListener) {
        int i10 = f1329 + 81;
        f1327 = i10 % 128;
        char c10 = i10 % 2 == 0 ? '_' : '6';
        rewardedAd.setAdEventListener(rewardedAdEventListener);
        if (c10 != '6') {
            int i11 = 52 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m1566(MediaFile mediaFile) {
        int i10 = f1327 + 3;
        f1329 = i10 % 128;
        int i11 = i10 % 2;
        String url = mediaFile.getUrl();
        int i12 = f1329 + 101;
        f1327 = i12 % 128;
        int i13 = i12 % 2;
        return url;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m1567(String str, char c10, String str2, int i10, String str3) {
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
                    cArr6[i15] = (char) (((((long) (c12 ^ cArr3[i15])) ^ f1331) ^ ((long) f1328)) ^ ((long) f1330));
                    j.f2675 = i15 + 1;
                } else {
                    str4 = new String(cArr6);
                }
            }
        }
        return str4;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m1549(Reward reward) {
        int i10 = f1327 + 15;
        f1329 = i10 % 128;
        int i11 = i10 % 2;
        String type = reward.getType();
        int i12 = f1327 + 93;
        f1329 = i12 % 128;
        if (i12 % 2 == 0) {
            return type;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static AdInfo m1547(RewardedAd rewardedAd) {
        int i10 = f1329 + 41;
        f1327 = i10 % 128;
        char c10 = i10 % 2 == 0 ? 'U' : 'L';
        AdInfo info = rewardedAd.getInfo();
        if (c10 == 'U') {
            int i11 = 72 / 0;
        }
        int i12 = f1327 + 33;
        f1329 = i12 % 128;
        int i13 = i12 % 2;
        return info;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static void m1551(InterstitialAd interstitialAd, InterstitialAdEventListener interstitialAdEventListener) {
        int i10 = f1327 + 47;
        f1329 = i10 % 128;
        int i11 = i10 % 2;
        interstitialAd.setAdEventListener(interstitialAdEventListener);
        int i12 = f1327 + 85;
        f1329 = i12 % 128;
        if ((i12 % 2 != 0 ? (char) 5 : (char) 19) == 19) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static void m1550(BannerAdView bannerAdView, BannerAdEventListener bannerAdEventListener) {
        int i10 = f1327 + 15;
        f1329 = i10 % 128;
        char c10 = i10 % 2 != 0 ? (char) 19 : 'B';
        bannerAdView.setBannerAdEventListener(bannerAdEventListener);
        if (c10 == 'B') {
        } else {
            throw null;
        }
    }
}
