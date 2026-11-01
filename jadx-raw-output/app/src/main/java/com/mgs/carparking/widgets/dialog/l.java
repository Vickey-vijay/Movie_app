package com.mgs.carparking.widgets.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.app.AppApplication;
import com.mgs.carparking.db.AdNumShowDao;
import com.mgs.carparking.db.VideoDownloadDao;
import com.mgs.carparking.dbtable.VideoDownloadEntity;
import com.mgs.carparking.model.VIDEOPLAYDETAILVIEWMODEL;
import com.mgs.carparking.netbean.AdInfoDetailEntry;
import com.mgs.carparking.netbean.DownloadInfoEntry;
import com.mgs.carparking.netbean.RecommandVideosEntity;
import com.mgs.carparking.netbean.VideoBean;
import com.mgs.carparking.ui.mine.DownloadActivity;
import em.o;
import em.p;
import em.r;
import ii.u;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import me.goldze.mvvmhabit.http.BaseResponse;
import okhttp3.Response;
import sa.a0;
import sa.j0;
import sa.o0;
import sa.x;

/* JADX INFO: compiled from: VideoDetailVideoDownloadPop.java */
/* JADX INFO: loaded from: classes8.dex */
public class l extends PopupWindow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f42814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public VIDEOPLAYDETAILVIEWMODEL f42815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<VideoBean> f42816c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RecyclerView f42817d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public VideoDownloadAdapter f42818e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public RelativeLayout f42819f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public RelativeLayout f42820g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextView f42821h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f42822i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f42823j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List<VideoDownloadEntity> f42824k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Dialog f42825l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TextView f42826m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public TextView f42827n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f42828o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public List<DownloadInfoEntry> f42829p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f42830q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f42831r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f42832s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Handler f42833t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f42834u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public j f42835v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f42836w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f42837x;

    /* JADX INFO: compiled from: VideoDetailVideoDownloadPop.java */
    public class a implements VideoDownloadAdapter.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f42838a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f42839b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Activity f42840c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ RecommandVideosEntity f42841d;

        public a(Context context, List list, Activity activity, RecommandVideosEntity recommandVideosEntity) {
            this.f42838a = context;
            this.f42839b = list;
            this.f42840c = activity;
            this.f42841d = recommandVideosEntity;
        }

        @Override // com.mgs.carparking.widgets.dialog.VideoDownloadAdapter.c
        public void a(int i10, TextView textView) {
            int i11;
            if (sa.e.q()) {
                return;
            }
            if (!yl.b.a(this.f42838a)) {
                p.b(r.a().getResources().getString(R.string.text_toast_nonet));
                return;
            }
            l.this.f42836w = i10;
            if (!((VideoBean) this.f42839b.get(i10)).isDownload()) {
                if (!o0.z() && AppApplication.adInfoEntry.getAd_position_5() != null && AppApplication.adInfoEntry.getAd_position_5().size() > 0) {
                    if (o0.D() <= 0) {
                        List<AdInfoDetailEntry> ad_position_5 = AppApplication.adInfoEntry.getAd_position_5();
                        int num = AdNumShowDao.getInstance().getNum(24);
                        if (num >= ad_position_5.size() - 1) {
                            i11 = 0;
                        } else {
                            i11 = num + 1;
                        }
                        int i12 = i11;
                        if (o0.h() == 1) {
                            l.this.s(ad_position_5, this.f42838a, this.f42840c, this.f42841d, i10, textView, i12, false);
                            return;
                        } else {
                            l.this.s(ad_position_5, this.f42838a, this.f42840c, this.f42841d, i10, textView, i12, true);
                            return;
                        }
                    }
                    l.this.p(this.f42841d.getId(), ((VideoBean) this.f42839b.get(i10)).getCollection(), i10, textView, this.f42841d);
                    return;
                }
                l.this.p(this.f42841d.getId(), ((VideoBean) this.f42839b.get(i10)).getCollection(), i10, textView, this.f42841d);
                return;
            }
            if (l.this.f42837x) {
                p.b(r.a().getResources().getString(R.string.str_download_success));
                return;
            }
            l.this.o("http://127.0.0.1:" + AppApplication.port + "/control?msg=download_info", this.f42838a, i10);
        }
    }

    /* JADX INFO: compiled from: VideoDetailVideoDownloadPop.java */
    public class b implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ VIDEOPLAYDETAILVIEWMODEL f42843b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Activity f42844c;

        public b(VIDEOPLAYDETAILVIEWMODEL videoplaydetailviewmodel, Activity activity) {
            this.f42843b = videoplaydetailviewmodel;
            this.f42844c = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            l.this.dismiss();
            this.f42843b.startActivity(DownloadActivity.class);
            this.f42844c.finish();
        }
    }

    /* JADX INFO: compiled from: VideoDetailVideoDownloadPop.java */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            l.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: VideoDetailVideoDownloadPop.java */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            l.this.f42825l.dismiss();
        }
    }

    /* JADX INFO: compiled from: VideoDetailVideoDownloadPop.java */
    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            l lVar = l.this;
            lVar.f42818e.g(lVar.f42816c, l.this.f42836w);
            l.this.f42825l.dismiss();
            if (o.b(l.this.f42831r)) {
                return;
            }
            l lVar2 = l.this;
            lVar2.q(lVar2.f42831r);
        }
    }

    /* JADX INFO: compiled from: VideoDetailVideoDownloadPop.java */
    public class f implements x.b {
        public f() {
        }

        @Override // sa.x.b
        public void a(IOException iOException) {
            Log.i("wangyi", "get失败：" + iOException.toString());
        }

        @Override // sa.x.b
        public void b(Response response) {
            try {
                l.this.f42834u = response.body().string();
                l lVar = l.this;
                Handler handler = lVar.f42833t;
                if (handler != null) {
                    handler.removeCallbacks(lVar.f42835v);
                    l lVar2 = l.this;
                    lVar2.f42833t.postDelayed(lVar2.f42835v, 500L);
                }
            } catch (IOException e10) {
                e10.printStackTrace();
            }
        }
    }

    /* JADX INFO: compiled from: VideoDetailVideoDownloadPop.java */
    public class g implements x.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f42850a;

        public g(String str) {
            this.f42850a = str;
        }

        @Override // sa.x.b
        public void a(IOException iOException) {
            Log.i("wangyi", "get失败：" + iOException.toString());
        }

        @Override // sa.x.b
        public void b(Response response) {
            VideoDownloadDao.getInstance().deleteHistory(this.f42850a);
        }
    }

    /* JADX INFO: compiled from: VideoDetailVideoDownloadPop.java */
    public class h implements u<BaseResponse<String>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f42852b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ TextView f42853c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ RecommandVideosEntity f42854d;

        @Override // ii.u
        public void onSubscribe(mi.b bVar) {
        }

        public h(int i10, TextView textView, RecommandVideosEntity recommandVideosEntity) {
            this.f42852b = i10;
            this.f42853c = textView;
            this.f42854d = recommandVideosEntity;
        }

        @Override // ii.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<String> baseResponse) {
            if (baseResponse.isOk()) {
                l.this.n(this.f42852b, this.f42853c, this.f42854d);
            } else {
                p.b(baseResponse.getMessage());
            }
        }

        @Override // ii.u
        public void onError(Throwable th2) {
            p.b(r.a().getResources().getString(R.string.str_download_fail));
        }
    }

    /* JADX INFO: compiled from: VideoDetailVideoDownloadPop.java */
    public class i implements sa.j.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f42856a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ RecommandVideosEntity f42857b;

        public i(int i10, RecommandVideosEntity recommandVideosEntity) {
            this.f42856a = i10;
            this.f42857b = recommandVideosEntity;
        }

        @Override // sa.j.c
        public void a() {
            l.this.f42815b.T(((VideoBean) l.this.f42816c.get(this.f42856a)).is_p2p() == 1 ? ((VideoBean) l.this.f42816c.get(this.f42856a)).getVod_url() : ((VideoBean) l.this.f42816c.get(this.f42856a)).getOrginal_url(), (VideoBean) l.this.f42816c.get(this.f42856a), this.f42857b, this.f42856a);
        }
    }

    /* JADX INFO: compiled from: VideoDetailVideoDownloadPop.java */
    public class j implements Runnable {

        /* JADX INFO: compiled from: VideoDetailVideoDownloadPop.java */
        public class a extends x5.a<List<DownloadInfoEntry>> {
            public a() {
            }
        }

        public j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (sa.k.d(l.this.f42834u, DownloadInfoEntry.class)) {
                l lVar = l.this;
                lVar.f42829p = (List) sa.k.c(lVar.f42834u, new a().getType());
                if (l.this.f42829p.size() > 0) {
                    l lVar2 = l.this;
                    lVar2.r(lVar2.f42814a, l.this.f42829p);
                }
            }
        }
    }

    public void o(String str, Context context, int i10) {
        Log.i("wangyi", "下载链接为：" + str);
        x.a(str, new f());
    }

    public void p(int i10, int i11, int i12, TextView textView, RecommandVideosEntity recommandVideosEntity) {
        HashMap map = new HashMap();
        map.put("vod_id", Integer.valueOf(i10));
        map.put("collection_id", Integer.valueOf(i11));
        i9.a.a().P(map).e(new w9.l()).e(new w9.c()).b(new h(i12, textView, recommandVideosEntity));
    }

    public void q(String str) {
        x.a("http://127.0.0.1:" + AppApplication.port + "/download_control?resource=" + str + "&type=5", new g(str));
    }

    public void r(Context context, List<DownloadInfoEntry> list) {
        if (o.b(this.f42831r)) {
            ArrayList<VideoDownloadEntity> arrayListQueryHistory = VideoDownloadDao.getInstance().queryHistory();
            this.f42824k = arrayListQueryHistory;
            if (arrayListQueryHistory.size() > 0) {
                for (int i10 = 0; i10 < this.f42824k.size(); i10++) {
                    if (this.f42830q == this.f42824k.get(i10).getId()) {
                        this.f42831r = this.f42824k.get(i10).getStreamid();
                    }
                }
            }
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            if (this.f42831r.equals(list.get(i11).getResource())) {
                this.f42832s = list.get(i11).getDownload_percent() + "";
            }
        }
        if (this.f42825l == null) {
            View viewInflate = LayoutInflater.from(context).inflate(R.layout.pop_layout_download_info_movies, (ViewGroup) null);
            this.f42826m = (TextView) viewInflate.findViewById(R.id.tv_message);
            this.f42827n = (TextView) viewInflate.findViewById(R.id.tv_cancel);
            this.f42828o = (TextView) viewInflate.findViewById(R.id.tv_sure);
            Dialog dialogA = gb.h.a(context, viewInflate, true);
            this.f42825l = dialogA;
            dialogA.setCanceledOnTouchOutside(false);
        }
        if (o.b(this.f42832s)) {
            this.f42826m.setText(r.a().getResources().getString(R.string.str_downloading_tip));
        } else {
            this.f42826m.setText(r.a().getResources().getString(R.string.str_downloading_tip));
        }
        this.f42827n.setOnClickListener(new d());
        this.f42828o.setOnClickListener(new e());
        this.f42825l.show();
    }

    public void s(List<AdInfoDetailEntry> list, Context context, Activity activity, RecommandVideosEntity recommandVideosEntity, int i10, TextView textView, int i11, boolean z10) {
        AdInfoDetailEntry adInfoDetailEntry = list.get(i11);
        if (adInfoDetailEntry.getAd_source_id() == 2) {
            if (adInfoDetailEntry.getNum() <= 0) {
                t(context, activity, adInfoDetailEntry, i11, recommandVideosEntity, i10, textView, z10);
                return;
            }
            if (adInfoDetailEntry.getNum() > AdNumShowDao.getInstance().getNum(10)) {
                t(context, activity, adInfoDetailEntry, i11, recommandVideosEntity, i10, textView, z10);
                return;
            }
            int i12 = i11 + 1;
            if (i12 == list.size()) {
                i12 = 0;
            }
            s(list, context, activity, recommandVideosEntity, i10, textView, i12, z10);
        }
    }

    public void t(Context context, Activity activity, AdInfoDetailEntry adInfoDetailEntry, int i10, RecommandVideosEntity recommandVideosEntity, int i11, TextView textView, boolean z10) {
        if (z10 && adInfoDetailEntry.getNew_user_has_ad() == 0) {
            p(recommandVideosEntity.getId(), this.f42816c.get(i11).getCollection(), i11, textView, recommandVideosEntity);
            return;
        }
        dismiss();
        AdNumShowDao.getInstance().updateDownloadIndex(i10);
        ta.h hVar = new ta.h(activity, adInfoDetailEntry);
        a0.a(hVar, this.f42819f, adInfoDetailEntry, new gb.c(context, hVar), context, recommandVideosEntity.getId(), this.f42816c.get(i11).getCollection());
    }

    public l(Activity activity, Context context, List<VideoBean> list, RecommandVideosEntity recommandVideosEntity, VIDEOPLAYDETAILVIEWMODEL videoplaydetailviewmodel) {
        String orginal_url;
        super(context);
        this.f42824k = new ArrayList();
        this.f42829p = new ArrayList();
        this.f42831r = "";
        this.f42832s = "";
        this.f42833t = new Handler();
        this.f42837x = false;
        this.f42814a = context;
        this.f42815b = videoplaydetailviewmodel;
        this.f42816c = list;
        this.f42830q = recommandVideosEntity.getId();
        this.f42835v = new j();
        ArrayList<VideoDownloadEntity> arrayListQueryHistory = VideoDownloadDao.getInstance().queryHistory();
        this.f42824k = arrayListQueryHistory;
        if (arrayListQueryHistory.size() > 0) {
            for (int i10 = 0; i10 < this.f42824k.size(); i10++) {
                if (this.f42824k.get(i10).getId() == recommandVideosEntity.getId() && this.f42824k.get(i10).getAudio_type() == recommandVideosEntity.getAudio_type()) {
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (list.get(i11).is_p2p() == 1) {
                            orginal_url = list.get(i11).getVod_url();
                        } else {
                            orginal_url = list.get(i11).getOrginal_url();
                        }
                        if (orginal_url.equals(this.f42824k.get(i10).getUrl())) {
                            list.get(i11).setDownload(true);
                            if (this.f42824k.get(i10).getComplete() == 1) {
                                this.f42837x = true;
                                list.get(i11).setCompleteDownload(true);
                            }
                        } else {
                            list.get(i11).setDownload(false);
                        }
                    }
                }
            }
        } else {
            for (int i12 = 0; i12 < list.size(); i12++) {
                if (list.get(i12).isDownload()) {
                    list.get(i12).setDownload(false);
                }
            }
        }
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.pop_layout_video_detail_video_download, (ViewGroup) null);
        this.f42819f = (RelativeLayout) viewInflate.findViewById(R.id.rl_view);
        this.f42817d = (RecyclerView) viewInflate.findViewById(R.id.rv_list);
        this.f42821h = (TextView) viewInflate.findViewById(R.id.tv_already_used);
        this.f42822i = (TextView) viewInflate.findViewById(R.id.tv_available);
        this.f42823j = (TextView) viewInflate.findViewById(R.id.tv_open_download);
        this.f42820g = (RelativeLayout) viewInflate.findViewById(R.id.rl_open_cache);
        this.f42817d.setLayoutManager(new LinearLayoutManager(context));
        this.f42821h.setText(r.a().getResources().getString(R.string.text_use_space) + j0.b(context) + "，");
        this.f42822i.setText(r.a().getResources().getString(R.string.text_unuse_space, j0.c(context)));
        VideoDownloadAdapter videoDownloadAdapter = new VideoDownloadAdapter(context, list, recommandVideosEntity.getVod_name());
        this.f42818e = videoDownloadAdapter;
        this.f42817d.setAdapter(videoDownloadAdapter);
        this.f42818e.f(new a(context, list, activity, recommandVideosEntity));
        this.f42820g.setOnClickListener(new b(videoplaydetailviewmodel, activity));
        viewInflate.findViewById(R.id.rl_top).setOnClickListener(new c());
        setContentView(viewInflate);
        setWidth(-1);
        setHeight(-1);
        setTouchable(true);
        setOutsideTouchable(true);
        setFocusable(true);
        setAnimationStyle(R.style.pop_shop_anim);
        setBackgroundDrawable(context.getResources().getDrawable(R.color.popupwindow_background));
    }

    public void n(int i10, TextView textView, RecommandVideosEntity recommandVideosEntity) {
        if (o0.D() > 0) {
            o0.M0(o0.D() - 1);
        }
        if (!yl.b.b(this.f42814a) && yl.b.a(this.f42814a)) {
            p.b(r.a().getResources().getString(R.string.str_download_with_traffi));
        }
        this.f42818e.h(this.f42816c, i10);
        new sa.j(this.f42814a, this.f42819f).f(textView).g(this.f42823j).e(R.drawable.ic_video_download_icon).d(new i(i10, recommandVideosEntity));
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view) {
        int iG = sa.e.g((Activity) getContentView().getContext());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        setHeight((iG - iArr[1]) - view.getHeight());
        super.showAsDropDown(view);
    }
}
