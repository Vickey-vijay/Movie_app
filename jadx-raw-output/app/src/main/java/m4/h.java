package m4;

import java.io.IOException;
import java.util.List;
import k3.t0;

/* JADX INFO: compiled from: ChunkSource.java */
/* JADX INFO: loaded from: classes6.dex */
public interface h {
    long a(long j10, t0 t0Var);

    boolean c(d dVar, boolean z10, Exception exc, long j10);

    void f(long j10, long j11, List<? extends l> list, f fVar);

    void g(d dVar);

    int getPreferredQueueSize(long j10, List<? extends l> list);

    void maybeThrowError() throws IOException;
}
