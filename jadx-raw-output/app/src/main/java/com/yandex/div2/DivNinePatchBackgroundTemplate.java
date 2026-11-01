package com.yandex.div2;

import android.net.Uri;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivNinePatchBackgroundTemplate.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class DivNinePatchBackgroundTemplate implements JSONSerializable, JsonTemplate<DivNinePatchBackground> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f48080c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivNinePatchBackgroundTemplate> f48081d = new bk.p<ParsingEnvironment, JSONObject, DivNinePatchBackgroundTemplate>() { // from class: com.yandex.div2.DivNinePatchBackgroundTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivNinePatchBackgroundTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new DivNinePatchBackgroundTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<Expression<Uri>> f48082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field<DivAbsoluteEdgeInsetsTemplate> f48083b;

    /* JADX INFO: compiled from: DivNinePatchBackgroundTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DivNinePatchBackgroundTemplate(Field<Expression<Uri>> field, Field<DivAbsoluteEdgeInsetsTemplate> field2) {
        this.f48082a = field;
        this.f48083b = field2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().f5().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivNinePatchBackgroundTemplate(ParsingEnvironment parsingEnvironment, DivNinePatchBackgroundTemplate divNinePatchBackgroundTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divNinePatchBackgroundTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivNinePatchBackgroundTemplate(ParsingEnvironment parsingEnvironment, DivNinePatchBackgroundTemplate divNinePatchBackgroundTemplate, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
