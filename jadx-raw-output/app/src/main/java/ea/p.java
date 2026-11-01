package ea;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableList;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.netbean.HomeMultipleEntry;
import com.mgs.carparking.ui.channelcontent.SpecialDetailNewActivity;
import com.mgs.carparking.ui.homecontent.recommend.HomeRecommendMultipleListViewModel;

/* JADX INFO: compiled from: ItemHomeRecommendMultipleCategoryViewModel.java */
/* JADX INFO: loaded from: classes10.dex */
public class p extends sl.e<HomeRecommendMultipleListViewModel> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HomeMultipleEntry f52536c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ObservableList<w> f52537d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public fm.c<w> f52538e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ul.b f52539f;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        Bundle bundle = new Bundle();
        bundle.putInt("id", this.f52536c.getBlock_list().get(0).getTopic_id());
        ((HomeRecommendMultipleListViewModel) this.f72000a).startActivity(SpecialDetailNewActivity.class, bundle);
    }

    public p(@NonNull HomeRecommendMultipleListViewModel homeRecommendMultipleListViewModel, HomeMultipleEntry homeMultipleEntry, String str) {
        super(homeRecommendMultipleListViewModel);
        this.f52537d = new ObservableArrayList();
        this.f52538e = fm.c.d(new fm.d() { // from class: ea.n
            @Override // fm.d
            public final void a(fm.c cVar, int i10, Object obj) {
                cVar.f(7, R.layout.item_home_recommend_multiple_list_item_category);
            }
        });
        this.f52539f = new ul.b(new ul.a() { // from class: ea.o
            @Override // ul.a
            public final void call() {
                this.f52532a.e();
            }
        });
        this.f52536c = homeMultipleEntry;
        this.f72004b = str;
        if (homeMultipleEntry.getBlock_list() != null && homeMultipleEntry.getBlock_list().size() > 0 && homeMultipleEntry.getBlock_list().get(0).getVod_list() != null && homeMultipleEntry.getBlock_list().get(0).getVod_list().size() > 0) {
            this.f52537d.clear();
            for (int i10 = 0; i10 < homeMultipleEntry.getBlock_list().get(0).getVod_list().size(); i10++) {
                this.f52537d.add(new w(homeRecommendMultipleListViewModel, homeMultipleEntry.getBlock_list().get(0).getVod_list().get(i10), homeMultipleEntry.getModule_id()));
            }
        }
    }
}
