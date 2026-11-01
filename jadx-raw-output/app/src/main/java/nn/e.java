package nn;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import java.util.logging.Logger;
import mn.l;
import org.fourthline.cling.model.action.ActionException;
import org.fourthline.cling.model.meta.ActionArgument;
import org.fourthline.cling.model.types.ErrorCode;

/* JADX INFO: compiled from: MethodActionExecutor.java */
/* JADX INFO: loaded from: classes2.dex */
public class e extends a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Logger f64875d = Logger.getLogger(e.class.getName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Method f64876c;

    /* JADX WARN: Code duplicated, block: B:24:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:26:0x00d3  */
    /* JADX WARN: Instruction removed from duplicated block: B:26:0x00d3, please report this as an issue */
    @Override // nn.a
    public void b(d<un.f> dVar, Object obj) throws Exception {
        Object objK;
        boolean z10;
        ActionArgument<un.f>[] actionArgumentArrF;
        Object[] objArrF = f(dVar, this.f64876c);
        if (!dVar.a().i()) {
            f64875d.fine("Calling local service method with no output arguments: " + this.f64876c);
            so.d.k(this.f64876c, obj, objArrF);
            return;
        }
        boolean zEquals = this.f64876c.getReturnType().equals(Void.TYPE);
        f64875d.fine("Calling local service method with output arguments: " + this.f64876c);
        if (!zEquals) {
            if (g(dVar)) {
                f64875d.fine("Action method is not void, calling declared accessor(s) on returned instance to retrieve ouput argument(s)");
                objK = d(dVar.a(), so.d.k(this.f64876c, obj, objArrF));
            } else {
                f64875d.fine("Action method is not void, using returned value as (single) output argument");
                objK = so.d.k(this.f64876c, obj, objArrF);
                z10 = false;
            }
            actionArgumentArrF = dVar.a().f();
            if (z10 || !(objK instanceof Object[])) {
                if (actionArgumentArrF.length == 1) {
                    e(dVar, actionArgumentArrF[0], objK);
                    return;
                }
                throw new ActionException(ErrorCode.ACTION_FAILED, "Method return does not match required number of output arguments: " + actionArgumentArrF.length);
            }
            Object[] objArr = (Object[]) objK;
            f64875d.fine("Accessors returned Object[], setting output argument values: " + objArr.length);
            for (int i10 = 0; i10 < actionArgumentArrF.length; i10++) {
                e(dVar, actionArgumentArrF[i10], objArr[i10]);
            }
            return;
        }
        f64875d.fine("Action method is void, calling declared accessors(s) on service instance to retrieve ouput argument(s)");
        so.d.k(this.f64876c, obj, objArrF);
        objK = d(dVar.a(), obj);
        z10 = true;
        actionArgumentArrF = dVar.a().f();
        if (z10) {
        }
        if (actionArgumentArrF.length == 1) {
            e(dVar, actionArgumentArrF[0], objK);
            return;
        }
        throw new ActionException(ErrorCode.ACTION_FAILED, "Method return does not match required number of output arguments: " + actionArgumentArrF.length);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0164  */
    public Object[] f(d<un.f> dVar, Method method) throws ActionException {
        char c10;
        un.f fVar = (un.f) dVar.a().g();
        ArrayList arrayList = new ArrayList();
        ActionArgument[] actionArgumentArrC = dVar.a().c();
        int length = actionArgumentArrC.length;
        char c11 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            ActionArgument actionArgument = actionArgumentArrC[i10];
            Class<?> cls = method.getParameterTypes()[i11];
            l lVarE = dVar.e(actionArgument);
            if (cls.isPrimitive() && (lVarE == null || lVarE.toString().length() == 0)) {
                throw new ActionException(ErrorCode.ARGUMENT_VALUE_INVALID, "Primitive action method argument '" + actionArgument.e() + "' requires input value, can't be null or empty string");
            }
            if (lVarE == null) {
                arrayList.add(i11, null);
                c10 = c11;
                i11++;
            } else {
                String string = lVarE.toString();
                if (string.length() <= 0 || !fVar.s(cls) || cls.isEnum()) {
                    c10 = c11;
                    arrayList.add(i11, lVarE.b());
                    i11++;
                } else {
                    try {
                        Class<?>[] clsArr = new Class[1];
                        clsArr[c11] = String.class;
                        Constructor<?> constructor = cls.getConstructor(clsArr);
                        f64875d.finer("Creating new input argument value instance with String.class constructor of type: " + cls);
                        c10 = 0;
                        Object[] objArr = {string};
                        int i12 = i11 + 1;
                        arrayList.add(i11, constructor.newInstance(objArr));
                        i11 = i12;
                    } catch (Exception e10) {
                        f64875d.warning("Error preparing action method call: " + method);
                        f64875d.warning("Can't convert input argument string to desired type of '" + actionArgument.e() + "': " + e10);
                        throw new ActionException(ErrorCode.ARGUMENT_VALUE_INVALID, "Can't convert input argument string to desired type of '" + actionArgument.e() + "': " + e10);
                    }
                }
            }
            i10++;
            c11 = c10;
        }
        if (method.getParameterTypes().length > 0 && vn.c.class.isAssignableFrom(method.getParameterTypes()[method.getParameterTypes().length - 1])) {
            if (dVar instanceof g) {
                g gVar = (g) dVar;
                if (gVar.o() != null) {
                    f64875d.finer("Providing remote client info as last action method input argument: " + method);
                    arrayList.add(i11, gVar.o());
                } else {
                    arrayList.add(i11, null);
                }
            } else {
                arrayList.add(i11, null);
            }
        }
        return arrayList.toArray(new Object[arrayList.size()]);
    }

    public e(Map<ActionArgument<un.f>, xn.c> map, Method method) {
        super(map);
        this.f64876c = method;
    }

    public boolean g(d<un.f> dVar) {
        for (ActionArgument actionArgument : dVar.a().f()) {
            if (c().get(actionArgument) != null) {
                return true;
            }
        }
        return false;
    }
}
