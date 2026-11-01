package k3;

import android.annotation.SuppressLint;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;

/* JADX INFO: compiled from: RendererCapabilities.java */
/* JADX INFO: loaded from: classes2.dex */
public interface q0 {
    static int create(int i10) {
        return create(i10, 0, 0);
    }

    @SuppressLint({"WrongConstant"})
    static int create(int i10, int i11, int i12) {
        return i10 | i11 | i12;
    }

    @SuppressLint({"WrongConstant"})
    static int getAdaptiveSupport(int i10) {
        return i10 & 24;
    }

    @SuppressLint({"WrongConstant"})
    static int getFormatSupport(int i10) {
        return i10 & 7;
    }

    @SuppressLint({"WrongConstant"})
    static int getTunnelingSupport(int i10) {
        return i10 & 32;
    }

    int a(Format format) throws ExoPlaybackException;

    int getTrackType();

    int supportsMixedMimeTypeAdaptation() throws ExoPlaybackException;

    static String f(int i10) {
        if (i10 == 0) {
            return "NO";
        }
        if (i10 == 1) {
            return "NO_UNSUPPORTED_TYPE";
        }
        if (i10 == 2) {
            return "NO_UNSUPPORTED_DRM";
        }
        if (i10 == 3) {
            return "NO_EXCEEDS_CAPABILITIES";
        }
        if (i10 == 4) {
            return "YES";
        }
        throw new IllegalStateException();
    }
}
