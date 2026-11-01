package com.mgs.carparking.model;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableField;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.ui.toolbar.ToolbarViewModel;
import em.r;
import me.goldze.mvvmhabit.base.bus.event.SingleLiveEvent;
import ul.b;

/* JADX INFO: loaded from: classes10.dex */
public class DOWNLOADVIEWMODEL extends ToolbarViewModel<n9.a> {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ObservableField<String> f41142o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ObservableField<String> f41143p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ObservableField<Boolean> f41144q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ObservableField<Boolean> f41145r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ObservableBoolean f41146s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ObservableBoolean f41147t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public SingleLiveEvent<Void> f41148u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public SingleLiveEvent<Void> f41149v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public b f41150w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public b f41151x;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p() {
        if (this.f41146s.get()) {
            this.f41142o.set(r.a().getResources().getString(R.string.str_edit));
            this.f41146s.set(false);
        } else {
            this.f41142o.set(r.a().getResources().getString(R.string.text_cannel));
            this.f41146s.set(true);
        }
        this.f41148u.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q() {
        if (this.f41147t.get()) {
            this.f41143p.set(r.a().getResources().getString(R.string.str_edit));
            this.f41147t.set(false);
        } else {
            this.f41143p.set(r.a().getResources().getString(R.string.text_cannel));
            this.f41147t.set(true);
        }
        this.f41149v.call();
    }

    public DOWNLOADVIEWMODEL(@NonNull Application application, n9.a aVar) {
        super(application, aVar);
        this.f41142o = new ObservableField<>(r.a().getResources().getString(R.string.str_edit));
        this.f41143p = new ObservableField<>(r.a().getResources().getString(R.string.str_edit));
        this.f41144q = new ObservableField<>(Boolean.TRUE);
        this.f41145r = new ObservableField<>(Boolean.FALSE);
        this.f41146s = new ObservableBoolean(false);
        this.f41147t = new ObservableBoolean(false);
        this.f41148u = new SingleLiveEvent<>();
        this.f41149v = new SingleLiveEvent<>();
        this.f41150w = new b(new ul.a() { // from class: w9.u
            @Override // ul.a
            public final void call() {
                this.f73810a.p();
            }
        });
        this.f41151x = new b(new ul.a() { // from class: w9.v
            @Override // ul.a
            public final void call() {
                this.f73823a.q();
            }
        });
        this.f42194g.set(r.a().getResources().getString(R.string.text_mine_download));
    }
}
