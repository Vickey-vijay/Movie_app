package yads;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class n51 implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f80562b;

    public Object readResolve() {
        return p51.b(this.f80562b);
    }

    public n51(Object[] objArr) {
        this.f80562b = objArr;
    }
}
