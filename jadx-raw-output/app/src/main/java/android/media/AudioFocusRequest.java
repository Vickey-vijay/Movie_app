package android.media;

import android.annotation.NonNull;
import android.os.Handler;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class AudioFocusRequest {

    /* JADX INFO: loaded from: classes2.dex */
    public final /* synthetic */ class Builder {
        static {
            throw new NoClassDefFoundError();
        }

        public /* synthetic */ Builder(int i10) {
        }

        public /* synthetic */ Builder(@NonNull AudioFocusRequest audioFocusRequest) {
        }

        public native /* synthetic */ AudioFocusRequest build();

        @NonNull
        public native /* synthetic */ Builder setAudioAttributes(@NonNull AudioAttributes audioAttributes);

        @NonNull
        public native /* synthetic */ Builder setOnAudioFocusChangeListener(@NonNull AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener);

        @NonNull
        public native /* synthetic */ Builder setOnAudioFocusChangeListener(@NonNull AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, @NonNull Handler handler);

        @NonNull
        public native /* synthetic */ Builder setWillPauseWhenDucked(boolean z10);
    }

    static {
        throw new NoClassDefFoundError();
    }
}
