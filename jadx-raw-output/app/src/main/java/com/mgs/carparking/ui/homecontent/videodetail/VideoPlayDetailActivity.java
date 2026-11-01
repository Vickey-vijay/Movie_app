package com.mgs.carparking.ui.homecontent.videodetail;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.media.AudioManager;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.os.Handler;
import android.text.format.Formatter;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ObservableField;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import chuangyuan.ycj.videolibrary.widget.VideoPlayerView;
import com.bumptech.glide.Glide;
import com.fvvcl.flickverse.R;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.ui.PlayerControlView;
import com.ironsource.Z7;
import com.mgs.carparking.app.AppApplication;
import com.mgs.carparking.app.BaseActivity;
import com.mgs.carparking.databinding.ActivityVideoPlayDetailBinding;
import com.mgs.carparking.databinding.DialogClingOpenFloatBinding;
import com.mgs.carparking.databinding.PopLayoutVideoCommentItemBinding;
import com.mgs.carparking.databinding.PopLayoutVideoSeasonItemBinding;
import com.mgs.carparking.db.AdNumShowDao;
import com.mgs.carparking.db.VideoAdLookDao;
import com.mgs.carparking.db.VideoLookHistoryDao;
import com.mgs.carparking.db.VideoShareDao;
import com.mgs.carparking.db.VideoSkipDao;
import com.mgs.carparking.db.VideoStayTimeDao;
import com.mgs.carparking.dbtable.VideoCollectionEntry;
import com.mgs.carparking.dbtable.VideoLookHistoryEntry;
import com.mgs.carparking.dbtable.VideoShareEntry;
import com.mgs.carparking.dbtable.VideoSkipEntry;
import com.mgs.carparking.dbtable.VideoStayTimeEntry;
import com.mgs.carparking.model.VIDEOPLAYDETAILVIEWMODEL;
import com.mgs.carparking.netbean.AdInfoDetailEntry;
import com.mgs.carparking.netbean.BarrageListEntry;
import com.mgs.carparking.netbean.RecommandVideosEntity;
import com.mgs.carparking.netbean.VideoBean;
import com.mgs.carparking.netbean.VideoShareDataEntry;
import com.mgs.carparking.ui.MainActivity;
import com.mgs.carparking.ui.channelcontent.SpecialDetailNewActivity;
import com.mgs.carparking.ui.login.LoginActivity;
import com.mgs.carparking.ui.mine.share.ExtensionShareActivity;
import com.mgs.carparking.ui.web.WebActivity;
import com.mgs.carparking.widgets.dialog.BarrageDialog;
import com.mgs.carparking.widgets.dialog.BarrageHorizonalDialog;
import com.mgs.carparking.widgets.dialog.ClingDeviceDialog;
import com.mgs.carparking.widgets.dialog.ShareDialog;
import com.safedk.android.utils.Logger;
import com.scwang.smart.refresh.footer.ClassicsFooter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import master.flame.danmaku.danmaku.model.android.DanmakuContext;
import me.goldze.mvvmhabit.base.BaseApplication;
import me.goldze.mvvmhabit.crash.CustomActivityOnCrash;
import okhttp3.Response;
import sa.a0;
import sa.g0;
import sa.o0;
import x9.c0;
import x9.e0;
import x9.f0;
import x9.h0;

/* JADX INFO: loaded from: classes6.dex */
public class VideoPlayDetailActivity extends BaseActivity<ActivityVideoPlayDetailBinding, VIDEOPLAYDETAILVIEWMODEL> implements View.OnClickListener {
    public int A;
    public PopupWindow A0;
    public int B;
    public ImageView D0;
    public VideoLookHistoryEntry E;
    public ImageView E0;
    public VideoSkipEntry F;
    public ta.c G;
    public DanmakuContext G0;
    public ta.h H;
    public jl.f H0;
    public LinearLayout I;
    public nl.a I0;
    public LinearLayout J;
    public LinearLayout K;
    public AdInfoDetailEntry K0;
    public ImageView L;
    public TextView L0;
    public ImageView M;
    public TextView M0;
    public ImageView N;
    public LinearLayout N0;
    public ImageView O;
    public LinearLayout O0;
    public ImageView P;
    public ImageView Q;
    public ImageView R;
    public ImageView S;
    public x.l S0;
    public ImageView T;
    public ta.d T0;
    public ProgressBar U;
    public ProgressBar V;
    public ImageView W;
    public TextView X;
    public TextView Y;
    public TextView Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public TextView f41908a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public TextView f41909b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public ConstraintLayout f41910c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public RelativeLayout f41911d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public RelativeLayout f41912e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public AppCompatTextView f41913f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public AudioManager f41914g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public t.a f41915h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public CommentListAdapter f41916h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public RecommandVideosEntity f41917i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public TvAndComicAdapter f41918i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public VarietyAdapter f41920j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public gb.j f41921k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public RelativeLayout f41922k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public com.mgs.carparking.widgets.dialog.k f41923l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public PopupWindow f41924l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public com.mgs.carparking.widgets.dialog.i f41925m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public PopLayoutVideoCommentItemBinding f41926m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public com.mgs.carparking.widgets.dialog.g f41927n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public com.mgs.carparking.widgets.dialog.b f41929o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public com.mgs.carparking.widgets.dialog.f f41931p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public com.mgs.carparking.widgets.dialog.c f41933q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public VideoShareDataEntry f41934q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public com.mgs.carparking.widgets.dialog.m f41935r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public gb.d f41936r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public com.mgs.carparking.widgets.dialog.d f41937s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public gb.g f41938s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public com.mgs.carparking.widgets.dialog.e f41939t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public com.mgs.carparking.widgets.dialog.h f41941u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public Dialog f41942u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public com.mgs.carparking.widgets.dialog.j f41943v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public Dialog f41944v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public com.mgs.carparking.widgets.dialog.l f41945w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public BarrageDialog f41947x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ShareDialog f41949y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public BarrageHorizonalDialog f41951z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public FrameLayout f41952z0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List<VideoBean> f41919j = new ArrayList();
    public int C = 0;
    public int D = 0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public boolean f41928n0 = false;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public long f41930o0 = System.currentTimeMillis();

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public boolean f41932p0 = false;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public g0 f41940t0 = null;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public DialogClingOpenFloatBinding f41946w0 = null;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public boolean f41948x0 = false;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public boolean f41950y0 = false;
    public String B0 = "";
    public String C0 = "";
    public boolean F0 = false;
    public boolean sendDanmaku = false;
    public Handler J0 = new Handler();
    public ClingDeviceDialog P0 = null;
    public com.mgs.carparking.widgets.dialog.a Q0 = null;
    public boolean R0 = false;

    public class a implements q.m {
        public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p10, Intent p11) {
            Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
            if (p11 == null) {
                return;
            }
            p10.startActivity(p11);
        }

        public a() {
        }

        @Override // q.m
        public void a() {
            ((VIDEOPLAYDETAILVIEWMODEL) VideoPlayDetailActivity.this.f39698d).Z.call();
        }

