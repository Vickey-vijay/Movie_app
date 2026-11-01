package z7;

import android.app.Activity;
import android.content.Intent;
import com.luck.picture.lib.R$anim;
import com.luck.picture.lib.basic.PictureSelectorSupporterActivity;
import com.luck.picture.lib.config.PictureSelectionConfig;
import com.luck.picture.lib.entity.LocalMedia;
import com.safedk.android.utils.Logger;
import f8.b0;

/* JADX INFO: compiled from: PictureSelectionModel.java */
/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PictureSelectionConfig f86328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f86329b;

    public static void safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(Activity p10, Intent p11) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V");
        if (p11 == null) {
            return;
        }
        p10.startActivity(p11);
    }

    public i b(c8.b bVar) {
        PictureSelectionConfig.M0 = bVar;
        this.f86328a.f32239u0 = true;
        return this;
    }

    public i c(c8.d dVar) {
        PictureSelectionConfig.O0 = dVar;
        return this;
    }

    public i d(c8.f fVar) {
        PictureSelectionConfig.K0 = fVar;
        return this;
    }

    public i e(int i10) {
        PictureSelectionConfig pictureSelectionConfig = this.f86328a;
        if (pictureSelectionConfig.f32218k == 1) {
            i10 = 1;
        }
        pictureSelectionConfig.f32220l = i10;
        return this;
    }

    public i f(int i10) {
        PictureSelectionConfig pictureSelectionConfig = this.f86328a;
        if (pictureSelectionConfig.f32200b == a8.e.d()) {
            i10 = 0;
        }
        pictureSelectionConfig.f32224n = i10;
        return this;
    }

    public i g(int i10) {
        this.f86328a.f32222m = i10;
        return this;
    }

    public i h(n8.a aVar) {
        if (aVar != null) {
            PictureSelectionConfig.T0 = aVar;
        }
        return this;
    }

    public i(j jVar, int i10) {
        this.f86329b = jVar;
        PictureSelectionConfig pictureSelectionConfigD = PictureSelectionConfig.d();
        this.f86328a = pictureSelectionConfigD;
        pictureSelectionConfigD.f32200b = i10;
        f(pictureSelectionConfigD.f32224n);
    }

    public void a(b0<LocalMedia> b0Var) {
        if (!o8.f.a()) {
            Activity activity = this.f86329b.getActivity();
            if (activity != null) {
                if (b0Var != null) {
                    PictureSelectionConfig pictureSelectionConfig = this.f86328a;
                    pictureSelectionConfig.f32233r0 = true;
                    pictureSelectionConfig.f32237t0 = false;
                    PictureSelectionConfig.W0 = b0Var;
                    if (PictureSelectionConfig.K0 == null && pictureSelectionConfig.f32200b != a8.e.b()) {
                        throw new NullPointerException("imageEngine is null,Please implement ImageEngine");
                    }
                    safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(activity, new Intent(activity, (Class<?>) PictureSelectorSupporterActivity.class));
                    activity.overridePendingTransition(PictureSelectionConfig.T0.e().f32355b, R$anim.ps_anim_fade_in);
                    return;
                }
                throw new NullPointerException("OnResultCallbackListener cannot be null");
            }
            throw new NullPointerException("Activity cannot be null");
        }
    }
}
