package yads;

import android.support.v4.media.session.PlaybackStateCompat;

/* JADX INFO: loaded from: classes2.dex */
public abstract class s13 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f82495a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static boolean a(nq0 nq0Var, boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        long length = nq0Var.getLength();
        long j10 = -1;
        long j11 = PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
        if (length != -1 && length <= PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
            j11 = length;
        }
        int i10 = (int) j11;
        jb2 jb2Var = new jb2(64);
        boolean z16 = false;
        int i11 = 0;
        boolean z17 = false;
        while (true) {
            if (i11 < i10) {
                jb2Var.c(8);
                if (nq0Var.b(jb2Var.f78966a, z16 ? 1 : 0, 8, true)) {
                    long jN = jb2Var.n();
                    int iB = jb2Var.b();
                    int i12 = 16;
                    if (jN == 1) {
                        nq0Var.a(jb2Var.f78966a, 8, 8);
                        jb2Var.d(16);
                        jN = jb2Var.i();
                    } else {
                        if (jN == 0) {
                            long length2 = nq0Var.getLength();
                            if (length2 != j10) {
                                jN = (length2 - nq0Var.c()) + ((long) 8);
                            }
                        }
                        i12 = 8;
                    }
                    long j12 = i12;
                    if (jN < j12) {
                        return z16;
                    }
                    i11 += i12;
                    if (iB == 1836019574) {
                        i10 += (int) jN;
                        if (length != -1 && i10 > length) {
                            i10 = (int) length;
                        }
                    } else if (iB == 1836019558 || iB == 1836475768) {
                        z12 = z16 ? 1 : 0;
                        z13 = true;
                        z14 = true;
                    } else {
                        long j13 = length;
                        if ((((long) i11) + jN) - j12 >= i10) {
                            z12 = false;
                            z13 = true;
                            z14 = z12 ? 1 : 0;
                        } else {
                            int i13 = (int) (jN - j12);
                            i11 += i13;
                            if (iB != 1718909296) {
                                z15 = false;
                                if (i13 != 0) {
                                    z17 = z17;
                                    nq0Var.b(i13);
                                    z17 = z17;
                                }
                            } else {
                                if (i13 < 8) {
                                    return false;
                                }
                                jb2Var.c(i13);
                                nq0Var.a(jb2Var.f78966a, 0, i13);
                                int i14 = i13 / 4;
                                for (int i15 = 0; i15 < i14; i15++) {
                                    if (i15 != 1) {
                                        int iB2 = jb2Var.b();
                                        if ((iB2 >>> 8) != 3368816 && (iB2 != 1751476579 || !z11)) {
                                            int[] iArr = f82495a;
                                            int i16 = 0;
                                            while (true) {
                                                if (i16 >= 29) {
                                                    continue;
                                                } else if (iArr[i16] != iB2) {
                                                    i16++;
                                                }
                                            }
                                        }
                                        z17 = true;
                                        break;
                                    }
                                    jb2Var.e(jb2Var.f78967b + 4);
                                }
                                z15 = false;
                                z17 = z17;
                                if (!z17) {
                                    return false;
                                }
                            }
                            z17 = z17;
                            z16 = z15;
                            length = j13;
                        }
                    }
                    j10 = -1;
                    z17 = z17;
                }
                return (z17 || z10 != z14) ? z12 : z13;
            }
            z12 = z16 ? 1 : 0;
            z13 = true;
            z14 = z12 ? 1 : 0;
            if (z17) {
            }
        }
    }
}
