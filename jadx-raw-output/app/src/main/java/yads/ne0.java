package yads;

/* JADX INFO: loaded from: classes6.dex */
public final class ne0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f80651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f80652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f80653c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ym1 f80654d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f80655e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f80656f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ oe0 f80657g;

    public ne0(oe0 oe0Var, String str, int i10, ym1 ym1Var) {
        this.f80657g = oe0Var;
        this.f80651a = str;
        this.f80652b = i10;
        this.f80653c = ym1Var == null ? -1L : ym1Var.f82314d;
        if (ym1Var == null || !ym1Var.a()) {
            return;
        }
        this.f80654d = ym1Var;
    }

    public final boolean a(ye yeVar) {
        long j10 = this.f80653c;
        if (j10 == -1) {
            return false;
        }
        ym1 ym1Var = yeVar.f84912d;
        if (ym1Var == null) {
            return this.f80652b != yeVar.f84911c;
        }
        if (ym1Var.f82314d > j10) {
            return true;
        }
        if (this.f80654d == null) {
            return false;
        }
        int iA = yeVar.f84910b.a(ym1Var.f82311a);
        int iA2 = yeVar.f84910b.a(this.f80654d.f82311a);
        ym1 ym1Var2 = yeVar.f84912d;
        if (ym1Var2.f82314d < this.f80654d.f82314d || iA < iA2) {
            return false;
        }
        if (iA > iA2) {
            return true;
        }
        if (!ym1Var2.a()) {
            int i10 = yeVar.f84912d.f82315e;
            return i10 == -1 || i10 > this.f80654d.f82312b;
        }
        ym1 ym1Var3 = yeVar.f84912d;
        int i11 = ym1Var3.f82312b;
        int i12 = ym1Var3.f82313c;
        ym1 ym1Var4 = this.f80654d;
        int i13 = ym1Var4.f82312b;
        return i11 > i13 || (i11 == i13 && i12 > ym1Var4.f82313c);
    }
}
