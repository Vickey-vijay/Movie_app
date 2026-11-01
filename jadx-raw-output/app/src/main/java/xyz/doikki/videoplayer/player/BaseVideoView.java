package xyz.doikki.videoplayer.player;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.google.android.material.badge.BadgeDrawable;
import com.ironsource.C3426d4;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import xyz.doikki.videoplayer.R$styleable;
import xyz.doikki.videoplayer.controller.BaseVideoController;
import xyz.doikki.videoplayer.player.a;
import yo.e;
import zo.c;
import zo.d;
import zo.f;

/* JADX INFO: loaded from: classes5.dex */
public class BaseVideoView<P extends xyz.doikki.videoplayer.player.a> extends FrameLayout implements e, xyz.doikki.videoplayer.player.a.InterfaceC0798a {
    public static final int PLAYER_FULL_SCREEN = 11;
    public static final int PLAYER_NORMAL = 10;
    public static final int PLAYER_TINY_SCREEN = 12;
    public static final int SCREEN_SCALE_16_9 = 1;
    public static final int SCREEN_SCALE_4_3 = 2;
    public static final int SCREEN_SCALE_CENTER_CROP = 5;
    public static final int SCREEN_SCALE_DEFAULT = 0;
    public static final int SCREEN_SCALE_MATCH_PARENT = 3;
    public static final int SCREEN_SCALE_ORIGINAL = 4;
    public static final int STATE_BUFFERED = 7;
    public static final int STATE_BUFFERING = 6;
    public static final int STATE_ERROR = -1;
    public static final int STATE_IDLE = 0;
    public static final int STATE_PAUSED = 4;
    public static final int STATE_PLAYBACK_COMPLETED = 5;
    public static final int STATE_PLAYING = 3;
    public static final int STATE_PREPARED = 2;
    public static final int STATE_PREPARING = 1;
    public static final int STATE_START_ABORT = 8;
    public AssetFileDescriptor mAssetFileDescriptor;

    @Nullable
    public zo.b mAudioFocusHelper;
    public int mCurrentPlayState;
    public int mCurrentPlayerState;
    public long mCurrentPosition;
    public int mCurrentScreenScaleType;
    public boolean mEnableAudioFocus;
    public Map<String, String> mHeaders;
    public boolean mIsFullScreen;
    public boolean mIsLooping;
    public boolean mIsMute;
    public boolean mIsTinyScreen;
    public P mMediaPlayer;
    public List<a> mOnStateChangeListeners;
    private final int mPlayerBackgroundColor;
    public FrameLayout mPlayerContainer;
    public c<P> mPlayerFactory;

    @Nullable
    public d mProgressManager;
    public ap.a mRenderView;
    public ap.c mRenderViewFactory;
    public int[] mTinyScreenSize;
    public String mUrl;

    @Nullable
    public BaseVideoController mVideoController;
    public int[] mVideoSize;

    public interface a {
        void onPlayStateChanged(int i10);

        void onPlayerStateChanged(int i10);
    }

    public BaseVideoView(@NonNull Context context) {
        this(context, null);
    }

    @Override // xyz.doikki.videoplayer.player.a.InterfaceC0798a
    public void onInfo(int i10, int i11) {
        if (i10 == 3) {
            setPlayState(3);
            this.mPlayerContainer.setKeepScreenOn(true);
            return;
        }
        if (i10 == 10001) {
            ap.a aVar = this.mRenderView;
            if (aVar != null) {
                aVar.setVideoRotation(i11);
                return;
            }
            return;
        }
        if (i10 == 701) {
            setPlayState(6);
        } else {
            if (i10 != 702) {
                return;
            }
            setPlayState(7);
        }
    }

    @Override // xyz.doikki.videoplayer.player.a.InterfaceC0798a
    public void onPrepared() {
        zo.b bVar;
        setPlayState(2);
        if (!isMute() && (bVar = this.mAudioFocusHelper) != null) {
            bVar.d();
        }
        long j10 = this.mCurrentPosition;
        if (j10 > 0) {
            seekTo(j10);
        }
    }

    public void saveProgress() {
    }

    public void setAssetFileDescriptor(AssetFileDescriptor assetFileDescriptor) {
        this.mUrl = null;
        this.mAssetFileDescriptor = assetFileDescriptor;
    }

    public void setInitOptions() {
    }

    public void setProgressManager(@Nullable d dVar) {
    }

    public void setUrl(String str) {
        setUrl(str, null);
    }

