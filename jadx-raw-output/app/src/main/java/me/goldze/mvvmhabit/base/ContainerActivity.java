package me.goldze.mvvmhabit.base;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.trello.rxlifecycle2.components.support.RxAppCompatActivity;
import java.lang.ref.WeakReference;
import me.goldze.mvvmhabit.R$id;
import me.goldze.mvvmhabit.R$layout;
import mi.a;

/* JADX INFO: loaded from: classes3.dex */
public class ContainerActivity extends RxAppCompatActivity {
    public static final String BUNDLE = "bundle";
    public static final String FRAGMENT = "fragment";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WeakReference<Fragment> f64422c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f64423d;

    public Fragment k(Intent intent) {
        if (intent == null) {
            throw new RuntimeException("you must provide a page info to display");
        }
        try {
            String stringExtra = intent.getStringExtra(FRAGMENT);
            if (stringExtra == null || "".equals(stringExtra)) {
                throw new IllegalArgumentException("can not find page fragmentName");
            }
            Fragment fragment = (Fragment) Class.forName(stringExtra).newInstance();
            Bundle bundleExtra = intent.getBundleExtra(BUNDLE);
            if (bundleExtra != null) {
                fragment.setArguments(bundleExtra);
            }
            return fragment;
        } catch (ClassNotFoundException e10) {
            e10.printStackTrace();
            throw new RuntimeException("fragment initialization failed!");
        } catch (IllegalAccessException e11) {
            e11.printStackTrace();
            throw new RuntimeException("fragment initialization failed!");
        } catch (InstantiationException e12) {
            e12.printStackTrace();
            throw new RuntimeException("fragment initialization failed!");
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        Fragment fragmentFindFragmentById = getSupportFragmentManager().findFragmentById(R$id.content);
        if (fragmentFindFragmentById instanceof BaseFragment) {
            if (!((BaseFragment) fragmentFindFragmentById).isBackPressed()) {
                super.onBackPressed();
                return;
            }
            return;
        }
        super.onBackPressed();
    }

    @Override // com.trello.rxlifecycle2.components.support.RxAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Fragment fragmentK;
        getWindow().setSoftInputMode(32);
        super.onCreate(bundle);
        this.f64423d = new a();
        setContentView(R$layout.activity_container);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        if (bundle != null) {
            fragmentK = supportFragmentManager.getFragment(bundle, "content_fragment_tag");
        } else {
            fragmentK = null;
        }
        if (fragmentK == null) {
            fragmentK = k(getIntent());
        }
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransactionBeginTransaction.replace(R$id.content, fragmentK);
        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
        this.f64422c = new WeakReference<>(fragmentK);
    }

    @Override // com.trello.rxlifecycle2.components.support.RxAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f64423d.dispose();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        getSupportFragmentManager().putFragment(bundle, "content_fragment_tag", this.f64422c.get());
    }
}
