package w9;

import android.text.SpannableString;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.databinding.ObservableField;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.model.LOOKCHANNELVIEWMODEL;
import com.mgs.carparking.netbean.RecommandVideosEntity;

/* JADX INFO: compiled from: ITEMLOOKCHANNELSEARCHRESULTVIEWMODEL.java */
/* JADX INFO: loaded from: classes5.dex */
public class y1 extends sl.c<LOOKCHANNELVIEWMODEL> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecommandVideosEntity f73880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ObservableField<SpannableString> f73881c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ObservableField<String> f73882d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ObservableField<String> f73883e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ObservableField<String> f73884f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ObservableField<Boolean> f73885g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ul.b f73886h;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        ((LOOKCHANNELVIEWMODEL) this.f72000a).W(this.f73880b);
    }

    public y1(@NonNull LOOKCHANNELVIEWMODEL lookchannelviewmodel, RecommandVideosEntity recommandVideosEntity) {
        super(lookchannelviewmodel);
        this.f73881c = new ObservableField<>();
        this.f73882d = new ObservableField<>();
        this.f73883e = new ObservableField<>();
        this.f73884f = new ObservableField<>();
        Boolean bool = Boolean.FALSE;
        this.f73885g = new ObservableField<>(bool);
        this.f73886h = new ul.b(new ul.a() { // from class: w9.x1
            @Override // ul.a
            public final void call() {
                this.f73850a.b();
            }
        });
        this.f73880b = recommandVideosEntity;
        if (recommandVideosEntity.getType_pid() == 1) {
            if (!em.o.b(recommandVideosEntity.getVod_douban_score())) {
                this.f73881c.set(sa.e.m(recommandVideosEntity.getVod_douban_score()));
            }
        } else if (recommandVideosEntity.getType_pid() != 2 && recommandVideosEntity.getType_pid() != 4) {
            this.f73882d.set(recommandVideosEntity.getCollection_new_title() + "");
        } else if (recommandVideosEntity.getVod_isend() == 1) {
            this.f73882d.set(recommandVideosEntity.getVod_total() + em.r.a().getResources().getString(R.string.text_colections));
        } else {
            this.f73882d.set(em.r.a().getResources().getString(R.string.text_up_colections, recommandVideosEntity.getVod_serial()));
        }
        if (!TextUtils.isEmpty(recommandVideosEntity.getAudio_language_tag())) {
            this.f73885g.set(Boolean.TRUE);
            this.f73884f.set(recommandVideosEntity.getAudio_language_tag());
        } else {
            this.f73885g.set(bool);
        }
    }
}
