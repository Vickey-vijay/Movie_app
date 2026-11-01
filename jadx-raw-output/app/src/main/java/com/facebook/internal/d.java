package com.facebook.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.core.app.NotificationCompat;
import com.facebook.login.CustomTabPrefetchHelper;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: compiled from: CustomTab.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u0000 \f2\u00020\u0001:\u0001\u0007B\u0019\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004R\"\u0010\u000e\u001a\u00020\b8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0014"}, d2 = {"Lcom/facebook/internal/d;", "", "Landroid/app/Activity;", ActivityChooserModel.ATTRIBUTE_ACTIVITY, "", HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME, "", "a", "Landroid/net/Uri;", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "b", "(Landroid/net/Uri;)V", NotificationCompat.MessagingStyle.Message.KEY_DATA_URI, "action", "Landroid/os/Bundle;", "parameters", "<init>", "(Ljava/lang/String;Landroid/os/Bundle;)V", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
public class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public Uri uri;

    /* JADX INFO: renamed from: com.facebook.internal.d$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: CustomTab.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0017¨\u0006\n"}, d2 = {"Lcom/facebook/internal/d$a;", "", "", "action", "Landroid/os/Bundle;", "parameters", "Landroid/net/Uri;", "a", "<init>", "()V", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(ck.i iVar) {
            this();
        }

        public Uri a(String action, Bundle parameters) {
            ck.p.j(action, "action");
            j0 j0Var = j0.f14425a;
            return j0.g(g0.b(), q1.t.w() + "/dialog/" + action, parameters);
        }
    }

    public static void safedk_CustomTabsIntent_launchUrl_46a735ad316dd66561bc1347435a4f91(CustomTabsIntent p10, Context p11, Uri p12) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroidx/browser/customtabs/CustomTabsIntent;->launchUrl(Landroid/content/Context;Landroid/net/Uri;)V");
        if (p12 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p12, "com.facebook");
        p10.launchUrl(p11, p12);
    }

    public d(String str, Bundle bundle) {
        Uri uriA;
        ck.p.j(str, "action");
        bundle = bundle == null ? new Bundle() : bundle;
        GamingAction[] gamingActionArrValuesCustom = GamingAction.valuesCustom();
        ArrayList arrayList = new ArrayList(gamingActionArrValuesCustom.length);
        for (GamingAction gamingAction : gamingActionArrValuesCustom) {
            arrayList.add(gamingAction.getRawValue());
        }
        if (arrayList.contains(str)) {
            j0 j0Var = j0.f14425a;
            uriA = j0.g(g0.g(), ck.p.s("/dialog/", str), bundle);
        } else {
            uriA = INSTANCE.a(str, bundle);
        }
        this.uri = uriA;
    }

    public final boolean a(Activity activity, String packageName) {
        if (i2.a.d(this)) {
            return false;
        }
        try {
            ck.p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
            CustomTabsIntent customTabsIntentBuild = new CustomTabsIntent.Builder(CustomTabPrefetchHelper.INSTANCE.b()).build();
            customTabsIntentBuild.intent.setPackage(packageName);
            try {
                safedk_CustomTabsIntent_launchUrl_46a735ad316dd66561bc1347435a4f91(customTabsIntentBuild, activity, this.uri);
                return true;
            } catch (ActivityNotFoundException unused) {
                return false;
            }
        } catch (Throwable th2) {
            i2.a.b(th2, this);
            return false;
        }
    }

    public final void b(Uri uri) {
        if (i2.a.d(this)) {
            return;
        }
        try {
            ck.p.j(uri, "<set-?>");
            this.uri = uri;
        } catch (Throwable th2) {
            i2.a.b(th2, this);
        }
    }
}
