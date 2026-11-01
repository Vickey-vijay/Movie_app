package yn;

import java.util.UUID;
import java.util.logging.Logger;

/* JADX INFO: compiled from: UDN.java */
/* JADX INFO: loaded from: classes9.dex */
public class z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f85849b = Logger.getLogger(z.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f85850a;

    public z(String str) {
        this.f85850a = str;
    }

    public static z b(String str) {
        if (str.startsWith("uuid:")) {
            str = str.substring(5);
        }
        return new z(str);
    }

    public String a() {
        return this.f85850a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof z)) {
            return false;
        }
        return this.f85850a.equals(((z) obj).f85850a);
    }

    public int hashCode() {
        return this.f85850a.hashCode();
    }

    public String toString() {
        return "uuid:" + a();
    }

    public z(UUID uuid) {
        this.f85850a = uuid.toString();
    }
}
