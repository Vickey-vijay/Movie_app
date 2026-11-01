package w9;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableList;
import com.mgs.carparking.model.FEEDBACKVIEWMODEL;
import com.mgs.carparking.netbean.FeedbackTypeEntry;

/* JADX INFO: compiled from: ITEMFEEDBACKTYPEVIEWMODEL.java */
/* JADX INFO: loaded from: classes4.dex */
public class q1 extends sl.c<FEEDBACKVIEWMODEL> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f73754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public FEEDBACKVIEWMODEL f73755c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public FeedbackTypeEntry f73756d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ObservableField<Boolean> f73757e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ObservableList<q1> f73758f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ul.b f73759g;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        if (this.f73757e.get().booleanValue()) {
            return;
        }
        this.f73757e.set(Boolean.TRUE);
        for (int i10 = 0; i10 < this.f73758f.size(); i10++) {
            if (i10 != this.f73754b) {
                this.f73758f.get(i10).f73757e.set(Boolean.FALSE);
            }
        }
    }

    public q1(@NonNull FEEDBACKVIEWMODEL feedbackviewmodel, FeedbackTypeEntry feedbackTypeEntry, ObservableList<q1> observableList, int i10) {
        super(feedbackviewmodel);
        this.f73757e = new ObservableField<>(Boolean.FALSE);
        this.f73759g = new ul.b(new ul.a() { // from class: w9.p1
            @Override // ul.a
            public final void call() {
                this.f73731a.b();
            }
        });
        this.f73755c = feedbackviewmodel;
        this.f73756d = feedbackTypeEntry;
        this.f73754b = i10;
        this.f73758f = observableList;
        this.f73757e.set(Boolean.valueOf(feedbackTypeEntry.isFlag()));
    }
}
