package com.mgs.carparking.shorttk;

import android.app.Application;
import androidx.annotation.NonNull;
import com.mgs.carparking.dbtable.VideoDownloadEntity;
import com.mgs.carparking.netbean.TKBean;
import ii.u;
import java.util.HashMap;
import me.goldze.mvvmhabit.base.BaseViewModel;
import me.goldze.mvvmhabit.base.bus.event.SingleLiveEvent;
import me.goldze.mvvmhabit.http.BaseResponse;
import mi.b;
import sa.e;
import sa.f0;
import w9.c;
import w9.l;

/* JADX INFO: loaded from: classes5.dex */
public class SHORTTKVIEWMODEL extends BaseViewModel<n9.a> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SingleLiveEvent<TKBean> f41587f;

    public class a implements u<BaseResponse<TKBean>> {
        @Override // ii.u
        public void onError(Throwable th2) {
        }

        public a() {
        }

        @Override // ii.u
        public void onSubscribe(b bVar) {
            SHORTTKVIEWMODEL.this.b(bVar);
        }

        @Override // ii.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<TKBean> baseResponse) {
            if (baseResponse.getResult() != null) {
                SHORTTKVIEWMODEL.this.f41587f.setValue(baseResponse.getResult());
            }
        }
    }

    public void m(int i10, String str, String str2, int i11) {
        HashMap map = new HashMap();
        map.put("vod_id", Integer.valueOf(i10));
        map.put("cur_time", str);
        map.put("sign", str2);
        map.put(VideoDownloadEntity.AUDIO_TYPE, Integer.valueOf(i11));
        if (e.j() == 12) {
            map.put("vi", e.l());
        }
        ((n9.a) this.f64407b).b(map).k(new f0()).e(new l()).e(new c()).b(new a());
    }

    public SHORTTKVIEWMODEL(@NonNull Application application, n9.a aVar) {
        super(application, aVar);
        this.f41587f = new SingleLiveEvent<>();
    }
}
