package w9;

import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableList;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.model.HOMECONTENTSEARCHLISTVIEWMODEL;
import com.mgs.carparking.netbean.RecommandVideosEntity;

/* JADX INFO: compiled from: ITEMSEARCHLISTTVVIEWMODEL.java */
/* JADX INFO: loaded from: classes4.dex */
public class p2 extends sl.e<HOMECONTENTSEARCHLISTVIEWMODEL> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HOMECONTENTSEARCHLISTVIEWMODEL f73732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RecommandVideosEntity f73733d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ObservableField<SpannableString> f73734e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ObservableField<String> f73735f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ObservableField<SpannableString> f73736g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ObservableField<String> f73737h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ObservableField<String> f73738i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ObservableField<SpannableString> f73739j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ObservableField<String> f73740k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ObservableList<u2> f73741l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public fm.c<u2> f73742m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Drawable f73743n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ObservableField<SpannableString> f73744o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ObservableField<String> f73745p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ObservableField<Boolean> f73746q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ul.b f73747r;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        ((HOMECONTENTSEARCHLISTVIEWMODEL) this.f72000a).f41225p.setValue(this.f73733d);
    }

    public p2(@NonNull HOMECONTENTSEARCHLISTVIEWMODEL homecontentsearchlistviewmodel, RecommandVideosEntity recommandVideosEntity, String str, String str2) {
        super(homecontentsearchlistviewmodel);
        this.f73734e = new ObservableField<>();
        this.f73735f = new ObservableField<>(em.r.a().getResources().getString(R.string.text_tv));
        this.f73736g = new ObservableField<>();
        this.f73737h = new ObservableField<>("");
        this.f73738i = new ObservableField<>("");
        this.f73739j = new ObservableField<>();
        this.f73740k = new ObservableField<>();
        this.f73741l = new ObservableArrayList();
        this.f73742m = fm.c.d(new fm.d() { // from class: w9.n2
            @Override // fm.d
            public final void a(fm.c cVar, int i10, Object obj) {
                cVar.f(7, R.layout.item_search_tv_set_num);
            }
        });
        this.f73744o = new ObservableField<>();
        this.f73745p = new ObservableField<>();
        Boolean bool = Boolean.FALSE;
        this.f73746q = new ObservableField<>(bool);
        this.f73747r = new ul.b(new ul.a() { // from class: w9.o2
            @Override // ul.a
            public final void call() {
                this.f73721a.e();
            }
        });
        this.f73732c = homecontentsearchlistviewmodel;
        this.f72004b = str;
        this.f73733d = recommandVideosEntity;
        this.f73734e.set(sa.e.w(recommandVideosEntity.getVod_name(), str2));
        if (!em.o.b(recommandVideosEntity.getVod_director())) {
            this.f73736g.set(sa.e.w(em.r.a().getResources().getString(R.string.text_director) + "：" + recommandVideosEntity.getVod_director(), str2));
        } else {
            this.f73736g.set(new SpannableString(em.r.a().getResources().getString(R.string.text_director) + "：" + em.r.a().getResources().getString(R.string.text_unknow)));
        }
        this.f73737h.set(recommandVideosEntity.getVod_area() + " · " + recommandVideosEntity.getVod_year());
        if (!em.o.b(recommandVideosEntity.getVod_actor())) {
            this.f73739j.set(sa.e.w(em.r.a().getResources().getString(R.string.text_actor) + "：" + recommandVideosEntity.getVod_actor(), str2));
        } else {
            this.f73739j.set(new SpannableString(em.r.a().getResources().getString(R.string.text_actor) + "：" + em.r.a().getResources().getString(R.string.text_unknow)));
        }
        if (recommandVideosEntity.getIcon_type() == 1) {
            this.f73743n = ContextCompat.getDrawable(homecontentsearchlistviewmodel.getApplication(), R.drawable.ic_video_hot_play);
        } else if (recommandVideosEntity.getIcon_type() == 2) {
            this.f73743n = ContextCompat.getDrawable(homecontentsearchlistviewmodel.getApplication(), R.drawable.ic_video_high_score);
        }
        if (recommandVideosEntity.getVod_isend() == 1) {
            this.f73740k.set(recommandVideosEntity.getVod_total() + em.r.a().getResources().getString(R.string.text_colections));
        } else {
            this.f73740k.set(em.r.a().getResources().getString(R.string.text_up_colections, recommandVideosEntity.getVod_serial()));
        }
        if (!TextUtils.isEmpty(recommandVideosEntity.getAudio_language_tag())) {
            this.f73746q.set(Boolean.TRUE);
            this.f73745p.set(recommandVideosEntity.getAudio_language_tag());
        } else {
            this.f73746q.set(bool);
        }
    }
}
