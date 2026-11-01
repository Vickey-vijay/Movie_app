package s5;

import com.google.gson.internal.LazilyParsedNumber;
import java.math.BigInteger;

/* JADX INFO: compiled from: JsonPrimitive.java */
/* JADX INFO: loaded from: classes11.dex */
public final class l extends h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Class<?>[] f67030c = {Integer.TYPE, Long.TYPE, Short.TYPE, Float.TYPE, Double.TYPE, Byte.TYPE, Boolean.TYPE, Character.TYPE, Integer.class, Long.class, Short.class, Float.class, Double.class, Byte.class, Boolean.class, Character.class};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f67031b;

    public l(Boolean bool) {
        x(bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f67031b == null) {
            return lVar.f67031b == null;
        }
        if (t(this) && t(lVar)) {
            return q().longValue() == lVar.q().longValue();
        }
        Object obj2 = this.f67031b;
        if (!(obj2 instanceof Number) || !(lVar.f67031b instanceof Number)) {
            return obj2.equals(lVar.f67031b);
        }
        double dDoubleValue = q().doubleValue();
        double dDoubleValue2 = lVar.q().doubleValue();
        if (dDoubleValue != dDoubleValue2) {
            return Double.isNaN(dDoubleValue) && Double.isNaN(dDoubleValue2);
        }
        return true;
    }

    public static boolean t(l lVar) {
        Object obj = lVar.f67031b;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    public static boolean v(Object obj) {
        if (obj instanceof String) {
            return true;
        }
        Class<?> cls = obj.getClass();
        for (Class<?> cls2 : f67030c) {
            if (cls2.isAssignableFrom(cls)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long jDoubleToLongBits;
        if (this.f67031b == null) {
            return 31;
        }
        if (t(this)) {
            jDoubleToLongBits = q().longValue();
        } else {
            Object obj = this.f67031b;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(q().doubleValue());
        }
        return (int) ((jDoubleToLongBits >>> 32) ^ jDoubleToLongBits);
    }

    public Boolean m() {
        return (Boolean) this.f67031b;
    }

    public Number q() {
        Object obj = this.f67031b;
        return obj instanceof String ? new LazilyParsedNumber((String) obj) : (Number) obj;
    }

    public boolean s() {
        return this.f67031b instanceof Boolean;
    }

    public boolean u() {
        return this.f67031b instanceof Number;
    }

    public boolean w() {
        return this.f67031b instanceof String;
    }

    public void x(Object obj) {
        if (obj instanceof Character) {
            this.f67031b = String.valueOf(((Character) obj).charValue());
        } else {
            u5.a.a((obj instanceof Number) || v(obj));
            this.f67031b = obj;
        }
    }

    public l(Number number) {
        x(number);
    }

    public boolean l() {
        if (s()) {
            return m().booleanValue();
        }
        return Boolean.parseBoolean(r());
    }

    public double n() {
        if (u()) {
            return q().doubleValue();
        }
        return Double.parseDouble(r());
    }

    public int o() {
        if (u()) {
            return q().intValue();
        }
        return Integer.parseInt(r());
    }

    public long p() {
        if (u()) {
            return q().longValue();
        }
        return Long.parseLong(r());
    }

    public String r() {
        if (u()) {
            return q().toString();
        }
        if (s()) {
            return m().toString();
        }
        return (String) this.f67031b;
    }

    public l(String str) {
        x(str);
    }
}
