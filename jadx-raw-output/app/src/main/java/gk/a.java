package gk;

import ck.p;
import kotlin.random.Random;

/* JADX INFO: compiled from: PlatformRandom.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a extends Random {
    public abstract java.util.Random d();

    @Override // kotlin.random.Random
    public int nextInt() {
        return d().nextInt();
    }

    @Override // kotlin.random.Random
    public byte[] nextBytes(byte[] bArr) {
        p.j(bArr, "array");
        d().nextBytes(bArr);
        return bArr;
    }

    @Override // kotlin.random.Random
    public int nextInt(int i10) {
        return d().nextInt(i10);
    }

    @Override // kotlin.random.Random
    public int nextBits(int i10) {
        return d.g(d().nextInt(), i10);
    }

    @Override // kotlin.random.Random
    public boolean nextBoolean() {
        return d().nextBoolean();
    }

    @Override // kotlin.random.Random
    public double nextDouble() {
        return d().nextDouble();
    }

    @Override // kotlin.random.Random
    public float nextFloat() {
        return d().nextFloat();
    }

    @Override // kotlin.random.Random
    public long nextLong() {
        return d().nextLong();
    }
}
