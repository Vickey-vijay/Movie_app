package com.facebook.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.HashSet;
import kotlin.Metadata;
import nj.q0;

/* JADX INFO: compiled from: FacebookSignatureValidator.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007R$\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u00040\bj\b\u0012\u0004\u0012\u00020\u0004`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/facebook/internal/k;", "", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "", HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME, "", "a", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "b", "Ljava/util/HashSet;", "validAppSignatureHashes", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f14433a = new k();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final HashSet<String> validAppSignatureHashes = q0.g("8a3c4b262d721acd49a4bf97d5213199c86fa2b9", "cc2751449a350f668590264ed76692694a80308a", "a4b7452e2ed8f5f191058ca7bbfd26b0d3214bfc", "df6b721c8b4d3b6eb44c861d4415007e5a35fc95", "9b8f518b086098de3d77736f9458a3d2f6f95a37", "2438bce1ddb7bd026d5ff89f598b3b5e5bb824b3", "c56fb7d591ba6704df047fd98f535372fea00211");

    public static final boolean a(Context context, String packageName) {
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        ck.p.j(packageName, HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME);
        String str = Build.BRAND;
        int i10 = context.getApplicationInfo().flags;
        ck.p.i(str, "brand");
        if (lk.x.R(str, "generic", false, 2, null) && (i10 & 2) != 0) {
            return true;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 64);
            Signature[] signatureArr = packageInfo.signatures;
            if (signatureArr == null) {
                return false;
            }
            ck.p.i(signatureArr, "packageInfo.signatures");
            if (signatureArr.length == 0) {
                return false;
            }
            Signature[] signatureArr2 = packageInfo.signatures;
            ck.p.i(signatureArr2, "packageInfo.signatures");
            for (Signature signature : signatureArr2) {
                HashSet<String> hashSet = validAppSignatureHashes;
                j0 j0Var = j0.f14425a;
                byte[] byteArray = signature.toByteArray();
                ck.p.i(byteArray, "it.toByteArray()");
                if (!nj.b0.U(hashSet, j0.z0(byteArray))) {
                    return false;
                }
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }
}