    public void skipPositionWhenPlay(int i10) {
        this.mCurrentPosition = i10;
    }

    public BaseVideoView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private boolean isInStartAbortState() {
        return this.mCurrentPlayState == 8;
    }

    public void addDisplay() {
        ap.a aVar = this.mRenderView;
        if (aVar != null) {
            this.mPlayerContainer.removeView(aVar.getView());
            this.mRenderView.release();
        }
        ap.a aVarA = this.mRenderViewFactory.a(getContext());
        this.mRenderView = aVarA;
        aVarA.c(this.mMediaPlayer);
        this.mPlayerContainer.addView(this.mRenderView.getView(), 0, new FrameLayout.LayoutParams(-1, -1, 17));
    }

    public void addOnStateChangeListener(@NonNull a aVar) {
        if (this.mOnStateChangeListeners == null) {
            this.mOnStateChangeListeners = new ArrayList();
        }
        this.mOnStateChangeListeners.add(aVar);
    }

    public void clearOnStateChangeListeners() {
        List<a> list = this.mOnStateChangeListeners;
        if (list != null) {
            list.clear();
        }
    }

    public Bitmap doScreenShot() {
        ap.a aVar = this.mRenderView;
        if (aVar != null) {
            return aVar.b();
        }
        return null;
    }

    public Activity getActivity() {
        BaseVideoController baseVideoController = this.mVideoController;
        if (baseVideoController == null) {
            return bp.c.l(getContext());
        }
        Activity activityL = bp.c.l(baseVideoController.getContext());
        return activityL == null ? bp.c.l(getContext()) : activityL;
    }

    @Override // yo.e
    public int getBufferedPercentage() {
        P p10 = this.mMediaPlayer;
        if (p10 != null) {
            return p10.getBufferedPercentage();
        }
        return 0;
    }

    public int getCurrentPlayState() {
        return this.mCurrentPlayState;
    }

    public int getCurrentPlayerState() {
        return this.mCurrentPlayerState;
    }

    public long getTcpSpeed() {
        P p10 = this.mMediaPlayer;
        if (p10 != null) {
            return p10.getTcpSpeed();
        }
        return 0L;
    }

    public int[] getVideoSize() {
        return this.mVideoSize;
    }

    public void initPlayer() {
        P p10 = (P) this.mPlayerFactory.createPlayer(getContext());
        this.mMediaPlayer = p10;
        p10.setPlayerEventListener(this);
        setInitOptions();
        this.mMediaPlayer.initPlayer();
        setOptions();
    }

