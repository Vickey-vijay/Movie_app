package w9;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableField;
import com.mgs.carparking.model.VIDEOPLAYDETAILVIEWMODEL;
import com.mgs.carparking.netbean.VideoBean;

/* JADX INFO: compiled from: ITEMVIDEOSETNUMVIEWMODEL.java */
/* JADX INFO: loaded from: classes10.dex */
public class c3 extends sl.c<VIDEOPLAYDETAILVIEWMODEL> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public VideoBean f73584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ObservableField<String> f73585c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ObservableField<Boolean> f73586d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ObservableField<Boolean> f73587e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f73588f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ul.b f73589g;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        if (em.o.b(this.f73584b.getVod_url())) {
            return;
        }
        ((VIDEOPLAYDETAILVIEWMODEL) this.f72000a).X0(this.f73584b.position);
    }

    public c3(@NonNull VIDEOPLAYDETAILVIEWMODEL videoplaydetailviewmodel, VideoBean videoBean, int i10) {
        super(videoplaydetailviewmodel);
        this.f73585c = new ObservableField<>();
        this.f73586d = new ObservableField<>();
        Boolean bool = Boolean.FALSE;
        this.f73587e = new ObservableField<>(bool);
        this.f73589g = new ul.b(new ul.a() { // from class: w9.b3
            @Override // ul.a
            public final void call() {
                this.f73566a.b();
            }
        });
        this.f73584b = videoBean;
        this.f73588f = i10;
        if (em.o.b(videoBean.getVod_url())) {
            this.f73586d.set(Boolean.TRUE);
        } else {
            this.f73586d.set(bool);
        }
        this.f73585c.set(this.f73584b.getTitle());
    }
}
