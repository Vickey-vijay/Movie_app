package un;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.fourthline.cling.model.ValidationException;
import yn.r;
import yn.s;

/* JADX INFO: compiled from: LocalService.java */
/* JADX INFO: loaded from: classes11.dex */
public class f<T> extends l<e, f> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map<org.fourthline.cling.model.meta.a, nn.c> f72950g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map<m, xn.c> f72951h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Set<Class> f72952i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f72953j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public mn.j f72954k;

    public f(s sVar, r rVar, org.fourthline.cling.model.meta.a[] aVarArr, m[] mVarArr) throws ValidationException {
        super(sVar, rVar, aVarArr, mVarArr);
        this.f72954k = null;
        this.f72950g = new HashMap();
        this.f72951h = new HashMap();
        this.f72952i = new HashSet();
        this.f72953j = true;
    }

    public synchronized mn.j<T> q() {
        mn.j<T> jVar;
        jVar = this.f72954k;
        if (jVar == null) {
            throw new IllegalStateException("Unmanaged service, no implementation instance available");
        }
        return jVar;
    }

    public synchronized void v(mn.j<T> jVar) {
        if (this.f72954k != null) {
            throw new IllegalStateException("Manager is final");
        }
        this.f72954k = jVar;
    }

    public xn.c o(m mVar) {
        return this.f72951h.get(mVar);
    }

    public nn.c p(org.fourthline.cling.model.meta.a aVar) {
        return this.f72950g.get(aVar);
    }

    public Set<Class> r() {
        return this.f72952i;
    }

    public boolean t(Object obj) {
        return obj != null && s(obj.getClass());
    }

    @Override // un.l
    public String toString() {
        return super.toString() + ", Manager: " + this.f72954k;
    }

    public boolean u() {
        return this.f72953j;
    }

    public xn.c n(String str) {
        m<f> mVarH = h(str);
        if (mVarH != null) {
            return o(mVarH);
        }
        return null;
    }

    public boolean s(Class cls) {
        return mn.f.e(r(), cls);
    }

    public f(s sVar, r rVar, Map<org.fourthline.cling.model.meta.a, nn.c> map, Map<m, xn.c> map2, Set<Class> set, boolean z10) throws ValidationException {
        super(sVar, rVar, (org.fourthline.cling.model.meta.a[]) map.keySet().toArray(new org.fourthline.cling.model.meta.a[map.size()]), (m[]) map2.keySet().toArray(new m[map2.size()]));
        this.f72953j = z10;
        this.f72952i = set;
        this.f72951h = map2;
        this.f72950g = map;
    }
}
