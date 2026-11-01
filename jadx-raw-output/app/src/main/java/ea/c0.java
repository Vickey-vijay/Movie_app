package ea;

import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.databinding.ObservableField;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.netbean.RecommandVideosEntity;
import com.mgs.carparking.ui.homecontent.recommend.HomeRecommendMultipleListViewModel;

/* JADX INFO: compiled from: ItemHomeRecommendMultipleListItemNewViewModel.java */
/* JADX INFO: loaded from: classes9.dex */
public class c0 extends sl.c<HomeRecommendMultipleListViewModel> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecommandVideosEntity f52477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f52478c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Drawable f52479d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ObservableField<SpannableString> f52480e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ObservableField<String> f52481f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ObservableField<Boolean> f52482g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ObservableField<String> f52483h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ul.b f52484i;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        this.f52477b.setModule_id(this.f52478c);
        ((HomeRecommendMultipleListViewModel) this.f72000a).f41886p.setValue(this.f52477b);
    }

    public c0(@NonNull HomeRecommendMultipleListViewModel homeRecommendMultipleListViewModel, RecommandVideosEntity recommandVideosEntity, int i10) {
        super(homeRecommendMultipleListViewModel);
        this.f52480e = new ObservableField<>();
        this.f52481f = new ObservableField<>();
        Boolean bool = Boolean.FALSE;
        this.f52482g = new ObservableField<>(bool);
        this.f52483h = new ObservableField<>();
        this.f52484i = new ul.b(new ul.a() { // from class: ea.b0
            @Override // ul.a
            public final void call() {
                this.f52475a.b();
            }
        });
        this.f52477b = recommandVideosEntity;
        this.f52478c = i10;
        if (recommandVideosEntity.getType_pid() == 1) {
            if (!em.o.b(recommandVideosEntity.getVod_douban_score())) {
                this.f52480e.set(sa.e.m(recommandVideosEntity.getVod_douban_score()));
            }
        } else if (recommandVideosEntity.getType_pid() != 2 && recommandVideosEntity.getType_pid() != 4) {
            this.f52483h.set(recommandVideosEntity.getCollection_new_title() + "");
        } else if (recommandVideosEntity.getVod_isend() == 1) {
            this.f52483h.set(recommandVideosEntity.getVod_total() + em.r.a().getResources().getString(R.string.text_colections));
        } else {
            this.f52483h.set(em.r.a().getResources().getString(R.string.text_up_colections, recommandVideosEntity.getVod_serial()));
        }
        if (!TextUtils.isEmpty(recommandVideosEntity.getAudio_language_tag())) {
            this.f52482g.set(Boolean.TRUE);
            this.f52481f.set(recommandVideosEntity.getAudio_language_tag());
        } else {
            this.f52482g.set(bool);
        }
        if (recommandVideosEntity.getIcon_type() == 1) {
            this.f52479d = ContextCompat.getDrawable(homeRecommendMultipleListViewModel.getApplication(), R.drawable.ic_video_hot_play);
        } else if (recommandVideosEntity.getIcon_type() == 2) {
            this.f52479d = ContextCompat.getDrawable(homeRecommendMultipleListViewModel.getApplication(), R.drawable.ic_video_high_score);
        }
    }
}
