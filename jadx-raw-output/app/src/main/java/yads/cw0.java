package yads;

import android.util.SparseBooleanArray;

/* JADX INFO: loaded from: classes3.dex */
public final class cw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseBooleanArray f76450a = new SparseBooleanArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f76451b;

    public final cw0 a(int i10) {
        if (!(!this.f76451b)) {
            throw new IllegalStateException();
        }
        this.f76450a.append(i10, true);
        return this;
    }

    public final dw0 a() {
        if (!this.f76451b) {
            this.f76451b = true;
            return new dw0(this.f76450a);
        }
        throw new IllegalStateException();
    }
}
