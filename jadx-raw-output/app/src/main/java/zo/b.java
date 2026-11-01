package zo;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import xyz.doikki.videoplayer.player.BaseVideoView;

/* JADX INFO: compiled from: AudioFocusHelper.java */
/* JADX INFO: loaded from: classes5.dex */
public final class b implements AudioManager.OnAudioFocusChangeListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakReference<BaseVideoView> f86515c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AudioManager f86516d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f86514b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f86517e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f86518f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f86519g = 0;

    /* JADX INFO: compiled from: AudioFocusHelper.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f86520b;

        public a(int i10) {
            this.f86520b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.c(this.f86520b);
        }
    }

    public void a() {
        AudioManager audioManager = this.f86516d;
        if (audioManager == null) {
            return;
        }
        this.f86517e = false;
        audioManager.abandonAudioFocus(this);
    }

    public final void c(int i10) {
        BaseVideoView baseVideoView = this.f86515c.get();
        if (baseVideoView == null) {
            return;
        }
        if (i10 == -3) {
            if (!baseVideoView.isPlaying() || baseVideoView.isMute()) {
                return;
            }
            baseVideoView.setVolume(0.1f, 0.1f);
            return;
        }
        if (i10 == -2 || i10 == -1) {
            if (baseVideoView.isPlaying()) {
                this.f86518f = true;
                baseVideoView.pause();
                return;
            }
            return;
        }
        if (i10 == 1 || i10 == 2) {
            if (this.f86517e || this.f86518f) {
                baseVideoView.start();
                this.f86517e = false;
                this.f86518f = false;
            }
            if (baseVideoView.isMute()) {
                return;
            }
            baseVideoView.setVolume(1.0f, 1.0f);
        }
    }

    public void d() {
        AudioManager audioManager;
        if (this.f86519g == 1 || (audioManager = this.f86516d) == null) {
            return;
        }
        if (1 == audioManager.requestAudioFocus(this, 3, 1)) {
            this.f86519g = 1;
        } else {
            this.f86517e = true;
        }
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public void onAudioFocusChange(int i10) {
        if (this.f86519g == i10) {
            return;
        }
        this.f86514b.post(new a(i10));
        this.f86519g = i10;
    }

    public b(@NonNull BaseVideoView baseVideoView) {
        this.f86515c = new WeakReference<>(baseVideoView);
        this.f86516d = (AudioManager) baseVideoView.getContext().getApplicationContext().getSystemService("audio");
    }
}
