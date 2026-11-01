package ho;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: Event.java */
/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<j> f53999a = new ArrayList();

    public List<j> a() {
        return this.f53999a;
    }

    public boolean b() {
        Iterator<j> it = this.f53999a.iterator();
        while (it.hasNext()) {
            if (it.next().b().size() > 0) {
                return true;
            }
        }
        return false;
    }

    public void c(org.fourthline.cling.model.types.b bVar, b bVar2) {
        j jVar = null;
        for (j jVar2 : a()) {
            if (jVar2.a().equals(bVar)) {
                jVar = jVar2;
            }
        }
        if (jVar == null) {
            jVar = new j(bVar);
            a().add(jVar);
        }
        Iterator<b> it = jVar.b().iterator();
        while (it.hasNext()) {
            if (it.next().getClass().equals(bVar2.getClass())) {
                it.remove();
            }
        }
        jVar.b().add(bVar2);
    }
}
