package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import androidx.exifinterface.media.ExifInterface;
import com.vungle.ads.internal.protos.Sdk;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Semaphore;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2332jO implements InterfaceC1380Kp {
    public static byte[] A09;
    public static String[] A0A = {"jhQijRHeS2b3DC", "TrxlLGPRt74PJqIyPQ202SRMEezA", "IB0ZY9fOXgD7jLe6Y4PRk3dCNjPCK6", "H6fabJXG57DAkPtsQTSNUghzavXSaH69", "ufMT47zQTczJDi2Vdc2LdI1YLyWR3nOe", "Lk9ILhYpp3cxsVDBevZ7UGW4HuH86l", "wl", "vesbJwqYWy5viKlOFyHJIQca6g"};
    public static final String A0B;
    public final int A00;
    public final int A01;
    public final C1388Kx A02;
    public final LA A04;
    public final SQ A05;
    public final boolean A08;
    public final Map<String, File> A06 = Collections.synchronizedMap(new HashMap());
    public final Map<String, Semaphore> A07 = new HashMap();
    public final C1390Kz A03 = new C1390Kz();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 23 out of bounds for length 23
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x0126: INVOKE 
  (r10v1 ?? I:com.facebook.ads.redexgen.X.LA)
  (r11 I:java.lang.String)
  (r12 I:int)
  (r13 I:java.lang.String)
  (r14 I:java.lang.Long)
  (r15 I:java.lang.Long)
  (r16 I:com.facebook.ads.redexgen.X.Kv)
 INTERFACE call: com.facebook.ads.redexgen.X.LA.AGk(java.lang.String, int, java.lang.String, java.lang.Long, java.lang.Long, com.facebook.ads.redexgen.X.Kv):void A[MD:(java.lang.String, int, java.lang.String, java.lang.Long, java.lang.Long, com.facebook.ads.redexgen.X.Kv):void (m)], block:B:43:0x011a */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x0141: INVOKE 
  (r10v0 ?? I:com.facebook.ads.redexgen.X.LA)
  (r11 I:java.lang.String)
  (r12 I:int)
  (r13 I:java.lang.String)
  (r14 I:java.lang.Long)
  (r15 I:java.lang.Long)
  (r16 I:com.facebook.ads.redexgen.X.Kv)
 INTERFACE call: com.facebook.ads.redexgen.X.LA.AGk(java.lang.String, int, java.lang.String, java.lang.Long, java.lang.Long, com.facebook.ads.redexgen.X.Kv):void A[MD:(java.lang.String, int, java.lang.String, java.lang.Long, java.lang.Long, com.facebook.ads.redexgen.X.Kv):void (m)], block:B:49:0x0135 */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0124: MOVE (r16 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:43:0x011a */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x013f: MOVE (r16 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:49:0x0135 */
    private File A02(C1386Kv c1386Kv, String str, String str2, int i10, C1389Ky c1389Ky) throws Exception {
        C1386Kv c1386Kv2;
        String strAGk;
        C1386Kv c1386Kv3;
        String strAGk2;
        String strA03 = A03(Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE, 22, 17);
        try {
            String str3 = str;
            long jCurrentTimeMillis = System.currentTimeMillis();
            File file = new File(A01(this.A05), str2);
            final long jA0R = U7.A0R(this.A05);
            C2327jI c2327jI = new C2327jI(file, new AbstractC2331jN(jA0R) { // from class: com.facebook.ads.redexgen.X.7f
                public static byte[] A01;
                public final long A00;

                static {
                    A01();
                }

                public static String A00(int i11, int i12, int i13) {
                    byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i11, i11 + i12);
                    for (int i14 = 0; i14 < bArrCopyOfRange.length; i14++) {
                        bArrCopyOfRange[i14] = (byte) ((bArrCopyOfRange[i14] - i13) - 38);
                    }
                    return new String(bArrCopyOfRange);
                }

                public static void A01() {
                    A01 = new byte[]{ExifInterface.MARKER_APP1, -11, 12, -76, 7, -3, 14, -7, -76, 1, 9, 7, 8, -76, -10, -7, -76, 4, 3, 7, -3, 8, -3, 10, -7, -76, 2, 9, 1, -10, -7, 6, -75};
                }

                {
                    if (jA0R > 0) {
                        this.A00 = jA0R;
                        return;
                    }
                    throw new IllegalArgumentException(A00(0, 33, 110));
                }

                @Override // com.facebook.ads.redexgen.core.AbstractC2331jN
                public final boolean A08(File file2, long j10, int i11) {
                    return j10 <= this.A00;
                }

                @Override // com.facebook.ads.redexgen.core.AbstractC2331jN, com.facebook.ads.redexgen.core.L0
                public final /* bridge */ /* synthetic */ void AJg(File file2) throws IOException {
                    super.AJg(file2);
                }
            });
            if (c2327jI.A09()) {
                if (this.A08) {
                    String str4 = A03(49, 22, 36) + c2327jI.A00.getName();
                }
                this.A06.put(str3, file);
                c2327jI.A06();
                this.A04.AGl(str3, true, c1386Kv);
                return file;
            }
            if (this.A08) {
                String str5 = A03(71, 26, 76) + c2327jI.A00.getName();
            }
            if (!c1389Ky.A04()) {
                return null;
            }
            this.A04.AGl(str3, false, c1386Kv);
            for (int i11 = 0; i11 < this.A00; i11++) {
                try {
                    SQ sq = this.A05;
                    if (A0A[3].charAt(31) != '9') {
                        throw new RuntimeException();
                    }
                    String[] strArr = A0A;
                    strArr[2] = "QJ6lhIf3SMnJsUHWjUzyv1yZJIRdgp";
                    strArr[5] = "f1TQksdEGnGezGtACwRIsNgGsb1lS2";
                    str3 = str3;
                    try {
                        A05(sq, c2327jI, str3, i10, i11, jCurrentTimeMillis);
                        break;
                    } catch (L6 e10) {
                        e = e10;
                        if (i11 == this.A00 - 1) {
                            A06(c2327jI);
                            if (e instanceof C2328jJ) {
                                throw ((C2328jJ) e);
                            }
                            if (e instanceof C2323jE) {
                                throw ((C2323jE) e);
                            }
                        }
                    }
                } catch (L6 e11) {
                    e = e11;
                }
            }
            int iA03 = c2327jI.A03();
            c2327jI.A06();
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            c1389Ky.A00().A55(file, this.A04);
            this.A06.put(str3, file);
            this.A04.AGk(str3, 2112, null, Long.valueOf(iA03), Long.valueOf(jCurrentTimeMillis2), c1386Kv);
            return file;
        } catch (C2323jE e12) {
            this.A04.AGk(strAGk2, 2113, e12.toString(), null, null, c1386Kv3);
            if (!this.A08) {
                return null;
            }
            Log.e(A0B, strA03, e12);
            return null;
        } catch (C2328jJ e13) {
            this.A04.AGk(strAGk, 2119, e13.toString(), null, null, c1386Kv2);
            if (!this.A08) {
                return null;
            }
            Log.e(A0B, strA03, e13);
            return null;
        }
    }

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A09, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 50);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A09 = new byte[]{-95, -23, -30, -12, -95, -29, -26, -26, -17, -95, -22, -17, -11, -26, -13, -13, -10, -15, -11, -26, -27, -81, -128, 116, -70, -67, -64, -71, 116, -73, -64, -71, -75, -62, -71, -72, -114, 116, -52, -66, -33, 18, 18, 3, 11, 14, 18, -40, -66, -103, -73, -71, -66, -65, -60, -67, 118, -68, -65, -62, -69, 118, -71, -59, -61, -58, -62, -69, -54, -69, 118, -63, -33, ExifInterface.MARKER_APP1, -26, -25, -20, -27, -98, -28, -25, -22, -29, -98, -20, -19, -14, -98, ExifInterface.MARKER_APP1, -19, -21, -18, -22, -29, -14, -29, -98, -87, -57, -55, -50, -49, -44, -51, -122, -43, -52, -122, -121, -91, -78, 107, -72, 100, -89, -80, -77, -73, -87, 100, -89, -91, -89, -84, -87, 100, -86, -83, -80, -87, 114, -61, ExifInterface.MARKER_APP1, -18, -89, -12, -96, -14, -27, ExifInterface.MARKER_APP1, -28, -96, ExifInterface.MARKER_APP1, -13, -13, -27, -12, -13, -82, -63, -33, -20, -91, -14, -98, -16, -29, -33, -30, -98, -22, -29, -20, -27, -14, -26, -98, -19, -28, -98, -124, -91, -84, -91, -76, -87, -82, -89, 96, -93, -95, -93, -88, -91, 96, -90, -87, -84, -91, 96, -95, -90, -76, -91, -78, 96, -91, -72, -93, -91, -91, -92, -87, -82, -89, 96, -78, -91, -76, -78, -71, 96, -95, -76, -76, -91, -83, -80, -76, -77, 122, 96, -120, -75, -75, -78, -75, 99, -90, -92, -90, -85, -84, -79, -86, 99, -73, -85, -88, 99, -87, -84, -81, -88, -89, -44, -44, -47, -44, -126, -59, -50, -57, -61, -48, -53, -48, -55, -126, -56, -53, -50, -57, -23, 22, 22, 19, 22, -60, 7, 16, 19, 23, 13, 18, 11, -60, 23, 19, 25, 22, 7, 9, ExifInterface.MARKER_EOI, -2, -13, -1, -3, 0, -4, -11, 4, -11, -80, 2, -11, 3, 0, -1, -2, 3, -11, -66, 2, 32, 39, 23, 28, 21, -50, 34, 29, -50, 32, 19, 15, 18, -50, ExifInterface.MARKER_APP1, -28, -18, -9, -83, -26, -23, -20, -27, -83, -29, ExifInterface.MARKER_APP1, -29, -24, -27, -50, -32, -32, -46, ExifInterface.MARKER_APP1, -89, -100, -100, -100, -77, -74, -71, -78, -121, 124, 124, 124, -82, -69, -79, -65, -68, -74, -79, -84, -82, -64, -64, -78, -63, 124};
    }

    static {
        A04();
        A0B = C2332jO.class.getSimpleName();
    }

    public C2332jO(SQ sq, C1388Kx c1388Kx, LA la2) {
        this.A05 = sq;
        this.A08 = c1388Kx.A02();
        this.A00 = c1388Kx.A00();
        this.A04 = la2;
        this.A01 = c1388Kx.A01();
        this.A02 = c1388Kx;
    }

    public static C2329jK A00(Context context, String str) throws L6 {
        try {
            InputStream inputStreamOpen = context.getAssets().open(str);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int i10 = inputStreamOpen.read(bArr, 0, bArr.length);
                if (i10 != -1) {
                    byteArrayOutputStream.write(bArr, 0, i10);
                } else {
                    return new C2329jK(byteArrayOutputStream.toByteArray());
                }
            }
        } catch (IOException e10) {
            throw new L6(A03(Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, 18, 78), e10);
        }
    }

    public static File A01(Context context) {
        return new File(context.getCacheDir(), A03(318, 15, 78));
    }

    /* JADX WARN: Code duplicated, block: B:107:0x00ae A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0157 A[Catch: L6 -> 0x015f, all -> 0x01c6, TRY_ENTER, TRY_LEAVE, TryCatch #13 {L6 -> 0x015f, blocks: (B:12:0x007c, B:40:0x00f8, B:42:0x0100, B:50:0x0144, B:56:0x0157, B:48:0x013e), top: B:112:0x007c }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0188  */
    /* JADX WARN: Code duplicated, block: B:63:0x0190  */
    private void A05(Context context, C2327jI c2327jI, String str, int i10, int i11, long j10) throws Exception {
        L9 c2324jF;
        int iA06;
        int iA07;
        String[] strArr;
        String strA03 = A03(263, 20, 114);
        String strA04 = A03(342, 22, 27);
        if (str.startsWith(strA04)) {
            String localUrl = str.substring(strA04.length());
            c2324jF = A00(context, localUrl);
        } else {
            String strA05 = A03(333, 9, 59);
            if (str.startsWith(strA05)) {
                String localUrl2 = str.substring(strA05.length());
                c2324jF = A00(context, localUrl2);
            } else {
                c2324jF = new C2324jF(str, i10);
            }
        }
        try {
            if (this.A08) {
                try {
                    try {
                        String str2 = A03(303, 15, 124) + str + A03(38, 11, 108) + i11;
                    } catch (L6 e10) {
                        e = e10;
                        iA06 = 0;
                        try {
                            if (c2324jF instanceof C2324jF) {
                                try {
                                    iA06 = ((C2324jF) c2324jF).A06();
                                } catch (Throwable th2) {
                                    th = th2;
                                    try {
                                        c2324jF.close();
                                    } catch (L6 | IllegalArgumentException e11) {
                                        if (this.A08) {
                                            Log.e(A0B, strA03, e11);
                                        }
                                    }
                                    throw th;
                                }
                            }
                            try {
                                this.A05.A08().ABI(j10, System.currentTimeMillis() - j10, 0L, 0L, iA06, null);
                                throw e;
                            } catch (Throwable th3) {
                                th = th3;
                                c2324jF.close();
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            if (A0A[4].charAt(27) == 'R') {
                                A0A[3] = "p8aYiN6IujE52Q2p9R2WzRwMj4wd2wO9";
                            }
                            throw new RuntimeException();
                        }
                    }
                } catch (L6 e12) {
                    e = e12;
                    iA06 = 0;
                    if (c2324jF instanceof C2324jF) {
                        iA06 = ((C2324jF) c2324jF).A06();
                    }
                    this.A05.A08().ABI(j10, System.currentTimeMillis() - j10, 0L, 0L, iA06, null);
                    throw e;
                } catch (Throwable th5) {
                    th = th5;
                    c2324jF.close();
                    throw th;
                }
            }
            int iA03 = c2327jI.A03();
            int length = c2324jF.length();
            boolean z10 = length < 0;
            if (A0A[3].charAt(31) == '9') {
                A0A[3] = "O2qol2VIPsSIkPIIN6kN5hssl2djupr9";
                if (z10) {
                    boolean zA07 = A07(c2327jI);
                    if (this.A08) {
                        String str3 = A03(149, 21, 76) + str + A03(22, 16, 34) + zA07;
                    }
                }
                try {
                    try {
                        if (z10 || iA03 < length) {
                            c2324jF.AFz(iA03);
                            byte[] buffer = new byte[8192];
                            while (true) {
                                int i12 = c2324jF.read(buffer);
                                if (i12 == -1) {
                                    break;
                                } else {
                                    c2327jI.A08(buffer, i12);
                                }
                            }
                            if (!z10 || c2327jI.A03() == length) {
                                c2327jI.A07();
                                iA07 = 0;
                                if (c2324jF instanceof C2324jF) {
                                    iA07 = ((C2324jF) c2324jF).A06();
                                }
                                InterfaceC1589Su interfaceC1589SuA08 = this.A05.A08();
                                long jCurrentTimeMillis = System.currentTimeMillis() - j10;
                                long jA03 = c2327jI.A03();
                                strArr = A0A;
                                if (strArr[2].length() != strArr[5].length()) {
                                    A0A[0] = "LJMphR6GQubhlr";
                                } else {
                                    A0A[0] = "i3csCW72L1z7Bc";
                                }
                                interfaceC1589SuA08.ABI(j10, jCurrentTimeMillis, jA03, 0L, iA07, null);
                                c2324jF.close();
                                return;
                            }
                            throw new C2328jJ(A03(283, 20, 94));
                        }
                        c2324jF.close();
                        return;
                    } catch (L6 | IllegalArgumentException e13) {
                        if (this.A08) {
                            String str4 = A0B;
                            String[] strArr2 = A0A;
                            if (strArr2[2].length() != strArr2[5].length()) {
                                throw new RuntimeException();
                            }
                            A0A[1] = "AOKjIt2kEVzrEy7KBqss66";
                            Log.e(str4, strA03, e13);
                            return;
                        }
                        return;
                    }
                    if (!z10) {
                        c2327jI.A07();
                    } else {
                        throw new C2328jJ(A03(283, 20, 94));
                    }
                    iA07 = 0;
                    if (c2324jF instanceof C2324jF) {
                        iA07 = ((C2324jF) c2324jF).A06();
                    }
                    InterfaceC1589Su interfaceC1589SuA09 = this.A05.A08();
                    long jCurrentTimeMillis2 = System.currentTimeMillis() - j10;
                    long jA04 = c2327jI.A03();
                    strArr = A0A;
                    if (strArr[2].length() != strArr[5].length()) {
                        A0A[0] = "LJMphR6GQubhlr";
                    } else {
                        A0A[0] = "i3csCW72L1z7Bc";
                    }
                    interfaceC1589SuA09.ABI(j10, jCurrentTimeMillis2, jA04, 0L, iA07, null);
                } catch (L6 e14) {
                    e = e14;
                    iA06 = 0;
                    if (c2324jF instanceof C2324jF) {
                        iA06 = ((C2324jF) c2324jF).A06();
                    }
                    this.A05.A08().ABI(j10, System.currentTimeMillis() - j10, 0L, 0L, iA06, null);
                    throw e;
                } catch (Throwable th6) {
                    th = th6;
                    c2324jF.close();
                    throw th;
                }
            }
            throw new RuntimeException();
        } catch (L6 e15) {
            e = e15;
            if (A0A[0].length() == 14) {
                String[] strArr3 = A0A;
                strArr3[2] = "7VHRmmesbfeDqucWLtEKLKcMBQJVNm";
                strArr3[5] = "oM47EpnTTF1S9ikTK6B0AzPGZuSKH0";
            }
        }
    }

    private void A06(C2327jI c2327jI) {
        try {
            File fileA04 = c2327jI.A04();
            if (fileA04.exists()) {
                c2327jI.A06();
                boolean zDelete = fileA04.delete();
                if (this.A08) {
                    Log.i(A0B, A03(170, 52, 14) + zDelete);
                }
            }
        } catch (Exception e10) {
            if (A0A[0].length() != 14) {
                throw new RuntimeException();
            }
            A0A[3] = "fJTJjiotuyJvZrF72L8221tI8VUznJb9";
            if (this.A08) {
                Log.e(A0B, A03(108, 23, 18), e10);
            }
        }
    }

    private boolean A07(C2327jI c2327jI) {
        try {
            c2327jI.A05();
            if (A0A[4].charAt(27) != 'R') {
                throw new RuntimeException();
            }
            String[] strArr = A0A;
            strArr[7] = "zmS4hUlvHkaHxqc9Vg18exvolw";
            strArr[6] = "qC";
            return true;
        } catch (C2323jE e10) {
            if (this.A08) {
                Log.e(A0B, A03(244, 19, 48), e10);
                return false;
            }
            return false;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ky != com.facebook.ads.cache.config.CacheRequestConfig<T> */
    public final <T> C1382Kr<T> A08(C1386Kv c1386Kv, C1389Ky<T> c1389Ky) {
        Semaphore semaphore;
        if (c1389Ky.A03()) {
            File file = this.A06.get(c1386Kv.A09);
            if (file != null) {
                this.A04.AGl(c1386Kv.A09, true, c1386Kv);
                return c1389Ky.A00().A3p(file, this.A04);
            }
            this.A04.AGl(c1386Kv.A09, false, c1386Kv);
            return new C1382Kr<>(false, null);
        }
        String str = c1386Kv.A09;
        String str2 = c1386Kv.A04;
        StringBuilder sb2 = new StringBuilder();
        String baseUrl = this.A03.A03(str);
        String extension = sb2.append(baseUrl).append(str2).toString();
        synchronized (this.A07) {
            semaphore = this.A07.get(extension);
            if (semaphore == null) {
                semaphore = new Semaphore(1);
                this.A07.put(extension, semaphore);
            }
            try {
            } catch (Throwable th2) {
                semaphore.release();
                synchronized (this.A07) {
                    this.A07.remove(extension);
                    throw th2;
                }
            }
        }
        try {
            semaphore.acquire();
            File fileA02 = A02(c1386Kv, str, extension, this.A01, c1389Ky);
            if (fileA02 != null) {
                C1382Kr<T> c1382KrA3p = c1389Ky.A00().A3p(fileA02, this.A04);
                semaphore.release();
                synchronized (this.A07) {
                    this.A07.remove(extension);
                }
                return c1382KrA3p;
            }
            C1382Kr<T> c1382Kr = new C1382Kr<>(false, null);
            semaphore.release();
            synchronized (this.A07) {
                this.A07.remove(extension);
            }
            return c1382Kr;
        } catch (InterruptedException unused) {
            if (this.A08) {
                StringBuilder sb3 = new StringBuilder();
                String baseUrl2 = A03(97, 11, 52);
                StringBuilder sbAppend = sb3.append(baseUrl2).append(str);
                String baseUrl3 = A03(0, 22, 79);
                sbAppend.append(baseUrl3).toString();
            }
            C1382Kr<T> c1382Kr2 = new C1382Kr<>(false, null);
            semaphore.release();
            synchronized (this.A07) {
                this.A07.remove(extension);
                return c1382Kr2;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1380Kp
    public final C1382Kr<Bitmap> AHu(C1386Kv c1386Kv, boolean z10) {
        return A08(c1386Kv, new C1389Ky(new C2335jR(c1386Kv.A01, c1386Kv.A00, this.A02.A04(), this.A02.A03(), z10)));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ky != com.facebook.ads.cache.config.CacheRequestConfig<java.io.File> */
    @Override // com.facebook.ads.redexgen.core.InterfaceC1380Kp
    public final File AHv(C1386Kv c1386Kv) {
        C1389Ky c1389Ky = new C1389Ky(new C2334jQ());
        c1389Ky.A01(true);
        c1389Ky.A02(false);
        return (File) A08(c1386Kv, c1389Ky).A00();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1380Kp
    public final String AHw(C1386Kv c1386Kv) {
        return (String) A08(c1386Kv, new C1389Ky(new C2333jP())).A00();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ky != com.facebook.ads.cache.config.CacheRequestConfig<java.lang.String> */
    @Override // com.facebook.ads.redexgen.core.InterfaceC1380Kp
    public final String AHx(C1386Kv c1386Kv) {
        C1389Ky c1389Ky = new C1389Ky(new C2333jP());
        c1389Ky.A01(true);
        c1389Ky.A02(false);
        return (String) A08(c1386Kv, c1389Ky).A00();
    }
}
