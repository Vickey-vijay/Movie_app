package y5;

/* JADX INFO: compiled from: ResultPoint.java */
/* JADX INFO: loaded from: classes9.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f75295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f75296b;

    public static void e(j[] jVarArr) {
        j jVar;
        j jVar2;
        j jVar3;
        float fB = b(jVarArr[0], jVarArr[1]);
        float fB2 = b(jVarArr[1], jVarArr[2]);
        float fB3 = b(jVarArr[0], jVarArr[2]);
        if (fB2 >= fB && fB2 >= fB3) {
            jVar = jVarArr[0];
            jVar2 = jVarArr[1];
            jVar3 = jVarArr[2];
        } else if (fB3 < fB2 || fB3 < fB) {
            jVar = jVarArr[2];
            jVar2 = jVarArr[0];
            jVar3 = jVarArr[1];
        } else {
            jVar = jVarArr[1];
            jVar2 = jVarArr[0];
            jVar3 = jVarArr[2];
        }
        if (a(jVar2, jVar, jVar3) < 0.0f) {
            j jVar4 = jVar3;
            jVar3 = jVar2;
            jVar2 = jVar4;
        }
        jVarArr[0] = jVar2;
        jVarArr[1] = jVar;
        jVarArr[2] = jVar3;
    }

    public static float a(j jVar, j jVar2, j jVar3) {
        float f10 = jVar2.f75295a;
        float f11 = jVar2.f75296b;
        return ((jVar3.f75295a - f10) * (jVar.f75296b - f11)) - ((jVar3.f75296b - f11) * (jVar.f75295a - f10));
    }

    public static float b(j jVar, j jVar2) {
        return d6.a.a(jVar.f75295a, jVar.f75296b, jVar2.f75295a, jVar2.f75296b);
    }

    public final float c() {
        return this.f75295a;
    }

    public final float d() {
        return this.f75296b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f75295a == jVar.f75295a && this.f75296b == jVar.f75296b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.f75295a) * 31) + Float.floatToIntBits(this.f75296b);
    }

    public final String toString() {
        return "(" + this.f75295a + ',' + this.f75296b + ')';
    }

    public j(float f10, float f11) {
        this.f75295a = f10;
        this.f75296b = f11;
    }
}
