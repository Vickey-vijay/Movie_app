package yads;

/* JADX INFO: loaded from: classes8.dex */
public final class oo3 implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f81116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ko3 f81117c;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f81116b, ((oo3) obj).f81116b);
    }

    public oo3(int i10, ko3 ko3Var) {
        this.f81116b = i10;
        this.f81117c = ko3Var;
    }
}
