package chuangyuan.ycj.videolibrary.widget;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.AnimationDrawable;
import android.os.Handler;
import android.os.Message;
import android.transition.ChangeBounds;
import android.transition.TransitionManager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.OrientationEventListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.content.ContextCompat;
import chuangyuan.ycj.videolibrary.R$color;
import chuangyuan.ycj.videolibrary.R$drawable;
import chuangyuan.ycj.videolibrary.R$id;
import chuangyuan.ycj.videolibrary.R$layout;
import chuangyuan.ycj.videolibrary.R$styleable;
import com.google.android.exoplayer2.ui.ExoPlayerView;
import com.google.android.exoplayer2.ui.PlayerControlView;
import com.google.android.exoplayer2.ui.PlayerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import q.f;

/* JADX INFO: loaded from: classes11.dex */
abstract class BaseView extends FrameLayout {
    public static final String R = VideoPlayerView.class.getName();
    public static WeakHashMap<String, Long> S = new WeakHashMap<>();
    public static WeakHashMap<String, Integer> T = new WeakHashMap<>();
    public f A;
    public View.OnClickListener B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public ArrayList<String> J;
    public AnimationDrawable K;
    public final View.OnTouchListener L;
    public final View.OnTouchListener M;
    public OrientationEventListener N;
    public int O;
    public int P;
    public Handler Q;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Activity f5956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ExoPlayerView f5957c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f5958d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f5959e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f5960f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public View f5961g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public View f5962h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public View f5963i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ImageView f5964j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ImageView f5965k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ImageView f5966l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ImageView f5967m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ImageView f5968n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final GestureControlView f5969o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ActionControlView f5970p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final chuangyuan.ycj.videolibrary.widget.c f5971q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final chuangyuan.ycj.videolibrary.widget.a f5972r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final PlayerControlView f5973s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public chuangyuan.ycj.videolibrary.widget.b f5974t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public AlertDialog f5975u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public q.c f5976v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f5977w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f5978x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f5979y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @DrawableRes
    public int f5980z;

    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f5981b;

