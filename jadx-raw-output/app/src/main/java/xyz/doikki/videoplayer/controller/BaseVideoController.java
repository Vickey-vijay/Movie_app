package xyz.doikki.videoplayer.controller;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import androidx.annotation.AttrRes;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import yo.d;
import yo.e;
import zo.f;

/* JADX INFO: loaded from: classes11.dex */
public abstract class BaseVideoController extends FrameLayout implements d, xyz.doikki.videoplayer.controller.a.InterfaceC0797a {

    @Nullable
    public Activity mActivity;
    private boolean mAdaptCutout;
    public LinkedHashMap<yo.b, Boolean> mControlComponents;
    public yo.a mControlWrapper;
    private int mCutoutHeight;
    public int mDefaultTimeout;
    private boolean mEnableOrientation;
    public final Runnable mFadeOut;
    private Boolean mHasCutout;
    private Animation mHideAnim;
    public boolean mIsLocked;
    private boolean mIsStartProgress;
    private int mOrientation;
    public xyz.doikki.videoplayer.controller.a mOrientationHelper;
    private Animation mShowAnim;
    public Runnable mShowProgress;
    public boolean mShowing;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseVideoController.this.hide();
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int progress = BaseVideoController.this.setProgress();
            if (!BaseVideoController.this.mControlWrapper.isPlaying()) {
                BaseVideoController.this.mIsStartProgress = false;
            } else {
                BaseVideoController baseVideoController = BaseVideoController.this;
                baseVideoController.postDelayed(this, (long) ((1000 - (progress % 1000)) / baseVideoController.mControlWrapper.getSpeed()));
            }
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseVideoController.this.mOrientationHelper.enable();
        }
    }

    public BaseVideoController(@NonNull Context context) {
        this(context, null);
    }

    public void addControlComponent(yo.b... bVarArr) {
        for (yo.b bVar : bVarArr) {
            addControlComponent(bVar, false);
        }
    }

    public abstract int getLayoutId();

    public boolean onBackPressed() {
        return false;
    }

    public void onLockStateChanged(boolean z10) {
    }

    public void onOrientationLandscape(Activity activity) {
        activity.setRequestedOrientation(0);
        if (this.mControlWrapper.isFullScreen()) {
            handlePlayerStateChanged(11);
        } else {
            this.mControlWrapper.startFullScreen();
        }
    }

    @CallSuper
    public void onPlayStateChanged(int i10) {
        if (i10 == -1) {
            this.mShowing = false;
            return;
        }
        if (i10 != 0) {
            if (i10 != 5) {
                return;
            }
            this.mIsLocked = false;
            this.mShowing = false;
            return;
        }
        this.mOrientationHelper.disable();
        this.mOrientation = 0;
        this.mIsLocked = false;
        this.mShowing = false;
        removeAllDissociateComponents();
    }

    public void onVisibilityChanged(boolean z10, Animation animation) {
    }

    public void setProgress(int i10, int i11) {
    }

    public BaseVideoController(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void checkCutout() {
        if (this.mAdaptCutout) {
            Activity activity = this.mActivity;
            if (activity != null && this.mHasCutout == null) {
                Boolean boolValueOf = Boolean.valueOf(bp.a.b(activity));
                this.mHasCutout = boolValueOf;
                if (boolValueOf.booleanValue()) {
                    this.mCutoutHeight = (int) bp.c.h(this.mActivity);
                }
            }
            bp.b.a("hasCutout: " + this.mHasCutout + " cutout height: " + this.mCutoutHeight);
        }
    }

    private void handleLockStateChanged(boolean z10) {
        Iterator<Map.Entry<yo.b, Boolean>> it = this.mControlComponents.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getKey().b(z10);
        }
        onLockStateChanged(z10);
    }

    private void handlePlayStateChanged(int i10) {
        Iterator<Map.Entry<yo.b, Boolean>> it = this.mControlComponents.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getKey().onPlayStateChanged(i10);
        }
        onPlayStateChanged(i10);
    }

    private void handlePlayerStateChanged(int i10) {
        Iterator<Map.Entry<yo.b, Boolean>> it = this.mControlComponents.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getKey().onPlayerStateChanged(i10);
        }
        onPlayerStateChanged(i10);
    }

    private void handleSetProgress(int i10, int i11) {
        Iterator<Map.Entry<yo.b, Boolean>> it = this.mControlComponents.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getKey().f(i10, i11);
        }
        setProgress(i10, i11);
    }

    private void handleVisibilityChanged(boolean z10, Animation animation) {
        if (!this.mIsLocked) {
            Iterator<Map.Entry<yo.b, Boolean>> it = this.mControlComponents.entrySet().iterator();
            while (it.hasNext()) {
                it.next().getKey().e(z10, animation);
            }
        }
        onVisibilityChanged(z10, animation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int setProgress() {
        int currentPosition = (int) this.mControlWrapper.getCurrentPosition();
        handleSetProgress((int) this.mControlWrapper.getDuration(), currentPosition);
        return currentPosition;
    }

    @Override // yo.d
    public int getCutoutHeight() {
        return this.mCutoutHeight;
    }

    @Override // yo.d
    public boolean hasCutout() {
        Boolean bool = this.mHasCutout;
        return bool != null && bool.booleanValue();
    }

    @Override // yo.d
    public void hide() {
        if (this.mShowing) {
            stopFadeOut();
            handleVisibilityChanged(false, this.mHideAnim);
            this.mShowing = false;
        }
    }

    @Override // yo.d
    public boolean isLocked() {
        return this.mIsLocked;
    }

    @Override // yo.d
    public boolean isShowing() {
        return this.mShowing;
    }

    @Override // xyz.doikki.videoplayer.controller.a.InterfaceC0797a
    @CallSuper
    public void onOrientationChanged(int i10) {
        Activity activity = this.mActivity;
        if (activity == null || activity.isFinishing()) {
            return;
        }
        int i11 = this.mOrientation;
        if (i10 == -1) {
            this.mOrientation = -1;
            return;
        }
        if (i10 > 350 || i10 < 10) {
            if ((this.mActivity.getRequestedOrientation() == 0 && i11 == 0) || this.mOrientation == 0) {
                return;
            }
            this.mOrientation = 0;
            onOrientationPortrait(this.mActivity);
            return;
        }
        if (i10 > 80 && i10 < 100) {
            if ((this.mActivity.getRequestedOrientation() == 1 && i11 == 90) || this.mOrientation == 90) {
                return;
            }
            this.mOrientation = 90;
            onOrientationReverseLandscape(this.mActivity);
            return;
        }
        if (i10 <= 260 || i10 >= 280) {
            return;
        }
        if ((this.mActivity.getRequestedOrientation() == 1 && i11 == 270) || this.mOrientation == 270) {
            return;
        }
        this.mOrientation = 270;
        onOrientationLandscape(this.mActivity);
    }

    public void onOrientationPortrait(Activity activity) {
        if (!this.mIsLocked && this.mEnableOrientation) {
            activity.setRequestedOrientation(1);
            this.mControlWrapper.stopFullScreen();
        }
    }

    public void onOrientationReverseLandscape(Activity activity) {
        activity.setRequestedOrientation(8);
        if (this.mControlWrapper.isFullScreen()) {
            handlePlayerStateChanged(11);
        } else {
            this.mControlWrapper.startFullScreen();
        }
    }

    public void removeAllControlComponent() {
        Iterator<Map.Entry<yo.b, Boolean>> it = this.mControlComponents.entrySet().iterator();
        while (it.hasNext()) {
            removeView(it.next().getKey().getView());
        }
        this.mControlComponents.clear();
    }

    public void removeAllDissociateComponents() {
        Iterator<Map.Entry<yo.b, Boolean>> it = this.mControlComponents.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getValue().booleanValue()) {
                it.remove();
            }
        }
    }

    public void setAdaptCutout(boolean z10) {
        this.mAdaptCutout = z10;
    }

    public void setDismissTimeout(int i10) {
        if (i10 > 0) {
            this.mDefaultTimeout = i10;
        }
    }

    public void setEnableOrientation(boolean z10) {
        this.mEnableOrientation = z10;
    }

    @Override // yo.d
    public void setLocked(boolean z10) {
        this.mIsLocked = z10;
        handleLockStateChanged(z10);
    }

    @CallSuper
    public void setMediaPlayer(e eVar) {
        this.mControlWrapper = new yo.a(eVar, this);
        Iterator<Map.Entry<yo.b, Boolean>> it = this.mControlComponents.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getKey().a(this.mControlWrapper);
        }
        this.mOrientationHelper.a(this);
    }

    @Override // yo.d
    public void show() {
        if (this.mShowing) {
            return;
        }
        handleVisibilityChanged(true, this.mShowAnim);
        startFadeOut();
        this.mShowing = true;
    }

    public boolean startFullScreen() {
        Activity activity = this.mActivity;
        if (activity == null || activity.isFinishing()) {
            return false;
        }
        this.mActivity.setRequestedOrientation(0);
        this.mControlWrapper.startFullScreen();
        return true;
    }

    @Override // yo.d
    public void startProgress() {
        if (this.mIsStartProgress) {
            return;
        }
        post(this.mShowProgress);
        this.mIsStartProgress = true;
    }

    @Override // yo.d
    public void stopFadeOut() {
        removeCallbacks(this.mFadeOut);
    }

    public boolean stopFullScreen() {
        Activity activity = this.mActivity;
        if (activity == null || activity.isFinishing()) {
            return false;
        }
        this.mActivity.setRequestedOrientation(1);
        this.mControlWrapper.stopFullScreen();
        return true;
    }

    @Override // yo.d
    public void stopProgress() {
        if (this.mIsStartProgress) {
            removeCallbacks(this.mShowProgress);
            this.mIsStartProgress = false;
        }
    }

    public void toggleFullScreen() {
        this.mControlWrapper.a(this.mActivity);
    }

    public void togglePlay() {
        this.mControlWrapper.c();
    }

    public BaseVideoController(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i10) {
        super(context, attributeSet, i10);
        this.mDefaultTimeout = 4000;
        this.mControlComponents = new LinkedHashMap<>();
        this.mFadeOut = new a();
        this.mShowProgress = new b();
        this.mOrientation = 0;
        initView();
    }

    public void addControlComponent(yo.b bVar, boolean z10) {
        this.mControlComponents.put(bVar, Boolean.valueOf(z10));
        yo.a aVar = this.mControlWrapper;
        if (aVar != null) {
            bVar.a(aVar);
        }
        View view = bVar.getView();
        if (view == null || z10) {
            return;
        }
        addView(view, 0);
    }

    public void initView() {
        if (getLayoutId() != 0) {
            LayoutInflater.from(getContext()).inflate(getLayoutId(), (ViewGroup) this, true);
        }
        this.mOrientationHelper = new xyz.doikki.videoplayer.controller.a(getContext().getApplicationContext());
        this.mEnableOrientation = f.a().f86523b;
        this.mAdaptCutout = f.a().f86529h;
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        this.mShowAnim = alphaAnimation;
        alphaAnimation.setDuration(300L);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        this.mHideAnim = alphaAnimation2;
        alphaAnimation2.setDuration(300L);
        this.mActivity = bp.c.l(getContext());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        checkCutout();
    }

    @CallSuper
    public void onPlayerStateChanged(int i10) {
        switch (i10) {
            case 10:
                if (this.mEnableOrientation) {
                    this.mOrientationHelper.enable();
                } else {
                    this.mOrientationHelper.disable();
                }
                if (hasCutout()) {
                    bp.a.a(getContext(), false);
                }
                break;
            case 11:
                this.mOrientationHelper.enable();
                if (hasCutout()) {
                    bp.a.a(getContext(), true);
                }
                break;
            case 12:
                this.mOrientationHelper.disable();
                break;
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (this.mControlWrapper.isPlaying()) {
            if (this.mEnableOrientation || this.mControlWrapper.isFullScreen()) {
                if (z10) {
                    postDelayed(new c(), 800L);
                } else {
                    this.mOrientationHelper.disable();
                }
            }
        }
    }

    public void removeControlComponent(yo.b bVar) {
        removeView(bVar.getView());
        this.mControlComponents.remove(bVar);
    }

    @CallSuper
    public void setPlayState(int i10) {
        handlePlayStateChanged(i10);
    }

    @CallSuper
    public void setPlayerState(int i10) {
        handlePlayerStateChanged(i10);
    }

    public boolean showNetWarning() {
        if (bp.c.d(getContext()) == 4 && !f.b().c()) {
            return true;
        }
        return false;
    }

    @Override // yo.d
    public void startFadeOut() {
        stopFadeOut();
        postDelayed(this.mFadeOut, this.mDefaultTimeout);
    }
}
