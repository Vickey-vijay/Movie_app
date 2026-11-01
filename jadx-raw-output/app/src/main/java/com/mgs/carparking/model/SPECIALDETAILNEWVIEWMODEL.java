package com.mgs.carparking.model;

import android.app.Application;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableList;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.db.SpecialCollectionDao;
import com.mgs.carparking.dbtable.SpecialCollectionEntry;
import com.mgs.carparking.netbean.CollectionVideoEntry;
import com.mgs.carparking.netbean.RankVideoEntry;
import com.mgs.carparking.netbean.RecommandVideosEntity;
import com.mgs.carparking.ui.homecontent.videodetail.VideoPlayDetailActivity;
import em.p;
import em.r;
import fm.c;
import fm.d;
import ii.u;
import java.util.HashMap;
import java.util.Iterator;
import me.goldze.mvvmhabit.base.BaseApplication;
import me.goldze.mvvmhabit.base.BaseViewModel;
import me.goldze.mvvmhabit.base.bus.event.SingleLiveEvent;
import me.goldze.mvvmhabit.http.BaseResponse;
import sa.e;
import sa.f0;
import w9.l;
import w9.w2;
import x9.a0;

/* JADX INFO: loaded from: classes11.dex */
public class SPECIALDETAILNEWVIEWMODEL extends BaseViewModel<n9.a> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f41359f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f41360g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ObservableField<String> f41361h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ObservableField<String> f41362i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ObservableField<String> f41363j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ObservableField<String> f41364k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ObservableField<Drawable> f41365l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ObservableField<Boolean> f41366m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ObservableField<Boolean> f41367n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ObservableField<Boolean> f41368o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ObservableField<Boolean> f41369p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public SingleLiveEvent<Void> f41370q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public SingleLiveEvent<Integer> f41371r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public SingleLiveEvent<Void> f41372s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public SingleLiveEvent<Void> f41373t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public SingleLiveEvent<Void> f41374u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ObservableList<w2> f41375v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public c<w2> f41376w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ul.b f41377x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ul.b f41378y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ul.b f41379z;

    public class a implements u<BaseResponse<RankVideoEntry>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f41380b;

        public a(boolean z10) {
            this.f41380b = z10;
        }

        @Override // ii.u
        public void onError(Throwable th2) {
            SPECIALDETAILNEWVIEWMODEL.this.f41374u.call();
            ObservableField<Boolean> observableField = SPECIALDETAILNEWVIEWMODEL.this.f41369p;
            Boolean bool = Boolean.FALSE;
            observableField.set(bool);
            SPECIALDETAILNEWVIEWMODEL.this.f41368o.set(bool);
            SPECIALDETAILNEWVIEWMODEL.this.f41367n.set(Boolean.TRUE);
        }

        @Override // ii.u
        public void onSubscribe(mi.b bVar) {
            SPECIALDETAILNEWVIEWMODEL.this.b(bVar);
        }

        @Override // ii.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<RankVideoEntry> baseResponse) {
            if (baseResponse.isOk()) {
                ObservableField<Boolean> observableField = SPECIALDETAILNEWVIEWMODEL.this.f41368o;
                Boolean bool = Boolean.FALSE;
                observableField.set(bool);
                SPECIALDETAILNEWVIEWMODEL.this.f41367n.set(bool);
                if (this.f41380b) {
                    SPECIALDETAILNEWVIEWMODEL.this.f41375v.clear();
                    SPECIALDETAILNEWVIEWMODEL.this.f41372s.call();
                }
                SPECIALDETAILNEWVIEWMODEL.this.f41359f++;
                if (baseResponse.getResult() != null) {
                    if (SpecialCollectionDao.getInstance().isExist(baseResponse.getResult().getId())) {
                        SPECIALDETAILNEWVIEWMODEL.this.f41366m.set(Boolean.TRUE);
                        SPECIALDETAILNEWVIEWMODEL.this.f41365l.set(ContextCompat.getDrawable(BaseApplication.getInstance(), R.drawable.ic_special_collection));
                    } else {
                        SPECIALDETAILNEWVIEWMODEL.this.f41366m.set(bool);
                        SPECIALDETAILNEWVIEWMODEL.this.f41365l.set(ContextCompat.getDrawable(BaseApplication.getInstance(), R.drawable.ic_special_uncollection));
                    }
                    if (SPECIALDETAILNEWVIEWMODEL.this.f41359f == 2) {
                        SPECIALDETAILNEWVIEWMODEL.this.f41361h.set(baseResponse.getResult().getName());
                        SPECIALDETAILNEWVIEWMODEL.this.f41362i.set(baseResponse.getResult().getIcon());
                        SPECIALDETAILNEWVIEWMODEL.this.f41363j.set(baseResponse.getResult().getContent());
                        SPECIALDETAILNEWVIEWMODEL.this.f41364k.set(baseResponse.getResult().getUser_num() + "人已经收藏");
                    }
                    if (baseResponse.getResult().getVod_list() != null && baseResponse.getResult().getVod_list().size() > 0) {
                        Iterator<RecommandVideosEntity> it = baseResponse.getResult().getVod_list().iterator();
                        while (it.hasNext()) {
                            SPECIALDETAILNEWVIEWMODEL.this.f41375v.add(new w2(SPECIALDETAILNEWVIEWMODEL.this, it.next()));
                        }
                    } else {
                        if (SPECIALDETAILNEWVIEWMODEL.this.f41359f == 2) {
                            SPECIALDETAILNEWVIEWMODEL.this.f41369p.set(Boolean.TRUE);
                        }
                        if (SPECIALDETAILNEWVIEWMODEL.this.f41359f >= 2) {
                            SPECIALDETAILNEWVIEWMODEL.this.f41373t.call();
                        }
                    }
                    SPECIALDETAILNEWVIEWMODEL.this.f41374u.call();
                }
            }
        }
    }

    public class b implements u<BaseResponse<CollectionVideoEntry>> {
        @Override // ii.u
        public void onError(Throwable th2) {
        }

        public b() {
        }

        @Override // ii.u
        public void onSubscribe(mi.b bVar) {
            SPECIALDETAILNEWVIEWMODEL.this.b(bVar);
        }

        @Override // ii.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<CollectionVideoEntry> baseResponse) {
            if (baseResponse.isOk() && baseResponse.getResult() != null) {
                SpecialCollectionEntry specialCollectionEntry = new SpecialCollectionEntry();
                specialCollectionEntry.setId(baseResponse.getResult().getTopic_id());
                SpecialCollectionDao.getInstance().insert(specialCollectionEntry);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w() {
        if (this.f41366m.get().booleanValue()) {
            p.b("请至我的页面取消收藏");
            return;
        }
        this.f41366m.set(Boolean.TRUE);
        this.f41371r.setValue(1);
        this.f41365l.set(ContextCompat.getDrawable(BaseApplication.getInstance(), R.drawable.ic_special_collection));
    }

    public void x(int i10, boolean z10) {
        if (z10) {
            this.f41359f = 1;
        }
        HashMap map = new HashMap();
        map.put("topic_id", Integer.valueOf(i10));
        map.put("pn", Integer.valueOf(this.f41359f));
        ((n9.a) this.f64407b).p(map).k(new f0()).e(new l()).e(new w9.c()).b(new a(z10));
    }

    public void z(int i10) {
        HashMap map = new HashMap();
        map.put("topic_id", Integer.valueOf(i10));
        ((n9.a) this.f64407b).f(map).e(new l()).e(new w9.c()).b(new b());
    }

    public SPECIALDETAILNEWVIEWMODEL(@NonNull Application application, n9.a aVar) {
        super(application, aVar);
        this.f41359f = 1;
        this.f41360g = 0;
        this.f41361h = new ObservableField<>();
        this.f41362i = new ObservableField<>();
        this.f41363j = new ObservableField<>();
        this.f41364k = new ObservableField<>();
        this.f41365l = new ObservableField<>();
        this.f41366m = new ObservableField<>();
        Boolean bool = Boolean.FALSE;
        this.f41367n = new ObservableField<>(bool);
        this.f41368o = new ObservableField<>(Boolean.TRUE);
        this.f41369p = new ObservableField<>(bool);
        this.f41370q = new SingleLiveEvent<>();
        this.f41371r = new SingleLiveEvent<>();
        this.f41372s = new SingleLiveEvent<>();
        this.f41373t = new SingleLiveEvent<>();
        this.f41374u = new SingleLiveEvent<>();
        this.f41375v = new ObservableArrayList();
        this.f41376w = c.d(new d() { // from class: w9.j5
            @Override // fm.d
            public final void a(fm.c cVar, int i10, Object obj) {
                cVar.f(7, R.layout.item_special_detail_new_item_result);
            }
        });
        this.f41377x = new ul.b(new ul.a() { // from class: w9.k5
            @Override // ul.a
            public final void call() {
                this.f73676a.u();
            }
        });
        this.f41378y = new ul.b(new ul.a() { // from class: w9.l5
            @Override // ul.a
            public final void call() {
                this.f73685a.v();
            }
        });
        this.f41379z = new ul.b(new ul.a() { // from class: w9.m5
            @Override // ul.a
            public final void call() {
                this.f73703a.w();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u() {
        d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v() {
        if (!yl.b.a(getApplication())) {
            p.b(r.a().getResources().getString(R.string.text_toast_nonet));
        } else if (!e.q()) {
            this.f41367n.set(Boolean.FALSE);
            this.f41368o.set(Boolean.TRUE);
            this.f41370q.call();
        }
    }

    public void y(RecommandVideosEntity recommandVideosEntity) {
        if (!e.q()) {
            if (this.f41360g == 1) {
                tl.a.a().b(new a0(recommandVideosEntity.getId()));
                d();
            } else {
                Bundle bundle = new Bundle();
                bundle.putInt("id", recommandVideosEntity.getId());
                startActivity(VideoPlayDetailActivity.class, bundle);
            }
        }
    }
}
