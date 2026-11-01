package se;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.os.Vibrator;
import android.util.Log;
import com.yzq.zxinglibrary.R$raw;
import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: compiled from: BeepManager.java */
/* JADX INFO: loaded from: classes10.dex */
public final class a implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, Closeable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f67230f = a.class.getSimpleName();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Activity f67231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public MediaPlayer f67232c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f67233d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f67234e;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        MediaPlayer mediaPlayer = this.f67232c;
        if (mediaPlayer != null) {
            mediaPlayer.release();
            this.f67232c = null;
        }
    }

    @SuppressLint({"MissingPermission"})
    public synchronized void d() {
        MediaPlayer mediaPlayer;
        if (this.f67233d && (mediaPlayer = this.f67232c) != null) {
            mediaPlayer.start();
        }
        if (this.f67234e) {
            ((Vibrator) this.f67231b.getSystemService("vibrator")).vibrate(200L);
        }
    }

    public synchronized void h() {
        if (this.f67233d && this.f67232c == null) {
            this.f67231b.setVolumeControlStream(3);
            this.f67232c = a(this.f67231b);
        }
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) {
        mediaPlayer.seekTo(0);
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public synchronized boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
        try {
            if (i10 == 100) {
                this.f67231b.finish();
            } else {
                mediaPlayer.release();
                this.f67232c = null;
                h();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return true;
    }

    public final MediaPlayer a(Context context) {
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setAudioStreamType(3);
        mediaPlayer.setOnCompletionListener(this);
        mediaPlayer.setOnErrorListener(this);
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = context.getResources().openRawResourceFd(R$raw.beep);
            try {
                mediaPlayer.setDataSource(assetFileDescriptorOpenRawResourceFd.getFileDescriptor(), assetFileDescriptorOpenRawResourceFd.getStartOffset(), assetFileDescriptorOpenRawResourceFd.getLength());
                assetFileDescriptorOpenRawResourceFd.close();
                mediaPlayer.setVolume(0.1f, 0.1f);
                mediaPlayer.prepare();
                return mediaPlayer;
            } catch (Throwable th2) {
                assetFileDescriptorOpenRawResourceFd.close();
                throw th2;
            }
        } catch (IOException e10) {
            Log.w(f67230f, e10);
            mediaPlayer.release();
            return null;
        }
    }

    public void e(boolean z10) {
        this.f67233d = z10;
    }

    public void f(boolean z10) {
        this.f67234e = z10;
    }

    public a(Activity activity) {
        this.f67231b = activity;
        h();
    }
}
