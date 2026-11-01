package com.yandex.div2;

/* JADX INFO: compiled from: DivFontWeight.kt */
/* JADX INFO: loaded from: classes9.dex */
public enum DivFontWeight {
    LIGHT("light"),
    MEDIUM("medium"),
    REGULAR("regular"),
    BOLD("bold");

    private final String value;
    public static final a Converter = new a(null);
    public static final bk.l<DivFontWeight, String> TO_STRING = new bk.l<DivFontWeight, String>() { // from class: com.yandex.div2.DivFontWeight$Converter$TO_STRING$1
        @Override // bk.l
        public final String invoke(DivFontWeight divFontWeight) {
            return DivFontWeight.Converter.b(divFontWeight);
        }
    };
    public static final bk.l<String, DivFontWeight> FROM_STRING = new bk.l<String, DivFontWeight>() { // from class: com.yandex.div2.DivFontWeight$Converter$FROM_STRING$1
        @Override // bk.l
        public final DivFontWeight invoke(String str) {
            return DivFontWeight.Converter.a(str);
        }
    };

    /* JADX INFO: compiled from: DivFontWeight.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivFontWeight a(String str) {
            DivFontWeight divFontWeight = DivFontWeight.LIGHT;
            if (ck.p.e(str, divFontWeight.value)) {
                return divFontWeight;
            }
            DivFontWeight divFontWeight2 = DivFontWeight.MEDIUM;
            if (ck.p.e(str, divFontWeight2.value)) {
                return divFontWeight2;
            }
            DivFontWeight divFontWeight3 = DivFontWeight.REGULAR;
            if (ck.p.e(str, divFontWeight3.value)) {
                return divFontWeight3;
            }
            DivFontWeight divFontWeight4 = DivFontWeight.BOLD;
            if (ck.p.e(str, divFontWeight4.value)) {
                return divFontWeight4;
            }
            return null;
        }

        public final String b(DivFontWeight divFontWeight) {
            return divFontWeight.value;
        }
    }

    DivFontWeight(String str) {
        this.value = str;
    }
}
