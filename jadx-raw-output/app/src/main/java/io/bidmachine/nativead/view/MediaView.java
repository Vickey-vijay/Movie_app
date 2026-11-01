package io.bidmachine.nativead.view;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.Logger;
import io.bidmachine.core.Utils;
import io.bidmachine.iab.utils.Assets;
import io.bidmachine.iab.vast.TrackingEvent;
import io.bidmachine.iab.vast.VastRequest;
import io.bidmachine.iab.vast.VastSpecError;
import io.bidmachine.iab.vast.view.CircleCountdownView;
import io.bidmachine.nativead.NativeAdObject;
import io.bidmachine.nativead.NativeData;
import io.bidmachine.nativead.NativeInteractor;
import io.bidmachine.nativead.NativeMediaPrivateData;
import io.bidmachine.nativead.tasks.DownloadVastVideoTask;
import io.bidmachine.nativead.tasks.DownloadVideoTask;
import io.bidmachine.nativead.utils.ImageHelper;
import io.bidmachine.nativead.utils.NativeNetworkExecutor;
import io.bidmachine.utils.lazy.LazyValue;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes5.dex */
public class MediaView extends RelativeLayout implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener, TextureView.SurfaceTextureListener, VideoPlayerActivity.c {
    private static final float ASPECT_MULTIPLIER_HEIGHT_TO_WIDTH = 1.7777778f;
    private static final float ASPECT_MULTIPLIER_WIDTH_TO_HEIGHT = 0.5625f;
    public static VideoPlayerActivity.c listener;
    private volatile boolean error;
    private boolean finishedOrExpanded;
    private boolean hasVideo;
    private ImageView imageView;
    public boolean isInitialized;
    private boolean isMuted;
    private boolean isVideoFinishNotified;
    private boolean isVideoStartNotified;
    private MediaPlayer mediaPlayer;
    private boolean mediaPlayerPrepared;
    private boolean mediaPlayerPreparing;
    private CircleCountdownView muteButton;

    @Nullable
    public NativeData nativeData;

    @Nullable
    public NativeInteractor nativeInteractor;

