package y1;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.RestrictTo;
import ck.p;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.x;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.q;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import io.bidmachine.unified.UnifiedMediationParams;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;
import q1.t;

/* JADX INFO: compiled from: AutomaticAnalyticsLogger.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0010B\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u001a\u0010\b\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J \u0010\r\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0007J\b\u0010\u000e\u001a\u00020\u000bH\u0007J\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0002J.\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0011H\u0002R\u001c\u0010\u0016\u001a\n \u0014*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0018¨\u0006\u001c"}, d2 = {"Ly1/h;", "", "Lmj/r;", "d", "", "activityName", "", "timeSpentInSeconds", "e", "purchase", "skuDetails", "", "isSubscription", InneractiveMediationDefs.GENDER_FEMALE, "c", "Ly1/h$a;", "a", "", "extraParameter", "b", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "TAG", "Lcom/facebook/appevents/x;", "Lcom/facebook/appevents/x;", "internalAppEventsLogger", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f75215a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final String TAG = h.class.getCanonicalName();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final x internalAppEventsLogger = new x(t.l());

    /* JADX INFO: compiled from: AutomaticAnalyticsLogger.kt */
    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\u0006\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0017\u0010\u0018R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u0010\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0003\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0016\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u000b\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Ly1/h$a;", "", "Ljava/math/BigDecimal;", "a", "Ljava/math/BigDecimal;", "c", "()Ljava/math/BigDecimal;", "setPurchaseAmount", "(Ljava/math/BigDecimal;)V", "purchaseAmount", "Ljava/util/Currency;", "b", "Ljava/util/Currency;", "()Ljava/util/Currency;", "setCurrency", "(Ljava/util/Currency;)V", "currency", "Landroid/os/Bundle;", "Landroid/os/Bundle;", "()Landroid/os/Bundle;", "setParam", "(Landroid/os/Bundle;)V", "param", "<init>", "(Ljava/math/BigDecimal;Ljava/util/Currency;Landroid/os/Bundle;)V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public BigDecimal purchaseAmount;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public Currency currency;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public Bundle param;

        public a(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
            p.j(bigDecimal, "purchaseAmount");
            p.j(currency, "currency");
            p.j(bundle, "param");
            this.purchaseAmount = bigDecimal;
            this.currency = currency;
            this.param = bundle;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Currency getCurrency() {
            return this.currency;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Bundle getParam() {
            return this.param;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final BigDecimal getPurchaseAmount() {
            return this.purchaseAmount;
        }
    }

    public static final void f(String str, String str2, boolean z10) {
        a aVarA;
        p.j(str, "purchase");
        p.j(str2, "skuDetails");
        if (c() && (aVarA = f75215a.a(str, str2)) != null) {
            boolean z11 = false;
            if (z10) {
                com.facebook.internal.p pVar = com.facebook.internal.p.f14475a;
                if (com.facebook.internal.p.d("app_events_if_auto_log_subs", t.m(), false)) {
                    z11 = true;
                }
            }
            if (z11) {
                internalAppEventsLogger.i(w1.i.f73307a.m(str2) ? "StartTrial" : "Subscribe", aVarA.getPurchaseAmount(), aVarA.getCurrency(), aVarA.getParam());
            } else {
                internalAppEventsLogger.j(aVarA.getPurchaseAmount(), aVarA.getCurrency(), aVarA.getParam());
            }
        }
    }

    public final a a(String purchase, String skuDetails) {
        return b(purchase, skuDetails, new HashMap());
    }

    public final a b(String purchase, String skuDetails, Map<String, String> extraParameter) {
        try {
            JSONObject jSONObject = new JSONObject(purchase);
            JSONObject jSONObject2 = new JSONObject(skuDetails);
            boolean z10 = true;
            Bundle bundle = new Bundle(1);
            bundle.putCharSequence("fb_iap_product_id", jSONObject.getString(InAppPurchaseMetaData.KEY_PRODUCT_ID));
            bundle.putCharSequence("fb_iap_purchase_time", jSONObject.getString("purchaseTime"));
            bundle.putCharSequence("fb_iap_purchase_token", jSONObject.getString("purchaseToken"));
            bundle.putCharSequence("fb_iap_package_name", jSONObject.optString(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME));
            bundle.putCharSequence("fb_iap_product_title", jSONObject2.optString("title"));
            bundle.putCharSequence("fb_iap_product_description", jSONObject2.optString(UnifiedMediationParams.KEY_DESCRIPTION));
            String strOptString = jSONObject2.optString("type");
            bundle.putCharSequence("fb_iap_product_type", strOptString);
            if (p.e(strOptString, "subs")) {
                bundle.putCharSequence("fb_iap_subs_auto_renewing", Boolean.toString(jSONObject.optBoolean("autoRenewing", false)));
                bundle.putCharSequence("fb_iap_subs_period", jSONObject2.optString("subscriptionPeriod"));
                bundle.putCharSequence("fb_free_trial_period", jSONObject2.optString("freeTrialPeriod"));
                String strOptString2 = jSONObject2.optString("introductoryPriceCycles");
                p.i(strOptString2, "introductoryPriceCycles");
                if (strOptString2.length() != 0) {
                    z10 = false;
                }
                if (!z10) {
                    bundle.putCharSequence("fb_intro_price_amount_micros", jSONObject2.optString("introductoryPriceAmountMicros"));
                    bundle.putCharSequence("fb_intro_price_cycles", strOptString2);
                }
            }
            for (Map.Entry<String, String> entry : extraParameter.entrySet()) {
                bundle.putCharSequence(entry.getKey(), entry.getValue());
            }
            BigDecimal bigDecimal = new BigDecimal(jSONObject2.getLong("price_amount_micros") / 1000000.0d);
            Currency currency = Currency.getInstance(jSONObject2.getString("price_currency_code"));
            p.i(currency, "getInstance(skuDetailsJSON.getString(\"price_currency_code\"))");
            return new a(bigDecimal, currency, bundle);
        } catch (JSONException e10) {
            Log.e(TAG, "Error parsing in-app subscription data.", e10);
            return null;
        }
    }

    public static final boolean c() {
        q qVarF = FetchedAppSettingsManager.f(t.m());
        if (qVarF != null && t.p() && qVarF.getIAPAutomaticLoggingEnabled()) {
            return true;
        }
        return false;
    }

    public static final void d() {
        Context contextL = t.l();
        String strM = t.m();
        if (t.p()) {
            if (contextL instanceof Application) {
                AppEventsLogger.INSTANCE.b((Application) contextL, strM);
            } else {
                Log.w(TAG, "Automatic logging of basic events will not happen, because FacebookSdk.getApplicationContext() returns object that is not instance of android.app.Application. Make sure you call FacebookSdk.sdkInitialize() from Application class and pass application context.");
            }
        }
    }

    public static final void e(String str, long j10) {
        Context contextL = t.l();
        q qVarN = FetchedAppSettingsManager.n(t.m(), false);
        if (qVarN != null && qVarN.getAutomaticLoggingEnabled() && j10 > 0) {
            x xVar = new x(contextL);
            Bundle bundle = new Bundle(1);
            bundle.putCharSequence("fb_aa_time_spent_view_name", str);
            xVar.c("fb_aa_time_spent_on_view", j10, bundle);
        }
    }
}
