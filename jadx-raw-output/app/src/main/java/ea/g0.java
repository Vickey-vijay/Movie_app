package ea;

import android.text.SpannableString;
import androidx.annotation.NonNull;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableList;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.netbean.HomeMultipleEntry;
import com.mgs.carparking.ui.homecontent.recommend.HomeRecommendMultipleListViewModel;

/* JADX INFO: compiled from: ItemHomeRecommendMultipleMultipleViewModel.java */
/* JADX INFO: loaded from: classes9.dex */
public class g0 extends sl.e<HomeRecommendMultipleListViewModel> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HomeMultipleEntry f52491c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ObservableField<String> f52492d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ObservableField<SpannableString> f52493e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ObservableField<String> f52494f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ObservableField<String> f52495g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ObservableField<Boolean> f52496h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ObservableList<a0> f52497i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public fm.c<a0> f52498j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ul.b f52499k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ul.b f52500l;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        if (this.f52491c.getBlock_list().get(0).getVod_info() != null) {
            this.f52491c.getBlock_list().get(0).getVod_info().setModule_id(this.f52491c.getModule_id());
            ((HomeRecommendMultipleListViewModel) this.f72000a).f41886p.setValue(this.f52491c.getBlock_list().get(0).getVod_info());
        }
    }

    public g0(@NonNull HomeRecommendMultipleListViewModel homeRecommendMultipleListViewModel, HomeMultipleEntry homeMultipleEntry, String str) {
        super(homeRecommendMultipleListViewModel);
        this.f52492d = new ObservableField<>();
        this.f52493e = new ObservableField<>();
        this.f52494f = new ObservableField<>();
        this.f52495g = new ObservableField<>();
        Boolean bool = Boolean.FALSE;
        this.f52496h = new ObservableField<>(bool);
        this.f52497i = new ObservableArrayList();
        this.f52498j = fm.c.d(new fm.d() { // from class: ea.d0
            @Override // fm.d
            public final void a(fm.c cVar, int i10, Object obj) {
                cVar.f(7, R.layout.item_home_recommend_multiple_list_item_multiple);
            }
        });
        this.f52499k = new ul.b(new ul.a() { // from class: ea.e0
            @Override // ul.a
            public final void call() {
                this.f52487a.f();
            }
        });
        this.f52500l = new ul.b(new ul.a() { // from class: ea.f0
            @Override // ul.a
            public final void call() {
                this.f52489a.g();
            }
        });
        this.f52491c = homeMultipleEntry;
        this.f72004b = str;
        if (homeMultipleEntry.getBlock_list() != null && homeMultipleEntry.getBlock_list().size() > 0) {
            this.f52497i.clear();
            this.f52492d.set(homeMultipleEntry.getBlock_list().get(0).getBanner_pic());
            this.f52495g.set(homeMultipleEntry.getBlock_list().get(0).getContent());
            if (homeMultipleEntry.getBlock_list().get(0).getVod_info() != null) {
                if (homeMultipleEntry.getBlock_list().get(0).getVod_info().getType_pid() == 1) {
                    this.f52496h.set(Boolean.TRUE);
                    if (!em.o.b(homeMultipleEntry.getBlock_list().get(0).getVod_info().getVod_douban_score())) {
                        this.f52493e.set(sa.e.m(homeMultipleEntry.getBlock_list().get(0).getVod_info().getVod_douban_score()));
                    }
                } else if (homeMultipleEntry.getBlock_list().get(0).getVod_info().getType_pid() != 2 && homeMultipleEntry.getBlock_list().get(0).getVod_info().getType_pid() != 4) {
                    if (homeMultipleEntry.getBlock_list().get(0).getVod_info().getType_pid() == 3) {
                        this.f52494f.set(homeMultipleEntry.getBlock_list().get(0).getVod_info().getCollection_new_title() + "");
                    }
                } else {
                    this.f52496h.set(bool);
                    if (homeMultipleEntry.getBlock_list().get(0).getVod_info().getVod_isend() == 1) {
                        this.f52494f.set(homeMultipleEntry.getBlock_list().get(0).getVod_info().getVod_total() + em.r.a().getResources().getString(R.string.text_colections));
                    } else {
                        this.f52494f.set(em.r.a().getResources().getString(R.string.text_up_colections, homeMultipleEntry.getBlock_list().get(0).getVod_info().getVod_serial()));
                    }
                }
            }
            if (homeMultipleEntry.getBlock_list().size() > 1 && homeMultipleEntry.getBlock_list().get(1).getVod_list() != null && homeMultipleEntry.getBlock_list().get(1).getVod_list().size() > 0) {
                for (int i10 = 0; i10 < homeMultipleEntry.getBlock_list().get(1).getVod_list().size(); i10++) {
                    this.f52497i.add(new a0(homeRecommendMultipleListViewModel, homeMultipleEntry.getBlock_list().get(1).getVod_list().get(i10), homeMultipleEntry.getModule_id()));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g() {
        tl.a.a().b(new x9.r(this.f52491c.getJump_channel_id()));
    }
}
