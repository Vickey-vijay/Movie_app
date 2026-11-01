package mn;

import java.net.InetAddress;
import java.net.URL;

/* JADX INFO: compiled from: Location.java */
/* JADX INFO: loaded from: classes2.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f64628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f64629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final URL f64630c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return this.f64628a.equals(eVar.f64628a) && this.f64629b.equals(eVar.f64629b);
    }

    public static URL a(InetAddress inetAddress, int i10, String str) {
        try {
            return new URL("http", inetAddress.getHostAddress(), i10, str);
        } catch (Exception e10) {
            throw new IllegalArgumentException("Address, port, and URI can not be converted to URL", e10);
        }
    }

    public h b() {
        return this.f64628a;
    }

    public URL c() {
        return this.f64630c;
    }

    public int hashCode() {
        return (this.f64628a.hashCode() * 31) + this.f64629b.hashCode();
    }

    public e(h hVar, String str) {
        this.f64628a = hVar;
        this.f64629b = str;
        this.f64630c = a(hVar.a(), hVar.c(), str);
    }
}
