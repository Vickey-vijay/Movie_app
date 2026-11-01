package w9;

import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.databinding.ObservableField;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.model.CHANNELVIEWMODEL;
import com.mgs.carparking.netbean.RecommandVideosEntity;

/* JADX INFO: compiled from: ITEMCHANNELSEARCHRESULTVIEWMODEL.java */
/* JADX INFO: loaded from: classes4.dex */
public class p0 extends sl.c<CHANNELVIEWMODEL> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecommandVideosEntity f73726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Drawable f73727c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ObservableField<SpannableString> f73728d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ObservableField<String> f73729e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ul.b f73730f;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        ((CHANNELVIEWMODEL) this.f72000a).T(this.f73726b);
    }

    public p0(@NonNull CHANNELVIEWMODEL channelviewmodel, RecommandVideosEntity recommandVideosEntity) {
        super(channelviewmodel);
        this.f73728d = new ObservableField<>();
        this.f73729e = new ObservableField<>();
        this.f73730f = new ul.b(new ul.a() { // from class: w9.o0
            @Override // ul.a
            public final void call() {
                this.f73711a.b();
            }
        });
        this.f73726b = recommandVideosEntity;
        if (recommandVideosEntity.getIcon_type() == 1) {
            this.f73727c = ContextCompat.getDrawable(channelviewmodel.getApplication(), R.drawable.ic_video_hot_play);
        } else if (recommandVideosEntity.getIcon_type() == 2) {
            this.f73727c = ContextCompat.getDrawable(channelviewmodel.getApplication(), R.drawable.ic_video_high_score);
        }
        if (recommandVideosEntity.getType_pid() == 1) {
            if (!em.o.b(recommandVideosEntity.getVod_douban_score())) {
                this.f73728d.set(sa.e.m(recommandVideosEntity.getVod_douban_score()));
                return;
            }
            return;
        }
        if (recommandVideosEntity.getType_pid() != 2 && recommandVideosEntity.getType_pid() != 4) {
            this.f73729e.set(recommandVideosEntity.getCollection_new_title() + "");
            return;
        }
        if (recommandVideosEntity.getVod_isend() == 1) {
            this.f73729e.set(recommandVideosEntity.getVod_total() + em.r.a().getResources().getString(R.string.text_colections));
            return;
        }
        this.f73729e.set(em.r.a().getResources().getString(R.string.text_up_colections, recommandVideosEntity.getVod_serial()));
    }
}
