package t;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import chuangyuan.ycj.videolibrary.widget.VideoPlayerView;
import com.google.android.exoplayer2.ui.PlayerControlView;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import k3.u0;
import p3.j;
import q.g;
import q.h;
import q.i;
import q.k;
import q.l;

/* JADX INFO: compiled from: VideoPlayerManager.java */
/* JADX INFO: loaded from: classes8.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public t.a f72081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f72082b;

    /* JADX INFO: compiled from: VideoPlayerManager.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Context f72083a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public VideoPlayerView f72084b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public PlayerControlView f72085c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public q.b f72086d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public t.c f72087e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f72088f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public com.google.android.exoplayer2.drm.a<j> f72089g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public g f72090h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public q.j f72091i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public i f72092j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public h f72093k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f72094l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final CopyOnWriteArraySet<k> f72095m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final CopyOnWriteArraySet<l> f72096n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public long f72097o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f72098p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public View.OnClickListener f72099q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public q.e f72100r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public boolean f72101s;

        /* JADX INFO: compiled from: VideoPlayerManager.java */
        public class a implements q.a {
            @Override // q.a
            public void onDestroy() {
            }

            public a() {
            }

            @Override // q.a
            public void h(u0 u0Var) {
                b.this.f72085c.setPlayer(u0Var);
            }
        }

        public b(Activity activity, int i10, @IdRes int i11) {
            this(i10, (VideoPlayerView) activity.findViewById(i11));
        }

        public b(int i10, @NonNull VideoPlayerView videoPlayerView) {
            this.f72088f = 1;
            this.f72094l = true;
            this.f72098p = -1;
            this.f72083a = s.e.n(videoPlayerView.getContext());
            this.f72084b = videoPlayerView;
            this.f72088f = i10;
            this.f72095m = new CopyOnWriteArraySet<>();
            this.f72096n = new CopyOnWriteArraySet<>();
        }

        public final void c() {
            if (this.f72087e == null) {
                try {
                    int i10 = u.a.f72508g;
                    this.f72087e = (t.c) u.a.class.getConstructor(Context.class, q.b.class).newInstance(this.f72083a, this.f72086d);
                } catch (Exception unused) {
                    this.f72087e = new t.c(this.f72083a, this.f72086d);
                }
            }
        }

        public b d(@NonNull t.c cVar) {
            this.f72087e = cVar;
            return this;
        }

        public b e(@NonNull g gVar) {
            this.f72090h = gVar;
            return this;
        }

        public b f(@NonNull h hVar) {
            this.f72093k = hVar;
            return this;
        }

        public b g(@NonNull q.j jVar) {
            this.f72091i = jVar;
            return this;
        }

        public b h(boolean z10) {
            this.f72094l = z10;
            return this;
        }

        public b i(boolean z10) {
            this.f72101s = z10;
            return this;
        }

        public b j(@NonNull String str) {
            this.f72084b.setTitle(str);
            return this;
        }

        public b k(boolean z10) {
            this.f72084b.setVerticalFullScreen(z10);
            return this;
        }

        public t.a b() {
            t.a aVar;
            c();
            if (this.f72084b != null) {
                aVar = new t.a(this.f72083a, this.f72087e, this.f72084b);
                aVar.e0(this.f72101s);
                t.b bVar = new t.b((Activity) this.f72084b.getContext(), aVar);
                if (this.f72088f == 1) {
                    bVar.J(this.f72090h);
                    bVar.L(this.f72092j);
                    bVar.M(this.f72091i);
                    bVar.K(this.f72093k);
                    aVar.s(bVar);
                }
                q.e eVar = this.f72100r;
                if (eVar != null) {
                    eVar.a(this.f72084b.getPreviewImage());
                }
                this.f72084b.setOnEndGestureListener(bVar);
                this.f72084b.setPlayerGestureOnTouch(this.f72094l);
                this.f72084b.setOnPlayClickListener(this.f72099q);
            } else {
                aVar = new t.a(this.f72083a, this.f72087e);
                aVar.s(new a());
            }
            aVar.y();
            aVar.X(this.f72089g);
            Iterator<k> it = this.f72095m.iterator();
            while (it.hasNext()) {
                aVar.v(it.next());
            }
            Iterator<l> it2 = this.f72096n.iterator();
            while (it2.hasNext()) {
                aVar.u(it2.next());
            }
            int i10 = this.f72098p;
            if (i10 != -1) {
                aVar.b0(i10, this.f72097o);
            } else {
                aVar.c0(this.f72097o);
            }
            return aVar;
        }
    }

    /* JADX INFO: compiled from: VideoPlayerManager.java */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static e f72103a = new e();
    }

    public e() {
        this.f72082b = false;
    }

    public static e a() {
        return c.f72103a;
    }

    @Nullable
    public t.a b() {
        t.a aVar = this.f72081a;
        if (aVar == null || aVar.D() == null) {
            return null;
        }
        return this.f72081a;
    }

    public boolean c() {
        return this.f72082b;
    }

    public void d() {
        t.a aVar = this.f72081a;
        if (aVar != null) {
            aVar.T();
        }
        this.f72081a = null;
    }

    public void e(boolean z10) {
        this.f72082b = z10;
    }

    public void f(@NonNull t.a aVar) {
        if (this.f72081a == null || !aVar.toString().equals(this.f72081a.toString())) {
            d();
        }
        this.f72081a = aVar;
    }
}
