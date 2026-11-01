package yo;

/* JADX INFO: compiled from: MediaPlayerControl.java */
/* JADX INFO: loaded from: classes4.dex */
public interface e {
    int getBufferedPercentage();

    long getCurrentPosition();

    long getDuration();

    float getSpeed();

    boolean isFullScreen();

    boolean isPlaying();

    void pause();

    void replay(boolean z10);

    void seekTo(long j10);

    void start();

    void startFullScreen();

    void stopFullScreen();
}
