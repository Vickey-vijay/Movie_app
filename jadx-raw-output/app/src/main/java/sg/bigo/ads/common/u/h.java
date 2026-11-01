package sg.bigo.ads.common.u;

/* JADX INFO: loaded from: classes10.dex */
public class h extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f69975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f69976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Exception f69977c;

    public h(int i10, String str) {
        this.f69975a = i10;
        this.f69976b = str;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        Exception exc = this.f69977c;
        return exc != null ? exc.getMessage() : this.f69976b;
    }
}
