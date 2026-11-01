package u7;

/* JADX INFO: compiled from: DefaultIdGenerator.java */
/* JADX INFO: loaded from: classes6.dex */
public class b implements w7.c.d {
    @Override // w7.c.d
    public int a(String str, String str2, boolean z10) {
        return z10 ? w7.f.O(w7.f.o("%sp%s@dir", str, str2)).hashCode() : w7.f.O(w7.f.o("%sp%s", str, str2)).hashCode();
    }

    @Override // w7.c.d
    public int b(int i10, String str, String str2, boolean z10) {
        return a(str, str2, z10);
    }
}
