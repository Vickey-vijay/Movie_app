package yads;

import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
public final class k51 extends b0 implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f79309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f79310c;

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f79309b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f79310c;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }

    public k51(Object obj, Object obj2) {
        this.f79309b = obj;
        this.f79310c = obj2;
    }
}
