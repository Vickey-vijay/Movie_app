package kl;

/* JADX INFO: compiled from: R2LDanmaku.java */
/* JADX INFO: loaded from: classes2.dex */
public class o extends c {
    public int N;
    public float P;
    public long Q;
    public float L = 0.0f;
    public float M = -1.0f;
    public float[] O = null;

    @Override // kl.c
    public int getType() {
        return 1;
    }

    @Override // kl.c
    public float d() {
        return this.M + this.f62905p;
    }

    @Override // kl.c
    public float g() {
        return this.L;
    }

    @Override // kl.c
    public float i() {
        return this.L + this.f62904o;
    }

    @Override // kl.c
    public float l() {
        return this.M;
    }

    @Override // kl.c
    public void x(l lVar, float f10, float f11) {
        e eVar = this.D;
        if (eVar != null) {
            long j10 = eVar.f62916a;
            long jB = j10 - b();
            if (jB > 0 && jB < this.f62906q.f62920d) {
                this.L = D(lVar, j10);
                if (!u()) {
                    this.M = f11;
                    C(true);
                }
                this.Q = j10;
                return;
            }
            this.Q = j10;
        }
        C(false);
    }

    public o(f fVar) {
        this.f62906q = fVar;
    }

    public float D(l lVar, long j10) {
        long jB = j10 - b();
        if (jB >= this.f62906q.f62920d) {
            return -this.f62904o;
        }
        return lVar.getWidth() - (jB * this.P);
    }

    @Override // kl.c
    public float[] h(l lVar, long j10) {
        if (!p()) {
            return null;
        }
        float fD = D(lVar, j10);
        if (this.O == null) {
            this.O = new float[4];
        }
        float[] fArr = this.O;
        fArr[0] = fD;
        float f10 = this.M;
        fArr[1] = f10;
        fArr[2] = fD + this.f62904o;
        fArr[3] = f10 + this.f62905p;
        return fArr;
    }

    @Override // kl.c
    public void y(l lVar, boolean z10) {
        super.y(lVar, z10);
        int width = (int) (lVar.getWidth() + this.f62904o);
        this.N = width;
        this.P = width / this.f62906q.f62920d;
    }
}
