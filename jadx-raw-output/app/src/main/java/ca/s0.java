package ca;

import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.databinding.ObservableField;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.netbean.RecommandVideosEntity;
import com.mgs.carparking.ui.homecontent.HomeContentMultipleListViewModel;

/* JADX INFO: compiled from: ItemHomeContentMultipleListItemNewViewModel.java */
/* JADX INFO: loaded from: classes11.dex */
public class s0 extends sl.c<HomeContentMultipleListViewModel> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecommandVideosEntity f5779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5780c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Drawable f5781d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ObservableField<SpannableString> f5782e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ObservableField<String> f5783f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ObservableField<Boolean> f5784g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ObservableField<String> f5785h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ul.b f5786i;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        this.f5779b.setModule_id(this.f5780c);
        ((HomeContentMultipleListViewModel) this.f72000a).f41806m.setValue(this.f5779b);
    }

    public s0(@NonNull HomeContentMultipleListViewModel homeContentMultipleListViewModel, RecommandVideosEntity recommandVideosEntity, int i10) {
        super(homeContentMultipleListViewModel);
        this.f5782e = new ObservableField<>();
        this.f5783f = new ObservableField<>();
        Boolean bool = Boolean.FALSE;
        this.f5784g = new ObservableField<>(bool);
        this.f5785h = new ObservableField<>();
        this.f5786i = new ul.b(new ul.a() { // from class: ca.r0
            @Override // ul.a
            public final void call() {
                this.f5777a.b();
            }
        });
        this.f5779b = recommandVideosEntity;
        this.f5780c = i10;
        if (recommandVideosEntity.getType_pid() == 1) {
            if (!em.o.b(recommandVideosEntity.getVod_douban_score())) {
                this.f5782e.set(sa.e.m(recommandVideosEntity.getVod_douban_score()));
            }
        } else if (recommandVideosEntity.getType_pid() != 2 && recommandVideosEntity.getType_pid() != 4) {
            this.f5785h.set(recommandVideosEntity.getCollection_new_title() + "");
        } else if (recommandVideosEntity.getVod_isend() == 1) {
            this.f5785h.set(recommandVideosEntity.getVod_total() + em.r.a().getResources().getString(R.string.text_colections));
        } else {
            this.f5785h.set(em.r.a().getResources().getString(R.string.text_up_colections, recommandVideosEntity.getVod_serial()));
        }
        if (!TextUtils.isEmpty(recommandVideosEntity.getAudio_language_tag())) {
            this.f5784g.set(Boolean.TRUE);
            this.f5783f.set(recommandVideosEntity.getAudio_language_tag());
        } else {
            this.f5784g.set(bool);
        }
        if (recommandVideosEntity.getIcon_type() == 1) {
            this.f5781d = ContextCompat.getDrawable(homeContentMultipleListViewModel.getApplication(), R.drawable.ic_video_hot_play);
        } else if (recommandVideosEntity.getIcon_type() == 2) {
            this.f5781d = ContextCompat.getDrawable(homeContentMultipleListViewModel.getApplication(), R.drawable.ic_video_high_score);
        }
    }
}
