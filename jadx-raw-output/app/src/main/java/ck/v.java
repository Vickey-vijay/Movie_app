package ck;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: compiled from: SpreadBuilder.java */
/* JADX INFO: loaded from: classes6.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<Object> f6065a;

    public void a(Object obj) {
        this.f6065a.add(obj);
    }

    public void b(Object obj) {
        if (obj == null) {
            return;
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                ArrayList<Object> arrayList = this.f6065a;
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(this.f6065a, objArr);
                return;
            }
            return;
        }
        if (obj instanceof Collection) {
            this.f6065a.addAll((Collection) obj);
            return;
        }
        if (obj instanceof Iterable) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                this.f6065a.add(it.next());
            }
            return;
        }
        if (obj instanceof Iterator) {
            Iterator it2 = (Iterator) obj;
            while (it2.hasNext()) {
                this.f6065a.add(it2.next());
            }
        } else {
            throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
        }
    }

    public int c() {
        return this.f6065a.size();
    }

    public Object[] d(Object[] objArr) {
        return this.f6065a.toArray(objArr);
    }

    public v(int i10) {
        this.f6065a = new ArrayList<>(i10);
    }
}
