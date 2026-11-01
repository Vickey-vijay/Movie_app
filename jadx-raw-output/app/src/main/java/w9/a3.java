package w9;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableField;
import com.mgs.carparking.model.VIDEOPLAYDETAILVIEWMODEL;
import com.mgs.carparking.netbean.SeriesInfoEntry;

/* JADX INFO: compiled from: ITEMVIDEOSEASONVIEWMODEL.java */
/* JADX INFO: loaded from: classes9.dex */
public class a3 extends sl.c<VIDEOPLAYDETAILVIEWMODEL> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SeriesInfoEntry f73558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ObservableField<Boolean> f73559c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ul.b f73560d;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        ((VIDEOPLAYDETAILVIEWMODEL) this.f72000a).V0(this.f73558b.getVod_id());
    }

    public a3(@NonNull VIDEOPLAYDETAILVIEWMODEL videoplaydetailviewmodel, SeriesInfoEntry seriesInfoEntry) {
        super(videoplaydetailviewmodel);
        Boolean bool = Boolean.FALSE;
        this.f73559c = new ObservableField<>(bool);
        this.f73560d = new ul.b(new ul.a() { // from class: w9.z2
            @Override // ul.a
            public final void call() {
                this.f73903a.b();
            }
        });
        this.f73558b = seriesInfoEntry;
        if (seriesInfoEntry.getDefault().booleanValue()) {
            this.f73559c.set(Boolean.TRUE);
        } else {
            this.f73559c.set(bool);
        }
    }
}
