package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Pair;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.ads.androidx.media3.common.Metadata;
import com.facebook.ads.androidx.media3.extractor.metadata.mp4.MotionPhotoMetadata;
import com.facebook.ads.androidx.media3.extractor.mp4.Mp4Extractor;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.kY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2404kY implements GX, InterfaceC1284Gw {
    public static byte[] A0Q;
    public static String[] A0R = {"uzhMW", "LbToze1ZyMStOzMPMggUyU89k761Fydj", "roznHbdGo", "zeOiwqyw9G80TO", "hwgMtT9WWej", "AZ5CtgA3jsgDmrh", "c4g75mNjYzBkznfgxB8HcDFPfSogi", "Prtl1ARtkjOsoD"};
    public static final InterfaceC1263Gb A0S;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public long A09;

    @MetaExoPlayerCustomization(type = {"NEW_CLASS_ARG"}, value = "D54927862 get video/audio duration for progressive")
    public long A0A;
    public long A0B;

    @MetaExoPlayerCustomization(type = {"NEW_CLASS_ARG"}, value = "D54927862 get video/audio duration for progressive")
    public long A0C;
    public C4J A0D;
    public GY A0E;
    public MotionPhotoMetadata A0F;
    public C1315Ic[] A0G;
    public long[][] A0H;
    public final int A0I;
    public final C4J A0J;
    public final C4J A0K;
    public final C4J A0L;
    public final C4J A0M;
    public final C1322Ij A0N;
    public final ArrayDeque<C2415kj> A0O;
    public final List<Metadata.Entry> A0P;

    /* JADX WARN: Code duplicated, block: B:24:0x0093  */
    /* JADX WARN: Code duplicated, block: B:27:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:33:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:35:0x0107  */
    /* JADX WARN: Code duplicated, block: B:37:0x010b  */
    /* JADX WARN: Code duplicated, block: B:41:0x0121 A[LOOP:1: B:39:0x011d->B:41:0x0121, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:42:0x0139 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x013b  */
    /* JADX WARN: Code duplicated, block: B:49:0x016a  */
    /* JADX WARN: Code duplicated, block: B:51:0x0178  */
    /* JADX WARN: Code duplicated, block: B:53:0x018b  */
    /* JADX WARN: Code duplicated, block: B:56:0x019f  */
    /* JADX WARN: Code duplicated, block: B:58:0x00db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x015a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x00b2 A[SYNTHETIC] */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 25 out of bounds for length 24
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private int A03(InterfaceC2443lN interfaceC2443lN, C1281Gt c1281Gt) throws IOException {
        long j10;
        int i10;
        int i11;
        byte[] bArrA0l;
        int i12;
        int i13;
        int iA0C;
        long jA8f = interfaceC2443lN.A8f();
        if (this.A08 == -1) {
            this.A08 = A01(jA8f);
            if (this.A08 == -1) {
                return -1;
            }
        }
        C1315Ic c1315Ic = this.A0G[this.A08];
        H1 h10 = c1315Ic.A01;
        int i14 = c1315Ic.A00;
        long j11 = c1315Ic.A04.A06[i14];
        int i15 = c1315Ic.A04.A05[i14];
        H2 h11 = c1315Ic.A02;
        long j12 = (j11 - jA8f) + ((long) this.A05);
        if (j12 < 0 || j12 >= PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
            c1281Gt.A00 = j11;
            return 1;
        }
        int i16 = c1315Ic.A03.A02;
        if (A0R[2].length() != 19) {
            A0R[6] = "rX6gisAdcV7LBeXwmOhQV8Eb98OXk";
            if (i16 == 1) {
                j12 += 8;
                if (A0R[6].length() == 29) {
                    String[] strArr = A0R;
                    strArr[3] = "KKgaKTwS1RwNPE";
                    strArr[7] = "5hDvshmtbzc6vz";
                    i15 -= 8;
                    interfaceC2443lN.AJJ((int) j12);
                    if (c1315Ic.A03.A01 != 0) {
                        bArrA0l = this.A0K.A0l();
                        bArrA0l[0] = 0;
                        bArrA0l[1] = 0;
                        bArrA0l[2] = 0;
                        i12 = c1315Ic.A03.A01;
                        i13 = 4 - c1315Ic.A03.A01;
                        while (this.A06 < i15) {
                            if (this.A07 == 0) {
                                interfaceC2443lN.readFully(bArrA0l, i13, i12);
                                this.A05 += i12;
                                this.A0K.A0f(0);
                                iA0C = this.A0K.A0C();
                                if (iA0C >= 0) {
                                    throw C09222i.A01(A09(48, 18, 118), null);
                                }
                                this.A07 = iA0C;
                                this.A0L.A0f(0);
                                h10.AI7(this.A0L, 4);
                                this.A06 += 4;
                                i15 += i13;
                            } else {
                                int iAI5 = h10.AI5(interfaceC2443lN, this.A07, false);
                                this.A05 += iAI5;
                                this.A06 += iAI5;
                                this.A07 -= iAI5;
                            }
                        }
                    } else {
                        if (A09(66, 9, 68).equals(c1315Ic.A03.A07.A0W)) {
                            if (this.A06 == 0) {
                                GI.A07(i15, this.A0M);
                                h10.AI7(this.A0M, 7);
                                this.A06 += 7;
                            }
                            i15 += 7;
                        } else if (h11 != null) {
                            h11.A03(interfaceC2443lN);
                        }
                        while (this.A06 < i15) {
                            int iAI6 = h10.AI5(interfaceC2443lN, i15 - this.A06, false);
                            this.A05 += iAI6;
                            this.A06 += iAI6;
                            this.A07 -= iAI6;
                        }
                    }
                    j10 = c1315Ic.A04.A07[i14];
                    i10 = c1315Ic.A04.A04[i14];
                    if (A0R[4].length() == 11) {
                        String[] strArr2 = A0R;
                        strArr2[5] = "dniiMzQMBKOANx9";
                        strArr2[0] = "Fj7cY";
                        if (h11 != null) {
                            i11 = 0;
                            h11.A04(h10, j10, i10, i15, 0, null);
                            if (i14 + 1 == c1315Ic.A04.A01) {
                                h11.A05(h10, null);
                            }
                        } else {
                            i11 = 0;
                            h10.AIA(j10, i10, i15, 0, null);
                        }
                        c1315Ic.A00++;
                        this.A08 = -1;
                        this.A05 = i11;
                        this.A06 = i11;
                        this.A07 = i11;
                        return i11;
                    }
                }
            } else {
                interfaceC2443lN.AJJ((int) j12);
                if (c1315Ic.A03.A01 != 0) {
                    bArrA0l = this.A0K.A0l();
                    bArrA0l[0] = 0;
                    bArrA0l[1] = 0;
                    bArrA0l[2] = 0;
                    i12 = c1315Ic.A03.A01;
                    i13 = 4 - c1315Ic.A03.A01;
                    while (this.A06 < i15) {
                        if (this.A07 == 0) {
                            interfaceC2443lN.readFully(bArrA0l, i13, i12);
                            this.A05 += i12;
                            this.A0K.A0f(0);
                            iA0C = this.A0K.A0C();
                            if (iA0C >= 0) {
                                throw C09222i.A01(A09(48, 18, 118), null);
                            }
                            this.A07 = iA0C;
                            this.A0L.A0f(0);
                            h10.AI7(this.A0L, 4);
                            this.A06 += 4;
                            i15 += i13;
                        } else {
                            int iAI7 = h10.AI5(interfaceC2443lN, this.A07, false);
                            this.A05 += iAI7;
                            this.A06 += iAI7;
                            this.A07 -= iAI7;
                        }
                    }
                } else {
                    if (A09(66, 9, 68).equals(c1315Ic.A03.A07.A0W)) {
                        if (this.A06 == 0) {
                            GI.A07(i15, this.A0M);
                            h10.AI7(this.A0M, 7);
                            this.A06 += 7;
                        }
                        i15 += 7;
                    } else if (h11 != null) {
                        h11.A03(interfaceC2443lN);
                    }
                    while (this.A06 < i15) {
                        int iAI8 = h10.AI5(interfaceC2443lN, i15 - this.A06, false);
                        this.A05 += iAI8;
                        this.A06 += iAI8;
                        this.A07 -= iAI8;
                    }
                }
                j10 = c1315Ic.A04.A07[i14];
                i10 = c1315Ic.A04.A04[i14];
                if (A0R[4].length() == 11) {
                    String[] strArr3 = A0R;
                    strArr3[5] = "dniiMzQMBKOANx9";
                    strArr3[0] = "Fj7cY";
                    if (h11 != null) {
                        i11 = 0;
                        h11.A04(h10, j10, i10, i15, 0, null);
                        if (i14 + 1 == c1315Ic.A04.A01) {
                            h11.A05(h10, null);
                        }
                    } else {
                        i11 = 0;
                        h10.AIA(j10, i10, i15, 0, null);
                    }
                    c1315Ic.A00++;
                    this.A08 = -1;
                    this.A05 = i11;
                    this.A06 = i11;
                    this.A07 = i11;
                    return i11;
                }
            }
        }
        throw new RuntimeException();
    }

    public static String A09(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0Q, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 83);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0C() {
        A0Q = new byte[]{-47, 4, -1, -3, -80, 3, -7, 10, -11, -80, -4, -11, 3, 3, -80, 4, -8, -15, -2, -80, -8, -11, -15, -12, -11, 2, -80, -4, -11, -2, -9, 4, -8, -80, -72, 5, -2, 3, 5, 0, 0, -1, 2, 4, -11, -12, -71, -66, 18, 55, 63, ExifInterface.START_CODE, 53, 50, 45, -23, 23, 10, 21, -23, 53, 46, 55, 48, 61, 49, -8, 12, -5, 0, 6, -58, -8, -6, -53, 49, 69, 52, 57, 63, -1, 68, 66, 69, 53, -3, 56, 52};
    }

    static {
        A0C();
        A0S = new InterfaceC1263Gb() { // from class: com.facebook.ads.redexgen.X.kZ
            @Override // com.facebook.ads.redexgen.core.InterfaceC1263Gb
            public final GX[] A5F() {
                return C2404kY.A0M();
            }

            @Override // com.facebook.ads.redexgen.core.InterfaceC1263Gb
            public final /* synthetic */ GX[] A5G(Uri uri, Map map) {
                return AbstractC1262Ga.A01(this, uri, map);
            }
        };
    }

    public C2404kY() {
        this(0);
    }

    public C2404kY(int i10) {
        this.A0I = i10;
        this.A04 = (i10 & 4) != 0 ? 3 : 0;
        this.A0N = new C1322Ij();
        this.A0P = new ArrayList();
        this.A0J = new C4J(16);
        this.A0O = new ArrayDeque<>();
        this.A0L = new C4J(AbstractC1278Gq.A03);
        this.A0K = new C4J(4);
        this.A0M = new C4J();
        this.A08 = -1;
        this.A0E = GY.A00;
        this.A0G = new C1315Ic[0];
    }

    public static int A00(int i10) {
        switch (i10) {
            case 1751476579:
                return 2;
            case 1903435808:
                if (A0R[6].length() != 29) {
                    throw new RuntimeException();
                }
                A0R[1] = "rbgKKZbH0NS3XFJda55b1nN6iCZjcLPR";
                return 1;
            default:
                if (A0R[6].length() != 29) {
                    throw new RuntimeException();
                }
                A0R[4] = "05jGjYjRxbz";
                return 0;
        }
    }

    private int A01(long j10) {
        long j11 = Long.MAX_VALUE;
        int preferredTrackIndex = 1;
        int i10 = -1;
        long sampleOffset = Long.MAX_VALUE;
        long j12 = Long.MAX_VALUE;
        int i11 = 1;
        int trackIndex = -1;
        int i12 = 0;
        while (true) {
            C1315Ic[] c1315IcArr = this.A0G;
            String[] strArr = A0R;
            if (strArr[3].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            A0R[6] = "Fcko3uaud46cO6nUcug7HhLZFNYBY";
            if (i12 >= c1315IcArr.length) {
                if (j12 == Long.MAX_VALUE || i11 == 0) {
                    return i10;
                }
                long j13 = 10485760 + j12;
                if (A0R[1].charAt(1) == 'b') {
                    A0R[1] = "AbIM1W3wiFJMRqsWOI3P0CqvLybO2M00";
                    if (sampleOffset < j13) {
                        return i10;
                    }
                } else if (sampleOffset < j13) {
                    return i10;
                }
                return trackIndex;
            }
            C1315Ic c1315Ic = this.A0G[i12];
            int i13 = c1315Ic.A00;
            if (i13 != c1315Ic.A04.A01) {
                long j14 = c1315Ic.A04.A06[i13];
                long minAccumulatedBytes = ((long[][]) AbstractC09664a.A0f(this.A0H))[i12][i13];
                long j15 = j14 - j10;
                int i14 = (j15 < 0 || j15 >= PlaybackStateCompat.ACTION_SET_REPEAT_MODE) ? 1 : 0;
                if ((i14 == 0 && preferredTrackIndex != 0) || (i14 == preferredTrackIndex && j15 < j11)) {
                    preferredTrackIndex = i14;
                    j11 = j15;
                    i10 = i12;
                    if (A0R[6].length() != 29) {
                        String[] strArr2 = A0R;
                        strArr2[5] = "nNk7RawiIyahd9Y";
                        strArr2[0] = "017pL";
                        sampleOffset = minAccumulatedBytes;
                    } else {
                        A0R[1] = "1bC0in6G1ApWSL3PegJBmoVzHl6EE3tw";
                        sampleOffset = minAccumulatedBytes;
                    }
                }
                if (minAccumulatedBytes < j12) {
                    j12 = minAccumulatedBytes;
                    i11 = i14;
                    trackIndex = i12;
                }
            }
            i12++;
        }
    }

    public static int A02(C4J c4j) {
        c4j.A0f(8);
        int majorBrand = A00(c4j.A0C());
        if (majorBrand != 0) {
            return majorBrand;
        }
        c4j.A0g(4);
        while (c4j.A07() > 0) {
            int majorBrand2 = A00(c4j.A0C());
            if (majorBrand2 != 0) {
                return majorBrand2;
            }
        }
        return 0;
    }

    private int A04(InterfaceC2443lN interfaceC2443lN, C1281Gt c1281Gt) throws IOException {
        int iA07 = this.A0N.A07(interfaceC2443lN, c1281Gt, this.A0P);
        if (iA07 == 1 && c1281Gt.A00 == 0) {
            A0A();
        }
        return iA07;
    }

    public static int A05(C1328Ip c1328Ip, long j10) {
        int iA00 = c1328Ip.A00(j10);
        if (iA00 == -1) {
            return c1328Ip.A01(j10);
        }
        return iA00;
    }

    public static long A06(C1328Ip c1328Ip, long j10, long j11) {
        int iA05 = A05(c1328Ip, j10);
        if (iA05 == -1) {
            return j11;
        }
        return Math.min(c1328Ip.A06[iA05], j11);
    }

    private final C1283Gv A07(long j10, int i10) {
        long jA06;
        long j11;
        int mainTrackIndex;
        if (this.A0G.length == 0) {
            return new C1283Gv(C1285Gx.A04);
        }
        long j12 = -9223372036854775807L;
        long jA07 = -1;
        int i11 = i10 != -1 ? i10 : this.A03;
        if (i11 != -1) {
            C1328Ip c1328Ip = this.A0G[i11].A04;
            int iA05 = A05(c1328Ip, j10);
            if (iA05 == -1) {
                return new C1283Gv(C1285Gx.A04);
            }
            j11 = c1328Ip.A07[iA05];
            jA06 = c1328Ip.A06[iA05];
            if (A0R[6].length() != 29) {
                throw new RuntimeException();
            }
            A0R[1] = "zbT5rN6sguJCvWwII8HLCHwSkH7sQNQT";
            if (j11 < j10 && iA05 < c1328Ip.A01 - 1 && (mainTrackIndex = c1328Ip.A01(j10)) != -1 && mainTrackIndex != iA05) {
                j12 = c1328Ip.A07[mainTrackIndex];
                jA07 = c1328Ip.A06[mainTrackIndex];
            }
        } else {
            jA06 = Long.MAX_VALUE;
            if (A0R[4].length() != 11) {
                j11 = j10;
            } else {
                A0R[2] = "SenK5aC";
                j11 = j10;
            }
        }
        if (i10 == -1) {
            for (int i12 = 0; i12 < this.A0G.length; i12++) {
                if (i12 != this.A03) {
                    C1328Ip sampleTable = this.A0G[i12].A04;
                    jA06 = A06(sampleTable, j11, jA06);
                    if (j12 != -9223372036854775807L) {
                        jA07 = A06(sampleTable, j12, jA07);
                    }
                }
            }
        }
        C1285Gx c1285Gx = new C1285Gx(j11, jA06);
        if (j12 == -9223372036854775807L) {
            return new C1283Gv(c1285Gx);
        }
        return new C1283Gv(c1285Gx, new C1285Gx(j12, jA07));
    }

    public static /* synthetic */ C1325Im A08(C1325Im c1325Im) {
        return c1325Im;
    }

    private void A0A() {
        this.A04 = 0;
        this.A00 = 0;
    }

    private void A0B() {
        if (this.A02 == 2 && (this.A0I & 2) != 0) {
            this.A0E.AJh(0, 4).A6W(new C2D().A0v(this.A0F == null ? null : new Metadata(this.A0F)).A14());
            this.A0E.A6G();
            this.A0E.AIN(new C2438lI(-9223372036854775807L));
        }
    }

    private void A0D(long j10) throws C09222i {
        while (!this.A0O.isEmpty() && this.A0O.peek().A00 == j10) {
            C2415kj c2415kjPop = this.A0O.pop();
            if (((II) c2415kjPop).A00 == 1836019574) {
                A0G(c2415kjPop);
                this.A0O.clear();
                this.A04 = 2;
            } else if (!this.A0O.isEmpty()) {
                C2415kj containerAtom = this.A0O.peek();
                containerAtom.A08(c2415kjPop);
            }
        }
        if (this.A04 != 2) {
            A0A();
        }
    }

    private void A0E(long j10) {
        if (this.A01 == 1836086884) {
            this.A0F = new MotionPhotoMetadata(0L, j10, -9223372036854775807L, j10 + ((long) this.A00), this.A09 - ((long) this.A00));
        }
    }

    private void A0F(InterfaceC2443lN interfaceC2443lN) throws IOException {
        this.A0M.A0d(8);
        interfaceC2443lN.AG9(this.A0M.A0l(), 0, 8);
        IO.A0Q(this.A0M);
        interfaceC2443lN.AJJ(this.A0M.A09());
        interfaceC2443lN.AI1();
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "Adding average bitrate calculation logic")
    private void A0G(C2415kj c2415kj) throws C09222i {
        int i10;
        int size = -1;
        long jMax = -9223372036854775807L;
        long j10 = -9223372036854775807L;
        long j11 = -9223372036854775807L;
        List<Mp4Extractor.Mp4Track> tracks = new ArrayList<>();
        Metadata udtaMetaMetadata = null;
        Metadata metadata = null;
        boolean z10 = this.A02 == 1;
        C1270Gi c1270Gi = new C1270Gi();
        C2414ki c2414kiA07 = c2415kj.A07(1969517665);
        if (c2414kiA07 != null) {
            Pair<Metadata, Metadata> pairA0A = IO.A0A(c2414kiA07);
            udtaMetaMetadata = (Metadata) pairA0A.first;
            metadata = (Metadata) pairA0A.second;
            if (udtaMetaMetadata != null) {
                c1270Gi.A05(udtaMetaMetadata);
            }
        }
        Metadata metadataA0F = null;
        C2415kj c2415kjA06 = c2415kj.A06(1835365473);
        if (c2415kjA06 != null) {
            metadataA0F = IO.A0F(c2415kjA06);
        }
        List<C1328Ip> listA0O = IO.A0O(c2415kj, c1270Gi, -9223372036854775807L, null, (this.A0I & 1) != 0, z10, new InterfaceC2299ip() { // from class: com.facebook.ads.redexgen.X.ka
            @Override // com.facebook.ads.redexgen.core.InterfaceC2299ip
            public final Object A43(Object obj) {
                return C2404kY.A08((C1325Im) obj);
            }
        });
        int trackCount = listA0O.size();
        for (int i11 = 0; i11 < trackCount; i11++) {
            C1328Ip c1328Ip = listA0O.get(i11);
            int trackCount2 = c1328Ip.A01;
            if (trackCount2 == 0) {
                int i12 = A0R[1].charAt(1);
                if (i12 != 98) {
                    throw new RuntimeException();
                }
                A0R[1] = "ibvFTefsgA7pkzOq8AzNcMz9gVb8PR75";
            } else {
                C1325Im track = c1328Ip.A03;
                GY gy = this.A0E;
                int trackCount3 = track.A03;
                C1315Ic c1315Ic = new C1315Ic(track, c1328Ip, gy.AJh(i11, trackCount3));
                long j12 = track.A04 != -9223372036854775807L ? track.A04 : c1328Ip.A02;
                jMax = Math.max(jMax, j12);
                if (1 == track.A03) {
                    j11 = j12;
                } else if (2 == track.A03) {
                    j10 = j12;
                }
                if (A09(75, 13, 125).equals(track.A07.A0W)) {
                    int i13 = c1328Ip.A00;
                    if (A0R[6].length() != 29) {
                        throw new RuntimeException();
                    }
                    A0R[6] = "30Puiqoz9JCJMsN9BhlLDaWtr32u3";
                    i10 = i13 * 16;
                } else {
                    i10 = c1328Ip.A00 + 30;
                }
                C2D formatBuilder = track.A07.A07();
                formatBuilder.A0h(i10);
                if (track.A03 == 2 && j12 > 0 && c1328Ip.A01 > 1) {
                    formatBuilder.A0X(c1328Ip.A01 / (j12 / 1000000.0f));
                }
                if (jMax > 0 && c1328Ip.A01 > 0) {
                    int i14 = c1328Ip.A05.length;
                    if (i14 == c1328Ip.A01) {
                        long j13 = 0;
                        for (int i15 = 0; i15 < sampleIndex; i15++) {
                            int sampleIndex = c1328Ip.A05[i15];
                            j13 += (long) sampleIndex;
                        }
                        formatBuilder.A0a((int) ((8000000 * j13) / jMax));
                    }
                }
                int i16 = track.A03;
                IZ.A0D(i16, c1270Gi, formatBuilder);
                int i17 = track.A03;
                Metadata[] metadataArr = new Metadata[2];
                metadataArr[0] = metadata;
                metadataArr[1] = this.A0P.isEmpty() ? null : new Metadata(this.A0P);
                IZ.A0C(i17, udtaMetaMetadata, metadataA0F, formatBuilder, metadataArr);
                c1315Ic.A01.A6W(formatBuilder.A14());
                int i18 = track.A03;
                if (i18 == 2 && size == -1) {
                    size = tracks.size();
                }
                tracks.add(c1315Ic);
            }
        }
        this.A03 = size;
        this.A0B = jMax;
        this.A0C = j10;
        this.A0A = j11;
        this.A0G = (C1315Ic[]) tracks.toArray(new C1315Ic[0]);
        this.A0H = A0N(this.A0G);
        this.A0E.A6G();
        this.A0E.AIN(this);
    }

    private void A0H(C1315Ic c1315Ic, long j10) {
        C1328Ip c1328Ip = c1315Ic.A04;
        int sampleIndex = c1328Ip.A00(j10);
        if (sampleIndex == -1) {
            sampleIndex = c1328Ip.A01(j10);
        }
        c1315Ic.A00 = sampleIndex;
        if (A0R[2].length() == 19) {
            throw new RuntimeException();
        }
        A0R[2] = "DxqZc2lJMNLNZhW19Xb8kO";
    }

    public static boolean A0I(int i10) {
        return i10 == 1836019574 || i10 == 1953653099 || i10 == 1835297121 || i10 == 1835626086 || i10 == 1937007212 || i10 == 1701082227 || i10 == 1835365473;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x006f  */
    public static boolean A0J(int i10) {
        if (i10 != 1835296868 && i10 != 1836476516) {
            if (A0R[4].length() != 11) {
                throw new RuntimeException();
            }
            String[] strArr = A0R;
            strArr[3] = "UHuXZ9PGVGxrhu";
            strArr[7] = "Sv1JTBT1egKeuo";
            if (i10 != 1751411826 && i10 != 1937011556 && i10 != 1937011827 && i10 != 1937011571 && i10 != 1668576371 && i10 != 1701606260 && i10 != 1937011555 && i10 != 1937011578 && i10 != 1937013298) {
                if (A0R[2].length() != 19) {
                    A0R[6] = "0EWWhWMRQ7MgS85x4CKboIorprSqD";
                    if (i10 != 1937007471) {
                        if (i10 == 1668232756 && i10 != 1953196132 && i10 != 1718909296 && i10 != 1969517665 && i10 != 1801812339 && i10 != 1768715124) {
                            return false;
                        }
                    }
                } else if (i10 != 1937007471) {
                    if (i10 == 1668232756) {
                    }
                }
            }
        }
        return true;
    }

    private boolean A0K(InterfaceC2443lN interfaceC2443lN) throws IOException {
        C2415kj containerAtom;
        if (this.A00 == 0) {
            if (!interfaceC2443lN.AGh(this.A0J.A0l(), 0, 8, true)) {
                A0B();
                return false;
            }
            this.A00 = 8;
            this.A0J.A0f(0);
            this.A09 = this.A0J.A0Q();
            this.A01 = this.A0J.A0C();
        }
        if (this.A09 == 1) {
            if (A0R[2].length() == 19) {
                throw new RuntimeException();
            }
            A0R[2] = "uEfPCG8cZZkUCN4sq";
            interfaceC2443lN.readFully(this.A0J.A0l(), 8, 8);
            int headerBytesRemaining = this.A00;
            this.A00 = headerBytesRemaining + 8;
            this.A09 = this.A0J.A0R();
        } else if (this.A09 == 0) {
            long jA8G = interfaceC2443lN.A8G();
            if (jA8G == -1 && (containerAtom = this.A0O.peek()) != null) {
                jA8G = containerAtom.A00;
            }
            if (jA8G != -1) {
                this.A09 = (jA8G - interfaceC2443lN.A8f()) + ((long) this.A00);
            }
        }
        if (this.A09 >= this.A00) {
            if (A0I(this.A01)) {
                long jA8f = (interfaceC2443lN.A8f() + this.A09) - ((long) this.A00);
                if (this.A09 != this.A00 && this.A01 == 1835365473) {
                    A0F(interfaceC2443lN);
                }
                this.A0O.push(new C2415kj(this.A01, jA8f));
                if (this.A09 == this.A00) {
                    A0D(jA8f);
                } else {
                    A0A();
                }
            } else if (A0J(this.A01)) {
                C3M.A08(this.A00 == 8);
                C3M.A08(this.A09 <= 2147483647L);
                C4J c4j = new C4J((int) this.A09);
                C4J atomData = this.A0J;
                System.arraycopy(atomData.A0l(), 0, c4j.A0l(), 0, 8);
                this.A0D = c4j;
                this.A04 = 1;
            } else {
                A0E(interfaceC2443lN.A8f() - ((long) this.A00));
                this.A0D = null;
                this.A04 = 1;
            }
            return true;
        }
        throw C09222i.A00(A09(0, 48, 61));
    }

    private boolean A0L(InterfaceC2443lN interfaceC2443lN, C1281Gt c1281Gt) throws IOException {
        long j10 = this.A09 - ((long) this.A00);
        long atomEndPosition = interfaceC2443lN.A8f() + j10;
        boolean z10 = false;
        C4J c4j = this.A0D;
        if (c4j != null) {
            interfaceC2443lN.readFully(c4j.A0l(), this.A00, (int) j10);
            if (this.A01 == 1718909296) {
                this.A02 = A02(c4j);
            } else if (!this.A0O.isEmpty()) {
                this.A0O.peek().A09(new C2414ki(this.A01, c4j));
            }
        } else if (j10 < PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
            interfaceC2443lN.AJJ((int) j10);
        } else {
            long atomPayloadSize = interfaceC2443lN.A8f();
            c1281Gt.A00 = atomPayloadSize + j10;
            z10 = true;
        }
        A0D(atomEndPosition);
        return z10 && this.A04 != 2;
    }

    public static /* synthetic */ GX[] A0M() {
        return new GX[]{new C2404kY()};
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0066  */
    /* JADX WARN: Code duplicated, block: B:20:0x006c  */
    /* JADX WARN: Code duplicated, block: B:48:0x006f A[SYNTHETIC] */
    public static long[][] A0N(C1315Ic[] c1315IcArr) {
        long[][] jArr = new long[c1315IcArr.length][];
        int[] iArr = new int[c1315IcArr.length];
        long[] jArr2 = new long[c1315IcArr.length];
        boolean[] tracksFinished = new boolean[c1315IcArr.length];
        for (int i10 = 0; i10 < c1315IcArr.length; i10++) {
            jArr[i10] = new long[c1315IcArr[i10].A04.A01];
            jArr2[i10] = c1315IcArr[i10].A04.A07[0];
        }
        long j10 = 0;
        if (A0R[2].length() == 19) {
            throw new RuntimeException();
        }
        A0R[1] = "qbCXFrWy43oBbJoUYfYqc11BUuHVPZxe";
        int i11 = 0;
        while (i11 < c1315IcArr.length) {
            long j11 = Long.MAX_VALUE;
            int i12 = -1;
            for (int minTimeTrackIndex = 0; minTimeTrackIndex < c1315IcArr.length; minTimeTrackIndex++) {
                boolean z10 = tracksFinished[minTimeTrackIndex];
                if (A0R[6].length() != 29) {
                    A0R[2] = "AIMWoJADevTWezna7TxcWd";
                    if (!z10) {
                        if (jArr2[minTimeTrackIndex] <= j11) {
                            i12 = minTimeTrackIndex;
                            j11 = jArr2[minTimeTrackIndex];
                        }
                    }
                } else {
                    String[] strArr = A0R;
                    strArr[3] = "DkVrMcHnnNdNTj";
                    strArr[7] = "McjqbXJyC3Esle";
                    if (!z10) {
                        if (jArr2[minTimeTrackIndex] <= j11) {
                            i12 = minTimeTrackIndex;
                            j11 = jArr2[minTimeTrackIndex];
                        }
                    }
                }
            }
            int i13 = iArr[i12];
            jArr[i12][i13] = j10;
            j10 += (long) c1315IcArr[i12].A04.A05[i13];
            int i14 = i13 + 1;
            iArr[i12] = i14;
            if (i14 < jArr[i12].length) {
                C1315Ic c1315Ic = c1315IcArr[i12];
                if (A0R[1].charAt(1) != 'b') {
                    jArr2[i12] = c1315Ic.A04.A07[i14];
                } else {
                    String[] strArr2 = A0R;
                    strArr2[5] = "FttiEMkEmxvjjK7";
                    strArr2[0] = "cOA5C";
                    jArr2[i12] = c1315Ic.A04.A07[i14];
                }
            } else {
                tracksFinished[i12] = true;
                i11++;
            }
        }
        return jArr;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1284Gw
    public final long A7l() {
        return this.A0B;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1284Gw
    public final C1283Gv A8t(long j10) {
        return A07(j10, -1);
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final void AA4(GY gy) {
        this.A0E = gy;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1284Gw
    public final boolean AAa() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final int AGb(InterfaceC2443lN interfaceC2443lN, C1281Gt c1281Gt) throws IOException {
        while (true) {
            switch (this.A04) {
                case 0:
                    if (!A0K(interfaceC2443lN)) {
                        return -1;
                    }
                    break;
                    break;
                case 1:
                    if (A0L(interfaceC2443lN, c1281Gt)) {
                        return 1;
                    }
                    break;
                case 2:
                    return A03(interfaceC2443lN, c1281Gt);
                case 3:
                    return A04(interfaceC2443lN, c1281Gt);
                default:
                    throw new IllegalStateException();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final void AGr() {
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final void AIM(long j10, long j11) {
        this.A0O.clear();
        this.A00 = 0;
        this.A08 = -1;
        this.A05 = 0;
        this.A06 = 0;
        this.A07 = 0;
        if (j10 == 0) {
            int i10 = this.A04;
            String[] strArr = A0R;
            if (strArr[3].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0R;
            strArr2[3] = "BBO5nGzNDCjhdG";
            strArr2[7] = "Qq9RZt6cBQ724Z";
            if (i10 != 3) {
                A0A();
                return;
            } else {
                this.A0N.A08();
                this.A0P.clear();
                return;
            }
        }
        for (C1315Ic c1315Ic : this.A0G) {
            A0H(c1315Ic, j11);
            if (c1315Ic.A02 != null) {
                c1315Ic.A02.A02();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final boolean AJL(InterfaceC2443lN interfaceC2443lN) throws IOException {
        return AbstractC1323Ik.A02(interfaceC2443lN, (this.A0I & 2) != 0);
    }
}
