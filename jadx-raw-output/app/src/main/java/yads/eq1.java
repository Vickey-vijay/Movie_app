package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class eq1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pd3 f77173a;

    public final boolean a(String str, String str2) {
        if (str2 == null || lk.a0.n0(str2)) {
            return true;
        }
        this.f77173a.getClass();
        od3 od3VarA = pd3.a(str);
        if (od3VarA == null) {
            return true;
        }
        this.f77173a.getClass();
        od3 od3VarA2 = pd3.a(str2);
        return od3VarA2 == null || od3VarA.compareTo(od3VarA2) >= 0;
    }

    public eq1(pd3 pd3Var) {
        this.f77173a = pd3Var;
    }
}
