package yads;

import java.io.Serializable;

/* JADX INFO: loaded from: classes6.dex */
public final class t51 implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f82887b;

    public Object readResolve() {
        Object[] objArr = this.f82887b;
        int length = objArr.length;
        if (length != 0) {
            return length != 1 ? u51.b(objArr.length, (Object[]) objArr.clone()) : new xz2(objArr[0]);
        }
        return ym2.f85051j;
    }

    public t51(Object[] objArr) {
        this.f82887b = objArr;
    }
}
