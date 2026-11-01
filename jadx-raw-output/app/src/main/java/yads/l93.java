package yads;

/* JADX INFO: loaded from: classes8.dex */
public final class l93 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f79730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f79731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f79732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f79733d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f79734e;

    public final void a() {
        int i10 = this.f79733d;
        this.f79733d = i10 == Integer.MIN_VALUE ? this.f79731b : i10 + this.f79732c;
        this.f79734e = this.f79730a + this.f79733d;
    }

    public final void b() {
        if (this.f79733d == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    public l93(int i10, int i11, int i12) {
        String str;
        if (i10 == Integer.MIN_VALUE) {
            str = "";
        } else {
            str = i10 + "/";
        }
        this.f79730a = str;
        this.f79731b = i11;
        this.f79732c = i12;
        this.f79733d = Integer.MIN_VALUE;
        this.f79734e = "";
    }
}
