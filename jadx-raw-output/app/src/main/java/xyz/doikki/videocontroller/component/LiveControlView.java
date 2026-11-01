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
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import bp.c;
import xyz.doikki.videocontroller.R$id;
import xyz.doikki.videocontroller.R$layout;
import yo.a;
import yo.b;

/* JADX INFO: loaded from: classes3.dex */
public class LiveControlView extends FrameLayout implements b, View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f75114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f75115c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinearLayout f75116d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ImageView f75117e;

    public LiveControlView(@NonNull Context context) {
        super(context);
        setVisibility(8);
        LayoutInflater.from(getContext()).inflate(R$layout.dkplayer_layout_live_control_view, (ViewGroup) this, true);
        ImageView imageView = (ImageView) findViewById(R$id.fullscreen);
        this.f75115c = imageView;
        imageView.setOnClickListener(this);
        this.f75116d = (LinearLayout) findViewById(R$id.bottom_container);
        ImageView imageView2 = (ImageView) findViewById(R$id.iv_play);
        this.f75117e = imageView2;
        imageView2.setOnClickListener(this);
        ((ImageView) findViewById(R$id.iv_refresh)).setOnClickListener(this);
    }

    @Override // yo.b
    public void f(int i10, int i11) {
    }

    @Override // yo.b
    public View getView() {
        return this;
    }

    @Override // yo.b
    public void a(@NonNull a aVar) {
        this.f75114b = aVar;
    }

    @Override // yo.b
    public void b(boolean z10) {
        e(!z10, null);
    }

    @Override // yo.b
    public void e(boolean z10, Animation animation) {
        if (z10) {
            if (getVisibility() == 8) {
                setVisibility(0);
                if (animation != null) {
                    startAnimation(animation);
                    return;
                }
                return;
            }
            return;
        }
        if (getVisibility() == 0) {
            setVisibility(8);
            if (animation != null) {
                startAnimation(animation);
            }
        }
    }

    @Override // yo.b
    public void onPlayerStateChanged(int i10) {
        if (i10 == 10) {
            this.f75115c.setSelected(false);
        } else if (i10 == 11) {
            this.f75115c.setSelected(true);
        }
        Activity activityL = c.l(getContext());
        if (activityL == null || !this.f75114b.hasCutout()) {
            return;
        }
        int requestedOrientation = activityL.getRequestedOrientation();
        int cutoutHeight = this.f75114b.getCutoutHeight();
        if (requestedOrientation == 1) {
            this.f75116d.setPadding(0, 0, 0, 0);
        } else if (requestedOrientation == 0) {
            this.f75116d.setPadding(cutoutHeight, 0, 0, 0);
        } else if (requestedOrientation == 8) {
            this.f75116d.setPadding(0, 0, cutoutHeight, 0);
        }
    }

    public final void j() {
        this.f75114b.a(c.l(getContext()));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == R$id.fullscreen) {
            j();
        } else if (id2 == R$id.iv_play) {
            this.f75114b.c();
        } else if (id2 == R$id.iv_refresh) {
            this.f75114b.replay(true);
        }
    }

    @Override // yo.b
    public void onPlayStateChanged(int i10) {
        switch (i10) {
            case -1:
            case 0:
            case 1:
            case 2:
            case 5:
            case 8:
                setVisibility(8);
                break;
            case 3:
                this.f75117e.setSelected(true);
                break;
            case 4:
                this.f75117e.setSelected(false);
                break;
            case 6:
            case 7:
                this.f75117e.setSelected(this.f75114b.isPlaying());
                break;
        }
    }

    public LiveControlView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        setVisibility(8);
        LayoutInflater.from(getContext()).inflate(R$layout.dkplayer_layout_live_control_view, (ViewGroup) this, true);
        ImageView imageView = (ImageView) findViewById(R$id.fullscreen);
        this.f75115c = imageView;
        imageView.setOnClickListener(this);
        this.f75116d = (LinearLayout) findViewById(R$id.bottom_container);
        ImageView imageView2 = (ImageView) findViewById(R$id.iv_play);
        this.f75117e = imageView2;
        imageView2.setOnClickListener(this);
        ((ImageView) findViewById(R$id.iv_refresh)).setOnClickListener(this);
    }

    public LiveControlView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        setVisibility(8);
        LayoutInflater.from(getContext()).inflate(R$layout.dkplayer_layout_live_control_view, (ViewGroup) this, true);
        ImageView imageView = (ImageView) findViewById(R$id.fullscreen);
        this.f75115c = imageView;
        imageView.setOnClickListener(this);
        this.f75116d = (LinearLayout) findViewById(R$id.bottom_container);
        ImageView imageView2 = (ImageView) findViewById(R$id.iv_play);
        this.f75117e = imageView2;
        imageView2.setOnClickListener(this);
        ((ImageView) findViewById(R$id.iv_refresh)).setOnClickListener(this);
    }
}
