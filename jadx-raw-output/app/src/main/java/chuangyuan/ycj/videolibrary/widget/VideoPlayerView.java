package chuangyuan.ycj.videolibrary.widget;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Parcelable;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatCheckBox;
import chuangyuan.ycj.videolibrary.R$id;
import chuangyuan.ycj.videolibrary.R$string;
import chuangyuan.ycj.videolibrary.video.ExoDataBean;
import com.google.android.exoplayer2.ui.ExoPlayerView;
import com.google.android.exoplayer2.ui.PlayerControlView;
import com.google.android.exoplayer2.ui.PlayerView;
import k3.u0;
import q.f;
import s.e;

/* JADX INFO: loaded from: classes8.dex */
@TargetApi(16)
public final class VideoPlayerView extends BaseView {
    public PlayerControlView.f U;
    public s.a.InterfaceC0634a V;
    public View.OnClickListener W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final q.d f6010a0;

    public class a implements PlayerControlView.f {
        public a() {
        }

        @Override // com.google.android.exoplayer2.ui.PlayerControlView.f
        public void onVisibilityChange(int i10) {
            VideoPlayerView.this.t(i10, false);
            VideoPlayerView.this.C(i10);
            VideoPlayerView.this.w(i10);
            chuangyuan.ycj.videolibrary.widget.b bVar = VideoPlayerView.this.f5974t;
            if (bVar == null || i10 != 8) {
                return;
            }
            bVar.c();
        }
    }

    public class b implements s.a.InterfaceC0634a {
        public b() {
        }

        @Override // s.a.InterfaceC0634a
        public void a(boolean z10) {
            VideoPlayerView.this.f5971q.h(z10);
            if (!z10) {
                s.a.d(VideoPlayerView.this.f5967m, false).start();
                return;
            }
            if (VideoPlayerView.this.i()) {
                VideoPlayerView.this.C(0);
            }
            s.a.a(VideoPlayerView.this.f5967m).start();
        }
    }

    public class c implements View.OnClickListener {

        public class a implements chuangyuan.ycj.videolibrary.widget.b.InterfaceC0023b {
            public a() {
            }

