package un;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import org.fourthline.cling.model.ValidationException;
import org.fourthline.cling.model.meta.ActionArgument;
import org.fourthline.cling.model.types.Datatype;
import un.a;
import un.l;
import yn.r;
import yn.s;

/* JADX INFO: compiled from: Service.java */
/* JADX INFO: loaded from: classes11.dex */
public abstract class l<D extends a, S extends l> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Logger f72967f = Logger.getLogger(l.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f72968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f72969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, org.fourthline.cling.model.meta.a> f72970c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<String, m> f72971d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public D f72972e;

    public org.fourthline.cling.model.meta.a<S> a(String str) {
        Map<String, org.fourthline.cling.model.meta.a> map = this.f72970c;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    public org.fourthline.cling.model.meta.a<S>[] b() {
        Map<String, org.fourthline.cling.model.meta.a> map = this.f72970c;
        if (map == null) {
            return null;
        }
        return (org.fourthline.cling.model.meta.a[]) map.values().toArray(new org.fourthline.cling.model.meta.a[this.f72970c.values().size()]);
    }

    public D d() {
        return this.f72972e;
    }

    public r f() {
        return this.f72969b;
    }

    public s g() {
        return this.f72968a;
    }

    public m<S> h(String str) {
        if ("VirtualQueryActionInput".equals(str)) {
            return new m<>("VirtualQueryActionInput", new p(Datatype.Builtin.STRING.getDatatype()));
        }
        if ("VirtualQueryActionOutput".equals(str)) {
            return new m<>("VirtualQueryActionOutput", new p(Datatype.Builtin.STRING.getDatatype()));
        }
        Map<String, m> map = this.f72971d;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    public m<S>[] i() {
        Map<String, m> map = this.f72971d;
        if (map == null) {
            return null;
        }
        return (m[]) map.values().toArray(new m[this.f72971d.values().size()]);
    }

    public void l(D d10) {
        if (this.f72972e != null) {
            throw new IllegalStateException("Final value has been set already, model is immutable");
        }
        this.f72972e = d10;
    }

    public List<mn.k> m() {
        ArrayList arrayList = new ArrayList();
        if (g() == null) {
            arrayList.add(new mn.k(getClass(), "serviceType", "Service type/info is required"));
        }
        if (f() == null) {
            arrayList.add(new mn.k(getClass(), "serviceId", "Service ID is required"));
        }
        if (k()) {
            for (m<S> mVar : i()) {
                arrayList.addAll(mVar.g());
            }
        }
        if (j()) {
            for (org.fourthline.cling.model.meta.a<S> aVar : b()) {
                List<mn.k> listK = aVar.k();
                if (listK.size() > 0) {
                    this.f72970c.remove(aVar.d());
                    f72967f.warning("Discarding invalid action of service '" + f() + "': " + aVar.d());
                    Iterator<mn.k> it = listK.iterator();
                    while (it.hasNext()) {
                        f72967f.warning("Invalid action '" + aVar.d() + "': " + it.next());
                    }
                }
            }
        }
        return arrayList;
    }

    public String toString() {
        return "(" + getClass().getSimpleName() + ") ServiceId: " + f();
    }

    public l(s sVar, r rVar, org.fourthline.cling.model.meta.a<S>[] aVarArr, m<S>[] mVarArr) throws ValidationException {
        this.f72968a = sVar;
        this.f72969b = rVar;
        if (aVarArr != null) {
            for (org.fourthline.cling.model.meta.a<S> aVar : aVarArr) {
                this.f72970c.put(aVar.d(), aVar);
                aVar.j(this);
            }
        }
        if (mVarArr != null) {
            for (m<S> mVar : mVarArr) {
                this.f72971d.put(mVar.b(), mVar);
                mVar.f(this);
            }
        }
    }

    public Datatype<S> c(ActionArgument actionArgument) {
        return e(actionArgument).d().d();
    }

    public m<S> e(ActionArgument actionArgument) {
        return h(actionArgument.f());
    }

    public boolean j() {
        if (b() != null && b().length > 0) {
            return true;
        }
        return false;
    }

    public boolean k() {
        if (i() != null && i().length > 0) {
            return true;
        }
        return false;
    }
}
