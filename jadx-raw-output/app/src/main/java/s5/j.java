package s5;

import com.google.gson.internal.LinkedTreeMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: JsonObject.java */
/* JADX INFO: loaded from: classes11.dex */
public final class j extends h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedTreeMap<String, h> f67029b = new LinkedTreeMap<>();

    public Set<Map.Entry<String, h>> entrySet() {
        return this.f67029b.entrySet();
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof j) && ((j) obj).f67029b.equals(this.f67029b));
    }

    public int hashCode() {
        return this.f67029b.hashCode();
    }

    public void l(String str, h hVar) {
        if (hVar == null) {
            hVar = i.f67028b;
        }
        this.f67029b.put(str, hVar);
    }
}
