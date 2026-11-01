package com.mgs.carparking.widgets.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Rect;
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
import com.inmobi.unification.sdk.InitializationStatus;
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
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import me.goldze.mvvmhabit.http.BaseResponse;
import okhttp3.Response;
import sa.a0;
import sa.j0;
import sa.o0;
import sa.x;

/* JADX INFO: compiled from: VideoDetailVarietyDownloadPop.java */
/* JADX INFO: loaded from: classes5.dex */
public class j extends PopupWindow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f42758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public VIDEOPLAYDETAILVIEWMODEL f42759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RecyclerView f42760c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f42761d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public VarietyDownnloadAdapter f42762e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public RelativeLayout f42763f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public RelativeLayout f42764g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextView f42765h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f42766i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f42767j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List<VideoDownloadEntity> f42768k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List<DownloadInfoEntry> f42769l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public List<VideoBean> f42770m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Dialog f42771n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f42772o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TextView f42773p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public TextView f42774q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Handler f42775r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f42776s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public k f42777t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f42778u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f42779v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f42780w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f42781x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public List<VideoBean> f42782y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f42783z;

    /* JADX INFO: compiled from: VideoDetailVarietyDownloadPop.java */
    public class a implements sa.j.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f42784a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ RecommandVideosEntity f42785b;

        public a(int i10, RecommandVideosEntity recommandVideosEntity) {
            this.f42784a = i10;
            this.f42785b = recommandVideosEntity;
        }

        @Override // sa.j.c
        public void a() {
            j.this.f42759b.T(((VideoBean) j.this.f42782y.get(this.f42784a)).is_p2p() == 1 ? ((VideoBean) j.this.f42782y.get(this.f42784a)).getVod_url() : ((VideoBean) j.this.f42782y.get(this.f42784a)).getOrginal_url(), (VideoBean) j.this.f42782y.get(this.f42784a), this.f42785b, j.this.f42783z);
        }
    }

    /* JADX INFO: compiled from: VideoDetailVarietyDownloadPop.java */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (j.this.f42761d.isEnabled()) {
                j.this.f42761d.setEnabled(false);
                j.this.f42761d.setText(r.a().getResources().getString(R.string.str_order));
            } else {
                j.this.f42761d.setEnabled(true);
                j.this.f42761d.setText(r.a().getResources().getString(R.string.str_reverse_order));
            }
            Collections.reverse(j.this.f42782y);
            j.this.f42762e.notifyDataSetChanged();
            j.this.f42760c.scrollToPosition(0);
        }
    }

    /* JADX INFO: compiled from: VideoDetailVarietyDownloadPop.java */
    public class c implements VarietyDownnloadAdapter.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f42788a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Activity f42789b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ RecommandVideosEntity f42790c;

        public c(Context context, Activity activity, RecommandVideosEntity recommandVideosEntity) {
            this.f42788a = context;
            this.f42789b = activity;
            this.f42790c = recommandVideosEntity;
        }

        @Override // com.mgs.carparking.widgets.dialog.VarietyDownnloadAdapter.c
        public void a(int i10, TextView textView) {
            String orginal_url;
            int i11;
            if (sa.e.q()) {
                return;
            }
            if (!yl.b.a(this.f42788a)) {
                p.b(r.a().getResources().getString(R.string.text_toast_nonet));
                return;
            }
            j.this.f42778u = i10;
            if (!((VideoBean) j.this.f42782y.get(i10)).isDownload()) {
                if (!o0.z() && AppApplication.adInfoEntry.getAd_position_5() != null && AppApplication.adInfoEntry.getAd_position_5().size() > 0) {
                    if (o0.D() <= 0) {
                        List<AdInfoDetailEntry> ad_position_5 = AppApplication.adInfoEntry.getAd_position_5();
                        int num = AdNumShowDao.getInstance().getNum(24);
                        if (num >= ad_position_5.size() - 1) {
                            i11 = 0;
                        } else {
                            i11 = num + 1;
                        }
                        if (o0.h() == 1) {
                            j.this.u(ad_position_5, this.f42788a, this.f42789b, this.f42790c, i10, textView, i11, false);
                            return;
                        } else {
                            j.this.u(ad_position_5, this.f42788a, this.f42789b, this.f42790c, i10, textView, i11, true);
                            return;
                        }
                    }
                    j.this.r(this.f42790c.getId(), ((VideoBean) j.this.f42782y.get(i10)).getCollection(), i10, textView, this.f42790c);
                    return;
                }
                j.this.r(this.f42790c.getId(), ((VideoBean) j.this.f42782y.get(i10)).getCollection(), i10, textView, this.f42790c);
                return;
            }
            if (((VideoBean) j.this.f42782y.get(i10)).isCompleteDownload()) {
                p.b(r.a().getResources().getString(R.string.str_downloaded));
                return;
            }
            if (((VideoBean) j.this.f42782y.get(i10)).is_p2p() == 1) {
                orginal_url = ((VideoBean) j.this.f42782y.get(i10)).getVod_url();
            } else {
                orginal_url = ((VideoBean) j.this.f42782y.get(i10)).getOrginal_url();
            }
            for (int i12 = 0; i12 < j.this.f42768k.size(); i12++) {
                if (orginal_url.equals(j.this.f42768k.get(i12).getUrl())) {
                    j jVar = j.this;
                    jVar.f42780w = jVar.f42768k.get(i12).getStreamid();
                }
            }
            j.this.q("http://127.0.0.1:" + AppApplication.port + "/control?msg=download_info", this.f42788a, i10);
        }
    }

    /* JADX INFO: compiled from: VideoDetailVarietyDownloadPop.java */
    public class d implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ VIDEOPLAYDETAILVIEWMODEL f42792b;

        public d(VIDEOPLAYDETAILVIEWMODEL videoplaydetailviewmodel) {
            this.f42792b = videoplaydetailviewmodel;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            j.this.dismiss();
            this.f42792b.startActivity(DownloadActivity.class);
        }
    }

    /* JADX INFO: compiled from: VideoDetailVarietyDownloadPop.java */
    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            j.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: VideoDetailVarietyDownloadPop.java */
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
                j.this.f42776s = response.body().string();
                j jVar = j.this;
                Handler handler = jVar.f42775r;
                if (handler != null) {
                    handler.removeCallbacks(jVar.f42777t);
                    j jVar2 = j.this;
                    jVar2.f42775r.postDelayed(jVar2.f42777t, 500L);
                }
            } catch (IOException e10) {
                e10.printStackTrace();
            }
        }
    }

    /* JADX INFO: compiled from: VideoDetailVarietyDownloadPop.java */
    public class g implements View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            j.this.f42771n.dismiss();
        }
    }

    /* JADX INFO: compiled from: VideoDetailVarietyDownloadPop.java */
    public class h implements View.OnClickListener {
        public h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            j jVar = j.this;
            jVar.f42762e.g(jVar.f42782y, j.this.f42778u);
            j.this.f42771n.dismiss();
            if (o.b(j.this.f42780w)) {
                return;
            }
            j jVar2 = j.this;
            jVar2.s(jVar2.f42780w);
        }
    }

    /* JADX INFO: compiled from: VideoDetailVarietyDownloadPop.java */
    public class i implements x.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f42798a;

        public i(String str) {
            this.f42798a = str;
        }

        @Override // sa.x.b
        public void a(IOException iOException) {
            Log.i("wangyi", "get失败：" + iOException.toString());
        }

        @Override // sa.x.b
        public void b(Response response) {
            Log.i("wangyi", InitializationStatus.SUCCESS);
            VideoDownloadDao.getInstance().deleteHistory(this.f42798a);
        }
    }

    /* JADX INFO: renamed from: com.mgs.carparking.widgets.dialog.j$j, reason: collision with other inner class name */
    /* JADX INFO: compiled from: VideoDetailVarietyDownloadPop.java */
    public class C0431j implements u<BaseResponse<String>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f42800b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ TextView f42801c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ RecommandVideosEntity f42802d;

        @Override // ii.u
        public void onSubscribe(mi.b bVar) {
        }

        public C0431j(int i10, TextView textView, RecommandVideosEntity recommandVideosEntity) {
            this.f42800b = i10;
            this.f42801c = textView;
            this.f42802d = recommandVideosEntity;
        }

        @Override // ii.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<String> baseResponse) {
            if (baseResponse.isOk()) {
                j.this.p(this.f42800b, this.f42801c, this.f42802d);
            } else {
                p.b(baseResponse.getMessage());
            }
        }

        @Override // ii.u
        public void onError(Throwable th2) {
            p.b(r.a().getResources().getString(R.string.str_download_fail));
        }
    }

    /* JADX INFO: compiled from: VideoDetailVarietyDownloadPop.java */
    public class k implements Runnable {

        /* JADX INFO: compiled from: VideoDetailVarietyDownloadPop.java */
        public class a extends x5.a<List<DownloadInfoEntry>> {
            public a() {
            }
        }

        public k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (sa.k.d(j.this.f42776s, DownloadInfoEntry.class)) {
                j jVar = j.this;
                jVar.f42769l = (List) sa.k.c(jVar.f42776s, new a().getType());
                if (j.this.f42769l.size() > 0) {
                    j jVar2 = j.this;
                    jVar2.t(jVar2.f42758a, j.this.f42769l);
                }
            }
        }
    }

    public void t(Context context, List<DownloadInfoEntry> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (this.f42780w.equals(list.get(i10).getResource())) {
                this.f42781x = list.get(i10).getDownload_percent() + "";
            }
        }
        if (this.f42771n == null) {
            View viewInflate = LayoutInflater.from(context).inflate(R.layout.pop_layout_download_info_movies, (ViewGroup) null);
            this.f42772o = (TextView) viewInflate.findViewById(R.id.tv_message);
            this.f42773p = (TextView) viewInflate.findViewById(R.id.tv_cancel);
            this.f42774q = (TextView) viewInflate.findViewById(R.id.tv_sure);
            Dialog dialogA = gb.h.a(context, viewInflate, true);
            this.f42771n = dialogA;
            dialogA.setCanceledOnTouchOutside(false);
        }
        if (o.b(this.f42781x)) {
            this.f42772o.setText(r.a().getResources().getString(R.string.str_downloading_tip));
        } else {
            this.f42772o.setText(r.a().getResources().getString(R.string.str_downloading_tip));
        }
        this.f42773p.setOnClickListener(new g());
        this.f42774q.setOnClickListener(new h());
        this.f42771n.show();
    }

    public void q(String str, Context context, int i10) {
        Log.i("wangyi", "下载链接为：" + str);
        x.a(str, new f());
    }

    public void r(int i10, int i11, int i12, TextView textView, RecommandVideosEntity recommandVideosEntity) {
        HashMap map = new HashMap();
        map.put("vod_id", Integer.valueOf(i10));
        map.put("collection_id", Integer.valueOf(i11));
        i9.a.a().P(map).e(new w9.l()).e(new w9.c()).b(new C0431j(i12, textView, recommandVideosEntity));
    }

    public void s(String str) {
        String str2 = "http://127.0.0.1:" + AppApplication.port + "/download_control?resource=" + str + "&type=5";
        Log.i("wangyi", "删除链接为：" + str2);
        x.a(str2, new i(str));
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        setHeight((view.getResources().getDisplayMetrics().heightPixels - rect.bottom) + sa.e.n(this.f42758a));
        super.showAsDropDown(view);
    }

    public void u(List<AdInfoDetailEntry> list, Context context, Activity activity, RecommandVideosEntity recommandVideosEntity, int i10, TextView textView, int i11, boolean z10) {
        AdInfoDetailEntry adInfoDetailEntry = list.get(i11);
        if (adInfoDetailEntry.getAd_source_id() == 2) {
            if (adInfoDetailEntry.getNum() <= 0) {
                v(context, activity, adInfoDetailEntry, i11, recommandVideosEntity, i10, textView, z10);
                return;
            }
            if (adInfoDetailEntry.getNum() > AdNumShowDao.getInstance().getNum(10)) {
                v(context, activity, adInfoDetailEntry, i11, recommandVideosEntity, i10, textView, z10);
                return;
            }
            int i12 = i11 + 1;
            if (i12 == list.size()) {
                i12 = 0;
            }
            u(list, context, activity, recommandVideosEntity, i10, textView, i12, z10);
        }
    }

    public void v(Context context, Activity activity, AdInfoDetailEntry adInfoDetailEntry, int i10, RecommandVideosEntity recommandVideosEntity, int i11, TextView textView, boolean z10) {
        if (z10 && adInfoDetailEntry.getNew_user_has_ad() == 0) {
            r(recommandVideosEntity.getId(), this.f42782y.get(i11).getCollection(), i11, textView, recommandVideosEntity);
            return;
        }
        dismiss();
        AdNumShowDao.getInstance().updateDownloadIndex(i10);
        ta.h hVar = new ta.h(activity, adInfoDetailEntry);
        a0.a(hVar, this.f42763f, adInfoDetailEntry, new gb.c(context, hVar), context, recommandVideosEntity.getId(), this.f42782y.get(i11).getCollection());
    }

    public j(Activity activity, Context context, List<VideoBean> list, String str, int i10, RecommandVideosEntity recommandVideosEntity, VIDEOPLAYDETAILVIEWMODEL videoplaydetailviewmodel) {
        String orginal_url;
        super(context);
        this.f42768k = new ArrayList();
        this.f42769l = new ArrayList();
        this.f42775r = new Handler();
        this.f42780w = "";
        this.f42781x = "";
        this.f42782y = new ArrayList();
        this.f42783z = 0;
        this.f42758a = context;
        this.f42759b = videoplaydetailviewmodel;
        this.f42779v = recommandVideosEntity.getId();
        this.f42777t = new k();
        this.f42770m = list;
        ArrayList<VideoDownloadEntity> arrayListQueryHistory = VideoDownloadDao.getInstance().queryHistory();
        this.f42768k = arrayListQueryHistory;
        if (arrayListQueryHistory.size() > 0) {
            for (int i11 = 0; i11 < this.f42768k.size(); i11++) {
                if (this.f42768k.get(i11).getId() == recommandVideosEntity.getId() && this.f42768k.get(i11).getAudio_type() == recommandVideosEntity.getAudio_type()) {
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        if (list.get(i12).is_p2p() == 1) {
                            orginal_url = list.get(i12).getVod_url();
                        } else {
                            orginal_url = list.get(i12).getOrginal_url();
                        }
                        if (orginal_url.equals(this.f42768k.get(i11).getUrl())) {
                            list.get(i12).setDownload(true);
                            if (this.f42768k.get(i11).getComplete() == 1) {
                                list.get(i12).setCompleteDownload(true);
                            }
                        }
                    }
                }
            }
        } else {
            for (int i13 = 0; i13 < list.size(); i13++) {
                if (list.get(i13).isDownload()) {
                    list.get(i13).setDownload(false);
                }
            }
        }
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.pop_layout_video_detail_variety_download, (ViewGroup) null);
        this.f42763f = (RelativeLayout) viewInflate.findViewById(R.id.rl_view);
        this.f42760c = (RecyclerView) viewInflate.findViewById(R.id.rv_list);
        this.f42761d = (TextView) viewInflate.findViewById(R.id.tv_sort);
        this.f42765h = (TextView) viewInflate.findViewById(R.id.tv_already_used);
        this.f42766i = (TextView) viewInflate.findViewById(R.id.tv_available);
        this.f42767j = (TextView) viewInflate.findViewById(R.id.tv_open_download);
        this.f42764g = (RelativeLayout) viewInflate.findViewById(R.id.rl_open_cache);
        this.f42760c.setLayoutManager(new LinearLayoutManager(context));
        this.f42765h.setText(r.a().getResources().getString(R.string.text_use_space) + j0.b(context) + "，");
        this.f42766i.setText(r.a().getResources().getString(R.string.text_unuse_space, j0.c(context)));
        for (int i14 = 0; i14 < list.size(); i14++) {
            if (i10 == i14) {
                list.get(i14).setCheck(true);
            } else {
                list.get(i14).setCheck(false);
            }
        }
        this.f42782y.addAll(list);
        VarietyDownnloadAdapter varietyDownnloadAdapter = new VarietyDownnloadAdapter(context, this.f42782y, str);
        this.f42762e = varietyDownnloadAdapter;
        this.f42760c.setAdapter(varietyDownnloadAdapter);
        this.f42760c.scrollToPosition(i10);
        viewInflate.findViewById(R.id.ll_sort).setOnClickListener(new b());
        this.f42762e.f(new c(context, activity, recommandVideosEntity));
        this.f42764g.setOnClickListener(new d(videoplaydetailviewmodel));
        viewInflate.findViewById(R.id.rl_top).setOnClickListener(new e());
        setContentView(viewInflate);
        setWidth(-1);
        setHeight(-1);
        setTouchable(true);
        setOutsideTouchable(true);
        setFocusable(true);
        setAnimationStyle(R.style.pop_shop_anim);
        setBackgroundDrawable(context.getResources().getDrawable(R.color.popupwindow_background));
    }

    public void p(int i10, TextView textView, RecommandVideosEntity recommandVideosEntity) {
        if (o0.D() > 0) {
            o0.M0(o0.D() - 1);
        }
        this.f42762e.h(this.f42782y, i10);
        for (int i11 = 0; i11 < this.f42770m.size(); i11++) {
            if (this.f42782y.get(i10).getCollection() == this.f42770m.get(i11).getCollection()) {
                this.f42783z = i11;
            }
        }
        new sa.j(this.f42758a, this.f42763f).f(textView).g(this.f42767j).e(R.drawable.ic_video_download_icon).d(new a(i10, recommandVideosEntity));
    }
}
