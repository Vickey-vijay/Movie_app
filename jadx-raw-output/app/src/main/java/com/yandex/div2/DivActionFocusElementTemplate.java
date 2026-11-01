package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionFocusElementTemplate.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class DivActionFocusElementTemplate implements JSONSerializable, JsonTemplate<DivActionFocusElement> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f46163b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivActionFocusElementTemplate> f46164c = new bk.p<ParsingEnvironment, JSONObject, DivActionFocusElementTemplate>() { // from class: com.yandex.div2.DivActionFocusElementTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivActionFocusElementTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new DivActionFocusElementTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<Expression<String>> f46165a;

    /* JADX INFO: compiled from: DivActionFocusElementTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DivActionFocusElementTemplate(Field<Expression<String>> field) {
        this.f46165a = field;
    }

    public /* synthetic */ DivActionFocusElementTemplate(ParsingEnvironment parsingEnvironment, DivActionFocusElementTemplate divActionFocusElementTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divActionFocusElementTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().p0().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public DivActionFocusElementTemplate(ParsingEnvironment parsingEnvironment, DivActionFocusElementTemplate divActionFocusElementTemplate, boolean z10, JSONObject jSONObject) {
        this(Field.Companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
