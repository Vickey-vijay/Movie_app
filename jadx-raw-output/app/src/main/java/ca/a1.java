package ca;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableList;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.netbean.HomeMultipleEntry;
import com.mgs.carparking.ui.homecontent.HomeContentMultipleListViewModel;

/* JADX INFO: compiled from: ItemHomeContentMultipleNoTitleViewModel.java */
/* JADX INFO: loaded from: classes2.dex */
public class a1 extends sl.e<HomeContentMultipleListViewModel> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HomeMultipleEntry f5707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ObservableList<u0> f5708d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public fm.c<u0> f5709e;

    public a1(@NonNull HomeContentMultipleListViewModel homeContentMultipleListViewModel, HomeMultipleEntry homeMultipleEntry, String str) {
        super(homeContentMultipleListViewModel);
        this.f5708d = new ObservableArrayList();
        this.f5709e = fm.c.d(new fm.d() { // from class: ca.z0
            @Override // fm.d
            public final void a(fm.c cVar, int i10, Object obj) {
                cVar.f(7, R.layout.item_home_recommend_multiple_list_item_no_title);
            }
        });
        this.f5707c = homeMultipleEntry;
        this.f72004b = str;
        if (homeMultipleEntry.getBlock_list().get(0).getVod_list() != null && homeMultipleEntry.getBlock_list().get(0).getVod_list().size() > 0) {
            this.f5708d.clear();
            for (int i10 = 0; i10 < homeMultipleEntry.getBlock_list().get(0).getVod_list().size(); i10++) {
                this.f5708d.add(new u0(homeContentMultipleListViewModel, homeMultipleEntry.getBlock_list().get(0).getVod_list().get(i10), homeMultipleEntry.getModule_id()));
            }
        }
    }
}
