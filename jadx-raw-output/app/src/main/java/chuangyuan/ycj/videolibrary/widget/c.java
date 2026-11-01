package chuangyuan.ycj.videolibrary.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatCheckBox;
import chuangyuan.ycj.videolibrary.R$id;
import chuangyuan.ycj.videolibrary.R$layout;

/* JADX INFO: compiled from: LockControlView.java */
/* JADX INFO: loaded from: classes7.dex */
public class c extends FrameLayout implements View.OnClickListener, s.a.InterfaceC0634a, s.a.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ExoDefaultTimeBar f6026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AppCompatCheckBox f6027c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f6028d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final BaseView f6029e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f6030f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public View f6031g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public View f6032h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Runnable f6033i;

    /* JADX INFO: compiled from: LockControlView.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (c.this.f6029e.i()) {
                if (c.this.f6027c.getVisibility() == 0) {
                    s.a.f(c.this.f6027c, false).start();
                } else {
                    s.a.c(c.this.f6027c).start();
                }
            }
        }
    }

    @Override // s.a.InterfaceC0634a
    public void a(boolean z10) {
        if (this.f6029e.i()) {
            if (!z10) {
                h(false);
                View view = this.f6032h;
                if (view != null) {
                    s.a.f(view, true).start();
                }
                View view2 = this.f6031g;
                if (view2 != null) {
                    s.a.d(view2, false);
                    return;
                }
                return;
            }
            g(0);
            h(true);
            View view3 = this.f6031g;
            if (view3 != null) {
                s.a.c(view3).start();
            }
            View view4 = this.f6032h;
            if (view4 != null) {
                s.a.c(view4).start();
            }
        }
    }

    @Override // s.a.b
    public void b(long j10, long j11, long j12) {
        if (this.f6026b != null) {
            if ((this.f6029e.i() && this.f6027c.isChecked()) || this.f6030f) {
                this.f6026b.setPosition(j10);
                this.f6026b.setBufferedPosition(j11);
                this.f6026b.setDuration(j12);
            }
        }
    }

    public boolean d() {
        AppCompatCheckBox appCompatCheckBox = this.f6027c;
        return appCompatCheckBox != null && appCompatCheckBox.isChecked();
    }

    public void f() {
        removeCallbacks(this.f6033i);
        this.f6029e.getPlaybackControlView().L(this);
    }

    public void g(int i10) {
        if (this.f6028d != null) {
            if (this.f6029e.i()) {
                if (this.f6027c.isChecked() && i10 == 0) {
                    this.f6029e.getPlaybackControlView().G();
                    this.f6029e.t(8, true);
                }
                this.f6027c.setVisibility(i10);
                if (this.f6029e.getAdRewardVisibilty()) {
                    this.f6027c.setVisibility(8);
                }
            } else {
                this.f6027c.setVisibility(8);
            }
            if (this.f6030f) {
                this.f6026b.setVisibility(i10 == 8 ? 0 : 8);
            } else {
                this.f6026b.setVisibility(8);
            }
        }
    }

    public void h(boolean z10) {
        if (this.f6029e.i()) {
            if (this.f6027c.isChecked()) {
                if (this.f6027c.getTranslationX() == 0.0f) {
                    s.a.f(this.f6027c, false).start();
                    return;
                } else {
                    s.a.c(this.f6027c).start();
                    return;
                }
            }
            if (z10) {
                s.a.c(this.f6027c).start();
            } else if (this.f6027c.getTag() == null) {
                s.a.f(this.f6027c, false).start();
            } else {
                this.f6027c.setTag(null);
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        removeCallbacks(this.f6033i);
        this.f6027c.setTag(Boolean.TRUE);
        if (!this.f6027c.isChecked()) {
            this.f6029e.G();
            this.f6027c.setTag(null);
            this.f6029e.f5957c.q();
            this.f6029e.getPlaybackControlView().S();
            return;
        }
        this.f6029e.K();
        this.f6029e.f5956b.setRequestedOrientation(14);
        this.f6029e.getPlaybackControlView().T();
        if (this.f6029e.f5957c.p()) {
            return;
        }
        postDelayed(this.f6033i, this.f6029e.f5957c.getControllerShowTimeoutMs());
    }

    public void setLockCheck(boolean z10) {
        this.f6027c.setChecked(z10);
    }

    public void setOpenLock(boolean z10) {
        this.f6027c.setVisibility(z10 ? 0 : 8);
    }

    public void setProgress(boolean z10) {
        this.f6030f = z10;
    }

    public c(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10, @NonNull BaseView baseView) {
        super(context, attributeSet, i10);
        this.f6030f = false;
        this.f6033i = new a();
        this.f6029e = baseView;
        View viewInflate = View.inflate(context, R$layout.simple_exo_play_lock, null);
        this.f6028d = viewInflate;
        viewInflate.setBackgroundColor(0);
        this.f6026b = (ExoDefaultTimeBar) this.f6028d.findViewById(R$id.exo_player_lock_progress);
        this.f6027c = (AppCompatCheckBox) this.f6028d.findViewById(R$id.exo_player_lock_btn_id);
        this.f6031g = baseView.getPlaybackControlView().findViewById(R$id.exo_controller_right);
        this.f6032h = baseView.getPlaybackControlView().findViewById(R$id.exo_controller_left);
        this.f6027c.setVisibility(8);
        this.f6027c.setOnClickListener(this);
        baseView.getPlaybackControlView().setAnimatorListener(this);
        baseView.getPlaybackControlView().y(this);
        addView(this.f6028d, getChildCount());
    }

    public void e() {
        f();
        AppCompatCheckBox appCompatCheckBox = this.f6027c;
        if (appCompatCheckBox != null) {
            appCompatCheckBox.setOnCheckedChangeListener(null);
        }
        AppCompatCheckBox appCompatCheckBox2 = this.f6027c;
        if (appCompatCheckBox2 != null && appCompatCheckBox2.animate() != null) {
            this.f6027c.animate().cancel();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f();
    }
}
