package yo;

import android.app.Activity;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: ControlWrapper.java */
/* JADX INFO: loaded from: classes4.dex */
public class a implements e, d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f85851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f85852c;

    public void a(Activity activity) {
        if (activity == null || activity.isFinishing()) {
            return;
        }
        if (isFullScreen()) {
            activity.setRequestedOrientation(1);
            stopFullScreen();
        } else {
            activity.setRequestedOrientation(0);
            startFullScreen();
        }
    }

    @Override // yo.e
    public int getBufferedPercentage() {
        return this.f85851b.getBufferedPercentage();
    }

    @Override // yo.e
    public long getCurrentPosition() {
        return this.f85851b.getCurrentPosition();
    }

    @Override // yo.d
    public int getCutoutHeight() {
        return this.f85852c.getCutoutHeight();
    }

    @Override // yo.e
    public long getDuration() {
        return this.f85851b.getDuration();
    }

    @Override // yo.e
    public float getSpeed() {
        return this.f85851b.getSpeed();
    }

    @Override // yo.d
    public boolean hasCutout() {
        return this.f85852c.hasCutout();
    }

    @Override // yo.d
    public void hide() {
        this.f85852c.hide();
    }

    @Override // yo.e
    public boolean isFullScreen() {
        return this.f85851b.isFullScreen();
    }

    @Override // yo.d
    public boolean isLocked() {
        return this.f85852c.isLocked();
    }

    @Override // yo.e
    public boolean isPlaying() {
        return this.f85851b.isPlaying();
    }

    @Override // yo.d
    public boolean isShowing() {
        return this.f85852c.isShowing();
    }

    @Override // yo.e
    public void pause() {
        this.f85851b.pause();
    }

    @Override // yo.e
    public void replay(boolean z10) {
        this.f85851b.replay(z10);
    }

    @Override // yo.e
    public void seekTo(long j10) {
        this.f85851b.seekTo(j10);
    }

    @Override // yo.d
    public void setLocked(boolean z10) {
        this.f85852c.setLocked(z10);
    }

    @Override // yo.d
    public void show() {
        this.f85852c.show();
    }

    @Override // yo.e
    public void start() {
        this.f85851b.start();
    }

    @Override // yo.d
    public void startFadeOut() {
        this.f85852c.startFadeOut();
    }

    @Override // yo.e
    public void startFullScreen() {
        this.f85851b.startFullScreen();
    }

    @Override // yo.d
    public void startProgress() {
        this.f85852c.startProgress();
    }

    @Override // yo.d
    public void stopFadeOut() {
        this.f85852c.stopFadeOut();
    }

    @Override // yo.e
    public void stopFullScreen() {
        this.f85851b.stopFullScreen();
    }

    @Override // yo.d
    public void stopProgress() {
        this.f85852c.stopProgress();
    }

    public a(@NonNull e eVar, @NonNull d dVar) {
        this.f85851b = eVar;
        this.f85852c = dVar;
    }

    public void b() {
        setLocked(!isLocked());
    }

    public void c() {
        if (isPlaying()) {
            pause();
        } else {
            start();
        }
    }

    public void d() {
        if (isShowing()) {
            hide();
        } else {
            show();
        }
    }
}
