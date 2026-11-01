package w9;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableField;
import com.mgs.carparking.model.VIDEOPLAYDETAILVIEWMODEL;
import com.mgs.carparking.netbean.VideoBean;

/* JADX INFO: compiled from: ITEMVIDEOVARIETYSETNUMVIEWMODEL.java */
/* JADX INFO: loaded from: classes10.dex */
public class e3 extends sl.c<VIDEOPLAYDETAILVIEWMODEL> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public VideoBean f73608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ObservableField<Boolean> f73609c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ul.b f73610d;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        ((VIDEOPLAYDETAILVIEWMODEL) this.f72000a).W0(this.f73608b.position);
    }

    public e3(@NonNull VIDEOPLAYDETAILVIEWMODEL videoplaydetailviewmodel, VideoBean videoBean, int i10, String str) {
        super(videoplaydetailviewmodel);
        this.f73609c = new ObservableField<>(Boolean.FALSE);
        this.f73610d = new ul.b(new ul.a() { // from class: w9.d3
            @Override // ul.a
            public final void call() {
                this.f73601a.b();
            }
        });
        this.f73608b = videoBean;
    }
}
