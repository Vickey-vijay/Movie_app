package xm;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: AttributesMap.java */
/* JADX INFO: loaded from: classes10.dex */
public class c implements b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<String, Object> f74978b = new HashMap();

    @Override // xm.b
    public void a(String str, Object obj) {
        if (obj == null) {
            this.f74978b.remove(str);
        } else {
            this.f74978b.put(str, obj);
        }
    }

    public Set<Map.Entry<String, Object>> b() {
        return this.f74978b.entrySet();
    }

    public Enumeration<String> c() {
        return Collections.enumeration(this.f74978b.keySet());
    }

    @Override // xm.b
    public Object getAttribute(String str) {
        return this.f74978b.get(str);
    }

    @Override // xm.b
    public void removeAttribute(String str) {
        this.f74978b.remove(str);
    }

    public String toString() {
        return this.f74978b.toString();
    }

    @Override // xm.b
    public void y() {
        this.f74978b.clear();
    }
}
