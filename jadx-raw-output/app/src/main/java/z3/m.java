package z3;

import com.google.android.exoplayer2.ParserException;

/* JADX INFO: compiled from: ElementaryStreamReader.java */
/* JADX INFO: loaded from: classes3.dex */
public interface m {
    void b(g5.t tVar) throws ParserException;

    void c(q3.i iVar, h0.d dVar);

    void packetFinished();

    void packetStarted(long j10, int i10);

    void seek();
}
