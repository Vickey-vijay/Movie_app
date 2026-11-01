package pa;

import android.text.SpannableString;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableField;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.dbtable.VideoLookHistoryEntry;
import com.mgs.carparking.netbean.RecommandVideosEntity;
import com.mgs.carparking.ui.ranklist.RankContentListViewModel;
import em.r;
import sa.l0;

/* JADX INFO: compiled from: ItemRankContentMutipleNextViewModel.java */
/* JADX INFO: loaded from: classes3.dex */
public class f extends sl.e<RankContentListViewModel> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RecommandVideosEntity f66082c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f66083d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f66084e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ObservableField<String> f66085f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ObservableField<String> f66086g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ObservableField<String> f66087h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ObservableField<String> f66088i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ObservableField<String> f66089j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ObservableField<String> f66090k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ObservableField<String> f66091l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ObservableField<SpannableString> f66092m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ObservableField<String> f66093n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ObservableBoolean f66094o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ObservableField<String> f66095p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ObservableField<Boolean> f66096q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ul.b f66097r;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        ((RankContentListViewModel) this.f72000a).f42159r.setValue(this.f66082c);
    }

    public f(@NonNull RankContentListViewModel rankContentListViewModel, RecommandVideosEntity recommandVideosEntity, String str, int i10, int i11, int i12, VideoLookHistoryEntry videoLookHistoryEntry) {
        super(rankContentListViewModel);
        this.f66085f = new ObservableField<>("");
        this.f66086g = new ObservableField<>("");
        this.f66087h = new ObservableField<>("");
        this.f66088i = new ObservableField<>("");
        this.f66089j = new ObservableField<>("");
        this.f66090k = new ObservableField<>("");
        this.f66091l = new ObservableField<>();
        this.f66092m = new ObservableField<>();
        this.f66093n = new ObservableField<>();
        this.f66094o = new ObservableBoolean(false);
        this.f66095p = new ObservableField<>();
        Boolean bool = Boolean.FALSE;
        this.f66096q = new ObservableField<>(bool);
        this.f66097r = new ul.b(new ul.a() { // from class: pa.e
            @Override // ul.a
            public final void call() {
                this.f66081a.c();
            }
        });
        this.f72004b = str;
        this.f66082c = recommandVideosEntity;
        this.f66083d = i10;
        this.f66084e = i11;
        if (videoLookHistoryEntry != null) {
            this.f66094o.set(true);
            this.f66093n.set(l0.d(videoLookHistoryEntry.getContentPosition(), videoLookHistoryEntry.getDuration()));
        } else {
            this.f66094o.set(false);
        }
        this.f66090k.set((i11 + 1 + ((i10 - 1) * 20)) + "");
        if (em.o.b(recommandVideosEntity.getVod_director())) {
            this.f66085f.set(r.a().getResources().getString(R.string.text_director) + "：" + r.a().getResources().getString(R.string.text_unknow));
        } else {
            this.f66085f.set(r.a().getResources().getString(R.string.text_director) + "：" + recommandVideosEntity.getVod_director());
        }
        if (em.o.b(recommandVideosEntity.getVod_actor())) {
            this.f66086g.set(r.a().getResources().getString(R.string.text_actor) + "：" + r.a().getResources().getString(R.string.text_unknow));
        } else {
            this.f66086g.set(r.a().getResources().getString(R.string.text_actor) + "：" + recommandVideosEntity.getVod_actor());
        }
        if (em.o.b(recommandVideosEntity.getVod_tag())) {
            this.f66089j.set(r.a().getResources().getString(R.string.text_unknow));
        } else {
            this.f66089j.set(recommandVideosEntity.getVod_tag());
        }
        if (em.o.b(recommandVideosEntity.getVod_year())) {
            this.f66088i.set(r.a().getResources().getString(R.string.text_unknow));
        } else {
            this.f66088i.set(recommandVideosEntity.getVod_year());
        }
        if (recommandVideosEntity.getType_pid() == 1) {
            if (!em.o.b(recommandVideosEntity.getVod_douban_score())) {
                this.f66092m.set(sa.e.m(recommandVideosEntity.getVod_douban_score()));
            }
        } else if (recommandVideosEntity.getType_pid() != 2 && recommandVideosEntity.getType_pid() != 4) {
            this.f66091l.set(recommandVideosEntity.getCollection_new_title() + "");
        } else if (recommandVideosEntity.getVod_isend() == 1) {
            this.f66091l.set(recommandVideosEntity.getVod_total() + r.a().getResources().getString(R.string.text_colections));
        } else {
            this.f66091l.set(r.a().getResources().getString(R.string.text_up_colections, recommandVideosEntity.getVod_serial()));
        }
        if (!TextUtils.isEmpty(recommandVideosEntity.getAudio_language_tag())) {
            this.f66096q.set(Boolean.TRUE);
            this.f66095p.set(recommandVideosEntity.getAudio_language_tag());
        } else {
            this.f66096q.set(bool);
        }
    }
}
