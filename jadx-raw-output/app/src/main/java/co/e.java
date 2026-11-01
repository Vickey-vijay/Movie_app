package co;

/* JADX INFO: compiled from: RegistryItem.java */
/* JADX INFO: loaded from: classes5.dex */
public class e<K, I> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public K f6177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public I f6178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public mn.d f6179c;

    public e(K k10) {
        this.f6179c = new mn.d();
        this.f6177a = k10;
    }

    public mn.d a() {
        return this.f6179c;
    }

    public I b() {
        return this.f6178b;
    }

    public K c() {
        return this.f6177a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f6177a.equals(((e) obj).f6177a);
    }

    public int hashCode() {
        return this.f6177a.hashCode();
    }

    public String toString() {
        return "(" + getClass().getSimpleName() + ") " + a() + " KEY: " + c() + " ITEM: " + b();
    }

    public e(K k10, I i10, int i11) {
        this.f6179c = new mn.d();
        this.f6177a = k10;
        this.f6178b = i10;
        this.f6179c = new mn.d(i11);
    }
}
