package w9;

import android.text.Html;
import android.text.Spanned;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.databinding.ObservableField;
import com.mgs.carparking.model.VIDEOPLAYDETAILVIEWMODEL;
import com.mgs.carparking.netbean.DiscussListEntry;

/* JADX INFO: compiled from: ITEMCOMMENTVIDEOSECONDVIEWMODEL.java */
/* JADX INFO: loaded from: classes5.dex */
public class u0 extends sl.c<VIDEOPLAYDETAILVIEWMODEL> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public DiscussListEntry f73811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f73812c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f73813d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ObservableField<Spanned> f73814e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f73815f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f73816g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ul.b f73817h;

    public u0(@NonNull VIDEOPLAYDETAILVIEWMODEL videoplaydetailviewmodel, DiscussListEntry discussListEntry, int i10, int i11) {
        super(videoplaydetailviewmodel);
        this.f73814e = new ObservableField<>();
        this.f73815f = "";
        this.f73816g = "";
        this.f73817h = new ul.b(new ul.c() { // from class: w9.t0
            @Override // ul.c
            public final void call(Object obj) {
                this.f73786a.b((View) obj);
            }
        });
        this.f73811b = discussListEntry;
        this.f73812c = i10;
        this.f73813d = i11;
        this.f73815f = "<font color=\"#999999\">" + discussListEntry.getNickname() + "</font>";
        this.f73816g = "<font color=\"#000000\">：" + discussListEntry.getContent() + "</font>";
        this.f73814e.set(Html.fromHtml(this.f73815f + this.f73816g));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        if (sa.o0.T() == this.f73811b.getUser_id()) {
            ((VIDEOPLAYDETAILVIEWMODEL) this.f72000a).S.set(this);
            ((VIDEOPLAYDETAILVIEWMODEL) this.f72000a).R.postValue(view);
        }
    }
}
