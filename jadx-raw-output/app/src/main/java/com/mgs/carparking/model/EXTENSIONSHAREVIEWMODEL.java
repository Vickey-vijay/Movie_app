package com.mgs.carparking.model;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.databinding.ObservableField;
import com.fvvcl.flickverse.R;
import com.ironsource.Z7;
import com.mgs.carparking.netbean.ExtensionShareEntry;
import com.mgs.carparking.ui.mine.share.ExtensionRecordActivity;
import com.mgs.carparking.ui.toolbar.ToolbarViewModel;
import em.r;
import ii.u;
import me.goldze.mvvmhabit.base.bus.event.SingleLiveEvent;
import me.goldze.mvvmhabit.http.BaseResponse;
import sa.f0;
import ul.b;
import w9.c;
import w9.l;

/* JADX INFO: loaded from: classes11.dex */
public class EXTENSIONSHAREVIEWMODEL extends ToolbarViewModel<n9.a> {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public SingleLiveEvent<ExtensionShareEntry> f41173o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public SingleLiveEvent<Void> f41174p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ObservableField<String> f41175q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ObservableField<String> f41176r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ObservableField<String> f41177s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ObservableField<String> f41178t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public b f41179u;

    public class a implements u<BaseResponse<ExtensionShareEntry>> {
        public a() {
        }

        @Override // ii.u
        public void onError(Throwable th2) {
            EXTENSIONSHAREVIEWMODEL.this.c();
        }

        @Override // ii.u
        public void onSubscribe(mi.b bVar) {
            EXTENSIONSHAREVIEWMODEL.this.b(bVar);
        }

        @Override // ii.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<ExtensionShareEntry> baseResponse) {
            if (baseResponse.isOk()) {
                if (baseResponse.getResult() != null) {
                    EXTENSIONSHAREVIEWMODEL.this.c();
                    EXTENSIONSHAREVIEWMODEL.this.f41173o.setValue(baseResponse.getResult());
                    EXTENSIONSHAREVIEWMODEL.this.f41176r.set(r.a().getResources().getString(R.string.str_my_code) + baseResponse.getResult().getInvited_by());
                    EXTENSIONSHAREVIEWMODEL.this.f41177s.set(r.a().getResources().getString(R.string.str_sharenum, baseResponse.getResult().getInvited_count() + Z7.f27998r));
                    return;
                }
                EXTENSIONSHAREVIEWMODEL.this.c();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q() {
        this.f41174p.call();
    }

    public EXTENSIONSHAREVIEWMODEL(@NonNull Application application, n9.a aVar) {
        super(application, aVar);
        this.f41173o = new SingleLiveEvent<>();
        this.f41174p = new SingleLiveEvent<>();
        this.f41175q = new ObservableField<>();
        this.f41176r = new ObservableField<>();
        this.f41177s = new ObservableField<>();
        this.f41178t = new ObservableField<>();
        this.f41179u = new b(new ul.a() { // from class: w9.z
            @Override // ul.a
            public final void call() {
                this.f73900a.q();
            }
        });
        this.f42194g.set(r.a().getResources().getString(R.string.str_mine_extension));
        this.f42196i.set(true);
        this.f42195h.set(r.a().getResources().getString(R.string.str_extension_histroy));
    }

    @Override // com.mgs.carparking.ui.toolbar.ToolbarViewModel
    public void m() {
        super.m();
        startActivity(ExtensionRecordActivity.class);
    }

    public void p() {
        j();
        ((n9.a) this.f64407b).M().k(new f0()).e(new l()).e(new c()).b(new a());
    }
}
