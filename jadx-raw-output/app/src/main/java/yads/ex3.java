package yads;

/* JADX INFO: loaded from: classes10.dex */
public abstract class ex3 {
    public static void a(wv3 wv3Var) {
        if (!wv3Var.f84356f) {
            throw new IllegalStateException("AdSession is not started");
        }
        if (wv3Var.f84357g) {
            throw new IllegalStateException("AdSession is finished");
        }
    }
}
