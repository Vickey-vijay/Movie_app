package bj;

/* JADX INFO: compiled from: Pow2.java */
/* JADX INFO: loaded from: classes9.dex */
public final class j {
    public static int a(int i10) {
        return 1 << (32 - Integer.numberOfLeadingZeros(i10 - 1));
    }
}
