package xyz.doikki.videocontroller.component;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import bp.c;
import xyz.doikki.videocontroller.R$id;
import xyz.doikki.videocontroller.R$layout;

/* JADX INFO: loaded from: classes11.dex */
public class CompleteView extends FrameLayout implements yo.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public yo.a f75100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f75101c;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CompleteView.this.f75100b.replay(true);
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Activity activityL;
            if (!CompleteView.this.f75100b.isFullScreen() || (activityL = c.l(CompleteView.this.getContext())) == null || activityL.isFinishing()) {
                return;
            }
            activityL.setRequestedOrientation(1);
            CompleteView.this.f75100b.stopFullScreen();
        }
    }

    public CompleteView(@NonNull Context context) {
        super(context);
        setVisibility(8);
        LayoutInflater.from(getContext()).inflate(R$layout.dkplayer_layout_complete_view, (ViewGroup) this, true);
        findViewById(R$id.iv_replay).setOnClickListener(new a());
        ImageView imageView = (ImageView) findViewById(R$id.stop_fullscreen);
        this.f75101c = imageView;
        imageView.setOnClickListener(new b());
        setClickable(true);
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
    public void a(@NonNull yo.a aVar) {
        this.f75100b = aVar;
    }

    @Override // yo.b
    public void onPlayStateChanged(int i10) {
        if (i10 != 5) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        this.f75101c.setVisibility(this.f75100b.isFullScreen() ? 0 : 8);
        bringToFront();
    }

    @Override // yo.b
    public void onPlayerStateChanged(int i10) {
        if (i10 == 11) {
            this.f75101c.setVisibility(0);
        } else if (i10 == 10) {
            this.f75101c.setVisibility(8);
        }
        Activity activityL = c.l(getContext());
        if (activityL == null || !this.f75100b.hasCutout()) {
            return;
        }
        int requestedOrientation = activityL.getRequestedOrientation();
        int cutoutHeight = this.f75100b.getCutoutHeight();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f75101c.getLayoutParams();
        if (requestedOrientation == 1) {
            layoutParams.setMargins(0, 0, 0, 0);
        } else if (requestedOrientation == 0) {
            layoutParams.setMargins(cutoutHeight, 0, 0, 0);
        } else if (requestedOrientation == 8) {
            layoutParams.setMargins(0, 0, 0, 0);
        }
    }

    public CompleteView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        setVisibility(8);
        LayoutInflater.from(getContext()).inflate(R$layout.dkplayer_layout_complete_view, (ViewGroup) this, true);
        findViewById(R$id.iv_replay).setOnClickListener(new a());
        ImageView imageView = (ImageView) findViewById(R$id.stop_fullscreen);
        this.f75101c = imageView;
        imageView.setOnClickListener(new b());
        setClickable(true);
    }

    public CompleteView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        setVisibility(8);
        LayoutInflater.from(getContext()).inflate(R$layout.dkplayer_layout_complete_view, (ViewGroup) this, true);
        findViewById(R$id.iv_replay).setOnClickListener(new a());
        ImageView imageView = (ImageView) findViewById(R$id.stop_fullscreen);
        this.f75101c = imageView;
        imageView.setOnClickListener(new b());
        setClickable(true);
    }
}
