package ea;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableList;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.netbean.HomeMultipleEntry;
import com.mgs.carparking.ui.homecontent.more.VideoMoreListActivity;
import com.mgs.carparking.ui.homecontent.recommend.HomeRecommendMultipleListViewModel;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* JADX INFO: compiled from: ItemHomeRecommendMultipleNewViewModel.java */
/* JADX INFO: loaded from: classes8.dex */
public class k0 extends sl.e<HomeRecommendMultipleListViewModel> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f52512c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HomeMultipleEntry f52513d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ObservableList<c0> f52514e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public fm.c<c0> f52515f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ul.b f52516g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ul.b f52517h;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        Bundle bundle = new Bundle();
        bundle.putString("videoTitle", this.f52513d.getModule_name());
        bundle.putInt("videoModuleId", this.f52513d.getBlock_list().get(0).getTopic_id());
        ((HomeRecommendMultipleListViewModel) this.f72000a).startActivity(VideoMoreListActivity.class, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g() {
        ((HomeRecommendMultipleListViewModel) this.f72000a).r(this, this.f52513d.getBlock_list().get(0).getTopic_id(), this.f52514e, this.f52512c, this.f52513d.getModule_id());
    }

    public k0(@NonNull HomeRecommendMultipleListViewModel homeRecommendMultipleListViewModel, HomeMultipleEntry homeMultipleEntry, String str) {
        super(homeRecommendMultipleListViewModel);
        this.f52514e = new ObservableArrayList();
        this.f52515f = fm.c.d(new fm.d() { // from class: ea.h0
            @Override // fm.d
            public final void a(fm.c cVar, int i10, Object obj) {
                cVar.f(7, R.layout.item_home_recommend_multiple_list_item_new);
            }
        });
        this.f52516g = new ul.b(new ul.a() { // from class: ea.i0
            @Override // ul.a
            public final void call() {
                this.f52503a.f();
            }
        });
        this.f52517h = new ul.b(new ul.a() { // from class: ea.j0
            @Override // ul.a
            public final void call() {
                this.f52510a.g();
            }
        });
        this.f52513d = homeMultipleEntry;
        this.f72004b = str;
        if (homeMultipleEntry.getBlock_list() != null && homeMultipleEntry.getBlock_list().size() > 0 && homeMultipleEntry.getBlock_list().get(0).getVod_list() != null && homeMultipleEntry.getBlock_list().get(0).getVod_list().size() > 0) {
            this.f52514e.clear();
            this.f52512c = "";
            for (int i10 = 0; i10 < homeMultipleEntry.getBlock_list().get(0).getVod_list().size(); i10++) {
                if (i10 == homeMultipleEntry.getBlock_list().get(0).getVod_list().size() - 1) {
                    this.f52512c += homeMultipleEntry.getBlock_list().get(0).getVod_list().get(i10).getId();
                } else {
                    this.f52512c += homeMultipleEntry.getBlock_list().get(0).getVod_list().get(i10).getId() + StringUtils.COMMA;
                }
                this.f52514e.add(new c0(homeRecommendMultipleListViewModel, homeMultipleEntry.getBlock_list().get(0).getVod_list().get(i10), homeMultipleEntry.getModule_id()));
            }
        }
    }
}
