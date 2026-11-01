package w9;

import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.databinding.ObservableField;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.model.SPECIALDETAILNEWVIEWMODEL;
import com.mgs.carparking.netbean.RecommandVideosEntity;

/* JADX INFO: compiled from: ITEMSPECIALDETAILNEWVIEWMODEL.java */
/* JADX INFO: loaded from: classes5.dex */
public class w2 extends sl.c<SPECIALDETAILNEWVIEWMODEL> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecommandVideosEntity f73836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Drawable f73837c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ObservableField<SpannableString> f73838d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ObservableField<String> f73839e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ObservableField<String> f73840f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ObservableField<String> f73841g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ObservableField<String> f73842h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ObservableField<String> f73843i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ObservableField<String> f73844j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ul.b f73845k;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        ((SPECIALDETAILNEWVIEWMODEL) this.f72000a).y(this.f73836b);
    }

    public w2(@NonNull SPECIALDETAILNEWVIEWMODEL specialdetailnewviewmodel, RecommandVideosEntity recommandVideosEntity) {
        super(specialdetailnewviewmodel);
        this.f73838d = new ObservableField<>();
        this.f73839e = new ObservableField<>("");
        this.f73840f = new ObservableField<>("");
        this.f73841g = new ObservableField<>("");
        this.f73842h = new ObservableField<>("");
        this.f73843i = new ObservableField<>("");
        this.f73844j = new ObservableField<>();
        this.f73845k = new ul.b(new ul.a() { // from class: w9.v2
            @Override // ul.a
            public final void call() {
                this.f73830a.b();
            }
        });
        this.f73836b = recommandVideosEntity;
        if (recommandVideosEntity.getIcon_type() == 1) {
            this.f73837c = ContextCompat.getDrawable(specialdetailnewviewmodel.getApplication(), R.drawable.ic_video_hot_play);
        } else if (recommandVideosEntity.getIcon_type() == 2) {
            this.f73837c = ContextCompat.getDrawable(specialdetailnewviewmodel.getApplication(), R.drawable.ic_video_high_score);
        }
        if (em.o.b(recommandVideosEntity.getVod_director())) {
            this.f73839e.set(em.r.a().getResources().getString(R.string.text_director) + "：" + em.r.a().getResources().getString(R.string.text_unknow));
        } else {
            this.f73839e.set(em.r.a().getResources().getString(R.string.text_director) + "：" + recommandVideosEntity.getVod_director());
        }
        if (em.o.b(recommandVideosEntity.getVod_actor())) {
            this.f73840f.set(em.r.a().getResources().getString(R.string.text_actor) + "：" + em.r.a().getResources().getString(R.string.text_unknow));
        } else {
            this.f73840f.set(em.r.a().getResources().getString(R.string.text_actor) + "：" + recommandVideosEntity.getVod_actor());
        }
        if (em.o.b(recommandVideosEntity.getVod_year())) {
            this.f73842h.set(em.r.a().getResources().getString(R.string.text_unknow));
        } else {
            this.f73842h.set(recommandVideosEntity.getVod_year());
        }
        if (recommandVideosEntity.getType_pid() == 1) {
            if (!em.o.b(recommandVideosEntity.getVod_douban_score())) {
                this.f73838d.set(sa.e.m(recommandVideosEntity.getVod_douban_score()));
            }
        } else if (recommandVideosEntity.getType_pid() != 2 && recommandVideosEntity.getType_pid() != 4) {
            this.f73844j.set(recommandVideosEntity.getCollection_new_title() + "");
        } else if (recommandVideosEntity.getVod_isend() == 1) {
            this.f73844j.set(recommandVideosEntity.getVod_total() + em.r.a().getResources().getString(R.string.text_colections));
        } else {
            this.f73844j.set(em.r.a().getResources().getString(R.string.text_up_colections, recommandVideosEntity.getVod_serial()));
        }
        if (!em.o.b(recommandVideosEntity.getVod_tag())) {
            this.f73843i.set(recommandVideosEntity.getVod_tag());
        } else {
            this.f73843i.set(em.r.a().getResources().getString(R.string.text_unknow));
        }
    }
}
