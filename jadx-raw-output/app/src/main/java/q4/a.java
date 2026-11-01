package q4;

import com.google.android.exoplayer2.upstream.g;

/* JADX INFO: compiled from: DefaultHlsPlaylistParserFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements e {
    @Override // q4.e
    public g.a<d> a(com.google.android.exoplayer2.source.hls.playlist.b bVar) {
        return new com.google.android.exoplayer2.source.hls.playlist.d(bVar);
    }

    @Override // q4.e
    public g.a<d> createPlaylistParser() {
        return new com.google.android.exoplayer2.source.hls.playlist.d();
    }
}
