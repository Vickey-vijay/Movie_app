package android.media.metrics;

import android.annotation.NonNull;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class PlaybackMetrics implements Parcelable {

    /* JADX INFO: loaded from: classes7.dex */
    public final /* synthetic */ class Builder {
        static {
            throw new NoClassDefFoundError();
        }

        @NonNull
        public native /* synthetic */ PlaybackMetrics build();

        @NonNull
        public native /* synthetic */ Builder setAudioUnderrunCount(int i10);

        @NonNull
        public native /* synthetic */ Builder setDrmType(int i10);

        @NonNull
        public native /* synthetic */ Builder setMediaDurationMillis(long j10);

        @NonNull
        public native /* synthetic */ Builder setNetworkBytesRead(long j10);

        @NonNull
        public native /* synthetic */ Builder setNetworkTransferDurationMillis(long j10);

        @NonNull
        public native /* synthetic */ Builder setPlaybackType(int i10);

        @NonNull
        public native /* synthetic */ Builder setPlayerName(@NonNull String str);

        @NonNull
        public native /* synthetic */ Builder setPlayerVersion(@NonNull String str);

        @NonNull
        public native /* synthetic */ Builder setStreamSource(int i10);

        @NonNull
        public native /* synthetic */ Builder setStreamType(int i10);

        @NonNull
        public native /* synthetic */ Builder setVideoFramesDropped(int i10);

        @NonNull
        public native /* synthetic */ Builder setVideoFramesPlayed(int i10);
    }

    static {
        throw new NoClassDefFoundError();
    }
}
