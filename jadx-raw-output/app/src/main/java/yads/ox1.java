package yads;

import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class ox1 implements y43, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f81172b;

    @Override // yads.y43
    public final Object get() {
        return new ArrayList(this.f81172b);
    }

    public ox1(int i10) {
        this.f81172b = kx.a(i10, "expectedValuesPerKey");
    }
}
