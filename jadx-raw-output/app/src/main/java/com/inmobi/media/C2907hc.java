package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.VideoView;
import androidx.appcompat.widget.ActivityChooserModel;
import com.inmobi.media.C2907hc;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.InMobiVideoBridge;
import com.safedk.android.utils.Logger;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import me.goldze.mvvmhabit.base.ContainerActivity;

/* JADX INFO: renamed from: com.inmobi.media.hc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2907hc extends VideoView implements MediaPlayer.OnCompletionListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnErrorListener, Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3028m9 f24492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C2856fc f24493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewGroup f24494c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterfaceC2882gc f24495d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f24496e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final WeakReference f24497f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f24498g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f24499h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f24500i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f24501j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f24502k;

    public static final void a(C2907hc c2907hc, MediaPlayer mediaPlayer, int i10, int i11) {
        InterfaceC3028m9 interfaceC3028m9 = c2907hc.f24492a;
        if (interfaceC3028m9 != null) {
            ((C3053n9) interfaceC3028m9).a("MediaRenderView", ">>> onVideoSizeChanged");
        }
        if (c2907hc.f24493b == null) {
            C2856fc c2856fc = new C2856fc(c2907hc.getContext());
            c2907hc.f24493b = c2856fc;
            c2856fc.setAnchorView(c2907hc);
            c2907hc.setMediaController(c2907hc.f24493b);
            c2907hc.requestLayout();
            c2907hc.requestFocus();
        }
    }

    private void safedk_videoview_hc_VideoViewPlay_1cd25093e0b187dede2869d94281a264() {
        Logger.d("InMobiVideo|SafeDK: Partial-Video> Lcom/inmobi/media/hc;->safedk_videoview_hc_VideoViewPlay_1cd25093e0b187dede2869d94281a264()V");
        if (SafeDK.aa()) {
            try {
                Logger.d("VideoBridge", "VideoViewPlay: player " + this + ", isOnUiThread = " + com.safedk.android.utils.k.c());
                CreativeInfoManager.a(com.safedk.android.utils.g.f44963i, (Object) this);
                CreativeInfoManager.a(com.safedk.android.utils.g.f44963i, BrandSafetyUtils.a(this), false);
            } catch (Exception e10) {
                Logger.d("VideoBridge", "exception in VideoViewPlay: " + e10.getMessage());
            }
        }
        super.start();
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.f44963i, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        ck.p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        ck.p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        ck.p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        ck.p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        ck.p.j(bundle, ContainerActivity.BUNDLE);
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        Logger.d("InMobi|SafeDK: Execution> Lcom/inmobi/media/hc;->onCompletion(Landroid/media/MediaPlayer;)V");
        CreativeInfoManager.onVideoCompleted(com.safedk.android.utils.g.f44963i, mediaPlayer);
        safedk_hc_onCompletion_b235d2fdaf12e000adbe1c2190f1d0c6(mediaPlayer);
    }

    @Override // android.widget.VideoView, android.view.SurfaceView, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public final void setAudioMuted(boolean z10) {
    }

    public final void setPlayerPrepared(boolean z10) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2907hc(Activity activity, InterfaceC3028m9 interfaceC3028m9) {
        super(activity);
        ck.p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        this.f24492a = interfaceC3028m9;
        setZOrderOnTop(true);
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT < 28) {
            setDrawingCacheEnabled(true);
        }
        this.f24498g = 100;
        this.f24501j = -1;
        this.f24502k = 0;
        this.f24497f = new WeakReference(activity);
        Context context = Ji.f22951a;
        ck.p.j(this, "lifecycleCallbacks");
        activity.getApplication().unregisterActivityLifecycleCallbacks(this);
        activity.getApplication().registerActivityLifecycleCallbacks(this);
    }

    public final void b() {
        InterfaceC3028m9 interfaceC3028m9 = this.f24492a;
        if (interfaceC3028m9 != null) {
            ((C3053n9) interfaceC3028m9).a("MediaRenderView", "Release the media render view");
        }
        InMobiVideoBridge.VideoViewStop(this);
        ViewGroup viewGroup = this.f24494c;
        if (viewGroup != null) {
            ViewParent parent = viewGroup.getParent();
            ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup2 != null) {
                viewGroup2.removeView(this.f24494c);
            }
            ViewParent parent2 = getParent();
            ViewGroup viewGroup3 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
            if (viewGroup3 != null) {
                viewGroup3.removeView(this);
            }
            setBackgroundColor(0);
            this.f24494c = null;
        }
        setMediaController(null);
        this.f24493b = null;
        InterfaceC2882gc interfaceC2882gc = this.f24495d;
        if (interfaceC2882gc != null) {
            ck.p.j(this, CampaignEx.JSON_KEY_AD_MP);
            InterfaceC3028m9 interfaceC3028m10 = ((C3255vc) interfaceC2882gc).f25564a.f25634b;
            if (interfaceC3028m10 != null) {
                ((C3053n9) interfaceC3028m10).a("MraidMediaProcessor", ">>> onPlayerCompleted");
            }
            ViewGroup viewContainer = getViewContainer();
            if (viewContainer != null) {
                ViewParent parent3 = viewContainer.getParent();
                ViewGroup viewGroup4 = parent3 instanceof ViewGroup ? (ViewGroup) parent3 : null;
                if (viewGroup4 != null) {
                    viewGroup4.removeView(viewContainer);
                }
            }
            setViewContainer(null);
        }
    }

    public final int getCurrentAudioVolume() {
        return this.f24498g;
    }

    @Override // android.view.View
    public final String getId() {
        return this.f24499h;
    }

    public final InterfaceC2882gc getListener() {
        return this.f24495d;
    }

    public final int getMCurrentPosition() {
        return this.f24502k;
    }

    public final String getPlaybackUrl() {
        return this.f24500i;
    }

    public final int getPreviousPosition() {
        return this.f24501j;
    }

    public final ViewGroup getViewContainer() {
        return this.f24494c;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        ck.p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        activity.getApplication().unregisterActivityLifecycleCallbacks(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        ck.p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        if (this.f24497f.get() == null || !ck.p.e(this.f24497f.get(), activity)) {
            return;
        }
        this.f24496e = false;
        start();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        ck.p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        Activity activity2 = (Activity) this.f24497f.get();
        if (activity2 == null || !ck.p.e(activity2, activity)) {
            return;
        }
        this.f24496e = true;
        if (getCurrentPosition() != 0) {
            this.f24502k = getCurrentPosition();
        }
        pause();
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
        ck.p.j(mediaPlayer, CampaignEx.JSON_KEY_AD_MP);
        InterfaceC3028m9 interfaceC3028m9 = this.f24492a;
        if (interfaceC3028m9 != null) {
            ((C3053n9) interfaceC3028m9).b("MediaRenderView", ">>> onError (" + i10 + ", " + i11 + ")");
        }
        b();
        return false;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        ck.p.j(mediaPlayer, CampaignEx.JSON_KEY_AD_MP);
        InterfaceC3028m9 interfaceC3028m9 = this.f24492a;
        if (interfaceC3028m9 != null) {
            ((C3053n9) interfaceC3028m9).a("MediaRenderView", ">>> onPrepared");
        }
        mediaPlayer.setOnVideoSizeChangedListener(new MediaPlayer.OnVideoSizeChangedListener() { // from class: b7.w7
            @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
            public final void onVideoSizeChanged(MediaPlayer mediaPlayer2, int i10, int i11) {
                C2907hc.a(this.f5231b, mediaPlayer2, i10, i11);
            }
        });
        int i10 = this.f24502k;
        if (i10 < getDuration()) {
            this.f24502k = i10;
            seekTo(i10);
        }
        InterfaceC2882gc interfaceC2882gc = this.f24495d;
        if (interfaceC2882gc != null) {
            ck.p.j(this, CampaignEx.JSON_KEY_AD_MP);
            InterfaceC3028m9 interfaceC3028m10 = ((C3255vc) interfaceC2882gc).f25564a.f25634b;
            if (interfaceC3028m10 != null) {
                ((C3053n9) interfaceC3028m10).a("MraidMediaProcessor", ">>> onPlayerPrepared");
            }
        }
        start();
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i10) {
        Context context;
        ck.p.j(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        super.onVisibilityChanged(view, i10);
        InterfaceC3028m9 interfaceC3028m9 = this.f24492a;
        if (interfaceC3028m9 != null) {
            ((C3053n9) interfaceC3028m9).a("MediaRenderView", ">>> onVisibilityChanged (" + i10 + ")");
        }
        if (i10 != 0 || (context = Ji.f22951a) == null) {
            return;
        }
        setBackground(new BitmapDrawable(context.getResources(), (Bitmap) null));
    }

    @Override // android.widget.VideoView, android.widget.MediaController.MediaPlayerControl
    public final void pause() {
        InterfaceC3028m9 interfaceC3028m9 = this.f24492a;
        if (interfaceC3028m9 != null) {
            ((C3053n9) interfaceC3028m9).a("MediaRenderView", "Pause media playback");
        }
        super.pause();
    }

    public void safedk_hc_onCompletion_b235d2fdaf12e000adbe1c2190f1d0c6(MediaPlayer p10) {
        ck.p.j(p10, CampaignEx.JSON_KEY_AD_MP);
        InterfaceC3028m9 interfaceC3028m9 = this.f24492a;
        if (interfaceC3028m9 != null) {
            ((C3053n9) interfaceC3028m9).a("MediaRenderView", ">>> onCompletion");
        }
    }

    public final void setCurrentAudioVolume(int i10) {
        this.f24498g = i10;
    }

    public final void setId(String str) {
        this.f24499h = str;
    }

    public final void setListener(InterfaceC2882gc interfaceC2882gc) {
        this.f24495d = interfaceC2882gc;
    }

    public final void setMCurrentPosition(int i10) {
        this.f24502k = i10;
    }

    public final void setPlaybackData(String str) {
        String str2;
        ck.p.j(str, "url");
        byte[] bytes = str.getBytes(lk.c.f63591b);
        ck.p.i(bytes, "getBytes(...)");
        StringBuilder sb2 = new StringBuilder();
        for (byte b10 : bytes) {
            if (((byte) (b10 & (-128))) > 0) {
                sb2.append("%");
                char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
                sb2.append(new String(new char[]{cArr[(b10 >> 4) & 15], cArr[(byte) (b10 & 15)]}));
            } else {
                sb2.append((char) b10);
            }
        }
        try {
            String string = sb2.toString();
            ck.p.i(string, "toString(...)");
            byte[] bytes2 = string.getBytes(lk.c.f63591b);
            ck.p.i(bytes2, "getBytes(...)");
            str2 = new String(bytes2, lk.c.f63596g);
        } catch (UnsupportedEncodingException unused) {
            str2 = "";
        }
        this.f24500i = str2;
        this.f24499h = "anonymous";
    }

    public final void setPlaybackUrl(String str) {
        this.f24500i = str;
    }

    public final void setPreviousPosition(int i10) {
        this.f24501j = i10;
    }

    public final void setViewContainer(ViewGroup viewGroup) {
        this.f24494c = viewGroup;
    }

    @Override // android.widget.VideoView, android.widget.MediaController.MediaPlayerControl
    public final void start() {
        if (this.f24496e) {
            return;
        }
        InterfaceC3028m9 interfaceC3028m9 = this.f24492a;
        if (interfaceC3028m9 != null) {
            ((C3053n9) interfaceC3028m9).a("MediaRenderView", "Start media playback");
        }
        safedk_videoview_hc_VideoViewPlay_1cd25093e0b187dede2869d94281a264();
    }

    @Override // android.widget.VideoView, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        getHolder().setSizeFromLayout();
    }

    @Override // android.view.SurfaceView, android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        InterfaceC3028m9 interfaceC3028m9 = this.f24492a;
        if (interfaceC3028m9 != null) {
            ((C3053n9) interfaceC3028m9).a("MediaRenderView", ">>> onWindowVisibilityChanged (" + i10 + ")");
        }
    }

    public final void a() {
        InMobiVideoBridge.VideoViewSetVideoPath(this, this.f24500i);
        setOnCompletionListener(this);
        setOnPreparedListener(this);
        setOnErrorListener(this);
        if (this.f24493b == null) {
            C2856fc c2856fc = new C2856fc(getContext());
            this.f24493b = c2856fc;
            c2856fc.setAnchorView(this);
            setMediaController(this.f24493b);
        }
    }
}
