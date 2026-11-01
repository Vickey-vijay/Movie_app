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

/* JADX INFO: compiled from: ITEMSEARCHLISTCOMICVIEWMODEL.java */
/* JADX INFO: loaded from: classes10.dex */
public class k2 extends sl.e<HOMECONTENTSEARCHLISTVIEWMODEL> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HOMECONTENTSEARCHLISTVIEWMODEL f73659c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RecommandVideosEntity f73660d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ObservableField<SpannableString> f73661e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ObservableField<String> f73662f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ObservableField<SpannableString> f73663g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ObservableField<String> f73664h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ObservableField<String> f73665i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ObservableField<SpannableString> f73666j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Drawable f73667k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ObservableField<String> f73668l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ObservableList<u2> f73669m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public fm.c<u2> f73670n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ObservableField<String> f73671o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ObservableField<Boolean> f73672p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ul.b f73673q;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        ((HOMECONTENTSEARCHLISTVIEWMODEL) this.f72000a).f41225p.setValue(this.f73660d);
    }

    public k2(@NonNull HOMECONTENTSEARCHLISTVIEWMODEL homecontentsearchlistviewmodel, RecommandVideosEntity recommandVideosEntity, String str, String str2) {
        super(homecontentsearchlistviewmodel);
        this.f73661e = new ObservableField<>();
        this.f73662f = new ObservableField<>(em.r.a().getResources().getString(R.string.text_dongman));
        this.f73663g = new ObservableField<>();
        this.f73664h = new ObservableField<>("");
        this.f73665i = new ObservableField<>("");
        this.f73666j = new ObservableField<>();
        this.f73668l = new ObservableField<>();
        this.f73669m = new ObservableArrayList();
        this.f73670n = fm.c.d(new fm.d() { // from class: w9.i2
            @Override // fm.d
            public final void a(fm.c cVar, int i10, Object obj) {
                cVar.f(7, R.layout.item_search_tv_set_num);
            }
        });
        this.f73671o = new ObservableField<>();
        Boolean bool = Boolean.FALSE;
        this.f73672p = new ObservableField<>(bool);
        this.f73673q = new ul.b(new ul.a() { // from class: w9.j2
            @Override // ul.a
            public final void call() {
                this.f73653a.e();
            }
        });
        this.f73659c = homecontentsearchlistviewmodel;
        this.f72004b = str;
        this.f73660d = recommandVideosEntity;
        this.f73661e.set(sa.e.w(recommandVideosEntity.getVod_name(), str2));
        if (!em.o.b(recommandVideosEntity.getVod_director())) {
            this.f73663g.set(sa.e.w(em.r.a().getResources().getString(R.string.text_director) + "：" + recommandVideosEntity.getVod_director(), str2));
        } else {
            this.f73663g.set(new SpannableString(em.r.a().getResources().getString(R.string.text_director) + "：" + em.r.a().getResources().getString(R.string.text_unknow)));
        }
        this.f73664h.set(recommandVideosEntity.getVod_area() + " · " + recommandVideosEntity.getVod_year());
        if (!em.o.b(recommandVideosEntity.getVod_actor())) {
            this.f73666j.set(sa.e.w(em.r.a().getResources().getString(R.string.text_actor) + "：" + recommandVideosEntity.getVod_actor(), str2));
        } else {
            this.f73666j.set(new SpannableString(em.r.a().getResources().getString(R.string.text_actor) + "：" + em.r.a().getResources().getString(R.string.text_unknow)));
        }
        if (recommandVideosEntity.getIcon_type() == 1) {
            this.f73667k = ContextCompat.getDrawable(homecontentsearchlistviewmodel.getApplication(), R.drawable.ic_video_hot_play);
        } else if (recommandVideosEntity.getIcon_type() == 2) {
            this.f73667k = ContextCompat.getDrawable(homecontentsearchlistviewmodel.getApplication(), R.drawable.ic_video_high_score);
        }
        if (recommandVideosEntity.getVod_isend() == 1) {
            this.f73668l.set(recommandVideosEntity.getVod_total() + em.r.a().getResources().getString(R.string.text_colections));
        } else {
            this.f73668l.set(em.r.a().getResources().getString(R.string.text_up_colections, recommandVideosEntity.getVod_serial()));
        }
        if (!TextUtils.isEmpty(recommandVideosEntity.getAudio_language_tag())) {
            this.f73672p.set(Boolean.TRUE);
            this.f73671o.set(recommandVideosEntity.getAudio_language_tag());
        } else {
            this.f73672p.set(bool);
        }
    }
}
