package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import androidx.annotation.Nullable;
import e5.m;
import java.io.IOException;
import k4.b0;
import p4.e;

/* JADX INFO: loaded from: classes4.dex */
public interface HlsPlaylistTracker {

    public interface a {
        HlsPlaylistTracker a(e eVar, m mVar, q4.e eVar2);
    }

    public interface b {
        boolean b(Uri uri, long j10);

        void onPlaylistChanged();
    }

    public interface c {
        void g(com.google.android.exoplayer2.source.hls.playlist.c cVar);
    }

    void a(b bVar);

    @Nullable
    com.google.android.exoplayer2.source.hls.playlist.b b();

    void c(b bVar);

    void d(Uri uri, b0.a aVar, c cVar);

    long getInitialStartTimeUs();

    @Nullable
    com.google.android.exoplayer2.source.hls.playlist.c getPlaylistSnapshot(Uri uri, boolean z10);

    boolean isLive();

    boolean isSnapshotValid(Uri uri);

    void maybeThrowPlaylistRefreshError(Uri uri) throws IOException;

    void maybeThrowPrimaryPlaylistRefreshError() throws IOException;

    void refreshPlaylist(Uri uri);

    void stop();

    public static final class PlaylistResetException extends IOException {
        public final Uri url;

        public PlaylistResetException(Uri uri) {
            this.url = uri;
        }
    }

    public static final class PlaylistStuckException extends IOException {
        public final Uri url;

        public PlaylistStuckException(Uri uri) {
            this.url = uri;
        }
    }
}
