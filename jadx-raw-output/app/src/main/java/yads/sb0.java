package yads;

/* JADX INFO: loaded from: classes10.dex */
public final class sb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bl[] f82575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ty2 f82576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d23 f82577c;

    public final bl[] a() {
        return this.f82575a;
    }

    public sb0(bl[] blVarArr, ty2 ty2Var, d23 d23Var) {
        bl[] blVarArr2 = new bl[blVarArr.length + 2];
        this.f82575a = blVarArr2;
        System.arraycopy(blVarArr, 0, blVarArr2, 0, blVarArr.length);
        this.f82576b = ty2Var;
        this.f82577c = d23Var;
        blVarArr2[blVarArr.length] = ty2Var;
        blVarArr2[blVarArr.length + 1] = d23Var;
    }
}
