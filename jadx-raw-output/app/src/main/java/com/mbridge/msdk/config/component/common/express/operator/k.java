package com.mbridge.msdk.config.component.common.express.operator;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: OperatorMath.java */
/* JADX INFO: loaded from: classes8.dex */
public class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List<String> f33049b = Arrays.asList("mathabs", "mathCeil", "mathFloor", "mathRound", "mathPow", "mathSqrt", "mathAtan2", "randomNumber");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.common.express.operator.parts.c f33050a;

    private Object a(double d10) {
        if (Double.isNaN(d10) || Double.isInfinite(d10)) {
            return Double.valueOf(d10);
        }
        return d10 == Math.floor(d10) ? Integer.valueOf((int) d10) : Double.valueOf(b(d10));
    }

    private double b(double d10) {
        return new BigDecimal(d10).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    public k(com.mbridge.msdk.config.component.common.express.operator.parts.c cVar) {
        this.f33050a = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0082  */
    /* JADX WARN: Code duplicated, block: B:48:0x0083 A[Catch: Exception -> 0x0164, TryCatch #3 {Exception -> 0x0164, blocks: (B:45:0x007b, B:46:0x007f, B:73:0x00d3, B:74:0x00d6, B:77:0x00e0, B:79:0x00f5, B:82:0x00fc, B:83:0x0109, B:85:0x010e, B:88:0x011d, B:89:0x012a, B:91:0x012f, B:93:0x013d, B:95:0x014a, B:97:0x0157, B:48:0x0083, B:51:0x008c, B:54:0x0096, B:57:0x00a0, B:60:0x00aa, B:63:0x00b4, B:66:0x00be, B:69:0x00c8), top: B:108:0x007b }] */
    /* JADX WARN: Code duplicated, block: B:50:0x008b  */
    /* JADX WARN: Code duplicated, block: B:51:0x008c A[Catch: Exception -> 0x0164, TryCatch #3 {Exception -> 0x0164, blocks: (B:45:0x007b, B:46:0x007f, B:73:0x00d3, B:74:0x00d6, B:77:0x00e0, B:79:0x00f5, B:82:0x00fc, B:83:0x0109, B:85:0x010e, B:88:0x011d, B:89:0x012a, B:91:0x012f, B:93:0x013d, B:95:0x014a, B:97:0x0157, B:48:0x0083, B:51:0x008c, B:54:0x0096, B:57:0x00a0, B:60:0x00aa, B:63:0x00b4, B:66:0x00be, B:69:0x00c8), top: B:108:0x007b }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0094  */
    /* JADX WARN: Code duplicated, block: B:54:0x0096 A[Catch: Exception -> 0x0164, TryCatch #3 {Exception -> 0x0164, blocks: (B:45:0x007b, B:46:0x007f, B:73:0x00d3, B:74:0x00d6, B:77:0x00e0, B:79:0x00f5, B:82:0x00fc, B:83:0x0109, B:85:0x010e, B:88:0x011d, B:89:0x012a, B:91:0x012f, B:93:0x013d, B:95:0x014a, B:97:0x0157, B:48:0x0083, B:51:0x008c, B:54:0x0096, B:57:0x00a0, B:60:0x00aa, B:63:0x00b4, B:66:0x00be, B:69:0x00c8), top: B:108:0x007b }] */
    /* JADX WARN: Code duplicated, block: B:56:0x009e  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a0 A[Catch: Exception -> 0x0164, TryCatch #3 {Exception -> 0x0164, blocks: (B:45:0x007b, B:46:0x007f, B:73:0x00d3, B:74:0x00d6, B:77:0x00e0, B:79:0x00f5, B:82:0x00fc, B:83:0x0109, B:85:0x010e, B:88:0x011d, B:89:0x012a, B:91:0x012f, B:93:0x013d, B:95:0x014a, B:97:0x0157, B:48:0x0083, B:51:0x008c, B:54:0x0096, B:57:0x00a0, B:60:0x00aa, B:63:0x00b4, B:66:0x00be, B:69:0x00c8), top: B:108:0x007b }] */
    /* JADX WARN: Code duplicated, block: B:59:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:60:0x00aa A[Catch: Exception -> 0x0164, TryCatch #3 {Exception -> 0x0164, blocks: (B:45:0x007b, B:46:0x007f, B:73:0x00d3, B:74:0x00d6, B:77:0x00e0, B:79:0x00f5, B:82:0x00fc, B:83:0x0109, B:85:0x010e, B:88:0x011d, B:89:0x012a, B:91:0x012f, B:93:0x013d, B:95:0x014a, B:97:0x0157, B:48:0x0083, B:51:0x008c, B:54:0x0096, B:57:0x00a0, B:60:0x00aa, B:63:0x00b4, B:66:0x00be, B:69:0x00c8), top: B:108:0x007b }] */
    /* JADX WARN: Code duplicated, block: B:62:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b4 A[Catch: Exception -> 0x0164, TryCatch #3 {Exception -> 0x0164, blocks: (B:45:0x007b, B:46:0x007f, B:73:0x00d3, B:74:0x00d6, B:77:0x00e0, B:79:0x00f5, B:82:0x00fc, B:83:0x0109, B:85:0x010e, B:88:0x011d, B:89:0x012a, B:91:0x012f, B:93:0x013d, B:95:0x014a, B:97:0x0157, B:48:0x0083, B:51:0x008c, B:54:0x0096, B:57:0x00a0, B:60:0x00aa, B:63:0x00b4, B:66:0x00be, B:69:0x00c8), top: B:108:0x007b }] */
    /* JADX WARN: Code duplicated, block: B:65:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:66:0x00be A[Catch: Exception -> 0x0164, TryCatch #3 {Exception -> 0x0164, blocks: (B:45:0x007b, B:46:0x007f, B:73:0x00d3, B:74:0x00d6, B:77:0x00e0, B:79:0x00f5, B:82:0x00fc, B:83:0x0109, B:85:0x010e, B:88:0x011d, B:89:0x012a, B:91:0x012f, B:93:0x013d, B:95:0x014a, B:97:0x0157, B:48:0x0083, B:51:0x008c, B:54:0x0096, B:57:0x00a0, B:60:0x00aa, B:63:0x00b4, B:66:0x00be, B:69:0x00c8), top: B:108:0x007b }] */
    /* JADX WARN: Code duplicated, block: B:68:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c8 A[Catch: Exception -> 0x0164, TryCatch #3 {Exception -> 0x0164, blocks: (B:45:0x007b, B:46:0x007f, B:73:0x00d3, B:74:0x00d6, B:77:0x00e0, B:79:0x00f5, B:82:0x00fc, B:83:0x0109, B:85:0x010e, B:88:0x011d, B:89:0x012a, B:91:0x012f, B:93:0x013d, B:95:0x014a, B:97:0x0157, B:48:0x0083, B:51:0x008c, B:54:0x0096, B:57:0x00a0, B:60:0x00aa, B:63:0x00b4, B:66:0x00be, B:69:0x00c8), top: B:108:0x007b }] */
    /* JADX WARN: Code duplicated, block: B:71:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d6 A[Catch: Exception -> 0x0164, TryCatch #3 {Exception -> 0x0164, blocks: (B:45:0x007b, B:46:0x007f, B:73:0x00d3, B:74:0x00d6, B:77:0x00e0, B:79:0x00f5, B:82:0x00fc, B:83:0x0109, B:85:0x010e, B:88:0x011d, B:89:0x012a, B:91:0x012f, B:93:0x013d, B:95:0x014a, B:97:0x0157, B:48:0x0083, B:51:0x008c, B:54:0x0096, B:57:0x00a0, B:60:0x00aa, B:63:0x00b4, B:66:0x00be, B:69:0x00c8), top: B:108:0x007b }] */
    /* JADX WARN: Code duplicated, block: B:75:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e0 A[Catch: Exception -> 0x0164, TryCatch #3 {Exception -> 0x0164, blocks: (B:45:0x007b, B:46:0x007f, B:73:0x00d3, B:74:0x00d6, B:77:0x00e0, B:79:0x00f5, B:82:0x00fc, B:83:0x0109, B:85:0x010e, B:88:0x011d, B:89:0x012a, B:91:0x012f, B:93:0x013d, B:95:0x014a, B:97:0x0157, B:48:0x0083, B:51:0x008c, B:54:0x0096, B:57:0x00a0, B:60:0x00aa, B:63:0x00b4, B:66:0x00be, B:69:0x00c8), top: B:108:0x007b }] */
    /* JADX WARN: Code duplicated, block: B:79:0x00f5 A[Catch: Exception -> 0x0164, TryCatch #3 {Exception -> 0x0164, blocks: (B:45:0x007b, B:46:0x007f, B:73:0x00d3, B:74:0x00d6, B:77:0x00e0, B:79:0x00f5, B:82:0x00fc, B:83:0x0109, B:85:0x010e, B:88:0x011d, B:89:0x012a, B:91:0x012f, B:93:0x013d, B:95:0x014a, B:97:0x0157, B:48:0x0083, B:51:0x008c, B:54:0x0096, B:57:0x00a0, B:60:0x00aa, B:63:0x00b4, B:66:0x00be, B:69:0x00c8), top: B:108:0x007b }] */
    /* JADX WARN: Code duplicated, block: B:81:0x00fa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x00fc A[Catch: Exception -> 0x0164, TryCatch #3 {Exception -> 0x0164, blocks: (B:45:0x007b, B:46:0x007f, B:73:0x00d3, B:74:0x00d6, B:77:0x00e0, B:79:0x00f5, B:82:0x00fc, B:83:0x0109, B:85:0x010e, B:88:0x011d, B:89:0x012a, B:91:0x012f, B:93:0x013d, B:95:0x014a, B:97:0x0157, B:48:0x0083, B:51:0x008c, B:54:0x0096, B:57:0x00a0, B:60:0x00aa, B:63:0x00b4, B:66:0x00be, B:69:0x00c8), top: B:108:0x007b }] */
    /* JADX WARN: Code duplicated, block: B:83:0x0109 A[Catch: Exception -> 0x0164, TryCatch #3 {Exception -> 0x0164, blocks: (B:45:0x007b, B:46:0x007f, B:73:0x00d3, B:74:0x00d6, B:77:0x00e0, B:79:0x00f5, B:82:0x00fc, B:83:0x0109, B:85:0x010e, B:88:0x011d, B:89:0x012a, B:91:0x012f, B:93:0x013d, B:95:0x014a, B:97:0x0157, B:48:0x0083, B:51:0x008c, B:54:0x0096, B:57:0x00a0, B:60:0x00aa, B:63:0x00b4, B:66:0x00be, B:69:0x00c8), top: B:108:0x007b }] */
    /* JADX WARN: Code duplicated, block: B:85:0x010e A[Catch: Exception -> 0x0164, TryCatch #3 {Exception -> 0x0164, blocks: (B:45:0x007b, B:46:0x007f, B:73:0x00d3, B:74:0x00d6, B:77:0x00e0, B:79:0x00f5, B:82:0x00fc, B:83:0x0109, B:85:0x010e, B:88:0x011d, B:89:0x012a, B:91:0x012f, B:93:0x013d, B:95:0x014a, B:97:0x0157, B:48:0x0083, B:51:0x008c, B:54:0x0096, B:57:0x00a0, B:60:0x00aa, B:63:0x00b4, B:66:0x00be, B:69:0x00c8), top: B:108:0x007b }] */
    /* JADX WARN: Code duplicated, block: B:87:0x011b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x011d A[Catch: Exception -> 0x0164, TryCatch #3 {Exception -> 0x0164, blocks: (B:45:0x007b, B:46:0x007f, B:73:0x00d3, B:74:0x00d6, B:77:0x00e0, B:79:0x00f5, B:82:0x00fc, B:83:0x0109, B:85:0x010e, B:88:0x011d, B:89:0x012a, B:91:0x012f, B:93:0x013d, B:95:0x014a, B:97:0x0157, B:48:0x0083, B:51:0x008c, B:54:0x0096, B:57:0x00a0, B:60:0x00aa, B:63:0x00b4, B:66:0x00be, B:69:0x00c8), top: B:108:0x007b }] */
    /* JADX WARN: Code duplicated, block: B:89:0x012a A[Catch: Exception -> 0x0164, TryCatch #3 {Exception -> 0x0164, blocks: (B:45:0x007b, B:46:0x007f, B:73:0x00d3, B:74:0x00d6, B:77:0x00e0, B:79:0x00f5, B:82:0x00fc, B:83:0x0109, B:85:0x010e, B:88:0x011d, B:89:0x012a, B:91:0x012f, B:93:0x013d, B:95:0x014a, B:97:0x0157, B:48:0x0083, B:51:0x008c, B:54:0x0096, B:57:0x00a0, B:60:0x00aa, B:63:0x00b4, B:66:0x00be, B:69:0x00c8), top: B:108:0x007b }] */
    /* JADX WARN: Code duplicated, block: B:91:0x012f A[Catch: Exception -> 0x0164, TryCatch #3 {Exception -> 0x0164, blocks: (B:45:0x007b, B:46:0x007f, B:73:0x00d3, B:74:0x00d6, B:77:0x00e0, B:79:0x00f5, B:82:0x00fc, B:83:0x0109, B:85:0x010e, B:88:0x011d, B:89:0x012a, B:91:0x012f, B:93:0x013d, B:95:0x014a, B:97:0x0157, B:48:0x0083, B:51:0x008c, B:54:0x0096, B:57:0x00a0, B:60:0x00aa, B:63:0x00b4, B:66:0x00be, B:69:0x00c8), top: B:108:0x007b }] */
    /* JADX WARN: Code duplicated, block: B:93:0x013d A[Catch: Exception -> 0x0164, TryCatch #3 {Exception -> 0x0164, blocks: (B:45:0x007b, B:46:0x007f, B:73:0x00d3, B:74:0x00d6, B:77:0x00e0, B:79:0x00f5, B:82:0x00fc, B:83:0x0109, B:85:0x010e, B:88:0x011d, B:89:0x012a, B:91:0x012f, B:93:0x013d, B:95:0x014a, B:97:0x0157, B:48:0x0083, B:51:0x008c, B:54:0x0096, B:57:0x00a0, B:60:0x00aa, B:63:0x00b4, B:66:0x00be, B:69:0x00c8), top: B:108:0x007b }] */
    /* JADX WARN: Code duplicated, block: B:95:0x014a A[Catch: Exception -> 0x0164, TryCatch #3 {Exception -> 0x0164, blocks: (B:45:0x007b, B:46:0x007f, B:73:0x00d3, B:74:0x00d6, B:77:0x00e0, B:79:0x00f5, B:82:0x00fc, B:83:0x0109, B:85:0x010e, B:88:0x011d, B:89:0x012a, B:91:0x012f, B:93:0x013d, B:95:0x014a, B:97:0x0157, B:48:0x0083, B:51:0x008c, B:54:0x0096, B:57:0x00a0, B:60:0x00aa, B:63:0x00b4, B:66:0x00be, B:69:0x00c8), top: B:108:0x007b }] */
    /* JADX WARN: Code duplicated, block: B:97:0x0157 A[Catch: Exception -> 0x0164, TRY_LEAVE, TryCatch #3 {Exception -> 0x0164, blocks: (B:45:0x007b, B:46:0x007f, B:73:0x00d3, B:74:0x00d6, B:77:0x00e0, B:79:0x00f5, B:82:0x00fc, B:83:0x0109, B:85:0x010e, B:88:0x011d, B:89:0x012a, B:91:0x012f, B:93:0x013d, B:95:0x014a, B:97:0x0157, B:48:0x0083, B:51:0x008c, B:54:0x0096, B:57:0x00a0, B:60:0x00aa, B:63:0x00b4, B:66:0x00be, B:69:0x00c8), top: B:108:0x007b }] */
    private com.mbridge.msdk.config.component.common.express.operator.parts.a b(String str, Object obj, List<Object> list) {
        double dDoubleValue;
        double dDoubleValue2;
        Object obj2;
        Object obj3;
        if (obj == null) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
        }
        try {
            dDoubleValue = obj instanceof Number ? ((Number) obj).doubleValue() : 0.0d;
            try {
                if ((obj instanceof String) && !TextUtils.isEmpty(obj.toString())) {
                    dDoubleValue = Double.parseDouble(obj.toString());
                }
                if (list == null || list.isEmpty()) {
                    dDoubleValue2 = 0.0d;
                    obj3 = null;
                } else {
                    obj3 = list.get(0);
                    try {
                        dDoubleValue2 = obj3 instanceof Number ? ((Number) obj3).doubleValue() : 0.0d;
                        try {
                            if ((obj3 instanceof String) && !TextUtils.isEmpty(obj3.toString())) {
                                dDoubleValue2 = Double.parseDouble(obj3.toString());
                            }
                        } catch (Exception e10) {
                            e = e10;
                            Exception exc = e;
                            obj2 = obj3;
                            e = exc;
                            q0.b("MathOperator", e.getMessage(), e);
                            obj3 = obj2;
                        }
                    } catch (Exception e11) {
                        e = e11;
                        dDoubleValue2 = 0.0d;
                    }
                }
            } catch (Exception e12) {
                e = e12;
                dDoubleValue2 = 0.0d;
                obj2 = null;
                q0.b("MathOperator", e.getMessage(), e);
                obj3 = obj2;
                switch (str) {
                    case "mathabs":
                        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(a(Math.abs(dDoubleValue)));
                    case "mathCeil":
                        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(a(Math.ceil(dDoubleValue)));
                    case "mathFloor":
                        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(a(Math.floor(dDoubleValue)));
                    case "mathRound":
                        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(a(Math.round(dDoubleValue)));
                    case "mathPow":
                        return obj3 != null ? com.mbridge.msdk.config.component.common.express.operator.parts.a.a(a(Math.pow(dDoubleValue, dDoubleValue2))) : com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
                    case "mathSqrt":
                        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(a(Math.sqrt(dDoubleValue)));
                    case "mathAtan2":
                        return obj3 != null ? com.mbridge.msdk.config.component.common.express.operator.parts.a.a(a(Math.atan2(dDoubleValue, dDoubleValue2))) : com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
                    case "randomNumber":
                        if (dDoubleValue2 > 0.0d) {
                            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Integer.valueOf((int) (Math.random() * ((double) ((int) Math.floor(dDoubleValue2))))));
                        }
                        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
                    default:
                        return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
                }
            }
        } catch (Exception e13) {
            e = e13;
            dDoubleValue = 0.0d;
            dDoubleValue2 = 0.0d;
        }
        try {
            switch (str) {
                case -696988180:
                    if (str.equals("randomNumber")) {
                    }
                    break;
                case 300433453:
                    if (str.equals("mathCeil")) {
                    }
                    break;
                case 300921928:
                    if (str.equals("mathSqrt")) {
                    }
                    break;
                case 722094698:
                    if (str.equals("mathAtan2")) {
                    }
                    break;
                case 726487524:
                    if (str.equals("mathFloor")) {
                    }
                    break;
                case 737664870:
                    if (str.equals("mathRound")) {
                    }
                    break;
                case 840988208:
                    if (str.equals("mathPow")) {
                    }
                    break;
                case 841004138:
                    if (str.equals("mathabs")) {
                    }
                    break;
                default:
                    break;
            }
            /*  JADX ERROR: Method code generation error
                java.lang.NullPointerException: Switch insn not found in header
                	at java.base/java.util.Objects.requireNonNull(Unknown Source)
                	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:320)
                	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                */
            /*
                Method dump skipped, instruction units count: 424
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.config.component.common.express.operator.k.b(java.lang.String, java.lang.Object, java.util.List):com.mbridge.msdk.config.component.common.express.operator.parts.a");
        }

        public com.mbridge.msdk.config.component.common.express.operator.parts.a a(String str, Object obj, List<Object> list) {
            if (TextUtils.isEmpty(str)) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
            }
            Iterator<String> it = f33049b.iterator();
            while (it.hasNext()) {
                if (str.contains(it.next())) {
                    return b(str, obj, list);
                }
            }
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
        }
    }
