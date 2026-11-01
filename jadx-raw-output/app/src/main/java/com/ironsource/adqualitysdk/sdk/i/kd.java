package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class kd {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2967 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2968 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static WeakReference<az> f2969 = null;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2970 = 44;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static void m2873(az azVar) {
        f2969 = new WeakReference<>(azVar);
        int i10 = f2967 + 47;
        f2968 = i10 % 128;
        int i11 = i10 % 2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static void m2879(String str, String str2, Throwable th2, boolean z10, boolean z11) {
        int i10 = f2967 + 41;
        f2968 = i10 % 128;
        int i11 = i10 % 2;
        try {
            m2880(str, str2, th2, z10, z11, false);
            int i12 = f2968 + 9;
            f2967 = i12 % 128;
            int i13 = i12 % 2;
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static Throwable m2881(Throwable th2) {
        while (true) {
            if (!(th2.getCause() != null)) {
                return th2;
            }
            int i10 = f2968 + 69;
            f2967 = i10 % 128;
            if (!(i10 % 2 != 0)) {
                th2.getCause();
                throw null;
            }
            th2 = th2.getCause();
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static void m2872(String str, String str2, Throwable th2, boolean z10) {
        int i10 = f2967 + 51;
        f2968 = i10 % 128;
        try {
            if (!(i10 % 2 == 0)) {
                m2879(str, str2, th2, z10, true);
            } else {
                m2879(str, str2, th2, z10, false);
            }
            int i11 = f2967 + 125;
            f2968 = i11 % 128;
            if (i11 % 2 == 0) {
                return;
            }
            int i12 = 54 / 0;
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static void m2875(String str, String str2, String str3, Throwable th2, JSONObject jSONObject, boolean z10) {
        int i10 = f2967 + 85;
        f2968 = i10 % 128;
        try {
            if (i10 % 2 != 0) {
                m2882(str, str2, str3, th2, jSONObject, false, false, z10);
            } else {
                m2882(str, str2, str3, th2, jSONObject, true, false, z10);
            }
            int i11 = f2968 + 29;
            f2967 = i11 % 128;
            int i12 = i11 % 2;
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static void m2880(String str, String str2, Throwable th2, boolean z10, boolean z11, boolean z12) {
        int i10 = f2968;
        int i11 = i10 + 43;
        f2967 = i11 % 128;
        int i12 = i11 % 2;
        try {
            if (z10) {
                int i13 = i10 + 3;
                f2967 = i13 % 128;
                int i14 = i13 % 2;
                k.m2828(str, str2, z12);
                if ((th2 != null ? '\t' : (char) 31) == '\t') {
                    int i15 = f2968 + 49;
                    f2967 = i15 % 128;
                    k.m2824(str, ((i15 % 2 == 0 ? (char) 18 : ',') != ',' ? m2876("￤ￚ\u0013\f\t\u0001\u0014\u0005", 126 >>> Color.green(1), true, 0 / Color.argb(1, 1, 0, 1), (AudioTrack.getMinVolume() > 2.0f ? 1 : (AudioTrack.getMinVolume() == 2.0f ? 0 : -1)) * 18229) : m2876("￤ￚ\u0013\f\t\u0001\u0014\u0005", 8 - Color.green(0), true, Color.argb(0, 0, 0, 0) + 1, 140 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)))).intern(), th2, z12);
                }
            } else {
                k.m2824(str, str2, th2, z12);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m2876("\u0006\u0003\u0002\u0004\fￛ\ufff5\u0013\u0002\u0004", 10 - KeyEvent.getDeadChar(0, 0), false, 6 - (ViewConfiguration.getPressedStateDuration() >> 16), 139 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern());
            sb2.append(str);
            m2882(str, str2, sb2.toString(), th2, null, false, z11, z12);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static void m2874(String str, String str2, String str3, String str4) {
        int i10 = f2968 + 97;
        f2967 = i10 % 128;
        int i11 = i10 % 2;
        try {
            m2877(str, str2, str3, str4);
            int i12 = f2967 + 69;
            f2968 = i12 % 128;
            int i13 = i12 % 2;
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static void m2883(String str, String str2, String str3, Throwable th2, boolean z10) {
        int i10 = f2968 + 57;
        f2967 = i10 % 128;
        int i11 = i10 % 2;
        try {
            m2882(str, str2, str3, th2, null, false, false, false);
            int i12 = f2968 + 71;
            f2967 = i12 % 128;
            if ((i12 % 2 != 0 ? 'I' : '9') == 'I') {
            } else {
                throw null;
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static void m2882(String str, String str2, String str3, Throwable th2, JSONObject jSONObject, boolean z10, boolean z11, boolean z12) {
        String string;
        int i10 = f2967 + 59;
        f2968 = i10 % 128;
        int i11 = i10 % 2;
        if (z10) {
            try {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str3);
                sb2.append(m2876("\u0000", -TextUtils.indexOf((CharSequence) "", '0', 0, 0), true, Color.rgb(0, 0, 0) + 16777217, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 103).intern());
                sb2.append(str);
                string = sb2.toString();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str2);
                sb3.append(m2876("\uffdfￗￗ\u001c\u001b&\u001a", (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 7, true, 2 - TextUtils.getTrimmedLength(""), 117 - View.combineMeasuredStates(0, 0)).intern());
                sb3.append(string);
                sb3.append(m2876("\u0000", '1' - AndroidCharacter.getMirror('0'), true, -TextUtils.lastIndexOf("", '0'), 86 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern());
                k.m2824(str, sb3.toString(), th2, z12);
                int i12 = f2967 + 63;
                f2968 = i12 % 128;
                int i13 = i12 % 2;
            } catch (Throwable unused) {
                return;
            }
        } else {
            string = str3;
        }
        az azVar = f2969.get();
        if ((azVar != null ? (char) 6 : 'F') != 'F') {
            azVar.m764(str, str2, string, Log.getStackTraceString(th2), jSONObject, z11);
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static void m2878(String str, String str2, String str3, Throwable th2) {
        int i10 = f2968 + 17;
        f2967 = i10 % 128;
        if (i10 % 2 == 0) {
        }
        try {
            m2883(str, str2, str3, th2, false);
            int i11 = f2968 + 121;
            f2967 = i11 % 128;
            if (i11 % 2 != 0) {
            } else {
                throw null;
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static void m2877(String str, String str2, String str3, String str4) {
        int i10;
        String string = "";
        try {
            if (TextUtils.isEmpty(str3)) {
                int i11 = f2967 + 107;
                f2968 = i11 % 128;
                if (i11 % 2 == 0) {
                    return;
                }
                try {
                    throw null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str3);
            sb2.append(m2876("\u0000", 1 - Color.blue(0), true, 1 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 102 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern());
            sb2.append(str);
            String string2 = sb2.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(m2876("\f\u0017\u000bￃ￨\u0015\u0015\u0012\u0015ￃ\u001a", 10 - Process.getGidForName(""), false, 4 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (-16777079) - Color.rgb(0, 0, 0)).intern());
            sb3.append(string2);
            sb3.append(m2876("\u0006\u0004\u0013\r\b\uffbfￍ\r\u000e\b\u0013\u0000\u0011", TextUtils.getCapsMode("", 0, 0) + 13, true, 6 - TextUtils.getTrimmedLength(""), Color.alpha(0) + 141).intern());
            k.m2828(str, sb3.toString(), false);
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str2);
            if (str4 != null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(m2876("\u0000", Color.alpha(0) + 1, true, Color.alpha(0) + 1, View.getDefaultSize(0, 0) + 54).intern());
                sb5.append(str4);
                string = sb5.toString();
                i10 = f2968 + 51;
            } else {
                i10 = f2968 + 109;
            }
            f2967 = i10 % 128;
            int i12 = i10 % 2;
            sb4.append(string);
            k.m2828(str, sb4.toString(), false);
            az azVar = f2969.get();
            if (azVar != null) {
                azVar.m768(str, str2, string2, str4);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2876(String str, int i10, boolean z10, int i11, int i12) {
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
                cArr2[i14] = (char) (cArr2[i14] - f2970);
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
