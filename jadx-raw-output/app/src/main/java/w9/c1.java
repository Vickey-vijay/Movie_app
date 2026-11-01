package w9;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.databinding.ObservableField;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.dbtable.VideoDownloadEntity;
import com.mgs.carparking.model.DOWNLOADCOMPLETEVIEWMODEL;
import com.mgs.carparking.ui.mine.DownloadCompleteSecondActivity;
import com.mgs.carparking.ui.mine.DownloadVideoPlayActivity;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: compiled from: ITEMDOWNLOADCOMPLETEVIEWMODEL.java */
/* JADX INFO: loaded from: classes10.dex */
public class c1 extends sl.c<DOWNLOADCOMPLETEVIEWMODEL> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ObservableField<Boolean> f73570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public DOWNLOADCOMPLETEVIEWMODEL f73571c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List<VideoDownloadEntity> f73572d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ObservableField<String> f73573e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ObservableField<String> f73574f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ObservableField<String> f73575g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ul.b f73576h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ul.b f73577i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ul.b f73578j;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        this.f73572d.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        if (this.f73571c.f41107h.get()) {
            ObservableField<Boolean> observableField = this.f73570b;
            observableField.set(Boolean.valueOf(!observableField.get().booleanValue()));
            if (!this.f73570b.get().booleanValue()) {
                this.f73571c.f41110k.remove(this);
                this.f73571c.f41108i.set(em.r.a().getResources().getString(R.string.text_all_select));
            } else {
                this.f73571c.f41110k.add(this);
                if (this.f73571c.f41111l.size() == this.f73571c.f41110k.size()) {
                    this.f73571c.f41108i.set(em.r.a().getResources().getString(R.string.text_unall_select));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        if (this.f73572d.size() > 1) {
            Bundle bundle = new Bundle();
            bundle.putSerializable("entityList", (Serializable) this.f73572d);
            this.f73571c.startActivity(DownloadCompleteSecondActivity.class, bundle);
        } else {
            Bundle bundle2 = new Bundle();
            bundle2.putSerializable("videoDownloadEntry", this.f73572d.get(0));
            bundle2.putBoolean("flag", false);
            this.f73571c.startActivity(DownloadVideoPlayActivity.class, bundle2);
        }
    }

    public c1(@NonNull DOWNLOADCOMPLETEVIEWMODEL downloadcompleteviewmodel, List<VideoDownloadEntity> list) {
        super(downloadcompleteviewmodel);
        this.f73570b = new ObservableField<>(Boolean.FALSE);
        this.f73573e = new ObservableField<>("");
        this.f73574f = new ObservableField<>("");
        this.f73575g = new ObservableField<>("");
        this.f73576h = new ul.b(new ul.a() { // from class: w9.z0
            @Override // ul.a
            public final void call() {
                this.f73901a.d();
            }
        });
        this.f73577i = new ul.b(new ul.a() { // from class: w9.a1
            @Override // ul.a
            public final void call() {
                this.f73553a.e();
            }
        });
        this.f73578j = new ul.b(new ul.a() { // from class: w9.b1
            @Override // ul.a
            public final void call() {
                this.f73564a.f();
            }
        });
        this.f73571c = downloadcompleteviewmodel;
        this.f73572d = list;
        if (list.size() > 0) {
            if (list.size() == 1) {
                this.f73575g.set("");
                this.f73574f.set(list.get(0).getComplete_name());
            } else {
                this.f73575g.set(list.size() + em.r.a().getResources().getString(R.string.text_colections));
                this.f73574f.set(list.get(0).getName());
            }
        }
        long size = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            size += list.get(i10).getSize();
        }
        this.f73573e.set(sa.j0.a(size));
    }
}
