package com.mgs.carparking.model;

import android.app.Application;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.databinding.ObservableField;
import com.fvvcl.flickverse.R;
import com.ironsource.Z7;
import com.mgs.carparking.db.VideoLookHistoryDao;
import com.mgs.carparking.dbtable.VideoLookHistoryEntry;
import com.mgs.carparking.netbean.RecommandVideosEntity;
import com.mgs.carparking.netbean.VideoFreeEntry;
import com.mgs.carparking.ui.homecontent.videodetail.VideoPlayDetailActivity;
import em.r;
import ii.u;
import java.util.ArrayList;
import java.util.HashMap;
import me.goldze.mvvmhabit.base.BaseViewModel;
import me.goldze.mvvmhabit.base.bus.event.SingleLiveEvent;
import me.goldze.mvvmhabit.http.BaseResponse;
import sa.i;
import sa.l0;
import sa.o0;
import ul.b;
import w9.c;
import w9.l;

/* JADX INFO: loaded from: classes7.dex */
public class MAINVIEWMODEL extends BaseViewModel<n9.a> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList<VideoLookHistoryEntry> f41272f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ObservableField<String> f41273g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ObservableField<Boolean> f41274h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ObservableField<Boolean> f41275i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public VideoLookHistoryEntry f41276j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public SingleLiveEvent<RecommandVideosEntity> f41277k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public SingleLiveEvent<VideoFreeEntry> f41278l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public SingleLiveEvent<Void> f41279m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public b f41280n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public b f41281o;

    public class a implements u<BaseResponse<RecommandVideosEntity>> {
        @Override // ii.u
        public void onError(Throwable th2) {
            o0.y0(1);
        }

        public a() {
        }

        @Override // ii.u
        public void onSubscribe(mi.b bVar) {
            MAINVIEWMODEL.this.b(bVar);
        }

        @Override // ii.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<RecommandVideosEntity> baseResponse) {
            if (baseResponse.isOk() && baseResponse.getResult() != null) {
                i.a();
                MAINVIEWMODEL.this.f41277k.setValue(baseResponse.getResult());
            } else {
                o0.y0(1);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p() {
        this.f41274h.set(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q() {
        Bundle bundle = new Bundle();
        bundle.putInt("id", this.f41276j.getId());
        bundle.putInt("language_type", this.f41276j.getVideoType());
        startActivity(VideoPlayDetailActivity.class, bundle);
    }

    public void o(String str, String str2, String str3) {
        HashMap map = new HashMap();
        map.put("vod_id", str);
        map.put("cur_time", str2);
        map.put("sign", str3);
        ((n9.a) this.f64407b).i(map).e(new l()).e(new c()).b(new a());
    }

    public MAINVIEWMODEL(@NonNull Application application, n9.a aVar) {
        super(application, aVar);
        this.f41273g = new ObservableField<>("");
        Boolean bool = Boolean.FALSE;
        this.f41274h = new ObservableField<>(bool);
        this.f41275i = new ObservableField<>(bool);
        this.f41277k = new SingleLiveEvent<>();
        this.f41278l = new SingleLiveEvent<>();
        this.f41279m = new SingleLiveEvent<>();
        this.f41280n = new b(new ul.a() { // from class: w9.v3
            @Override // ul.a
            public final void call() {
                this.f73831a.p();
            }
        });
        this.f41281o = new b(new ul.a() { // from class: w9.w3
            @Override // ul.a
            public final void call() {
                this.f73846a.q();
            }
        });
        ArrayList<VideoLookHistoryEntry> arrayListQueryHistory = VideoLookHistoryDao.getInstance().queryHistory();
        this.f41272f = arrayListQueryHistory;
        if (arrayListQueryHistory.size() > 0) {
            this.f41274h.set(Boolean.TRUE);
            VideoLookHistoryEntry videoLookHistoryEntry = this.f41272f.get(0);
            this.f41276j = videoLookHistoryEntry;
            if (videoLookHistoryEntry.getDuration() - this.f41276j.getContentPosition() > 1000) {
                this.f41273g.set(r.a().getResources().getString(R.string.str_last_look) + Z7.f27998r + this.f41276j.getName() + "  " + l0.b(this.f41276j.getContentPosition()));
                return;
            }
            this.f41274h.set(bool);
            return;
        }
        this.f41274h.set(bool);
    }
}
