package com.facebook.ads.redexgen.core;

import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class VR {
    public static byte[] A0C;
    public static String[] A0D = {"u7auSF2QbA7keT455OtLfVATNnMuonV2", "9Ni6xyVwZaeKacoBimRjslH6Dei", "NGE2fLmKrMN6Gw2Fz9z7jAXvyfAydpGl", "srT3S5MN", "jMoNZ8Vk", "oZZQeSbHWWSZcPAQallJMC7N5h2", "GNfhbJ55AYf3nQ2lY9fIFOrmofPjrLRg", "qccEv4BxkjzqCatZiOtTgryF8DF84JXr"};
    public int A00;
    public SQ A01;
    public V6 A02;
    public X1 A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public boolean A08;
    public final TL A09;
    public final AdPlacementType A0A;
    public final VB A0B;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0C, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 78);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A0C = new byte[]{-34, -95, -105, -102, -75, -101, -82, -90, -101, -88, -97, -101, -92, -103, -101, -75, -86, -81, -90, -101, -52, -49, -22, -35, -48, -37, -38, -35, -33, -44, ExifInterface.MARKER_EOI, -46, -22, -50, -38, ExifInterface.MARKER_EOI, -47, -44, -46, -22, -41, -52, -34, -33, -22, -32, -37, -49, -52, -33, -48, -22, -33, -44, -40, -48, 11, 18, 13, 40, 18, 13, -29, -22, -27, 0, -11, -22, -18, -26, 0, -11, -16, -20, -26, -17, -105, -96, -99, -103, -94, -88, -77, -90, -103, -91, -87, -103, -89, -88, -77, -99, -104, -109, -97, -96, -96, -111, -59, -58, -50, -48, -32, -62, -59, -32, -54, -59, -74, -55, -59, -61, -78, -48, -71, -70, -65, -59, -60, -9, -12, -8, -10, -9, 3, -74, -79, -77, -82, -54, -59, -57, -62, -32, -57, -51, -62, -56, -92, -82, -70, -88, -80, -89, -81, -92, -70, -100, -97, -70, -96, -77, -85, -96, -83, -92, -96, -87, -98, -96, 4, 0, 24, 11, -2, 12, 13, 11, 2, -4, 13, -2, -3, -34, -45, -27, -26, -15, -27, -45, -24, -41, -42, -15, -34, ExifInterface.MARKER_APP1, -43, -45, -34, -41, -28, -21, -29, -11, -41, -38, -23, -11, -24, -37, -25, -21, -37, -23, -22, -37, -38, -77, -81, -92, -90, -88, -80, -88, -79, -73, -62, -84, -89, -50, -54, -65, -63, -61, -53, -61, -52, -46, -35, -46, -41, -50, -61, 21, 8, 20, 24, 8, 22, 23, 34, 23, 12, 16, 8, -4, -3, -22, -20, -12, 8, -3, -5, -22, -20, -18, -7, -22, -14, -11, -15, -26, -7, -22, 4, -18, -23, -58, -73, -59, -58, -47, -65, -63, -74, -73, -13, -27, -32, -16, -28};
    }

    static {
        A02();
    }

    public VR(SQ sq, String str, X1 x10, V6 v10, int i10, VB vb2, String str2, String str3, String str4, TL tl2) {
        this.A01 = sq;
        this.A06 = str;
        this.A03 = x10;
        this.A02 = v10;
        this.A00 = i10;
        this.A0B = vb2;
        this.A0A = v10.A05(this.A01);
        this.A07 = str2;
        this.A05 = str3;
        this.A04 = str4;
        this.A09 = tl2;
    }

    private long A00() {
        SharedPreferences sharedPreferencesA00 = AbstractC1649Ve.A00(this.A01);
        String strA01 = A01(0, 0, 79);
        String strA02 = A01(TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173, 17, 68);
        String lastSavedLocale = sharedPreferencesA00.getString(strA02, strA01);
        if (lastSavedLocale == null) {
            return 0L;
        }
        if (lastSavedLocale.equals(Locale.getDefault().toString())) {
            return O3.A00(this.A01.A02()).A09();
        }
        sharedPreferencesA00.edit().putString(strA02, Locale.getDefault().toString()).apply();
        return 0L;
    }

    private void A03(Map<String, String> params, String str, String str2) {
        params.put(str, str2);
    }

    public final int A04() {
        return this.A00;
    }

    public final TL A05() {
        return this.A09;
    }

    public final AdPlacementType A06() {
        return this.A0A;
    }

    public final V6 A07() {
        return this.A02;
    }

    public final X1 A08() {
        return this.A03;
    }

    public final String A09() {
        return this.A06;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0157  */
    /* JADX WARN: Code duplicated, block: B:36:0x0197  */
    public final Map<String, String> A0A(Map<String, String> map) {
        String strA01;
        HashMap map2 = new HashMap(map);
        A03(map2, A01(125, 4, 31), AbstractC1561Rr.A00().A03());
        if (AbstractC1561Rr.A00().A04()) {
            strA01 = A01(0, 1, 96);
        } else {
            strA01 = A01(1, 1, 34);
        }
        A03(map2, A01(129, 9, 51), strA01);
        A03(map2, A01(93, 5, 2), String.valueOf(this.A09.AAR()));
        String idfaFlag = A01(207, 12, 21);
        A03(map2, idfaFlag, this.A06);
        if (this.A0A != AdPlacementType.UNKNOWN) {
            A03(map2, A01(Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, 14, 48), this.A0A.toString().toLowerCase());
        }
        if (this.A03 != null) {
            A03(map2, A01(276, 5, 78), String.valueOf(this.A03.A01()));
            A03(map2, A01(119, 6, 97), String.valueOf(this.A03.A00()));
        }
        V6 v10 = this.A02;
        String[] strArr = A0D;
        String idfaFlag2 = strArr[3];
        if (idfaFlag2.length() == strArr[4].length()) {
            String[] strArr2 = A0D;
            strArr2[1] = "MtgCRt6raT7lLAmxmnhZWRhCoK6";
            strArr2[5] = "TefOAifnH3N8w6fQm3K3ucYxLzr";
            if (v10 != null) {
                String strValueOf = String.valueOf(this.A02.A04());
                String[] strArr3 = A0D;
                String idfaFlag3 = strArr3[1];
                if (idfaFlag3.length() == strArr3[5].length()) {
                    String[] strArr4 = A0D;
                    strArr4[2] = "oEScE6GwBx0T7gd10O4WpCDAWbiGO08C";
                    strArr4[6] = "F3x5JK4fAwlkZj0maRZJGdAXlKAKJxnY";
                    A03(map2, A01(256, 11, 87), strValueOf);
                }
            }
            if (this.A09.isTestMode(this.A01)) {
                A03(map2, A01(267, 9, 36), A01(1, 1, 34));
            }
            TL tl2 = this.A09;
            String[] strArr5 = A0D;
            if (strArr5[2].charAt(1) != strArr5[6].charAt(1)) {
                String[] strArr6 = A0D;
                strArr6[1] = "P1GrzNsZRgJooEVm5vEQxHxZ4Z0";
                strArr6[5] = "F8cEJY3nZiqqQFAmyopMZkDj7B2";
                if (tl2.A98() != null) {
                    A03(map2, A01(98, 10, 51), this.A09.A98());
                }
            } else if (tl2.A98() != null) {
                A03(map2, A01(98, 10, 51), this.A09.A98());
            }
            if (this.A00 != 0) {
                A03(map2, A01(190, 17, 72), String.valueOf(this.A00));
            }
            boolean z10 = this.A08;
            String[] strArr7 = A0D;
            if (strArr7[1].length() == strArr7[5].length()) {
                String[] strArr8 = A0D;
                strArr8[2] = "uWxLBVxijt65dRlk9T2Hn2WYlcbw5EIA";
                strArr8[6] = "gJEIMXTCWTN9wPxeCuHJDhMtmXZzR3hI";
                if (z10) {
                    A03(map2, A01(138, 22, 13), String.valueOf(this.A08));
                }
            } else if (z10) {
                A03(map2, A01(138, 22, 13), String.valueOf(this.A08));
            }
            A03(map2, A01(160, 13, 107), String.valueOf(XQ.A02(this.A01)));
            A03(map2, A01(233, 12, 117), XG.A06(System.currentTimeMillis()));
            if (this.A0B.A06() && this.A0B.A04() != null) {
                A03(map2, A01(56, 6, 123), this.A0B.A04());
            }
            String strA05 = this.A0B.A05();
            if (!TextUtils.isEmpty(strA05)) {
                A03(map2, A01(62, 14, 83), strA05);
            }
            if (this.A07 != null) {
                A03(map2, A01(245, 11, 91), this.A07);
            }
            A03(map2, A01(76, 17, 6), UUID.randomUUID().toString());
            String strA07 = XG.A07(A00());
            String[] strArr9 = A0D;
            if (strArr9[3].length() != strArr9[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr10 = A0D;
            strArr10[2] = "NkXVy20xQPZxPDFffPbPKKxnGzq6Q1tn";
            strArr10[6] = "9D5jR9gI4cGNuuYNFYJ1hn06wNsfKLn7";
            A03(map2, A01(20, 36, 61), strA07);
            if (this.A05 != null) {
                A03(map2, A01(108, 11, 35), this.A05);
            }
            if (this.A04 != null) {
                A03(map2, A01(2, 18, 8), this.A04);
            }
            return map2;
        }
        throw new RuntimeException();
    }
}
