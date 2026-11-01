package yads;

import java.io.IOException;

/* JADX INFO: loaded from: classes11.dex */
public final class vv extends IOException {
    public static String a(int i10) {
        if (i10 == 0) {
            return "invalid period count";
        }
        if (i10 != 1) {
            return i10 != 2 ? "unknown" : "start exceeds end";
        }
        return "not seekable to start";
    }

    public vv(int i10) {
        super("Illegal clipping: ".concat(a(i10)));
    }
}
