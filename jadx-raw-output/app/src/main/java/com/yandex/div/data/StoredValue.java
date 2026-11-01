package com.yandex.div.data;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import ck.i;
import ck.p;
import com.yandex.div.evaluable.types.Color;
import com.yandex.div.evaluable.types.Url;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: StoredValue.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class StoredValue {

    /* JADX INFO: compiled from: StoredValue.kt */
    public static final class ArrayStoredValue extends StoredValue {
        private final String name;
        private final JSONArray value;

        public ArrayStoredValue(String str, JSONArray jSONArray) {
            super(null);
            this.name = str;
            this.value = jSONArray;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ArrayStoredValue)) {
                return false;
            }
            ArrayStoredValue arrayStoredValue = (ArrayStoredValue) obj;
            return p.e(this.name, arrayStoredValue.name) && p.e(this.value, arrayStoredValue.value);
        }

        public int hashCode() {
            return (this.name.hashCode() * 31) + this.value.hashCode();
        }

        public String toString() {
            return "ArrayStoredValue(name=" + this.name + ", value=" + this.value + ')';
        }

        @Override // com.yandex.div.data.StoredValue
        public String getName() {
            return this.name;
        }

        @Override // com.yandex.div.data.StoredValue
        public final JSONArray getValue() {
            return this.value;
        }
    }

    /* JADX INFO: compiled from: StoredValue.kt */
    public static final class BooleanStoredValue extends StoredValue {
        private final String name;
        private final boolean value;

        public BooleanStoredValue(String str, boolean z10) {
            super(null);
            this.name = str;
            this.value = z10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BooleanStoredValue)) {
                return false;
            }
            BooleanStoredValue booleanStoredValue = (BooleanStoredValue) obj;
            return p.e(this.name, booleanStoredValue.name) && this.value == booleanStoredValue.value;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v3, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [int] */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v3 */
        public int hashCode() {
            int iHashCode = this.name.hashCode() * 31;
            boolean z10 = this.value;
            ?? r10 = z10;
            if (z10) {
                r10 = 1;
            }
            return iHashCode + r10;
        }

        public String toString() {
            return "BooleanStoredValue(name=" + this.name + ", value=" + this.value + ')';
        }

        @Override // com.yandex.div.data.StoredValue
        public String getName() {
            return this.name;
        }

        public final boolean getValue() {
            return this.value;
        }
    }

    /* JADX INFO: compiled from: StoredValue.kt */
    public static final class ColorStoredValue extends StoredValue {
        private final String name;
        private final int value;

        private ColorStoredValue(String str, int i10) {
            super(null);
            this.name = str;
            this.value = i10;
        }

        public /* synthetic */ ColorStoredValue(String str, int i10, i iVar) {
            this(str, i10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ColorStoredValue)) {
                return false;
            }
            ColorStoredValue colorStoredValue = (ColorStoredValue) obj;
            return p.e(this.name, colorStoredValue.name) && Color.m3371equalsimpl0(this.value, colorStoredValue.value);
        }

        public int hashCode() {
            return (this.name.hashCode() * 31) + Color.m3373hashCodeimpl(this.value);
        }

        public String toString() {
            return "ColorStoredValue(name=" + this.name + ", value=" + ((Object) Color.m3375toStringimpl(this.value)) + ')';
        }

        @Override // com.yandex.div.data.StoredValue
        public String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: getValue-WpymAT4, reason: not valid java name */
        public final int m3319getValueWpymAT4() {
            return this.value;
        }
    }

    /* JADX INFO: compiled from: StoredValue.kt */
    public static final class DictStoredValue extends StoredValue {
        private final String name;
        private final JSONObject value;

        public DictStoredValue(String str, JSONObject jSONObject) {
            super(null);
            this.name = str;
            this.value = jSONObject;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DictStoredValue)) {
                return false;
            }
            DictStoredValue dictStoredValue = (DictStoredValue) obj;
            return p.e(this.name, dictStoredValue.name) && p.e(this.value, dictStoredValue.value);
        }

        public int hashCode() {
            return (this.name.hashCode() * 31) + this.value.hashCode();
        }

        public String toString() {
            return "DictStoredValue(name=" + this.name + ", value=" + this.value + ')';
        }

        @Override // com.yandex.div.data.StoredValue
        public String getName() {
            return this.name;
        }

        @Override // com.yandex.div.data.StoredValue
        public final JSONObject getValue() {
            return this.value;
        }
    }

    /* JADX INFO: compiled from: StoredValue.kt */
    public static final class DoubleStoredValue extends StoredValue {
        private final String name;
        private final double value;

        public DoubleStoredValue(String str, double d10) {
            super(null);
            this.name = str;
            this.value = d10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DoubleStoredValue)) {
                return false;
            }
            DoubleStoredValue doubleStoredValue = (DoubleStoredValue) obj;
            return p.e(this.name, doubleStoredValue.name) && Double.compare(this.value, doubleStoredValue.value) == 0;
        }

        public int hashCode() {
            return (this.name.hashCode() * 31) + Double.hashCode(this.value);
        }

        public String toString() {
            return "DoubleStoredValue(name=" + this.name + ", value=" + this.value + ')';
        }

        @Override // com.yandex.div.data.StoredValue
        public String getName() {
            return this.name;
        }

        public final double getValue() {
            return this.value;
        }
    }

    /* JADX INFO: compiled from: StoredValue.kt */
    public static final class IntegerStoredValue extends StoredValue {
        private final String name;
        private final long value;

        public IntegerStoredValue(String str, long j10) {
            super(null);
            this.name = str;
            this.value = j10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IntegerStoredValue)) {
                return false;
            }
            IntegerStoredValue integerStoredValue = (IntegerStoredValue) obj;
            return p.e(this.name, integerStoredValue.name) && this.value == integerStoredValue.value;
        }

        public int hashCode() {
            return (this.name.hashCode() * 31) + Long.hashCode(this.value);
        }

        public String toString() {
            return "IntegerStoredValue(name=" + this.name + ", value=" + this.value + ')';
        }

        @Override // com.yandex.div.data.StoredValue
        public String getName() {
            return this.name;
        }

        public final long getValue() {
            return this.value;
        }
    }

    /* JADX INFO: compiled from: StoredValue.kt */
    public static final class StringStoredValue extends StoredValue {
        private final String name;
        private final String value;

        public StringStoredValue(String str, String str2) {
            super(null);
            this.name = str;
            this.value = str2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StringStoredValue)) {
                return false;
            }
            StringStoredValue stringStoredValue = (StringStoredValue) obj;
            return p.e(this.name, stringStoredValue.name) && p.e(this.value, stringStoredValue.value);
        }

        public int hashCode() {
            return (this.name.hashCode() * 31) + this.value.hashCode();
        }

        public String toString() {
            return "StringStoredValue(name=" + this.name + ", value=" + this.value + ')';
        }

        @Override // com.yandex.div.data.StoredValue
        public String getName() {
            return this.name;
        }

        @Override // com.yandex.div.data.StoredValue
        public final String getValue() {
            return this.value;
        }
    }

    /* JADX INFO: compiled from: StoredValue.kt */
    public enum Type {
        STRING(TypedValues.Custom.S_STRING),
        INTEGER(TypedValues.Custom.S_INT),
        BOOLEAN(TypedValues.Custom.S_BOOLEAN),
        NUMBER("number"),
        COLOR("color"),
        URL("url"),
        ARRAY("array"),
        DICT("dict");

        public static final Converter Converter = new Converter(null);
        private final String value;

        /* JADX INFO: compiled from: StoredValue.kt */
        public static final class Converter {
            private Converter() {
            }

            public /* synthetic */ Converter(i iVar) {
                this();
            }

            public final Type fromString(String str) {
                Type type = Type.STRING;
                if (p.e(str, type.value)) {
                    return type;
                }
                Type type2 = Type.INTEGER;
                if (p.e(str, type2.value)) {
                    return type2;
                }
                Type type3 = Type.BOOLEAN;
                if (p.e(str, type3.value)) {
                    return type3;
                }
                Type type4 = Type.NUMBER;
                if (p.e(str, type4.value)) {
                    return type4;
                }
                Type type5 = Type.COLOR;
                if (p.e(str, type5.value)) {
                    return type5;
                }
                Type type6 = Type.URL;
                if (p.e(str, type6.value)) {
                    return type6;
                }
                Type type7 = Type.ARRAY;
                if (p.e(str, type7.value)) {
                    return type7;
                }
                Type type8 = Type.DICT;
                if (p.e(str, type8.value)) {
                    return type8;
                }
                return null;
            }

            public final String toString(Type type) {
                return type.value;
            }
        }

        Type(String str) {
            this.value = str;
        }
    }

    /* JADX INFO: compiled from: StoredValue.kt */
    public static final class UrlStoredValue extends StoredValue {
        private final String name;
        private final String value;

        private UrlStoredValue(String str, String str2) {
            super(null);
            this.name = str;
            this.value = str2;
        }

        public /* synthetic */ UrlStoredValue(String str, String str2, i iVar) {
            this(str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UrlStoredValue)) {
                return false;
            }
            UrlStoredValue urlStoredValue = (UrlStoredValue) obj;
            return p.e(this.name, urlStoredValue.name) && Url.m3382equalsimpl0(this.value, urlStoredValue.value);
        }

        public int hashCode() {
            return (this.name.hashCode() * 31) + Url.m3383hashCodeimpl(this.value);
        }

        public String toString() {
            return "UrlStoredValue(name=" + this.name + ", value=" + ((Object) Url.m3384toStringimpl(this.value)) + ')';
        }

        @Override // com.yandex.div.data.StoredValue
        public String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: getValue-OXPJC6E, reason: not valid java name */
        public final String m3320getValueOXPJC6E() {
            return this.value;
        }
    }

    private StoredValue() {
    }

    public /* synthetic */ StoredValue(i iVar) {
        this();
    }

    public abstract String getName();

    public final Type getType() {
        if (this instanceof StringStoredValue) {
            return Type.STRING;
        }
        if (this instanceof IntegerStoredValue) {
            return Type.INTEGER;
        }
        if (this instanceof BooleanStoredValue) {
            return Type.BOOLEAN;
        }
        if (this instanceof DoubleStoredValue) {
            return Type.NUMBER;
        }
        if (this instanceof ColorStoredValue) {
            return Type.COLOR;
        }
        if (this instanceof UrlStoredValue) {
            return Type.URL;
        }
        if (this instanceof ArrayStoredValue) {
            return Type.ARRAY;
        }
        if (this instanceof DictStoredValue) {
            return Type.DICT;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final Object getValue() {
        if (this instanceof StringStoredValue) {
            return ((StringStoredValue) this).getValue();
        }
        if (this instanceof IntegerStoredValue) {
            return Long.valueOf(((IntegerStoredValue) this).getValue());
        }
        if (this instanceof BooleanStoredValue) {
            return Boolean.valueOf(((BooleanStoredValue) this).getValue());
        }
        if (this instanceof DoubleStoredValue) {
            return Double.valueOf(((DoubleStoredValue) this).getValue());
        }
        if (this instanceof ColorStoredValue) {
            return Color.m3368boximpl(((ColorStoredValue) this).m3319getValueWpymAT4());
        }
        if (this instanceof UrlStoredValue) {
            return Url.m3379boximpl(((UrlStoredValue) this).m3320getValueOXPJC6E());
        }
        if (this instanceof ArrayStoredValue) {
            return ((ArrayStoredValue) this).getValue();
        }
        if (this instanceof DictStoredValue) {
            return ((DictStoredValue) this).getValue();
        }
        throw new NoWhenBranchMatchedException();
    }
}
