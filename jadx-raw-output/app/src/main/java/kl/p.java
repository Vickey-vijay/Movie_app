package kl;

import java.lang.reflect.Array;

/* JADX INFO: compiled from: SpecialDanmaku.java */
/* JADX INFO: loaded from: classes2.dex */
public class p extends kl.c {
    public float L;
    public float M;
    public float N;
    public float O;
    public float P;
    public float Q;
    public long R;
    public long S;
    public c T;
    public int U;
    public int Y;
    public int Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int f62928a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public long f62929b0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public a[] f62931d0;
    public int V = 0;
    public int W = 0;
    public boolean X = false;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public float[] f62930c0 = new float[4];

    /* JADX INFO: compiled from: SpecialDanmaku.java */
    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public b f62932a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public b f62933b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f62934c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f62935d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f62936e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f62937f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f62938g;

        public float[] a() {
            b bVar = this.f62932a;
            return new float[]{bVar.f62940a, bVar.f62941b};
        }

        public float[] c() {
            b bVar = this.f62933b;
            return new float[]{bVar.f62940a, bVar.f62941b};
        }

        public a() {
        }

        public float b() {
            return this.f62933b.a(this.f62932a);
        }

        public void d(b bVar, b bVar2) {
            this.f62932a = bVar;
            this.f62933b = bVar2;
            this.f62937f = bVar2.f62940a - bVar.f62940a;
            this.f62938g = bVar2.f62941b - bVar.f62941b;
        }
    }

    /* JADX INFO: compiled from: SpecialDanmaku.java */
    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f62940a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f62941b;

        public b(float f10, float f11) {
            this.f62940a = f10;
            this.f62941b = f11;
        }

        public float a(b bVar) {
            float fAbs = Math.abs(this.f62940a - bVar.f62940a);
            float fAbs2 = Math.abs(this.f62941b - bVar.f62941b);
            return (float) Math.sqrt((fAbs * fAbs) + (fAbs2 * fAbs2));
        }
    }

    /* JADX INFO: compiled from: SpecialDanmaku.java */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f62943a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f62944b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f62945c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f62946d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f62947e;

        public boolean a(int i10, int i11, int i12) {
            return (this.f62943a == i10 || (this.f62946d == i11 && this.f62947e == i12)) ? false : true;
        }

        public void update(int i10, int i11, float f10, float f11) {
            if (Float.compare(this.f62944b, f10) != 0 || Float.compare(this.f62945c, f11) != 0) {
                this.f62943a++;
            }
            this.f62946d = i10;
            this.f62947e = i11;
            this.f62944b = f10;
            this.f62945c = f11;
        }

        public c(int i10, int i11, float f10, float f11) {
            update(i10, i11, f10, f11);
        }
    }

    public static final float D(long j10, long j11) {
        float f10 = j10 / j11;
        return (-1.0f) * f10 * (f10 - 2.0f);
    }

    @Override // kl.c
    public int getType() {
        return 7;
    }

    public void E(float[][] fArr) {
        a[] aVarArr;
        if (fArr != null) {
            int length = fArr.length;
            int i10 = 0;
            float[] fArr2 = fArr[0];
            this.L = fArr2[0];
            this.M = fArr2[1];
            float[] fArr3 = fArr[length - 1];
            this.N = fArr3[0];
            this.O = fArr3[1];
            if (fArr.length > 1) {
                this.f62931d0 = new a[fArr.length - 1];
                int i11 = 0;
                while (true) {
                    aVarArr = this.f62931d0;
                    if (i11 >= aVarArr.length) {
                        break;
                    }
                    aVarArr[i11] = new a();
                    a aVar = this.f62931d0[i11];
                    float[] fArr4 = fArr[i11];
                    b bVar = new b(fArr4[0], fArr4[1]);
                    i11++;
                    float[] fArr5 = fArr[i11];
                    aVar.d(bVar, new b(fArr5[0], fArr5[1]));
                }
                float fB = 0.0f;
                for (a aVar2 : aVarArr) {
                    fB += aVar2.b();
                }
                a aVar3 = null;
                a[] aVarArr2 = this.f62931d0;
                int length2 = aVarArr2.length;
                while (i10 < length2) {
                    a aVar4 = aVarArr2[i10];
                    long jB = (long) ((aVar4.b() / fB) * this.R);
                    aVar4.f62934c = jB;
                    long j10 = aVar3 == null ? 0L : aVar3.f62936e;
                    aVar4.f62935d = j10;
                    aVar4.f62936e = j10 + jB;
                    i10++;
                    aVar3 = aVar4;
                }
            }
        }
    }

    public void F(c cVar) {
        this.T = cVar;
        this.U = cVar.f62943a;
    }

    public void G(float f10, float f11, float f12, float f13, long j10, long j11) {
        this.L = f10;
        this.M = f11;
        this.N = f12;
        this.O = f13;
        this.P = f12 - f10;
        this.Q = f13 - f11;
        this.R = j10;
        this.S = j11;
    }

    @Override // kl.c
    public float d() {
        return this.f62930c0[3];
    }

    @Override // kl.c
    public float g() {
        return this.f62930c0[0];
    }

    @Override // kl.c
    public float[] h(l lVar, long j10) {
        a aVar;
        int i10;
        if (!p()) {
            return null;
        }
        if (this.T.a(this.U, this.V, this.W)) {
            c cVar = this.T;
            float f10 = cVar.f62944b;
            float f11 = cVar.f62945c;
            G(this.L * f10, this.M * f11, this.N * f10, this.O * f11, this.R, this.S);
            a[] aVarArr = this.f62931d0;
            if (aVarArr != null && aVarArr.length > 0) {
                int length = aVarArr.length;
                float[][] fArr = (float[][]) Array.newInstance((Class<?>) Float.TYPE, length + 1, 2);
                int i11 = 0;
                while (i11 < length) {
                    fArr[i11] = this.f62931d0[i11].a();
                    int i12 = i11 + 1;
                    fArr[i12] = this.f62931d0[i11].c();
                    i11 = i12;
                }
                for (float[] fArr2 : fArr) {
                    fArr2[0] = fArr2[0] * f10;
                    fArr2[1] = fArr2[1] * f11;
                }
                E(fArr);
            }
            c cVar2 = this.T;
            this.U = cVar2.f62943a;
            this.V = cVar2.f62946d;
            this.W = cVar2.f62947e;
        }
        long jB = j10 - b();
        long j11 = this.f62929b0;
        if (j11 > 0 && (i10 = this.f62928a0) != 0) {
            if (jB >= j11) {
                this.E = this.Z;
            } else {
                this.E = this.Y + ((int) (i10 * (jB / j11)));
            }
        }
        float f12 = this.L;
        float f13 = this.M;
        long j12 = jB - this.S;
        long j13 = this.R;
        if (j13 > 0 && j12 >= 0 && j12 <= j13) {
            a[] aVarArr2 = this.f62931d0;
            if (aVarArr2 != null) {
                int length2 = aVarArr2.length;
                int i13 = 0;
                while (true) {
                    if (i13 >= length2) {
                        aVar = null;
                        break;
                    }
                    a aVar2 = aVarArr2[i13];
                    if (j12 >= aVar2.f62935d && j12 < aVar2.f62936e) {
                        aVar = aVar2;
                        break;
                    }
                    b bVar = aVar2.f62933b;
                    float f14 = bVar.f62940a;
                    i13++;
                    f13 = bVar.f62941b;
                    f12 = f14;
                }
                if (aVar != null) {
                    float f15 = aVar.f62937f;
                    float f16 = aVar.f62938g;
                    float f17 = (jB - aVar.f62935d) / aVar.f62934c;
                    b bVar2 = aVar.f62932a;
                    float f18 = bVar2.f62940a;
                    float f19 = bVar2.f62941b;
                    if (f15 != 0.0f) {
                        f12 = f18 + (f15 * f17);
                    }
                    if (f16 != 0.0f) {
                        f13 = f19 + (f16 * f17);
                    }
                }
            } else {
                float fD = this.X ? D(j12, j13) : j12 / j13;
                float f20 = this.P;
                if (f20 != 0.0f) {
                    f12 = this.L + (f20 * fD);
                }
                float f21 = this.Q;
                if (f21 != 0.0f) {
                    f13 = this.M + (f21 * fD);
                }
            }
        } else if (j12 > j13) {
            f12 = this.N;
            f13 = this.O;
        }
        float[] fArr3 = this.f62930c0;
        fArr3[0] = f12;
        fArr3[1] = f13;
        fArr3[2] = f12 + this.f62904o;
        fArr3[3] = f13 + this.f62905p;
        C(!r());
        return this.f62930c0;
    }

    @Override // kl.c
    public float i() {
        return this.f62930c0[2];
    }

    @Override // kl.c
    public float l() {
        return this.f62930c0[1];
    }

    @Override // kl.c
    public void x(l lVar, float f10, float f11) {
        h(lVar, this.D.f62916a);
    }

    @Override // kl.c
    public void y(l lVar, boolean z10) {
        super.y(lVar, z10);
        if (this.V == 0 || this.W == 0) {
            this.V = lVar.getWidth();
            this.W = lVar.getHeight();
        }
    }
}
