package com.facebook.ads.redexgen.core;

import android.content.pm.PackageInfo;
import android.text.TextUtils;
import android.util.Base64OutputStream;
import androidx.exifinterface.media.ExifInterface;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.ads.internal.util.process.ProcessUtils;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.safedk.android.internal.d;
import com.vungle.ads.internal.protos.Sdk;
import io.bidmachine.protobuf.EventTypeExtended;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.zip.DeflaterOutputStream;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1672Wb implements TX {
    public static PackageInfo A02;
    public static boolean A03;
    public static byte[] A04;
    public static String[] A05 = {"txu4RBo63YQ5Q7SoAp", "BY8ga9ljLbuWBmJa1ktUn6UmPorDtudq", "oIcH05TUMC1H4eRB0f575BffOzLV6s", "RDV9o0Xs0wR3bMJwiMoqv", "Drf", "fWBbnfM052TaJjbz2mNIhyXx2yjBcv", "vwrAcDNdoQtjOaT8FPnJSektvmYH0bUo", "A7bgPIcOUjT1m5u12vt0AimohlYQKPcw"};
    public static final LK[] A06;
    public final S5 A00;
    public final SQ A01;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 63);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        if (A05[4].length() != 3) {
            throw new RuntimeException();
        }
        String[] strArr = A05;
        strArr[3] = "e8Iif6peCxlhmB6JTHauJ";
        strArr[0] = "U2Egyo0LhTV3FJWkcb";
        A04 = new byte[]{-98, -70, -85, -83, -83, -81, -67, -67, -77, -84, -77, -74, -77, -66, -61, -55, -81, -72, -85, -84, -74, -81, -82, -26, -13, -26, -15, -12, -20, -69, -54, -54, ExifInterface.MARKER_EOI, -57, -61, -56, ExifInterface.MARKER_EOI, -51, -66, -59, ExifInterface.MARKER_EOI, -48, -65, -52, -51, -61, -55, -56, -38, -20, ExifInterface.MARKER_APP1, -38, -20, -25, -7, -17, -22, -14, 5, 5, 3, -6, -13, 6, 5, -6, 0, -1, 16, -6, -11, -7, 0, -5, -5, -4, 9, 22, 11, 6, 2, -4, 5, 22, -4, 15, 11, 9, -8, 10, -124, -117, -122, -122, -121, -108, -95, -106, -111, -115, -121, -112, -95, -106, -107, -95, -113, -107, -26, -7, -14, -24, -16, -23, -110, -112, -110, -105, -108, -73, -75, -60, -60, -71, -72, -45, -67, -72, -57, -96, -98, -81, -81, -90, -94, -81, -32, -35, -16, -35, -5, -20, -18, -21, -33, ExifInterface.MARKER_APP1, -17, -17, -27, -22, -29, -5, -21, -20, -16, -27, -21, -22, -17, -120, -123, -104, -123, -93, -108, -106, -109, -121, -119, -105, -105, -115, -110, -117, -93, -109, -108, -104, -115, -109, -110, -105, -93, -121, -109, -103, -110, -104, -106, -99, -104, -107, -88, -107, -77, -92, -90, -93, -105, -103, -89, -89, -99, -94, -101, -77, -93, -92, -88, -99, -93, -94, -89, -77, -89, -88, -107, -88, -103, -71, -70, -61, -56, -66, -55, -50, -41, -26, -33, -33, -42, -35, -16, -44, -32, -29, -42, -16, -42, -25, -42, -33, -27, -28, -25, -10, -17, -17, -26, -19, 0, -19, -16, -24, -24, -26, -27, -81, -54, -46, -43, -50, -51, -119, -35, -40, -119, -53, -34, -46, -43, -51, -119, -34, -36, -50, -37, -119, -35, -40, -44, -50, -41, -96, -103, -85, -73, -99, -80, -89, -88, -92, -103, -79, -99, -86, -6, -11, -9, -14, -57, -62, -35, -63, -65, -63, -58, -61, -35, -46, -47, -35, -53, -47, -69, -74, -47, -59, -63, -57, -60, -75, -73, -24, -19, -14, -13, -32, -21, -21, -28, -15, -104, -101, -113, -115, -104, -111, 1, -11, -1, -7, -75, -83, -84, -79, -87, -68, -79, -73, -74, -57, -69, -83, -70, -66, -79, -85, -83, -10, -19, -4, -1, -9, -6, -13, 7, -4, 1, -8, -19, -82, -94, -76, -85, -76, -78, -66, -76, -78, -92, -79, -66, -88, -93, -100, -103, -103, -98, -113, -114, -74, -74, -61, -89, -80, -83, -87, -78, -72, -61, -73, -88, -81, -61, -70, -87, -74, -73, -83, -77, -78, 2, 2, 15, -13, -1, -2, -10, -7, -9, 15, 4, 3, 15, -3, 3, -6, -6, 7, -19, 0, -4, -6, -23, -5, -89, -89, -76, -98, -88, -76, -101, -89, -92, -94, -76, -88, -102, -89, -85, -98, -104, -102, -111, -111, -98, -110, -124, -111, -107, -120, -126, -124, -98, -110, -125, -118, -98, -107, -124, -111, -110, -120, -114, -115, -42, -40, -54, -29, -54, -58, -29, -59, -44, -44, -29, -51, -46, -41, -40, -59, -48, -48, -55, -56, -109, -107, -121, -96, -121, -125, -96, -126, -111, -111, -96, -105, -122, -109, -108, -118, -112, -113, -17, -33, -18, ExifInterface.MARKER_APP1, ExifInterface.MARKER_APP1, -22, -5, -28, ExifInterface.MARKER_APP1, -27, -29, -28, -16, -10, -26, -11, -24, -24, -15, 2, -6, -20, -25, -9, -21, -27, -42, -35, -15, -43, -45, -30, -45, -44, -37, -34, -37, -26, -21, -65, -80, -73, -53, -71, -83, -70, -83, -77, -79, -80, -53, -81, -83, -81, -76, -79, -9, -23, -9, -9, -19, -13, -14, 3, -8, -19, -15, -23, 17, 10, 5, 16, 21, -106, -108, -122, -109, -96, -126, -120, -122, -113, -107, -59, -80, -69, -65, -80, -63, -80, -68, -62, -60, -53, -62, -62};
    }

    /* JADX WARN: Code duplicated, block: B:30:0x010b A[Catch: IOException -> 0x0113, TryCatch #2 {IOException -> 0x0113, blocks: (B:28:0x0106, B:30:0x010b, B:32:0x0110), top: B:40:0x0106 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0110 A[Catch: IOException -> 0x0113, TRY_LEAVE, TryCatch #2 {IOException -> 0x0113, blocks: (B:28:0x0106, B:30:0x010b, B:32:0x0110), top: B:40:0x0106 }] */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final String A05(TV tv2) {
        TT.A08(this.A01, true, null);
        ByteArrayOutputStream byteArrayOutputStream = null;
        Base64OutputStream base64OutputStream = null;
        DeflaterOutputStream deflaterOutputStream = null;
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 0);
                deflaterOutputStream = new DeflaterOutputStream(base64OutputStream);
                Map mapA06 = A06();
                if (TextUtils.isEmpty(AbstractC1561Rr.A00().A03())) {
                    AbstractC1561Rr.A07(this.A01);
                }
                mapA06.put(A01(296, 4, 114), AbstractC1561Rr.A00().A03());
                mapA06.put(A01(587, 10, 2), AbstractC1596Tb.A06(new T6(this.A01), this.A01, false));
                if (U7.A1w(this.A01)) {
                    mapA06.put(A01(119, 10, 53), MW.A01(this.A01).A0K());
                }
                Iterator it = mapA06.entrySet().iterator();
                while (it.hasNext()) {
                    if (!tv2.A32((String) ((Map.Entry) it.next()).getKey())) {
                        it.remove();
                    }
                }
                deflaterOutputStream.write(new JSONObject(mapA06).toString().getBytes());
                deflaterOutputStream.close();
                String strReplaceAll = byteArrayOutputStream.toString().replaceAll(A01(0, 1, 85), A01(0, 0, 46));
                try {
                    deflaterOutputStream.close();
                    base64OutputStream.close();
                    byteArrayOutputStream.close();
                } catch (IOException unused) {
                }
                return strReplaceAll;
            } catch (IOException e10) {
                throw new RuntimeException(A01(257, 26, 42), e10);
            }
        } catch (Throwable th2) {
            if (A05[4].length() != 3) {
                throw new RuntimeException();
            }
            A05[1] = "YYekAclIzhra9Pv39zprUDIkOoogCrwo";
            if (deflaterOutputStream != null) {
                try {
                    deflaterOutputStream.close();
                    if (base64OutputStream != null) {
                        base64OutputStream.close();
                    }
                    if (byteArrayOutputStream != null) {
                        byteArrayOutputStream.close();
                    }
                } catch (IOException unused2) {
                    throw th2;
                }
            } else {
                if (base64OutputStream != null) {
                    base64OutputStream.close();
                }
                if (byteArrayOutputStream != null) {
                    byteArrayOutputStream.close();
                }
            }
            throw th2;
        }
    }

    public final /* synthetic */ Map A06() {
        return TU.A00(this);
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0483 A[EDGE_INSN: B:104:0x0483->B:84:0x0483 BREAK  A[LOOP:0: B:62:0x03cd->B:69:0x040a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:0x0483 A[EDGE_INSN: B:105:0x0483->B:84:0x0483 BREAK  A[LOOP:0: B:62:0x03cd->B:69:0x040a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:0x040a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:47:0x02de  */
    /* JADX WARN: Code duplicated, block: B:50:0x030d  */
    /* JADX WARN: Code duplicated, block: B:58:0x0372  */
    /* JADX WARN: Code duplicated, block: B:60:0x037f  */
    /* JADX WARN: Code duplicated, block: B:64:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:68:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:70:0x040d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x0410  */
    /* JADX WARN: Code duplicated, block: B:75:0x041f  */
    /* JADX WARN: Code duplicated, block: B:88:0x04af  */
    /* JADX WARN: Code duplicated, block: B:91:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:93:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:94:0x04d8  */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.TX
    public final Map<String, String> A7q(TL tl2) {
        String strA01;
        String strA02;
        String strA03;
        String strA04;
        SQ sq;
        String[] strArr;
        StringBuilder sb2;
        LK[] lkArr;
        int i10;
        int length;
        String[] strArr2;
        PackageInfo packageInfoA00;
        Map<String, String> mapA02;
        InterfaceC1576Sh interfaceC1576ShA07;
        String[] strArr3;
        String strA7z;
        String strA71 = tl2 != null ? tl2.A71() : null;
        String packageName = strA71 != null ? strA71 : this.A01.getPackageName();
        TT.A08(this.A01, ProcessUtils.isRemoteRenderingProcess() ? true : U7.A0n(this.A01), strA71);
        T5.A0B(this.A01);
        T5.A08(this.A01);
        HashMap map = new HashMap();
        TQ.A03(this.A01, map, strA71);
        map.put(A01(332, 6, 13), Locale.getDefault().toString());
        float f10 = AbstractC1680Wl.A02;
        int i11 = this.A01.getResources().getDisplayMetrics().widthPixels;
        int i12 = this.A01.getResources().getDisplayMetrics().heightPixels;
        map.put(A01(Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, 7, 54), String.valueOf(f10));
        map.put(A01(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 12, 100), String.valueOf((int) (i11 / f10)));
        map.put(A01(EventTypeExtended.EVENT_TYPE_EXTENDED_IMPRESSION_OPPORTUNITY_VALUE, 13, 93), String.valueOf((int) (i12 / f10)));
        map.put(A01(57, 14, 114), AbstractC1561Rr.A03());
        map.put(A01(314, 9, 51), AbstractC1561Rr.A00().A02().name());
        map.put(A01(d.f44769a, 14, 63), String.valueOf(AbstractC1561Rr.A00().A01()));
        T6 t10 = new T6(this.A01, strA71);
        map.put(A01(108, 6, 101), AbstractC1596Tb.A03(this.A01, t10));
        map.put(A01(129, 7, 30), t10.A08());
        map.put(A01(338, 4, 117), t10.A09());
        map.put(A01(385, 6, 11), String.valueOf(TT.A00(this.A01).A00));
        map.put(A01(323, 9, 96), t10.A0B());
        map.put(A01(539, 14, 83), WU.A01());
        map.put(A01(359, 12, 105), String.valueOf(XE.A00(this.A01).A00));
        map.put(A01(570, 12, 101), XG.A03(this.A01.A09().A01()));
        TT.A06(this.A01, packageName, map);
        String strA05 = C1678Wj.A03(this.A01, packageName);
        if (strA05 != null) {
            map.put(A01(48, 5, 90), strA05);
        }
        String strA06 = A01(582, 5, 125);
        if (tl2 != null && tl2.AAb() != null) {
            Boolean boolAAb = tl2.AAb();
            String[] strArr4 = A05;
            if (strArr4[7].charAt(0) != strArr4[6].charAt(0)) {
                String[] strArr5 = A05;
                strArr5[5] = "32RBgLNf778xvD9weLhwI46Snl5hrv";
                strArr5[2] = "IyuqHiwE4txdUinr9J2yO2mEn55tsE";
                map.put(strA06, String.valueOf(boolAAb));
            }
            throw new RuntimeException();
        }
        boolean zA05 = C1681Wm.A05(this.A01);
        String[] strArr6 = A05;
        if (strArr6[3].length() == strArr6[0].length()) {
            throw new RuntimeException();
        }
        A05[4] = "M1q";
        map.put(strA06, String.valueOf(zA05));
        String strA8N = (tl2 == null || tl2.A8O() == null) ? this.A01.A05().A8N() : tl2.A8O();
        if (strA8N != null) {
            String[] strArr7 = A05;
            if (strArr7[7].charAt(0) != strArr7[6].charAt(0)) {
                String[] strArr8 = A05;
                strArr8[5] = "lzJ4Ecl31LKhf9GNtdySIIM2KCn5d6";
                strArr8[2] = "MfUCKgpZ3l00IXdOSEBXHLe94uIrQG";
                map.put(A01(342, 17, 41), strA8N);
            } else {
                map.put(A01(342, 17, 41), strA8N);
            }
        }
        map.put(A01(2, 21, 43), String.valueOf(t10.A0C()));
        if (t10.A03() != -1) {
            map.put(A01(29, 19, 59), String.valueOf(t10.A03()));
        }
        map.put(A01(597, 9, 48), TM.A05(this.A01, packageName));
        map.put(A01(23, 6, 102), AbstractC1686Wr.A01(T5.A02()));
        if (U6.A05(this.A01) && (strA7z = this.A01.A05().A7z()) != null) {
            map.put(A01(53, 4, 103), strA7z);
        }
        String strA8U = this.A01.A05().A8U();
        if (!TextUtils.isEmpty(strA8U)) {
            map.put(A01(371, 14, 32), strA8U);
        }
        C1573Se c1573SeA7c = null;
        if (tl2 == null) {
            if (c1573SeA7c == null) {
                interfaceC1576ShA07 = this.A01.A07();
                strArr3 = A05;
                if (strArr3[3].length() != strArr3[0].length()) {
                    String[] strArr9 = A05;
                    strArr9[7] = "UvZ2k7gEJDaOAPFQ7LljUQwSSHt3Qj5l";
                    strArr9[6] = "lsSUyvw0Epval1a8yRy7YtOStWYNlmUT";
                    c1573SeA7c = interfaceC1576ShA07.A7c();
                }
            }
            strA01 = A01(190, 29, 21);
            strA02 = A01(159, 31, 5);
            strA03 = A01(136, 23, 93);
            if (c1573SeA7c != null) {
                map.put(strA03, c1573SeA7c.A08());
                map.put(strA02, String.valueOf(c1573SeA7c.A05()));
                map.put(strA01, String.valueOf(c1573SeA7c.A06()));
            } else {
                String strA07 = A01(606, 4, 23);
                map.put(strA03, strA07);
                map.put(strA02, strA07);
                map.put(strA01, strA07);
            }
            map.put(A01(119, 10, 53), MW.A01(this.A01).A0K());
            strA04 = this.A00.A03(this.A01);
            if (strA04 != null) {
                map.put(A01(71, 19, 120), strA04);
            }
            sq = this.A01;
            strArr = A05;
            if (strArr[3].length() != strArr[0].length()) {
                A05[1] = "xfpBh2d17TpisnhOgc4FARMiGoOeOma4";
                if (UA.A0D(sq)) {
                    map.put(A01(90, 18, 3), XG.A07(XG.A00()));
                }
            } else {
                A05[4] = "SgB";
                if (UA.A0D(sq)) {
                    map.put(A01(90, 18, 3), XG.A07(XG.A00()));
                }
            }
            map.put(A01(283, 13, 25), String.valueOf(this.A01.A04().A9e()));
            map.put(A01(244, 13, 98), String.valueOf(C1584Sp.A0H(this.A01)));
            sb2 = new StringBuilder();
            lkArr = A06;
            i10 = 0;
            while (true) {
                length = lkArr.length;
                strArr2 = A05;
                if (strArr2[3].length() != strArr2[0].length()) {
                    String[] strArr10 = A05;
                    strArr10[5] = "zWUmLpLkv5ZkeLP8Nx8FR5P0NkpI1z";
                    strArr10[2] = "rR6LCigUl1U30r1W401qlH7SB9R1I9";
                    if (i10 >= length) {
                        break;
                        break;
                    }
                    sb2.append(lkArr[i10].A03() + 4000);
                    if (i10 != lkArr.length - 1) {
                        sb2.append(A01(1, 1, 79));
                    }
                    i10++;
                } else {
                    if (i10 >= length) {
                        break;
                        break;
                    }
                    sb2.append(lkArr[i10].A03() + 4000);
                    if (i10 != lkArr.length - 1) {
                        sb2.append(A01(1, 1, 79));
                    }
                    i10++;
                }
            }
            map.put(A01(Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE, 18, 82), sb2.toString());
            packageInfoA00 = A00(this.A01);
            map.put(A01(476, 20, 69), String.valueOf(packageInfoA00 != null));
            if (packageInfoA00 != null) {
                map.put(A01(496, 18, 2), String.valueOf(packageInfoA00.versionCode));
            }
            A03(tl2, map);
            if (A05[4].length() != 3) {
                throw new RuntimeException();
            }
            String[] strArr11 = A05;
            strArr11[3] = "GvfG5gBfjM6hmXKTNV25n";
            strArr11[0] = "CjMBMD2IWFco7mVmEr";
            if (U7.A0y(this.A01)) {
                map.put(A01(553, 17, 45), AbstractC1686Wr.A01(mapA02));
            }
            return map;
        }
        SQ sq2 = this.A01;
        String[] strArr12 = A05;
        if (strArr12[7].charAt(0) != strArr12[6].charAt(0)) {
            String[] strArr13 = A05;
            strArr13[3] = "QL1vZoGO1wQ14zpGXE2Sg";
            strArr13[0] = "5V9s84iDx7Ocfd5gsL";
            c1573SeA7c = tl2.A7e(sq2);
            if (c1573SeA7c == null) {
                interfaceC1576ShA07 = this.A01.A07();
                strArr3 = A05;
                if (strArr3[3].length() != strArr3[0].length()) {
                    String[] strArr14 = A05;
                    strArr14[7] = "UvZ2k7gEJDaOAPFQ7LljUQwSSHt3Qj5l";
                    strArr14[6] = "lsSUyvw0Epval1a8yRy7YtOStWYNlmUT";
                    c1573SeA7c = interfaceC1576ShA07.A7c();
                }
            }
            strA01 = A01(190, 29, 21);
            strA02 = A01(159, 31, 5);
            strA03 = A01(136, 23, 93);
            if (c1573SeA7c != null) {
                map.put(strA03, c1573SeA7c.A08());
                map.put(strA02, String.valueOf(c1573SeA7c.A05()));
                map.put(strA01, String.valueOf(c1573SeA7c.A06()));
            } else {
                String strA08 = A01(606, 4, 23);
                map.put(strA03, strA08);
                map.put(strA02, strA08);
                map.put(strA01, strA08);
            }
            map.put(A01(119, 10, 53), MW.A01(this.A01).A0K());
            strA04 = this.A00.A03(this.A01);
            if (strA04 != null && !TextUtils.isEmpty(strA04)) {
                map.put(A01(71, 19, 120), strA04);
            }
            sq = this.A01;
            strArr = A05;
            if (strArr[3].length() != strArr[0].length()) {
                A05[1] = "xfpBh2d17TpisnhOgc4FARMiGoOeOma4";
                if (UA.A0D(sq)) {
                    map.put(A01(90, 18, 3), XG.A07(XG.A00()));
                }
            } else {
                A05[4] = "SgB";
                if (UA.A0D(sq)) {
                    map.put(A01(90, 18, 3), XG.A07(XG.A00()));
                }
            }
            map.put(A01(283, 13, 25), String.valueOf(this.A01.A04().A9e()));
            map.put(A01(244, 13, 98), String.valueOf(C1584Sp.A0H(this.A01)));
            sb2 = new StringBuilder();
            lkArr = A06;
            i10 = 0;
            while (true) {
                length = lkArr.length;
                strArr2 = A05;
                if (strArr2[3].length() != strArr2[0].length()) {
                    String[] strArr15 = A05;
                    strArr15[5] = "zWUmLpLkv5ZkeLP8Nx8FR5P0NkpI1z";
                    strArr15[2] = "rR6LCigUl1U30r1W401qlH7SB9R1I9";
                    if (i10 >= length) {
                        break;
                    }
                    sb2.append(lkArr[i10].A03() + 4000);
                    if (i10 != lkArr.length - 1) {
                        sb2.append(A01(1, 1, 79));
                    }
                    i10++;
                } else {
                    if (i10 >= length) {
                        break;
                    }
                    sb2.append(lkArr[i10].A03() + 4000);
                    if (i10 != lkArr.length - 1) {
                        sb2.append(A01(1, 1, 79));
                    }
                    i10++;
                }
            }
            map.put(A01(Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE, 18, 82), sb2.toString());
            packageInfoA00 = A00(this.A01);
            map.put(A01(476, 20, 69), String.valueOf(packageInfoA00 != null));
            if (packageInfoA00 != null) {
                map.put(A01(496, 18, 2), String.valueOf(packageInfoA00.versionCode));
            }
            A03(tl2, map);
            if (A05[4].length() != 3) {
                throw new RuntimeException();
            }
            String[] strArr16 = A05;
            strArr16[3] = "GvfG5gBfjM6hmXKTNV25n";
            strArr16[0] = "CjMBMD2IWFco7mVmEr";
            if (U7.A0y(this.A01) && (mapA02 = TO.A02(this.A01.A02())) != null) {
                map.put(A01(553, 17, 45), AbstractC1686Wr.A01(mapA02));
            }
            return map;
        }
        throw new RuntimeException();
    }

    static {
        A02();
        A03 = false;
        A06 = new LK[]{LK.A16, LK.A0k, LK.A17, LK.A1F, LK.A11, LK.A13, LK.A2R, LK.A2S, LK.A2T};
    }

    public C1672Wb(SQ sq, boolean z10, S5 s10) {
        this.A01 = sq;
        this.A00 = s10;
        TT.A08(sq, z10, null);
    }

    public static synchronized PackageInfo A00(SQ sq) {
        if (!A03) {
            A02 = AbstractC1691Ww.A00(sq);
            A03 = true;
        }
        return A02;
    }

    private void A03(TL tl2, Map<String, String> map) {
        String strA01;
        if (tl2 != null && tl2.AAX()) {
            map.put(A01(436, 18, 22), Boolean.TRUE.toString());
            if (tl2.A7F() != null) {
                map.put(A01(391, 21, 37), tl2.A7F());
            }
        }
        if (UA.A09(this.A01)) {
            SQ sq = this.A01;
            if (A05[1].charAt(25) != 'o') {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[7] = "qhmjNI7uMFHuEfCbgrNi3HvbFW0uqLeT";
            strArr[6] = "rAF5k5sPuv4hj6bjGKLvAsDqqwbdtY33";
            String strA03 = TN.A03(sq.A02());
            if (strA03 != null) {
                String remoteRenderingSdkVersion = A01(454, 22, 0);
                map.put(remoteRenderingSdkVersion, strA03);
            }
            String strA02 = TN.A02(this.A01.A02());
            if (strA03 != null) {
                String remoteRenderingSdkVersion2 = A01(427, 9, 105);
                map.put(remoteRenderingSdkVersion2, strA02);
            }
            if (UA.A0D(this.A01)) {
                String strA04 = TN.A01(this.A01.A02());
                String[] strArr2 = A05;
                String remoteRenderingExtras = strArr2[7];
                if (remoteRenderingExtras.charAt(0) == strArr2[6].charAt(0)) {
                    throw new RuntimeException();
                }
                String[] strArr3 = A05;
                strArr3[7] = "Mj9TvIbv6bgZbZ2pKznECnYI7EK5ROuc";
                strArr3[6] = "5qjAp4YjV3Q6sbLE0XRdgT3gO1lX1tGk";
                if (strA03 != null) {
                    String remoteRenderingSdkVersion3 = A01(TTAdConstant.IMAGE_URL_CODE, 15, 113);
                    map.put(remoteRenderingSdkVersion3, strA04);
                }
            }
        }
        if (U7.A0x(this.A01) && (strA01 = TO.A01(this.A01.A02())) != null) {
            String cache = A01(114, 5, 16);
            map.put(cache, strA01);
        }
    }

    public final String A04() {
        return A05(TW.A00());
    }
}
