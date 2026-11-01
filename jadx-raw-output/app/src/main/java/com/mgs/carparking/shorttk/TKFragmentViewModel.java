package com.mgs.carparking.shorttk;

import android.app.Application;
import androidx.annotation.NonNull;
import com.mgs.carparking.db.VideoCollectionDao;
import com.mgs.carparking.dbtable.VideoCollectionEntry;
import com.mgs.carparking.netbean.CollectionVideoEntry;
import com.mgs.carparking.netbean.TKBean;
import ii.u;
import java.util.HashMap;
import java.util.List;
import me.goldze.mvvmhabit.base.BaseViewModel;
import me.goldze.mvvmhabit.base.bus.event.SingleLiveEvent;
import me.goldze.mvvmhabit.http.BaseResponse;
import sa.f0;
import w9.l;

/* JADX INFO: loaded from: classes7.dex */
public class TKFragmentViewModel extends BaseViewModel<n9.a> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SingleLiveEvent<List<TKBean>> f41646f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public SingleLiveEvent<Boolean> f41647g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f41648h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public SingleLiveEvent<Void> f41649i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public SingleLiveEvent<Void> f41650j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public SingleLiveEvent<Boolean> f41651k;

    public class a implements u<BaseResponse<List<TKBean>>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f41652b;

        @Override // ii.u
        public void onError(Throwable th2) {
        }

        public a(boolean z10) {
            this.f41652b = z10;
        }

        @Override // ii.u
        public void onSubscribe(mi.b bVar) {
            TKFragmentViewModel.this.b(bVar);
        }

        @Override // ii.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<List<TKBean>> baseResponse) {
            if (baseResponse.isOk()) {
                TKFragmentViewModel.this.f41648h++;
                if (baseResponse.getResult() != null) {
                    if (this.f41652b) {
                        TKFragmentViewModel.this.f41646f.setValue(baseResponse.getResult());
                        TKFragmentViewModel.this.f41649i.call();
                    } else {
                        List<TKBean> value = TKFragmentViewModel.this.f41646f.getValue();
                        if (value != null) {
                            value.addAll(baseResponse.getResult());
                            TKFragmentViewModel.this.f41646f.setValue(value);
                            TKFragmentViewModel.this.f41650j.call();
                        }
                    }
                    TKFragmentViewModel.this.f41647g.setValue(Boolean.valueOf(this.f41652b));
                }
            }
        }
    }

    public class b implements u<BaseResponse<String>> {
        @Override // ii.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<String> baseResponse) {
        }

        @Override // ii.u
        public void onError(Throwable th2) {
        }

        @Override // ii.u
        public void onSubscribe(mi.b bVar) {
        }

        public b() {
        }
    }

    public class c implements u<BaseResponse<CollectionVideoEntry>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ VideoCollectionEntry f41655b;

        @Override // ii.u
        public void onSubscribe(mi.b bVar) {
        }

        public c(VideoCollectionEntry videoCollectionEntry) {
            this.f41655b = videoCollectionEntry;
        }

        @Override // ii.u
        public void onError(Throwable th2) {
            TKFragmentViewModel.this.f41651k.setValue(Boolean.FALSE);
        }

        @Override // ii.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<CollectionVideoEntry> baseResponse) {
            if (baseResponse.isOk() && baseResponse.getResult() != null) {
                VideoCollectionDao.getInstance().insert(this.f41655b);
                TKFragmentViewModel.this.f41651k.setValue(Boolean.TRUE);
            }
        }
    }

    public class d implements u<BaseResponse<String>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ VideoCollectionEntry f41657b;

        @Override // ii.u
        public void onError(Throwable th2) {
        }

        @Override // ii.u
        public void onSubscribe(mi.b bVar) {
        }

        public d(VideoCollectionEntry videoCollectionEntry) {
            this.f41657b = videoCollectionEntry;
        }

        @Override // ii.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<String> baseResponse) {
            if (baseResponse.isOk() && baseResponse.getResult() != null) {
                VideoCollectionDao.getInstance().delete(this.f41657b.getId());
                TKFragmentViewModel.this.f41651k.setValue(Boolean.FALSE);
            }
        }
    }

    public void o(boolean z10) {
        if (z10) {
            this.f41648h = 1;
        }
        HashMap map = new HashMap();
        map.put("pn", Integer.valueOf(this.f41648h));
        ((n9.a) this.f64407b).D(map).e(new l()).e(new w9.c()).k(new f0()).b(new a(z10));
    }

    public void p(VideoCollectionEntry videoCollectionEntry, int i10) {
        HashMap map = new HashMap();
        map.put("vod_ids", Integer.valueOf(videoCollectionEntry.getId()));
        ((n9.a) this.f64407b).T(map).e(new l()).e(new w9.c()).b(new d(videoCollectionEntry));
    }

    public void q(VideoCollectionEntry videoCollectionEntry, int i10) {
        HashMap map = new HashMap();
        map.put("vod_id", Integer.valueOf(videoCollectionEntry.getId()));
        map.put(VideoCollectionEntry.TYPE_PID, Integer.valueOf(videoCollectionEntry.getType_pid()));
        map.put("type_id", Integer.valueOf(i10));
        ((n9.a) this.f64407b).f(map).e(new l()).e(new w9.c()).b(new c(videoCollectionEntry));
    }

    public void r(int i10, int i11, int i12, int i13, int i14) {
        HashMap map = new HashMap();
        map.put("vod_id", Integer.valueOf(i10));
        map.put("collection_id", Integer.valueOf(i11));
        map.put("view_time", Integer.valueOf(i12));
        map.put("total_time", Integer.valueOf(i13));
        map.put("vod_time", Integer.valueOf(i14));
        map.put("type", 12);
        ((n9.a) this.f64407b).u(map).e(new l()).e(new w9.c()).b(new b());
    }

    public TKFragmentViewModel(@NonNull Application application, n9.a aVar) {
        super(application, aVar);
        this.f41646f = new SingleLiveEvent<>();
        this.f41647g = new SingleLiveEvent<>();
        this.f41648h = 1;
        this.f41649i = new SingleLiveEvent<>();
        this.f41650j = new SingleLiveEvent<>();
        this.f41651k = new SingleLiveEvent<>();
    }
}
