package x9;

import androidx.databinding.ObservableBoolean;

/* JADX INFO: compiled from: SelectModeEvent.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f74399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ObservableBoolean f74400b;

    public x(int i10, ObservableBoolean observableBoolean) {
        ck.p.j(observableBoolean, "isSelectMode");
        this.f74399a = i10;
        this.f74400b = observableBoolean;
    }

    public final int a() {
        return this.f74399a;
    }

    public final ObservableBoolean b() {
        return this.f74400b;
    }
}
