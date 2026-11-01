package com.mgs.carparking.model;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableList;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.netbean.FeedbackRecordEntry;
import com.mgs.carparking.ui.toolbar.ToolbarViewModel;
import em.r;
import fm.c;
import fm.d;
import ii.u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import me.goldze.mvvmhabit.base.bus.event.SingleLiveEvent;
import me.goldze.mvvmhabit.http.BaseResponse;
import sl.e;
import w9.l;
import w9.o1;
import x9.n;

/* JADX INFO: loaded from: classes5.dex */
public class FEEDBACKRECORDVIEWMODEL extends ToolbarViewModel<n9.a> {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ObservableField<Boolean> f41181o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ObservableField<Boolean> f41182p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ObservableField<Boolean> f41183q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public SingleLiveEvent<String> f41184r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ObservableList<e> f41185s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public c<e> f41186t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ul.b f41187u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ul.b f41188v;

    public class a implements d<e> {
        public a() {
        }

        @Override // fm.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(c cVar, int i10, e eVar) {
            String strValueOf = String.valueOf(eVar.a());
            if (strValueOf.equals("TYPE_FEEDBACK_FIRST")) {
                cVar.f(7, R.layout.item_feedback_record_first);
            } else if (strValueOf.equals("TYPE_FEEDBACK_NEXT")) {
                cVar.f(7, R.layout.item_feedback_record);
            }
        }
    }

    public class b implements u<BaseResponse<List<FeedbackRecordEntry>>> {
        public b() {
        }

        @Override // ii.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<List<FeedbackRecordEntry>> baseResponse) {
            FEEDBACKRECORDVIEWMODEL.this.c();
            if (baseResponse.isOk()) {
                if (baseResponse.getResult() == null || baseResponse.getResult().size() <= 0) {
                    FEEDBACKRECORDVIEWMODEL.this.f41182p.set(Boolean.TRUE);
                    ObservableField<Boolean> observableField = FEEDBACKRECORDVIEWMODEL.this.f41181o;
                    Boolean bool = Boolean.FALSE;
                    observableField.set(bool);
                    FEEDBACKRECORDVIEWMODEL.this.f41183q.set(bool);
                    return;
                }
                ObservableField<Boolean> observableField2 = FEEDBACKRECORDVIEWMODEL.this.f41182p;
                Boolean bool2 = Boolean.FALSE;
                observableField2.set(bool2);
                FEEDBACKRECORDVIEWMODEL.this.f41181o.set(bool2);
                FEEDBACKRECORDVIEWMODEL.this.f41183q.set(Boolean.TRUE);
                FEEDBACKRECORDVIEWMODEL.this.q(baseResponse.getResult());
            }
        }

        @Override // ii.u
        public void onError(Throwable th2) {
            FEEDBACKRECORDVIEWMODEL.this.c();
            ObservableField<Boolean> observableField = FEEDBACKRECORDVIEWMODEL.this.f41182p;
            Boolean bool = Boolean.FALSE;
            observableField.set(bool);
            FEEDBACKRECORDVIEWMODEL.this.f41181o.set(Boolean.TRUE);
            FEEDBACKRECORDVIEWMODEL.this.f41183q.set(bool);
        }

        @Override // ii.u
        public void onSubscribe(mi.b bVar) {
            FEEDBACKRECORDVIEWMODEL.this.b(bVar);
        }
    }

    public void q(List<FeedbackRecordEntry> list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            arrayList.add(new o1(this, list.get(i10), "TYPE_FEEDBACK_NEXT", i10));
        }
        this.f41185s.addAll(arrayList);
    }

    public FEEDBACKRECORDVIEWMODEL(@NonNull Application application, n9.a aVar) {
        super(application, aVar);
        Boolean bool = Boolean.FALSE;
        this.f41181o = new ObservableField<>(bool);
        this.f41182p = new ObservableField<>(bool);
        this.f41183q = new ObservableField<>(bool);
        this.f41184r = new SingleLiveEvent<>();
        this.f41185s = new ObservableArrayList();
        this.f41186t = c.d(new a());
        this.f41187u = new ul.b(new ul.a() { // from class: w9.a0
            @Override // ul.a
            public final void call() {
                this.f73552a.r();
            }
        });
        this.f41188v = new ul.b(new ul.a() { // from class: w9.b0
            @Override // ul.a
            public final void call() {
                this.f73563a.s();
            }
        });
        this.f42194g.set(r.a().getResources().getString(R.string.str_feedback_histroy));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s() {
        d();
    }

    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void r() {
        tl.a.a().c(new n(false));
        j();
        ((n9.a) this.f64407b).Q(new HashMap()).e(new l()).e(new w9.c()).b(new b());
    }
}
