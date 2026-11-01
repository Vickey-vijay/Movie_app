package com.facebook.appevents;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;
import android.util.Patterns;
import androidx.annotation.RestrictTo;
import com.facebook.internal.j0;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.C3426d4;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.text.Regex;
import nj.q0;

/* JADX INFO: compiled from: UserDataStore.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b \u0010!J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0005\u001a\u00020\u0004H\u0007J\u001c\u0010\b\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0006H\u0007J\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0002J\b\u0010\f\u001a\u00020\u0002H\u0002J\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0002R\u001c\u0010\u0012\u001a\n \u0010*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0018R$\u0010\u001c\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR$\u0010\u001d\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001bR$\u0010\u001f\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u001e¨\u0006\""}, d2 = {"Lcom/facebook/appevents/a0;", "", "Lmj/r;", "e", "", "b", "", "ud", "g", C3426d4.i.W, "value", "h", "d", "type", "data", InneractiveMediationDefs.GENDER_FEMALE, "kotlin.jvm.PlatformType", "Ljava/lang/String;", "TAG", "Landroid/content/SharedPreferences;", "c", "Landroid/content/SharedPreferences;", "sharedPreferences", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "initialized", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/concurrent/ConcurrentHashMap;", "externalHashedUserData", "internalHashedUserData", "()Ljava/util/Map;", "enabledInternalUserData", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class a0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static SharedPreferences sharedPreferences;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a0 f14168a = new a0();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final String TAG = a0.class.getSimpleName();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final AtomicBoolean initialized = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final ConcurrentHashMap<String, String> externalHashedUserData = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final ConcurrentHashMap<String, String> internalHashedUserData = new ConcurrentHashMap<>();

    public final synchronized void d() {
        if (i2.a.d(this)) {
            return;
        }
        try {
            AtomicBoolean atomicBoolean = initialized;
            if (atomicBoolean.get()) {
                return;
            }
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(q1.t.l());
            ck.p.i(defaultSharedPreferences, "getDefaultSharedPreferences(FacebookSdk.getApplicationContext())");
            sharedPreferences = defaultSharedPreferences;
            if (defaultSharedPreferences == null) {
                ck.p.B("sharedPreferences");
                throw null;
            }
            String string = defaultSharedPreferences.getString("com.facebook.appevents.UserDataStore.userData", "");
            if (string == null) {
                string = "";
            }
            SharedPreferences sharedPreferences2 = sharedPreferences;
            if (sharedPreferences2 == null) {
                ck.p.B("sharedPreferences");
                throw null;
            }
            String string2 = sharedPreferences2.getString("com.facebook.appevents.UserDataStore.internalUserData", "");
            if (string2 == null) {
                string2 = "";
            }
            externalHashedUserData.putAll(j0.c0(string));
            internalHashedUserData.putAll(j0.c0(string2));
            atomicBoolean.set(true);
        } catch (Throwable th2) {
            i2.a.b(th2, this);
        }
    }

    public static final String b() {
        if (i2.a.d(a0.class)) {
            return null;
        }
        try {
            if (!initialized.get()) {
                f14168a.d();
            }
            HashMap map = new HashMap();
            map.putAll(externalHashedUserData);
            map.putAll(f14168a.c());
            return j0.g0(map);
        } catch (Throwable th2) {
            i2.a.b(th2, a0.class);
            return null;
        }
    }

    public static final void e() {
        if (i2.a.d(a0.class)) {
            return;
        }
        try {
            if (initialized.get()) {
                return;
            }
            f14168a.d();
        } catch (Throwable th2) {
            i2.a.b(th2, a0.class);
        }
    }

    public static final void g(Map<String, String> map) {
        List<String> listSplit;
        if (i2.a.d(a0.class)) {
            return;
        }
        try {
            ck.p.j(map, "ud");
            if (!initialized.get()) {
                f14168a.d();
            }
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                j0 j0Var = j0.f14425a;
                a0 a0Var = f14168a;
                int i10 = 1;
                int length = value.length() - 1;
                int i11 = 0;
                boolean z10 = false;
                while (i11 <= length) {
                    boolean z11 = ck.p.l(value.charAt(!z10 ? i11 : length), 32) <= 0;
                    if (z10) {
                        if (!z11) {
                            break;
                        } else {
                            length--;
                        }
                    } else if (z11) {
                        i11++;
                    } else {
                        z10 = true;
                    }
                }
                String strA0 = j0.A0(a0Var.f(key, value.subSequence(i11, length + 1).toString()));
                ConcurrentHashMap<String, String> concurrentHashMap = internalHashedUserData;
                if (concurrentHashMap.containsKey(key)) {
                    String str = concurrentHashMap.get(key);
                    String[] strArr = null;
                    if (str != null && (listSplit = new Regex(StringUtils.COMMA).split(str, 0)) != null) {
                        Object[] array = listSplit.toArray(new String[0]);
                        if (array == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                        }
                        strArr = (String[]) array;
                    }
                    if (strArr == null) {
                        strArr = new String[0];
                    }
                    Set setH = q0.h(Arrays.copyOf(strArr, strArr.length));
                    if (setH.contains(strA0)) {
                        return;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    if (strArr.length == 0) {
                        sb2.append(strA0);
                    } else if (strArr.length < 5) {
                        sb2.append(str);
                        sb2.append(StringUtils.COMMA);
                        sb2.append(strA0);
                    } else {
                        while (true) {
                            int i12 = i10 + 1;
                            sb2.append(strArr[i10]);
                            sb2.append(StringUtils.COMMA);
                            if (i12 >= 5) {
                                break;
                            } else {
                                i10 = i12;
                            }
                        }
                        sb2.append(strA0);
                        setH.remove(strArr[0]);
                    }
                    internalHashedUserData.put(key, sb2.toString());
                } else {
                    concurrentHashMap.put(key, strA0);
                }
            }
            a0 a0Var2 = f14168a;
            j0 j0Var2 = j0.f14425a;
            a0Var2.h("com.facebook.appevents.UserDataStore.internalUserData", j0.g0(internalHashedUserData));
        } catch (Throwable th2) {
            i2.a.b(th2, a0.class);
        }
    }

    public static final void i(String str, String str2) {
        if (i2.a.d(a0.class)) {
            return;
        }
        try {
            ck.p.j(str, "$key");
            ck.p.j(str2, "$value");
            if (!initialized.get()) {
                f14168a.d();
            }
            SharedPreferences sharedPreferences2 = sharedPreferences;
            if (sharedPreferences2 != null) {
                sharedPreferences2.edit().putString(str, str2).apply();
            } else {
                ck.p.B("sharedPreferences");
                throw null;
            }
        } catch (Throwable th2) {
            i2.a.b(th2, a0.class);
        }
    }

    public final Map<String, String> c() {
        if (i2.a.d(this)) {
            return null;
        }
        try {
            HashMap map = new HashMap();
            Set<String> setB = r1.d.INSTANCE.b();
            for (String str : internalHashedUserData.keySet()) {
                if (setB.contains(str)) {
                    map.put(str, internalHashedUserData.get(str));
                }
            }
            return map;
        } catch (Throwable th2) {
            i2.a.b(th2, this);
            return null;
        }
    }

    public final String f(String type, String data) {
        boolean z10;
        String strSubstring;
        int i10;
        boolean z11;
        if (i2.a.d(this)) {
            return null;
        }
        try {
            int length = data.length() - 1;
            int i11 = 0;
            boolean z12 = false;
            while (i11 <= length) {
                if (!z12) {
                    i10 = i11;
                } else {
                    i10 = length;
                }
                if (ck.p.l(data.charAt(i10), 32) <= 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z12) {
                    if (!z11) {
                        z12 = true;
                    } else {
                        i11++;
                    }
                } else {
                    if (!z11) {
                        break;
                    }
                    length--;
                }
            }
            String string = data.subSequence(i11, length + 1).toString();
            if (string != null) {
                String lowerCase = string.toLowerCase();
                ck.p.i(lowerCase, "(this as java.lang.String).toLowerCase()");
                if (ck.p.e("em", type)) {
                    if (!Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                        Log.e(TAG, "Setting email failure: this is not a valid email address");
                        return "";
                    }
                    return lowerCase;
                }
                if (ck.p.e("ph", type)) {
                    return new Regex("[^0-9]").replace(lowerCase, "");
                }
                if (ck.p.e("ge", type)) {
                    if (lowerCase.length() > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        strSubstring = "";
                    } else if (lowerCase != null) {
                        strSubstring = lowerCase.substring(0, 1);
                        ck.p.i(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    if (!ck.p.e(InneractiveMediationDefs.GENDER_FEMALE, strSubstring) && !ck.p.e(InneractiveMediationDefs.GENDER_MALE, strSubstring)) {
                        Log.e(TAG, "Setting gender failure: the supported value for gender is f or m");
                        return "";
                    }
                    return strSubstring;
                }
                return lowerCase;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        } catch (Throwable th2) {
            i2.a.b(th2, this);
            return null;
        }
    }

    public final void h(final String str, final String str2) {
        if (i2.a.d(this)) {
            return;
        }
        try {
            q1.t.t().execute(new Runnable() { // from class: com.facebook.appevents.z
                @Override // java.lang.Runnable
                public final void run() {
                    a0.i(str, str2);
                }
            });
        } catch (Throwable th2) {
            i2.a.b(th2, this);
        }
    }
}
