package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivLayoutProvider.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class DivLayoutProvider implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f48025d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivLayoutProvider> f48026e = new bk.p<ParsingEnvironment, JSONObject, DivLayoutProvider>() { // from class: com.yandex.div2.DivLayoutProvider$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivLayoutProvider mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivLayoutProvider.f48025d.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f48027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f48028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f48029c;

    /* JADX WARN: Multi-variable type inference failed */
    public DivLayoutProvider() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public DivLayoutProvider(String str, String str2) {
        this.f48027a = str;
        this.f48028b = str2;
    }

    public final boolean a(DivLayoutProvider divLayoutProvider, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return divLayoutProvider != null && ck.p.e(this.f48027a, divLayoutProvider.f48027a) && ck.p.e(this.f48028b, divLayoutProvider.f48028b);
    }

    /* JADX INFO: compiled from: DivLayoutProvider.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivLayoutProvider a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().P4().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f48029c;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivLayoutProvider.class).hashCode();
        String str = this.f48027a;
        int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
        String str2 = this.f48028b;
        int iHashCode3 = iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.f48029c = Integer.valueOf(iHashCode3);
        return iHashCode3;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().P4().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivLayoutProvider(String str, String str2, int i10, ck.i iVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2);
    }
}
