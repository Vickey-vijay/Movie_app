package com.facebook.ads.redexgen.core;

import androidx.exifinterface.media.ExifInterface;
import java.util.Arrays;
import java.util.Collections;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2357jn implements KJ {
    public static byte[] A0E;
    public static String[] A0F = {"InS58bT42EZESXm9qvWYUvire34TyqEd", "0QsKXE5Mty2kdKkFlxzakLoeZj9v1JPl", "NRhrqdNeBR4CDjsc7Q9NAC", "KBnn09jRwf0uKhIPK3OJ0VUHuR4AgDGD", "Nq6SUzmzwDzIZ8w7Fc8GQLnhk8OKIhKk", "EhougHeDeIMt7rS1ZxwR1ONoVKreOkGZ", "d5GlJf2nLv2o9PLs5SG9FlMqVuWi5Y0h", "iroqlmoe0TAfPMqOpys1zY2UwesgA9Cl"};
    public long A01;
    public H1 A02;
    public KR A03;
    public String A04;
    public boolean A05;
    public final KX A0C;
    public final boolean[] A0D = new boolean[3];
    public final KS A0B = new KS(32, 128);
    public final KS A09 = new KS(33, 128);
    public final KS A07 = new KS(34, 128);
    public final KS A08 = new KS(39, 128);
    public final KS A0A = new KS(40, 128);
    public long A00 = -9223372036854775807L;
    public final C4J A06 = new C4J();

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0E, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 115);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A0E = new byte[]{7, 125, 121, 122, 29, ExifInterface.START_CODE, 46, 43, ExifInterface.START_CODE, 61, 93, 102, 109, 112, 120, 109, 107, 124, 109, 108, 40, 105, 123, 120, 109, 107, 124, 87, 122, 105, 124, 97, 103, 87, 97, 108, 107, 40, 126, 105, 100, 125, 109, 50, 40, 63, 32, 45, 44, 38, 102, 33, 44, 63, ExifInterface.START_CODE};
    }

    static {
        A03();
    }

    public C2357jn(KX kx) {
        this.A0C = kx;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x018b  */
    /* JADX WARN: Code duplicated, block: B:58:0x0191  */
    public static C2654or A00(String str, KS ks, KS ks2, KS ks3) {
        byte[] bArr = new byte[ks.A00 + ks2.A00 + ks3.A00];
        System.arraycopy(ks.A01, 0, bArr, 0, ks.A00);
        System.arraycopy(ks2.A01, 0, bArr, ks.A00, ks2.A00);
        System.arraycopy(ks3.A01, 0, bArr, ks.A00 + ks2.A00, ks3.A00);
        C1280Gs c1280Gs = new C1280Gs(ks2.A01, 0, ks2.A00);
        c1280Gs.A07(44);
        int maxSubLayersMinus1 = c1280Gs.A05(3);
        c1280Gs.A06();
        int iA05 = c1280Gs.A05(2);
        boolean zA0A = c1280Gs.A0A();
        int generalProfileCompatibilityFlags = c1280Gs.A05(5);
        int generalLevelIdc = 0;
        int i10 = 0;
        while (true) {
            if (i10 >= 32) {
                String[] strArr = A0F;
                if (strArr[3].charAt(26) == strArr[0].charAt(26)) {
                    A0F[7] = "KUK36SaeRyaSjOylRKRM5Zy9KuAImCCo";
                    int[] iArr = new int[6];
                    for (int i11 = 0; i11 < iArr.length; i11++) {
                        iArr[i11] = c1280Gs.A05(8);
                    }
                    int toSkip = c1280Gs.A05(8);
                    int i12 = 0;
                    for (int i13 = 0; i13 < maxSubLayersMinus1; i13++) {
                        if (c1280Gs.A0A()) {
                            i12 += 89;
                        }
                        if (c1280Gs.A0A()) {
                            i12 += 8;
                        }
                    }
                    c1280Gs.A07(i12);
                    if (maxSubLayersMinus1 > 0) {
                        c1280Gs.A07((8 - maxSubLayersMinus1) * 2);
                    }
                    c1280Gs.A04();
                    int iA04 = c1280Gs.A04();
                    if (iA04 == 3) {
                        c1280Gs.A06();
                    }
                    int iA06 = c1280Gs.A04();
                    int chromaFormatIdc = c1280Gs.A04();
                    if (c1280Gs.A0A()) {
                        int generalProfileSpace = c1280Gs.A04();
                        int iA07 = c1280Gs.A04();
                        int toSkip2 = c1280Gs.A04();
                        int iA08 = c1280Gs.A04();
                        int subHeightC = (iA04 == 1 || iA04 == 2) ? 2 : 1;
                        iA06 -= (generalProfileSpace + iA07) * subHeightC;
                        chromaFormatIdc -= (toSkip2 + iA08) * (iA04 == 1 ? 2 : 1);
                    }
                    c1280Gs.A04();
                    c1280Gs.A04();
                    int iA09 = c1280Gs.A04();
                    int picHeightInLumaSamples = c1280Gs.A0A() ? 0 : maxSubLayersMinus1;
                    while (picHeightInLumaSamples <= maxSubLayersMinus1) {
                        c1280Gs.A04();
                        c1280Gs.A04();
                        String[] strArr2 = A0F;
                        if (strArr2[4].charAt(1) != strArr2[6].charAt(1)) {
                            String[] strArr3 = A0F;
                            strArr3[4] = "fwNj3DlAlR0ZRIXGIjbE9kdq2ymmau9c";
                            strArr3[6] = "Cn1Ujy3ajzEe008QMYirASp4B4RzqpC3";
                            c1280Gs.A04();
                            picHeightInLumaSamples++;
                        } else {
                            c1280Gs.A04();
                            picHeightInLumaSamples++;
                        }
                    }
                    c1280Gs.A04();
                    c1280Gs.A04();
                    c1280Gs.A04();
                    c1280Gs.A04();
                    c1280Gs.A04();
                    if (A0F[7].charAt(7) != 'e') {
                        A0F[2] = "36O4TNRZJCi";
                        c1280Gs.A04();
                        if (c1280Gs.A0A()) {
                            if (c1280Gs.A0A()) {
                                A06(c1280Gs);
                            }
                        }
                    } else {
                        String[] strArr4 = A0F;
                        strArr4[1] = "kgp7PzaRA7bebGNLV6O0LLC564MCujGY";
                        strArr4[5] = "FSYBvyZkCpJq4xL9y4GBHyTimpUH7OJt";
                        c1280Gs.A04();
                        if (c1280Gs.A0A()) {
                            if (c1280Gs.A0A()) {
                                A06(c1280Gs);
                            }
                        }
                    }
                    c1280Gs.A07(2);
                    if (c1280Gs.A0A()) {
                        c1280Gs.A07(8);
                        c1280Gs.A04();
                        c1280Gs.A04();
                        c1280Gs.A06();
                    }
                    A07(c1280Gs);
                    if (c1280Gs.A0A()) {
                        for (int i14 = 0; i14 < c1280Gs.A04(); i14++) {
                            c1280Gs.A07(iA09 + 4 + 1);
                        }
                    }
                    c1280Gs.A07(2);
                    float f10 = 1.0f;
                    boolean zA0A2 = c1280Gs.A0A();
                    String[] strArr5 = A0F;
                    if (strArr5[3].charAt(26) != strArr5[0].charAt(26)) {
                        break;
                    }
                    String[] strArr6 = A0F;
                    strArr6[1] = "Qhh03oXiZoC3MQNHpV44xa4z9JOwBySi";
                    strArr6[5] = "nsJWuxtHUvrlBy67rSbmxe3xvaeZTSox";
                    if (zA0A2) {
                        if (c1280Gs.A0A()) {
                            int picWidthInLumaSamples = c1280Gs.A05(8);
                            if (picWidthInLumaSamples == 255) {
                                int iA010 = c1280Gs.A05(16);
                                int iA011 = c1280Gs.A05(16);
                                if (iA010 != 0 && iA011 != 0) {
                                    f10 = iA010 / iA011;
                                }
                            } else if (picWidthInLumaSamples < AbstractC1278Gq.A04.length) {
                                f10 = AbstractC1278Gq.A04[picWidthInLumaSamples];
                            } else {
                                AnonymousClass44.A07(A01(0, 10, 60), A01(10, 35, 123) + picWidthInLumaSamples);
                            }
                        }
                        if (c1280Gs.A0A()) {
                            c1280Gs.A06();
                        }
                        if (c1280Gs.A0A()) {
                            c1280Gs.A07(4);
                            if (c1280Gs.A0A()) {
                                c1280Gs.A07(24);
                            }
                        }
                        if (c1280Gs.A0A()) {
                            c1280Gs.A04();
                            c1280Gs.A04();
                        }
                        c1280Gs.A06();
                        if (c1280Gs.A0A()) {
                            chromaFormatIdc *= 2;
                        }
                    }
                    return new C2D().A0y(str).A11(A01(45, 10, 58)).A0w(C3U.A03(iA05, zA0A, generalProfileCompatibilityFlags, generalLevelIdc, iArr, toSkip)).A0r(iA06).A0f(chromaFormatIdc).A0Y(f10).A12(Collections.singletonList(bArr)).A14();
                }
                throw new RuntimeException();
            }
            boolean zA0A3 = c1280Gs.A0A();
            String[] strArr7 = A0F;
            if (strArr7[1].charAt(22) == strArr7[5].charAt(22)) {
                break;
            }
            String[] strArr8 = A0F;
            strArr8[4] = "ikltzL6qI9vduPGnQ2PfcHBicoSlJtZK";
            strArr8[6] = "dtFG8mkM92kb76Motxy98XM75Kybvtjp";
            if (zA0A3) {
                generalLevelIdc |= 1 << i10;
            }
            i10++;
        }
        throw new RuntimeException();
    }

    @EnsuresNonNull({"output", "sampleReader"})
    private void A02() {
        C3M.A02(this.A02);
    }

    @RequiresNonNull({"output", "sampleReader"})
    private void A04(long j10, int i10, int i11, long j11) {
        this.A03.A05(j10, i10, this.A05);
        if (!this.A05) {
            this.A0B.A04(i11);
            this.A09.A04(i11);
            this.A07.A04(i11);
            if (this.A0B.A03() && this.A09.A03() && this.A07.A03()) {
                this.A02.A6W(A00(this.A04, this.A0B, this.A09, this.A07));
                this.A05 = true;
            }
        }
        KS ks = this.A08;
        if (A0F[2].length() == 29) {
            throw new RuntimeException();
        }
        A0F[7] = "vr6kqTkennNRVlA9BYLGssdVYhiLrcAb";
        if (ks.A04(i11)) {
            this.A06.A0j(this.A08.A01, AbstractC1278Gq.A02(this.A08.A01, this.A08.A00));
            this.A06.A0g(5);
            this.A0C.A02(j11, this.A06);
        }
        if (this.A0A.A04(i11)) {
            this.A06.A0j(this.A0A.A01, AbstractC1278Gq.A02(this.A0A.A01, this.A0A.A00));
            this.A06.A0g(5);
            this.A0C.A02(j11, this.A06);
        }
    }

    @RequiresNonNull({"sampleReader"})
    private void A05(long j10, int i10, int i11, long j11) {
        this.A03.A04(j10, i10, i11, j11, this.A05);
        if (!this.A05) {
            this.A0B.A01(i11);
            this.A09.A01(i11);
            this.A07.A01(i11);
        }
        this.A08.A01(i11);
        String[] strArr = A0F;
        if (strArr[4].charAt(1) == strArr[6].charAt(1)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0F;
        strArr2[3] = "1KFxNiiYNj5YwxcZPXf7qOLOZg48Utfw";
        strArr2[0] = "AJhXWbHH6DfoOyxWmdhumfQDrV4Rkjlm";
        this.A0A.A01(i11);
    }

    public static void A06(C1280Gs c1280Gs) {
        for (int i10 = 0; i10 < 4; i10++) {
            int i11 = 0;
            while (i11 < 6) {
                int i12 = 1;
                if (!c1280Gs.A0A()) {
                    c1280Gs.A04();
                } else {
                    int sizeId = i10 << 1;
                    int iMin = Math.min(64, 1 << (sizeId + 4));
                    if (i10 > 1) {
                        c1280Gs.A03();
                    }
                    for (int coefNum = 0; coefNum < iMin; coefNum++) {
                        c1280Gs.A03();
                        String[] strArr = A0F;
                        String str = strArr[1];
                        String str2 = strArr[5];
                        int iCharAt = str.charAt(22);
                        int sizeId2 = str2.charAt(22);
                        if (iCharAt == sizeId2) {
                            throw new RuntimeException();
                        }
                        String[] strArr2 = A0F;
                        strArr2[1] = "RIQaKQF3d2DPjAKRmkcEP1Qw2m8MXhOp";
                        strArr2[5] = "Zvlj8YgWRgjcS6ffkQSgKy13bXSJEEo8";
                    }
                }
                if (i10 == 3) {
                    i12 = 3;
                }
                i11 += i12;
            }
        }
    }

    public static void A07(C1280Gs c1280Gs) {
        int iA04 = c1280Gs.A04();
        boolean zA0A = false;
        int numNegativePics = 0;
        for (int stRpsIdx = 0; stRpsIdx < iA04; stRpsIdx++) {
            if (stRpsIdx != 0) {
                zA0A = c1280Gs.A0A();
            }
            if (zA0A) {
                c1280Gs.A06();
                c1280Gs.A04();
                for (int i10 = 0; i10 <= numNegativePics; i10++) {
                    if (c1280Gs.A0A()) {
                        c1280Gs.A06();
                    }
                }
            } else {
                int previousNumDeltaPocs = c1280Gs.A04();
                int iA05 = c1280Gs.A04();
                numNegativePics = previousNumDeltaPocs + iA05;
                for (int numShortTermRefPicSets = 0; numShortTermRefPicSets < previousNumDeltaPocs; numShortTermRefPicSets++) {
                    c1280Gs.A04();
                    c1280Gs.A06();
                }
                for (int numShortTermRefPicSets2 = 0; numShortTermRefPicSets2 < iA05; numShortTermRefPicSets2++) {
                    c1280Gs.A04();
                    c1280Gs.A06();
                }
            }
        }
    }

    @RequiresNonNull({"sampleReader"})
    private void A08(byte[] bArr, int i10, int i11) {
        this.A03.A06(bArr, i10, i11);
        if (!this.A05) {
            this.A0B.A02(bArr, i10, i11);
            this.A09.A02(bArr, i10, i11);
            this.A07.A02(bArr, i10, i11);
        }
        this.A08.A02(bArr, i10, i11);
        this.A0A.A02(bArr, i10, i11);
    }

    @Override // com.facebook.ads.redexgen.core.KJ
    public final void A52(C4J c4j) {
        A02();
        while (c4j.A07() > 0) {
            int limit = c4j.A09();
            int iA0A = c4j.A0A();
            byte[] bArrA0l = c4j.A0l();
            long j10 = this.A01;
            int offset = c4j.A07();
            this.A01 = j10 + ((long) offset);
            H1 h10 = this.A02;
            int offset2 = c4j.A07();
            h10.AI7(c4j, offset2);
            while (limit < iA0A) {
                int iA04 = AbstractC1278Gq.A04(bArrA0l, limit, iA0A, this.A0D);
                if (iA04 == iA0A) {
                    A08(bArrA0l, limit, iA0A);
                    return;
                }
                int bytesWrittenPastPosition = AbstractC1278Gq.A00(bArrA0l, iA04);
                int i10 = iA04 - limit;
                if (A0F[7].charAt(7) != 'e') {
                    throw new RuntimeException();
                }
                String[] strArr = A0F;
                strArr[1] = "NnhvxMiSCkNhwXkURhMspTAR6cceqM1j";
                strArr[5] = "7ARxjazDMsknrtTfPy5OOEp3py29nWBE";
                if (i10 > 0) {
                    A08(bArrA0l, limit, iA04);
                }
                int lengthToNalUnit = iA0A - iA04;
                long j11 = this.A01 - ((long) lengthToNalUnit);
                int offset3 = i10 < 0 ? -i10 : 0;
                A04(j11, lengthToNalUnit, offset3, this.A00);
                long absolutePosition = this.A00;
                A05(j11, lengthToNalUnit, bytesWrittenPastPosition, absolutePosition);
                limit = iA04 + 3;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.KJ
    public final void A5U(GY gy, C1369Ke c1369Ke) {
        c1369Ke.A05();
        this.A04 = c1369Ke.A04();
        this.A02 = gy.AJh(c1369Ke.A03(), 2);
        this.A03 = new KR(this.A02);
        this.A0C.A03(gy, c1369Ke);
    }

    @Override // com.facebook.ads.redexgen.core.KJ
    public final void AG5() {
    }

    @Override // com.facebook.ads.redexgen.core.KJ
    public final void AG6(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.A00 = j10;
        }
    }

    @Override // com.facebook.ads.redexgen.core.KJ
    public final void AIL() {
        this.A01 = 0L;
        this.A00 = -9223372036854775807L;
        AbstractC1278Gq.A0H(this.A0D);
        this.A0B.A00();
        this.A09.A00();
        this.A07.A00();
        this.A08.A00();
        this.A0A.A00();
        if (this.A03 != null) {
            this.A03.A03();
        }
    }
}
