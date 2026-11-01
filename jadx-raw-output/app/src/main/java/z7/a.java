package z7;

import android.R;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.luck.picture.lib.R$id;

/* JADX INFO: compiled from: FragmentInjectManager.java */
/* JADX INFO: loaded from: classes2.dex */
public class a {
    public static void a(FragmentActivity fragmentActivity, String str, Fragment fragment) {
        if (o8.a.b(fragmentActivity, str)) {
            fragmentActivity.getSupportFragmentManager().beginTransaction().add(R$id.fragment_container, fragment, str).addToBackStack(str).commitAllowingStateLoss();
        }
    }

    public static void b(FragmentManager fragmentManager, String str, Fragment fragment) {
        fragmentManager.beginTransaction().add(R.id.content, fragment, str).addToBackStack(str).commitAllowingStateLoss();
    }
}
