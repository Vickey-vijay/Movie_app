package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class ej extends ef {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f1964 = 0;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f1965 = 1;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static short[] f1966 = null;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f1967 = 49469135;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f1968 = 120;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static byte[] f1969 = {-78, -77, 118, 31, 111, 37, 39, 114, 35, 125, 18, -32, -55, 118, 32, -43, -55, 33, 30, 110, 38, 117, 20, -120, 35, -46, -68, 124, 32, 112, 18, -119, 44, ExifInterface.START_CODE, -118, 20, -32, -57, 34, 120, 37, 72, -79, 84, 7, 38, 33, -16, 41, -75, 100, 37, 39, -6, -7, 37, -8, 33, -6, -5, 31, -53, 106, 37, -75, 57, -6, ExifInterface.MARKER_APP1, 97, ExifInterface.START_CODE, 38, -53, 103, 33, -52, 95, 31, -5, 40, -3, 38, -52, 30, -117, 119, -71};

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1970 = 1759777244;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private ed f1971;

    @Override // com.ironsource.adqualitysdk.sdk.i.ef
    public final boolean equals(Object obj) {
        if (!(this != obj)) {
            return true;
        }
        if (obj != null) {
            int i10 = f1964 + 77;
            f1965 = i10 % 128;
            if (i10 % 2 == 0) {
                throw null;
            }
            if (ej.class == obj.getClass()) {
                if (!super.equals(obj)) {
                    int i11 = f1964 + 57;
                    f1965 = i11 % 128;
                    return (i11 % 2 == 0 ? '\t' : ' ') == '\t';
                }
                ed edVar = this.f1971;
                ed edVar2 = ((ej) obj).f1971;
                if (edVar != null) {
                    return edVar.equals(edVar2);
                }
                if ((edVar2 == null ? (char) 2 : 'U') != 2) {
                    return false;
                }
                int i12 = f1965 + 43;
                f1964 = i12 % 128;
                int i13 = i12 % 2;
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0056 A[PHI: r1 r4 r13
  0x0056: PHI (r1v10 com.ironsource.adqualitysdk.sdk.i.dr) = (r1v9 com.ironsource.adqualitysdk.sdk.i.dr), (r1v19 com.ironsource.adqualitysdk.sdk.i.dr) binds: [B:14:0x0054, B:8:0x0031] A[DONT_GENERATE, DONT_INLINE]
  0x0056: PHI (r4v3 com.ironsource.adqualitysdk.sdk.i.dr) = (r4v2 com.ironsource.adqualitysdk.sdk.i.dr), (r4v7 com.ironsource.adqualitysdk.sdk.i.dr) binds: [B:14:0x0054, B:8:0x0031] A[DONT_GENERATE, DONT_INLINE]
  0x0056: PHI (r13v4 java.lang.Object) = (r13v3 java.lang.Object), (r13v19 java.lang.Object) binds: [B:14:0x0054, B:8:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:19:0x007b A[Catch: Exception -> 0x0179, PHI: r1 r4 r13
  0x007b: PHI (r1v12 com.ironsource.adqualitysdk.sdk.i.dr) = (r1v9 com.ironsource.adqualitysdk.sdk.i.dr), (r1v19 com.ironsource.adqualitysdk.sdk.i.dr) binds: [B:14:0x0054, B:8:0x0031] A[DONT_GENERATE, DONT_INLINE]
  0x007b: PHI (r4v5 com.ironsource.adqualitysdk.sdk.i.dr) = (r4v2 com.ironsource.adqualitysdk.sdk.i.dr), (r4v7 com.ironsource.adqualitysdk.sdk.i.dr) binds: [B:14:0x0054, B:8:0x0031] A[DONT_GENERATE, DONT_INLINE]
  0x007b: PHI (r13v10 java.lang.Object) = (r13v3 java.lang.Object), (r13v19 java.lang.Object) binds: [B:14:0x0054, B:8:0x0031] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #1 {Exception -> 0x0179, blocks: (B:5:0x0020, B:7:0x0030, B:19:0x007b, B:24:0x0087, B:25:0x009a, B:30:0x00a6, B:33:0x00b4, B:34:0x00c7, B:36:0x00d1, B:37:0x00e3, B:39:0x016b, B:16:0x0060, B:13:0x0046), top: B:46:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:21:0x0081  */
    /* JADX WARN: Code duplicated, block: B:22:0x0084  */
    /* JADX WARN: Code duplicated, block: B:24:0x0087 A[Catch: Exception -> 0x0179, TryCatch #1 {Exception -> 0x0179, blocks: (B:5:0x0020, B:7:0x0030, B:19:0x007b, B:24:0x0087, B:25:0x009a, B:30:0x00a6, B:33:0x00b4, B:34:0x00c7, B:36:0x00d1, B:37:0x00e3, B:39:0x016b, B:16:0x0060, B:13:0x0046), top: B:46:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:25:0x009a A[Catch: Exception -> 0x0179, TryCatch #1 {Exception -> 0x0179, blocks: (B:5:0x0020, B:7:0x0030, B:19:0x007b, B:24:0x0087, B:25:0x009a, B:30:0x00a6, B:33:0x00b4, B:34:0x00c7, B:36:0x00d1, B:37:0x00e3, B:39:0x016b, B:16:0x0060, B:13:0x0046), top: B:46:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:27:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a6 A[Catch: Exception -> 0x0179, TRY_LEAVE, TryCatch #1 {Exception -> 0x0179, blocks: (B:5:0x0020, B:7:0x0030, B:19:0x007b, B:24:0x0087, B:25:0x009a, B:30:0x00a6, B:33:0x00b4, B:34:0x00c7, B:36:0x00d1, B:37:0x00e3, B:39:0x016b, B:16:0x0060, B:13:0x0046), top: B:46:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c7 A[Catch: Exception -> 0x0179, TryCatch #1 {Exception -> 0x0179, blocks: (B:5:0x0020, B:7:0x0030, B:19:0x007b, B:24:0x0087, B:25:0x009a, B:30:0x00a6, B:33:0x00b4, B:34:0x00c7, B:36:0x00d1, B:37:0x00e3, B:39:0x016b, B:16:0x0060, B:13:0x0046), top: B:46:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00d1 A[Catch: Exception -> 0x0179, TryCatch #1 {Exception -> 0x0179, blocks: (B:5:0x0020, B:7:0x0030, B:19:0x007b, B:24:0x0087, B:25:0x009a, B:30:0x00a6, B:33:0x00b4, B:34:0x00c7, B:36:0x00d1, B:37:0x00e3, B:39:0x016b, B:16:0x0060, B:13:0x0046), top: B:46:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00e3 A[Catch: Exception -> 0x0179, TRY_LEAVE, TryCatch #1 {Exception -> 0x0179, blocks: (B:5:0x0020, B:7:0x0030, B:19:0x007b, B:24:0x0087, B:25:0x009a, B:30:0x00a6, B:33:0x00b4, B:34:0x00c7, B:36:0x00d1, B:37:0x00e3, B:39:0x016b, B:16:0x0060, B:13:0x0046), top: B:46:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:39:0x016b A[Catch: Exception -> 0x0179, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x0179, blocks: (B:5:0x0020, B:7:0x0030, B:19:0x007b, B:24:0x0087, B:25:0x009a, B:30:0x00a6, B:33:0x00b4, B:34:0x00c7, B:36:0x00d1, B:37:0x00e3, B:39:0x016b, B:16:0x0060, B:13:0x0046), top: B:46:0x000e }] */
    @Override // com.ironsource.adqualitysdk.sdk.i.ed
    /* JADX INFO: renamed from: ｋ */
    public final dr mo2113(du duVar, cq cqVar) {
        dr drVarM2146;
        dr drVarM2147;
        Object objM2089;
        int i10;
        char c10;
        char c11;
        int i11 = f1965 + 75;
        f1964 = i11 % 128;
        try {
            if (i11 % 2 != 0) {
                drVarM2147 = m2152().m2146(duVar, cqVar);
                drVarM2146 = m2161().m2146(duVar, cqVar);
                objM2089 = m2153().m2146(duVar, cqVar).m2089();
                int i12 = 20 / 0;
                if (objM2089 instanceof JSONObject) {
                    int i13 = f1965 + 43;
                    f1964 = i13 % 128;
                    int i14 = i13 % 2;
                    ((JSONObject) objM2089).put((String) drVarM2147.m2089(), drVarM2146.m2089());
                    i10 = f1965 + 63;
                } else {
                    if (objM2089 instanceof JSONArray) {
                        c10 = 'A';
                    } else {
                        c10 = 'O';
                    }
                    if (c10 != 'O') {
                        ((JSONArray) objM2089).put(drVarM2147.m2090().intValue(), drVarM2146.m2089());
                    } else {
                        if (objM2089 instanceof Map) {
                            c11 = '\r';
                        } else {
                            c11 = '\b';
                        }
                        if (c11 != '\r') {
                            ((Map) objM2089).put(drVarM2147.m2089(), drVarM2146.m2089());
                        } else if (objM2089 instanceof List) {
                            int i15 = f1964 + 105;
                            f1965 = i15 % 128;
                            int i16 = i15 % 2;
                            ((List) objM2089).set(drVarM2147.m2090().intValue(), drVarM2146.m2089());
                        } else if (objM2089.getClass().isArray()) {
                            ((Object[]) objM2089)[drVarM2147.m2090().intValue()] = drVarM2146.m2089();
                        } else {
                            String strM1683 = cqVar.m1683();
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(m2160(TextUtils.lastIndexOf("", '0') - 49469134, (short) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 79), (-1759777175) - Color.red(0), (byte) (TextUtils.indexOf("", "", 0, 0) - 41), TextUtils.lastIndexOf("", '0', 0) - 120).intern());
                            sb2.append(this);
                            sb2.append(m2147());
                            sb2.append(m2160(Color.blue(0) - 49469093, (short) (113 - View.combineMeasuredStates(0, 0)), TextUtils.getTrimmedLength("") - 1759777186, (byte) (105 - (ViewConfiguration.getPressedStateDuration() >> 16)), (-122) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern());
                            sb2.append(objM2089);
                            co.m1623(strM1683, sb2.toString(), null);
                            i10 = f1965 + 109;
                        }
                    }
                }
                f1964 = i10 % 128;
                int i17 = i10 % 2;
            } else {
                drVarM2147 = m2152().m2146(duVar, cqVar);
                drVarM2146 = m2161().m2146(duVar, cqVar);
                objM2089 = m2153().m2146(duVar, cqVar).m2089();
                if (objM2089 instanceof JSONObject) {
                    int i18 = f1965 + 43;
                    f1964 = i18 % 128;
                    int i19 = i18 % 2;
                    ((JSONObject) objM2089).put((String) drVarM2147.m2089(), drVarM2146.m2089());
                    i10 = f1965 + 63;
                } else {
                    if (objM2089 instanceof JSONArray) {
                        c10 = 'A';
                    } else {
                        c10 = 'O';
                    }
                    if (c10 != 'O') {
                        ((JSONArray) objM2089).put(drVarM2147.m2090().intValue(), drVarM2146.m2089());
                    } else {
                        if (objM2089 instanceof Map) {
                            c11 = '\r';
                        } else {
                            c11 = '\b';
                        }
                        if (c11 != '\r') {
                            ((Map) objM2089).put(drVarM2147.m2089(), drVarM2146.m2089());
                        } else if (objM2089 instanceof List) {
                            int i110 = f1964 + 105;
                            f1965 = i110 % 128;
                            int i111 = i110 % 2;
                            ((List) objM2089).set(drVarM2147.m2090().intValue(), drVarM2146.m2089());
                        } else if (objM2089.getClass().isArray()) {
                            ((Object[]) objM2089)[drVarM2147.m2090().intValue()] = drVarM2146.m2089();
                        } else {
                            String strM1684 = cqVar.m1683();
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(m2160(TextUtils.lastIndexOf("", '0') - 49469134, (short) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 79), (-1759777175) - Color.red(0), (byte) (TextUtils.indexOf("", "", 0, 0) - 41), TextUtils.lastIndexOf("", '0', 0) - 120).intern());
                            sb3.append(this);
                            sb3.append(m2147());
                            sb3.append(m2160(Color.blue(0) - 49469093, (short) (113 - View.combineMeasuredStates(0, 0)), TextUtils.getTrimmedLength("") - 1759777186, (byte) (105 - (ViewConfiguration.getPressedStateDuration() >> 16)), (-122) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern());
                            sb3.append(objM2089);
                            co.m1623(strM1684, sb3.toString(), null);
                            i10 = f1965 + 109;
                        }
                    }
                }
                f1964 = i10 % 128;
                int i112 = i10 % 2;
            }
        } catch (Exception e10) {
            String strM1685 = cqVar.m1683();
            StringBuilder sb4 = new StringBuilder();
            sb4.append(m2160((-49469135) - (ViewConfiguration.getJumpTapTimeout() >> 16), (short) ((ViewConfiguration.getLongPressTimeout() >> 16) - 78), (-1759777174) - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (byte) ((-42) - ExpandableListView.getPackedPositionChild(0L)), (-120) - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern());
            sb4.append(this);
            sb4.append(m2147());
            co.m1623(strM1685, sb4.toString(), e10);
        }
        return drVarM2146;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2160(int i10, short s10, int i11, byte b10, int i12) {
        String string;
        synchronized (o.f2993) {
            StringBuilder sb2 = new StringBuilder();
            int i13 = f1968;
            int i14 = i12 + i13;
            boolean z10 = i14 == -1;
            if (z10) {
                byte[] bArr = f1969;
                i14 = bArr != null ? (byte) (bArr[f1967 + i10] + i13) : (short) (f1966[f1967 + i10] + i13);
            }
            if (i14 > 0) {
                o.f2994 = ((i10 + i14) - 2) + f1967 + (z10 ? 1 : 0);
                o.f2995 = b10;
                char c10 = (char) (i11 + f1970);
                o.f2997 = c10;
                sb2.append(c10);
                o.f2996 = o.f2997;
                o.f2998 = 1;
                while (o.f2998 < i14) {
                    byte[] bArr2 = f1969;
                    if (bArr2 != null) {
                        int i15 = o.f2994;
                        o.f2994 = i15 - 1;
                        o.f2997 = (char) (o.f2996 + (((byte) (bArr2[i15] + s10)) ^ o.f2995));
                    } else {
                        short[] sArr = f1966;
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

    @Override // com.ironsource.adqualitysdk.sdk.i.ef
    public final int hashCode() {
        int i10 = f1964 + 29;
        f1965 = i10 % 128;
        int i11 = i10 % 2;
        int iHashCode = super.hashCode() * 31;
        ed edVar = this.f1971;
        int iHashCode2 = 0;
        if (!(edVar == null)) {
            int i12 = f1965 + 17;
            f1964 = i12 % 128;
            if ((i12 % 2 != 0 ? (char) 7 : '[') == 7) {
                edVar.hashCode();
                throw null;
            }
            iHashCode2 = edVar.hashCode();
        } else {
            int i13 = f1964 + 75;
            f1965 = i13 % 128;
            int i14 = i13 % 2;
        }
        return iHashCode + iHashCode2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ef
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(m2160((-49469052) - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (short) (KeyEvent.keyCodeFromString("") + 104), TextUtils.getOffsetAfter("", 0) - 1759777212, (byte) (60 - TextUtils.getOffsetBefore("", 0)), TextUtils.lastIndexOf("", '0') - 120).intern());
        sb2.append(m2161().toString());
        String string = sb2.toString();
        int i10 = f1965 + 125;
        f1964 = i10 % 128;
        int i11 = i10 % 2;
        return string;
    }

    public ej(ed edVar, ed edVar2, ed edVar3, dm dmVar) {
        super(edVar, edVar2, dmVar);
        this.f1971 = edVar3;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private ed m2161() {
        int i10 = f1964 + 57;
        f1965 = i10 % 128;
        if (!(i10 % 2 == 0)) {
            return this.f1971;
        }
        throw null;
    }
}
