package yads;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ti3 {
    public static int a() {
        Integer num;
        Object obj = dw2.f76819j;
        dw2 dw2VarA = cw2.a();
        synchronized (dw2.f76819j) {
            num = dw2VarA.f76828h;
        }
        if (num != null) {
            return ik.k.k(num.intValue(), 1, 4);
        }
        return 4;
    }
}
