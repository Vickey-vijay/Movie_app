package xo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import xo.h;

/* JADX INFO: compiled from: GroupedLinkedMap.java */
/* JADX INFO: loaded from: classes4.dex */
public class e<K extends h, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a<K, V> f75085a = new a<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<K, a<K, V>> f75086b = new HashMap();

    /* JADX INFO: compiled from: GroupedLinkedMap.java */
    public static class a<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final K f75087a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List<V> f75088b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public a<K, V> f75089c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public a<K, V> f75090d;

        public a() {
            this(null);
        }

        public a(K k10) {
            this.f75090d = this;
            this.f75089c = this;
            this.f75087a = k10;
        }

        public void a(V v10) {
            if (this.f75088b == null) {
                this.f75088b = new ArrayList();
            }
            this.f75088b.add(v10);
        }

        public int c() {
            List<V> list = this.f75088b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        public V b() {
            int iC = c();
            if (iC > 0) {
                return this.f75088b.remove(iC - 1);
            }
            return null;
        }
    }

    public static <K, V> void e(a<K, V> aVar) {
        a<K, V> aVar2 = aVar.f75090d;
        aVar2.f75089c = aVar.f75089c;
        aVar.f75089c.f75090d = aVar2;
    }

    public static <K, V> void g(a<K, V> aVar) {
        aVar.f75089c.f75090d = aVar;
        aVar.f75090d.f75089c = aVar;
    }

    public V a(K k10) {
        a<K, V> aVar = this.f75086b.get(k10);
        if (aVar == null) {
            aVar = new a<>(k10);
            this.f75086b.put(k10, aVar);
        } else {
            k10.offer();
        }
        b(aVar);
        return aVar.b();
    }

    public void d(K k10, V v10) {
        a<K, V> aVar = this.f75086b.get(k10);
        if (aVar == null) {
            aVar = new a<>(k10);
            c(aVar);
            this.f75086b.put(k10, aVar);
        } else {
            k10.offer();
        }
        aVar.a(v10);
    }

    public V f() {
        for (a aVar = this.f75085a.f75090d; !aVar.equals(this.f75085a); aVar = aVar.f75090d) {
            V v10 = (V) aVar.b();
            if (v10 != null) {
                return v10;
            }
            e(aVar);
            this.f75086b.remove(aVar.f75087a);
            ((h) aVar.f75087a).offer();
        }
        return null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("GroupedLinkedMap( ");
        boolean z10 = false;
        for (a aVar = this.f75085a.f75089c; !aVar.equals(this.f75085a); aVar = aVar.f75089c) {
            z10 = true;
            sb2.append('{');
            sb2.append(aVar.f75087a);
            sb2.append(':');
            sb2.append(aVar.c());
            sb2.append("}, ");
        }
        if (z10) {
            sb2.delete(sb2.length() - 2, sb2.length());
        }
        sb2.append(" )");
        return sb2.toString();
    }

    public final void b(a<K, V> aVar) {
        e(aVar);
        a<K, V> aVar2 = this.f75085a;
        aVar.f75090d = aVar2;
        aVar.f75089c = aVar2.f75089c;
        g(aVar);
    }

    public final void c(a<K, V> aVar) {
        e(aVar);
        a<K, V> aVar2 = this.f75085a;
        aVar.f75090d = aVar2.f75090d;
        aVar.f75089c = aVar2;
        g(aVar);
    }
}
