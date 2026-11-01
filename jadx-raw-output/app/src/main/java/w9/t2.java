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

/* JADX INFO: compiled from: ITEMSEARCHLISTVARIETYVIEWMODEL.java */
/* JADX INFO: loaded from: classes5.dex */
public class t2 extends sl.e<HOMECONTENTSEARCHLISTVIEWMODEL> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HOMECONTENTSEARCHLISTVIEWMODEL f73788c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RecommandVideosEntity f73789d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ObservableField<SpannableString> f73790e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ObservableField<String> f73791f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ObservableField<SpannableString> f73792g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ObservableField<String> f73793h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ObservableField<String> f73794i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ObservableField<SpannableString> f73795j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ObservableField<String> f73796k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ObservableField<String> f73797l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ObservableField<Boolean> f73798m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ObservableField<String> f73799n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Drawable f73800o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ObservableField<SpannableString> f73801p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ObservableField<String> f73802q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ObservableField<Boolean> f73803r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ul.b f73804s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ul.b f73805t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ul.b f73806u;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        ((HOMECONTENTSEARCHLISTVIEWMODEL) this.f72000a).f41225p.setValue(this.f73789d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        ((HOMECONTENTSEARCHLISTVIEWMODEL) this.f72000a).f41227r.setValue(this.f73789d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g() {
        ((HOMECONTENTSEARCHLISTVIEWMODEL) this.f72000a).f41228s.setValue(this.f73789d);
    }

    public t2(@NonNull HOMECONTENTSEARCHLISTVIEWMODEL homecontentsearchlistviewmodel, RecommandVideosEntity recommandVideosEntity, String str, String str2) {
        super(homecontentsearchlistviewmodel);
        this.f73790e = new ObservableField<>();
        this.f73791f = new ObservableField<>(em.r.a().getResources().getString(R.string.text_zongyi));
        this.f73792g = new ObservableField<>();
        this.f73793h = new ObservableField<>("");
        this.f73794i = new ObservableField<>("");
        this.f73795j = new ObservableField<>();
        this.f73796k = new ObservableField<>("");
        this.f73797l = new ObservableField<>("");
        Boolean bool = Boolean.FALSE;
        this.f73798m = new ObservableField<>(bool);
        this.f73799n = new ObservableField<>();
        this.f73801p = new ObservableField<>();
        this.f73802q = new ObservableField<>();
        this.f73803r = new ObservableField<>(bool);
        this.f73804s = new ul.b(new ul.a() { // from class: w9.q2
            @Override // ul.a
            public final void call() {
                this.f73760a.e();
            }
        });
        this.f73805t = new ul.b(new ul.a() { // from class: w9.r2
            @Override // ul.a
            public final void call() {
                this.f73766a.f();
            }
        });
        this.f73806u = new ul.b(new ul.a() { // from class: w9.s2
            @Override // ul.a
            public final void call() {
                this.f73781a.g();
            }
        });
        this.f73788c = homecontentsearchlistviewmodel;
        this.f72004b = str;
        this.f73789d = recommandVideosEntity;
        this.f73790e.set(sa.e.w(recommandVideosEntity.getVod_name(), str2));
        if (!em.o.b(recommandVideosEntity.getVod_director())) {
            this.f73792g.set(sa.e.w(em.r.a().getResources().getString(R.string.text_director) + "：" + recommandVideosEntity.getVod_director(), str2));
        } else {
            this.f73792g.set(new SpannableString(em.r.a().getResources().getString(R.string.text_director) + "：" + em.r.a().getResources().getString(R.string.text_unknow)));
        }
        this.f73799n.set(recommandVideosEntity.getCollection_new_title());
        this.f73793h.set(recommandVideosEntity.getVod_area() + " · " + recommandVideosEntity.getVod_year());
        if (!em.o.b(recommandVideosEntity.getVod_actor())) {
            this.f73795j.set(sa.e.w(em.r.a().getResources().getString(R.string.text_actor) + "：" + recommandVideosEntity.getVod_actor(), str2));
        } else {
            this.f73795j.set(new SpannableString(em.r.a().getResources().getString(R.string.text_actor) + "：" + em.r.a().getResources().getString(R.string.text_unknow)));
        }
        if (recommandVideosEntity.getIcon_type() == 1) {
            this.f73800o = ContextCompat.getDrawable(homecontentsearchlistviewmodel.getApplication(), R.drawable.ic_video_hot_play);
        } else if (recommandVideosEntity.getIcon_type() == 2) {
            this.f73800o = ContextCompat.getDrawable(homecontentsearchlistviewmodel.getApplication(), R.drawable.ic_video_high_score);
        }
        if (!em.o.b(recommandVideosEntity.getVod_douban_score())) {
            this.f73801p.set(sa.e.m(recommandVideosEntity.getVod_douban_score()));
        }
        if (!TextUtils.isEmpty(recommandVideosEntity.getAudio_language_tag())) {
            this.f73803r.set(Boolean.TRUE);
            this.f73802q.set(recommandVideosEntity.getAudio_language_tag());
        } else {
            this.f73803r.set(bool);
        }
    }
}
