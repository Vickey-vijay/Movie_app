package xyz.doikki.videocontroller.component;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import bp.c;
import xyz.doikki.videocontroller.R$id;
import xyz.doikki.videocontroller.R$layout;
import yo.a;
import yo.b;

/* JADX INFO: loaded from: classes7.dex */
public class VodControlView extends FrameLayout implements b, View.OnClickListener, SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f75133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f75134c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f75135d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ImageView f75136e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinearLayout f75137f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SeekBar f75138g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ProgressBar f75139h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ImageView f75140i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f75141j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f75142k;

    public VodControlView(@NonNull Context context) {
        super(context);
        this.f75142k = true;
        setVisibility(8);
        LayoutInflater.from(getContext()).inflate(getLayoutId(), (ViewGroup) this, true);
        ImageView imageView = (ImageView) findViewById(R$id.fullscreen);
        this.f75136e = imageView;
        imageView.setOnClickListener(this);
        this.f75137f = (LinearLayout) findViewById(R$id.bottom_container);
        SeekBar seekBar = (SeekBar) findViewById(R$id.seekBar);
        this.f75138g = seekBar;
        seekBar.setOnSeekBarChangeListener(this);
        this.f75134c = (TextView) findViewById(R$id.total_time);
        this.f75135d = (TextView) findViewById(R$id.curr_time);
        ImageView imageView2 = (ImageView) findViewById(R$id.iv_play);
        this.f75140i = imageView2;
        imageView2.setOnClickListener(this);
        this.f75139h = (ProgressBar) findViewById(R$id.bottom_progress);
    }

    @Override // yo.b
    public void e(boolean z10, Animation animation) {
        if (z10) {
            this.f75137f.setVisibility(0);
            if (animation != null) {
                this.f75137f.startAnimation(animation);
            }
            if (this.f75142k) {
                this.f75139h.setVisibility(8);
                return;
            }
            return;
        }
        this.f75137f.setVisibility(8);
        if (animation != null) {
            this.f75137f.startAnimation(animation);
        }
        if (this.f75142k) {
            this.f75139h.setVisibility(0);
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(300L);
            this.f75139h.startAnimation(alphaAnimation);
        }
    }

    @Override // yo.b
    public View getView() {
        return this;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
        this.f75141j = true;
        this.f75133b.stopProgress();
        this.f75133b.stopFadeOut();
    }

    @Override // yo.b
    public void a(@NonNull a aVar) {
        this.f75133b = aVar;
    }

    @Override // yo.b
    public void b(boolean z10) {
        e(!z10, null);
    }

    @Override // yo.b
    public void f(int i10, int i11) {
        if (this.f75141j) {
            return;
        }
        SeekBar seekBar = this.f75138g;
        if (seekBar != null) {
            if (i10 > 0) {
                seekBar.setEnabled(true);
                int max = (int) (((((double) i11) * 1.0d) / ((double) i10)) * ((double) this.f75138g.getMax()));
                this.f75138g.setProgress(max);
                this.f75139h.setProgress(max);
            } else {
                seekBar.setEnabled(false);
            }
            int bufferedPercentage = this.f75133b.getBufferedPercentage();
            if (bufferedPercentage >= 95) {
                SeekBar seekBar2 = this.f75138g;
                seekBar2.setSecondaryProgress(seekBar2.getMax());
                ProgressBar progressBar = this.f75139h;
                progressBar.setSecondaryProgress(progressBar.getMax());
            } else {
                int i12 = bufferedPercentage * 10;
                this.f75138g.setSecondaryProgress(i12);
                this.f75139h.setSecondaryProgress(i12);
            }
        }
        TextView textView = this.f75134c;
        if (textView != null) {
            textView.setText(c.m(i10));
        }
        TextView textView2 = this.f75135d;
        if (textView2 != null) {
            textView2.setText(c.m(i11));
        }
    }

    public int getLayoutId() {
        return R$layout.dkplayer_layout_vod_control_view;
    }

    @Override // yo.b
    public void onPlayStateChanged(int i10) {
        switch (i10) {
            case -1:
            case 1:
            case 2:
            case 8:
                setVisibility(8);
                break;
            case 0:
            case 5:
                setVisibility(8);
                this.f75139h.setProgress(0);
                this.f75139h.setSecondaryProgress(0);
                this.f75138g.setProgress(0);
                this.f75138g.setSecondaryProgress(0);
                break;
            case 3:
                this.f75140i.setSelected(true);
                if (!this.f75142k) {
                    this.f75137f.setVisibility(8);
                } else if (this.f75133b.isShowing()) {
                    this.f75139h.setVisibility(8);
                    this.f75137f.setVisibility(0);
                } else {
                    this.f75137f.setVisibility(8);
                    this.f75139h.setVisibility(0);
                }
                setVisibility(0);
                this.f75133b.startProgress();
                break;
            case 4:
                this.f75140i.setSelected(false);
                break;
            case 6:
                this.f75140i.setSelected(this.f75133b.isPlaying());
                this.f75133b.stopProgress();
                break;
            case 7:
                this.f75140i.setSelected(this.f75133b.isPlaying());
                this.f75133b.startProgress();
                break;
        }
    }

    @Override // yo.b
    public void onPlayerStateChanged(int i10) {
        if (i10 == 10) {
            this.f75136e.setSelected(false);
        } else if (i10 == 11) {
            this.f75136e.setSelected(true);
        }
        Activity activityL = c.l(getContext());
        if (activityL == null || !this.f75133b.hasCutout()) {
            return;
        }
        int requestedOrientation = activityL.getRequestedOrientation();
        int cutoutHeight = this.f75133b.getCutoutHeight();
        if (requestedOrientation == 1) {
            this.f75137f.setPadding(0, 0, 0, 0);
            this.f75139h.setPadding(0, 0, 0, 0);
        } else if (requestedOrientation == 0) {
            this.f75137f.setPadding(cutoutHeight, 0, 0, 0);
            this.f75139h.setPadding(cutoutHeight, 0, 0, 0);
        } else if (requestedOrientation == 8) {
            this.f75137f.setPadding(0, 0, cutoutHeight, 0);
            this.f75139h.setPadding(0, 0, cutoutHeight, 0);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
        if (z10) {
            long duration = (this.f75133b.getDuration() * ((long) i10)) / ((long) this.f75138g.getMax());
            TextView textView = this.f75135d;
            if (textView != null) {
                textView.setText(c.m((int) duration));
            }
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
        this.f75133b.seekTo((int) ((this.f75133b.getDuration() * ((long) seekBar.getProgress())) / ((long) this.f75138g.getMax())));
        this.f75141j = false;
        this.f75133b.startProgress();
        this.f75133b.startFadeOut();
    }

    public final void j() {
        this.f75133b.a(c.l(getContext()));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == R$id.fullscreen) {
            j();
        } else if (id2 == R$id.iv_play) {
            this.f75133b.c();
        }
    }

    public VodControlView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f75142k = true;
        setVisibility(8);
        LayoutInflater.from(getContext()).inflate(getLayoutId(), (ViewGroup) this, true);
        ImageView imageView = (ImageView) findViewById(R$id.fullscreen);
        this.f75136e = imageView;
        imageView.setOnClickListener(this);
        this.f75137f = (LinearLayout) findViewById(R$id.bottom_container);
        SeekBar seekBar = (SeekBar) findViewById(R$id.seekBar);
        this.f75138g = seekBar;
        seekBar.setOnSeekBarChangeListener(this);
        this.f75134c = (TextView) findViewById(R$id.total_time);
        this.f75135d = (TextView) findViewById(R$id.curr_time);
        ImageView imageView2 = (ImageView) findViewById(R$id.iv_play);
        this.f75140i = imageView2;
        imageView2.setOnClickListener(this);
        this.f75139h = (ProgressBar) findViewById(R$id.bottom_progress);
    }

    public VodControlView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f75142k = true;
        setVisibility(8);
        LayoutInflater.from(getContext()).inflate(getLayoutId(), (ViewGroup) this, true);
        ImageView imageView = (ImageView) findViewById(R$id.fullscreen);
        this.f75136e = imageView;
        imageView.setOnClickListener(this);
        this.f75137f = (LinearLayout) findViewById(R$id.bottom_container);
        SeekBar seekBar = (SeekBar) findViewById(R$id.seekBar);
        this.f75138g = seekBar;
        seekBar.setOnSeekBarChangeListener(this);
        this.f75134c = (TextView) findViewById(R$id.total_time);
        this.f75135d = (TextView) findViewById(R$id.curr_time);
        ImageView imageView2 = (ImageView) findViewById(R$id.iv_play);
        this.f75140i = imageView2;
        imageView2.setOnClickListener(this);
        this.f75139h = (ProgressBar) findViewById(R$id.bottom_progress);
    }
}
