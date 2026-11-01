package com.facebook.ads.redexgen.core;

import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2351jh implements GP {
    public static String[] A02 = {"icMuAGNUwG3qooMsLkIelsXOgqR", "wZwGdqwzUfLFhHeDnVqZXfrekI2t19Nm", "6NjHclQwJEhKen4shQzzT38fKShvFJl3", "cwvHChui6ScrilPVLNLxDwwq1RZibmTM", "KGSyfhH5I6lVnEy0NkdKQy5Ija", "JgLMaajFBM7mBqcCk", "W9ygPHkeZ", ""};
    public final C4J A00;
    public final C4R A01;

    public C2351jh(C4R c4r) {
        this.A01 = c4r;
        this.A00 = new C4J();
    }

    private GN A00(C4J c4j, long scrValue, long scrTimeUs) {
        int iA09 = -1;
        int iA010 = -1;
        long j10 = -9223372036854775807L;
        while (c4j.A07() >= 4) {
            if (C2350jg.A00(c4j.A0l(), c4j.A09()) != 442) {
                c4j.A0g(1);
            } else {
                c4j.A0g(4);
                long jA06 = KU.A06(c4j);
                if (jA06 != -9223372036854775807L) {
                    long jA07 = this.A01.A06(jA06);
                    if (jA07 > scrValue) {
                        if (j10 == -9223372036854775807L) {
                            return GN.A04(jA07, scrTimeUs);
                        }
                        return GN.A03(((long) iA09) + scrTimeUs);
                    }
                    int startOfLastPacketPosition = A02[1].charAt(26);
                    if (startOfLastPacketPosition == 113) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A02;
                    strArr[3] = "JRu5yfiOOmZm3e1j9KGmxzziCqUEhgmX";
                    strArr[2] = "rPvZuTIICj36zhJU166yjphfEhohU7nm";
                    long lastScrTimeUsInRange = 100000 + jA07;
                    if (lastScrTimeUsInRange > scrValue) {
                        return GN.A03(((long) c4j.A09()) + scrTimeUs);
                    }
                    j10 = jA07;
                    iA09 = c4j.A09();
                }
                A01(c4j);
                iA010 = c4j.A09();
            }
        }
        if (j10 != -9223372036854775807L) {
            return GN.A05(j10, ((long) iA010) + scrTimeUs);
        }
        return GN.A03;
    }

    public static void A01(C4J c4j) {
        int systemHeaderLength = c4j.A0A();
        if (c4j.A07() < 10) {
            c4j.A0f(systemHeaderLength);
            return;
        }
        c4j.A0g(9);
        int limit = c4j.A0I();
        int packStuffingLength = limit & 7;
        int limit2 = c4j.A07();
        if (limit2 < packStuffingLength) {
            c4j.A0f(systemHeaderLength);
            return;
        }
        c4j.A0g(packStuffingLength);
        int limit3 = c4j.A07();
        if (limit3 < 4) {
            c4j.A0f(systemHeaderLength);
            return;
        }
        byte[] bArrA0l = c4j.A0l();
        int limit4 = c4j.A09();
        if (C2350jg.A00(bArrA0l, limit4) == 443) {
            c4j.A0g(4);
            int packStuffingLength2 = c4j.A0M();
            int limit5 = c4j.A07();
            if (limit5 < packStuffingLength2) {
                c4j.A0f(systemHeaderLength);
                return;
            }
            c4j.A0g(packStuffingLength2);
        }
        while (limit >= 4) {
            byte[] bArrA0l2 = c4j.A0l();
            int limit6 = c4j.A09();
            int packStuffingLength3 = C2350jg.A00(bArrA0l2, limit6);
            if (packStuffingLength3 == 442 || packStuffingLength3 == 441 || (packStuffingLength3 >>> 8) != 1) {
                return;
            }
            c4j.A0g(4);
            if (c4j.A07() < 2) {
                c4j.A0f(systemHeaderLength);
                return;
            }
            int nextStartCode = c4j.A0M();
            int packStuffingLength4 = c4j.A0A();
            int limit7 = c4j.A09();
            c4j.A0f(Math.min(packStuffingLength4, limit7 + nextStartCode));
        }
    }

    @Override // com.facebook.ads.redexgen.core.GP
    public final void AFA() {
        this.A00.A0i(AbstractC09664a.A07);
    }

    @Override // com.facebook.ads.redexgen.core.GP
    public final GN AIC(InterfaceC2443lN interfaceC2443lN, long j10) throws IOException {
        long jA8f = interfaceC2443lN.A8f();
        int iMin = (int) Math.min(20000L, interfaceC2443lN.A8G() - jA8f);
        this.A00.A0d(iMin);
        interfaceC2443lN.AG9(this.A00.A0l(), 0, iMin);
        return A00(this.A00, j10, jA8f);
    }
}
