package com.yandex.div2;

import com.ironsource.C3702sd;

/* JADX INFO: compiled from: DivLineStyle.kt */
/* JADX INFO: loaded from: classes5.dex */
public enum DivLineStyle {
    NONE("none"),
    SINGLE(C3702sd.f30729d);

    private final String value;
    public static final a Converter = new a(null);
    public static final bk.l<DivLineStyle, String> TO_STRING = new bk.l<DivLineStyle, String>() { // from class: com.yandex.div2.DivLineStyle$Converter$TO_STRING$1
        @Override // bk.l
        public final String invoke(DivLineStyle divLineStyle) {
            return DivLineStyle.Converter.b(divLineStyle);
        }
    };
    public static final bk.l<String, DivLineStyle> FROM_STRING = new bk.l<String, DivLineStyle>() { // from class: com.yandex.div2.DivLineStyle$Converter$FROM_STRING$1
        @Override // bk.l
        public final DivLineStyle invoke(String str) {
            return DivLineStyle.Converter.a(str);
        }
    };

    /* JADX INFO: compiled from: DivLineStyle.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivLineStyle a(String str) {
            DivLineStyle divLineStyle = DivLineStyle.NONE;
            if (ck.p.e(str, divLineStyle.value)) {
                return divLineStyle;
            }
            DivLineStyle divLineStyle2 = DivLineStyle.SINGLE;
            if (ck.p.e(str, divLineStyle2.value)) {
                return divLineStyle2;
            }
            return null;
        }

        public final String b(DivLineStyle divLineStyle) {
            return divLineStyle.value;
        }
    }

    DivLineStyle(String str) {
        this.value = str;
    }
}
