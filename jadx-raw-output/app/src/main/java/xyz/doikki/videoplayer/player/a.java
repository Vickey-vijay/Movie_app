package xyz.doikki.videoplayer.player;

import android.content.res.AssetFileDescriptor;
import android.view.Surface;
import android.view.SurfaceHolder;
import java.util.Map;

/* JADX INFO: compiled from: AbstractPlayer.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class a {
    public static final int MEDIA_INFO_BUFFERING_END = 702;
    public static final int MEDIA_INFO_BUFFERING_START = 701;
    public static final int MEDIA_INFO_RENDERING_START = 3;
    public static final int MEDIA_INFO_VIDEO_ROTATION_CHANGED = 10001;
    public InterfaceC0798a mPlayerEventListener;

    /* JADX INFO: renamed from: xyz.doikki.videoplayer.player.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AbstractPlayer.java */
    public interface InterfaceC0798a {
        void onCompletion();

        void onError();

        void onInfo(int i10, int i11);

        void onPrepared();

        void onVideoSizeChanged(int i10, int i11);
    }

    public abstract int getBufferedPercentage();

    public abstract long getCurrentPosition();

    public abstract long getDuration();

    public abstract float getSpeed();

    public abstract long getTcpSpeed();

    public abstract void initPlayer();

    public abstract boolean isPlaying();

    public abstract void pause();

    public abstract void prepareAsync();

    public abstract void release();

    public abstract void reset();

    public abstract void seekTo(long j10);

    public abstract void setDataSource(AssetFileDescriptor assetFileDescriptor);

    public abstract void setDataSource(String str, Map<String, String> map);

    public abstract void setDisplay(SurfaceHolder surfaceHolder);

    public abstract void setLooping(boolean z10);

    public abstract void setOptions();

    public abstract void setSpeed(float f10);

    public abstract void setSurface(Surface surface);

    public abstract void setVolume(float f10, float f11);

    public abstract void start();

    public abstract void stop();

    public void setPlayerEventListener(InterfaceC0798a interfaceC0798a) {
        this.mPlayerEventListener = interfaceC0798a;
    }
}