        public a(ViewGroup viewGroup) {
            this.f5981b = viewGroup;
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewGroup viewGroup = this.f5981b;
            if (viewGroup != null) {
                viewGroup.removeView(BaseView.this.f5957c);
            }
            BaseView baseView = BaseView.this;
            baseView.addView(baseView.f5957c);
        }
    }

    public class b implements View.OnTouchListener {
        public b() {
        }

        @Override // android.view.View.OnTouchListener
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                BaseView baseView = BaseView.this;
                if (baseView.f5976v == null) {
                    return false;
                }
                if (baseView.B != null) {
                    BaseView.this.B.onClick(view);
                } else {
                    BaseView.this.f5976v.f();
                }
            }
            return false;
        }
    }

    public class c implements View.OnTouchListener {
        public c() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (!BaseView.this.H || BaseView.this.f5971q.d() || !BaseView.this.D) {
                return false;
            }
            if (BaseView.this.A != null) {
                BaseView.this.A.onTouchEvent(motionEvent);
            }
            if ((motionEvent.getAction() & 255) == 1 && BaseView.this.A != null) {
                BaseView.this.A.r();
            }
            return false;
        }
    }

    public class d extends Handler {
        public d() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            BaseView baseView = BaseView.this;
            OrientationEventListener orientationEventListener = baseView.N;
            if (orientationEventListener != null) {
                baseView.O = -2;
                orientationEventListener.enable();
            }
        }
    }

    public class e extends OrientationEventListener {
        public e(Context context) {
            super(context);
        }

        @Override // android.view.OrientationEventListener
        public void onOrientationChanged(int i10) {
            BaseView baseView = BaseView.this;
            if (baseView.O == -2) {
                baseView.O = i10;
            }
            baseView.P = Math.abs(baseView.O - i10);
            BaseView baseView2 = BaseView.this;
            if (baseView2.P > 40) {
                baseView2.O = i10;
                if (s.c.b(baseView2.f5956b)) {
                    if (BaseView.this.f5956b.getRequestedOrientation() == 4) {
                        return;
                    }
                    BaseView.this.f5956b.setRequestedOrientation(4);
                    return;
                }
                if (BaseView.this.f5956b.getRequestedOrientation() == 4) {
                    if (BaseView.this.getResources().getConfiguration().orientation == 2) {
                        BaseView.this.f5956b.setRequestedOrientation(0);
                        return;
                    } else {
                        BaseView.this.f5956b.setRequestedOrientation(1);
                        return;
                    }
                }
                if (BaseView.this.f5956b.getRequestedOrientation() != 1) {
                    if (i10 > 45 && i10 < 135) {
                        if (BaseView.this.f5956b.getRequestedOrientation() != 8) {
                            BaseView.this.f5956b.setRequestedOrientation(8);
                        }
                    } else {
                        if (i10 <= 225 || i10 >= 315 || BaseView.this.f5956b.getRequestedOrientation() == 0) {
                            return;
                        }
                        BaseView.this.f5956b.setRequestedOrientation(0);
                    }
                }
            }
        }
    }

    public BaseView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BaseView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        int i11;
        int resourceId;
        int resourceId2;
        int resourceId3;
        super(context, attributeSet, i10);
        int i12 = 0;
        this.f5979y = 0;
        this.f5980z = R$drawable.ic_exo_back;
        this.C = true;
        this.H = true;
        this.L = new b();
        this.M = new c();
        this.Q = new d();
        this.f5956b = s.e.n(context);
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        ExoPlayerView exoPlayerView = new ExoPlayerView(getContext(), attributeSet, i10);
        this.f5957c = exoPlayerView;
        this.f5973s = exoPlayerView.getControllerView();
        this.f5972r = new chuangyuan.ycj.videolibrary.widget.a(getContext(), attributeSet, i10, this);
        this.f5969o = new GestureControlView(getContext(), attributeSet, i10);
        this.f5970p = new ActionControlView(getContext(), attributeSet, i10);
        this.f5971q = new chuangyuan.ycj.videolibrary.widget.c(getContext(), attributeSet, i10, this);
        addView(exoPlayerView, layoutParams);
        int resourceId4 = R$layout.simple_exo_play_load;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, R$styleable.VideoPlayerView, 0, 0);
            try {
                this.f5980z = typedArrayObtainStyledAttributes.getResourceId(R$styleable.VideoPlayerView_player_back_image, this.f5980z);
                resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.VideoPlayerView_user_watermark, 0);
                this.E = typedArrayObtainStyledAttributes.getBoolean(R$styleable.VideoPlayerView_player_list, false);
                resourceId2 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.VideoPlayerView_default_artwork, 0);
                resourceId4 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.VideoPlayerView_player_load_layout_id, resourceId4);
                resourceId3 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.VideoPlayerView_player_preview_layout_id, 0);
                int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.VideoPlayerView_player_custom_layout_id, 0);
                int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.VideoPlayerView_controller_layout_id, R$layout.simple_exo_playback_control_view);
                if (resourceId3 == 0 && (resourceId6 == R$layout.simple_exo_playback_list_view || resourceId6 == R$layout.simple_exo_playback_top_view)) {
                    resourceId3 = R$layout.exo_default_preview_layout;
                }
                int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.VideoPlayerView_player_custom_top_ad_id, 0);
                typedArrayObtainStyledAttributes.recycle();
                i11 = resourceId7;
                i12 = resourceId5;
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        } else {
            i11 = 0;
            resourceId = 0;
            resourceId2 = 0;
            resourceId3 = 0;
        }
        if (i12 != 0) {
            this.f5962h = View.inflate(context, i12, null);
        }
        this.f5959e = View.inflate(context, resourceId4, null);
        if (resourceId3 != 0) {
            this.f5960f = View.inflate(context, resourceId3, null);
        }
        if (i11 != 0) {
            this.f5963i = View.inflate(context, i11, null);
        }
        h();
        g(resourceId, resourceId2);
    }

    public void A(int i10) {
        if (i10 == 0) {
            H();
            this.f5957c.j();
            E(8);
            t(0, true);
            C(8);
            B(8);
            D(8);
            x(8);
        } else {
            J();
        }
        this.f5970p.f(i10);
    }

    public void B(int i10) {
        if (i10 == 0) {
            x(8);
            E(8);
            C(8);
            A(8);
        }
        View view = this.f5959e;
        if (view != null) {
            view.setVisibility(i10);
        }
    }

    public void C(int i10) {
        this.f5971q.g(i10);
    }

    public void D(int i10) {
        View view = this.f5960f;
        if (view == null || view.getVisibility() == i10) {
            return;
        }
        this.f5960f.setVisibility(i10);
        ExoPlayerView exoPlayerView = this.f5957c;
        int i11 = R$id.exo_preview_play;
        if (exoPlayerView.findViewById(i11) != null) {
            this.f5957c.findViewById(i11).setVisibility(i10);
        }
    }

    public void E(int i10) {
        if (i10 == 0) {
            this.f5973s.G();
            x(8);
            v(8);
            D(8);
            C(8);
            B(8);
            u(0);
            A(8);
            t(0, true);
        }
        this.f5970p.g(i10);
    }

    public void F(int i10) {
        ActionControlView actionControlView = this.f5970p;
        if (actionControlView != null) {
            actionControlView.i(i10);
        }
    }

    public void G() {
        OrientationEventListener orientationEventListener = this.N;
        if (orientationEventListener != null) {
            orientationEventListener.enable();
        }
    }

    public void H() {
        AnimationDrawable animationDrawable = this.K;
        if (animationDrawable == null || animationDrawable.isRunning()) {
            return;
        }
        this.K.start();
    }

    public void I() {
        this.N = new e(this.f5956b);
    }

    public void J() {
        AnimationDrawable animationDrawable = this.K;
        if (animationDrawable != null) {
            animationDrawable.stop();
        }
    }

    public void K() {
        OrientationEventListener orientationEventListener = this.N;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
        }
    }

    public void e(int i10) {
        ActionControlView actionControlView = this.f5970p;
        if (actionControlView != null) {
            actionControlView.b(i10);
        }
    }

    public void f(int i10) {
        ActionControlView actionControlView = this.f5970p;
        if (actionControlView != null) {
            actionControlView.h(i10);
        }
    }

    public void g(int i10, int i11) {
        if (i10 != 0) {
            this.f5964j.setImageResource(i10);
        }
        if (i11 != 0) {
            setPreviewImage(BitmapFactory.decodeResource(getResources(), i11));
        }
    }

    public boolean getAdRewardVisibilty() {
        ActionControlView actionControlView = this.f5970p;
        return actionControlView != null && actionControlView.getExoPlayAdRewardLayout().getVisibility() == 0;
    }

    @NonNull
    public chuangyuan.ycj.videolibrary.widget.a getAdTopControlView() {
        return this.f5972r;
    }

    @NonNull
    public View getErrorLayout() {
        return this.f5970p.getExoPlayErrorLayout();
    }

    public AppCompatCheckBox getExoFullscreen() {
        return this.f5973s.getExoFullscreen();
    }

    @NonNull
    public View getExoLoadFirst() {
        return this.f5968n;
    }

    @NonNull
    public View getGestureAudioLayout() {
        return this.f5969o.getExoAudioLayout();
    }

    @NonNull
    public View getGestureBrightnessLayout() {
        return this.f5969o.getExoBrightnessLayout();
    }

    @NonNull
    public View getGestureFastForwardLayout() {
        return this.f5969o.getExoFastForwardLayout();
    }

    @NonNull
    public View getGestureProgressLayout() {
        return this.f5969o.getDialogProLayout();
    }

    public boolean getLeLinkVisibilty() {
        ActionControlView actionControlView = this.f5970p;
        return actionControlView != null && actionControlView.getExoPlayerLelinkLayout().getVisibility() == 0;
    }

    @NonNull
    public View getLoadLayout() {
        return this.f5959e;
    }

    @NonNull
    public chuangyuan.ycj.videolibrary.widget.c getLockControlView() {
        return this.f5971q;
    }

    public ArrayList<String> getNameSwitch() {
        ArrayList<String> arrayList = this.J;
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList<String> arrayList2 = new ArrayList<>();
        this.J = arrayList2;
        return arrayList2;
    }

    @NonNull
    public View getPlayHintLayout() {
        return this.f5970p.getPlayBtnHintLayout();
    }

    @NonNull
    public PlayerControlView getPlaybackControlView() {
        return this.f5973s;
    }

    @NonNull
    public PlayerView getPlayerView() {
        return this.f5957c;
    }

    @NonNull
    public ImageView getPreviewImage() {
        return this.f5965k;
    }

    @NonNull
    public View getReplayLayout() {
        return this.f5970p.getPlayReplayLayout();
    }

    public boolean getShareStateVisibilty() {
        ActionControlView actionControlView = this.f5970p;
        return actionControlView != null && actionControlView.getExoPlayShareLayout().getVisibility() == 0;
    }

    public int getSwitchIndex() {
        return this.f5978x;
    }

    @NonNull
    public TextView getSwitchText() {
        return this.f5973s.getSwitchText();
    }

    @NonNull
    public ExoDefaultTimeBar getTimeBar() {
        return (ExoDefaultTimeBar) this.f5973s.getTimeBar();
    }

    public final void h() {
        ImageView imageView = new ImageView(getContext());
        this.f5967m = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        int iA = s.e.a(getContext(), 7.0f);
        this.f5967m.setId(R$id.exo_controls_back);
        this.f5967m.setImageDrawable(ContextCompat.getDrawable(getContext(), this.f5980z));
        this.f5967m.setPadding(iA, iA, iA, iA);
        FrameLayout contentFrameLayout = this.f5957c.getContentFrameLayout();
        contentFrameLayout.setBackgroundColor(ContextCompat.getColor(getContext(), R$color.exo_player_background_color));
        this.f5959e.setBackgroundColor(0);
        this.f5959e.setVisibility(8);
        this.f5959e.setClickable(true);
        contentFrameLayout.addView(this.f5969o, contentFrameLayout.getChildCount());
        contentFrameLayout.addView(this.f5970p, contentFrameLayout.getChildCount());
        contentFrameLayout.addView(this.f5971q, contentFrameLayout.getChildCount());
        View view = this.f5960f;
        if (view != null) {
            contentFrameLayout.addView(view, contentFrameLayout.getChildCount());
        }
        contentFrameLayout.addView(this.f5959e, contentFrameLayout.getChildCount());
        contentFrameLayout.addView(this.f5967m, contentFrameLayout.getChildCount(), new FrameLayout.LayoutParams(s.e.a(getContext(), 38.0f), s.e.a(getContext(), 60.0f)));
        int iIndexOfChild = contentFrameLayout.indexOfChild(findViewById(R$id.exo_controller_barrage));
        if (this.f5962h != null) {
            contentFrameLayout.removeViewAt(iIndexOfChild);
            this.f5962h.setBackgroundColor(0);
            contentFrameLayout.addView(this.f5962h, iIndexOfChild);
        }
        this.f5964j = (ImageView) this.f5957c.findViewById(R$id.exo_player_watermark);
        this.f5958d = (TextView) this.f5957c.findViewById(R$id.exo_loading_show_text);
        this.f5966l = (ImageView) this.f5957c.findViewById(R$id.exo_preview_image_bottom);
        ImageView imageView2 = (ImageView) this.f5957c.findViewById(R$id.exo_load_first);
        this.f5968n = imageView2;
        if (imageView2 != null) {
            this.K = (AnimationDrawable) imageView2.getBackground();
        }
        ExoPlayerView exoPlayerView = this.f5957c;
        int i10 = R$id.exo_preview_image;
        if (exoPlayerView.findViewById(i10) != null) {
            ImageView imageView3 = (ImageView) this.f5957c.findViewById(i10);
            this.f5965k = imageView3;
            imageView3.setBackgroundResource(R.color.transparent);
        } else {
            this.f5965k = this.f5966l;
        }
        this.f5979y = this.f5956b.getWindow().getDecorView().getSystemUiVisibility();
        this.f5961g = this.f5957c.findViewById(R$id.exo_preview_play);
        contentFrameLayout.addView(this.f5972r, contentFrameLayout.getChildCount());
        this.f5972r.setVisibility(8);
    }

    public boolean i() {
        return this.D;
    }

    public boolean j() {
        return this.E;
    }

    public boolean k() {
        return this.f5959e.getVisibility() == 0;
    }

    public boolean l() {
        return this.F;
    }

    public boolean m() {
        return this.I;
    }

    public boolean n() {
        return this.G;
    }

    public void o() {
        AlertDialog alertDialog = this.f5975u;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        ImageView imageView = this.f5967m;
        if (imageView != null && imageView.animate() != null) {
            this.f5967m.animate().cancel();
        }
        chuangyuan.ycj.videolibrary.widget.c cVar = this.f5971q;
        if (cVar != null) {
            cVar.e();
        }
        Activity activity = this.f5956b;
        if (activity != null && activity.isDestroyed()) {
            S.clear();
            T.clear();
            this.f5974t = null;
            this.f5975u = null;
        }
        this.J = null;
    }

    public void p(d5.b bVar) {
        PlayerControlView playerControlView = this.f5973s;
        if (playerControlView == null || bVar == null) {
            return;
        }
        playerControlView.setPlayTimeListener(bVar);
    }

    public final void s() {
        ViewGroup viewGroup = (ViewGroup) this.f5956b.findViewById(R.id.content);
        ViewGroup viewGroup2 = (ViewGroup) this.f5957c.getParent();
        if (!this.D) {
            new FrameLayout.LayoutParams(-1, -1);
            ChangeBounds changeBounds = new ChangeBounds();
            changeBounds.setDuration(600L);
            TransitionManager.beginDelayedTransition(viewGroup, changeBounds);
            ViewGroup.LayoutParams layoutParams = this.f5957c.getLayoutParams();
            layoutParams.width = getWidth();
            layoutParams.height = getHeight();
            this.f5957c.setLayoutParams(layoutParams);
            postDelayed(new a(viewGroup2), 600L);
            return;
        }
        if (viewGroup2 != null) {
            viewGroup2.removeView(this.f5957c);
        }
        viewGroup.addView(this.f5957c, new FrameLayout.LayoutParams(getWidth(), getHeight()));
        ChangeBounds changeBounds2 = new ChangeBounds();
        changeBounds2.setDuration(600L);
        TransitionManager.beginDelayedTransition(viewGroup, changeBounds2);
        ViewGroup.LayoutParams layoutParams2 = this.f5957c.getLayoutParams();
        layoutParams2.height = -1;
        layoutParams2.width = -1;
        this.f5957c.setLayoutParams(layoutParams2);
    }

    public void setExoPlayWatermarkImg(int i10) {
        ImageView imageView = this.f5964j;
        if (imageView != null) {
            imageView.setImageResource(i10);
        }
    }

    public void setExoPlayerListener(q.c cVar) {
        this.f5976v = cVar;
    }

    public void setFullscreenStyle(@DrawableRes int i10) {
        this.f5973s.setFullscreenStyle(i10);
    }

    public void setLand(boolean z10) {
        this.D = z10;
    }

    public void setLeLinkState(int i10) {
        ActionControlView actionControlView = this.f5970p;
        if (actionControlView != null) {
            actionControlView.e(i10);
        }
    }

    public void setNameSwitch(ArrayList<String> arrayList) {
        this.J = arrayList;
    }

    public void setOnEndGestureListener(f fVar) {
        this.A = fVar;
    }

    public void setOnPlayClickListener(@Nullable View.OnClickListener onClickListener) {
        this.B = onClickListener;
    }

    public void setOpenLock(boolean z10) {
        this.f5971q.setOpenLock(z10);
    }

    public void setOpenProgress2(boolean z10) {
        this.f5971q.setProgress(z10);
    }

    public void setPlayerGestureOnTouch(boolean z10) {
        this.H = z10;
    }

    public void setPreviewImage(Bitmap bitmap) {
        this.f5965k.setImageBitmap(bitmap);
    }

    public void setShowBack(boolean z10) {
        this.C = z10;
    }

    public void setShowVideoSwitch(boolean z10) {
        this.F = z10;
    }

    public void setTitle(@NonNull String str) {
        this.f5973s.setTitle(str);
    }

    public void setVerticalFullScreen(boolean z10) {
        this.I = z10;
    }

    public void setWGh(boolean z10) {
        this.G = z10;
    }

    public void t(int i10, boolean z10) {
        ImageView imageView = this.f5967m;
        if (imageView != null) {
            if (!this.C && !this.D) {
                imageView.setVisibility(8);
                return;
            }
            if (j() && !this.D) {
                this.f5967m.setVisibility(8);
                return;
            }
            if (i10 == 0 && z10) {
                this.f5967m.setTranslationY(0.0f);
                this.f5967m.setAlpha(1.0f);
            }
            this.f5967m.setVisibility(i10);
        }
    }

    public void u(int i10) {
        this.f5966l.setVisibility(i10);
        if (i10 == 0) {
            this.f5966l.setImageDrawable(this.f5965k.getDrawable());
        }
    }

    public void v(int i10) {
        if (i10 == 0) {
            E(8);
            x(8);
            D(8);
            B(8);
            A(8);
            t(0, true);
        }
        this.f5970p.c(i10);
    }

    public void w(int i10) {
        if (this.f5973s.getExo_controller_top_status() != null) {
            if (this.D) {
                this.f5973s.getExo_controller_top_status().setVisibility(0);
            } else {
                this.f5973s.getExo_controller_top_status().setVisibility(8);
            }
        }
    }

    public void x(int i10) {
        if (i10 == 0) {
            this.f5957c.j();
            E(8);
            t(0, true);
            C(8);
            B(8);
            D(8);
            A(8);
        }
        this.f5970p.d(i10);
    }

    public void z(boolean z10) {
        View view = this.f5959e;
        if (view != null) {
            view.setClickable(z10);
        }
    }

    public void q() {
        if (getTag() != null) {
            S.put(getTag().toString(), Long.valueOf(getPlayerView().getPlayer().getCurrentPosition()));
            T.put(getTag().toString(), Integer.valueOf(getPlayerView().getPlayer().getCurrentWindowIndex()));
        }
        this.f5971q.f();
        View view = this.f5959e;
        if (view != null) {
            view.setVisibility(8);
        }
        ActionControlView actionControlView = this.f5970p;
        if (actionControlView != null) {
            actionControlView.a();
        }
        getPlaybackControlView().V();
    }

    public void r() {
        if (m()) {
            s();
            return;
        }
        ViewGroup viewGroup = (ViewGroup) this.f5956b.findViewById(R.id.content);
        ViewGroup viewGroup2 = (ViewGroup) this.f5957c.getParent();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        if (viewGroup2 != null) {
            viewGroup2.removeView(this.f5957c);
        }
        if (this.D) {
            viewGroup.addView(this.f5957c, layoutParams);
        } else {
            addView(this.f5957c, layoutParams);
        }
    }

    public void y(int i10) {
        if (j()) {
            if (i10 == 0) {
                this.f5967m.setVisibility(0);
                this.f5977w = this.f5973s.getExoControllerTop().getPaddingLeft();
                this.f5973s.getExoControllerTop().setPadding(s.e.a(getContext(), 35.0f), 0, 0, 0);
            } else {
                this.f5973s.getExoControllerTop().setPadding(this.f5977w, 0, 0, 0);
            }
            t(i10, false);
        }
    }
}
