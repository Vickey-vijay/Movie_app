package com.mgs.carparking.model;

import android.app.Application;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableField;
import com.fvvcl.flickverse.R;
import com.inmobi.unification.sdk.InitializationStatus;
import com.mgs.carparking.app.AppApplication;
import com.mgs.carparking.db.VideoDownloadDao;
import com.mgs.carparking.dbtable.VideoDownloadEntity;
import com.mgs.carparking.ui.toolbar.ToolbarViewModel;
import em.r;
import fm.c;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import okhttp3.Response;
import sa.x;
import ul.b;
import w9.f1;
import x9.k;

/* JADX INFO: loaded from: classes7.dex */
public class DOWNLOADCOMPLETESECONDVIEWMODEL extends ToolbarViewModel<n9.a> {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ObservableBoolean f41097o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ObservableArrayList<f1> f41098p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ObservableField<String> f41099q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ObservableArrayList<f1> f41100r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public c<f1> f41101s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public b f41102t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public b f41103u;

    public class a implements x.b {
        public a() {
        }

        @Override // sa.x.b
        public void a(IOException iOException) {
            Log.i("wangyi", "get失败：" + iOException.toString());
        }

        @Override // sa.x.b
        public void b(Response response) {
            Log.i("wangyi", InitializationStatus.SUCCESS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r() {
        for (f1 f1Var : this.f41098p) {
            this.f41100r.remove(f1Var);
            p("http://127.0.0.1:" + AppApplication.port + "/download_control?resource=" + f1Var.f73616d.getStreamid() + "&type=5");
            VideoDownloadDao.getInstance().deleteHistory(f1Var.f73616d);
        }
        tl.a.a().b(new k());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s() {
        if (!this.f41099q.get().equals(getApplication().getResources().getString(R.string.text_all_select))) {
            Iterator<f1> it = this.f41100r.iterator();
            while (it.hasNext()) {
                it.next().f73618f.set(Boolean.FALSE);
                this.f41098p.clear();
            }
            this.f41099q.set(getApplication().getResources().getString(R.string.text_all_select));
            return;
        }
        for (f1 f1Var : this.f41100r) {
            f1Var.f73618f.set(Boolean.TRUE);
            this.f41098p.add(f1Var);
        }
        this.f41099q.set(getApplication().getResources().getString(R.string.text_unall_select));
    }

    public void p(String str) {
        Log.i("wangyi", "下载链接为：" + str);
        x.a(str, new a());
    }

    public void q(List<VideoDownloadEntity> list) {
        this.f42194g.set(list.get(0).getName());
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.f41100r.add(new f1(this, list.get(i10), list));
        }
    }

    public DOWNLOADCOMPLETESECONDVIEWMODEL(@NonNull Application application, n9.a aVar) {
        super(application, aVar);
        this.f41097o = new ObservableBoolean(false);
        this.f41098p = new ObservableArrayList<>();
        this.f41099q = new ObservableField<>(getApplication().getResources().getString(R.string.text_all_select));
        this.f41100r = new ObservableArrayList<>();
        this.f41101s = c.c(7, R.layout.item_download_complete_second);
        this.f41102t = new b(new ul.a() { // from class: w9.m
            @Override // ul.a
            public final void call() {
                this.f73687a.r();
            }
        });
        this.f41103u = new b(new ul.a() { // from class: w9.n
            @Override // ul.a
            public final void call() {
                this.f73705a.s();
            }
        });
        this.f42196i.set(true);
    }

    @Override // com.mgs.carparking.ui.toolbar.ToolbarViewModel
    public void m() {
        super.m();
        if (this.f41097o.get()) {
            this.f42195h.set(r.a().getResources().getString(R.string.text_delete));
            this.f41097o.set(false);
            this.f41098p.clear();
            Iterator<f1> it = this.f41100r.iterator();
            while (it.hasNext()) {
                it.next().f73618f.set(Boolean.FALSE);
            }
            return;
        }
        this.f42195h.set(r.a().getResources().getString(R.string.text_cannel));
        this.f41097o.set(true);
    }
}
