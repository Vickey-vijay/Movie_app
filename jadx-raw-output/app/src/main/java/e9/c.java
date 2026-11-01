package e9;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: compiled from: ClingDeviceList.java */
/* JADX INFO: loaded from: classes9.dex */
public class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static c f52462b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Collection<b> f52463a = new ArrayList();

    public void b() {
        this.f52463a = null;
        f52462b = null;
    }

    public static c e() {
        if (h9.c.b(f52462b)) {
            f52462b = new c();
        }
        return f52462b;
    }

    @Nullable
    public b c(un.a aVar) {
        Collection<b> collection = this.f52463a;
        if (collection == null) {
            return null;
        }
        for (b bVar : collection) {
            un.a device = bVar.getDevice();
            if (device != null && device.equals(aVar)) {
                return bVar;
            }
        }
        return null;
    }

    @Nullable
    public Collection<b> d() {
        return this.f52463a;
    }

    public void a(b bVar) {
        Collection<b> collection;
        if (h9.c.a(bVar) && (collection = this.f52463a) != null) {
            collection.add(bVar);
        }
    }

    public void f(b bVar) {
        Collection<b> collection;
        if (h9.c.a(bVar) && (collection = this.f52463a) != null) {
            collection.remove(bVar);
        }
    }
}
