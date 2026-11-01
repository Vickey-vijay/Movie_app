package sg.bigo.ads.common.w;

import android.graphics.Color;
import android.util.TimingLogger;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes6.dex */
@RequiresApi(api = 19)
final class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Comparator<C0720a> f70253g = new Comparator<C0720a>() { // from class: sg.bigo.ads.common.w.a.1
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(C0720a c0720a, C0720a c0720a2) {
            return c0720a2.a() - c0720a.a();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f70254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f70255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<c.C0722c> f70256c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c.b[] f70258e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float[] f70259f = new float[3];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final TimingLogger f70257d = null;

    /* JADX INFO: renamed from: sg.bigo.ads.common.w.a$a, reason: collision with other inner class name */
    public class C0720a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f70260a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f70262c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f70263d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f70264e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f70265f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f70266g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f70267h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f70268i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f70269j;

        public C0720a(int i10, int i11) {
            this.f70262c = i10;
            this.f70260a = i11;
            c();
        }

        private int f() {
            return (this.f70260a + 1) - this.f70262c;
        }

        public final int a() {
            return ((this.f70265f - this.f70264e) + 1) * ((this.f70267h - this.f70266g) + 1) * ((this.f70269j - this.f70268i) + 1);
        }

        public final boolean b() {
            return f() > 1;
        }

        public final void c() {
            a aVar = a.this;
            int[] iArr = aVar.f70254a;
            int[] iArr2 = aVar.f70255b;
            int i10 = Integer.MAX_VALUE;
            int i11 = Integer.MIN_VALUE;
            int i12 = Integer.MIN_VALUE;
            int i13 = Integer.MIN_VALUE;
            int i14 = 0;
            int i15 = Integer.MAX_VALUE;
            int i16 = Integer.MAX_VALUE;
            for (int i17 = this.f70262c; i17 <= this.f70260a; i17++) {
                int i18 = iArr[i17];
                i14 += iArr2[i18];
                int iA = a.a(i18);
                int iB = a.b(i18);
                int iC = a.c(i18);
                if (iA > i11) {
                    i11 = iA;
                }
                if (iA < i10) {
                    i10 = iA;
                }
                if (iB > i12) {
                    i12 = iB;
                }
                if (iB < i15) {
                    i15 = iB;
                }
                if (iC > i13) {
                    i13 = iC;
                }
                if (iC < i16) {
                    i16 = iC;
                }
            }
            this.f70264e = i10;
            this.f70265f = i11;
            this.f70266g = i15;
            this.f70267h = i12;
            this.f70268i = i16;
            this.f70269j = i13;
            this.f70263d = i14;
        }

        public final int d() {
            int i10;
            int i11 = this.f70265f - this.f70264e;
            int i12 = this.f70267h - this.f70266g;
            int i13 = this.f70269j - this.f70268i;
            if (i11 < i12 || i11 < i13) {
                i10 = (i12 < i11 || i12 < i13) ? -1 : -2;
            } else {
                i10 = -3;
            }
            a aVar = a.this;
            int[] iArr = aVar.f70254a;
            int[] iArr2 = aVar.f70255b;
            a.a(iArr, i10, this.f70262c, this.f70260a);
            Arrays.sort(iArr, this.f70262c, this.f70260a + 1);
            a.a(iArr, i10, this.f70262c, this.f70260a);
            int i14 = this.f70263d / 2;
            int i15 = this.f70262c;
            int i16 = 0;
            while (true) {
                int i17 = this.f70260a;
                if (i15 > i17) {
                    return this.f70262c;
                }
                i16 += iArr2[iArr[i15]];
                if (i16 >= i14) {
                    return Math.min(i17 - 1, i15);
                }
                i15++;
            }
        }

        public final c.C0722c e() {
            a aVar = a.this;
            int[] iArr = aVar.f70254a;
            int[] iArr2 = aVar.f70255b;
            int i10 = 0;
            int iA = 0;
            int iB = 0;
            int iC = 0;
            for (int i11 = this.f70262c; i11 <= this.f70260a; i11++) {
                int i12 = iArr[i11];
                int i13 = iArr2[i12];
                i10 += i13;
                iA += a.a(i12) * i13;
                iB += a.b(i12) * i13;
                iC += i13 * a.c(i12);
            }
            if (i10 == 0) {
                return new c.C0722c(a.a(0, 0, 0), i10);
            }
            float f10 = i10;
            return new c.C0722c(a.a(Math.round(iA / f10), Math.round(iB / f10), Math.round(iC / f10)), i10);
        }
    }

