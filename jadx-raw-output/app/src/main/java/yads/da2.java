package yads;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.net.MalformedURLException;
import java.net.URL;

/* JADX INFO: loaded from: classes2.dex */
public abstract class da2 {
    public static md3 a(gd3 gd3Var) {
        ae1 ae1Var = gd3Var.f77772b;
        if (ae1Var == null || !ck.p.e(ae1Var.f75489b, CampaignEx.KEY_OMID)) {
            throw new id3(gd3Var, hd3.f78185c);
        }
        try {
            URL url = new URL(ae1Var.f75490c);
            String str = gd3Var.f77771a;
            String str2 = gd3Var.f77773c;
            if (str2 == null || str2.length() == 0) {
                return new md3(null, url, null);
            }
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("VendorKey is null or empty");
            }
            if (TextUtils.isEmpty(str2)) {
                throw new IllegalArgumentException("VerificationParameters is null or empty");
            }
            return new md3(str, url, str2);
        } catch (MalformedURLException unused) {
            throw new id3(gd3Var, hd3.f78186d);
        }
    }
}
