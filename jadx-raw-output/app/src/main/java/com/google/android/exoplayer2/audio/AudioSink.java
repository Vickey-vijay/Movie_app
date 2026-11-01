package com.google.android.exoplayer2.audio;

import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import k3.l0;
import m3.m;

/* JADX INFO: loaded from: classes7.dex */
public interface AudioSink {

    public static final class ConfigurationException extends Exception {
        public ConfigurationException(Throwable th2) {
            super(th2);
        }

        public ConfigurationException(String str) {
            super(str);
        }
    }

    public static final class InitializationException extends Exception {
        public final int audioTrackState;

        public InitializationException(int i10, int i11, int i12, int i13) {
            super("AudioTrack init failed: " + i10 + ", Config(" + i11 + ", " + i12 + ", " + i13 + ")");
            this.audioTrackState = i10;
        }
    }

    public static final class WriteException extends Exception {
        public final int errorCode;

        public WriteException(int i10) {
            super("AudioTrack write failed: " + i10);
            this.errorCode = i10;
        }
    }

    public interface a {
        void onAudioSessionId(int i10);

        void onPositionDiscontinuity();

        void onUnderrun(int i10, long j10, long j11);
    }

    void b(l0 l0Var);

    void c(m3.c cVar);

    void configure(int i10, int i11, int i12, int i13, @Nullable int[] iArr, int i14, int i15) throws ConfigurationException;

    boolean d(int i10, int i11);

    void disableTunneling();

    void e(m mVar);

    void enableTunnelingV21(int i10);

    void f(a aVar);

    void flush();

    long getCurrentPositionUs(boolean z10);

    l0 getPlaybackParameters();

    boolean handleBuffer(ByteBuffer byteBuffer, long j10) throws WriteException, InitializationException;

    void handleDiscontinuity();

    boolean hasPendingData();

    boolean isEnded();

    void pause();

    void play();

    void playToEndOfStream() throws WriteException;

    void reset();

    void setVolume(float f10);
}
