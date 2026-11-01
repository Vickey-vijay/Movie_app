package w1;

import androidx.annotation.RestrictTo;
import ck.p;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.C3605n2;
import com.unity3d.services.store.gpbl.bridges.billingclient.common.BillingClientBuilderBridgeCommon;
import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;

/* JADX INFO: compiled from: InAppPurchaseSkuDetailsWrapper.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\bB?\u0012\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u0007\u0012\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u000f¢\u0006\u0004\b\u0017\u0010\u0018J$\u0010\u0006\u001a\u0004\u0018\u00010\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0004R\u001b\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\tR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011¨\u0006\u001a"}, d2 = {"Lw1/l;", "", "", "skuType", "", "skuIDs", "d", "Ljava/lang/Class;", "a", "Ljava/lang/Class;", "e", "()Ljava/lang/Class;", "skuDetailsParamsClazz", "b", "builderClazz", "Ljava/lang/reflect/Method;", "c", "Ljava/lang/reflect/Method;", "newBuilderMethod", "setTypeMethod", "setSkusListMethod", InneractiveMediationDefs.GENDER_FEMALE, "buildMethod", "<init>", "(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V", "g", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class l {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static l f73320h;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final Class<?> skuDetailsParamsClazz;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final Class<?> builderClazz;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final Method newBuilderMethod;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final Method setTypeMethod;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final Method setSkusListMethod;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final Method buildMethod;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final AtomicBoolean f73321i = new AtomicBoolean(false);

    /* JADX INFO: renamed from: w1.l$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: InAppPurchaseSkuDetailsWrapper.kt */
    @Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\b\u0010\u0005\u001a\u00020\u0004H\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\bR\u0014\u0010\f\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\bR\u0014\u0010\r\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\bR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lw1/l$a;", "", "Lw1/l;", "b", "Lmj/r;", "a", "", "CLASSNAME_SKU_DETAILS_PARAMS", "Ljava/lang/String;", "CLASSNAME_SKU_DETAILS_PARAMS_BUILDER", "METHOD_BUILD", "METHOD_NEW_BUILDER", "METHOD_SET_SKU_LIST", "METHOD_SET_TYPE", "Ljava/util/concurrent/atomic/AtomicBoolean;", "initialized", "Ljava/util/concurrent/atomic/AtomicBoolean;", C3605n2.f30210p, "Lw1/l;", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(ck.i iVar) {
            this();
        }

        public final void a() {
            Class<?> clsA = m.a("com.android.billingclient.api.SkuDetailsParams");
            Class<?> clsA2 = m.a("com.android.billingclient.api.SkuDetailsParams$Builder");
            if (clsA == null || clsA2 == null) {
                return;
            }
            Method methodD = m.d(clsA, "newBuilder", new Class[0]);
            Method methodD2 = m.d(clsA2, "setType", String.class);
            Method methodD3 = m.d(clsA2, "setSkusList", List.class);
            Method methodD4 = m.d(clsA2, BillingClientBuilderBridgeCommon.buildMethodName, new Class[0]);
            if (methodD == null || methodD2 == null || methodD3 == null || methodD4 == null) {
                return;
            }
            l.c(new l(clsA, clsA2, methodD, methodD2, methodD3, methodD4));
        }

        public final l b() {
            if (l.a().get()) {
                return l.b();
            }
            a();
            l.a().set(true);
            return l.b();
        }
    }

    public l(Class<?> cls, Class<?> cls2, Method method, Method method2, Method method3, Method method4) {
        p.j(cls, "skuDetailsParamsClazz");
        p.j(cls2, "builderClazz");
        p.j(method, "newBuilderMethod");
        p.j(method2, "setTypeMethod");
        p.j(method3, "setSkusListMethod");
        p.j(method4, "buildMethod");
        this.skuDetailsParamsClazz = cls;
        this.builderClazz = cls2;
        this.newBuilderMethod = method;
        this.setTypeMethod = method2;
        this.setSkusListMethod = method3;
        this.buildMethod = method4;
    }

    public static final /* synthetic */ AtomicBoolean a() {
        if (i2.a.d(l.class)) {
            return null;
        }
        try {
            return f73321i;
        } catch (Throwable th2) {
            i2.a.b(th2, l.class);
            return null;
        }
    }

    public static final /* synthetic */ l b() {
        if (i2.a.d(l.class)) {
            return null;
        }
        try {
            return f73320h;
        } catch (Throwable th2) {
            i2.a.b(th2, l.class);
            return null;
        }
    }

    public static final /* synthetic */ void c(l lVar) {
        if (i2.a.d(l.class)) {
            return;
        }
        try {
            f73320h = lVar;
        } catch (Throwable th2) {
            i2.a.b(th2, l.class);
        }
    }

    public final Object d(String skuType, List<String> skuIDs) {
        Object objE;
        Object objE2;
        if (i2.a.d(this)) {
            return null;
        }
        try {
            m mVar = m.f73328a;
            Object objE3 = m.e(this.skuDetailsParamsClazz, this.newBuilderMethod, null, new Object[0]);
            if (objE3 != null && (objE = m.e(this.builderClazz, this.setTypeMethod, objE3, skuType)) != null && (objE2 = m.e(this.builderClazz, this.setSkusListMethod, objE, skuIDs)) != null) {
                return m.e(this.builderClazz, this.buildMethod, objE2, new Object[0]);
            }
            return null;
        } catch (Throwable th2) {
            i2.a.b(th2, this);
            return null;
        }
    }

    public final Class<?> e() {
        if (i2.a.d(this)) {
            return null;
        }
        try {
            return this.skuDetailsParamsClazz;
        } catch (Throwable th2) {
            i2.a.b(th2, this);
            return null;
        }
    }
}
