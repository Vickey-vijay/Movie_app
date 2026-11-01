package yads;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes11.dex */
public final class vj extends xj {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f83937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f83938c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f83939d;

    public final vj b(int i10) {
        int size = this.f83939d.size();
        for (int i11 = 0; i11 < size; i11++) {
            vj vjVar = (vj) this.f83939d.get(i11);
            if (vjVar.f84603a == i10) {
                return vjVar;
            }
        }
        return null;
    }

    public final wj c(int i10) {
        int size = this.f83938c.size();
        for (int i11 = 0; i11 < size; i11++) {
            wj wjVar = (wj) this.f83938c.get(i11);
            if (wjVar.f84603a == i10) {
                return wjVar;
            }
        }
        return null;
    }

    @Override // yads.xj
    public final String toString() {
        return xj.a(this.f84603a) + " leaves: " + Arrays.toString(this.f83938c.toArray()) + " containers: " + Arrays.toString(this.f83939d.toArray());
    }

    public vj(int i10, long j10) {
        super(i10);
        this.f83937b = j10;
        this.f83938c = new ArrayList();
        this.f83939d = new ArrayList();
    }
}
