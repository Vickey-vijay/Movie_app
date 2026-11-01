package hd;

/* JADX INFO: compiled from: ExifInfo.java */
/* JADX INFO: loaded from: classes8.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f53853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f53854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f53855c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f53853a == bVar.f53853a && this.f53854b == bVar.f53854b && this.f53855c == bVar.f53855c;
    }

    public int hashCode() {
        return (((this.f53853a * 31) + this.f53854b) * 31) + this.f53855c;
    }

    public b(int i10, int i11, int i12) {
        this.f53853a = i10;
        this.f53854b = i11;
        this.f53855c = i12;
    }
}
