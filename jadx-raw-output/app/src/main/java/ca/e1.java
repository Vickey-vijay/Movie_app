package ca;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.mgs.carparking.netbean.BlockListEntry;
import com.mgs.carparking.ui.channelcontent.SpecialDetailNewActivity;
import com.mgs.carparking.ui.homecontent.HomeContentMultipleListViewModel;

/* JADX INFO: compiled from: ItemHomeContentMultipleSpecialListItemViewModel.java */
/* JADX INFO: loaded from: classes11.dex */
public class e1 extends sl.c<HomeContentMultipleListViewModel> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BlockListEntry f5726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5727c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5728d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ul.b f5729e;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        Bundle bundle = new Bundle();
        bundle.putInt("id", this.f5726b.getTopic_id());
        ((HomeContentMultipleListViewModel) this.f72000a).startActivity(SpecialDetailNewActivity.class, bundle);
    }

    public e1(@NonNull HomeContentMultipleListViewModel homeContentMultipleListViewModel, BlockListEntry blockListEntry, int i10, int i11) {
        super(homeContentMultipleListViewModel);
        this.f5729e = new ul.b(new ul.a() { // from class: ca.d1
            @Override // ul.a
            public final void call() {
                this.f5722a.b();
            }
        });
        this.f5726b = blockListEntry;
        this.f5727c = i10;
        this.f5728d = i11;
    }
}
