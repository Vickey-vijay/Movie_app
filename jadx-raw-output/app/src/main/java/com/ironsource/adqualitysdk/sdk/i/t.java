package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;

/* JADX INFO: loaded from: classes2.dex */
public final class t {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f3089 = 0;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f3090 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char f3091;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static long f3092;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static final Handler f3093;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static final Handler f3094;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f3095;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static void m2991(ir irVar) {
        int i10 = f3089 + 73;
        f3090 = i10 % 128;
        int i11 = i10 % 2;
        if ((m2997() ? 'M' : (char) 30) != 'M') {
            irVar.run();
            int i12 = f3089 + 67;
            f3090 = i12 % 128;
            int i13 = i12 % 2;
            return;
        }
        int i14 = f3089 + 101;
        f3090 = i14 % 128;
        int i15 = i14 % 2;
        m2995(irVar);
        int i16 = f3090 + 65;
        f3089 = i16 % 128;
        int i17 = i16 % 2;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static void m2993(ir irVar) {
        int i10 = f3090 + 55;
        f3089 = i10 % 128;
        try {
            if (i10 % 2 == 0) {
                m3001().post(irVar);
            } else {
                m3001().post(irVar);
                throw null;
            }
        } catch (Error unused) {
            k.m2828(m2998((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), "꒴\uedd4쏊ᙞ讅윒\uf2f4專\ue01e\uab1d佰눻", "옫㟒❋昍", "\u0000\u0000\u0000\u0000", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1).intern(), m2998((char) (64347 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), "㪢얫\ue410\udca9下᠅梨을\ue080\uf5d5\udcbd\udfde瞏篢ꈤ곅\ue9faℏ籌䣙\uf8a0蒧☠䛡茮唦戸ݾ뗾", "ꀴ\uf8de寊\uddfb", "\u0000\u0000\u0000\u0000", ((byte) KeyEvent.getModifierMetaStateMask()) - 889659743).intern(), false);
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static void m2995(ir irVar) {
        int i10 = f3089 + 111;
        f3090 = i10 % 128;
        int i11 = i10 % 2;
        try {
            m2990().post(irVar);
            int i12 = f3089 + 103;
            f3090 = i12 % 128;
            if (!(i12 % 2 == 0)) {
            } else {
                throw null;
            }
        } catch (Error unused) {
            k.m2828(m2998((char) View.resolveSizeAndState(0, 0, 0), "꒴\uedd4쏊ᙞ讅윒\uf2f4專\ue01e\uab1d佰눻", "옫㟒❋昍", "\u0000\u0000\u0000\u0000", ViewConfiguration.getWindowTouchSlop() >> 8).intern(), m2998((char) (ViewConfiguration.getScrollBarSize() >> 8), "\u07b7嬻⳯ხ徖眫侀ȅ巀댮◑皒ꉞ\ue407䶉Ĉ㰂\uf10e\udb4e➳\ue6e0⯶≑Ἲ·⇳ﴴ㏓菙낫拪湐\u0adf\uf2c1災螵", "\uf7f7\uf418赙߸", "\u0000\u0000\u0000\u0000", TextUtils.indexOf("", "")).intern(), false);
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static void m2999() {
        f3092 = 0L;
        f3095 = 0;
        f3091 = (char) 35452;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static void m3000(ir irVar) {
        int i10 = f3090 + 57;
        f3089 = i10 % 128;
        if ((i10 % 2 != 0 ? 'H' : (char) 2) == 'H') {
            m2997();
            throw null;
        }
        if (m2997()) {
            irVar.run();
            return;
        }
        m2993(irVar);
        int i11 = f3090 + 59;
        f3089 = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static Handler m3001() {
        int i10 = f3090 + 91;
        int i11 = i10 % 128;
        f3089 = i11;
        int i12 = i10 % 2;
        Handler handler = f3093;
        int i13 = i11 + 41;
        f3090 = i13 % 128;
        if (i13 % 2 != 0) {
            return handler;
        }
        throw null;
    }

    static {
        boolean z10;
        m2999();
        f3093 = new Handler(Looper.getMainLooper());
        f3094 = m2992();
        int i10 = f3089 + 31;
        f3090 = i10 % 128;
        if (i10 % 2 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static void m2994(ir irVar, long j10) {
        int i10 = f3090 + 111;
        f3089 = i10 % 128;
        int i11 = i10 % 2;
        try {
            m3001().postDelayed(irVar, j10);
            int i12 = f3090 + 99;
            f3089 = i12 % 128;
            if (!(i12 % 2 != 0)) {
                return;
            }
            int i13 = 96 / 0;
        } catch (Error unused) {
            k.m2828(m2998((char) KeyEvent.getDeadChar(0, 0), "꒴\uedd4쏊ᙞ讅윒\uf2f4專\ue01e\uab1d佰눻", "옫㟒❋昍", "\u0000\u0000\u0000\u0000", Color.alpha(0)).intern(), m2998((char) (AndroidCharacter.getMirror('0') - '0'), "禯娺ၢስ㎬酣\uf6fa湲\uf1b4죙嗸彄齂旪\ueae5孾舸峙災韢\uea9aၖ\ua956\ud98a늩\ue3e4⣲ፗ㊆靜᪆\uaaca⯸폭㌎猒ꓼ", "䂔捰\uf32fᓏ", "\u0000\u0000\u0000\u0000", ((byte) KeyEvent.getModifierMetaStateMask()) + 795045953).intern(), false);
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static void m2996(ir irVar, long j10) {
        int i10 = f3089 + 117;
        f3090 = i10 % 128;
        try {
            if ((i10 % 2 == 0 ? 'I' : 'c') == 'c') {
                m2990().postDelayed(irVar, j10);
                int i11 = f3090 + 123;
                f3089 = i11 % 128;
                int i12 = i11 % 2;
                return;
            }
            m2990().postDelayed(irVar, j10);
            throw null;
        } catch (Error unused) {
            k.m2828(m2998((char) (ViewConfiguration.getFadingEdgeLength() >> 16), "꒴\uedd4쏊ᙞ讅윒\uf2f4專\ue01e\uab1d佰눻", "옫㟒❋昍", "\u0000\u0000\u0000\u0000", Drawable.resolveOpacity(0, 0)).intern(), m2998((char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), "\u07b7嬻⳯ხ徖眫侀ȅ巀댮◑皒ꉞ\ue407䶉Ĉ㰂\uf10e\udb4e➳\ue6e0⯶≑Ἲ·⇳ﴴ㏓菙낫拪湐\u0adf\uf2c1災螵", "\uf7f7\uf418赙߸", "\u0000\u0000\u0000\u0000", (-1) - ExpandableListView.getPackedPositionChild(0L)).intern(), false);
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static Handler m2990() {
        int i10 = f3089 + 85;
        f3090 = i10 % 128;
        if ((i10 % 2 == 0 ? '&' : (char) 22) != '&') {
            return f3094;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static Handler m2992() {
        try {
            HandlerThread handlerThread = new HandlerThread(m2998((char) View.MeasureSpec.getSize(0), "䮗튄稺켉캤緑䄝벭㏙\ud7fc", "ﰕ瞺\ud97dﻴ", "\u0000\u0000\u0000\u0000", TextUtils.getOffsetAfter("", 0)).intern());
            for (int i10 = 0; i10 < 3; i10++) {
                try {
                    handlerThread.start();
                    return new Handler(handlerThread.getLooper());
                } catch (Error unused) {
                    k.m2828(m2998((char) (Process.getGidForName("") + 1), "꒴\uedd4쏊ᙞ讅윒\uf2f4專\ue01e\uab1d佰눻", "옫㟒❋昍", "\u0000\u0000\u0000\u0000", KeyEvent.getMaxKeyCode() >> 16).intern(), m2998((char) TextUtils.indexOf("", "", 0, 0), "ꭴ몹務ᦉ㬉꼜葊ꖊꭰᕾ棑顓\ud89c뾷졻癪⊝䗶䁁疦삓륔｛癡駒缿썹槪ᾱ펇\uf898㼅鑇껨\u2d72儆㾖⚄⌼ꛣ骾꿿겿遵㒕п\uf257냡", "\ueaa3\u086dㆴꎲ", "\u0000\u0000\u0000\u0000", ViewConfiguration.getKeyRepeatDelay() >> 16).intern(), true);
                }
            }
            int i11 = f3090 + 111;
            f3089 = i11 % 128;
            int i12 = i11 % 2;
        } catch (Error unused2) {
            k.m2828(m2998((char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), "꒴\uedd4쏊ᙞ讅윒\uf2f4專\ue01e\uab1d佰눻", "옫㟒❋昍", "\u0000\u0000\u0000\u0000", (Process.getThreadPriority(0) + 20) >> 6).intern(), m2998((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), "ⶫ厄깊ꃵದ䅚⬎ท䷬鮗퍾꺛\udb2bᆛﰃ\uf37d痧彏庪숋\uf750吻\uf09d㫌모脕ㆼ\udc5b㱤䗱椇鳺粸硁焘", "油⌭㐔䷆", "\u0000\u0000\u0000\u0000", 337849708 - (ViewConfiguration.getFadingEdgeLength() >> 16)).intern(), true);
        }
        int i13 = f3090 + 85;
        f3089 = i13 % 128;
        if (!(i13 % 2 != 0)) {
            return null;
        }
        int i14 = 55 / 0;
        return null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2998(char c10, String str, String str2, String str3, int i10) {
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
            char[] cArr4 = (char[]) cArr2.clone();
            char[] cArr5 = (char[]) cArr.clone();
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
                    cArr6[i15] = (char) (((((long) (c12 ^ cArr3[i15])) ^ f3092) ^ ((long) f3095)) ^ ((long) f3091));
                    j.f2675 = i15 + 1;
                } else {
                    str4 = new String(cArr6);
                }
            }
        }
        return str4;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static boolean m2997() {
        int i10 = f3089 + 45;
        f3090 = i10 % 128;
        if ((i10 % 2 == 0 ? 'I' : 'T') == 'I') {
            Looper.myLooper();
            Looper.getMainLooper();
            throw null;
        }
        if ((Looper.myLooper() == Looper.getMainLooper() ? (char) 24 : '\"') == '\"') {
            return false;
        }
        int i11 = f3089 + 123;
        f3090 = i11 % 128;
        if (i11 % 2 != 0) {
            return true;
        }
        throw null;
    }
}
