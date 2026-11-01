package fk;

import ck.p;
import jk.k;

/* JADX INFO: compiled from: ObservableProperty.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class b<V> implements d<Object, V> {
    private V value;

    public void afterChange(k<?> kVar, V v10, V v11) {
        p.j(kVar, "property");
    }

    public boolean beforeChange(k<?> kVar, V v10, V v11) {
        p.j(kVar, "property");
        return true;
    }

    @Override // fk.d
    public V getValue(Object obj, k<?> kVar) {
        p.j(kVar, "property");
        return this.value;
    }

    @Override // fk.d
    public void setValue(Object obj, k<?> kVar, V v10) {
        p.j(kVar, "property");
        V v11 = this.value;
        if (beforeChange(kVar, v11, v10)) {
            this.value = v10;
            afterChange(kVar, v11, v10);
        }
    }

    public String toString() {
        return "ObservableProperty(value=" + this.value + ')';
    }

    public b(V v10) {
        this.value = v10;
    }
}