        @Override // q.m
        public void b() {
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(VideoPlayDetailActivity.this, new Intent(VideoPlayDetailActivity.this, (Class<?>) ExtensionShareActivity.class));
        }
    }

    public class b implements q.k {
        public b() {
        }

        @Override // q.k
        public void d() {
            if (VideoPlayDetailActivity.this.f41919j.size() <= 0 || VideoPlayDetailActivity.this.C != VideoPlayDetailActivity.this.f41919j.size() - 1) {
                VideoPlayDetailActivity.this.loadVideoNext();
            }
        }

        @Override // q.k
        public void e(boolean z10) {
            if (VideoPlayDetailActivity.this.H0 != null) {
                if (z10) {
                    VideoPlayDetailActivity.this.H0.toggle();
                    return;
                }
                VideoPlayDetailActivity videoPlayDetailActivity = VideoPlayDetailActivity.this;
                videoPlayDetailActivity.sendDanmaku = true;
                videoPlayDetailActivity.H0.pause();
            }
        }

        @Override // q.k
        public void a(long j10) {
            Log.i("wangyi", "开始播放");
            try {
                DefaultTrackSelector defaultTrackSelector = (DefaultTrackSelector) VideoPlayDetailActivity.this.f41915h.D().Q();
                com.google.android.exoplayer2.trackselection.b.a aVarG = defaultTrackSelector.g();
                if (aVarG != null) {
                    for (int i10 = 0; i10 < aVarG.c(); i10++) {
                        TrackGroupArray trackGroupArrayE = aVarG.e(i10);
                        if (1 == aVarG.d(i10)) {
                            for (int i11 = 0; i11 < trackGroupArrayE.f19435b; i11++) {
                                TrackGroup trackGroupA = trackGroupArrayE.a(i11);
                                Log.d("checkAudio", trackGroupA.a(0).toString());
                                if (i11 == 0 && VideoPlayDetailActivity.this.B0.equals("") && !em.o.b(trackGroupA.a(0).B)) {
                                    VideoPlayDetailActivity.this.B0 = trackGroupA.a(0).B;
                                }
                            }
                        } else if (3 == aVarG.d(i10)) {
                            for (int i12 = 0; i12 < trackGroupArrayE.f19435b; i12++) {
                                TrackGroup trackGroupA2 = trackGroupArrayE.a(i12);
                                Log.d("checkSubTitle", trackGroupA2.a(0).toString());
                                if (i12 == 0 && VideoPlayDetailActivity.this.C0.equals("") && !em.o.b(trackGroupA2.a(0).B)) {
                                    VideoPlayDetailActivity.this.C0 = trackGroupA2.a(0).B;
                                }
                            }
                        }
                    }
                }
                defaultTrackSelector.L(defaultTrackSelector.v().f().j(VideoPlayDetailActivity.this.C0).i(VideoPlayDetailActivity.this.B0));
            } catch (Exception unused) {
            }
            if (VideoPlayDetailActivity.this.H0 != null) {
                VideoPlayDetailActivity videoPlayDetailActivity = VideoPlayDetailActivity.this;
                if (videoPlayDetailActivity.sendDanmaku) {
                    videoPlayDetailActivity.sendDanmaku = false;
                    return;
                }
            }
            if (VideoPlayDetailActivity.this.H0 != null && j10 >= 0) {
                VideoPlayDetailActivity.this.H0.f(Long.valueOf(j10));
            }
        }

        @Override // q.k
        public void b(@Nullable ExoPlaybackException exoPlaybackException) {
            Log.i("wangyi", "onPlayerError");
            if (yl.b.a(VideoPlayDetailActivity.this) && exoPlaybackException.type == 0) {
                ((VIDEOPLAYDETAILVIEWMODEL) VideoPlayDetailActivity.this.f39698d).U(3, "", exoPlaybackException.getMessage(), VideoPlayDetailActivity.this.A, VideoPlayDetailActivity.this.B, (VideoPlayDetailActivity.this.f41915h.z() / 1000) + "");
                if (VideoPlayDetailActivity.this.f41915h.z() >= 0) {
                    VideoPlayDetailActivity.this.f41915h.c0(VideoPlayDetailActivity.this.f41915h.z() + 10000);
                } else {
                    VideoPlayDetailActivity.this.f41915h.c0(0L);
                }
            }
        }

        @Override // q.k
        public void c() {
            Log.i("wangyi", "onLoadingChanged");
        }
    }

    public class c implements s.a.b {
        public c() {
        }

        @Override // s.a.b
        public void b(long j10, long j11, long j12) {
            if (VideoPlayDetailActivity.this.F == null || VideoPlayDetailActivity.this.F.getProgress_end() <= 5 || !VideoPlayDetailActivity.this.f41950y0 || j12 <= 50) {
                return;
            }
            long j13 = (j12 - j10) / 1000;
            if ((j13 == VideoPlayDetailActivity.this.F.getProgress_end() || j13 == VideoPlayDetailActivity.this.F.getProgress_end() - 1) && VideoPlayDetailActivity.this.f41915h.H()) {
                VideoPlayDetailActivity.this.f41950y0 = false;
                VideoPlayDetailActivity.this.loadVideoNext();
            }
        }
    }

    public class d implements com.mgs.carparking.widgets.dialog.b.c {
        public d() {
        }

        @Override // com.mgs.carparking.widgets.dialog.b.c
        public void a(String str) {
            VideoPlayDetailActivity.this.C0 = str;
        }

        @Override // com.mgs.carparking.widgets.dialog.b.c
        public void b(String str) {
            VideoPlayDetailActivity.this.B0 = str;
        }
    }

    public class e implements DialogInterface.OnDismissListener {
        public e() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            VideoPlayDetailActivity videoPlayDetailActivity = VideoPlayDetailActivity.this;
            videoPlayDetailActivity.sendDanmaku = true;
            if (videoPlayDetailActivity.f41915h == null || VideoPlayDetailActivity.this.f41915h.D() == null) {
                return;
            }
            VideoPlayDetailActivity.this.f41915h.D().setPlayWhenReady(true);
        }
    }

    public class f implements BarrageDialog.d {
        public f() {
        }

        @Override // com.mgs.carparking.widgets.dialog.BarrageDialog.d
        public void a(String str) {
            if (VideoPlayDetailActivity.this.f41915h != null) {
                VideoPlayDetailActivity.this.f41947x.dismiss();
                ((VIDEOPLAYDETAILVIEWMODEL) VideoPlayDetailActivity.this.f39698d).a0(VideoPlayDetailActivity.this.A, VideoPlayDetailActivity.this.B, str, VideoPlayDetailActivity.this.f41915h.z());
            }
        }
    }

    public class g implements BarrageHorizonalDialog.d {
        public g() {
        }

        @Override // com.mgs.carparking.widgets.dialog.BarrageHorizonalDialog.d
        public void a(String str) {
            if (VideoPlayDetailActivity.this.f41915h != null) {
                VideoPlayDetailActivity.this.f41951z.dismiss();
                ((VIDEOPLAYDETAILVIEWMODEL) VideoPlayDetailActivity.this.f39698d).a0(VideoPlayDetailActivity.this.A, VideoPlayDetailActivity.this.B, str, VideoPlayDetailActivity.this.f41915h.z());
            }
        }
    }

    public class h implements ec.g {
        @Override // ec.g
        public void d(@NonNull cc.f fVar) {
        }

        public h() {
        }
    }

    public class i implements ec.e {
        public i() {
        }

        @Override // ec.e
        public void a(@NonNull cc.f fVar) {
            ((VIDEOPLAYDETAILVIEWMODEL) VideoPlayDetailActivity.this.f39698d).M0(false, VideoPlayDetailActivity.this.A);
        }
    }

    public class j implements jl.c.d {
        @Override // jl.c.d
        public void a(kl.e eVar) {
        }

        @Override // jl.c.d
        public void b(kl.c cVar) {
        }

        @Override // jl.c.d
        public void c() {
        }

        public j() {
        }

        @Override // jl.c.d
        public void d() {
            VideoPlayDetailActivity.this.H0.start();
            if (VideoPlayDetailActivity.this.f41915h == null || !VideoPlayDetailActivity.this.f41915h.H()) {
                return;
            }
            VideoPlayDetailActivity.this.H0.f(Long.valueOf(VideoPlayDetailActivity.this.f41915h.z()));
        }
    }

    public class k implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }

        public k() {
        }
    }

    public class l implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f41964b;

        @Override // java.lang.Runnable
        public void run() {
            for (int i10 = 0; i10 < this.f41964b.size(); i10++) {
                VideoPlayDetailActivity.this.k1(true, ((BarrageListEntry) this.f41964b.get(i10)).getContent(), ((BarrageListEntry) this.f41964b.get(i10)).getSend_time() * 1000, 1);
            }
        }

        public l(List list) {
            this.f41964b = list;
        }
    }

    public class m extends nl.a {
        @Override // nl.a
        public kl.k e() {
            return new ll.e();
        }
    }

    public class n implements ta.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AdInfoDetailEntry f41966a;

        public n(AdInfoDetailEntry adInfoDetailEntry) {
            this.f41966a = adInfoDetailEntry;
        }

        @Override // ta.a
        public void a(String str, String str2) {
            sa.c.c(1, this.f41966a.getAd_type(), this.f41966a.getAd_source_id(), 8, this.f41966a.getAd_id(), 0, 0, 0);
            sa.c.b("adposition:8 Ad_source_id:" + this.f41966a.getAd_source_id() + " +s:" + str + " s1:" + str2);
        }

        @Override // ta.a
        public void b() {
            sa.c.c(3, this.f41966a.getAd_type(), this.f41966a.getAd_source_id(), 8, this.f41966a.getAd_id(), 1, 0, 0);
            Log.i("wangyi", "信息流广告-被点击");
        }

        @Override // ta.a
        public void onAdShow() {
            ((VIDEOPLAYDETAILVIEWMODEL) VideoPlayDetailActivity.this.f39698d).f41404l.set(Boolean.TRUE);
            sa.c.c(2, this.f41966a.getAd_type(), this.f41966a.getAd_source_id(), 8, this.f41966a.getAd_id(), 1, 0, 0);
        }

        @Override // ta.a
        public void onSuccess() {
            sa.c.c(4, this.f41966a.getAd_type(), this.f41966a.getAd_source_id(), 8, this.f41966a.getAd_id(), 1, 0, 0);
        }

        @Override // ta.a
        public void c() {
            Log.i("wangyi", "关闭onADClose");
            ((ActivityVideoPlayDetailBinding) VideoPlayDetailActivity.this.f39697c).f40010s.removeAllViews();
            ((VIDEOPLAYDETAILVIEWMODEL) VideoPlayDetailActivity.this.f39698d).f41404l.set(Boolean.FALSE);
        }
    }

    public class o implements View.OnClickListener {
        public o() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (MainActivity.mClingPlayControl != null) {
                ((ActivityVideoPlayDetailBinding) VideoPlayDetailActivity.this.f39697c).f39993b.setLeLinkState(8);
                VideoPlayDetailActivity.this.f41915h.U();
                tl.a.a().b(new x9.y());
                if (VideoPlayDetailActivity.this.S0 != null) {
                    VideoPlayDetailActivity.this.S0.c(null);
                }
                if (VideoPlayDetailActivity.this.P0 != null) {
                    VideoPlayDetailActivity.this.P0.i();
                    VideoPlayDetailActivity.this.P0 = null;
                }
                if (VideoPlayDetailActivity.this.Q0 != null) {
                    VideoPlayDetailActivity.this.Q0.f();
                    VideoPlayDetailActivity.this.Q0 = null;
                }
            }
        }
    }

    public class p implements View.OnClickListener {
        public p() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (s.e.k(VideoPlayDetailActivity.this)) {
                VideoPlayDetailActivity.this.LeLinkHorizalPop();
            } else {
                VideoPlayDetailActivity.this.LelinkPop();
            }
        }
    }

    public class q implements ClingDeviceDialog.b {

        public class a implements x.p<mj.r> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ x.l f41971a;

            public a(x.l lVar) {
                this.f41971a = lVar;
            }

            @Override // x.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(mj.r rVar) {
                Log.e("setasetaseta", "onSuccess");
                this.f41971a.a("1", null);
            }

            @Override // x.p
            public void onFailure(@NonNull String str) {
                Log.e("setasetasetaerr", str);
            }
        }

        public q() {
        }

        @Override // com.mgs.carparking.widgets.dialog.ClingDeviceDialog.b
        public void a(x.l lVar, un.a<?, ?, ?> aVar) {
            VideoPlayDetailActivity.this.S0 = lVar;
            if (VideoPlayDetailActivity.this.f41919j == null || VideoPlayDetailActivity.this.f41919j.size() <= 0) {
                return;
            }
            if (((ActivityVideoPlayDetailBinding) VideoPlayDetailActivity.this.f39697c).f39993b != null) {
                ((ActivityVideoPlayDetailBinding) VideoPlayDetailActivity.this.f39697c).f39993b.setLeLinkState(0);
            }
            if (VideoPlayDetailActivity.this.f41915h != null) {
                VideoPlayDetailActivity.this.f41915h.O();
            }
            if (lVar != null) {
                VideoPlayDetailActivity.this.M0.setText(aVar.m().d());
                VideoPlayDetailActivity.this.L0.setText(em.r.a().getResources().getString(R.string.str_cling_ing));
            }
            Log.e("setasetaseta", ((VideoBean) VideoPlayDetailActivity.this.f41919j.get(VideoPlayDetailActivity.this.C)).getVod_url());
            String strReplace = ((VideoBean) VideoPlayDetailActivity.this.f41919j.get(VideoPlayDetailActivity.this.C)).getVod_url().replace("127.0.0.1", VideoPlayDetailActivity.this.getip());
            Log.e("setasetasetb", strReplace);
            lVar.b(strReplace, VideoPlayDetailActivity.this.f41917i.getVod_name(), new a(lVar));
        }
    }

    public class r implements ClingDeviceDialog.b {

        public class a implements x.p<mj.r> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ x.l f41974a;

            public a(x.l lVar) {
                this.f41974a = lVar;
            }

            @Override // x.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(mj.r rVar) {
                Log.e("setasetaseta", "onSuccess");
                this.f41974a.a("1", null);
            }

            @Override // x.p
            public void onFailure(@NonNull String str) {
                Log.e("setasetasetaerr", str);
            }
        }

        public r() {
        }

        @Override // com.mgs.carparking.widgets.dialog.ClingDeviceDialog.b
        public void a(x.l lVar, un.a<?, ?, ?> aVar) {
            if (VideoPlayDetailActivity.this.f41919j == null || VideoPlayDetailActivity.this.f41919j.size() <= 0) {
                return;
            }
            if (((ActivityVideoPlayDetailBinding) VideoPlayDetailActivity.this.f39697c).f39993b != null) {
                ((ActivityVideoPlayDetailBinding) VideoPlayDetailActivity.this.f39697c).f39993b.setLeLinkState(0);
            }
            if (VideoPlayDetailActivity.this.f41915h != null) {
                VideoPlayDetailActivity.this.f41915h.O();
            }
            if (lVar != null) {
                VideoPlayDetailActivity.this.M0.setText(aVar.m().d());
                VideoPlayDetailActivity.this.L0.setText(em.r.a().getResources().getString(R.string.str_cling_ing));
            }
            String strReplace = ((VideoBean) VideoPlayDetailActivity.this.f41919j.get(VideoPlayDetailActivity.this.C)).getVod_url().replace("127.0.0.1", VideoPlayDetailActivity.this.getip());
            Log.e("setasetaseta", strReplace);
            lVar.b(strReplace, "11", new a(lVar));
        }
    }

    public class s implements sa.x.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f41976a;

        public s(String str) {
            this.f41976a = str;
        }

        @Override // sa.x.b
        public void a(IOException iOException) {
            Log.i("wangyi", "get onFail：" + iOException.toString());
        }

        @Override // sa.x.b
        public void b(Response response) {
            try {
                ((VIDEOPLAYDETAILVIEWMODEL) VideoPlayDetailActivity.this.f39698d).S0(VideoPlayDetailActivity.this.A, this.f41976a, response.body().string(), VideoPlayDetailActivity.this.D);
            } catch (IOException e10) {
                e10.printStackTrace();
            }
        }
    }

    public class t implements q.h {
        public t() {
        }

        @Override // q.h
        public void a(int i10) {
            ((ActivityVideoPlayDetailBinding) VideoPlayDetailActivity.this.f39697c).f39993b.getGestureFastForwardLayout().setVisibility(0);
            Glide.with((FragmentActivity) VideoPlayDetailActivity.this).load(Integer.valueOf(R.drawable.ic_video_fast)).into(VideoPlayDetailActivity.this.W);
            VideoPlayDetailActivity.this.f41915h.a0(2.0f, 1.0f);
        }
    }

    public class u implements q.j {
        public u() {
        }

        @Override // q.j
        public void a(int i10, int i11) {
            ((ActivityVideoPlayDetailBinding) VideoPlayDetailActivity.this.f39697c).f39993b.getGestureAudioLayout().setVisibility(0);
            VideoPlayDetailActivity.this.U.setMax(i10);
            VideoPlayDetailActivity.this.U.setProgress(i11);
        }
    }

    public class v implements q.g {
        public v() {
        }

        @Override // q.g
        public void b(int i10, int i11) {
            ((ActivityVideoPlayDetailBinding) VideoPlayDetailActivity.this.f39697c).f39993b.getGestureBrightnessLayout().setVisibility(0);
            VideoPlayDetailActivity.this.V.setMax(i10);
            VideoPlayDetailActivity.this.V.setProgress(i11);
        }
    }

    public class w implements PlayerControlView.d {
        public w() {
        }

        @Override // com.google.android.exoplayer2.ui.PlayerControlView.d
        public void a(int i10) {
            VideoPlayDetailActivity.this.f41922k0.removeAllViews();
            if (i10 != 1) {
                VideoPlayDetailActivity.this.f41922k0.setVisibility(8);
                ta.g gVar = sa.b.f67124a;
                if (gVar != null) {
                    gVar.c();
                    return;
                }
                return;
            }
            if (o0.z() || AppApplication.adInfoEntry.getAd_position_16() == null || AppApplication.adInfoEntry.getAd_position_16().size() <= 0) {
                return;
            }
            List<AdInfoDetailEntry> ad_position_16 = AppApplication.adInfoEntry.getAd_position_16();
            VideoPlayDetailActivity videoPlayDetailActivity = VideoPlayDetailActivity.this;
            sa.b.k(videoPlayDetailActivity, videoPlayDetailActivity.f41922k0, ad_position_16);
        }
    }

    public class x implements Runnable {
        public x() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ((ActivityVideoPlayDetailBinding) VideoPlayDetailActivity.this.f39697c).f40017z.scrollTo(0, ((ActivityVideoPlayDetailBinding) VideoPlayDetailActivity.this.f39697c).f40012u.getTop());
        }
    }

    public class y implements com.mgs.carparking.widgets.dialog.m.e {
        public y() {
        }

        @Override // com.mgs.carparking.widgets.dialog.m.e
        public void a(String str, String str2) {
            VideoPlayDetailActivity.this.f41935r.dismiss();
            ((VIDEOPLAYDETAILVIEWMODEL) VideoPlayDetailActivity.this.f39698d).U(1, str, str2, VideoPlayDetailActivity.this.f41917i.getId(), VideoPlayDetailActivity.this.B, "");
        }
    }

    public class z implements Runnable {
        public z() {
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoPlayDetailActivity videoPlayDetailActivity = VideoPlayDetailActivity.this;
            CustomActivityOnCrash.H(videoPlayDetailActivity, CustomActivityOnCrash.t(videoPlayDetailActivity.getIntent()));
        }
    }

    public static void safedk_ComponentActivity_startActivityForResult_400537aeb948a6492f65a13e4d0b0824(ComponentActivity p10, Intent p11, int p12) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroidx/activity/ComponentActivity;->startActivityForResult(Landroid/content/Intent;I)V");
        if (p11 == null) {
            return;
        }
        p10.startActivityForResult(p11, p12);
    }

    public void adPlayWx(boolean z10, boolean z11, AdInfoDetailEntry adInfoDetailEntry, Activity activity, VideoPlayerView videoPlayerView, int i10, int i11, View view, Handler handler, t.a aVar, int i12) {
        g0 g0Var = this.f41940t0;
        if (g0Var != null) {
            g0Var.b();
            this.f41940t0 = null;
        }
        if (z11 && adInfoDetailEntry.getNew_user_has_ad() != 1) {
            o2();
            return;
        }
        this.H = new ta.h(this, adInfoDetailEntry);
        String vod_url = this.f41919j.get(this.C).getVod_url();
        a0.c(z10, this.H, adInfoDetailEntry, activity, videoPlayerView, i10, i11, view, handler, i12, vod_url.contains(".mp4") ? vod_url.substring(vod_url.substring(0, vod_url.indexOf("?src=")).length() + 5, vod_url.length()) : "");
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public int initContentView(Bundle bundle) {
        return R.layout.activity_video_play_detail;
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public int initVariableId() {
        return 7;
    }

    public void loadAdCenterPlay(boolean z10, boolean z11, boolean z12, Activity activity, VideoPlayerView videoPlayerView, int i10, int i11, View view, Handler handler, t.a aVar) {
        if (AppApplication.adInfoEntry.getAd_position_13() == null || AppApplication.adInfoEntry.getAd_position_13().size() <= 0) {
            this.f41915h.M();
            return;
        }
        List<AdInfoDetailEntry> ad_position_13 = AppApplication.adInfoEntry.getAd_position_13();
        int num = AdNumShowDao.getInstance().getNum(50);
        if (num >= ad_position_13.size() - 1) {
            if (!z12) {
                showAdAwardCenterPlayerType(z10, z11, z12, ad_position_13, activity, videoPlayerView, i10, i11, view, handler, this.f41915h, 0);
                return;
            }
            if (ad_position_13.get(0).getNew_user_has_ad() != 1) {
                clearAd();
            } else if (((ActivityVideoPlayDetailBinding) this.f39697c).f39993b.getAdRewardVisibilty()) {
                return;
            }
            showAdAwardCenterPlayerType(z10, z11, z12, ad_position_13, activity, videoPlayerView, i10, i11, view, handler, this.f41915h, 0);
            return;
        }
        if (!z12) {
            showAdAwardCenterPlayerType(z10, z11, z12, ad_position_13, activity, videoPlayerView, i10, i11, view, handler, this.f41915h, num + 1);
            return;
        }
        int i12 = num + 1;
        if (ad_position_13.get(i12).getNew_user_has_ad() != 1) {
            clearAd();
        } else if (((ActivityVideoPlayDetailBinding) this.f39697c).f39993b.getAdRewardVisibilty()) {
            return;
        }
        showAdAwardCenterPlayerType(z10, z11, z12, ad_position_13, activity, videoPlayerView, i10, i11, view, handler, this.f41915h, i12);
    }

    public void loadAdPlay(boolean z10, boolean z11, Activity activity, VideoPlayerView videoPlayerView, int i10, int i11, View view, Handler handler, t.a aVar) {
        if (AppApplication.adInfoEntry.getAd_position_4() == null || AppApplication.adInfoEntry.getAd_position_4().size() <= 0) {
            o2();
            return;
        }
        List<AdInfoDetailEntry> ad_position_4 = AppApplication.adInfoEntry.getAd_position_4();
        int num = AdNumShowDao.getInstance().getNum(23);
        if (num >= ad_position_4.size() - 1) {
            if (!z11) {
                showAdAwardPlayerType(z10, z11, ad_position_4, activity, videoPlayerView, i10, i11, view, handler, this.f41915h, 0);
                return;
            }
            if (ad_position_4.get(0).getNew_user_has_ad() != 1) {
                clearAd();
            } else if (((ActivityVideoPlayDetailBinding) this.f39697c).f39993b.getAdRewardVisibilty()) {
                return;
            }
            showAdAwardPlayerType(z10, z11, ad_position_4, activity, videoPlayerView, i10, i11, view, handler, this.f41915h, 0);
            return;
        }
        if (!z11) {
            showAdAwardPlayerType(z10, z11, ad_position_4, activity, videoPlayerView, i10, i11, view, handler, this.f41915h, num + 1);
            return;
        }
        int i12 = num + 1;
        if (ad_position_4.get(i12).getNew_user_has_ad() != 1) {
            clearAd();
        } else if (((ActivityVideoPlayDetailBinding) this.f39697c).f39993b.getAdRewardVisibilty()) {
            return;
        }
        showAdAwardPlayerType(z10, z11, ad_position_4, activity, videoPlayerView, i10, i11, view, handler, this.f41915h, i12);
    }

    public void toggleErrorCodeDialog(boolean z10) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A1(Void r10) {
        if (this.f41917i == null || this.f41919j.size() <= 0) {
            return;
        }
        com.mgs.carparking.widgets.dialog.m mVar = new com.mgs.carparking.widgets.dialog.m(this, this.f41917i, this.f41919j.get(this.C).getTitle());
        this.f41935r = mVar;
        mVar.showAtLocation(((ActivityVideoPlayDetailBinding) this.f39697c).f40003l, 0, 0, 0);
        this.f41935r.k(new y());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B1(Void r10) {
        Bundle bundle = new Bundle();
        bundle.putString("web_url", o0.G() + "?vod_id=" + this.f41917i.getId() + "&collection=" + this.B);
        bundle.putString("web_title", em.r.a().getResources().getString(R.string.str_vipweb_title));
        startActivity(WebActivity.class, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C1(Integer num) {
        this.f41936r0.f53324d.stop();
        this.f41936r0.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D1(Void r10) {
        List<VideoBean> list;
        if (this.f41917i == null || (list = this.f41919j) == null || list.size() <= 0) {
            return;
        }
        if (this.f41917i.getType_pid() == 2 || this.f41917i.getType_pid() == 4) {
            com.mgs.carparking.widgets.dialog.h hVar = new com.mgs.carparking.widgets.dialog.h(this, this, this.f41919j, ((VIDEOPLAYDETAILVIEWMODEL) this.f39698d).A.get().intValue(), this.f41917i, (VIDEOPLAYDETAILVIEWMODEL) this.f39698d);
            this.f41941u = hVar;
            hVar.showAsDropDown(((ActivityVideoPlayDetailBinding) this.f39697c).f39993b);
        } else if (this.f41917i.getType_pid() == 3) {
            com.mgs.carparking.widgets.dialog.j jVar = new com.mgs.carparking.widgets.dialog.j(this, this, this.f41919j, this.f41917i.getCoverUrl(), ((VIDEOPLAYDETAILVIEWMODEL) this.f39698d).A.get().intValue(), this.f41917i, (VIDEOPLAYDETAILVIEWMODEL) this.f39698d);
            this.f41943v = jVar;
            jVar.showAsDropDown(((ActivityVideoPlayDetailBinding) this.f39697c).f39993b);
        } else if (this.f41917i.getType_pid() == 1 || this.f41917i.getType_pid() == 31) {
            com.mgs.carparking.widgets.dialog.l lVar = new com.mgs.carparking.widgets.dialog.l(this, this, this.f41919j, this.f41917i, (VIDEOPLAYDETAILVIEWMODEL) this.f39698d);
            this.f41945w = lVar;
            lVar.showAsDropDown(((ActivityVideoPlayDetailBinding) this.f39697c).f39993b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E1(Void r10) {
        if (((VIDEOPLAYDETAILVIEWMODEL) this.f39698d).C.get().booleanValue()) {
            ((VIDEOPLAYDETAILVIEWMODEL) this.f39698d).C.set(Boolean.FALSE);
            ((VIDEOPLAYDETAILVIEWMODEL) this.f39698d).B.set(ContextCompat.getDrawable(BaseApplication.getInstance(), R.drawable.ic_video_land_collection));
            VideoCollectionEntry videoCollectionEntry = new VideoCollectionEntry();
            videoCollectionEntry.setId(this.A);
            videoCollectionEntry.setType_pid(this.f41917i.getType_pid());
            videoCollectionEntry.setVod_pic(this.f41917i.getVod_pic());
            videoCollectionEntry.setVod_name(this.f41917i.getVod_name());
            ((VIDEOPLAYDETAILVIEWMODEL) this.f39698d).a1(videoCollectionEntry, this.f41917i.getType_id());
            return;
        }
        ((VIDEOPLAYDETAILVIEWMODEL) this.f39698d).C.set(Boolean.TRUE);
        ((VIDEOPLAYDETAILVIEWMODEL) this.f39698d).B.set(ContextCompat.getDrawable(BaseApplication.getInstance(), R.drawable.ic_video_land_collection_select));
        VideoCollectionEntry videoCollectionEntry2 = new VideoCollectionEntry();
        videoCollectionEntry2.setId(this.A);
        videoCollectionEntry2.setType_pid(this.f41917i.getType_pid());
        videoCollectionEntry2.setVod_pic(this.f41917i.getVod_pic());
        videoCollectionEntry2.setVod_name(this.f41917i.getVod_name());
        ((VIDEOPLAYDETAILVIEWMODEL) this.f39698d).b1(videoCollectionEntry2, this.f41917i.getType_id());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F1(Void r10) {
        VideoShareDataEntry videoShareDataEntry = this.f41934q0;
        if (videoShareDataEntry == null) {
            return;
        }
        if (videoShareDataEntry.getApp_share_url().contains("inner=1")) {
            Bundle bundle = new Bundle();
            bundle.putString("web_title", em.r.a().getResources().getString(R.string.text_share));
            bundle.putString("web_url", this.f41934q0.getApp_share_url());
            startActivity(WebActivity.class, bundle);
            return;
        }
        if (this.f41949y == null) {
            this.f41936r0 = new gb.d(this);
            this.f41949y = new ShareDialog(this, this.f41936r0, this.f41917i, this.f41934q0, getWindowManager().getDefaultDisplay().getWidth(), getWindowManager().getDefaultDisplay().getHeight());
        }
        this.f41949y.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G1(Void r10) {
        gb.g gVar = new gb.g(this, this, this.A, this.B);
        this.f41938s0 = gVar;
        gVar.showAtLocation(((ActivityVideoPlayDetailBinding) this.f39697c).f39993b, 0, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I1(View view) {
        if (view == null) {
            return;
        }
        m2(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J1(Void r10) {
        PopupWindow popupWindow = this.f41924l0;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K1(Void r10) {
        ((ActivityVideoPlayDetailBinding) this.f39697c).f40011t.n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L1(Void r10) {
        ((VIDEOPLAYDETAILVIEWMODEL) this.f39698d).M0(true, this.A);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O1(List list) {
        jl.f fVar = this.H0;
        if (fVar == null) {
            initBarrage(list);
            return;
        }
        fVar.release();
        this.H0 = null;
        initBarrage(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void P1(String str) {
        k1(true, str, this.f41915h.z() + 50, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void S1(Void r10) {
        n2(((ActivityVideoPlayDetailBinding) this.f39697c).A);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void V1(Void r10) {
        ((ActivityVideoPlayDetailBinding) this.f39697c).f40011t.r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void W1(x9.e eVar) throws Exception {
        if (((ActivityVideoPlayDetailBinding) this.f39697c).f39993b.getAdRewardVisibilty()) {
            ((ActivityVideoPlayDetailBinding) this.f39697c).f39993b.e(8);
            if (this.f41915h != null) {
                if (eVar.a()) {
                    this.f41915h.M();
                    if (!eVar.b()) {
                        this.f41930o0 = System.currentTimeMillis();
                        o0.i1(o0.k());
                    }
                } else {
                    o2();
                }
                lookAdArrivalTime();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void X1(x9.f fVar) throws Exception {
        if (this.f41915h != null) {
            o2();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Y1(x9.i iVar) throws Exception {
        if (((ActivityVideoPlayDetailBinding) this.f39697c).f39993b.getLeLinkVisibilty()) {
            ((ActivityVideoPlayDetailBinding) this.f39697c).f39993b.setLeLinkState(8);
            this.f41915h.U();
            this.P0 = null;
            this.Q0 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b2(VideoShareDataEntry videoShareDataEntry) {
        this.f41934q0 = videoShareDataEntry;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f2(Void r10) {
        ((ActivityVideoPlayDetailBinding) this.f39697c).f40017z.post(new x());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g2(x9.a0 a0Var) throws Exception {
        Bundle bundle = new Bundle();
        bundle.putInt("id", a0Var.a());
        startActivity(VideoPlayDetailActivity.class, bundle);
        finish();
    }

    public static nl.a getDefaultDanmakuParser() {
        return new m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p1(Void r10) {
        Bundle bundle = new Bundle();
        bundle.putInt("id", ((VIDEOPLAYDETAILVIEWMODEL) this.f39698d).f41398i);
        bundle.putString("uploadNickName", ((VIDEOPLAYDETAILVIEWMODEL) this.f39698d).f41410o.get());
        bundle.putString("uploadHeadUrl", ((VIDEOPLAYDETAILVIEWMODEL) this.f39698d).f41412p.get());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q1(Boolean bool) {
        if (this.f41921k == null) {
            this.f41921k = new gb.j(this, this, this.f41917i);
        }
        this.f41921k.showAsDropDown(((ActivityVideoPlayDetailBinding) this.f39697c).f39993b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r1(Boolean bool) {
        if (this.f41919j != null) {
            com.mgs.carparking.widgets.dialog.i iVar = new com.mgs.carparking.widgets.dialog.i(this, this.f41919j, ((VIDEOPLAYDETAILVIEWMODEL) this.f39698d).A.get().intValue());
            this.f41925m = iVar;
            iVar.showAsDropDown(((ActivityVideoPlayDetailBinding) this.f39697c).f39993b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s1(Boolean bool) {
        if (this.f41919j != null) {
            com.mgs.carparking.widgets.dialog.k kVar = new com.mgs.carparking.widgets.dialog.k(this, this.f41919j, this.f41917i.getCoverUrl(), this.f41917i.getVod_name(), ((VIDEOPLAYDETAILVIEWMODEL) this.f39698d).A.get().intValue());
            this.f41923l = kVar;
            kVar.showAsDropDown(((ActivityVideoPlayDetailBinding) this.f39697c).f39993b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t1(RecommandVideosEntity recommandVideosEntity) {
        this.f41917i = recommandVideosEntity;
        m1(recommandVideosEntity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u1(Integer num) {
        Log.i("wangyi", "打开某个视频：" + num);
        if (((ActivityVideoPlayDetailBinding) this.f39697c).f39993b.getLeLinkVisibilty()) {
            ((ActivityVideoPlayDetailBinding) this.f39697c).f39993b.setLeLinkState(8);
            tl.a.a().b(new x9.y());
        }
        com.mgs.carparking.widgets.dialog.b bVar = this.f41929o;
        if (bVar != null) {
            bVar.dismiss();
            this.f41929o = null;
        }
        int iIntValue = num.intValue();
        this.C = iIntValue;
        this.B = this.f41919j.get(iIntValue).getCollection();
        this.f41915h.S();
        this.f41915h.Z(this.f41919j.get(this.C).getVod_url());
        VideoSkipEntry videoSkipEntry = this.F;
        if (videoSkipEntry == null || videoSkipEntry.getProgress_head() <= 0) {
            this.f41915h.c0(0L);
        } else {
            this.f41915h.c0(this.F.getProgress_head() * 1000);
        }
        ((ActivityVideoPlayDetailBinding) this.f39697c).f39993b.f(8);
        ((VIDEOPLAYDETAILVIEWMODEL) this.f39698d).A.set(Integer.valueOf(this.C));
        ((VIDEOPLAYDETAILVIEWMODEL) this.f39698d).Y0(this.f41917i.getType_pid(), this.C);
        ((ActivityVideoPlayDetailBinding) this.f39697c).f39993b.setTitle(this.f41917i.getVod_name() + Z7.f27998r + this.f41919j.get(this.C).getTitle());
        ((VIDEOPLAYDETAILVIEWMODEL) this.f39698d).K0(this.A, this.f41919j.get(this.C).getCollection());
        if (!((ActivityVideoPlayDetailBinding) this.f39697c).f39993b.getAdRewardVisibilty()) {
            g0 g0Var = this.f41940t0;
            if (g0Var != null) {
                g0Var.b();
                this.f41940t0 = null;
            }
            lookAdArrivalTime();
        }
        RecommandVideosEntity recommandVideosEntity = this.f41917i;
        if (recommandVideosEntity != null && recommandVideosEntity.is_share() == 1 && o0.L() == 1) {
            this.f41915h.h0();
            return;
        }
        sa.e.a();
        if (o0.z() || o0.H() >= o0.C()) {
            clearAd();
            this.f41915h.h0();
            return;
        }
        if (!VideoAdLookDao.getInstance().isExist(this.A + "" + this.B)) {
            if (this.f41919j.get(this.C).is_ad() == 1) {
                noChangeAd();
                return;
            } else if (o0.h() == 1) {
                selectLoadAd();
                return;
            } else {
                selectLoadAdNew();
                return;
            }
        }
        if (o0.Q() == 0) {
            clearAd();
            this.f41915h.h0();
        } else if (o0.h() == 1) {
            selectLoadAd();
        } else {
            selectLoadAdNew();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v1(Integer num) {
        RecommandVideosEntity recommandVideosEntity = this.f41917i;
        if (recommandVideosEntity != null) {
            if (recommandVideosEntity.getType_pid() == 3) {
                ((ActivityVideoPlayDetailBinding) this.f39697c).f40016y.scrollToPosition(num.intValue());
            } else if (this.f41917i.getType_pid() == 1 || this.f41917i.getType_pid() == 2 || this.f41917i.getType_pid() == 4) {
                ((ActivityVideoPlayDetailBinding) this.f39697c).f40015x.scrollToPosition(num.intValue());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w1(f0 f0Var) throws Exception {
        RecommandVideosEntity recommandVideosEntity = this.f41917i;
        if (recommandVideosEntity != null) {
            if (recommandVideosEntity.getType_pid() == 3) {
                ((VIDEOPLAYDETAILVIEWMODEL) this.f39698d).W0(f0Var.a());
                ((ActivityVideoPlayDetailBinding) this.f39697c).f40016y.scrollToPosition(f0Var.a());
            } else if (this.f41917i.getType_pid() == 1 || this.f41917i.getType_pid() == 2 || this.f41917i.getType_pid() == 4) {
                ((VIDEOPLAYDETAILVIEWMODEL) this.f39698d).X0(f0Var.a());
                ((ActivityVideoPlayDetailBinding) this.f39697c).f40015x.scrollToPosition(f0Var.a());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y1(x9.o oVar) throws Exception {
        ((VIDEOPLAYDETAILVIEWMODEL) this.f39698d).P0(this.A, oVar.a());
    }

    public void LeLinkHorizalPop() {
        w.a.f73245b.g(this);
        if (!this.R0) {
            initLeLinkView();
            this.R0 = true;
        }
        tl.a.a().b(new x9.z());
        if (this.Q0 == null) {
            com.mgs.carparking.widgets.dialog.a aVar = new com.mgs.carparking.widgets.dialog.a(this, this, MainActivity.mBrowseRegistryListener);
            this.Q0 = aVar;
            aVar.e(new r());
        }
        this.Q0.showAtLocation(((ActivityVideoPlayDetailBinding) this.f39697c).f40003l, 5, 0, 0);
    }

    public void LelinkPop() {
        w.a.f73245b.g(this);
        if (!this.R0) {
            initLeLinkView();
            this.R0 = true;
        }
        tl.a.a().b(new x9.z());
        if (g9.a.c().f() != null) {
            g9.a.c().d().w(MainActivity.mBrowseRegistryListener);
            g9.a.c().g();
        }
        if (this.P0 == null) {
            ClingDeviceDialog clingDeviceDialog = new ClingDeviceDialog(this, this, MainActivity.mBrowseRegistryListener);
            this.P0 = clingDeviceDialog;
            clingDeviceDialog.g(new q());
        }
        this.P0.show();
    }

    public void adPlayCenterGDT(boolean z10, boolean z11, boolean z12, AdInfoDetailEntry adInfoDetailEntry, Activity activity, VideoPlayerView videoPlayerView, int i10, int i11, View view, Handler handler, t.a aVar, int i12) {
        if (!z12 || adInfoDetailEntry.getNew_user_has_ad() == 1) {
            if (z11) {
                this.f41915h.L();
            }
            AdNumShowDao.getInstance().updatePlayCenterIndex(i12);
        }
    }

    public void adPlayCenterTd(boolean z10, boolean z11, boolean z12, AdInfoDetailEntry adInfoDetailEntry, Activity activity, VideoPlayerView videoPlayerView, int i10, int i11, View view, Handler handler, t.a aVar, int i12) {
        if (!z12 || adInfoDetailEntry.getNew_user_has_ad() == 1) {
            if (z11) {
                this.f41915h.L();
            }
            AdNumShowDao.getInstance().updatePlayCenterIndex(i12);
        }
    }

    public void clearAd() {
        if (((ActivityVideoPlayDetailBinding) this.f39697c).f39993b.getAdRewardVisibilty()) {
            ((ActivityVideoPlayDetailBinding) this.f39697c).f39993b.e(8);
        }
        ta.c cVar = this.G;
        if (cVar != null) {
            cVar.b();
            this.G = null;
        }
        ta.h hVar = this.H;
        if (hVar != null) {
            hVar.a();
            this.H = null;
        }
        ta.d dVar = this.T0;
        if (dVar != null) {
            dVar.d();
            this.T0 = null;
        }
    }

    public void getSignInfo() {
        if (AppApplication.port <= 0) {
            ((VIDEOPLAYDETAILVIEWMODEL) this.f39698d).D.set(Boolean.FALSE);
            ((VIDEOPLAYDETAILVIEWMODEL) this.f39698d).f41428x.set(Boolean.TRUE);
            return;
        }
        String str = System.currentTimeMillis() + "";
        sa.x.a("http://127.0.0.1:" + AppApplication.port + "/control?msg=verify&device_id=" + t9.a.a(em.r.a()) + this.A + "&ts=" + str, new s(str));
    }

    public void initBarrage(List<BarrageListEntry> list) {
        HashMap map = new HashMap();
        map.put(1, 2);
        HashMap map2 = new HashMap();
        Boolean bool = Boolean.TRUE;
        map2.put(1, bool);
        map2.put(5, bool);
        this.H0 = (jl.f) findViewById(R.id.sv_danmaku);
        DanmakuContext danmakuContextA = DanmakuContext.a();
        this.G0 = danmakuContextA;
        danmakuContextA.l(2, 3.0f).m(false).q(1.2f).p(1.2f).o(map).i(map2).k(40);
        if (this.H0 != null) {
            this.I0 = getDefaultDanmakuParser();
            this.H0.setCallback(new j());
            this.H0.g(this.I0, this.G0);
            this.H0.h(true);
            if (list == null || list.size() <= 0) {
                return;
            }
            this.J0.postDelayed(new l(list), 10L);
        }
    }

    public void initPlayer() {
        t.a aVarB = new t.e.b(this, 1, R.id.exo_play_context_id).d(new u.a(BaseApplication.getInstance(), new va.a(this))).h(true).i(false).k(false).e(new v()).g(new u()).f(new t()).b();
        this.f41915h = aVarB;
        aVarB.N();
        this.f41915h.d0(true);
        this.f41915h.F().I();
        this.f41915h.F().getPlaybackControlView().setFull(false);
        this.f41915h.F().getPlaybackControlView().setCallBack(new w());
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public VIDEOPLAYDETAILVIEWMODEL initViewModel() {
        return new VIDEOPLAYDETAILVIEWMODEL(BaseApplication.getInstance(), i9.a.a());
    }

    public void insertHistory() {
        t.a aVar = this.f41915h;
        if (aVar == null || aVar.D() == null || this.f41915h.D().getContentPosition() < 0 || this.f41917i == null || this.f41919j.size() <= 0) {
            return;
        }
        if (this.f41915h.D().getContentPosition() > 0 || this.f41932p0) {
            VideoLookHistoryEntry videoLookHistoryEntry = new VideoLookHistoryEntry();
            videoLookHistoryEntry.setId(this.f41917i.getId());
            videoLookHistoryEntry.setName(this.f41917i.getVod_name() + Z7.f27998r + this.f41919j.get(this.C).getTitle());
            videoLookHistoryEntry.setCoverUrl(this.f41917i.getVod_pic());
            videoLookHistoryEntry.setVideoDesc(this.f41919j.get(this.C).getOrginal_url());
            videoLookHistoryEntry.setVideoType(this.D);
            videoLookHistoryEntry.setAudiotype(this.B0);
            videoLookHistoryEntry.setSubtitletype(this.C0);
            if (this.f41919j.get(this.C).is_p2p() == 1) {
                videoLookHistoryEntry.setUrl(this.f41919j.get(this.C).getVod_url());
            } else {
                videoLookHistoryEntry.setUrl(this.f41919j.get(this.C).getOrginal_url());
            }
            videoLookHistoryEntry.setUpdateTime(System.currentTimeMillis());
            videoLookHistoryEntry.setCurrent(this.C);
            if (this.f41915h.A() <= 0) {
                videoLookHistoryEntry.setContentPosition(0L);
                videoLookHistoryEntry.setDuration(0L);
            } else {
                videoLookHistoryEntry.setContentPosition(this.f41915h.D().getContentPosition());
                videoLookHistoryEntry.setDuration(this.f41915h.A());
            }
            VideoLookHistoryDao.getInstance().insertHistory(videoLookHistoryEntry);
        }
    }

    public void insertVideoShare() {
        RecommandVideosEntity recommandVideosEntity = this.f41917i;
        if (recommandVideosEntity == null || em.o.b(recommandVideosEntity.getVod_name())) {
            return;
        }
        VideoShareEntry videoShareEntry = new VideoShareEntry();
        videoShareEntry.setId(this.A);
        videoShareEntry.setName(this.f41917i.getVod_name());
        VideoShareDao.getInstance().insertStayTime(videoShareEntry);
    }

    public void insertVideoStay() {
        RecommandVideosEntity recommandVideosEntity = this.f41917i;
        if (recommandVideosEntity == null || em.o.b(recommandVideosEntity.getVod_name())) {
            return;
        }
        VideoStayTimeEntry videoStayTimeEntry = new VideoStayTimeEntry();
        videoStayTimeEntry.setId(this.A);
        videoStayTimeEntry.setName(this.f41917i.getVod_name());
        VideoStayTimeDao.getInstance().insertStayTime(videoStayTimeEntry);
    }

    public final void k1(boolean z10, String str, long j10, int i10) {
        kl.c cVarB;
        DanmakuContext danmakuContext = this.G0;
        if (danmakuContext == null || (cVarB = danmakuContext.f64339z.b(1)) == null || this.H0 == null) {
            return;
        }
        cVarB.f62894e = new HashMap(16);
        cVarB.f62892c = str;
        cVarB.f62902m = 5;
        cVarB.f62903n = (byte) 0;
        cVarB.f62914y = z10;
        cVarB.A(j10);
        cVarB.f62900k = (this.I0.b().f() - 0.6f) * 15.0f;
        if (i10 == 2) {
            cVarB.f62895f = Color.parseColor("#2d72ee");
        } else {
            cVarB.f62895f = -1;
        }
        this.H0.a(cVarB);
    }

    public final void l1() {
        ((ActivityVideoPlayDetailBinding) this.f39697c).f40011t.H(true);
        ((ActivityVideoPlayDetailBinding) this.f39697c).f40011t.I(false);
        new ClassicsFooter(this).u(12.0f);
        ((ActivityVideoPlayDetailBinding) this.f39697c).f40011t.L(new h());
        ((ActivityVideoPlayDetailBinding) this.f39697c).f40011t.K(new i());
    }

    public void loadAdFloatViewAd() {
        if (AppApplication.adInfoEntry.getAd_position_18() == null || AppApplication.adInfoEntry.getAd_position_18().size() <= 0) {
            return;
        }
        List<AdInfoDetailEntry> ad_position_18 = AppApplication.adInfoEntry.getAd_position_18();
        int num = AdNumShowDao.getInstance().getNum(102);
        if (num >= ad_position_18.size() - 1) {
            loadAdFloatAdOnce(ad_position_18, 0);
        } else {
            loadAdFloatAdOnce(ad_position_18, num + 1);
        }
    }

    public void loadAdInfo() {
        if (AppApplication.adInfoEntry.getAd_position_8() != null && AppApplication.adInfoEntry.getAd_position_8().size() > 0) {
            List<AdInfoDetailEntry> ad_position_8 = AppApplication.adInfoEntry.getAd_position_8();
            int num = AdNumShowDao.getInstance().getNum(25);
            if (num >= ad_position_8.size() - 1) {
                loadAdPlayInfoOnce(ad_position_8, 0);
            } else {
                loadAdPlayInfoOnce(ad_position_8, num + 1);
            }
        }
        if (AppApplication.adInfoEntry.getAd_position_2() != null) {
            AppApplication.adInfoEntry.getAd_position_2().size();
        }
    }

    public void loadFloatAdWX(AdInfoDetailEntry adInfoDetailEntry) {
        ta.d dVar = new ta.d(this);
        this.T0 = dVar;
        dVar.c(adInfoDetailEntry);
        AdNumShowDao.getInstance().updateWxFloatAdNum(AdNumShowDao.getInstance().getNum(103) + 1);
    }

    public void loadVideoNext() {
        List<VideoBean> list = this.f41919j;
        if (list == null || list.size() <= 0) {
            return;
        }
        if (this.C >= this.f41919j.size() - 1) {
            em.p.b(em.r.a().getResources().getString(R.string.str_play_last_tip));
            return;
        }
        com.mgs.carparking.widgets.dialog.b bVar = this.f41929o;
        if (bVar != null) {
            bVar.dismiss();
            this.f41929o = null;
        }
        this.f41932p0 = true;
        int i10 = this.C + 1;
        this.C = i10;
        this.B = this.f41919j.get(i10).getCollection();
        this.f41915h.S();
        this.f41915h.Z(this.f41919j.get(this.C).getVod_url());
        VideoSkipEntry videoSkipEntry = this.F;
        if (videoSkipEntry == null || videoSkipEntry.getProgress_head() <= 0) {
            this.f41915h.c0(0L);
        } else {
            this.f41915h.c0(this.F.getProgress_head() * 1000);
        }
        this.f41950y0 = true;
        ((ActivityVideoPlayDetailBinding) this.f39697c).f39993b.f(8);
        ((VIDEOPLAYDETAILVIEWMODEL) this.f39698d).A.set(Integer.valueOf(this.C));
        ((VIDEOPLAYDETAILVIEWMODEL) this.f39698d).Y0(this.f41917i.getType_pid(), this.C);
        ((ActivityVideoPlayDetailBinding) this.f39697c).f39993b.setTitle(this.f41917i.getVod_name() + Z7.f27998r + this.f41919j.get(this.C).getTitle());
        ((VIDEOPLAYDETAILVIEWMODEL) this.f39698d).K0(this.A, this.f41919j.get(this.C).getCollection());
        if (!((ActivityVideoPlayDetailBinding) this.f39697c).f39993b.getAdRewardVisibilty()) {
            g0 g0Var = this.f41940t0;
            if (g0Var != null) {
                g0Var.b();
                this.f41940t0 = null;
            }
            lookAdArrivalTime();
        }
        RecommandVideosEntity recommandVideosEntity = this.f41917i;
        if (recommandVideosEntity != null && recommandVideosEntity.is_share() == 1 && o0.L() == 1) {
            this.f41915h.h0();
            return;
        }
        sa.e.a();
        if (o0.z() || o0.H() >= o0.C()) {
            clearAd();
            this.f41915h.h0();
            return;
        }
        if (!VideoAdLookDao.getInstance().isExist(this.A + "" + this.B)) {
            if (this.f41919j.get(this.C).is_ad() == 1) {
                noChangeAd();
                return;
            } else if (o0.h() == 1) {
                selectLoadAd();
                return;
            } else {
                selectLoadAdNew();
                return;
            }
        }
        if (o0.Q() == 0) {
            clearAd();
            this.f41915h.h0();
        } else if (o0.h() == 1) {
            selectLoadAd();
        } else {
            selectLoadAdNew();
        }
    }

    public void lookAdArrivalTime() {
        if (AppApplication.adInfoEntry.getAd_position_13() == null || AppApplication.adInfoEntry.getAd_position_13().size() <= 0) {
            return;
        }
        if (this.f41940t0 == null) {
            this.f41940t0 = new g0();
        }
        this.f41940t0.c(180000L, new g0.b() { // from class: fa.a
            @Override // sa.g0.b
            public final void a(long j10) {
                this.f52885a.k2(j10);
            }
        });
    }

    public final void m2(View view) {
        if (this.f41924l0 == null) {
            this.f41924l0 = new PopupWindow(this.f41926m0.getRoot(), -2, -2, true);
        }
        this.f41924l0.showAsDropDown(view, view.getWidth() / 2, (-view.getHeight()) - em.j.a(30.0f, em.r.a()), 17);
        ((VIDEOPLAYDETAILVIEWMODEL) this.f39698d).R.setValue(null);
    }

    public final void o2() {
        this.f41915h.h0();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        ImageView imageView;
        t.a aVar = this.f41915h;
        if (aVar != null) {
            aVar.J(configuration);
        }
        super.onConfigurationChanged(configuration);
        if (s.e.k(this)) {
            Log.i("wangyi", "横屏");
            t.a aVar2 = this.f41915h;
            if (aVar2 != null && aVar2.F() != null && this.f41915h.F().getPlaybackControlView() != null) {
                this.f41915h.F().getPlaybackControlView().setFull(true);
            }
            RelativeLayout relativeLayout = this.f41911d0;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(8);
            }
            RelativeLayout relativeLayout2 = this.f41912e0;
            if (relativeLayout2 != null) {
                relativeLayout2.setVisibility(0);
            }
            ImageView imageView2 = this.N;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
            ImageView imageView3 = this.L;
            if (imageView3 != null) {
                imageView3.setVisibility(8);
            }
            LinearLayout linearLayout = this.I;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            LinearLayout linearLayout2 = this.K;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(0);
            }
            ImageView imageView4 = this.P;
            if (imageView4 != null) {
                imageView4.setVisibility(8);
            }
            ImageView imageView5 = this.Q;
            if (imageView5 != null) {
                imageView5.setVisibility(8);
            }
            ImageView imageView6 = this.S;
            if (imageView6 != null) {
                imageView6.setVisibility(8);
            }
            ClingDeviceDialog clingDeviceDialog = this.P0;
            if (clingDeviceDialog != null && clingDeviceDialog.isShowing()) {
                this.P0.dismiss();
            }
            BarrageHorizonalDialog barrageHorizonalDialog = this.f41951z;
            if (barrageHorizonalDialog != null && barrageHorizonalDialog.isShowing()) {
                this.f41951z.dismiss();
            }
            RecommandVideosEntity recommandVideosEntity = this.f41917i;
            if (recommandVideosEntity == null || recommandVideosEntity.getType_pid() == 0 || (imageView = this.M) == null || this.Y == null) {
                return;
            }
            imageView.setVisibility(0);
            this.Y.setVisibility(0);
            return;
        }
        Log.i("wangyi", "竖屏");
        t.a aVar3 = this.f41915h;
        if (aVar3 != null && aVar3.F() != null && this.f41915h.F().getPlaybackControlView() != null) {
            this.f41915h.F().getPlaybackControlView().setFull(false);
        }
        RelativeLayout relativeLayout3 = this.f41911d0;
        if (relativeLayout3 != null) {
            relativeLayout3.setVisibility(0);
        }
        RelativeLayout relativeLayout4 = this.f41912e0;
        if (relativeLayout4 != null) {
            relativeLayout4.setVisibility(8);
        }
        ImageView imageView7 = this.N;
        if (imageView7 != null) {
            imageView7.setVisibility(4);
        }
        ImageView imageView8 = this.L;
        if (imageView8 != null) {
            imageView8.setVisibility(0);
        }
        ImageView imageView9 = this.M;
        if (imageView9 != null) {
            imageView9.setVisibility(8);
        }
        LinearLayout linearLayout3 = this.I;
        if (linearLayout3 != null && this.Y != null && this.J != null && this.K != null && this.P != null) {
            linearLayout3.setVisibility(8);
            this.Y.setVisibility(8);
            this.J.setVisibility(8);
            this.K.setVisibility(8);
            this.P.setVisibility(0);
        }
        ImageView imageView10 = this.P;
        if (imageView10 != null && imageView10.getTag().equals("select")) {
            this.Q.setVisibility(0);
        }
        BarrageDialog barrageDialog = this.f41947x;
        if (barrageDialog != null && barrageDialog.isShowing()) {
            this.f41947x.dismiss();
        }
        com.mgs.carparking.widgets.dialog.g gVar = this.f41927n;
        if (gVar != null && gVar.isShowing()) {
            this.f41927n.dismiss();
        }
        com.mgs.carparking.widgets.dialog.f fVar = this.f41931p;
        if (fVar != null) {
            if (fVar.isShowing()) {
                this.f41931p.dismiss();
            }
            gb.k kVar = this.f41931p.f42689w;
            if (kVar != null && kVar.isShowing()) {
                this.f41931p.f42689w.dismiss();
            }
        }
        com.mgs.carparking.widgets.dialog.c cVar = this.f41933q;
        if (cVar != null && cVar.isShowing()) {
            this.f41933q.dismiss();
        }
        com.mgs.carparking.widgets.dialog.d dVar = this.f41937s;
        if (dVar != null && dVar.isShowing()) {
            this.f41937s.dismiss();
        }
        com.mgs.carparking.widgets.dialog.b bVar = this.f41929o;
        if (bVar != null && bVar.isShowing()) {
            this.f41929o.dismiss();
        }
        com.mgs.carparking.widgets.dialog.e eVar = this.f41939t;
        if (eVar != null && eVar.isShowing()) {
            this.f41939t.dismiss();
        }
        com.mgs.carparking.widgets.dialog.a aVar4 = this.Q0;
        if (aVar4 != null && aVar4.isShowing()) {
            this.Q0.dismiss();
        }
        ImageView imageView11 = this.S;
        if (imageView11 != null) {
            imageView11.setVisibility(0);
        }
    }

    public void showAdAwardCenterPlayerType(boolean z10, boolean z11, boolean z12, List<AdInfoDetailEntry> list, Activity activity, VideoPlayerView videoPlayerView, int i10, int i11, View view, Handler handler, t.a aVar, int i12) {
        AdInfoDetailEntry adInfoDetailEntry = AppApplication.adInfoEntry.getAd_position_13().get(i12);
        if (adInfoDetailEntry.getAd_source_id() == 2) {
            if (adInfoDetailEntry.getNum() <= 0) {
                adPlayCenterGDT(z10, z11, z12, adInfoDetailEntry, activity, videoPlayerView, i10, i11, view, handler, aVar, i12);
                return;
            } else if (adInfoDetailEntry.getNum() > AdNumShowDao.getInstance().getNum(52)) {
                adPlayCenterGDT(z10, z11, z12, adInfoDetailEntry, activity, videoPlayerView, i10, i11, view, handler, aVar, i12);
                return;
            } else {
                int i13 = i12 + 1;
                showAdAwardCenterPlayerType(z10, z11, z12, list, activity, videoPlayerView, i10, i11, view, handler, aVar, i13 == list.size() ? 0 : i13);
                return;
            }
        }
        if (adInfoDetailEntry.getAd_source_id() == 4) {
            if (adInfoDetailEntry.getNum() <= 0) {
                adPlayCenterTd(z10, z11, z12, adInfoDetailEntry, activity, videoPlayerView, i10, i11, view, handler, aVar, i12);
            } else if (adInfoDetailEntry.getNum() > AdNumShowDao.getInstance().getNum(52)) {
                adPlayCenterTd(z10, z11, z12, adInfoDetailEntry, activity, videoPlayerView, i10, i11, view, handler, aVar, i12);
            } else {
                int i14 = i12 + 1;
                showAdAwardCenterPlayerType(z10, z11, z12, list, activity, videoPlayerView, i10, i11, view, handler, aVar, i14 == list.size() ? 0 : i14);
            }
        }
    }

    public void showAdAwardPlayerType(boolean z10, boolean z11, List<AdInfoDetailEntry> list, Activity activity, VideoPlayerView videoPlayerView, int i10, int i11, View view, Handler handler, t.a aVar, int i12) {
        AdInfoDetailEntry adInfoDetailEntry = AppApplication.adInfoEntry.getAd_position_4().get(i12);
        if (adInfoDetailEntry.getAd_source_id() == 2) {
            if (adInfoDetailEntry.getNum() <= 0) {
                adPlayWx(z10, z11, adInfoDetailEntry, activity, videoPlayerView, i10, i11, view, handler, aVar, i12);
                return;
            }
            if (adInfoDetailEntry.getNum() > AdNumShowDao.getInstance().getNum(8)) {
                adPlayWx(z10, z11, adInfoDetailEntry, activity, videoPlayerView, i10, i11, view, handler, aVar, i12);
                return;
            }
            int i13 = i12 + 1;
            if (i13 == list.size()) {
                i13 = 0;
            }
            showAdAwardPlayerType(z10, z11, list, activity, videoPlayerView, i10, i11, view, handler, aVar, i13);
        }
    }

    public void toggleClingOpenDialog(boolean z10) {
        if (z10) {
            if (this.f41944v0 == null) {
                this.f41944v0 = gb.h.a(this, this.f41946w0.getRoot(), false);
            }
            this.f41944v0.show();
        } else {
            Dialog dialog = this.f41944v0;
            if (dialog != null) {
                dialog.dismiss();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H1(x9.v vVar) throws Exception {
        if (vVar.getType() == 1) {
            ((VIDEOPLAYDETAILVIEWMODEL) this.f39698d).L0(vVar.a(), 1);
        } else {
            ((VIDEOPLAYDETAILVIEWMODEL) this.f39698d).N0(vVar.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M1(Void r10) {
        if (o0.B() == 0) {
            startActivity(LoginActivity.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N1(c0 c0Var) throws Exception {
        if (!em.o.b(o0.S())) {
            ib.d.c(this, o0.S(), R.drawable.ic_avatar_default, R.drawable.ic_avatar_default, ((ActivityVideoPlayDetailBinding) this.f39697c).f39999h, false);
        } else {
            ((ActivityVideoPlayDetailBinding) this.f39697c).f39999h.setImageResource(R.drawable.ic_avatar_login_default);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Q1(Boolean bool) {
        if (bool.booleanValue()) {
            o0.j0(1);
            Dialog dialog = this.f41942u0;
            if (dialog != null) {
                dialog.dismiss();
            }
            this.J0.postDelayed(new z(), 300L);
            return;
        }
        tl.a.a().b(new x9.e(this.f41948x0, false));
        Dialog dialog2 = this.f41942u0;
        if (dialog2 != null) {
            dialog2.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void R1(Boolean bool) {
        if (bool.booleanValue()) {
            Dialog dialog = this.f41944v0;
            if (dialog != null) {
                dialog.dismiss();
            }
            safedk_ComponentActivity_startActivityForResult_400537aeb948a6492f65a13e4d0b0824(this, new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + getPackageName())), 1);
            return;
        }
        Dialog dialog2 = this.f41944v0;
        if (dialog2 != null) {
            dialog2.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void T1(h0 h0Var) throws Exception {
        ArrayList<VideoLookHistoryEntry> arrayListQueryItemHistory = VideoLookHistoryDao.getInstance().queryItemHistory(this.A);
        if (arrayListQueryItemHistory.size() > 0) {
            this.E = arrayListQueryItemHistory.get(0);
        }
        getSignInfo();
        this.f41908a0.setVisibility(8);
        this.f41910c0.setVisibility(8);
        if (((ActivityVideoPlayDetailBinding) this.f39697c).f39993b.getAdRewardVisibilty()) {
            ((ActivityVideoPlayDetailBinding) this.f39697c).f39993b.e(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void U1(x9.d dVar) throws Exception {
        this.f41948x0 = dVar.a();
        toggleErrorCodeDialog(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Z1(x9.g0 g0Var) throws Exception {
        if (g0Var.a() != null) {
            this.f41950y0 = true;
            this.F = g0Var.a();
        } else {
            this.F = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a2(x9.b bVar) throws Exception {
        if (s.e.k(this)) {
            LeLinkHorizalPop();
        } else {
            LelinkPop();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c2(String str) {
        sa.a.a(this, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d2(Integer num) {
        insertHistory();
        if (!sa.e.q()) {
            Bundle bundle = new Bundle();
            bundle.putInt("id", num.intValue());
            bundle.putInt("language_type", this.D);
            startActivity(VideoPlayDetailActivity.class, bundle);
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e2(e0 e0Var) throws Exception {
        this.F0 = e0Var.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h2(Integer num) {
        if (!sa.e.q()) {
            Bundle bundle = new Bundle();
            bundle.putInt("id", this.A);
            bundle.putInt("language_type", num.intValue());
            startActivity(VideoPlayDetailActivity.class, bundle);
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i2(Integer num) {
        if (!sa.e.q()) {
            Bundle bundle = new Bundle();
            bundle.putInt("id", num.intValue());
            startActivity(VideoPlayDetailActivity.class, bundle);
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j2(Integer num) {
        if (!sa.e.q()) {
            Bundle bundle = new Bundle();
            bundle.putInt("id", num.intValue());
            bundle.putInt("flag", 1);
            startActivity(SpecialDetailNewActivity.class, bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k2(long j10) {
        long jD;
        long jCurrentTimeMillis = (System.currentTimeMillis() - this.f41930o0) + o0.X();
        if (o0.d() > 0) {
            jD = o0.d();
        } else {
            jD = 3600000;
        }
        if (jCurrentTimeMillis > jD && o0.H() < o0.C()) {
            this.f41940t0.b();
            this.f41940t0 = null;
            t.a aVar = this.f41915h;
            if (aVar != null && aVar.D() != null && this.f41915h.H() && !((ActivityVideoPlayDetailBinding) this.f39697c).f39993b.getAdRewardVisibilty()) {
                if (o0.h() == 1) {
                    loadAdCenterPlay(false, true, false, this, ((ActivityVideoPlayDetailBinding) this.f39697c).f39993b, this.A, this.B, this.Z, this.J0, this.f41915h);
                } else {
                    loadAdCenterPlay(false, true, true, this, ((ActivityVideoPlayDetailBinding) this.f39697c).f39993b, this.A, this.B, this.Z, this.J0, this.f41915h);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n1(Void r10) {
        if (em.o.b(o0.J())) {
            ((VIDEOPLAYDETAILVIEWMODEL) this.f39698d).e0();
            return;
        }
        if (AppApplication.port < 7000) {
            AppApplication.loadP2pSdk();
        }
        getSignInfo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o1(Void r10) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x1(x9.c cVar) throws Exception {
        this.f41930o0 = System.currentTimeMillis();
        VideoAdLookDao.getInstance().insertVideoAd(this.A + "" + this.B);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z1(Void r10) {
        AppApplication.loadP2pSdk();
        getSignInfo();
    }

    public void enterLoadAd() {
        if (o0.x() == 0) {
            loadAdPlay(false, false, this, ((ActivityVideoPlayDetailBinding) this.f39697c).f39993b, this.A, this.B, this.Z, this.J0, this.f41915h);
        } else if (o0.X() >= o0.k()) {
            loadAdPlay(false, false, this, ((ActivityVideoPlayDetailBinding) this.f39697c).f39993b, this.A, this.B, this.Z, this.J0, this.f41915h);
        } else {
            o2();
        }
    }

    public void enterLoadAdNew() {
        if (o0.x() == 0) {
            loadAdPlay(false, true, this, ((ActivityVideoPlayDetailBinding) this.f39697c).f39993b, this.A, this.B, this.Z, this.J0, this.f41915h);
        } else if (o0.X() >= o0.k()) {
            loadAdPlay(false, true, this, ((ActivityVideoPlayDetailBinding) this.f39697c).f39993b, this.A, this.B, this.Z, this.J0, this.f41915h);
        } else {
            o2();
        }
    }

    public String getip() {
        return Formatter.formatIpAddress(((WifiManager) getApplicationContext().getSystemService("wifi")).getConnectionInfo().getIpAddress());
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public void initData() {
        super.initData();
        if (em.o.b(o0.R())) {
            sa.c.f("");
        }
        this.A = getIntent().getIntExtra("id", 0);
        this.D = getIntent().getIntExtra("language_type", 0);
        this.V = (ProgressBar) findViewById(R.id.exo_video_audio_brightness_pro_my);
        this.U = (ProgressBar) findViewById(R.id.exo_video_audio_pro_my);
        this.W = (ImageView) findViewById(R.id.exo_video_fast_img_my);
        this.L = (ImageView) findViewById(R.id.iv_back);
        this.N = (ImageView) findViewById(R.id.iv_back_hint);
        this.M = (ImageView) findViewById(R.id.iv_exo_next);
        this.X = (TextView) findViewById(R.id.tv_speed);
        this.f41909b0 = (TextView) findViewById(R.id.tv_set_audio);
        this.Y = (TextView) findViewById(R.id.tv_set_num);
        this.f41952z0 = (FrameLayout) findViewById(R.id.flContainer);
        this.I = (LinearLayout) findViewById(R.id.rl_speed);
        this.J = (LinearLayout) findViewById(R.id.ll_audio_subtitle);
        this.K = (LinearLayout) findViewById(R.id.ll_set_num);
        this.f41911d0 = (RelativeLayout) findViewById(R.id.rl_bottom_horizontal);
        this.f41912e0 = (RelativeLayout) findViewById(R.id.rl_bottom_land);
        this.O = (ImageView) findViewById(R.id.iv_barrage);
        this.Z = (TextView) findViewById(R.id.tv_barrage);
        this.P = (ImageView) findViewById(R.id.iv_barrage_horizontal);
        this.Q = (ImageView) findViewById(R.id.iv_barrage_write_horizontal);
        this.R = (ImageView) findViewById(R.id.iv_video_more);
        this.f41908a0 = (TextView) findViewById(R.id.tv_openvip_horizontal);
        this.f41910c0 = (ConstraintLayout) findViewById(R.id.vpLayout);
        this.T = (ImageView) findViewById(R.id.iv_lelink_horizontal);
        this.S = (ImageView) findViewById(R.id.iv_lelink_varical);
        this.f41913f0 = (AppCompatTextView) findViewById(R.id.exo_player_restart_id);
        this.D0 = (ImageView) findViewById(R.id.icFast);
        this.E0 = (ImageView) findViewById(R.id.icRetreat);
        this.T.setVisibility(0);
        this.S.setVisibility(0);
        this.L.setOnClickListener(this);
        this.M.setOnClickListener(this);
        this.I.setOnClickListener(this);
        this.J.setOnClickListener(this);
        this.K.setOnClickListener(this);
        this.O.setOnClickListener(this);
        this.Z.setOnClickListener(this);
        this.P.setOnClickListener(this);
        this.Q.setOnClickListener(this);
        this.R.setOnClickListener(this);
        this.f41908a0.setOnClickListener(this);
        this.S.setOnClickListener(this);
        this.T.setOnClickListener(this);
        this.f41913f0.setOnClickListener(this);
        this.E0.setOnClickListener(this);
        this.D0.setOnClickListener(this);
        Glide.with((FragmentActivity) this).load(Integer.valueOf(R.drawable.ic_is_loading)).into(((ActivityVideoPlayDetailBinding) this.f39697c).f39996e);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.flPauseAd);
        this.f41922k0 = relativeLayout;
        relativeLayout.setOnClickListener(new k());
        this.f41922k0.setVisibility(8);
        PopLayoutVideoCommentItemBinding popLayoutVideoCommentItemBinding = (PopLayoutVideoCommentItemBinding) DataBindingUtil.inflate(LayoutInflater.from(em.r.a()), R.layout.pop_layout_video_comment_item, null, false);
        this.f41926m0 = popLayoutVideoCommentItemBinding;
        popLayoutVideoCommentItemBinding.a((VIDEOPLAYDETAILVIEWMODEL) this.f39698d);
        DialogClingOpenFloatBinding dialogClingOpenFloatBinding = (DialogClingOpenFloatBinding) DataBindingUtil.inflate(LayoutInflater.from(this), R.layout.dialog_cling_open_float, null, false);
        this.f41946w0 = dialogClingOpenFloatBinding;
        dialogClingOpenFloatBinding.a((VIDEOPLAYDETAILVIEWMODEL) this.f39698d);
        if (!em.o.b(o0.S())) {
            ib.d.c(this, o0.S(), R.drawable.ic_avatar_default, R.drawable.ic_avatar_default, ((ActivityVideoPlayDetailBinding) this.f39697c).f39999h, false);
        } else {
            ((ActivityVideoPlayDetailBinding) this.f39697c).f39999h.setImageResource(R.drawable.ic_avatar_login_default);
        }
        TvAndComicAdapter tvAndComicAdapter = new TvAndComicAdapter(this);
        this.f41918i0 = tvAndComicAdapter;
        ((ActivityVideoPlayDetailBinding) this.f39697c).f40015x.setAdapter(tvAndComicAdapter);
        VarietyAdapter varietyAdapter = new VarietyAdapter(this);
        this.f41920j0 = varietyAdapter;
        ((ActivityVideoPlayDetailBinding) this.f39697c).f40016y.setAdapter(varietyAdapter);
        CommentListAdapter commentListAdapter = new CommentListAdapter(this);
        this.f41916h0 = commentListAdapter;
        ((ActivityVideoPlayDetailBinding) this.f39697c).f40014w.setAdapter(commentListAdapter);
        initPlayer();
        ArrayList<VideoLookHistoryEntry> arrayListQueryItemHistory = VideoLookHistoryDao.getInstance().queryItemHistory(this.A);
        if (arrayListQueryItemHistory.size() > 0) {
            VideoLookHistoryEntry videoLookHistoryEntry = arrayListQueryItemHistory.get(0);
            this.E = videoLookHistoryEntry;
            this.B0 = videoLookHistoryEntry.getAudiotype();
            this.C0 = this.E.getSubtitletype();
        }
        ArrayList<VideoSkipEntry> arrayListQueryItemSkipVideo = VideoSkipDao.getInstance().queryItemSkipVideo(this.A);
        if (arrayListQueryItemSkipVideo.size() > 0) {
            this.F = arrayListQueryItemSkipVideo.get(0);
            this.f41950y0 = true;
        }
        l1();
        if (em.o.b(o0.J())) {
            ((VIDEOPLAYDETAILVIEWMODEL) this.f39698d).e0();
        } else {
            if (AppApplication.port < 7000) {
                AppApplication.loadP2pSdk();
            }
            getSignInfo();
        }
        loadAdInfo();
        loadAdFloatViewAd();
    }

    public void initLeLinkView() {
        this.L0 = (TextView) findViewById(R.id.tv_lelink_status);
        this.M0 = (TextView) findViewById(R.id.tv_lelink_name);
        this.O0 = (LinearLayout) findViewById(R.id.ll_lelink_change);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.ll_lelink_close);
        this.N0 = linearLayout;
        linearLayout.setOnClickListener(new o());
        this.O0.setOnClickListener(new p());
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public void initViewObservable() {
        super.initViewObservable();
        ((VIDEOPLAYDETAILVIEWMODEL) this.f39698d).E.observe(this, new Observer() { // from class: fa.l
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f52907b.n1((Void) obj);
            }
        });
        ((VIDEOPLAYDETAILVIEWMODEL) this.f39698d).G.observe(this, new Observer() { // from class: fa.d
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f52891b.o1((Void) obj);
            }
        });
        ((VIDEOPLAYDETAILVIEWMODEL) this.f39698d).f41399i0.observe(this, new Observer() { // from class: fa.p
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f52915b.z1((Void) obj);
            }
        });
        ((VIDEOPLAYDETAILVIEWMODEL) this.f39698d).N.observe(this, new Observer() { // from class: fa.b0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f52888b.K1((Void) obj);
            }
        });
        ((VIDEOPLAYDETAILVIEWMODEL) this.f39698d).M.observe(this, new Observer() { // from class: fa.m0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f52910b.V1((Void) obj);
            }
        });
        ((VIDEOPLAYDETAILVIEWMODEL) this.f39698d).O.observe(this, new Observer() { // from class: fa.n0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f52912b.f2((Void) obj);
            }
        });
        k(tl.a.a().d(x9.a0.class).subscribe(new oi.g() { // from class: fa.o0
            @Override // oi.g
            public final void accept(Object obj) throws Exception {
                this.f52914b.g2((x9.a0) obj);
            }
        }));
        ((VIDEOPLAYDETAILVIEWMODEL) this.f39698d).D0.observe(this, new Observer() { // from class: fa.p0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f52916b.h2((Integer) obj);
            }
        });
        ((VIDEOPLAYDETAILVIEWMODEL) this.f39698d).f41393f0.observe(this, new Observer() { // from class: fa.q0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f52918b.i2((Integer) obj);
            }
        });
        ((VIDEOPLAYDETAILVIEWMODEL) this.f39698d).f41395g0.observe(this, new Observer() { // from class: fa.r0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f52920b.j2((Integer) obj);
            }
        });
        ((VIDEOPLAYDETAILVIEWMODEL) this.f39698d).f41397h0.observe(this, new Observer() { // from class: fa.w
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f52929b.p1((Void) obj);
            }
        });
        ((VIDEOPLAYDETAILVIEWMODEL) this.f39698d).b0().observe(this, new Observer() { // from class: fa.h0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f52900b.q1((Boolean) obj);
            }
        });
        ((VIDEOPLAYDETAILVIEWMODEL) this.f39698d).c0().observe(this, new Observer() { // from class: fa.s0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f52922b.r1((Boolean) obj);
            }
        });
        ((VIDEOPLAYDETAILVIEWMODEL) this.f39698d).d0().observe(this, new Observer() { // from class: fa.t0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f52924b.s1((Boolean) obj);
            }
        });
        ((VIDEOPLAYDETAILVIEWMODEL) this.f39698d).f41383a0.observe(this, new Observer() { // from class: fa.u0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f52926b.t1((RecommandVideosEntity) obj);
            }
        });
        ((VIDEOPLAYDETAILVIEWMODEL) this.f39698d).F.observe(this, new Observer() { // from class: fa.v0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f52928b.u1((Integer) obj);
            }
        });
        ((VIDEOPLAYDETAILVIEWMODEL) this.f39698d).f41385b0.observe(this, new Observer() { // from class: fa.w0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f52930b.v1((Integer) obj);
            }
        });
        k(tl.a.a().d(f0.class).subscribe(new oi.g() { // from class: fa.x0
            @Override // oi.g
            public final void accept(Object obj) throws Exception {
                this.f52932b.w1((x9.f0) obj);
            }
        }));
        k(tl.a.a().d(x9.c.class).subscribe(new oi.g() { // from class: fa.b
            @Override // oi.g
            public final void accept(Object obj) throws Exception {
                this.f52887b.x1((x9.c) obj);
            }
        }));
        k(tl.a.a().d(x9.o.class).subscribe(new oi.g() { // from class: fa.c
            @Override // oi.g
            public final void accept(Object obj) throws Exception {
                this.f52889b.y1((x9.o) obj);
            }
        }));
        ((VIDEOPLAYDETAILVIEWMODEL) this.f39698d).U.observe(this, new Observer() { // from class: fa.e
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f52893b.A1((Void) obj);
            }
        });
        ((VIDEOPLAYDETAILVIEWMODEL) this.f39698d).Z.observe(this, new Observer() { // from class: fa.f
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f52895b.B1((Void) obj);
            }
        });
        ((VIDEOPLAYDETAILVIEWMODEL) this.f39698d).f41408n.observe(this, new Observer() { // from class: fa.g
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f52897b.C1((Integer) obj);
            }
        });
        ((VIDEOPLAYDETAILVIEWMODEL) this.f39698d).V.observe(this, new Observer() { // from class: fa.h
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f52899b.D1((Void) obj);
            }
        });
        ((VIDEOPLAYDETAILVIEWMODEL) this.f39698d).W.observe(this, new Observer() { // from class: fa.i
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f52901b.E1((Void) obj);
            }
        });
        ((VIDEOPLAYDETAILVIEWMODEL) this.f39698d).X.observe(this, new Observer() { // from class: fa.j
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f52903b.F1((Void) obj);
            }
        });
        ((VIDEOPLAYDETAILVIEWMODEL) this.f39698d).Y.observe(this, new Observer() { // from class: fa.k
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f52905b.G1((Void) obj);
            }
        });
        k(tl.a.a().d(x9.v.class).subscribe(new oi.g() { // from class: fa.m
            @Override // oi.g
            public final void accept(Object obj) throws Exception {
                this.f52909b.H1((x9.v) obj);
            }
        }));
        ((VIDEOPLAYDETAILVIEWMODEL) this.f39698d).R.observe(this, new Observer() { // from class: fa.n
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f52911b.I1((View) obj);
            }
        });
        ((VIDEOPLAYDETAILVIEWMODEL) this.f39698d).T.observe(this, new Observer() { // from class: fa.o
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f52913b.J1((Void) obj);
            }
        });
        ((VIDEOPLAYDETAILVIEWMODEL) this.f39698d).P.observe(this, new Observer() { // from class: fa.q
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f52917b.L1((Void) obj);
            }
        });
        ((VIDEOPLAYDETAILVIEWMODEL) this.f39698d).Q.observe(this, new Observer() { // from class: fa.r
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f52919b.M1((Void) obj);
            }
        });
        k(tl.a.a().d(c0.class).subscribe(new oi.g() { // from class: fa.s
            @Override // oi.g
            public final void accept(Object obj) throws Exception {
                this.f52921b.N1((x9.c0) obj);
            }
        }));
        ((VIDEOPLAYDETAILVIEWMODEL) this.f39698d).f41389d0.observe(this, new Observer() { // from class: fa.t
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f52923b.O1((List) obj);
            }
        });
        ((VIDEOPLAYDETAILVIEWMODEL) this.f39698d).f41391e0.observe(this, new Observer() { // from class: fa.u
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f52925b.P1((String) obj);
            }
        });
        ((VIDEOPLAYDETAILVIEWMODEL) this.f39698d).V0.observe(this, new Observer() { // from class: fa.v
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f52927b.Q1((Boolean) obj);
            }
        });
        ((VIDEOPLAYDETAILVIEWMODEL) this.f39698d).Y0.observe(this, new Observer() { // from class: fa.x
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f52931b.R1((Boolean) obj);
            }
        });
        ((VIDEOPLAYDETAILVIEWMODEL) this.f39698d).Z0.observe(this, new Observer() { // from class: fa.y
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f52933b.S1((Void) obj);
            }
        });
        k(tl.a.a().d(h0.class).subscribe(new oi.g() { // from class: fa.z
            @Override // oi.g
            public final void accept(Object obj) throws Exception {
                this.f52934b.T1((x9.h0) obj);
            }
        }));
        k(tl.a.a().d(x9.d.class).subscribe(new oi.g() { // from class: fa.a0
            @Override // oi.g
            public final void accept(Object obj) throws Exception {
                this.f52886b.U1((x9.d) obj);
            }
        }));
        k(tl.a.a().d(x9.e.class).subscribe(new oi.g() { // from class: fa.c0
            @Override // oi.g
            public final void accept(Object obj) throws Exception {
                this.f52890b.W1((x9.e) obj);
            }
        }));
        k(tl.a.a().d(x9.f.class).subscribe(new oi.g() { // from class: fa.d0
            @Override // oi.g
            public final void accept(Object obj) throws Exception {
                this.f52892b.X1((x9.f) obj);
            }
        }));
        k(tl.a.a().d(x9.i.class).subscribe(new oi.g() { // from class: fa.e0
            @Override // oi.g
            public final void accept(Object obj) throws Exception {
                this.f52894b.Y1((x9.i) obj);
            }
        }));
        k(tl.a.a().d(x9.g0.class).subscribe(new oi.g() { // from class: fa.f0
            @Override // oi.g
            public final void accept(Object obj) throws Exception {
                this.f52896b.Z1((x9.g0) obj);
            }
        }));
        k(tl.a.a().d(x9.b.class).subscribe(new oi.g() { // from class: fa.g0
            @Override // oi.g
            public final void accept(Object obj) throws Exception {
                this.f52898b.a2((x9.b) obj);
            }
        }));
        ((VIDEOPLAYDETAILVIEWMODEL) this.f39698d).f41387c0.observe(this, new Observer() { // from class: fa.i0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f52902b.b2((VideoShareDataEntry) obj);
            }
        });
        ((VIDEOPLAYDETAILVIEWMODEL) this.f39698d).f41402k.observe(this, new Observer() { // from class: fa.j0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f52904b.c2((String) obj);
            }
        });
        ((VIDEOPLAYDETAILVIEWMODEL) this.f39698d).f41427w0.observe(this, new Observer() { // from class: fa.k0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f52906b.d2((Integer) obj);
            }
        });
        k(tl.a.a().d(e0.class).subscribe(new oi.g() { // from class: fa.l0
            @Override // oi.g
            public final void accept(Object obj) throws Exception {
                this.f52908b.e2((x9.e0) obj);
            }
        }));
    }

    public final void l2(int i10) {
        int i11;
        if (!o0.z() && AppApplication.adInfoEntry.getAd_position_21() != null && AppApplication.adInfoEntry.getAd_position_21().size() > 0) {
            List<AdInfoDetailEntry> ad_position_21 = AppApplication.adInfoEntry.getAd_position_21();
            int num = AdNumShowDao.getInstance().getNum(108);
            if (num >= ad_position_21.size() - 1) {
                i11 = 0;
            } else {
                i11 = num + 1;
            }
            if (o0.h() == 1) {
                loadClingAdType(ad_position_21, this, i11, false);
                return;
            } else {
                loadClingAdType(ad_position_21, this, i11, true);
                return;
            }
        }
        if (i10 == 1) {
            LeLinkHorizalPop();
        } else {
            LelinkPop();
        }
    }

    public void loadAdFloatAdOnce(List<AdInfoDetailEntry> list, int i10) {
        AdInfoDetailEntry adInfoDetailEntry = list.get(i10);
        if (adInfoDetailEntry.getAd_source_id() == 2) {
            if (adInfoDetailEntry.getNum() > 0) {
                if (adInfoDetailEntry.getNum() > AdNumShowDao.getInstance().getNum(103)) {
                    AdNumShowDao.getInstance().updateFloatAdIndexNum(i10);
                    loadFloatAdWX(adInfoDetailEntry);
                    return;
                } else {
                    int i11 = i10 + 1;
                    if (i11 == list.size()) {
                        i11 = 0;
                    }
                    loadAdFloatAdOnce(list, i11);
                    return;
                }
            }
            AdNumShowDao.getInstance().updateFloatAdIndexNum(i10);
            loadFloatAdWX(adInfoDetailEntry);
        }
    }

    public void loadAdPlayInfoOnce(List<AdInfoDetailEntry> list, int i10) {
        AdInfoDetailEntry adInfoDetailEntry = list.get(i10);
        this.K0 = adInfoDetailEntry;
        if (adInfoDetailEntry.getAd_source_id() == 2) {
            if (this.K0.getNum() > 0) {
                if (this.K0.getNum() > AdNumShowDao.getInstance().getNum(12)) {
                    AdNumShowDao.getInstance().updatePlayInfoIndex(i10);
                    loadAdWX(this.K0);
                    return;
                } else {
                    int i11 = i10 + 1;
                    if (i11 == list.size()) {
                        i11 = 0;
                    }
                    loadAdPlayInfoOnce(list, i11);
                    return;
                }
            }
            AdNumShowDao.getInstance().updatePlayInfoIndex(i10);
            loadAdWX(this.K0);
        }
    }

    public void loadAdWX(AdInfoDetailEntry adInfoDetailEntry) {
        AdNumShowDao.getInstance().updatePlayInfoTdNum(AdNumShowDao.getInstance().getNum(12) + 1);
        ta.c cVar = new ta.c(this);
        this.G = cVar;
        cVar.a(((ActivityVideoPlayDetailBinding) this.f39697c).f40010s, adInfoDetailEntry);
        sa.c.c(7, adInfoDetailEntry.getAd_type(), adInfoDetailEntry.getAd_source_id(), 8, adInfoDetailEntry.getAd_id(), 1, 0, 0);
        this.G.c(new n(adInfoDetailEntry));
    }

    public void loadClingAdType(List<AdInfoDetailEntry> list, Activity activity, int i10, boolean z10) {
        AdInfoDetailEntry adInfoDetailEntry = list.get(i10);
        if (adInfoDetailEntry.getAd_source_id() == 2) {
            if (adInfoDetailEntry.getNum() > 0) {
                if (adInfoDetailEntry.getNum() > AdNumShowDao.getInstance().getNum(109)) {
                    loadClingAdWx(activity, adInfoDetailEntry, i10, z10);
                    return;
                }
                int i11 = i10 + 1;
                if (i11 == list.size()) {
                    i11 = 0;
                }
                loadClingAdType(list, activity, i11, z10);
                return;
            }
            loadClingAdWx(activity, adInfoDetailEntry, i10, z10);
        }
    }

    public void loadClingAdWx(Activity activity, AdInfoDetailEntry adInfoDetailEntry, int i10, boolean z10) {
        AdNumShowDao.getInstance().updateClingRewardIndex(i10);
        ta.h hVar = new ta.h(activity, adInfoDetailEntry);
        a0.b(hVar, this.S, adInfoDetailEntry, new hb.a(this, hVar), this, this.f41917i.getId(), this.B);
    }

    public final void m1(RecommandVideosEntity recommandVideosEntity) {
        long jD;
        this.D = recommandVideosEntity.getAudio_type();
        if (o0.j() == 1 || recommandVideosEntity.getHide_ad() == 1) {
            findViewById(R.id.video_top_ad).setVisibility(0);
        }
        if (!o0.z() && !o0.G().equals("none")) {
            this.f41908a0.setVisibility(0);
            this.f41910c0.setVisibility(0);
        } else {
            this.f41908a0.setVisibility(8);
            this.f41910c0.setVisibility(8);
        }
        this.f41915h.l0(recommandVideosEntity.getVod_duration_free());
        ((VIDEOPLAYDETAILVIEWMODEL) this.f39698d).Q0(recommandVideosEntity.getType_pid(), recommandVideosEntity.getVod_tag(), recommandVideosEntity.getVod_area());
        if (recommandVideosEntity.getVod_collection() != null && recommandVideosEntity.getVod_collection().size() > 0) {
            List<VideoBean> vod_collection = recommandVideosEntity.getVod_collection();
            this.f41919j = vod_collection;
            if (vod_collection.size() > 0) {
                for (VideoBean videoBean : this.f41919j) {
                    videoBean.setOrginal_url(videoBean.getVod_url());
                    if (videoBean.is_p2p() == 1) {
                        videoBean.setVod_url(sa.e.B(videoBean.getVod_url()));
                    }
                }
                if (recommandVideosEntity.getType_pid() != 1 && recommandVideosEntity.getType_pid() != 2 && recommandVideosEntity.getType_pid() != 4) {
                    if (recommandVideosEntity.getType_pid() == 3) {
                        ((VIDEOPLAYDETAILVIEWMODEL) this.f39698d).f41432z.set(Boolean.TRUE);
                        ((VIDEOPLAYDETAILVIEWMODEL) this.f39698d).f41430y.set(Boolean.FALSE);
                        VideoLookHistoryEntry videoLookHistoryEntry = this.E;
                        if (videoLookHistoryEntry != null) {
                            int current = videoLookHistoryEntry.getCurrent();
                            this.C = current;
                            if (current >= this.f41919j.size()) {
                                this.C = this.f41919j.size() - 1;
                            }
                            this.B = this.f41919j.get(this.C).getCollection();
                            ((VIDEOPLAYDETAILVIEWMODEL) this.f39698d).R0(this.f41919j, this.E.getCurrent(), recommandVideosEntity.getVod_pic());
                            this.f41915h.c0(this.E.getContentPosition());
                        } else {
                            this.B = this.f41919j.get(0).getCollection();
                            ((VIDEOPLAYDETAILVIEWMODEL) this.f39698d).R0(this.f41919j, 0, recommandVideosEntity.getVod_pic());
                        }
                        ((ActivityVideoPlayDetailBinding) this.f39697c).f39993b.setTitle(recommandVideosEntity.getVod_name() + Z7.f27998r + this.f41919j.get(this.C).getTitle());
                    } else {
                        ObservableField<Boolean> observableField = ((VIDEOPLAYDETAILVIEWMODEL) this.f39698d).f41432z;
                        Boolean bool = Boolean.FALSE;
                        observableField.set(bool);
                        ((VIDEOPLAYDETAILVIEWMODEL) this.f39698d).f41430y.set(bool);
                    }
                } else {
                    ((VIDEOPLAYDETAILVIEWMODEL) this.f39698d).f41430y.set(Boolean.TRUE);
                    ((VIDEOPLAYDETAILVIEWMODEL) this.f39698d).f41432z.set(Boolean.FALSE);
                    VideoLookHistoryEntry videoLookHistoryEntry2 = this.E;
                    if (videoLookHistoryEntry2 != null) {
                        int current2 = videoLookHistoryEntry2.getCurrent();
                        this.C = current2;
                        if (current2 >= this.f41919j.size()) {
                            this.C = this.f41919j.size() - 1;
                        }
                        this.B = this.f41919j.get(this.C).getCollection();
                        ((VIDEOPLAYDETAILVIEWMODEL) this.f39698d).T0(this.f41919j, this.E.getCurrent());
                        this.f41915h.c0(this.E.getContentPosition());
                    } else {
                        this.B = this.f41919j.get(0).getCollection();
                        ((VIDEOPLAYDETAILVIEWMODEL) this.f39698d).T0(this.f41919j, 0);
                    }
                    ((ActivityVideoPlayDetailBinding) this.f39697c).f39993b.setTitle(recommandVideosEntity.getVod_name() + Z7.f27998r + this.f41919j.get(this.C).getTitle());
                }
            }
            if (!this.f41928n0) {
                ((VIDEOPLAYDETAILVIEWMODEL) this.f39698d).K0(this.A, this.B);
                this.f41928n0 = true;
            }
            ((VIDEOPLAYDETAILVIEWMODEL) this.f39698d).M0(true, this.A);
            this.f41915h.Z(this.f41919j.get(this.C).getVod_url());
            if (VideoShareDao.getInstance().isExist(this.A)) {
                recommandVideosEntity.set_share(0);
            }
            if (recommandVideosEntity.is_share() == 1 && o0.L() == 1) {
                this.f41915h.h0();
            } else {
                sa.e.a();
                if (!o0.z() && o0.H() < o0.C()) {
                    if (VideoAdLookDao.getInstance().isExist(this.A + "" + this.B)) {
                        if (o0.Q() == 0) {
                            if (AppApplication.adInfoEntry.getAd_position_13() != null && AppApplication.adInfoEntry.getAd_position_13().size() > 0) {
                                long jX = o0.X();
                                if (o0.d() > 0) {
                                    jD = o0.d();
                                } else {
                                    jD = 3600000;
                                }
                                if (jX > jD) {
                                    if (o0.h() == 1) {
                                        loadAdPlay(false, false, this, ((ActivityVideoPlayDetailBinding) this.f39697c).f39993b, this.A, this.B, this.Z, this.J0, this.f41915h);
                                    } else {
                                        loadAdPlay(false, true, this, ((ActivityVideoPlayDetailBinding) this.f39697c).f39993b, this.A, this.B, this.Z, this.J0, this.f41915h);
                                    }
                                } else {
                                    this.f41915h.h0();
                                }
                            } else {
                                this.f41915h.h0();
                            }
                        } else if (o0.h() == 1) {
                            enterLoadAd();
                        } else {
                            enterLoadAdNew();
                        }
                    } else if (this.f41919j.get(this.C).is_ad() == 1) {
                        noChangeAd();
                    } else if (o0.h() == 1) {
                        enterLoadAd();
                    } else {
                        enterLoadAdNew();
                    }
                } else {
                    this.f41915h.h0();
                }
            }
            this.f41915h.w(new a());
            this.f41915h.v(new b());
            ((ActivityVideoPlayDetailBinding) this.f39697c).f39993b.getPlaybackControlView().y(new c());
        }
    }

    public final void n2(View view) {
        PopLayoutVideoSeasonItemBinding popLayoutVideoSeasonItemBinding = (PopLayoutVideoSeasonItemBinding) DataBindingUtil.inflate(LayoutInflater.from(em.r.a()), R.layout.pop_layout_video_season_item, null, false);
        popLayoutVideoSeasonItemBinding.a((VIDEOPLAYDETAILVIEWMODEL) this.f39698d);
        if (this.A0 == null) {
            this.A0 = new PopupWindow(popLayoutVideoSeasonItemBinding.getRoot(), -2, -2, true);
        }
        this.A0.setFocusable(true);
        this.A0.showAsDropDown(view, 0, 0, 80);
    }

    public void noChangeAd() {
        if (o0.h() == 1) {
            if (((ActivityVideoPlayDetailBinding) this.f39697c).f39993b.getAdRewardVisibilty()) {
                return;
            }
            loadAdPlay(false, false, this, ((ActivityVideoPlayDetailBinding) this.f39697c).f39993b, this.A, this.B, this.Z, this.J0, this.f41915h);
            return;
        }
        loadAdPlay(false, true, this, ((ActivityVideoPlayDetailBinding) this.f39697c).f39993b, this.A, this.B, this.Z, this.J0, this.f41915h);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        t.a aVar = this.f41915h;
        if (aVar != null && aVar.I()) {
            finish();
        }
        jl.f fVar = this.H0;
        if (fVar != null) {
            fVar.release();
            this.H0 = null;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.exo_player_restart_id /* 2131362294 */:
                sa.e.z(this);
                break;
            case R.id.icFast /* 2131362435 */:
                if (this.f41915h.z() + 10000 <= this.f41915h.A() && s.e.k(this)) {
                    t.a aVar = this.f41915h;
                    aVar.V(aVar.z() + 10000);
                    break;
                }
                break;
            case R.id.icRetreat /* 2131362436 */:
                if (this.f41915h.z() - 10000 >= 0 && s.e.k(this)) {
                    t.a aVar2 = this.f41915h;
                    aVar2.V(aVar2.z() - 10000);
                    break;
                }
                break;
            case R.id.iv_back /* 2131362713 */:
                finish();
                break;
            case R.id.iv_barrage /* 2131362715 */:
                if (this.O.getTag().equals("select")) {
                    this.O.setImageResource(R.drawable.ic_video_detail_danmu);
                    this.Z.setVisibility(8);
                    this.O.setTag("unSelect");
                    this.P.setImageResource(R.drawable.ic_video_detail_danmu);
                    this.P.setVisibility(8);
                    this.P.setTag("unSelect");
                    jl.f fVar = this.H0;
                    if (fVar != null) {
                        fVar.hide();
                    }
                } else {
                    this.O.setImageResource(R.drawable.ic_video_detail_danmu_open);
                    this.Z.setVisibility(0);
                    this.O.setTag("select");
                    this.P.setImageResource(R.drawable.ic_video_detail_danmu_open);
                    this.Q.setVisibility(8);
                    this.P.setTag("select");
                    jl.f fVar2 = this.H0;
                    if (fVar2 != null) {
                        fVar2.show();
                    }
                }
                break;
            case R.id.iv_barrage_horizontal /* 2131362716 */:
                if (this.P.getTag().equals("select")) {
                    this.P.setImageResource(R.drawable.ic_video_detail_danmu);
                    this.Q.setVisibility(8);
                    this.P.setTag("unSelect");
                    this.O.setImageResource(R.drawable.ic_video_detail_danmu);
                    this.Z.setVisibility(8);
                    this.O.setTag("unSelect");
                    jl.f fVar3 = this.H0;
                    if (fVar3 != null) {
                        fVar3.hide();
                    }
                } else {
                    if (!this.f41928n0) {
                        ((VIDEOPLAYDETAILVIEWMODEL) this.f39698d).K0(this.A, this.B);
                        this.f41928n0 = true;
                    }
                    this.P.setImageResource(R.drawable.ic_video_detail_danmu_open);
                    this.Q.setVisibility(0);
                    this.P.setTag("select");
                    this.O.setImageResource(R.drawable.ic_video_detail_danmu_open);
                    this.Z.setVisibility(0);
                    this.O.setTag("select");
                    jl.f fVar4 = this.H0;
                    if (fVar4 != null) {
                        fVar4.show();
                    }
                }
                break;
            case R.id.iv_barrage_write_horizontal /* 2131362717 */:
                BarrageHorizonalDialog barrageHorizonalDialog = new BarrageHorizonalDialog(this);
                this.f41951z = barrageHorizonalDialog;
                barrageHorizonalDialog.show();
                this.f41951z.i(new g());
                break;
            case R.id.iv_exo_next /* 2131362728 */:
                if (this.f41915h != null) {
                    loadVideoNext();
                }
                break;
            case R.id.iv_lelink_horizontal /* 2131362742 */:
                if (!this.f41915h.F().getAdRewardVisibilty()) {
                    l2(1);
                }
                break;
            case R.id.iv_lelink_varical /* 2131362743 */:
                if (!this.f41915h.F().getAdRewardVisibilty()) {
                    l2(0);
                }
                break;
            case R.id.iv_video_more /* 2131362772 */:
                com.mgs.carparking.widgets.dialog.f fVar5 = new com.mgs.carparking.widgets.dialog.f(this, this, this.f41917i, (VIDEOPLAYDETAILVIEWMODEL) this.f39698d, ((ActivityVideoPlayDetailBinding) this.f39697c).f39993b, this.f41933q, this.B, this.f41919j.get(this.C).getTitle());
                this.f41931p = fVar5;
                fVar5.showAtLocation(((ActivityVideoPlayDetailBinding) this.f39697c).f40003l, 5, 0, 0);
                break;
            case R.id.ll_audio_subtitle /* 2131362820 */:
                if (this.f41929o == null) {
                    com.mgs.carparking.widgets.dialog.b bVar = new com.mgs.carparking.widgets.dialog.b(this, this.f41915h, this.B0, this.C0);
                    this.f41929o = bVar;
                    bVar.b(new d());
                }
                this.f41929o.showAtLocation(((ActivityVideoPlayDetailBinding) this.f39697c).f40003l, 5, 0, 0);
                break;
            case R.id.ll_set_num /* 2131362837 */:
                if (this.f41919j != null) {
                    if (this.f41917i.getType_pid() != 1 && this.f41917i.getType_pid() != 2 && this.f41917i.getType_pid() != 4) {
                        if (this.f41917i.getType_pid() == 3) {
                            com.mgs.carparking.widgets.dialog.e eVar = new com.mgs.carparking.widgets.dialog.e(this, this.f41919j, this.f41917i.getCoverUrl(), this.f41917i.getVod_name(), ((VIDEOPLAYDETAILVIEWMODEL) this.f39698d).A.get().intValue());
                            this.f41939t = eVar;
                            eVar.showAtLocation(((ActivityVideoPlayDetailBinding) this.f39697c).f40006o, 5, 0, 0);
                        }
                    } else {
                        com.mgs.carparking.widgets.dialog.d dVar = new com.mgs.carparking.widgets.dialog.d(this, this.f41919j, ((VIDEOPLAYDETAILVIEWMODEL) this.f39698d).A.get().intValue());
                        this.f41937s = dVar;
                        dVar.showAtLocation(((ActivityVideoPlayDetailBinding) this.f39697c).f40006o, 5, 0, 0);
                    }
                }
                break;
            case R.id.rl_speed /* 2131363413 */:
                if (this.f41927n == null) {
                    this.f41927n = new com.mgs.carparking.widgets.dialog.g(this, this.f41915h, this.X);
                }
                this.f41927n.showAtLocation(((ActivityVideoPlayDetailBinding) this.f39697c).f40003l, 5, 0, 0);
                break;
            case R.id.tv_barrage /* 2131363669 */:
                BarrageDialog barrageDialog = new BarrageDialog(this, this);
                this.f41947x = barrageDialog;
                barrageDialog.show();
                t.a aVar3 = this.f41915h;
                if (aVar3 != null && aVar3.D() != null) {
                    this.f41915h.D().setPlayWhenReady(false);
                }
                this.f41947x.setOnDismissListener(new e());
                this.f41947x.i(new f());
                break;
            case R.id.tv_openvip_horizontal /* 2131363715 */:
                ((VIDEOPLAYDETAILVIEWMODEL) this.f39698d).Z.call();
                break;
        }
    }

    @Override // com.mgs.carparking.app.BaseActivity, com.trello.rxlifecycle2.components.support.RxAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        em.l.d(this, false, R.color.black);
        this.f41914g0 = (AudioManager) getSystemService("audio");
    }

    @Override // com.mgs.carparking.app.BaseActivity, com.trello.rxlifecycle2.components.support.RxAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        t.a aVar = this.f41915h;
        if (aVar != null) {
            if (aVar.F() != null) {
                if (!((ActivityVideoPlayDetailBinding) this.f39697c).f39993b.getLeLinkVisibilty() && MainActivity.mClingPlayControl == null) {
                    tl.a.a().b(new x9.y());
                }
                this.f41915h.F().K();
            }
            this.f41915h.K();
        }
        g0 g0Var = this.f41940t0;
        if (g0Var != null) {
            g0Var.b();
            this.f41940t0 = null;
        }
        jl.f fVar = this.H0;
        if (fVar != null) {
            fVar.release();
            this.H0 = null;
        }
        if (this.f41921k != null) {
            this.f41921k = null;
        }
        if (this.f41939t != null) {
            this.f41939t = null;
        }
        if (this.f41937s != null) {
            this.f41937s = null;
        }
        if (this.f41929o != null) {
            this.f41929o = null;
        }
        com.mgs.carparking.widgets.dialog.f fVar2 = this.f41931p;
        if (fVar2 != null) {
            if (fVar2.f42689w != null) {
                fVar2.f42689w = null;
            }
            this.f41931p = null;
        }
        if (this.f41927n != null) {
            this.f41927n = null;
        }
        if (this.f41925m != null) {
            this.f41925m = null;
        }
        if (this.f41923l != null) {
            this.f41921k = null;
        }
        if (this.A0 != null) {
            this.A0 = null;
        }
        if (this.f41943v != null) {
            this.f41943v = null;
        }
        com.mgs.carparking.widgets.dialog.l lVar = this.f41945w;
        if (lVar != null) {
            lVar.f42833t.removeCallbacks(null);
            this.f41945w = null;
        }
        if (this.f41941u != null) {
            this.f41941u = null;
        }
        if (this.f41951z != null) {
            this.f41951z = null;
        }
        if (this.f41947x != null) {
            this.f41947x = null;
        }
        if (this.f41949y != null) {
            this.f41949y = null;
        }
        Handler handler = this.J0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.J0 = null;
        }
        if (this.f41936r0 != null) {
            this.f41936r0 = null;
        }
        if (this.f41938s0 != null) {
            this.f41938s0 = null;
        }
        if (this.f41942u0 != null) {
            this.f41942u0 = null;
        }
        if (this.f41944v0 != null) {
            this.f41944v0 = null;
        }
        if (this.f41924l0 != null) {
            this.f41924l0 = null;
        }
        ClingDeviceDialog clingDeviceDialog = this.P0;
        if (clingDeviceDialog != null) {
            clingDeviceDialog.i();
            this.P0 = null;
        }
        com.mgs.carparking.widgets.dialog.a aVar2 = this.Q0;
        if (aVar2 != null) {
            aVar2.f();
            this.Q0 = null;
        }
        try {
            w.a.f73245b.s(this);
        } catch (Exception unused) {
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // com.trello.rxlifecycle2.components.support.RxAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        insertHistory();
        if (this.f41915h != null) {
            if (!((ActivityVideoPlayDetailBinding) this.f39697c).f39993b.getAdRewardVisibilty()) {
                this.f41915h.L();
            }
            g0 g0Var = this.f41940t0;
            if (g0Var != null) {
                g0Var.b();
                this.f41940t0 = null;
            }
        }
        jl.f fVar = this.H0;
        if (fVar != null && fVar.c()) {
            this.H0.pause();
        }
    }

    @Override // com.trello.rxlifecycle2.components.support.RxAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        Log.i("aaaaaaaaaaa", "onResume---------" + this.F0);
        this.f41914g0.requestAudioFocus(null, 3, 1);
        if (!this.F0) {
            if (this.f41915h != null && ((o0.L() != 1 || !((ActivityVideoPlayDetailBinding) this.f39697c).f39993b.getShareStateVisibilty()) && !((ActivityVideoPlayDetailBinding) this.f39697c).f39993b.getAdRewardVisibilty())) {
                this.f41915h.M();
                if (this.f41940t0 == null) {
                    lookAdArrivalTime();
                }
                RelativeLayout relativeLayout = this.f41922k0;
                if (relativeLayout != null) {
                    relativeLayout.removeAllViews();
                    this.f41922k0.setVisibility(8);
                }
            }
            jl.f fVar = this.H0;
            if (fVar != null && fVar.c() && this.H0.isPaused()) {
                this.H0.resume();
            }
        }
    }

    @Override // com.trello.rxlifecycle2.components.support.RxAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        this.f41930o0 = System.currentTimeMillis();
    }

    @Override // com.trello.rxlifecycle2.components.support.RxAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        if (System.currentTimeMillis() - this.f41930o0 >= 10000) {
            o0.i1((System.currentTimeMillis() - this.f41930o0) + o0.X());
            t.a aVar = this.f41915h;
            if (aVar != null && aVar.D() != null && this.f41915h.D().getContentPosition() > 0) {
                ((VIDEOPLAYDETAILVIEWMODEL) this.f39698d).d1(this.A, this.B, (int) (this.f41915h.D().getContentPosition() / 1000), (int) ((System.currentTimeMillis() - this.f41930o0) / 1000), (int) (this.f41915h.D().getDuration() / 1000));
            }
        }
    }

    public void selectLoadAd() {
        if (o0.x() != 0 && (System.currentTimeMillis() - this.f41930o0) + o0.X() < o0.k()) {
            clearAd();
            o2();
        } else {
            if (((ActivityVideoPlayDetailBinding) this.f39697c).f39993b.getAdRewardVisibilty()) {
                return;
            }
            loadAdPlay(false, false, this, ((ActivityVideoPlayDetailBinding) this.f39697c).f39993b, this.A, this.B, this.Z, this.J0, this.f41915h);
        }
    }

    public void selectLoadAdNew() {
        if (o0.x() != 0 && (System.currentTimeMillis() - this.f41930o0) + o0.X() < o0.k()) {
            clearAd();
            o2();
        } else {
            loadAdPlay(false, true, this, ((ActivityVideoPlayDetailBinding) this.f39697c).f39993b, this.A, this.B, this.Z, this.J0, this.f41915h);
        }
    }
}
