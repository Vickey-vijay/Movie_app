package ho;

import java.util.Map;
import org.fourthline.cling.model.types.Datatype;
import org.fourthline.cling.support.shared.AbstractMap$SimpleEntry;

/* JADX INFO: compiled from: EventedValue.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class b<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final V f54000a;

    public Map.Entry<String, String>[] a() {
        return new Map.Entry[]{new AbstractMap$SimpleEntry("val", toString())};
    }

    public abstract Datatype b();

    public V d() {
        return this.f54000a;
    }

    public b(V v10) {
        this.f54000a = v10;
    }

    public String c() {
        return getClass().getSimpleName();
    }

    public String toString() {
        return b().e(d());
    }
}
