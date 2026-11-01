package com.mgs.carparking.ui.ranklist;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.databinding.ObservableField;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.netbean.RankTopicEntry;
import com.mgs.carparking.netbean.SpecialList;
import com.mgs.carparking.netbean.TopicPidList;
import em.o;
import em.p;
import em.r;
import ii.u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import me.goldze.mvvmhabit.base.BaseApplication;
import me.goldze.mvvmhabit.base.BaseViewModel;
import me.goldze.mvvmhabit.base.bus.event.SingleLiveEvent;
import me.goldze.mvvmhabit.http.BaseResponse;
import sa.e;
import sa.f0;
import sa.g;
import sa.o0;
import ul.b;
import w9.c;
import w9.l;

/* JADX INFO: loaded from: classes.dex */
public class RankNumberNewViewModel extends BaseViewModel<n9.a> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SingleLiveEvent<List<SpecialList>> f42174f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public SingleLiveEvent<List<TopicPidList>> f42175g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ObservableField<Boolean> f42176h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ObservableField<Boolean> f42177i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List<SpecialList> f42178j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List<TopicPidList> f42179k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public b f42180l;

    public class a implements u<BaseResponse<RankTopicEntry>> {
        public a() {
        }

        @Override // ii.u
        public void onError(Throwable th2) {
            RankNumberNewViewModel.this.f42176h.set(Boolean.FALSE);
            RankNumberNewViewModel.this.f42177i.set(Boolean.TRUE);
        }

        @Override // ii.u
        public void onSubscribe(mi.b bVar) {
            RankNumberNewViewModel.this.b(bVar);
        }

        @Override // ii.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<RankTopicEntry> baseResponse) {
            if (baseResponse.isOk()) {
                if (baseResponse.getResult() != null && baseResponse.getResult().getTopic_list().size() > 0) {
                    ObservableField<Boolean> observableField = RankNumberNewViewModel.this.f42176h;
                    Boolean bool = Boolean.FALSE;
                    observableField.set(bool);
                    RankNumberNewViewModel.this.f42177i.set(bool);
                    g.h(true);
                    g.f("CACHE_RANK_TITLE_LIST", baseResponse.getResult().getTopic_list());
                    if (baseResponse.getResult() != null && baseResponse.getResult().getPid_list().size() > 0) {
                        g.f("CACHE_RANK_TV_AND_MOV_TITLE_LIST", baseResponse.getResult().getPid_list());
                        RankNumberNewViewModel.this.f42175g.setValue(baseResponse.getResult().getPid_list());
                    }
                    RankNumberNewViewModel.this.f42174f.setValue(baseResponse.getResult().getTopic_list());
                    return;
                }
                RankNumberNewViewModel.this.f42176h.set(Boolean.FALSE);
                RankNumberNewViewModel.this.f42177i.set(Boolean.TRUE);
            }
        }
    }

    public void p() {
        HashMap map = new HashMap();
        map.put("type_id", 1);
        ((n9.a) this.f64407b).g(map).e(new l()).e(new c()).k(new f0()).b(new a());
    }

    public RankNumberNewViewModel(@NonNull Application application, n9.a aVar) {
        super(application, aVar);
        this.f42174f = new SingleLiveEvent<>();
        this.f42175g = new SingleLiveEvent<>();
        Boolean bool = Boolean.FALSE;
        this.f42176h = new ObservableField<>(bool);
        this.f42177i = new ObservableField<>(bool);
        this.f42178j = new ArrayList();
        this.f42179k = new ArrayList();
        this.f42180l = new b(new ul.a() { // from class: pa.p
            @Override // ul.a
            public final void call() {
                this.f66107a.n();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n() {
        if (!yl.b.a(getApplication())) {
            p.b(r.a().getResources().getString(R.string.text_toast_nonet));
        } else if (!e.q()) {
            this.f42177i.set(Boolean.FALSE);
            this.f42176h.set(Boolean.TRUE);
            p();
        }
    }

    public void o() {
        if (!o.b(o0.q())) {
            this.f42178j = g.d("CACHE_RANK_TITLE_LIST", SpecialList.class);
            this.f42179k = g.d("CACHE_RANK_TV_AND_MOV_TITLE_LIST", TopicPidList.class);
            if (!yl.b.a(BaseApplication.getInstance())) {
                List<SpecialList> list = this.f42178j;
                if (list != null && list.size() > 0) {
                    g.h(false);
                    this.f42174f.setValue(this.f42178j);
                    List<TopicPidList> list2 = this.f42179k;
                    if (list2 != null && list2.size() > 0) {
                        this.f42175g.setValue(this.f42179k);
                        return;
                    }
                    return;
                }
                this.f42176h.set(Boolean.TRUE);
                p();
                return;
            }
            if (!g.b(o0.q())) {
                List<SpecialList> list3 = this.f42178j;
                if (list3 != null && list3.size() > 0) {
                    g.h(false);
                    this.f42174f.setValue(this.f42178j);
                    List<TopicPidList> list4 = this.f42179k;
                    if (list4 != null && list4.size() > 0) {
                        this.f42175g.setValue(this.f42179k);
                        return;
                    }
                    return;
                }
                this.f42176h.set(Boolean.TRUE);
                p();
                return;
            }
            this.f42176h.set(Boolean.TRUE);
            p();
            return;
        }
        this.f42176h.set(Boolean.TRUE);
        p();
    }
}
