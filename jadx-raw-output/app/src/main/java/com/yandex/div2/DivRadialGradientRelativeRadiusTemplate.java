package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivRadialGradientRelativeRadiusTemplate.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class DivRadialGradientRelativeRadiusTemplate implements JSONSerializable, JsonTemplate<DivRadialGradientRelativeRadius> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f48493b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivRadialGradientRelativeRadiusTemplate> f48494c = new bk.p<ParsingEnvironment, JSONObject, DivRadialGradientRelativeRadiusTemplate>() { // from class: com.yandex.div2.DivRadialGradientRelativeRadiusTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivRadialGradientRelativeRadiusTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new DivRadialGradientRelativeRadiusTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<Expression<DivRadialGradientRelativeRadius.Value>> f48495a;

    /* JADX INFO: compiled from: DivRadialGradientRelativeRadiusTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DivRadialGradientRelativeRadiusTemplate(Field<Expression<DivRadialGradientRelativeRadius.Value>> field) {
        this.f48495a = field;
    }

    public /* synthetic */ DivRadialGradientRelativeRadiusTemplate(ParsingEnvironment parsingEnvironment, DivRadialGradientRelativeRadiusTemplate divRadialGradientRelativeRadiusTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divRadialGradientRelativeRadiusTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().v6().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public DivRadialGradientRelativeRadiusTemplate(ParsingEnvironment parsingEnvironment, DivRadialGradientRelativeRadiusTemplate divRadialGradientRelativeRadiusTemplate, boolean z10, JSONObject jSONObject) {
        this(Field.Companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
