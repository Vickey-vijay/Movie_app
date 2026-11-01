package wo;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: InputStreamProvider.java */
/* JADX INFO: loaded from: classes10.dex */
public interface d {
    void close();

    int getIndex();

    String getPath();

    InputStream open() throws IOException;
}
