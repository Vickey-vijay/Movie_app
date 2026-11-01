package yads;

/* JADX INFO: loaded from: classes11.dex */
public final class fl extends Exception {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f77426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f77427c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final mx0 f77428d;

    public fl(int i10, int i11, int i12, int i13, mx0 mx0Var, boolean z10, RuntimeException runtimeException) {
        StringBuilder sb2 = new StringBuilder("AudioTrack init failed ");
        sb2.append(i10);
        sb2.append(" Config(");
        sb2.append(i11);
        sb2.append(", ");
        sb2.append(i12);
        sb2.append(", ");
        sb2.append(i13);
        sb2.append(")");
        sb2.append(z10 ? " (recoverable)" : "");
        super(sb2.toString(), runtimeException);
        this.f77426b = i10;
        this.f77427c = z10;
        this.f77428d = mx0Var;
    }
}
