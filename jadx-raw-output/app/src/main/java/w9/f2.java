package w9;

import android.text.SpannableString;
import androidx.annotation.NonNull;
import androidx.databinding.ObservableField;
import com.mgs.carparking.model.SEARCHCONTENTVIDEOVIEWMODEL;

/* JADX INFO: compiled from: ITEMSEARCHEXTENDLISTVIEWMODEL.java */
/* JADX INFO: loaded from: classes10.dex */
public class f2 extends sl.c<SEARCHCONTENTVIDEOVIEWMODEL> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f73621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ObservableField<SpannableString> f73622c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ul.b f73623d;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        ((SEARCHCONTENTVIDEOVIEWMODEL) this.f72000a).f41326h.set(this.f73621b);
        ((SEARCHCONTENTVIDEOVIEWMODEL) this.f72000a).D.b();
    }

    public f2(@NonNull SEARCHCONTENTVIDEOVIEWMODEL searchcontentvideoviewmodel, String str, String str2) {
        super(searchcontentvideoviewmodel);
        this.f73622c = new ObservableField<>();
        this.f73623d = new ul.b(new ul.a() { // from class: w9.e2
            @Override // ul.a
            public final void call() {
                this.f73607a.b();
            }
        });
        this.f73621b = str;
        this.f73622c.set(sa.e.w(str, str2));
    }
}
