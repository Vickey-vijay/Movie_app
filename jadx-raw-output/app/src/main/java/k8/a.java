package k8;

import java.util.LinkedList;

/* JADX INFO: compiled from: ObjectPools.java */
/* JADX INFO: loaded from: classes9.dex */
public class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedList<T> f62649a = new LinkedList<>();

    public T a() {
        return this.f62649a.poll();
    }

    public void b() {
        this.f62649a.clear();
    }

    public final boolean c(T t10) {
        return this.f62649a.contains(t10);
    }

    public boolean d(T t10) {
        if (c(t10)) {
            return false;
        }
        return this.f62649a.add(t10);
    }
}
