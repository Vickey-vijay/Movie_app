package com.mgs.carparking.model;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableField;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.netbean.OrderListEntry;
import com.mgs.carparking.ui.toolbar.ToolbarViewModel;
import em.r;
import fm.c;
import ii.u;
import java.util.List;
import me.goldze.mvvmhabit.http.BaseResponse;
import sa.f0;
import ul.b;
import w9.d2;
import w9.l;

/* JADX INFO: loaded from: classes6.dex */
public class ORDERLISTVIEWMODEL extends ToolbarViewModel<n9.a> {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ObservableField<Boolean> f41307o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ObservableField<Boolean> f41308p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ObservableArrayList<d2> f41309q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public c<d2> f41310r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public b f41311s;

    public class a implements u<BaseResponse<List<OrderListEntry>>> {
        public a() {
        }

        @Override // ii.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<List<OrderListEntry>> baseResponse) {
            ORDERLISTVIEWMODEL.this.c();
            if (baseResponse.isOk()) {
                if (baseResponse.getResult() == null) {
                    ORDERLISTVIEWMODEL.this.f41308p.set(Boolean.TRUE);
                    ORDERLISTVIEWMODEL.this.f41307o.set(Boolean.FALSE);
                } else {
                    if (baseResponse.getResult() == null || baseResponse.getResult().size() <= 0) {
                        ORDERLISTVIEWMODEL.this.f41308p.set(Boolean.TRUE);
                        ORDERLISTVIEWMODEL.this.f41307o.set(Boolean.FALSE);
                        return;
                    }
                    ObservableField<Boolean> observableField = ORDERLISTVIEWMODEL.this.f41308p;
                    Boolean bool = Boolean.FALSE;
                    observableField.set(bool);
                    ORDERLISTVIEWMODEL.this.f41307o.set(bool);
                    ORDERLISTVIEWMODEL.this.p(baseResponse.getResult());
                }
            }
        }

        @Override // ii.u
        public void onError(Throwable th2) {
            ORDERLISTVIEWMODEL.this.c();
            ORDERLISTVIEWMODEL.this.f41308p.set(Boolean.FALSE);
            ORDERLISTVIEWMODEL.this.f41307o.set(Boolean.TRUE);
        }

        @Override // ii.u
        public void onSubscribe(mi.b bVar) {
            ORDERLISTVIEWMODEL.this.b(bVar);
        }
    }

    public void p(List<OrderListEntry> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.f41309q.add(new d2(this, list.get(i10)));
        }
    }

    public ORDERLISTVIEWMODEL(@NonNull Application application, n9.a aVar) {
        super(application, aVar);
        Boolean bool = Boolean.FALSE;
        this.f41307o = new ObservableField<>(bool);
        this.f41308p = new ObservableField<>(bool);
        this.f41309q = new ObservableArrayList<>();
        this.f41310r = c.c(7, R.layout.item_order_list);
        this.f41311s = new b(new ul.a() { // from class: w9.l4
            @Override // ul.a
            public final void call() {
                this.f73684a.q();
            }
        });
        this.f42194g.set(r.a().getResources().getString(R.string.str_order_list));
    }

    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public void q() {
        j();
        ((n9.a) this.f64407b).N().k(new f0()).e(new l()).e(new w9.c()).b(new a());
    }
}
