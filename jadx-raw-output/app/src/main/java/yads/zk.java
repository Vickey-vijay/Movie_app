package yads;

/* JADX INFO: loaded from: classes11.dex */
public final class zk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final zk f85459e = new zk(-1, -1, -1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f85460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f85461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f85462c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f85463d;

    public final String toString() {
        return "AudioFormat[sampleRate=" + this.f85460a + ", channelCount=" + this.f85461b + ", encoding=" + this.f85462c + ']';
    }

    public zk(int i10, int i11, int i12) {
        int iB;
        this.f85460a = i10;
        this.f85461b = i11;
        this.f85462c = i12;
        if (ib3.e(i12)) {
            iB = ib3.b(i12, i11);
        } else {
            iB = -1;
        }
        this.f85463d = iB;
    }
}
