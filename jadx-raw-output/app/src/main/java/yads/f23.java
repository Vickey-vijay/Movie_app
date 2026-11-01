package yads;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes2.dex */
public final class f23 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final iz f77283c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray f77282b = new SparseArray();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f77281a = -1;

    public final void b(int i10) {
        int i11 = 0;
        while (i11 < this.f77282b.size() - 1) {
            int i12 = i11 + 1;
            if (i10 < this.f77282b.keyAt(i12)) {
                return;
            }
            this.f77283c.accept(this.f77282b.valueAt(i11));
            this.f77282b.removeAt(i11);
            int i13 = this.f77281a;
            if (i13 > 0) {
                this.f77281a = i13 - 1;
            }
            i11 = i12;
        }
    }

    public final void a(int i10) {
        for (int size = this.f77282b.size() - 1; size >= 0 && i10 < this.f77282b.keyAt(size); size--) {
            this.f77283c.accept(this.f77282b.valueAt(size));
            this.f77282b.removeAt(size);
        }
        this.f77281a = this.f77282b.size() > 0 ? Math.min(this.f77281a, this.f77282b.size() - 1) : -1;
    }

    public final Object c(int i10) {
        if (this.f77281a == -1) {
            this.f77281a = 0;
        }
        while (true) {
            int i11 = this.f77281a;
            if (i11 <= 0 || i10 >= this.f77282b.keyAt(i11)) {
                break;
            }
            this.f77281a--;
        }
        while (this.f77281a < this.f77282b.size() - 1 && i10 >= this.f77282b.keyAt(this.f77281a + 1)) {
            this.f77281a++;
        }
        return this.f77282b.valueAt(this.f77281a);
    }

    public f23(iz izVar) {
        this.f77283c = izVar;
    }
}
