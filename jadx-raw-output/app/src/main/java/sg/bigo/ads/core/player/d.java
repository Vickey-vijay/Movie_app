package sg.bigo.ads.core.player;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import sg.bigo.ads.core.player.b.f;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements sg.bigo.ads.common.aa.b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f71900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final Handler f71901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList<WeakReference<View>> f71902c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Runnable f71903d;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final d f71905a = new d(0);
    }

    private d() {
        this.f71900a = false;
        this.f71901b = new Handler(Looper.getMainLooper());
        this.f71902c = new ArrayList<>();
        this.f71903d = new Runnable() { // from class: sg.bigo.ads.core.player.d.1
            @Override // java.lang.Runnable
            public final void run() {
                if (d.this.a()) {
                    d.this.f71901b.postDelayed(this, 500L);
                }
            }
        };
    }

    public /* synthetic */ d(byte b10) {
        this();
    }

    private synchronized void b() {
        c();
        sg.bigo.ads.common.t.a.a(0, 3, "VideoPlayerManager", "startCheckTask called");
        this.f71901b.post(this.f71903d);
    }

    private synchronized void c() {
        sg.bigo.ads.common.t.a.a(0, 3, "VideoPlayerManager", "removeCheckTask called");
        this.f71901b.removeCallbacksAndMessages(null);
        a();
    }

    @Override // sg.bigo.ads.common.aa.b.a
    public final void a(int i10) {
        if (i10 == 1) {
            b();
        }
    }

    public final synchronized void a(@NonNull f fVar) {
        boolean z10;
        Iterator<WeakReference<View>> it = this.f71902c.iterator();
        while (true) {
            if (!it.hasNext()) {
                z10 = false;
                break;
            }
            View view = it.next().get();
            if (view == null) {
                it.remove();
            } else if (view == fVar) {
                z10 = true;
                break;
            }
        }
        if (z10) {
            sg.bigo.ads.common.t.a.b("VideoPlayerManager", "register playerView exist already");
            return;
        }
        this.f71902c.add(new WeakReference<>(fVar));
        sg.bigo.ads.common.t.a.a(0, 3, "VideoPlayerManager", "register playerView, size = " + this.f71902c.size());
        b();
        if (!this.f71900a) {
            this.f71900a = true;
            sg.bigo.ads.common.aa.b.a(fVar.getContext().getApplicationContext(), this);
        }
    }

    public final synchronized boolean a() {
        f fVar;
        int playStatus;
        if (this.f71902c.isEmpty()) {
            return false;
        }
        View view = null;
        Iterator<WeakReference<View>> it = this.f71902c.iterator();
        boolean z10 = false;
        int i10 = 0;
        while (it.hasNext()) {
            View view2 = it.next().get();
            if (view2 instanceof f) {
                z10 = view2.getContext() != null && sg.bigo.ads.common.aa.b.a(view2.getContext().getApplicationContext());
                Rect rect = new Rect();
                float f10 = 0.0f;
                if (sg.bigo.ads.common.ab.a.a(view2, rect)) {
                    float height = view2.getHeight() * 1.0f * view2.getWidth();
                    float fHeight = rect.height() * 1.0f * rect.width();
                    if (height <= 0.0f) {
                        sg.bigo.ads.common.t.a.a(0, 3, "ImpressionChecker", "adView is not visible, width or height is 0");
                    } else {
                        f10 = fHeight / height;
                    }
                }
                int i11 = (int) (100.0f * f10);
                if (i11 < i10 || i11 < 50 || !z10) {
                    ((f) view2).s();
                } else {
                    if (i11 == i10) {
                        f fVar2 = (f) view;
                        if (fVar2.f71877f) {
                            fVar2.s();
                        }
                    } else {
                        i10 = i11;
                    }
                    view = view2;
                }
            } else {
                it.remove();
                sg.bigo.ads.common.t.a.a(0, 3, "VideoPlayerManager", "playView is recycled, remove it");
            }
        }
        if (view != null && (playStatus = (fVar = (f) view).getPlayStatus()) != 2 && playStatus != 5 && playStatus != 0) {
            fVar.b();
        }
        return z10;
    }

    public final synchronized void b(@NonNull f fVar) {
        Iterator<WeakReference<View>> it = this.f71902c.iterator();
        while (it.hasNext()) {
            View view = it.next().get();
            if (view != null) {
                if (view == fVar) {
                    fVar.s();
                }
            }
            it.remove();
        }
        sg.bigo.ads.common.t.a.a(0, 3, "VideoPlayerManager", "unregister player, size = " + this.f71902c.size());
        if (this.f71902c.isEmpty()) {
            c();
        }
    }
}
