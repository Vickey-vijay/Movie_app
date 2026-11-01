package ea;

import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.databinding.ObservableField;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.netbean.RecommandVideosEntity;
import com.mgs.carparking.ui.homecontent.recommend.HomeRecommendMultipleListViewModel;

/* JADX INFO: compiled from: ItemHomeRecommendMultipleListItemMultipleViewModel.java */
/* JADX INFO: loaded from: classes9.dex */
public class a0 extends sl.c<HomeRecommendMultipleListViewModel> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecommandVideosEntity f52468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f52469c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Drawable f52470d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ObservableField<SpannableString> f52471e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ObservableField<String> f52472f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ul.b f52473g;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        this.f52468b.setModule_id(this.f52469c);
        ((HomeRecommendMultipleListViewModel) this.f72000a).f41886p.setValue(this.f52468b);
    }

    public a0(@NonNull HomeRecommendMultipleListViewModel homeRecommendMultipleListViewModel, RecommandVideosEntity recommandVideosEntity, int i10) {
        super(homeRecommendMultipleListViewModel);
        this.f52471e = new ObservableField<>();
        this.f52472f = new ObservableField<>();
        this.f52473g = new ul.b(new ul.a() { // from class: ea.z
            @Override // ul.a
            public final void call() {
                this.f52567a.b();
            }
        });
        this.f52468b = recommandVideosEntity;
        this.f52469c = i10;
        if (recommandVideosEntity.getType_pid() == 1) {
            if (!em.o.b(recommandVideosEntity.getVod_douban_score())) {
                this.f52471e.set(sa.e.m(recommandVideosEntity.getVod_douban_score()));
            }
        } else if (recommandVideosEntity.getType_pid() != 2 && recommandVideosEntity.getType_pid() != 4) {
            this.f52472f.set(recommandVideosEntity.getCollection_new_title() + "");
        } else if (recommandVideosEntity.getVod_isend() == 1) {
            this.f52472f.set(recommandVideosEntity.getVod_total() + em.r.a().getResources().getString(R.string.text_colections));
        } else {
            this.f52472f.set(em.r.a().getResources().getString(R.string.text_up_colections, recommandVideosEntity.getVod_serial()));
        }
        if (recommandVideosEntity.getIcon_type() == 1) {
            this.f52470d = ContextCompat.getDrawable(homeRecommendMultipleListViewModel.getApplication(), R.drawable.ic_video_hot_play);
        } else if (recommandVideosEntity.getIcon_type() == 2) {
            this.f52470d = ContextCompat.getDrawable(homeRecommendMultipleListViewModel.getApplication(), R.drawable.ic_video_high_score);
        }
    }
}
