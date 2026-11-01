package com.ironsource.adqualitysdk.sdk.i;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class iv extends BroadcastReceiver {

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f2593 = 1;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f2594;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String f2595;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int[] f2596;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private Context f2597;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private boolean f2598 = false;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private Set<iu> f2599 = new HashSet();

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public static void m2520() {
        f2596 = new int[]{1327670354, -1341658831, 542698013, 1787449947, -734461109, -14954278, 218993377, 1412001391, 55029058, -1538574215, 326963627, -820688930, -1586025059, -1868220713, 494196336, 1092001671, 175100163, -50875469};
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private synchronized Set<iu> m2521() {
        HashSet hashSet = new HashSet(this.f2599);
        int i10 = f2593 + 99;
        f2594 = i10 % 128;
        if ((i10 % 2 != 0 ? '/' : (char) 5) == 5) {
            return hashSet;
        }
        int i11 = 8 / 0;
        return hashSet;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ boolean m2523(iv ivVar, Context context) {
        int i10 = f2593 + 23;
        f2594 = i10 % 128;
        int i11 = i10 % 2;
        boolean zM2526 = m2526(context);
        int i12 = f2593 + 37;
        f2594 = i12 % 128;
        if ((i12 % 2 != 0 ? (char) 1 : '@') != 1) {
            return zM2526;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ String m2524() {
        int i10 = f2593 + 89;
        int i11 = i10 % 128;
        f2594 = i11;
        int i12 = i10 % 2;
        String str = f2595;
        int i13 = i11 + 75;
        f2593 = i13 % 128;
        if (i13 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ void m2527(iv ivVar, boolean z10) {
        int i10 = f2594 + 125;
        f2593 = i10 % 128;
        boolean z11 = i10 % 2 == 0;
        ivVar.m2525(z10);
        if (z11) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final synchronized boolean m2530() {
        int i10 = f2594 + 75;
        f2593 = i10 % 128;
        if ((i10 % 2 == 0 ? 'O' : '\r') != '\r') {
            throw null;
        }
        return this.f2598;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m2533() {
        int i10 = f2594 + 51;
        f2593 = i10 % 128;
        int i11 = i10 % 2;
        this.f2597.unregisterReceiver(this);
        int i12 = f2594 + 13;
        f2593 = i12 % 128;
        if (!(i12 % 2 == 0)) {
            return;
        }
        int i13 = 26 / 0;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private synchronized void m2525(boolean z10) {
        int i10 = f2594;
        int i11 = i10 + 17;
        f2593 = i11 % 128;
        int i12 = i11 % 2;
        this.f2598 = z10;
        int i13 = i10 + 3;
        f2593 = i13 % 128;
        if ((i13 % 2 == 0 ? '[' : (char) 18) != 18) {
            throw null;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, final Intent intent) {
        t.m2995(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.iv.2

            /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
            private static int f2600 = 0;

            /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
            private static char f2601 = 34772;

            /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
            private static char f2602 = 11765;

            /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
            private static int f2603 = 1;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static char f2604 = 54483;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static char f2605 = 10665;

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static String m2535(String str, int i10) {
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
                                char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f2601)) ^ ((c11 >>> 5) + f2602)));
                                cArr3[1] = c12;
                                cArr3[0] = (char) (c11 - (((c12 >>> 5) + f2604) ^ ((c12 + i12) ^ ((c12 << 4) + f2605))));
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

            /* JADX WARN: Code duplicated, block: B:16:0x0055 A[Catch: Exception -> 0x00d4, TryCatch #1 {Exception -> 0x00d4, blocks: (B:4:0x0013, B:16:0x0055, B:18:0x0086, B:20:0x00a8, B:22:0x00b2, B:24:0x00bb, B:10:0x0034), top: B:37:0x0011 }] */
            /* JADX WARN: Code duplicated, block: B:18:0x0086 A[Catch: Exception -> 0x00d4, TryCatch #1 {Exception -> 0x00d4, blocks: (B:4:0x0013, B:16:0x0055, B:18:0x0086, B:20:0x00a8, B:22:0x00b2, B:24:0x00bb, B:10:0x0034), top: B:37:0x0011 }] */
            /* JADX WARN: Code duplicated, block: B:20:0x00a8 A[Catch: Exception -> 0x00d4, TryCatch #1 {Exception -> 0x00d4, blocks: (B:4:0x0013, B:16:0x0055, B:18:0x0086, B:20:0x00a8, B:22:0x00b2, B:24:0x00bb, B:10:0x0034), top: B:37:0x0011 }] */
            /* JADX WARN: Code duplicated, block: B:22:0x00b2 A[Catch: Exception -> 0x00d4, TryCatch #1 {Exception -> 0x00d4, blocks: (B:4:0x0013, B:16:0x0055, B:18:0x0086, B:20:0x00a8, B:22:0x00b2, B:24:0x00bb, B:10:0x0034), top: B:37:0x0011 }] */
            /* JADX WARN: Code duplicated, block: B:24:0x00bb A[Catch: Exception -> 0x00d4, TRY_LEAVE, TryCatch #1 {Exception -> 0x00d4, blocks: (B:4:0x0013, B:16:0x0055, B:18:0x0086, B:20:0x00a8, B:22:0x00b2, B:24:0x00bb, B:10:0x0034), top: B:37:0x0011 }] */
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                int i10 = f2600 + 83;
                f2603 = i10 % 128;
                try {
                    if (i10 % 2 == 0) {
                        if (!(!intent.getAction().equals(m2535("鍔㠨辑\u0a56ﺡ⸎Ὥ빋娖옰䔊갓쐋ㄝ역逴\udfdc雪䮋ꔾ寗\udece\uf800窥䵚몥ꖁ䪊罓傺㎺쩫糽뀄宸鮪", 7 % TextUtils.indexOf("", "")).intern()))) {
                            k.m2825(iv.m2524(), m2535("圬\ue07d륱죆엋쏽昵௭쐋ㄝ역逴ഞ᎓뻐\ue236柌텙樀괌ഫ\uf508頁墜\u2e7a暜䠉Ὕ", View.getDefaultSize(0, 0) + 27).intern());
                            if (intent.getBooleanExtra(m2535("\ue88bએ랺氭역逴ഞ᎓뻐\ue236柌텙樀괌", 14 - ExpandableListView.getPackedPositionGroup(0L)).intern(), false)) {
                                k.m2825(iv.m2524(), m2535("ట됂\uefeeŰ辡\u1a8c悆웝\ue88bએ⤧Ⴉ겿쇭ᮺ\ue7ac輺전ഫ\uf508㣇촐娖옰\uf777돖뱾鸾溽嫌뷎襛", 31 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern());
                                t.m3000(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.iv.2.4
                                    @Override // com.ironsource.adqualitysdk.sdk.i.ir
                                    /* JADX INFO: renamed from: ﾒ */
                                    public final void mo276() {
                                        iv.this.m2531();
                                        iv.m2527(iv.this, false);
                                    }
                                });
                                return;
                            } else {
                                if (iv.m2523(iv.this, context)) {
                                    t.m3000(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.iv.2.5
                                        @Override // com.ironsource.adqualitysdk.sdk.i.ir
                                        /* JADX INFO: renamed from: ﾒ */
                                        public final void mo276() {
                                            iv.m2527(iv.this, true);
                                            iv.this.m2529();
                                        }
                                    });
                                    return;
                                }
                                t.m3000(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.iv.2.1
                                    @Override // com.ironsource.adqualitysdk.sdk.i.ir
                                    /* JADX INFO: renamed from: ﾒ */
                                    public final void mo276() {
                                        iv.m2527(iv.this, false);
                                        iv.this.m2531();
                                    }
                                });
                            }
                        }
                    } else {
                        if ((intent.getAction().equals(m2535("鍔㠨辑\u0a56ﺡ⸎Ὥ빋娖옰䔊갓쐋ㄝ역逴\udfdc雪䮋ꔾ寗\udece\uf800窥䵚몥ꖁ䪊罓傺㎺쩫糽뀄宸鮪", TextUtils.indexOf("", "") + 36).intern()) ? 'O' : 'J') == 'O') {
                            k.m2825(iv.m2524(), m2535("圬\ue07d륱죆엋쏽昵௭쐋ㄝ역逴ഞ᎓뻐\ue236柌텙樀괌ഫ\uf508頁墜\u2e7a暜䠉Ὕ", View.getDefaultSize(0, 0) + 27).intern());
                            if (intent.getBooleanExtra(m2535("\ue88bએ랺氭역逴ഞ᎓뻐\ue236柌텙樀괌", 14 - ExpandableListView.getPackedPositionGroup(0L)).intern(), false)) {
                                k.m2825(iv.m2524(), m2535("ట됂\uefeeŰ辡\u1a8c悆웝\ue88bએ⤧Ⴉ겿쇭ᮺ\ue7ac輺전ഫ\uf508㣇촐娖옰\uf777돖뱾鸾溽嫌뷎襛", 31 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern());
                                t.m3000(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.iv.2.4
                                    @Override // com.ironsource.adqualitysdk.sdk.i.ir
                                    /* JADX INFO: renamed from: ﾒ */
                                    public final void mo276() {
                                        iv.this.m2531();
                                        iv.m2527(iv.this, false);
                                    }
                                });
                                return;
                            } else {
                                if (iv.m2523(iv.this, context)) {
                                    t.m3000(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.iv.2.5
                                        @Override // com.ironsource.adqualitysdk.sdk.i.ir
                                        /* JADX INFO: renamed from: ﾒ */
                                        public final void mo276() {
                                            iv.m2527(iv.this, true);
                                            iv.this.m2529();
                                        }
                                    });
                                    return;
                                }
                                t.m3000(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.iv.2.1
                                    @Override // com.ironsource.adqualitysdk.sdk.i.ir
                                    /* JADX INFO: renamed from: ﾒ */
                                    public final void mo276() {
                                        iv.m2527(iv.this, false);
                                        iv.this.m2531();
                                    }
                                });
                            }
                        }
                    }
                    int i11 = f2600 + 43;
                    f2603 = i11 % 128;
                    if (i11 % 2 == 0) {
                        int i12 = 79 / 0;
                    }
                } catch (Exception e10) {
                    kd.m2872(iv.m2524(), m2535("콘\ude45鰬㈅딵沮낸Թ偰呆㣣髌ഞ᎓鐝꣯እ纳", 18 - KeyEvent.keyCodeFromString("")).intern(), e10, false);
                }
            }
        });
        int i10 = f2593 + 59;
        f2594 = i10 % 128;
        int i11 = i10 % 2;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m2529() {
        Iterator<iu> it = m2521().iterator();
        while (true) {
            if (!it.hasNext()) {
                int i10 = f2593 + 29;
                f2594 = i10 % 128;
                int i11 = i10 % 2;
                return;
            } else {
                int i12 = f2594 + 25;
                f2593 = i12 % 128;
                int i13 = i12 % 2;
                it.next().mo394();
            }
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final synchronized void m2532(iu iuVar) {
        int i10 = f2594 + 77;
        f2593 = i10 % 128;
        int i11 = i10 % 2;
        this.f2599.remove(iuVar);
        int i12 = f2593 + 49;
        f2594 = i12 % 128;
        if (!(i12 % 2 == 0)) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized void m2534(iu iuVar) {
        int i10 = f2594 + 55;
        f2593 = i10 % 128;
        int i11 = i10 % 2;
        this.f2599.add(iuVar);
        int i12 = f2593 + 115;
        f2594 = i12 % 128;
        if ((i12 % 2 != 0 ? '8' : 'T') != 'T') {
            throw null;
        }
    }

    static {
        m2520();
        f2595 = m2528(new int[]{1680840310, -1147872975, 167404258, -2010743116, -335671392, -1762109579, 1814456296, -1829633020, -1467497195, 1498107812}, 20 - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern();
        int i10 = f2594 + 47;
        f2593 = i10 % 128;
        int i11 = i10 % 2;
    }

    public iv(Context context) {
        this.f2597 = context.getApplicationContext();
        k.m2809(f2595, m2528(new int[]{995112144, -839696886, 793125423, -823182672, -1891621481, -35567808, -1945032620, 1315422620, 1315402392, -1070529798, 1795521819, 622117249, -2128202635, 1774877377, -2024043855, 252286014}, AndroidCharacter.getMirror('0') - 18).intern());
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(m2528(new int[]{-2122701851, 1546060630, 712174246, -318067401, 14123920, 1721127285, 247592397, -212372362, 804305082, 389616605, -1178561709, 1762587455, 334432064, 1298451654, -593429956, 100212106, 342276724, 1645800780}, 36 - TextUtils.indexOf("", "")).intern());
        this.f2597.registerReceiver(this, intentFilter);
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static boolean m2526(Context context) {
        int i10 = f2594 + 103;
        f2593 = i10 % 128;
        if (i10 % 2 != 0) {
            NetworkInfo networkInfoM2522 = m2522(context);
            if (networkInfoM2522 == null || !networkInfoM2522.isConnected()) {
                return false;
            }
            String str = f2595;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m2528(new int[]{1680840310, -1147872975, 1401269269, -57271758}, 8 - KeyEvent.getDeadChar(0, 0)).intern());
            sb2.append(networkInfoM2522.getTypeName());
            sb2.append(m2528(new int[]{802974129, 1865419882, -1703191499, 2082952551, 1806828347, 721542486}, View.MeasureSpec.makeMeasureSpec(0, 0) + 11).intern());
            k.m2825(str, sb2.toString());
            int i11 = f2593 + 61;
            f2594 = i11 % 128;
            int i12 = i11 % 2;
            return true;
        }
        m2522(context);
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2528(int[] iArr, int i10) {
        String str;
        synchronized (e.f1912) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f2596.clone();
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

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m2531() {
        Iterator<iu> it;
        int i10;
        int i11 = f2594 + 121;
        f2593 = i11 % 128;
        if (!(i11 % 2 != 0)) {
            it = m2521().iterator();
            int i12 = 82 / 0;
        } else {
            it = m2521().iterator();
        }
        do {
            if (!(it.hasNext())) {
                return;
            }
            int i13 = f2594 + 91;
            f2593 = i13 % 128;
            i10 = i13 % 2;
            it.next();
        } while (i10 != 0);
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static NetworkInfo m2522(Context context) {
        if ((context != null ? 'F' : 'b') != 'b') {
            int i10 = f2594 + 47;
            f2593 = i10 % 128;
            int i11 = i10 % 2;
            return ((ConnectivityManager) context.getSystemService(m2528(new int[]{247592397, -212372362, -1244825590, -1813295031, -363167493, 1955524488}, 13 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern())).getActiveNetworkInfo();
        }
        int i12 = f2593 + 33;
        f2594 = i12 % 128;
        int i13 = i12 % 2;
        return null;
    }
}
