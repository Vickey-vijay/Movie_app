package w9;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableField;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.dbtable.VideoLookHistoryEntry;
import com.mgs.carparking.model.HISTORYVIEWMODEL;

/* JADX INFO: compiled from: ITEMHISTORYVIEWMODEL.java */
/* JADX INFO: loaded from: classes5.dex */
public class v1 extends sl.c<HISTORYVIEWMODEL> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public VideoLookHistoryEntry f73824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ObservableField<String> f73825c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ObservableField<Boolean> f73826d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public HISTORYVIEWMODEL f73827e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ul.b f73828f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ul.b f73829g;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        if (this.f73827e.f41206o.get()) {
            ObservableField<Boolean> observableField = this.f73826d;
            observableField.set(Boolean.valueOf(!observableField.get().booleanValue()));
            if (!this.f73826d.get().booleanValue()) {
                this.f73827e.f41210s.remove(this);
                this.f73827e.f41207p.set(em.r.a().getResources().getString(R.string.text_all_select));
            } else {
                this.f73827e.f41210s.add(this);
                if (this.f73827e.f41211t.size() == this.f73827e.f41210s.size()) {
                    this.f73827e.f41207p.set(em.r.a().getResources().getString(R.string.text_unall_select));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        if (this.f73827e.f41206o.get()) {
            return;
        }
        this.f73827e.p(this.f73824b);
    }

    public v1(@NonNull HISTORYVIEWMODEL historyviewmodel, VideoLookHistoryEntry videoLookHistoryEntry) {
        super(historyviewmodel);
        this.f73825c = new ObservableField<>("");
        this.f73826d = new ObservableField<>(Boolean.FALSE);
        this.f73828f = new ul.b(new ul.a() { // from class: w9.t1
            @Override // ul.a
            public final void call() {
                this.f73787a.c();
            }
        });
        this.f73829g = new ul.b(new ul.a() { // from class: w9.u1
            @Override // ul.a
            public final void call() {
                this.f73818a.d();
            }
        });
        this.f73827e = historyviewmodel;
        this.f73824b = videoLookHistoryEntry;
        if (videoLookHistoryEntry.getDuration() - videoLookHistoryEntry.getContentPosition() <= 100) {
            if (videoLookHistoryEntry.getDuration() - videoLookHistoryEntry.getContentPosition() == 0) {
                this.f73825c.set("0% " + em.r.a().getResources().getString(R.string.str_look_time));
                return;
            }
            this.f73825c.set("100% " + em.r.a().getResources().getString(R.string.str_look_time));
            return;
        }
        this.f73825c.set(em.r.a().getResources().getString(R.string.str_leave) + sa.l0.b(videoLookHistoryEntry.getDuration() - videoLookHistoryEntry.getContentPosition()));
    }
}
