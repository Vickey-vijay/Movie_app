package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jp.maio.sdk.android.AdFullscreenActivity;
import jp.maio.sdk.android.HtmlBasedAdActivity;
import jp.maio.sdk.android.MaioAds;
import jp.maio.sdk.android.MaioAdsInstance;
import jp.maio.sdk.android.MaioAdsListener;
import jp.maio.sdk.android.MaioAdsListenerInterface;

/* JADX INFO: loaded from: classes6.dex */
public final class bu extends bd {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f1041 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f1042 = 1;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static long f1043 = -494605247435270810L;

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻛ */
    public final String mo737() {
        int i10 = f1042 + 27;
        f1041 = i10 % 128;
        int i11 = i10 % 2;
        String sdkVersion = MaioAds.getSdkVersion();
        int i12 = f1041 + 101;
        f1042 = i12 % 128;
        int i13 = i12 % 2;
        return sdkVersion;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0126  */
    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo738(String str) {
        int i10;
        byte b10 = -1;
        switch (str.hashCode()) {
            case -1799290762:
                if ((str.equals(m1162("锫켊ℕ鬮ﴓ坃襛", 23052 - ImageFormat.getBitsPerPixel(0)).intern()) ? (char) 26 : (char) 28) != 28) {
                    b10 = 0;
                }
                break;
            case -1455130644:
                if (str.equals(m1162("锌\ude61Φ睮룛\uec5c凃蔉캭㈭枫ꭕᲓ䀃떀ﻭ≹韨\udb5cಝ火ꗁ\ue91a劢蘢쮕㼃悈퐐\u1978䋱뙡\ufbc7⽒郜쑊ব紼ꚸ\uea3e", (ViewConfiguration.getLongPressTimeout() >> 16) + 19319).intern())) {
                    b10 = 2;
                }
                break;
            case -1303622385:
                if (str.equals(m1162("锫\u218cﰙ袨䜋Ꮅ깗竧ㅗ췶顼哺\ue38c브䪎Ċ\uddb8栩Ⓟ\uf345远婠ᛷ굾", (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 46219).intern())) {
                    b10 = 7;
                }
                break;
            case -1069735125:
                if (str.equals(m1162("锫꘢\uf345౦妳檻\ua7cb\uf32cఠ奘橠Ꞑ\uf0b4\u0de4夅", 13093 - TextUtils.indexOf("", "", 0)).intern())) {
                    b10 = 5;
                    i10 = f1041 + 111;
                    f1042 = i10 % 128;
                    int i11 = i10 % 2;
                }
                break;
            case -278703286:
                if (str.equals(m1162("锫븠썁ᑼ㦻䋁響묻찷ᅊ㪔侮郜ꗸ줶", (KeyEvent.getMaxKeyCode() >> 16) + 11047).intern())) {
                    b10 = 6;
                }
                break;
            case 357386522:
                if (str.equals(m1162("键ꇣﳩ\u0bd9䛠鶲ꢳ\ue794㊊䥞葨퍼\uee49┯瀡輏\uda1fᄓⷭ", 13553 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern())) {
                    int i12 = f1042 + 87;
                    f1041 = i12 % 128;
                    int i13 = i12 % 2;
                    b10 = 3;
                }
                break;
            case 1819361677:
                if ((str.equals(m1162("锧㮻졒餸\u2feeﲗ赃刊\ue0dc놂䘹ᓻꖋ䩠ᬌ꧘纀ཆ\udc10护", 44729 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern()) ? '6' : (char) 18) != 18) {
                    int i14 = f1042 + 103;
                    f1041 = i14 % 128;
                    if ((i14 % 2 != 0 ? 'M' : '0') == '0') {
                        b10 = 1;
                    } else {
                        b10 = 0;
                    }
                }
                break;
            case 1914325723:
                if (str.equals(m1162("锌\u192f贺ㆠꗣ⠒\udc5f䃇\uf4dd笃\uef37錻ޫ语㸜ꉃ嚙\udac6䤀ﵳ慚ᖿ駭క끼⒖\ua8df开쌾睒ﮬ激ሥ虋ઝ뻛ⴋ턯䕩", (ViewConfiguration.getWindowTouchSlop() >> 8) + 35897).intern())) {
                    b10 = 4;
                    i10 = f1042 + 27;
                    f1041 = i10 % 128;
                    int i15 = i10 % 2;
                }
                break;
        }
        switch (b10) {
            case 0:
                return MaioAds.class;
            case 1:
            case 2:
                return AdFullscreenActivity.class;
            case 3:
            case 4:
                return HtmlBasedAdActivity.class;
            case 5:
                return MaioAdsInstance.class;
            case 6:
                return MaioAdsListener.class;
            case 7:
                return MaioAdsListenerInterface.class;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m1162(String str, int i10) {
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
                    cArr2[i11] = (char) (((long) (cArr[i11] ^ (f.f2017 * i11))) ^ f1043);
                    f.f2018++;
                } else {
                    str2 = new String(cArr2);
                }
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ void m1163(MaioAdsListenerInterface maioAdsListenerInterface) {
        int i10 = f1042 + 119;
        f1041 = i10 % 128;
        boolean z10 = i10 % 2 != 0;
        m1164(maioAdsListenerInterface);
        if (z10) {
            throw null;
        }
        int i11 = f1041 + 21;
        f1042 = i11 % 128;
        if ((i11 % 2 == 0 ? '2' : '^') != '2') {
            return;
        }
        int i12 = 74 / 0;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static void m1164(MaioAdsListenerInterface maioAdsListenerInterface) {
        int i10 = f1042 + 5;
        f1041 = i10 % 128;
        boolean z10 = i10 % 2 == 0;
        MaioAds.setMaioAdsListener(maioAdsListenerInterface);
        if (z10) {
        } else {
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻐ */
    public final Map<String, bd.b> mo736() {
        HashMap map = new HashMap();
        map.put(m1162("锕\ued50斴\ufdd2瑋첐䓻\udf62垚꿾☔뺞㛱褥Ɖ駕ဳ梗", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 30803).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bu.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                bu.m1163((MaioAdsListenerInterface) list.get(0));
                return null;
            }
        });
        int i10 = f1041 + 111;
        f1042 = i10 % 128;
        int i11 = i10 % 2;
        return map;
    }

    public bu(String str) {
        super(str);
    }
}
