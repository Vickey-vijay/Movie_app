package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import tv.superawesome.lib.samodelspace.saad.SAAd;
import tv.superawesome.lib.samodelspace.saad.SACreative;
import tv.superawesome.lib.samodelspace.saad.SACreativeFormat;
import tv.superawesome.lib.samodelspace.saad.SADetails;
import tv.superawesome.lib.samodelspace.saad.SAMedia;
import tv.superawesome.lib.samodelspace.saad.SAResponse;
import tv.superawesome.lib.samodelspace.vastad.SAVASTAd;
import tv.superawesome.lib.samodelspace.vastad.SAVASTMedia;
import tv.superawesome.lib.sawebplayer.SAWebPlayer;
import tv.superawesome.lib.sawebplayer.SAWebView;
import tv.superawesome.sdk.publisher.AwesomeAds;
import tv.superawesome.sdk.publisher.SABannerAd;
import tv.superawesome.sdk.publisher.SAEvent;
import tv.superawesome.sdk.publisher.SAInterface;
import tv.superawesome.sdk.publisher.SAInterstitialAd;
import tv.superawesome.sdk.publisher.SAVersion;
import tv.superawesome.sdk.publisher.SAVideoActivity;
import tv.superawesome.sdk.publisher.SAVideoAd;
import tv.superawesome.sdk.publisher.SAVideoClick;
import tv.superawesome.sdk.publisher.managed.AdViewJavaScriptBridge;
import tv.superawesome.sdk.publisher.managed.SACustomWebView;
import tv.superawesome.sdk.publisher.managed.SAManagedAdActivity;
import tv.superawesome.sdk.publisher.managed.SAManagedAdView;
import tv.superawesome.sdk.publisher.video.AdVideoPlayerControllerView;
import tv.superawesome.sdk.publisher.videoPlayer.IVideoPlayer;
import tv.superawesome.sdk.publisher.videoPlayer.IVideoPlayerController;
import tv.superawesome.sdk.publisher.videoPlayer.IVideoPlayerControllerView;
import tv.superawesome.sdk.publisher.videoPlayer.VideoPlayerActivity;
import tv.superawesome.sdk.publisher.videoPlayer.VideoPlayerController;

