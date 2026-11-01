package yads;

/* JADX INFO: loaded from: classes3.dex */
public final class lp0 extends RuntimeException {
    public static String a(int i10) {
        if (i10 == 1) {
            return "Player release timed out.";
        }
        if (i10 != 2) {
            return i10 != 3 ? "Undefined timeout." : "Detaching surface timed out.";
        }
        return "Setting foreground mode timed out.";
    }

    public lp0(int i10) {
        super(a(i10));
    }
}
