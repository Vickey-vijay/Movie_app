package com.ironsource.adqualitysdk.sdk.i;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import java.io.UnsupportedEncodingException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class iw {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f2612 = {'9', 'k', 'f', 'd', 'g', 'g', 'W', '\\', 'n', 'p', 's', 'u', 'l', 'Y', '*', 'a', 'g', 'a', 'g', 'h', 'B', 'J', 'q', 'G', 'H', 'o', 'q', 's', 'J', 'A', 'l', 't', 's', 'q', 'n', 'F', 'I', 'k', 'k', 's', 'm', 'l', 's', 'J', 'B', 'g', 'n', 'n', 'f', 'k', 'I', ':', 'S', 'O', '6', 'G', 'p', 'I', 'I', 'k', 'l', 'q', 'o', 'n', 'p', 'l', 'V', 'T', 'g', 'i', 'h', 'h', 'k', 'I', 'K', 'n', 'k', 'k', 'B', 'G', 'n', 'q', 'J', 'H', 'q', 'p', 'r', 'o', 'f', 'd', 'd', 277, 276, 262, 278, 274, 262, 243, 262, 268, 272, 279, 271, 266, 193, 272, 277, 193, 261, 262, 266, 275, 277, 193, 262, 271, 272, 262, 270, 272, 244, 271, 280, 272, 261, 277, 278, 265, 276, 193, 276, 258, 280, 193, 275, 262, 264, 258, 271, 258, 238, 268, 275, 272, 280, 277, 262, 239, 193, 271, 262, 265, 280, 193};

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2613 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2614;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private boolean f2615 = false;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private final iv f2616;

    public interface e {
        /* JADX INFO: renamed from: ﾇ */
        iq mo2543();
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ iv m2536(iw iwVar) {
        int i10 = f2614 + 37;
        f2613 = i10 % 128;
        boolean z10 = i10 % 2 == 0;
        iv ivVar = iwVar.f2616;
        if (z10) {
            throw null;
        }
        return ivVar;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ void m2539(iw iwVar, iy iyVar, e eVar) {
        int i10 = f2613 + 99;
        f2614 = i10 % 128;
        int i11 = i10 % 2;
        iwVar.m2538(iyVar, eVar);
        int i12 = f2614 + 101;
        f2613 = i12 % 128;
        if (i12 % 2 != 0) {
            return;
        }
        int i13 = 94 / 0;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2537(int[] iArr, String str, boolean z10) throws UnsupportedEncodingException {
        String str2;
        Object bytes = str;
        if (str != null) {
            bytes = str.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        synchronized (i.f2448) {
            int i10 = iArr[0];
            int i11 = iArr[1];
            int i12 = iArr[2];
            int i13 = iArr[3];
            char[] cArr = new char[i11];
            System.arraycopy(f2612, i10, cArr, 0, i11);
            if (bArr != null) {
                char[] cArr2 = new char[i11];
                i.f2447 = 0;
                char c10 = 0;
                while (true) {
                    int i14 = i.f2447;
                    if (i14 >= i11) {
                        break;
                    }
                    if (bArr[i14] == 1) {
                        cArr2[i14] = (char) (((cArr[i14] << 1) + 1) - c10);
                    } else {
                        cArr2[i14] = (char) ((cArr[i14] << 1) - c10);
                    }
                    c10 = cArr2[i14];
                    i.f2447 = i14 + 1;
                }
                cArr = cArr2;
            }
            if (i13 > 0) {
                char[] cArr3 = new char[i11];
                System.arraycopy(cArr, 0, cArr3, 0, i11);
                int i15 = i11 - i13;
                System.arraycopy(cArr3, 0, cArr, i15, i13);
                System.arraycopy(cArr3, i13, cArr, 0, i15);
            }
            if (z10) {
                char[] cArr4 = new char[i11];
                i.f2447 = 0;
                while (true) {
                    int i16 = i.f2447;
                    if (i16 >= i11) {
                        break;
                    }
                    cArr4[i16] = cArr[(i11 - i16) - 1];
                    i.f2447 = i16 + 1;
                }
                cArr = cArr4;
            }
            if (i12 > 0) {
                i.f2447 = 0;
                while (true) {
                    int i17 = i.f2447;
                    if (i17 >= i11) {
                        break;
                    }
                    cArr[i17] = (char) (cArr[i17] - iArr[2]);
                    i.f2447 = i17 + 1;
                }
            }
            str2 = new String(cArr);
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m2538(final iy iyVar, final e eVar) {
        int i10 = f2614 + 47;
        f2613 = i10 % 128;
        int i11 = i10 % 2;
        if (!(!this.f2615)) {
            k.m2810(m2537(new int[]{0, 14, 0, 0}, "\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001", true).intern(), m2537(new int[]{91, 63, 161, 30}, null, true).intern());
            int i12 = f2614 + 5;
            f2613 = i12 % 128;
            if (i12 % 2 != 0) {
                return;
            } else {
                throw null;
            }
        }
        jx.m2782(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.iw.4

            /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
            private static int f2619 = 1;

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static int f2620 = 0;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static long f2621 = -2129765469319968211L;

            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                int i13 = f2619 + 57;
                f2620 = i13 % 128;
                int i14 = i13 % 2;
                m2545(iyVar, eVar);
                int i15 = f2620 + 1;
                f2619 = i15 % 128;
                int i16 = i15 % 2;
            }

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private void m2544(final iy iyVar2, final e eVar2) {
                iw.m2536(iw.this).m2534(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.iw.4.1
                    @Override // com.ironsource.adqualitysdk.sdk.i.iu
                    /* JADX INFO: renamed from: ﻛ */
                    public final void mo394() {
                        iw.m2536(iw.this).m2532(this);
                        iw.m2539(iw.this, iyVar2, eVar2);
                    }
                });
                int i13 = f2619 + 55;
                f2620 = i13 % 128;
                int i14 = i13 % 2;
            }

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private void m2545(final iy iyVar2, e eVar2) {
                int i13 = f2619 + 79;
                f2620 = i13 % 128;
                int i14 = i13 % 2;
                if (!iw.m2536(iw.this).m2530()) {
                    int i15 = f2620 + 103;
                    f2619 = i15 % 128;
                    int i16 = i15 % 2;
                    m2544(iyVar2, eVar2);
                    return;
                }
                try {
                    final iq iqVarMo2543 = eVar2.mo2543();
                    if (iqVarMo2543 == null) {
                        t.m3000(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.iw.4.3

                            /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
                            private static int f2628 = 0;

                            /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
                            private static int f2629 = 1;

                            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                            private static long f2630 = 0;

                            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                            private static char f2631 = 55618;

                            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                            private static int f2632;

                            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                            private static String m2547(String str, char c10, String str2, int i17, String str3) {
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
                                    char[] cArr4 = (char[]) cArr.clone();
                                    char[] cArr5 = (char[]) cArr2.clone();
                                    cArr4[0] = (char) (c10 ^ cArr4[0]);
                                    cArr5[2] = (char) (cArr5[2] + ((char) i17));
                                    int length = cArr3.length;
                                    char[] cArr6 = new char[length];
                                    j.f2675 = 0;
                                    while (true) {
                                        int i18 = j.f2675;
                                        if (i18 < length) {
                                            int i19 = (i18 + 2) % 4;
                                            int i20 = (i18 + 3) % 4;
                                            int i21 = cArr4[i18 % 4] * 32718;
                                            char c11 = cArr5[i19];
                                            char c12 = (char) ((i21 + c11) % 65535);
                                            j.f2674 = c12;
                                            cArr5[i20] = (char) (((cArr4[i20] * 32718) + c11) / 65535);
                                            cArr4[i20] = c12;
                                            int i22 = j.f2675;
                                            cArr6[i22] = (char) (((((long) (c12 ^ cArr3[i22])) ^ f2630) ^ ((long) f2632)) ^ ((long) f2631));
                                            j.f2675 = i22 + 1;
                                        } else {
                                            str4 = new String(cArr6);
                                        }
                                    }
                                }
                                return str4;
                            }

                            @Override // com.ironsource.adqualitysdk.sdk.i.ir
                            /* JADX INFO: renamed from: ﾒ */
                            public final void mo276() throws Exception {
                                int iM2517;
                                iq iqVar = iqVarMo2543;
                                if ((iqVar != null ? (char) 3 : 'a') != 3) {
                                    iM2517 = -1;
                                } else {
                                    iM2517 = iqVar.m2514().m2517();
                                    int i17 = f2628 + 61;
                                    f2629 = i17 % 128;
                                    int i18 = i17 % 2;
                                }
                                iy iyVar3 = iyVar2;
                                iq iqVar2 = iqVarMo2543;
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(m2547("堏\ud9a0\u007f覬ꂷ旆륐㍣睌샪죽ꨲ균㩖ᛀ墟柉\udc2aݾꞸ鴆뗚톕\ue753\ue0aa꽠粄뵶\ue40c䭝蹫꣎ߞ\ue7f3鮉坪䛬퍊쒨\ue2cf鮙솵㉬ﾕծ䘗\uda5eͼၫ頥솬笫鉣䱁\ue579틈떢⑥큚樂픒듭毴\uf175\u0b0d궝냫\ueece嶩", (char) (Color.argb(0, 0, 0, 0) + 4393), "\u0000\u0000\u0000\u0000", View.combineMeasuredStates(0, 0) - 1047993655, "즰裢⧁\uf111").intern());
                                sb2.append(iM2517);
                                iyVar3.mo388(iqVar2, sb2.toString());
                                int i19 = f2628 + 93;
                                f2629 = i19 % 128;
                                if (!(i19 % 2 == 0)) {
                                } else {
                                    throw null;
                                }
                            }
                        });
                        return;
                    }
                    String strM2561 = ix.m2561(iqVarMo2543);
                    String strIntern = m2546("溩滧쀄핒詌儍䅼追䙲늗样噻㾠寿ヱ纅ᓐп", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(m2546("\ud9d7\ud990ᘡ蹀屣綳ᩮꌔ\uf102擠㌽竽補跗毧刯ꎸ퉈聄╵筴窱뤅ﲊሠϵ톾ퟞ\u2d9d⠫ڿ꼬안煝㽴蚶鰒馞垚姣럪껔貆ㅈ亻\uf775ꕖ\u085d晑Ῠ", View.MeasureSpec.getSize(0) + 1).intern());
                    sb2.append(strM2561);
                    k.m2809(strIntern, sb2.toString());
                    t.m3000(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.iw.4.4
                        @Override // com.ironsource.adqualitysdk.sdk.i.ir
                        /* JADX INFO: renamed from: ﾒ */
                        public final void mo276() throws Exception {
                            iyVar2.mo387(iqVarMo2543);
                        }
                    });
                } catch (Exception e10) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(m2546("䝵䜠졘桗舛⊅ﱬﱠ澭뫜핹◊ᙲ叭跦ഏ㴇\u0c75昁穅\ue5d0ⓖ弉ꎽ貜\uddc9㟻裫댼\uf648\ue0a0\uf049寭꽡", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern());
                    sb3.append(e10.getLocalizedMessage());
                    iyVar2.mo388(null, sb3.toString());
                }
            }

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static String m2546(String str, int i13) {
                String str2;
                Object charArray = str;
                if (str != null) {
                    charArray = str.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                synchronized (h.f2284) {
                    char[] cArrM2243 = h.m2243(f2621, cArr, i13);
                    h.f2285 = 4;
                    while (true) {
                        int i14 = h.f2285;
                        if (i14 < cArrM2243.length) {
                            h.f2283 = i14 - 4;
                            int i15 = h.f2285;
                            cArrM2243[i15] = (char) (((long) (cArrM2243[i15] ^ cArrM2243[i15 % 4])) ^ (((long) h.f2283) * f2621));
                            h.f2285++;
                        } else {
                            str2 = new String(cArrM2243, 4, cArrM2243.length - 4);
                        }
                    }
                }
                return str2;
            }
        });
        int i13 = f2614 + 45;
        f2613 = i13 % 128;
        if (!(i13 % 2 == 0)) {
            return;
        }
        int i14 = 26 / 0;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m2541() {
        int i10 = f2613 + 77;
        f2614 = i10 % 128;
        int i11 = i10 % 2;
        this.f2616.m2533();
        this.f2615 = true;
        int i12 = f2614 + 23;
        f2613 = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final iv m2542() {
        int i10 = f2614;
        int i11 = i10 + 87;
        f2613 = i11 % 128;
        int i12 = i11 % 2;
        iv ivVar = this.f2616;
        int i13 = i10 + 115;
        f2613 = i13 % 128;
        int i14 = i13 % 2;
        return ivVar;
    }

    public iw(Context context) {
        this.f2616 = new iv(context.getApplicationContext());
    }

    @TargetApi(3)
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m2540(final String str, final JSONObject jSONObject, iy iyVar) {
        boolean z10;
        boolean z11 = false;
        if (TextUtils.isEmpty(str)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            m2538(iyVar, new e() { // from class: com.ironsource.adqualitysdk.sdk.i.iw.2
                @Override // com.ironsource.adqualitysdk.sdk.i.iw.e
                /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                public final iq mo2543() {
                    return ix.m2550(jSONObject, str);
                }
            });
            return;
        }
        int i10 = f2613 + 23;
        f2614 = i10 % 128;
        int i11 = i10 % 2;
        k.m2808(m2537(new int[]{0, 14, 0, 0}, "\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001", true).intern(), m2537(new int[]{14, 77, 0, 0}, "\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001", false).intern());
        int i12 = f2614 + 61;
        f2613 = i12 % 128;
        if (i12 % 2 == 0) {
            z11 = true;
        }
        if (!z11) {
        } else {
            throw null;
        }
    }
}
