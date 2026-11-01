package mm;

import com.ironsource.C3426d4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.jetty.util.StringMap;

/* JADX INFO: compiled from: BufferCache.java */
/* JADX INFO: loaded from: classes5.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f64596a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StringMap f64597b = new StringMap(true);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f64598c = new ArrayList();

    /* JADX INFO: compiled from: BufferCache.java */
    public static class a extends h.a {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final int f64599p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public HashMap f64600q;

        public a d(Object obj) {
            HashMap map = this.f64600q;
            if (map == null) {
                return null;
            }
            return (a) map.get(obj);
        }

        public int e() {
            return this.f64599p;
        }

        public void f(Object obj, a aVar) {
            if (this.f64600q == null) {
                this.f64600q = new HashMap();
            }
            this.f64600q.put(obj, aVar);
        }

        public a(String str, int i10) {
            super(str);
            this.f64600q = null;
            this.f64599p = i10;
        }
    }

    public a a(String str, int i10) {
        a aVar = new a(str, i10);
        this.f64596a.put(aVar, aVar);
        this.f64597b.put(str, (Object) aVar);
        while (i10 - this.f64598c.size() >= 0) {
            this.f64598c.add(null);
        }
        if (this.f64598c.get(i10) == null) {
            this.f64598c.add(i10, aVar);
        }
        return aVar;
    }

    public a b(String str) {
        return (a) this.f64597b.get(str);
    }

    public a c(d dVar) {
        return (a) this.f64596a.get(dVar);
    }

    public a d(byte[] bArr, int i10, int i11) {
        Map.Entry bestEntry = this.f64597b.getBestEntry(bArr, i10, i11);
        if (bestEntry != null) {
            return (a) bestEntry.getValue();
        }
        return null;
    }

    public int e(String str) {
        a aVar = (a) this.f64597b.get(str);
        if (aVar == null) {
            return -1;
        }
        return aVar.e();
    }

    public int f(d dVar) {
        if (dVar instanceof a) {
            return ((a) dVar).e();
        }
        d dVarH = h(dVar);
        if (dVarH == null || !(dVarH instanceof a)) {
            return -1;
        }
        return ((a) dVarH).e();
    }

    public d h(d dVar) {
        if (dVar instanceof a) {
            return dVar;
        }
        a aVarC = c(dVar);
        if (aVarC == null) {
            return dVar instanceof d.a ? dVar : new h.a(dVar.H(), 0, dVar.length(), 0);
        }
        return aVarC;
    }

    public String toString() {
        return "CACHE[bufferMap=" + this.f64596a + ",stringMap=" + this.f64597b + ",index=" + this.f64598c + C3426d4.j.f28588e;
    }

    public d g(String str) {
        a aVarB = b(str);
        if (aVarB == null) {
            return new a(str, -1);
        }
        return aVarB;
    }
}
