package com.mgs.carparking.model;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableField;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.netbean.ExtensionRecordEntry;
import com.mgs.carparking.ui.toolbar.ToolbarViewModel;
import em.r;
import fm.c;
import ii.u;
import java.util.List;
import me.goldze.mvvmhabit.http.BaseResponse;
import sa.f0;
import ul.b;
import w9.l;
import w9.l1;

/* JADX INFO: loaded from: classes10.dex */
public class EXTENSIONRECORDVIEWMODEL extends ToolbarViewModel<n9.a> {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ObservableField<Boolean> f41167o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ObservableField<Boolean> f41168p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ObservableArrayList<l1> f41169q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public c<l1> f41170r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public b f41171s;

    public class a implements u<BaseResponse<ExtensionRecordEntry>> {
        public a() {
        }

        @Override // ii.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<ExtensionRecordEntry> baseResponse) {
            EXTENSIONRECORDVIEWMODEL.this.c();
            if (baseResponse.isOk()) {
                if (baseResponse.getResult() == null) {
                    EXTENSIONRECORDVIEWMODEL.this.f41168p.set(Boolean.TRUE);
                    EXTENSIONRECORDVIEWMODEL.this.f41167o.set(Boolean.FALSE);
                } else {
                    if (baseResponse.getResult().getInvited_list() == null || baseResponse.getResult().getInvited_list().size() <= 0) {
                        EXTENSIONRECORDVIEWMODEL.this.f41168p.set(Boolean.TRUE);
                        EXTENSIONRECORDVIEWMODEL.this.f41167o.set(Boolean.FALSE);
                        return;
                    }
                    ObservableField<Boolean> observableField = EXTENSIONRECORDVIEWMODEL.this.f41168p;
                    Boolean bool = Boolean.FALSE;
                    observableField.set(bool);
                    EXTENSIONRECORDVIEWMODEL.this.f41167o.set(bool);
                    EXTENSIONRECORDVIEWMODEL.this.p(baseResponse.getResult().getInvited_list());
                }
            }
        }

        @Override // ii.u
        public void onError(Throwable th2) {
            EXTENSIONRECORDVIEWMODEL.this.c();
            EXTENSIONRECORDVIEWMODEL.this.f41168p.set(Boolean.FALSE);
            EXTENSIONRECORDVIEWMODEL.this.f41167o.set(Boolean.TRUE);
        }

        @Override // ii.u
        public void onSubscribe(mi.b bVar) {
            EXTENSIONRECORDVIEWMODEL.this.b(bVar);
        }
    }

    public void p(List<ExtensionRecordEntry.InvitedList> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.f41169q.add(new l1(this, list.get(i10)));
        }
    }

    public EXTENSIONRECORDVIEWMODEL(@NonNull Application application, n9.a aVar) {
        super(application, aVar);
        Boolean bool = Boolean.FALSE;
        this.f41167o = new ObservableField<>(bool);
        this.f41168p = new ObservableField<>(bool);
        this.f41169q = new ObservableArrayList<>();
        this.f41170r = c.c(7, R.layout.item_extension_record);
        this.f41171s = new b(new ul.a() { // from class: w9.y
            @Override // ul.a
            public final void call() {
                this.f73857a.q();
            }
        });
        this.f42194g.set(r.a().getResources().getString(R.string.str_extension_histroy));
    }

    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public void q() {
        j();
        ((n9.a) this.f64407b).q().k(new f0()).e(new l()).e(new w9.c()).b(new a());
    }
}