/* JADX INFO: loaded from: classes7.dex */
public final class cc extends bd {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f1245 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f1246 = {'I', 'V', 'i', 'd', 'e', 'o', 'P', 'l', 'a', 'y', 'r', 'L', 's', 't', 'n', 'S', 'A', 'C', 'c', 'k', 'w', 'u', 'm', 'W', 'b', 'T', 'M', 'R', 'p', 'f', 'B', 'E', 'v', 'J', 'K', 'N'};

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f1247 = 5;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f1248 = 6;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1249;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ JSONObject m1455(SAAd sAAd) {
        int i10 = f1249 + 13;
        f1245 = i10 % 128;
        if ((i10 % 2 == 0 ? '5' : (char) 17) != '5') {
            return m1456(sAAd);
        }
        m1456(sAAd);
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ void m1457(SABannerAd sABannerAd, SAInterface sAInterface) {
        int i10 = f1249 + 63;
        f1245 = i10 % 128;
        char c10 = i10 % 2 == 0 ? 'T' : 'O';
        m1458(sABannerAd, sAInterface);
        if (c10 == 'T') {
            int i11 = 30 / 0;
        }
        int i12 = f1245 + 63;
        f1249 = i12 % 128;
        if ((i12 % 2 != 0 ? '[' : (char) 5) != '[') {
            return;
        }
        int i13 = 3 / 0;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻐ */
    public final Map<String, bd.b> mo736() {
        HashMap map = new HashMap();
        map.put(m1454("\t\u0002\u0016\u000b\u0001\u000e\u0001\u001c\u0003#\u0011\u0000\u009e", 12 - ExpandableListView.getPackedPositionChild(0L), (byte) (47 - ExpandableListView.getPackedPositionChild(0L))).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cc.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return cc.m1455((SAAd) list.get(0));
            }
        });
        map.put(m1453("\u0002\u0000\u000f\ufff1\u0004\uffff\u0000\nￜ\uffff\uffe7\u0004\u000e\u000f\u0000\t\u0000\r", 19 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), false, View.MeasureSpec.makeMeasureSpec(0, 0) + 18, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 105).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cc.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return cc.m1452();
            }
        });
        map.put(m1453("\u000b\f�\u0006�\n\u000b�\fￚ\ufff9\u0006\u0006�\n￤\u0001", KeyEvent.getDeadChar(0, 0) + 17, false, View.resolveSizeAndState(0, 0, 0) + 6, KeyEvent.keyCodeFromString("") + 109).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cc.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                cc.m1457((SABannerAd) list.get(0), (SAInterface) list.get(1));
                return null;
            }
        });
        int i10 = f1249 + 25;
        f1245 = i10 % 128;
        int i11 = i10 % 2;
        return map;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static SAInterface m1451() {
        int i10 = f1245 + 13;
        f1249 = i10 % 128;
        if ((i10 % 2 != 0 ? '\f' : (char) 20) != '\f') {
            return SAVideoAd.getListener();
        }
        SAVideoAd.getListener();
        throw null;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public static /* synthetic */ SAInterface m1452() {
        int i10 = f1245 + 89;
        f1249 = i10 % 128;
        if ((i10 % 2 != 0 ? (char) 31 : (char) 21) == 21) {
            return m1451();
        }
        m1451();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static JSONObject m1456(SAAd sAAd) {
        int i10 = f1249 + 11;
        f1245 = i10 % 128;
        int i11 = i10 % 2;
        JSONObject jSONObjectWriteToJson = sAAd.writeToJson();
        int i12 = f1249 + 17;
        f1245 = i12 % 128;
        int i13 = i12 % 2;
        return jSONObjectWriteToJson;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static void m1458(SABannerAd sABannerAd, SAInterface sAInterface) {
        int i10 = f1245 + 97;
        f1249 = i10 % 128;
        boolean z10 = i10 % 2 != 0;
        sABannerAd.setListener(sAInterface);
        if (!z10) {
        } else {
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻛ */
    public final String mo737() {
        String sDKVersionNumber;
        int i10 = f1249 + 109;
        f1245 = i10 % 128;
        try {
            if (i10 % 2 == 0) {
                sDKVersionNumber = SAVersion.getSDKVersionNumber();
                int i11 = 82 / 0;
            } else {
                sDKVersionNumber = SAVersion.getSDKVersionNumber();
            }
            int i12 = f1249 + 81;
            f1245 = i12 % 128;
            if ((i12 % 2 == 0 ? 'H' : 'A') == 'A') {
                return sDKVersionNumber;
            }
            int i13 = 53 / 0;
            return sDKVersionNumber;
        } catch (Throwable unused) {
            return hu.m2349().m2351().m2451(SAVersion.class, m1453("\uffdd\fￚ\u000b\u0013ￓ\r\u000b\u0013\n\u000b\u0013", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 11, false, 6 - (ViewConfiguration.getTouchSlop() >> 8), 85 - TextUtils.indexOf((CharSequence) "", '0', 0)).intern());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:155:0x0609  */
    /* JADX WARN: Code duplicated, block: B:66:0x02ce  */
    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo738(String str) {
        byte b10;
        switch (str.hashCode()) {
            case -1959951430:
                if (!str.equals(m1454("\u000f\u0004\u0002\u0003\u0004\u0005\u0000\u000b\b\t\n\u0003\u000b\u0010\u0002\u0011\u0010\u0007\u0001\u000b\n\u0001\u0007\u0004\u0003\u0005¼", View.MeasureSpec.getSize(0) + 27, (byte) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 69)).intern())) {
                    b10 = -1;
                } else {
                    b10 = 16;
                }
                break;
            case -1855458488:
                if (!str.equals(m1453("\u0007\r\u000b\b\u0005\u0005\ufffe\u000b\uffef\u0002\ufffe\u0010￥\u0002\f\r\ufffe\u0007\ufffe\u000b￢\uffef\u0002�\ufffe\b￩\u0005\ufffa\u0012\ufffe\u000bￜ\b", 34 - KeyEvent.keyCodeFromString(""), false, 19 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), Color.rgb(0, 0, 0) + 16777324).intern())) {
                    b10 = -1;
                } else {
                    b10 = 10;
                }
                break;
            case -1788589794:
                if ((str.equals(m1453("\u0001\uffde\u0002\u0004\u0001\u0006\u000f\uffdf\u0011\r\u0006\u000f\u0000\ufff0\ufffe\u0013\ufffe\uffe7\u0014\u0002\u0006\ufff3", 21 - ((byte) KeyEvent.getModifierMetaStateMask()), true, 2 - View.resolveSize(0, 0), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 104).intern()) ? 'O' : 'V') == 'O') {
                    b10 = 21;
                } else {
                    b10 = -1;
                }
                break;
            case -1718372116:
                if (!str.equals(m1454("\u0010\u0011 !\u0002\u0010·", 7 - TextUtils.indexOf("", "", 0, 0), (byte) (ExpandableListView.getPackedPositionType(0L) + 67)).intern())) {
                    b10 = -1;
                } else {
                    b10 = 35;
                }
                break;
            case -1711491530:
                if ((str.equals(m1453("\f\u000b\u0010\b\ufffa￨\ufff4", 7 - Color.green(0), false, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 3, (ViewConfiguration.getTapTimeout() >> 16) + 94).intern()) ? (char) 14 : (char) 19) == 19) {
                    b10 = -1;
                } else {
                    b10 = 31;
                }
                break;
            case -1305374924:
                if ((str.equals(m1453("\u0003\u0011\r\u000b\u0003ￌ\u0011\u0002\tￌ\u000e\u0013\u0000\n\u0007\u0011\u0006\u0003\u0010ￌ\u000b\uffff\f\uffff\u0005\u0003\u0002ￌ\ufff1\uffdf￫\uffff\f\uffff\u0005\u0003\u0002\uffdf\u0002\uffdf\u0001\u0012\u0007\u0014\u0007\u0012\u0017\u0012\u0014ￌ\u0011\u0013\u000e\u0003\u0010\uffff\u0015", 56 - MotionEvent.axisFromString(""), false, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 47, KeyEvent.getDeadChar(0, 0) + 103).intern()) ? 'D' : '\t') == '\t') {
                    b10 = -1;
                } else {
                    b10 = 19;
                }
                break;
            case -1292741795:
                if ((str.equals(m1453("\u0005\ufff3\b\ufff3\u0005\u0006\ufff3\u0016", (ViewConfiguration.getScrollDefaultDelay() >> 16) + 8, false, 8 - TextUtils.indexOf("", ""), TextUtils.getOffsetAfter("", 0) + 83).intern()) ? 'a' : (char) 28) == 'a') {
                    b10 = 25;
                } else {
                    b10 = -1;
                }
                break;
            case -1246480821:
                if (str.equals(m1453("\uffef\u0002�\ufffe\b￩\u0005\ufffa\u0012\ufffe\u000bￚ￼\r\u0002\u000f\u0002\r\u0012", 18 - TextUtils.indexOf((CharSequence) "", '0'), false, 18 - ExpandableListView.getPackedPositionChild(0L), 107 - TextUtils.lastIndexOf("", '0')).intern())) {
                    b10 = 13;
                } else {
                    b10 = -1;
                }
                break;
            case -983382056:
                if (!str.equals(m1454("\u0002\u0003\u0004\u0005\u0000\u000b\b\t\n\u0003\u000b\u0010\u0002\u0011\u0010\u0007\u0001\u000b\n\u0001Á", 21 - Drawable.resolveOpacity(0, 0), (byte) (79 - Color.blue(0))).intern())) {
                    b10 = -1;
                } else {
                    b10 = 15;
                }
                break;
            case -926853969:
                if (!str.equals(m1454("\u0010\u0011\u001c\u0003\u0010\u0018\u0002\u0011\u0010\u0000", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 9, (byte) (84 - ExpandableListView.getPackedPositionGroup(0L))).intern())) {
                    b10 = -1;
                } else {
                    int i10 = f1245 + 7;
                    f1249 = i10 % 128;
                    int i11 = i10 % 2;
                    b10 = 32;
                }
                break;
            case -877887884:
                if (!(str.equals(m1453("\u0003\ufff0￣\u0011\uffff\u0003\ufff0\f\uffff\u0006\u0006\t\f\u000e\b\t\uffdd\f\uffff\u0013\ufffb\u0006￪\t\uffff\ufffe", Color.argb(0, 0, 0, 0) + 26, true, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 3, 107 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern()) ? false : true)) {
                    b10 = 9;
                } else {
                    b10 = -1;
                }
                break;
            case -844831949:
                if (!(str.equals(m1453("\u0016\ufffe\t￭\f\u0002\u0001\u0006\ufff3￦\u000f\u0002", (ViewConfiguration.getWindowTouchSlop() >> 8) + 12, true, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 9, KeyEvent.normalizeMetaState(0) + 104).intern()) ? false : true)) {
                    int i12 = f1249 + 63;
                    f1245 = i12 % 128;
                    int i13 = i12 % 2;
                    b10 = 8;
                } else {
                    b10 = -1;
                }
                break;
            case -499959157:
                if (!str.equals(m1454("\u0010\u0011\u0002\f\u0010\u0001\u000b\u001c\u0006\u0014Ã", ((byte) KeyEvent.getModifierMetaStateMask()) + 12, (byte) (94 - TextUtils.indexOf("", "", 0, 0))).intern())) {
                    b10 = -1;
                } else {
                    b10 = 33;
                }
                break;
            case -279114759:
                if (!str.equals(m1453("\u0010�\u0007\u0004\u000e\u0003\u0000\r\uffc9\u0011\u0004\uffff\u0000\n￫\u0007￼\u0014\u0000\r\uffc9\ufff1\u0004\uffff\u0000\n￫\u0007￼\u0014\u0000\rￜ\ufffe\u000f\u0004\u0011\u0004\u000f\u0014\u000f\u0011\uffc9\u000e\u0010\u000b\u0000\r￼\u0012\u0000\u000e\n\b\u0000\uffc9\u000e\uffff\u0006\uffc9\u000b", TextUtils.getCapsMode("", 0, 0) + 61, false, 'X' - AndroidCharacter.getMirror('0'), View.resolveSize(0, 0) + 106).intern())) {
                    b10 = -1;
                } else {
                    b10 = 14;
                }
                break;
            case -258874416:
                if (!str.equals(m1454("\u0010\u0011\u0002\u0003\u0004\u0005\u0004\u0011²", (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 9, (byte) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 77)).intern())) {
                    b10 = -1;
                } else {
                    int i14 = f1245 + 109;
                    f1249 = i14 % 128;
                    int i15 = i14 % 2;
                    b10 = 3;
                }
                break;
            case 2537233:
                if (!str.equals(m1454("\u0010\u0011\u000f\u0004", 3 - ImageFormat.getBitsPerPixel(0), (byte) (View.resolveSize(0, 0) + 15)).intern())) {
                    b10 = -1;
                } else {
                    int i16 = f1249 + 103;
                    f1245 = i16 % 128;
                    int i17 = i16 % 2;
                    b10 = 27;
                }
                break;
            case 102107741:
                if (!str.equals(m1454("\u0010\u0011\u0002\f\u0010\u0001\u0006\u0010\u000e\u0001\u000e\u0001\t\b\u000f\u0004", 16 - TextUtils.indexOf("", "", 0, 0), (byte) (Color.alpha(0) + 87)).intern())) {
                    b10 = -1;
                } else {
                    int i18 = f1249 + 105;
                    f1245 = i18 % 128;
                    int i19 = i18 % 2;
                    b10 = 4;
                }
                break;
            case 347965699:
                if (!str.equals(m1453("\u0007\ufffe\u000b￢\uffef\u0002�\ufffe\b￩\u0005\ufffa\u0012\ufffe\u000bￜ\b\u0007\r\u000b\b\u0005\u0005\ufffe\u000b￥\u0002\f\r\ufffe", 30 - (Process.myPid() >> 22), false, TextUtils.indexOf("", "") + 3, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 108).intern())) {
                    b10 = -1;
                } else {
                    int i20 = f1245 + 33;
                    f1249 = i20 % 128;
                    b10 = i20 % 2 == 0 ? (byte) 12 : (byte) 87;
                }
                break;
            case 511814123:
                if (str.equals(m1453("\b\u0005\ufff9\f\b\u001a\ufff6￤\ufffa", 8 - TextUtils.indexOf((CharSequence) "", '0', 0), false, 6 - Color.green(0), 98 - (KeyEvent.getMaxKeyCode() >> 16)).intern())) {
                    b10 = 23;
                } else {
                    b10 = -1;
                }
                break;
            case 562364207:
                if ((str.equals(m1454("\u0001\u0002\u0003\u0004\u0005\u0000\u0007\b\t\n\n\u0010\u0017\u000b\u000f\u000e\u000b\u0004ÂÂ\n\u0010", 22 - View.MeasureSpec.getMode(0), (byte) (View.combineMeasuredStates(0, 0) + 86)).intern()) ? 'G' : 'M') == 'G') {
                    b10 = 11;
                } else {
                    b10 = -1;
                }
                break;
            case 690451442:
                if (!str.equals(m1453("\u0010\f\u0005\u000e\uffff\uffef�\u0012�￦\u0013\u0001\u0005\ufff2\u0000\uffdd\u000e\u0001\n\u0001\u0010\u000f\u0005￨\u0001\u0003\u0000\u0005\u000e\uffde", 30 - ExpandableListView.getPackedPositionGroup(0L), true, 16 - (Process.myPid() >> 22), 105 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern())) {
                    b10 = -1;
                } else {
                    b10 = 22;
                }
                break;
            case 816054202:
                if (str.equals(m1454("\u0010\u0011\u000f\u0017\r\u000e\u0004\u0017\u0016\u0005\u0019\u0000\u0003\u0005\u0095", 15 - View.getDefaultSize(0, 0), (byte) (30 - ExpandableListView.getPackedPositionGroup(0L))).intern()) ? false : true) {
                    b10 = -1;
                } else {
                    b10 = 20;
                }
                break;
            case 846064660:
                if (!str.equals(m1453("\u0002\n\r\u0014\ufff4￢￥\u0006\u0015", 8 - TextUtils.lastIndexOf("", '0', 0, 0), false, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 4, ((byte) KeyEvent.getModifierMetaStateMask()) + 101).intern())) {
                    b10 = -1;
                } else {
                    int i21 = f1245 + 115;
                    f1249 = i21 % 128;
                    int i22 = i21 % 2;
                    b10 = 30;
                }
                break;
            case 912139882:
                if (!str.equals(m1454("\u0010\u0011\u0004\r\r\u001b\u001c\u0002\u0004\u0003Ï", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 10, (byte) ((KeyEvent.getMaxKeyCode() >> 16) + 110)).intern())) {
                    b10 = -1;
                } else {
                    b10 = 26;
                }
                break;
            case 947295484:
                if (!str.equals(m1453("\u0000\uffde\f\u0002\u0001\u0006\ufff3\uffde\ufff0\u0016\u0011\u0006\u0013\u0006\u0011", 15 - TextUtils.indexOf("", "", 0, 0), true, 10 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0') + 105).intern())) {
                    b10 = -1;
                } else {
                    b10 = 6;
                }
                break;
            case 1067523235:
                if (!str.equals(m1453("\u0013\u0002￠\u0003￠\u0003\u0004\u0006\u0000\r\u0000￬￠\ufff2\u0018\u0013\b\u0015\b", ((Process.getThreadPriority(0) + 20) >> 6) + 19, true, TextUtils.getOffsetAfter("", 0) + 14, (ViewConfiguration.getEdgeSlop() >> 16) + 102).intern())) {
                    b10 = -1;
                } else {
                    int i23 = f1249 + 49;
                    f1245 = i23 % 128;
                    if (i23 % 2 != 0) {
                        b10 = 18;
                    } else {
                        b10 = 11;
                    }
                }
                break;
            case 1179812605:
                if (!str.equals(m1453("ￊ\u0001\t\u000b\u000f\u0001\u0013�\u000e\u0001\f\u0011\u000fￊ\u0012\u0010\u0000\uffdd\b�\u0005\u0010\u0005\u0010\u000f\u000e\u0001\u0010\n￥\uffdd\uffefￊ\u000e\u0001\u0004\u000f\u0005\b\ufffe\u0011\fￊ\u0007\u0000\u000f", ImageFormat.getBitsPerPixel(0) + 47, true, (Process.myTid() >> 22) + 16, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 105).intern())) {
                    b10 = -1;
                } else {
                    b10 = 5;
                }
                break;
            case 1233891357:
                if (!str.equals(m1453("\u0005\u0012￣￡\ufff3\u0005\u0016\t\u0014\u0001", 10 - TextUtils.indexOf("", "", 0, 0), true, TextUtils.getTrimmedLength("") + 5, 101 - ((Process.getThreadPriority(0) + 20) >> 6)).intern())) {
                    b10 = -1;
                } else {
                    int i24 = f1249 + 87;
                    f1245 = i24 % 128;
                    int i25 = i24 % 2;
                    b10 = 28;
                }
                break;
            case 1635726011:
                if (!str.equals(m1454("\u0010\u0011\u0002\u0003\u0004\u0005\u000b\u0017\b\u0001\u0013\u0014", '<' - AndroidCharacter.getMirror('0'), (byte) (KeyEvent.getDeadChar(0, 0) + 117)).intern())) {
                    b10 = -1;
                } else {
                    b10 = 2;
                }
                break;
            case 1852615901:
                if (!str.equals(m1454("\u0010\u0011 \u0006ææ\n\u0010\u000f\u0004", (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 10, (byte) (120 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)))).intern())) {
                    b10 = -1;
                } else {
                    b10 = 34;
                }
                break;
            case 1864912441:
                if (!str.equals(m1453("\ufff0￤\ufff6\u001a\b\f\ufff9\u0007￤\u0007\b\n\u0004\u0011\u0004", View.MeasureSpec.getSize(0) + 15, true, 3 - ExpandableListView.getPackedPositionType(0L), Color.rgb(0, 0, 0) + 16777314).intern())) {
                    b10 = -1;
                } else {
                    b10 = 17;
                }
                break;
            case 1888267954:
                if (!str.equals(m1453("\u0011\ufffe\b\u0005\u000f\u0004\u0001ￊ\uffef\uffdd\ufff2\u0005\u0000\u0001\u000b\uffdd\uffff\u0010\u0005\u0012\u0005\u0010\u0015\u0010\u0012ￊ\u000f\u0011\f\u0001\u000e�\u0013\u0001\u000f\u000b\t\u0001ￊ\u000f\u0000\u0007ￊ\f", 44 - View.MeasureSpec.getSize(0), false, TextUtils.getOffsetAfter("", 0) + 23, TextUtils.indexOf("", "", 0, 0) + 105).intern())) {
                    b10 = -1;
                } else {
                    b10 = 7;
                }
                break;
            case 1968274797:
                if (!str.equals(m1453("\u0013\u0001\u000f\u000b\t\u0001\uffdd\u0000\u000f\uffdd", TextUtils.indexOf((CharSequence) "", '0') + 11, false, 9 - TextUtils.getOffsetBefore("", 0), 105 - KeyEvent.getDeadChar(0, 0)).intern())) {
                    b10 = -1;
                } else {
                    b10 = 0;
                }
                break;
            case 1976248583:
                if (!str.equals(m1454("\u0001\u0002\u0003\u0004\u0005\u0000\u0007\b\t\n\n\u0010\b\u0005\r\u000e\u0002\u0010\n\u0010", TextUtils.getCapsMode("", 0, 0) + 20, (byte) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 108)).intern())) {
                    b10 = -1;
                } else {
                    b10 = 1;
                }
                break;
            case 2044807796:
                if (!str.equals(m1453("\f\u000f\n\ufffe\u0011\ufff0\uffde￠\u000f\u0002\ufffe\u0011\u0006\u0013\u0002￣", TextUtils.lastIndexOf("", '0', 0, 0) + 17, false, 5 - Color.red(0), 104 - Color.red(0)).intern())) {
                    b10 = -1;
                } else {
                    b10 = 29;
                }
                break;
            case 2057982119:
                if (!str.equals(m1453("\u0006\u001a\u0002\r\ufff1\u0003\u0006\ufff8￢\ufff4\u0013", 11 - ExpandableListView.getPackedPositionType(0L), true, 10 - TextUtils.indexOf("", ""), 100 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern())) {
                    b10 = -1;
                } else {
                    b10 = 24;
                }
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
                return AwesomeAds.class;
            case 1:
                return IVideoPlayer.Listener.class;
            case 2:
                return SAVideoClick.class;
            case 3:
                return SAVideoAd.class;
            case 4:
            case 5:
                return SAInterstitialAd.class;
            case 6:
            case 7:
                return SAVideoActivity.class;
            case 8:
                return IVideoPlayer.class;
            case 9:
                return IVideoPlayerControllerView.class;
            case 10:
                return IVideoPlayerControllerView.Listener.class;
            case 11:
                return IVideoPlayerController.class;
            case 12:
                return IVideoPlayerController.Listener.class;
            case 13:
            case 14:
                return VideoPlayerActivity.class;
            case 15:
                return VideoPlayerController.class;
            case 16:
                return AdVideoPlayerControllerView.class;
            case 17:
                return SAManagedAdView.class;
            case 18:
            case 19:
                return SAManagedAdActivity.class;
            case 20:
                return SACustomWebView.class;
            case 21:
                return AdViewJavaScriptBridge.class;
            case 22:
                return AdViewJavaScriptBridge.Listener.class;
            case 23:
                return SAWebView.class;
            case 24:
                return SAWebPlayer.class;
            case 25:
                return SAVASTAd.class;
            case 26:
                int i26 = f1245 + 63;
                f1249 = i26 % 128;
                if (i26 % 2 == 0) {
                    return SAVASTMedia.class;
                }
                throw null;
            case 27:
                return SAAd.class;
            case 28:
                return SACreative.class;
            case 29:
                return SACreativeFormat.class;
            case 30:
                return SADetails.class;
            case 31:
                return SAMedia.class;
            case 32:
                return SAResponse.class;
            case 33:
                return SAInterface.class;
            case 34:
                return SABannerAd.class;
            case 35:
                return SAEvent.class;
            default:
                return null;
        }
    }

    public cc(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m1454(String str, int i10, byte b10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (g.f2129) {
            char[] cArr2 = f1246;
            char c10 = f1248;
            char[] cArr3 = new char[i10];
            if (i10 % 2 != 0) {
                i10--;
                cArr3[i10] = (char) (cArr[i10] - b10);
            }
            if (i10 > 1) {
                g.f2134 = 0;
                while (true) {
                    int i11 = g.f2134;
                    if (i11 >= i10) {
                        break;
                    }
                    g.f2133 = cArr[i11];
                    g.f2131 = cArr[g.f2134 + 1];
                    if (g.f2133 == g.f2131) {
                        cArr3[g.f2134] = (char) (g.f2133 - b10);
                        cArr3[g.f2134 + 1] = (char) (g.f2131 - b10);
                    } else {
                        g.f2132 = g.f2133 / c10;
                        g.f2130 = g.f2133 % c10;
                        g.f2135 = g.f2131 / c10;
                        g.f2128 = g.f2131 % c10;
                        if (g.f2130 == g.f2128) {
                            g.f2132 = ((g.f2132 + c10) - 1) % c10;
                            g.f2135 = ((g.f2135 + c10) - 1) % c10;
                            int i12 = (g.f2132 * c10) + g.f2130;
                            int i13 = (g.f2135 * c10) + g.f2128;
                            int i14 = g.f2134;
                            cArr3[i14] = cArr2[i12];
                            cArr3[i14 + 1] = cArr2[i13];
                        } else if (g.f2132 == g.f2135) {
                            g.f2130 = ((g.f2130 + c10) - 1) % c10;
                            g.f2128 = ((g.f2128 + c10) - 1) % c10;
                            int i15 = (g.f2132 * c10) + g.f2130;
                            int i16 = (g.f2135 * c10) + g.f2128;
                            int i17 = g.f2134;
                            cArr3[i17] = cArr2[i15];
                            cArr3[i17 + 1] = cArr2[i16];
                        } else {
                            int i18 = (g.f2132 * c10) + g.f2128;
                            int i19 = (g.f2135 * c10) + g.f2130;
                            int i20 = g.f2134;
                            cArr3[i20] = cArr2[i18];
                            cArr3[i20 + 1] = cArr2[i19];
                        }
                    }
                    g.f2134 += 2;
                }
            }
            str2 = new String(cArr3);
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m1453(String str, int i10, boolean z10, int i11, int i12) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (b.f706) {
            char[] cArr2 = new char[i10];
            b.f704 = 0;
            while (true) {
                int i13 = b.f704;
                if (i13 >= i10) {
                    break;
                }
                b.f705 = cArr[i13];
                cArr2[b.f704] = (char) (b.f705 + i12);
                int i14 = b.f704;
                cArr2[i14] = (char) (cArr2[i14] - f1247);
                b.f704 = i14 + 1;
            }
            if (i11 > 0) {
                b.f707 = i11;
                char[] cArr3 = new char[i10];
                System.arraycopy(cArr2, 0, cArr3, 0, i10);
                int i15 = b.f707;
                System.arraycopy(cArr3, 0, cArr2, i10 - i15, i15);
                int i16 = b.f707;
                System.arraycopy(cArr3, i16, cArr2, 0, i10 - i16);
            }
            if (z10) {
                char[] cArr4 = new char[i10];
                b.f704 = 0;
                while (true) {
                    int i17 = b.f704;
                    if (i17 >= i10) {
                        break;
                    }
                    cArr4[i17] = cArr2[(i10 - i17) - 1];
                    b.f704 = i17 + 1;
                }
                cArr2 = cArr4;
            }
            str2 = new String(cArr2);
        }
        return str2;
    }
}
