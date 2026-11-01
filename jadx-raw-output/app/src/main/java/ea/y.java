package ea;

import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.databinding.ObservableField;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.netbean.RecommandVideosEntity;
import com.mgs.carparking.ui.homecontent.recommend.HomeRecommendMultipleListViewModel;

/* JADX INFO: compiled from: ItemHomeRecommendMultipleListItemGusslikeHorizationViewModel.java */
/* JADX INFO: loaded from: classes10.dex */
public class y extends sl.c<HomeRecommendMultipleListViewModel> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecommandVideosEntity f52560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f52561c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Drawable f52562d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ObservableField<SpannableString> f52563e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ObservableField<String> f52564f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ObservableField<Boolean> f52565g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ul.b f52566h;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        if (em.o.b(this.f52560b.getVod_name())) {
            ((HomeRecommendMultipleListViewModel) this.f72000a).s();
        } else {
            this.f52560b.setModule_id(this.f52561c);
            ((HomeRecommendMultipleListViewModel) this.f72000a).f41886p.setValue(this.f52560b);
        }
    }

    public y(@NonNull HomeRecommendMultipleListViewModel homeRecommendMultipleListViewModel, RecommandVideosEntity recommandVideosEntity, int i10) {
        super(homeRecommendMultipleListViewModel);
        this.f52563e = new ObservableField<>();
        this.f52564f = new ObservableField<>();
        Boolean bool = Boolean.FALSE;
        this.f52565g = new ObservableField<>(bool);
        this.f52566h = new ul.b(new ul.a() { // from class: ea.x
            @Override // ul.a
            public final void call() {
                this.f52559a.b();
            }
        });
        this.f52560b = recommandVideosEntity;
        this.f52561c = i10;
        if (em.o.b(recommandVideosEntity.getVod_name())) {
            this.f52565g.set(Boolean.TRUE);
            return;
        }
        this.f52565g.set(bool);
        if (recommandVideosEntity.getType_pid() == 1) {
            if (!em.o.b(recommandVideosEntity.getVod_douban_score())) {
                this.f52563e.set(sa.e.m(recommandVideosEntity.getVod_douban_score()));
            }
        } else if (recommandVideosEntity.getType_pid() != 2 && recommandVideosEntity.getType_pid() != 4) {
            this.f52564f.set(recommandVideosEntity.getCollection_new_title() + "");
        } else if (recommandVideosEntity.getVod_isend() == 1) {
            this.f52564f.set(recommandVideosEntity.getVod_total() + em.r.a().getResources().getString(R.string.text_colections));
        } else {
            this.f52564f.set(em.r.a().getResources().getString(R.string.text_up_colections, recommandVideosEntity.getVod_serial()));
        }
        if (recommandVideosEntity.getIcon_type() == 1) {
            this.f52562d = ContextCompat.getDrawable(homeRecommendMultipleListViewModel.getApplication(), R.drawable.ic_video_hot_play);
        } else if (recommandVideosEntity.getIcon_type() == 2) {
            this.f52562d = ContextCompat.getDrawable(homeRecommendMultipleListViewModel.getApplication(), R.drawable.ic_video_high_score);
        }
    }
}
