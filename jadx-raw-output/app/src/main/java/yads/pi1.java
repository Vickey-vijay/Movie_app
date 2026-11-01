package yads;

import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public abstract class pi1 extends ky2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f81419b;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f81419b.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f81419b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f81419b.size();
    }

    public pi1(Map map) {
        this.f81419b = (Map) ng2.a(map);
    }
}
