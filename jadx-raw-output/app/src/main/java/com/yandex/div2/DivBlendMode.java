package com.yandex.div2;

/* JADX INFO: compiled from: DivBlendMode.kt */
/* JADX INFO: loaded from: classes5.dex */
public enum DivBlendMode {
    SOURCE_IN("source_in"),
    SOURCE_ATOP("source_atop"),
    DARKEN("darken"),
    LIGHTEN("lighten"),
    MULTIPLY("multiply"),
    SCREEN("screen");

    private final String value;
    public static final a Converter = new a(null);
    public static final bk.l<DivBlendMode, String> TO_STRING = new bk.l<DivBlendMode, String>() { // from class: com.yandex.div2.DivBlendMode$Converter$TO_STRING$1
        @Override // bk.l
        public final String invoke(DivBlendMode divBlendMode) {
            return DivBlendMode.Converter.b(divBlendMode);
        }
    };
    public static final bk.l<String, DivBlendMode> FROM_STRING = new bk.l<String, DivBlendMode>() { // from class: com.yandex.div2.DivBlendMode$Converter$FROM_STRING$1
        @Override // bk.l
        public final DivBlendMode invoke(String str) {
            return DivBlendMode.Converter.a(str);
        }
    };

    /* JADX INFO: compiled from: DivBlendMode.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivBlendMode a(String str) {
            DivBlendMode divBlendMode = DivBlendMode.SOURCE_IN;
            if (ck.p.e(str, divBlendMode.value)) {
                return divBlendMode;
            }
            DivBlendMode divBlendMode2 = DivBlendMode.SOURCE_ATOP;
            if (ck.p.e(str, divBlendMode2.value)) {
                return divBlendMode2;
            }
            DivBlendMode divBlendMode3 = DivBlendMode.DARKEN;
            if (ck.p.e(str, divBlendMode3.value)) {
                return divBlendMode3;
            }
            DivBlendMode divBlendMode4 = DivBlendMode.LIGHTEN;
            if (ck.p.e(str, divBlendMode4.value)) {
                return divBlendMode4;
            }
            DivBlendMode divBlendMode5 = DivBlendMode.MULTIPLY;
            if (ck.p.e(str, divBlendMode5.value)) {
                return divBlendMode5;
            }
            DivBlendMode divBlendMode6 = DivBlendMode.SCREEN;
            if (ck.p.e(str, divBlendMode6.value)) {
                return divBlendMode6;
            }
            return null;
        }

        public final String b(DivBlendMode divBlendMode) {
            return divBlendMode.value;
        }
    }

    DivBlendMode(String str) {
        this.value = str;
    }
}
