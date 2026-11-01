package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivFixedLengthInputMaskTemplate.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class DivFixedLengthInputMaskTemplate implements JSONSerializable, JsonTemplate<DivFixedLengthInputMask> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f47171e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Expression<Boolean> f47172f = Expression.Companion.constant$default(Expression.Companion, Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivFixedLengthInputMaskTemplate> f47173g = new bk.p<ParsingEnvironment, JSONObject, DivFixedLengthInputMaskTemplate>() { // from class: com.yandex.div2.DivFixedLengthInputMaskTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivFixedLengthInputMaskTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new DivFixedLengthInputMaskTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<Expression<Boolean>> f47174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field<Expression<String>> f47175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field<List<PatternElementTemplate>> f47176c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field<String> f47177d;

    /* JADX INFO: compiled from: DivFixedLengthInputMaskTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DivFixedLengthInputMaskTemplate(Field<Expression<Boolean>> field, Field<Expression<String>> field2, Field<List<PatternElementTemplate>> field3, Field<String> field4) {
        this.f47174a = field;
        this.f47175b = field2;
        this.f47176c = field3;
        this.f47177d = field4;
    }

    /* JADX INFO: compiled from: DivFixedLengthInputMaskTemplate.kt */
    public static final class PatternElementTemplate implements JSONSerializable, JsonTemplate<DivFixedLengthInputMask.PatternElement> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f47178d = new a(null);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final Expression<String> f47179e = Expression.Companion.constant$default(Expression.Companion, "_", null, 2, null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final bk.p<ParsingEnvironment, JSONObject, PatternElementTemplate> f47180f = new bk.p<ParsingEnvironment, JSONObject, PatternElementTemplate>() { // from class: com.yandex.div2.DivFixedLengthInputMaskTemplate$PatternElementTemplate$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivFixedLengthInputMaskTemplate.PatternElementTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return new DivFixedLengthInputMaskTemplate.PatternElementTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Field<Expression<String>> f47181a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Field<Expression<String>> f47182b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Field<Expression<String>> f47183c;

        /* JADX INFO: compiled from: DivFixedLengthInputMaskTemplate.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(ck.i iVar) {
                this();
            }
        }

        public PatternElementTemplate(Field<Expression<String>> field, Field<Expression<String>> field2, Field<Expression<String>> field3) {
            this.f47181a = field;
            this.f47182b = field2;
            this.f47183c = field3;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return BuiltInParserKt.getBuiltInParserComponent().u3().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        public /* synthetic */ PatternElementTemplate(ParsingEnvironment parsingEnvironment, PatternElementTemplate patternElementTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
            this(parsingEnvironment, (i10 & 2) != 0 ? null : patternElementTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public PatternElementTemplate(ParsingEnvironment parsingEnvironment, PatternElementTemplate patternElementTemplate, boolean z10, JSONObject jSONObject) {
            Field.Companion companion = Field.Companion;
            this(companion.nullField(false), companion.nullField(false), companion.nullField(false));
            throw new UnsupportedOperationException("Do not use this constructor directly.");
        }
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().r3().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivFixedLengthInputMaskTemplate(ParsingEnvironment parsingEnvironment, DivFixedLengthInputMaskTemplate divFixedLengthInputMaskTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divFixedLengthInputMaskTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivFixedLengthInputMaskTemplate(ParsingEnvironment parsingEnvironment, DivFixedLengthInputMaskTemplate divFixedLengthInputMaskTemplate, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this((Field<Expression<Boolean>>) companion.nullField(false), (Field<Expression<String>>) companion.nullField(false), (Field<List<PatternElementTemplate>>) companion.nullField(false), (Field<String>) companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
