package xyz.doikki.videocontroller.component;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import xyz.doikki.videocontroller.R$id;
import xyz.doikki.videocontroller.R$layout;
import yo.b;

/* JADX INFO: loaded from: classes8.dex */
public class ErrorView extends LinearLayout implements b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f75104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f75105c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public yo.a f75106d;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ErrorView.this.setVisibility(8);
            ErrorView.this.f75106d.replay(false);
        }
    }

    public ErrorView(Context context) {
        this(context, null);
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
    public void onPlayStateChanged(int i10) {
        if (i10 == -1) {
            bringToFront();
            setVisibility(0);
        } else if (i10 == 0) {
            setVisibility(8);
        }
    }

    @Override // yo.b
    public void onPlayerStateChanged(int i10) {
    }

    public ErrorView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        setVisibility(8);
        LayoutInflater.from(getContext()).inflate(R$layout.dkplayer_layout_error_view, (ViewGroup) this, true);
        findViewById(R$id.status_btn).setOnClickListener(new a());
        setClickable(true);
    }

    @Override // yo.b
    public void a(@NonNull yo.a aVar) {
        this.f75106d = aVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 2) {
                float fAbs = Math.abs(motionEvent.getX() - this.f75104b);
                float fAbs2 = Math.abs(motionEvent.getY() - this.f75105c);
                if (fAbs > ViewConfiguration.get(getContext()).getScaledTouchSlop() || fAbs2 > ViewConfiguration.get(getContext()).getScaledTouchSlop()) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                }
            }
        } else {
            this.f75104b = motionEvent.getX();
            this.f75105c = motionEvent.getY();
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public ErrorView(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        setVisibility(8);
        LayoutInflater.from(getContext()).inflate(R$layout.dkplayer_layout_error_view, (ViewGroup) this, true);
        findViewById(R$id.status_btn).setOnClickListener(new a());
        setClickable(true);
    }
}
