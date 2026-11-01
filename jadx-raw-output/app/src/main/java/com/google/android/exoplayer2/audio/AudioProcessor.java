package com.google.android.exoplayer2.audio;

import g5.k0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes8.dex */
public interface AudioProcessor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ByteBuffer f18987a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    public static final class UnhandledAudioFormatException extends Exception {
        public UnhandledAudioFormatException(a aVar) {
            super("Unhandled format: " + aVar);
        }
    }

    public static final class a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f18988e = new a(-1, -1, -1);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f18989a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f18990b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f18991c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f18992d;

        public String toString() {
            return "AudioFormat[sampleRate=" + this.f18989a + ", channelCount=" + this.f18990b + ", encoding=" + this.f18991c + ']';
        }

        public a(int i10, int i11, int i12) {
            int iS;
            this.f18989a = i10;
            this.f18990b = i11;
            this.f18991c = i12;
            if (k0.f0(i12)) {
                iS = k0.S(i12, i11);
            } else {
                iS = -1;
            }
            this.f18992d = iS;
        }
    }

    a a(a aVar) throws UnhandledAudioFormatException;

    void flush();

    ByteBuffer getOutput();

    boolean isActive();

    boolean isEnded();

    void queueEndOfStream();

    void queueInput(ByteBuffer byteBuffer);

    void reset();
}
