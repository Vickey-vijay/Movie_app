package com.facebook.ads.redexgen.core;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.SystemClock;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.ads.androidx.media3.common.DrmInitData;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomizations;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vungle.ads.internal.protos.Sdk;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.14, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AnonymousClass14 extends C9Z {
    public static byte[] A13;
    public static String[] A14 = {"nx3Y", "ySV9u0UlUifM8l7YXQ9XliwCignJM927", "I56UD3cYRclrpAgGGb6MtOKCjcs9cL2j", "Sm2NURaNWtDVUJWNcAo7ERDS0hDt7", "bHPfo4AgOQoRvyPk4FB0ks", "XoiyS7TBeS4mt", "Z3oSrtXzlmftA", "iDWmG7Cddc7JoXPcHC9pChUfA3XnAJjW"};
    public static final byte[] A15;
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public long A0C;
    public MediaFormat A0D;
    public C9G A0E;
    public C9G A0F;
    public AO A0G;
    public AR A0H;
    public AY A0I;
    public C1109Aa A0J;
    public String A0K;
    public ByteBuffer A0L;
    public ArrayDeque<AR> A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;

    @MetaExoPlayerCustomization("Potentially can be removed. Added in D36797879")
    public long A0h;
    public C2654or A0i;
    public C09985g A0j;

    @MetaExoPlayerCustomization(type = {"NEW_CLASS_ARG"}, value = "D57514060: Do not added Dav1dMediaCodecInfo to the list of MediaCodecInfos if it's already added, can be cleaned up after launch")
    public boolean A0k;
    public boolean A0l;
    public boolean A0m;
    public final int A0n;
    public final int A0o;
    public final MediaCodec.BufferInfo A0p;
    public final C2576nY A0q;
    public final C2576nY A0r;
    public final C6N A0s;
    public final C9U A0t;
    public final InterfaceC1126Ar A0u;
    public final ArrayDeque<C1109Aa> A0v;
    public final List<Long> A0w;
    public final boolean A0x;
    public final boolean A0y;
    public final boolean A0z;
    public final MediaCodecRendererMetaParameters A10;
    public final C2249hv A11;

    @MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "D60404164: Merge init calls in the renderer")
    public final boolean A12;

    public static String A0x(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A13, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 65);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A15() {
        A13 = new byte[]{-74, -86, -20, -1, -2, -86, -8, -7, -86, -3, -17, -19, -1, -4, -17, -86, -18, -17, -19, -7, -18, -17, -4, -86, -21, 0, -21, -13, -10, -21, -20, -10, -17, -72, -86, -34, -4, 3, -13, -8, -15, -86, -2, -7, -86, -6, -4, -7, -19, -17, -17, -18, -86, 1, -13, -2, -14, -86, -110, -120, -87, -89, -77, -88, -87, -74, 100, -83, -78, -83, -72, -83, -91, -80, -83, -66, -91, -72, -83, -77, -78, 100, -86, -91, -83, -80, -87, -88, 112, 100, -74, -87, -72, -74, -67, -25, 8, 20, 24, 8, 24, 8, -61, 9, 4, 12, 15, 8, 7, -49, -61, 21, 8, 23, 21, 28, -22, 24, 19, -58, 25, 11, 25, 25, 15, 21, 20, -58, 24, 11, 23, 27, 15, 24, 11, 25, -58, 25, 11, 9, 27, 24, 11, -58, 10, 11, 9, 21, 10, 11, 24, -58, 12, 21, 24, -58, -103, -76, -68, -65, -72, -73, 115, -57, -62, 115, -68, -63, -68, -57, -68, -76, -65, -68, -51, -72, 115, -73, -72, -74, -62, -73, -72, -59, -115, 115, -113, -89, -90, -85, -93, 98, -76, -89, -77, -73, -85, -76, -89, -75, 98, -93, 98, -122, -76, -81, -107, -89, -75, -75, -85, -79, -80, -113, -93, -80, -93, -87, -89, -76, -47, -23, -24, -19, -27, -57, -13, -24, -23, -25, -42, -23, -14, -24, -23, -10, -23, -10, -78, -80, -69, -111, -88, -37, -36, -47, -46, -42, -111, -60, ExifInterface.MARKER_EOI, -58, -111, -57, -56, -58, -23, -25, -14, -56, -33, 18, 19, 8, 9, 13, -56, -5, 16, -3, -56, -2, -1, -3, -56, 13, -1, -3, 15, 12, -1, -79, -81, -70, -112, -81, -74, -83, -112, -93, -73, -90, -85, -79, -112, -90, -89, -91, -79, -90, -89, -76, -112, -81, -78, -107, -90, -92, -81, -123, -92, -85, -94, -123, -83, -96, -101, -100, -90, -123, -101, -100, -102, -90, -101, -100, -87, -123, -104, -83, -102, -83, -85, -74, -116, -84, -44, -57, -62, -57, -65, -116, -58, -112, -108, -110, -116, -62, -61, -63, -51, -62, -61, -103, -105, -94, 120, -104, -64, -77, -82, -77, -85, 120, -78, 124, -128, 126, 120, -82, -81, -83, -71, -82, -81, 120, -67, -81, -83, -65, -68, -81, -44, -46, -35, -77, -40, -54, -56, -77, -26, -5, -24, -77, -23, -22, -24, -35, -37, -26, -68, ExifInterface.MARKER_APP1, -45, -47, -68, -17, 4, -15, -68, -14, -13, -15, -68, 1, -13, -15, 3, 0, -13, -56, -58, -47, -89, -38, -27, -27, -16, -30, -25, -25, -34, -21, -89, -17, -30, -35, -34, -24, -89, -35, -34, -36, -24, -35, -34, -21, -89, -38, -17, -36, -53, -55, -44, -86, -35, -23, -24, -21, -29, -27, -33, -86, -35, -14, -33, -86, -32, ExifInterface.MARKER_APP1, -33, -21, -32, ExifInterface.MARKER_APP1, -18, -86, -35, -13, ExifInterface.MARKER_APP1, -17, -21, -23, ExifInterface.MARKER_APP1, 13, 11, 22, -20, 31, 43, ExifInterface.START_CODE, 45, 37, 39, 33, -20, 31, 52, 33, -20, 34, 35, 33, 45, 34, 35, 48, -20, 31, 53, 35, 49, 45, 43, 35, -20, 49, 35, 33, 51, 48, 35, -71, -73, -62, -104, -47, ExifInterface.MARKER_EOI, ExifInterface.MARKER_EOI, -47, -42, -49, -104, -53, -53, -51, -104, -50, -49, -51, ExifInterface.MARKER_EOI, -50, -49, -36, 4, 2, 13, -29, 28, 36, 36, 28, 33, 26, -29, 43, 36, 39, 23, 30, 40, -29, 25, 26, 24, 36, 25, 26, 39, 15, 13, 24, -18, 50, 43, -18, 54, 41, 36, 37, 47, 31, 36, 37, 35, 47, 36, 37, 50, -18, 33, 54, 35, -73, ExifInterface.MARKER_EOI, -52, -51, -52, ExifInterface.MARKER_EOI, ExifInterface.MARKER_EOI, -52, -53, -121, -53, -52, -54, -42, -53, -52, ExifInterface.MARKER_EOI, -121, -48, -43, -38, -37, -56, -43, -37, -48, -56, -37, -48, -42, -43, -121, -51, -56, -48, -45, -52, -53, -107, -121, -70, -45, -52, -52, -41, -48, -43, -50, -121, -37, -49, -52, -43, -121, ExifInterface.MARKER_EOI, -52, -37, ExifInterface.MARKER_EOI, -32, -48, -43, -50, -107, 7, 1, ExifInterface.MARKER_APP1, -11, -23, -27, -28, 15, 9, -23, -3, -15, -18, -20, 16, 10, -22, 4, -11, -19, -19, -104, -110, 114, -113, 124, 117, 117, 0, -6, -38, 1, -30, -27, -30, -79, -74, -81, -68, -68, -77, -70, 123, -79, -67, -61, -68, -62, -76, -64, -65, -73, -70, -72, -58, -61, -74, -108, -64, -75, -74, -76, -44, -29, -42, -46, -27, -42, -76, -32, -43, -42, -44, -85, -75, -61, -78, -70, -65, -110, -65, -75, -105, -74, -74, -75, -82, -76, -73, -67, -74, -84, -83, -70, -13, -7, -4, 2, -5, -15, -14, -1, -20, -7, 1, -14, -49, -51, -36, -65, -38, -55, -40, -40, -51, -52, -75, -51, -52, -47, -55, -85, -38, ExifInterface.MARKER_APP1, -40, -36, -41, -49, -38, -41, -35, -40, -51, -38, 15, 9, ExifInterface.MARKER_EOI, -41, -41, -41, -16, -19, -15, -17, -16, -4, -63, -71, -56, -75, -126, -72, -75, -54, -123, -72, -126, -75, -54, -123, -126, -72, -71, -73, -61, -72, -71, -58, 38, 39, 20, 37, 39, -10, 34, 23, 24, 22, -42, -53, -50, -61, -46, -53, -61, 16, 3, -2, -1, 9, -55, -5, 16, -54, -53, 29, 16, 11, 12, 22, -42, 11, 22, 19, 9, 32, -44, 29, 16, 26, 16, 22, 21, 9, -5, -10, 6, -6};
    }

    public abstract int A1g(AO ao2, AR ar, C2654or c2654or, C2654or c2654or2);

    public abstract int A1h(InterfaceC1126Ar interfaceC1126Ar, C9U c9u, C2654or c2654or) throws C1130Av;

    public abstract List<AR> A1l(InterfaceC1126Ar interfaceC1126Ar, C2654or c2654or, boolean z10) throws C1130Av;

    public abstract void A1u(C2576nY c2576nY);

    public abstract void A1v(@MetaExoPlayerCustomization AO ao2, MediaFormat mediaFormat) throws C9Y;

    public abstract void A1w(AR ar, AO ao2, C2654or c2654or, MediaCrypto mediaCrypto) throws C1130Av;

    @MetaExoPlayerCustomization("D45988204: [FBLite][Video] Add Codec Hooks for Logging")
    public abstract void A1x(String str);

    public abstract void A1y(String str, long j10, long j11);

    public abstract boolean A22();

    public abstract boolean A23(long j10, long j11, AO ao2, ByteBuffer byteBuffer, int i10, int i11, long j12, boolean z10, boolean z11) throws C9Y;

    static {
        A15();
        A15 = new byte[]{0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    }

    public AnonymousClass14(int i10, C2249hv c2249hv, MediaCodecRendererMetaParameters mediaCodecRendererMetaParameters, InterfaceC1126Ar interfaceC1126Ar, C9U c9u, boolean z10, boolean z11, int i11, int i12) {
        super(i10);
        this.A09 = -9223372036854775807L;
        this.A08 = -9223372036854775807L;
        this.A0m = false;
        this.A0k = false;
        C3M.A08(AbstractC09664a.A02 >= 16);
        this.A11 = (C2249hv) C3M.A01(c2249hv);
        this.A10 = (MediaCodecRendererMetaParameters) C3M.A01(mediaCodecRendererMetaParameters);
        this.A0u = (InterfaceC1126Ar) C3M.A01(interfaceC1126Ar);
        this.A0t = c9u;
        this.A0z = z10;
        this.A0x = z11;
        this.A0o = i11;
        this.A0n = i12;
        this.A0q = new C2576nY(0);
        this.A0r = C2576nY.A02();
        this.A0s = new C6N();
        this.A0w = new ArrayList();
        this.A0p = new MediaCodec.BufferInfo();
        this.A00 = 1.0f;
        this.A01 = 1.0f;
        this.A0v = new ArrayDeque<>();
        A18(C1109Aa.A04);
        this.A03 = 0;
        this.A04 = 0;
        this.A0A = -9223372036854775807L;
        this.A0B = -9223372036854775807L;
        this.A0C = -9223372036854775807L;
        this.A0y = MetaExoPlayerUpgradeConfig.A03(EnumC2253i2.A1r);
        this.A12 = MetaExoPlayerUpgradeConfig.A03(EnumC2253i2.A1c);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x007f  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:32:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:34:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:39:0x0117  */
    /* JADX WARN: Code duplicated, block: B:41:0x0124 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:47:? A[RETURN, SYNTHETIC] */
    private int A0w(String str) {
        String str2;
        String[] strArr;
        String[] strArr2;
        if (AbstractC09664a.A02 <= 25) {
            String strA0x = A0x(256, 25, 89);
            if (A14[0].length() == 4) {
                String[] strArr3 = A14;
                strArr3[6] = "h0JLQRwistZ4R";
                strArr3[5] = "YRyjkg8cOEuM6";
                if (strA0x.equals(str) && (AbstractC09664a.A06.startsWith(A0x(681, 7, 108)) || AbstractC09664a.A06.startsWith(A0x(653, 7, 115)) || AbstractC09664a.A06.startsWith(A0x(660, 7, 123)) || AbstractC09664a.A06.startsWith(A0x(674, 7, 4)))) {
                    return 2;
                }
                if (AbstractC09664a.A02 < 24) {
                    if (A0x(331, 22, 29).equals(str) && !A0x(353, 29, 9).equals(str)) {
                        return 0;
                    }
                    str2 = AbstractC09664a.A03;
                    strArr = A14;
                    if (strArr[4].length() != strArr[3].length()) {
                        String[] strArr4 = A14;
                        strArr4[4] = "Grbv6CKWzSbyHFrZua5Jwu";
                        strArr4[3] = "PMUv1GSkzI9tSaBJkI706oVY9TsOb";
                        if (!A0x(739, 8, 7).equals(str2)) {
                            if (!A0x(747, 12, 76).equals(AbstractC09664a.A03)) {
                                if (!A0x(780, 7, 39).equals(AbstractC09664a.A03)) {
                                    if (!A0x(831, 7, 33).equals(AbstractC09664a.A03)) {
                                        return 0;
                                    }
                                }
                            }
                        }
                        strArr2 = A14;
                        if (strArr2[6].length() == strArr2[5].length()) {
                            String[] strArr5 = A14;
                            strArr5[6] = "FCPESGyqb3ntu";
                            strArr5[5] = "UMDsUUTIxH2ng";
                            return 1;
                        }
                    }
                } else {
                    return 0;
                }
            }
        } else if (AbstractC09664a.A02 < 24) {
            if (A0x(331, 22, 29).equals(str)) {
            }
            str2 = AbstractC09664a.A03;
            strArr = A14;
            if (strArr[4].length() != strArr[3].length()) {
                String[] strArr6 = A14;
                strArr6[4] = "Grbv6CKWzSbyHFrZua5Jwu";
                strArr6[3] = "PMUv1GSkzI9tSaBJkI706oVY9TsOb";
                if (!A0x(739, 8, 7).equals(str2)) {
                    if (!A0x(747, 12, 76).equals(AbstractC09664a.A03)) {
                        if (!A0x(780, 7, 39).equals(AbstractC09664a.A03)) {
                            if (!A0x(831, 7, 33).equals(AbstractC09664a.A03)) {
                                return 0;
                            }
                        }
                    }
                }
                strArr2 = A14;
                if (strArr2[6].length() == strArr2[5].length()) {
                    String[] strArr7 = A14;
                    strArr7[6] = "FCPESGyqb3ntu";
                    strArr7[5] = "UMDsUUTIxH2ng";
                    return 1;
                }
            }
        } else {
            return 0;
        }
        throw new RuntimeException();
    }

    private ByteBuffer A0y(int i10) {
        return this.A0G.A8B(i10);
    }

    private ByteBuffer A0z(int i10) {
        return this.A0G.A8W(i10);
    }

    private List<AR> A10(boolean z10) throws C1130Av {
        String alternativeMimeType;
        List<AR> listA1l = A1l(this.A0u, this.A0i, z10);
        if (listA1l.isEmpty() && z10) {
            listA1l = A1l(this.A0u, this.A0i, false);
            if (!listA1l.isEmpty()) {
                AnonymousClass44.A07(A0x(Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 18, 67), A0x(116, 40, 101) + this.A0i.A0W + A0x(0, 58, 73) + listA1l + A0x(58, 1, 35));
            }
        }
        if (listA1l.isEmpty() && this.A0l && (alternativeMimeType = C1133Ay.A0P(this.A0i)) != null) {
            List<AR> listA7g = this.A0u.A7g(alternativeMimeType, false, false);
            if (AbstractC09664a.A02 >= 26) {
                if (A0x(848, 18, 102).equals(this.A0i.A0W) && !listA7g.isEmpty()) {
                    return listA7g;
                }
                return listA1l;
            }
            return listA1l;
        }
        return listA1l;
    }

    private void A11() throws C9Y {
        if (this.A04 == 2) {
            A1n();
            A1p();
        } else {
            if (A14[0].length() != 4) {
                throw new RuntimeException();
            }
            String[] strArr = A14;
            strArr[4] = "s3YfZmdbCJrJCYfdnx93Y1";
            strArr[3] = "Or76pnfNSBivOkp3C019O1267DCns";
            this.A0b = true;
            A1o();
        }
    }

    private void A12() throws C9Y {
        MediaFormat mediaFormatA8X = this.A0G.A8X();
        if (this.A02 != 0 && mediaFormatA8X.getInteger(A0x(866, 5, 81)) == 32 && mediaFormatA8X.getInteger(A0x(793, 6, 71)) == 32) {
            this.A0c = true;
            return;
        }
        if (this.A0T) {
            mediaFormatA8X.setInteger(A0x(688, 13, 13), 1);
        }
        this.A0D = mediaFormatA8X;
        this.A0U = true;
        A1v(this.A0G, mediaFormatA8X);
    }

    private void A13() {
        this.A05 = -1;
        this.A0q.A02 = null;
    }

    private void A14() {
        this.A06 = -1;
        this.A0L = null;
    }

    @MetaExoPlayerCustomizations({@MetaExoPlayerCustomization("Call to 'forceDisableAsynchronous'"), @MetaExoPlayerCustomization("D45988204: [FBLite][Video] Add Codec Hooks for Logging"), @MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "D60404164: Merge init calls in the renderer")})
    private void A16(AR ar, MediaCrypto mediaCrypto) throws Exception {
        AO aoA0K = null;
        String str = ar.A03;
        try {
            if (this.A12) {
                A1z(str, this.A0i);
            } else {
                A1t(this.A0i);
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (!this.A12) {
                A1x(str);
            }
            C4S.A02(A0x(IronSourceError.ERROR_NT_LOAD_NO_CONFIG, 12, 48) + str);
            new C2530mo().A00();
            aoA0K = AV.A02().A0K(A22(), this.A11, this.A10.getA00(), EnumC2246hq.A05, str);
            try {
                this.A0K = str;
                C4S.A00();
                C4S.A02(A0x(701, 14, 16));
                try {
                    A1w(ar, aoA0K, this.A0i, mediaCrypto);
                    C4S.A00();
                    C4S.A02(A0x(821, 10, 114));
                    aoA0K.start();
                    C4S.A00();
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    this.A0G = aoA0K;
                    this.A0H = ar;
                    A1y(str, jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime);
                } catch (Exception e10) {
                    e = e10;
                    if (aoA0K != null) {
                        aoA0K.AGr();
                    }
                    throw e;
                }
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Exception e12) {
            e = e12;
        }
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "D53064452: Add decoder init time failure thread sleep")
    private void A17(AR ar, AR ar2, MediaCrypto mediaCrypto) throws Exception {
        int iA00 = MetaExoPlayerUpgradeConfig.A00(EnumC2254i3.A06);
        if (iA00 >= 0) {
            try {
                A16(ar2, mediaCrypto);
                return;
            } catch (Exception e10) {
                if (ar2 == ar) {
                    AnonymousClass44.A07(A0x(Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 18, 67), A0x(590, 63, 38));
                    Thread.sleep(iA00);
                    A16(ar2, mediaCrypto);
                    return;
                }
                throw e10;
            }
        }
        A16(ar2, mediaCrypto);
    }

    private void A18(C1109Aa c1109Aa) {
        this.A0J = c1109Aa;
        if (c1109Aa.A02 != -9223372036854775807L) {
            this.A0a = true;
        }
    }

    private boolean A19() {
        if (this.A0n <= 0) {
            return false;
        }
        boolean z10 = this.A08 == -9223372036854775807L || System.currentTimeMillis() - this.A08 <= ((long) this.A0n);
        if (this.A08 == -9223372036854775807L) {
            AnonymousClass44.A07(A0x(Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 18, 67), A0x(95, 21, 98));
            try {
                this.A0M = null;
                A1n();
            } catch (IllegalStateException unused) {
            }
            this.A08 = System.currentTimeMillis();
        }
        return z10;
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "D70661541: Skip the sample if sample is too large")
    private boolean A1A() throws C9Y {
        int result;
        if (this.A0G == null || this.A04 == 2 || this.A0Y) {
            return false;
        }
        if (this.A05 < 0) {
            this.A05 = this.A0G.A5k();
            if (this.A05 < 0) {
                return false;
            }
            this.A0q.A02 = A0y(this.A05);
            this.A0q.A0A();
        }
        if (this.A04 == 1) {
            if (!this.A0R) {
                this.A0W = true;
                this.A0G.AGY(this.A05, 0, 0, 0L, 4);
                A13();
            }
            this.A04 = 2;
            return false;
        }
        if (this.A0N) {
            this.A0N = false;
            this.A0q.A02.put(A15);
            this.A0G.AGY(this.A05, 0, A15.length, 0L, 0);
            A13();
            this.A0V = true;
            String[] strArr = A14;
            if (strArr[4].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A14;
            strArr2[7] = "TQo31YhCROQVY4YgWOUT3bWhQ8E3XWwr";
            strArr2[1] = "W5PRMN9OPETbxvbbJic4GeLECMZHBr0G";
            return true;
        }
        int iPosition = 0;
        if (this.A0g) {
            result = -4;
        } else {
            if (this.A03 == 1) {
                for (int i10 = 0; i10 < this.A0i.A0X.size(); i10++) {
                    this.A0q.A02.put(this.A0i.A0X.get(i10));
                }
                this.A03 = 2;
            }
            iPosition = this.A0q.A02.position();
            boolean zA03 = MetaExoPlayerUpgradeConfig.A03(EnumC2253i2.A10);
            if (A14[2].charAt(29) == 'f') {
                throw new RuntimeException();
            }
            String[] strArr3 = A14;
            strArr3[6] = "tFzAjqlOyn071";
            strArr3[5] = "66mU3uAl0xlMl";
            if (zA03) {
                try {
                    result = A1R(this.A0s, this.A0q, 0);
                } catch (C5R unused) {
                    A1C(0);
                    A1m();
                    return true;
                }
            } else {
                result = A1R(this.A0s, this.A0q, 0);
            }
        }
        if (A9h() || this.A0q.A08()) {
            this.A0B = this.A0A;
        }
        if (result == -3) {
            return false;
        }
        if (result == -5) {
            if (this.A03 == 2) {
                this.A0q.A0A();
                this.A03 = 1;
            }
            A1s(this.A0s.A00);
            return true;
        }
        if (this.A0q.A05()) {
            if (this.A03 == 2) {
                this.A0q.A0A();
                this.A03 = 1;
            }
            this.A0Y = true;
            if (!this.A0V) {
                A11();
                return false;
            }
            try {
                if (!this.A0R) {
                    this.A0W = true;
                    this.A0G.AGY(this.A05, 0, 0, 0L, 4);
                    A13();
                }
                return false;
            } catch (MediaCodec.CryptoException e10) {
                C2654or c2654or = this.A0i;
                int adaptiveReconfigurationBytes = e10.getErrorCode();
                throw A1S(e10, c2654or, AbstractC09664a.A02(adaptiveReconfigurationBytes));
            }
        }
        if (this.A0f && !this.A0q.A07()) {
            this.A0q.A0A();
            if (this.A03 == 2) {
                this.A03 = 1;
            }
            return true;
        }
        this.A0f = false;
        boolean skipIfSampleTooLarge = this.A0q.A0E();
        boolean bufferEncrypted = this.A10.getA01();
        if (bufferEncrypted && skipIfSampleTooLarge) {
            this.A0q.A05.A01(iPosition);
        }
        boolean bufferEncrypted2 = A1N(skipIfSampleTooLarge);
        this.A0g = bufferEncrypted2;
        boolean bufferEncrypted3 = this.A0g;
        if (bufferEncrypted3) {
            return false;
        }
        boolean bufferEncrypted4 = this.A0O;
        if (bufferEncrypted4 && !skipIfSampleTooLarge) {
            AbstractC1278Gq.A0G(this.A0q.A02);
            if (this.A0q.A02.position() == 0) {
                return true;
            }
            this.A0O = false;
        }
        try {
            long j10 = this.A0q.A01;
            boolean bufferEncrypted5 = this.A0q.A04();
            if (bufferEncrypted5) {
                this.A0w.add(Long.valueOf(j10));
            }
            this.A0A = Math.max(this.A0A, j10);
            this.A0q.A0B();
            A1u(this.A0q);
            if (skipIfSampleTooLarge) {
                this.A0G.AGa(this.A05, 0, this.A0q.A05, j10, 0);
            } else {
                this.A0G.AGY(this.A05, 0, this.A0q.A02.limit(), j10, 0);
            }
            A13();
            this.A0V = true;
            this.A03 = 0;
            this.A0j.A08++;
            return true;
        } catch (MediaCodec.CryptoException e11) {
            C2654or c2654or2 = this.A0i;
            int adaptiveReconfigurationBytes2 = e11.getErrorCode();
            throw A1S(e11, c2654or2, AbstractC09664a.A02(adaptiveReconfigurationBytes2));
        }
    }

    private boolean A1B() {
        return this.A06 >= 0;
    }

    private boolean A1C(int i10) throws C9Y {
        C6N c6nA1U = A1U();
        this.A0r.A0A();
        int iA1R = A1R(c6nA1U, this.A0r, i10 | 4);
        if (iA1R == -5) {
            A1s(c6nA1U.A00);
            return true;
        }
        if (iA1R == -4 && this.A0r.A05()) {
            this.A0Y = true;
            A11();
        }
        int result = A14[2].charAt(29);
        if (result == 102) {
            throw new RuntimeException();
        }
        String[] strArr = A14;
        strArr[4] = "I6wAGrX36WnyTLz4kIu2A0";
        strArr[3] = "sKJkcvNhIyFX1pRFROyyBnawIxNqa";
        return false;
    }

    private boolean A1D(long j10) {
        int size = this.A0w.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.A0w.get(i10).longValue() == j10) {
                this.A0w.remove(i10);
                return true;
            }
        }
        String[] strArr = A14;
        String str = strArr[4];
        String str2 = strArr[3];
        int length = str.length();
        int size2 = str2.length();
        if (length == size2) {
            throw new RuntimeException();
        }
        String[] strArr2 = A14;
        strArr2[4] = "k0VQHwP22phbTrXBZc8FuM";
        strArr2[3] = "DsxaarEsX3gZUO5CYPDgS2koeov7n";
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005e  */
    /* JADX WARN: Code duplicated, block: B:59:0x010e  */
    private boolean A1E(long j10, long j11) throws C9Y {
        boolean z10;
        boolean processedOutputBuffer;
        int iA5m;
        if (!A1B()) {
            boolean z11 = this.A0Q;
            String[] strArr = A14;
            if (strArr[6].length() == strArr[5].length()) {
                String[] strArr2 = A14;
                strArr2[4] = "3Zz5yYcdEnea2Q2Ufvkja4";
                strArr2[3] = "iabR8Vve1dDezsMpvwSmTE3MhP0dx";
                if (z11) {
                    boolean z12 = this.A0W;
                    String[] strArr3 = A14;
                    if (strArr3[6].length() != strArr3[5].length()) {
                        throw new RuntimeException();
                    }
                    A14[0] = "OUdi";
                    if (z12) {
                        try {
                            iA5m = this.A0G.A5m(this.A0p);
                        } catch (IllegalStateException unused) {
                            A11();
                            if (this.A0b) {
                                A1n();
                            }
                            return false;
                        }
                    } else {
                        iA5m = this.A0G.A5m(this.A0p);
                    }
                } else {
                    iA5m = this.A0G.A5m(this.A0p);
                }
                if (iA5m >= 0) {
                    if (this.A0c) {
                        this.A0c = false;
                        AO ao2 = this.A0G;
                        if (A14[2].charAt(29) == 'f') {
                            ao2.AGy(iA5m, false);
                            return true;
                        }
                        String[] strArr4 = A14;
                        strArr4[6] = "Sxw7BJ5DCdkMn";
                        strArr4[5] = "uR5ffcKC2c0Qe";
                        ao2.AGy(iA5m, false);
                        return true;
                    }
                    if (this.A0p.size == 0 && (this.A0p.flags & 4) != 0) {
                        A11();
                        return false;
                    }
                    this.A06 = iA5m;
                    ByteBuffer byteBufferA0z = A0z(iA5m);
                    if (A14[2].charAt(29) != 'f') {
                        A14[0] = "bTu1";
                        this.A0L = byteBufferA0z;
                        if (this.A0L != null) {
                            this.A0L.position(this.A0p.offset);
                            this.A0L.limit(this.A0p.offset + this.A0p.size);
                        }
                    } else {
                        A14[2] = "jn7zZa5Ao9aeuRKBiubAI8gr9vrzbXZe";
                        this.A0L = byteBufferA0z;
                        if (this.A0L != null) {
                            this.A0L.position(this.A0p.offset);
                            this.A0L.limit(this.A0p.offset + this.A0p.size);
                        }
                    }
                    this.A0d = A1D(this.A0p.presentationTimeUs);
                    this.A0Z = this.A0B == this.A0p.presentationTimeUs;
                } else if (iA5m == -2) {
                    A12();
                    String[] strArr5 = A14;
                    String str = strArr5[6];
                    String str2 = strArr5[5];
                    int length = str.length();
                    int outputIndex = str2.length();
                    if (length == outputIndex) {
                        String[] strArr6 = A14;
                        strArr6[7] = "7r6cHUpNxW9OyUOBJtqRlgz4yWKhxuS5";
                        strArr6[1] = "dTVs3H4w0ZVIwZf9Hv7c5Sb2vArQM5gg";
                        return true;
                    }
                } else {
                    if (iA5m == -3) {
                        return true;
                    }
                    if (this.A0R && (this.A0Y || this.A04 == 2)) {
                        A11();
                    }
                    return false;
                }
            }
            throw new RuntimeException();
        }
        if (this.A0Q && this.A0W) {
            try {
                z10 = false;
                try {
                    processedOutputBuffer = A23(j10, j11, this.A0G, this.A0L, this.A06, this.A0p.flags, this.A0p.presentationTimeUs, this.A0d, this.A0Z);
                } catch (IllegalStateException unused2) {
                    A11();
                    if (this.A0b) {
                        A1n();
                    }
                    return z10;
                }
            } catch (IllegalStateException unused3) {
                z10 = false;
            }
        } else {
            z10 = false;
            processedOutputBuffer = A23(j10, j11, this.A0G, this.A0L, this.A06, this.A0p.flags, this.A0p.presentationTimeUs, this.A0d, this.A0Z);
        }
        if (processedOutputBuffer) {
            A1q(this.A0p.presentationTimeUs);
            boolean processedOutputBuffer2 = (this.A0p.flags & 4) != 0;
            A14();
            if (!processedOutputBuffer2) {
                return true;
            }
            A11();
        }
        return z10;
    }

    private boolean A1F(MediaCrypto mediaCrypto, boolean z10) throws AY {
        if (this.A0M == null) {
            try {
                List<AR> listA10 = A10(z10);
                if (this.A0x) {
                    this.A0M = new ArrayDeque<>(listA10);
                } else {
                    this.A0M = new ArrayDeque<>(Collections.singletonList(listA10.get(0)));
                }
                this.A0I = null;
            } catch (C1130Av e10) {
                throw new AY(this.A0i, e10, z10, -49998);
            }
        }
        if (!this.A0k && A21()) {
            this.A0M.addFirst(AR.A02(A0x(799, 22, 19), this.A0i.A0W, this.A0i.A0W, null, false, true, false, false, false));
        }
        if (!this.A0M.isEmpty()) {
            AR arPeekFirst = this.A0M.peekFirst();
            do {
                AR arPeekFirst2 = this.A0M.peekFirst();
                if (!A25(arPeekFirst2)) {
                    return false;
                }
                try {
                    A17(arPeekFirst, arPeekFirst2, mediaCrypto);
                    return true;
                } catch (Exception e11) {
                    AnonymousClass44.A0A(A0x(Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 18, 67), A0x(156, 30, 18) + arPeekFirst2, e11);
                    this.A0M.removeFirst();
                    AY ay = new AY(this.A0i, e11, z10, arPeekFirst2);
                    if (this.A0I == null) {
                        this.A0I = ay;
                    } else {
                        this.A0I = this.A0I.A00(ay);
                    }
                }
            } while (!this.A0M.isEmpty());
            throw this.A0I;
        }
        throw new AY(this.A0i, (Throwable) null, z10, -49999);
    }

    public static boolean A1G(C2654or c2654or) {
        return c2654or.A07 == 0 || c2654or.A07 == 2;
    }

    public static boolean A1H(AR ar) {
        String str = ar.A03;
        if (AbstractC09664a.A02 <= 17) {
            String name = A0x(566, 24, 127);
            if (!name.equals(str)) {
                String name2 = A0x(419, 31, 56);
                if (name2.equals(str)) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003a  */
    /* JADX WARN: Code duplicated, block: B:12:0x004b  */
    /* JADX WARN: Code duplicated, block: B:14:0x0063  */
    /* JADX WARN: Code duplicated, block: B:16:0x006d  */
    /* JADX WARN: Code duplicated, block: B:20:0x007f  */
    /* JADX WARN: Code duplicated, block: B:8:0x0034  */
    public static boolean A1I(String str) {
        String[] strArr;
        if (AbstractC09664a.A02 > 23) {
            if (AbstractC09664a.A02 <= 19) {
                if (A0x(787, 6, 102).equals(AbstractC09664a.A03)) {
                    strArr = A14;
                    if (strArr[6].length() != strArr[5].length()) {
                        if (!A0x(450, 31, 59).equals(str)) {
                            if (A0x(481, 38, 125).equals(str)) {
                            }
                        }
                    } else {
                        String[] strArr2 = A14;
                        strArr2[7] = "lQUGM0gwxiouwODu2Sf00uvqO0zTfr3c";
                        strArr2[1] = "xcBcqPxRh43dKrs9lyzAmVul0JtIaCtf";
                        if (!A0x(450, 31, 59).equals(str)) {
                            if (A0x(481, 38, 125).equals(str)) {
                            }
                        }
                    }
                }
            }
            return false;
        }
        String[] strArr3 = A14;
        if (strArr3[4].length() == strArr3[3].length()) {
            throw new RuntimeException();
        }
        String[] strArr4 = A14;
        strArr4[4] = "BtOe3nAvRfSweps9KMSbQL";
        strArr4[3] = "8BFXWDNhFQQqbiuKKB32KUMMZhTUo";
        if (!A0x(541, 25, 116).equals(str)) {
            if (AbstractC09664a.A02 <= 19) {
                if (A0x(787, 6, 102).equals(AbstractC09664a.A03)) {
                    strArr = A14;
                    if (strArr[6].length() != strArr[5].length()) {
                        if (!A0x(450, 31, 59).equals(str)) {
                            if (A0x(481, 38, 125).equals(str)) {
                            }
                        }
                    } else {
                        String[] strArr5 = A14;
                        strArr5[7] = "lQUGM0gwxiouwODu2Sf00uvqO0zTfr3c";
                        strArr5[1] = "xcBcqPxRh43dKrs9lyzAmVul0JtIaCtf";
                        if (!A0x(450, 31, 59).equals(str)) {
                            if (A0x(481, 38, 125).equals(str)) {
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static boolean A1J(String str) {
        return AbstractC09664a.A02 == 21 && A0x(519, 22, 41).equals(str);
    }

    public static boolean A1K(String str) {
        if (AbstractC09664a.A02 >= 18 && (AbstractC09664a.A02 != 18 || (!A0x(382, 15, 68).equals(str) && !A0x(397, 22, 77).equals(str)))) {
            if (AbstractC09664a.A02 == 19 && AbstractC09664a.A06.startsWith(A0x(667, 7, 124))) {
                if (!A0x(238, 18, 34).equals(str)) {
                    if (A14[0].length() != 4) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A14;
                    strArr[6] = "NlNH7MPHVQXxq";
                    strArr[5] = "FDVIIX4T9j7Ji";
                    if (A0x(256, 25, 89).equals(str)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static boolean A1L(String str, C2654or c2654or) {
        return AbstractC09664a.A02 < 21 && c2654or.A0X.isEmpty() && A0x(306, 25, 22).equals(str);
    }

    public static boolean A1M(String str, C2654or c2654or) {
        return AbstractC09664a.A02 <= 18 && c2654or.A06 == 1 && A0x(281, 25, 33).equals(str);
    }

    private boolean A1N(boolean z10) throws C9Y {
        if (this.A0E == null || (!z10 && this.A0z)) {
            return false;
        }
        int iA92 = this.A0E.A92();
        if (iA92 != 1) {
            return iA92 != 4;
        }
        C9E c9e = (C9E) C3M.A01(this.A0E.A7s());
        C9E c9eA7s = this.A0E.A7s();
        C2654or c2654or = this.A0i;
        int drmSessionState = c9e.A00;
        throw A1S(c9eA7s, c2654or, drmSessionState);
    }

    @Override // com.facebook.ads.redexgen.core.C9Z
    public void A1X() {
    }

    @Override // com.facebook.ads.redexgen.core.C9Z
    public void A1Y() {
    }

    @Override // com.facebook.ads.redexgen.core.C9Z
    public void A1Z() {
        this.A0i = null;
        A18(C1109Aa.A04);
        this.A0v.clear();
        this.A0M = null;
        try {
            A1n();
            try {
                if (this.A0E != null) {
                    this.A0E.AGs(null);
                }
                try {
                    if (this.A0F != null && this.A0F != this.A0E) {
                        this.A0F.AGs(null);
                    }
                } finally {
                    this.A0E = null;
                    this.A0F = null;
                }
            } catch (Throwable th2) {
                try {
                    if (this.A0F != null && this.A0F != this.A0E) {
                        this.A0F.AGs(null);
                    }
                    throw th2;
                } finally {
                    this.A0E = null;
                    this.A0F = null;
                }
            }
        } catch (Throwable th3) {
            try {
                if (this.A0E != null) {
                    this.A0E.AGs(null);
                }
                try {
                    if (this.A0F != null && this.A0F != this.A0E) {
                        this.A0F.AGs(null);
                    }
                    throw th3;
                } finally {
                    this.A0E = null;
                    this.A0F = null;
                }
            } catch (Throwable th4) {
                try {
                    if (this.A0F != null && this.A0F != this.A0E) {
                        this.A0F.AGs(null);
                    }
                    throw th4;
                } finally {
                    this.A0E = null;
                    this.A0F = null;
                }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.C9Z
    public void A1a(long j10, boolean z10) throws C9Y {
        this.A0Y = false;
        this.A0b = false;
        if (this.A0G != null) {
            A1m();
        }
        if (this.A0J.A03.A01() > 0) {
            this.A0e = true;
        }
        this.A0J.A03.A02();
        this.A0v.clear();
    }

    @Override // com.facebook.ads.redexgen.core.C9Z
    @MetaExoPlayerCustomization("D36797879: Adding implementation for calculating avg render time")
    public void A1b(boolean z10, boolean z11) throws C9Y {
        this.A0j = new C09985g();
        this.A0h = 0L;
    }

    @Override // com.facebook.ads.redexgen.core.C9Z
    public void A1c(C2654or[] c2654orArr, long j10, long j11) throws C9Y {
    }

    public final float A1f() {
        return this.A00;
    }

    public final long A1i() {
        return this.A0J.A02;
    }

    public final AO A1j() {
        return this.A0G;
    }

    public final AR A1k() {
        return this.A0H;
    }

    public void A1m() throws C9Y {
        this.A07 = -9223372036854775807L;
        A13();
        A14();
        this.A0f = true;
        this.A0g = false;
        this.A0d = false;
        this.A0w.clear();
        this.A0N = false;
        this.A0c = false;
        this.A0Z = false;
        this.A0C = -9223372036854775807L;
        this.A0B = -9223372036854775807L;
        if (this.A0S) {
            A1n();
            A1p();
        } else {
            boolean z10 = this.A0P;
            String[] strArr = A14;
            if (strArr[6].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            A14[0] = "8Nzt";
            if ((z10 && this.A0W) || A20() || this.A04 != 0) {
                A1n();
                A1p();
            } else {
                this.A0G.flush();
                this.A0V = false;
            }
        }
        if (this.A0X && this.A0i != null) {
            this.A03 = 1;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1n() {
        this.A07 = -9223372036854775807L;
        this.A09 = -9223372036854775807L;
        this.A08 = -9223372036854775807L;
        A13();
        A14();
        this.A0D = null;
        this.A0U = false;
        this.A0g = false;
        this.A0d = false;
        this.A0w.clear();
        this.A0H = null;
        this.A0X = false;
        this.A0V = false;
        this.A0O = false;
        this.A0S = false;
        this.A02 = 0;
        this.A0R = false;
        this.A0P = false;
        this.A0T = false;
        this.A0N = false;
        this.A0c = false;
        this.A0W = false;
        this.A03 = 0;
        this.A04 = 0;
        if (this.A0G != null) {
            this.A0j.A03++;
            try {
                AV.A02().A0L(A22(), this.A11, this.A10.getA00(), EnumC2246hq.A05, this.A0K, this.A0G);
                this.A0G = null;
                C9G c9g = this.A0E;
                String[] strArr = A14;
                if (strArr[6].length() == strArr[5].length()) {
                    String[] strArr2 = A14;
                    strArr2[7] = "JSCNcek9dAkyOPO1KkbpJsRj9JD6rmzz";
                    strArr2[1] = "RONQ7IAwO8Bcbv1Krrdz5fvlVLwlovmm";
                    if (c9g != null && this.A0F != this.A0E) {
                        try {
                            this.A0E.AGs(null);
                            return;
                        } finally {
                            this.A0E = null;
                            this.A0K = null;
                        }
                    }
                    return;
                }
            } catch (Throwable th2) {
                this.A0G = null;
                String[] strArr3 = A14;
                if (strArr3[7].charAt(2) != strArr3[1].charAt(2)) {
                    A14[2] = "iwo0woIVvHFpnZaxaWQfv32BCS9fYlqT";
                    if (this.A0E != null && this.A0F != this.A0E) {
                        try {
                            this.A0E.AGs(null);
                        } finally {
                            this.A0E = null;
                            this.A0K = null;
                        }
                    }
                    throw th2;
                }
            }
            throw new RuntimeException();
        }
    }

    public void A1o() throws C9Y {
    }

    public final void A1p() throws C9Y {
        long jElapsedRealtime;
        if (this.A0G != null || this.A0i == null) {
            return;
        }
        this.A0E = this.A0F;
        if (this.A0E != null) {
            this.A0E.A7N();
            if (0 == 0) {
                if (this.A0E.A7s() == null) {
                    return;
                }
            } else {
                throw new NullPointerException(A0x(759, 21, 39));
            }
        }
        try {
            if (!A1F(null, false)) {
                return;
            }
            String str = this.A0H.A03;
            this.A02 = A0w(str);
            this.A0O = A1L(str, this.A0i);
            this.A0S = A1K(str);
            this.A0R = A1H(this.A0H);
            this.A0P = A1I(str);
            this.A0Q = A1J(str);
            this.A0T = A1M(str, this.A0i);
            if (A92() == 2) {
                jElapsedRealtime = SystemClock.elapsedRealtime() + 1000;
            } else {
                jElapsedRealtime = -9223372036854775807L;
            }
            this.A07 = jElapsedRealtime;
            A13();
            A14();
            this.A09 = -9223372036854775807L;
            this.A0f = true;
            this.A0j.A02++;
        } catch (AY e10) {
            String mimeType = A14[0];
            if (mimeType.length() != 4) {
                throw new RuntimeException();
            }
            String[] strArr = A14;
            strArr[4] = "htoDBH0u2SWwWLv1LDVpoG";
            strArr[3] = "VZtqtU1mGbN1CVtxZAbUMauSXb3bc";
            if (this.A0o > 0 && (this.A09 == -9223372036854775807L || System.currentTimeMillis() - this.A09 <= this.A0o)) {
                if (this.A09 == -9223372036854775807L) {
                    String strA0x = A0x(Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 18, 67);
                    String mimeType2 = A0x(59, 36, 3);
                    AnonymousClass44.A07(strA0x, mimeType2);
                    this.A09 = System.currentTimeMillis();
                }
                if (this.A0M != null && this.A0M.isEmpty()) {
                    this.A0M = null;
                    return;
                }
                return;
            }
            throw A1S(e10, this.A0i, 4001);
        }
    }

    public void A1q(long j10) {
    }

    @MetaExoPlayerCustomization("Needed for sr video effects")
    public void A1r(C2654or c2654or) {
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0095  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d6  */
    public void A1s(C2654or c2654or) throws C9Y {
        DrmInitData drmInitData;
        boolean z10;
        A1r(c2654or);
        this.A0e = true;
        C2654or c2654or2 = this.A0i;
        this.A0i = c2654or;
        DrmInitData drmInitData2 = this.A0i.A0O;
        if (c2654or2 == null) {
            drmInitData = null;
        } else {
            drmInitData = c2654or2.A0O;
        }
        if (!AbstractC09664a.A1E(drmInitData2, drmInitData)) {
            if (this.A0i.A0O != null) {
                if (this.A0t != null) {
                    this.A0F = this.A0t.A34(null, this.A0i);
                    String[] strArr = A14;
                    if (strArr[7].charAt(2) != strArr[1].charAt(2)) {
                        String[] strArr2 = A14;
                        strArr2[4] = "XpQaMzaYCeQHSX1wHIt01O";
                        strArr2[3] = "hhT7VitQ1539e1hJWaIaN1DiIME5w";
                        if (this.A0F == this.A0E) {
                            C9G c9g = this.A0F;
                            String[] strArr3 = A14;
                            if (strArr3[7].charAt(2) != strArr3[1].charAt(2)) {
                                A14[2] = "mOmb8wihr9xQYP3CL5DV18o0OoEn6eG9";
                                c9g.AGs(null);
                            }
                        }
                    }
                    throw new RuntimeException();
                }
                C6O c6o = new C6O(A0x(186, 34, 1));
                C2654or oldFormat = this.A0i;
                throw A1S(c6o, oldFormat, 4005);
            }
            this.A0F = null;
        }
        boolean z11 = false;
        if (this.A0F == this.A0E) {
            AO ao2 = this.A0G;
            String[] strArr4 = A14;
            if (strArr4[4].length() == strArr4[3].length()) {
                if (ao2 != null) {
                    switch (A1g(this.A0G, this.A0H, c2654or2, this.A0i)) {
                        case 0:
                            break;
                        case 1:
                            z11 = true;
                            break;
                        case 2:
                        default:
                            throw new IllegalStateException();
                        case 3:
                            z11 = true;
                            this.A0X = true;
                            this.A03 = 1;
                            if (this.A02 != 2) {
                                z10 = true;
                            } else {
                                z10 = true;
                            }
                            this.A0N = z10;
                            break;
                    }
                }
            } else {
                A14[2] = "hgu32AMElELcnmKjNvgDCLPWqu1wVZzY";
                if (ao2 != null) {
                    switch (A1g(this.A0G, this.A0H, c2654or2, this.A0i)) {
                        case 0:
                            break;
                        case 1:
                            z11 = true;
                            break;
                        case 2:
                        default:
                            throw new IllegalStateException();
                        case 3:
                            z11 = true;
                            this.A0X = true;
                            this.A03 = 1;
                            if (this.A02 != 2 || (this.A02 == 1 && this.A0i.A0L == c2654or2.A0L && this.A0i.A0A == c2654or2.A0A)) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            this.A0N = z10;
                            break;
                    }
                }
            }
        }
        if (!z11) {
            this.A0M = null;
            if (this.A0V) {
                this.A04 = 1;
                return;
            }
            A1n();
            String[] strArr5 = A14;
            if (strArr5[4].length() == strArr5[3].length()) {
                String[] strArr6 = A14;
                strArr6[4] = "dwUbabJ3IwMscliKIocfEp";
                strArr6[3] = "JfvGwuyJKwyqA9Lq7c7l5Q2QpU3EJ";
                A1p();
                return;
            }
            String[] strArr7 = A14;
            strArr7[7] = "gISXyGsiclUqTl6XD9kKbrjQIkSYs6OI";
            strArr7[1] = "jfDUbzltiW2K1dT11OQ1e62SyOqvP2px";
            A1p();
        }
    }

    public void A1t(C2654or c2654or) throws C9Y {
    }

    public void A1z(String str, C2654or c2654or) throws C9Y {
        A1t(c2654or);
    }

    public boolean A20() {
        return false;
    }

    public final boolean A21() {
        return A24(this.A0i);
    }

    public final boolean A24(C2654or c2654or) {
        if (c2654or == null || !this.A0m || !A0x(838, 10, 89).equalsIgnoreCase(c2654or.A0W)) {
            return false;
        }
        return true;
    }

    public boolean A25(AR ar) {
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2564nM
    public boolean AAG() {
        return this.A0b;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2564nM
    @MetaExoPlayerCustomization("D18870411: Adding start stall debug reason")
    public boolean AAV() {
        if (this.A0i == null) {
            super.A0B = EnumC2230hX.A07;
        } else if (this.A0g) {
            super.A0B = EnumC2230hX.A0A;
        } else if (!A1d() && !A1B()) {
            super.A0B = EnumC2230hX.A06;
        }
        if (this.A0i != null) {
            boolean z10 = this.A0g;
            if (A14[2].charAt(29) == 'f') {
                throw new RuntimeException();
            }
            String[] strArr = A14;
            strArr[7] = "joohYCoWTVCMZ7ZK6VknoEQ3356Yke9R";
            strArr[1] = "gcfLSJm2tOx4UzvBIoCvVtFxExIT9beD";
            if (!z10 && (A1d() || A1B() || (this.A07 != -9223372036854775807L && SystemClock.elapsedRealtime() < this.A07))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2564nM
    public void AHn(long j10, long j11) throws C9Y {
        if (this.A0b) {
            A1o();
            return;
        }
        if (this.A0i == null && !A1C(2)) {
            return;
        }
        A1p();
        if (this.A0G != null) {
            try {
                try {
                    C4S.A02(A0x(727, 12, 16));
                    while (A1E(j10, j11)) {
                    }
                    while (A1A()) {
                    }
                    this.A08 = -9223372036854775807L;
                } catch (IllegalStateException e10) {
                    if (!A19()) {
                        throw A1S(e10, this.A0i, 4003);
                    }
                }
                C4S.A00();
            } catch (Throwable e11) {
                C4S.A00();
                throw e11;
            }
        } else {
            this.A0j.A0A += A1Q(j10);
            A1C(1);
        }
        this.A0j.A02();
    }

    @Override // com.facebook.ads.redexgen.core.C7D
    public final int AJb(C2654or c2654or) throws C9Y {
        try {
            return A1h(this.A0u, this.A0t, c2654or);
        } catch (C1130Av e10) {
            throw A1S(e10, c2654or, 4002);
        }
    }

    @Override // com.facebook.ads.redexgen.core.C9Z, com.facebook.ads.redexgen.core.C7D
    public final int AJd() {
        return 8;
    }
}
