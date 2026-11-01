package kl;

/* JADX INFO: compiled from: FTDanmaku.java */
/* JADX INFO: loaded from: classes11.dex */
public class h extends c {
    public float L = 0.0f;
    public float M = -1.0f;
    public float[] N = null;
    public float O;
    public float P;
    public int Q;

    @Override // kl.c
    public int getType() {
        return 5;
    }

    public float D(l lVar) {
        if (this.Q == lVar.getWidth() && this.P == this.f62904o) {
            return this.O;
        }
        float width = (lVar.getWidth() - this.f62904o) / 2.0f;
        this.Q = lVar.getWidth();
        this.P = this.f62904o;
        this.O = width;
        return width;
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
            long jB = eVar.f62916a - b();
            if (jB <= 0 || jB >= this.f62906q.f62920d) {
                C(false);
                this.M = -1.0f;
                this.L = lVar.getWidth();
            } else {
                if (u()) {
                    return;
                }
                this.L = D(lVar);
                this.M = f11;
                C(true);
            }
        }
    }

    public h(f fVar) {
        this.f62906q = fVar;
    }

    @Override // kl.c
    public float[] h(l lVar, long j10) {
        if (!p()) {
            return null;
        }
        float fD = D(lVar);
        if (this.N == null) {
            this.N = new float[4];
        }
        float[] fArr = this.N;
        fArr[0] = fD;
        float f10 = this.M;
        fArr[1] = f10;
        fArr[2] = fD + this.f62904o;
        fArr[3] = f10 + this.f62905p;
        return fArr;
    }
}
