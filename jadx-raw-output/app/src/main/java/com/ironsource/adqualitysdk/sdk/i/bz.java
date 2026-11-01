package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.ViewCompat;
import com.my.target.ads.BaseInterstitialAd;
import com.my.target.ads.InterstitialAd;
import com.my.target.ads.MyTargetView;
import com.my.target.ads.Reward;
import com.my.target.ads.RewardedAd;
import com.my.target.common.BaseAd;
import com.my.target.common.CustomParams;
import com.my.target.common.MyTargetActivity;
import com.my.target.common.MyTargetConfig;
import com.my.target.common.MyTargetManager;
import com.my.target.common.MyTargetVersion;
import com.my.target.common.models.AudioData;
import com.my.target.common.models.ImageData;
import com.my.target.common.models.VideoData;
import com.vungle.ads.internal.protos.Sdk;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class bz extends bd {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f1181 = 0;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f1182 = 1;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static short[] f1183 = null;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f1184 = 291822268;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static byte[] f1185 = {-55, -64, 8, 49, -50, 47, -54, 8, 1, -9, 8, -2, -53, -2, 3, -8, -1, 44, -49, 15, -2, -11, 17, 13, -37, 44, -52, -1, 6, -10, 1, 13, 15, -30, 15, -2, -11, 17, 13, -37, 44, -51, 5, 11, -13, 13, -11, 17, 34, -51, 15, -2, -11, 17, 13, -37, 44, -30, 5, 11, -13, 13, -11, 17, 34, -51, 15, -2, -11, 17, 13, -37, 44, 31, -64, -1, 2, 0, -2, 12, 53, -70, 15, -2, -11, 17, -19, 70, -75, 12, 63, -63, -2, 12, -58, -19, 19, 29, -43, 10, 1, -5, 19, -58, -19, 19, 29, -43, 6, 5, -17, 52, -49, 35, -43, 11, -8, -11, 11, -11, 1, 1, 13, -15, 6, 37, -28, -14, 18, 31, -53, 35, -43, 11, -8, -11, 11, -11, 1, 1, 13, -15, 6, 37, -57, 35, -35, -1, 1, -14, 17, -22, 18, 19, -49, 13, -9, 9, -15, 1, 10, 29, -24, 35, -35, -1, 1, -14, 17, -22, 18, 19, -55, 18, -4, 19, -30, 15, -2, -11, 17, 13, -37, 44, -61, -21, 17, 22, -17, 35, -47, 13, -9, 9, -15, 1, 10, 29, -43, 18, -4, 19, -30, 15, -2, -11, 17, 13, -37, 44};

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f1186 = 29;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f1187 = -279939345;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1188 = 67;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ String m1364(Reward reward) {
        int i10 = f1181 + 25;
        f1182 = i10 % 128;
        if (!(i10 % 2 == 0)) {
            return m1362(reward);
        }
        m1362(reward);
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻐ */
    public final Map<String, bd.b> mo736() {
        HashMap map = new HashMap();
        map.put(m1363("￫\r\ufffe\u0000\ufffe\t\u0012￭�\u000b\ufffa\u0010\ufffe", 13 - (Process.myPid() >> 22), true, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 4, 132 - (ViewConfiguration.getTapTimeout() >> 16)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bz.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return bz.m1364((Reward) list.get(0));
            }
        });
        int i10 = f1181 + 125;
        f1182 = i10 % 128;
        int i11 = i10 % 2;
        return map;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m1362(Reward reward) {
        int i10 = f1181 + 99;
        f1182 = i10 % 128;
        char c10 = i10 % 2 == 0 ? '!' : '\'';
        String str = reward.type;
        if (c10 == '!') {
            throw null;
        }
        int i11 = f1181 + 85;
        f1182 = i11 % 128;
        if (!(i11 % 2 == 0)) {
            return str;
        }
        int i12 = 51 / 0;
        return str;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m1363(String str, int i10, boolean z10, int i11, int i12) {
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
                cArr2[i14] = (char) (cArr2[i14] - f1186);
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

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻛ */
    public final String mo737() {
        int i10 = f1182 + 5;
        f1181 = i10 % 128;
        int i11 = i10 % 2;
        try {
            try {
                String str = (String) MyTargetVersion.class.getDeclaredField(m1363("\b\u0000\u0001\ufffb\u0005\u0004\ufff7", 7 - Color.blue(0), true, View.getDefaultSize(0, 0) + 1, 107 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern()).get(null);
                int i12 = f1181 + 81;
                f1182 = i12 % 128;
                int i13 = i12 % 2;
                return str;
            } catch (Exception unused) {
                return null;
            }
        } catch (Exception unused2) {
            return hu.m2349().m2351().m2451(MyTargetVersion.class, m1361(Gravity.getAbsoluteGravity(0, 0) + 279939345, (short) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 291822175, (byte) ((-1) - MotionEvent.axisFromString("")), View.MeasureSpec.getSize(0) - 68).intern());
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x01e3  */
    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo738(String str) {
        int i10 = f1182 + 113;
        f1181 = i10 % 128;
        int i11 = i10 % 2;
        byte b10 = 14;
        switch (str.hashCode()) {
            case -2103294848:
                if (!(!str.equals(m1361((ViewConfiguration.getDoubleTapTimeout() >> 16) + 279939448, (short) (ViewConfiguration.getJumpTapTimeout() >> 16), (-291822203) - Color.green(0), (byte) TextUtils.getCapsMode("", 0, 0), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + (-69)).intern()))) {
                    int i12 = f1181 + 51;
                    f1182 = i12 % 128;
                    b10 = i12 % 2 != 0 ? (byte) 9 : (byte) 118;
                } else {
                    b10 = -1;
                }
                break;
            case -1850459313:
                b10 = !str.equals(m1363("\ufffe￬\uffff\u0011\ufffb\f", 6 - Gravity.getAbsoluteGravity(0, 0), false, 1 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 131 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern()) ? (byte) -1 : (byte) 13;
                break;
            case -1766129765:
                b10 = !str.equals(m1361(279939372 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (short) KeyEvent.keyCodeFromString(""), (-291822191) - (ViewConfiguration.getScrollBarSize() >> 8), (byte) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0)), View.combineMeasuredStates(0, 0) - 68).intern()) ? (byte) -1 : (byte) 2;
                break;
            case -1282477456:
                b10 = !str.equals(m1363("\u0015\ufff0�\u000e\u0003\u0001\u0010￩�\n�\u0003\u0001\u000e￩", 15 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), false, 14 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 129).intern()) ? (byte) -1 : (byte) 1;
                break;
            case -958537051:
                b10 = !str.equals(m1361(279939439 - Gravity.getAbsoluteGravity(0, 0), (short) (Process.myTid() >> 22), (ViewConfiguration.getWindowTouchSlop() >> 8) - 291822182, (byte) TextUtils.getCapsMode("", 0, 0), (KeyEvent.getMaxKeyCode() >> 16) - 68).intern()) ? (byte) -1 : (byte) 7;
                break;
            case -609786639:
                if (!str.equals(m1361((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 279939488, (short) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), (Process.myPid() >> 22) - 291822186, (byte) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (-68) - Color.green(0)).intern())) {
                    b10 = -1;
                }
                break;
            case -498709917:
                if ((str.equals(m1363("\ufffe\u0007\ufffe\r\f\u0002￥�ￚ\u0005\ufffa\u0002\r\u0002\r\f\u000b\ufffe\r\u0007￢\u000b", 22 - (ViewConfiguration.getEdgeSlop() >> 16), true, AndroidCharacter.getMirror('0') + 65509, 132 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern()) ? '^' : 'F') == '^') {
                    int i13 = f1182 + 59;
                    f1181 = i13 % 128;
                    int i14 = i13 % 2;
                    b10 = 12;
                } else {
                    b10 = -1;
                }
                break;
            case -393802555:
                if (!str.equals(m1361(279939498 - Process.getGidForName(""), (short) ExpandableListView.getPackedPositionGroup(0L), (-291822186) - TextUtils.getTrimmedLength(""), (byte) (ViewConfiguration.getTouchSlop() >> 8), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 68).intern())) {
                    b10 = -1;
                } else {
                    int i15 = f1182 + 67;
                    f1181 = i15 % 128;
                    b10 = i15 % 2 == 0 ? (byte) 15 : (byte) 56;
                }
                break;
            case 65555862:
                b10 = !str.equals(m1361(((byte) KeyEvent.getModifierMetaStateMask()) + 279939536, (short) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 291822192, (byte) (ViewConfiguration.getDoubleTapTimeout() >> 16), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) - 67).intern()) ? (byte) -1 : (byte) 19;
                break;
            case 320151695:
                if (!str.equals(m1361(279939475 - TextUtils.getOffsetAfter("", 0), (short) TextUtils.getTrimmedLength(""), Color.rgb(0, 0, 0) - 275044979, (byte) ((Process.getThreadPriority(0) + 20) >> 6), View.MeasureSpec.getMode(0) - 68).intern())) {
                    b10 = -1;
                } else {
                    int i16 = f1182 + 63;
                    f1181 = i16 % 128;
                    int i17 = i16 % 2;
                    b10 = 11;
                }
                break;
            case 421929408:
                if (!str.equals(m1361(TextUtils.indexOf((CharSequence) "", '0') + 279939458, (short) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 291822203, (byte) ((-1) - TextUtils.lastIndexOf("", '0')), (Process.myTid() >> 22) - 68).intern())) {
                    b10 = -1;
                } else {
                    b10 = 10;
                    int i18 = f1182 + 7;
                    f1181 = i18 % 128;
                    int i19 = i18 % 2;
                }
                break;
            case 448638071:
                b10 = !str.equals(m1363("\u0006\ufffa\u000b\ufffa￩\u0006\b\r\f\u000eￜ\f", 12 - (ViewConfiguration.getKeyRepeatDelay() >> 16), true, 11 - KeyEvent.getDeadChar(0, 0), Color.green(0) + Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE).intern()) ? (byte) -1 : (byte) 16;
                break;
            case 487251537:
                if (!(str.equals(m1363("\ufffe\u0007\u0002\u0000\u0007\uffde\u0012\r\u0002\u000f\u0002\r￼ￚ", 14 - Drawable.resolveOpacity(0, 0), true, 15 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), View.MeasureSpec.getSize(0) + Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE).intern()))) {
                    b10 = -1;
                } else {
                    b10 = 5;
                }
                break;
            case 544598087:
                b10 = !(str.equals(m1361(KeyEvent.normalizeMetaState(0) + 279939402, (short) (AndroidCharacter.getMirror('0') + 65488), ((Process.getThreadPriority(0) + 20) >> 6) + (-291822169), (byte) View.getDefaultSize(0, 0), Gravity.getAbsoluteGravity(0, 0) + (-68)).intern()) ? false : true) ? (byte) 4 : (byte) -1;
                break;
            case 1125320581:
                if ((str.equals(m1363("\u0015\u0002￪\u000e\u0002\b\u0006￥\u0002", View.MeasureSpec.makeMeasureSpec(0, 0) + 9, false, 2 - View.resolveSizeAndState(0, 0, 0), Color.green(0) + 124).intern()) ? (char) 26 : 'Y') == 'Y') {
                    b10 = -1;
                } else {
                    int i20 = f1182 + 95;
                    f1181 = i20 % 128;
                    b10 = i20 % 2 == 0 ? (byte) 8 : (byte) 38;
                }
                break;
            case 1146816194:
                b10 = !str.equals(m1361(279939517 - TextUtils.indexOf("", "", 0), (short) KeyEvent.getDeadChar(0, 0), (-291822191) - KeyEvent.normalizeMetaState(0), (byte) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0)), (-69) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern()) ? (byte) -1 : (byte) 17;
                break;
            case 1413638316:
                if ((str.equals(m1361(TextUtils.indexOf("", "", 0, 0) + 279939386, (short) (ViewConfiguration.getDoubleTapTimeout() >> 16), (-291822192) - TextUtils.lastIndexOf("", '0'), (byte) Gravity.getAbsoluteGravity(0, 0), (-68) - KeyEvent.keyCodeFromString("")).intern()) ? (char) 1 : 'F') == 1) {
                    int i21 = f1182 + 31;
                    f1181 = i21 % 128;
                    if (i21 % 2 == 0) {
                        b10 = 3;
                    } else {
                        b10 = 5;
                    }
                } else {
                    b10 = -1;
                }
                break;
            case 1955824356:
                if (!str.equals(m1361(279939529 - View.resolveSize(0, 0), (short) Color.argb(0, 0, 0, 0), (-291822204) - ((byte) KeyEvent.getModifierMetaStateMask()), (byte) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), KeyEvent.getDeadChar(0, 0) - 68).intern())) {
                    b10 = -1;
                } else {
                    int i22 = f1181 + 43;
                    f1182 = i22 % 128;
                    b10 = i22 % 2 == 0 ? (byte) 33 : (byte) 18;
                }
                break;
            case 1982630644:
                b10 = !str.equals(m1363("\u000b\u0019\u0007￨\n\uffe7", (ViewConfiguration.getDoubleTapTimeout() >> 16) + 6, true, 3 - TextUtils.lastIndexOf("", '0', 0), 119 - Color.argb(0, 0, 0, 0)).intern()) ? (byte) -1 : (byte) 6;
                break;
            case 2040577055:
                b10 = !str.equals(m1361(279939357 - Drawable.resolveOpacity(0, 0), (short) Drawable.resolveOpacity(0, 0), (-291822191) - ExpandableListView.getPackedPositionGroup(0L), (byte) (ViewConfiguration.getFadingEdgeLength() >> 16), (-68) - (KeyEvent.getMaxKeyCode() >> 16)).intern()) ? (byte) -1 : (byte) 0;
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
                return MyTargetConfig.class;
            case 1:
                return MyTargetManager.class;
            case 2:
                return MyTargetVersion.class;
            case 3:
            case 4:
                return MyTargetActivity.class;
            case 5:
                return MyTargetActivity.ActivityEngine.class;
            case 6:
                return BaseAd.class;
            case 7:
                return VideoData.class;
            case 8:
                return ImageData.class;
            case 9:
                return AudioData.class;
            case 10:
                return BaseInterstitialAd.class;
            case 11:
                return InterstitialAd.class;
            case 12:
                return InterstitialAd.InterstitialAdListener.class;
            case 13:
                return Reward.class;
            case 14:
                return RewardedAd.class;
            case 15:
                return RewardedAd.RewardedAdListener.class;
            case 16:
                return CustomParams.class;
            case 17:
                return MyTargetView.class;
            case 18:
                int i23 = f1181 + 33;
                f1182 = i23 % 128;
                int i24 = i23 % 2;
                return MyTargetView.AdSize.class;
            case 19:
                return MyTargetView.MyTargetViewListener.class;
            default:
                return null;
        }
    }

    public bz(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m1361(int i10, short s10, int i11, byte b10, int i12) {
        String string;
        synchronized (o.f2993) {
            StringBuilder sb2 = new StringBuilder();
            int i13 = f1188;
            int i14 = i12 + i13;
            boolean z10 = i14 == -1;
            if (z10) {
                byte[] bArr = f1185;
                if (bArr != null) {
                    i14 = (byte) (bArr[f1187 + i10] + i13);
                } else {
                    i14 = (short) (f1183[f1187 + i10] + i13);
                }
            }
            if (i14 > 0) {
                o.f2994 = ((i10 + i14) - 2) + f1187 + (z10 ? 1 : 0);
                o.f2995 = b10;
                char c10 = (char) (i11 + f1184);
                o.f2997 = c10;
                sb2.append(c10);
                o.f2996 = o.f2997;
                o.f2998 = 1;
                while (o.f2998 < i14) {
                    byte[] bArr2 = f1185;
                    if (bArr2 != null) {
                        int i15 = o.f2994;
                        o.f2994 = i15 - 1;
                        o.f2997 = (char) (o.f2996 + (((byte) (bArr2[i15] + s10)) ^ o.f2995));
                    } else {
                        short[] sArr = f1183;
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
}
