package com.mgs.carparking.shorttk;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.SeekBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import bp.c;
import com.bumptech.glide.Glide;
import com.fvvcl.flickverse.R;
import g5.m;

/* JADX INFO: loaded from: classes7.dex */
public class TKView extends FrameLayout implements yo.b, View.OnClickListener, SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f41659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f41660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public yo.a f41661d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f41662e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f41663f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f41664g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ImageView f41665h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final FixedSeekBar f41666i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f41667j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f41668k;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (TKView.this.f41661d != null) {
                TKView.this.f41661d.c();
            }
        }
    }

    public class b implements SeekBar.OnSeekBarChangeListener {
        public b() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
            if (z10) {
                long duration = (TKView.this.f41661d.getDuration() * ((long) i10)) / ((long) seekBar.getMax());
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            TKView.this.f41667j = true;
            TKView.this.f41661d.stopProgress();
            TKView.this.f41661d.stopFadeOut();
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            TKView.this.f41661d.seekTo((int) ((TKView.this.f41661d.getDuration() * ((long) seekBar.getProgress())) / ((long) seekBar.getMax())));
            TKView.this.f41667j = false;
            TKView.this.f41661d.startProgress();
            TKView.this.f41661d.startFadeOut();
        }
    }

    public TKView(@NonNull Context context) {
        super(context);
        this.f41668k = true;
        LayoutInflater.from(getContext()).inflate(R.layout.layout_tiktok_controller, (ViewGroup) this, true);
        this.f41659b = (ImageView) findViewById(R.id.iv_thumb);
        ImageView imageView = (ImageView) findViewById(R.id.iv_loading);
        this.f41665h = imageView;
        Glide.with(this).load(Integer.valueOf(R.drawable.ic_small_video_loading)).into(imageView);
        this.f41660c = (ImageView) findViewById(R.id.play_btn);
        setOnClickListener(new a());
        this.f41662e = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        FixedSeekBar fixedSeekBar = (FixedSeekBar) findViewById(R.id.bottom_progress);
        this.f41666i = fixedSeekBar;
        fixedSeekBar.setOnSeekBarChangeListener(new b());
    }

    @Override // yo.b
    public View getView() {
        return this;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
        this.f41667j = true;
        this.f41661d.stopProgress();
        this.f41661d.stopFadeOut();
    }

    @Override // yo.b
    public void a(@NonNull yo.a aVar) {
        this.f41661d = aVar;
    }

    @Override // yo.b
    public void b(boolean z10) {
        e(!z10, null);
    }

    @Override // yo.b
    public void e(boolean z10, Animation animation) {
        if (z10) {
            if (this.f41668k) {
                this.f41666i.setVisibility(8);
            }
        } else if (this.f41668k) {
            this.f41666i.setVisibility(0);
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(300L);
            this.f41666i.startAnimation(alphaAnimation);
        }
    }

    @Override // yo.b
    public void f(int i10, int i11) {
        FixedSeekBar fixedSeekBar;
        if (this.f41667j || (fixedSeekBar = this.f41666i) == null) {
            return;
        }
        if (i10 > 0) {
            this.f41666i.setProgress((int) (((((double) i11) * 1.0d) / ((double) i10)) * ((double) fixedSeekBar.getMax())));
        }
        int bufferedPercentage = this.f41661d.getBufferedPercentage();
        if (bufferedPercentage < 95) {
            this.f41666i.setSecondaryProgress(bufferedPercentage * 10);
        } else {
            FixedSeekBar fixedSeekBar2 = this.f41666i;
            fixedSeekBar2.setSecondaryProgress(fixedSeekBar2.getMax());
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
        if (z10) {
            long duration = (this.f41661d.getDuration() * ((long) i10)) / ((long) seekBar.getMax());
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
        this.f41661d.seekTo((int) ((this.f41661d.getDuration() * ((long) seekBar.getProgress())) / ((long) seekBar.getMax())));
        this.f41667j = false;
        this.f41661d.startProgress();
        this.f41661d.startFadeOut();
    }

    public final void l() {
        this.f41661d.a(c.l(getContext()));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == R.id.fullscreen) {
            l();
        } else if (id2 == R.id.iv_play) {
            this.f41661d.c();
        }
    }

    @Override // yo.b
    public void onPlayStateChanged(int i10) {
        switch (i10) {
            case -1:
            case 1:
            case 2:
            case 8:
                this.f41659b.setVisibility(0);
                this.f41665h.setVisibility(0);
                break;
            case 0:
                m.c("wangyi", "STATE_IDLE " + hashCode());
                this.f41659b.setVisibility(0);
                this.f41665h.setVisibility(0);
                break;
            case 3:
                m.c("wangyi", "STATE_PLAYING " + hashCode());
                if (this.f41668k) {
                    if (this.f41661d.isShowing()) {
                        this.f41666i.setVisibility(8);
                    } else {
                        this.f41666i.setVisibility(0);
                    }
                }
                setVisibility(0);
                this.f41661d.startProgress();
                this.f41659b.setVisibility(8);
                this.f41660c.setVisibility(8);
                this.f41665h.setVisibility(8);
                break;
            case 4:
                this.f41660c.setVisibility(0);
                break;
            case 5:
                m.c("wangyi", "STATE_PLAYBACK_COMPLETED " + hashCode());
                setVisibility(8);
                this.f41666i.setProgress(0);
                this.f41666i.setSecondaryProgress(0);
                break;
            case 6:
                this.f41661d.stopProgress();
                break;
            case 7:
                this.f41661d.startProgress();
                break;
        }
    }

    @Override // yo.b
    public void onPlayerStateChanged(int i10) {
        Activity activityL = c.l(getContext());
        if (activityL != null && this.f41661d.hasCutout()) {
            int requestedOrientation = activityL.getRequestedOrientation();
            int cutoutHeight = this.f41661d.getCutoutHeight();
            if (requestedOrientation == 1) {
                this.f41666i.setPadding(0, 0, 0, 0);
            } else if (requestedOrientation == 0) {
                this.f41666i.setPadding(cutoutHeight, 0, 0, 0);
            } else if (requestedOrientation == 8) {
                this.f41666i.setPadding(0, 0, cutoutHeight, 0);
            }
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                int x10 = (int) motionEvent.getX();
                int y10 = (int) motionEvent.getY();
                if (Math.abs(x10 - this.f41663f) < this.f41662e && Math.abs(y10 - this.f41664g) < this.f41662e) {
                    performClick();
                    return false;
                }
                return false;
            }
            return false;
        }
        this.f41663f = (int) motionEvent.getX();
        this.f41664g = (int) motionEvent.getY();
        return true;
    }

    public TKView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f41668k = true;
        LayoutInflater.from(getContext()).inflate(R.layout.layout_tiktok_controller, (ViewGroup) this, true);
        this.f41659b = (ImageView) findViewById(R.id.iv_thumb);
        ImageView imageView = (ImageView) findViewById(R.id.iv_loading);
        this.f41665h = imageView;
        Glide.with(this).load(Integer.valueOf(R.drawable.ic_small_video_loading)).into(imageView);
        this.f41660c = (ImageView) findViewById(R.id.play_btn);
        setOnClickListener(new a());
        this.f41662e = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        FixedSeekBar fixedSeekBar = (FixedSeekBar) findViewById(R.id.bottom_progress);
        this.f41666i = fixedSeekBar;
        fixedSeekBar.setOnSeekBarChangeListener(new b());
    }

    public TKView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f41668k = true;
        LayoutInflater.from(getContext()).inflate(R.layout.layout_tiktok_controller, (ViewGroup) this, true);
        this.f41659b = (ImageView) findViewById(R.id.iv_thumb);
        ImageView imageView = (ImageView) findViewById(R.id.iv_loading);
        this.f41665h = imageView;
        Glide.with(this).load(Integer.valueOf(R.drawable.ic_small_video_loading)).into(imageView);
        this.f41660c = (ImageView) findViewById(R.id.play_btn);
        setOnClickListener(new a());
        this.f41662e = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        FixedSeekBar fixedSeekBar = (FixedSeekBar) findViewById(R.id.bottom_progress);
        this.f41666i = fixedSeekBar;
        fixedSeekBar.setOnSeekBarChangeListener(new b());
    }
}
