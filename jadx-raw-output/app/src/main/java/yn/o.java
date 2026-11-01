package yn;

import org.fourthline.cling.model.types.InvalidValueException;

/* JADX INFO: compiled from: NamedDeviceType.java */
/* JADX INFO: loaded from: classes8.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z f85820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j f85821b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f85821b.equals(oVar.f85821b) && this.f85820a.equals(oVar.f85820a);
    }

    public static o c(String str) throws InvalidValueException {
        String[] strArrSplit = str.split("::");
        if (strArrSplit.length != 2) {
            throw new InvalidValueException("Can't parse UDN::DeviceType from: " + str);
        }
        try {
            return new o(z.b(strArrSplit[0]), j.d(strArrSplit[1]));
        } catch (Exception unused) {
            throw new InvalidValueException("Can't parse UDN: " + strArrSplit[0]);
        }
    }

    public j a() {
        return this.f85821b;
    }

    public z b() {
        return this.f85820a;
    }

    public int hashCode() {
        return (this.f85820a.hashCode() * 31) + this.f85821b.hashCode();
    }

    public String toString() {
        return b().toString() + "::" + a().toString();
    }

    public o(z zVar, j jVar) {
        this.f85820a = zVar;
        this.f85821b = jVar;
    }
}
