package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionCopyToClipboard.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class DivActionCopyToClipboard implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f46121c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivActionCopyToClipboard> f46122d = new bk.p<ParsingEnvironment, JSONObject, DivActionCopyToClipboard>() { // from class: com.yandex.div2.DivActionCopyToClipboard$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivActionCopyToClipboard mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivActionCopyToClipboard.f46121c.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DivActionCopyToClipboardContent f46123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f46124b;

    /* JADX INFO: compiled from: DivActionCopyToClipboard.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivActionCopyToClipboard a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().f0().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public final boolean a(DivActionCopyToClipboard divActionCopyToClipboard, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divActionCopyToClipboard == null) {
            return false;
        }
        return this.f46123a.a(divActionCopyToClipboard.f46123a, expressionResolver, expressionResolver2);
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f46124b;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivActionCopyToClipboard.class).hashCode() + this.f46123a.hash();
        this.f46124b = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    public DivActionCopyToClipboard(DivActionCopyToClipboardContent divActionCopyToClipboardContent) {
        this.f46123a = divActionCopyToClipboardContent;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().f0().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
