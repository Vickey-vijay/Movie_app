package in;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import org.fourthline.cling.binding.LocalServiceBindingException;
import org.fourthline.cling.model.meta.ActionArgument;
import org.fourthline.cling.model.types.Datatype;
import un.m;

/* JADX INFO: compiled from: AnnotationActionBinder.java */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Logger f54291e = Logger.getLogger(b.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f54292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Method f54293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map<m, xn.c> f54294c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Set<Class> f54295d;

    public nn.c b(Map<ActionArgument<un.f>, xn.c> map) {
        return new nn.e(map, h());
    }

    public List<ActionArgument> c() throws LocalServiceBindingException {
        ArrayList arrayList = new ArrayList();
        Annotation[][] parameterAnnotations = h().getParameterAnnotations();
        int i10 = 0;
        for (int i11 = 0; i11 < parameterAnnotations.length; i11++) {
            for (Annotation annotation : parameterAnnotations[i11]) {
                if (annotation instanceof e) {
                    e eVar = (e) annotation;
                    i10++;
                    String strName = eVar.name();
                    m mVarF = f(eVar.stateVariable(), strName, h().getName());
                    if (mVarF == null) {
                        throw new LocalServiceBindingException("Could not detected related state variable of argument: " + strName);
                    }
                    l(mVarF, h().getParameterTypes()[i11]);
                    arrayList.add(new ActionArgument(strName, eVar.aliases(), mVarF.b(), ActionArgument.Direction.IN));
                }
            }
        }
        if (i10 >= h().getParameterTypes().length || vn.c.class.isAssignableFrom(this.f54293b.getParameterTypes()[this.f54293b.getParameterTypes().length - 1])) {
            return arrayList;
        }
        throw new LocalServiceBindingException("Method has parameters that are not input arguments: " + h().getName());
    }

    public Map<ActionArgument<un.f>, xn.c> d() throws LocalServiceBindingException {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        d dVar = (d) h().getAnnotation(d.class);
        if (dVar.out().length == 0) {
            return linkedHashMap;
        }
        boolean z10 = dVar.out().length > 1;
        for (f fVar : dVar.out()) {
            String strName = fVar.name();
            m mVarF = f(fVar.stateVariable(), strName, h().getName());
            if (mVarF == null && fVar.getterName().length() > 0) {
                mVarF = f(null, null, fVar.getterName());
            }
            if (mVarF == null) {
                throw new LocalServiceBindingException("Related state variable not found for output argument: " + strName);
            }
            xn.c cVarE = e(mVarF, fVar.getterName(), z10);
            f54291e.finer("Found related state variable for output argument '" + strName + "': " + mVarF);
            linkedHashMap.put(new ActionArgument(strName, mVarF.b(), ActionArgument.Direction.OUT, z10 ^ true), cVarE);
        }
        return linkedHashMap;
    }

    public m f(String str, String str2, String str3) throws LocalServiceBindingException {
        String strH;
        m mVarI = (str == null || str.length() <= 0) ? null : i(str);
        if (mVarI == null && str2 != null && str2.length() > 0) {
            String strI = b.i(str2);
            f54291e.finer("Finding related state variable with argument name (converted to UPnP name): " + strI);
            mVarI = i(str2);
        }
        if (mVarI == null && str2 != null && str2.length() > 0) {
            String str4 = "A_ARG_TYPE_" + b.i(str2);
            f54291e.finer("Finding related state variable with prefixed argument name (converted to UPnP name): " + str4);
            mVarI = i(str4);
        }
        if (mVarI != null || str3 == null || str3.length() <= 0 || (strH = so.d.h(str3)) == null) {
            return mVarI;
        }
        f54291e.finer("Finding related state variable with method property name: " + strH);
        return i(b.i(strH));
    }

    public d g() {
        return this.f54292a;
    }

    public Method h() {
        return this.f54293b;
    }

    public Map<m, xn.c> j() {
        return this.f54294c;
    }

    public Set<Class> k() {
        return this.f54295d;
    }

    public a(Method method, Map<m, xn.c> map, Set<Class> set) {
        this.f54292a = (d) method.getAnnotation(d.class);
        this.f54294c = map;
        this.f54293b = method;
        this.f54295d = set;
    }

    public org.fourthline.cling.model.meta.a a(Map<org.fourthline.cling.model.meta.a, nn.c> map) throws LocalServiceBindingException {
        String strH;
        if (g().name().length() != 0) {
            strH = g().name();
        } else {
            strH = b.h(h().getName());
        }
        f54291e.fine("Creating action and executor: " + strH);
        List<ActionArgument> listC = c();
        Map<ActionArgument<un.f>, xn.c> mapD = d();
        listC.addAll(mapD.keySet());
        org.fourthline.cling.model.meta.a aVar = new org.fourthline.cling.model.meta.a(strH, (ActionArgument[]) listC.toArray(new ActionArgument[listC.size()]));
        map.put(aVar, b(mapD));
        return aVar;
    }

    public xn.c e(m mVar, String str, boolean z10) throws LocalServiceBindingException {
        if (h().getReturnType().equals(Void.TYPE)) {
            if (str != null && str.length() > 0) {
                f54291e.finer("Action method is void, will use getter method named: " + str);
                Method methodG = so.d.g(h().getDeclaringClass(), str);
                if (methodG != null) {
                    l(mVar, methodG.getReturnType());
                    return new xn.b(methodG);
                }
                throw new LocalServiceBindingException("Declared getter method '" + str + "' not found on: " + h().getDeclaringClass());
            }
            f54291e.finer("Action method is void, trying to find existing accessor of related: " + mVar);
            return j().get(mVar);
        }
        if (str != null && str.length() > 0) {
            f54291e.finer("Action method is not void, will use getter method on returned instance: " + str);
            Method methodG2 = so.d.g(h().getReturnType(), str);
            if (methodG2 != null) {
                l(mVar, methodG2.getReturnType());
                return new xn.b(methodG2);
            }
            throw new LocalServiceBindingException("Declared getter method '" + str + "' not found on return type: " + h().getReturnType());
        }
        if (!z10) {
            f54291e.finer("Action method is not void, will use the returned instance: " + h().getReturnType());
            l(mVar, h().getReturnType());
            return null;
        }
        return null;
    }

    public m i(String str) {
        for (m mVar : j().keySet()) {
            if (mVar.b().equals(str)) {
                return mVar;
            }
        }
        return null;
    }

    public void l(m mVar, Class cls) throws LocalServiceBindingException {
        Datatype.Default byJavaType;
        if (mn.f.e(k(), cls)) {
            byJavaType = Datatype.Default.STRING;
        } else {
            byJavaType = Datatype.Default.getByJavaType(cls);
        }
        f54291e.finer("Expecting '" + mVar + "' to match default mapping: " + byJavaType);
        if (byJavaType != null && !mVar.d().d().d(byJavaType.getJavaType())) {
            throw new LocalServiceBindingException("State variable '" + mVar + "' datatype can't handle action argument's Java type (change one): " + byJavaType.getJavaType());
        }
        if (byJavaType == null && mVar.d().d().b() != null) {
            throw new LocalServiceBindingException("State variable '" + mVar + "' should be custom datatype (action argument type is unknown Java type): " + cls.getSimpleName());
        }
        f54291e.finer("State variable matches required argument datatype (or can't be validated because it is custom)");
    }
}
