package z1;

import ck.p;
import kotlin.Metadata;
import nj.n;

/* JADX INFO: compiled from: MTensor.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\n\u0018\u0000 \b2\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0015\u0010\u0016J\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u000bR$\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\t\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0013¨\u0006\u0017"}, d2 = {"Lz1/a;", "", "", "i", "b", "", "shape", "Lmj/r;", "d", "a", "[I", "I", "capacity", "", "<set-?>", "c", "[F", "()[F", "data", "()I", "shapeSize", "<init>", "([I)V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public int[] shape;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public int capacity;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public float[] data;

    /* JADX INFO: renamed from: z1.a$a, reason: collision with other inner class name and from kotlin metadata */
    /* JADX INFO: compiled from: MTensor.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¨\u0006\b"}, d2 = {"Lz1/a$a;", "", "", "shape", "", "b", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(ck.i iVar) {
            this();
        }

        public final int b(int[] shape) {
            int i10 = 1;
            if (shape.length == 0) {
                throw new UnsupportedOperationException("Empty array can't be reduced.");
            }
            int i11 = shape[0];
            int iO = n.O(shape);
            if (1 <= iO) {
                while (true) {
                    i11 *= shape[i10];
                    if (i10 == iO) {
                        break;
                    }
                    i10++;
                }
            }
            return i11;
        }
    }

    public a(int[] iArr) {
        p.j(iArr, "shape");
        this.shape = iArr;
        int iB = INSTANCE.b(iArr);
        this.capacity = iB;
        this.data = new float[iB];
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final float[] getData() {
        return this.data;
    }

    public final int b(int i10) {
        return this.shape[i10];
    }

    public final int c() {
        return this.shape.length;
    }

    public final void d(int[] iArr) {
        p.j(iArr, "shape");
        this.shape = iArr;
        int iB = INSTANCE.b(iArr);
        float[] fArr = new float[iB];
        System.arraycopy(this.data, 0, fArr, 0, Math.min(this.capacity, iB));
        this.data = fArr;
        this.capacity = iB;
    }
}