    @Nullable
    public NativeMediaPrivateData nativeMediaData;
    private ImageView playButton;
    private ProgressBar progressBarView;
    private int quartile;
    private boolean startPlayVideoWhenReady;
    private NativeState state;
    private TextureView textureView;
    private int videoDuration;
    private int videoHeight;
    private boolean videoSizeWasChanged;
    private Timer videoVisibilityCheckerTimer;
    private int videoWidth;
    private boolean viewOnScreen;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MediaView.this.startPlayVideoWhenReady = true;
            MediaView.this.tryPlayVideo();
        }
    }

    public class b implements View.OnClickListener {
        public static void safedk_Utils_startActivity_37db7eccde16e1b8fab21081e3ffdcc7(Context p10, Intent p11) {
            Logger.d("SafeDK-Special|SafeDK: Call> Lio/bidmachine/core/Utils;->startActivity(Landroid/content/Context;Landroid/content/Intent;)V");
            if (p11 == null) {
                return;
            }
            BrandSafetyUtils.detectAdClick(p11, "io.bidmachine");
            Utils.startActivity(p10, p11);
        }

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NativeMediaPrivateData nativeMediaPrivateData = MediaView.this.nativeMediaData;
            if (nativeMediaPrivateData == null || nativeMediaPrivateData.getVideoUri() == null) {
                return;
            }
            io.bidmachine.core.Logger.d("Video has been clicked");
            MediaView mediaView = MediaView.this;
            MediaView.listener = mediaView;
            mediaView.finishedOrExpanded = true;
            int currentPosition = 0;
            if (MediaView.this.isMediaPlayerAvailable() && MediaView.this.mediaPlayer.isPlaying()) {
                currentPosition = MediaView.this.mediaPlayer.getCurrentPosition();
            }
            MediaView.this.pausePlayer();
            safedk_Utils_startActivity_37db7eccde16e1b8fab21081e3ffdcc7(MediaView.this.getContext(), VideoPlayerActivity.getIntent(MediaView.this.getContext(), MediaView.this.nativeMediaData.getVideoUri().getPath(), currentPosition));
        }
    }

    public class c implements DownloadVideoTask.OnLoadedListener {
        public c() {
        }

        @Override // io.bidmachine.nativead.tasks.DownloadVideoTask.OnLoadedListener
        public void onVideoLoaded(@NonNull DownloadVideoTask downloadVideoTask, Uri uri) {
            io.bidmachine.core.Logger.d("MediaView video is loaded");
            MediaView.this.nativeMediaData.setVideoUri(uri);
            MediaView.this.prepareMediaPlayer();
        }

        @Override // io.bidmachine.nativead.tasks.DownloadVideoTask.OnLoadedListener
        public void onVideoLoadingError(@NonNull DownloadVideoTask downloadVideoTask) {
            io.bidmachine.core.Logger.d("MediaView video is not loaded");
            MediaView.this.updateViewState(NativeState.Image);
            MediaView.this.hasVideo = false;
        }
    }

    public class d implements DownloadVastVideoTask.OnLoadedListener {
        public d() {
        }

        @Override // io.bidmachine.nativead.tasks.DownloadVastVideoTask.OnLoadedListener
        public void onVideoLoaded(@NonNull DownloadVastVideoTask downloadVastVideoTask, Uri uri, VastRequest vastRequest) {
            io.bidmachine.core.Logger.d("MediaView video is loaded");
            MediaView.this.nativeMediaData.setVideoUri(uri);
            MediaView.this.nativeMediaData.setVastRequest(vastRequest);
            MediaView.this.prepareMediaPlayer();
        }

        @Override // io.bidmachine.nativead.tasks.DownloadVastVideoTask.OnLoadedListener
        public void onVideoLoadingError(@NonNull DownloadVastVideoTask downloadVastVideoTask) {
            io.bidmachine.core.Logger.d("MediaView video is not loaded");
            MediaView.this.updateViewState(NativeState.Image);
            MediaView.this.hasVideo = false;
        }
    }

    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MediaView.this.cleanUpMediaPlayer();
        }
    }

    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                MediaView.this.startPlayVideoWhenReady = false;
                MediaView.this.cleanUpMediaPlayer();
                MediaView.this.updateViewState(NativeState.Image);
                MediaView.this.stopVideoVisibilityCheckerTimer();
                MediaView.this.error = true;
                MediaView.this.hasVideo = false;
                MediaView.this.processErrorEvent();
            } catch (Exception e10) {
                io.bidmachine.core.Logger.w(e10);
            }
        }
    }

    public class g implements View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (MediaView.this.isMediaPlayerAvailable()) {
                if (MediaView.this.isMuted) {
                    MediaView.this.mediaPlayer.setVolume(1.0f, 1.0f);
                    MediaView.this.isMuted = false;
                } else {
                    MediaView.this.mediaPlayer.setVolume(0.0f, 0.0f);
                    MediaView.this.isMuted = true;
                }
                MediaView.this.updateMuteButton();
            }
        }
    }

    public class h extends TimerTask {

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                MediaView.this.pausePlayer();
                if (MediaView.this.finishedOrExpanded) {
                    MediaView.this.stopVideoVisibilityCheckerTimer();
                }
            }
        }

        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                MediaView.this.tryPlayVideo();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$run$0(int i10) {
            return String.format("Video started: %s%%", Integer.valueOf(i10));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$run$1(int i10) {
            return String.format("Video at first quartile: %s%%", Integer.valueOf(i10));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$run$2(int i10) {
            return String.format("Video at midpoint: %s%%", Integer.valueOf(i10));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$run$3(int i10) {
            return String.format("Video at third quartile: %s%%", Integer.valueOf(i10));
        }

        public h() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            final int currentPosition;
            try {
                if (MediaView.this.error) {
                    MediaView.this.clearPlayerOnError();
                    return;
                }
                if (!MediaView.this.isAdOnScreen()) {
                    Utils.onUiThread(new a());
                    return;
                }
                try {
                    if (MediaView.this.isMediaPlayerAvailable() && !MediaView.this.error && MediaView.this.mediaPlayer.isPlaying()) {
                        if (MediaView.this.videoDuration == 0) {
                            MediaView mediaView = MediaView.this;
                            mediaView.videoDuration = mediaView.mediaPlayer.getDuration();
                        }
                        if (MediaView.this.videoDuration != 0 && (currentPosition = (MediaView.this.mediaPlayer.getCurrentPosition() * 100) / MediaView.this.videoDuration) >= MediaView.this.quartile * 25) {
                            if (MediaView.this.quartile == 0) {
                                io.bidmachine.core.Logger.d((LazyValue<String>) new LazyValue() { // from class: io.bidmachine.nativead.view.b
                                    @Override // io.bidmachine.utils.lazy.LazyValue
                                    public final Object get() {
                                        return MediaView.h.lambda$run$0(currentPosition);
                                    }
                                });
                                MediaView.this.processEvent(TrackingEvent.start);
                            } else if (MediaView.this.quartile == 1) {
                                io.bidmachine.core.Logger.d((LazyValue<String>) new LazyValue() { // from class: io.bidmachine.nativead.view.c
                                    @Override // io.bidmachine.utils.lazy.LazyValue
                                    public final Object get() {
                                        return MediaView.h.lambda$run$1(currentPosition);
                                    }
                                });
                                MediaView.this.processEvent(TrackingEvent.firstQuartile);
                            } else if (MediaView.this.quartile == 2) {
                                io.bidmachine.core.Logger.d((LazyValue<String>) new LazyValue() { // from class: io.bidmachine.nativead.view.d
                                    @Override // io.bidmachine.utils.lazy.LazyValue
                                    public final Object get() {
                                        return MediaView.h.lambda$run$2(currentPosition);
                                    }
                                });
                                MediaView.this.processEvent(TrackingEvent.midpoint);
                            } else if (MediaView.this.quartile == 3) {
                                io.bidmachine.core.Logger.d((LazyValue<String>) new LazyValue() { // from class: io.bidmachine.nativead.view.e
                                    @Override // io.bidmachine.utils.lazy.LazyValue
                                    public final Object get() {
                                        return MediaView.h.lambda$run$3(currentPosition);
                                    }
                                });
                                MediaView.this.processEvent(TrackingEvent.thirdQuartile);
                            }
                            MediaView.access$1708(MediaView.this);
                        }
                    }
                    io.bidmachine.core.Logger.d("MediaView is on screen");
                    Utils.onUiThread(new b());
                } catch (IllegalStateException unused) {
                    MediaView.this.clearPlayerOnError();
                }
            } catch (Throwable unused2) {
                MediaView.this.clearPlayerOnError();
            }
        }
    }

    public MediaView(Context context) {
        super(context);
        this.isInitialized = false;
        this.isMuted = true;
        this.videoWidth = 0;
        this.videoHeight = 0;
        this.videoSizeWasChanged = true;
        this.state = NativeState.Image;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$videoPlayerActivityClosed$0(int i10, boolean z10) {
        return String.format("MediaView videoPlayerActivityClosed, position: %s, finished: %s", Integer.valueOf(i10), Boolean.valueOf(z10));
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch("io.bidmachine", this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(@NonNull SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(@NonNull SurfaceTexture surfaceTexture, int i10, int i11) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(@NonNull SurfaceTexture surfaceTexture) {
    }

    public static /* synthetic */ class i {
        public static final /* synthetic */ int[] $SwitchMap$io$bidmachine$nativead$view$NativeState;

        static {
            int[] iArr = new int[NativeState.values().length];
            $SwitchMap$io$bidmachine$nativead$view$NativeState = iArr;
            try {
                iArr[NativeState.Image.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$bidmachine$nativead$view$NativeState[NativeState.Loading.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$bidmachine$nativead$view$NativeState[NativeState.Playing.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$bidmachine$nativead$view$NativeState[NativeState.Paused.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static /* synthetic */ int access$1708(MediaView mediaView) {
        int i10 = mediaView.quartile;
        mediaView.quartile = i10 + 1;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cleanUpMediaPlayer() {
        if (this.mediaPlayer != null) {
            try {
                if (!this.error) {
                    if (this.mediaPlayer.isPlaying()) {
                        this.mediaPlayer.stop();
                    }
                    this.mediaPlayer.reset();
                }
                this.mediaPlayer.setOnCompletionListener(null);
                this.mediaPlayer.setOnErrorListener(null);
                this.mediaPlayer.setOnPreparedListener(null);
                this.mediaPlayer.setOnVideoSizeChangedListener(null);
                this.mediaPlayer.release();
            } catch (Exception e10) {
                io.bidmachine.core.Logger.w(e10);
            }
            this.mediaPlayer = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayerOnError() {
        Utils.onUiThread(new f());
    }

    private void createMediaPlayer() {
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.mediaPlayer = mediaPlayer;
        mediaPlayer.setOnCompletionListener(this);
        this.mediaPlayer.setOnErrorListener(this);
        this.mediaPlayer.setOnPreparedListener(this);
        this.mediaPlayer.setOnVideoSizeChangedListener(this);
        this.mediaPlayer.setAudioStreamType(3);
        updateVolume();
    }

    private void fireUrls(@Nullable List<String> list) {
        if (list == null) {
            return;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            Utils.simpleTrackUrl(it.next(), NativeNetworkExecutor.getInstance());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isAdOnScreen() {
        return getGlobalVisibleRect(new Rect()) && isShown() && hasWindowFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isMediaPlayerAvailable() {
        return (this.error || this.mediaPlayer == null) ? false : true;
    }

    private void notifyVideoFinished() {
        if (this.isVideoFinishNotified) {
            return;
        }
        processEvent(TrackingEvent.complete);
        this.isVideoFinishNotified = true;
        io.bidmachine.core.Logger.d("MediaView: video finished");
    }

    private void notifyVideoStarted() {
        if (this.isVideoStartNotified) {
            return;
        }
        processImpressions();
        this.isVideoStartNotified = true;
        io.bidmachine.core.Logger.d("MediaView: video started");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void prepareMediaPlayer() {
        NativeMediaPrivateData nativeMediaPrivateData;
        try {
            if (this.mediaPlayerPrepared || (nativeMediaPrivateData = this.nativeMediaData) == null || nativeMediaPrivateData.getVideoUri() == null || this.mediaPlayerPreparing || this.error) {
                return;
            }
            this.mediaPlayer.setDataSource(getContext(), this.nativeMediaData.getVideoUri());
            this.mediaPlayer.prepareAsync();
            this.mediaPlayerPreparing = true;
        } catch (Exception e10) {
            io.bidmachine.core.Logger.w(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processErrorEvent() {
        NativeMediaPrivateData nativeMediaPrivateData = this.nativeMediaData;
        if (nativeMediaPrivateData == null || nativeMediaPrivateData.getVastRequest() == null) {
            return;
        }
        this.nativeMediaData.getVastRequest().sendVastSpecError(VastSpecError.SHOWING);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processEvent(@NonNull TrackingEvent trackingEvent) {
        NativeInteractor nativeInteractor;
        NativeMediaPrivateData nativeMediaPrivateData = this.nativeMediaData;
        if (nativeMediaPrivateData != null && nativeMediaPrivateData.getVastRequest() != null && this.nativeMediaData.getVastRequest().getVastAd() != null) {
            fireUrls(this.nativeMediaData.getVastRequest().getVastAd().getTrackingEventListMap().get(trackingEvent));
        }
        if (trackingEvent != TrackingEvent.complete || (nativeInteractor = this.nativeInteractor) == null) {
            return;
        }
        nativeInteractor.dispatchVideoPlayFinished();
    }

    private void processImpressions() {
        NativeMediaPrivateData nativeMediaPrivateData = this.nativeMediaData;
        if (nativeMediaPrivateData == null || nativeMediaPrivateData.getVastRequest() == null || this.nativeMediaData.getVastRequest().getVastAd() == null) {
            return;
        }
        fireUrls(this.nativeMediaData.getVastRequest().getVastAd().getImpressionUrlList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tryPlayVideo() {
        try {
            if (this.mediaPlayer == null) {
                createMediaPlayer();
            }
            if (!this.mediaPlayerPrepared) {
                prepareMediaPlayer();
            }
            if (isMediaPlayerAvailable() && this.mediaPlayerPrepared && this.viewOnScreen && isAdOnScreen()) {
                if (!this.mediaPlayer.isPlaying()) {
                    this.mediaPlayer.start();
                    notifyVideoStarted();
                    if (this.videoVisibilityCheckerTimer == null) {
                        startVideoVisibilityCheckerTimer();
                    }
                }
                if (this.mediaPlayer.getCurrentPosition() > 0) {
                    NativeState nativeState = this.state;
                    NativeState nativeState2 = NativeState.Playing;
                    if (nativeState != nativeState2) {
                        updateViewState(nativeState2);
                    }
                }
            }
        } catch (Exception e10) {
            io.bidmachine.core.Logger.w(e10);
            clearPlayerOnError();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateMuteButton() {
        CircleCountdownView circleCountdownView = this.muteButton;
        if (circleCountdownView != null) {
            if (this.isMuted) {
                circleCountdownView.setImage(Assets.getBitmapFromBase64(Assets.UNMUTE));
            } else {
                circleCountdownView.setImage(Assets.getBitmapFromBase64(Assets.MUTE));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateViewState(@NonNull NativeState nativeState) {
        this.state = nativeState;
        int i10 = i.$SwitchMap$io$bidmachine$nativead$view$NativeState[nativeState.ordinal()];
        if (i10 == 1) {
            ImageView imageView = this.imageView;
            if (imageView != null) {
                imageView.setVisibility(0);
                this.imageView.bringToFront();
            }
            if (this.hasVideo) {
                this.textureView.setVisibility(4);
                this.progressBarView.setVisibility(4);
                this.playButton.setVisibility(4);
                this.muteButton.setVisibility(4);
                return;
            }
            return;
        }
        if (i10 == 2) {
            ImageView imageView2 = this.imageView;
            if (imageView2 != null) {
                imageView2.setVisibility(0);
                this.imageView.bringToFront();
            }
            if (this.hasVideo) {
                this.progressBarView.setVisibility(0);
                this.progressBarView.bringToFront();
                this.textureView.setVisibility(4);
                this.playButton.setVisibility(4);
                this.muteButton.setVisibility(4);
                return;
            }
            return;
        }
        if (i10 == 3) {
            ImageView imageView3 = this.imageView;
            if (imageView3 != null) {
                imageView3.setVisibility(4);
            }
            if (this.hasVideo) {
                this.textureView.setVisibility(0);
                this.textureView.bringToFront();
                this.muteButton.setVisibility(0);
                this.muteButton.bringToFront();
                updateMuteButton();
                this.progressBarView.setVisibility(4);
                this.playButton.setVisibility(4);
                return;
            }
            return;
        }
        if (i10 != 4) {
            return;
        }
        ImageView imageView4 = this.imageView;
        if (imageView4 != null) {
            imageView4.setVisibility(0);
            this.imageView.bringToFront();
        }
        if (this.hasVideo) {
            this.playButton.setVisibility(0);
            this.playButton.bringToFront();
            this.textureView.setVisibility(4);
            this.progressBarView.setVisibility(4);
            this.muteButton.setVisibility(4);
        }
    }

    public void applyNative(@NonNull NativeData nativeData, @NonNull NativeMediaPrivateData nativeMediaPrivateData, @NonNull NativeInteractor nativeInteractor) {
        this.nativeData = nativeData;
        this.nativeMediaData = nativeMediaPrivateData;
        this.nativeInteractor = nativeInteractor;
        if (nativeMediaPrivateData.getVideoUri() != null || !TextUtils.isEmpty(nativeData.getVideoUrl()) || !TextUtils.isEmpty(nativeData.getVideoAdm())) {
            this.hasVideo = true;
        }
        createView();
    }

    public void createView() {
        if (!this.isInitialized) {
            this.isInitialized = true;
            ImageView imageView = new ImageView(getContext());
            this.imageView = imageView;
            imageView.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            this.imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.imageView.setAdjustViewBounds(true);
            addView(this.imageView);
            if (this.hasVideo) {
                int iRound = Math.round(Utils.getScreenDensity(getContext()) * 50.0f);
                this.progressBarView = new ProgressBar(getContext(), null, R.attr.progressBarStyleLarge);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iRound, iRound);
                layoutParams.addRule(13, -1);
                this.progressBarView.setLayoutParams(layoutParams);
                this.progressBarView.setBackgroundColor(Color.parseColor("#6b000000"));
                this.progressBarView.setVisibility(4);
                addView(this.progressBarView);
                ImageView imageView2 = new ImageView(getContext());
                this.playButton = imageView2;
                imageView2.setImageResource(R.drawable.ic_media_play);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iRound, iRound);
                layoutParams2.addRule(13, -1);
                this.playButton.setLayoutParams(layoutParams2);
                this.playButton.setOnClickListener(new a());
                this.playButton.setVisibility(4);
                addView(this.playButton);
                TextureView textureView = new TextureView(getContext());
                this.textureView = textureView;
                textureView.setSurfaceTextureListener(this);
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams3.addRule(13);
                this.textureView.setLayoutParams(layoutParams3);
                this.textureView.setOnClickListener(new b());
                addView(this.textureView);
                createMuteButton();
                createMediaPlayer();
                NativeMediaPrivateData nativeMediaPrivateData = this.nativeMediaData;
                if (nativeMediaPrivateData != null && nativeMediaPrivateData.getVideoUri() != null && this.nativeMediaData.getVideoUri().getPath() != null && new File(this.nativeMediaData.getVideoUri().getPath()).exists()) {
                    this.startPlayVideoWhenReady = true;
                } else if (this.nativeData != null) {
                    updateViewState(NativeState.Loading);
                    if (!TextUtils.isEmpty(this.nativeData.getVideoUrl())) {
                        executeTask(new DownloadVideoTask(getContext(), new c(), this.nativeData.getVideoUrl()));
                    } else if (!TextUtils.isEmpty(this.nativeData.getVideoAdm())) {
                        executeTask(new DownloadVastVideoTask(getContext(), new d(), this.nativeData.getVideoAdm()));
                    }
                }
            } else {
                updateViewState(NativeState.Image);
            }
        }
        if (this.nativeMediaData != null) {
            ImageHelper.fillImageView(getContext(), this.imageView, this.nativeMediaData.getImageUri(), this.nativeMediaData.getImageDrawable());
        }
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
        io.bidmachine.core.Logger.d("MediaView: onError");
        clearPlayerOnError();
        return true;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(MediaPlayer mediaPlayer) {
        io.bidmachine.core.Logger.d("MediaView: onPrepared");
        this.mediaPlayerPrepared = true;
        if (this.startPlayVideoWhenReady) {
            tryPlayVideo();
        } else {
            updateViewState(NativeState.Paused);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(@NonNull SurfaceTexture surfaceTexture, int i10, int i11) {
        try {
            if (this.mediaPlayer == null) {
                createMediaPlayer();
            }
            this.mediaPlayer.setSurface(new Surface(surfaceTexture));
            prepareMediaPlayer();
        } catch (Exception e10) {
            io.bidmachine.core.Logger.w(e10);
            updateViewState(NativeState.Image);
            this.hasVideo = false;
        }
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i10, int i11) {
        this.videoWidth = i10;
        this.videoHeight = i11;
        this.videoSizeWasChanged = true;
        updateTextureLayoutParams();
    }

    public void onViewAppearOnScreen() {
        io.bidmachine.core.Logger.d("MediaView: onViewAppearOnScreen");
        this.viewOnScreen = true;
        if (this.startPlayVideoWhenReady) {
            tryPlayVideo();
        } else if (this.state != NativeState.Loading) {
            updateViewState(NativeState.Paused);
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i10) {
        if (i10 != 0) {
            pausePlayer();
        } else if (this.startPlayVideoWhenReady) {
            tryPlayVideo();
        }
        super.onWindowVisibilityChanged(i10);
    }

    public void release() {
        new Thread(new e()).start();
    }

    public void startVideoVisibilityCheckerTimer() {
        if (this.hasVideo) {
            Timer timer = new Timer();
            this.videoVisibilityCheckerTimer = timer;
            timer.schedule(new h(), 0L, 500);
        }
    }

    public void stopVideoVisibilityCheckerTimer() {
        Timer timer = this.videoVisibilityCheckerTimer;
        if (timer != null) {
            timer.cancel();
            this.videoVisibilityCheckerTimer = null;
        }
    }

    @Override // io.bidmachine.nativead.view.VideoPlayerActivity.c
    public void videoPlayerActivityClosed(final int i10, final boolean z10) {
        io.bidmachine.core.Logger.d((LazyValue<String>) new LazyValue() { // from class: io.bidmachine.nativead.view.a
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                return MediaView.lambda$videoPlayerActivityClosed$0(i10, z10);
            }
        });
        try {
            if (z10) {
                videoFinished();
            } else if (isMediaPlayerAvailable()) {
                this.mediaPlayer.seekTo(i10);
            }
        } catch (Exception e10) {
            io.bidmachine.core.Logger.w(e10);
        }
        listener = null;
    }

    private void createMuteButton() {
        Context context = getContext();
        float screenDensity = Utils.getScreenDensity(context);
        int iRound = Math.round(40.0f * screenDensity);
        int iRound2 = Math.round(screenDensity * 8.0f);
        CircleCountdownView circleCountdownView = new CircleCountdownView(context);
        this.muteButton = circleCountdownView;
        circleCountdownView.setColors(Assets.MAIN_ASSETS_COLOR, Assets.BACKGROUND_COLOR);
        this.muteButton.setPadding(iRound2, iRound2, iRound2, iRound2);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iRound, iRound);
        layoutParams.addRule(9);
        layoutParams.addRule(10);
        this.muteButton.setLayoutParams(layoutParams);
        updateMuteButton();
        this.muteButton.setOnClickListener(new g());
        addView(this.muteButton);
    }

    private void executeTask(@NonNull Runnable runnable) {
        NativeNetworkExecutor.getInstance().execute(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pausePlayer() {
        try {
            if (isMediaPlayerAvailable() && this.mediaPlayer.isPlaying()) {
                this.mediaPlayer.pause();
            }
            if (this.state != NativeState.Loading) {
                updateViewState(NativeState.Paused);
            }
        } catch (Exception e10) {
            io.bidmachine.core.Logger.w(e10);
        }
    }

    private void updateTextureLayoutParams() {
        int width = getWidth();
        int height = getHeight();
        if (width != 0 && height != 0 && this.videoSizeWasChanged && this.videoWidth != 0 && this.videoHeight != 0) {
            this.videoSizeWasChanged = false;
            ViewGroup.LayoutParams layoutParams = this.textureView.getLayoutParams();
            int i10 = this.videoWidth;
            int i11 = this.videoHeight;
            if (i10 > i11) {
                layoutParams.width = width;
                layoutParams.height = (width * i11) / i10;
            } else {
                layoutParams.width = (i10 * height) / i11;
                layoutParams.height = height;
            }
            this.textureView.setLayoutParams(layoutParams);
        }
    }

    private void updateVolume() {
        if (isMediaPlayerAvailable()) {
            if (this.isMuted) {
                this.mediaPlayer.setVolume(0.0f, 0.0f);
            } else {
                this.mediaPlayer.setVolume(1.0f, 1.0f);
            }
        }
    }

    private void videoFinished() {
        notifyVideoFinished();
        stopVideoVisibilityCheckerTimer();
        pausePlayer();
        if (isMediaPlayerAvailable()) {
            this.mediaPlayer.seekTo(0);
        }
        this.finishedOrExpanded = true;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) {
        videoFinished();
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        updateTextureLayoutParams();
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (mode != 1073741824) {
            if (mode == Integer.MIN_VALUE) {
                size = Math.min(size, measuredWidth);
            } else {
                size = measuredWidth;
            }
        }
        int i12 = (int) (size * ASPECT_MULTIPLIER_WIDTH_TO_HEIGHT);
        if (mode2 == 1073741824 && size2 < i12) {
            size = (int) (size2 * ASPECT_MULTIPLIER_HEIGHT_TO_WIDTH);
        } else {
            size2 = i12;
        }
        if (Math.abs(size2 - measuredHeight) >= 2 || Math.abs(size - measuredWidth) >= 2) {
            getLayoutParams().width = size;
            getLayoutParams().height = size2;
        }
        super.onMeasure(i10, i11);
    }

    public void setNativeAdObject(@NonNull NativeAdObject nativeAdObject) {
        applyNative(nativeAdObject, nativeAdObject, nativeAdObject);
    }

    public MediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.isInitialized = false;
        this.isMuted = true;
        this.videoWidth = 0;
        this.videoHeight = 0;
        this.videoSizeWasChanged = true;
        this.state = NativeState.Image;
    }

    public MediaView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.isInitialized = false;
        this.isMuted = true;
        this.videoWidth = 0;
        this.videoHeight = 0;
        this.videoSizeWasChanged = true;
        this.state = NativeState.Image;
    }

    public MediaView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.isInitialized = false;
        this.isMuted = true;
        this.videoWidth = 0;
        this.videoHeight = 0;
        this.videoSizeWasChanged = true;
        this.state = NativeState.Image;
    }
}
