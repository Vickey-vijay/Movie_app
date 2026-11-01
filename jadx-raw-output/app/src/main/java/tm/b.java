package tm;

import java.io.IOException;
import org.eclipse.jetty.util.LazyList;
import rm.i;
import rm.j;
import xm.p;

/* JADX INFO: compiled from: AbstractHandlerContainer.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class b extends a implements j {
    @Override // rm.j
    public i[] V(Class<?> cls) {
        return (i[]) LazyList.toArray(x0(null, cls), cls);
    }

    @Override // rm.j
    public i[] r() {
        return (i[]) LazyList.toArray(x0(null, null), i.class);
    }

    public Object x0(Object obj, Class<?> cls) {
        return obj;
    }

    public <T extends i> T z0(Class<T> cls) {
        Object objX0 = x0(null, cls);
        if (objX0 == null) {
            return null;
        }
        return (T) LazyList.get(objX0, 0);
    }

    public Object y0(i iVar, Object obj, Class<i> cls) {
        if (iVar == null) {
            return obj;
        }
        if (cls == null || cls.isAssignableFrom(iVar.getClass())) {
            obj = LazyList.add(obj, iVar);
        }
        if (iVar instanceof b) {
            return ((b) iVar).x0(obj, cls);
        }
        if (!(iVar instanceof j)) {
            return obj;
        }
        j jVar = (j) iVar;
        return LazyList.addArray(obj, cls == null ? jVar.r() : jVar.V(cls));
    }

    @Override // ym.b, ym.e
    public void z(Appendable appendable, String str) throws IOException {
        s0(appendable);
        ym.b.p0(appendable, str, u0(), p.a(P()));
    }
}
