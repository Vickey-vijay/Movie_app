package xyz.doikki.videoplayer.controller;

import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.Map;
import yo.b;
import yo.c;

/* JADX INFO: loaded from: classes6.dex */
public abstract class GestureVideoController extends BaseVideoController implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener, View.OnTouchListener {
    private AudioManager mAudioManager;
    private float mBrightness;
    private boolean mCanChangePosition;
    private boolean mCanSlide;
    private boolean mChangeBrightness;
    private boolean mChangePosition;
    private boolean mChangeVolume;
    private int mCurPlayState;
    private boolean mEnableInNormal;
    private boolean mFirstTouch;
    private GestureDetector mGestureDetector;
    private boolean mIsDoubleTapTogglePlayEnabled;
    private boolean mIsGestureEnabled;
    private int mSeekPosition;
    private int mStreamVolume;

    public GestureVideoController(@NonNull Context context) {
        super(context);
        this.mIsGestureEnabled = true;
        this.mSeekPosition = -1;
        this.mCanChangePosition = true;
        this.mIsDoubleTapTogglePlayEnabled = true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public void slideToChangePosition(float f10) {
        int measuredWidth = getMeasuredWidth();
        int duration = (int) this.mControlWrapper.getDuration();
        int currentPosition = (int) this.mControlWrapper.getCurrentPosition();
        int i10 = (int) ((((-f10) / measuredWidth) * 120000.0f) + currentPosition);
        if (i10 > duration) {
            i10 = duration;
        }
        if (i10 < 0) {
            i10 = 0;
        }
        Iterator<Map.Entry<b, Boolean>> it = this.mControlComponents.entrySet().iterator();
        while (it.hasNext()) {
            b key = it.next().getKey();
            if (key instanceof c) {
                ((c) key).d(i10, currentPosition, duration);
            }
        }
        this.mSeekPosition = i10;
    }

    private boolean isInPlaybackState() {
        int i10;
        return (this.mControlWrapper == null || (i10 = this.mCurPlayState) == -1 || i10 == 0 || i10 == 1 || i10 == 2 || i10 == 8 || i10 == 5) ? false : true;
    }

    private void stopSlide() {
        Iterator<Map.Entry<b, Boolean>> it = this.mControlComponents.entrySet().iterator();
        while (it.hasNext()) {
            b key = it.next().getKey();
            if (key instanceof c) {
                ((c) key).h();
            }
        }
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(MotionEvent motionEvent) {
        if (!this.mIsDoubleTapTogglePlayEnabled || isLocked() || !isInPlaybackState()) {
            return true;
        }
        togglePlay();
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return this.mGestureDetector.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.mGestureDetector.onTouchEvent(motionEvent)) {
            int action = motionEvent.getAction();
            if (action == 1) {
                stopSlide();
                int i10 = this.mSeekPosition;
                if (i10 >= 0) {
                    this.mControlWrapper.seekTo(i10);
                    this.mSeekPosition = -1;
                }
            } else if (action == 3) {
                stopSlide();
                this.mSeekPosition = -1;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCanChangePosition(boolean z10) {
        this.mCanChangePosition = z10;
    }

    public void setDoubleTapTogglePlayEnabled(boolean z10) {
        this.mIsDoubleTapTogglePlayEnabled = z10;
    }

    public void setEnableInNormal(boolean z10) {
        this.mEnableInNormal = z10;
    }

    public void setGestureEnabled(boolean z10) {
        this.mIsGestureEnabled = z10;
    }

    public void slideToChangeVolume(float f10) {
        float streamMaxVolume = this.mAudioManager.getStreamMaxVolume(3);
        float measuredHeight = this.mStreamVolume + (((f10 * 2.0f) / getMeasuredHeight()) * streamMaxVolume);
        if (measuredHeight > streamMaxVolume) {
            measuredHeight = streamMaxVolume;
        }
        if (measuredHeight < 0.0f) {
            measuredHeight = 0.0f;
        }
        int i10 = (int) ((measuredHeight / streamMaxVolume) * 100.0f);
        this.mAudioManager.setStreamVolume(3, (int) measuredHeight, 0);
        Iterator<Map.Entry<b, Boolean>> it = this.mControlComponents.entrySet().iterator();
        while (it.hasNext()) {
            b key = it.next().getKey();
            if (key instanceof c) {
                ((c) key).c(i10);
            }
        }
    }

    @Override // xyz.doikki.videoplayer.controller.BaseVideoController
    public void initView() {
        super.initView();
        this.mAudioManager = (AudioManager) getContext().getSystemService("audio");
        this.mGestureDetector = new GestureDetector(getContext(), this);
        setOnTouchListener(this);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        if (isInPlaybackState() && this.mIsGestureEnabled && !bp.c.k(getContext(), motionEvent)) {
            this.mStreamVolume = this.mAudioManager.getStreamVolume(3);
            Activity activityL = bp.c.l(getContext());
            if (activityL == null) {
                this.mBrightness = 0.0f;
            } else {
                this.mBrightness = activityL.getWindow().getAttributes().screenBrightness;
            }
            this.mFirstTouch = true;
            this.mChangePosition = false;
            this.mChangeBrightness = false;
            this.mChangeVolume = false;
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        boolean z10;
        if (isInPlaybackState() && this.mIsGestureEnabled && this.mCanSlide && !isLocked() && !bp.c.k(getContext(), motionEvent)) {
            float x10 = motionEvent.getX() - motionEvent2.getX();
            float y10 = motionEvent.getY() - motionEvent2.getY();
            if (this.mFirstTouch) {
                if (Math.abs(f10) >= Math.abs(f11)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.mChangePosition = z10;
                if (!z10) {
                    if (motionEvent2.getX() > bp.c.f(getContext(), true) / 2) {
                        this.mChangeVolume = true;
                    } else {
                        this.mChangeBrightness = true;
                    }
                }
                if (this.mChangePosition) {
                    this.mChangePosition = this.mCanChangePosition;
                }
                if (this.mChangePosition || this.mChangeBrightness || this.mChangeVolume) {
                    Iterator<Map.Entry<b, Boolean>> it = this.mControlComponents.entrySet().iterator();
                    while (it.hasNext()) {
                        b key = it.next().getKey();
                        if (key instanceof c) {
                            ((c) key).g();
                        }
                    }
                }
                this.mFirstTouch = false;
            }
            if (this.mChangePosition) {
                slideToChangePosition(x10);
            } else if (this.mChangeBrightness) {
                slideToChangeBrightness(y10);
            } else if (this.mChangeVolume) {
                slideToChangeVolume(y10);
            }
        }
        return true;
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (isInPlaybackState()) {
            this.mControlWrapper.d();
            return true;
        }
        return true;
    }

    @Override // xyz.doikki.videoplayer.controller.BaseVideoController
    public void setPlayState(int i10) {
        super.setPlayState(i10);
        this.mCurPlayState = i10;
    }

    @Override // xyz.doikki.videoplayer.controller.BaseVideoController
    public void setPlayerState(int i10) {
        super.setPlayerState(i10);
        if (i10 == 10) {
            this.mCanSlide = this.mEnableInNormal;
        } else if (i10 == 11) {
            this.mCanSlide = true;
        }
    }

    public void slideToChangeBrightness(float f10) {
        Activity activityL = bp.c.l(getContext());
        if (activityL == null) {
            return;
        }
        Window window = activityL.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        int measuredHeight = getMeasuredHeight();
        if (this.mBrightness == -1.0f) {
            this.mBrightness = 0.5f;
        }
        float f11 = ((f10 * 2.0f) / measuredHeight) + this.mBrightness;
        if (f11 < 0.0f) {
            f11 = 0.0f;
        }
        if (f11 > 1.0f) {
            f11 = 1.0f;
        }
        int i10 = (int) (100.0f * f11);
        attributes.screenBrightness = f11;
        window.setAttributes(attributes);
        Iterator<Map.Entry<b, Boolean>> it = this.mControlComponents.entrySet().iterator();
        while (it.hasNext()) {
            b key = it.next().getKey();
            if (key instanceof c) {
                ((c) key).i(i10);
            }
        }
    }

    public GestureVideoController(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mIsGestureEnabled = true;
        this.mSeekPosition = -1;
        this.mCanChangePosition = true;
        this.mIsDoubleTapTogglePlayEnabled = true;
    }

    public GestureVideoController(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mIsGestureEnabled = true;
        this.mSeekPosition = -1;
        this.mCanChangePosition = true;
        this.mIsDoubleTapTogglePlayEnabled = true;
    }
}
