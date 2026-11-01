package im;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.net.InetSocketAddress;

/* JADX INFO: compiled from: Address.java */
/* JADX INFO: loaded from: classes9.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f54245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f54246b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f54245a.equals(bVar.f54245a) && this.f54246b == bVar.f54246b;
    }

    public String a() {
        return this.f54245a;
    }

    public int b() {
        return this.f54246b;
    }

    public InetSocketAddress c() {
        return new InetSocketAddress(a(), b());
    }

    public int hashCode() {
        return (this.f54245a.hashCode() * 31) + this.f54246b;
    }

    public String toString() {
        return this.f54245a + StringUtils.PROCESS_POSTFIX_DELIMITER + this.f54246b;
    }

    public b(String str, int i10) {
        if (str != null) {
            this.f54245a = str.trim();
            this.f54246b = i10;
            return;
        }
        throw new IllegalArgumentException("Host is null");
    }
}
