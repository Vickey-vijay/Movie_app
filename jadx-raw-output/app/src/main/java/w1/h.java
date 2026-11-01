package w1;

import android.content.Context;
import androidx.annotation.RestrictTo;
import ck.p;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.C3605n2;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.unity3d.services.store.gpbl.bridges.billingclient.common.BillingClientBridgeCommon;
import com.unity3d.services.store.gpbl.bridges.billingclient.common.BillingClientBuilderBridgeCommon;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import lk.x;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: InAppPurchaseBillingClientWrapper.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0005\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0005\u0011\u0014\u0018\u001b\u001dB\u00ad\u0001\b\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0001\u0012\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u0017\u0012\n\u0010\u001c\u001a\u0006\u0012\u0002\b\u00030\u0017\u0012\n\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u0017\u0012\n\u0010 \u001a\u0006\u0012\u0002\b\u00030\u0017\u0012\n\u0010\"\u001a\u0006\u0012\u0002\b\u00030\u0017\u0012\n\u0010$\u001a\u0006\u0012\u0002\b\u00030\u0017\u0012\n\u0010&\u001a\u0006\u0012\u0002\b\u00030\u0017\u0012\u0006\u0010*\u001a\u00020'\u0012\u0006\u0010,\u001a\u00020'\u0012\u0006\u0010.\u001a\u00020'\u0012\u0006\u00100\u001a\u00020'\u0012\u0006\u00102\u001a\u00020'\u0012\u0006\u00103\u001a\u00020'\u0012\u0006\u00104\u001a\u00020'\u0012\u0006\u00108\u001a\u000205¢\u0006\u0004\b<\u0010=J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0004J(\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\n2\u0006\u0010\f\u001a\u00020\u0004H\u0002J\u0018\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0004H\u0002J\b\u0010\u000f\u001a\u00020\u0006H\u0002R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001c\u001a\u0006\u0012\u0002\b\u00030\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0018\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u0018\u0010 \u001a\u0006\u0012\u0002\b\u00030\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u0018\u0010\"\u001a\u0006\u0012\u0002\b\u00030\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u0018\u0010$\u001a\u0006\u0012\u0002\b\u00030\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u0018\u0010&\u001a\u0006\u0012\u0002\b\u00030\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010,\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010)R\u0014\u0010.\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010)R\u0014\u00100\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010)R\u0014\u00102\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010)R\u0014\u00103\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010)R\u0014\u00104\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010)R\u0014\u00108\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u001c\u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010:¨\u0006>"}, d2 = {"Lw1/h;", "", "", "skuType", "Ljava/lang/Runnable;", "queryPurchaseHistoryRunnable", "Lmj/r;", "p", "querySkuRunnable", "o", "", "skuIDs", "runnable", "s", "r", "t", "Landroid/content/Context;", "a", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "b", "Ljava/lang/Object;", "billingClient", "Ljava/lang/Class;", "c", "Ljava/lang/Class;", "billingClientClazz", "d", "purchaseResultClazz", "e", "purchaseClazz", InneractiveMediationDefs.GENDER_FEMALE, "skuDetailsClazz", "g", "purchaseHistoryRecordClazz", "h", "skuDetailsResponseListenerClazz", "i", "purchaseHistoryResponseListenerClazz", "Ljava/lang/reflect/Method;", "j", "Ljava/lang/reflect/Method;", "queryPurchasesMethod", CampaignEx.JSON_KEY_AD_K, "getPurchaseListMethod", "l", "getOriginalJsonMethod", InneractiveMediationDefs.GENDER_MALE, "getOriginalJsonSkuMethod", "n", "getOriginalJsonPurchaseHistoryMethod", "querySkuDetailsAsyncMethod", "queryPurchaseHistoryAsyncMethod", "Lw1/l;", "q", "Lw1/l;", "inAppPurchaseSkuDetailsWrapper", "", "Ljava/util/Set;", "historyPurchaseSet", "<init>", "(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Lw1/l;)V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class h {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static h f73281u;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final Object billingClient;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final Class<?> billingClientClazz;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final Class<?> purchaseResultClazz;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final Class<?> purchaseClazz;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final Class<?> skuDetailsClazz;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final Class<?> purchaseHistoryRecordClazz;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final Class<?> skuDetailsResponseListenerClazz;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public final Class<?> purchaseHistoryResponseListenerClazz;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final Method queryPurchasesMethod;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public final Method getPurchaseListMethod;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public final Method getOriginalJsonMethod;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public final Method getOriginalJsonSkuMethod;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final Method getOriginalJsonPurchaseHistoryMethod;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public final Method querySkuDetailsAsyncMethod;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public final Method queryPurchaseHistoryAsyncMethod;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    public final l inAppPurchaseSkuDetailsWrapper;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public final Set<String> historyPurchaseSet;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final AtomicBoolean f73280t = new AtomicBoolean(false);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final AtomicBoolean f73282v = new AtomicBoolean(false);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Map<String, JSONObject> f73283w = new ConcurrentHashMap();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Map<String, JSONObject> f73284x = new ConcurrentHashMap();

    /* JADX INFO: renamed from: w1.h$b, reason: from kotlin metadata */
    /* JADX INFO: compiled from: InAppPurchaseBillingClientWrapper.kt */
    @Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b(\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b8\u00109J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J \u0010\n\u001a\u0004\u0018\u00010\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\bH\u0002R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR#\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00108\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R#\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00108\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u001aR\u0014\u0010 \u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\u001aR\u0014\u0010!\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\u001aR\u0014\u0010\"\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010\u001aR\u0014\u0010#\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010\u001aR\u0014\u0010$\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010\u001aR\u0014\u0010%\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010\u001aR\u0014\u0010&\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010\u001aR\u0014\u0010'\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010\u001aR\u0014\u0010(\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010\u001aR\u0014\u0010)\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010\u001aR\u0014\u0010*\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010\u001aR\u0014\u0010+\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b+\u0010\u001aR\u0014\u0010,\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010\u001aR\u0014\u0010-\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b-\u0010\u001aR\u0014\u0010.\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b.\u0010\u001aR\u0014\u0010/\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b/\u0010\u001aR\u0014\u00100\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b0\u0010\u001aR\u0014\u00101\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b1\u0010\u001aR\u0014\u00102\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b2\u0010\u001aR\u0014\u00103\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b3\u0010\u001aR\u0014\u00104\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b4\u0010\u001aR\u0014\u00105\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010\rR\u0018\u00106\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107¨\u0006:"}, d2 = {"Lw1/h$b;", "", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "Lw1/h;", "c", "Lmj/r;", "b", "Ljava/lang/Class;", "billingClientClazz", "a", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isServiceConnected", "Ljava/util/concurrent/atomic/AtomicBoolean;", InneractiveMediationDefs.GENDER_FEMALE, "()Ljava/util/concurrent/atomic/AtomicBoolean;", "", "", "Lorg/json/JSONObject;", "purchaseDetailsMap", "Ljava/util/Map;", "d", "()Ljava/util/Map;", "skuDetailsMap", "e", "CLASSNAME_BILLING_CLIENT", "Ljava/lang/String;", "CLASSNAME_BILLING_CLIENT_BUILDER", "CLASSNAME_BILLING_CLIENT_STATE_LISTENER", "CLASSNAME_PURCHASE", "CLASSNAME_PURCHASES_RESULT", "CLASSNAME_PURCHASE_HISTORY_RECORD", "CLASSNAME_PURCHASE_HISTORY_RESPONSE_LISTENER", "CLASSNAME_PURCHASE_UPDATED_LISTENER", "CLASSNAME_SKU_DETAILS", "CLASSNAME_SKU_DETAILS_RESPONSE_LISTENER", "IN_APP", "METHOD_BUILD", "METHOD_ENABLE_PENDING_PURCHASES", "METHOD_GET_ORIGINAL_JSON", "METHOD_GET_PURCHASE_LIST", "METHOD_NEW_BUILDER", "METHOD_ON_BILLING_SERVICE_DISCONNECTED", "METHOD_ON_BILLING_SETUP_FINISHED", "METHOD_ON_PURCHASE_HISTORY_RESPONSE", "METHOD_ON_SKU_DETAILS_RESPONSE", "METHOD_QUERY_PURCHASES", "METHOD_QUERY_PURCHASE_HISTORY_ASYNC", "METHOD_QUERY_SKU_DETAILS_ASYNC", "METHOD_SET_LISTENER", "METHOD_START_CONNECTION", "PACKAGE_NAME", "PRODUCT_ID", "initialized", C3605n2.f30210p, "Lw1/h;", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(ck.i iVar) {
            this();
        }

        public final synchronized h c(Context context) {
            p.j(context, GAMConfig.KEY_CONTEXT);
            if (h.f().get()) {
                return h.g();
            }
            b(context);
            h.f().set(true);
            return h.g();
        }

        public final Object a(Context context, Class<?> billingClientClazz) {
            Object objE;
            Object objE2;
            Object objE3;
            Class<?> clsA = m.a("com.android.billingclient.api.BillingClient$Builder");
            Class<?> clsA2 = m.a("com.android.billingclient.api.PurchasesUpdatedListener");
            if (clsA == null || clsA2 == null) {
                return null;
            }
            Method methodD = m.d(billingClientClazz, "newBuilder", Context.class);
            Method methodD2 = m.d(clsA, "enablePendingPurchases", new Class[0]);
            Method methodD3 = m.d(clsA, "setListener", clsA2);
            Method methodD4 = m.d(clsA, BillingClientBuilderBridgeCommon.buildMethodName, new Class[0]);
            if (methodD == null || methodD2 == null || methodD3 == null || methodD4 == null || (objE = m.e(billingClientClazz, methodD, null, context)) == null || (objE2 = m.e(clsA, methodD3, objE, Proxy.newProxyInstance(clsA2.getClassLoader(), new Class[]{clsA2}, new d()))) == null || (objE3 = m.e(clsA, methodD2, objE2, new Object[0])) == null) {
                return null;
            }
            return m.e(clsA, methodD4, objE3, new Object[0]);
        }

        public final void b(Context context) {
            l lVarB = l.INSTANCE.b();
            if (lVarB == null) {
                return;
            }
            Class<?> clsA = m.a("com.android.billingclient.api.BillingClient");
            Class<?> clsA2 = m.a("com.android.billingclient.api.Purchase");
            Class<?> clsA3 = m.a("com.android.billingclient.api.Purchase$PurchasesResult");
            Class<?> clsA4 = m.a("com.android.billingclient.api.SkuDetails");
            Class<?> clsA5 = m.a("com.android.billingclient.api.PurchaseHistoryRecord");
            Class<?> clsA6 = m.a("com.android.billingclient.api.SkuDetailsResponseListener");
            Class<?> clsA7 = m.a("com.android.billingclient.api.PurchaseHistoryResponseListener");
            if (clsA == null || clsA3 == null || clsA2 == null || clsA4 == null || clsA6 == null || clsA5 == null || clsA7 == null) {
                return;
            }
            Method methodD = m.d(clsA, "queryPurchases", String.class);
            Method methodD2 = m.d(clsA3, "getPurchasesList", new Class[0]);
            Method methodD3 = m.d(clsA2, "getOriginalJson", new Class[0]);
            Method methodD4 = m.d(clsA4, "getOriginalJson", new Class[0]);
            Method methodD5 = m.d(clsA5, "getOriginalJson", new Class[0]);
            Method methodD6 = m.d(clsA, "querySkuDetailsAsync", lVarB.e(), clsA6);
            Method methodD7 = m.d(clsA, BillingClientBridgeCommon.queryPurchaseHistoryAsyncMethodName, String.class, clsA7);
            if (methodD == null || methodD2 == null || methodD3 == null || methodD4 == null || methodD5 == null || methodD6 == null || methodD7 == null) {
                return;
            }
            Object objA = a(context, clsA);
            if (objA == null) {
                return;
            }
            h.m(new h(context, objA, clsA, clsA3, clsA2, clsA4, clsA5, clsA6, clsA7, methodD, methodD2, methodD3, methodD4, methodD5, methodD6, methodD7, lVarB, null));
            h hVarG = h.g();
            if (hVarG == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper");
            }
            h.n(hVarG);
        }

        public final Map<String, JSONObject> d() {
            return h.h();
        }

        public final Map<String, JSONObject> e() {
            return h.k();
        }

        public final AtomicBoolean f() {
            return h.l();
        }
    }

    /* JADX INFO: compiled from: InAppPurchaseBillingClientWrapper.kt */
    @Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0081\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0016J2\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\r\u001a\u00020\f2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\nH\u0002R\"\u0010\u0014\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lw1/h$c;", "Ljava/lang/reflect/InvocationHandler;", "", "proxy", "Ljava/lang/reflect/Method;", "method", "", "args", "invoke", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", "", "purchaseHistoryRecordList", "Lmj/r;", "a", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "getRunnable", "()Ljava/lang/Runnable;", "setRunnable", "(Ljava/lang/Runnable;)V", "runnable", "<init>", "(Lw1/h;Ljava/lang/Runnable;)V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public final class c implements InvocationHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public Runnable runnable;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h f73304b;

        public c(h hVar, Runnable runnable) {
            p.j(hVar, "this$0");
            p.j(runnable, "runnable");
            this.f73304b = hVar;
            this.runnable = runnable;
        }

        public final void a(List<?> list) {
            if (i2.a.d(this)) {
                return;
            }
            try {
                for (Object obj : list) {
                    try {
                        m mVar = m.f73328a;
                        Object objE = m.e(h.i(this.f73304b), h.c(this.f73304b), obj, new Object[0]);
                        String str = objE instanceof String ? (String) objE : null;
                        if (str != null) {
                            JSONObject jSONObject = new JSONObject(str);
                            jSONObject.put(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME, h.b(this.f73304b).getPackageName());
                            if (jSONObject.has(InAppPurchaseMetaData.KEY_PRODUCT_ID)) {
                                String string = jSONObject.getString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
                                h.e(this.f73304b).add(string);
                                Map<String, JSONObject> mapD = h.INSTANCE.d();
                                p.i(string, "skuID");
                                mapD.put(string, jSONObject);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
                this.runnable.run();
            } catch (Throwable th2) {
                i2.a.b(th2, this);
            }
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object proxy, Method method, Object[] args) {
            Object obj;
            if (i2.a.d(this)) {
                return null;
            }
            try {
                p.j(proxy, "proxy");
                p.j(method, "method");
                if (p.e(method.getName(), "onPurchaseHistoryResponse")) {
                    if (args == null) {
                        obj = null;
                    } else {
                        obj = args[1];
                    }
                    if (obj != null && (obj instanceof List)) {
                        a((List) obj);
                    }
                }
                return null;
            } catch (Throwable th2) {
                i2.a.b(th2, this);
                return null;
            }
        }
    }

    /* JADX INFO: compiled from: InAppPurchaseBillingClientWrapper.kt */
    @Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0081\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0016J2\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\r\u001a\u00020\f2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\nR\"\u0010\u0014\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lw1/h$e;", "Ljava/lang/reflect/InvocationHandler;", "", "proxy", "Ljava/lang/reflect/Method;", InneractiveMediationDefs.GENDER_MALE, "", "args", "invoke", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", "", "skuDetailsObjectList", "Lmj/r;", "a", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "getRunnable", "()Ljava/lang/Runnable;", "setRunnable", "(Ljava/lang/Runnable;)V", "runnable", "<init>", "(Lw1/h;Ljava/lang/Runnable;)V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public final class e implements InvocationHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public Runnable runnable;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h f73306b;

        public e(h hVar, Runnable runnable) {
            p.j(hVar, "this$0");
            p.j(runnable, "runnable");
            this.f73306b = hVar;
            this.runnable = runnable;
        }

        public final void a(List<?> list) {
            if (i2.a.d(this)) {
                return;
            }
            try {
                p.j(list, "skuDetailsObjectList");
                for (Object obj : list) {
                    try {
                        m mVar = m.f73328a;
                        Object objE = m.e(h.j(this.f73306b), h.d(this.f73306b), obj, new Object[0]);
                        String str = objE instanceof String ? (String) objE : null;
                        if (str != null) {
                            JSONObject jSONObject = new JSONObject(str);
                            if (jSONObject.has(InAppPurchaseMetaData.KEY_PRODUCT_ID)) {
                                String string = jSONObject.getString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
                                Map<String, JSONObject> mapE = h.INSTANCE.e();
                                p.i(string, "skuID");
                                mapE.put(string, jSONObject);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
                this.runnable.run();
            } catch (Throwable th2) {
                i2.a.b(th2, this);
            }
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object proxy, Method m10, Object[] args) {
            Object obj;
            if (i2.a.d(this)) {
                return null;
            }
            try {
                p.j(proxy, "proxy");
                p.j(m10, InneractiveMediationDefs.GENDER_MALE);
                if (p.e(m10.getName(), "onSkuDetailsResponse")) {
                    if (args == null) {
                        obj = null;
                    } else {
                        obj = args[1];
                    }
                    if (obj != null && (obj instanceof List)) {
                        a((List) obj);
                    }
                }
                return null;
            } catch (Throwable th2) {
                i2.a.b(th2, this);
                return null;
            }
        }
    }

    public h(Context context, Object obj, Class<?> cls, Class<?> cls2, Class<?> cls3, Class<?> cls4, Class<?> cls5, Class<?> cls6, Class<?> cls7, Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, l lVar) {
        this.context = context;
        this.billingClient = obj;
        this.billingClientClazz = cls;
        this.purchaseResultClazz = cls2;
        this.purchaseClazz = cls3;
        this.skuDetailsClazz = cls4;
        this.purchaseHistoryRecordClazz = cls5;
        this.skuDetailsResponseListenerClazz = cls6;
        this.purchaseHistoryResponseListenerClazz = cls7;
        this.queryPurchasesMethod = method;
        this.getPurchaseListMethod = method2;
        this.getOriginalJsonMethod = method3;
        this.getOriginalJsonSkuMethod = method4;
        this.getOriginalJsonPurchaseHistoryMethod = method5;
        this.querySkuDetailsAsyncMethod = method6;
        this.queryPurchaseHistoryAsyncMethod = method7;
        this.inAppPurchaseSkuDetailsWrapper = lVar;
        this.historyPurchaseSet = new CopyOnWriteArraySet();
    }

    public /* synthetic */ h(Context context, Object obj, Class cls, Class cls2, Class cls3, Class cls4, Class cls5, Class cls6, Class cls7, Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, l lVar, ck.i iVar) {
        this(context, obj, cls, cls2, cls3, cls4, cls5, cls6, cls7, method, method2, method3, method4, method5, method6, method7, lVar);
    }

    /* JADX INFO: compiled from: InAppPurchaseBillingClientWrapper.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ2\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lw1/h$a;", "Ljava/lang/reflect/InvocationHandler;", "", "proxy", "Ljava/lang/reflect/Method;", InneractiveMediationDefs.GENDER_MALE, "", "args", "invoke", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class a implements InvocationHandler {
        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object proxy, Method m10, Object[] args) {
            if (i2.a.d(this)) {
                return null;
            }
            try {
                p.j(proxy, "proxy");
                p.j(m10, InneractiveMediationDefs.GENDER_MALE);
                if (p.e(m10.getName(), "onBillingSetupFinished")) {
                    h.INSTANCE.f().set(true);
                } else {
                    String name = m10.getName();
                    p.i(name, "m.name");
                    if (x.D(name, "onBillingServiceDisconnected", false, 2, null)) {
                        h.INSTANCE.f().set(false);
                    }
                }
                return null;
            } catch (Throwable th2) {
                i2.a.b(th2, this);
                return null;
            }
        }
    }

    /* JADX INFO: compiled from: InAppPurchaseBillingClientWrapper.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ2\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lw1/h$d;", "Ljava/lang/reflect/InvocationHandler;", "", "proxy", "Ljava/lang/reflect/Method;", InneractiveMediationDefs.GENDER_MALE, "", "args", "invoke", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class d implements InvocationHandler {
        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object proxy, Method m10, Object[] args) {
            if (i2.a.d(this)) {
                return null;
            }
            try {
                p.j(proxy, "proxy");
                p.j(m10, InneractiveMediationDefs.GENDER_MALE);
                return null;
            } catch (Throwable th2) {
                i2.a.b(th2, this);
                return null;
            }
        }
    }

    public static final /* synthetic */ Context b(h hVar) {
        if (i2.a.d(h.class)) {
            return null;
        }
        try {
            return hVar.context;
        } catch (Throwable th2) {
            i2.a.b(th2, h.class);
            return null;
        }
    }

    public static final /* synthetic */ Method c(h hVar) {
        if (i2.a.d(h.class)) {
            return null;
        }
        try {
            return hVar.getOriginalJsonPurchaseHistoryMethod;
        } catch (Throwable th2) {
            i2.a.b(th2, h.class);
            return null;
        }
    }

    public static final /* synthetic */ Method d(h hVar) {
        if (i2.a.d(h.class)) {
            return null;
        }
        try {
            return hVar.getOriginalJsonSkuMethod;
        } catch (Throwable th2) {
            i2.a.b(th2, h.class);
            return null;
        }
    }

    public static final /* synthetic */ Set e(h hVar) {
        if (i2.a.d(h.class)) {
            return null;
        }
        try {
            return hVar.historyPurchaseSet;
        } catch (Throwable th2) {
            i2.a.b(th2, h.class);
            return null;
        }
    }

    public static final /* synthetic */ AtomicBoolean f() {
        if (i2.a.d(h.class)) {
            return null;
        }
        try {
            return f73280t;
        } catch (Throwable th2) {
            i2.a.b(th2, h.class);
            return null;
        }
    }

    public static final /* synthetic */ h g() {
        if (i2.a.d(h.class)) {
            return null;
        }
        try {
            return f73281u;
        } catch (Throwable th2) {
            i2.a.b(th2, h.class);
            return null;
        }
    }

    public static final /* synthetic */ Map h() {
        if (i2.a.d(h.class)) {
            return null;
        }
        try {
            return f73283w;
        } catch (Throwable th2) {
            i2.a.b(th2, h.class);
            return null;
        }
    }

    public static final /* synthetic */ Class i(h hVar) {
        if (i2.a.d(h.class)) {
            return null;
        }
        try {
            return hVar.purchaseHistoryRecordClazz;
        } catch (Throwable th2) {
            i2.a.b(th2, h.class);
            return null;
        }
    }

    public static final /* synthetic */ Class j(h hVar) {
        if (i2.a.d(h.class)) {
            return null;
        }
        try {
            return hVar.skuDetailsClazz;
        } catch (Throwable th2) {
            i2.a.b(th2, h.class);
            return null;
        }
    }

    public static final /* synthetic */ Map k() {
        if (i2.a.d(h.class)) {
            return null;
        }
        try {
            return f73284x;
        } catch (Throwable th2) {
            i2.a.b(th2, h.class);
            return null;
        }
    }

    public static final /* synthetic */ AtomicBoolean l() {
        if (i2.a.d(h.class)) {
            return null;
        }
        try {
            return f73282v;
        } catch (Throwable th2) {
            i2.a.b(th2, h.class);
            return null;
        }
    }

    public static final /* synthetic */ void m(h hVar) {
        if (i2.a.d(h.class)) {
            return;
        }
        try {
            f73281u = hVar;
        } catch (Throwable th2) {
            i2.a.b(th2, h.class);
        }
    }

    public static final /* synthetic */ void n(h hVar) {
        if (i2.a.d(h.class)) {
            return;
        }
        try {
            hVar.t();
        } catch (Throwable th2) {
            i2.a.b(th2, h.class);
        }
    }

    public static final void q(h hVar, Runnable runnable) {
        if (i2.a.d(h.class)) {
            return;
        }
        try {
            p.j(hVar, "this$0");
            p.j(runnable, "$queryPurchaseHistoryRunnable");
            hVar.s("inapp", new ArrayList(hVar.historyPurchaseSet), runnable);
        } catch (Throwable th2) {
            i2.a.b(th2, h.class);
        }
    }

    public final void o(String str, Runnable runnable) {
        if (i2.a.d(this)) {
            return;
        }
        try {
            p.j(str, "skuType");
            p.j(runnable, "querySkuRunnable");
            m mVar = m.f73328a;
            Object objE = m.e(this.purchaseResultClazz, this.getPurchaseListMethod, m.e(this.billingClientClazz, this.queryPurchasesMethod, this.billingClient, "inapp"), new Object[0]);
            List list = objE instanceof List ? (List) objE : null;
            if (list == null) {
                return;
            }
            try {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    m mVar2 = m.f73328a;
                    Object objE2 = m.e(this.purchaseClazz, this.getOriginalJsonMethod, obj, new Object[0]);
                    String str2 = objE2 instanceof String ? (String) objE2 : null;
                    if (str2 != null) {
                        JSONObject jSONObject = new JSONObject(str2);
                        if (jSONObject.has(InAppPurchaseMetaData.KEY_PRODUCT_ID)) {
                            String string = jSONObject.getString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
                            arrayList.add(string);
                            Map<String, JSONObject> map = f73283w;
                            p.i(string, "skuID");
                            map.put(string, jSONObject);
                        }
                    }
                }
                s(str, arrayList, runnable);
            } catch (JSONException unused) {
            }
        } catch (Throwable th2) {
            i2.a.b(th2, this);
        }
    }

    public final void p(String str, final Runnable runnable) {
        if (i2.a.d(this)) {
            return;
        }
        try {
            p.j(str, "skuType");
            p.j(runnable, "queryPurchaseHistoryRunnable");
            r(str, new Runnable() { // from class: w1.g
                @Override // java.lang.Runnable
                public final void run() {
                    h.q(this.f73277b, runnable);
                }
            });
        } catch (Throwable th2) {
            i2.a.b(th2, this);
        }
    }

    public final void r(String str, Runnable runnable) {
        if (i2.a.d(this)) {
            return;
        }
        try {
            Object objNewProxyInstance = Proxy.newProxyInstance(this.purchaseHistoryResponseListenerClazz.getClassLoader(), new Class[]{this.purchaseHistoryResponseListenerClazz}, new c(this, runnable));
            m mVar = m.f73328a;
            m.e(this.billingClientClazz, this.queryPurchaseHistoryAsyncMethod, this.billingClient, str, objNewProxyInstance);
        } catch (Throwable th2) {
            i2.a.b(th2, this);
        }
    }

    public final void s(String str, List<String> list, Runnable runnable) {
        if (i2.a.d(this)) {
            return;
        }
        try {
            Object objNewProxyInstance = Proxy.newProxyInstance(this.skuDetailsResponseListenerClazz.getClassLoader(), new Class[]{this.skuDetailsResponseListenerClazz}, new e(this, runnable));
            Object objD = this.inAppPurchaseSkuDetailsWrapper.d(str, list);
            m mVar = m.f73328a;
            m.e(this.billingClientClazz, this.querySkuDetailsAsyncMethod, this.billingClient, objD, objNewProxyInstance);
        } catch (Throwable th2) {
            i2.a.b(th2, this);
        }
    }

    public final void t() {
        Method methodD;
        if (i2.a.d(this)) {
            return;
        }
        try {
            Class<?> clsA = m.a("com.android.billingclient.api.BillingClientStateListener");
            if (clsA == null || (methodD = m.d(this.billingClientClazz, BillingClientBridgeCommon.startConnectionMethodName, clsA)) == null) {
                return;
            }
            m.e(this.billingClientClazz, methodD, this.billingClient, Proxy.newProxyInstance(clsA.getClassLoader(), new Class[]{clsA}, new a()));
        } catch (Throwable th2) {
            i2.a.b(th2, this);
        }
    }
}
