package org.fourthline.cling.model.types;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.net.URI;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import yn.a0;
import yn.b0;
import yn.c0;
import yn.d0;
import yn.e;
import yn.i;
import yn.k;
import yn.l;
import yn.n;
import yn.t;
import yn.v;

/* JADX INFO: loaded from: classes8.dex */
public interface Datatype<V> {

    public enum Builtin {
        UI1("ui1", new c0()),
        UI2("ui2", new d0()),
        UI4("ui4", new b0()),
        I1("i1", new n(1)),
        I2("i2", new n(2)),
        I2_SHORT("i2", new t()),
        I4("i4", new n(4)),
        INT(ImpressionLog.f43647w, new n(4)),
        R4("r4", new l()),
        R8("r8", new k()),
        NUMBER("number", new k()),
        FIXED144("fixed.14.4", new k()),
        FLOAT(TypedValues.Custom.S_FLOAT, new k()),
        CHAR("char", new e()),
        STRING(TypedValues.Custom.S_STRING, new v()),
        DATE("date", new i(new String[]{"yyyy-MM-dd"}, "yyyy-MM-dd")),
        DATETIME("dateTime", new i(new String[]{"yyyy-MM-dd", "yyyy-MM-dd'T'HH:mm:ss"}, "yyyy-MM-dd'T'HH:mm:ss")),
        DATETIME_TZ("dateTime.tz", new i(new String[]{"yyyy-MM-dd", "yyyy-MM-dd'T'HH:mm:ss", "yyyy-MM-dd'T'HH:mm:ssZ"}, "yyyy-MM-dd'T'HH:mm:ssZ")),
        TIME("time", new i(new String[]{"HH:mm:ss"}, "HH:mm:ss")),
        TIME_TZ("time.tz", new i(new String[]{"HH:mm:ssZ", "HH:mm:ss"}, "HH:mm:ssZ")),
        BOOLEAN(TypedValues.Custom.S_BOOLEAN, new yn.c()),
        BIN_BASE64("bin.base64", new yn.a()),
        BIN_HEX("bin.hex", new yn.b()),
        URI(NotificationCompat.MessagingStyle.Message.KEY_DATA_URI, new a0()),
        UUID(CommonUrlParts.UUID, new v());


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static Map<String, Builtin> f65793b = new HashMap<String, Builtin>() { // from class: org.fourthline.cling.model.types.Datatype.Builtin.1
            {
                for (Builtin builtin : Builtin.values()) {
                    String descriptorName = builtin.getDescriptorName();
                    Locale locale = Locale.ROOT;
                    if (!containsKey(descriptorName.toLowerCase(locale))) {
                        put(builtin.getDescriptorName().toLowerCase(locale), builtin);
                    }
                }
            }
        };
        private Datatype datatype;
        private String descriptorName;

        public static Builtin getByDescriptorName(String str) {
            if (str == null) {
                return null;
            }
            return f65793b.get(str.toLowerCase(Locale.ROOT));
        }

        public static boolean isNumeric(Builtin builtin) {
            return builtin != null && (builtin.equals(UI1) || builtin.equals(UI2) || builtin.equals(UI4) || builtin.equals(I1) || builtin.equals(I2) || builtin.equals(I4) || builtin.equals(INT));
        }

        public Datatype getDatatype() {
            return this.datatype;
        }

        public String getDescriptorName() {
            return this.descriptorName;
        }

