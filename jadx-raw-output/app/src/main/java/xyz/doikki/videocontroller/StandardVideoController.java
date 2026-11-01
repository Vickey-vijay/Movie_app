package xyz.doikki.videocontroller;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import bp.c;
import xyz.doikki.videocontroller.component.CompleteView;
import xyz.doikki.videocontroller.component.ErrorView;
import xyz.doikki.videocontroller.component.GestureView;
import xyz.doikki.videocontroller.component.LiveControlView;
import xyz.doikki.videocontroller.component.PrepareView;
import xyz.doikki.videocontroller.component.TitleView;
import xyz.doikki.videocontroller.component.VodControlView;
import xyz.doikki.videoplayer.controller.GestureVideoController;
import yo.b;

/* JADX INFO: loaded from: classes8.dex */
public class StandardVideoController extends GestureVideoController implements View.OnClickListener {
    private boolean isBuffering;
    public ProgressBar mLoadingProgress;
    public ImageView mLockButton;

    public StandardVideoController(@NonNull Context context) {
        this(context, null);
    }

    @Override // xyz.doikki.videoplayer.controller.BaseVideoController
    public void onLockStateChanged(boolean z10) {
        if (z10) {
            this.mLockButton.setSelected(true);
            Toast.makeText(getContext(), R$string.dkplayer_locked, 0).show();
        } else {
            this.mLockButton.setSelected(false);
            Toast.makeText(getContext(), R$string.dkplayer_unlocked, 0).show();
        }
    }

    public StandardVideoController(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void addDefaultControlComponent(String str, boolean z10) {
        b completeView = new CompleteView(getContext());
        b errorView = new ErrorView(getContext());
        PrepareView prepareView = new PrepareView(getContext());
        prepareView.l();
        TitleView titleView = new TitleView(getContext());
        titleView.setTitle(str);
        addControlComponent(completeView, errorView, prepareView, titleView);
        if (z10) {
            addControlComponent(new LiveControlView(getContext()));
        } else {
            addControlComponent(new VodControlView(getContext()));
        }
        addControlComponent(new GestureView(getContext()));
        setCanChangePosition(!z10);
    }

    @Override // xyz.doikki.videoplayer.controller.BaseVideoController
    public int getLayoutId() {
        return R$layout.dkplayer_layout_standard_controller;
    }

    @Override // xyz.doikki.videoplayer.controller.BaseVideoController
    public void onVisibilityChanged(boolean z10, Animation animation) {
        if (this.mControlWrapper.isFullScreen()) {
            if (!z10) {
                this.mLockButton.setVisibility(8);
                if (animation != null) {
                    this.mLockButton.startAnimation(animation);
                    return;
                }
                return;
            }
            if (this.mLockButton.getVisibility() == 8) {
                this.mLockButton.setVisibility(0);
                if (animation != null) {
                    this.mLockButton.startAnimation(animation);
                }
            }
        }
    }

    public StandardVideoController(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i10) {
        super(context, attributeSet, i10);
    }

    @Override // xyz.doikki.videoplayer.controller.GestureVideoController, xyz.doikki.videoplayer.controller.BaseVideoController
    public void initView() {
        super.initView();
        ImageView imageView = (ImageView) findViewById(R$id.lock);
        this.mLockButton = imageView;
        imageView.setOnClickListener(this);
        this.mLoadingProgress = (ProgressBar) findViewById(R$id.loading);
    }

    @Override // xyz.doikki.videoplayer.controller.BaseVideoController
    public boolean onBackPressed() {
        if (isLocked()) {
            show();
            Toast.makeText(getContext(), R$string.dkplayer_lock_tip, 0).show();
            return true;
        }
        if (this.mControlWrapper.isFullScreen()) {
            return stopFullScreen();
        }
        return super.onBackPressed();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R$id.lock) {
            this.mControlWrapper.b();
        }
    }

    @Override // xyz.doikki.videoplayer.controller.BaseVideoController
    public void onPlayStateChanged(int i10) {
        super.onPlayStateChanged(i10);
        switch (i10) {
            case -1:
            case 2:
            case 3:
            case 4:
            case 7:
                if (i10 == 7) {
                    this.isBuffering = false;
                }
                if (!this.isBuffering) {
                    this.mLoadingProgress.setVisibility(8);
                }
                break;
            case 0:
                this.mLockButton.setSelected(false);
                this.mLoadingProgress.setVisibility(8);
                break;
            case 1:
            case 6:
                this.mLoadingProgress.setVisibility(0);
                if (i10 == 6) {
                    this.isBuffering = true;
                }
                break;
            case 5:
                this.mLoadingProgress.setVisibility(8);
                this.mLockButton.setVisibility(8);
                this.mLockButton.setSelected(false);
                break;
        }
    }

    @Override // xyz.doikki.videoplayer.controller.BaseVideoController
    public void onPlayerStateChanged(int i10) {
        super.onPlayerStateChanged(i10);
        if (i10 != 10) {
            if (i10 == 11) {
                if (isShowing()) {
                    this.mLockButton.setVisibility(0);
                } else {
                    this.mLockButton.setVisibility(8);
                }
            }
        } else {
            setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.mLockButton.setVisibility(8);
        }
        if (this.mActivity != null && hasCutout()) {
            int requestedOrientation = this.mActivity.getRequestedOrientation();
            int iA = c.a(getContext(), 24.0f);
            int cutoutHeight = getCutoutHeight();
            if (requestedOrientation == 1) {
                ((FrameLayout.LayoutParams) this.mLockButton.getLayoutParams()).setMargins(iA, 0, iA, 0);
                return;
            }
            if (requestedOrientation == 0) {
                int i11 = iA + cutoutHeight;
                ((FrameLayout.LayoutParams) this.mLockButton.getLayoutParams()).setMargins(i11, 0, i11, 0);
            } else if (requestedOrientation == 8) {
                ((FrameLayout.LayoutParams) this.mLockButton.getLayoutParams()).setMargins(iA, 0, iA, 0);
            }
        }
    }
}
