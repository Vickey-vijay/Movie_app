package un;

import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.fourthline.cling.model.ValidationException;
import org.seamless.util.URIUtil;
import yn.r;
import yn.s;
import yn.z;

/* JADX INFO: compiled from: RemoteDevice.java */
/* JADX INFO: loaded from: classes11.dex */
public class i extends a<j, i, k> {
    public i(j jVar) throws ValidationException {
        super(jVar);
    }

    public i(j jVar, q qVar, yn.j jVar2, b bVar, d[] dVarArr, k[] kVarArr, i[] iVarArr) throws ValidationException {
        super(jVar, qVar, jVar2, bVar, dVarArr, kVarArr, iVarArr);
    }

    @Override // un.a
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public i[] p() {
        D[] dArr = this.f72926g;
        return dArr != 0 ? (i[]) dArr : new i[0];
    }

    @Override // un.a
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public k[] u() {
        S[] sArr = this.f72925f;
        return sArr != 0 ? (k[]) sArr : new k[0];
    }

    @Override // un.a
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public i B(z zVar, q qVar, yn.j jVar, b bVar, d[] dVarArr, k[] kVarArr, List<i> list) throws ValidationException {
        return new i(new j(zVar, r()), qVar, jVar, bVar, dVarArr, kVarArr, list.size() > 0 ? (i[]) list.toArray(new i[list.size()]) : null);
    }

    @Override // un.a
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public k C(s sVar, r rVar, URI uri, URI uri2, URI uri3, org.fourthline.cling.model.meta.a<k>[] aVarArr, m<k>[] mVarArr) throws ValidationException {
        return new k(sVar, rVar, uri, uri2, uri3, aVarArr, mVarArr);
    }

    @Override // un.a
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public k[] D(int i10) {
        return new k[i10];
    }

    @Override // un.a
    public wn.c[] a(mn.g gVar) {
        ArrayList arrayList = new ArrayList();
        for (k kVar : u()) {
            if (kVar != null) {
                arrayList.add(new wn.f(gVar.h(kVar), kVar));
            }
        }
        if (w()) {
            for (i iVar : p()) {
                if (iVar != null) {
                    arrayList.addAll(Arrays.asList(iVar.a(gVar)));
                }
            }
        }
        return (wn.c[]) arrayList.toArray(new wn.c[arrayList.size()]);
    }

    @Override // un.a
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public i e(z zVar) {
        return d(zVar, this);
    }

    @Override // un.a
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public i t() {
        if (A()) {
            return this;
        }
        i iVarS = this;
        while (iVarS.s() != null) {
            iVarS = iVarS.s();
        }
        return iVarS;
    }

    public URL O(URI uri) {
        if (m() != null && m().a() != null) {
            return URIUtil.b(m().a(), uri);
        }
        return URIUtil.b(r().d(), uri);
    }

    @Override // un.a
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public i[] F(Collection<i> collection) {
        return (i[]) collection.toArray(new i[collection.size()]);
    }

    public k[] Q(Collection<k> collection) {
        return (k[]) collection.toArray(new k[collection.size()]);
    }
}
