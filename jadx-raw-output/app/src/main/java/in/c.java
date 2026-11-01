package in;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.Set;
import java.util.logging.Logger;
import org.fourthline.cling.binding.LocalServiceBindingException;
import org.fourthline.cling.model.types.Datatype;
import un.m;
import un.n;
import un.o;
import un.p;

/* JADX INFO: compiled from: AnnotationStateVariableBinder.java */
/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Logger f54297e = Logger.getLogger(b.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j f54298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f54299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public xn.c f54300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Set<Class> f54301d;

    public m c() throws LocalServiceBindingException {
        String[] strArrG;
        int i10;
        int iEventMaximumRateMilliseconds;
        boolean z10;
        f54297e.fine("Creating state variable '" + j() + "' with accessor: " + d());
        Datatype datatypeA = a();
        String strB = b(datatypeA);
        n nVarF = null;
        int iEventMinimumDelta = 0;
        if (Datatype.Builtin.STRING.equals(datatypeA.b())) {
            if (i().allowedValueProvider() != Void.TYPE) {
                strArrG = h();
            } else if (i().allowedValues().length > 0) {
                strArrG = i().allowedValues();
            } else if (i().allowedValuesEnum() != Void.TYPE) {
                strArrG = g(i().allowedValuesEnum());
            } else if (d() == null || !d().a().isEnum()) {
                f54297e.finer("Not restricting allowed values (of string typed state var): " + j());
                strArrG = null;
            } else {
                strArrG = g(d().a());
            }
            if (strArrG != null && strB != null) {
                int length = strArrG.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        z10 = false;
                        break;
                    }
                    if (strArrG[i11].equals(strB)) {
                        z10 = true;
                        break;
                    }
                    i11++;
                }
                if (!z10) {
                    throw new LocalServiceBindingException("Default value '" + strB + "' is not in allowed values of: " + j());
                }
            }
        } else {
            strArrG = null;
        }
        if (Datatype.Builtin.isNumeric(datatypeA.b())) {
            if (i().allowedValueRangeProvider() != Void.TYPE) {
                nVarF = e();
            } else if (i().allowedValueMinimum() > 0 || i().allowedValueMaximum() > 0) {
                nVarF = f(i().allowedValueMinimum(), i().allowedValueMaximum(), i().allowedValueStep());
            } else {
                f54297e.finer("Not restricting allowed value range (of numeric typed state var): " + j());
            }
            if (strB != null && nVarF != null) {
                try {
                    if (!nVarF.d(Long.valueOf(strB).longValue())) {
                        throw new LocalServiceBindingException("Default value '" + strB + "' is not in allowed range of: " + j());
                    }
                } catch (Exception unused) {
                    throw new LocalServiceBindingException("Default value '" + strB + "' is not numeric (for range checking) of: " + j());
                }
            }
        }
        boolean zSendEvents = i().sendEvents();
        if (zSendEvents && d() == null) {
            throw new LocalServiceBindingException("State variable sends events but has no accessor for field or getter: " + j());
        }
        if (zSendEvents) {
            if (i().eventMaximumRateMilliseconds() > 0) {
                f54297e.finer("Moderating state variable events using maximum rate (milliseconds): " + i().eventMaximumRateMilliseconds());
                iEventMaximumRateMilliseconds = i().eventMaximumRateMilliseconds();
            } else {
                iEventMaximumRateMilliseconds = 0;
            }
            if (i().eventMinimumDelta() > 0 && Datatype.Builtin.isNumeric(datatypeA.b())) {
                f54297e.finer("Moderating state variable events using minimum delta: " + i().eventMinimumDelta());
                iEventMinimumDelta = i().eventMinimumDelta();
            }
            int i12 = iEventMaximumRateMilliseconds;
            i10 = iEventMinimumDelta;
            iEventMinimumDelta = i12;
        } else {
            i10 = 0;
        }
        return new m(j(), new p(datatypeA, strB, strArrG, nVarF), new o(zSendEvents, iEventMinimumDelta, i10));
    }

    public xn.c d() {
        return this.f54300c;
    }

    public n e() throws LocalServiceBindingException {
        Class clsAllowedValueRangeProvider = i().allowedValueRangeProvider();
        if (!hn.b.class.isAssignableFrom(clsAllowedValueRangeProvider)) {
            throw new LocalServiceBindingException("Allowed value range provider is not of type " + hn.b.class + ": " + j());
        }
        try {
            hn.b bVar = (hn.b) clsAllowedValueRangeProvider.newInstance();
            return f(bVar.b(), bVar.c(), bVar.a());
        } catch (Exception e10) {
            throw new LocalServiceBindingException("Allowed value range provider can't be instantiated: " + j(), e10);
        }
    }

    public n f(long j10, long j11, long j12) throws LocalServiceBindingException {
        if (j11 >= j10) {
            return new n(j10, j11, j12);
        }
        throw new LocalServiceBindingException("Allowed value range maximum is smaller than minimum: " + j());
    }

    public String[] h() throws LocalServiceBindingException {
        Class clsAllowedValueProvider = i().allowedValueProvider();
        if (hn.a.class.isAssignableFrom(clsAllowedValueProvider)) {
            try {
                return ((hn.a) clsAllowedValueProvider.newInstance()).a();
            } catch (Exception e10) {
                throw new LocalServiceBindingException("Allowed value provider can't be instantiated: " + j(), e10);
            }
        }
        throw new LocalServiceBindingException("Allowed value provider is not of type " + hn.a.class + ": " + j());
    }

    public j i() {
        return this.f54298a;
    }

    public String j() {
        return this.f54299b;
    }

    public Set<Class> k() {
        return this.f54301d;
    }

    public c(j jVar, String str, xn.c cVar, Set<Class> set) {
        this.f54298a = jVar;
        this.f54299b = str;
        this.f54300c = cVar;
        this.f54301d = set;
    }

    public Datatype a() throws LocalServiceBindingException {
        String strDatatype = i().datatype();
        if (strDatatype.length() == 0 && d() != null) {
            Class<?> clsA = d().a();
            f54297e.finer("Using accessor return type as state variable type: " + clsA);
            if (mn.f.e(k(), clsA)) {
                f54297e.finer("Return type is string-convertible, using string datatype");
                return Datatype.Default.STRING.getBuiltinType().getDatatype();
            }
            Datatype.Default byJavaType = Datatype.Default.getByJavaType(clsA);
            if (byJavaType != null) {
                f54297e.finer("Return type has default UPnP datatype: " + byJavaType);
                return byJavaType.getBuiltinType().getDatatype();
            }
        }
        if (strDatatype.length() == 0 && (i().allowedValues().length > 0 || i().allowedValuesEnum() != Void.TYPE)) {
            f54297e.finer("State variable has restricted allowed values, hence using 'string' datatype");
            strDatatype = TypedValues.Custom.S_STRING;
        }
        if (strDatatype.length() != 0) {
            f54297e.finer("Trying to find built-in UPnP datatype for detected name: " + strDatatype);
            Datatype.Builtin byDescriptorName = Datatype.Builtin.getByDescriptorName(strDatatype);
            if (byDescriptorName != null) {
                f54297e.finer("Found built-in UPnP datatype: " + byDescriptorName);
                return byDescriptorName.getDatatype();
            }
            throw new LocalServiceBindingException("No built-in UPnP datatype found, using CustomDataType (TODO: NOT IMPLEMENTED)");
        }
        throw new LocalServiceBindingException("Could not detect datatype of state variable: " + j());
    }

    public String b(Datatype datatype) throws LocalServiceBindingException {
        if (i().defaultValue().length() != 0) {
            try {
                datatype.c(i().defaultValue());
                f54297e.finer("Found state variable default value: " + i().defaultValue());
                return i().defaultValue();
            } catch (Exception e10) {
                throw new LocalServiceBindingException("Default value doesn't match datatype of state variable '" + j() + "': " + e10.getMessage());
            }
        }
        return null;
    }

    public String[] g(Class cls) throws LocalServiceBindingException {
        if (cls.isEnum()) {
            f54297e.finer("Restricting allowed values of state variable to Enum: " + j());
            String[] strArr = new String[cls.getEnumConstants().length];
            for (int i10 = 0; i10 < cls.getEnumConstants().length; i10++) {
                Object obj = cls.getEnumConstants()[i10];
                if (obj.toString().length() <= 32) {
                    f54297e.finer("Adding allowed value (converted to string): " + obj.toString());
                    strArr[i10] = obj.toString();
                } else {
                    throw new LocalServiceBindingException("Allowed value string (that is, Enum constant name) is longer than 32 characters: " + obj.toString());
                }
            }
            return strArr;
        }
        throw new LocalServiceBindingException("Allowed values type is not an Enum: " + cls);
    }
}
