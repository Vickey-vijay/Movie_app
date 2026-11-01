package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class nk2 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final float[] f80681i = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final float[] f80682j = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final float[] f80683k = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f80684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public mk2 f80685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public rz0 f80686c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f80687d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f80688e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f80689f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f80690g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f80691h;

    public static boolean a(kk2 kk2Var) {
        ik2 ik2Var = kk2Var.f79439a;
        ik2 ik2Var2 = kk2Var.f79440b;
        jk2[] jk2VarArr = ik2Var.f78688a;
        if (jk2VarArr.length != 1 || jk2VarArr[0].f79081a != 0) {
            return false;
        }
        jk2[] jk2VarArr2 = ik2Var2.f78688a;
        return jk2VarArr2.length == 1 && jk2VarArr2[0].f79081a == 0;
    }
}
