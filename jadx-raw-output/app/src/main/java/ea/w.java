package ea;

import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.databinding.ObservableField;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.netbean.RecommandVideosEntity;
import com.mgs.carparking.ui.homecontent.recommend.HomeRecommendMultipleListViewModel;

/* JADX INFO: compiled from: ItemHomeRecommendMultipleListItemCategoryViewModel.java */
/* JADX INFO: loaded from: classes10.dex */
public class w extends sl.c<HomeRecommendMultipleListViewModel> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecommandVideosEntity f52553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f52554c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Drawable f52555d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ObservableField<SpannableString> f52556e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ObservableField<String> f52557f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ul.b f52558g;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        this.f52553b.setModule_id(this.f52554c);
        ((HomeRecommendMultipleListViewModel) this.f72000a).f41886p.setValue(this.f52553b);
    }

    public w(@NonNull HomeRecommendMultipleListViewModel homeRecommendMultipleListViewModel, RecommandVideosEntity recommandVideosEntity, int i10) {
        super(homeRecommendMultipleListViewModel);
        this.f52556e = new ObservableField<>();
        this.f52557f = new ObservableField<>();
        this.f52558g = new ul.b(new ul.a() { // from class: ea.v
            @Override // ul.a
            public final void call() {
                this.f52552a.b();
            }
        });
        this.f52553b = recommandVideosEntity;
        this.f52554c = i10;
        if (recommandVideosEntity.getType_pid() == 1) {
            if (!em.o.b(recommandVideosEntity.getVod_douban_score())) {
                this.f52556e.set(sa.e.m(recommandVideosEntity.getVod_douban_score()));
            }
        } else if (recommandVideosEntity.getType_pid() != 2 && recommandVideosEntity.getType_pid() != 4) {
            this.f52557f.set(recommandVideosEntity.getCollection_new_title() + "");
        } else if (recommandVideosEntity.getVod_isend() == 1) {
            this.f52557f.set(recommandVideosEntity.getVod_total() + em.r.a().getResources().getString(R.string.text_colections));
        } else {
            this.f52557f.set(em.r.a().getResources().getString(R.string.text_up_colections, recommandVideosEntity.getVod_serial()));
        }
        if (recommandVideosEntity.getIcon_type() == 1) {
            this.f52555d = ContextCompat.getDrawable(homeRecommendMultipleListViewModel.getApplication(), R.drawable.ic_video_hot_play);
        } else if (recommandVideosEntity.getIcon_type() == 2) {
            this.f52555d = ContextCompat.getDrawable(homeRecommendMultipleListViewModel.getApplication(), R.drawable.ic_video_high_score);
        }
    }
}
