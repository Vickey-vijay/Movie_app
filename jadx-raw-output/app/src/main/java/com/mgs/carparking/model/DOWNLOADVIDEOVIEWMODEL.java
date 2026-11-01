package com.mgs.carparking.model;

import android.app.Application;
import android.app.Dialog;
import android.util.Log;
import android.view.LayoutInflater;
import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableField;
import com.fvvcl.flickverse.R;
import com.inmobi.unification.sdk.InitializationStatus;
import com.mgs.carparking.app.AppApplication;
import com.mgs.carparking.databinding.DialogVideoDeleteBinding;
import com.mgs.carparking.db.VideoDownloadDao;
import com.mgs.carparking.dbtable.VideoDownloadEntity;
import com.mgs.carparking.netbean.DownloadInfoEntry;
import com.mgs.carparking.ui.mine.DownloadVideoActivity;
import com.mgs.carparking.ui.mine.DownloadingAdapter;
import em.r;
import fm.c;
import gb.h;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.goldze.mvvmhabit.base.BaseViewModel;
import okhttp3.Response;
import sa.g0;
import sa.j0;
import sa.x;
import ul.b;
import w9.c1;
import x9.j;

/* JADX INFO: loaded from: classes5.dex */
public class DOWNLOADVIDEOVIEWMODEL extends BaseViewModel<n9.a> {
    public b A;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ObservableBoolean f41119f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ObservableField<String> f41120g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List<VideoDownloadEntity> f41121h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ObservableField<String> f41122i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ObservableField<String> f41123j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f41124k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ObservableField<Boolean> f41125l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ObservableField<Boolean> f41126m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public g0 f41127n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Dialog f41128o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public DialogVideoDeleteBinding f41129p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public DownloadVideoActivity f41130q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public c1 f41131r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public com.mgs.carparking.model.a f41132s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f41133t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ObservableArrayList<com.mgs.carparking.model.a> f41134u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ObservableArrayList<com.mgs.carparking.model.a> f41135v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public c<com.mgs.carparking.model.a> f41136w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public b f41137x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public b f41138y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public b f41139z;

    public class a implements x.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f41140a;

        public a(String str) {
            this.f41140a = str;
        }

        @Override // sa.x.b
        public void a(IOException iOException) {
            Log.i("wangyi", "get失败：" + iOException.toString());
        }

