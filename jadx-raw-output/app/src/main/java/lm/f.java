package lm;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: HttpContent.java */
/* JADX INFO: loaded from: classes.dex */
public interface f {
    mm.d a();

    InputStream b() throws IOException;

    long c();

    mm.d d();

    mm.d getContentType();

    mm.d getETag();

    mm.d getLastModified();

    an.e getResource();
}
