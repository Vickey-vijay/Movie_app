package com.mgs.carparking.ui.toolbar;

import android.app.Application;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableField;
import com.fvvcl.flickverse.R;
import em.r;
import me.goldze.mvvmhabit.base.BaseViewModel;
import ul.b;
import yl.a;

/* JADX INFO: loaded from: classes8.dex */
public class ToolbarViewModel<M extends a> extends BaseViewModel<M> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ObservableField<String> f42193f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ObservableField<String> f42194g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ObservableField<String> f42195h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ObservableBoolean f42196i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ObservableBoolean f42197j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ObservableField<Drawable> f42198k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public b f42199l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public b f42200m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ToolbarViewModel f42201n;

    public ToolbarViewModel(@NonNull Application application) {
        super(application);
        this.f42193f = new ObservableField<>("");
        this.f42194g = new ObservableField<>("");
        this.f42195h = new ObservableField<>(r.a().getResources().getString(R.string.str_edit));
        this.f42196i = new ObservableBoolean(false);
        this.f42197j = new ObservableBoolean(true);
        this.f42198k = new ObservableField<>();
        this.f42199l = new b(new ul.a() { // from class: qa.a
            @Override // ul.a
            public final void call() {
                this.f66559a.l();
            }
        });
        this.f42200m = new b(new ul.a() { // from class: qa.b
            @Override // ul.a
            public final void call() {
                this.f66560a.m();
            }
        });
        this.f42201n = this;
    }

    public void m() {
    }

    public void l() {
        g();
    }

    public ToolbarViewModel(@NonNull Application application, M m10) {
        super(application, m10);
        this.f42193f = new ObservableField<>("");
        this.f42194g = new ObservableField<>("");
        this.f42195h = new ObservableField<>(r.a().getResources().getString(R.string.str_edit));
        this.f42196i = new ObservableBoolean(false);
        this.f42197j = new ObservableBoolean(true);
        this.f42198k = new ObservableField<>();
        this.f42199l = new b(new ul.a() { // from class: qa.a
            @Override // ul.a
            public final void call() {
                this.f66559a.l();
            }
        });
        this.f42200m = new b(new ul.a() { // from class: qa.b
            @Override // ul.a
            public final void call() {
                this.f66560a.m();
            }
        });
        this.f42201n = this;
    }
}
