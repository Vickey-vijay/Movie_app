package com.unity3d.ironsourceads.internal.services;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import ck.p;
import com.ironsource.C3426d4;
import com.ironsource.C3556k9;
import com.ironsource.C3676r4;
import com.ironsource.C5;
import com.ironsource.D5;
import com.ironsource.EnumC3592m9;
import com.ironsource.InterfaceC3475g;
import com.ironsource.InterfaceC3493h;
import com.ironsource.Lb;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.sdk.controller.ControllerActivity;
import com.ironsource.sdk.controller.k;
import com.safedk.android.utils.Logger;
import com.vungle.ads.internal.ui.AdActivity;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import mj.h;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements com.unity3d.ironsourceads.internal.services.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3475g f45266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3493h f45267b;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45268a;

        static {
            int[] iArr = new int[EnumC3592m9.values().length];
            try {
                iArr[EnumC3592m9.DIRECT_INTENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3592m9.APP_ACTIVITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f45268a = iArr;
        }
    }

    public b(InterfaceC3475g interfaceC3475g, InterfaceC3493h interfaceC3493h) {
        p.j(interfaceC3475g, "actionIntentFactory");
        p.j(interfaceC3493h, "activityIntentFactory");
        this.f45266a = interfaceC3475g;
        this.f45267b = interfaceC3493h;
    }

    public static void safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(Activity p10, Intent p11, int p12) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V");
        if (p11 == null) {
            return;
        }
        p10.startActivityForResult(p11, p12);
    }

    public static void safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(Activity p10, Intent p11) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V");
        if (p11 == null) {
            return;
        }
        p10.startActivity(p11);
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p10, Intent p11) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p11 == null) {
            return;
        }
        p10.startActivity(p11);
    }

    @Override // com.unity3d.ironsourceads.internal.services.a
    public com.unity3d.ironsourceads.internal.services.a.AbstractC0443a a(Context context, C3556k9 c3556k9) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        p.j(c3556k9, AdActivity.REQUEST_KEY_EXTRA);
        try {
            a(this, D5.INLINE_STORE_REQUESTED, c3556k9.g(), null, 4, null);
            if (TextUtils.isEmpty(c3556k9.h())) {
                a(D5.INLINE_STORE_FAILED, c3556k9.g(), kotlin.collections.a.o(h.a("reason", "storeUrl is empty")));
                return new com.unity3d.ironsourceads.internal.services.a.AbstractC0443a.C0444a("storeUrl is empty");
            }
            if (!(context instanceof Activity)) {
                a(D5.INLINE_STORE_FAILED, c3556k9.g(), kotlin.collections.a.o(h.a("reason", "context is not an Activity")));
                return new com.unity3d.ironsourceads.internal.services.a.AbstractC0443a.C0444a("context is not an Activity");
            }
            Intent intentA = a(c3556k9);
            if (!a(context, intentA)) {
                a(D5.INLINE_STORE_FAILED, c3556k9.g(), kotlin.collections.a.o(h.a("reason", "Failed to resolve for packageManager")));
                return new com.unity3d.ironsourceads.internal.services.a.AbstractC0443a.C0444a("Failed to resolve for packageManager");
            }
            int i10 = a.f45268a[c3556k9.g().ordinal()];
            if (i10 == 1) {
                return b((Activity) context, intentA);
            }
            if (i10 == 2) {
                return a((Activity) context, intentA);
            }
            throw new NoWhenBranchMatchedException();
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            String str = "Failed to open inline store: " + e10.getMessage();
            IronLog.INTERNAL.error(e10.toString());
            a(D5.INLINE_STORE_FAILED, c3556k9.g(), kotlin.collections.a.o(h.a("reason", str)));
            return new com.unity3d.ironsourceads.internal.services.a.AbstractC0443a.C0444a(str);
        }
    }

    private final com.unity3d.ironsourceads.internal.services.a.AbstractC0443a b(Activity activity, Intent intent) {
        safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(activity, intent, 794006778);
        a(this, D5.INLINE_STORE_LAUNCHED, EnumC3592m9.DIRECT_INTENT, null, 4, null);
        return com.unity3d.ironsourceads.internal.services.a.AbstractC0443a.b.f45265a;
    }

    public b() {
        this(new k.a(), new k.b());
    }

    private final Intent a(C3556k9 c3556k9) throws JSONException {
        Intent intentA = this.f45266a.a();
        intentA.setPackage(c3556k9.f());
        intentA.setData(Uri.parse(c3556k9.h()));
        JSONObject jSONObjectE = c3556k9.e();
        if (jSONObjectE != null) {
            Iterator<String> itKeys = jSONObjectE.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj = jSONObjectE.get(next);
                if (obj instanceof String) {
                    intentA.putExtra(next, (String) obj);
                } else if (obj instanceof Boolean) {
                    p.i(obj, "value");
                    intentA.putExtra(next, ((Boolean) obj).booleanValue());
                } else if (obj instanceof Integer) {
                    p.i(obj, "value");
                    intentA.putExtra(next, ((Number) obj).intValue());
                } else if (obj instanceof Long) {
                    p.i(obj, "value");
                    intentA.putExtra(next, ((Number) obj).longValue());
                } else if (obj instanceof Float) {
                    p.i(obj, "value");
                    intentA.putExtra(next, ((Number) obj).floatValue());
                } else if (obj instanceof Double) {
                    p.i(obj, "value");
                    intentA.putExtra(next, ((Number) obj).doubleValue());
                } else {
                    intentA.putExtra(next, obj.toString());
                }
            }
        }
        return intentA;
    }

    @SuppressLint({"QueryPermissionsNeeded"})
    private final boolean a(Context context, Intent intent) {
        return intent.resolveActivity(context.getPackageManager()) != null;
    }

    private final com.unity3d.ironsourceads.internal.services.a.AbstractC0443a a(Activity activity, Intent intent) {
        safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(activity, new InlineStoreActivity.b(this.f45267b).a(intent).a(activity));
        a(this, D5.INLINE_STORE_ACTIVITY_LAUNCHED, EnumC3592m9.APP_ACTIVITY, null, 4, null);
        return com.unity3d.ironsourceads.internal.services.a.AbstractC0443a.b.f45265a;
    }

    @Override // com.unity3d.ironsourceads.internal.services.a
    public com.unity3d.ironsourceads.internal.services.a.AbstractC0443a a(Context context, EnumC3592m9 enumC3592m9) {
        Intent intent;
        p.j(context, GAMConfig.KEY_CONTEXT);
        p.j(enumC3592m9, C3426d4.f.f28486e);
        try {
            a(this, D5.INLINE_STORE_DESTROY_REQUESTED, enumC3592m9, null, 4, null);
            if (!(context instanceof Activity)) {
                a(D5.INLINE_STORE_DESTROY_FAILED, enumC3592m9, kotlin.collections.a.o(h.a("reason", "context is not an Activity")));
                return new com.unity3d.ironsourceads.internal.services.a.AbstractC0443a.C0444a("context is not an Activity");
            }
            int i10 = a.f45268a[enumC3592m9.ordinal()];
            if (i10 == 1) {
                intent = new Intent(context, (Class<?>) ControllerActivity.class);
            } else {
                if (i10 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                intent = new Intent(context, (Class<?>) InlineStoreActivity.class);
            }
            intent.addFlags(603979776);
            intent.putExtra(InlineStoreActivity.a.f45261b, true);
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
            a(this, D5.INLINE_STORE_DESTROY_LAUNCHED, enumC3592m9, null, 4, null);
            return com.unity3d.ironsourceads.internal.services.a.AbstractC0443a.b.f45265a;
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            String str = "Failed to destroy inline store: " + e10.getMessage();
            IronLog.INTERNAL.error(e10.toString());
            a(D5.INLINE_STORE_DESTROY_FAILED, enumC3592m9, kotlin.collections.a.o(h.a("reason", str)));
            return new com.unity3d.ironsourceads.internal.services.a.AbstractC0443a.C0444a(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void a(b bVar, D5 d10, EnumC3592m9 enumC3592m9, Map map, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            map = new LinkedHashMap();
        }
        bVar.a(d10, enumC3592m9, map);
    }

    private final void a(D5 d10, EnumC3592m9 enumC3592m9, Map<String, Object> map) {
        try {
            map.put(IronSourceConstants.EVENTS_EXT1, "strategy:" + enumC3592m9.b());
            Lb.f26968s.d().q().a(new C5(d10, new JSONObject(kotlin.collections.a.x(map))));
        } catch (Exception e10) {
            C3676r4.d().a(e10);
        }
    }
}
