package yads;

/* JADX INFO: loaded from: classes11.dex */
public final class il extends Exception {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f78690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f78691c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final mx0 f78692d;

    public il(int i10, mx0 mx0Var, boolean z10) {
        super(mg2.a("AudioTrack write failed: ", i10));
        this.f78691c = z10;
        this.f78690b = i10;
        this.f78692d = mx0Var;
    }
}
