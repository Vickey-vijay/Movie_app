package an;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/* JADX INFO: compiled from: BadResource.java */
/* JADX INFO: loaded from: classes2.dex */
public class a extends f {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f3677i;

    public a(URL url, String str) {
        super(url, null);
        this.f3677i = str;
    }

    @Override // an.f, an.e
    public boolean a() {
        return false;
    }

    @Override // an.f, an.e
    public File b() {
        return null;
    }

    @Override // an.f, an.e
    public long d() {
        return -1L;
    }

    @Override // an.f, an.e
    public InputStream c() throws IOException {
        throw new FileNotFoundException(this.f3677i);
    }

    @Override // an.f, an.e
    public boolean delete() throws SecurityException {
        throw new SecurityException(this.f3677i);
    }

    @Override // an.f
    public String toString() {
        return super.toString() + "; BadResource=" + this.f3677i;
    }
}
