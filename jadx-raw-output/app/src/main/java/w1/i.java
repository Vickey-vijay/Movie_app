package w1;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.IBinder;
import androidx.annotation.RestrictTo;
import androidx.core.app.NotificationCompat;
import androidx.core.graphics.drawable.IconCompat;
import ck.p;
import com.applovin.sdk.AppLovinEventParameters;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import lk.a0;
import org.json.JSONException;
import org.json.JSONObject;
import q1.t;

/* JADX INFO: compiled from: InAppPurchaseEventManager.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b:\u0010;J\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007JF\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\r\u001a\u00020\fH\u0007J*\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0007J*\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0007J*\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0007J\b\u0010\u0014\u001a\u00020\u0013H\u0007J\u000e\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\bJF\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\r\u001a\u00020\fH\u0002J,\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00182\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tH\u0002J\u001c\u0010\u001b\u001a\u00020\u00132\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u000eH\u0002J\"\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001c\u001a\u00020\bH\u0002J2\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001c\u001a\u00020\bH\u0002J0\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\bH\u0002J0\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\u0016\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tH\u0002J\u001e\u0010&\u001a\u0004\u0018\u00010%2\n\u0010#\u001a\u0006\u0012\u0002\b\u00030\"2\u0006\u0010$\u001a\u00020\bH\u0002J\u001e\u0010(\u001a\b\u0012\u0002\b\u0003\u0018\u00010\"2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\bH\u0002JC\u0010,\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\b2\u0006\u0010$\u001a\u00020\b2\b\u0010)\u001a\u0004\u0018\u00010\u00012\u000e\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010*H\u0002¢\u0006\u0004\b,\u0010-R0\u00101\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020%0.j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020%`/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u00100R8\u00102\u001a&\u0012\u0004\u0012\u00020\b\u0012\b\u0012\u0006\u0012\u0002\b\u00030\"0.j\u0012\u0012\u0004\u0012\u00020\b\u0012\b\u0012\u0006\u0012\u0002\b\u00030\"`/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u00100R\u001c\u00105\u001a\n 3*\u0004\u0018\u00010\b0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u00104R\u001c\u00108\u001a\n 3*\u0004\u0018\u000106068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u00107R\u001c\u00109\u001a\n 3*\u0004\u0018\u000106068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u00107¨\u0006<"}, d2 = {"Lw1/i;", "", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "Landroid/os/IBinder;", NotificationCompat.CATEGORY_SERVICE, "a", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "skuList", "inAppBillingObj", "", "isSubscription", "", CampaignEx.JSON_KEY_AD_K, "i", "j", "g", "Lmj/r;", "b", "skuDetail", InneractiveMediationDefs.GENDER_MALE, "l", "", "p", "skuDetailsMap", "q", "type", "o", "h", InneractiveMediationDefs.GENDER_FEMALE, "purchases", "c", "Ljava/lang/Class;", "classObj", "methodName", "Ljava/lang/reflect/Method;", "e", "className", "d", IconCompat.EXTRA_OBJ, "", "args", "n", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "methodMap", "classMap", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "PACKAGE_NAME", "Landroid/content/SharedPreferences;", "Landroid/content/SharedPreferences;", "skuDetailSharedPrefs", "purchaseInappSharedPrefs", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f73307a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final HashMap<String, Method> methodMap = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final HashMap<String, Class<?>> classMap = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final String PACKAGE_NAME = t.l().getPackageName();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final SharedPreferences skuDetailSharedPrefs = t.l().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final SharedPreferences purchaseInappSharedPrefs = t.l().getSharedPreferences("com.facebook.internal.PURCHASE", 0);

    public static final Object a(Context context, IBinder service) {
        if (i2.a.d(i.class)) {
            return null;
        }
        try {
            p.j(context, GAMConfig.KEY_CONTEXT);
            return f73307a.n(context, "com.android.vending.billing.IInAppBillingService$Stub", "asInterface", null, new Object[]{service});
        } catch (Throwable th2) {
            i2.a.b(th2, i.class);
            return null;
        }
    }

    public static final void b() {
        if (i2.a.d(i.class)) {
            return;
        }
        try {
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences sharedPreferences = skuDetailSharedPrefs;
            long j10 = sharedPreferences.getLong("LAST_CLEARED_TIME", 0L);
            if (j10 == 0) {
                sharedPreferences.edit().putLong("LAST_CLEARED_TIME", jCurrentTimeMillis).apply();
            } else if (jCurrentTimeMillis - j10 > 604800) {
                sharedPreferences.edit().clear().putLong("LAST_CLEARED_TIME", jCurrentTimeMillis).apply();
            }
        } catch (Throwable th2) {
            i2.a.b(th2, i.class);
        }
    }

    public static final ArrayList<String> g(Context context, Object inAppBillingObj) {
        i iVar;
        Class<?> clsD;
        if (i2.a.d(i.class)) {
            return null;
        }
        try {
            p.j(context, GAMConfig.KEY_CONTEXT);
            ArrayList<String> arrayList = new ArrayList<>();
            return (inAppBillingObj == null || (clsD = (iVar = f73307a).d(context, "com.android.vending.billing.IInAppBillingService")) == null || iVar.e(clsD, "getPurchaseHistory") == null) ? arrayList : iVar.c(iVar.f(context, inAppBillingObj, "inapp"));
        } catch (Throwable th2) {
            i2.a.b(th2, i.class);
            return null;
        }
    }

    public static final ArrayList<String> i(Context context, Object inAppBillingObj) {
        if (i2.a.d(i.class)) {
            return null;
        }
        try {
            p.j(context, GAMConfig.KEY_CONTEXT);
            i iVar = f73307a;
            return iVar.c(iVar.h(context, inAppBillingObj, "inapp"));
        } catch (Throwable th2) {
            i2.a.b(th2, i.class);
            return null;
        }
    }

    public static final ArrayList<String> j(Context context, Object inAppBillingObj) {
        if (i2.a.d(i.class)) {
            return null;
        }
        try {
            p.j(context, GAMConfig.KEY_CONTEXT);
            i iVar = f73307a;
            return iVar.c(iVar.h(context, inAppBillingObj, "subs"));
        } catch (Throwable th2) {
            i2.a.b(th2, i.class);
            return null;
        }
    }

    public static final Map<String, String> k(Context context, ArrayList<String> skuList, Object inAppBillingObj, boolean isSubscription) {
        if (i2.a.d(i.class)) {
            return null;
        }
        try {
            p.j(context, GAMConfig.KEY_CONTEXT);
            p.j(skuList, "skuList");
            Map<String, String> mapP = f73307a.p(skuList);
            ArrayList<String> arrayList = new ArrayList<>();
            for (String str : skuList) {
                if (!mapP.containsKey(str)) {
                    arrayList.add(str);
                }
            }
            mapP.putAll(f73307a.l(context, arrayList, inAppBillingObj, isSubscription));
            return mapP;
        } catch (Throwable th2) {
            i2.a.b(th2, i.class);
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final Method e(Class<?> classObj, String methodName) {
        Class[] clsArr;
        Method methodC;
        if (i2.a.d(this)) {
            return null;
        }
        try {
            HashMap<String, Method> map = methodMap;
            Method method = map.get(methodName);
            if (method != null) {
                return method;
            }
            switch (methodName) {
                case "getPurchases":
                    Class cls = Integer.TYPE;
                    p.i(cls, "TYPE");
                    clsArr = new Class[]{cls, String.class, String.class, String.class};
                    break;
                case "isBillingSupported":
                    Class cls2 = Integer.TYPE;
                    p.i(cls2, "TYPE");
                    clsArr = new Class[]{cls2, String.class, String.class};
                    break;
                case "asInterface":
                    clsArr = new Class[]{IBinder.class};
                    break;
                case "getPurchaseHistory":
                    Class cls3 = Integer.TYPE;
                    p.i(cls3, "TYPE");
                    clsArr = new Class[]{cls3, String.class, String.class, String.class, Bundle.class};
                    break;
                case "getSkuDetails":
                    Class cls4 = Integer.TYPE;
                    p.i(cls4, "TYPE");
                    clsArr = new Class[]{cls4, String.class, String.class, Bundle.class};
                    break;
                default:
                    clsArr = null;
                    break;
            }
            if (clsArr == null) {
                methodC = m.c(classObj, methodName, null);
            } else {
                m mVar = m.f73328a;
                methodC = m.c(classObj, methodName, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            }
            if (methodC != null) {
                map.put(methodName, methodC);
            }
            return methodC;
        } catch (Throwable th2) {
            i2.a.b(th2, this);
            return null;
        }
    }

    public final ArrayList<String> c(ArrayList<String> purchases) {
        if (i2.a.d(this)) {
            return null;
        }
        try {
            ArrayList<String> arrayList = new ArrayList<>();
            SharedPreferences.Editor editorEdit = purchaseInappSharedPrefs.edit();
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            for (String str : purchases) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    String string = jSONObject.getString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
                    long j10 = jSONObject.getLong("purchaseTime");
                    String string2 = jSONObject.getString("purchaseToken");
                    if (jCurrentTimeMillis - (j10 / 1000) <= 86400 && !p.e(purchaseInappSharedPrefs.getString(string, ""), string2)) {
                        editorEdit.putString(string, string2);
                        arrayList.add(str);
                    }
                } catch (JSONException unused) {
                }
            }
            editorEdit.apply();
            return arrayList;
        } catch (Throwable th2) {
            i2.a.b(th2, this);
            return null;
        }
    }

    public final Class<?> d(Context context, String className) {
        if (i2.a.d(this)) {
            return null;
        }
        try {
            HashMap<String, Class<?>> map = classMap;
            Class<?> cls = map.get(className);
            if (cls != null) {
                return cls;
            }
            Class<?> clsB = m.b(context, className);
            if (clsB != null) {
                map.put(className, clsB);
            }
            return clsB;
        } catch (Throwable th2) {
            i2.a.b(th2, this);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0091  */
    public final ArrayList<String> f(Context context, Object inAppBillingObj, String type) {
        ArrayList<String> stringArrayList;
        if (i2.a.d(this)) {
            return null;
        }
        try {
            ArrayList<String> arrayList = new ArrayList<>();
            if (o(context, inAppBillingObj, type)) {
                String string = null;
                int i10 = 0;
                boolean z10 = false;
                do {
                    Object objN = n(context, "com.android.vending.billing.IInAppBillingService", "getPurchaseHistory", inAppBillingObj, new Object[]{6, PACKAGE_NAME, type, string, new Bundle()});
                    if (objN != null) {
                        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                        Bundle bundle = (Bundle) objN;
                        if (bundle.getInt("RESPONSE_CODE") == 0 && (stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST")) != null) {
                            for (String str : stringArrayList) {
                                try {
                                    if (jCurrentTimeMillis - (new JSONObject(str).getLong("purchaseTime") / 1000) > 1200) {
                                        z10 = true;
                                        break;
                                    }
                                    arrayList.add(str);
                                    i10++;
                                } catch (JSONException unused) {
                                }
                            }
                            string = bundle.getString("INAPP_CONTINUATION_TOKEN");
                        } else {
                            string = null;
                        }
                    } else {
                        string = null;
                    }
                    if (i10 >= 30 || string == null) {
                        break;
                    }
                } while (!z10);
            }
            return arrayList;
        } catch (Throwable th2) {
            i2.a.b(th2, this);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005b  */
    /* JADX WARN: Code duplicated, block: B:22:0x0060 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:30:0x0062 A[EDGE_INSN: B:30:0x0062->B:23:0x0062 BREAK  A[LOOP:0: B:11:0x0019->B:32:?], SYNTHETIC] */
    public final ArrayList<String> h(Context context, Object inAppBillingObj, String type) {
        if (i2.a.d(this)) {
            return null;
        }
        try {
            ArrayList<String> arrayList = new ArrayList<>();
            if (inAppBillingObj != null && o(context, inAppBillingObj, type)) {
                String string = null;
                int size = 0;
                do {
                    Object objN = n(context, "com.android.vending.billing.IInAppBillingService", "getPurchases", inAppBillingObj, new Object[]{3, PACKAGE_NAME, type, string});
                    if (objN != null) {
                        Bundle bundle = (Bundle) objN;
                        if (bundle.getInt("RESPONSE_CODE") == 0) {
                            ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                            if (stringArrayList == null) {
                                break;
                            }
                            size += stringArrayList.size();
                            arrayList.addAll(stringArrayList);
                            string = bundle.getString("INAPP_CONTINUATION_TOKEN");
                        } else {
                            string = null;
                        }
                        if (size < 30) {
                            break;
                        }
                    } else {
                        string = null;
                        if (size < 30) {
                            break;
                            break;
                        }
                    }
                } while (string != null);
            }
            return arrayList;
        } catch (Throwable th2) {
            i2.a.b(th2, this);
            return null;
        }
    }

    public final Map<String, String> l(Context context, ArrayList<String> skuList, Object inAppBillingObj, boolean isSubscription) {
        Object obj;
        int size;
        if (i2.a.d(this)) {
            return null;
        }
        try {
            Map<String, String> linkedHashMap = new LinkedHashMap<>();
            if (inAppBillingObj != null && !skuList.isEmpty()) {
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("ITEM_ID_LIST", skuList);
                Object[] objArr = new Object[4];
                int i10 = 0;
                objArr[0] = 3;
                objArr[1] = PACKAGE_NAME;
                if (isSubscription) {
                    obj = "subs";
                } else {
                    obj = "inapp";
                }
                objArr[2] = obj;
                objArr[3] = bundle;
                Object objN = n(context, "com.android.vending.billing.IInAppBillingService", "getSkuDetails", inAppBillingObj, objArr);
                if (objN != null) {
                    Bundle bundle2 = (Bundle) objN;
                    if (bundle2.getInt("RESPONSE_CODE") == 0) {
                        ArrayList<String> stringArrayList = bundle2.getStringArrayList("DETAILS_LIST");
                        if (stringArrayList != null && skuList.size() == stringArrayList.size() && (size = skuList.size() - 1) >= 0) {
                            while (true) {
                                int i11 = i10 + 1;
                                String str = skuList.get(i10);
                                p.i(str, "skuList[i]");
                                String str2 = stringArrayList.get(i10);
                                p.i(str2, "skuDetailsList[i]");
                                linkedHashMap.put(str, str2);
                                if (i11 > size) {
                                    break;
                                }
                                i10 = i11;
                            }
                        }
                        q(linkedHashMap);
                    }
                }
            }
            return linkedHashMap;
        } catch (Throwable th2) {
            i2.a.b(th2, this);
            return null;
        }
    }

    public final boolean m(String skuDetail) {
        boolean z10;
        if (i2.a.d(this)) {
            return false;
        }
        try {
            p.j(skuDetail, "skuDetail");
            try {
                String strOptString = new JSONObject(skuDetail).optString("freeTrialPeriod");
                if (strOptString == null) {
                    return false;
                }
                if (strOptString.length() > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    return false;
                }
                return true;
            } catch (JSONException unused) {
                return false;
            }
        } catch (Throwable th2) {
            i2.a.b(th2, this);
            return false;
        }
    }

    public final Object n(Context context, String className, String methodName, Object obj, Object[] args) {
        Method methodE;
        if (i2.a.d(this)) {
            return null;
        }
        try {
            Class<?> clsD = d(context, className);
            if (clsD == null || (methodE = e(clsD, methodName)) == null) {
                return null;
            }
            m mVar = m.f73328a;
            return m.e(clsD, methodE, obj, Arrays.copyOf(args, args.length));
        } catch (Throwable th2) {
            i2.a.b(th2, this);
            return null;
        }
    }

    public final boolean o(Context context, Object inAppBillingObj, String type) {
        if (i2.a.d(this) || inAppBillingObj == null) {
            return false;
        }
        try {
            Object objN = n(context, "com.android.vending.billing.IInAppBillingService", "isBillingSupported", inAppBillingObj, new Object[]{3, PACKAGE_NAME, type});
            if (objN == null || ((Integer) objN).intValue() != 0) {
                return false;
            }
            return true;
        } catch (Throwable th2) {
            i2.a.b(th2, this);
            return false;
        }
    }

    public final Map<String, String> p(ArrayList<String> skuList) {
        if (i2.a.d(this)) {
            return null;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            for (String str : skuList) {
                String string = skuDetailSharedPrefs.getString(str, null);
                if (string != null) {
                    List listN0 = a0.N0(string, new String[]{";"}, false, 2, 2, null);
                    if (jCurrentTimeMillis - Long.parseLong((String) listN0.get(0)) < 43200) {
                        p.i(str, AppLovinEventParameters.PRODUCT_IDENTIFIER);
                        linkedHashMap.put(str, listN0.get(1));
                    } else {
                        continue;
                    }
                }
            }
            return linkedHashMap;
        } catch (Throwable th2) {
            i2.a.b(th2, this);
            return null;
        }
    }

    public final void q(Map<String, String> map) {
        if (i2.a.d(this)) {
            return;
        }
        try {
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences.Editor editorEdit = skuDetailSharedPrefs.edit();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                editorEdit.putString(entry.getKey(), jCurrentTimeMillis + ';' + entry.getValue());
            }
            editorEdit.apply();
        } catch (Throwable th2) {
            i2.a.b(th2, this);
        }
    }
}
