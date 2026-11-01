package com.facebook.login;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.LayoutRes;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.R$id;
import com.facebook.common.R$layout;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.C3426d4;
import com.ironsource.K5;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vungle.ads.internal.ui.AdActivity;
import kotlin.Metadata;

/* JADX INFO: compiled from: LoginFragment.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0016\u0018\u0000 \u00072\u00020\u0001:\u0001CB\u0007¢\u0006\u0004\bA\u0010BJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0014J\b\u0010\b\u001a\u00020\u0004H\u0016J&\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u000f\u001a\u00020\u0004H\u0016J\b\u0010\u0010\u001a\u00020\u0004H\u0016J\"\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0002H\u0016J\b\u0010\u0019\u001a\u00020\u0004H\u0014J\b\u0010\u001a\u001a\u00020\u0004H\u0014J\u001c\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00040\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002J\u0010\u0010\"\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 H\u0002J\b\u0010#\u001a\u00020\u0004H\u0002J\b\u0010$\u001a\u00020\u0004H\u0002J\u0010\u0010&\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020%H\u0002R\u0018\u0010*\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010.\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R$\u00104\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u00068\u0006@BX\u0086.¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R0\u0010:\u001a\b\u0012\u0004\u0012\u00020\u0014052\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u0014058\u0006@BX\u0086.¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0016\u0010=\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010@\u001a\u00020\u00118UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?¨\u0006D"}, d2 = {"Lcom/facebook/login/LoginFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/os/Bundle;", "savedInstanceState", "Lmj/r;", "onCreate", "Lcom/facebook/login/LoginClient;", "g", "onDestroy", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", C3426d4.i.f28569u0, C3426d4.i.f28567t0, "", "requestCode", C3426d4.f.f28487f, "Landroid/content/Intent;", "data", "onActivityResult", "outState", "onSaveInstanceState", "r", "q", "Landroidx/fragment/app/FragmentActivity;", ActivityChooserModel.ATTRIBUTE_ACTIVITY, "Lkotlin/Function1;", "Landroidx/activity/result/ActivityResult;", CampaignEx.JSON_KEY_AD_K, "Lcom/facebook/login/LoginClient$Result;", K5.f26927b, "p", "s", "l", "Landroid/app/Activity;", InneractiveMediationDefs.GENDER_MALE, "", "b", "Ljava/lang/String;", "callingPackage", "Lcom/facebook/login/LoginClient$Request;", "c", "Lcom/facebook/login/LoginClient$Request;", AdActivity.REQUEST_KEY_EXTRA, "<set-?>", "d", "Lcom/facebook/login/LoginClient;", "j", "()Lcom/facebook/login/LoginClient;", "loginClient", "Landroidx/activity/result/ActivityResultLauncher;", "e", "Landroidx/activity/result/ActivityResultLauncher;", "h", "()Landroidx/activity/result/ActivityResultLauncher;", "launcher", InneractiveMediationDefs.GENDER_FEMALE, "Landroid/view/View;", "progressBar", "i", "()I", "layoutResId", "<init>", "()V", "a", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
public class LoginFragment extends Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public String callingPackage;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public LoginClient.Request request;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public LoginClient loginClient;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public ActivityResultLauncher<Intent> launcher;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public View progressBar;

    /* JADX INFO: compiled from: LoginFragment.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\u0005"}, d2 = {"com/facebook/login/LoginFragment$b", "Lcom/facebook/login/LoginClient$a;", "Lmj/r;", "a", "b", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    public static final class b implements LoginClient.a {
        public b() {
        }

        @Override // com.facebook.login.LoginClient.a
        public void a() {
            LoginFragment.this.s();
        }

        @Override // com.facebook.login.LoginClient.a
        public void b() {
            LoginFragment.this.l();
        }
    }

    public final void p(LoginClient.Result result) {
        this.request = null;
        int i10 = result.code == LoginClient.Result.Code.CANCEL ? 0 : -1;
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.facebook.LoginFragment:Result", result);
        Intent intent = new Intent();
        intent.putExtras(bundle);
        FragmentActivity activity = getActivity();
        if (!isAdded() || activity == null) {
            return;
        }
        activity.setResult(i10, intent);
        activity.finish();
    }

    public void q() {
    }

    public void r() {
    }

    public static final void n(LoginFragment loginFragment, LoginClient.Result result) {
        ck.p.j(loginFragment, "this$0");
        ck.p.j(result, K5.f26927b);
        loginFragment.p(result);
    }

    public static final void o(bk.l lVar, ActivityResult activityResult) {
        ck.p.j(lVar, "$tmp0");
        lVar.invoke(activityResult);
    }

    public LoginClient g() {
        return new LoginClient(this);
    }

    public final ActivityResultLauncher<Intent> h() {
        ActivityResultLauncher<Intent> activityResultLauncher = this.launcher;
        if (activityResultLauncher != null) {
            return activityResultLauncher;
        }
        ck.p.B("launcher");
        throw null;
    }

    @LayoutRes
    public int i() {
        return R$layout.com_facebook_login_fragment;
    }

    public final LoginClient j() {
        LoginClient loginClient = this.loginClient;
        if (loginClient != null) {
            return loginClient;
        }
        ck.p.B("loginClient");
        throw null;
    }

    public final bk.l<ActivityResult, mj.r> k(final FragmentActivity fragmentActivity) {
        return new bk.l<ActivityResult, mj.r>() { // from class: com.facebook.login.LoginFragment$getLoginMethodHandlerCallback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // bk.l
            public /* bridge */ /* synthetic */ mj.r invoke(ActivityResult activityResult) {
                invoke2(activityResult);
                return mj.r.f64562a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ActivityResult activityResult) {
                ck.p.j(activityResult, "result");
                if (activityResult.getResultCode() == -1) {
                    this.this$0.j().t(LoginClient.INSTANCE.b(), activityResult.getResultCode(), activityResult.getData());
                } else {
                    fragmentActivity.finish();
                }
            }
        };
    }

    public final void l() {
        View view = this.progressBar;
        if (view == null) {
            ck.p.B("progressBar");
            throw null;
        }
        view.setVisibility(8);
        q();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ck.p.j(inflater, "inflater");
        View viewInflate = inflater.inflate(i(), container, false);
        View viewFindViewById = viewInflate.findViewById(R$id.com_facebook_login_fragment_progress_bar);
        ck.p.i(viewFindViewById, "view.findViewById<View>(R.id.com_facebook_login_fragment_progress_bar)");
        this.progressBar = viewFindViewById;
        j().u(new b());
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        ck.p.j(bundle, "outState");
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("loginClient", j());
    }

    public final void s() {
        View view = this.progressBar;
        if (view == null) {
            ck.p.B("progressBar");
            throw null;
        }
        view.setVisibility(0);
        r();
    }

    public final void m(Activity activity) {
        ComponentName callingActivity = activity.getCallingActivity();
        if (callingActivity == null) {
            return;
        }
        this.callingPackage = callingActivity.getPackageName();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        j().t(i10, i11, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        LoginClient loginClientG;
        Bundle bundleExtra;
        super.onCreate(bundle);
        if (bundle == null) {
            loginClientG = null;
        } else {
            loginClientG = (LoginClient) bundle.getParcelable("loginClient");
        }
        if (loginClientG != null) {
            loginClientG.v(this);
        } else {
            loginClientG = g();
        }
        this.loginClient = loginClientG;
        j().w(new LoginClient.d() { // from class: com.facebook.login.l
            @Override // com.facebook.login.LoginClient.d
            public final void a(LoginClient.Result result) {
                LoginFragment.n(this.f14694a, result);
            }
        });
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        m(activity);
        Intent intent = activity.getIntent();
        if (intent != null && (bundleExtra = intent.getBundleExtra("com.facebook.LoginFragment:Request")) != null) {
            this.request = (LoginClient.Request) bundleExtra.getParcelable(AdActivity.REQUEST_KEY_EXTRA);
        }
        ActivityResultContracts.StartActivityForResult startActivityForResult = new ActivityResultContracts.StartActivityForResult();
        final bk.l<ActivityResult, mj.r> lVarK = k(activity);
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(startActivityForResult, new ActivityResultCallback() { // from class: com.facebook.login.m
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                LoginFragment.o(lVarK, (ActivityResult) obj);
            }
        });
        ck.p.i(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(\n            ActivityResultContracts.StartActivityForResult(),\n            getLoginMethodHandlerCallback(activity))");
        this.launcher = activityResultLauncherRegisterForActivityResult;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        j().c();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        View viewFindViewById;
        super.onPause();
        View view = getView();
        if (view == null) {
            viewFindViewById = null;
        } else {
            viewFindViewById = view.findViewById(R$id.com_facebook_login_fragment_progress_bar);
        }
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(8);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.callingPackage == null) {
            Log.e("LoginFragment", "Cannot call LoginFragment with a null calling package. This can occur if the launchMode of the caller is singleInstance.");
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.finish();
                return;
            }
            return;
        }
        j().x(this.request);
    }
}
