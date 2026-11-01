package sl;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: Messenger.java */
/* JADX INFO: loaded from: classes6.dex */
public class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static d f72001c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashMap<Type, List<a>> f72002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public HashMap<Type, List<a>> f72003b;

    /* JADX INFO: compiled from: Messenger.java */
    public class a {
        public f a() {
            return null;
        }
    }

    public static void b(HashMap<Type, List<a>> map) {
        if (map == null) {
            return;
        }
        for (Map.Entry<Type, List<a>> entry : map.entrySet()) {
            List<a> list = map.get(entry);
            if (list != null) {
                for (a aVar : list) {
                    aVar.a();
                    list.remove(aVar);
                }
                if (list.size() == 0) {
                    map.remove(entry);
                }
            }
        }
    }

    public static d c() {
        if (f72001c == null) {
            f72001c = new d();
        }
        return f72001c;
    }

    public static void e(Object obj, HashMap<Type, List<a>> map) {
        if (obj == null || map == null || map.size() == 0) {
            return;
        }
        synchronized (map) {
            Iterator<Type> it = map.keySet().iterator();
            while (it.hasNext()) {
                Iterator<a> it2 = map.get(it.next()).iterator();
                while (it2.hasNext()) {
                    it2.next().a();
                }
            }
        }
        b(map);
    }

    public final void a() {
        b(this.f72002a);
        b(this.f72003b);
    }

    public void d(Object obj) {
        e(obj, this.f72002a);
        e(obj, this.f72003b);
        a();
    }
}
