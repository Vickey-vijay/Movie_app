package com.yandex.div2;

/* JADX INFO: compiled from: DivSizeUnit.kt */
/* JADX INFO: loaded from: classes6.dex */
public enum DivSizeUnit {
    DP("dp"),
    SP("sp"),
    PX("px");

    private final String value;
    public static final a Converter = new a(null);
    public static final bk.l<DivSizeUnit, String> TO_STRING = new bk.l<DivSizeUnit, String>() { // from class: com.yandex.div2.DivSizeUnit$Converter$TO_STRING$1
        @Override // bk.l
        public final String invoke(DivSizeUnit divSizeUnit) {
            return DivSizeUnit.Converter.b(divSizeUnit);
        }
    };
    public static final bk.l<String, DivSizeUnit> FROM_STRING = new bk.l<String, DivSizeUnit>() { // from class: com.yandex.div2.DivSizeUnit$Converter$FROM_STRING$1
        @Override // bk.l
        public final DivSizeUnit invoke(String str) {
            return DivSizeUnit.Converter.a(str);
        }
    };

    /* JADX INFO: compiled from: DivSizeUnit.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivSizeUnit a(String str) {
            DivSizeUnit divSizeUnit = DivSizeUnit.DP;
            if (ck.p.e(str, divSizeUnit.value)) {
                return divSizeUnit;
            }
            DivSizeUnit divSizeUnit2 = DivSizeUnit.SP;
            if (ck.p.e(str, divSizeUnit2.value)) {
                return divSizeUnit2;
            }
            DivSizeUnit divSizeUnit3 = DivSizeUnit.PX;
            if (ck.p.e(str, divSizeUnit3.value)) {
                return divSizeUnit3;
            }
            return null;
        }

        public final String b(DivSizeUnit divSizeUnit) {
            return divSizeUnit.value;
        }
    }

    DivSizeUnit(String str) {
        this.value = str;
    }
}