    public a(int[] iArr, int i10, c.b[] bVarArr) {
        this.f70258e = bVarArr;
        int[] iArr2 = new int[32768];
        this.f70255b = iArr2;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            int i12 = iArr[i11];
            int iB = b(Color.blue(i12), 8, 5) | (b(Color.red(i12), 8, 5) << 10) | (b(Color.green(i12), 8, 5) << 5);
            iArr[i11] = iB;
            iArr2[iB] = iArr2[iB] + 1;
        }
        int i13 = 0;
        for (int i14 = 0; i14 < 32768; i14++) {
            if (iArr2[i14] > 0) {
                b.a(d(i14), this.f70259f);
                if (a(this.f70259f)) {
                    iArr2[i14] = 0;
                }
            }
            if (iArr2[i14] > 0) {
                i13++;
            }
        }
        int[] iArr3 = new int[i13];
        this.f70254a = iArr3;
        int i15 = 0;
        for (int i16 = 0; i16 < 32768; i16++) {
            if (iArr2[i16] > 0) {
                iArr3[i15] = i16;
                i15++;
            }
        }
        if (i13 > i10) {
            PriorityQueue priorityQueue = new PriorityQueue(i10, f70253g);
            priorityQueue.offer(new C0720a(0, this.f70254a.length - 1));
            a(priorityQueue, i10);
            this.f70256c = a(priorityQueue);
            return;
        }
        this.f70256c = new ArrayList();
        for (int i17 = 0; i17 < i13; i17++) {
            int i18 = iArr3[i17];
            this.f70256c.add(new c.C0722c(d(i18), iArr2[i18]));
        }
    }

    public static int a(int i10) {
        return (i10 >> 10) & 31;
    }

    public static int a(int i10, int i11, int i12) {
        return Color.rgb(b(i10, 5, 8), b(i11, 5, 8), b(i12, 5, 8));
    }

    private List<c.C0722c> a(Collection<C0720a> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator<C0720a> it = collection.iterator();
        while (it.hasNext()) {
            c.C0722c c0722cE = it.next().e();
            if (!a(c0722cE.a())) {
                arrayList.add(c0722cE);
            }
        }
        return arrayList;
    }

    private static void a(PriorityQueue<C0720a> priorityQueue, int i10) {
        C0720a c0720aPoll;
        while (priorityQueue.size() < i10 && (c0720aPoll = priorityQueue.poll()) != null && c0720aPoll.b()) {
            if (!c0720aPoll.b()) {
                throw new IllegalStateException("Can not split a box with only 1 color");
            }
            int iD = c0720aPoll.d();
            C0720a c0720a = a.this.new C0720a(iD + 1, c0720aPoll.f70260a);
            c0720aPoll.f70260a = iD;
            c0720aPoll.c();
            priorityQueue.offer(c0720a);
            priorityQueue.offer(c0720aPoll);
        }
    }

    public static void a(int[] iArr, int i10, int i11, int i12) {
        if (i10 == -2) {
            while (i11 <= i12) {
                int i13 = iArr[i11];
                iArr[i11] = (i13 & 31) | (((i13 >> 5) & 31) << 10) | (((i13 >> 10) & 31) << 5);
                i11++;
            }
            return;
        }
        if (i10 != -1) {
            return;
        }
        while (i11 <= i12) {
            int i14 = iArr[i11];
            iArr[i11] = ((i14 >> 10) & 31) | ((i14 & 31) << 10) | (((i14 >> 5) & 31) << 5);
            i11++;
        }
    }

    private boolean a(float[] fArr) {
        c.b[] bVarArr = this.f70258e;
        if (bVarArr != null && bVarArr.length > 0) {
            int length = bVarArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                if (!this.f70258e[i10].a(fArr)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int b(int i10) {
        return (i10 >> 5) & 31;
    }

    private static int b(int i10, int i11, int i12) {
        return (i12 > i11 ? i10 << (i12 - i11) : i10 >> (i11 - i12)) & ((1 << i12) - 1);
    }

    public static int c(int i10) {
        return i10 & 31;
    }

    private static int d(int i10) {
        return a((i10 >> 10) & 31, (i10 >> 5) & 31, i10 & 31);
    }
}
