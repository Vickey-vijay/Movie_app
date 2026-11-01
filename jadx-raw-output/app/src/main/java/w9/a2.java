package w9;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableField;
import com.mgs.carparking.model.LOOKCHANNELVIEWMODEL;
import com.mgs.carparking.netbean.ChannnelFilterEntry;

/* JADX INFO: compiled from: ITEMLOOKCHANNELTYPECHANNELVIEWMODEL.java */
/* JADX INFO: loaded from: classes9.dex */
public class a2 extends sl.c<LOOKCHANNELVIEWMODEL> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ChannnelFilterEntry f73554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f73555c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ObservableField<Boolean> f73556d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ul.b f73557e;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        ((LOOKCHANNELVIEWMODEL) this.f72000a).z(this.f73555c, this.f73554b);
    }

    public a2(@NonNull LOOKCHANNELVIEWMODEL lookchannelviewmodel, ChannnelFilterEntry channnelFilterEntry, int i10, int i11) {
        super(lookchannelviewmodel);
        this.f73556d = new ObservableField<>(Boolean.FALSE);
        this.f73557e = new ul.b(new ul.a() { // from class: w9.z1
            @Override // ul.a
            public final void call() {
                this.f73902a.b();
            }
        });
        this.f73554b = channnelFilterEntry;
        this.f73555c = i10;
        if (i10 == 0) {
            this.f73556d.set(Boolean.TRUE);
        }
    }
}
