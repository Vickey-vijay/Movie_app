package w9;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableField;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.model.ORDERLISTVIEWMODEL;
import com.mgs.carparking.netbean.OrderListEntry;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* JADX INFO: compiled from: ITEMORDERLISTVIEWMODEL.java */
/* JADX INFO: loaded from: classes10.dex */
public class d2 extends sl.c<ORDERLISTVIEWMODEL> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public OrderListEntry f73595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ObservableField<String> f73596c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ObservableField<String> f73597d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ObservableField<String> f73598e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ObservableField<String> f73599f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ObservableField<String> f73600g;

    public d2(@NonNull ORDERLISTVIEWMODEL orderlistviewmodel, OrderListEntry orderListEntry) {
        super(orderlistviewmodel);
        this.f73596c = new ObservableField<>();
        this.f73597d = new ObservableField<>();
        this.f73598e = new ObservableField<>();
        this.f73599f = new ObservableField<>();
        this.f73600g = new ObservableField<>();
        this.f73595b = orderListEntry;
        if (orderListEntry.getPay_status().equals("1")) {
            this.f73598e.set(em.r.a().getResources().getString(R.string.str_order_status1));
        } else {
            this.f73598e.set(em.r.a().getResources().getString(R.string.str_order_status));
        }
        this.f73600g.set(orderListEntry.getTitle());
        this.f73599f.set(orderListEntry.getPrice());
        this.f73597d.set(em.r.a().getResources().getString(R.string.str_order_id) + StringUtils.PROCESS_POSTFIX_DELIMITER + String.valueOf(orderListEntry.getId()));
    }
}
