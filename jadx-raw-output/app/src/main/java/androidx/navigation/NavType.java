package androidx.navigation;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.AnyRes;
import androidx.annotation.RestrictTo;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import ck.i;
import ck.p;
import com.ironsource.C3426d4;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.io.Serializable;
import kotlin.Metadata;
import lk.x;
import me.goldze.mvvmhabit.base.ContainerActivity;

/* JADX INFO: compiled from: NavType.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0010\b&\u0018\u0000 \u001c*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0006\u001c\u001d\u001e\u001f !B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0004\b\t\u0010\nJ\"\u0010\u000b\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H¦\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u0005H&¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0011\u001a\u00020\u0005H\u0016R\u001a\u0010\u0013\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u00058\u0016X\u0096D¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\""}, d2 = {"Landroidx/navigation/NavType;", "T", "", "Landroid/os/Bundle;", ContainerActivity.BUNDLE, "", C3426d4.i.W, "value", "Lmj/r;", "put", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V", "get", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Object;", "parseValue", "(Ljava/lang/String;)Ljava/lang/Object;", "parseAndPut", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;", "toString", "", "isNullableAllowed", "Z", "()Z", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "<init>", "(Z)V", VastTagName.COMPANION, "EnumType", "ParcelableArrayType", "ParcelableType", "SerializableArrayType", "SerializableType", "navigation-common_release"}, k = 1, mv = {1, 6, 0})
public abstract class NavType<T> {
    private final boolean isNullableAllowed;
    private final String name = "nav_type";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final NavType<Integer> IntType = new NavType<Integer>() { // from class: androidx.navigation.NavType$Companion$IntType$1
        @Override // androidx.navigation.NavType
        public String getName() {
            return TypedValues.Custom.S_INT;
        }

        @Override // androidx.navigation.NavType
        public /* bridge */ /* synthetic */ void put(Bundle bundle, String str, Integer num) {
            put(bundle, str, num.intValue());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Integer get(Bundle bundle, String key) {
            p.j(bundle, ContainerActivity.BUNDLE);
            p.j(key, C3426d4.i.W);
            Object obj = bundle.get(key);
            if (obj != null) {
                return Integer.valueOf(((Integer) obj).intValue());
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Integer parseValue(String value) {
            int i10;
            p.j(value, "value");
            if (x.R(value, "0x", false, 2, null)) {
                String strSubstring = value.substring(2);
                p.i(strSubstring, "this as java.lang.String).substring(startIndex)");
                i10 = Integer.parseInt(strSubstring, lk.a.a(16));
            } else {
                i10 = Integer.parseInt(value);
            }
            return Integer.valueOf(i10);
        }

        public void put(Bundle bundle, String str, int i10) {
            p.j(bundle, ContainerActivity.BUNDLE);
            p.j(str, C3426d4.i.W);
            bundle.putInt(str, i10);
        }
    };
    public static final NavType<Integer> ReferenceType = new NavType<Integer>() { // from class: androidx.navigation.NavType$Companion$ReferenceType$1
        @Override // androidx.navigation.NavType
        public String getName() {
            return "reference";
        }

        @Override // androidx.navigation.NavType
        public /* bridge */ /* synthetic */ void put(Bundle bundle, String str, Integer num) {
            put(bundle, str, num.intValue());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        @AnyRes
        public Integer get(Bundle bundle, String key) {
            p.j(bundle, ContainerActivity.BUNDLE);
            p.j(key, C3426d4.i.W);
            Object obj = bundle.get(key);
            if (obj != null) {
                return Integer.valueOf(((Integer) obj).intValue());
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Integer parseValue(String value) {
            int i10;
            p.j(value, "value");
            if (x.R(value, "0x", false, 2, null)) {
                String strSubstring = value.substring(2);
                p.i(strSubstring, "this as java.lang.String).substring(startIndex)");
                i10 = Integer.parseInt(strSubstring, lk.a.a(16));
            } else {
                i10 = Integer.parseInt(value);
            }
            return Integer.valueOf(i10);
        }

        public void put(Bundle bundle, String str, @AnyRes int i10) {
            p.j(bundle, ContainerActivity.BUNDLE);
            p.j(str, C3426d4.i.W);
            bundle.putInt(str, i10);
        }
    };
    public static final NavType<int[]> IntArrayType = new NavType<int[]>() { // from class: androidx.navigation.NavType$Companion$IntArrayType$1
        @Override // androidx.navigation.NavType
        public String getName() {
            return "integer[]";
        }

        @Override // androidx.navigation.NavType
        public int[] get(Bundle bundle, String key) {
            p.j(bundle, ContainerActivity.BUNDLE);
            p.j(key, C3426d4.i.W);
            return (int[]) bundle.get(key);
        }

        @Override // androidx.navigation.NavType
        public int[] parseValue(String value) {
            p.j(value, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String str, int[] iArr) {
            p.j(bundle, ContainerActivity.BUNDLE);
            p.j(str, C3426d4.i.W);
            bundle.putIntArray(str, iArr);
        }
    };
    public static final NavType<Long> LongType = new NavType<Long>() { // from class: androidx.navigation.NavType$Companion$LongType$1
        @Override // androidx.navigation.NavType
        public String getName() {
            return "long";
        }

        @Override // androidx.navigation.NavType
        public /* bridge */ /* synthetic */ void put(Bundle bundle, String str, Long l10) {
            put(bundle, str, l10.longValue());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Long get(Bundle bundle, String key) {
            p.j(bundle, ContainerActivity.BUNDLE);
            p.j(key, C3426d4.i.W);
            Object obj = bundle.get(key);
            if (obj != null) {
                return Long.valueOf(((Long) obj).longValue());
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Long parseValue(String value) {
            String strSubstring;
            long j10;
            p.j(value, "value");
            if (x.D(value, "L", false, 2, null)) {
                strSubstring = value.substring(0, value.length() - 1);
                p.i(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            } else {
                strSubstring = value;
            }
            if (x.R(value, "0x", false, 2, null)) {
                String strSubstring2 = strSubstring.substring(2);
                p.i(strSubstring2, "this as java.lang.String).substring(startIndex)");
                j10 = Long.parseLong(strSubstring2, lk.a.a(16));
            } else {
                j10 = Long.parseLong(strSubstring);
            }
            return Long.valueOf(j10);
        }

        public void put(Bundle bundle, String str, long j10) {
            p.j(bundle, ContainerActivity.BUNDLE);
            p.j(str, C3426d4.i.W);
            bundle.putLong(str, j10);
        }
    };
    public static final NavType<long[]> LongArrayType = new NavType<long[]>() { // from class: androidx.navigation.NavType$Companion$LongArrayType$1
        @Override // androidx.navigation.NavType
        public String getName() {
            return "long[]";
        }

        @Override // androidx.navigation.NavType
        public long[] get(Bundle bundle, String key) {
            p.j(bundle, ContainerActivity.BUNDLE);
            p.j(key, C3426d4.i.W);
            return (long[]) bundle.get(key);
        }

        @Override // androidx.navigation.NavType
        public long[] parseValue(String value) {
            p.j(value, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String str, long[] jArr) {
            p.j(bundle, ContainerActivity.BUNDLE);
            p.j(str, C3426d4.i.W);
            bundle.putLongArray(str, jArr);
        }
    };
    public static final NavType<Float> FloatType = new NavType<Float>() { // from class: androidx.navigation.NavType$Companion$FloatType$1
        @Override // androidx.navigation.NavType
        public String getName() {
            return TypedValues.Custom.S_FLOAT;
        }

        @Override // androidx.navigation.NavType
        public /* bridge */ /* synthetic */ void put(Bundle bundle, String str, Float f10) {
            put(bundle, str, f10.floatValue());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Float get(Bundle bundle, String key) {
            p.j(bundle, ContainerActivity.BUNDLE);
            p.j(key, C3426d4.i.W);
            Object obj = bundle.get(key);
            if (obj != null) {
                return Float.valueOf(((Float) obj).floatValue());
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Float parseValue(String value) {
            p.j(value, "value");
            return Float.valueOf(Float.parseFloat(value));
        }

        public void put(Bundle bundle, String str, float f10) {
            p.j(bundle, ContainerActivity.BUNDLE);
            p.j(str, C3426d4.i.W);
            bundle.putFloat(str, f10);
        }
    };
    public static final NavType<float[]> FloatArrayType = new NavType<float[]>() { // from class: androidx.navigation.NavType$Companion$FloatArrayType$1
        @Override // androidx.navigation.NavType
        public String getName() {
            return "float[]";
        }

        @Override // androidx.navigation.NavType
        public float[] get(Bundle bundle, String key) {
            p.j(bundle, ContainerActivity.BUNDLE);
            p.j(key, C3426d4.i.W);
            return (float[]) bundle.get(key);
        }

        @Override // androidx.navigation.NavType
        public float[] parseValue(String value) {
            p.j(value, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String str, float[] fArr) {
            p.j(bundle, ContainerActivity.BUNDLE);
            p.j(str, C3426d4.i.W);
            bundle.putFloatArray(str, fArr);
        }
    };
    public static final NavType<Boolean> BoolType = new NavType<Boolean>() { // from class: androidx.navigation.NavType$Companion$BoolType$1
        @Override // androidx.navigation.NavType
        public String getName() {
            return TypedValues.Custom.S_BOOLEAN;
        }

        @Override // androidx.navigation.NavType
        public /* bridge */ /* synthetic */ void put(Bundle bundle, String str, Boolean bool) {
            put(bundle, str, bool.booleanValue());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Boolean get(Bundle bundle, String key) {
            p.j(bundle, ContainerActivity.BUNDLE);
            p.j(key, C3426d4.i.W);
            return (Boolean) bundle.get(key);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Boolean parseValue(String value) {
            boolean z10;
            p.j(value, "value");
            if (p.e(value, "true")) {
                z10 = true;
            } else {
                if (!p.e(value, com.ironsource.mediationsdk.metadata.a.f29886h)) {
                    throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
                }
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }

        public void put(Bundle bundle, String str, boolean z10) {
            p.j(bundle, ContainerActivity.BUNDLE);
            p.j(str, C3426d4.i.W);
            bundle.putBoolean(str, z10);
        }
    };
    public static final NavType<boolean[]> BoolArrayType = new NavType<boolean[]>() { // from class: androidx.navigation.NavType$Companion$BoolArrayType$1
        @Override // androidx.navigation.NavType
        public String getName() {
            return "boolean[]";
        }

        @Override // androidx.navigation.NavType
        public boolean[] get(Bundle bundle, String key) {
            p.j(bundle, ContainerActivity.BUNDLE);
            p.j(key, C3426d4.i.W);
            return (boolean[]) bundle.get(key);
        }

        @Override // androidx.navigation.NavType
        public boolean[] parseValue(String value) {
            p.j(value, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String str, boolean[] zArr) {
            p.j(bundle, ContainerActivity.BUNDLE);
            p.j(str, C3426d4.i.W);
            bundle.putBooleanArray(str, zArr);
        }
    };
    public static final NavType<String> StringType = new NavType<String>() { // from class: androidx.navigation.NavType$Companion$StringType$1
        @Override // androidx.navigation.NavType
        public String getName() {
            return TypedValues.Custom.S_STRING;
        }

        @Override // androidx.navigation.NavType
        public String parseValue(String value) {
            p.j(value, "value");
            return value;
        }

        @Override // androidx.navigation.NavType
        public String get(Bundle bundle, String key) {
            p.j(bundle, ContainerActivity.BUNDLE);
            p.j(key, C3426d4.i.W);
            return (String) bundle.get(key);
        }

        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String str, String str2) {
            p.j(bundle, ContainerActivity.BUNDLE);
            p.j(str, C3426d4.i.W);
            bundle.putString(str, str2);
        }
    };
    public static final NavType<String[]> StringArrayType = new NavType<String[]>() { // from class: androidx.navigation.NavType$Companion$StringArrayType$1
        @Override // androidx.navigation.NavType
        public String getName() {
            return "string[]";
        }

        @Override // androidx.navigation.NavType
        public String[] get(Bundle bundle, String key) {
            p.j(bundle, ContainerActivity.BUNDLE);
            p.j(key, C3426d4.i.W);
            return (String[]) bundle.get(key);
        }

        @Override // androidx.navigation.NavType
        public String[] parseValue(String value) {
            p.j(value, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String key, String[] value) {
            p.j(bundle, ContainerActivity.BUNDLE);
            p.j(key, C3426d4.i.W);
            bundle.putStringArray(key, value);
        }
    };

    /* JADX INFO: compiled from: NavType.kt */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0018\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u0017H\u0017J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\u0006\u0010\u001d\u001a\u00020\u0017H\u0007J\u0018\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u0007R\u0018\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0015\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00160\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Landroidx/navigation/NavType$Companion;", "", "()V", "BoolArrayType", "Landroidx/navigation/NavType;", "", "BoolType", "", "FloatArrayType", "", "FloatType", "", "IntArrayType", "", "IntType", "", "LongArrayType", "", "LongType", "", "ReferenceType", "StringArrayType", "", "", "StringType", "fromArgType", "type", HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME, "inferFromValue", "value", "inferFromValueType", "navigation-common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public NavType<?> fromArgType(String type, String packageName) {
            String strSubstring;
            NavType<Integer> navType = NavType.IntType;
            if (p.e(navType.getName(), type)) {
                return navType;
            }
            NavType navType2 = NavType.IntArrayType;
            if (p.e(navType2.getName(), type)) {
                return navType2;
            }
            NavType<Long> navType3 = NavType.LongType;
            if (p.e(navType3.getName(), type)) {
                return navType3;
            }
            NavType navType4 = NavType.LongArrayType;
            if (p.e(navType4.getName(), type)) {
                return navType4;
            }
            NavType<Boolean> navType5 = NavType.BoolType;
            if (p.e(navType5.getName(), type)) {
                return navType5;
            }
            NavType navType6 = NavType.BoolArrayType;
            if (p.e(navType6.getName(), type)) {
                return navType6;
            }
            NavType<String> navType7 = NavType.StringType;
            if (p.e(navType7.getName(), type)) {
                return navType7;
            }
            NavType navType8 = NavType.StringArrayType;
            if (p.e(navType8.getName(), type)) {
                return navType8;
            }
            NavType<Float> navType9 = NavType.FloatType;
            if (p.e(navType9.getName(), type)) {
                return navType9;
            }
            NavType navType10 = NavType.FloatArrayType;
            if (p.e(navType10.getName(), type)) {
                return navType10;
            }
            NavType<Integer> navType11 = NavType.ReferenceType;
            if (p.e(navType11.getName(), type)) {
                return navType11;
            }
            if (type == null || type.length() == 0) {
                return navType7;
            }
            try {
                if (!x.R(type, ".", false, 2, null) || packageName == null) {
                    strSubstring = type;
                } else {
                    strSubstring = packageName + type;
                }
                if (x.D(type, "[]", false, 2, null)) {
                    strSubstring = strSubstring.substring(0, strSubstring.length() - 2);
                    p.i(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Class<?> cls = Class.forName(strSubstring);
                    if (Parcelable.class.isAssignableFrom(cls)) {
                        return new ParcelableArrayType(cls);
                    }
                    if (Serializable.class.isAssignableFrom(cls)) {
                        return new SerializableArrayType(cls);
                    }
                } else {
                    Class<?> cls2 = Class.forName(strSubstring);
                    if (Parcelable.class.isAssignableFrom(cls2)) {
                        return new ParcelableType(cls2);
                    }
                    if (Enum.class.isAssignableFrom(cls2)) {
                        return new EnumType(cls2);
                    }
                    if (Serializable.class.isAssignableFrom(cls2)) {
                        return new SerializableType(cls2);
                    }
                }
                throw new IllegalArgumentException(strSubstring + " is not Serializable or Parcelable.");
            } catch (ClassNotFoundException e10) {
                throw new RuntimeException(e10);
            }
        }

        /* JADX WARN: Code duplicated, block: B:44:0x008c  */
        /* JADX WARN: Code duplicated, block: B:46:0x0096  */
        /* JADX WARN: Code duplicated, block: B:48:0x00a9  */
        /* JADX WARN: Code duplicated, block: B:50:0x00b5  */
        /* JADX WARN: Code duplicated, block: B:51:0x00b9  */
        /* JADX WARN: Code duplicated, block: B:53:0x00c1  */
        /* JADX WARN: Code duplicated, block: B:55:0x00c5  */
        /* JADX WARN: Code duplicated, block: B:57:0x00d0  */
        /* JADX WARN: Code duplicated, block: B:59:0x00d4  */
        /* JADX WARN: Code duplicated, block: B:60:0x00de  */
        /* JADX WARN: Code duplicated, block: B:62:0x00e2  */
        /* JADX WARN: Code duplicated, block: B:63:0x00ec  */
        /* JADX WARN: Instruction removed from duplicated block: B:63:0x00ec, please report this as an issue */
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final NavType<Object> inferFromValueType(Object value) {
            NavType<Object> serializableType;
            Class<?> componentType;
            Class<?> componentType2;
            if (value instanceof Integer) {
                return NavType.IntType;
            }
            if (value instanceof int[]) {
                return NavType.IntArrayType;
            }
            if (value instanceof Long) {
                return NavType.LongType;
            }
            if (value instanceof long[]) {
                return NavType.LongArrayType;
            }
            if (value instanceof Float) {
                return NavType.FloatType;
            }
            if (value instanceof float[]) {
                return NavType.FloatArrayType;
            }
            if (value instanceof Boolean) {
                return NavType.BoolType;
            }
            if (value instanceof boolean[]) {
                return NavType.BoolArrayType;
            }
            if ((value instanceof String) || value == null) {
                return NavType.StringType;
            }
            if ((value instanceof Object[]) && (((Object[]) value) instanceof String[])) {
                return NavType.StringArrayType;
            }
            if (value.getClass().isArray()) {
                Class<?> componentType3 = value.getClass().getComponentType();
                p.g(componentType3);
                if (Parcelable.class.isAssignableFrom(componentType3)) {
                    Class<?> componentType4 = value.getClass().getComponentType();
                    if (componentType4 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<android.os.Parcelable>");
                    }
                    serializableType = new ParcelableArrayType<>(componentType4);
                } else if (value.getClass().isArray()) {
                    componentType = value.getClass().getComponentType();
                    p.g(componentType);
                    if (Serializable.class.isAssignableFrom(componentType)) {
                        componentType2 = value.getClass().getComponentType();
                        if (componentType2 != null) {
                            throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<java.io.Serializable>");
                        }
                        serializableType = new SerializableArrayType<>(componentType2);
                    } else if (value instanceof Parcelable) {
                        serializableType = new ParcelableType<>(value.getClass());
                    } else if (value instanceof Enum) {
                        serializableType = new EnumType<>(value.getClass());
                    } else {
                        if (value instanceof Serializable) {
                            throw new IllegalArgumentException("Object of type " + value.getClass().getName() + " is not supported for navigation arguments.");
                        }
                        serializableType = new SerializableType<>(value.getClass());
                    }
                } else if (value instanceof Parcelable) {
                    serializableType = new ParcelableType<>(value.getClass());
                } else if (value instanceof Enum) {
                    serializableType = new EnumType<>(value.getClass());
                } else {
                    if (value instanceof Serializable) {
                        throw new IllegalArgumentException("Object of type " + value.getClass().getName() + " is not supported for navigation arguments.");
                    }
                    serializableType = new SerializableType<>(value.getClass());
                }
            } else if (value.getClass().isArray()) {
                componentType = value.getClass().getComponentType();
                p.g(componentType);
                if (Serializable.class.isAssignableFrom(componentType)) {
                    componentType2 = value.getClass().getComponentType();
                    if (componentType2 != null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<java.io.Serializable>");
                    }
                    serializableType = new SerializableArrayType<>(componentType2);
                } else if (value instanceof Parcelable) {
                    serializableType = new ParcelableType<>(value.getClass());
                } else if (value instanceof Enum) {
                    serializableType = new EnumType<>(value.getClass());
                } else {
                    if (value instanceof Serializable) {
                        throw new IllegalArgumentException("Object of type " + value.getClass().getName() + " is not supported for navigation arguments.");
                    }
                    serializableType = new SerializableType<>(value.getClass());
                }
            } else if (value instanceof Parcelable) {
                serializableType = new ParcelableType<>(value.getClass());
            } else if (value instanceof Enum) {
                serializableType = new EnumType<>(value.getClass());
            } else {
                if (value instanceof Serializable) {
                    throw new IllegalArgumentException("Object of type " + value.getClass().getName() + " is not supported for navigation arguments.");
                }
                serializableType = new SerializableType<>(value.getClass());
            }
            return serializableType;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final NavType<Object> inferFromValue(String value) {
            p.j(value, "value");
            try {
                try {
                    try {
                        try {
                            NavType<Integer> navType = NavType.IntType;
                            navType.parseValue(value);
                            return navType;
                        } catch (IllegalArgumentException unused) {
                            NavType<Float> navType2 = NavType.FloatType;
                            navType2.parseValue(value);
                            return navType2;
                        }
                    } catch (IllegalArgumentException unused2) {
                        return NavType.StringType;
                    }
                } catch (IllegalArgumentException unused3) {
                    NavType<Long> navType3 = NavType.LongType;
                    navType3.parseValue(value);
                    return navType3;
                }
            } catch (IllegalArgumentException unused4) {
                NavType<Boolean> navType4 = NavType.BoolType;
                navType4.parseValue(value);
                return navType4;
            }
        }
    }

    /* JADX INFO: compiled from: NavType.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000*\f\b\u0001\u0010\u0001*\u0006\u0012\u0002\b\u00030\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0015\u0010\u000b\u001a\u00028\u00012\u0006\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\rR\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Landroidx/navigation/NavType$EnumType;", "D", "", "Landroidx/navigation/NavType$SerializableType;", "type", "Ljava/lang/Class;", "(Ljava/lang/Class;)V", "name", "", "getName", "()Ljava/lang/String;", "parseValue", "value", "(Ljava/lang/String;)Ljava/lang/Enum;", "navigation-common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class EnumType<D extends Enum<?>> extends SerializableType<D> {
        private final Class<D> type;

        @Override // androidx.navigation.NavType.SerializableType, androidx.navigation.NavType
        public String getName() {
            String name = this.type.getName();
            p.i(name, "type.name");
            return name;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EnumType(Class<D> cls) {
            super(false, cls);
            p.j(cls, "type");
            if (cls.isEnum()) {
                this.type = cls;
                return;
            }
            throw new IllegalArgumentException((cls + " is not an Enum type.").toString());
        }

        @Override // androidx.navigation.NavType.SerializableType, androidx.navigation.NavType
        public D parseValue(String value) {
            D d10;
            p.j(value, "value");
            D[] enumConstants = this.type.getEnumConstants();
            p.i(enumConstants, "type.enumConstants");
            int length = enumConstants.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    d10 = null;
                    break;
                }
                d10 = enumConstants[i10];
                if (x.E(d10.name(), value, true)) {
                    break;
                }
                i10++;
            }
            D d11 = d10;
            if (d11 != null) {
                return d11;
            }
            throw new IllegalArgumentException("Enum value " + value + " not found for type " + this.type.getName() + '.');
        }
    }

    /* JADX INFO: compiled from: NavType.kt */
    @Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00040\u0003B\u0015\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00010\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ(\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0016R \u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006 "}, d2 = {"Landroidx/navigation/NavType$ParcelableArrayType;", "Landroid/os/Parcelable;", "D", "Landroidx/navigation/NavType;", "", "Landroid/os/Bundle;", ContainerActivity.BUNDLE, "", C3426d4.i.W, "value", "Lmj/r;", "put", "(Landroid/os/Bundle;Ljava/lang/String;[Landroid/os/Parcelable;)V", "get", "(Landroid/os/Bundle;Ljava/lang/String;)[Landroid/os/Parcelable;", "parseValue", "(Ljava/lang/String;)[Landroid/os/Parcelable;", "", "other", "", "equals", "", "hashCode", "Ljava/lang/Class;", "arrayType", "Ljava/lang/Class;", "getName", "()Ljava/lang/String;", "name", "type", "<init>", "(Ljava/lang/Class;)V", "navigation-common_release"}, k = 1, mv = {1, 6, 0})
    public static final class ParcelableArrayType<D extends Parcelable> extends NavType<D[]> {
        private final Class<D[]> arrayType;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (other == null || !p.e(ParcelableArrayType.class, other.getClass())) {
                return false;
            }
            return p.e(this.arrayType, ((ParcelableArrayType) other).arrayType);
        }

        @Override // androidx.navigation.NavType
        public D[] get(Bundle bundle, String key) {
            p.j(bundle, ContainerActivity.BUNDLE);
            p.j(key, C3426d4.i.W);
            return (D[]) ((Parcelable[]) bundle.get(key));
        }

        @Override // androidx.navigation.NavType
        public String getName() {
            String name = this.arrayType.getName();
            p.i(name, "arrayType.name");
            return name;
        }

        public int hashCode() {
            return this.arrayType.hashCode();
        }

        @Override // androidx.navigation.NavType
        public D[] parseValue(String value) {
            p.j(value, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String key, D[] value) {
            p.j(bundle, ContainerActivity.BUNDLE);
            p.j(key, C3426d4.i.W);
            this.arrayType.cast(value);
            bundle.putParcelableArray(key, value);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ParcelableArrayType(Class<D> cls) {
            super(true);
            p.j(cls, "type");
            if (Parcelable.class.isAssignableFrom(cls)) {
                try {
                    this.arrayType = (Class<D[]>) Class.forName("[L" + cls.getName() + ';');
                    return;
                } catch (ClassNotFoundException e10) {
                    throw new RuntimeException(e10);
                }
            }
            throw new IllegalArgumentException((cls + " does not implement Parcelable.").toString());
        }
    }

    /* JADX INFO: compiled from: NavType.kt */
    @Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0015\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00010\u0015¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\t\u0010\nJ\"\u0010\u000b\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00028\u00012\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0013H\u0016R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00010\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Landroidx/navigation/NavType$ParcelableType;", "D", "Landroidx/navigation/NavType;", "Landroid/os/Bundle;", ContainerActivity.BUNDLE, "", C3426d4.i.W, "value", "Lmj/r;", "put", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V", "get", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Object;", "parseValue", "(Ljava/lang/String;)Ljava/lang/Object;", "", "other", "", "equals", "", "hashCode", "Ljava/lang/Class;", "type", "Ljava/lang/Class;", "getName", "()Ljava/lang/String;", "name", "<init>", "(Ljava/lang/Class;)V", "navigation-common_release"}, k = 1, mv = {1, 6, 0})
    public static final class ParcelableType<D> extends NavType<D> {
        private final Class<D> type;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (other == null || !p.e(ParcelableType.class, other.getClass())) {
                return false;
            }
            return p.e(this.type, ((ParcelableType) other).type);
        }

        @Override // androidx.navigation.NavType
        public D get(Bundle bundle, String key) {
            p.j(bundle, ContainerActivity.BUNDLE);
            p.j(key, C3426d4.i.W);
            return (D) bundle.get(key);
        }

        @Override // androidx.navigation.NavType
        public String getName() {
            String name = this.type.getName();
            p.i(name, "type.name");
            return name;
        }

        public int hashCode() {
            return this.type.hashCode();
        }

        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String key, D value) {
            p.j(bundle, ContainerActivity.BUNDLE);
            p.j(key, C3426d4.i.W);
            this.type.cast(value);
            if (value == null || (value instanceof Parcelable)) {
                bundle.putParcelable(key, (Parcelable) value);
            } else if (value instanceof Serializable) {
                bundle.putSerializable(key, (Serializable) value);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ParcelableType(Class<D> cls) {
            super(true);
            p.j(cls, "type");
            boolean z10 = true;
            if (!Parcelable.class.isAssignableFrom(cls) && !Serializable.class.isAssignableFrom(cls)) {
                z10 = false;
            }
            if (z10) {
                this.type = cls;
                return;
            }
            throw new IllegalArgumentException((cls + " does not implement Parcelable or Serializable.").toString());
        }

        @Override // androidx.navigation.NavType
        public D parseValue(String value) {
            p.j(value, "value");
            throw new UnsupportedOperationException("Parcelables don't support default values.");
        }
    }

    /* JADX INFO: compiled from: NavType.kt */
    @Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00040\u0003B\u0015\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00010\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ(\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0016R \u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006 "}, d2 = {"Landroidx/navigation/NavType$SerializableArrayType;", "Ljava/io/Serializable;", "D", "Landroidx/navigation/NavType;", "", "Landroid/os/Bundle;", ContainerActivity.BUNDLE, "", C3426d4.i.W, "value", "Lmj/r;", "put", "(Landroid/os/Bundle;Ljava/lang/String;[Ljava/io/Serializable;)V", "get", "(Landroid/os/Bundle;Ljava/lang/String;)[Ljava/io/Serializable;", "parseValue", "(Ljava/lang/String;)[Ljava/io/Serializable;", "", "other", "", "equals", "", "hashCode", "Ljava/lang/Class;", "arrayType", "Ljava/lang/Class;", "getName", "()Ljava/lang/String;", "name", "type", "<init>", "(Ljava/lang/Class;)V", "navigation-common_release"}, k = 1, mv = {1, 6, 0})
    public static final class SerializableArrayType<D extends Serializable> extends NavType<D[]> {
        private final Class<D[]> arrayType;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (other == null || !p.e(SerializableArrayType.class, other.getClass())) {
                return false;
            }
            return p.e(this.arrayType, ((SerializableArrayType) other).arrayType);
        }

        @Override // androidx.navigation.NavType
        public D[] get(Bundle bundle, String key) {
            p.j(bundle, ContainerActivity.BUNDLE);
            p.j(key, C3426d4.i.W);
            return (D[]) ((Serializable[]) bundle.get(key));
        }

        @Override // androidx.navigation.NavType
        public String getName() {
            String name = this.arrayType.getName();
            p.i(name, "arrayType.name");
            return name;
        }

        public int hashCode() {
            return this.arrayType.hashCode();
        }

        @Override // androidx.navigation.NavType
        public D[] parseValue(String value) {
            p.j(value, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String key, D[] value) {
            p.j(bundle, ContainerActivity.BUNDLE);
            p.j(key, C3426d4.i.W);
            this.arrayType.cast(value);
            bundle.putSerializable(key, value);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SerializableArrayType(Class<D> cls) {
            super(true);
            p.j(cls, "type");
            if (Serializable.class.isAssignableFrom(cls)) {
                try {
                    this.arrayType = (Class<D[]>) Class.forName("[L" + cls.getName() + ';');
                    return;
                } catch (ClassNotFoundException e10) {
                    throw new RuntimeException(e10);
                }
            }
            throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
        }
    }

    /* JADX INFO: compiled from: NavType.kt */
    @Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0017\b\u0016\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u0016¢\u0006\u0004\b\u001c\u0010\u001dB\u001f\b\u0010\u0012\u0006\u0010\u001e\u001a\u00020\u0012\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u0016¢\u0006\u0004\b\u001c\u0010\u001fJ'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\"\u0010\f\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00028\u00012\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006 "}, d2 = {"Landroidx/navigation/NavType$SerializableType;", "Ljava/io/Serializable;", "D", "Landroidx/navigation/NavType;", "Landroid/os/Bundle;", ContainerActivity.BUNDLE, "", C3426d4.i.W, "value", "Lmj/r;", "put", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/io/Serializable;)V", "get", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/io/Serializable;", "parseValue", "(Ljava/lang/String;)Ljava/io/Serializable;", "", "other", "", "equals", "", "hashCode", "Ljava/lang/Class;", "type", "Ljava/lang/Class;", "getName", "()Ljava/lang/String;", "name", "<init>", "(Ljava/lang/Class;)V", "nullableAllowed", "(ZLjava/lang/Class;)V", "navigation-common_release"}, k = 1, mv = {1, 6, 0})
    public static class SerializableType<D extends Serializable> extends NavType<D> {
        private final Class<D> type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SerializableType(Class<D> cls) {
            super(true);
            p.j(cls, "type");
            if (!Serializable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
            }
            if (true ^ cls.isEnum()) {
                this.type = cls;
                return;
            }
            throw new IllegalArgumentException((cls + " is an Enum. You should use EnumType instead.").toString());
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (other instanceof SerializableType) {
                return p.e(this.type, ((SerializableType) other).type);
            }
            return false;
        }

        @Override // androidx.navigation.NavType
        public D get(Bundle bundle, String key) {
            p.j(bundle, ContainerActivity.BUNDLE);
            p.j(key, C3426d4.i.W);
            return (D) bundle.get(key);
        }

        @Override // androidx.navigation.NavType
        public String getName() {
            String name = this.type.getName();
            p.i(name, "type.name");
            return name;
        }

        public int hashCode() {
            return this.type.hashCode();
        }

        @Override // androidx.navigation.NavType
        public D parseValue(String value) {
            p.j(value, "value");
            throw new UnsupportedOperationException("Serializables don't support default values.");
        }

        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String key, D value) {
            p.j(bundle, ContainerActivity.BUNDLE);
            p.j(key, C3426d4.i.W);
            p.j(value, "value");
            this.type.cast(value);
            bundle.putSerializable(key, value);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SerializableType(boolean z10, Class<D> cls) {
            super(z10);
            p.j(cls, "type");
            if (Serializable.class.isAssignableFrom(cls)) {
                this.type = cls;
                return;
            }
            throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
        }
    }

    public static NavType<?> fromArgType(String str, String str2) {
        return INSTANCE.fromArgType(str, str2);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final NavType<Object> inferFromValue(String str) {
        return INSTANCE.inferFromValue(str);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final NavType<Object> inferFromValueType(Object obj) {
        return INSTANCE.inferFromValueType(obj);
    }

    public abstract T get(Bundle bundle, String key);

    public abstract T parseValue(String value);

    public abstract void put(Bundle bundle, String key, T value);

    public String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: isNullableAllowed, reason: from getter */
    public boolean getIsNullableAllowed() {
        return this.isNullableAllowed;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final T parseAndPut(Bundle bundle, String key, String value) {
        p.j(bundle, ContainerActivity.BUNDLE);
        p.j(key, C3426d4.i.W);
        p.j(value, "value");
        T value2 = parseValue(value);
        put(bundle, key, value2);
        return value2;
    }

    public NavType(boolean z10) {
        this.isNullableAllowed = z10;
    }

    public String toString() {
        return getName();
    }
}
