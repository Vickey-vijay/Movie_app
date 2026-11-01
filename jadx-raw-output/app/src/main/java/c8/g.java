package c8;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.View;
import com.luck.picture.lib.config.PictureSelectionConfig;
import com.luck.picture.lib.entity.LocalMedia;
import com.luck.picture.lib.widget.MediaPlayerView;
import f8.q;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: MediaPlayerEngine.java */
/* JADX INFO: loaded from: classes11.dex */
public class g implements k<MediaPlayerView> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList<q> f5697a = new CopyOnWriteArrayList<>();

    /* JADX INFO: compiled from: MediaPlayerEngine.java */
    public class a implements MediaPlayer.OnPreparedListener {
        public a() {
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            mediaPlayer.start();
            for (int i10 = 0; i10 < g.this.f5697a.size(); i10++) {
                ((q) g.this.f5697a.get(i10)).a();
            }
        }
    }

    /* JADX INFO: compiled from: MediaPlayerEngine.java */
    public class b implements MediaPlayer.OnCompletionListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MediaPlayerView f5699b;

        public b(MediaPlayerView mediaPlayerView) {
            this.f5699b = mediaPlayerView;
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            mediaPlayer.reset();
            for (int i10 = 0; i10 < g.this.f5697a.size(); i10++) {
                ((q) g.this.f5697a.get(i10)).b();
            }
            this.f5699b.b();
        }
    }

    /* JADX INFO: compiled from: MediaPlayerEngine.java */
    public class c implements MediaPlayer.OnErrorListener {
        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
            for (int i12 = 0; i12 < g.this.f5697a.size(); i12++) {
                ((q) g.this.f5697a.get(i12)).onPlayerError();
            }
            return false;
        }

        public c() {
        }
    }

    @Override // c8.k
    public void a(q qVar) {
        if (this.f5697a.contains(qVar)) {
            return;
        }
        this.f5697a.add(qVar);
    }

    @Override // c8.k
    public View f(Context context) {
        return new MediaPlayerView(context);
    }

    @Override // c8.k
    public void h(q qVar) {
        if (qVar != null) {
            this.f5697a.remove(qVar);
        } else {
            this.f5697a.clear();
        }
    }

    @Override // c8.k
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void b(MediaPlayerView mediaPlayerView) {
        mediaPlayerView.e();
    }

    @Override // c8.k
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public boolean e(MediaPlayerView mediaPlayerView) {
        MediaPlayer mediaPlayer = mediaPlayerView.getMediaPlayer();
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            return true;
        }
        return false;
    }

    @Override // c8.k
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void j(MediaPlayerView mediaPlayerView) {
        MediaPlayer mediaPlayer = mediaPlayerView.getMediaPlayer();
        if (mediaPlayer != null) {
            mediaPlayer.pause();
        }
    }

    @Override // c8.k
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void d(MediaPlayerView mediaPlayerView) {
        MediaPlayer mediaPlayerD = mediaPlayerView.d();
        mediaPlayerD.setOnPreparedListener(new a());
        mediaPlayerD.setOnCompletionListener(new b(mediaPlayerView));
        mediaPlayerD.setOnErrorListener(new c());
    }

    @Override // c8.k
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void i(MediaPlayerView mediaPlayerView) {
        mediaPlayerView.e();
    }

    @Override // c8.k
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void g(MediaPlayerView mediaPlayerView) {
        MediaPlayer mediaPlayer = mediaPlayerView.getMediaPlayer();
        if (mediaPlayer != null) {
            mediaPlayer.start();
        }
    }

    @Override // c8.k
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public void c(MediaPlayerView mediaPlayerView, LocalMedia localMedia) {
        mediaPlayerView.getMediaPlayer().setLooping(PictureSelectionConfig.e().D0);
        mediaPlayerView.f(localMedia.f());
    }
}
