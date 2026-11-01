package jl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import master.flame.danmaku.danmaku.model.android.DanmakuContext;

/* JADX INFO: compiled from: DanmakuFilters.java */
/* JADX INFO: loaded from: classes9.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Exception f61850a = new Exception("not suuport this filter tag");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<String, e<?>> f61851b = Collections.synchronizedSortedMap(new TreeMap());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, e<?>> f61852c = Collections.synchronizedSortedMap(new TreeMap());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e<?>[] f61853d = new e[0];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e<?>[] f61854e = new e[0];

    /* JADX INFO: compiled from: DanmakuFilters.java */
    public static abstract class a<T> implements e<T> {
        @Override // jl.b.e
        public void clear() {
        }
    }

    /* JADX INFO: renamed from: jl.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DanmakuFilters.java */
    public static class C0554b extends a<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final kl.k f61855a = new ll.e(4);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LinkedHashMap<String, kl.c> f61856b = new LinkedHashMap<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final kl.k f61857c = new ll.e(4);

        /* JADX INFO: renamed from: jl.b$b$a */
        /* JADX INFO: compiled from: DanmakuFilters.java */
        public class a extends kl.k.c<kl.c> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public long f61858a = ql.b.b();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ long f61859b;

            @Override // kl.k.b
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public int a(kl.c cVar) {
                try {
                    return (ql.b.b() - this.f61858a <= this.f61859b && cVar.v()) ? 2 : 1;
                } catch (Exception unused) {
                }
            }

            public a(long j10) {
                this.f61859b = j10;
            }
        }

        public synchronized boolean c(kl.c cVar, int i10, int i11, kl.e eVar, boolean z10) {
            e(this.f61855a, 2L);
            e(this.f61857c, 2L);
            d(this.f61856b, 3);
            if (this.f61855a.d(cVar) && !cVar.r()) {
                return true;
            }
            if (this.f61857c.d(cVar)) {
                return false;
            }
            if (!this.f61856b.containsKey(cVar.f62892c)) {
                this.f61856b.put(String.valueOf(cVar.f62892c), cVar);
                this.f61857c.a(cVar);
                return false;
            }
            this.f61856b.put(String.valueOf(cVar.f62892c), cVar);
            this.f61855a.g(cVar);
            this.f61855a.a(cVar);
            return true;
        }

        public synchronized void f() {
            this.f61857c.clear();
            this.f61855a.clear();
            this.f61856b.clear();
        }

        @Override // jl.b.e
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void a(Void r10) {
        }

        public final void e(kl.k kVar, long j10) {
            kVar.c(new a(j10));
        }

        @Override // jl.b.e
        public boolean b(kl.c cVar, int i10, int i11, kl.e eVar, boolean z10, DanmakuContext danmakuContext) {
            boolean zC = c(cVar, i10, i11, eVar, z10);
            if (zC) {
                cVar.F |= 128;
            }
            return zC;
        }

        @Override // jl.b.a, jl.b.e
        public void clear() {
            f();
        }

        public final void d(LinkedHashMap<String, kl.c> linkedHashMap, int i10) {
            Iterator<Map.Entry<String, kl.c>> it = linkedHashMap.entrySet().iterator();
            long jB = ql.b.b();
            while (it.hasNext()) {
                try {
                    if (it.next().getValue().v()) {
                        it.remove();
                        if (ql.b.b() - jB > i10) {
                            return;
                        }
                    } else {
                        return;
                    }
                } catch (Exception unused) {
                    return;
                }
            }
        }
    }

    /* JADX INFO: compiled from: DanmakuFilters.java */
    public static class d extends a<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Boolean f61862a = Boolean.FALSE;

        @Override // jl.b.e
        public boolean b(kl.c cVar, int i10, int i11, kl.e eVar, boolean z10, DanmakuContext danmakuContext) {
            boolean z11 = this.f61862a.booleanValue() && cVar.C;
            if (z11) {
                cVar.F |= 64;
            }
            return z11;
        }

        @Override // jl.b.e
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(Boolean bool) {
            this.f61862a = bool;
        }
    }

    /* JADX INFO: compiled from: DanmakuFilters.java */
    public interface e<T> {
        void a(T t10);

        boolean b(kl.c cVar, int i10, int i11, kl.e eVar, boolean z10, DanmakuContext danmakuContext);

        void clear();
    }

    /* JADX INFO: compiled from: DanmakuFilters.java */
    public static class f extends a<Map<Integer, Integer>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Map<Integer, Integer> f61863a;

        @Override // jl.b.e
        public boolean b(kl.c cVar, int i10, int i11, kl.e eVar, boolean z10, DanmakuContext danmakuContext) {
            Map<Integer, Integer> map = this.f61863a;
            boolean z11 = false;
            if (map != null) {
                Integer num = map.get(Integer.valueOf(cVar.getType()));
                if (num != null && i10 >= num.intValue()) {
                    z11 = true;
                }
                if (z11) {
                    cVar.F |= 256;
                }
            }
            return z11;
        }

        @Override // jl.b.e
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(Map<Integer, Integer> map) {
            this.f61863a = map;
        }
    }

    /* JADX INFO: compiled from: DanmakuFilters.java */
    public static class g extends a<Map<Integer, Boolean>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Map<Integer, Boolean> f61864a;

        @Override // jl.b.e
        public boolean b(kl.c cVar, int i10, int i11, kl.e eVar, boolean z10, DanmakuContext danmakuContext) {
            Map<Integer, Boolean> map = this.f61864a;
            boolean z11 = false;
            if (map != null) {
                Boolean bool = map.get(Integer.valueOf(cVar.getType()));
                if (bool != null && bool.booleanValue() && z10) {
                    z11 = true;
                }
                if (z11) {
                    cVar.F |= 512;
                }
            }
            return z11;
        }

        @Override // jl.b.e
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(Map<Integer, Boolean> map) {
            this.f61864a = map;
        }
    }

    /* JADX INFO: compiled from: DanmakuFilters.java */
    public static class h extends a<Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f61865a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public kl.c f61866b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f61867c = 1.0f;

        @Override // jl.b.e
        public synchronized boolean b(kl.c cVar, int i10, int i11, kl.e eVar, boolean z10, DanmakuContext danmakuContext) {
            boolean zC;
            zC = c(cVar, i10, i11, eVar, z10, danmakuContext);
            if (zC) {
                cVar.F |= 2;
            }
            return zC;
        }

        public synchronized void d() {
            this.f61866b = null;
        }

        public final boolean c(kl.c cVar, int i10, int i11, kl.e eVar, boolean z10, DanmakuContext danmakuContext) {
            if (this.f61865a > 0 && cVar.getType() == 1) {
                kl.c cVar2 = this.f61866b;
                if (cVar2 != null && !cVar2.v()) {
                    long jB = cVar.b() - this.f61866b.b();
                    kl.f fVar = danmakuContext.f64339z.f63690g;
                    if ((jB >= 0 && fVar != null && jB < fVar.f62920d * this.f61867c) || i10 > this.f61865a) {
                        return true;
                    }
                    this.f61866b = cVar;
                    return false;
                }
                this.f61866b = cVar;
            }
            return false;
        }

        @Override // jl.b.a, jl.b.e
        public void clear() {
            d();
        }

        @Override // jl.b.e
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void a(Integer num) {
            d();
            if (num != null && num.intValue() != this.f61865a) {
                int iIntValue = num.intValue() + (num.intValue() / 5);
                this.f61865a = iIntValue;
                this.f61867c = 1.0f / iIntValue;
            }
        }
    }

    /* JADX INFO: compiled from: DanmakuFilters.java */
    public static class i extends a<List<Integer>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List<Integer> f61868a = new ArrayList();

        @Override // jl.b.e
        public boolean b(kl.c cVar, int i10, int i11, kl.e eVar, boolean z10, DanmakuContext danmakuContext) {
            boolean z11 = (cVar == null || this.f61868a.contains(Integer.valueOf(cVar.f62895f))) ? false : true;
            if (z11) {
                cVar.F |= 8;
            }
            return z11;
        }

        public final void c(Integer num) {
            if (this.f61868a.contains(num)) {
                return;
            }
            this.f61868a.add(num);
        }

        public void d() {
            this.f61868a.clear();
        }

        @Override // jl.b.e
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void a(List<Integer> list) {
            d();
            if (list != null) {
                Iterator<Integer> it = list.iterator();
                while (it.hasNext()) {
                    c(it.next());
                }
            }
        }
    }

    /* JADX INFO: compiled from: DanmakuFilters.java */
    public static class j extends a<List<Integer>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<Integer> f61869a = Collections.synchronizedList(new ArrayList());

        @Override // jl.b.e
        public boolean b(kl.c cVar, int i10, int i11, kl.e eVar, boolean z10, DanmakuContext danmakuContext) {
            boolean z11 = cVar != null && this.f61869a.contains(Integer.valueOf(cVar.getType()));
            if (z11) {
                cVar.F = 1 | cVar.F;
            }
            return z11;
        }

        public void c(Integer num) {
            if (this.f61869a.contains(num)) {
                return;
            }
            this.f61869a.add(num);
        }

        public void d() {
            this.f61869a.clear();
        }

        @Override // jl.b.e
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void a(List<Integer> list) {
            d();
            if (list != null) {
                Iterator<Integer> it = list.iterator();
                while (it.hasNext()) {
                    c(it.next());
                }
            }
        }
    }

    /* JADX INFO: compiled from: DanmakuFilters.java */
    public static abstract class k<T> extends a<List<T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List<T> f61870a = new ArrayList();

        public final void c(T t10) {
            if (this.f61870a.contains(t10)) {
                return;
            }
            this.f61870a.add(t10);
        }

        public void d() {
            this.f61870a.clear();
        }

        @Override // jl.b.e
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void a(List<T> list) {
            d();
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    c(it.next());
                }
            }
        }
    }

    /* JADX INFO: compiled from: DanmakuFilters.java */
    public static class l extends k<String> {
        @Override // jl.b.e
        public boolean b(kl.c cVar, int i10, int i11, kl.e eVar, boolean z10, DanmakuContext danmakuContext) {
            boolean z11 = cVar != null && this.f61870a.contains(cVar.B);
            if (z11) {
                cVar.F |= 32;
            }
            return z11;
        }
    }

    /* JADX INFO: compiled from: DanmakuFilters.java */
    public static class m extends k<Integer> {
        @Override // jl.b.e
        public boolean b(kl.c cVar, int i10, int i11, kl.e eVar, boolean z10, DanmakuContext danmakuContext) {
            boolean z11 = cVar != null && this.f61870a.contains(Integer.valueOf(cVar.A));
            if (z11) {
                cVar.F |= 16;
            }
            return z11;
        }
    }

    public void b(kl.c cVar, int i10, int i11, kl.e eVar, boolean z10, DanmakuContext danmakuContext) {
        for (e<?> eVar2 : this.f61853d) {
            if (eVar2 != null) {
                boolean zB = eVar2.b(cVar, i10, i11, eVar, z10, danmakuContext);
                cVar.G = danmakuContext.f64337x.f62923c;
                if (zB) {
                    return;
                }
            }
        }
    }

    public boolean c(kl.c cVar, int i10, int i11, kl.e eVar, boolean z10, DanmakuContext danmakuContext) {
        for (e<?> eVar2 : this.f61854e) {
            if (eVar2 != null) {
                boolean zB = eVar2.b(cVar, i10, i11, eVar, z10, danmakuContext);
                cVar.G = danmakuContext.f64337x.f62923c;
                if (zB) {
                    return true;
                }
            }
        }
        return false;
    }

    public e<?> e(String str) {
        return f(str, true);
    }

    public e<?> f(String str, boolean z10) {
        if (str == null) {
            g();
            return null;
        }
        e<?> gVar = this.f61851b.get(str);
        if (gVar == null) {
            if ("1010_Filter".equals(str)) {
                gVar = new j();
            } else if ("1011_Filter".equals(str)) {
                gVar = new h();
            } else if ("1012_Filter".equals(str)) {
                gVar = new c();
            } else if ("1013_Filter".equals(str)) {
                gVar = new i();
            } else if ("1014_Filter".equals(str)) {
                gVar = new m();
            } else if ("1015_Filter".equals(str)) {
                gVar = new l();
            } else if ("1016_Filter".equals(str)) {
                gVar = new d();
            } else if ("1017_Filter".equals(str)) {
                gVar = new C0554b();
            } else if ("1018_Filter".equals(str)) {
                gVar = new f();
            } else if ("1019_Filter".equals(str)) {
                gVar = new g();
            }
        }
        if (gVar == null) {
            g();
            return null;
        }
        gVar.a(null);
        if (z10) {
            this.f61851b.put(str, gVar);
            this.f61853d = (e[]) this.f61851b.values().toArray(this.f61853d);
        } else {
            this.f61852c.put(str, gVar);
            this.f61854e = (e[]) this.f61852c.values().toArray(this.f61854e);
        }
        return gVar;
    }

    public void h(String str) {
        i(str, true);
    }

    /* JADX INFO: compiled from: DanmakuFilters.java */
    public static class c extends a<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f61861a = 20;

        public final synchronized boolean c(kl.c cVar, int i10, int i11, kl.e eVar, boolean z10) {
            if (eVar != null) {
                if (cVar.r()) {
                    return ql.b.b() - eVar.f62916a >= this.f61861a;
                }
            }
            return false;
        }

        public synchronized void d() {
        }

        @Override // jl.b.e
        public void a(Object obj) {
            d();
        }

        @Override // jl.b.e
        public boolean b(kl.c cVar, int i10, int i11, kl.e eVar, boolean z10, DanmakuContext danmakuContext) {
            boolean zC = c(cVar, i10, i11, eVar, z10);
            if (zC) {
                cVar.F |= 4;
            }
            return zC;
        }

        @Override // jl.b.a, jl.b.e
        public void clear() {
            d();
        }
    }

    public void a() {
        for (e<?> eVar : this.f61853d) {
            if (eVar != null) {
                eVar.clear();
            }
        }
        for (e<?> eVar2 : this.f61854e) {
            if (eVar2 != null) {
                eVar2.clear();
            }
        }
    }

    public e<?> d(String str, boolean z10) {
        e<?> eVar = (z10 ? this.f61851b : this.f61852c).get(str);
        return eVar == null ? f(str, z10) : eVar;
    }

    public final void g() {
        try {
            throw this.f61850a;
        } catch (Exception unused) {
        }
    }

    public void i(String str, boolean z10) {
        e<?> eVarRemove = (z10 ? this.f61851b : this.f61852c).remove(str);
        if (eVarRemove != null) {
            eVarRemove.clear();
            if (z10) {
                this.f61853d = (e[]) this.f61851b.values().toArray(this.f61853d);
            } else {
                this.f61854e = (e[]) this.f61852c.values().toArray(this.f61854e);
            }
        }
    }
}
