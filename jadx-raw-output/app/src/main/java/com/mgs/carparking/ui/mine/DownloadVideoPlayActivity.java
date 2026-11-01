package com.mgs.carparking.ui.mine;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.Nullable;
import chuangyuan.ycj.videolibrary.widget.VideoPlayerView;
import com.fvvcl.flickverse.R;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.mgs.carparking.app.AppApplication;
import com.mgs.carparking.app.BaseActivity;
import com.mgs.carparking.databinding.ActivityDownloadVideoPlayBinding;
import com.mgs.carparking.db.AdNumShowDao;
import com.mgs.carparking.db.VideoAdLookDao;
import com.mgs.carparking.db.VideoLookHistoryDao;
import com.mgs.carparking.dbtable.VideoDownloadEntity;
import com.mgs.carparking.dbtable.VideoLookHistoryEntry;
import com.mgs.carparking.model.DOWNLOADVIDEOPLAYVIEWMODEL;
import com.mgs.carparking.netbean.AdInfoDetailEntry;
import com.mgs.carparking.widgets.dialog.g;
import em.o;
import em.p;
import em.r;
import gb.l;
import java.util.ArrayList;
import java.util.List;
import me.goldze.mvvmhabit.base.BaseApplication;
import q.j;
import q.k;
import sa.a0;
import sa.o0;
import ta.h;
import x9.f0;

