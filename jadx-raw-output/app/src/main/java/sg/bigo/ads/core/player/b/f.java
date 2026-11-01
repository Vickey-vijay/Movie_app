package sg.bigo.ads.core.player.b;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.R;
import sg.bigo.ads.common.utils.u;

/* JADX INFO: loaded from: classes8.dex */
public abstract class f extends FrameLayout implements sg.bigo.ads.api.c.a, a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private ImageView f71872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public sg.bigo.ads.core.g.c f71873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public Context f71874c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final sg.bigo.ads.api.c.b f71875d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final sg.bigo.ads.core.a.a f71876e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f71877f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f71878g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ImageView f71879h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final View.OnClickListener f71880i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Runnable f71881j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f71882k;

    public f(@NonNull Context context, @NonNull sg.bigo.ads.api.c.b bVar, @Nullable sg.bigo.ads.core.a.a aVar) {
        super(context);
        this.f71877f = true;
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: sg.bigo.ads.core.player.b.f.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (view == f.this.f71872a) {
                    f.this.o();
                    return;
                }
                f fVar = f.this;
                if (view == fVar) {
                    fVar.p();
                }
            }
        };
        this.f71880i = onClickListener;
        this.f71881j = new Runnable() { // from class: sg.bigo.ads.core.player.b.f.2
            @Override // java.lang.Runnable
            public final void run() {
                f.this.setPlayOrPauseViewHidden(true);
            }
        };
        this.f71878g = false;
        this.f71882k = true;
        this.f71874c = context;
        this.f71875d = bVar;
        this.f71876e = aVar;
        if (!bVar.f69350c) {
            int iB = sg.bigo.ads.common.utils.a.b(context, R.dimen.bigo_ad_volume_padding);
            ImageView imageView = new ImageView(this.f71874c);
            this.f71872a = imageView;
            imageView.setOnClickListener(onClickListener);
            this.f71872a.setPadding(iB, iB, iB, iB);
            int iB2 = sg.bigo.ads.common.utils.a.b(this.f71874c, R.dimen.bigo_ad_volume_size) + (iB * 2);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iB2, iB2, 85);
            layoutParams.rightMargin = iB;
            layoutParams.bottomMargin = iB;
            this.f71872a.setVisibility(0);
            u.a(this.f71872a, this, layoutParams, -1);
        }
        int iB3 = sg.bigo.ads.common.utils.a.b(this.f71874c, R.dimen.bigo_ad_replay_size);
        if (aVar != null && aVar.x() == 2 && sg.bigo.ads.api.c.b.b() > 0) {
            iB3 = sg.bigo.ads.common.utils.e.a(this.f71874c, sg.bigo.ads.api.c.b.b());
        }
        ImageView imageView2 = new ImageView(this.f71874c);
        this.f71879h = imageView2;
        imageView2.setImageDrawable(sg.bigo.ads.common.utils.a.a(this.f71874c, R.drawable.bigo_ad_ic_media_play));
        u.a(this.f71879h, this, new FrameLayout.LayoutParams(iB3, iB3, 17), -1);
        setOnClickListener(onClickListener);
    }

    public final void a(String str, Object obj, @Nullable int[] iArr) {
        sg.bigo.ads.core.g.c cVar = this.f71873b;
        if (cVar != null) {
            cVar.a(str, obj, iArr);
        }
    }

    public final void a(String str, @Nullable int[] iArr) {
        sg.bigo.ads.core.g.c cVar = this.f71873b;
        if (cVar != null) {
            cVar.a(str, iArr);
        }
    }

    @CallSuper
    public void a(boolean z10) {
        this.f71878g = false;
    }

    public final void b(int i10) {
        sg.bigo.ads.core.a.a aVar = this.f71876e;
        if (aVar != null) {
            sg.bigo.ads.core.d.b.a(aVar, i10, aVar.aK(), this.f71876e.aM());
        }
    }

    public final void b(boolean z10) {
        ImageView imageView = this.f71872a;
        if (imageView != null) {
            imageView.setImageDrawable(sg.bigo.ads.common.utils.a.a(this.f71874c, z10 ? R.drawable.bigo_ad_ic_media_mute : R.drawable.bigo_ad_ic_media_unmute));
        }
    }

    public final void c(boolean z10) {
        ImageView imageView = this.f71879h;
        if (imageView != null) {
            imageView.setImageDrawable(sg.bigo.ads.common.utils.a.a(this.f71874c, z10 ? R.drawable.bigo_ad_ic_media_play : R.drawable.bigo_ad_ic_media_pause));
        }
    }

    public final void d(boolean z10) {
        if (z10) {
            sg.bigo.ads.core.player.d.a.f71905a.a(this);
        } else {
            sg.bigo.ads.core.player.d.a.f71905a.b(this);
        }
    }

    public final void e(boolean z10) {
        if (this.f71878g) {
            b(9);
        }
        a(z10);
    }

    public boolean e() {
        return false;
    }

    public boolean n() {
        return this.f71882k;
    }

    public final void o() {
        setMute(!c());
    }

    public final void p() {
        v();
    }

    public final boolean q() {
        return this.f71878g;
    }

    public final void r() {
        this.f71878g = false;
    }

    public final void s() {
        if (t()) {
            a();
        }
    }

    public void setNeedPauseWhenVisiblePercentEqual(boolean z10) {
        this.f71877f = z10;
    }

    public void setOnEventListener(sg.bigo.ads.core.g.c cVar) {
        this.f71873b = cVar;
    }

    public void setPlayOrPauseViewHidden(boolean z10) {
        ImageView imageView = this.f71879h;
        if (imageView != null) {
            imageView.setVisibility(z10 ? 8 : 0);
        }
    }

    public void setStatPrepareEventOnce(boolean z10) {
        this.f71882k = z10;
    }

    public void setVolumeViewHidden(boolean z10) {
        ImageView imageView = this.f71872a;
        if (imageView != null) {
            imageView.setVisibility(z10 ? 4 : 0);
        }
    }

    public final boolean t() {
        return getPlayStatus() == 2;
    }

    public final void u() {
        this.f71878g = true;
        a();
        b(8);
    }

    public final void v() {
        if (e()) {
            if (t()) {
                removeCallbacks(this.f71881j);
                u();
                setPlayOrPauseViewHidden(false);
                c(true);
                return;
            }
            removeCallbacks(this.f71881j);
            e(false);
            this.f71879h.setVisibility(0);
            setPlayOrPauseViewHidden(false);
            c(false);
            postDelayed(this.f71881j, 1500L);
        }
    }
}
