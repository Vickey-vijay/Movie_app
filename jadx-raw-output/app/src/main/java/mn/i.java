package mn;

import com.ironsource.Z7;

/* JADX INFO: compiled from: ServerClientTokens.java */
/* JADX INFO: loaded from: classes2.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f64639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f64640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f64641c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f64642d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f64643e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f64644f;

    public i() {
        this.f64639a = 1;
        this.f64640b = 0;
        this.f64641c = System.getProperty("os.name").replaceAll("[^a-zA-Z0-9\\.\\-_]", "");
        this.f64642d = System.getProperty("os.version").replaceAll("[^a-zA-Z0-9\\.\\-_]", "");
        this.f64643e = "Cling";
        this.f64644f = "2.0";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        return this.f64639a == iVar.f64639a && this.f64640b == iVar.f64640b && this.f64641c.equals(iVar.f64641c) && this.f64642d.equals(iVar.f64642d) && this.f64643e.equals(iVar.f64643e) && this.f64644f.equals(iVar.f64644f);
    }

    public String a() {
        StringBuilder sb2 = new StringBuilder(256);
        sb2.append(this.f64641c.indexOf(32) != -1 ? this.f64641c.replace(' ', '_') : this.f64641c);
        sb2.append('/');
        sb2.append(this.f64642d.indexOf(32) != -1 ? this.f64642d.replace(' ', '_') : this.f64642d);
        sb2.append(" UPnP/");
        sb2.append(this.f64639a);
        sb2.append('.');
        sb2.append(this.f64640b);
        sb2.append(' ');
        sb2.append(this.f64643e.indexOf(32) != -1 ? this.f64643e.replace(' ', '_') : this.f64643e);
        sb2.append('/');
        sb2.append(this.f64644f.indexOf(32) != -1 ? this.f64644f.replace(' ', '_') : this.f64644f);
        return sb2.toString();
    }

    public int b() {
        return this.f64639a;
    }

    public int c() {
        return this.f64640b;
    }

    public String d() {
        return this.f64641c;
    }

    public String e() {
        return this.f64642d;
    }

    public String f() {
        return this.f64643e;
    }

    public String g() {
        return this.f64644f;
    }

    public void h(int i10) {
        this.f64640b = i10;
    }

    public int hashCode() {
        return (((((((((this.f64639a * 31) + this.f64640b) * 31) + this.f64641c.hashCode()) * 31) + this.f64642d.hashCode()) * 31) + this.f64643e.hashCode()) * 31) + this.f64644f.hashCode();
    }

    public void i(String str) {
        this.f64641c = str;
    }

    public void j(String str) {
        this.f64642d = str;
    }

    public void k(String str) {
        this.f64643e = str;
    }

    public void l(String str) {
        this.f64644f = str;
    }

    public String toString() {
        return d() + "/" + e() + " UPnP/" + b() + "." + c() + Z7.f27998r + f() + "/" + g();
    }

    public i(int i10, int i11) {
        this.f64639a = 1;
        this.f64640b = 0;
        this.f64641c = System.getProperty("os.name").replaceAll("[^a-zA-Z0-9\\.\\-_]", "");
        this.f64642d = System.getProperty("os.version").replaceAll("[^a-zA-Z0-9\\.\\-_]", "");
        this.f64643e = "Cling";
        this.f64644f = "2.0";
        this.f64639a = i10;
        this.f64640b = i11;
    }
}
