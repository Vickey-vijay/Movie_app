package yads;

/* JADX INFO: loaded from: classes10.dex */
public final class nt extends w43 implements Comparable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f80753k;

    /* JADX WARN: Code duplicated, block: B:14:0x002e A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:15:0x0030 A[ORIG_RETURN, RETURN] */
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        nt ntVar = (nt) obj;
        if (b(4) != ntVar.b(4)) {
            if (b(4)) {
                return 1;
            }
            return -1;
        }
        long j10 = this.f82570f - ntVar.f82570f;
        if (j10 == 0) {
            j10 = this.f80753k - ntVar.f80753k;
            if (j10 == 0) {
                return 0;
            }
        }
        if (j10 > 0) {
            return 1;
        }
        return -1;
    }
}