        @Override // sa.x.b
        public void b(Response response) {
            Log.i("wangyi", InitializationStatus.SUCCESS);
            if (!DOWNLOADVIDEOVIEWMODEL.this.f41133t) {
                VideoDownloadDao.getInstance().deleteHistory(this.f41140a);
            } else {
                VideoDownloadDao.getInstance().deleteHistory(this.f41140a);
            }
            if (DOWNLOADVIDEOVIEWMODEL.this.f41135v.size() == 0) {
                DOWNLOADVIDEOVIEWMODEL.this.f41125l.set(Boolean.TRUE);
                DOWNLOADVIDEOVIEWMODEL.this.f41126m.set(Boolean.FALSE);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r() {
        this.f41128o.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s() {
        this.f41128o.dismiss();
        if (this.f41133t) {
            q(this.f41131r.f73572d.get(0).getStreamid());
        } else {
            this.f41135v.remove(this.f41132s);
            q(this.f41132s.f41471i.getResource());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t() {
        if (!this.f41120g.get().equals(r.a().getResources().getString(R.string.text_all_select))) {
            Iterator<com.mgs.carparking.model.a> it = this.f41135v.iterator();
            while (it.hasNext()) {
                it.next().f41464b.set(Boolean.FALSE);
                this.f41134u.clear();
            }
            this.f41120g.set(r.a().getResources().getString(R.string.text_all_select));
            return;
        }
        for (com.mgs.carparking.model.a aVar : this.f41135v) {
            aVar.f41464b.set(Boolean.TRUE);
            this.f41134u.add(aVar);
        }
        this.f41120g.set(r.a().getResources().getString(R.string.text_unall_select));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u() {
        for (com.mgs.carparking.model.a aVar : this.f41134u) {
            this.f41135v.remove(aVar);
            g0 g0Var = aVar.f41465c;
            if (g0Var != null) {
                g0Var.b();
                aVar.f41465c = null;
            }
            q(aVar.f41471i.getResource());
        }
        if (this.f41135v.size() == 0) {
            this.f41119f.set(false);
        }
    }

    public void delete(com.mgs.carparking.model.a aVar) {
        this.f41132s = aVar;
        this.f41133t = false;
        if (this.f41128o == null) {
            this.f41128o = h.a(this.f41130q.getContext(), this.f41129p.getRoot(), true);
        }
        this.f41128o.show();
    }

    @Override // me.goldze.mvvmhabit.base.BaseViewModel, me.goldze.mvvmhabit.base.IBaseViewModel
    public void onDestroy() {
        if (this.f41135v.size() > 0) {
            for (int i10 = 0; i10 < this.f41135v.size(); i10++) {
                this.f41135v.get(i10).f41465c.b();
                this.f41135v.get(i10).f41466d.removeCallbacks(this.f41135v.get(i10).f41469g);
            }
        }
        super.onDestroy();
    }

    public void q(String str) {
        String str2 = "http://127.0.0.1:" + AppApplication.port + "/download_control?resource=" + str + "&type=5";
        Log.i("wangyi", "删除链接为：" + str2);
        x.a(str2, new a(str));
    }

    public DOWNLOADVIDEOVIEWMODEL(@NonNull Application application, n9.a aVar, g0 g0Var, DownloadVideoActivity downloadVideoActivity) {
        super(application, aVar);
        this.f41119f = new ObservableBoolean(false);
        this.f41120g = new ObservableField<>(r.a().getResources().getString(R.string.text_all_select));
        this.f41121h = new ArrayList();
        this.f41122i = new ObservableField<>();
        this.f41123j = new ObservableField<>();
        this.f41124k = true;
        Boolean bool = Boolean.FALSE;
        this.f41125l = new ObservableField<>(bool);
        this.f41126m = new ObservableField<>(bool);
        this.f41133t = false;
        this.f41134u = new ObservableArrayList<>();
        this.f41135v = new ObservableArrayList<>();
        this.f41136w = c.c(7, R.layout.item_downnloading_video);
        this.f41137x = new b(new ul.a() { // from class: w9.q
            @Override // ul.a
            public final void call() {
                this.f73750a.r();
            }
        });
        this.f41138y = new b(new ul.a() { // from class: w9.r
            @Override // ul.a
            public final void call() {
                this.f73763a.s();
            }
        });
        this.f41139z = new b(new ul.a() { // from class: w9.s
            @Override // ul.a
            public final void call() {
                this.f73770a.t();
            }
        });
        this.A = new b(new ul.a() { // from class: w9.t
            @Override // ul.a
            public final void call() {
                this.f73785a.u();
            }
        });
        this.f41127n = g0Var;
        this.f41130q = downloadVideoActivity;
        DialogVideoDeleteBinding dialogVideoDeleteBinding = (DialogVideoDeleteBinding) DataBindingUtil.inflate(LayoutInflater.from(r.a()), R.layout.dialog_video_delete, null, false);
        this.f41129p = dialogVideoDeleteBinding;
        dialogVideoDeleteBinding.a(this);
        this.f41122i.set(r.a().getResources().getString(R.string.text_use_space) + j0.b(application) + "，");
        this.f41123j.set(r.a().getResources().getString(R.string.text_unuse_space, j0.c(application)));
        this.f41121h = VideoDownloadDao.getInstance().queryHistory();
        Log.i("wangyi", "下载的数据为：" + this.f41121h.toString());
        if (this.f41121h.size() > 0) {
            this.f41125l.set(bool);
            this.f41126m.set(Boolean.TRUE);
        } else {
            this.f41126m.set(bool);
            this.f41125l.set(Boolean.TRUE);
        }
    }

    public void p(List<DownloadInfoEntry> list, DownloadingAdapter downloadingAdapter) {
        boolean z10;
        if (list.size() > 0 && this.f41121h.size() > 0) {
            if (this.f41124k) {
                this.f41127n.b();
                if (this.f41135v.size() > 0) {
                    for (int i10 = 0; i10 < this.f41135v.size(); i10++) {
                        this.f41135v.get(i10).f41465c.b();
                        this.f41135v.get(i10).f41466d.removeCallbacks(this.f41135v.get(i10).f41469g);
                    }
                }
                if (this.f41135v.size() > 0) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                int i11 = 0;
                boolean z11 = false;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    if (list.get(i12).getDownload_percent() < 100) {
                        if (!z10 && i11 < this.f41135v.size()) {
                            this.f41135v.set(i11, new com.mgs.carparking.model.a(this, list.get(i12), this.f41121h, false));
                            i11++;
                        } else {
                            this.f41135v.add(new com.mgs.carparking.model.a(this, list.get(i12), this.f41121h, false));
                        }
                    } else {
                        for (int i13 = 0; i13 < this.f41121h.size(); i13++) {
                            if (list.get(i12).getResource().equals(this.f41121h.get(i13).getStreamid())) {
                                VideoDownloadDao.getInstance().updateHistory(1, this.f41121h.get(i13).getStreamid(), list.get(i12).getDownload_size());
                                z11 = true;
                            }
                        }
                    }
                    if (z11) {
                        this.f41121h = VideoDownloadDao.getInstance().queryHistory();
                        tl.a.a().b(new j(this.f41121h));
                    }
                }
                if (!z10) {
                    while (i11 < this.f41135v.size()) {
                        this.f41135v.remove(i11);
                        i11++;
                    }
                }
                if (this.f41135v.size() == 0) {
                    this.f41125l.set(Boolean.TRUE);
                    this.f41126m.set(Boolean.FALSE);
                    this.f41127n.b();
                }
            }
        } else {
            this.f41126m.set(Boolean.FALSE);
            this.f41125l.set(Boolean.TRUE);
            this.f41127n.b();
            this.f41127n = null;
            VideoDownloadDao.getInstance().clearHistory();
        }
        this.f41124k = false;
    }
}
