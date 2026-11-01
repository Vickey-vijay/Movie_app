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
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.exifinterface.media.ExifInterface;
import com.tapjoy.TJActionRequest;
import com.tapjoy.TJAdUnit;
import com.tapjoy.TJAdUnitActivity;
import com.tapjoy.TJAdUnitJSBridge;
import com.tapjoy.TJAwardCurrencyListener;
import com.tapjoy.TJContentActivity;
import com.tapjoy.TJCurrency;
import com.tapjoy.TJPlacement;
import com.tapjoy.TJPlacementData;
import com.tapjoy.TJPlacementListener;
import com.tapjoy.TJPlacementVideoListener;
import com.tapjoy.TJSplitWebView;
import com.tapjoy.TJVideoListener;
import com.tapjoy.TJWebView;
import com.tapjoy.Tapjoy;
import com.tapjoy.mraid.view.ActionHandler;
import com.tapjoy.mraid.view.Browser;
import com.tapjoy.mraid.view.MraidView;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class cg extends bd {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f1311 = 1;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f1313 = 0;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f1314 = 219010939;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f1315 = 51;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static short[] f1316 = null;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f1317 = -561393916;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static byte[] f1318 = {5, 11, -13, 13, -11, 17, 34, -51, 11, -5, 25, -15, 35, -9, -10, 5, 11, -13, 13, -11, 17, 34, -51, 6, 9, -15, 6, -1, 44, -7, -10, 13, -7, 8, -10, 13, 25, -38, -1, 6, -11, 17, 34, 13, -7, 8, -10, 13, 25, -38, -1, 6, -11, 17, 34, 19, -73, 18, -4, -13, 72, -54, -5, 8, -17, 5, 63, -75, 10, 5, -6, 15, -19, 70, -63, -2, 12, 13, -14, -4, 8, -3, 48, 13, -14, -4, 8, -3, 48, 20, -73, 18, -4, -13, 72, -54, -5, 8, -17, 5, 63, -75, 10, 5, -6, 15, -19, 70, -63, -2, 12, 18, -4, 19, -14, -5, 8, -17, 37, 18, -4, 19, -12, -3, 14, 13, -10, 13, -9, 9, -15, 1, 10, 29, -35, 10, 1, -5, 19, 12, -10, 13, -9, 9, -15, 1, 10, 29, -43, 18, -4, 19, -12, -3, 14, -29, 11, -5, 25, -15, 35, -9, -10, 13, -9, 9, -15, 1, 10, 29, -35, 10, 1, -5, 19, -30, 11, -5, 25, -15, 35, -9, -10, 13, -9, 9, -15, 1, 10, 29, -35, 10, 1, -5, 19, -30, 6, 9, -8, 8, 2, 2, -11, 28, 6, -10, -2, 3, -5, -9, 48, -17, 9, -42, 11, -5, 25, -15, 35, -9, -10, 22, -11, 9, -13, 0, -3, 50, -7, -10, 6, 9, -8, 8, 2, 2, -11, 28, 6, -10, 18, -4, 19, -12, -3, 14, -29, 11, -3, -4, 29, 9, -10, -8, 12, 19, -38, 6, 9, -8, 8, 2, 2, -11, 28, -36, 15, -2, 13, -9, 9, -15, 1, 10, 29, -40, 15, -2, 13, -9, 9, -15, 1, 10, 29, -35, 10, 1, -5, 19, -30, 15, -2, -6, 29, ExifInterface.MARKER_APP1, 1, 18, 21, -40, 15, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int[] f1312 = {-1432428120, 1280577410, -107498678, 997033691, -930604812, -1387762407, -736079987, 282835398, -325445394, -224666713, -614510409, -1510484538, -879457680, 250479336, -2004751562, -44591585, 1884384770, -1870984509};

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ String m1530(TJSplitWebView tJSplitWebView) {
        int i10 = f1313 + 85;
        f1311 = i10 % 128;
        boolean z10 = i10 % 2 == 0;
        String strM1536 = m1536(tJSplitWebView);
        if (z10) {
            int i11 = 21 / 0;
        }
        return strM1536;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ TJPlacementVideoListener m1534(TJPlacement tJPlacement) {
        int i10 = f1311 + 29;
        f1313 = i10 % 128;
        int i11 = i10 % 2;
        TJPlacementVideoListener tJPlacementVideoListenerM1526 = m1526(tJPlacement);
        int i12 = f1311 + 1;
        f1313 = i12 % 128;
        if ((i12 % 2 != 0 ? (char) 22 : '\n') == '\n') {
            return tJPlacementVideoListenerM1526;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ String m1537(TJPlacement tJPlacement) {
        int i10 = f1313 + 111;
        f1311 = i10 % 128;
        int i11 = i10 % 2;
        String strM1528 = m1528(tJPlacement);
        int i12 = f1311 + 47;
        f1313 = i12 % 128;
        int i13 = i12 % 2;
        return strM1528;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ TJPlacementListener m1540(TJPlacement tJPlacement) {
        int i10 = f1311 + 107;
        f1313 = i10 % 128;
        int i11 = i10 % 2;
        TJPlacementListener tJPlacementListenerM1532 = m1532(tJPlacement);
        int i12 = f1311 + 51;
        f1313 = i12 % 128;
        if (i12 % 2 == 0) {
            return tJPlacementListenerM1532;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻛ */
    public final String mo737() {
        String version;
        int i10 = f1311 + 51;
        f1313 = i10 % 128;
        if (i10 % 2 == 0) {
            version = Tapjoy.getVersion();
        } else {
            version = Tapjoy.getVersion();
            int i11 = 58 / 0;
        }
        int i12 = f1311 + 1;
        f1313 = i12 % 128;
        if ((i12 % 2 != 0 ? '(' : (char) 26) == 26) {
            return version;
        }
        int i13 = 80 / 0;
        return version;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static TJPlacementVideoListener m1526(TJPlacement tJPlacement) {
        int i10 = f1313 + 57;
        f1311 = i10 % 128;
        boolean z10 = i10 % 2 != 0;
        TJPlacementVideoListener videoListener = tJPlacement.getVideoListener();
        if (!z10) {
            int i11 = 31 / 0;
        }
        int i12 = f1311 + 37;
        f1313 = i12 % 128;
        int i13 = i12 % 2;
        return videoListener;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static String m1527(TJPlacementData tJPlacementData) {
        int i10 = f1311 + 21;
        f1313 = i10 % 128;
        int i11 = i10 % 2;
        String httpResponse = tJPlacementData.getHttpResponse();
        int i12 = f1313 + 41;
        f1311 = i12 % 128;
        if (!(i12 % 2 == 0)) {
            return httpResponse;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ void m1531(TJPlacement tJPlacement, TJPlacementVideoListener tJPlacementVideoListener) {
        int i10 = f1311 + 111;
        f1313 = i10 % 128;
        int i11 = i10 % 2;
        m1539(tJPlacement, tJPlacementVideoListener);
        int i12 = f1311 + 61;
        f1313 = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m1533(TJPlacementData tJPlacementData) {
        int i10 = f1313 + 121;
        f1311 = i10 % 128;
        int i11 = i10 % 2;
        String placementName = tJPlacementData.getPlacementName();
        int i12 = f1311 + 37;
        f1313 = i12 % 128;
        if ((i12 % 2 != 0 ? '+' : ')') != '+') {
            return placementName;
        }
        int i13 = 14 / 0;
        return placementName;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ String m1535(TJPlacementData tJPlacementData) {
        int i10 = f1313 + 97;
        f1311 = i10 % 128;
        boolean z10 = i10 % 2 != 0;
        String strM1533 = m1533(tJPlacementData);
        if (!z10) {
            int i11 = 4 / 0;
        }
        return strM1533;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ String m1538(TJPlacementData tJPlacementData) {
        int i10 = f1313 + 25;
        f1311 = i10 % 128;
        int i11 = i10 % 2;
        String strM1529 = m1529(tJPlacementData);
        int i12 = f1311 + 53;
        f1313 = i12 % 128;
        if ((i12 % 2 != 0 ? '>' : '!') != '>') {
            return strM1529;
        }
        int i13 = 19 / 0;
        return strM1529;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ String m1542(TJPlacementData tJPlacementData) {
        int i10 = f1311 + 65;
        f1313 = i10 % 128;
        if ((i10 % 2 != 0 ? 'b' : 'M') == 'b') {
            m1527(tJPlacementData);
            throw null;
        }
        String strM1527 = m1527(tJPlacementData);
        int i11 = f1313 + 47;
        f1311 = i11 % 128;
        int i12 = i11 % 2;
        return strM1527;
    }

    public cg(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static TJPlacementListener m1532(TJPlacement tJPlacement) {
        int i10 = f1313 + 95;
        f1311 = i10 % 128;
        int i11 = i10 % 2;
        TJPlacementListener listener = tJPlacement.getListener();
        int i12 = f1313 + 69;
        f1311 = i12 % 128;
        int i13 = i12 % 2;
        return listener;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m1536(TJSplitWebView tJSplitWebView) {
        int i10 = f1311 + 7;
        f1313 = i10 % 128;
        int i11 = i10 % 2;
        String lastUrl = tJSplitWebView.getLastUrl();
        int i12 = f1311 + 103;
        f1313 = i12 % 128;
        if (!(i12 % 2 != 0)) {
            return lastUrl;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static void m1539(TJPlacement tJPlacement, TJPlacementVideoListener tJPlacementVideoListener) {
        int i10 = f1313 + 73;
        f1311 = i10 % 128;
        boolean z10 = i10 % 2 != 0;
        tJPlacement.setVideoListener(tJPlacementVideoListener);
        if (z10) {
        } else {
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻐ */
    public final Map<String, bd.b> mo736() {
        HashMap map = new HashMap();
        map.put(m1541((ViewConfiguration.getEdgeSlop() >> 16) - 219010686, (short) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 561394018 - ImageFormat.getBitsPerPixel(0), (byte) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), (-35) - Color.alpha(0)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cg.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return cg.m1535((TJPlacementData) list.get(0));
            }
        });
        map.put(m1543(new int[]{-1958801393, 1536172740, -1552717910, -419449448}, TextUtils.indexOf("", "", 0) + 6).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cg.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return cg.m1538((TJPlacementData) list.get(0));
            }
        });
        map.put(m1543(new int[]{347814129, 1202057100, 1999056273, 1158179549, -1225331947, 429344231, 1204208215, -1379957247}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 15).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cg.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return cg.m1542((TJPlacementData) list.get(0));
            }
        });
        map.put(m1543(new int[]{592326598, -1191627709, 961209126, 2091488041}, 7 - (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cg.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return cg.m1537((TJPlacement) list.get(0));
            }
        });
        map.put(m1541((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 219010671, (short) View.combineMeasuredStates(0, 0), 561394019 - View.resolveSizeAndState(0, 0, 0), (byte) (ViewConfiguration.getEdgeSlop() >> 16), Color.red(0) - 40).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cg.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return cg.m1540((TJPlacement) list.get(0));
            }
        });
        map.put(m1541((-219010661) - (ViewConfiguration.getDoubleTapTimeout() >> 16), (short) TextUtils.getCapsMode("", 0, 0), 561394019 - KeyEvent.getDeadChar(0, 0), (byte) KeyEvent.getDeadChar(0, 0), (-35) - (ViewConfiguration.getFadingEdgeLength() >> 16)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cg.6
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return cg.m1534((TJPlacement) list.get(0));
            }
        });
        map.put(m1543(new int[]{396982242, 1913312082, -2005820419, 1074999625, 1079795563, 14035280, 2007860748, -41227398}, Color.green(0) + 16).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cg.8
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                cg.m1531((TJPlacement) list.get(0), (TJPlacementVideoListener) list.get(1));
                return null;
            }
        });
        map.put(m1541((-219010646) - TextUtils.indexOf("", ""), (short) (ViewConfiguration.getMaximumFlingVelocity() >> 16), (ViewConfiguration.getFadingEdgeLength() >> 16) + 561394019, (byte) ((-1) - TextUtils.lastIndexOf("", '0')), (-41) - KeyEvent.normalizeMetaState(0)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cg.10
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return cg.m1530((TJSplitWebView) list.get(0));
            }
        });
        int i10 = f1311 + 3;
        f1313 = i10 % 128;
        if ((i10 % 2 != 0 ? 'N' : '4') != 'N') {
            return map;
        }
        int i11 = 36 / 0;
        return map;
    }

    /* JADX WARN: Code duplicated, block: B:66:0x02f2  */
    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo738(String str) {
        byte b10 = 8;
        switch (str.hashCode()) {
            case -1983375197:
                if (!str.equals(m1543(new int[]{1788367662, -1299168844, -788196562, -1464319892, 528845518, 2049895542, -155100609, -505625664}, TextUtils.getTrimmedLength("") + 15).intern())) {
                    b10 = -1;
                } else {
                    int i10 = f1313 + 41;
                    int i11 = i10 % 128;
                    f1311 = i11;
                    int i12 = i10 % 2;
                    b10 = 22;
                    int i13 = i11 + 115;
                    f1313 = i13 % 128;
                    int i14 = i13 % 2;
                }
                break;
            case -1687314074:
                if (!(str.equals(m1541((-219010856) - TextUtils.getOffsetBefore("", 0), (short) TextUtils.getTrimmedLength(""), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 561394015, (byte) TextUtils.getOffsetAfter("", 0), TextUtils.getCapsMode("", 0, 0) + (-22)).intern()))) {
                    b10 = -1;
                }
                break;
            case -1640254126:
                b10 = !str.equals(m1541((-219010923) - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (short) ((Process.getThreadPriority(0) + 20) >> 6), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 561394000, (byte) (Color.rgb(0, 0, 0) + 16777216), (-34) - (Process.myPid() >> 22)).intern()) ? (byte) -1 : (byte) 2;
                break;
            case -1628534628:
                b10 = !str.equals(m1541(((byte) KeyEvent.getModifierMetaStateMask()) - 219010827, (short) (ViewConfiguration.getTapTimeout() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 561393994, (byte) Drawable.resolveOpacity(0, 0), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 42).intern()) ? (byte) -1 : (byte) 9;
                break;
            case -1429063965:
                b10 = !str.equals(m1543(new int[]{-206982780, -632257139, -666213558, -1173764065, 801065348, -2130148971, 1182828160, -1660557119, -389269465, 323016548}, 19 - View.resolveSizeAndState(0, 0, 0)).intern()) ? (byte) -1 : (byte) 14;
                break;
            case -1414965228:
                if (!str.equals(m1541((ViewConfiguration.getDoubleTapTimeout() >> 16) - 219010908, (short) KeyEvent.normalizeMetaState(0), 561393981 - (ViewConfiguration.getTouchSlop() >> 8), (byte) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (-37) - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern())) {
                    b10 = -1;
                } else {
                    int i15 = f1313 + 63;
                    f1311 = i15 % 128;
                    int i16 = i15 % 2;
                    b10 = 5;
                }
                break;
            case -1147119309:
                b10 = (str.equals(m1543(new int[]{-56785816, -1218459786, 544439972, -1696898233, -12955130, -1193373915, -1828364432, 229228495, -343348292, -1296461557}, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 19).intern()) ? (char) 23 : 'E') == 'E' ? (byte) -1 : (byte) 12;
                break;
            case -872754855:
                b10 = !str.equals(m1543(new int[]{-206982780, -632257139, -666213558, -1173764065, 210164872, -1432440980, -243783422, -229988849}, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 14).intern()) ? (byte) -1 : (byte) 4;
                break;
            case -721136035:
                if ((str.equals(m1543(new int[]{1810479381, -1275159330, -157800169, 376916260}, View.combineMeasuredStates(0, 0) + 8).intern()) ? ',' : '\t') == '\t') {
                    b10 = -1;
                } else {
                    int i17 = f1313 + 25;
                    f1311 = i17 % 128;
                    int i18 = i17 % 2;
                    b10 = 13;
                }
                break;
            case -668579974:
                b10 = !str.equals(m1543(new int[]{-56785816, -1218459786, 544439972, -1696898233, 103524388, 692000299, 816474087, 114321682, 78258145, -135697376, 240419135, 463935147, 394975259, 960260976, -2051997848, 476093109}, 31 - Color.green(0)).intern()) ? (byte) -1 : (byte) 10;
                break;
            case -593336436:
                b10 = !str.equals(m1543(new int[]{-1963823852, -1634401655, -1807582337, 118756431, -1575206227, -486302986, 2093273251, 1108042160, 1182828160, -1660557119, -389269465, 323016548}, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 24).intern()) ? (byte) -1 : (byte) 23;
                break;
            case -217417742:
                b10 = (str.equals(m1541((ViewConfiguration.getMinimumFlingVelocity() >> 16) + (-219010896), (short) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), View.MeasureSpec.makeMeasureSpec(0, 0) + 561394015, (byte) (ViewConfiguration.getScrollBarFadeDuration() >> 16), (ViewConfiguration.getKeyRepeatDelay() >> 16) + (-16)).intern()) ? '^' : (char) 11) == '^' ? (byte) 6 : (byte) -1;
                break;
            case 178410181:
                b10 = (str.equals(m1543(new int[]{-56785816, -1218459786, 544439972, -1696898233, -12955130, -1193373915, -1529565126, 463628453, 41622465, 193175627, -1373202361, 1080736451, 695758261, 707893382}, 25 - (ViewConfiguration.getFadingEdgeLength() >> 16)).intern()) ? 'a' : '$') == '$' ? (byte) -1 : (byte) 25;
                break;
            case 206635148:
                if (str.equals(m1541((-219010939) - TextUtils.getOffsetAfter("", 0), (short) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + (-1)), 544616784 - Color.rgb(0, 0, 0), (byte) (ViewConfiguration.getPressedStateDuration() >> 16), (-36) - ImageFormat.getBitsPerPixel(0)).intern())) {
                    b10 = 0;
                } else {
                    b10 = -1;
                }
                break;
            case 268330895:
                b10 = !str.equals(m1541(TextUtils.getOffsetAfter("", 0) - 219010733, (short) (ViewConfiguration.getPressedStateDuration() >> 16), ((Process.getThreadPriority(0) + 20) >> 6) + 561394000, (byte) (ViewConfiguration.getMaximumFlingVelocity() >> 16), View.combineMeasuredStates(0, 0) - 35).intern()) ? (byte) -1 : (byte) 19;
                break;
            case 327820672:
                b10 = !str.equals(m1541(Color.alpha(0) - 219010756, (short) KeyEvent.keyCodeFromString(""), (ViewConfiguration.getEdgeSlop() >> 16) + 561394000, (byte) View.resolveSize(0, 0), TextUtils.indexOf((CharSequence) "", '0', 0) - 26).intern()) ? (byte) -1 : (byte) 18;
                break;
            case 705136807:
                b10 = (str.equals(m1541((ViewConfiguration.getPressedStateDuration() >> 16) + (-219010718), (short) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 561394000 - View.combineMeasuredStates(0, 0), (byte) TextUtils.getTrimmedLength(""), (ViewConfiguration.getTouchSlop() >> 8) + (-41)).intern()) ? 'R' : (char) 16) == 16 ? (byte) -1 : (byte) 20;
                break;
            case 741045788:
                if ((str.equals(m1543(new int[]{-56785816, -1218459786, 544439972, -1696898233, -12955130, -1193373915, 1674312284, -1938627361, 1568932603, -210915843, 316262254, -1900537058, 148088002, 1876152003}, (ViewConfiguration.getWindowTouchSlop() >> 8) + 27).intern()) ? (char) 29 : (char) 14) == 14) {
                    b10 = -1;
                } else {
                    int i19 = f1313 + 29;
                    f1311 = i19 % 128;
                    if (i19 % 2 != 0) {
                        b10 = 1;
                    } else {
                        b10 = 0;
                    }
                }
                break;
            case 832039888:
                if (!str.equals(m1541((ViewConfiguration.getDoubleTapTimeout() >> 16) - 219010798, (short) View.resolveSize(0, 0), 561394000 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (byte) TextUtils.getCapsMode("", 0, 0), View.getDefaultSize(0, 0) - 28).intern())) {
                    b10 = -1;
                } else {
                    int i20 = f1311 + 125;
                    f1313 = i20 % 128;
                    b10 = i20 % 2 == 0 ? (byte) 16 : (byte) 78;
                }
                break;
            case 906946425:
                if ((str.equals(m1541((ViewConfiguration.getScrollBarSize() >> 8) + (-219010812), (short) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), AndroidCharacter.getMirror('0') + 12576, (byte) (ViewConfiguration.getKeyRepeatDelay() >> 16), TextUtils.lastIndexOf("", '0', 0) + (-35)).intern()) ? 'X' : (char) 31) == 31) {
                    b10 = -1;
                } else {
                    int i21 = f1313 + 33;
                    f1311 = i21 % 128;
                    int i22 = i21 % 2;
                    b10 = 15;
                }
                break;
            case 1317517621:
                b10 = (str.equals(m1541(ExpandableListView.getPackedPositionGroup(0L) + (-219010699), (short) View.MeasureSpec.makeMeasureSpec(0, 0), 561394001 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (byte) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + (-1)), TextUtils.indexOf("", "", 0) + (-37)).intern()) ? (char) 11 : 'C') == 'C' ? (byte) -1 : (byte) 24;
                break;
            case 1504750787:
                b10 = !str.equals(m1541((ViewConfiguration.getJumpTapTimeout() >> 16) - 219010820, (short) Drawable.resolveOpacity(0, 0), 561394000 - ExpandableListView.getPackedPositionGroup(0L), (byte) ExpandableListView.getPackedPositionGroup(0L), (-42) - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern()) ? (byte) -1 : (byte) 11;
                break;
            case 1519750415:
                if (!str.equals(m1541((-219010709) - Drawable.resolveOpacity(0, 0), (short) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 561394000, (byte) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), Color.rgb(0, 0, 0) + 16777176).intern())) {
                    b10 = -1;
                } else {
                    b10 = 21;
                    int i23 = f1311 + 111;
                    f1313 = i23 % 128;
                    int i24 = i23 % 2;
                }
                break;
            case 1815593736:
                b10 = !str.equals(m1541(TextUtils.indexOf("", "", 0) - 219010862, (short) ExpandableListView.getPackedPositionGroup(0L), 561393982 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (byte) (ViewConfiguration.getPressedStateDuration() >> 16), View.MeasureSpec.makeMeasureSpec(0, 0) - 44).intern()) ? (byte) -1 : (byte) 7;
                break;
            case 1891461874:
                b10 = !str.equals(m1541((ViewConfiguration.getEdgeSlop() >> 16) - 219010776, (short) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), KeyEvent.getDeadChar(0, 0) + 561394000, (byte) TextUtils.getCapsMode("", 0, 0), (-30) - Color.green(0)).intern()) ? (byte) -1 : (byte) 17;
                break;
            case 2041573826:
                b10 = !str.equals(m1543(new int[]{-56785816, -1218459786, 544439972, -1696898233, -12955130, -1193373915, 885133594, 1926772243, -1750476415, 1443389586, -2031916610, 380127639, 1479387215, -1639237244}, 28 - ((Process.getThreadPriority(0) + 20) >> 6)).intern()) ? (byte) -1 : (byte) 3;
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
            case 1:
                return TJAdUnitActivity.class;
            case 2:
            case 3:
                return TJContentActivity.class;
            case 4:
                return TJPlacementData.class;
            case 5:
            case 6:
                return ActionHandler.class;
            case 7:
            case 8:
                return Browser.class;
            case 9:
            case 10:
                return MraidView.class;
            case 11:
            case 12:
                return TJWebView.class;
            case 13:
                return TJAdUnit.class;
            case 14:
                return TJPlacementListener.class;
            case 15:
                return TJVideoListener.class;
            case 16:
                return TJAdUnit.TJAdUnitWebViewListener.class;
            case 17:
                return TJAdUnit.TJAdUnitVideoListener.class;
            case 18:
                return TJPlacementVideoListener.class;
            case 19:
                return TJAdUnitJSBridge.class;
            case 20:
                return TJCurrency.class;
            case 21:
                return TJPlacement.class;
            case 22:
                return TJActionRequest.class;
            case 23:
                return TJAwardCurrencyListener.class;
            case 24:
            case 25:
                return TJSplitWebView.class;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m1529(TJPlacementData tJPlacementData) {
        int i10 = f1313 + 115;
        f1311 = i10 % 128;
        int i11 = i10 % 2;
        String url = tJPlacementData.getUrl();
        int i12 = f1311 + 9;
        f1313 = i12 % 128;
        if (!(i12 % 2 != 0)) {
            return url;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m1528(TJPlacement tJPlacement) {
        int i10 = f1313 + 93;
        f1311 = i10 % 128;
        int i11 = i10 % 2;
        String name = tJPlacement.getName();
        int i12 = f1311 + 17;
        f1313 = i12 % 128;
        int i13 = i12 % 2;
        return name;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m1541(int i10, short s10, int i11, byte b10, int i12) {
        String string;
        synchronized (o.f2993) {
            StringBuilder sb2 = new StringBuilder();
            int i13 = f1315;
            int i14 = i12 + i13;
            boolean z10 = i14 == -1;
            if (z10) {
                byte[] bArr = f1318;
                if (bArr != null) {
                    i14 = (byte) (bArr[f1314 + i10] + i13);
                } else {
                    i14 = (short) (f1316[f1314 + i10] + i13);
                }
            }
            if (i14 > 0) {
                o.f2994 = ((i10 + i14) - 2) + f1314 + (z10 ? 1 : 0);
                o.f2995 = b10;
                char c10 = (char) (i11 + f1317);
                o.f2997 = c10;
                sb2.append(c10);
                o.f2996 = o.f2997;
                o.f2998 = 1;
                while (o.f2998 < i14) {
                    byte[] bArr2 = f1318;
                    if (bArr2 != null) {
                        int i15 = o.f2994;
                        o.f2994 = i15 - 1;
                        o.f2997 = (char) (o.f2996 + (((byte) (bArr2[i15] + s10)) ^ o.f2995));
                    } else {
                        short[] sArr = f1316;
                        int i16 = o.f2994;
                        o.f2994 = i16 - 1;
                        o.f2997 = (char) (o.f2996 + (((short) (sArr[i16] + s10)) ^ o.f2995));
                    }
                    sb2.append(o.f2997);
                    o.f2996 = o.f2997;
                    o.f2998++;
                }
            }
            string = sb2.toString();
        }
        return string;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m1543(int[] iArr, int i10) {
        String str;
        synchronized (e.f1912) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f1312.clone();
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
}
