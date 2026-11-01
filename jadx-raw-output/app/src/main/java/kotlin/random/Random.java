package kotlin.random;

import ck.i;
import ck.p;
import gk.c;
import gk.d;
import java.io.Serializable;
import vj.b;

/* JADX INFO: compiled from: Random.kt */
/* JADX INFO: loaded from: classes10.dex */
public abstract class Random {
    public static final Default Default = new Default(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Random f63000b = b.f73176a.b();

    /* JADX INFO: compiled from: Random.kt */
    public static final class Default extends Random implements Serializable {

        /* JADX INFO: compiled from: Random.kt */
        public static final class Serialized implements Serializable {
            public static final Serialized INSTANCE = new Serialized();
            private static final long serialVersionUID = 0;

            private Serialized() {
            }

            private final Object readResolve() {
                return Random.Default;
            }
        }

        private Default() {
        }

        public /* synthetic */ Default(i iVar) {
            this();
        }

        @Override // kotlin.random.Random
        public byte[] nextBytes(byte[] bArr) {
            p.j(bArr, "array");
            return Random.f63000b.nextBytes(bArr);
        }

        @Override // kotlin.random.Random
        public double nextDouble() {
            return Random.f63000b.nextDouble();
        }

        @Override // kotlin.random.Random
        public int nextInt() {
            return Random.f63000b.nextInt();
        }

        @Override // kotlin.random.Random
        public long nextLong() {
            return Random.f63000b.nextLong();
        }

        private final Object writeReplace() {
            return Serialized.INSTANCE;
        }

        @Override // kotlin.random.Random
        public byte[] nextBytes(int i10) {
            return Random.f63000b.nextBytes(i10);
        }

        @Override // kotlin.random.Random
        public double nextDouble(double d10) {
            return Random.f63000b.nextDouble(d10);
        }

        @Override // kotlin.random.Random
        public int nextInt(int i10) {
            return Random.f63000b.nextInt(i10);
        }

        @Override // kotlin.random.Random
        public long nextLong(long j10) {
            return Random.f63000b.nextLong(j10);
        }

        @Override // kotlin.random.Random
        public int nextBits(int i10) {
            return Random.f63000b.nextBits(i10);
        }

        @Override // kotlin.random.Random
        public boolean nextBoolean() {
            return Random.f63000b.nextBoolean();
        }

        @Override // kotlin.random.Random
        public byte[] nextBytes(byte[] bArr, int i10, int i11) {
            p.j(bArr, "array");
            return Random.f63000b.nextBytes(bArr, i10, i11);
        }

        @Override // kotlin.random.Random
        public double nextDouble(double d10, double d11) {
            return Random.f63000b.nextDouble(d10, d11);
        }

        @Override // kotlin.random.Random
        public float nextFloat() {
            return Random.f63000b.nextFloat();
        }

        @Override // kotlin.random.Random
        public int nextInt(int i10, int i11) {
            return Random.f63000b.nextInt(i10, i11);
        }

        @Override // kotlin.random.Random
        public long nextLong(long j10, long j11) {
            return Random.f63000b.nextLong(j10, j11);
        }
    }

    public abstract int nextBits(int i10);

    public boolean nextBoolean() {
        return nextBits(1) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x001d  */
    public byte[] nextBytes(byte[] bArr, int i10, int i11) {
        boolean z10;
        p.j(bArr, "array");
        if (!(i10 >= 0 && i10 <= bArr.length)) {
            z10 = false;
        } else if (i11 >= 0 && i11 <= bArr.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            throw new IllegalArgumentException(("fromIndex (" + i10 + ") or toIndex (" + i11 + ") are out of range: 0.." + bArr.length + '.').toString());
        }
        if (!(i10 <= i11)) {
            throw new IllegalArgumentException(("fromIndex (" + i10 + ") must be not greater than toIndex (" + i11 + ").").toString());
        }
        int i12 = (i11 - i10) / 4;
        for (int i13 = 0; i13 < i12; i13++) {
            int iNextInt = nextInt();
            bArr[i10] = (byte) iNextInt;
            bArr[i10 + 1] = (byte) (iNextInt >>> 8);
            bArr[i10 + 2] = (byte) (iNextInt >>> 16);
            bArr[i10 + 3] = (byte) (iNextInt >>> 24);
            i10 += 4;
        }
        int i14 = i11 - i10;
        int iNextBits = nextBits(i14 * 8);
        for (int i15 = 0; i15 < i14; i15++) {
            bArr[i10 + i15] = (byte) (iNextBits >>> (i15 * 8));
        }
        return bArr;
    }

    public double nextDouble() {
        return c.a(nextBits(26), nextBits(27));
    }

    public int nextInt() {
        return nextBits(32);
    }

    public long nextLong() {
        return (((long) nextInt()) << 32) + ((long) nextInt());
    }

    public static /* synthetic */ byte[] nextBytes$default(Random random, byte[] bArr, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: nextBytes");
        }
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = bArr.length;
        }
        return random.nextBytes(bArr, i10, i11);
    }

