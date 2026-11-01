package com.facebook.internal;

import android.app.Activity;
import android.content.Intent;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.fragment.app.Fragment;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import kotlin.Metadata;

/* JADX INFO: compiled from: FragmentWrapper.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004R(\u0010\u000e\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR(\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\b\u0010\t\u001a\u0004\u0018\u00010\u000f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/facebook/internal/u;", "", "Landroid/content/Intent;", "intent", "", "requestCode", "Lmj/r;", "startActivityForResult", "Landroidx/fragment/app/Fragment;", "<set-?>", "a", "Landroidx/fragment/app/Fragment;", "getSupportFragment", "()Landroidx/fragment/app/Fragment;", "supportFragment", "Landroid/app/Fragment;", "b", "Landroid/app/Fragment;", "getNativeFragment", "()Landroid/app/Fragment;", "nativeFragment", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", ActivityChooserModel.ATTRIBUTE_ACTIVITY, "facebook-common_release"}, k = 1, mv = {1, 5, 1})
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public Fragment supportFragment;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public android.app.Fragment nativeFragment;

    public static void safedk_Fragment_startActivityForResult_217cff818a3a1b3aacc309b44c0675e4(android.app.Fragment p10, Intent p11, int p12) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Fragment;->startActivityForResult(Landroid/content/Intent;I)V");
        if (p11 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p11, "com.facebook");
        p10.startActivityForResult(p11, p12);
    }

    public static void safedk_Fragment_startActivityForResult_6fd6bf7695baae8f1a141a4d4340bbe1(Fragment p10, Intent p11, int p12) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroidx/fragment/app/Fragment;->startActivityForResult(Landroid/content/Intent;I)V");
        if (p11 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p11, "com.facebook");
        p10.startActivityForResult(p11, p12);
    }

    public final Activity getActivity() {
        Fragment fragment = this.supportFragment;
        if (fragment != null) {
            if (fragment == null) {
                return null;
            }
            return fragment.getActivity();
        }
        android.app.Fragment fragment2 = this.nativeFragment;
        if (fragment2 == null) {
            return null;
        }
        return fragment2.getActivity();
    }

    public final void startActivityForResult(Intent intent, int i10) {
        Fragment fragment = this.supportFragment;
        if (fragment != null) {
            if (fragment == null) {
                return;
            }
            safedk_Fragment_startActivityForResult_6fd6bf7695baae8f1a141a4d4340bbe1(fragment, intent, i10);
        } else {
            android.app.Fragment fragment2 = this.nativeFragment;
            if (fragment2 == null) {
                return;
            }
            safedk_Fragment_startActivityForResult_217cff818a3a1b3aacc309b44c0675e4(fragment2, intent, i10);
        }
    }
}
