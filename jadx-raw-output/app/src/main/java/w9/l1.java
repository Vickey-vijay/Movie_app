package w9;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableField;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.model.EXTENSIONRECORDVIEWMODEL;
import com.mgs.carparking.netbean.ExtensionRecordEntry;

/* JADX INFO: compiled from: ITEMEXTENSIONRECORDVIEWMODEL.java */
/* JADX INFO: loaded from: classes10.dex */
public class l1 extends sl.c<EXTENSIONRECORDVIEWMODEL> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ExtensionRecordEntry.InvitedList f73679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ObservableField<String> f73680c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ObservableField<String> f73681d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ObservableField<String> f73682e;

    public l1(@NonNull EXTENSIONRECORDVIEWMODEL extensionrecordviewmodel, ExtensionRecordEntry.InvitedList invitedList) {
        super(extensionrecordviewmodel);
        this.f73680c = new ObservableField<>();
        this.f73681d = new ObservableField<>();
        this.f73682e = new ObservableField<>();
        this.f73679b = invitedList;
        this.f73680c.set(invitedList.getHead_img());
        this.f73681d.set(invitedList.getNickname());
        this.f73682e.set(em.r.a().getResources().getString(R.string.str_extension_histroy_register_time) + invitedList.getCreate_at());
    }
}
