package ca;

import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.databinding.ObservableField;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.netbean.RecommandVideosEntity;
import com.mgs.carparking.ui.homecontent.HomeContentMultipleListViewModel;

/* JADX INFO: compiled from: ItemHomeContentMultipleListItemHotViewModel.java */
/* JADX INFO: loaded from: classes11.dex */
public class q0 extends sl.c<HomeContentMultipleListViewModel> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecommandVideosEntity f5770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5771c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Drawable f5772d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ObservableField<SpannableString> f5773e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ObservableField<String> f5774f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ul.b f5775g;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        this.f5770b.setModule_id(this.f5771c);
        ((HomeContentMultipleListViewModel) this.f72000a).f41806m.setValue(this.f5770b);
    }

    public q0(@NonNull HomeContentMultipleListViewModel homeContentMultipleListViewModel, RecommandVideosEntity recommandVideosEntity, int i10) {
        super(homeContentMultipleListViewModel);
        this.f5773e = new ObservableField<>();
        this.f5774f = new ObservableField<>();
        this.f5775g = new ul.b(new ul.a() { // from class: ca.p0
            @Override // ul.a
            public final void call() {
                this.f5768a.b();
            }
        });
        this.f5770b = recommandVideosEntity;
        this.f5771c = i10;
        if (recommandVideosEntity.getType_pid() == 1) {
            if (!em.o.b(recommandVideosEntity.getVod_douban_score())) {
                this.f5773e.set(sa.e.m(recommandVideosEntity.getVod_douban_score()));
            }
        } else if (recommandVideosEntity.getType_pid() != 2 && recommandVideosEntity.getType_pid() != 4) {
            this.f5774f.set(recommandVideosEntity.getCollection_new_title() + "");
        } else if (recommandVideosEntity.getVod_isend() == 1) {
            this.f5774f.set(recommandVideosEntity.getVod_total() + em.r.a().getResources().getString(R.string.text_colections));
        } else {
            this.f5774f.set(em.r.a().getResources().getString(R.string.text_up_colections, recommandVideosEntity.getVod_serial()));
        }
        if (recommandVideosEntity.getIcon_type() == 1) {
            this.f5772d = ContextCompat.getDrawable(homeContentMultipleListViewModel.getApplication(), R.drawable.ic_video_hot_play);
        } else if (recommandVideosEntity.getIcon_type() == 2) {
            this.f5772d = ContextCompat.getDrawable(homeContentMultipleListViewModel.getApplication(), R.drawable.ic_video_high_score);
        }
    }
}
