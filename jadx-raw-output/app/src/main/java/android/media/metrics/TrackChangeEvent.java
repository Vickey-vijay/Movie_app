package android.media.metrics;

import android.annotation.NonNull;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class TrackChangeEvent extends Event implements Parcelable {

    public final /* synthetic */ class Builder {
        static {
            throw new NoClassDefFoundError();
        }

        public /* synthetic */ Builder(int i10) {
        }

        @NonNull
        public native /* synthetic */ TrackChangeEvent build();

        @NonNull
        public native /* synthetic */ Builder setAudioSampleRate(int i10);

        @NonNull
        public native /* synthetic */ Builder setBitrate(int i10);

        @NonNull
        public native /* synthetic */ Builder setChannelCount(int i10);

        @NonNull
        public native /* synthetic */ Builder setCodecName(@NonNull String str);

        @NonNull
        public native /* synthetic */ Builder setContainerMimeType(@NonNull String str);

        @NonNull
        public native /* synthetic */ Builder setHeight(int i10);

        @NonNull
        public native /* synthetic */ Builder setLanguage(@NonNull String str);

        @NonNull
        public native /* synthetic */ Builder setLanguageRegion(@NonNull String str);

        @NonNull
        public native /* synthetic */ Builder setSampleMimeType(@NonNull String str);

        @NonNull
        public native /* synthetic */ Builder setTimeSinceCreatedMillis(long j10);

        @NonNull
        public native /* synthetic */ Builder setTrackChangeReason(int i10);

        @NonNull
        public native /* synthetic */ Builder setTrackState(int i10);

        @NonNull
        public native /* synthetic */ Builder setVideoFrameRate(float f10);

        @NonNull
        public native /* synthetic */ Builder setWidth(int i10);
    }

    static {
        throw new NoClassDefFoundError();
    }
}
