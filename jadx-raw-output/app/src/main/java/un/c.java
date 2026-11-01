package un;

import java.util.ArrayList;
import java.util.List;
import yn.z;

/* JADX INFO: compiled from: DeviceIdentity.java */
/* JADX INFO: loaded from: classes11.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f72939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f72940b;

    public c(z zVar) {
        this.f72939a = zVar;
        this.f72940b = 1800;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f72939a.equals(((c) obj).f72939a);
    }

    public Integer a() {
        return this.f72940b;
    }

    public z b() {
        return this.f72939a;
    }

    public List<mn.k> c() {
        ArrayList arrayList = new ArrayList();
        if (b() == null) {
            arrayList.add(new mn.k(getClass(), "major", "Device has no UDN"));
        }
        return arrayList;
    }

    public int hashCode() {
        return this.f72939a.hashCode();
    }

    public String toString() {
        return "(" + getClass().getSimpleName() + ") UDN: " + b();
    }

    public c(z zVar, Integer num) {
        this.f72939a = zVar;
        this.f72940b = num;
    }
}
