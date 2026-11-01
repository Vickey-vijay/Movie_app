package un;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.fourthline.cling.model.ValidationException;
import yn.r;
import yn.s;
import yn.z;

/* JADX INFO: compiled from: LocalDevice.java */
/* JADX INFO: loaded from: classes11.dex */
public class e extends a<c, e, f> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final vn.b f72949j;

    public e(c cVar, yn.j jVar, b bVar, d[] dVarArr, f[] fVarArr) throws ValidationException {
        super(cVar, jVar, bVar, dVarArr, fVarArr);
        this.f72949j = null;
    }

    @Override // un.a
    public List<mn.k> G() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(super.G());
        if (x()) {
            for (d dVar : q()) {
                if (dVar.g().isAbsolute()) {
                    arrayList.add(new mn.k(getClass(), "icons", "Local icon URI can not be absolute: " + dVar.g()));
                }
                if (dVar.g().toString().contains("../")) {
                    arrayList.add(new mn.k(getClass(), "icons", "Local icon URI must not contain '../': " + dVar.g()));
                }
                if (dVar.g().toString().startsWith("/")) {
                    arrayList.add(new mn.k(getClass(), "icons", "Local icon URI must not start with '/': " + dVar.g()));
                }
            }
        }
        return arrayList;
    }

    public vn.b I() {
        return this.f72949j;
    }

    @Override // un.a
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public e[] p() {
        D[] dArr = this.f72926g;
        return dArr != 0 ? (e[]) dArr : new e[0];
    }

    @Override // un.a
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public f[] u() {
        S[] sArr = this.f72925f;
        return sArr != 0 ? (f[]) sArr : new f[0];
    }

    @Override // un.a
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public e B(z zVar, q qVar, yn.j jVar, b bVar, d[] dVarArr, f[] fVarArr, List<e> list) throws ValidationException {
        return new e(new c(zVar, r().a()), qVar, jVar, bVar, dVarArr, fVarArr, list.size() > 0 ? (e[]) list.toArray(new e[list.size()]) : null);
    }

    @Override // un.a
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public f C(s sVar, r rVar, URI uri, URI uri2, URI uri3, org.fourthline.cling.model.meta.a<f>[] aVarArr, m<f>[] mVarArr) throws ValidationException {
        return new f(sVar, rVar, aVarArr, mVarArr);
    }

    @Override // un.a
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public f[] D(int i10) {
        return new f[i10];
    }

    @Override // un.a
    public wn.c[] a(mn.g gVar) {
        ArrayList arrayList = new ArrayList();
        if (A()) {
            arrayList.add(new wn.a(gVar.d(this), this));
        }
        for (f fVar : u()) {
            arrayList.add(new wn.e(gVar.e(fVar), fVar));
            arrayList.add(new wn.d(gVar.c(fVar), fVar));
            arrayList.add(new wn.g(gVar.j(fVar), fVar));
        }
        for (d dVar : q()) {
            arrayList.add(new wn.b(gVar.p(this, dVar.g()), dVar));
        }
        if (w()) {
            for (e eVar : p()) {
                arrayList.addAll(Arrays.asList(eVar.a(gVar)));
            }
        }
        return (wn.c[]) arrayList.toArray(new wn.c[arrayList.size()]);
    }

    public e(c cVar, q qVar, yn.j jVar, b bVar, d[] dVarArr, f[] fVarArr, e[] eVarArr) throws ValidationException {
        super(cVar, qVar, jVar, bVar, dVarArr, fVarArr, eVarArr);
        this.f72949j = null;
    }

    @Override // un.a
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public e e(z zVar) {
        return d(zVar, this);
    }

    @Override // un.a
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public e t() {
        if (A()) {
            return this;
        }
        e eVarS = this;
        while (eVarS.s() != null) {
            eVarS = eVarS.s();
        }
        return eVarS;
    }

    @Override // un.a
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public e[] F(Collection<e> collection) {
        return (e[]) collection.toArray(new e[collection.size()]);
    }

    @Override // un.a
    public b n(vn.c cVar) {
        if (I() != null) {
            return I().a(cVar);
        }
        return m();
    }
}
