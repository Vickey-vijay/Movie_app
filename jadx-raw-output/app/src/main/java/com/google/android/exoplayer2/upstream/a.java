package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import androidx.annotation.Nullable;
import e5.h;
import e5.q;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: DataSource.java */
/* JADX INFO: loaded from: classes10.dex */
public interface a {

    /* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DataSource.java */
    public interface InterfaceC0188a {
        a createDataSource();
    }

    long a(h hVar) throws IOException;

    void b(q qVar);

    void close() throws IOException;

    @Nullable
    Uri getUri();

    int read(byte[] bArr, int i10, int i11) throws IOException;

    default Map<String, List<String>> getResponseHeaders() {
        return Collections.emptyMap();
    }
}
