package w9;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableField;
import com.mgs.carparking.model.CHANNELVIEWMODEL;

/* JADX INFO: compiled from: ITEMCHANNELTYPECOMMONVIEWMODEL.java */
/* JADX INFO: loaded from: classes4.dex */
public class s0 extends sl.c<CHANNELVIEWMODEL> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f73771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ObservableField<Boolean> f73772c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f73773d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f73774e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ul.b f73775f;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        int i10 = this.f73774e;
        if (i10 == 1) {
            ((CHANNELVIEWMODEL) this.f72000a).y(this.f73773d, this.f73771b);
            return;
        }
        if (i10 == 2) {
            ((CHANNELVIEWMODEL) this.f72000a).z(this.f73773d, this.f73771b);
        } else if (i10 == 3) {
            ((CHANNELVIEWMODEL) this.f72000a).A(this.f73773d, this.f73771b);
        } else if (i10 == 4) {
            ((CHANNELVIEWMODEL) this.f72000a).B(this.f73773d, this.f73771b);
        }
    }

    public s0(@NonNull CHANNELVIEWMODEL channelviewmodel, String str, int i10, int i11) {
        super(channelviewmodel);
        this.f73772c = new ObservableField<>(Boolean.FALSE);
        this.f73775f = new ul.b(new ul.a() { // from class: w9.r0
            @Override // ul.a
            public final void call() {
                this.f73764a.b();
            }
        });
        this.f73771b = str;
        this.f73773d = i10;
        this.f73774e = i11;
        if (i11 != 1 && i10 == 0) {
            this.f73772c.set(Boolean.TRUE);
        }
    }
}
