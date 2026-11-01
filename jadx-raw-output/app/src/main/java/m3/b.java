package m3;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import g5.s;
import g5.t;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: Ac4Util.java */
/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f63958a = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    /* JADX INFO: renamed from: m3.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Ac4Util.java */
    public static final class C0580b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f63959a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f63960b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f63961c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f63962d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f63963e;

        public C0580b(int i10, int i11, int i12, int i13, int i14) {
            this.f63959a = i10;
            this.f63961c = i11;
            this.f63960b = i12;
            this.f63962d = i13;
            this.f63963e = i14;
        }
    }

    public static void a(int i10, t tVar) {
        tVar.H(7);
        byte[] bArr = tVar.f53154a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i10 >> 16) & 255);
        bArr[5] = (byte) ((i10 >> 8) & 255);
        bArr[6] = (byte) (i10 & 255);
    }

    public static Format b(t tVar, String str, String str2, @Nullable DrmInitData drmInitData) {
        tVar.M(1);
        return Format.p(str, "audio/ac4", null, -1, -1, 2, ((tVar.y() & 32) >> 5) == 1 ? 48000 : 44100, null, drmInitData, 0, str2);
    }

    public static int e(byte[] bArr, int i10) {
        int i11 = 7;
        if (bArr.length < 7) {
            return -1;
        }
        int i12 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        if (i12 == 65535) {
            i12 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
        } else {
            i11 = 4;
        }
        if (i10 == 44097) {
            i11 += 2;
        }
        return i12 + i11;
    }

    public static int f(s sVar, int i10) {
        int i11 = 0;
        while (true) {
            int iH = i11 + sVar.h(i10);
            if (!sVar.g()) {
                return iH;
            }
            i11 = (iH + 1) << i10;
        }
    }

    public static int c(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[16];
        int iPosition = byteBuffer.position();
        byteBuffer.get(bArr);
        byteBuffer.position(iPosition);
        return d(new s(bArr)).f63963e;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x008a  */
    /* JADX WARN: Code duplicated, block: B:45:0x008e  */
    public static C0580b d(s sVar) {
        int i10;
        int i11;
        int iH = sVar.h(16);
        int iH2 = sVar.h(16);
        if (iH2 == 65535) {
            iH2 = sVar.h(24);
            i10 = 7;
        } else {
            i10 = 4;
        }
        int i12 = iH2 + i10;
        if (iH == 44097) {
            i12 += 2;
        }
        int i13 = i12;
        int iH3 = sVar.h(2);
        if (iH3 == 3) {
            iH3 += f(sVar, 2);
        }
        int i14 = iH3;
        int iH4 = sVar.h(10);
        if (sVar.g() && sVar.h(3) > 0) {
            sVar.q(2);
        }
        int i15 = sVar.g() ? 48000 : 44100;
        int iH5 = sVar.h(4);
        int i16 = 0;
        if (i15 == 44100 && iH5 == 13) {
            i11 = f63958a[iH5];
        } else {
            if (i15 == 48000) {
                int[] iArr = f63958a;
                if (iH5 < iArr.length) {
                    i16 = iArr[iH5];
                    int i17 = iH4 % 5;
                    if (i17 == 1) {
                        if (iH5 != 3 || iH5 == 8) {
                            i16++;
                        }
                    } else if (i17 != 2) {
                        if (i17 != 3) {
                            if (i17 == 4 && (iH5 == 3 || iH5 == 8 || iH5 == 11)) {
                                i16++;
                            }
                        } else if (iH5 != 3) {
                            i16++;
                        } else {
                            i16++;
                        }
                    } else if (iH5 == 8 || iH5 == 11) {
                        i16++;
                    }
                }
            }
            i11 = i16;
        }
        return new C0580b(i14, 2, i15, i13, i11);
    }
}
