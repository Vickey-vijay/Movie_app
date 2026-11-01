package com.mbridge.msdk.config.component.common.express.operator;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: OperatorCompoundAssignment.java */
/* JADX INFO: loaded from: classes8.dex */
public class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List<String> f33037b = Arrays.asList("+=", "-=", "*=", "/=", "%=");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.common.express.operator.parts.c f33038a;

    private com.mbridge.msdk.config.component.common.express.operator.parts.a b(String str, Object obj, List<Object> list) {
        String strA;
        Object objB;
        Object objA = a(list);
        if (obj instanceof com.mbridge.msdk.config.component.common.express.entities.a) {
            com.mbridge.msdk.config.component.common.express.entities.a aVar = (com.mbridge.msdk.config.component.common.express.entities.a) obj;
            strA = aVar.a();
            objB = aVar.b();
        } else {
            strA = "";
            objB = null;
        }
        if (TextUtils.isEmpty(strA)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        if (objB instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
            com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar2 = (com.mbridge.msdk.config.dynamic.binddata.wrapper.a) objB;
            return a(aVar2, strA, str, aVar2.b(strA), objA);
        }
        if (objB instanceof Map) {
            Map map = (Map) objB;
            return a(map, strA, str, map.get(strA), objA);
        }
        if (objB instanceof List) {
            try {
                int i10 = Integer.parseInt(strA);
                if (i10 >= 0 && i10 < ((List) objB).size()) {
                    return a((List) objB, i10, str, ((List) objB).get(i10), objA);
                }
                q0.b("CompoundAssignOp", "List index out of bounds: " + strA + ", list size: " + ((List) objB).size());
            } catch (NumberFormatException unused) {
                q0.b("CompoundAssignOp", "Invalid list index: " + strA);
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
    }

    public com.mbridge.msdk.config.component.common.express.operator.parts.a a(String str, Object obj, List<Object> list) {
        if (TextUtils.isEmpty(str)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
        }
        String strTrim = str.trim();
        Iterator<String> it = f33037b.iterator();
        while (it.hasNext()) {
            if (strTrim.equals(it.next())) {
                return b(strTrim, obj, list);
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
    }

    public f(com.mbridge.msdk.config.component.common.express.operator.parts.c cVar) {
        this.f33038a = cVar;
    }

    private Object a(List<Object> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a a(com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar, String str, String str2, Object obj, Object obj2) {
        Object objValueOf;
        Double dA = a(obj);
        Double dA2 = a(obj2);
        if (dA != null && dA2 != null) {
            try {
                Object objA = a(dA, dA2, str2);
                if (objA instanceof Double) {
                    double dDoubleValue = ((Double) objA).doubleValue();
                    if (a(dDoubleValue)) {
                        objValueOf = Integer.valueOf(((Double) objA).intValue());
                    } else {
                        objValueOf = Double.valueOf(b(dDoubleValue));
                    }
                    if (aVar != null) {
                        aVar.a(str, objValueOf);
                    }
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(objValueOf);
                }
            } catch (Exception e10) {
                q0.b("CompoundAssignOp", e10.getMessage(), e10);
            }
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
    }

    private double b(double d10) {
        return new BigDecimal(d10).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a a(Map map, String str, String str2, Object obj, Object obj2) {
        Object objValueOf;
        Double dA = a(obj);
        Double dA2 = a(obj2);
        if (dA != null && dA2 != null) {
            try {
                Object objA = a(dA, dA2, str2);
                if (objA instanceof Double) {
                    double dDoubleValue = ((Double) objA).doubleValue();
                    if (a(dDoubleValue)) {
                        objValueOf = Integer.valueOf(((Double) objA).intValue());
                    } else {
                        objValueOf = Double.valueOf(b(dDoubleValue));
                    }
                    if (map != null) {
                        map.put(str, objValueOf);
                    }
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(objValueOf);
                }
            } catch (Exception e10) {
                q0.b("CompoundAssignOp", e10.getMessage(), e10);
            }
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a a(List list, int i10, String str, Object obj, Object obj2) {
        Object objValueOf;
        Double dA = a(obj);
        Double dA2 = a(obj2);
        if (dA != null && dA2 != null) {
            try {
                Object objA = a(dA, dA2, str);
                if (objA instanceof Double) {
                    double dDoubleValue = ((Double) objA).doubleValue();
                    if (a(dDoubleValue)) {
                        objValueOf = Integer.valueOf(((Double) objA).intValue());
                    } else {
                        objValueOf = Double.valueOf(b(dDoubleValue));
                    }
                    if (list != null) {
                        list.set(i10, objValueOf);
                    }
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(objValueOf);
                }
            } catch (Exception e10) {
                q0.b("CompoundAssignOp", e10.getMessage(), e10);
            }
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
    }

    private Double a(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Number) {
            return Double.valueOf(((Number) obj).doubleValue());
        }
        try {
            return Double.valueOf(Double.parseDouble(String.valueOf(obj)));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    private Object a(Double d10, Double d11, String str) {
        byte b10;
        try {
            int iHashCode = str.hashCode();
            if (iHashCode != 1208) {
                if (iHashCode != 1363) {
                    if (iHashCode != 1394) {
                        if (iHashCode != 1456) {
                            if (iHashCode == 1518 && str.equals("/=")) {
                                b10 = 3;
                            } else {
                                b10 = -1;
                            }
                        } else if (str.equals("-=")) {
                            b10 = 1;
                        } else {
                            b10 = -1;
                        }
                    } else if (str.equals("+=")) {
                        b10 = 0;
                    } else {
                        b10 = -1;
                    }
                } else if (str.equals("*=")) {
                    b10 = 2;
                } else {
                    b10 = -1;
                }
            } else if (str.equals("%=")) {
                b10 = 4;
            } else {
                b10 = -1;
            }
            if (b10 == 0) {
                return Double.valueOf(d10.doubleValue() + d11.doubleValue());
            }
            if (b10 == 1) {
                return Double.valueOf(d10.doubleValue() - d11.doubleValue());
            }
            if (b10 == 2) {
                return Double.valueOf(d10.doubleValue() * d11.doubleValue());
            }
            if (b10 == 3) {
                if (d11.doubleValue() != 0.0d) {
                    return Double.valueOf(new BigDecimal(d10.doubleValue()).divide(new BigDecimal(d11.doubleValue()), 10, RoundingMode.HALF_UP).doubleValue());
                }
                throw new ArithmeticException("Division by zero");
            }
            if (b10 != 4) {
                return null;
            }
            if (d11.doubleValue() != 0.0d) {
                return Double.valueOf(d10.doubleValue() % d11.doubleValue());
            }
            throw new ArithmeticException("Modulo by zero");
        } catch (Exception e10) {
            q0.b("CompoundAssignOp", e10.getMessage());
        }
    }

    private boolean a(double d10) {
        return (Double.isNaN(d10) || Double.isInfinite(d10) || d10 != Math.floor(d10)) ? false : true;
    }
}
