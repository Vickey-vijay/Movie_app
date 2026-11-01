package com.facebook.ads.redexgen.core;

import java.io.IOException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Iz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1338Iz {
    public static String[] A0D = {"XeH1UKKuz1EDpBeQKhAXaKjrjZgsodJU", "Qh9sfVWsiKdbMkoZ0Fly5mM08PFSskfX", "g5Vgu", "IbV76iHRvjKg6MHaSQGzPOhr6f1ApNQX", "p6vckuBwU2Q2AllMmzSrbAD", "CWShENYx4MqsFhdcA74Ut20lXSF9FxoW", "efy3JamC8vBQUYLSbDR2yGzuJR", "AxMKck"};
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public GY A06;
    public H1 A07;
    public InterfaceC1335Iw A08;
    public boolean A0A;
    public boolean A0B;
    public final C1333Iu A0C = new C1333Iu();
    public C1337Iy A09 = new C1337Iy();

    public abstract long A09(C4J c4j);

    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public abstract boolean A0C(C4J c4j, long j10, C1337Iy c1337Iy) throws IOException;

    @RequiresNonNull({"trackOutput"})
    private int A00(InterfaceC2443lN interfaceC2443lN) throws IOException {
        if (A03(interfaceC2443lN)) {
            this.A00 = this.A09.A00.A0G;
            if (!this.A0A) {
                this.A07.A6W(this.A09.A00);
                this.A0A = true;
            }
            InterfaceC1335Iw interfaceC1335Iw = this.A09.A01;
            String[] strArr = A0D;
            if (strArr[5].charAt(2) == strArr[3].charAt(2)) {
                throw new RuntimeException();
            }
            A0D[7] = "ikA5IIIrIRBN8L1z";
            if (interfaceC1335Iw != null) {
                this.A08 = this.A09.A01;
            } else if (interfaceC2443lN.A8G() == -1) {
                this.A08 = new C2395kP();
            } else {
                C1334Iv c1334IvA02 = this.A0C.A02();
                this.A08 = new C2401kV(this, this.A04, interfaceC2443lN.A8G(), c1334IvA02.A01 + c1334IvA02.A00, c1334IvA02.A05, (c1334IvA02.A04 & 4) != 0);
            }
            this.A01 = 2;
            this.A0C.A04();
            return 0;
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x009b  */
    @RequiresNonNull({"trackOutput", "oggSeeker", "extractorOutput"})
    private int A01(InterfaceC2443lN interfaceC2443lN, C1281Gt c1281Gt) throws IOException {
        long jAGd = this.A08.AGd(interfaceC2443lN);
        if (jAGd >= 0) {
            c1281Gt.A00 = jAGd;
            return 1;
        }
        if (jAGd < -1) {
            if (A0D[1].charAt(30) != 'f') {
                throw new RuntimeException();
            }
            String[] strArr = A0D;
            strArr[2] = "VTxPX";
            strArr[6] = "vg288hyM3d7P0eFgaD3UTrluSy";
            long position = -(2 + jAGd);
            A0A(position);
        }
        if (!this.A0B) {
            this.A06.AIN((InterfaceC1284Gw) C3M.A02(this.A08.A5R()));
            this.A0B = true;
        }
        if (this.A03 <= 0 && !this.A0C.A05(interfaceC2443lN)) {
            this.A01 = 3;
            return -1;
        }
        this.A03 = 0L;
        C4J c4jA01 = this.A0C.A01();
        long jA09 = A09(c4jA01);
        if (jA09 >= 0) {
            long j10 = this.A02 + jA09;
            String[] strArr2 = A0D;
            if (strArr2[2].length() != strArr2[6].length()) {
                A0D[0] = "EPgFULMjpXPDE9er32WaoAxqXEcFdYah";
                if (j10 >= this.A05) {
                    long position2 = this.A02;
                    long jA05 = A05(position2);
                    this.A07.AI7(c4jA01, c4jA01.A0A());
                    this.A07.AIA(jA05, 1, c4jA01.A0A(), 0, null);
                    this.A05 = -1L;
                }
            } else if (j10 >= this.A05) {
                long position3 = this.A02;
                long jA06 = A05(position3);
                this.A07.AI7(c4jA01, c4jA01.A0A());
                this.A07.AIA(jA06, 1, c4jA01.A0A(), 0, null);
                this.A05 = -1L;
            }
        }
        this.A02 += jA09;
        return 0;
    }

    @EnsuresNonNull({"trackOutput", "extractorOutput"})
    private void A02() {
        C3M.A02(this.A07);
    }

    @EnsuresNonNullIf(expression = {"setupData.format"}, result = true)
    private boolean A03(InterfaceC2443lN interfaceC2443lN) throws IOException {
        while (true) {
            C1333Iu c1333Iu = this.A0C;
            String[] strArr = A0D;
            if (strArr[5].charAt(2) == strArr[3].charAt(2)) {
                break;
            }
            A0D[7] = "RUb6h5R55PuDixsZqq";
            if (!c1333Iu.A05(interfaceC2443lN)) {
                this.A01 = 3;
                return false;
            }
            this.A03 = interfaceC2443lN.A8f() - this.A04;
            if (A0C(this.A0C.A01(), this.A04, this.A09)) {
                long jA8f = interfaceC2443lN.A8f();
                if (A0D[7].length() == 17) {
                    break;
                }
                A0D[0] = "MjaWWlFxdP245keDLyVkXHL1D0C1Hazn";
                this.A04 = jA8f;
            } else {
                return true;
            }
        }
        throw new RuntimeException();
    }

    public final int A04(InterfaceC2443lN interfaceC2443lN, C1281Gt c1281Gt) throws IOException {
        A02();
        switch (this.A01) {
            case 0:
                return A00(interfaceC2443lN);
            case 1:
                interfaceC2443lN.AJJ((int) this.A04);
                this.A01 = 2;
                return 0;
            case 2:
                return A01(interfaceC2443lN, c1281Gt);
            case 3:
                return -1;
            default:
                throw new IllegalStateException();
        }
    }

    public final long A05(long j10) {
        return (1000000 * j10) / ((long) this.A00);
    }

    public final long A06(long j10) {
        return (((long) this.A00) * j10) / 1000000;
    }

    public final void A07(long j10, long j11) {
        this.A0C.A03();
        if (j10 == 0) {
            A0B(!this.A0B);
        } else {
            if (this.A01 == 0) {
                return;
            }
            this.A05 = A06(j11);
            ((InterfaceC1335Iw) AbstractC09664a.A0f(this.A08)).AJR(this.A05);
            this.A01 = 2;
        }
    }

    public final void A08(GY gy, H1 h10) {
        this.A06 = gy;
        this.A07 = h10;
        A0B(true);
    }

    public void A0A(long j10) {
        this.A02 = j10;
    }

    public void A0B(boolean z10) {
        if (z10) {
            this.A09 = new C1337Iy();
            this.A04 = 0L;
            this.A01 = 0;
        } else {
            this.A01 = 1;
        }
        this.A05 = -1L;
        this.A02 = 0L;
    }
}
