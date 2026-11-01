package ho;

import ho.m;
import java.util.ArrayList;
import java.util.Collection;
import org.fourthline.cling.support.lastchange.LastChangeParser;

/* JADX INFO: compiled from: LastChangeAwareServiceManager.java */
/* JADX INFO: loaded from: classes2.dex */
public class l<T extends m> extends mn.b<T> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LastChangeParser f54006g;

    public l(un.f<T> fVar, LastChangeParser lastChangeParser) {
        this(fVar, null, lastChangeParser);
    }

    public l(un.f<T> fVar, Class<T> cls, LastChangeParser lastChangeParser) {
        super(fVar, cls);
        this.f54006g = lastChangeParser;
    }

    @Override // mn.b
    public Collection<xn.d> l() throws Exception {
        k kVar = new k(n());
        org.fourthline.cling.model.types.b[] bVarArrA = getImplementation().a();
        if (bVarArrA.length > 0) {
            for (org.fourthline.cling.model.types.b bVar : bVarArrA) {
                getImplementation().b(kVar, bVar);
            }
        } else {
            getImplementation().b(kVar, new org.fourthline.cling.model.types.b(0L));
        }
        un.m<un.f> mVarH = i().h("LastChange");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new xn.d(mVarH, kVar.toString()));
        return arrayList;
    }

    public LastChangeParser n() {
        return this.f54006g;
    }
}
