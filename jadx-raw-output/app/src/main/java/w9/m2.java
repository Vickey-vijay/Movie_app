package w9;

import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.databinding.ObservableField;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.model.HOMECONTENTSEARCHLISTVIEWMODEL;
import com.mgs.carparking.netbean.RecommandVideosEntity;

/* JADX INFO: compiled from: ITEMSEARCHLISTMOVIEVIEWMODEL.java */
/* JADX INFO: loaded from: classes.dex */
public class m2 extends sl.e<HOMECONTENTSEARCHLISTVIEWMODEL> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HOMECONTENTSEARCHLISTVIEWMODEL f73689c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RecommandVideosEntity f73690d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ObservableField<SpannableString> f73691e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ObservableField<String> f73692f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ObservableField<SpannableString> f73693g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ObservableField<String> f73694h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ObservableField<String> f73695i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ObservableField<SpannableString> f73696j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Drawable f73697k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ObservableField<SpannableString> f73698l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ObservableField<String> f73699m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ObservableField<Boolean> f73700n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ul.b f73701o;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        ((HOMECONTENTSEARCHLISTVIEWMODEL) this.f72000a).f41225p.setValue(this.f73690d);
    }

    public m2(@NonNull HOMECONTENTSEARCHLISTVIEWMODEL homecontentsearchlistviewmodel, RecommandVideosEntity recommandVideosEntity, String str, String str2) {
        super(homecontentsearchlistviewmodel);
        this.f73691e = new ObservableField<>();
        this.f73692f = new ObservableField<>(em.r.a().getResources().getString(R.string.text_movie));
        this.f73693g = new ObservableField<>();
        this.f73694h = new ObservableField<>("");
        this.f73695i = new ObservableField<>("");
        this.f73696j = new ObservableField<>();
        this.f73698l = new ObservableField<>();
        this.f73699m = new ObservableField<>();
        Boolean bool = Boolean.FALSE;
        this.f73700n = new ObservableField<>(bool);
        this.f73701o = new ul.b(new ul.a() { // from class: w9.l2
            @Override // ul.a
            public final void call() {
                this.f73683a.c();
            }
        });
        this.f73689c = homecontentsearchlistviewmodel;
        this.f72004b = str;
        this.f73690d = recommandVideosEntity;
        this.f73691e.set(sa.e.w(recommandVideosEntity.getVod_name(), str2));
        if (!em.o.b(recommandVideosEntity.getVod_director())) {
            this.f73693g.set(sa.e.w(em.r.a().getResources().getString(R.string.text_director) + "：" + recommandVideosEntity.getVod_director(), str2));
        } else {
            this.f73693g.set(new SpannableString(em.r.a().getResources().getString(R.string.text_director) + "：" + em.r.a().getResources().getString(R.string.text_unknow)));
        }
        this.f73694h.set(recommandVideosEntity.getVod_year());
        if (!em.o.b(recommandVideosEntity.getVod_actor())) {
            this.f73696j.set(sa.e.w(em.r.a().getResources().getString(R.string.text_actor) + "：" + recommandVideosEntity.getVod_actor(), str2));
        } else {
            this.f73696j.set(new SpannableString(em.r.a().getResources().getString(R.string.text_actor) + "：" + em.r.a().getResources().getString(R.string.text_unknow)));
        }
        if (recommandVideosEntity.getIcon_type() == 1) {
            this.f73697k = ContextCompat.getDrawable(homecontentsearchlistviewmodel.getApplication(), R.drawable.ic_video_hot_play);
        } else if (recommandVideosEntity.getIcon_type() == 2) {
            this.f73697k = ContextCompat.getDrawable(homecontentsearchlistviewmodel.getApplication(), R.drawable.ic_video_high_score);
        }
        if (!em.o.b(recommandVideosEntity.getVod_douban_score())) {
            this.f73698l.set(sa.e.m(recommandVideosEntity.getVod_douban_score()));
        }
        if (!TextUtils.isEmpty(recommandVideosEntity.getAudio_language_tag())) {
            this.f73700n.set(Boolean.TRUE);
            this.f73699m.set(recommandVideosEntity.getAudio_language_tag());
        } else {
            this.f73700n.set(bool);
        }
    }
}
