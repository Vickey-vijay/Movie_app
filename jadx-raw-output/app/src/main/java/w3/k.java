package w3;

import android.support.v4.media.session.PlaybackStateCompat;
import g5.t;
import java.io.IOException;

/* JADX INFO: compiled from: Sniffer.java */
/* JADX INFO: loaded from: classes2.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f73451a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153};

    public static boolean b(q3.h hVar) throws InterruptedException, IOException {
        return c(hVar, true);
    }

    public static boolean d(q3.h hVar) throws InterruptedException, IOException {
        return c(hVar, false);
    }

    public static boolean a(int i10) {
        if ((i10 >>> 8) == 3368816) {
            return true;
        }
        for (int i11 : f73451a) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    public static boolean c(q3.h hVar, boolean z10) throws InterruptedException, IOException {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        long length = hVar.getLength();
        long j10 = -1;
        long j11 = PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
        if (length != -1 && length <= PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
            j11 = length;
        }
        int i10 = (int) j11;
        t tVar = new t(64);
        boolean z15 = false;
        int i11 = 0;
        boolean z16 = false;
        while (true) {
            if (i11 < i10) {
                tVar.H(8);
                hVar.peekFully(tVar.f53154a, z15 ? 1 : 0, 8);
                long jA = tVar.A();
                int iJ = tVar.j();
                int i12 = 16;
                if (jA == 1) {
                    hVar.peekFully(tVar.f53154a, 8, 8);
                    tVar.K(16);
                    jA = tVar.r();
                } else {
                    if (jA == 0) {
                        long length2 = hVar.getLength();
                        if (length2 != j10) {
                            jA = (length2 - hVar.getPeekPosition()) + ((long) 8);
                        }
                    }
                    i12 = 8;
                }
                long j12 = i12;
                if (jA < j12) {
                    return z15;
                }
                i11 += i12;
                if (iJ == 1836019574) {
                    i10 += (int) jA;
                    if (length != -1 && i10 > length) {
                        i10 = (int) length;
                    }
                } else {
                    if (iJ == 1836019558 || iJ == 1836475768) {
                        z11 = z15 ? 1 : 0;
                        z12 = true;
                        z13 = true;
                        return (z16 || z10 != z13) ? z11 : z12;
                    }
                    long j13 = length;
                    if ((((long) i11) + jA) - j12 >= i10) {
                        z11 = false;
                    } else {
                        int i13 = (int) (jA - j12);
                        i11 += i13;
                        if (iJ != 1718909296) {
                            z14 = false;
                            if (i13 != 0) {
                                z16 = z16;
                                hVar.advancePeekPosition(i13);
                                z16 = z16;
                            }
                        } else {
                            if (i13 < 8) {
                                return false;
                            }
                            tVar.H(i13);
                            hVar.peekFully(tVar.f53154a, 0, i13);
                            int i14 = i13 / 4;
                            for (int i15 = 0; i15 < i14; i15++) {
                                if (i15 != 1) {
                                    if (a(tVar.j())) {
                                        z16 = true;
                                        break;
                                    }
                                } else {
                                    tVar.M(4);
                                }
                            }
                            if (!z16) {
                                return false;
                            }
                            z14 = false;
                            z16 = z16;
                        }
                        z16 = z16;
                        z15 = z14;
                        length = j13;
                    }
                }
                j10 = -1;
                z16 = z16;
            } else {
                z11 = z15 ? 1 : 0;
            }
            z12 = true;
            z13 = z11 ? 1 : 0;
            if (z16) {
            }
        }
    }
}
