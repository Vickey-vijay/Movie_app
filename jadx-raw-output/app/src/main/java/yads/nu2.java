package yads;

import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes10.dex */
public final class nu2 implements o30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f80811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SSLSocketFactory f80812b;

    @Override // yads.o30
    public final p30 createDataSource() {
        return new ku2(this.f80811a, 8000, 8000, false, new t11(), this.f80812b);
    }

    public nu2(String str, SSLSocketFactory sSLSocketFactory) {
        this.f80811a = str;
        this.f80812b = sSLSocketFactory;
    }
}
