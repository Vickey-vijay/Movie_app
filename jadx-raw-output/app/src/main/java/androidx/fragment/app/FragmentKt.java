package androidx.fragment.app;

import android.os.Bundle;
import ck.p;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import mj.r;

/* JADX INFO: compiled from: Fragment.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001a\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u0012\u0010\u0007\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a,\u0010\n\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\b\u001a\u0012\u0010\u000b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\f"}, d2 = {"Landroidx/fragment/app/Fragment;", "", "requestKey", "Landroid/os/Bundle;", "result", "Lmj/r;", "setFragmentResult", "clearFragmentResult", "Lkotlin/Function2;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setFragmentResultListener", "clearFragmentResultListener", "fragment-ktx_release"}, k = 2, mv = {1, 6, 0})
public final class FragmentKt {
    public static final void clearFragmentResult(Fragment fragment, String str) {
        p.j(fragment, "<this>");
        p.j(str, "requestKey");
        fragment.getParentFragmentManager().clearFragmentResult(str);
    }

    public static final void clearFragmentResultListener(Fragment fragment, String str) {
        p.j(fragment, "<this>");
        p.j(str, "requestKey");
        fragment.getParentFragmentManager().clearFragmentResultListener(str);
    }

    public static final void setFragmentResult(Fragment fragment, String str, Bundle bundle) {
        p.j(fragment, "<this>");
        p.j(str, "requestKey");
        p.j(bundle, "result");
        fragment.getParentFragmentManager().setFragmentResult(str, bundle);
    }

    public static final void setFragmentResultListener(Fragment fragment, String str, final bk.p<? super String, ? super Bundle, r> pVar) {
        p.j(fragment, "<this>");
        p.j(str, "requestKey");
        p.j(pVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        fragment.getParentFragmentManager().setFragmentResultListener(str, fragment, new FragmentResultListener() { // from class: androidx.fragment.app.e
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(String str2, Bundle bundle) {
                FragmentKt.m10setFragmentResultListener$lambda0(pVar, str2, bundle);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: setFragmentResultListener$lambda-0, reason: not valid java name */
    public static final void m10setFragmentResultListener$lambda0(bk.p pVar, String str, Bundle bundle) {
        p.j(pVar, "$tmp0");
        p.j(str, "p0");
        p.j(bundle, "p1");
        pVar.mo1invoke(str, bundle);
    }
}
