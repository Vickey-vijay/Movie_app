package com.mgs.carparking.model;

import android.os.Handler;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.databinding.ObservableField;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.app.AppApplication;
import com.mgs.carparking.dbtable.VideoDownloadEntity;
import com.mgs.carparking.netbean.DownloadInfoEntry;
import em.r;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import okhttp3.Response;
import sa.g0;
import sa.j0;
import sa.k;
import sa.x;
import x9.l;

/* JADX INFO: compiled from: ITEMDOWNLOADINGVIEWMODEL.java */
/* JADX INFO: loaded from: classes9.dex */
public class a extends sl.c<DOWNLOADVIDEOVIEWMODEL> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ObservableField<Boolean> f41464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g0 f41465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Handler f41466d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f41467e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List<DownloadInfoEntry> f41468f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f41469g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public DOWNLOADVIDEOVIEWMODEL f41470h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public DownloadInfoEntry f41471i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List<VideoDownloadEntity> f41472j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ObservableField<String> f41473k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ObservableField<String> f41474l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ObservableField<String> f41475m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ObservableField<String> f41476n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ObservableField<Integer> f41477o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ObservableField<String> f41478p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ObservableField<String> f41479q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ObservableField<Integer> f41480r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f41481s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ul.b f41482t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ul.b f41483u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ul.b f41484v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ul.b f41485w;

    /* JADX INFO: renamed from: com.mgs.carparking.model.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ITEMDOWNLOADINGVIEWMODEL.java */
    public class C0417a implements x.b {

        /* JADX INFO: renamed from: com.mgs.carparking.model.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ITEMDOWNLOADINGVIEWMODEL.java */
        public class RunnableC0418a implements Runnable {
            public RunnableC0418a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f41465c.b();
                a aVar = a.this;
                aVar.f41466d.removeCallbacks(aVar.f41469g);
                tl.a.a().b(new l());
            }
        }

        public C0417a() {
        }

        @Override // sa.x.b
        public void a(IOException iOException) {
            Log.i("wangyi", "get fail：" + iOException.toString());
        }

        @Override // sa.x.b
        public void b(Response response) {
            Log.i("wangyi", response.body().toString());
            a.this.f41466d.postDelayed(new RunnableC0418a(), 500L);
        }
    }

    /* JADX INFO: compiled from: ITEMDOWNLOADINGVIEWMODEL.java */
    public class b implements x.b {
        public b() {
        }

        @Override // sa.x.b
        public void a(IOException iOException) {
            Log.i("wangyi", "get失败：" + iOException.toString());
        }

        @Override // sa.x.b
        public void b(Response response) {
            try {
                a.this.f41467e = response.body().string();
                a aVar = a.this;
                Handler handler = aVar.f41466d;
                if (handler != null) {
                    handler.removeCallbacks(aVar.f41469g);
                    a aVar2 = a.this;
                    aVar2.f41466d.postDelayed(aVar2.f41469g, 500L);
                }
            } catch (IOException e10) {
                e10.printStackTrace();
            }
        }
    }

    /* JADX INFO: compiled from: ITEMDOWNLOADINGVIEWMODEL.java */
    public class c implements Runnable {

        /* JADX INFO: renamed from: com.mgs.carparking.model.a$c$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ITEMDOWNLOADINGVIEWMODEL.java */
        public class C0419a extends x5.a<List<DownloadInfoEntry>> {
            public C0419a() {
            }
        }

        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (k.d(a.this.f41467e, DownloadInfoEntry.class)) {
                a aVar = a.this;
                aVar.f41468f = (List) k.c(aVar.f41467e, new C0419a().getType());
                Log.i("wangyi", "进入了23332" + a.this.f41467e.toString());
                if (a.this.f41468f.size() <= 0) {
                    a.this.f41465c.b();
                    return;
                }
                for (int i10 = 0; i10 < a.this.f41468f.size(); i10++) {
                    if (((DownloadInfoEntry) a.this.f41468f.get(i10)).getDownload_status() == 2 && ((DownloadInfoEntry) a.this.f41468f.get(i10)).getResource().equals(a.this.f41481s)) {
                        a aVar2 = a.this;
                        aVar2.f41479q.set(j0.a(((DownloadInfoEntry) aVar2.f41468f.get(i10)).getDownload_size()));
                        a aVar3 = a.this;
                        aVar3.f41477o.set(Integer.valueOf(((DownloadInfoEntry) aVar3.f41468f.get(i10)).getDownload_percent()));
                        a.this.f41478p.set(j0.a(((DownloadInfoEntry) a.this.f41468f.get(i10)).getDownload_rate()) + "/s");
                    } else if (((DownloadInfoEntry) a.this.f41468f.get(i10)).getDownload_status() == 5 && ((DownloadInfoEntry) a.this.f41468f.get(i10)).getResource().equals(a.this.f41481s)) {
                        a.this.f41480r.set(5);
                        a.this.f41476n.set(r.a().getResources().getString(R.string.str_download_tfail));
                    }
                    if (((DownloadInfoEntry) a.this.f41468f.get(i10)).getResource().equals(a.this.f41481s) && ((DownloadInfoEntry) a.this.f41468f.get(i10)).getDownload_status() == 4) {
                        Log.i("wangyi", "进入了22");
                        a.this.f41465c.b();
                        tl.a.a().b(new l());
                    }
                }
            }
        }
    }

    public static /* synthetic */ void m() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l() {
        if (this.f41470h.f41119f.get()) {
            ObservableField<Boolean> observableField = this.f41464b;
            observableField.set(Boolean.valueOf(!observableField.get().booleanValue()));
            if (!this.f41464b.get().booleanValue()) {
                this.f41470h.f41134u.remove(this);
                this.f41470h.f41120g.set(r.a().getResources().getString(R.string.text_all_select));
            } else {
                this.f41470h.f41134u.add(this);
                if (this.f41470h.f41135v.size() == this.f41470h.f41134u.size()) {
                    this.f41470h.f41120g.set(r.a().getResources().getString(R.string.text_unall_select));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n() {
        this.f41476n.set(r.a().getResources().getString(R.string.str_downloading));
        this.f41480r.set(2);
        this.f41471i.setDownload_status(2);
        k("http://127.0.0.1:" + AppApplication.port + "/download_control?resource=" + this.f41471i.getResource() + "&type=3", 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o() {
        if (AppApplication.port <= 0 || this.f41470h.f41119f.get()) {
            return;
        }
        if (this.f41480r.get().intValue() != 2 && this.f41480r.get().intValue() != 1) {
            this.f41476n.set(r.a().getResources().getString(R.string.str_downloading));
            this.f41480r.set(2);
            this.f41471i.setDownload_status(2);
            k("http://127.0.0.1:" + AppApplication.port + "/download_control?resource=" + this.f41471i.getResource() + "&type=3", 2);
            return;
        }
        this.f41476n.set(r.a().getResources().getString(R.string.str_pauseing));
        this.f41480r.set(3);
        this.f41471i.setDownload_status(3);
        ObservableField<Integer> observableField = this.f41477o;
        observableField.set(observableField.get());
        k("http://127.0.0.1:" + AppApplication.port + "/download_control?resource=" + this.f41471i.getResource() + "&type=4", 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p(long j10) {
        j("http://127.0.0.1:" + AppApplication.port + "/control?msg=download_info");
    }

    public void j(String str) {
        Log.i("wangyi", "下载链接为：" + str);
        x.a(str, new b());
    }

    public void k(String str, int i10) {
        Log.i("wangyi", "downloadurl：" + str);
        x.a(str, new C0417a());
    }

    public a(@NonNull DOWNLOADVIDEOVIEWMODEL downloadvideoviewmodel, DownloadInfoEntry downloadInfoEntry, List<VideoDownloadEntity> list, boolean z10) {
        super(downloadvideoviewmodel);
        this.f41464b = new ObservableField<>(Boolean.FALSE);
        this.f41465c = new g0();
        this.f41466d = new Handler();
        this.f41468f = new ArrayList();
        this.f41469g = new c();
        this.f41473k = new ObservableField<>("");
        this.f41474l = new ObservableField<>("");
        this.f41475m = new ObservableField<>("");
        this.f41476n = new ObservableField<>("");
        this.f41477o = new ObservableField<>();
        this.f41478p = new ObservableField<>("");
        this.f41479q = new ObservableField<>("");
        this.f41480r = new ObservableField<>(0);
        this.f41481s = "";
        this.f41482t = new ul.b(new ul.a() { // from class: w9.g1
            @Override // ul.a
            public final void call() {
                this.f73628a.l();
            }
        });
        this.f41483u = new ul.b(new ul.a() { // from class: w9.h1
            @Override // ul.a
            public final void call() {
                com.mgs.carparking.model.a.m();
            }
        });
        this.f41484v = new ul.b(new ul.a() { // from class: w9.i1
            @Override // ul.a
            public final void call() {
                this.f73643a.n();
            }
        });
        this.f41485w = new ul.b(new ul.a() { // from class: w9.j1
            @Override // ul.a
            public final void call() {
                this.f73652a.o();
            }
        });
        this.f41470h = downloadvideoviewmodel;
        this.f41471i = downloadInfoEntry;
        this.f41472j = list;
        if (downloadInfoEntry.getDownload_status() == 2) {
            this.f41480r.set(2);
            this.f41476n.set(r.a().getResources().getString(R.string.str_downloading));
        } else if (downloadInfoEntry.getDownload_status() == 3) {
            this.f41480r.set(3);
            this.f41476n.set(r.a().getResources().getString(R.string.str_pauseing));
        } else if (downloadInfoEntry.getDownload_status() == 1) {
            this.f41480r.set(1);
            this.f41476n.set(r.a().getResources().getString(R.string.str_stoping));
        } else if (downloadInfoEntry.getDownload_status() == 5) {
            this.f41480r.set(5);
            this.f41476n.set(r.a().getResources().getString(R.string.str_download_fail));
        }
        this.f41477o.set(Integer.valueOf(downloadInfoEntry.getDownload_percent()));
        this.f41478p.set(j0.a(downloadInfoEntry.getDownload_rate()) + "/s");
        this.f41479q.set(j0.a(downloadInfoEntry.getDownload_size()));
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (downloadInfoEntry.getResource().equals(list.get(i10).getStreamid())) {
                this.f41473k.set(list.get(i10).getCoverUrl());
                this.f41474l.set(list.get(i10).getComplete_name());
                this.f41475m.set(list.get(i10).getOrginal_url());
            }
        }
        if (downloadInfoEntry.getDownload_status() == 2) {
            this.f41481s = downloadInfoEntry.getResource();
            this.f41465c.c(2000L, new g0.b() { // from class: w9.k1
                @Override // sa.g0.b
                public final void a(long j10) {
                    this.f73658a.p(j10);
                }
            });
        }
    }
}
