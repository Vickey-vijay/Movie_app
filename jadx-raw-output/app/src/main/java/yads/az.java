package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class az {
    public static final Boolean a(rg1 rg1Var, String str) {
        Object obj = cz.f76485f;
        tg1 tg1Var = (tg1) rg1Var;
        if (!tg1Var.a(str)) {
            tg1Var = null;
        }
        if (tg1Var != null) {
            return Boolean.valueOf(tg1Var.a(str, false));
        }
        return null;
    }

    public static final Integer b(rg1 rg1Var, String str) {
        Object obj = cz.f76485f;
        tg1 tg1Var = (tg1) rg1Var;
        if (!tg1Var.a(str)) {
            tg1Var = null;
        }
        if (tg1Var != null) {
            return Integer.valueOf(tg1Var.a(0, str));
        }
        return null;
    }

    public static final void a(rg1 rg1Var, String str, Boolean bool) {
        Object obj = cz.f76485f;
        if (bool != null) {
            ((tg1) rg1Var).b(str, bool.booleanValue());
        } else {
            ((tg1) rg1Var).d(str);
        }
    }

    public static final void a(rg1 rg1Var, String str, Integer num) {
        Object obj = cz.f76485f;
        if (num != null) {
            ((tg1) rg1Var).b(num.intValue(), str);
        } else {
            ((tg1) rg1Var).d(str);
        }
    }
}
