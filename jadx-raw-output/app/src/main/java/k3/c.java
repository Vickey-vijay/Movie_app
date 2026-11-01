package k3;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: compiled from: AudioFocusManager.java */
/* JADX INFO: loaded from: classes8.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AudioManager f62060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f62061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public b f62062c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public m3.c f62063d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f62065f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public AudioFocusRequest f62067h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f62068i;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f62066g = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f62064e = 0;

    /* JADX INFO: compiled from: AudioFocusManager.java */
    public class a implements AudioManager.OnAudioFocusChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Handler f62069b;

        public a(Handler handler) {
            this.f62069b = handler;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(int i10) {
            c.this.g(i10);
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(final int i10) {
            this.f62069b.post(new Runnable() { // from class: k3.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.f62058b.b(i10);
                }
            });
        }
    }

    /* JADX INFO: compiled from: AudioFocusManager.java */
    public interface b {
        void executePlayerCommand(int i10);

        void setVolumeMultiplier(float f10);
    }

    public final void g(int i10) {
        if (i10 == -3 || i10 == -2) {
            if (i10 != -2 && !o()) {
                l(3);
                return;
            } else {
                e(0);
                l(2);
                return;
            }
        }
        if (i10 == -1) {
            e(-1);
            a();
        } else if (i10 == 1) {
            l(1);
            e(1);
        } else {
            g5.m.h("AudioFocusManager", "Unknown focus change type: " + i10);
        }
    }

    public void h() {
        this.f62062c = null;
        a();
    }

    public final boolean m(int i10) {
        return i10 == 1 || this.f62065f != 1;
    }

    public final void a() {
        if (this.f62064e == 0) {
            return;
        }
        if (g5.k0.f53108a >= 26) {
            c();
        } else {
            b();
        }
        l(0);
    }

    public final void b() {
        this.f62060a.abandonAudioFocus(this.f62061b);
    }

    @RequiresApi(26)
    public final void c() {
        AudioFocusRequest audioFocusRequest = this.f62067h;
        if (audioFocusRequest != null) {
            this.f62060a.abandonAudioFocusRequest(audioFocusRequest);
        }
    }

    public final void e(int i10) {
        b bVar = this.f62062c;
        if (bVar != null) {
            bVar.executePlayerCommand(i10);
        }
    }

    public float f() {
        return this.f62066g;
    }

    public final int i() {
        if (this.f62064e == 1) {
            return 1;
        }
        if ((g5.k0.f53108a >= 26 ? k() : j()) == 1) {
            l(1);
            return 1;
        }
        l(0);
        return -1;
    }

    public final int j() {
        return this.f62060a.requestAudioFocus(this.f62061b, g5.k0.U(((m3.c) g5.a.e(this.f62063d)).f63967c), this.f62065f);
    }

    @RequiresApi(26)
    public final int k() {
        AudioFocusRequest audioFocusRequest = this.f62067h;
        if (audioFocusRequest == null || this.f62068i) {
            this.f62067h = (audioFocusRequest == null ? new AudioFocusRequest.Builder(this.f62065f) : new AudioFocusRequest.Builder(this.f62067h)).setAudioAttributes(((m3.c) g5.a.e(this.f62063d)).a()).setWillPauseWhenDucked(o()).setOnAudioFocusChangeListener(this.f62061b).build();
            this.f62068i = false;
        }
        return this.f62060a.requestAudioFocus(this.f62067h);
    }

    public final void l(int i10) {
        if (this.f62064e == i10) {
            return;
        }
        this.f62064e = i10;
        float f10 = i10 == 3 ? 0.2f : 1.0f;
        if (this.f62066g == f10) {
            return;
        }
        this.f62066g = f10;
        b bVar = this.f62062c;
        if (bVar != null) {
            bVar.setVolumeMultiplier(f10);
        }
    }

    public final boolean o() {
        m3.c cVar = this.f62063d;
        return cVar != null && cVar.f63965a == 1;
    }

    public c(Context context, Handler handler, b bVar) {
        this.f62060a = (AudioManager) context.getApplicationContext().getSystemService("audio");
        this.f62062c = bVar;
        this.f62061b = new a(handler);
    }

    public int n(boolean z10, int i10) {
        if (m(i10)) {
            a();
            if (!z10) {
                return -1;
            }
            return 1;
        }
        if (!z10) {
            return -1;
        }
        return i();
    }
}
