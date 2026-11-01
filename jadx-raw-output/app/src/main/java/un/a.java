package un;

import com.ironsource.Z7;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.fourthline.cling.model.ValidationException;
import un.a;
import un.c;
import un.l;
import yn.r;
import yn.s;
import yn.z;

/* JADX INFO: compiled from: Device.java */
/* JADX INFO: loaded from: classes11.dex */
public abstract class a<DI extends c, D extends a, S extends l> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Logger f72919i = Logger.getLogger(a.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DI f72920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f72921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yn.j f72922c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f72923d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d[] f72924e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final S[] f72925f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final D[] f72926g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public D f72927h;

    public a(DI di2) throws ValidationException {
        this(di2, null, null, null, null, null);
    }

    public abstract D B(z zVar, q qVar, yn.j jVar, b bVar, d[] dVarArr, S[] sArr, List<D> list) throws ValidationException;

    public abstract S C(s sVar, r rVar, URI uri, URI uri2, URI uri3, org.fourthline.cling.model.meta.a<S>[] aVarArr, m<S>[] mVarArr) throws ValidationException;

    public abstract S[] D(int i10);

    public abstract D[] F(Collection<D> collection);

    public abstract wn.c[] a(mn.g gVar);

    public Collection<D> c(s sVar, D d10) {
        Collection<S> collectionL = l(sVar, null, d10);
        HashSet hashSet = new HashSet();
        Iterator<S> it = collectionL.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().d());
        }
        return hashSet;
    }

    public abstract D e(z zVar);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f72920a.equals(((a) obj).f72920a);
    }

    public S j(s sVar) {
        Collection<S> collectionL = l(sVar, null, this);
        if (collectionL.size() > 0) {
            return collectionL.iterator().next();
        }
        return null;
    }

    public s[] k() {
        Collection<S> collectionL = l(null, null, this);
        HashSet hashSet = new HashSet();
        Iterator<S> it = collectionL.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().g());
        }
        return (s[]) hashSet.toArray(new s[hashSet.size()]);
    }

    public abstract D[] p();

    public abstract D t();

    public abstract S[] u();

    public final boolean z(l lVar, s sVar, r rVar) {
        return (sVar == null || lVar.g().c(sVar)) && (rVar == null || lVar.f().equals(rVar));
    }

    public a(DI di2, yn.j jVar, b bVar, d[] dVarArr, S[] sArr) throws ValidationException {
        this(di2, null, jVar, bVar, dVarArr, sArr, null);
    }

    public void E(D d10) {
        if (this.f72927h != null) {
            throw new IllegalStateException("Final value has been set already, model is immutable");
        }
        this.f72927h = d10;
    }

    public List<mn.k> G() {
        ArrayList arrayList = new ArrayList();
        if (getType() != null) {
            arrayList.addAll(v().c());
            if (r() != null) {
                arrayList.addAll(r().c());
            }
            if (m() != null) {
                arrayList.addAll(m().k());
            }
            if (y()) {
                for (l lVar : u()) {
                    if (lVar != null) {
                        arrayList.addAll(lVar.m());
                    }
                }
            }
            if (w()) {
                for (a aVar : p()) {
                    if (aVar != null) {
                        arrayList.addAll(aVar.G());
                    }
                }
            }
        }
        return arrayList;
    }

    public Collection<D> b(yn.j jVar, D d10) {
        HashSet hashSet = new HashSet();
        if (d10.getType() != null && d10.getType().c(jVar)) {
            hashSet.add(d10);
        }
        if (d10.w()) {
            for (a aVar : d10.p()) {
                hashSet.addAll(b(jVar, aVar));
            }
        }
        return hashSet;
    }

    public yn.j getType() {
        return this.f72922c;
    }

    public Collection<D> h(D d10) {
        HashSet hashSet = new HashSet();
        if (!d10.A() && d10.r().b() != null) {
            hashSet.add(d10);
        }
        if (d10.w()) {
            for (a aVar : d10.p()) {
                hashSet.addAll(h(aVar));
            }
        }
        return hashSet;
    }

    public int hashCode() {
        return this.f72920a.hashCode();
    }

    public Collection<S> l(s sVar, r rVar, D d10) {
        HashSet hashSet = new HashSet();
        if (d10.y()) {
            for (l lVar : d10.u()) {
                if (z(lVar, sVar, rVar)) {
                    hashSet.add(lVar);
                }
            }
        }
        Collection<D> collectionH = h(d10);
        if (collectionH != null) {
            for (D d11 : collectionH) {
                if (d11.y()) {
                    for (l lVar2 : d11.u()) {
                        if (z(lVar2, sVar, rVar)) {
                            hashSet.add(lVar2);
                        }
                    }
                }
            }
        }
        return hashSet;
    }

    public b m() {
        return this.f72923d;
    }

    public d[] q() {
        return this.f72924e;
    }

    public DI r() {
        return this.f72920a;
    }

    public D s() {
        return this.f72927h;
    }

    public String toString() {
        return "(" + getClass().getSimpleName() + ") Identity: " + r().toString() + ", Root: " + A();
    }

    public q v() {
        return this.f72921b;
    }

    public a(DI di2, yn.j jVar, b bVar, d[] dVarArr, S[] sArr, D[] dArr) throws ValidationException {
        this(di2, null, jVar, bVar, dVarArr, sArr, dArr);
    }

    public boolean A() {
        if (s() == null) {
            return true;
        }
        return false;
    }

    public D d(z zVar, D d10) {
        if (d10.r() != null && d10.r().b() != null && d10.r().b().equals(zVar)) {
            return d10;
        }
        if (d10.w()) {
            for (a aVar : d10.p()) {
                D d11 = (D) d(zVar, aVar);
                if (d11 != null) {
                    return d11;
                }
            }
            return null;
        }
        return null;
    }

    public D[] f(yn.j jVar) {
        return (D[]) F(b(jVar, this));
    }

    public D[] g(s sVar) {
        return (D[]) F(c(sVar, this));
    }

    public D[] i() {
        return (D[]) F(h(this));
    }

    public b n(vn.c cVar) {
        return m();
    }

    public String o() {
        String strC;
        String str;
        String strTrim = null;
        String str2 = "";
        if (m() != null && m().f() != null) {
            h hVarF = m().f();
            if (hVarF.b() != null) {
                if (hVarF.c() != null && hVarF.b().endsWith(hVarF.c())) {
                    strTrim = hVarF.b().substring(0, hVarF.b().length() - hVarF.c().length());
                } else {
                    strTrim = hVarF.b();
                }
            }
            if (strTrim != null) {
                if (hVarF.c() == null || strTrim.startsWith(hVarF.c())) {
                    strC = "";
                } else {
                    strC = hVarF.c();
                }
            } else {
                strC = hVarF.c();
            }
        } else {
            strC = null;
        }
        StringBuilder sb2 = new StringBuilder();
        if (m() != null && m().e() != null) {
            if (strTrim != null && m().e().a() != null) {
                if (strTrim.startsWith(m().e().a())) {
                    strTrim = strTrim.substring(m().e().a().length()).trim();
                } else {
                    strTrim = strTrim.trim();
                }
            }
            if (m().e().a() != null) {
                sb2.append(m().e().a());
            }
        }
        if (strTrim == null || strTrim.length() <= 0) {
            str = "";
        } else {
            str = Z7.f27998r + strTrim;
        }
        sb2.append(str);
        if (strC != null && strC.length() > 0) {
            str2 = Z7.f27998r + strC.trim();
        }
        sb2.append(str2);
        return sb2.toString();
    }

    public boolean w() {
        if (p() != null && p().length > 0) {
            return true;
        }
        return false;
    }

    public boolean x() {
        if (q() != null && q().length > 0) {
            return true;
        }
        return false;
    }

    public boolean y() {
        if (u() != null && u().length > 0) {
            return true;
        }
        return false;
    }

    public a(DI di2, q qVar, yn.j jVar, b bVar, d[] dVarArr, S[] sArr, D[] dArr) throws ValidationException {
        boolean z10;
        this.f72920a = di2;
        this.f72921b = qVar == null ? new q() : qVar;
        this.f72922c = jVar;
        this.f72923d = bVar;
        ArrayList arrayList = new ArrayList();
        if (dVarArr != null) {
            for (d dVar : dVarArr) {
                if (dVar != null) {
                    dVar.i(this);
                    List<mn.k> listJ = dVar.j();
                    if (listJ.isEmpty()) {
                        arrayList.add(dVar);
                    } else {
                        f72919i.warning("Discarding invalid '" + dVar + "': " + listJ);
                    }
                }
            }
        }
        this.f72924e = (d[]) arrayList.toArray(new d[arrayList.size()]);
        boolean z11 = true;
        if (sArr != null) {
            z10 = true;
            for (S s10 : sArr) {
                if (s10 != null) {
                    s10.l(this);
                    z10 = false;
                }
            }
        } else {
            z10 = true;
        }
        this.f72925f = (sArr == null || z10) ? null : sArr;
        if (dArr != null) {
            for (D d10 : dArr) {
                if (d10 != null) {
                    d10.E(this);
                    z11 = false;
                }
            }
        }
        this.f72926g = (dArr == null || z11) ? null : dArr;
        List<mn.k> listG = G();
        if (listG.size() > 0) {
            if (f72919i.isLoggable(Level.FINEST)) {
                Iterator<mn.k> it = listG.iterator();
                while (it.hasNext()) {
                    f72919i.finest(it.next().toString());
                }
            }
            throw new ValidationException("Validation of device graph failed, call getErrors() on exception", listG);
        }
    }
}
