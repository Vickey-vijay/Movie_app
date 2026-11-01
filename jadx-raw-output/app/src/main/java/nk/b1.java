package nk;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class b1 implements o1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f64760b;

    @Override // nk.o1
    public z1 b() {
        return null;
    }

    @Override // nk.o1
    public boolean isActive() {
        return this.f64760b;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Empty{");
        sb2.append(isActive() ? "Active" : "New");
        sb2.append('}');
        return sb2.toString();
    }

    public b1(boolean z10) {
        this.f64760b = z10;
    }
}
