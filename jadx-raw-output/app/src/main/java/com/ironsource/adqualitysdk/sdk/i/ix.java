package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class ix {

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f2638 = 1;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f2639 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char f2642 = 5;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f2640 = {'N', 'e', 't', 'U', 'i', 'l', 's', 'E', 'r', 'o', ' ', 'n', 'd', 'g', 'p', 'q', 'u', ':', 'C', '-', 'c', 'z', 'G', 'T', 'O'};

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static boolean f2641 = true;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static boolean f2637 = true;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2644 = 108;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f2643 = {193, 192, 178, 153, 164, 188, 187, 191, 175, 219, 218, 224, 209, 229, 220, 205, 216, 213, 207, 155, 214, 223, 167, 140, 212, 222, 169, 225, 210, 152, 142, 166, 233};

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static HttpURLConnection m2549(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod(m2548("\u0002\fÃ", View.MeasureSpec.getMode(0) + 3, (byte) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 112)).intern());
        int i10 = f2639 + 21;
        f2638 = i10 % 128;
        if ((i10 % 2 == 0 ? '^' : 'F') == 'F') {
            return httpURLConnection;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static iq m2550(JSONObject jSONObject, String str) {
        HttpURLConnection httpURLConnectionM2552;
        long jM2778;
        String strM2555;
        int iHttpUrlConnectionGetResponseCode;
        String responseMessage;
        int i10 = f2639 + 23;
        f2638 = i10 % 128;
        try {
            if (i10 % 2 != 0) {
                httpURLConnectionM2552 = m2552(str);
                byte[] bArrM2557 = m2557(httpURLConnectionM2552, jSONObject);
                jM2778 = jx.m2778();
                m2559(httpURLConnectionM2552, bArrM2557);
                strM2555 = m2555(httpURLConnectionM2552);
                iHttpUrlConnectionGetResponseCode = IronSourceNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnectionM2552);
                responseMessage = httpURLConnectionM2552.getResponseMessage();
                if (!(iHttpUrlConnectionGetResponseCode < 400)) {
                    IronSourceNetworkBridge.httpUrlConnectionDisconnect(httpURLConnectionM2552);
                }
            } else {
                httpURLConnectionM2552 = m2552(str);
                byte[] bArrM2558 = m2557(httpURLConnectionM2552, jSONObject);
                jM2778 = jx.m2778();
                m2559(httpURLConnectionM2552, bArrM2558);
                strM2555 = m2555(httpURLConnectionM2552);
                iHttpUrlConnectionGetResponseCode = IronSourceNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnectionM2552);
                responseMessage = httpURLConnectionM2552.getResponseMessage();
                if (iHttpUrlConnectionGetResponseCode >= 28484) {
                    IronSourceNetworkBridge.httpUrlConnectionDisconnect(httpURLConnectionM2552);
                }
            }
            iq iqVar = new iq(strM2555, iHttpUrlConnectionGetResponseCode, responseMessage, jx.m2778() - jM2778);
            int i11 = f2638 + 9;
            f2639 = i11 % 128;
            if (i11 % 2 != 0) {
                throw null;
            }
            return iqVar;
        } catch (Throwable th2) {
            String strIntern = m2548("\u0001\u0002\u0003\u0004\u0003\u0000\u0006\u0007", Process.getGidForName("") + 9, (byte) (Gravity.getAbsoluteGravity(0, 0) + 35)).intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m2548("\b\t\t\u0005\u0005\r\u000b\u0006\f\r\u0001\u000e\u000e\u000b\u0013\u000e\u0007\u0001\r\u0005\u0000\u0010\u0015\u0006\u0007\u0001\u000f\f", 28 - TextUtils.indexOf("", ""), (byte) (89 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)))).intern());
            sb2.append(th2.getLocalizedMessage());
            k.m2830(strIntern, sb2.toString(), th2);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004f A[Catch: all -> 0x0035, PHI: r0 r4 r6 r7 r13
  0x004f: PHI (r0v11 java.lang.String) = (r0v10 java.lang.String), (r0v15 java.lang.String) binds: [B:17:0x004d, B:12:0x0032] A[DONT_GENERATE, DONT_INLINE]
  0x004f: PHI (r4v5 long) = (r4v4 long), (r4v8 long) binds: [B:17:0x004d, B:12:0x0032] A[DONT_GENERATE, DONT_INLINE]
  0x004f: PHI (r6v1 int) = (r6v0 int), (r6v5 int) binds: [B:17:0x004d, B:12:0x0032] A[DONT_GENERATE, DONT_INLINE]
  0x004f: PHI (r7v1 java.lang.String) = (r7v0 java.lang.String), (r7v4 java.lang.String) binds: [B:17:0x004d, B:12:0x0032] A[DONT_GENERATE, DONT_INLINE]
  0x004f: PHI (r13v3 java.net.HttpURLConnection) = (r13v2 java.net.HttpURLConnection), (r13v9 java.net.HttpURLConnection) binds: [B:17:0x004d, B:12:0x0032] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0035, blocks: (B:8:0x0014, B:19:0x0052, B:18:0x004f, B:16:0x0037), top: B:31:0x0012 }] */
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static iq m2553(String str) {
        HttpURLConnection httpURLConnectionM2549;
        long jM2778;
        String strM2555;
        int iHttpUrlConnectionGetResponseCode;
        String responseMessage;
        int i10 = f2639 + 75;
        f2638 = i10 % 128;
        try {
            if (!(i10 % 2 != 0)) {
                httpURLConnectionM2549 = m2549(str);
                jM2778 = jx.m2778();
                strM2555 = m2555(httpURLConnectionM2549);
                iHttpUrlConnectionGetResponseCode = IronSourceNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnectionM2549);
                responseMessage = httpURLConnectionM2549.getResponseMessage();
                if ((iHttpUrlConnectionGetResponseCode >= 29428 ? '1' : 'D') == '1') {
                    IronSourceNetworkBridge.httpUrlConnectionDisconnect(httpURLConnectionM2549);
                }
            } else {
                httpURLConnectionM2549 = m2549(str);
                jM2778 = jx.m2778();
                strM2555 = m2555(httpURLConnectionM2549);
                iHttpUrlConnectionGetResponseCode = IronSourceNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnectionM2549);
                responseMessage = httpURLConnectionM2549.getResponseMessage();
                if (iHttpUrlConnectionGetResponseCode >= 400) {
                    IronSourceNetworkBridge.httpUrlConnectionDisconnect(httpURLConnectionM2549);
                }
            }
            iq iqVar = new iq(strM2555, iHttpUrlConnectionGetResponseCode, responseMessage, jx.m2778() - jM2778);
            int i11 = f2638 + 47;
            f2639 = i11 % 128;
            if (i11 % 2 != 0) {
                throw null;
            }
            return iqVar;
        } catch (Throwable th2) {
            String strIntern = m2548("\u0001\u0002\u0003\u0004\u0003\u0000\u0006\u0007", (ViewConfiguration.getPressedStateDuration() >> 16) + 8, (byte) (35 - Color.green(0))).intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m2548("\b\t\t\u0005\u0005\r\u000b\u0006\f\r\u0001\u000e\u000e\u000b\u000b\u0003\u0000\f\u0006\u0003\u0010\u0011\u0006\u000b\u0007\u0016\u0087", 27 - TextUtils.getOffsetBefore("", 0), (byte) (View.combineMeasuredStates(0, 0) + 103)).intern());
            sb2.append(th2.getLocalizedMessage());
            k.m2830(strIntern, sb2.toString(), th2);
            return null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static void m2559(HttpURLConnection httpURLConnection, byte[] bArr) throws IOException {
        httpURLConnection.connect();
        DataOutputStream dataOutputStream = new DataOutputStream(IronSourceNetworkBridge.urlConnectionGetOutputStream(httpURLConnection));
        dataOutputStream.write(bArr);
        dataOutputStream.flush();
        m2556(dataOutputStream);
        int i10 = f2639 + 99;
        f2638 = i10 % 128;
        int i11 = i10 % 2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static String m2561(iq iqVar) {
        int i10 = f2638 + 43;
        f2639 = i10 % 128;
        if (!(i10 % 2 == 0)) {
            throw null;
        }
        if (iqVar == null) {
            return null;
        }
        String strM2516 = iqVar.m2516();
        int i11 = f2639 + 57;
        f2638 = i11 % 128;
        int i12 = i11 % 2;
        return strM2516;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2548(String str, int i10, byte b10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (g.f2129) {
            char[] cArr2 = f2640;
            char c10 = f2642;
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

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        if ((r4 > 5209) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002a, code lost:
    
        if ((r4 > 256) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002c, code lost:
    
        r4 = com.ironsource.adqualitysdk.sdk.i.ix.f2639 + 15;
        com.ironsource.adqualitysdk.sdk.i.ix.f2638 = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0036, code lost:
    
        if ((r4 % 2) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0038, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003d, code lost:
    
        return false;
     */
    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean m2560(java.lang.String r4) {
        /*
            int r0 = com.ironsource.adqualitysdk.sdk.i.ix.f2639
            r1 = 65
            int r0 = r0 + r1
            int r2 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.ix.f2638 = r2
            int r0 = r0 % 2
            r2 = 9
            if (r0 != 0) goto L10
            goto L11
        L10:
            r1 = r2
        L11:
            r0 = 1
            r3 = 0
            int r4 = r4.length()
            if (r1 == r2) goto L23
            r1 = 5209(0x1459, float:7.3E-42)
            if (r4 <= r1) goto L1f
            r4 = r0
            goto L20
        L1f:
            r4 = r3
        L20:
            if (r4 == 0) goto L3d
            goto L2c
        L23:
            r1 = 256(0x100, float:3.59E-43)
            if (r4 <= r1) goto L29
            r4 = r0
            goto L2a
        L29:
            r4 = r3
        L2a:
            if (r4 == 0) goto L3d
        L2c:
            int r4 = com.ironsource.adqualitysdk.sdk.i.ix.f2639
            int r4 = r4 + 15
            int r1 = r4 % 128
            com.ironsource.adqualitysdk.sdk.i.ix.f2638 = r1
            int r4 = r4 % 2
            if (r4 == 0) goto L39
            return r0
        L39:
            r4 = 0
            throw r4     // Catch: java.lang.Throwable -> L3b
        L3b:
            r4 = move-exception
            throw r4
        L3d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ix.m2560(java.lang.String):boolean");
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static byte[] m2557(HttpURLConnection httpURLConnection, JSONObject jSONObject) throws Throwable {
        String strM2551 = m2551(jSONObject);
        byte[] bytes = strM2551.getBytes(m2554(null, 127 - (Process.myTid() >> 22), null, "\u0085\u0084\u0083\u0082\u0081").intern());
        if ((m2560(strM2551) ? 'W' : '\f') != 'W') {
            return bytes;
        }
        int i10 = f2638 + 121;
        f2639 = i10 % 128;
        int i11 = i10 % 2;
        httpURLConnection.setRequestProperty(m2548("\u0013\b\f\u0001\u0006\u0010\u0004\u0011\u0006\f\u0018\u0005\u000e\u0002\f\u000e", 16 - View.getDefaultSize(0, 0), (byte) (20 - TextUtils.getCapsMode("", 0, 0))).intern(), m2548("\u000b\u0017\t\u0013", 4 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (byte) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 14)).intern());
        byte[] bArrM2558 = m2558(bytes);
        int i12 = f2639 + 109;
        f2638 = i12 % 128;
        int i13 = i12 % 2;
        return bArrM2558;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static HttpURLConnection m2552(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod(m2554(null, 127 - (ViewConfiguration.getEdgeSlop() >> 16), null, "\u0082\u0088\u0087\u0086").intern());
        httpURLConnection.setRequestProperty(m2554(null, (Process.myTid() >> 22) + 127, null, "\u008d\u008f\u008e\u0082\u0084\u008c\u008b\u008d\u008c\u008b\u008a\u0089").intern(), m2554(null, Drawable.resolveOpacity(0, 0) + 127, null, "\u0085\u0084\u009d\u008c\u009c\u009b\u008c\u008d\u0096\u009a\u0090\u0099\u0093\u0098\u0097\u008b\u008a\u0096\u0095\u0094\u008b\u008a\u0092\u008c\u0090\u0093\u0092\u0091\u008f\u008f\u0090").intern());
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setConnectTimeout(60000);
        httpURLConnection.setReadTimeout(60000);
        int i10 = f2638 + 17;
        f2639 = i10 % 128;
        int i11 = i10 % 2;
        return httpURLConnection;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2555(HttpURLConnection httpURLConnection) {
        InputStream inputStreamUrlConnectionGetInputStream;
        BufferedReader bufferedReader;
        String string = null;
        try {
            inputStreamUrlConnectionGetInputStream = IronSourceNetworkBridge.urlConnectionGetInputStream(httpURLConnection);
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(inputStreamUrlConnectionGetInputStream));
                try {
                    StringBuffer stringBuffer = new StringBuffer();
                    while (true) {
                        String line = bufferedReader.readLine();
                        if ((line != null ? (char) 26 : '3') == '3') {
                            break;
                        }
                        int i10 = f2638 + 5;
                        f2639 = i10 % 128;
                        int i11 = i10 % 2;
                        if ((stringBuffer.length() > 0 ? '2' : (char) 0) == '2') {
                            int i12 = f2638 + 109;
                            f2639 = i12 % 128;
                            if (i12 % 2 != 0) {
                                stringBuffer.append('a');
                            } else {
                                stringBuffer.append('\r');
                            }
                        }
                        stringBuffer.append(line);
                    }
                    string = stringBuffer.toString();
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        k.m2830(m2548("\u0001\u0002\u0003\u0004\u0003\u0000\u0006\u0007", View.combineMeasuredStates(0, 0) + 8, (byte) (35 - Gravity.getAbsoluteGravity(0, 0))).intern(), m2548("\b\t\t\u0005\u0005\r\u000b\u0003\u008a\u008a\u0001\u000e\u000e\u000b\u0006\u0003\t\u000b\u0006\u000e\u000b\u0006", ExpandableListView.getPackedPositionGroup(0L) + 22, (byte) (22 - (ViewConfiguration.getLongPressTimeout() >> 16))).intern(), th);
                    } finally {
                        m2556(inputStreamUrlConnectionGetInputStream);
                        m2556(bufferedReader);
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedReader = null;
            }
        } catch (Throwable th4) {
            th = th4;
            inputStreamUrlConnectionGetInputStream = null;
            bufferedReader = null;
        }
        return string;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2551(JSONObject jSONObject) {
        String string = jSONObject.toString();
        String strM2751 = jv.m2751(string);
        String strSubstring = string.substring(0, string.lastIndexOf(125));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(strSubstring);
        sb2.append(m2554(null, 127 - TextUtils.indexOf("", "", 0), null, "\u009f \u009f\u0096\u0099\u009f\u009e").intern());
        sb2.append(strM2751);
        sb2.append(m2554(null, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 127, null, "¡\u009f").intern());
        String string2 = sb2.toString();
        int i10 = f2638 + 73;
        f2639 = i10 % 128;
        int i11 = i10 % 2;
        return string2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static void m2556(Closeable closeable) {
        int i10 = f2638 + 29;
        f2639 = i10 % 128;
        int i11 = i10 % 2;
        if (!(closeable == null)) {
            try {
                closeable.close();
                int i12 = f2638 + 21;
                f2639 = i12 % 128;
                int i13 = i12 % 2;
            } catch (Throwable unused) {
                return;
            }
        }
        int i14 = f2638 + 93;
        f2639 = i14 % 128;
        if (i14 % 2 == 0) {
            return;
        }
        int i15 = 30 / 0;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static byte[] m2558(byte[] bArr) throws Throwable {
        GZIPOutputStream gZIPOutputStream = null;
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(byteArrayOutputStream);
                try {
                    gZIPOutputStream2.write(bArr);
                    gZIPOutputStream2.flush();
                    gZIPOutputStream2.close();
                    return byteArrayOutputStream.toByteArray();
                } catch (Exception e10) {
                    e = e10;
                    gZIPOutputStream = gZIPOutputStream2;
                    throw new RuntimeException(e);
                } catch (Throwable th2) {
                    th = th2;
                    gZIPOutputStream = gZIPOutputStream2;
                    if (gZIPOutputStream != null) {
                        try {
                            gZIPOutputStream.close();
                        } catch (Exception unused) {
                        }
                    }
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2554(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (m.f2988) {
            char[] cArr2 = f2643;
            int i11 = f2644;
            if (f2637) {
                int length = bArr.length;
                m.f2990 = length;
                char[] cArr3 = new char[length];
                m.f2989 = 0;
                while (m.f2989 < m.f2990) {
                    int i12 = m.f2989;
                    int i13 = m.f2990 - 1;
                    int i14 = m.f2989;
                    cArr3[i12] = (char) (cArr2[bArr[i13 - i14] + i10] - i11);
                    m.f2989 = i14 + 1;
                }
                return new String(cArr3);
            }
            if (f2641) {
                int length2 = cArr.length;
                m.f2990 = length2;
                char[] cArr4 = new char[length2];
                m.f2989 = 0;
                while (m.f2989 < m.f2990) {
                    int i15 = m.f2989;
                    int i16 = m.f2990 - 1;
                    int i17 = m.f2989;
                    cArr4[i15] = (char) (cArr2[cArr[i16 - i17] - i10] - i11);
                    m.f2989 = i17 + 1;
                }
                return new String(cArr4);
            }
            int length3 = iArr.length;
            m.f2990 = length3;
            char[] cArr5 = new char[length3];
            m.f2989 = 0;
            while (m.f2989 < m.f2990) {
                int i18 = m.f2989;
                int i19 = m.f2990 - 1;
                int i20 = m.f2989;
                cArr5[i18] = (char) (cArr2[iArr[i19 - i20] - i10] - i11);
                m.f2989 = i20 + 1;
            }
            return new String(cArr5);
        }
    }
}
