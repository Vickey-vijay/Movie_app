package yads;

/* JADX INFO: loaded from: classes10.dex */
public final class oy implements ij1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hj1 f81174a = new hj1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ij1[] f81175b;

    @Override // yads.ij1
    public final hj1 a(int i10, int i11) {
        ij1[] ij1VarArr = this.f81175b;
        int length = ij1VarArr.length;
        int i12 = 0;
        while (i12 < length) {
            hj1 hj1VarA = ij1VarArr[i12].a(i10, i11);
            int i13 = hj1VarA.f78252a;
            i12++;
            i11 = hj1VarA.f78253b;
            i10 = i13;
        }
        hj1 hj1Var = this.f81174a;
        hj1Var.f78252a = i10;
        hj1Var.f78253b = i11;
        return hj1Var;
    }

    public oy(ij1... ij1VarArr) {
        this.f81175b = ij1VarArr;
    }
}
