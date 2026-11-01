package g5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: compiled from: SlidingPercentile.java */
/* JADX INFO: loaded from: classes4.dex */
public class b0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Comparator<b> f53046h = new Comparator() { // from class: g5.z
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return b0.g((b0.b) obj, (b0.b) obj2);
        }
    };

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Comparator<b> f53047i = new Comparator() { // from class: g5.a0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return b0.h((b0.b) obj, (b0.b) obj2);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f53048a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f53052e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f53053f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f53054g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b[] f53050c = new b[5];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<b> f53049b = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f53051d = -1;

    /* JADX INFO: compiled from: SlidingPercentile.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f53055a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f53056b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f53057c;

        public b() {
        }
    }

    public static /* synthetic */ int g(b bVar, b bVar2) {
        return bVar.f53055a - bVar2.f53055a;
    }

    public static /* synthetic */ int h(b bVar, b bVar2) {
        return Float.compare(bVar.f53057c, bVar2.f53057c);
    }

    public final void d() {
        if (this.f53051d != 1) {
            Collections.sort(this.f53049b, f53046h);
            this.f53051d = 1;
        }
    }

    public final void e() {
        if (this.f53051d != 0) {
            Collections.sort(this.f53049b, f53047i);
            this.f53051d = 0;
        }
    }

    public void i() {
        this.f53049b.clear();
        this.f53051d = -1;
        this.f53052e = 0;
        this.f53053f = 0;
    }

    public b0(int i10) {
        this.f53048a = i10;
    }

    public void c(int i10, float f10) {
        b bVar;
        d();
        int i11 = this.f53054g;
        if (i11 > 0) {
            b[] bVarArr = this.f53050c;
            int i12 = i11 - 1;
            this.f53054g = i12;
            bVar = bVarArr[i12];
        } else {
            bVar = new b();
        }
        int i13 = this.f53052e;
        this.f53052e = i13 + 1;
        bVar.f53055a = i13;
        bVar.f53056b = i10;
        bVar.f53057c = f10;
        this.f53049b.add(bVar);
        this.f53053f += i10;
        while (true) {
            int i14 = this.f53053f;
            int i15 = this.f53048a;
            if (i14 > i15) {
                int i16 = i14 - i15;
                b bVar2 = this.f53049b.get(0);
                int i17 = bVar2.f53056b;
                if (i17 <= i16) {
                    this.f53053f -= i17;
                    this.f53049b.remove(0);
                    int i18 = this.f53054g;
                    if (i18 < 5) {
                        b[] bVarArr2 = this.f53050c;
                        this.f53054g = i18 + 1;
                        bVarArr2[i18] = bVar2;
                    }
                } else {
                    bVar2.f53056b = i17 - i16;
                    this.f53053f -= i16;
                }
            } else {
                return;
            }
        }
    }

    public float f(float f10) {
        e();
        float f11 = f10 * this.f53053f;
        int i10 = 0;
        for (int i11 = 0; i11 < this.f53049b.size(); i11++) {
            b bVar = this.f53049b.get(i11);
            i10 += bVar.f53056b;
            if (i10 >= f11) {
                return bVar.f53057c;
            }
        }
        if (this.f53049b.isEmpty()) {
            return Float.NaN;
        }
        ArrayList<b> arrayList = this.f53049b;
        return arrayList.get(arrayList.size() - 1).f53057c;
    }
}