        Builtin(String str, a aVar) {
            aVar.g(this);
            this.descriptorName = str;
            this.datatype = aVar;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'BOOLEAN' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class Default {
        public static final Default BOOLEAN;
        public static final Default BOOLEAN_PRIMITIVE;
        public static final Default BYTES;
        public static final Default CALENDAR;
        public static final Default CHAR;
        public static final Default CHAR_PRIMITIVE;
        public static final Default DOUBLE;
        public static final Default DOUBLE_PRIMTIIVE;
        public static final Default FLOAT;
        public static final Default FLOAT_PRIMITIVE;
        public static final Default INTEGER;
        public static final Default INTEGER_PRIMITIVE;
        public static final Default SHORT;
        public static final Default SHORT_PRIMITIVE;
        public static final Default STRING;
        public static final Default UNSIGNED_INTEGER_FOUR_BYTES;
        public static final Default UNSIGNED_INTEGER_ONE_BYTE;
        public static final Default UNSIGNED_INTEGER_TWO_BYTES;
        public static final Default URI;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Default[] f65795b;
        private Builtin builtinType;
        private Class javaType;

        static {
            Builtin builtin = Builtin.BOOLEAN;
            Default r10 = new Default("BOOLEAN", 0, Boolean.class, builtin);
            BOOLEAN = r10;
            Default r11 = new Default("BOOLEAN_PRIMITIVE", 1, Boolean.TYPE, builtin);
            BOOLEAN_PRIMITIVE = r11;
            Builtin builtin2 = Builtin.I2_SHORT;
            Default r12 = new Default("SHORT", 2, Short.class, builtin2);
            SHORT = r12;
            Default r13 = new Default("SHORT_PRIMITIVE", 3, Short.TYPE, builtin2);
            SHORT_PRIMITIVE = r13;
            Builtin builtin3 = Builtin.I4;
            Default r14 = new Default("INTEGER", 4, Integer.class, builtin3);
            INTEGER = r14;
            Default r15 = new Default("INTEGER_PRIMITIVE", 5, Integer.TYPE, builtin3);
            INTEGER_PRIMITIVE = r15;
            Default r16 = new Default("UNSIGNED_INTEGER_ONE_BYTE", 6, c.class, Builtin.UI1);
            UNSIGNED_INTEGER_ONE_BYTE = r16;
            Default r17 = new Default("UNSIGNED_INTEGER_TWO_BYTES", 7, d.class, Builtin.UI2);
            UNSIGNED_INTEGER_TWO_BYTES = r17;
            Default r18 = new Default("UNSIGNED_INTEGER_FOUR_BYTES", 8, b.class, Builtin.UI4);
            UNSIGNED_INTEGER_FOUR_BYTES = r18;
            Builtin builtin4 = Builtin.R4;
            Default r19 = new Default("FLOAT", 9, Float.class, builtin4);
            FLOAT = r19;
            Default r110 = new Default("FLOAT_PRIMITIVE", 10, Float.TYPE, builtin4);
            FLOAT_PRIMITIVE = r110;
            Builtin builtin5 = Builtin.FLOAT;
            Default r20 = new Default("DOUBLE", 11, Double.class, builtin5);
            DOUBLE = r20;
            Default r21 = new Default("DOUBLE_PRIMTIIVE", 12, Double.TYPE, builtin5);
            DOUBLE_PRIMTIIVE = r21;
            Builtin builtin6 = Builtin.CHAR;
            Default r22 = new Default("CHAR", 13, Character.class, builtin6);
            CHAR = r22;
            Default r23 = new Default("CHAR_PRIMITIVE", 14, Character.TYPE, builtin6);
            CHAR_PRIMITIVE = r23;
            Default r24 = new Default("STRING", 15, String.class, Builtin.STRING);
            STRING = r24;
            Default r25 = new Default("CALENDAR", 16, Calendar.class, Builtin.DATETIME);
            CALENDAR = r25;
            Default r26 = new Default("BYTES", 17, byte[].class, Builtin.BIN_BASE64);
            BYTES = r26;
            Default r27 = new Default("URI", 18, URI.class, Builtin.URI);
            URI = r27;
            f65795b = new Default[]{r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r110, r20, r21, r22, r23, r24, r25, r26, r27};
        }

        public static Default valueOf(String str) {
            return (Default) Enum.valueOf(Default.class, str);
        }

        public static Default[] values() {
            return (Default[]) f65795b.clone();
        }

        public Builtin getBuiltinType() {
            return this.builtinType;
        }

        public Class getJavaType() {
            return this.javaType;
        }

        @Override // java.lang.Enum
        public String toString() {
            return getJavaType() + " => " + getBuiltinType();
        }

        public Default(String str, int i10, Class cls, Builtin builtin) {
            super(str, i10);
            this.javaType = cls;
            this.builtinType = builtin;
        }

        public static Default getByJavaType(Class cls) {
            for (Default r10 : values()) {
                if (r10.getJavaType().equals(cls)) {
                    return r10;
                }
            }
            return null;
        }
    }

    String a();

    Builtin b();

    V c(String str) throws InvalidValueException;

    boolean d(Class cls);

    String e(V v10) throws InvalidValueException;

    boolean isValid(V v10);
}
