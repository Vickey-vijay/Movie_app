package gl;

import android.app.Activity;
import android.content.Context;
import com.applovin.mediation.MaxAd;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.yk.e.AbstractC4043il;
import com.yk.e.object.AdInfo;
import com.yk.e.util.AdLog;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class r0 {
    public static AdInfo b(Object obj, String str) {
        String str2;
        AdInfo adInfo = null;
        try {
            if (obj instanceof MaxAd) {
                MaxAd maxAd = (MaxAd) obj;
                str2 = "applovin";
                adInfo = new AdInfo(maxAd.getRevenue(), maxAd.getRevenuePrecision(), maxAd.getNetworkName());
            } else {
                str2 = "";
            }
            if (obj instanceof AdInfo) {
                adInfo = (AdInfo) obj;
            }
            if (adInfo != null) {
                AdLog.i("OktAdInfo platform = " + str2 + ", adPlcID = " + str + ", " + adInfo);
            }
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
        }
        return adInfo != null ? adInfo : new AdInfo();
    }

    public static String d(Context context) {
        try {
            return String.valueOf(context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getInt("OKT_SDK_APP_ID"));
        } catch (Exception e10) {
            b.d.a(e10, new StringBuilder("getManifestValue err, msg = "), e10);
            return "";
        }
    }

    public static JSONArray f(JSONArray jSONArray) {
        JSONArray jSONArray2 = new JSONArray();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                String strOptString = jSONObjectOptJSONObject.optString("platform", "");
                Iterator it = AbstractC4043il.f3371iILLL1.iterator();
                while (it.hasNext()) {
                    if (((String) it.next()).equals(strOptString)) {
                        jSONArray2.put(jSONObjectOptJSONObject);
                    }
                }
            } catch (Exception e10) {
                AdLog.e(e10.getMessage(), e10);
            }
        }
        return jSONArray2;
    }

    public static String g(String str) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance(SameMD5.TAG).digest(str.getBytes("UTF-8"));
            StringBuilder sb2 = new StringBuilder(bArrDigest.length * 2);
            for (byte b10 : bArrDigest) {
                int i10 = b10 & 255;
                if (i10 < 16) {
                    sb2.append("0");
                }
                sb2.append(Integer.toHexString(i10));
            }
            return sb2.toString();
        } catch (UnsupportedEncodingException e10) {
            AdLog.e(e10.getMessage(), e10);
            return "";
        } catch (NoSuchAlgorithmException e11) {
            AdLog.e(e11.getMessage(), e11);
            return "";
        }
    }

    public static double a(String str) {
        try {
            return Double.parseDouble(str);
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            return 0.0d;
        }
    }

    public static String c(Activity activity) {
        try {
            return activity.getApplicationInfo().loadLabel(activity.getPackageManager()).toString();
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            return "";
        }
    }

    public static String e(Context context, String str) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getString(str);
        } catch (Exception e10) {
            b.d.a(e10, new StringBuilder("getManifestValue err, msg = "), e10);
            return "";
        }
    }

    public static boolean h(Activity activity) {
        try {
            int requestedOrientation = activity.getRequestedOrientation();
            if (requestedOrientation != 0 && requestedOrientation != 6) {
                return false;
            }
            return true;
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
        }
    }
}
