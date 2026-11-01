package ea;

import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.databinding.ObservableField;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.netbean.RecommandVideosEntity;
import com.mgs.carparking.ui.homecontent.recommend.HomeRecommendMultipleListViewModel;

/* JADX INFO: compiled from: ItemHomeRcommendMultipleListItemHotViewModel.java */
/* JADX INFO: loaded from: classes10.dex */
public class j extends sl.c<HomeRecommendMultipleListViewModel> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecommandVideosEntity f52504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Drawable f52505c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ObservableField<SpannableString> f52506d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ObservableField<String> f52507e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f52508f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ul.b f52509g;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        this.f52504b.setModule_id(this.f52508f);
        ((HomeRecommendMultipleListViewModel) this.f72000a).f41886p.setValue(this.f52504b);
    }

    public j(@NonNull HomeRecommendMultipleListViewModel homeRecommendMultipleListViewModel, RecommandVideosEntity recommandVideosEntity, int i10) {
        super(homeRecommendMultipleListViewModel);
        this.f52506d = new ObservableField<>();
        this.f52507e = new ObservableField<>();
        this.f52509g = new ul.b(new ul.a() { // from class: ea.i
            @Override // ul.a
            public final void call() {
                this.f52502a.b();
            }
        });
        this.f52504b = recommandVideosEntity;
        this.f52508f = i10;
        if (recommandVideosEntity.getType_pid() == 1) {
            if (!em.o.b(recommandVideosEntity.getVod_douban_score())) {
                this.f52506d.set(sa.e.m(recommandVideosEntity.getVod_douban_score()));
            }
        } else if (recommandVideosEntity.getType_pid() != 2 && recommandVideosEntity.getType_pid() != 4) {
            this.f52507e.set(recommandVideosEntity.getCollection_new_title() + "");
        } else if (recommandVideosEntity.getVod_isend() == 1) {
            this.f52507e.set(recommandVideosEntity.getVod_total() + em.r.a().getResources().getString(R.string.text_colections));
        } else {
            this.f52507e.set(em.r.a().getResources().getString(R.string.text_up_colections, recommandVideosEntity.getVod_serial()));
        }
        if (recommandVideosEntity.getIcon_type() == 1) {
            this.f52505c = ContextCompat.getDrawable(homeRecommendMultipleListViewModel.getApplication(), R.drawable.ic_video_hot_play);
        } else if (recommandVideosEntity.getIcon_type() == 2) {
            this.f52505c = ContextCompat.getDrawable(homeRecommendMultipleListViewModel.getApplication(), R.drawable.ic_video_high_score);
        }
    }
}
