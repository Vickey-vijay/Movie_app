package kl;

/* JADX INFO: compiled from: L2RDanmaku.java */
/* JADX INFO: loaded from: classes2.dex */
public class n extends o {
    @Override // kl.o, kl.c
    public int getType() {
        return 6;
    }

    @Override // kl.o, kl.c
    public float d() {
        return this.M + this.f62905p;
    }

    @Override // kl.o, kl.c
    public float g() {
        return this.L;
    }

    @Override // kl.o, kl.c
    public float i() {
        return this.L + this.f62904o;
    }

    @Override // kl.o, kl.c
    public float l() {
        return this.M;
    }

    @Override // kl.o, kl.c
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

    public n(f fVar) {
        super(fVar);
    }

    @Override // kl.o
    public float D(l lVar, long j10) {
        long jB = j10 - b();
        if (jB >= this.f62906q.f62920d) {
            return lVar.getWidth();
        }
        return (this.P * jB) - this.f62904o;
    }

    @Override // kl.o, kl.c
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
}
