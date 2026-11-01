package com.facebook.ads.redexgen.core;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.ironsource.C3397bb;
import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7R, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
@MetaExoPlayerCustomization("Exo version is final but in Meta code HeroLeastRecentlyUsedCacheEvictor extends this")
public final class C7R implements InterfaceC2306iw {
    public static byte[] A03;
    public static String[] A04 = {"jtWHdC1JS00IQCACyTEvOJEMPrvoo3Ob", "eCCt1HwS4IToKXyi1WzLFL1R4PlgsDM4", "yXgy4dLxj37Ni2Ba12KifyhgeRBIXCXp", "5p7nRT0g4n3u8StY", "28aCkGMBHBRgMUJ0i4knnGO", "XAmyqmpuCXa4X38XkweYk7F1knbiAlXr", "krkFdswQPRExlipS29WIEjh8hbH7SBjj", C3397bb.f28249u};

    @MetaExoPlayerCustomization("Exo version is private but in Meta code HeroLeastRecentlyUsedCacheEvictor extends this")
    public long A00;

    @MetaExoPlayerCustomization("Exo version is private but in Meta code HeroLeastRecentlyUsedCacheEvictor extends this")
    public final long A01;

    @MetaExoPlayerCustomization("Exo version is private but in Meta code HeroLeastRecentlyUsedCacheEvictor extends this")
    public final TreeSet<C1414Lx> A02 = new TreeSet<>(new Comparator() { // from class: com.facebook.ads.redexgen.X.MB
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return C7R.A00((C1414Lx) obj, (C1414Lx) obj2);
        }
    });

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 28);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{46, 61, 34, 40, 63, 8, ExifInterface.START_CODE, 40, 35, 46};
    }

    static {
        A02();
    }

    public C7R(long j10) {
        this.A01 = j10;
    }

    @MetaExoPlayerCustomization("Exo version is private but in Meta code HeroLeastRecentlyUsedCacheEvictor extends this")
    public static int A00(C1414Lx c1414Lx, C1414Lx c1414Lx2) {
        if (c1414Lx.A00 - c1414Lx2.A00 == 0) {
            return c1414Lx.compareTo(c1414Lx2);
        }
        return c1414Lx.A00 < c1414Lx2.A00 ? -1 : 1;
    }

    private void A03(InterfaceC1404Ln interfaceC1404Ln, long j10) {
        C4S.A02(A01(0, 10, 87));
        while (this.A00 + j10 > this.A01 && !this.A02.isEmpty()) {
            C1414Lx c1414LxFirst = this.A02.first();
            if (A04[1].charAt(10) != 'T') {
                throw new RuntimeException();
            }
            A04[4] = "DjrmhsDHxGC2SVigK1e7Rl2";
            interfaceC1404Ln.AHl(c1414LxFirst);
        }
        C4S.A00();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1403Lm
    public final void AFJ(InterfaceC1404Ln interfaceC1404Ln, C1414Lx c1414Lx) {
        this.A02.add(c1414Lx);
        this.A00 += c1414Lx.A01;
        A03(interfaceC1404Ln, 0L);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1403Lm
    public final void AFK(InterfaceC1404Ln interfaceC1404Ln, C1414Lx c1414Lx) {
        this.A02.remove(c1414Lx);
        this.A00 -= c1414Lx.A01;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1403Lm
    public final void AFL(InterfaceC1404Ln interfaceC1404Ln, C1414Lx c1414Lx, C1414Lx c1414Lx2) {
        AFK(interfaceC1404Ln, c1414Lx);
        AFJ(interfaceC1404Ln, c1414Lx2);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2306iw
    public final void AFM(InterfaceC1404Ln interfaceC1404Ln, String str, long j10, long j11) {
        if (j11 != -1) {
            A03(interfaceC1404Ln, j11);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2306iw
    public final boolean AHz() {
        return true;
    }
}
