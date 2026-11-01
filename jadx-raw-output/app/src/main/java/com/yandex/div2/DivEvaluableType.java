package com.yandex.div2;

import androidx.constraintlayout.core.motion.utils.TypedValues;

/* JADX INFO: compiled from: DivEvaluableType.kt */
/* JADX INFO: loaded from: classes5.dex */
public enum DivEvaluableType {
    STRING(TypedValues.Custom.S_STRING),
    INTEGER(TypedValues.Custom.S_INT),
    NUMBER("number"),
    BOOLEAN(TypedValues.Custom.S_BOOLEAN),
    DATETIME("datetime"),
    COLOR("color"),
    URL("url"),
    DICT("dict"),
    ARRAY("array");

    private final String value;
    public static final a Converter = new a(null);
    public static final bk.l<DivEvaluableType, String> TO_STRING = new bk.l<DivEvaluableType, String>() { // from class: com.yandex.div2.DivEvaluableType$Converter$TO_STRING$1
        @Override // bk.l
        public final String invoke(DivEvaluableType divEvaluableType) {
            return DivEvaluableType.Converter.b(divEvaluableType);
        }
    };
    public static final bk.l<String, DivEvaluableType> FROM_STRING = new bk.l<String, DivEvaluableType>() { // from class: com.yandex.div2.DivEvaluableType$Converter$FROM_STRING$1
        @Override // bk.l
        public final DivEvaluableType invoke(String str) {
            return DivEvaluableType.Converter.a(str);
        }
    };

    /* JADX INFO: compiled from: DivEvaluableType.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivEvaluableType a(String str) {
            DivEvaluableType divEvaluableType = DivEvaluableType.STRING;
            if (ck.p.e(str, divEvaluableType.value)) {
                return divEvaluableType;
            }
            DivEvaluableType divEvaluableType2 = DivEvaluableType.INTEGER;
            if (ck.p.e(str, divEvaluableType2.value)) {
                return divEvaluableType2;
            }
            DivEvaluableType divEvaluableType3 = DivEvaluableType.NUMBER;
            if (ck.p.e(str, divEvaluableType3.value)) {
                return divEvaluableType3;
            }
            DivEvaluableType divEvaluableType4 = DivEvaluableType.BOOLEAN;
            if (ck.p.e(str, divEvaluableType4.value)) {
                return divEvaluableType4;
            }
            DivEvaluableType divEvaluableType5 = DivEvaluableType.DATETIME;
            if (ck.p.e(str, divEvaluableType5.value)) {
                return divEvaluableType5;
            }
            DivEvaluableType divEvaluableType6 = DivEvaluableType.COLOR;
            if (ck.p.e(str, divEvaluableType6.value)) {
                return divEvaluableType6;
            }
            DivEvaluableType divEvaluableType7 = DivEvaluableType.URL;
            if (ck.p.e(str, divEvaluableType7.value)) {
                return divEvaluableType7;
            }
            DivEvaluableType divEvaluableType8 = DivEvaluableType.DICT;
            if (ck.p.e(str, divEvaluableType8.value)) {
                return divEvaluableType8;
            }
            DivEvaluableType divEvaluableType9 = DivEvaluableType.ARRAY;
            if (ck.p.e(str, divEvaluableType9.value)) {
                return divEvaluableType9;
            }
            return null;
        }

        public final String b(DivEvaluableType divEvaluableType) {
            return divEvaluableType.value;
        }
    }

    DivEvaluableType(String str) {
        this.value = str;
    }
}
