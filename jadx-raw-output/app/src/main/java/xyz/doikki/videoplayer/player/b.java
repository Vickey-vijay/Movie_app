package xyz.doikki.videoplayer.player;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import android.view.SurfaceHolder;
import java.util.Map;

/* JADX INFO: compiled from: AndroidMediaPlayer.java */
/* JADX INFO: loaded from: classes8.dex */
public class b extends xyz.doikki.videoplayer.player.a implements MediaPlayer.OnErrorListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnInfoListener, MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MediaPlayer f75148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f75149c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f75150d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f75151e;

    /* JADX INFO: compiled from: AndroidMediaPlayer.java */
    public class a extends Thread {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MediaPlayer f75152b;

        public a(MediaPlayer mediaPlayer) {
            this.f75152b = mediaPlayer;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                this.f75152b.release();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    @Override // xyz.doikki.videoplayer.player.a
    public long getTcpSpeed() {
        return 0L;
    }

    public final boolean isVideo() {
        try {
            for (MediaPlayer.TrackInfo trackInfo : this.f75148b.getTrackInfo()) {
                if (trackInfo.getTrackType() == 1) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public boolean onInfo(MediaPlayer mediaPlayer, int i10, int i11) {
        if (i10 != 3) {
            this.mPlayerEventListener.onInfo(i10, i11);
            return true;
        }
        if (!this.f75151e) {
            return true;
        }
        this.mPlayerEventListener.onInfo(i10, i11);
        this.f75151e = false;
        return true;
    }

    @Override // xyz.doikki.videoplayer.player.a
    public void prepareAsync() {
        try {
            this.f75151e = true;
            this.f75148b.prepareAsync();
        } catch (IllegalStateException unused) {
            this.mPlayerEventListener.onError();
        }
    }

    @Override // xyz.doikki.videoplayer.player.a
    public void setDataSource(String str, Map<String, String> map) {
        try {
            this.f75148b.setDataSource(this.f75150d, Uri.parse(str), map);
        } catch (Exception unused) {
            this.mPlayerEventListener.onError();
        }
    }

    @Override // xyz.doikki.videoplayer.player.a
    public void setOptions() {
    }

    @Override // xyz.doikki.videoplayer.player.a
    public int getBufferedPercentage() {
        return this.f75149c;
    }

    @Override // xyz.doikki.videoplayer.player.a
    public long getCurrentPosition() {
        return this.f75148b.getCurrentPosition();
    }

    @Override // xyz.doikki.videoplayer.player.a
    public long getDuration() {
        return this.f75148b.getDuration();
    }

    @Override // xyz.doikki.videoplayer.player.a
    public float getSpeed() {
        try {
            float speed = this.f75148b.getPlaybackParams().getSpeed();
            if (speed == 0.0f) {
                return 1.0f;
            }
            return speed;
        } catch (Exception unused) {
            return 1.0f;
        }
    }

    @Override // xyz.doikki.videoplayer.player.a
    public void initPlayer() {
        this.f75148b = new MediaPlayer();
        setOptions();
        this.f75148b.setAudioStreamType(3);
        this.f75148b.setOnErrorListener(this);
        this.f75148b.setOnCompletionListener(this);
        this.f75148b.setOnInfoListener(this);
        this.f75148b.setOnBufferingUpdateListener(this);
        this.f75148b.setOnPreparedListener(this);
        this.f75148b.setOnVideoSizeChangedListener(this);
    }

    @Override // xyz.doikki.videoplayer.player.a
    public boolean isPlaying() {
        return this.f75148b.isPlaying();
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public void onBufferingUpdate(MediaPlayer mediaPlayer, int i10) {
        this.f75149c = i10;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) {
        this.mPlayerEventListener.onCompletion();
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
        this.mPlayerEventListener.onError();
        return true;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(MediaPlayer mediaPlayer) {
        this.mPlayerEventListener.onPrepared();
        start();
        if (isVideo()) {
            return;
        }
        this.mPlayerEventListener.onInfo(3, 0);
    }

    @Override // xyz.doikki.videoplayer.player.a
    public void pause() {
        try {
            this.f75148b.pause();
        } catch (IllegalStateException unused) {
            this.mPlayerEventListener.onError();
        }
    }

    @Override // xyz.doikki.videoplayer.player.a
    public void release() {
        this.f75148b.setOnErrorListener(null);
        this.f75148b.setOnCompletionListener(null);
        this.f75148b.setOnInfoListener(null);
        this.f75148b.setOnBufferingUpdateListener(null);
        this.f75148b.setOnPreparedListener(null);
        this.f75148b.setOnVideoSizeChangedListener(null);
        stop();
        MediaPlayer mediaPlayer = this.f75148b;
        this.f75148b = null;
        new a(mediaPlayer).start();
    }

    @Override // xyz.doikki.videoplayer.player.a
    public void seekTo(long j10) {
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                this.f75148b.seekTo(j10, 3);
            } else {
                this.f75148b.seekTo((int) j10);
            }
        } catch (IllegalStateException unused) {
            this.mPlayerEventListener.onError();
        }
    }

    @Override // xyz.doikki.videoplayer.player.a
    public void setDisplay(SurfaceHolder surfaceHolder) {
        try {
            this.f75148b.setDisplay(surfaceHolder);
        } catch (Exception unused) {
            this.mPlayerEventListener.onError();
        }
    }

    @Override // xyz.doikki.videoplayer.player.a
    public void setLooping(boolean z10) {
        this.f75148b.setLooping(z10);
    }

    @Override // xyz.doikki.videoplayer.player.a
    public void setSpeed(float f10) {
        try {
            MediaPlayer mediaPlayer = this.f75148b;
            mediaPlayer.setPlaybackParams(mediaPlayer.getPlaybackParams().setSpeed(f10));
        } catch (Exception unused) {
            this.mPlayerEventListener.onError();
        }
    }

    @Override // xyz.doikki.videoplayer.player.a
    public void setSurface(Surface surface) {
        try {
            this.f75148b.setSurface(surface);
        } catch (Exception unused) {
            this.mPlayerEventListener.onError();
        }
    }

    @Override // xyz.doikki.videoplayer.player.a
    public void setVolume(float f10, float f11) {
        this.f75148b.setVolume(f10, f11);
    }

    @Override // xyz.doikki.videoplayer.player.a
    public void start() {
        try {
            this.f75148b.start();
        } catch (IllegalStateException unused) {
            this.mPlayerEventListener.onError();
        }
    }

    @Override // xyz.doikki.videoplayer.player.a
    public void stop() {
        try {
            this.f75148b.stop();
        } catch (IllegalStateException unused) {
            this.mPlayerEventListener.onError();
        }
    }

    public b(Context context) {
        this.f75150d = context.getApplicationContext();
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i10, int i11) {
        int videoWidth = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        if (videoWidth != 0 && videoHeight != 0) {
            this.mPlayerEventListener.onVideoSizeChanged(videoWidth, videoHeight);
        }
    }

    @Override // xyz.doikki.videoplayer.player.a
    public void reset() {
        stop();
        this.f75148b.reset();
        this.f75148b.setSurface(null);
        this.f75148b.setDisplay(null);
        this.f75148b.setVolume(1.0f, 1.0f);
    }

    @Override // xyz.doikki.videoplayer.player.a
    public void setDataSource(AssetFileDescriptor assetFileDescriptor) {
        try {
            this.f75148b.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        } catch (Exception unused) {
            this.mPlayerEventListener.onError();
        }
    }
}
