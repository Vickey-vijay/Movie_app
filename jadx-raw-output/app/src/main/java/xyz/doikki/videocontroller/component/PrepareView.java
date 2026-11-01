package xyz.doikki.videocontroller.component;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import xyz.doikki.videocontroller.R$id;
import xyz.doikki.videocontroller.R$layout;
import zo.f;

/* JADX INFO: loaded from: classes4.dex */
public class PrepareView extends FrameLayout implements yo.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public yo.a f75118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f75119c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f75120d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ProgressBar f75121e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final FrameLayout f75122f;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PrepareView.this.f75122f.setVisibility(8);
            f.b().e(true);
            PrepareView.this.f75118b.start();
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PrepareView.this.f75118b.start();
        }
    }

    public PrepareView(@NonNull Context context) {
        super(context);
        LayoutInflater.from(getContext()).inflate(R$layout.dkplayer_layout_prepare_view, (ViewGroup) this, true);
        this.f75119c = (ImageView) findViewById(R$id.thumb);
        this.f75120d = (ImageView) findViewById(R$id.start_play);
        this.f75121e = (ProgressBar) findViewById(R$id.loading);
        this.f75122f = (FrameLayout) findViewById(R$id.net_warning_layout);
        findViewById(R$id.status_btn).setOnClickListener(new a());
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
        this.f75118b = aVar;
    }

    public void l() {
        setOnClickListener(new b());
    }

    @Override // yo.b
    public void onPlayStateChanged(int i10) {
        switch (i10) {
            case -1:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                setVisibility(8);
                break;
            case 0:
                setVisibility(0);
                bringToFront();
                this.f75121e.setVisibility(8);
                this.f75122f.setVisibility(8);
                this.f75120d.setVisibility(0);
                this.f75119c.setVisibility(0);
                break;
            case 1:
                bringToFront();
                setVisibility(0);
                this.f75120d.setVisibility(8);
                this.f75122f.setVisibility(8);
                this.f75121e.setVisibility(0);
                break;
            case 8:
                setVisibility(0);
                this.f75122f.setVisibility(0);
                this.f75122f.bringToFront();
                break;
        }
    }

    public PrepareView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(getContext()).inflate(R$layout.dkplayer_layout_prepare_view, (ViewGroup) this, true);
        this.f75119c = (ImageView) findViewById(R$id.thumb);
        this.f75120d = (ImageView) findViewById(R$id.start_play);
        this.f75121e = (ProgressBar) findViewById(R$id.loading);
        this.f75122f = (FrameLayout) findViewById(R$id.net_warning_layout);
        findViewById(R$id.status_btn).setOnClickListener(new a());
    }

    public PrepareView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        LayoutInflater.from(getContext()).inflate(R$layout.dkplayer_layout_prepare_view, (ViewGroup) this, true);
        this.f75119c = (ImageView) findViewById(R$id.thumb);
        this.f75120d = (ImageView) findViewById(R$id.start_play);
        this.f75121e = (ProgressBar) findViewById(R$id.loading);
        this.f75122f = (FrameLayout) findViewById(R$id.net_warning_layout);
        findViewById(R$id.status_btn).setOnClickListener(new a());
    }
}
