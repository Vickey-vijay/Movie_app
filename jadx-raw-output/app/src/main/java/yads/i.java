package yads;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public abstract class i extends a0 {
    private static final long serialVersionUID = 6588350623831699109L;

    @Override // yads.e0
    public final n a() {
        n nVar = this.f76857e;
        if (nVar != null) {
            return nVar;
        }
        n nVarB = ((sx1) this).b();
        this.f76857e = nVarB;
        return nVarB;
    }

    public i(Map map) {
        super(map);
    }

    @Override // yads.e0
    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final boolean a(Object obj, Object obj2) {
        Collection collection = (Collection) this.f75344f.get(obj);
        if (collection == null) {
            List list = (List) ((sx1) this).f82825h.get();
            if (list.add(obj2)) {
                this.f75345g++;
                this.f75344f.put(obj, list);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        }
        if (!collection.add(obj2)) {
            return false;
        }
        this.f75345g++;
        return true;
    }
}
