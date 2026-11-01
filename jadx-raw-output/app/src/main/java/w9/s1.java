package w9;

import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.databinding.ObservableField;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.model.VIDEOPLAYDETAILVIEWMODEL;
import com.mgs.carparking.netbean.RecommandVideosEntity;

/* JADX INFO: compiled from: ITEMGUSSVIDEOVIEWMODEL.java */
/* JADX INFO: loaded from: classes4.dex */
public class s1 extends sl.c<VIDEOPLAYDETAILVIEWMODEL> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecommandVideosEntity f73776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Drawable f73777c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ObservableField<SpannableString> f73778d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ObservableField<String> f73779e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ul.b f73780f;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        ((VIDEOPLAYDETAILVIEWMODEL) this.f72000a).Z0(this.f73776b.getId());
    }

    public s1(@NonNull VIDEOPLAYDETAILVIEWMODEL videoplaydetailviewmodel, RecommandVideosEntity recommandVideosEntity) {
        super(videoplaydetailviewmodel);
        this.f73778d = new ObservableField<>();
        this.f73779e = new ObservableField<>();
        this.f73780f = new ul.b(new ul.a() { // from class: w9.r1
            @Override // ul.a
            public final void call() {
                this.f73765a.b();
            }
        });
        this.f73776b = recommandVideosEntity;
        if (recommandVideosEntity.getType_pid() == 1) {
            if (!em.o.b(recommandVideosEntity.getVod_douban_score())) {
                this.f73778d.set(sa.e.m(recommandVideosEntity.getVod_douban_score()));
            }
        } else if (recommandVideosEntity.getType_pid() != 2 && recommandVideosEntity.getType_pid() != 4) {
            this.f73779e.set(recommandVideosEntity.getCollection_new_title() + "");
        } else if (recommandVideosEntity.getVod_isend() == 1) {
            this.f73779e.set(recommandVideosEntity.getVod_total() + em.r.a().getResources().getString(R.string.text_colections));
        } else {
            this.f73779e.set(em.r.a().getResources().getString(R.string.text_up_colections, recommandVideosEntity.getVod_serial()));
        }
        if (recommandVideosEntity.getIcon_type() == 1) {
            this.f73777c = ContextCompat.getDrawable(videoplaydetailviewmodel.getApplication(), R.drawable.ic_video_hot_play);
        } else if (recommandVideosEntity.getIcon_type() == 2) {
            this.f73777c = ContextCompat.getDrawable(videoplaydetailviewmodel.getApplication(), R.drawable.ic_video_high_score);
        }
    }
}