            @Override // chuangyuan.ycj.videolibrary.widget.b.InterfaceC0023b
            public void a(int i10, String str) {
                q.c cVar = VideoPlayerView.this.f5976v;
                if (cVar != null) {
                    cVar.a(i10);
                }
                VideoPlayerView.this.getSwitchText().setText(str);
                VideoPlayerView.this.f5974t.c();
            }
        }

        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (view.getId() != R$id.exo_video_fullscreen && view.getId() != R$id.sexo_video_fullscreen) {
                if (view.getId() == R$id.exo_controls_back) {
                    if (VideoPlayerView.this.i()) {
                        VideoPlayerView.this.P();
                        return;
                    } else {
                        VideoPlayerView.this.f5956b.onBackPressed();
                        return;
                    }
                }
                if (view.getId() == R$id.but_vip) {
                    q.c cVar = VideoPlayerView.this.f5976v;
                    if (cVar != null) {
                        cVar.b();
                        return;
                    }
                    return;
                }
                if (view.getId() == R$id.but_vip_share) {
                    q.c cVar2 = VideoPlayerView.this.f5976v;
                    if (cVar2 != null) {
                        cVar2.d();
                        return;
                    }
                    return;
                }
                if (view.getId() == R$id.exo_player_error_btn_id) {
                    VideoPlayerView.this.R();
                    return;
                }
                if (view.getId() == R$id.exo_player_replay_btn_id) {
                    VideoPlayerView.this.R();
                    return;
                }
                if (view.getId() == R$id.exo_video_switch) {
                    VideoPlayerView videoPlayerView = VideoPlayerView.this;
                    if (videoPlayerView.f5974t == null) {
                        videoPlayerView.f5974t = new chuangyuan.ycj.videolibrary.widget.b(videoPlayerView.getContext(), VideoPlayerView.this.getNameSwitch());
                        VideoPlayerView.this.f5974t.d(new a());
                    }
                    VideoPlayerView videoPlayerView2 = VideoPlayerView.this;
                    videoPlayerView2.f5974t.e(view, true, videoPlayerView2.getSwitchIndex());
                    return;
                }
                if (view.getId() == R$id.exo_player_btn_hint_btn_id) {
                    VideoPlayerView.this.v(8);
                    q.c cVar3 = VideoPlayerView.this.f5976v;
                    if (cVar3 != null) {
                        cVar3.e();
                        return;
                    }
                    return;
                }
                return;
            }
            if (VideoPlayerView.this.getAdRewardVisibilty()) {
                return;
            }
            if (VideoPlayerView.this.m()) {
                VideoPlayerView videoPlayerView3 = VideoPlayerView.this;
                videoPlayerView3.O(!videoPlayerView3.i());
                return;
            }
            if (e.k(VideoPlayerView.this.getContext())) {
                VideoPlayerView.this.f5956b.setRequestedOrientation(1);
            } else {
                VideoPlayerView.this.f5956b.setRequestedOrientation(0);
                VideoPlayerView.this.f5956b.getWindow().getDecorView().setSystemUiVisibility(0);
            }
            VideoPlayerView.this.Q.sendEmptyMessageDelayed(0, 2000L);
        }
    }

    public class d implements q.d {

        public class a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f6016b;

            public a(String str) {
                this.f6016b = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                TextView textView = VideoPlayerView.this.f5958d;
                if (textView != null) {
                    textView.setText(this.f6016b);
                }
            }
        }

        public d() {
        }

        @Override // q.d
        public void a(int i10, int i11) {
            VideoPlayerView.this.f5969o.d(i10, i11);
        }

        @Override // q.d
        public void b(int i10, int i11) {
            VideoPlayerView.this.f5969o.b(i10, i11);
        }

        @Override // q.d
        public void c(t.a aVar) {
            Object tag = VideoPlayerView.this.getTag();
            if (!VideoPlayerView.this.j() || tag == null || BaseView.S.get(tag.toString()) == null || BaseView.T.get(tag.toString()) == null) {
                return;
            }
            aVar.b0(BaseView.T.get(tag.toString()).intValue(), BaseView.S.get(tag.toString()).intValue());
            BaseView.S.remove(tag.toString());
            BaseView.T.remove(tag.toString());
        }

        @Override // q.d
        public void d(boolean z10) {
            if (!z10) {
                VideoPlayerView.this.getPlaybackControlView().getPlayButton().setOnTouchListener(null);
                View view = VideoPlayerView.this.f5961g;
                if (view != null) {
                    view.setOnTouchListener(null);
                    return;
                }
                return;
            }
            VideoPlayerView.this.getPlaybackControlView().getPlayButton().setOnTouchListener(VideoPlayerView.this.L);
            VideoPlayerView videoPlayerView = VideoPlayerView.this;
            View view2 = videoPlayerView.f5961g;
            if (view2 != null) {
                view2.setOnTouchListener(videoPlayerView.L);
            }
        }

        @Override // q.d
        public void e(boolean z10, boolean z11) {
            VideoPlayerView.this.S(z10 ? 0 : 8);
            if (!z11) {
                VideoPlayerView.this.getPlaybackControlView().T();
                v(false);
            } else {
                VideoPlayerView.this.f5957c.q();
                VideoPlayerView.this.getPlaybackControlView().S();
                v(true);
            }
        }

        @Override // q.d
        public void f(boolean z10) {
            VideoPlayerView.this.setShowVideoSwitch(z10);
        }

        @Override // q.d
        public void g(int i10) {
            VideoPlayerView.this.B(i10);
        }

        @Override // q.a
        public void h(u0 u0Var) {
            VideoPlayerView.this.f5957c.setPlayer(u0Var);
        }

        @Override // q.d
        public void i(int i10) {
            VideoPlayerView.this.E(i10);
        }

        @Override // q.d
        public void j(int i10) {
            VideoPlayerView.this.f5969o.setFastForwardPosition(i10);
        }

        @Override // q.d
        public void k(boolean z10) {
            VideoPlayerView.this.getTimeBar().setOpenSeek(z10);
        }

        @Override // q.d
        public void l(int i10) {
            VideoPlayerView.this.f5969o.e(i10);
        }

        @Override // q.d
        public void m(int i10, boolean z10) {
            if (!z10) {
                VideoPlayerView.this.D(i10);
                VideoPlayerView.this.u(8);
                VideoPlayerView.this.getPreviewImage().setVisibility(i10);
            } else {
                View view = VideoPlayerView.this.f5961g;
                if (view != null) {
                    view.setVisibility(8);
                }
            }
        }

        @Override // q.d
        public void n() {
            VideoPlayerView.this.P();
        }

        @Override // q.d
        public void o(int i10) {
            VideoPlayerView.this.A(i10);
        }

        @Override // q.a
        public void onDestroy() {
            VideoPlayerView.this.o();
        }

        @Override // q.d
        @SuppressLint({"ClickableViewAccessibility"})
        public void onPrepared() {
            VideoPlayerView videoPlayerView = VideoPlayerView.this;
            videoPlayerView.f5957c.setOnTouchListener(videoPlayerView.M);
        }

        @Override // q.d
        public void p(boolean z10, @NonNull SpannableString spannableString) {
            VideoPlayerView.this.f5969o.c(z10, spannableString);
        }

        @Override // q.d
        public void q(boolean z10) {
            if (z10) {
                s.d.a(VideoPlayerView.this.getContext().getResources().getString(R$string.str_playing_with_traffi));
            }
        }

        @Override // q.d
        public void reset() {
            VideoPlayerView.this.q();
            VideoPlayerView.this.f6010a0.m(0, false);
        }

        @Override // q.d
        public void s(boolean z10) {
            VideoPlayerView.this.O(z10);
        }

        @Override // q.d
        public void t(int i10) {
            VideoPlayerView.this.x(i10);
        }

        @Override // q.d
        public void u(String str) {
            if (VideoPlayerView.this.k()) {
                VideoPlayerView.this.f5957c.post(new a(str));
            }
        }

        @Override // q.d
        public void v(boolean z10) {
            VideoPlayerView.this.getPlayerView().setControllerHideOnTouch(z10);
        }
    }

    public VideoPlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void O(boolean z10) {
        if (z10) {
            if (n()) {
                getPlayerView().getVideoSurfaceView().d(270);
            }
            e.g(getContext());
            this.f5956b.getWindow().getDecorView().setSystemUiVisibility(5638);
            if (l()) {
                TextView switchText = getSwitchText();
                switchText.setVisibility(0);
                if (switchText.getText().toString().isEmpty() && !getNameSwitch().isEmpty()) {
                    switchText.setText(getNameSwitch().get(this.f5978x));
                }
            }
            this.f5971q.setLockCheck(false);
            y(0);
            C(0);
            w(0);
        } else {
            if (n()) {
                getPlayerView().getVideoSurfaceView().d(0);
            }
            this.f5956b.getWindow().getDecorView().setSystemUiVisibility(this.f5979y);
            e.o(this.f5956b);
            getSwitchText().setVisibility(8);
            y(8);
            C(8);
            w(8);
        }
        getExoFullscreen().setChecked(z10);
        setLand(z10);
        r();
        if (getPlaybackControlView().I()) {
            getPlaybackControlView().T();
        }
    }

    public VideoPlayerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.U = new a();
        this.V = new b();
        this.W = new c();
        this.f6010a0 = new d();
        Q();
    }

    public final void P() {
        this.f5956b.setRequestedOrientation(1);
        getExoFullscreen().setChecked(false);
        O(false);
    }

    public final void Q() {
        ExoPlayerView exoPlayerView = this.f5957c;
        int i10 = R$id.exo_player_replay_btn_id;
        if (exoPlayerView.findViewById(i10) != null) {
            this.f5957c.findViewById(i10).setOnClickListener(this.W);
        }
        ExoPlayerView exoPlayerView2 = this.f5957c;
        int i11 = R$id.but_vip;
        if (exoPlayerView2.findViewById(i11) != null) {
            this.f5957c.findViewById(i11).setOnClickListener(this.W);
        }
        ExoPlayerView exoPlayerView3 = this.f5957c;
        int i12 = R$id.but_vip_share;
        if (exoPlayerView3.findViewById(i12) != null) {
            this.f5957c.findViewById(i12).setOnClickListener(this.W);
        }
        ExoPlayerView exoPlayerView4 = this.f5957c;
        int i13 = R$id.exo_player_error_btn_id;
        if (exoPlayerView4.findViewById(i13) != null) {
            this.f5957c.findViewById(i13).setOnClickListener(this.W);
        }
        ExoPlayerView exoPlayerView5 = this.f5957c;
        int i14 = R$id.exo_player_btn_hint_btn_id;
        if (exoPlayerView5.findViewById(i14) != null) {
            this.f5957c.findViewById(i14).setOnClickListener(this.W);
        }
        getSwitchText().setOnClickListener(this.W);
        this.f5967m.setOnClickListener(this.W);
        this.f5957c.findViewById(R$id.exo_video_fullscreen).setOnClickListener(this.W);
        if (j() && !i()) {
            this.f5967m.setVisibility(8);
        }
        this.f5957c.setControllerVisibilityListener(this.U);
        this.f5973s.setAnimatorListener(this.V);
        A(0);
    }

    public q.d getComponentListener() {
        return this.f6010a0;
    }

    @Override // chuangyuan.ycj.videolibrary.widget.BaseView
    public /* bridge */ /* synthetic */ void A(int i10) {
        super.A(i10);
    }

    @Override // chuangyuan.ycj.videolibrary.widget.BaseView
    public /* bridge */ /* synthetic */ void F(int i10) {
        super.F(i10);
    }

    @Override // chuangyuan.ycj.videolibrary.widget.BaseView
    public /* bridge */ /* synthetic */ void G() {
        super.G();
    }

    @Override // chuangyuan.ycj.videolibrary.widget.BaseView
    public /* bridge */ /* synthetic */ void H() {
        super.H();
    }

    @Override // chuangyuan.ycj.videolibrary.widget.BaseView
    public /* bridge */ /* synthetic */ void I() {
        super.I();
    }

    @Override // chuangyuan.ycj.videolibrary.widget.BaseView
    public /* bridge */ /* synthetic */ void J() {
        super.J();
    }

    @Override // chuangyuan.ycj.videolibrary.widget.BaseView
    public /* bridge */ /* synthetic */ void K() {
        super.K();
    }

    public final void R() {
        if (e.l(getContext())) {
            x(8);
            E(8);
            q.c cVar = this.f5976v;
            if (cVar != null) {
                cVar.c();
                return;
            }
            return;
        }
        Toast.makeText(getContext(), R$string.net_network_no_hint, 0).show();
        x(8);
        E(8);
        q.c cVar2 = this.f5976v;
        if (cVar2 != null) {
            cVar2.c();
        }
    }

    public void S(int i10) {
        if (e.m(getContext())) {
            return;
        }
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) this.f5957c.findViewById(R$id.sexo_video_fullscreen);
        appCompatCheckBox.setVisibility(i10);
        appCompatCheckBox.setButtonDrawable(this.f5973s.getIcFullscreenSelector());
        appCompatCheckBox.setOnClickListener(this.W);
    }

    @Override // chuangyuan.ycj.videolibrary.widget.BaseView
    public /* bridge */ /* synthetic */ void e(int i10) {
        super.e(i10);
    }

    @Override // chuangyuan.ycj.videolibrary.widget.BaseView
    public /* bridge */ /* synthetic */ void f(int i10) {
        super.f(i10);
    }

    @Override // chuangyuan.ycj.videolibrary.widget.BaseView
    public /* bridge */ /* synthetic */ boolean getAdRewardVisibilty() {
        return super.getAdRewardVisibilty();
    }

    @Override // chuangyuan.ycj.videolibrary.widget.BaseView
    @NonNull
    public /* bridge */ /* synthetic */ chuangyuan.ycj.videolibrary.widget.a getAdTopControlView() {
        return super.getAdTopControlView();
    }

    @Override // chuangyuan.ycj.videolibrary.widget.BaseView
    @NonNull
    public /* bridge */ /* synthetic */ View getErrorLayout() {
        return super.getErrorLayout();
    }

    @Override // chuangyuan.ycj.videolibrary.widget.BaseView
    public /* bridge */ /* synthetic */ AppCompatCheckBox getExoFullscreen() {
        return super.getExoFullscreen();
    }

    @Override // chuangyuan.ycj.videolibrary.widget.BaseView
    @NonNull
    public /* bridge */ /* synthetic */ View getExoLoadFirst() {
        return super.getExoLoadFirst();
    }

    @Override // chuangyuan.ycj.videolibrary.widget.BaseView
    @NonNull
    public /* bridge */ /* synthetic */ View getGestureAudioLayout() {
        return super.getGestureAudioLayout();
    }

    @Override // chuangyuan.ycj.videolibrary.widget.BaseView
    @NonNull
    public /* bridge */ /* synthetic */ View getGestureBrightnessLayout() {
        return super.getGestureBrightnessLayout();
    }

    @Override // chuangyuan.ycj.videolibrary.widget.BaseView
    @NonNull
    public /* bridge */ /* synthetic */ View getGestureFastForwardLayout() {
        return super.getGestureFastForwardLayout();
    }

    @Override // chuangyuan.ycj.videolibrary.widget.BaseView
    @NonNull
    public /* bridge */ /* synthetic */ View getGestureProgressLayout() {
        return super.getGestureProgressLayout();
    }

    @Override // chuangyuan.ycj.videolibrary.widget.BaseView
    public /* bridge */ /* synthetic */ boolean getLeLinkVisibilty() {
        return super.getLeLinkVisibilty();
    }

    @Override // chuangyuan.ycj.videolibrary.widget.BaseView
    @NonNull
    public /* bridge */ /* synthetic */ View getLoadLayout() {
        return super.getLoadLayout();
    }

    @Override // chuangyuan.ycj.videolibrary.widget.BaseView
    @NonNull
    public /* bridge */ /* synthetic */ chuangyuan.ycj.videolibrary.widget.c getLockControlView() {
        return super.getLockControlView();
    }

    @Override // chuangyuan.ycj.videolibrary.widget.BaseView
    @NonNull
    public /* bridge */ /* synthetic */ View getPlayHintLayout() {
        return super.getPlayHintLayout();
    }

    @Override // chuangyuan.ycj.videolibrary.widget.BaseView
    @NonNull
    public /* bridge */ /* synthetic */ PlayerControlView getPlaybackControlView() {
        return super.getPlaybackControlView();
    }

    @Override // chuangyuan.ycj.videolibrary.widget.BaseView
    @NonNull
    public /* bridge */ /* synthetic */ PlayerView getPlayerView() {
        return super.getPlayerView();
    }

    @Override // chuangyuan.ycj.videolibrary.widget.BaseView
    @NonNull
    public /* bridge */ /* synthetic */ ImageView getPreviewImage() {
        return super.getPreviewImage();
    }

    @Override // chuangyuan.ycj.videolibrary.widget.BaseView
    @NonNull
    public /* bridge */ /* synthetic */ View getReplayLayout() {
        return super.getReplayLayout();
    }

    public int getResizeMode() {
        return getPlayerView().getResizeMode();
    }

    @Override // chuangyuan.ycj.videolibrary.widget.BaseView
    public /* bridge */ /* synthetic */ boolean getShareStateVisibilty() {
        return super.getShareStateVisibilty();
    }

    @Override // chuangyuan.ycj.videolibrary.widget.BaseView
    @NonNull
    public /* bridge */ /* synthetic */ TextView getSwitchText() {
        return super.getSwitchText();
    }

    @Override // chuangyuan.ycj.videolibrary.widget.BaseView
    @NonNull
    public /* bridge */ /* synthetic */ ExoDefaultTimeBar getTimeBar() {
        return super.getTimeBar();
    }

    @Override // chuangyuan.ycj.videolibrary.widget.BaseView
    public /* bridge */ /* synthetic */ boolean i() {
        return super.i();
    }

    @Override // chuangyuan.ycj.videolibrary.widget.BaseView
    public /* bridge */ /* synthetic */ boolean j() {
        return super.j();
    }

    @Override // chuangyuan.ycj.videolibrary.widget.BaseView
    public /* bridge */ /* synthetic */ boolean k() {
        return super.k();
    }

    @Override // chuangyuan.ycj.videolibrary.widget.BaseView
    public /* bridge */ /* synthetic */ boolean m() {
        return super.m();
    }

    @Override // chuangyuan.ycj.videolibrary.widget.BaseView
    public /* bridge */ /* synthetic */ void o() {
        super.o();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        q.c cVar = this.f5976v;
        if (cVar != null) {
            cVar.g(j());
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(parcelable);
        if (parcelable instanceof ExoDataBean) {
            ExoDataBean exoDataBean = (ExoDataBean) parcelable;
            if (exoDataBean.c() != null) {
                setNameSwitch(exoDataBean.c());
            }
            setLand(exoDataBean.f());
            this.f5979y = exoDataBean.d();
            this.f5978x = exoDataBean.e();
        }
    }

    @Override // android.view.View
    @Nullable
    public Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        ExoDataBean exoDataBean = new ExoDataBean(parcelableOnSaveInstanceState);
        exoDataBean.g(i());
        exoDataBean.i(this.f5979y);
        exoDataBean.j(this.f5978x);
        exoDataBean.h(getNameSwitch());
        return parcelableOnSaveInstanceState;
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NonNull View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (i()) {
            this.f5956b.getWindow().getDecorView().setSystemUiVisibility(5638);
        }
    }

    @Override // chuangyuan.ycj.videolibrary.widget.BaseView
    public /* bridge */ /* synthetic */ void p(d5.b bVar) {
        super.p(bVar);
    }

    @Override // chuangyuan.ycj.videolibrary.widget.BaseView
    public /* bridge */ /* synthetic */ void q() {
        super.q();
    }

    @Override // chuangyuan.ycj.videolibrary.widget.BaseView
    public /* bridge */ /* synthetic */ void setExoPlayWatermarkImg(int i10) {
        super.setExoPlayWatermarkImg(i10);
    }

    @Override // chuangyuan.ycj.videolibrary.widget.BaseView
    public /* bridge */ /* synthetic */ void setExoPlayerListener(q.c cVar) {
        super.setExoPlayerListener(cVar);
    }

    @Override // chuangyuan.ycj.videolibrary.widget.BaseView
    public /* bridge */ /* synthetic */ void setFullscreenStyle(@DrawableRes int i10) {
        super.setFullscreenStyle(i10);
    }

    @Override // chuangyuan.ycj.videolibrary.widget.BaseView
    public /* bridge */ /* synthetic */ void setLeLinkState(int i10) {
        super.setLeLinkState(i10);
    }

    @Override // chuangyuan.ycj.videolibrary.widget.BaseView
    public /* bridge */ /* synthetic */ void setOnEndGestureListener(f fVar) {
        super.setOnEndGestureListener(fVar);
    }

    @Override // chuangyuan.ycj.videolibrary.widget.BaseView
    public /* bridge */ /* synthetic */ void setOnPlayClickListener(@Nullable View.OnClickListener onClickListener) {
        super.setOnPlayClickListener(onClickListener);
    }

    @Override // chuangyuan.ycj.videolibrary.widget.BaseView
    public /* bridge */ /* synthetic */ void setOpenLock(boolean z10) {
        super.setOpenLock(z10);
    }

    @Override // chuangyuan.ycj.videolibrary.widget.BaseView
    public /* bridge */ /* synthetic */ void setOpenProgress2(boolean z10) {
        super.setOpenProgress2(z10);
    }

    @Override // chuangyuan.ycj.videolibrary.widget.BaseView
    public /* bridge */ /* synthetic */ void setPlayerGestureOnTouch(boolean z10) {
        super.setPlayerGestureOnTouch(z10);
    }

    @Override // chuangyuan.ycj.videolibrary.widget.BaseView
    public /* bridge */ /* synthetic */ void setPreviewImage(Bitmap bitmap) {
        super.setPreviewImage(bitmap);
    }

    public void setResizeMode(int i10) {
        getPlayerView().setResizeMode(i10);
    }

    @Override // chuangyuan.ycj.videolibrary.widget.BaseView
    public /* bridge */ /* synthetic */ void setShowBack(boolean z10) {
        super.setShowBack(z10);
    }

    @Override // chuangyuan.ycj.videolibrary.widget.BaseView
    public /* bridge */ /* synthetic */ void setShowVideoSwitch(boolean z10) {
        super.setShowVideoSwitch(z10);
    }

    @Override // chuangyuan.ycj.videolibrary.widget.BaseView
    public /* bridge */ /* synthetic */ void setTitle(@NonNull String str) {
        super.setTitle(str);
    }

    @Override // chuangyuan.ycj.videolibrary.widget.BaseView
    public /* bridge */ /* synthetic */ void setVerticalFullScreen(boolean z10) {
        super.setVerticalFullScreen(z10);
    }

    @Override // chuangyuan.ycj.videolibrary.widget.BaseView
    public /* bridge */ /* synthetic */ void setWGh(boolean z10) {
        super.setWGh(z10);
    }

    @Override // chuangyuan.ycj.videolibrary.widget.BaseView
    public /* bridge */ /* synthetic */ void z(boolean z10) {
        super.z(z10);
    }
}
