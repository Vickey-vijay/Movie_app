package com.mgs.carparking.ui.ranklist;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableList;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.app.AppApplication;
import com.mgs.carparking.db.VideoLookHistoryDao;
import com.mgs.carparking.dbtable.VideoLookHistoryEntry;
import com.mgs.carparking.netbean.RankVideoEntry;
import com.mgs.carparking.netbean.RecommandVideosEntity;
import em.p;
import em.r;
import fm.c;
import fm.d;
import ii.u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import me.goldze.mvvmhabit.base.BaseApplication;
import me.goldze.mvvmhabit.base.BaseViewModel;
import me.goldze.mvvmhabit.base.bus.event.SingleLiveEvent;
import me.goldze.mvvmhabit.http.BaseResponse;
import pa.f;
import sa.f0;
import sa.g;
import sl.e;
import w9.l;

/* JADX INFO: loaded from: classes8.dex */
public class RankContentListViewModel extends BaseViewModel<n9.a> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f42147f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f42148g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f42149h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f42150i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f42151j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ObservableField<Boolean> f42152k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ObservableField<Boolean> f42153l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ObservableField<Boolean> f42154m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public SingleLiveEvent<Void> f42155n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public SingleLiveEvent<Void> f42156o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public SingleLiveEvent<Void> f42157p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public SingleLiveEvent<Void> f42158q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public SingleLiveEvent<RecommandVideosEntity> f42159r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public List<RecommandVideosEntity> f42160s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public VideoLookHistoryEntry f42161t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ObservableList<e> f42162u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public c<e> f42163v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ul.b f42164w;

    public class a implements d<e> {
        public a() {
        }

        @Override // fm.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(c cVar, int i10, e eVar) {
            String strValueOf = String.valueOf(eVar.a());
            if (strValueOf.equals("TYPE_RANK_VIDEO_NEXT")) {
                cVar.f(7, R.layout.item_rank_content_multiple_next);
            } else if (strValueOf.equals("TYPE_HOME_VIDEO_ADS")) {
                cVar.f(7, R.layout.item_home_recommend_multiple_ads);
            }
        }
    }

    public class b implements u<BaseResponse<RankVideoEntry>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f42166b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f42167c;

        public b(boolean z10, boolean z11) {
            this.f42166b = z10;
            this.f42167c = z11;
        }

        @Override // ii.u
        public void onError(Throwable th2) {
            if (RankContentListViewModel.this.f42148g == 1) {
                RankContentListViewModel.this.f42156o.call();
            }
            RankContentListViewModel.this.f42158q.call();
            if (RankContentListViewModel.this.f42148g == 1 && RankContentListViewModel.this.f42160s.size() == 0 && this.f42167c) {
                ObservableField<Boolean> observableField = RankContentListViewModel.this.f42152k;
                Boolean bool = Boolean.FALSE;
                observableField.set(bool);
                RankContentListViewModel.this.f42154m.set(Boolean.TRUE);
                RankContentListViewModel.this.f42153l.set(bool);
            }
        }

        @Override // ii.u
        public void onSubscribe(mi.b bVar) {
            RankContentListViewModel.this.b(bVar);
        }

        @Override // ii.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<RankVideoEntry> baseResponse) {
            if (baseResponse.isOk()) {
                if (this.f42166b) {
                    RankContentListViewModel.this.f42162u.clear();
                    RankContentListViewModel.this.f42156o.call();
                }
                RankContentListViewModel.this.f42148g++;
                if (baseResponse.getResult() != null) {
                    if (baseResponse.getResult().getVod_list() != null && baseResponse.getResult().getVod_list().size() > 0) {
                        ObservableField<Boolean> observableField = RankContentListViewModel.this.f42152k;
                        Boolean bool = Boolean.FALSE;
                        observableField.set(bool);
                        RankContentListViewModel.this.f42154m.set(bool);
                        RankContentListViewModel.this.f42153l.set(bool);
                        RankContentListViewModel.this.r(baseResponse.getResult().getVod_list(), this.f42166b);
                        if (RankContentListViewModel.this.f42148g == 2) {
                            g.e();
                            g.f("CACHE_RANK_MODEL_LIST_" + RankContentListViewModel.this.f42147f, baseResponse.getResult().getVod_list());
                        }
                    } else {
                        if (RankContentListViewModel.this.f42148g == 2) {
                            RankContentListViewModel.this.f42153l.set(Boolean.TRUE);
                            ObservableField<Boolean> observableField2 = RankContentListViewModel.this.f42152k;
                            Boolean bool2 = Boolean.FALSE;
                            observableField2.set(bool2);
                            RankContentListViewModel.this.f42154m.set(bool2);
                        }
                        if (RankContentListViewModel.this.f42148g >= 2) {
                            RankContentListViewModel.this.f42157p.call();
                        }
                    }
                    RankContentListViewModel.this.f42158q.call();
                    return;
                }
                ObservableField<Boolean> observableField3 = RankContentListViewModel.this.f42152k;
                Boolean bool3 = Boolean.FALSE;
                observableField3.set(bool3);
                RankContentListViewModel.this.f42154m.set(Boolean.TRUE);
                RankContentListViewModel.this.f42153l.set(bool3);
            }
        }
    }

    public void r(List<RecommandVideosEntity> list, boolean z10) {
        ArrayList arrayList = new ArrayList();
        if (z10) {
            this.f42150i = 0;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.f42150i++;
            ArrayList<VideoLookHistoryEntry> arrayListQueryItemHistory = VideoLookHistoryDao.getInstance().queryItemHistory(list.get(i10).getId());
            if (arrayListQueryItemHistory == null || arrayListQueryItemHistory.size() <= 0) {
                this.f42161t = null;
            } else {
                this.f42161t = arrayListQueryItemHistory.get(0);
            }
            arrayList.add(new f(this, list.get(i10), "TYPE_RANK_VIDEO_NEXT", this.f42148g - 1, i10, list.size(), this.f42161t));
            if (this.f42150i == 8 && AppApplication.adInfoEntry.getAd_position_24() != null && AppApplication.adInfoEntry.getAd_position_24().size() > 0) {
                arrayList.add(new pa.d(this, list, "TYPE_HOME_VIDEO_ADS"));
            }
        }
        this.f42162u.addAll(arrayList);
    }

    public void t() {
        List<RecommandVideosEntity> listD = g.d("CACHE_RANK_MODEL_LIST_" + this.f42147f, RecommandVideosEntity.class);
        this.f42160s = listD;
        if (listD == null || listD.size() <= 0) {
            u(true, true);
            return;
        }
        if (g.c() && yl.b.a(BaseApplication.getInstance())) {
            u(true, true);
            return;
        }
        this.f42148g = 2;
        this.f42152k.set(Boolean.FALSE);
        r(this.f42160s, true);
    }

    public void u(boolean z10, boolean z11) {
        if (z10) {
            this.f42148g = 1;
        }
        HashMap map = new HashMap();
        map.put("pn", Integer.valueOf(this.f42148g));
        map.put("topic_id", Integer.valueOf(this.f42147f));
        map.put("pid", Integer.valueOf(this.f42151j));
        ((n9.a) this.f64407b).K(map).e(new l()).e(new w9.c()).k(new f0()).b(new b(z10, z11));
    }

    public void v(int i10, int i11) {
        this.f42151j = i10;
        this.f42147f = i11;
    }

    public RankContentListViewModel(@NonNull Application application, n9.a aVar) {
        super(application, aVar);
        this.f42147f = 1;
        this.f42148g = 1;
        this.f42149h = 20;
        this.f42150i = 0;
        this.f42151j = 0;
        this.f42152k = new ObservableField<>(Boolean.TRUE);
        Boolean bool = Boolean.FALSE;
        this.f42153l = new ObservableField<>(bool);
        this.f42154m = new ObservableField<>(bool);
        this.f42155n = new SingleLiveEvent<>();
        this.f42156o = new SingleLiveEvent<>();
        this.f42157p = new SingleLiveEvent<>();
        this.f42158q = new SingleLiveEvent<>();
        this.f42159r = new SingleLiveEvent<>();
        this.f42160s = new ArrayList();
        this.f42162u = new ObservableArrayList();
        this.f42163v = c.d(new a());
        this.f42164w = new ul.b(new ul.a() { // from class: pa.l
            @Override // ul.a
            public final void call() {
                this.f66103a.s();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s() {
        if (!yl.b.a(getApplication())) {
            p.b(r.a().getResources().getString(R.string.text_toast_nonet));
        } else if (!sa.e.q()) {
            this.f42154m.set(Boolean.FALSE);
            this.f42152k.set(Boolean.TRUE);
            u(true, true);
        }
    }
}
