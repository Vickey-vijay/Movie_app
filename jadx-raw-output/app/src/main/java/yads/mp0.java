package yads;

/* JADX INFO: loaded from: classes7.dex */
public final class mp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h73 f80313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f80314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f80315c;

    public mp0(int i10, h73 h73Var, int[] iArr) {
        if (iArr.length == 0) {
            ih1.a("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.f80313a = h73Var;
        this.f80314b = iArr;
        this.f80315c = i10;
    }
}
