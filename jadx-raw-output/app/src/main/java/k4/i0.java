package k4;

import java.io.IOException;

/* JADX INFO: compiled from: SampleStream.java */
/* JADX INFO: loaded from: classes2.dex */
public interface i0 {
    int b(k3.f0 f0Var, o3.e eVar, boolean z10);

    boolean isReady();

    void maybeThrowError() throws IOException;

    int skipData(long j10);
}