    public void initView() {
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.mPlayerContainer = frameLayout;
        frameLayout.setBackgroundColor(this.mPlayerBackgroundColor);
        addView(this.mPlayerContainer, new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // yo.e
    public boolean isFullScreen() {
        return this.mIsFullScreen;
    }

    public boolean isInIdleState() {
        return this.mCurrentPlayState == 0;
    }

    public boolean isInPlaybackState() {
        int i10;
        return (this.mMediaPlayer == null || (i10 = this.mCurrentPlayState) == -1 || i10 == 0 || i10 == 1 || i10 == 8 || i10 == 5) ? false : true;
    }

    public boolean isLocalDataSource() {
        if (this.mAssetFileDescriptor != null) {
            return true;
        }
        if (TextUtils.isEmpty(this.mUrl)) {
            return false;
        }
        Uri uri = Uri.parse(this.mUrl);
        return "android.resource".equals(uri.getScheme()) || C3426d4.i.f28530b.equals(uri.getScheme()) || "rawresource".equals(uri.getScheme());
    }

    public boolean isMute() {
        return this.mIsMute;
    }

    public boolean isTinyScreen() {
        return this.mIsTinyScreen;
    }

    public boolean onBackPressed() {
        BaseVideoController baseVideoController = this.mVideoController;
        return baseVideoController != null && baseVideoController.onBackPressed();
    }

    @Override // xyz.doikki.videoplayer.player.a.InterfaceC0798a
    public void onCompletion() {
        this.mPlayerContainer.setKeepScreenOn(false);
        this.mCurrentPosition = 0L;
        setPlayState(5);
    }

    @Override // xyz.doikki.videoplayer.player.a.InterfaceC0798a
    public void onError() {
        this.mPlayerContainer.setKeepScreenOn(false);
        setPlayState(-1);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        bp.b.a("onSaveInstanceState: " + this.mCurrentPosition);
        saveProgress();
        return super.onSaveInstanceState();
    }

    @Override // xyz.doikki.videoplayer.player.a.InterfaceC0798a
    public void onVideoSizeChanged(int i10, int i11) {
        int[] iArr = this.mVideoSize;
        iArr[0] = i10;
        iArr[1] = i11;
        ap.a aVar = this.mRenderView;
        if (aVar != null) {
            aVar.setScaleType(this.mCurrentScreenScaleType);
            this.mRenderView.a(i10, i11);
        }
    }

    public boolean prepareDataSource() {
        AssetFileDescriptor assetFileDescriptor = this.mAssetFileDescriptor;
        if (assetFileDescriptor != null) {
            this.mMediaPlayer.setDataSource(assetFileDescriptor);
            return true;
        }
        if (TextUtils.isEmpty(this.mUrl)) {
            return false;
        }
        this.mMediaPlayer.setDataSource(this.mUrl, this.mHeaders);
        return true;
    }

    public void removeOnStateChangeListener(@NonNull a aVar) {
        List<a> list = this.mOnStateChangeListeners;
        if (list != null) {
            list.remove(aVar);
        }
    }

    @Override // yo.e
    public void replay(boolean z10) {
        if (z10) {
            this.mCurrentPosition = 0L;
        }
        addDisplay();
        startPrepare(true);
    }

    public void setEnableAudioFocus(boolean z10) {
        this.mEnableAudioFocus = z10;
    }

    public void setLooping(boolean z10) {
        this.mIsLooping = z10;
        P p10 = this.mMediaPlayer;
        if (p10 != null) {
            p10.setLooping(z10);
        }
    }

    public void setMirrorRotation(boolean z10) {
        ap.a aVar = this.mRenderView;
        if (aVar != null) {
            aVar.getView().setScaleX(z10 ? -1.0f : 1.0f);
        }
    }

    public void setMute(boolean z10) {
        this.mIsMute = z10;
        P p10 = this.mMediaPlayer;
        if (p10 != null) {
            float f10 = z10 ? 0.0f : 1.0f;
            p10.setVolume(f10, f10);
        }
    }

    public void setOnStateChangeListener(@NonNull a aVar) {
        List<a> list = this.mOnStateChangeListeners;
        if (list == null) {
            this.mOnStateChangeListeners = new ArrayList();
        } else {
            list.clear();
        }
        this.mOnStateChangeListeners.add(aVar);
    }

    public void setOptions() {
        this.mMediaPlayer.setLooping(this.mIsLooping);
        float f10 = this.mIsMute ? 0.0f : 1.0f;
        this.mMediaPlayer.setVolume(f10, f10);
    }

    public void setPlayState(int i10) {
        this.mCurrentPlayState = i10;
        BaseVideoController baseVideoController = this.mVideoController;
        if (baseVideoController != null) {
            baseVideoController.setPlayState(i10);
        }
        List<a> list = this.mOnStateChangeListeners;
        if (list != null) {
            for (a aVar : bp.c.g(list)) {
                if (aVar != null) {
                    aVar.onPlayStateChanged(i10);
                }
            }
        }
    }

    public void setPlayerBackgroundColor(int i10) {
        this.mPlayerContainer.setBackgroundColor(i10);
    }

    public void setPlayerFactory(c cVar) {
        if (cVar == null) {
            throw new IllegalArgumentException("PlayerFactory can not be null!");
        }
        this.mPlayerFactory = cVar;
    }

    public void setPlayerState(int i10) {
        this.mCurrentPlayerState = i10;
        BaseVideoController baseVideoController = this.mVideoController;
        if (baseVideoController != null) {
            baseVideoController.setPlayerState(i10);
        }
        List<a> list = this.mOnStateChangeListeners;
        if (list != null) {
            for (a aVar : bp.c.g(list)) {
                if (aVar != null) {
                    aVar.onPlayerStateChanged(i10);
                }
            }
        }
    }

    public void setRenderViewFactory(ap.c cVar) {
        if (cVar == null) {
            throw new IllegalArgumentException("RenderViewFactory can not be null!");
        }
        this.mRenderViewFactory = cVar;
    }

    @Override // android.view.View
    public void setRotation(float f10) {
        ap.a aVar = this.mRenderView;
        if (aVar != null) {
            aVar.setVideoRotation((int) f10);
        }
    }

    public void setScreenScaleType(int i10) {
        this.mCurrentScreenScaleType = i10;
        ap.a aVar = this.mRenderView;
        if (aVar != null) {
            aVar.setScaleType(i10);
        }
    }

    public void setTinyScreenSize(int[] iArr) {
        this.mTinyScreenSize = iArr;
    }

    public void setUrl(String str, Map<String, String> map) {
        this.mAssetFileDescriptor = null;
        this.mUrl = str;
        this.mHeaders = map;
    }

    public void setVideoController(@Nullable BaseVideoController baseVideoController) {
        this.mPlayerContainer.removeView(this.mVideoController);
        this.mVideoController = baseVideoController;
        if (baseVideoController != null) {
            baseVideoController.setMediaPlayer(this);
            this.mPlayerContainer.addView(this.mVideoController, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    public void setVolume(float f10, float f11) {
        P p10 = this.mMediaPlayer;
        if (p10 != null) {
            p10.setVolume(f10, f11);
        }
    }

    @Override // yo.e
    public void startFullScreen() {
        ViewGroup decorView;
        if (this.mIsFullScreen || (decorView = getDecorView()) == null) {
            return;
        }
        this.mIsFullScreen = true;
        hideSysBar(decorView);
        removeView(this.mPlayerContainer);
        decorView.addView(this.mPlayerContainer);
        setPlayerState(11);
    }

    public void startInPlaybackState() {
        this.mMediaPlayer.start();
        setPlayState(3);
        if (this.mAudioFocusHelper != null && !isMute()) {
            this.mAudioFocusHelper.d();
        }
        this.mPlayerContainer.setKeepScreenOn(true);
    }

    public void startPrepare(boolean z10) {
        int i10;
        if (z10) {
            this.mMediaPlayer.reset();
            setOptions();
        }
        if (prepareDataSource()) {
            this.mMediaPlayer.prepareAsync();
            setPlayState(1);
            if (isFullScreen()) {
                i10 = 11;
            } else {
                i10 = isTinyScreen() ? 12 : 10;
            }
            setPlayerState(i10);
        }
    }

    public void startTinyScreen() {
        ViewGroup contentView;
        if (this.mIsTinyScreen || (contentView = getContentView()) == null) {
            return;
        }
        removeView(this.mPlayerContainer);
        int iF = this.mTinyScreenSize[0];
        if (iF <= 0) {
            iF = bp.c.f(getContext(), false) / 2;
        }
        int i10 = this.mTinyScreenSize[1];
        if (i10 <= 0) {
            i10 = (iF * 9) / 16;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iF, i10);
        layoutParams.gravity = BadgeDrawable.BOTTOM_END;
        contentView.addView(this.mPlayerContainer, layoutParams);
        this.mIsTinyScreen = true;
        setPlayerState(12);
    }

    @Override // yo.e
    public void stopFullScreen() {
        ViewGroup decorView;
        if (this.mIsFullScreen && (decorView = getDecorView()) != null) {
            this.mIsFullScreen = false;
            showSysBar(decorView);
            decorView.removeView(this.mPlayerContainer);
            addView(this.mPlayerContainer);
            setPlayerState(10);
        }
    }

    public void stopTinyScreen() {
        ViewGroup contentView;
        if (this.mIsTinyScreen && (contentView = getContentView()) != null) {
            contentView.removeView(this.mPlayerContainer);
            addView(this.mPlayerContainer, new FrameLayout.LayoutParams(-1, -1));
            this.mIsTinyScreen = false;
            setPlayerState(10);
        }
    }

    public BaseVideoView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mVideoSize = new int[]{0, 0};
        this.mCurrentPlayState = 0;
        this.mCurrentPlayerState = 10;
        this.mTinyScreenSize = new int[]{0, 0};
        zo.e eVarA = f.a();
        this.mEnableAudioFocus = eVarA.f86524c;
        this.mPlayerFactory = eVarA.f86526e;
        this.mCurrentScreenScaleType = eVarA.f86527f;
        this.mRenderViewFactory = eVarA.f86528g;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.BaseVideoView);
        this.mEnableAudioFocus = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BaseVideoView_enableAudioFocus, this.mEnableAudioFocus);
        this.mIsLooping = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BaseVideoView_looping, false);
        this.mCurrentScreenScaleType = typedArrayObtainStyledAttributes.getInt(R$styleable.BaseVideoView_screenScaleType, this.mCurrentScreenScaleType);
        this.mPlayerBackgroundColor = typedArrayObtainStyledAttributes.getColor(R$styleable.BaseVideoView_playerBackgroundColor, ViewCompat.MEASURED_STATE_MASK);
        typedArrayObtainStyledAttributes.recycle();
        initView();
    }

    private void hideSysBar(ViewGroup viewGroup) {
        viewGroup.setSystemUiVisibility(viewGroup.getSystemUiVisibility() | 2 | 4096);
        getActivity().getWindow().setFlags(1024, 1024);
    }

    private void showSysBar(ViewGroup viewGroup) {
        viewGroup.setSystemUiVisibility(viewGroup.getSystemUiVisibility() & (-3) & (-4097));
        getActivity().getWindow().clearFlags(1024);
    }

    public ViewGroup getContentView() {
        Activity activity = getActivity();
        if (activity == null) {
            return null;
        }
        return (ViewGroup) activity.findViewById(R.id.content);
    }

    @Override // yo.e
    public long getCurrentPosition() {
        if (isInPlaybackState()) {
            long currentPosition = this.mMediaPlayer.getCurrentPosition();
            this.mCurrentPosition = currentPosition;
            return currentPosition;
        }
        return 0L;
    }

    public ViewGroup getDecorView() {
        Activity activity = getActivity();
        if (activity == null) {
            return null;
        }
        return (ViewGroup) activity.getWindow().getDecorView();
    }

    @Override // yo.e
    public long getDuration() {
        if (isInPlaybackState()) {
            return this.mMediaPlayer.getDuration();
        }
        return 0L;
    }

    @Override // yo.e
    public float getSpeed() {
        if (isInPlaybackState()) {
            return this.mMediaPlayer.getSpeed();
        }
        return 1.0f;
    }

    @Override // yo.e
    public boolean isPlaying() {
        if (isInPlaybackState() && this.mMediaPlayer.isPlaying()) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (z10 && this.mIsFullScreen) {
            hideSysBar(getDecorView());
        }
    }

    @Override // yo.e
    public void pause() {
        if (isInPlaybackState() && this.mMediaPlayer.isPlaying()) {
            this.mMediaPlayer.pause();
            setPlayState(4);
            if (this.mAudioFocusHelper != null && !isMute()) {
                this.mAudioFocusHelper.a();
            }
            this.mPlayerContainer.setKeepScreenOn(false);
        }
    }

    public void release() {
        if (!isInIdleState()) {
            P p10 = this.mMediaPlayer;
            if (p10 != null) {
                p10.release();
                this.mMediaPlayer = null;
            }
            ap.a aVar = this.mRenderView;
            if (aVar != null) {
                this.mPlayerContainer.removeView(aVar.getView());
                this.mRenderView.release();
                this.mRenderView = null;
            }
            AssetFileDescriptor assetFileDescriptor = this.mAssetFileDescriptor;
            if (assetFileDescriptor != null) {
                try {
                    assetFileDescriptor.close();
                } catch (IOException e10) {
                    e10.printStackTrace();
                }
            }
            zo.b bVar = this.mAudioFocusHelper;
            if (bVar != null) {
                bVar.a();
                this.mAudioFocusHelper = null;
            }
            this.mPlayerContainer.setKeepScreenOn(false);
            saveProgress();
            this.mCurrentPosition = 0L;
            setPlayState(0);
        }
    }

    public void resume() {
        if (isInPlaybackState() && !this.mMediaPlayer.isPlaying()) {
            this.mMediaPlayer.start();
            setPlayState(3);
            if (this.mAudioFocusHelper != null && !isMute()) {
                this.mAudioFocusHelper.d();
            }
            this.mPlayerContainer.setKeepScreenOn(true);
        }
    }

    @Override // yo.e
    public void seekTo(long j10) {
        if (isInPlaybackState()) {
            this.mMediaPlayer.seekTo(j10);
        }
    }

    public void setSpeed(float f10) {
        if (isInPlaybackState()) {
            this.mMediaPlayer.setSpeed(f10);
        }
    }

    public boolean showNetWarning() {
        BaseVideoController baseVideoController;
        if (isLocalDataSource() || (baseVideoController = this.mVideoController) == null || !baseVideoController.showNetWarning()) {
            return false;
        }
        return true;
    }

    @Override // yo.e
    public void start() {
        if (!isInIdleState() && !isInStartAbortState()) {
            if (isInPlaybackState()) {
                startInPlaybackState();
                return;
            }
            return;
        }
        startPlay();
    }

    public boolean startPlay() {
        if (showNetWarning()) {
            setPlayState(8);
            return false;
        }
        if (this.mEnableAudioFocus) {
            this.mAudioFocusHelper = new zo.b(this);
        }
        initPlayer();
        addDisplay();
        startPrepare(false);
        return true;
    }
}
