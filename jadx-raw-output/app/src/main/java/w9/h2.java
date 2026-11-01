package w9;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.model.SEARCHCONTENTVIDEOVIEWMODEL;
import com.mgs.carparking.netbean.HotNewSearchEntry;
import com.mgs.carparking.ui.homecontent.videodetail.VideoPlayDetailActivity;

/* JADX INFO: compiled from: ITEMSEARCHHOTVIEWMODEL.java */
/* JADX INFO: loaded from: classes10.dex */
public class h2 extends sl.c<SEARCHCONTENTVIDEOVIEWMODEL> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public HotNewSearchEntry f73635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Drawable f73636c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ul.b f73637d;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        Bundle bundle = new Bundle();
        bundle.putInt("id", this.f73635b.getVod_id());
        ((SEARCHCONTENTVIDEOVIEWMODEL) this.f72000a).startActivity(VideoPlayDetailActivity.class, bundle);
    }

    public h2(@NonNull SEARCHCONTENTVIDEOVIEWMODEL searchcontentvideoviewmodel, HotNewSearchEntry hotNewSearchEntry) {
        super(searchcontentvideoviewmodel);
        this.f73637d = new ul.b(new ul.a() { // from class: w9.g2
            @Override // ul.a
            public final void call() {
                this.f73629a.b();
            }
        });
        this.f73635b = hotNewSearchEntry;
        if (hotNewSearchEntry.getHot_type() == 1) {
            this.f73636c = ContextCompat.getDrawable(searchcontentvideoviewmodel.getApplication(), R.drawable.ic_search_hot);
        } else if (hotNewSearchEntry.getHot_type() == 2) {
            this.f73636c = ContextCompat.getDrawable(searchcontentvideoviewmodel.getApplication(), R.drawable.ic_search_new);
        } else if (hotNewSearchEntry.getHot_type() == 3) {
            this.f73636c = ContextCompat.getDrawable(searchcontentvideoviewmodel.getApplication(), R.drawable.ic_search_recommd);
        }
    }
}
