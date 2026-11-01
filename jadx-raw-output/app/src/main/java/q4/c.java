package q4;

import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.upstream.g;
import java.util.List;

/* JADX INFO: compiled from: FilteringHlsPlaylistParserFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f66515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<StreamKey> f66516b;

    @Override // q4.e
    public g.a<d> a(com.google.android.exoplayer2.source.hls.playlist.b bVar) {
        return new h4.e(this.f66515a.a(bVar), this.f66516b);
    }

    @Override // q4.e
    public g.a<d> createPlaylistParser() {
        return new h4.e(this.f66515a.createPlaylistParser(), this.f66516b);
    }

    public c(e eVar, List<StreamKey> list) {
        this.f66515a = eVar;
        this.f66516b = list;
    }
}
