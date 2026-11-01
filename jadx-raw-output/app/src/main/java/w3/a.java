package w3;

import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import g5.t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: Atom.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f73342a;

    /* JADX INFO: renamed from: w3.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Atom.java */
    public static final class C0773a extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f73343b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<b> f73344c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List<C0773a> f73345d;

        public void d(C0773a c0773a) {
            this.f73345d.add(c0773a);
        }

        public void e(b bVar) {
            this.f73344c.add(bVar);
        }

        @Nullable
        public C0773a f(int i10) {
            int size = this.f73345d.size();
            for (int i11 = 0; i11 < size; i11++) {
                C0773a c0773a = this.f73345d.get(i11);
                if (c0773a.f73342a == i10) {
                    return c0773a;
                }
            }
            return null;
        }

        @Nullable
        public b g(int i10) {
            int size = this.f73344c.size();
            for (int i11 = 0; i11 < size; i11++) {
                b bVar = this.f73344c.get(i11);
                if (bVar.f73342a == i10) {
                    return bVar;
                }
            }
            return null;
        }

        @Override // w3.a
        public String toString() {
            return a.a(this.f73342a) + " leaves: " + Arrays.toString(this.f73344c.toArray()) + " containers: " + Arrays.toString(this.f73345d.toArray());
        }

        public C0773a(int i10, long j10) {
            super(i10);
            this.f73343b = j10;
            this.f73344c = new ArrayList();
            this.f73345d = new ArrayList();
        }
    }

    public static int b(int i10) {
        return i10 & ViewCompat.MEASURED_SIZE_MASK;
    }

    public static int c(int i10) {
        return (i10 >> 24) & 255;
    }

    /* JADX INFO: compiled from: Atom.java */
    public static final class b extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final t f73346b;

        public b(int i10, t tVar) {
            super(i10);
            this.f73346b = tVar;
        }
    }

    public static String a(int i10) {
        return "" + ((char) ((i10 >> 24) & 255)) + ((char) ((i10 >> 16) & 255)) + ((char) ((i10 >> 8) & 255)) + ((char) (i10 & 255));
    }

    public String toString() {
        return a(this.f73342a);
    }

    public a(int i10) {
        this.f73342a = i10;
    }
}
