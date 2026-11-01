package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

import android.support.v4.media.session.PlaybackStateCompat;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import java.io.EOFException;

/* JADX INFO: loaded from: classes11.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f16969a = {z.a("isom"), z.a("iso2"), z.a("iso3"), z.a("iso4"), z.a("iso5"), z.a("iso6"), z.a("avc1"), z.a("hvc1"), z.a("hev1"), z.a("mp41"), z.a("mp42"), z.a("3g2a"), z.a("3g2b"), z.a("3gr6"), z.a("3gs6"), z.a("3ge6"), z.a("3gg6"), z.a("M4V "), z.a("M4A "), z.a("f4v "), z.a("kddi"), z.a("M4VP"), z.a("qt  "), z.a("MSNV")};

    public static boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, boolean z10) throws InterruptedException, EOFException {
        boolean z11;
        boolean z12;
        long j10 = bVar.f16451b;
        if (j10 == -1 || j10 > PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
            j10 = 4096;
        }
        int i10 = (int) j10;
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(64);
        int i11 = 0;
        boolean z13 = false;
        while (true) {
            if (i11 < i10) {
                nVar.c(8);
                bVar.a(nVar.f17845a, 0, 8, false);
                long jK = nVar.k();
                int iB = nVar.b();
                int i12 = 16;
                if (jK == 1) {
                    bVar.a(nVar.f17845a, 8, 8, false);
                    nVar.d(16);
                    jK = nVar.n();
                } else {
                    i12 = 8;
                }
                long j11 = i12;
                if (jK < j11) {
                    return false;
                }
                i11 += i12;
                if (iB != c.C) {
                    if (iB == c.L || iB == c.N) {
                        z11 = true;
                        z12 = true;
                        if (!z13 && z10 == z12) {
                            return z11;
                        }
                    }
                    if ((((long) i11) + jK) - j11 < i10) {
                        int i13 = (int) (jK - j11);
                        i11 += i13;
                        if (iB == c.f16804b) {
                            if (i13 < 8) {
                                return false;
                            }
                            nVar.c(i13);
                            bVar.a(nVar.f17845a, 0, i13, false);
                            int i14 = i13 / 4;
                            for (int i15 = 0; i15 < i14; i15++) {
                                if (i15 != 1) {
                                    int iB2 = nVar.b();
                                    if ((iB2 >>> 8) != z.a("3gp")) {
                                        int[] iArr = f16969a;
                                        int length = iArr.length;
                                        int i16 = 0;
                                        while (true) {
                                            if (i16 >= length) {
                                                continue;
                                            } else if (iArr[i16] != iB2) {
                                                i16++;
                                            }
                                        }
                                    }
                                    z13 = true;
                                    break;
                                }
                                nVar.e(nVar.f17846b + 4);
                            }
                            if (!z13) {
                                return false;
                            }
                        } else if (i13 != 0) {
                            bVar.a(i13, false);
                        }
                    }
                }
            }
            z11 = true;
            z12 = false;
            return !z13 ? false : false;
        }
    }
}
