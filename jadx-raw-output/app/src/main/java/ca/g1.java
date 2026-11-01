package ca;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableList;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.netbean.BlockListEntry;
import com.mgs.carparking.netbean.HomeMultipleEntry;
import com.mgs.carparking.ui.homecontent.HomeContentMultipleListViewModel;
import java.util.List;

/* JADX INFO: compiled from: ItemHomeContentMultipleSpecialListViewModel.java */
/* JADX INFO: loaded from: classes11.dex */
public class g1 extends sl.e<HomeContentMultipleListViewModel> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HomeMultipleEntry f5736c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List<BlockListEntry> f5737d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f5738e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ObservableList<e1> f5739f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public fm.c<e1> f5740g;

    public g1(@NonNull HomeContentMultipleListViewModel homeContentMultipleListViewModel, HomeMultipleEntry homeMultipleEntry, String str, int i10) {
        super(homeContentMultipleListViewModel);
        this.f5739f = new ObservableArrayList();
        this.f5740g = fm.c.d(new fm.d() { // from class: ca.f1
            @Override // fm.d
            public final void a(fm.c cVar, int i11, Object obj) {
                cVar.f(7, R.layout.item_home_content_multiple_list_item_special_list);
            }
        });
        this.f5736c = homeMultipleEntry;
        this.f72004b = str;
        this.f5737d = homeMultipleEntry.getBlock_list();
        this.f5738e = i10;
        for (int i11 = 0; i11 < this.f5737d.size(); i11++) {
            this.f5739f.add(new e1(homeContentMultipleListViewModel, this.f5737d.get(i11), i10, i11));
        }
    }
}