    public double nextDouble(double d10) {
        return nextDouble(0.0d, d10);
    }

    public float nextFloat() {
        return nextBits(24) / 1.6777216E7f;
    }

    public int nextInt(int i10) {
        return nextInt(0, i10);
    }

    public long nextLong(long j10) {
        return nextLong(0L, j10);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003a  */
    public double nextDouble(double d10, double d11) {
        double dNextDouble;
        d.b(d10, d11);
        double d12 = d11 - d10;
        if (Double.isInfinite(d12)) {
            if (Math.abs(d10) <= Double.MAX_VALUE) {
                if (Math.abs(d11) <= Double.MAX_VALUE) {
                    double d13 = 2;
                    double dNextDouble2 = nextDouble() * ((d11 / d13) - (d10 / d13));
                    dNextDouble = d10 + dNextDouble2 + dNextDouble2;
                } else {
                    dNextDouble = d10 + (nextDouble() * d12);
                }
            } else {
                dNextDouble = d10 + (nextDouble() * d12);
            }
        } else {
            dNextDouble = d10 + (nextDouble() * d12);
        }
        return dNextDouble >= d11 ? Math.nextAfter(d11, Double.NEGATIVE_INFINITY) : dNextDouble;
    }

    public int nextInt(int i10, int i11) {
        int iNextInt;
        int i12;
        int iNextBits;
        int iNextInt2;
        boolean z10;
        d.c(i10, i11);
        int i13 = i11 - i10;
        if (i13 > 0 || i13 == Integer.MIN_VALUE) {
            if (((-i13) & i13) == i13) {
                iNextBits = nextBits(d.e(i13));
            } else {
                do {
                    iNextInt = nextInt() >>> 1;
                    i12 = iNextInt % i13;
                } while ((iNextInt - i12) + (i13 - 1) < 0);
                iNextBits = i12;
            }
            return i10 + iNextBits;
        }
        do {
            iNextInt2 = nextInt();
            z10 = false;
            if (i10 <= iNextInt2 && iNextInt2 < i11) {
                z10 = true;
            }
        } while (!z10);
        return iNextInt2;
    }

    public long nextLong(long j10, long j11) {
        long jNextLong;
        boolean z10;
        long jNextLong2;
        long j12;
        long jNextBits;
        int iNextInt;
        d.d(j10, j11);
        long j13 = j11 - j10;
        if (j13 <= 0) {
            do {
                jNextLong = nextLong();
                z10 = false;
                if (j10 <= jNextLong && jNextLong < j11) {
                    z10 = true;
                }
            } while (!z10);
            return jNextLong;
        }
        if (((-j13) & j13) == j13) {
            int i10 = (int) j13;
            int i11 = (int) (j13 >>> 32);
            if (i10 != 0) {
                iNextInt = nextBits(d.e(i10));
            } else if (i11 == 1) {
                iNextInt = nextInt();
            } else {
                jNextBits = (((long) nextBits(d.e(i11))) << 32) + (((long) nextInt()) & 4294967295L);
            }
            jNextBits = ((long) iNextInt) & 4294967295L;
        } else {
            do {
                jNextLong2 = nextLong() >>> 1;
                j12 = jNextLong2 % j13;
            } while ((jNextLong2 - j12) + (j13 - 1) < 0);
            jNextBits = j12;
        }
        return j10 + jNextBits;
    }

    public byte[] nextBytes(byte[] bArr) {
        p.j(bArr, "array");
        return nextBytes(bArr, 0, bArr.length);
    }

    public byte[] nextBytes(int i10) {
        return nextBytes(new byte[i10]);
    }
}
