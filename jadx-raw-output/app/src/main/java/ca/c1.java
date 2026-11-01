package ca;

import androidx.annotation.NonNull;
import com.mgs.carparking.netbean.BlockListEntry;
import com.mgs.carparking.netbean.RecommandVideosEntity;
import com.mgs.carparking.ui.homecontent.HomeContentMultipleListViewModel;
import java.util.List;
import me.goldze.mvvmhabit.base.bus.event.SingleLiveEvent;

/* JADX INFO: compiled from: ItemHomeContentMultipleSlideViewModel.java */
/* JADX INFO: loaded from: classes2.dex */
public class c1 extends sl.e<HomeContentMultipleListViewModel> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<BlockListEntry> f5715c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SingleLiveEvent<RecommandVideosEntity> f5716d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f5717e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f5718f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ul.b f5719g;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        ((HomeContentMultipleListViewModel) this.f72000a).f41806m.setValue(this.f5716d.getValue());
    }

    public c1(@NonNull HomeContentMultipleListViewModel homeContentMultipleListViewModel, List<BlockListEntry> list, int i10, boolean z10, String str) {
        super(homeContentMultipleListViewModel);
        this.f5716d = new SingleLiveEvent<>();
        this.f5719g = new ul.b(new ul.a() { // from class: ca.b1
            @Override // ul.a
            public final void call() {
                this.f5712a.c();
            }
        });
        this.f5715c = list;
        this.f5717e = i10;
        this.f72004b = str;
        this.f5718f = z10;
    }
}
