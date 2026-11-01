package w9;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.databinding.ObservableField;
import com.mgs.carparking.dbtable.VideoDownloadEntity;
import com.mgs.carparking.model.DOWNLOADCOMPLETESECONDVIEWMODEL;
import com.mgs.carparking.ui.mine.DownloadVideoPlayActivity;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: compiled from: ITEMDOWNLOADCONPLETESECONDVIEWMODEL.java */
/* JADX INFO: loaded from: classes10.dex */
public class f1 extends sl.c<DOWNLOADCOMPLETESECONDVIEWMODEL> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public DOWNLOADCOMPLETESECONDVIEWMODEL f73614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<VideoDownloadEntity> f73615c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public VideoDownloadEntity f73616d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ObservableField<String> f73617e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ObservableField<Boolean> f73618f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ul.b f73619g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ul.b f73620h;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        if (this.f73614b.f41097o.get()) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putSerializable("videoDownloadEntry", this.f73616d);
        bundle.putSerializable("videoDownloadList", (Serializable) this.f73615c);
        bundle.putSerializable("flag", Boolean.TRUE);
        this.f73614b.startActivity(DownloadVideoPlayActivity.class, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        if (this.f73614b.f41097o.get()) {
            ObservableField<Boolean> observableField = this.f73618f;
            observableField.set(Boolean.valueOf(!observableField.get().booleanValue()));
            if (this.f73618f.get().booleanValue()) {
                this.f73614b.f41098p.add(this);
            } else {
                this.f73614b.f41098p.remove(this);
            }
        }
    }

    public f1(@NonNull DOWNLOADCOMPLETESECONDVIEWMODEL downloadcompletesecondviewmodel, VideoDownloadEntity videoDownloadEntity, List<VideoDownloadEntity> list) {
        super(downloadcompletesecondviewmodel);
        this.f73617e = new ObservableField<>("");
        this.f73618f = new ObservableField<>(Boolean.FALSE);
        this.f73619g = new ul.b(new ul.a() { // from class: w9.d1
            @Override // ul.a
            public final void call() {
                this.f73594a.c();
            }
        });
        this.f73620h = new ul.b(new ul.a() { // from class: w9.e1
            @Override // ul.a
            public final void call() {
                this.f73606a.d();
            }
        });
        this.f73614b = downloadcompletesecondviewmodel;
        this.f73615c = list;
        this.f73616d = videoDownloadEntity;
        this.f73617e.set(sa.j0.a(videoDownloadEntity.getSize()));
    }
}
