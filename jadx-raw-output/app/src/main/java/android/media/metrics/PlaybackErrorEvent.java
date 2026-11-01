package android.media.metrics;

import android.annotation.NonNull;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class PlaybackErrorEvent extends Event implements Parcelable {

    /* JADX INFO: loaded from: classes8.dex */
    public final /* synthetic */ class Builder {
        static {
            throw new NoClassDefFoundError();
        }

        @NonNull
        public native /* synthetic */ PlaybackErrorEvent build();

        @NonNull
        public native /* synthetic */ Builder setErrorCode(int i10);

        @NonNull
        public native /* synthetic */ Builder setException(@NonNull Exception exc);

        @NonNull
        public native /* synthetic */ Builder setSubErrorCode(int i10);

        @NonNull
        public native /* synthetic */ Builder setTimeSinceCreatedMillis(long j10);
    }

    static {
        throw new NoClassDefFoundError();
    }
}
