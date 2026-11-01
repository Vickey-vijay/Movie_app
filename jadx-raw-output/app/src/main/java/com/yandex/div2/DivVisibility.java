package com.yandex.div2;

import io.bidmachine.iab.vast.tags.VastAttributes;

/* JADX INFO: compiled from: DivVisibility.kt */
/* JADX INFO: loaded from: classes4.dex */
public enum DivVisibility {
    VISIBLE(VastAttributes.VISIBLE),
    INVISIBLE("invisible"),
    GONE("gone");

    private final String value;
    public static final a Converter = new a(null);
    public static final bk.l<DivVisibility, String> TO_STRING = new bk.l<DivVisibility, String>() { // from class: com.yandex.div2.DivVisibility$Converter$TO_STRING$1
        @Override // bk.l
        public final String invoke(DivVisibility divVisibility) {
            return DivVisibility.Converter.b(divVisibility);
        }
    };
    public static final bk.l<String, DivVisibility> FROM_STRING = new bk.l<String, DivVisibility>() { // from class: com.yandex.div2.DivVisibility$Converter$FROM_STRING$1
        @Override // bk.l
        public final DivVisibility invoke(String str) {
            return DivVisibility.Converter.a(str);
        }
    };

    /* JADX INFO: compiled from: DivVisibility.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivVisibility a(String str) {
            DivVisibility divVisibility = DivVisibility.VISIBLE;
            if (ck.p.e(str, divVisibility.value)) {
                return divVisibility;
            }
            DivVisibility divVisibility2 = DivVisibility.INVISIBLE;
            if (ck.p.e(str, divVisibility2.value)) {
                return divVisibility2;
            }
            DivVisibility divVisibility3 = DivVisibility.GONE;
            if (ck.p.e(str, divVisibility3.value)) {
                return divVisibility3;
            }
            return null;
        }

        public final String b(DivVisibility divVisibility) {
            return divVisibility.value;
        }
    }

    DivVisibility(String str) {
        this.value = str;
    }
}
