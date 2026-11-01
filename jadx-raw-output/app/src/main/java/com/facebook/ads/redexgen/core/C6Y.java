package com.facebook.ads.redexgen.core;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6Y, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C6Y {
    public static byte[] A0E;
    public static String[] A0F = {"qTjlphzGhjtz23pZpbkrfGV3", "gcvQ0aFRAZsVeDDMvPpq9fmBIR43z3dS", "1g2pSH5s64tGUAh3eJ0e3X43Q9jzw3mq", "lB1M4R9KcDs1NZsKBVQ3JQYLP4RbMvTH", "7AgciWFjZyCuzmH359m88XAJrahqi7eF", "Et2BwvNp", "Oz1eJxJHgMWzrYsZQ0zZlFN1YCxGY3CZ", "Iy7o67ktSbvMBIxm3lxnuK7UTKgUaVFx"};
    public C6Z A00;
    public boolean A01;
    public boolean A02;
    public long A03;
    public C6Y A04;
    public C2491mA A05 = C2491mA.A06;
    public EL A06;
    public final InterfaceC2502mM A07;
    public final Object A08;
    public final InterfaceC1175Cr[] A09;
    public final C6X A0A;
    public final EK A0B;
    public final C7D[] A0C;
    public final boolean[] A0D;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0E, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 22);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A0E = new byte[]{81, 121, 120, 117, 125, 76, 121, 110, 117, 115, 120, 84, 115, 112, 120, 121, 110, 28, 41, 62, 37, 35, 40, 108, 62, 41, 32, 41, 45, 63, 41, 108, ExifInterface.START_CODE, 45, 37, 32, 41, 40, 98};
    }

    static {
        A04();
    }

    @MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "Old exoplayer method. requires deleting")
    public C6Y(C7D[] c7dArr, long j10, EK ek2, EO eo2, CL cl2, C6Z c6z, EL el2) {
        this.A0C = c7dArr;
        this.A03 = j10 - c6z.A03;
        this.A0B = ek2;
        this.A08 = C3M.A01(c6z.A04.A04);
        this.A00 = c6z;
        this.A06 = el2;
        this.A09 = new InterfaceC1175Cr[c7dArr.length];
        this.A0D = new boolean[c7dArr.length];
        this.A0A = new C2565nN(this, cl2);
        this.A07 = A00(c6z.A04, this.A0A, eo2, c6z.A03, c6z.A01);
    }

    @MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "MediaSourceList is temporarily changed to MediaSourceAdapter")
    public static InterfaceC2502mM A00(C2501mL c2501mL, C6X c6x, EO eo2, long j10, long j11) {
        InterfaceC2502mM interfaceC2502mMA5O = c6x.A5O(c2501mL, eo2, j10);
        if (j11 != -9223372036854775807L) {
            return new C9F(interfaceC2502mMA5O, true, 0L, j11);
        }
        return interfaceC2502mMA5O;
    }

    private void A02() {
        if (!A08()) {
            return;
        }
        for (int i10 = 0; i10 < i; i10++) {
            boolean rendererEnabled = this.A06.A00(i10);
            InterfaceC2464lj interfaceC2464lj = this.A06.A04[i10];
            if (rendererEnabled && interfaceC2464lj != null) {
                interfaceC2464lj.A5p();
            }
        }
    }

    private void A03() {
        if (!A08()) {
            return;
        }
        for (int i10 = 0; i10 < i; i10++) {
            boolean rendererEnabled = this.A06.A00(i10);
            InterfaceC2464lj interfaceC2464lj = this.A06.A04[i10];
            if (rendererEnabled && interfaceC2464lj != null) {
                interfaceC2464lj.A6C();
            }
        }
    }

    @MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "Temporary bridging of MediaSourceList with MediaSourceAdapter")
    public static void A05(C6X c6x, InterfaceC2502mM interfaceC2502mM) {
        try {
            if (interfaceC2502mM instanceof C9F) {
                c6x.AH0(((C9F) interfaceC2502mM).A05);
            } else {
                c6x.AH0(interfaceC2502mM);
            }
        } catch (RuntimeException e10) {
            AnonymousClass44.A08(A01(0, 17, 10), A01(17, 22, 90), e10);
        }
    }

    private void A06(InterfaceC1175Cr[] interfaceC1175CrArr) {
        for (int i10 = 0; i10 < i; i10++) {
            if (this.A0C[i10].A9F() == -2 && this.A06.A00(i10)) {
                interfaceC1175CrArr[i10] = new C2504mO();
            }
        }
    }

    private void A07(InterfaceC1175Cr[] interfaceC1175CrArr) {
        for (int i10 = 0; i10 < i; i10++) {
            if (this.A0C[i10].A9F() == -2) {
                interfaceC1175CrArr[i10] = null;
            }
        }
    }

    private boolean A08() {
        return this.A04 == null;
    }

    public final long A09() {
        if (!this.A02) {
            return this.A00.A03;
        }
        long jA70 = this.A01 ? this.A07.A70() : Long.MIN_VALUE;
        return jA70 == Long.MIN_VALUE ? this.A00.A00 : jA70;
    }

    public final long A0A() {
        if (this.A02) {
            return this.A07.A8T();
        }
        return 0L;
    }

    public final long A0B() {
        return this.A03;
    }

    @MetaExoPlayerCustomization(type = {"NEW_METHOD"})
    public final long A0C(long j10) {
        return this.A07.A6y(j10);
    }

    public final long A0D(long j10) {
        return j10 - A0B();
    }

    public final long A0E(long j10) {
        return A0B() + j10;
    }

    public final long A0F(EL el2, long j10, boolean z10) {
        return A0G(el2, j10, z10, new boolean[this.A0C.length]);
    }

    public final long A0G(EL el2, long j10, boolean z10, boolean[] zArr) {
        int i10 = 0;
        while (true) {
            boolean z11 = false;
            if (i10 < el2.A00) {
                boolean[] zArr2 = this.A0D;
                if (!z10) {
                    boolean zA01 = el2.A01(this.A06, i10);
                    if (A0F[5].length() != 8) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A0F;
                    strArr[4] = "ZW5cY05fUZ7YDJtoLiROAD1s3u7pqZaY";
                    strArr[3] = "DBvv8TdqbKzS7YgGUgxEKNMIgeBwY4FK";
                    if (zA01) {
                        z11 = true;
                    }
                }
                zArr2[i10] = z11;
                i10++;
            } else {
                A07(this.A09);
                A02();
                this.A06 = el2;
                A03();
                long jAIP = this.A07.AIP(el2.A04, this.A0D, this.A09, zArr, j10);
                A06(this.A09);
                this.A01 = false;
                for (int i11 = 0; i11 < this.A09.length; i11++) {
                    if (this.A09[i11] != null) {
                        C3M.A08(el2.A00(i11));
                        if (this.A0C[i11].A9F() != -2) {
                            this.A01 = true;
                        }
                    } else {
                        C3M.A08(el2.A04[i11] == null);
                    }
                }
                return jAIP;
            }
        }
    }

    @MetaExoPlayerCustomization(type = {"TEMPORARY"})
    public final long A0H(boolean z10) {
        if (!z10) {
            return this.A03;
        }
        return this.A00.A03 + this.A03;
    }

    public final C6Y A0I() {
        return this.A04;
    }

    public final C2491mA A0J() {
        return this.A05;
    }

    public final EL A0K() {
        return this.A06;
    }

    public final EL A0L(float f10, Timeline timeline) throws C9Y {
        EL elA0b = this.A0B.A0b(this.A0C, A0J(), this.A00.A04, timeline);
        for (InterfaceC2464lj interfaceC2464lj : elA0b.A04) {
            if (interfaceC2464lj != null) {
                interfaceC2464lj.AEc(f10);
            }
        }
        return elA0b;
    }

    @MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "MediaSourceAdapter to be replaced with MediaSourceList")
    public final void A0M() {
        A02();
        A05(this.A0A, this.A07);
    }

    public final void A0N(float f10, Timeline timeline) throws C9Y {
        this.A02 = true;
        this.A05 = this.A07.A9E();
        long jA0F = A0F(A0L(f10, timeline), this.A00.A03, false);
        this.A03 += this.A00.A03 - jA0F;
        this.A00 = this.A00.A00(jA0F);
    }

    public final void A0O(long j10) {
        C3M.A08(A08());
        this.A07.A54(A0D(j10));
    }

    public final void A0P(long j10) {
        C3M.A08(A08());
        if (this.A02) {
            this.A07.AGm(A0D(j10));
        }
    }

    public final void A0Q(C6Y c6y) {
        if (c6y == this.A04) {
            return;
        }
        A02();
        this.A04 = c6y;
        A03();
    }

    public final boolean A0R() {
        return this.A02 && (!this.A01 || this.A07.A70() == Long.MIN_VALUE);
    }
}
