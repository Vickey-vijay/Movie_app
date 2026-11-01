package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.ironsource.G5;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class iz {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f2645 = 1;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f2646;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int[] f2647;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String f2648;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private String f2649;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private je f2650;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private iw f2651;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private List<Runnable> f2652 = new ArrayList();

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ List m2562(iz izVar) {
        int i10 = f2645 + 77;
        f2646 = i10 % 128;
        char c10 = i10 % 2 != 0 ? (char) 20 : '?';
        List<Runnable> list = izVar.f2652;
        if (c10 != '?') {
            int i11 = 63 / 0;
        }
        return list;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static void m2565() {
        f2647 = new int[]{121065588, -1754757506, 784996495, -1333470162, 354179686, -1782335970, 1737442105, 1110840147, -187628996, -703601206, -1825364032, 379884011, -371244155, 1672869358, 1701816979, -663646964, 1200330019, 572066613};
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ void m2566(iz izVar, jc jcVar, ip ipVar) {
        int i10 = f2645 + 49;
        f2646 = i10 % 128;
        int i11 = i10 % 2;
        izVar.m2563(jcVar, ipVar);
        int i12 = f2645 + 5;
        f2646 = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ je m2567(iz izVar) {
        int i10 = f2645;
        int i11 = i10 + 111;
        f2646 = i11 % 128;
        int i12 = i11 % 2;
        je jeVar = izVar.f2650;
        int i13 = i10 + 1;
        f2646 = i13 % 128;
        if ((i13 % 2 != 0 ? '#' : (char) 15) == 15) {
            return jeVar;
        }
        int i14 = 31 / 0;
        return jeVar;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ iw m2569(iz izVar) {
        int i10 = f2646;
        int i11 = i10 + 25;
        f2645 = i11 % 128;
        int i12 = i11 % 2;
        iw iwVar = izVar.f2651;
        int i13 = i10 + 53;
        f2645 = i13 % 128;
        if ((i13 % 2 == 0 ? 'W' : '\b') != 'W') {
            return iwVar;
        }
        int i14 = 22 / 0;
        return iwVar;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m2563(final jc jcVar, final ip ipVar) {
        String strMo2609 = jcVar.mo2609();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m2570());
        sb2.append(m2564(new int[]{-587791989, 1845260723}, View.combineMeasuredStates(0, 0) + 1).intern());
        sb2.append(strMo2609);
        final String string = sb2.toString();
        final String strM2606 = jcVar.m2606();
        if (ar.m483().mo516()) {
            int i10 = f2645 + 87;
            f2646 = i10 % 128;
            int i11 = i10 % 2;
            if ((!ar.m483().mo510() ? G5.T : '4') != '4') {
                int i12 = f2645 + 125;
                f2646 = i12 % 128;
                if (!(i12 % 2 == 0)) {
                    this.f2650.m2637(strM2606);
                    try {
                        throw null;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                } else if (this.f2650.m2637(strM2606) != null) {
                    return;
                }
            }
            jx.m2782(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.iz.5

                /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
                private static int f2657 = 1;

                /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
                private static char f2658 = 65152;

                /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
                private static char f2659 = 31284;

                /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
                private static char f2660 = 37033;

                /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
                private static int f2661 = 0;

                /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
                private static char f2662 = 33852;

                /* JADX WARN: Code restructure failed: missing block: B:29:0x0063, code lost:
                
                    if (r5.m2514().m2517() == 200) goto L30;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:36:0x00bb, code lost:
                
                    if (java.nio.charset.Charset.forName(m2577("嫑맰멧㿎ᇲ풔뒃㜎", android.graphics.Color.green(0) + 8).intern()).newEncoder().canEncode(r5) == false) goto L37;
                 */
                /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                private void m2575(java.lang.String r10, com.ironsource.adqualitysdk.sdk.i.jc r11, java.lang.String r12, com.ironsource.adqualitysdk.sdk.i.ip r13) {
                    /*
                        Method dump skipped, instruction units count: 475
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.iz.AnonymousClass5.m2575(java.lang.String, com.ironsource.adqualitysdk.sdk.i.jc, java.lang.String, com.ironsource.adqualitysdk.sdk.i.ip):void");
                }

                @Override // com.ironsource.adqualitysdk.sdk.i.ir
                /* JADX INFO: renamed from: ﾒ */
                public final void mo276() {
                    int i13 = f2657 + 101;
                    f2661 = i13 % 128;
                    if ((i13 % 2 != 0 ? (char) 0 : 'P') == 'P') {
                        m2575(string, jcVar, strM2606, ipVar);
                    } else {
                        m2575(string, jcVar, strM2606, ipVar);
                        throw null;
                    }
                }

                /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                private static String m2576(String str) throws JSONException {
                    JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit(str);
                    String strOptString = jSONObjectJsonObjectInit.optString(m2577("\ue16b㢂츏㕆", 3 - View.MeasureSpec.getMode(0)).intern());
                    if ((TextUtils.isEmpty(strOptString) ? 'W' : '\b') != 'W') {
                        return jx.m2779(strOptString, iz.m2568(), jSONObjectJsonObjectInit.optString(m2577("酫쳉", 1 - ((byte) KeyEvent.getModifierMetaStateMask())).intern()), jSONObjectJsonObjectInit.optString(m2577("᩸㏽䅛⦮", (Process.myTid() >> 22) + 4).intern()));
                    }
                    int i13 = f2661;
                    int i14 = i13 + 109;
                    f2657 = i14 % 128;
                    if (i14 % 2 == 0) {
                        throw null;
                    }
                    int i15 = i13 + 73;
                    f2657 = i15 % 128;
                    if (i15 % 2 != 0) {
                        return str;
                    }
                    int i16 = 86 / 0;
                    return str;
                }

                /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                private static String m2577(String str, int i13) {
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
                            int i14 = n.f2991;
                            if (i14 < cArr.length) {
                                cArr3[0] = cArr[i14];
                                cArr3[1] = cArr[i14 + 1];
                                int i15 = 58224;
                                for (int i16 = 0; i16 < 16; i16++) {
                                    char c10 = cArr3[1];
                                    char c11 = cArr3[0];
                                    char c12 = (char) (c10 - (((c11 + i15) ^ ((c11 << 4) + f2660)) ^ ((c11 >>> 5) + f2659)));
                                    cArr3[1] = c12;
                                    cArr3[0] = (char) (c11 - (((c12 >>> 5) + f2662) ^ ((c12 + i15) ^ ((c12 << 4) + f2658))));
                                    i15 -= 40503;
                                }
                                int i17 = n.f2991;
                                cArr2[i17] = cArr3[0];
                                cArr2[i17 + 1] = cArr3[1];
                                n.f2991 = i17 + 2;
                            } else {
                                str2 = new String(cArr2, 0, i13);
                            }
                        }
                    }
                    return str2;
                }

                /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                private void m2574(final jc jcVar2, final ip ipVar2) {
                    iz.m2569(iz.this).m2542().m2534(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.iz.5.5
                        @Override // com.ironsource.adqualitysdk.sdk.i.iu
                        /* JADX INFO: renamed from: ﻛ */
                        public final void mo394() {
                            iz.m2569(iz.this).m2542().m2532(this);
                            iz.m2566(iz.this, jcVar2, ipVar2);
                        }
                    });
                    int i13 = f2661 + 71;
                    f2657 = i13 % 128;
                    int i14 = i13 % 2;
                }
            });
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ String m2568() {
        int i10 = f2646 + 113;
        int i11 = i10 % 128;
        f2645 = i11;
        int i12 = i10 % 2;
        String str = f2648;
        int i13 = i11 + 57;
        f2646 = i13 % 128;
        if ((i13 % 2 != 0 ? '(' : (char) 5) != '(') {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private synchronized String m2570() {
        String str;
        int i10 = f2645;
        int i11 = i10 + 33;
        f2646 = i11 % 128;
        if ((i11 % 2 != 0 ? 'U' : (char) 24) != 'U') {
            str = this.f2649;
        } else {
            str = this.f2649;
            int i12 = 30 / 0;
        }
        int i13 = i10 + 45;
        f2646 = i13 % 128;
        int i14 = i13 % 2;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if ((r3.f2650.m2637(r4.m2606()) != null ? 'C' : '*') != '*') goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0037, code lost:
    
        if ((r3.f2650.m2637(r4.m2606()) == null) != true) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
    
        r4 = com.ironsource.adqualitysdk.sdk.i.iz.f2646 + 19;
        com.ironsource.adqualitysdk.sdk.i.iz.f2645 = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0043, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        r4 = com.ironsource.adqualitysdk.sdk.i.iz.f2645 + 17;
        com.ironsource.adqualitysdk.sdk.i.iz.f2646 = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004e, code lost:
    
        return false;
     */
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m2571(com.ironsource.adqualitysdk.sdk.i.jc r4) {
        /*
            r3 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.iz.f2646
            int r0 = r0 + 55
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.iz.f2645 = r1
            int r0 = r0 % 2
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L28
            java.lang.String r4 = r4.m2606()
            com.ironsource.adqualitysdk.sdk.i.je r0 = r3.f2650
            java.lang.String r4 = r0.m2637(r4)
            r0 = 64
            int r0 = r0 / r2
            r0 = 42
            if (r4 == 0) goto L22
            r4 = 67
            goto L23
        L22:
            r4 = r0
        L23:
            if (r4 == r0) goto L44
            goto L39
        L26:
            r4 = move-exception
            throw r4
        L28:
            java.lang.String r4 = r4.m2606()
            com.ironsource.adqualitysdk.sdk.i.je r0 = r3.f2650
            java.lang.String r4 = r0.m2637(r4)
            if (r4 == 0) goto L36
            r4 = r2
            goto L37
        L36:
            r4 = r1
        L37:
            if (r4 == r1) goto L44
        L39:
            int r4 = com.ironsource.adqualitysdk.sdk.i.iz.f2646
            int r4 = r4 + 19
            int r0 = r4 % 128
            com.ironsource.adqualitysdk.sdk.i.iz.f2645 = r0
            int r4 = r4 % 2
            return r1
        L44:
            int r4 = com.ironsource.adqualitysdk.sdk.i.iz.f2645
            int r4 = r4 + 17
            int r0 = r4 % 128
            com.ironsource.adqualitysdk.sdk.i.iz.f2646 = r0
            int r4 = r4 % 2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.iz.m2571(com.ironsource.adqualitysdk.sdk.i.jc):boolean");
    }

    static {
        boolean z10;
        m2565();
        f2648 = m2564(new int[]{1266975715, -1449402714, 1843604259, -697687125, 132449138, -1260791608, -576055396, 1306205703, -1866143178, 2059488178, 1207583196, 1209526275, 572684741, 1188270581, -526816565, -363126219, -799026435, 63199240, 573207097, -146954207, 1543926893, 1455605071, 1199699856, 1196792807, 1444576168, 1865948453, 1127852407, 1212879414, -1684496068, 270357911, 1266927628, 2105559770, -984470594, -1611639142, 1972910697, 1847046555}, 70 - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern();
        int i10 = f2646 + 93;
        f2645 = i10 % 128;
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

    public iz(Context context, iw iwVar, String str) {
        this.f2650 = new je(context, m2564(new int[]{517619062, -1831862112, 686499006, 251667173, 20914338, 240550458, 1943777681, -61446972, 1548753051, 768621586, -1200815215, -414716274}, TextUtils.lastIndexOf("", '0') + 25).intern(), m2564(new int[]{-964332785, 1682472256, 2010953171, 2011532084, -1615299659, 1596623536, -504167231, -287159301, 709675888, -539290917}, TextUtils.lastIndexOf("", '0', 0) + 18).intern());
        this.f2651 = iwVar;
        this.f2649 = str;
        ar.m483().mo507(new av() { // from class: com.ironsource.adqualitysdk.sdk.i.iz.2
            @Override // com.ironsource.adqualitysdk.sdk.i.av
            /* JADX INFO: renamed from: ﾒ */
            public final void mo317() {
                ArrayList arrayList;
                synchronized (this) {
                    arrayList = new ArrayList(iz.m2562(iz.this));
                    iz.m2562(iz.this).clear();
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
            }
        });
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final String m2573(String str, String str2, ip ipVar) {
        jc.d dVar = new jc.d(str, str2);
        if (ar.m483().mo497().m480()) {
            int i10 = f2645 + 39;
            f2646 = i10 % 128;
            int i11 = i10 % 2;
            String strM482 = ar.m483().mo497().m482(str);
            if (!(!TextUtils.isEmpty(strM482))) {
                int i12 = f2645 + 119;
                f2646 = i12 % 128;
                if ((i12 % 2 != 0 ? '-' : (char) 28) != '-') {
                    return null;
                }
                int i13 = 80 / 0;
                return null;
            }
            dVar = new jc.b(str, str2, strM482);
        }
        return m2572(dVar, ipVar);
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2564(int[] iArr, int i10) {
        String str;
        synchronized (e.f1912) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f2647.clone();
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

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final String m2572(final jc jcVar, final ip ipVar) {
        if (TextUtils.isEmpty(jcVar.m2604()) || TextUtils.isEmpty(jcVar.m2607())) {
            return null;
        }
        String strM2606 = jcVar.m2606();
        boolean z10 = true;
        synchronized (this) {
            if (!ar.m483().mo503()) {
                z10 = false;
                this.f2652.add(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.iz.1
                    @Override // com.ironsource.adqualitysdk.sdk.i.ir
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo276() {
                        iz.m2566(iz.this, jcVar, ipVar);
                    }
                });
            }
        }
        if (z10) {
            m2563(jcVar, ipVar);
        }
        return this.f2650.m2637(strM2606);
    }
}
