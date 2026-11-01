package com.mgs.carparking.model;

import android.app.Application;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableField;
import com.fvvcl.flickverse.R;
import com.inmobi.unification.sdk.InitializationStatus;
import com.mgs.carparking.app.AppApplication;
import com.mgs.carparking.db.VideoDownloadDao;
import com.mgs.carparking.dbtable.VideoDownloadEntity;
import em.r;
import fm.c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import me.goldze.mvvmhabit.base.BaseViewModel;
import okhttp3.Response;
import sa.j0;
import sa.x;
import ul.b;
import w9.c1;

/* JADX INFO: loaded from: classes10.dex */
public class DOWNLOADCOMPLETEVIEWMODEL extends BaseViewModel<n9.a> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ObservableField<String> f41105f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ObservableField<String> f41106g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ObservableBoolean f41107h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ObservableField<String> f41108i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ObservableField<Boolean> f41109j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ObservableArrayList<c1> f41110k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ObservableArrayList<c1> f41111l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public c<c1> f41112m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public b f41113n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public b f41114o;

    public class a implements x.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f41115a;

        public a(String str) {
            this.f41115a = str;
        }

        @Override // sa.x.b
        public void a(IOException iOException) {
            Log.i("wangyi", "get失败：" + iOException.toString());
        }

        @Override // sa.x.b
        public void b(Response response) {
            Log.i("wangyi", InitializationStatus.SUCCESS);
            VideoDownloadDao.getInstance().deleteHistory(this.f41115a);
            if (DOWNLOADCOMPLETEVIEWMODEL.this.f41111l.size() == 0) {
                DOWNLOADCOMPLETEVIEWMODEL.this.f41109j.set(Boolean.TRUE);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p() {
        if (!this.f41108i.get().equals(getApplication().getResources().getString(R.string.text_all_select))) {
            Iterator<c1> it = this.f41111l.iterator();
            while (it.hasNext()) {
                it.next().f73570b.set(Boolean.FALSE);
                this.f41110k.clear();
            }
            this.f41108i.set(getApplication().getResources().getString(R.string.text_all_select));
            return;
        }
        for (c1 c1Var : this.f41111l) {
            c1Var.f73570b.set(Boolean.TRUE);
            this.f41110k.add(c1Var);
        }
        this.f41108i.set(getApplication().getResources().getString(R.string.text_unall_select));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q() {
        Iterator<c1> it = this.f41110k.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            c1 next = it.next();
            this.f41111l.remove(next);
            if (next.f73572d.size() > 1) {
                for (int i10 = 0; i10 < next.f73572d.size(); i10++) {
                    o(next.f73572d.get(i10).getStreamid());
                }
            } else {
                o(next.f73572d.get(0).getStreamid());
            }
        }
        if (this.f41111l.size() == 0) {
            this.f41107h.set(false);
        }
    }

    @RequiresApi(api = 24)
    public void n(List<VideoDownloadEntity> list) {
        this.f41109j.set(Boolean.FALSE);
        for (int i10 = 0; i10 < list.size(); i10++) {
            for (int size = list.size() - 1; size > i10; size--) {
                if (list.get(i10).getStreamid().equals(list.get(size).getStreamid())) {
                    list.remove(size);
                }
            }
        }
        ArrayList<VideoDownloadEntity> arrayList = new ArrayList();
        this.f41111l.clear();
        for (int i11 = 0; i11 < list.size(); i11++) {
            if (list.get(i11).getComplete() == 1) {
                arrayList.add(list.get(i11));
            }
        }
        if (arrayList.size() > 0) {
            HashMap map = new HashMap();
            for (VideoDownloadEntity videoDownloadEntity : arrayList) {
                List arrayList2 = (List) map.get(Integer.valueOf(videoDownloadEntity.getId()));
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    map.put(Integer.valueOf(videoDownloadEntity.getId()), arrayList2);
                }
                arrayList2.add(videoDownloadEntity);
            }
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                this.f41111l.add(new c1(this, (List) ((Map.Entry) it.next()).getValue()));
            }
        }
    }

    public void o(String str) {
        String str2 = "http://127.0.0.1:" + AppApplication.port + "/download_control?resource=" + str + "&type=5";
        Log.i("wangyi", "删除链接为：" + str2);
        x.a(str2, new a(str));
    }

    public DOWNLOADCOMPLETEVIEWMODEL(@NonNull Application application, n9.a aVar) {
        super(application, aVar);
        this.f41105f = new ObservableField<>();
        this.f41106g = new ObservableField<>();
        this.f41107h = new ObservableBoolean(false);
        this.f41108i = new ObservableField<>(getApplication().getResources().getString(R.string.text_all_select));
        this.f41109j = new ObservableField<>(Boolean.TRUE);
        this.f41110k = new ObservableArrayList<>();
        this.f41111l = new ObservableArrayList<>();
        this.f41112m = c.c(7, R.layout.item_downnload_complete_video);
        this.f41113n = new b(new ul.a() { // from class: w9.o
            @Override // ul.a
            public final void call() {
                this.f73710a.p();
            }
        });
        this.f41114o = new b(new ul.a() { // from class: w9.p
            @Override // ul.a
            public final void call() {
                this.f73725a.q();
            }
        });
        this.f41105f.set(r.a().getResources().getString(R.string.text_use_space) + j0.b(application) + "，");
        this.f41106g.set(r.a().getResources().getString(R.string.text_unuse_space, j0.c(application)));
    }
}
