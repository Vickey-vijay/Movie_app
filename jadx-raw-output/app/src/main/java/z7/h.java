package z7;

import android.app.Activity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.luck.picture.lib.PictureOnlyCameraFragment;
import com.luck.picture.lib.config.PictureSelectionConfig;
import com.luck.picture.lib.entity.LocalMedia;
import f8.b0;

/* JADX INFO: compiled from: PictureSelectionCameraModel.java */
/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PictureSelectionConfig f86326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f86327b;

    public h b(c8.b bVar) {
        PictureSelectionConfig.M0 = bVar;
        this.f86326a.f32239u0 = true;
        return this;
    }

    public h c(c8.d dVar) {
        PictureSelectionConfig.O0 = dVar;
        return this;
    }

    public h(j jVar, int i10) {
        this.f86327b = jVar;
        PictureSelectionConfig pictureSelectionConfigD = PictureSelectionConfig.d();
        this.f86326a = pictureSelectionConfigD;
        pictureSelectionConfigD.f32200b = i10;
        pictureSelectionConfigD.f32202c = true;
        pictureSelectionConfigD.f32249z0 = false;
        pictureSelectionConfigD.L = false;
        pictureSelectionConfigD.M = false;
        pictureSelectionConfigD.N = false;
    }

    public void a(b0<LocalMedia> b0Var) {
        if (!o8.f.a()) {
            Activity activity = this.f86327b.getActivity();
            if (activity != null) {
                if (b0Var != null) {
                    PictureSelectionConfig pictureSelectionConfig = this.f86326a;
                    pictureSelectionConfig.f32233r0 = true;
                    pictureSelectionConfig.f32237t0 = false;
                    PictureSelectionConfig.W0 = b0Var;
                    FragmentManager supportFragmentManager = null;
                    if (activity instanceof AppCompatActivity) {
                        supportFragmentManager = ((AppCompatActivity) activity).getSupportFragmentManager();
                    } else if (activity instanceof FragmentActivity) {
                        supportFragmentManager = ((FragmentActivity) activity).getSupportFragmentManager();
                    }
                    if (supportFragmentManager != null) {
                        String str = PictureOnlyCameraFragment.f31915n;
                        Fragment fragmentFindFragmentByTag = supportFragmentManager.findFragmentByTag(str);
                        if (fragmentFindFragmentByTag != null) {
                            supportFragmentManager.beginTransaction().remove(fragmentFindFragmentByTag).commitAllowingStateLoss();
                        }
                        a.b(supportFragmentManager, str, PictureOnlyCameraFragment.O0());
                        return;
                    }
                    throw new NullPointerException("FragmentManager cannot be null");
                }
                throw new NullPointerException("OnResultCallbackListener cannot be null");
            }
            throw new NullPointerException("Activity cannot be null");
        }
    }
}
