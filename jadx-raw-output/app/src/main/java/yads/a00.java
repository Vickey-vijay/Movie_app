package yads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class a00 implements Iterable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f75346b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f75347c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Set f75348d = Collections.emptySet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f75349e = Collections.emptyList();

    public final int a(Object obj) {
        int iIntValue;
        synchronized (this.f75346b) {
            iIntValue = this.f75347c.containsKey(obj) ? ((Integer) this.f75347c.get(obj)).intValue() : 0;
        }
        return iIntValue;
    }

    public final void b(Object obj) {
        synchronized (this.f75346b) {
            Integer num = (Integer) this.f75347c.get(obj);
            if (num == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.f75349e);
            arrayList.remove(obj);
            this.f75349e = Collections.unmodifiableList(arrayList);
            if (num.intValue() == 1) {
                this.f75347c.remove(obj);
                HashSet hashSet = new HashSet(this.f75348d);
                hashSet.remove(obj);
                this.f75348d = Collections.unmodifiableSet(hashSet);
            } else {
                this.f75347c.put(obj, Integer.valueOf(num.intValue() - 1));
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator it;
        synchronized (this.f75346b) {
            it = this.f75349e.iterator();
        }
        return it;
    }
}
