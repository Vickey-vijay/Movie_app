package ea;

import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.databinding.ObservableField;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.netbean.RecommandVideosEntity;
import com.mgs.carparking.ui.homecontent.recommend.HomeRecommendMultipleListViewModel;

/* JADX INFO: compiled from: ItemHomeRecommendGussLikeViewModel.java */
/* JADX INFO: loaded from: classes10.dex */
public class l extends sl.e<HomeRecommendMultipleListViewModel> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RecommandVideosEntity f52518c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ObservableField<SpannableString> f52519d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ObservableField<SpannableString> f52520e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ObservableField<String> f52521f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ObservableField<Boolean> f52522g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Drawable f52523h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ul.b f52524i;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        ((HomeRecommendMultipleListViewModel) this.f72000a).f41886p.setValue(this.f52518c);
    }

    public l(@NonNull HomeRecommendMultipleListViewModel homeRecommendMultipleListViewModel, RecommandVideosEntity recommandVideosEntity, String str) {
        super(homeRecommendMultipleListViewModel);
        this.f52519d = new ObservableField<>();
        this.f52520e = new ObservableField<>();
        this.f52521f = new ObservableField<>();
        this.f52522g = new ObservableField<>();
        this.f52524i = new ul.b(new ul.a() { // from class: ea.k
            @Override // ul.a
            public final void call() {
                this.f52511a.c();
            }
        });
        this.f52518c = recommandVideosEntity;
        this.f72004b = str;
        if (recommandVideosEntity.getIcon_type() == 1) {
            this.f52523h = ContextCompat.getDrawable(homeRecommendMultipleListViewModel.getApplication(), R.drawable.ic_video_hot_play);
        } else if (recommandVideosEntity.getIcon_type() == 2) {
            this.f52523h = ContextCompat.getDrawable(homeRecommendMultipleListViewModel.getApplication(), R.drawable.ic_video_high_score);
        }
        if (recommandVideosEntity.getType_pid() == 1) {
            this.f52519d.set(sa.k0.a(homeRecommendMultipleListViewModel.getApplication(), recommandVideosEntity.getVod_actor(), R.drawable.ic_video_movie));
        } else if (recommandVideosEntity.getType_pid() == 2) {
            this.f52519d.set(sa.k0.a(homeRecommendMultipleListViewModel.getApplication(), recommandVideosEntity.getVod_actor(), R.drawable.ic_video_tv));
        } else if (recommandVideosEntity.getType_pid() == 4) {
            this.f52519d.set(sa.k0.a(homeRecommendMultipleListViewModel.getApplication(), recommandVideosEntity.getVod_actor(), R.drawable.ic_video_comic));
        } else if (recommandVideosEntity.getType_pid() == 3) {
            this.f52519d.set(sa.k0.a(homeRecommendMultipleListViewModel.getApplication(), recommandVideosEntity.getVod_actor(), R.drawable.ic_video_variety));
        }
        if (recommandVideosEntity.getType_pid() == 1) {
            if (!em.o.b(recommandVideosEntity.getVod_douban_score())) {
                this.f52520e.set(sa.e.m(recommandVideosEntity.getVod_douban_score()));
            }
        } else if (recommandVideosEntity.getType_pid() != 2 && recommandVideosEntity.getType_pid() != 4) {
            this.f52521f.set(recommandVideosEntity.getCollection_new_title() + "");
        } else if (recommandVideosEntity.getVod_isend() == 1) {
            this.f52521f.set(recommandVideosEntity.getVod_total() + em.r.a().getResources().getString(R.string.text_colections));
        } else {
            this.f52521f.set(em.r.a().getResources().getString(R.string.text_up_colections, recommandVideosEntity.getVod_serial()));
        }
        if (em.o.b(recommandVideosEntity.getRemarks())) {
            this.f52522g.set(Boolean.FALSE);
        } else {
            this.f52522g.set(Boolean.TRUE);
        }
    }
}
