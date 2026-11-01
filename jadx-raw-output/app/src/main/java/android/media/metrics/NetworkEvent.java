package android.media.metrics;

import android.annotation.NonNull;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class NetworkEvent extends Event implements Parcelable {

    /* JADX INFO: loaded from: classes10.dex */
    public final /* synthetic */ class Builder {
        static {
            throw new NoClassDefFoundError();
        }

        @NonNull
        public native /* synthetic */ NetworkEvent build();

        @NonNull
        public native /* synthetic */ Builder setNetworkType(int i10);

        @NonNull
        public native /* synthetic */ Builder setTimeSinceCreatedMillis(long j10);
    }

    static {
        throw new NoClassDefFoundError();
    }
}
