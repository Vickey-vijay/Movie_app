package yn;

import org.fourthline.cling.model.types.InvalidValueException;

/* JADX INFO: compiled from: NamedServiceType.java */
/* JADX INFO: loaded from: classes8.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z f85822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public s f85823b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f85823b.equals(pVar.f85823b) && this.f85822a.equals(pVar.f85822a);
    }

    public static p c(String str) throws InvalidValueException {
        String[] strArrSplit = str.split("::");
        if (strArrSplit.length != 2) {
            throw new InvalidValueException("Can't parse UDN::ServiceType from: " + str);
        }
        try {
            return new p(z.b(strArrSplit[0]), s.d(strArrSplit[1]));
        } catch (Exception unused) {
            throw new InvalidValueException("Can't parse UDN: " + strArrSplit[0]);
        }
    }

    public s a() {
        return this.f85823b;
    }

    public z b() {
        return this.f85822a;
    }

    public int hashCode() {
        return (this.f85822a.hashCode() * 31) + this.f85823b.hashCode();
    }

    public String toString() {
        return b().toString() + "::" + a().toString();
    }

    public p(z zVar, s sVar) {
        this.f85822a = zVar;
        this.f85823b = sVar;
    }
}
