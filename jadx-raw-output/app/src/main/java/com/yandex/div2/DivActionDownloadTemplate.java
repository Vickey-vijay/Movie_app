package com.yandex.div2;

import android.net.Uri;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionDownloadTemplate.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DivActionDownloadTemplate implements JSONSerializable, JsonTemplate<DivActionDownload> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f46154d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivActionDownloadTemplate> f46155e = new bk.p<ParsingEnvironment, JSONObject, DivActionDownloadTemplate>() { // from class: com.yandex.div2.DivActionDownloadTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivActionDownloadTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new DivActionDownloadTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<List<DivActionTemplate>> f46156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field<List<DivActionTemplate>> f46157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field<Expression<Uri>> f46158c;

    /* JADX INFO: compiled from: DivActionDownloadTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DivActionDownloadTemplate(Field<List<DivActionTemplate>> field, Field<List<DivActionTemplate>> field2, Field<Expression<Uri>> field3) {
        this.f46156a = field;
        this.f46157b = field2;
        this.f46158c = field3;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().m0().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivActionDownloadTemplate(ParsingEnvironment parsingEnvironment, DivActionDownloadTemplate divActionDownloadTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divActionDownloadTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivActionDownloadTemplate(ParsingEnvironment parsingEnvironment, DivActionDownloadTemplate divActionDownloadTemplate, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