/* JADX INFO: loaded from: classes6.dex */
public class DownloadVideoPlayActivity extends BaseActivity<ActivityDownloadVideoPlayBinding, DOWNLOADVIDEOPLAYVIEWMODEL> implements View.OnClickListener {
    public com.mgs.carparking.widgets.dialog.downloadcomplete.b A;
    public h F;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public t.a f42041h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ProgressBar f42042i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ProgressBar f42043j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ImageView f42044k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ImageView f42045l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public com.mgs.carparking.widgets.dialog.b f42046m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public VideoDownloadEntity f42047n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public VideoLookHistoryEntry f42048o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f42049p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public LinearLayout f42050q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public LinearLayout f42051r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public LinearLayout f42052s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public TextView f42053t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ImageView f42054u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public TextView f42055v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public g f42056w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ImageView f42057x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public l f42058y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public com.mgs.carparking.widgets.dialog.downloadcomplete.a f42059z;
    public List<VideoDownloadEntity> list = new ArrayList();
    public int B = 0;
    public String C = "";
    public String D = "";
    public Handler E = new Handler();
    public long G = System.currentTimeMillis();

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DownloadVideoPlayActivity.this.finish();
        }
    }

    public class b implements q.h {
        public b() {
        }

        @Override // q.h
        public void a(int i10) {
            ((ActivityDownloadVideoPlayBinding) DownloadVideoPlayActivity.this.f39697c).f39778b.getGestureFastForwardLayout().setVisibility(0);
            DownloadVideoPlayActivity downloadVideoPlayActivity = DownloadVideoPlayActivity.this;
            ib.d.b(downloadVideoPlayActivity, R.drawable.ic_video_fast, downloadVideoPlayActivity.f42044k, true);
            DownloadVideoPlayActivity.this.f42041h.a0(2.0f, 1.0f);
        }
    }

    public class c implements j {
        public c() {
        }

        @Override // q.j
        public void a(int i10, int i11) {
            ((ActivityDownloadVideoPlayBinding) DownloadVideoPlayActivity.this.f39697c).f39778b.getGestureAudioLayout().setVisibility(0);
            DownloadVideoPlayActivity.this.f42042i.setMax(i10);
            DownloadVideoPlayActivity.this.f42042i.setProgress(i11);
        }
    }

    public class d implements q.g {
        public d() {
        }

        @Override // q.g
        public void b(int i10, int i11) {
            ((ActivityDownloadVideoPlayBinding) DownloadVideoPlayActivity.this.f39697c).f39778b.getGestureBrightnessLayout().setVisibility(0);
            DownloadVideoPlayActivity.this.f42043j.setMax(i10);
            DownloadVideoPlayActivity.this.f42043j.setProgress(i11);
        }
    }

    public class e implements k {
        @Override // q.k
        public void b(@Nullable ExoPlaybackException exoPlaybackException) {
        }

        @Override // q.k
        public void c() {
        }

        @Override // q.k
        public void e(boolean z10) {
        }

        public e() {
        }

        @Override // q.k
        public void a(long j10) {
            DefaultTrackSelector defaultTrackSelector = (DefaultTrackSelector) DownloadVideoPlayActivity.this.f42041h.D().Q();
            com.google.android.exoplayer2.trackselection.b.a aVarG = defaultTrackSelector.g();
            if (aVarG != null) {
                for (int i10 = 0; i10 < aVarG.c(); i10++) {
                    TrackGroupArray trackGroupArrayE = aVarG.e(i10);
                    if (1 == aVarG.d(i10)) {
                        for (int i11 = 0; i11 < trackGroupArrayE.f19435b; i11++) {
                            TrackGroup trackGroupA = trackGroupArrayE.a(i11);
                            Log.d("checkAudio", trackGroupA.a(0).toString());
                            if (i11 == 0 && DownloadVideoPlayActivity.this.C.equals("") && !o.b(trackGroupA.a(0).B)) {
                                DownloadVideoPlayActivity.this.C = trackGroupA.a(0).B;
                            }
                        }
                    } else if (3 == aVarG.d(i10)) {
                        for (int i12 = 0; i12 < trackGroupArrayE.f19435b; i12++) {
                            TrackGroup trackGroupA2 = trackGroupArrayE.a(i12);
                            Log.d("checkSubTitle", trackGroupA2.a(0).toString());
                            if (i12 == 0 && DownloadVideoPlayActivity.this.D.equals("") && !o.b(trackGroupA2.a(0).B)) {
                                DownloadVideoPlayActivity.this.D = trackGroupA2.a(0).B;
                            }
                        }
                    }
                }
            }
            defaultTrackSelector.L(defaultTrackSelector.v().f().j(DownloadVideoPlayActivity.this.D).i(DownloadVideoPlayActivity.this.C));
        }

        @Override // q.k
        public void d() {
            List<VideoDownloadEntity> list = DownloadVideoPlayActivity.this.list;
            if (list == null || list.size() <= 0 || DownloadVideoPlayActivity.this.B == DownloadVideoPlayActivity.this.list.size() - 1) {
                return;
            }
            DownloadVideoPlayActivity.this.loadVideoNext();
        }
    }

    public class f implements com.mgs.carparking.widgets.dialog.b.c {
        public f() {
        }

        @Override // com.mgs.carparking.widgets.dialog.b.c
        public void a(String str) {
            DownloadVideoPlayActivity.this.D = str;
        }

        @Override // com.mgs.carparking.widgets.dialog.b.c
        public void b(String str) {
            DownloadVideoPlayActivity.this.C = str;
        }
    }

    public void adPlayWx(boolean z10, boolean z11, AdInfoDetailEntry adInfoDetailEntry, Activity activity, VideoPlayerView videoPlayerView, int i10, int i11, View view, Handler handler, t.a aVar, int i12) {
        if (z11 && adInfoDetailEntry.getNew_user_has_ad() != 1) {
            this.f42041h.h0();
            return;
        }
        h hVar = new h(this, adInfoDetailEntry);
        this.F = hVar;
        a0.c(z10, hVar, adInfoDetailEntry, activity, videoPlayerView, i10, i11, view, handler, i12, "");
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public int initContentView(Bundle bundle) {
        return R.layout.activity_download_video_play;
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public int initVariableId() {
        return 7;
    }

    public void loadAdPlay(boolean z10, boolean z11, Activity activity, VideoPlayerView videoPlayerView, int i10, int i11, View view, Handler handler, t.a aVar) {
        if (AppApplication.adInfoEntry.getAd_position_4() == null || AppApplication.adInfoEntry.getAd_position_4().size() <= 0) {
            this.f42041h.h0();
            return;
        }
        List<AdInfoDetailEntry> ad_position_4 = AppApplication.adInfoEntry.getAd_position_4();
        int num = AdNumShowDao.getInstance().getNum(23);
        if (num >= ad_position_4.size() - 1) {
            if (!z11) {
                showAdAwardPlayerType(z10, z11, ad_position_4, activity, videoPlayerView, i10, i11, view, handler, this.f42041h, 0);
                return;
            }
            if (ad_position_4.get(0).getNew_user_has_ad() != 1) {
                clearAd();
            } else if (((ActivityDownloadVideoPlayBinding) this.f39697c).f39778b.getAdRewardVisibilty()) {
                return;
            }
            showAdAwardPlayerType(z10, z11, ad_position_4, activity, videoPlayerView, i10, i11, view, handler, this.f42041h, 0);
            return;
        }
        if (!z11) {
            showAdAwardPlayerType(z10, z11, ad_position_4, activity, videoPlayerView, i10, i11, view, handler, this.f42041h, num + 1);
            return;
        }
        int i12 = num + 1;
        if (ad_position_4.get(i12).getNew_user_has_ad() != 1) {
            clearAd();
        } else if (((ActivityDownloadVideoPlayBinding) this.f39697c).f39778b.getAdRewardVisibilty()) {
            return;
        }
        showAdAwardPlayerType(z10, z11, ad_position_4, activity, videoPlayerView, i10, i11, view, handler, this.f42041h, i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D(x9.e eVar) throws Exception {
        if (((ActivityDownloadVideoPlayBinding) this.f39697c).f39778b.getAdRewardVisibilty()) {
            ((ActivityDownloadVideoPlayBinding) this.f39697c).f39778b.e(8);
            if (this.f42041h != null) {
                if (!eVar.a()) {
                    this.f42041h.h0();
                    return;
                }
                this.f42041h.M();
                if (eVar.b()) {
                    return;
                }
                this.G = System.currentTimeMillis();
                o0.i1(o0.k());
            }
        }
    }

    public void clearAd() {
        if (((ActivityDownloadVideoPlayBinding) this.f39697c).f39778b.getAdRewardVisibilty()) {
            ((ActivityDownloadVideoPlayBinding) this.f39697c).f39778b.e(8);
        }
        h hVar = this.F;
        if (hVar != null) {
            hVar.a();
            this.F = null;
        }
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public DOWNLOADVIDEOPLAYVIEWMODEL initViewModel() {
        return new DOWNLOADVIDEOPLAYVIEWMODEL(BaseApplication.getInstance(), i9.a.a());
    }

    public void insertHistory() {
        if (this.f42041h.D() == null || this.f42041h.D().getContentPosition() <= 0) {
            return;
        }
        VideoLookHistoryEntry videoLookHistoryEntry = new VideoLookHistoryEntry();
        videoLookHistoryEntry.setId(this.f42047n.getId());
        if (this.f42047n.getVideoType() == 2 || this.f42047n.getVideoType() == 4 || this.f42047n.getVideoType() == 3) {
            videoLookHistoryEntry.setName(this.f42047n.getComplete_name());
        } else {
            videoLookHistoryEntry.setName(this.f42047n.getName());
        }
        videoLookHistoryEntry.setCoverUrl(this.f42047n.getCoverUrl());
        videoLookHistoryEntry.setVideoDesc("");
        videoLookHistoryEntry.setVideoType(this.f42047n.getVideoType());
        videoLookHistoryEntry.setUrl(this.f42047n.getUrl());
        videoLookHistoryEntry.setUpdateTime(System.currentTimeMillis());
        videoLookHistoryEntry.setCurrent(this.f42047n.getVideo_position());
        videoLookHistoryEntry.setContentPosition(this.f42041h.D().getContentPosition());
        videoLookHistoryEntry.setDuration(this.f42041h.A());
        videoLookHistoryEntry.setAudiotype(this.C);
        videoLookHistoryEntry.setSubtitletype(this.D);
        VideoLookHistoryDao.getInstance().insertHistory(videoLookHistoryEntry);
    }

    public void loadVideoNext() {
        String url;
        if (this.list.size() > 0) {
            if (this.B >= this.list.size() - 1) {
                p.b(r.a().getResources().getString(R.string.str_play_last_tip));
                return;
            }
            int i10 = this.B + 1;
            this.B = i10;
            VideoDownloadEntity videoDownloadEntity = this.list.get(i10);
            this.f42047n = videoDownloadEntity;
            if (o.b(videoDownloadEntity.getOrginal_url())) {
                url = this.f42047n.getUrl();
            } else if (this.f42047n.getOrginal_url().endsWith(".mp4")) {
                url = "http://127.0.0.1:" + AppApplication.port + "/resource.mp4?src=" + sa.f.a(this.f42047n.getOrginal_url());
            } else {
                url = "http://127.0.0.1:" + AppApplication.port + "/resource.m3u8?src=" + sa.f.a(this.f42047n.getOrginal_url());
            }
            this.f42041h.S();
            this.f42041h.Z(url);
            ((ActivityDownloadVideoPlayBinding) this.f39697c).f39778b.setTitle(this.f42047n.getComplete_name());
            this.f42041h.c0(0L);
            this.f42041h.h0();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        t.a aVar = this.f42041h;
        if (aVar != null) {
            aVar.J(configuration);
        }
        super.onConfigurationChanged(configuration);
    }

    public void setNumPlay(int i10) {
        String url;
        VideoDownloadEntity videoDownloadEntity = this.list.get(i10);
        this.f42047n = videoDownloadEntity;
        if (o.b(videoDownloadEntity.getOrginal_url())) {
            url = this.f42047n.getUrl();
        } else if (this.f42047n.getOrginal_url().endsWith(".mp4")) {
            url = "http://127.0.0.1:" + AppApplication.port + "/resource.mp4?src=" + sa.f.a(this.f42047n.getOrginal_url());
        } else {
            url = "http://127.0.0.1:" + AppApplication.port + "/resource.m3u8?src=" + sa.f.a(this.f42047n.getOrginal_url());
        }
        this.f42041h.S();
        this.f42041h.Z(url);
        ((ActivityDownloadVideoPlayBinding) this.f39697c).f39778b.setTitle(this.f42047n.getComplete_name());
        this.f42041h.c0(0L);
        this.f42041h.h0();
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

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C(f0 f0Var) throws Exception {
        this.B = f0Var.a();
        if (this.f42047n.getVideoType() == 3) {
            setNumPlay(f0Var.a());
        } else if (this.f42047n.getVideoType() == 2 || this.f42047n.getVideoType() == 4) {
            setNumPlay(f0Var.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E(x9.c cVar) throws Exception {
        this.G = System.currentTimeMillis();
        VideoAdLookDao.getInstance().insertVideoAd(this.f42047n.getId() + "" + this.f42047n.getCollection());
    }

    public void enterLoadAd() {
        if (o0.x() == 0) {
            loadAdPlay(false, false, this, ((ActivityDownloadVideoPlayBinding) this.f39697c).f39778b, this.f42047n.getId(), this.f42047n.getCollection(), this.f42053t, this.E, this.f42041h);
        } else if (o0.X() >= o0.k()) {
            loadAdPlay(false, false, this, ((ActivityDownloadVideoPlayBinding) this.f39697c).f39778b, this.f42047n.getId(), this.f42047n.getCollection(), this.f42053t, this.E, this.f42041h);
        } else {
            this.f42041h.h0();
        }
    }

    public void enterLoadAdNew() {
        if (o0.x() == 0) {
            loadAdPlay(false, true, this, ((ActivityDownloadVideoPlayBinding) this.f39697c).f39778b, this.f42047n.getId(), this.f42047n.getCollection(), this.f42053t, this.E, this.f42041h);
        } else if (o0.X() >= o0.k()) {
            loadAdPlay(false, true, this, ((ActivityDownloadVideoPlayBinding) this.f39697c).f39778b, this.f42047n.getId(), this.f42047n.getCollection(), this.f42053t, this.E, this.f42041h);
        } else {
            this.f42041h.h0();
        }
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public void initData() {
        String url;
        super.initData();
        this.f42047n = (VideoDownloadEntity) getIntent().getSerializableExtra("videoDownloadEntry");
        this.list = (List) getIntent().getSerializableExtra("videoDownloadList");
        this.f42049p = getIntent().getBooleanExtra("flag", false);
        this.f42053t = (TextView) findViewById(R.id.tv_speed);
        this.f42050q = (LinearLayout) findViewById(R.id.rl_speed);
        this.f42052s = (LinearLayout) findViewById(R.id.ll_set_num);
        this.f42051r = (LinearLayout) findViewById(R.id.ll_audio_subtitle);
        this.f42050q.setOnClickListener(this);
        this.f42051r.setOnClickListener(this);
        ImageView imageView = (ImageView) findViewById(R.id.iv_video_more);
        this.f42057x = imageView;
        imageView.setOnClickListener(this);
        ArrayList<VideoLookHistoryEntry> arrayListQueryItemHistory = VideoLookHistoryDao.getInstance().queryItemHistory(this.f42047n.getId());
        if (arrayListQueryItemHistory.size() > 0) {
            for (int i10 = 0; i10 < arrayListQueryItemHistory.size(); i10++) {
                if (this.f42047n.getComplete_name().equals(arrayListQueryItemHistory.get(i10).getName())) {
                    VideoLookHistoryEntry videoLookHistoryEntry = arrayListQueryItemHistory.get(i10);
                    this.f42048o = videoLookHistoryEntry;
                    this.C = videoLookHistoryEntry.getAudiotype();
                    this.D = this.f42048o.getSubtitletype();
                }
            }
        }
        if (this.list != null) {
            for (int i11 = 0; i11 < this.list.size(); i11++) {
                if (this.f42047n.getStreamid().equals(this.list.get(i11).getStreamid())) {
                    this.B = i11;
                    break;
                }
            }
        }
        this.f42045l = (ImageView) findViewById(R.id.exo_controls_back);
        this.f42043j = (ProgressBar) findViewById(R.id.exo_video_audio_brightness_pro_my);
        this.f42042i = (ProgressBar) findViewById(R.id.exo_video_audio_pro_my);
        this.f42044k = (ImageView) findViewById(R.id.exo_video_fast_img_my);
        this.f42054u = (ImageView) findViewById(R.id.iv_exo_next);
        this.f42055v = (TextView) findViewById(R.id.tv_set_num);
        this.f42054u.setOnClickListener(this);
        this.f42052s.setOnClickListener(this);
        if (this.f42049p) {
            this.f42054u.setVisibility(0);
            this.f42052s.setVisibility(0);
        }
        this.f42045l.setOnClickListener(new a());
        this.f42041h = new t.e.b(this, 1, R.id.exo_play_context_id).d(new u.a(this)).h(true).i(false).k(false).j(this.f42047n.getComplete_name()).e(new d()).g(new c()).f(new b()).b();
        if (!o.b(this.f42047n.getOrginal_url())) {
            if (this.f42047n.getOrginal_url().endsWith(".mp4")) {
                url = "http://127.0.0.1:" + AppApplication.port + "/resource.mp4?src=" + sa.f.a(this.f42047n.getOrginal_url());
            } else {
                url = "http://127.0.0.1:" + AppApplication.port + "/resource.m3u8?src=" + sa.f.a(this.f42047n.getOrginal_url());
            }
        } else {
            url = this.f42047n.getUrl();
        }
        if (!o.b(url)) {
            this.f42041h.Z(url);
            VideoLookHistoryEntry videoLookHistoryEntry2 = this.f42048o;
            if (videoLookHistoryEntry2 != null) {
                this.f42041h.c0(videoLookHistoryEntry2.getContentPosition());
            }
            Log.i("wangyi", "播放链接为：" + this.f42047n.getUrl());
        }
        sa.e.a();
        if (!o0.z() && o0.H() < o0.C()) {
            if (VideoAdLookDao.getInstance().isExist(this.f42047n.getId() + "" + this.f42047n.getCollection())) {
                if (o0.Q() == 0) {
                    this.f42041h.h0();
                } else if (o0.h() == 1) {
                    enterLoadAd();
                } else {
                    enterLoadAdNew();
                }
            } else if (o0.h() == 1) {
                enterLoadAd();
            } else {
                enterLoadAdNew();
            }
        } else {
            this.f42041h.h0();
        }
        this.f42041h.v(new e());
        ((ActivityDownloadVideoPlayBinding) this.f39697c).f39778b.O(true);
        setRequestedOrientation(0);
        getWindow().getDecorView().setSystemUiVisibility(0);
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public void initViewObservable() {
        super.initViewObservable();
        k(tl.a.a().d(f0.class).subscribe(new oi.g() { // from class: ka.h
            @Override // oi.g
            public final void accept(Object obj) throws Exception {
                this.f62678b.C((x9.f0) obj);
            }
        }));
        k(tl.a.a().d(x9.e.class).subscribe(new oi.g() { // from class: ka.i
            @Override // oi.g
            public final void accept(Object obj) throws Exception {
                this.f62680b.D((x9.e) obj);
            }
        }));
        k(tl.a.a().d(x9.c.class).subscribe(new oi.g() { // from class: ka.j
            @Override // oi.g
            public final void accept(Object obj) throws Exception {
                this.f62682b.E((x9.c) obj);
            }
        }));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        t.a aVar = this.f42041h;
        if (aVar != null && aVar.I()) {
            finish();
        } else {
            finish();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.iv_exo_next /* 2131362728 */:
                if (this.f42041h != null) {
                    loadVideoNext();
                }
                break;
            case R.id.iv_video_more /* 2131362772 */:
                l lVar = new l(this, this, ((ActivityDownloadVideoPlayBinding) this.f39697c).f39778b);
                this.f42058y = lVar;
                lVar.showAtLocation(((ActivityDownloadVideoPlayBinding) this.f39697c).f39778b, 5, 0, 0);
                break;
            case R.id.ll_audio_subtitle /* 2131362820 */:
                if (this.f42046m == null) {
                    com.mgs.carparking.widgets.dialog.b bVar = new com.mgs.carparking.widgets.dialog.b(this, this.f42041h, this.C, this.D);
                    this.f42046m = bVar;
                    bVar.b(new f());
                }
                this.f42046m.showAtLocation(((ActivityDownloadVideoPlayBinding) this.f39697c).f39778b, 5, 0, 0);
                break;
            case R.id.ll_set_num /* 2131362837 */:
                VideoDownloadEntity videoDownloadEntity = this.f42047n;
                if (videoDownloadEntity != null) {
                    if (videoDownloadEntity.getVideoType() != 2 && this.f42047n.getVideoType() != 4) {
                        if (this.f42047n.getVideoType() == 3) {
                            com.mgs.carparking.widgets.dialog.downloadcomplete.b bVar2 = new com.mgs.carparking.widgets.dialog.downloadcomplete.b(this, this.list, this.B);
                            this.A = bVar2;
                            bVar2.showAtLocation(((ActivityDownloadVideoPlayBinding) this.f39697c).f39778b, 5, 0, 0);
                        }
                    } else {
                        com.mgs.carparking.widgets.dialog.downloadcomplete.a aVar = new com.mgs.carparking.widgets.dialog.downloadcomplete.a(this, this.list, this.B);
                        this.f42059z = aVar;
                        aVar.showAtLocation(((ActivityDownloadVideoPlayBinding) this.f39697c).f39778b, 5, 0, 0);
                    }
                }
                break;
            case R.id.rl_speed /* 2131363413 */:
                if (this.f42056w == null) {
                    this.f42056w = new g(this, this.f42041h, this.f42053t);
                }
                this.f42056w.showAtLocation(((ActivityDownloadVideoPlayBinding) this.f39697c).f39778b, 5, 0, 0);
                break;
        }
    }

    @Override // com.mgs.carparking.app.BaseActivity, com.trello.rxlifecycle2.components.support.RxAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        em.l.d(this, false, R.color.black);
    }

    @Override // com.mgs.carparking.app.BaseActivity, com.trello.rxlifecycle2.components.support.RxAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        t.a aVar = this.f42041h;
        if (aVar != null) {
            aVar.K();
        }
        if (this.f42056w != null) {
            this.f42056w = null;
        }
        if (this.f42058y != null) {
            this.f42058y = null;
        }
        if (this.f42059z != null) {
            this.f42059z = null;
        }
        if (this.A != null) {
            this.A = null;
        }
    }

    @Override // com.trello.rxlifecycle2.components.support.RxAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        insertHistory();
        t.a aVar = this.f42041h;
        if (aVar != null) {
            aVar.L();
        }
    }

    @Override // com.trello.rxlifecycle2.components.support.RxAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        t.a aVar = this.f42041h;
        if (aVar != null) {
            aVar.M();
        }
    }
}
