package w9;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableField;
import com.mgs.carparking.model.LOOKCHANNELVIEWMODEL;

/* JADX INFO: compiled from: ITEMLOOKCHANNELTYPECOMMONVIEWMODEL.java */
/* JADX INFO: loaded from: classes10.dex */
public class c2 extends sl.c<LOOKCHANNELVIEWMODEL> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f73579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ObservableField<Boolean> f73580c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f73581d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f73582e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ul.b f73583f;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        int i10 = this.f73582e;
        if (i10 == 1) {
            ((LOOKCHANNELVIEWMODEL) this.f72000a).A(this.f73581d, this.f73579b);
            return;
        }
        if (i10 == 2) {
            ((LOOKCHANNELVIEWMODEL) this.f72000a).B(this.f73581d, this.f73579b);
        } else if (i10 == 3) {
            ((LOOKCHANNELVIEWMODEL) this.f72000a).C(this.f73581d, this.f73579b);
        } else if (i10 == 4) {
            ((LOOKCHANNELVIEWMODEL) this.f72000a).D(this.f73581d, this.f73579b);
        }
    }

    public c2(@NonNull LOOKCHANNELVIEWMODEL lookchannelviewmodel, String str, int i10, int i11) {
        super(lookchannelviewmodel);
        this.f73580c = new ObservableField<>(Boolean.FALSE);
        this.f73583f = new ul.b(new ul.a() { // from class: w9.b2
            @Override // ul.a
            public final void call() {
                this.f73565a.b();
            }
        });
        this.f73579b = str;
        this.f73581d = i10;
        this.f73582e = i11;
        if (i10 == 0) {
            this.f73580c.set(Boolean.TRUE);
        }
    }
}
