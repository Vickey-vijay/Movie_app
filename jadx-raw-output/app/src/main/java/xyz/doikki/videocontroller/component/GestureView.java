package xyz.doikki.videocontroller.component;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import xyz.doikki.videocontroller.R$drawable;
import xyz.doikki.videocontroller.R$id;
import xyz.doikki.videocontroller.R$layout;
import yo.c;

/* JADX INFO: loaded from: classes7.dex */
public class GestureView extends FrameLayout implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public yo.a f75108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f75109c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ProgressBar f75110d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f75111e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinearLayout f75112f;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            GestureView.this.f75112f.setVisibility(8);
        }
    }

    public GestureView(@NonNull Context context) {
        super(context);
        setVisibility(8);
        LayoutInflater.from(getContext()).inflate(R$layout.dkplayer_layout_gesture_control_view, (ViewGroup) this, true);
        this.f75109c = (ImageView) findViewById(R$id.iv_icon);
        this.f75110d = (ProgressBar) findViewById(R$id.pro_percent);
        this.f75111e = (TextView) findViewById(R$id.tv_percent);
        this.f75112f = (LinearLayout) findViewById(R$id.center_container);
    }

    @Override // yo.b
    public void b(boolean z10) {
    }

    @Override // yo.b
    public void e(boolean z10, Animation animation) {
    }

    @Override // yo.b
    public void f(int i10, int i11) {
    }

    @Override // yo.b
    public View getView() {
        return this;
    }

    @Override // yo.b
    public void onPlayerStateChanged(int i10) {
    }

    @Override // yo.b
    public void a(@NonNull yo.a aVar) {
        this.f75108b = aVar;
    }

    @Override // yo.c
    public void c(int i10) {
        this.f75110d.setVisibility(0);
        if (i10 <= 0) {
            this.f75109c.setImageResource(R$drawable.dkplayer_ic_action_volume_off);
        } else {
            this.f75109c.setImageResource(R$drawable.dkplayer_ic_action_volume_up);
        }
        this.f75111e.setText(i10 + "%");
        this.f75110d.setProgress(i10);
    }

    @Override // yo.c
    public void d(int i10, int i11, int i12) {
        this.f75110d.setVisibility(8);
        if (i10 > i11) {
            this.f75109c.setImageResource(R$drawable.dkplayer_ic_action_fast_forward);
        } else {
            this.f75109c.setImageResource(R$drawable.dkplayer_ic_action_fast_rewind);
        }
        this.f75111e.setText(String.format("%s/%s", bp.c.m(i10), bp.c.m(i12)));
    }

    @Override // yo.c
    public void g() {
        this.f75108b.hide();
        this.f75112f.setVisibility(0);
        this.f75112f.setAlpha(1.0f);
    }

    @Override // yo.c
    public void h() {
        this.f75112f.animate().alpha(0.0f).setDuration(300L).setListener(new a()).start();
    }

    @Override // yo.c
    public void i(int i10) {
        this.f75110d.setVisibility(0);
        this.f75109c.setImageResource(R$drawable.dkplayer_ic_action_brightness);
        this.f75111e.setText(i10 + "%");
        this.f75110d.setProgress(i10);
    }

    @Override // yo.b
    public void onPlayStateChanged(int i10) {
        if (i10 == 0 || i10 == 8 || i10 == 1 || i10 == 2 || i10 == -1 || i10 == 5) {
            setVisibility(8);
        } else {
            setVisibility(0);
        }
    }

    public GestureView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        setVisibility(8);
        LayoutInflater.from(getContext()).inflate(R$layout.dkplayer_layout_gesture_control_view, (ViewGroup) this, true);
        this.f75109c = (ImageView) findViewById(R$id.iv_icon);
        this.f75110d = (ProgressBar) findViewById(R$id.pro_percent);
        this.f75111e = (TextView) findViewById(R$id.tv_percent);
        this.f75112f = (LinearLayout) findViewById(R$id.center_container);
    }

    public GestureView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        setVisibility(8);
        LayoutInflater.from(getContext()).inflate(R$layout.dkplayer_layout_gesture_control_view, (ViewGroup) this, true);
        this.f75109c = (ImageView) findViewById(R$id.iv_icon);
        this.f75110d = (ProgressBar) findViewById(R$id.pro_percent);
        this.f75111e = (TextView) findViewById(R$id.tv_percent);
        this.f75112f = (LinearLayout) findViewById(R$id.center_container);
    }
}
