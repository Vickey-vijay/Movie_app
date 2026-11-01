package wo;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: InputStreamAdapter.java */
/* JADX INFO: loaded from: classes10.dex */
public abstract class c implements d {
    public abstract InputStream a() throws IOException;

    @Override // wo.d
    public void close() {
        xo.b.d().a();
    }

    @Override // wo.d
    public InputStream open() throws IOException {
        return a();
    }
}
