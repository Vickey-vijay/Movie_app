package androidx.media3.exoplayer.audio;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class DefaultAudioOffloadSupportProvider implements DefaultAudioSink.AudioOffloadSupportProvider {
    private static final String OFFLOAD_VARIABLE_RATE_SUPPORTED_KEY = "offloadVariableRateSupported";

    @Nullable
    private final Context context;
    private Boolean isOffloadVariableRateSupported;

    public DefaultAudioOffloadSupportProvider() {
        this(null);
    }

    @RequiresApi(29)
    public static final class Api29 {
        private Api29() {
        }

        @DoNotInline
        public static AudioOffloadSupport getOffloadedPlaybackSupport(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z10) {
            if (!AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes)) {
                return AudioOffloadSupport.DEFAULT_UNSUPPORTED;
            }
            return new AudioOffloadSupport.Builder().setIsFormatSupported(true).setIsSpeedChangeSupported(z10).build();
        }
    }

    @RequiresApi(31)
    public static final class Api31 {
        private Api31() {
        }

        @DoNotInline
        public static AudioOffloadSupport getOffloadedPlaybackSupport(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z10) {
            boolean z11;
            int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
            if (playbackOffloadSupport == 0) {
                return AudioOffloadSupport.DEFAULT_UNSUPPORTED;
            }
            AudioOffloadSupport.Builder builder = new AudioOffloadSupport.Builder();
            if (Util.SDK_INT > 32 && playbackOffloadSupport == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            return builder.setIsFormatSupported(true).setIsGaplessSupported(z11).setIsSpeedChangeSupported(z10).build();
        }
    }

    public DefaultAudioOffloadSupportProvider(@Nullable Context context) {
        this.context = context;
    }

    private boolean isOffloadVariableRateSupported(@Nullable Context context) {
        AudioManager audioManager;
        Boolean bool = this.isOffloadVariableRateSupported;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context == null || (audioManager = (AudioManager) context.getSystemService("audio")) == null) {
            this.isOffloadVariableRateSupported = Boolean.FALSE;
        } else {
            String parameters = audioManager.getParameters(OFFLOAD_VARIABLE_RATE_SUPPORTED_KEY);
            this.isOffloadVariableRateSupported = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
        }
        return this.isOffloadVariableRateSupported.booleanValue();
    }

    @Override // androidx.media3.exoplayer.audio.DefaultAudioSink.AudioOffloadSupportProvider
    public AudioOffloadSupport getAudioOffloadSupport(Format format, androidx.media3.common.AudioAttributes audioAttributes) {
        Assertions.checkNotNull(format);
        Assertions.checkNotNull(audioAttributes);
        int i10 = Util.SDK_INT;
        if (i10 >= 29 && format.sampleRate != -1) {
            boolean zIsOffloadVariableRateSupported = isOffloadVariableRateSupported(this.context);
            int encoding = MimeTypes.getEncoding((String) Assertions.checkNotNull(format.sampleMimeType), format.codecs);
            if (encoding != 0 && i10 >= Util.getApiLevelThatAudioFormatIntroducedAudioEncoding(encoding)) {
                int audioTrackChannelConfig = Util.getAudioTrackChannelConfig(format.channelCount);
                if (audioTrackChannelConfig == 0) {
                    return AudioOffloadSupport.DEFAULT_UNSUPPORTED;
                }
                try {
                    AudioFormat audioFormat = Util.getAudioFormat(format.sampleRate, audioTrackChannelConfig, encoding);
                    if (i10 >= 31) {
                        return Api31.getOffloadedPlaybackSupport(audioFormat, audioAttributes.getAudioAttributesV21().audioAttributes, zIsOffloadVariableRateSupported);
                    }
                    return Api29.getOffloadedPlaybackSupport(audioFormat, audioAttributes.getAudioAttributesV21().audioAttributes, zIsOffloadVariableRateSupported);
                } catch (IllegalArgumentException unused) {
                    return AudioOffloadSupport.DEFAULT_UNSUPPORTED;
                }
            }
            return AudioOffloadSupport.DEFAULT_UNSUPPORTED;
        }
        return AudioOffloadSupport.DEFAULT_UNSUPPORTED;
    }
}
